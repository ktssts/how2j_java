package base_4_list.listp2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int [] list = new int[5];
        for (int i =0;i< list.length;i++){
            list[i] = (int) (Math.random()*100);
        }
        System.out.println(Arrays.toString(list));

        int[] listB = new int[5];
        int k = 4;
        for (int i = 0; i<list.length;i++){

            listB[k]=list[i];
            k--;
        }
        System.out.println(Arrays.toString(listB));
    }

}
