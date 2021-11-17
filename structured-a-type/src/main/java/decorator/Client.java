package decorator;

import decorator.extend.BlackBorderDecorator;
import decorator.extend.ScrollBarDecorator;

/**
 * 装饰者模式：动态的给一个对象增加一些职能，相对与生成子类更加灵活。更多的应用在拓展系统功能
 * 具体构件和装饰具体构件的抽象装饰类通过注入的方式被抽象装饰类继续装饰
 * 因为具体构件和抽象装饰类都继承抽象构件，所以被装饰时可以被同样的对待，更加灵活。
 */
public class Client {
    public static void main(String[] args) {
        // 声明具体构件
        Component window = new Window();
        // 装饰具体构件，这里相当于将装饰后的构件重新变为具体构件，方便再次装饰
        ScrollBarDecorator decoratorSB = new ScrollBarDecorator(window);
        // 对装饰后的构件进行再一次的装饰
        BlackBorderDecorator decoratorBB = new BlackBorderDecorator(decoratorSB);
        // 先调用具体构件的放
        decoratorBB.display();
    }
}
