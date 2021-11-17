package decorator;

/**
 * 具体构件
 * 抽象构件的子类，实现具体的业务方法
 */
public class Window extends Component{
    @Override
    public void display() {
        System.out.println("显示窗口");
    }
}
