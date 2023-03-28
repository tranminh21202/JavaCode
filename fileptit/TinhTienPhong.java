/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fileptit;

import java.util.*;
import java.io.*;
import java.text.*;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author minh
 */
class TienPhong {

    private String makh, ten;
    private String sophong;
    private Date ngaynhan, ngaytra;
    private int dichvu;
    private SimpleDateFormat date = new SimpleDateFormat("dd/MM/yyyy");

    public TienPhong(int n, String ten, String sophong, String ngaynhan, String ngaytra, int dichvu) throws ParseException {
        this.makh = "KH" + String.format("%02d", n);
        this.ten = ten;
        this.sophong = sophong;
        this.ngaynhan = date.parse(ngaynhan);
        this.ngaytra = date.parse(ngaytra);
        this.dichvu = dichvu;
    }

    public int getDichvu() {
        return dichvu;
    }

    public long getNgay() {
        long diff = ngaytra.getTime() - ngaynhan.getTime();
        TimeUnit t = TimeUnit.DAYS;
        long res = t.convert(diff, TimeUnit.MILLISECONDS);
        return res + 1;
    }

    public long getTien() {
        String tmp = sophong.substring(0, 1);
        if (tmp.equals("1")) {
            return 25 * getNgay() + getDichvu();
        } else if (tmp.equals("2")) {
            return 34 * getNgay() + getDichvu();
        } else if (tmp.equals("3")) {
            return 50 * getNgay() + getDichvu();
        } else {
            return 80 * getNgay() + getDichvu();
        }
    }

    @Override
    public String toString() {
        return makh + " " + ten + " " + sophong + " " + getNgay() + " " + getTien();
    }

}

public class TinhTienPhong {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException {
        Scanner sc;
        try {
            sc = new Scanner(new File("KHACHHANG.in"));
            ArrayList<TienPhong> list = new ArrayList<>();
            int t = Integer.parseInt(sc.nextLine());
            for (int i = 1; i <= t; i++) {
                TienPhong a = new TienPhong(i, chuanHoa(sc.nextLine()), sc.nextLine(), sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()));
                list.add(a);
            }
            Collections.sort(list, Comparator.comparingLong(TienPhong::getTien).reversed());
            for (TienPhong x : list) {
                System.out.println(x);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(TinhTienPhong.class.getName()).log(Level.SEVERE, null, ex);
        }
        // TODO code application logic here
    }

    public static String chuanHoa(String ten) {
        StringTokenizer st = new StringTokenizer(ten);
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
