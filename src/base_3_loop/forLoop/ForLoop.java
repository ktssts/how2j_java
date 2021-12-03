package base_3_loop.forLoop;

public class ForLoop {

    public static void main(String[] args) {
        int money = 0;
        for (int i=0; i<10;i++){
            money+= Math.pow(2,i);
        }
        System.out.println(money);
    }

}
