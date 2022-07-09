package JayaOptimizer;

import java.util.*;
import static io.vavr.API.println;
import static java.lang.System.arraycopy;

/**
 * this class is used to evaluate the population and a single solution
 * */

public class Evaluation {

    private double[] Profits;
    private double[] Weights;
    private double Capacity;
    private double[] FitnessForIndex;
    private double[][] Solutions;
    private List<Double> FitnessHolder;
    private KnapsackData Data;

    public Evaluation(KnapsackData benchmark, double[][] solutions) {
        this.Data = benchmark;
        this.Profits = Data.GetProfits();
        this.Weights = Data.GetWeights();
        this.Capacity = Data.GetTotalWeight();
        this.Solutions = new double[solutions.length][solutions[0].length];
        this.FitnessForIndex = new double[solutions.length];

        for (int rows = 0; rows < Solutions.length; rows++) {
            arraycopy(solutions[rows], 0, Solutions[rows], 0, Solutions[0].length);
        }
    }

    public Evaluation(double[] profits) {
        this.Profits = profits;
    }

    protected void SetNextGeneration(double[][] NewGeneration) {
        Solutions = NewGeneration;
    }

    protected double[][] PrepareSolutions() {

        int item = new Random().nextInt(Solutions[0].length);

        for (int i = 0; i < Solutions.length; i++) {
            while (GetCapacity(Solutions[i]) > Capacity) {
                if (Solutions[i][item] == 1) {
                    Solutions[i][item] = 0;
                }
                item = new Random().nextInt(Solutions[0].length);
            }
        }
        return Solutions;
    }

    protected double[] PrepareSolution(double[] solution) {
        int item = new Random().nextInt(solution.length);

        while (GetCapacity(solution) > Capacity) {
            if (solution[item] == 1) {
                solution[item] = 0;
            }
            item = new Random().nextInt(solution.length);
        }
        return solution;
    }

    private double GetCapacity(double[] solution) {
        double SumWeight = 0;

        for (int item = 0; item < solution.length; item++) {
            SumWeight += solution[item] * Weights[item];
        }
        return SumWeight;
    }

    protected void Evaluate() {
        FitnessHolder = new ArrayList<>();

        for (int item = 0; item < Solutions.length; item++) {
            FitnessHolder.add(GetProfit(Solutions[item]));
            FitnessForIndex[item] = FitnessHolder.get(item);
        }
    }

    protected double EvaluateSolution(double[] solution) {
        return GetProfit(solution);
    }

    private double GetProfit(double[] solution) {
        double ProfitSum = 0;

        for (int item = 0; item < solution.length; item++) {
            ProfitSum += solution[item] * Profits[item];
        }
        return ProfitSum;
    }

    protected void DisplayPreparedSolutions() {
        println("prepared solutions are : ");
        for (double[] item : Solutions) {
            println(Arrays.toString(item));
        }
        println();
    }

    protected double BestSolutionFitness() {
        return Collections.max(FitnessHolder);
    }

    protected double WorstSolutionFitness() {
        return Collections.min(FitnessHolder);
    }

    protected int GetBestSolutionId() {
        int index = 0;
        for (int item = 0; item < FitnessForIndex.length; item++) {
            if (FitnessForIndex[item] == BestSolutionFitness()) {
                index = item;
                break;
            }
        }
        return index;
    }

    protected int GetWorstSolutionId() {
        int index = 0;
        for (int item = 0; item < FitnessForIndex.length; item++) {
            if (FitnessForIndex[item] == WorstSolutionFitness()) {
                index = item;
                break;
            }
        }
        return index;
    }

    protected double GetAvgFitness() {
        double AvgSum = 0;

        for (double[] solution : Solutions) {
            AvgSum += GetProfit(solution);
        }

        return AvgSum / Solutions.length;
    }

    protected int GetRequiredNumberToReachTheBestSolution(double[] CurrentBest, int CurrentIter) {
        var Iter = 0;
        if (EvaluateSolution(CurrentBest) == Data.GetOptimalProfits())
            Iter =  CurrentIter;
        return Iter;
    }

    protected void EvaluationSummary() {
        println("the fitness of best solution is : " + BestSolutionFitness() + "  and the index of the best solution is : " + GetBestSolutionId());
        println("the fitness of worst solution is : " + WorstSolutionFitness() + "  and the index of the worst solution is : " + GetWorstSolutionId());
        println("the average fitness is : " + GetAvgFitness() + "\n");
    }
}
