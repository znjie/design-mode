package factoryMethod.service.impl;

import factoryMethod.service.Chart;

public class LineChart implements Chart {

    public LineChart() {
        System.out.println("当前自己创建了LineChart产品");
    }

    @Override
    public void display() {
        System.out.println("负责对抽象产品LineChart进行展示");
    }
}
