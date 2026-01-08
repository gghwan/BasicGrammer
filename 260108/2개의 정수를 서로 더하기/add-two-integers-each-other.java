import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        // Add b to a
        a = a + b;
        
        // Add a to b
        b = b + a;
        
        System.out.println(a + " " + b);
    }
}
