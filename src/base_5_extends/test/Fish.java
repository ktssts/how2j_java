package base_5_extends.test;

public class Fish extends Animal implements Pet {

    private String name;
    public Fish(){
        super();
        System.out.println("老子在水里，腿有毛用");
    }

    @Override
    public void eat() {
        System.out.println(name+"想吃猫，你问那毛孩子干不干");

    }

    @Override
    public String getName() {
        System.out.println("今晚吃什么"+name);
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;

    }

    @Override
    public void play() {
        System.out.println("老子带你在水里飞");
    }

    @Override
    public void walk() {
        System.out.println("都说了我和那些不一样，老子没有退，但是老子能在水里飞");
    }
}
