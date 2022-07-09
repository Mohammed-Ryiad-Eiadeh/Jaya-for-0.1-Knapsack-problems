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

    public Population(KnapsackData benchmark, int NumberOfSolutions) {
        this.Data = benchmark;
        this.Profits = Data.GetProfits();
        this.SolutionLength = Profits.length;
        this.NumSolutions = NumberOfSolutions;
    }

    public Population(KnapsackData benchmark) {
        this.Data = benchmark;
        this.Profits = Data.GetProfits();
        this.SolutionLength = Profits.length;
        this.NumSolutions = 50;
    }

    protected Population GeneratePopulation() {
        PopulationStore = new double[NumSolutions][SolutionLength];
        for (int rows = 0; rows < PopulationStore.length; rows++) {
            for (int cols = 0; cols < PopulationStore[0].length; cols++) {
                PopulationStore[rows][cols] = new Random().nextInt(2);
            }
        }
        return this;
    }

    protected void DisplayPopulation(double[][] Population) {
        out.println("Current solutions are : ");
        for (double[] item : Population) {
            out.println(Arrays.toString(item));
        }
        out.println();
    }

    protected double[][] OppositionBasedLearning() {
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
        return PopulationStore;
    }
}
