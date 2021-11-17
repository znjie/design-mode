package decorator.extend;

import decorator.Component;
import decorator.ComponentDecorator;

/**
 * 具体装饰类
 */
public class ScrollBarDecorator extends ComponentDecorator {

    public ScrollBarDecorator(Component component) {
        super(component);
    }

    @Override
    public void display() {
        super.display();
        System.out.println("显示滚动条");
    }
}
