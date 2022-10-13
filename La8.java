import java.util.Scanner;

public class La8 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int cnt = 1;
        int a = s.nextInt();
        System.out.println(cnt);
        int b = s.nextInt();
        if (a >= b) {
        }
        else {
            cnt++;
        }
        System.out.println(cnt);
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
