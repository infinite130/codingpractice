package main.java.com.codingpractice.questions01.phonedesktop;

import java.util.Scanner;

public class PhoneDesktop {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt(); // 테스트 케이스의 수

        // 각 테스트 케이스에 대해 반복
        for (int i = 0; i < t; i++) {
            int x = scanner.nextInt(); // 1x1 아이콘 앱의 수
            int y = scanner.nextInt(); // 2x2 아이콘 앱의 수

            // 화면 수 계산
            int screens = (x + 3) / 4 + (y + 1) / 2;
            System.out.println(screens);
        }

        scanner.close();
    }

}
