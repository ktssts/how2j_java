package base_5_extends.diversity;

public class ADHero extends Hero implements Mortal {

    @Override
    public void die() {
        System.out.println("物理致死");
    }
}
