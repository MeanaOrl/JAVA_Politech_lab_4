import java.util.Scanner;

public class La8 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int cnt = 0;
        try {
            while (true) {
                int c = s.nextInt();
                if (b >= a & b >= c) {
                    cnt++;
                }
                System.out.println(cnt);
                a = b;
                b = c;
            }
        }
        catch(Exception e) {
            System.out.println("-");
        }
    }
}
