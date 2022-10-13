import java.util.Scanner;

public class La7 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int cnt = 0;
        int tap = s.nextInt();
        int cut = 0;
        try {
            while (true) {
                int x = s.nextInt();
                if (x != 2 & x != 1) {
                    cnt = 0;
                }
                if (tap == 1 & x == 2) {
                    cnt++;
                }
                if (cnt%3 == 0 & cnt != 0) {
                    cut++;
                }
                tap = x;
                System.out.println(cut);
            }
        }
        catch(Exception e) {
            System.out.println("-");
        }

    }
}
