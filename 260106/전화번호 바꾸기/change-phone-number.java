import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        String[] strArr = s.split("-");

        int front = Integer.parseInt(strArr[0]);
        int middle = Integer.parseInt(strArr[1]);
        int end = Integer.parseInt(strArr[2]);

        System.out.println("0" + front + "-" + end + "-" + middle);
    }
}