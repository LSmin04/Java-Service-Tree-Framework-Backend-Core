package com.arms.smlee.ch03;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

public class Ex03_1 {
    int x = 2;
    int y = 5;
    char c = 'A'; // 'A' 65

    public Ex03_1() {


        System.out.println("ex ***************************************************");
        System.out.println(1 + x << 33);
        System.out.println(y >= 5 || x < 0 && x > 2);
        System.out.println(y += 10 - x++);
        System.out.println(x+=2);
        System.out.println( !('A' <= c && c <='Z') );
        System.out.println('C'-c);
        System.out.println('5'-'0');
        System.out.println(c+1);
        System.out.println(++c);
        System.out.println(c++);
        System.out.println(c);
    }

//        6
//        true
//        13
//        5
//        false
//        2
//        5
//        66
//        B
//        B
//        C
}
