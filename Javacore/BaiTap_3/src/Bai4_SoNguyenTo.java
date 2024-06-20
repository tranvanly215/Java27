import javafx.scene.transform.Scale;

import java.util.Scanner;

public class Bai4_SoNguyenTo {
    public static void main(String[] args) {
        System.out.print("Nhập vào số n:  ");
        int n = new Scanner(System.in).nextInt();
        System.out.println("n số nguyên tố gồm:  ");
        int i = 1;
        int couter = 0; //Đếm số lươợng số NT đã bằng n chưa
        while (couter < n) {
            i = i + 1;
            int DemUoc = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    DemUoc = DemUoc + 1;
                }
            }
            if (DemUoc > 2) {
                continue;
            } else {
                System.out.print(i +" ");
                couter++;
            }

        }
    }

}

