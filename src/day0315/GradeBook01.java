package day0315;

import java.util.Scanner;
import util.ArrayUtil;
import util.ScannerUtil;

// 성적관리프로그램을
// 인원제한이 없는 프로그램으로 ArrayUtil 을 사용하여 만들어 보세요

public class GradeBook01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] idArray = new int[0];
        String[] nameArray = new String[0];
        int scoreArray [][] =new int[3][0];
        
        while (true) {
            int userChoice = ScannerUtil.nextInt(scanner, "1. 입력  2. 출력  3. 종료");

            if (userChoice == 1) {
                // 입력 코드 구현
                int id = ScannerUtil.nextInt(scanner, "번호입력해주세요");
                String name = new String(ScannerUtil.nextLine(scanner, "이름입력해주세요"));
                int korean = ScannerUtil.nextInt(scanner, "국어점수를 입력해주세요", 0, 100);
                int english = ScannerUtil.nextInt(scanner, "영어점수를 입력해주세요", 0, 100);
                int math = ScannerUtil.nextInt(scanner, "수학점수를 입력해주세요", 0, 100);

                idArray = ArrayUtil.add(idArray, id);
                nameArray = ArrayUtil.add(nameArray, name);
                scoreArray[0] = ArrayUtil.add(scoreArray[0], korean);
                scoreArray[1] = ArrayUtil.add(scoreArray[1], english);
                scoreArray[2] = ArrayUtil.add(scoreArray[2], math);

                
                
            } else if (userChoice == 2) {
                // 출력 코드 구현
                if (ArrayUtil.size(idArray) == 0) {
                    System.out.println("아직 입력된 정보가 없습니다.");
                } else {
                    for (int i = 0; i < ArrayUtil.size(idArray); i++) {
                        print(idArray[i], nameArray[i], scoreArray[0][i], scoreArray[1][i], scoreArray[2][i]);
                    }
                }

            } else if (userChoice == 3) {
                System.out.println("사용해주셔서 감사합니다.");
                break;
            }
        }
        scanner.close();
    }

    // 출력에서 사용할 메소드
    public static void print(int id, String name, int korean, int english, int math) {
        System.out.printf("번호: %02d 번 이름: %s \n", id, name);
        System.out.printf("국어: %03d점 영어: %03d점 수학: %03d점 ", korean, english, math);
        int sum = korean + english + math;
        double average = sum / 3.0;
        System.out.printf("총점: %03d점 평균: %06.2점 \n", sum, average);

    }
}
