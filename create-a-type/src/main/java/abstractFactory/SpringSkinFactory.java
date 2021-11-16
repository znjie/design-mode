package abstractFactory;

import abstractFactory.service.Button;
import abstractFactory.service.ComboBox;
import abstractFactory.service.TextField;
import abstractFactory.service.impl.SpringButton;
import abstractFactory.service.impl.SpringComboBox;
import abstractFactory.service.impl.SpringTextField;

/**
 * 具体工厂
 * SpringSkinFactory（具体工厂）：抽象工厂的实现
 */
public class SpringSkinFactory extends AbstractSkinFactory{
    @Override
    public Button createButton() {
        System.out.println("创建绿色按钮");
        return new SpringButton();
    }

    @Override
    public ComboBox createComboBox() {
        System.out.println("创建绿色勾选框");
        return new SpringComboBox();
    }

    @Override
    public TextField createTextField() {
        System.out.println("创建绿色文本域");
        return new SpringTextField();
    }
}
