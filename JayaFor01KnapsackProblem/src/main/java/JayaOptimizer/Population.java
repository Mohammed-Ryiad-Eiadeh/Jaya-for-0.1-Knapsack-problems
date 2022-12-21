package JayaOptimizer;

import java.util.Arrays;
import java.util.Random;
import static java.lang.System.arraycopy;
import static java.lang.System.out;

/**
 * this class is about how the population is generated, and how to use OBL to enhance it
 * */

public class Population {

    private final int SolutionLength;
    private final int NumSolutions;
    double[][] PopulationStore;
    private final double[] Profits;
    private KnapsackData Data;

    /**
     * this is a constructor used to configure the initial population
     * @param benchmark refers to a certain knapsack problem
     * @param NumberOfSolutions refers to the number of solution in the population
     */
    public Population(KnapsackData benchmark, int NumberOfSolutions) {
        this.Data = benchmark;
        this.Profits = Data.GetProfits();
        this.SolutionLength = Profits.length;
        this.NumSolutions = NumberOfSolutions;
        PopulationStore = new double[NumSolutions][SolutionLength];
    }

    /**
     * this is a constructor used to configure the initial population where it has 50 solutions
     * @param benchmark refers to a certain knapsack problem
     */
    public Population(KnapsackData benchmark) {
        this.Data = benchmark;
        this.Profits = Data.GetProfits();
        this.SolutionLength = Profits.length;
        this.NumSolutions = 50;
        PopulationStore = new double[NumSolutions][SolutionLength];
    }

    /**
     * this method is used to generate the initial solutions
     * @return the object itself
     */
    protected double[][] GeneratePopulation() {
        for (int rows = 0; rows < PopulationStore.length; rows++) {
            for (int cols = 0; cols < PopulationStore[0].length; cols++) {
                PopulationStore[rows][cols] = new Random().nextInt(2);
            }
        }
        return PopulationStore;
    }

    /**
     * this method is used to display a certain population
     * @param Population refers to the given population
     */
    protected void DisplayPopulation(double[][] Population) {
        out.println("Current solutions are : ");
        for (double[] item : Population) {
            out.println(Arrays.toString(item));
        }
        out.println();
    }

    /**
     * this method is used to enhance the initial population based on generation solution in the opposite directions
     * @return the enhanced population by OBL
     */
    protected Population OppositionBasedLearning() {
        Evaluation Evaluator = new Evaluation(Profits);
        double[][] ComplementArray = new double[PopulationStore.length][PopulationStore[0].length];
        for (int i = 0; i < ComplementArray.length; i++) {
            for (int j = 0; j < ComplementArray[0].length; j++) {
                ComplementArray[i][j] = 1 - PopulationStore[i][j];
            }
            if (Evaluator.EvaluateSolution(ComplementArray[i]) > Evaluator.EvaluateSolution(PopulationStore[i])) {
                arraycopy(ComplementArray[i], 0, PopulationStore[i], 0, ComplementArray[0].length);
            }
        }
        return this;
    }
}
