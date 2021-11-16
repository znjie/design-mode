package abstractFactory.service.impl;

import abstractFactory.service.Button;

public class SpringButton implements Button {
    @Override
    public void display() {
        System.out.println("按钮显示绿色");
    }
}
