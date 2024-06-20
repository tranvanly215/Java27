import java.util.Scanner;

public class Bai2_UocCuaSo_n {
    public static void main(String[] args) {
        System.out.print("Nhập vào số n ");
        int n = new Scanner(System.in).nextInt();
        int couter = 0;
        System.out.println("Các ước của " + n + " gồm: ");
        for (int i = 1; i<= n; i++){
            if (n%i==0){
                System.out.print(i + " ");
                couter +=1;
            }
        }
        System.out.println();
        System.out.println("Số ước của " + n + " là:  " + couter);
    }
}
