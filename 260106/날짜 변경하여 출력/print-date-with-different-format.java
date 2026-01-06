import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        // 수정된 부분: "." 대신 "\\." 사용
        // 정규식에서 점(.)을 문자로 인식시키기 위해 이스케이프 처리
        String[] strArr = s.split("\\."); 

        int year = Integer.parseInt(strArr[0]);
        int month = Integer.parseInt(strArr[1]);
        int day = Integer.parseInt(strArr[2]);

        // 출력 형식: 월-일-년
        // String.format을 사용하면 더 가독성이 좋고 유지보수가 쉽습니다 (선택 사항)
        System.out.println(month + "-" + day + "-" + year);
    }
}
