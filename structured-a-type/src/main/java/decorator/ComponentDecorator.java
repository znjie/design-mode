package decorator;

/**
 * 抽象装饰类
 * 抽象构件的子类，内部维持一个抽象构件的引用，通过该引用调用具体构件的业务方法
 */
public class ComponentDecorator extends Component{

    private Component component;

    public ComponentDecorator() {
    }

    public ComponentDecorator(Component component) {
        this.component = component;
    }

    @Override
    public void display() {
        component.display();
    }
}
