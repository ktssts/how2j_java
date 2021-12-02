package base_1_class.methodP2;

public class Hero {

    String name;
    int kill;
    int help;
    int money;
    int attSpeed;
    String killedSay;
    String killSaing;

    void Keng(){
        System.out.println("坑队友");
    }

    int getMoney(){
        return money;
    }

    void addMoney(int moneyIn){
        money = money + moneyIn;
    }

    void legendary(){
    }
    int getKill(){
        return kill;
    }

    void recoverySpeed(int speed){

        attSpeed = attSpeed + speed;

    }

}
