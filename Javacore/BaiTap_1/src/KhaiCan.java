public class KhaiCan {
    public static void main(String[] args) {
        int a = 11;
        double b = Math.sqrt(a);
        float c = (float) b * 1000;
        long f = (long) c;
        float d = (float) f / 1000;
        System.out.println("Can bac hai cua " + a + "la: " + d);

    }
}
