package abstractFactory.service.impl;

import abstractFactory.service.ComboBox;

public class SpringComboBox implements ComboBox {
    @Override
    public void display() {
        System.out.println("勾选框显示绿色");
    }
}
