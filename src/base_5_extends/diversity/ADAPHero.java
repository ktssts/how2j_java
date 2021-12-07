package base_5_extends.diversity;

public class ADAPHero extends Hero implements Mortal {

    @Override
    public void die() {
        System.out.println("物魔双杀");
    }
}
