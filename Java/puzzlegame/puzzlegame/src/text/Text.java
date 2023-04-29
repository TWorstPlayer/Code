package text;

import java.util.Random;

public class Text {
    public static void main(String[] args) {
        //要求：
        //打乱数组顺序


        //1. 定义一个一维数组
        int [] tempArr={0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,};
        //2.打乱数组中的数组的顺序
        //遍历数组，将每一个元素，和随机索引上的数据进行交换
        Random r=new Random();
        for(int i=0;i<tempArr.length;i++){
            int index=r.nextInt(tempArr.length);
            //拿着遍历到的每一个数据，和随机索引上的数据交换
            int temp=tempArr[i];
            tempArr[i]=tempArr[index];
            tempArr[index]=temp;

        }
        //3.遍历数组验证一下
        for (int i:tempArr
             ) {
            System.out.print(i+" ");
        }

        //4.创建一个二维数组
        int[][] data =new int[4][4];

        //5.给二维素组添加数据
        int index=0;
        for(int i=0;i< data.length;i++){
            for(int j=0;j<data[i].length;j++){
                data[i][j]=tempArr[index];
                index++;
            }

        }



    }
}
