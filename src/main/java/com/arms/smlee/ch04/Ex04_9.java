package com.arms.smlee.ch04;

public class Ex04_9 {
    int number = 12321;
    int tmp = number;
    int result =0; // 변수 number를 거꾸로 변환해서 담을 변수

    public Ex04_9(){
        String str = "12345";
        int sum = 0;
        for(int i=0; i < str.length(); i++) {
            /*
            (1) 알맞은 코드를 넣어 완성하시오.
            */
            sum += str.charAt(i) - '0';
        }
        System.out.println("sum="+sum);

    }
// sum : 15

}
