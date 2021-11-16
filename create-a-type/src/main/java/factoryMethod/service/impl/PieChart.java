package factoryMethod.service.impl;

import factoryMethod.service.Chart;

public class PieChart implements Chart {
    public PieChart() {
        System.out.println("当前自己创建了PieChart产品");
    }

    @Override
    public void display() {
        System.out.println("负责对抽象产品PieChart进行展示");
    }
}
