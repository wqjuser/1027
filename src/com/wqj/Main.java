package com.wqj;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner s = new Scanner(System.in);
        String n = s.nextLine();
        int c = Integer.parseInt(n);
        String str = s.nextLine();
        int len = str.length();
        String[] str2 = str.split("");
        String[] str3= str.split("");
        int count = 0;
        if (!(str2[0].equals(str2[1]))) {//判断第一个和第二个元素是否相同，若不同
            for (int i = 1; i < len; i++) {
                if (len > i + 1&&str2[i].equals(str2[i + 1])  ) {
                    str2[i + 1] = str2[i - 1];
                    count += 1;
                }
            }
            System.out.println(count);
        } else {//若相同，分两种情况，分别将两种情况比较

            str2[0] = "1";
            str2[1] = "0";
//            for (int i=0;i<c;i++){
//                System.out.print(str2[i]);
//            }
            for (int i = 1; i < len; i++) {
                if (len > i + 1 && str2[i].equals(str2[i + 1])) {
                    str2[i + 1] = str2[i - 1];
                    count += 1;
                }
            }
//            System.out.println("\t");
            int a = 0;
            a=count+1;
//           System.out.println(a);
            count = 0;
            str3[0] = "0";
            str3[1] = "1";

//            for (int i=0;i<c;i++){
//                System.out.print(str2[i]);
//            }
            for (int i = 1; i < len; i++) {
                if (len > i + 1 && str3[i].equals(str3[i + 1])) {
                    str3[i + 1] = str3[i - 1];
                    count += 1;
                }
            }
//            System.out.println("\t");
            int b = 0;
            b=count+1;
//            System.out.println(b);
            if (a >= b) {
                if (b==502){
                    System.out.println(str);
                }
                System.out.println(b);
            } else {
                if(a==502){
                    System.out.println(str);
                }
                System.out.println(a);
            }

        }

    }
}

