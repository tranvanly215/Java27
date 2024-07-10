public class Bai1_LietKeSo {
    public static void main(String[] args) {
        for (int i = 1000000; i < 999999999; i++) {
            if (soThNgh(i) && only068(i) && tongS(i)) {
                System.out.println(i);
            }
        }
    }

    public static boolean soThNgh(int n) {
        int m = n;
        int soNgh = 0;
        while (m > 0) {
            soNgh = soNgh * 10 + m % 10;
            m = m / 10;
        }
        return soNgh == n;
    }

    public static boolean only068(int n) {
        while (n > 0) {
            int temp = n % 10;
            if (temp != 6 && temp != 8 && temp != 0) {
                return false;
            }
            n = n / 10;
        }
        return true;
    }

    public static boolean tongS(int n) {
        int s = 0;
        while (n > 0) {
            s = s + n % 10;
            n = n / 10;
        }
        return s % 10 == 0;
    }
}
