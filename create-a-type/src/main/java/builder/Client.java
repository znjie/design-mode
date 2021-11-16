package builder;

import builder.entity.Actor;

/**
 * 将一个复杂对象的构建与它的表示分离，使同样的构建过程可以创建不同的表示
 * 实现方式：
 * 1.抽象建造者（ActorBuilder）对需要建造的产品或对象（Actor）进行建造，建立起相关的方法，由它去定义建造
 * 2.创建具体建造者（AngelBuilder）负责去实现建造
 * 3.统一由指挥者（ActorController）去调动抽象建造者（ActorBuilder）相关的方法去做事，去建造，最后能通过指挥者拿到产品或对象
 * 4.客户端只管找指挥者要产品或对象
 */
public class Client {
    public static void main(String[] args) {

        ActorController actorController = new ActorController();
        Actor actor = actorController.construct();

        System.out.println(actor.getType());
        System.out.println(actor.getSex());
        System.out.println(actor.getFace());
        System.out.println(actor.getCostume());
        System.out.println(actor.getHairstyle());
    }
}
