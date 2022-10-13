import java.util.Scanner;

public class La3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int tap = 0;
        int max = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        try {
            while (true) {
                int x = s.nextInt();
                if (tap == 0) {
                    tap = 1;
                    max = x;
                }
                if (x > max) {
                    max2 = max;
                    max = x;
                    System.out.println(max2);
                }
                else {
                    if (max2 == Integer.MIN_VALUE){
                        System.out.println("No");
                    }
                    else {
                        System.out.println(max2);
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("-");
        }
    }
}
