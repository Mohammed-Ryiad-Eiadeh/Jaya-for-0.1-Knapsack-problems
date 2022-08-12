package JayaOptimizer;

import org.knowm.xchart.SwingWrapper;
import org.knowm.xchart.XYChart;
import org.knowm.xchart.XYChartBuilder;
import org.knowm.xchart.XYSeries;
import org.knowm.xchart.style.Styler;
import java.util.Arrays;

/**
 * this class is used to plot the results
 * */

public class Plot {

    XYChart Chart;

    /**
     * this is a constructor used to configure the plotting tool
     * @param X_Axis refers to the x-axis values
     * @param Y_Axis refers to the y-axis values
     * @param Width refers to the width of the plot
     * @param Height refers to the height of the plot
     */
    public Plot(String X_Axis, String Y_Axis, int Width, int Height) {
        Chart = new XYChartBuilder()
                .xAxisTitle(X_Axis)
                .yAxisTitle(Y_Axis)
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
     * @param SeriesName0 refers to a certain series name
     * @param SeriesName1 refers to a certain series name
     * @param SeriesName2 refers to a certain series name
     * @param SeriesName3 refers to a certain series name
     * @param SeriesName4 refers to a certain series name
     * @param SeriesName5 refers to a certain series name
     * @param SeriesName6 refers to a certain series name
     * @param SeriesName7 refers to a certain series name
     * @param SeriesName8 refers to a certain series name
     * @param XSeries refers to x-axis series
     * @param YSeries refers to Y-Series
     */
    protected void DisplayPlot(String SeriesName0,
                               String SeriesName1,
                               String SeriesName2,
                               String SeriesName3,
                               String SeriesName4,
                               String SeriesName5,
                               String SeriesName6,
                               String SeriesName7,
                               String SeriesName8,
                               double[][] XSeries,
                               double[][] YSeries) {

        double[] series= new double[XSeries[0].length];
        Arrays.setAll(series, i -> i);

        Chart.addSeries(SeriesName0, series, YSeries[0]);
        Chart.addSeries(SeriesName1, series, YSeries[1]);
        Chart.addSeries(SeriesName2, series, YSeries[2]);
        Chart.addSeries(SeriesName3, series, YSeries[3]);
        Chart.addSeries(SeriesName4, series, YSeries[4]);
        Chart.addSeries(SeriesName5, series, YSeries[5]);
        Chart.addSeries(SeriesName6, series, YSeries[6]);
        Chart.addSeries(SeriesName7, series, YSeries[7]);
        Chart.addSeries(SeriesName8, series, YSeries[8]);
        new SwingWrapper<>(Chart).setTitle("Convergence Curve").displayChart();
    }
}
