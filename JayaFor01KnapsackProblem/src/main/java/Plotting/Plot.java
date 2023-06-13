package Plotting;

import org.knowm.xchart.SwingWrapper;
import org.knowm.xchart.XYChart;
import org.knowm.xchart.XYChartBuilder;
import org.knowm.xchart.XYSeries;
import org.knowm.xchart.style.Styler;
import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * this class is used to plot the results
 * */

public class Plot {

    XYChart Chart;

    /**
     * this is a constructor used to configure the plotting tool
     * @param Width refers to the width of the plot
     * @param Height refers to the height of the plot
     */
    public Plot(int Width, int Height) {
        Chart = new XYChartBuilder()
                .xAxisTitle("Iteration")
                .yAxisTitle("Average Fitness")
                .width(Width)
                .height(Height)
                .theme(Styler.ChartTheme.Matlab)
                .build();
        Chart.getStyler().setDefaultSeriesRenderStyle(XYSeries.XYSeriesRenderStyle.Line);
        Chart.getStyler().setLegendPosition(Styler.LegendPosition.InsideSE);
        Chart.getStyler().setMarkerSize(0);
    }

    /**
     * this method is used to display the plot result
     * @param seriesNames refers to series name
     * @param Optimal refers to the optimal solution
     * @param XSeries refers to x-axis series
     */
    public void DisplayPlot(String[] seriesNames, double Optimal, double[][] XSeries) {

        double[] series= new double[XSeries[0].length];
        Arrays.setAll(series, i -> i);

        Chart.addSeries("Optimal Solution", series, IntStream.range(0, XSeries[0].length).mapToDouble(i -> Optimal).toArray());
        for (var ii = 0; ii < XSeries.length; ii++)
            Chart.addSeries(seriesNames[ii], series, XSeries[ii]);

        new SwingWrapper<>(Chart).setTitle("Convergence Curve").displayChart();
    }
}
