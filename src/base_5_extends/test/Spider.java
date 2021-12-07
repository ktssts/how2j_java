package base_5_extends.test;

public class Spider extends Animal {

    public Spider(){
        super(8);
        System.out.println("蜘蛛都有八条腿，嗷嗷长");
    }


    @Override
    public void eat() {
        System.out.println("蜘蛛吃小虫子，吃吃吃");
    }
}
