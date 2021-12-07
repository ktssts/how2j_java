package base_5_extends.extendsP;

public class Armor extends Item{
    int ac;

    public static void main(String[] args) {
        Armor suozijia = new Armor();
        Armor tiejia = new Armor();

        suozijia.name="锁子甲";
        suozijia.price = 1000;
        suozijia.ac = 500;

        tiejia.name="铁甲";
        tiejia.price = 1500;
        tiejia.ac = 800;

    }
}
