package abstractFactory;

import abstractFactory.service.Button;
import abstractFactory.service.ComboBox;
import abstractFactory.service.TextField;

/**
 * 实际上抽象工厂模式与工厂方法模式抽象产品与具体产品的角色是一致的，不同的只是工厂定义的不同，工厂方法中的工厂只生产单一产品，而抽象工厂的工厂生产的是一个产品族的产品
 * 实现方式：
 * 1.为所有产品声明抽象产品接口。 然后让所有具体产品类实现这些接口  service层体现
 * 2.声明抽象工厂接口， 并且在接口中为所有抽象产品提供一组构建方法。  SkinFactory体现
 * 3.为每种产品变体实现一个具体工厂类。SpringSkinFactory体现
 * 4.在客户端Client 对特定具体工厂类进行初始化。 然后将该工厂对象传递给所有需要创建产品的类。
 * 5.找出代码中所有对产品构造函数的直接调用， 将其替换为对工厂对象中相应构建方法的调用。
 */
public class Client {
    public static void main(String[] args) {

        AbstractSkinFactory abstractSkinFactory = new SpringSkinFactory();
        Button button = abstractSkinFactory.createButton();
        ComboBox comboBox = abstractSkinFactory.createComboBox();
        TextField textField = abstractSkinFactory.createTextField();
        button.display();
        comboBox.display();
        textField.display();
    }
}
