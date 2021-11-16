package abstractFactory.service.impl;

import abstractFactory.service.TextField;

public class SpringTextField implements TextField {
    @Override
    public void display() {
        System.out.println("文本域显示绿色");
    }
}
