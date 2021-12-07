package base_5_extends.diversity;

public class Hero {

    public void kill(Mortal m){
        m.die();
    }

    public static void main(String[] args) {
        Hero gai = new Hero();
        ADHero adHero = new ADHero();
        APHero apHero = new APHero();
        ADAPHero adapHero = new ADAPHero();

        gai.kill(adHero);
        gai.kill(apHero);
        gai.kill(adapHero);

    }

}
