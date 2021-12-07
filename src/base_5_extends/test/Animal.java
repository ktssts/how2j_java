package base_5_extends.test;

public abstract class Animal {

    protected int legs;

    protected  Animal(){
        System.out.println("这是什么动物没有退");
    }

    protected Animal(int legs){
        this.legs = legs;
        System.out.println("这动物有"+legs+"条腿");
    }

    public abstract void eat();

    public void walk(){
        System.out.println("这动物用"+legs+"条腿走路");
    }

}
