package day0304;

import java.util.Scanner;

// 사용자로부터 나이를 입력 받아서 
// ~5 이하: 영아
// ~13 이하: 어린이
// ~18 이하: 청소년
// 그외: 성인
// 이 출력되는 프로그램을 작성해보세요

public class AgeChecker01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("나이입력");
        System.out.print("> ");
        int age = scanner.nextInt();
        if (age <= 5) {
            System.out.println("영아");
        } else if (age <= 13) {
            System.out.println("어린이");
        } else if (age <= 18) {
            System.out.println("청소년");
        } else {
            System.out.println("성인");
        }

        scanner.close();
    }
}
