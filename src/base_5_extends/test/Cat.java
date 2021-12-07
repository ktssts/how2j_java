package base_5_extends.test;

public class Cat extends Animal implements Pet {

    private String name;

    public Cat(String name){
        super(4);
        this.name = name;
    }

    public Cat(){
        this("");
        System.out.println("为这个喵星人来个名字吧");
    }


    @Override
    public void eat() {
        System.out.println(name+"爱吃鱼");

    }

    @Override
    public String getName() {
        System.out.println("这个名字开心吗？："+name);
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void play() {
        System.out.println("给老子个月亮变身给你看");
    }
}
