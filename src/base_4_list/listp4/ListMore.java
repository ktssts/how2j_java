package base_4_list.listp4;

import java.util.Arrays;

public class ListMore {
    public static void main(String[] args) {
        int[][] list= new int[5][5];
        for (int i = 0; i<list.length;i++){
            for (int j = 0; j<list[i].length;j++){
                list[i][j] = (int) (Math.random() * 100);
            }
        }

        int max = list[0][0];
        int x = 0;
        int y = 0;
        for (int i = 0; i<list.length;i++){
            for (int j = 0; j<list[i].length;j++){
               if (list[i][j]<max) {
                   max = list[i][j];
                   x = i;
                   y = j;
               }
            }
        }

        System.out.println(Arrays.deepToString(list));
        System.out.println("最小值是："+max);
        System.out.println("最小值坐标为:["+x+"]"+"["+y+"]");

        int a[] = new int[] { 18, 62, 68, 82, 65, 9 };

        // copyOfRange(int[] original, int from, int to)
        // 第一个参数表示源数组
        // 第二个参数表示开始位置(取得到)
        // 第三个参数表示结束位置(取不到)
        int[] b = Arrays.copyOfRange(a, 0, 3);

        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i] + " ");
        }


    }
}
