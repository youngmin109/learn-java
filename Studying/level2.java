import java.util.Scanner;

public class level2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("a");
        int a = sc.nextInt();
        System.out.print("b");
        int b = sc.nextInt();
        System.out.print("c");
        int c = sc.nextInt();

        sc.close();
        
        if (a + b <= c || b + c <= a || a + c <= b) {
            System.out.print("삼각형 형성 불가");
        } else {
            String triangleType = "";
            if (a == b && a == c) {
                triangleType = "정삼각형";
            } else if (a == b || a == c ||  c == b) {
                triangleType = "이등변삼각형";
            } else {
                triangleType = "부등변삼각형";
            }   System.out.print(triangleType);
        } 
    }
}