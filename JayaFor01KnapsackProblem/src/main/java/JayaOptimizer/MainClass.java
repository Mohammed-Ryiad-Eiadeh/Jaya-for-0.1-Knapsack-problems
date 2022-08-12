package JayaOptimizer;

import java.util.stream.IntStream;

/**
 * this is the main class of the project
 * */

public class MainClass {

    public static void main(String ...args) {
        // select and fetch dataset based on it's id
        var KnapsackProblem = new KnapsackData(20);

        // type the maximum number generations
        var MaxGeneration = 1000;

        //average convergence holder for eight jaya version among 1000 iteration
        var Convergence = new double[9][MaxGeneration];

        IntStream.range(0, Convergence[0].length).forEach(i -> Convergence[0][i] = KnapsackProblem.GetOptimalProfits());

        System.out.println("Welcome to 0/1 Knapsack Problem via Jaya Algorithm");

        // generate the initial population with opposition based learning
        var PopulationObj = new Population(KnapsackProblem, 100);
        var InitialPopulation = PopulationObj.GeneratePopulation().OppositionBasedLearning();
        PopulationObj.DisplayPopulation(InitialPopulation);

        // evaluate initial population for convergence purposes
        var Evaluator = new Evaluation(KnapsackProblem, InitialPopulation);
        var CheckedPopulation = Evaluator.PrepareSolutions();
        Evaluator.DisplayPreparedSolutions();
        Evaluator.Evaluate();
        Evaluator.EvaluationSummary();

        // using JAYA-VTF1 optimizer to solve the problem
        System.out.println("The performance of JAYA-VTF1 optimizer");
        var JayaOpt = new JayaOptimizer(KnapsackProblem,
                CheckedPopulation,
                TFUN.VTF1,
                false,
                Evaluator.GetBestSolutionId(),
                Evaluator.GetWorstSolutionId(),
                MaxGeneration);
        JayaOpt.StartOptimization();
        System.out.println("Optimization time is : " + JayaOpt.OptimizationTime());
        JayaOpt.DisplayJayaPerformance();
        Convergence[1] = JayaOpt.GetConvergence();

        System.out.println(); //new line

        // using JAYA-VTF1 and mutation optimizer to solve the problem
        System.out.println("The performance of JAYA-VTF1 optimizer with mutation");
        JayaOpt = new JayaOptimizer(KnapsackProblem,
                CheckedPopulation,
                TFUN.VTF1,
                true,
                Evaluator.GetBestSolutionId(),
                Evaluator.GetWorstSolutionId(),
                MaxGeneration);
        JayaOpt.StartOptimization();
        System.out.println("Optimization time is : " + JayaOpt.OptimizationTime());
        JayaOpt.DisplayJayaPerformance();
        Convergence[2] = JayaOpt.GetConvergence();

        System.out.println(); //new line

        // using JAYA-VTF2 optimizer to solve the problem
        System.out.println("The performance of JAYA-VTF2 optimizer");
        JayaOpt = new JayaOptimizer(KnapsackProblem,
                CheckedPopulation,
                TFUN.VTF2,
                false,
                Evaluator.GetBestSolutionId(),
                Evaluator.GetWorstSolutionId(),
                MaxGeneration);
        JayaOpt.StartOptimization();
        System.out.println("Optimization time is : " + JayaOpt.OptimizationTime());
        JayaOpt.DisplayJayaPerformance();
        Convergence[3] = JayaOpt.GetConvergence();

        System.out.println(); //new line

        // using JAYA-VTF2 and mutation optimizer to solve the problem
        System.out.println("The performance of JAYA-VTF2 optimizer with mutation");
        JayaOpt = new JayaOptimizer(KnapsackProblem,
                CheckedPopulation,
                TFUN.VTF2,
                true,
                Evaluator.GetBestSolutionId(),
                Evaluator.GetWorstSolutionId(),
                MaxGeneration);
        JayaOpt.StartOptimization();
        System.out.println("Optimization time is : " + JayaOpt.OptimizationTime());
        JayaOpt.DisplayJayaPerformance();
        Convergence[4] = JayaOpt.GetConvergence();

        System.out.println(); //new line

        // using JAYA-VTF3 optimizer to solve the problem
        System.out.println("The performance of JAYA-VTF3 optimizer");
        JayaOpt = new JayaOptimizer(KnapsackProblem,
                CheckedPopulation,
                TFUN.VTF3,
                false,
                Evaluator.GetBestSolutionId(),
                Evaluator.GetWorstSolutionId(),
                MaxGeneration);
        JayaOpt.StartOptimization();
        System.out.println("Optimization time is : " + JayaOpt.OptimizationTime());
        JayaOpt.DisplayJayaPerformance();
        Convergence[5] = JayaOpt.GetConvergence();

        System.out.println(); //new line

        // using JAYA-VTF3 and mutation optimizer to solve the problem
        System.out.println("The performance of JAYA-VTF3 optimizer with mutation");
        JayaOpt = new JayaOptimizer(KnapsackProblem,
                CheckedPopulation,
                TFUN.VTF3,
                true,
                Evaluator.GetBestSolutionId(),
                Evaluator.GetWorstSolutionId(),
                MaxGeneration);
        JayaOpt.StartOptimization();
        System.out.println("Optimization time is : " + JayaOpt.OptimizationTime());
        JayaOpt.DisplayJayaPerformance();
        Convergence[6] = JayaOpt.GetConvergence();

        System.out.println(); //new line

        // using JAYA-VTF4 optimizer to solve the problem
        System.out.println("The performance of JAYA-VTF4 optimizer");
        JayaOpt = new JayaOptimizer(KnapsackProblem,
                CheckedPopulation,
                TFUN.VTF4,
                false,
                Evaluator.GetBestSolutionId(),
                Evaluator.GetWorstSolutionId(),
                MaxGeneration);
        JayaOpt.StartOptimization();
        System.out.println("Optimization time is : " + JayaOpt.OptimizationTime());
        JayaOpt.DisplayJayaPerformance();
        Convergence[7] = JayaOpt.GetConvergence();

        System.out.println(); //new line

        // using JAYA-VTF4 and mutation optimizer to solve the problem
        System.out.println("The performance of JAYA-VTF4 optimizer with mutation");
        JayaOpt = new JayaOptimizer(KnapsackProblem,
                CheckedPopulation,
                TFUN.VTF4,
                true,
                Evaluator.GetBestSolutionId(),
                Evaluator.GetWorstSolutionId(),
                MaxGeneration);
        JayaOpt.StartOptimization();
        System.out.println("Optimization time is : " + JayaOpt.OptimizationTime());
        JayaOpt.DisplayJayaPerformance();
        Convergence[8] = JayaOpt.GetConvergence();

        var LinePlot = new Plot("Iteration", "Average Fitness", 600, 400);
        LinePlot.DisplayPlot("Optimal Solution",
                "Jaya-V1",
                "Jaya-V1 with mutation",
                "Jaya-V2",
                "Jaya-V2 with mutation",
                "Jaya-V3",
                "Jaya-V3 with mutation",
                "Jaya-V4",
                "Jaya-V4 with mutation",
                Convergence,
                Convergence);
    }
}


