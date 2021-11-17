package decorator;

/**
 * 抽象组件
 * 具体构件与抽象装饰类的共同父类，声明具体构件中实现的业务方法，它的出现能够让客户端一致的透明的对待装饰前和装饰后的类
 */
public abstract class Component {
    /**
     * 需要装饰的方法
     */
    public abstract void display();
}
