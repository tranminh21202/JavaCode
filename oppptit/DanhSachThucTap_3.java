/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package oppptit;

import java.util.*;
import java.io.*;
import java.util.StringTokenizer;

/**
 *
 * @author minh
 */
class SinhVienTT {

    private String masv, hoten, lop, email;

    public SinhVienTT(String masv, String hoten, String lop, String email) {
        this.masv = masv;
        this.hoten = hoten;
        this.lop = lop;
        this.email = email;
    }

    public String getMasv() {
        return masv;
    }

    @Override
    public String toString() {
        return masv + " " + hoten + " " + lop;
    }
}

class DoanhNghiep {

    private String madn, tendn;
    private int soluong;

    public DoanhNghiep(String madn, String tendn, int soluong) {
        this.madn = madn;
        this.tendn = tendn;
        this.soluong = soluong;
    }

    public String getMadn() {
        return madn;
    }

    public String getTendn() {
        return tendn;
    }

    public int getSoluong() {
        return soluong;
    }

}

class DangKy {

    private String masvdk, madndk;

    public DangKy(String thongtin) {
        String[] arr = thongtin.split(" ");
        this.masvdk = arr[0];
        this.madndk = arr[1];
    }

    public String getMasvdk() {
        return masvdk;
    }

    public String getMadndk() {
        return madndk;
    }

}

public class DanhSachThucTap_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        Scanner sc1 = new Scanner(new File("SINHVIEN.in"));
        Scanner sc2 = new Scanner(new File("DN.in"));
        Scanner sc3 = new Scanner(new File("THUCTAP.in"));
        ArrayList<SinhVienTT> list1 = new ArrayList<>();
        ArrayList<DoanhNghiep> list2 = new ArrayList<>();
        ArrayList<DangKy> list3 = new ArrayList<>();
        int t = Integer.parseInt(sc1.nextLine());
        for (int i = 1; i <= t; i++) {
            String masv = sc1.nextLine();
            String hoten = sc1.nextLine();
            String lop = sc1.nextLine();
            String email = sc1.nextLine();
            SinhVienTT a = new SinhVienTT(masv, chuanHoa(hoten), lop, email);
            list1.add(a);
        }
        Collections.sort(list1, Comparator.comparing(SinhVienTT::getMasv));
        sc1.close();
        int m = Integer.parseInt(sc2.nextLine());
        for (int i = 1; i <= m; i++) {
            String madn = sc2.nextLine();
            String tendn = sc2.nextLine();
            int soluong = Integer.parseInt(sc2.nextLine());
            DoanhNghiep b = new DoanhNghiep(madn, tendn, soluong);
            list2.add(b);
        }
        sc2.close();
        int n = Integer.parseInt(sc3.nextLine());
        for (int i = 1; i <= n; i++) {
            DangKy c = new DangKy(sc3.nextLine());
            list3.add(c);
        }
        int k = Integer.parseInt(sc3.nextLine());
        while (k-- > 0) {
            String ma = sc3.nextLine();
            int sldk = 0;
            for (DoanhNghiep y : list2) {
                if (y.getMadn().equals(ma)) {
                    System.out.println("DANH SACH THUC TAP TAI " + y.getTendn() + ":");
                    sldk = y.getSoluong();
                    break;
                }
            }
            for (DangKy x : list3) {
                if (x.getMadndk().equals(ma)) {
                    for (SinhVienTT z : list1) {
                        if (z.getMasv().equals(x.getMasvdk()) && sldk>0) {
                            System.out.println(z);
                            sldk--;
                        }
                    }
                }
            }
        }

        // TODO code application logic here
    }

    public static String chuanHoa(String hoten) {
        StringTokenizer st = new StringTokenizer(hoten);
        StringBuilder kq = new StringBuilder();
        while (st.hasMoreTokens()) {
            String t = st.nextToken();
            kq.append(Character.toUpperCase(t.charAt(0)));
            for (int i = 1; i < t.length(); i++) {
                kq.append(Character.toLowerCase(t.charAt(i)));
            }
            kq.append(" ");
        }
        return kq.toString().trim();
    }

}
