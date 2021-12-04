package base_4_list.listP3;

import java.util.Arrays;

public class ForPlus {

    public static void main(String[] args) {
        int[] list1 = new int[7];
        for (int i = 0; i<list1.length; i++){
            list1[i] = (int) (Math.random()*100);
        }
        System.out.println(Arrays.toString(list1));


        int[] list2 = new int[8];
        for (int i = 0; i<list2.length; i++){
            list2[i] = (int) (Math.random()*100);
        }
        System.out.println(Arrays.toString(list2));

        int[] list3 = new int[list1.length + list2.length];
        for (int i = 0; i< list3.length; i++){

            if (i<list1.length){
                list3[i]=list1[i];
            }else{
                list3[i]=list2[i-list1.length];
            }

        }
        System.out.println(Arrays.toString(list3));

        int a [] = new int[]{18,62,68,82,65,9};

        int b[] = new int[3];//分配了长度是3的空间，但是没有赋值

        //通过数组赋值把，a数组的前3位赋值到b数组

        //方法一： for循环

        for (int i = 0; i < b.length; i++) {
            b[i] = a[i];
        }

        //方法二: System.arraycopy(src, srcPos, dest, destPos, length)
        //src: 源数组
        //srcPos: 从源数组复制数据的起始位置
        //dest: 目标数组
        //destPos: 复制到目标数组的启始位置
        //length: 复制的长度
        System.arraycopy(a, 0, b, 0, 3);

        //把内容打印出来
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i] + " ");
        }


    }
}
