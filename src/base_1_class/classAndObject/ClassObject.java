package base_1_class.classAndObject;

import java.util.Arrays;

public class ClassObject {

    public static void main(String [] args) {
        Hero garen = new Hero();
        garen.name = "盖伦";
        garen.hp = 200.0f;
        garen.armor = 500;
        garen.moveSpeed = 600;
        //神一样的存在

        Hero teemo = new Hero();
        teemo.name = "提莫";
        teemo.hp = 800.0f;
        teemo.armor = 200;
        teemo.moveSpeed = 700;

        Item blood = new Item();
        blood.name = "血瓶";
        blood.price = 50;

        Item strawSandals = new Item();
        strawSandals.name = "草鞋";
        strawSandals.price = 350;

        Item sword = new Item();
        sword.name = "长剑";
        sword.price = 350;
        
    }


}
