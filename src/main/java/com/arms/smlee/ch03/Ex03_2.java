package com.arms.smlee.ch03;

public class Ex03_2 {
        public Ex03_2() {
            int numOfApples = 123; // 사과의 개수
            int sizeOfBucket = 10; // 바구니의 크기(바구니에 담을 수 있는 사과의 개수)
            int numOfBucket = numOfApples/sizeOfBucket;

            if(numOfApples%sizeOfBucket > 0)
                numOfBucket += 1;

            System.out.println("필요한 바구니의 수 :"+numOfBucket);
        }

//  if(numOfApples%sizeOfBucket > 0)
//      numOfBucket += 1;

}
