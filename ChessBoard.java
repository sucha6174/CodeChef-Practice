import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();  

        while (T-- > 0) {
            int X1 = sc.nextInt();
            int Y1 = sc.nextInt();
            int X2 = sc.nextInt();
            int Y2 = sc.nextInt();

            int dx = Math.abs(X1 - X2);
            int dy = Math.abs(Y1 - Y2);

            int distance = Math.max(dx, dy);
            System.out.println(distance);
        }

        sc.close();
    }
}
