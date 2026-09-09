import java.util.Scanner;

public class Main {
    public static void printNum(int n) {
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < 1; j++)
                System.out.print("12345^&*()_");
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printNum(n);
        // Please write your code here.
    }
}