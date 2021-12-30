
package view;
import java.util.*;
import java.util.Map.Entry;
import org.jfree.ui.ApplicationFrame;
import javax.swing.JPanel;
import org.jfree.chart.ChartPanel;
import java.awt.Dimension;
import org.jfree.chart.JFreeChart;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.plot.PlotOrientation;

public class HistogramDisplay extends ApplicationFrame{
    
    model.Histogram<String> histogram;
    
    public HistogramDisplay(model.Histogram<String> histogram){
        super("HISTOGRAMA");
        this.histogram = histogram;
        setContentPane(createPanel());
        //pack();
    }
    
    public void execute(){
        this.setVisible(true);
    }
    private JPanel createPanel(){
        ChartPanel chartPanel = new ChartPanel(createChart(createDataset()));
        chartPanel.setPreferredSize(new Dimension(500,400));
        return chartPanel;
    }
    
    private JFreeChart createChart(DefaultCategoryDataset dataSet){
         JFreeChart chart = ChartFactory.createBarChart(
                            "Histograma JFreeChart",
                            "Dominios email",
                            "Nº de emails",
                            dataSet,
                            PlotOrientation.VERTICAL,
                            false,
                            false,
                            rootPaneCheckingEnabled);
         return chart;
    }
    
    private DefaultCategoryDataset createDataset(){
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        Set<String> mySet = this.histogram.keySet();
        for(String s : mySet){
            dataset.addValue(this.histogram.get(s),"",s);
        }
        dataset.addValue(6,"","ulpgc.es");
        return dataset;
    }
    
    
}
