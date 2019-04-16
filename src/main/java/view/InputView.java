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
        System.out.println("## 예약을 종료하고 결제를 하려면 1번 추가 예약을 진행하려면 2번");
        return scanner.nextInt();
    }

    public static int inputPoint() {
        System.out.println("## 포인트 사용 금액을 입력하세요. 포인트가 없으면 0 입력");
        int point = scanner.nextInt();

        if (point < 0) {
            System.out.println("포인트는 음수일 수 없습니다.");
            return inputPoint();
        }
        return point;
    }

    public static int inputSelectPayment() {
        System.out.println("## 신용카는 1번, 현금은 2번");
        return scanner.nextInt();
    }
}