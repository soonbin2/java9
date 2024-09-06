package com.ogiraffers.Team;

public class practice {
    /*for문을 사용하여 '*'을 출력해서 높이가 5인 삼각형을 만들어 보세요
    * 출력예시
    *              *
                  ***
                 *****
                *******
               *********

               * */
    public void test(){
        int height =5;
        for(int i=1; i<=height; i++){ //행출력
            for(int j=1; j<=height-i; j++){//띄어쓰기 출력
                System.out.print(" ");
            }
            for(int x =1; x<=((2*i) -1); x++){ // '*'출력
                System.out.print('*');
            }
            System.out.println(); //줄 넘어가기
        }
    }
}
