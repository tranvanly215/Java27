
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;

public class TinhTuoi {
    public static void main(String[] args) throws ParseException {
        Scanner ngayThang = new Scanner(System.in);
        System.out.println("Nhap ngay thang nam sinh cua ban theo cu phap dd/MM/yyyy");
        String line = ngayThang.nextLine();
        String ngaySinh = line;

        SimpleDateFormat format1 = new SimpleDateFormat("dd/MM/yyyy");
        Date ngaySinhchange = format1.parse(ngaySinh);
        //System.out.println(ngaySinhchange);//

        LocalDate homNay = LocalDate.now();
        //System.out.println(homNay);//

        long namSinh = ngaySinhchange.getYear();
        long namNay = homNay.getYear();
        long namSinhdung = 1900 + namSinh;
        System.out.println("So tuoi la: " + (namNay - namSinhdung));

    }
}
