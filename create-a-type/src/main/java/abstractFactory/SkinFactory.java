package abstractFactory;

import abstractFactory.service.Button;
import abstractFactory.service.ComboBox;
import abstractFactory.service.TextField;

/**
 * 抽象工厂
 * SkinFactory（抽象工厂）：包含多个创建同一产品族中产品的抽象工厂方法的抽象类，一个抽象工厂定义了一个输出的产品族
 */
public interface SkinFactory {

    Button createButton();

    ComboBox createComboBox();

    TextField createTextField();
}
