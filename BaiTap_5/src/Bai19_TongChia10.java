public class Bai19_TongChia10 {
    public static void main(String[] args) {
        for (int i = 100000; i <999999 ; i++) {
if (kiemTraSoTN(i)&& tongS(i)){
    System.out.println(i);
}
        }
    }
    public static boolean kiemTraSoTN(int n){
        int m=n;
        int soDao =0;
        while (m>0){
            soDao= soDao*10+ m%10;
            m=m/10;
        }
        return soDao == n;
    }
    public static boolean tongS(int n){
        int s =0;
        while (n>0){
            s = s+ n%10;
            n=n/10;
        }
        return s%10==0;
    }
}
