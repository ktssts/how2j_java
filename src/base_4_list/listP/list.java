package base_4_list.listP;

import java.util.Arrays;

public class list {
    public static void main(String[] args) {
        int [] list = new int[5];
        for (int i=0;i<5;i++){
            list[i] = (int) (Math.random()*100);
        }
        System.out.println(Arrays.toString(list));

        int result = list[0];
        for (int i = 0; i<5;i++ ){
            if (list[i] <result){
                result = list[i];
            }
        }

        System.out.println(result);
    }
}
