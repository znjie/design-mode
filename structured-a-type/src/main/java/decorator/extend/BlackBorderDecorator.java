package decorator.extend;

import decorator.Component;
import decorator.ComponentDecorator;

/**
 * 具体装饰类
 */
public class BlackBorderDecorator extends ComponentDecorator {

    public BlackBorderDecorator(Component component) {
        super(component);
    }
    @Override
    public void display() {
        super.display();
        System.out.println("显示黑色边框");
    }
}
