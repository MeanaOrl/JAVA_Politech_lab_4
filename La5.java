import java.util.Scanner;

public class La5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int cnt = 0;
        int tap = -1;
        try {
            while (true) {
                int x = s.nextInt();
                if (x == 1) {
                }
                if (x == 0 & tap == 1) {
                    cnt++;
                }
                if (tap == -1) {
                    tap = 1;
                }
                tap = x;
                System.out.println(cnt);
            }
        }
        catch(Exception e) {
            System.out.println("-");
        }
    }
}
