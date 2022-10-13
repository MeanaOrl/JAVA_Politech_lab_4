import java.util.Scanner;

public class La6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int cnt = 0;
        int tap = 0;
        int cut = Integer.MIN_VALUE;
        try {
            while (true) {
                int x = s.nextInt();
                if (x == 1) {
                    cnt = 1;
                }
                if (cnt >=1 & cnt <= 6 & cut == (x-1)) {
                    cnt++;
                }
                if (cnt == 6) {
                    tap++;
                    cnt = 0;
                }
                cut = x;
                System.out.println(tap);
            }
        }
        catch(Exception e) {
            System.out.println("-");
        }

    }
}
