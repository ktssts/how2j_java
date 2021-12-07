package base_5_extends.diversity;

public class APHero extends Hero implements Mortal {

    @Override
    public void die() {
        System.out.println("魔法致死");
    }
}
