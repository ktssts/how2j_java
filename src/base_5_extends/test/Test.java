package base_5_extends.test;

public class Test {
    public static void main(String[] args) {
        Spider s = new Spider();
        s.eat();
        s.walk();

        System.out.println("-------下一位--------");
        Cat c = new Cat();
        Cat c1 = new Cat("喵喵战士");
        c.setName("给没有名字的喵星人起名字");
        c.getName();
        c1.getName();
        c1.setName("给喵星人改名");
        c1.getName();
        c.walk();
        c1.eat();
        c.play();


        System.out.println("-------下一位--------");
        Fish f = new Fish();
        f.setName("你大爷");
        f.getName();
        f.eat();
        f.play();
        f.walk();

    }
}
