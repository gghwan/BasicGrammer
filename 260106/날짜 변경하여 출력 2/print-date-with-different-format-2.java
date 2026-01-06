import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        String[] strArr = s.split("-");

        int day = Integer.parseInt(strArr[1]);
        int month = Integer.parseInt(strArr[0]);
        int year = Integer.parseInt(strArr[2]);

        System.out.println(year+"."+month+"."+day);
    }
}