1. 开闭原则（Open Close Principle，OCP）
一个软件实体应当对扩展开放，对修改关闭。即软件实体应尽量在不修改原有代码的情况下进行扩展
开闭原则即对拓展开放，对修改关闭，要想在功能新增的时候不修改原先的代码，即程序中使用的是抽象类或者接口，我们新增的子类或者实现，这样才能保障我们拓展功能的时候不用修改原先的代码，所以说抽象化是开闭原则的关键。
1. 里氏替换原则（Liskov Substitution Principle，LSP）
所有引用基类（父类）的地方必须能透明地使用其子类的对象
基类存在的地方必定能被子类替换，且功能不会发生影响。里氏替换原则是“开-闭原则的补充”。
里氏替换通俗来讲就是子类可以拓展父类但是不能改变父类已确定的行为，包含以下四个含义：
子类可以实现父类的抽象方法，但是不能覆盖父类的非抽象方法
子类中可以增加自己特有的方法
当子类重载父类方法时，形参的范围要比父类的形参范围大，这样别的类调用这个方法时会优先匹配父类的实现而不是子类的实现
当子类实现父类的抽象方法时，方法的返回值要比父类更严格，也可以说成更具体
3.依赖倒转原则（Dependence Inversion Principle，DIP）
抽象不应该依赖于细节，细节应当依赖于抽象。换言之，要针对接口编程，而不是针对实现编程
依赖倒转原则要求我们在程序代码中传递参数时或在关联关系中，尽量引用层次高的抽象层类，即使用接口和抽象类进行变量类型声明、参数类型声明、方法返回类型声明，以及数据类型的转换等，而不要用具体类来做这些事情。
在实现依赖倒转原则时，我们需要针对抽象层编程，而将具体类的对象通过依赖注入(Dependency Injection, DI)的方式注入到其他对象中，依赖注入是指当一个对象要与其他对象发生依赖关系时，通过抽象来注入所依赖的对象。常用的注入方式有三种，分别是：构造注入，设值注入（Setter注入）和接口注入。构造注入是指通过构造函数来传入具体类的对象，设值注入是指通过Setter方法来传入具体类的对象，而接口注入是指通过在接口中声明的业务方法来传入具体类的对象。这些方法在定义时使用的是抽象类型，在运行时再传入具体类型的对象，由子类对象来覆盖父类对象。
开闭原则是目标，里氏代换原则是基础，依赖倒转原则是手段。
4.单一职能原则（Single Responsibility Principle, SRP）
一个类只负责一个功能领域中的相应职责，或者可以定义为：就一个类而言，应该只有一个引起它变化的原因
类的功能尽量单一，这样才能提高复用率。
单一职能原则是软件高内聚低耦合的指导方针。
5.接口隔离原则（Interface Segregation Principle, ISP）
使用多个专门的接口，而不使用单一的总接口，即客户端不应该依赖那些它不需要的接口
每一接口都应该承担一种相对独立的角色，该干的事情都干，不该干的事情都不干。
6.迪米特法则（Law of Demeter, LoD）
一个软件实体应当尽可能少地与其他实体发生相互作用。**
类与类之间的耦合度应尽量的低，这样如果类发生变化，影响才会最小。
不要和陌生人说话，只和你的直接朋友通信，直接朋友包含如下：
当前对象本身（this）
作为参数的对象
成员变量
集合成员变量中的元素
创建的对象
可以通过使用第三者类来降低两个类的耦合度。
7.合成复用原则（Composite Reuse Principle, CRP）
尽量使用对象组合，而不是继承来达到复用的目的
通过继承来实现复用的问题是它会破坏封装性，子类能够看到基类的实现细节，自身类通过继承而来的基类方法是静态的（因为继承的类是确定的），而通过调用成员变量去执行成员变量的方法是动态的，因为成员变量可以是抽象化的，而实现类可以有很多种，每一种实现类的功能又不相同，但是他们可以被当作同一类型而被引入。