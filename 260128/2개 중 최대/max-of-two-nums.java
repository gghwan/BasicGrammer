import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int A = sc.nextInt();
        int B = sc.nextInt();
        
        // 삼항 연산자 사용
        System.out.println(A > B ? A : B);
        
        sc.close();
    }
}
