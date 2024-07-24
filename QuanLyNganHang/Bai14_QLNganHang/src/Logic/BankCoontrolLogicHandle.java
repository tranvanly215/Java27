package Logic;

import Entity.BankHandleDetail;
import Entity.Banks;
import Entity.BanksHanle;
import Entity.Custumer;

import java.util.Scanner;

public class BankCoontrolLogicHandle {
    private final BanksHanle[] banksHanle = new BanksHanle[1000];
    private BanksLogic banksLogic;
    private CustumLogic custumLogic;


    public BankCoontrolLogicHandle(BanksLogic banksLogic, CustumLogic custumLogic) {
        this.banksLogic = banksLogic;
        this.custumLogic = custumLogic;
    }

    public void creatNewBanksInfor() {
        boolean kiemtraKhachHang = custumLogic.kiemTraKhachHang();
        boolean kiemTraNganHang = banksLogic.kiemTraNganHang();
        if (!kiemtraKhachHang || kiemTraNganHang) {
            System.out.println("Vui long nhap thong tin khach hang hoac ngan hang truoc khi nhap");
            return;
        }
        System.out.println("Co bao nhieu KH can nhap thong tin");
        int cuzNum;
        while (true) {
            cuzNum = new Scanner(System.in).nextInt();
            if (cuzNum > 0 && cuzNum <= custumLogic.getCuzLength()) {
                break;
            }
            System.out.println("Vui long kiem tra lai so luong khach hang");
        }
        for (int i = 0; i < cuzNum; i++) {
            System.out.println("Nhap thong tin KH thu " + (i + 1) + " :");
            Custumer custumer = truyVanKhachHang();
//////chua hoan thanh
        }
    }

    public Custumer truyVanKhachHang() {
        Custumer custumer = null;
        while (true) {
            int cuzId = new Scanner(System.in).nextInt();
            custumer = custumLogic.searchCustumerById(cuzId);
            if (custumer != null) {
                break;
            }
            System.out.print("Khong tim thay KH vua nhap, vui long kiem tra lai ");
        }
        return custumer;
    }

    public BankHandleDetail khaiBaoThongTinSoNganHang() {
        System.out.println("Co bao nhieu Ngan Hang can nhap");
        int bankNumBer;
        while (true) {
            bankNumBer = new Scanner(System.in).nextInt();
            if (bankNumBer > 0 && bankNumBer <= banksLogic.BanksLength())
            {
                break;
            }
            System.out.println("Khong hop le vui long nhap lai");
        }
        BankHandleDetail[] details = new BankHandleDetail[bankNumBer];
        int count = 0;
        for (int j = 0; j < bankNumBer; j++) {
            System.out.println("Nhập id của ngan hang thu " + (j + 1) + ": ");

            Banks banks = null;
            while (true) {
                int bankId = new Scanner(System.in).nextInt();
                banks = banksLogic.searchBanksById(bankId);
                if (banks != null) {
                    break;
                }
                System.out.println("Khong co Ngan hang trong co so du lieu ");
            }

            System.out.println("Ngan hang '" + banks.getBankName() + " ban muo lap bao nhieu so ");
            int quantity;
            int amount;
            while (true) {
                quantity = new Scanner(System.in).nextInt();
                if (quantity > 0 && quantity < 6) {
                    break;
                }
                System.out.println("So so mo toi da la 5 vui long kiem tra lai ");
            }
            BankHandleDetail[] oneBanksDetail = new BankHandleDetail[quantity];
            for (int i = 0; i < quantity; i++) {
                System.out.println("Nhap so tien trong tung so thu :  " + (i + 1));
                amount = new Scanner(System.in).nextInt();
                oneBanksDetail[i] = new BankHandleDetail(banks, amount);
            }

            //////////Chua hoan thanh
        }
        return null;
    }
}

