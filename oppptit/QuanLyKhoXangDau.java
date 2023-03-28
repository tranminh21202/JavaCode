/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package oppptit;

import java.util.*;

/**
 *
 * @author minh
 */
class XangDau {

    private String ma;
    private long sl;

    public XangDau(String ma, long sl) {
        this.ma = ma;
        this.sl = sl;
    }

    public String getTen() {
        if (ma.substring(3, 5).equals("BP")) {
            return "British Petro";
        } else if (ma.substring(3, 5).equals("ES")) {
            return "Esso";
        } else if (ma.substring(3, 5).equals("SH")) {
            return "Shell";
        } else if (ma.substring(3, 5).equals("CA")) {
            return "Castrol";
        } else if (ma.substring(3, 5).equals("MO")) {
            return "Mobil";
        } else {
            return "Trong Nuoc";
        }
    }

    public int getDon() {
        if (ma.substring(0, 1).equals("X")) {
            return 128000;
        } else if (ma.substring(0, 1).equals("D")) {
            return 11200;
        } else {
            return 9700;
        }
    }

    public long getThue() {
        if (ma.substring(3, 5).equals("TN")) {
            return 0;
        } else {
            if (ma.substring(0, 1).equals("X")) {
                return Math.round(sl * getDon() * 3.0 / 100.0);
            } else if (ma.substring(0, 1).equals("D")) {
                return Math.round(sl * getDon() * 3.50 / 100.0);
            } else {
                return Math.round(sl * getDon() * 2.0 / 100.0);
            }
        }
    }

    public long getTien() {
        return sl * getDon() + getThue();
    }

    public String toString() {
        return ma + " " + getTen() + " " + getDon() + " " + getThue() + " " + getTien();
    }
}

public class QuanLyKhoXangDau {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<XangDau> list = new ArrayList<>();
        int t = Integer.parseInt(sc.nextLine());
        for (int i = 1; i <= t; i++) {
            String ma = sc.next();
            long sl = Long.parseLong(sc.next());
            XangDau a = new XangDau(ma, sl);
            list.add(a);
        }
        for (XangDau x : list) {
            System.out.println(x);
        }
        // TODO code application logic here
    }

}
