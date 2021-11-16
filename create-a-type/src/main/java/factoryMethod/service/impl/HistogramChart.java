package factoryMethod.service.impl;

import factoryMethod.service.Chart;

/**
 * 具体产品
 * 具体实现做事的角色
 */
public class HistogramChart implements Chart {

    public HistogramChart() {
        System.out.println("当前自己创建了HistogramChart产品");
    }

    @Override
    public void display() {
        System.out.println("负责对抽象产品HistogramChart进行展示");
    }
}
