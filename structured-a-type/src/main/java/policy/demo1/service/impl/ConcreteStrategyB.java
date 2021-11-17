package policy.demo1.service.impl;

import policy.demo1.service.Strategy;

/**
 * 具体策略（Concrete Strategy）类
 */
public class ConcreteStrategyB implements Strategy {

    @Override
    public void doSomething() {
        System.out.println("BBB");
    }
}
