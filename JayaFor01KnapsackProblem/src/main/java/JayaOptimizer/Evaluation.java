package JayaOptimizer;

import java.util.*;
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

    /**
     * this is a constructor used for evaluation purposes
     * @param benchmark refers to a certain knapsack problem we want to solve
     * @param solutions refer to the current solution for the given problem
     */
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

    /**
     * this is a constructor used for evaluation purposes
     * @param profits refer to the profits of
     */
    public Evaluation(double[] profits) {
        this.Profits = profits;
    }

    /**
     * this method is used to update the solutions by new ones
     * @param NewGeneration refer to the updated solutions
     */
    protected void SetNextGeneration(double[][] NewGeneration) {
        Solutions = NewGeneration;
    }

    /**
     * this method is used to convert infeasible solutions to feasible ones
     * @return the feasible solutions
     */
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

    /**
     * this method is used to handle single infeasible solution
     * @param solution refers to the solution that may be infeasible one
     * @return the feasible solution
     */
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

    /**
     * this method is used to compute the total weight of a single certain solution
     * @param solution refers to the given solution
     * @return the weight of the given solution
     */
    private double GetCapacity(double[] solution) {
        double SumWeight = 0;

        for (int item = 0; item < solution.length; item++) {
            SumWeight += solution[item] * Weights[item];
        }
        return SumWeight;
    }

    /**
     * this method used to evaluate a certain solutions
     */
    protected void Evaluate() {
        FitnessHolder = new ArrayList<>();

        for (int item = 0; item < Solutions.length; item++) {
            FitnessHolder.add(GetProfit(Solutions[item]));
            FitnessForIndex[item] = FitnessHolder.get(item);
        }
    }

    /**
     * this method is used to evaluate a single certain solution
     * @param solution refers to the given solution
     * @return the fitnes score of the given solution
     */
    protected double EvaluateSolution(double[] solution) {
        return GetProfit(solution);
    }

    /**
     * this method is used to compute the total profit of a single certain solution
     * @param solution refers to the given solution
     * @return the total profits of the given solution
     */
    private double GetProfit(double[] solution) {
        double ProfitSum = 0;

        for (int item = 0; item < solution.length; item++) {
            ProfitSum += solution[item] * Profits[item];
        }
        return ProfitSum;
    }

    /**
     * this method is used to display the feasible solutions
     */
    protected void DisplayPreparedSolutions() {
        System.out.println("prepared solutions are : ");
        for (double[] item : Solutions) {
            System.out.println(Arrays.toString(item));
        }
        System.out.println();
    }

    /**
     * this method is used to retrieve the best current solution among the given ones
     * @return the best current solution
     */
    protected double BestSolutionFitness() {
        return Collections.max(FitnessHolder);
    }

    /**
     * this method is used to retrieve the worst current solution among the given ones
     * @return the worst current solution
     */
    protected double WorstSolutionFitness() {
        return Collections.min(FitnessHolder);
    }

    /**
     * this method is used to retrieve the id of the best current solution among the given ones
     * @return the id of the best current solution
     */
    protected int GetBestSolutionId() {
        double best = BestSolutionFitness();
        int index = 0;
        for (int item = 0; item < FitnessForIndex.length; item++) {
            if (FitnessForIndex[item] == best) {
                index = item;
                break;
            }
        }
        return index;
    }

    /**
     * this method is used to retrieve the id of the worst current solution among the given ones
     * @return the id of the worst current solution
     */
    protected int GetWorstSolutionId() {
        double worst = WorstSolutionFitness();
        int index = 0;
        for (int item = 0; item < FitnessForIndex.length; item++) {
            if (FitnessForIndex[item] == worst) {
                index = item;
                break;
            }
        }
        return index;
    }

    /**
     * this method used to get the average fitness of the given solutions
     * @return the average fitness of the given solutions
     */
    protected double GetAvgFitness() {
        double AvgSum = 0;

        for (double[] solution : Solutions) {
            AvgSum += GetProfit(solution);
        }

        return AvgSum / Solutions.length;
    }

    /**
     * this method is used to get the iteration that current solution has reached the best solution
     * @param CurrentBest refers to the best current solution
     * @param CurrentIter refers to the current generation id
     * @return the current generation id
     */
    protected int GetRequiredNumberToReachTheBestSolution(double[] CurrentBest, int CurrentIter) {
        var Iter = 0;
        if (EvaluateSolution(CurrentBest) == Data.GetOptimalProfits())
            Iter =  CurrentIter;
        return Iter;
    }

    /**
     * this method is used to report and display the performance of the current solution
     */
    protected void EvaluationSummary() {
        System.out.println("the fitness of best solution is : " + BestSolutionFitness() + "  and the index of the best solution is : " + GetBestSolutionId());
        System.out.println("the fitness of worst solution is : " + WorstSolutionFitness() + "  and the index of the worst solution is : " + GetWorstSolutionId());
        System.out.println("the average fitness is : " + GetAvgFitness() + "\n");
    }
}
