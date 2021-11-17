package policy.demo1;
import policy.demo1.service.Strategy;
import policy.demo1.service.impl.ConcreteStrategyA;
import policy.demo1.service.impl.ConcreteStrategyB;

public class Client {
    public static void main(String[] args) {
        Strategy strategy = new ConcreteStrategyA();
        strategy.doSomething();
        strategy = new ConcreteStrategyB();
        strategy.doSomething();
    }
}
