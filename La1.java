import java.util.Scanner;

public class La1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int cnt = 0;
        int tap = 0;
        try {
            while (true) {
                int x = s.nextInt();
                cnt++;
                if (x == 0 & tap == 0) {
                    tap = cnt;
                }
                System.out.println(tap);
            }
        }
        catch(Exception e) {
            System.out.println("-");
        }

    }
}