import java.util.Scanner;

public class La2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int tap = Integer.MIN_VALUE;
        int cnt = 0;
        try {
            while (true) {
                int x = s.nextInt();
                if (x > tap) {
                    cnt++;
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
