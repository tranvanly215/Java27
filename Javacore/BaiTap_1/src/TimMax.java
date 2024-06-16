public class TimMax {
    public static void main(String[] args) {
        int a = 7, b = 99, c = -10, d=5;
        int deltaA = Math.max(a,b);
        int deltaB = Math.max(deltaA,c);
        int Max    = Math.max(deltaB,d);
        System.out.println("So max la: " + Max);

    }
}
