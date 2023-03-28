/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package oppptit;

import java.util.*;
import java.io.*;

/**
 *
 * @author minh
 */
class HocPhan {

    private String mamh, tenmh;
    private String nhomlop, giangvien;

    public HocPhan(String mamh, String tenmh, String nhomlop, String giangvien) {
        this.mamh = mamh;
        this.tenmh = tenmh;
        this.nhomlop = nhomlop;
        this.giangvien = giangvien;
    }

    public String getMamh() {
        return mamh;
    }

    public String getTenmh() {
        return tenmh;
    }

    public String getNhomlop() {
        return nhomlop;
    }

    @Override
    public String toString() {
        return nhomlop + " " + giangvien;
    }
}

public class LopHocPhan_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<HocPhan> list = new ArrayList<>();
        int t = Integer.parseInt(sc.nextLine());
        for (int i = 1; i <= t; i++) {
            String mamh = sc.nextLine();
            String tenmh = sc.nextLine();
            String nhomlop = sc.nextLine();
            String giangvien = sc.nextLine();
            HocPhan a = new HocPhan(mamh, tenmh, nhomlop, giangvien);
            list.add(a);
        }
        Collections.sort(list, Comparator.comparing(HocPhan::getNhomlop));
        int m = Integer.parseInt(sc.nextLine());
        while (m-- > 0) {
            String monhoc = sc.nextLine();
            boolean check = true;
            for (HocPhan x : list) {
                if (x.getMamh().equals(monhoc)) {
                    if (check) {
                        System.out.println("Danh sach nhom lop mon " + x.getTenmh() + ":");
                        check = false;
                        System.out.println(x);
                    }
                    else{
                        System.out.println(x);
                    }
                }
            }
        }
        // TODO code application logic here
    }

}
