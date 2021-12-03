package base_3_loop.continue1;

public class Main {
    public static void main(String[] args) {
        for (int i = 1; i<=100; i++){
            if (i%3 == 0){
                continue;
            }else if (i%5 == 0){
                continue;
            }

            System.out.println(i);
        }
    }
}
