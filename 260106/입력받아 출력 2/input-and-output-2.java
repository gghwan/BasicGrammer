import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String[] strArr = s.split("-");

        int birth = Integer.parseInt(strArr[0]);
        int backnum = Integer.parseInt(strArr[1]);

        System.out.println(birth + "" + backnum);
    }
}