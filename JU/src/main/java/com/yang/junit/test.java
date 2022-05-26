package com.yang.junit;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        //xp表示枪机的价格,yp表示枪托的价格,zp表示枪管的价格
        int xp=45; int yp=30; int zp=25; int sum=0;
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入枪机的数量:");
        int x=scanner.nextInt();
        if (x<1||x>70)
            System.out.println("请重新输入");
        System.out.println("请输入枪托的数量:");
        int y= scanner.nextInt();
        if (y<1||y>80)
            System.out.println("请重新输入");
        System.out.println("请输入枪管的数量:");
        int z=scanner.nextInt();
        if (z<1||z>90)
            System.out.println("请重新输入");
        System.out.println("枪机的数量为:"+x+";枪托的数量为:"+y+";枪管的数量为:"+z);
        sum=xp*x+yp*y+zp*z;
        System.out.println("总价为:"+sum);
        double s=0;
        if (sum>1800){
            s = 220 + ((sum - 1800) * 0.2);
            System.out.println("佣金为:" + s);

        }else if (sum<1000){s=sum*0.1;
            System.out.println("佣金为:"+s);

        }else{
            s=100+((sum-1000)*0.15);
            System.out.println("佣金为:"+s);
        }
    }
}
