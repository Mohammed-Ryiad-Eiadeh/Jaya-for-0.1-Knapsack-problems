package JayaOptimizer;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;
import static java.lang.System.arraycopy;
import static org.apache.commons.math3.special.Erf.erf;

/**
 * this class is about the JAYA optimizer and how it works
 * */

public class JayaOptimizer {

    private final double[][] Solutions;
    private final int MaxIteration;
    private final Evaluation Evaluator;
    private int BestSolutionIndex;
    private int WorstSolutionIndex;
    private final TFUN TFunction;
    private final boolean MutationActivation;
    private double[] AvgEachIter;
    private int NumOfIterToReachOptimalSolution;

    private long StartTime, FinishTime;

    /**
     * this is a constructor used to configure the IDJaya optimizer
     * @param benchmark refers to a certain knapsack problem
     * @param population refers to the generated set of solutions
     * @param TransferFunction refers to a certain transfer function
     * @param ActivateMutation refers the mutation rate
     * @param bestsolutionindex refers to the id of the best current solution
     * @param worstsolutionindex refers to the id of the worst current solution
     * @param maxiteration refers to the allowable number of generation
     */
    public JayaOptimizer(KnapsackData benchmark,
                         double[][] population,
                         TFUN TransferFunction,
                         boolean ActivateMutation,
                         int bestsolutionindex,
                         int worstsolutionindex,
                         int maxiteration) {

        Solutions = new double[population.length][population[0].length];
        IntStream.range(0, Solutions.length).
                forEach(rows -> arraycopy(population[rows], 0, Solutions[rows], 0, Solutions[0].length));
        this.TFunction = TransferFunction;
        this.MutationActivation = ActivateMutation;
        this.BestSolutionIndex = bestsolutionindex;
        this.WorstSolutionIndex = worstsolutionindex;
        this.MaxIteration = maxiteration;
        Evaluator = new Evaluation(benchmark, Solutions);
    }

    /**
     * this method is used to utilize IDJaya to optimize the given generation
     */
    protected void StartOptimization() {
        boolean flag = true;
        StartTime = System.currentTimeMillis();

        double[] EvolovedSolution = new double[Solutions[0].length];
        AvgEachIter = new double[MaxIteration];

        for (int iter = 0; iter < MaxIteration; iter++) {
            for (double[] solution : Solutions) {
                for (int j = 0; j < Solutions[0].length; j++) {
                    EvolovedSolution[j] = Mutation(MutationActivation, VTFunctions(TFunction, solution[j]
                            + new Random().nextDouble()
                            * (Solutions[BestSolutionIndex][j] - solution[j])
                            - new Random().hashCode()
                            * (Solutions[WorstSolutionIndex][j] - solution[j])));
                }
                EvolovedSolution = Evaluator.PrepareSolution(EvolovedSolution);
                if (Evaluator.EvaluateSolution(EvolovedSolution) > Evaluator.EvaluateSolution(solution)) {
                    arraycopy(EvolovedSolution, 0, solution, 0, EvolovedSolution.length);
                }
            }
            Evaluator.SetNextGeneration(Solutions);
            Evaluator.Evaluate();
            BestSolutionIndex = Evaluator.GetBestSolutionId();

            if (flag)
            {
                NumOfIterToReachOptimalSolution = Evaluator.GetRequiredNumberToReachTheBestSolution(Solutions[BestSolutionIndex], iter);
                if (NumOfIterToReachOptimalSolution > 0)
                    flag = false;
            }
            WorstSolutionIndex = Evaluator.GetWorstSolutionId();
            AvgEachIter [iter] = Evaluator.GetAvgFitness();

            FinishTime = System.currentTimeMillis();
        }
    }

    /**
     * this method is used to covert continuous a certain value to binary one
     * @param VFunct refers to a certain V-Function
     * @param Value refers to the given value
     * @return the binary value
     */
    private int VTFunctions (TFUN VFunct, double Value) {
        return switch (VFunct) {
            case VTF1 -> Math.abs(erf(Math.sqrt(Math.PI) / 2 * Value)) >= 0.5 ? 1 : 0;
            case VTF2 -> Math.abs(Math.tanh(Value)) >= 0.5 ? 1 : 0;
            case VTF3 -> Math.abs(Value / (Math.sqrt(1 + Math.pow(Value, 2)))) >= 0.5 ? 1 : 0;
            case VTF4 -> Math.abs((2 / Math.PI) * Math.atan((Math.PI / 2) * Value)) >= 0.5 ? 1 : 0;
        };
    }

    /**
     * this method is used to mutate a certain value
     * @param Activate refers to either aplly the mutation or not
     * @param Value refers to the given value
     * @return the value after mutation
     */
    private int Mutation(Boolean Activate, int Value) {
        return Activate && 1 / (double) Solutions[0].length > new Random().nextDouble() ? 1 - Value : Value;
    }

    /**
     * this method is used for convergence purposes
     * @return the convergence score
     */
    protected double[] GetConvergence() {
        return AvgEachIter;
    }

    /**
     * this method is used to get the duration time of the optimization process
     * @return duration time
     */
    protected String OptimizationTime() {
        return String.format("%s ms", (FinishTime - StartTime));
    }

    /**
     * this method is used to report the performance of our model
     */
    protected void DisplayJayaPerformance() {
        for (String S : Arrays.asList("best current solution id is " + Evaluator.GetBestSolutionId(),
                "worst current solution id is " + Evaluator.GetWorstSolutionId(),
                "the fitness of best solution is " + Evaluator.BestSolutionFitness(),
                "the fitness of worst solution is " + Evaluator.WorstSolutionFitness(),
                "the average fitness value for current population is " + Evaluator.GetAvgFitness(),
                "the best solution in this generation is : " + Arrays.toString(Solutions[Evaluator.GetBestSolutionId()]),
                "the required number of iteration to reach the best solution is : " + (NumOfIterToReachOptimalSolution == 0 ? "un reached" : NumOfIterToReachOptimalSolution))) {
            System.out.println(S);
        }
    }
}
