public class Bai18_LietKeSo {
    public static void main(String[] args) {
        for (int i = 10000; i < 9999999; i++) {
            if (kiemTraSNT(i) && kiemTraSoNgD(i) && numberWithout4(i)) {
                System.out.println(i);
            }
        }
    }

    public static boolean kiemTraSNT(int n) {
        int demUoc = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                demUoc++;
            }
        }
        if (demUoc > 2) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean kiemTraSoNgD(int n) {
        int m = n;
        int soDao = 0;
        while (m > 0) {
            soDao = soDao * 10 + m % 10;
            m = m / 10;
        }
        return soDao == n;
    }

    public static boolean numberWithout4(int n) {
        while (n > 0) {
            int temp = n % 10;
            if (temp == 4) {
                return false;
            }
            n = n / 10;
        }
        return true;
    }
}
