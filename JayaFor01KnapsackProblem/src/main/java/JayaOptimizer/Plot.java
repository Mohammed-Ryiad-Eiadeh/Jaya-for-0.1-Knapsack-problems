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

    public Plot(String X_Axis, String Y_Axis, int Width, int Hight) {
        Chart = new XYChartBuilder()
                .xAxisTitle(X_Axis)
                .yAxisTitle(Y_Axis)
                .width(Width)
                .height(Hight)
                .theme(Styler.ChartTheme.Matlab)
                .build();
        Chart.getStyler().setDefaultSeriesRenderStyle(XYSeries.XYSeriesRenderStyle.Line);
        Chart.getStyler().setLegendPosition(Styler.LegendPosition.InsideSE);
        Chart.getStyler().setMarkerSize(0);
    }

    protected void DisplayPlot(String SerieseName0,
                               String SerieseName1,
                               String SerieseName2,
                               String SerieseName3,
                               String SerieseName4,
                               String SerieseName5,
                               String SerieseName6,
                               String SerieseName7,
                               String SerieseName8,
                               double[][] XSeriese,
                               double[][] YSeriese) {

        double[] series= new double[XSeriese[0].length];
        Arrays.setAll(series, i -> i);

        Chart.addSeries(SerieseName0, series, YSeriese[0]);
        Chart.addSeries(SerieseName1, series, YSeriese[1]);
        Chart.addSeries(SerieseName2, series, YSeriese[2]);
        Chart.addSeries(SerieseName3, series, YSeriese[3]);
        Chart.addSeries(SerieseName4, series, YSeriese[4]);
        Chart.addSeries(SerieseName5, series, YSeriese[5]);
        Chart.addSeries(SerieseName6, series, YSeriese[6]);
        Chart.addSeries(SerieseName7, series, YSeriese[7]);
        Chart.addSeries(SerieseName8, series, YSeriese[8]);
        new SwingWrapper<>(Chart).setTitle("Convergence Curve").displayChart();
    }
}
