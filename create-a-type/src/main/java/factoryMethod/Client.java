package factoryMethod;


import factoryMethod.service.Chart;

/**
 * 工厂类中包含静态工厂方法，出参为产品类，客户端通过传入不同入参去调用静态工厂方法去获取不同的具体产品类
 * 工厂方法模式优点:
 * 1.你可以避免创建者和具体产品之间的紧密耦合。
 * 2.单一职责原则。 你可以将产品创建代码放在程序的单一位置， 从而使得代码更容易维护。
 * 3.开闭原则。 无需更改现有客户端代码， 你就可以在程序中引入新的产品类型。
 *
 * 工厂方法模式缺点:
 * 1.应用工厂方法模式需要引入许多新的子类， 代码可能会因此变得更复杂。 最好的情况是将该模式引入创建者类的现有层次结构中。
 */
public class Client {
    public static void main(String[] args) {
        Chart chart = ChartFactory.getChart("histogram");
        chart.display();
    }
}
