package builder;

import builder.entity.Actor;

/**
 * 指挥者
 */
public class ActorController {
    public Actor construct() {
        ActorBuilder actorBuilder=new AngelBuilder();
        actorBuilder.buildType();
        actorBuilder.buildSex();
        actorBuilder.buildFace();
        actorBuilder.buildCostume();
        actorBuilder.buildHairstyle();
        Actor actor= actorBuilder.createActor();
        return actor;
    }
}
