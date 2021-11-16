package factoryMethod;

import factoryMethod.service.Chart;
import factoryMethod.service.impl.HistogramChart;
import factoryMethod.service.impl.LineChart;
import factoryMethod.service.impl.PieChart;

/**
 * 静态工厂
 * 实现产品创建逻辑的类
 * 工厂类中的静态工厂方法通过if else 判断去实例化不同的具体产品类
 */
public class ChartFactory {
    public static Chart getChart(String type) {
        Chart chart = null;

        if (type.equalsIgnoreCase("histogram")) {
            chart = new HistogramChart();
            System.out.println("初始化设置HistogramChart");
        } else if (type.equalsIgnoreCase("pie")) {
            chart = new PieChart();
            System.out.println("初始化设置PieChart");
        } else if (type.equalsIgnoreCase("line")) {
            chart = new LineChart();
            System.out.println("初始化设置LineChart");
        }
        return chart;
    }
}
