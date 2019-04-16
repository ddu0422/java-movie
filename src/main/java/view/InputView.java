package view;

import java.util.Scanner;

public class InputView {
    private static final Scanner scanner = new Scanner(System.in);

    public static int inputMovieId() {
        System.out.println("## 예약할 영화를 선택하세요.");
        return scanner.nextInt();
    }

    public static int inputMovieSchedule() {
        System.out.println("## 예약할 시간표를 선택하세요. (첫번째 상영 시간이 1번)");
        return scanner.nextInt();
    }

    public static int inputPersonnel() {
        System.out.println("## 예약할 인원을 입력하세요.");
        return scanner.nextInt();
    }

    public static int inputSelectStatus() {
        System.out.print("## 예약을 종료하고 결제를 하려면 1번 추가 예약을 진행하려면 2번");
        return scanner.nextInt();
    }
}