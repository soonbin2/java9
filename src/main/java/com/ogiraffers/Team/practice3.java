package com.ogiraffers.Team;

import java.util.Scanner;

public class practice3 {
//    팩토리얼을 계산하는 반복문 만들기
//    입력예시) 정수를 입력하세요 : 5
//
//    출력예시) 입력하신 숫자의 팩토리얼은 120 입니다

    public void test4(){
        Scanner sc = new Scanner(System.in);
        System.out.print("정수를 입력하세요 : ");
        int num = sc.nextInt();
        int fac =1;
        for(int i=1; i<=num; i++){
                fac *=i;
            }
        System.out.println("입력하신 숫자의 팩토리얼은 " + fac + "입니다.");
        }

    }

