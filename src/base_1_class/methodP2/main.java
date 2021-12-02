package base_1_class.methodP2;

public class main {

    public static void main(String[] args) {

        Hero garen = new Hero();
        garen.name = "盖伦";
        garen.money=1000;
        garen.addMoney(50);

        System.out.println(garen.money);

    }
}
