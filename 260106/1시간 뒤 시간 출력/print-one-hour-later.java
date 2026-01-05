import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 1. 문자열 입력 받기 (예: "1:59")
        String s = sc.next();
        
        // 2. ":" 기준으로 쪼개기
        String[] strArr = s.split(":");
        
        // 3. 앞부분(시간)을 숫자로 변환하여 1 더하기
        int hour = Integer.parseInt(strArr[0]);
        int nextHour = hour + 1;
        
        // 4. 결과 출력 (계산된 시간 + ":" + 원래 분)
        System.out.println(nextHour + ":" + strArr[1]);
    }
}
