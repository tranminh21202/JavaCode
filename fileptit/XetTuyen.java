/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fileptit;
import java.util.*;
import java.io.*;
/**
 *
 * @author minh
 */
class ThiTuyen{
    private String ma,hoten;
    private String ngaysinh;
    private double lythuyet,thuchanh;

    public ThiTuyen(int n, String hoten, String ngaysinh, double lythuyet, double thuchanh) {
        this.ma = "PH" + String.format("%02d", n);
        this.hoten = hoten;
        this.ngaysinh = ngaysinh;
        this.lythuyet = lythuyet;
        this.thuchanh = thuchanh;
    }
    
    public int getTuoi(){
        int i=6;
        while(true){
            if(ngaysinh.charAt(i-1)=='/'){
                break;
            }
            i--;
        }
        int kq = Integer.parseInt(ngaysinh.substring(i));
        return 2021-kq;
    }
    
    public double getThuong(){
        if(lythuyet >= 8 && thuchanh >= 8){
            return 1;
        }
        else if(lythuyet >= 7.5 && lythuyet < 8 && thuchanh >= 7.5 && thuchanh < 8){
            return 0.5;
        }
        else return 0;
    }
    
    public int getDiem(){
        double diem = (lythuyet + thuchanh)/2 + getThuong();
        if(diem>10) return 10;
        else return ((int) Math.round(diem*1)/1);
    }
    
    public String getXep(){
        if(getDiem()<5){
            return "Truot";
        }
        else if(getDiem()==5 || getDiem()==6){
            return "Trung binh";
        }
        else if(getDiem()==7){
            return "Kha";
        }
        else if(getDiem() == 8){
            return "Gioi";
        }
        else return "Xuat sac";
    }
    
    @Override
    public String toString(){
        return ma + " " + hoten + " " + getTuoi() + " " + getDiem() + " " + getXep();
    }
}

public class XetTuyen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(new File("XETTUYEN.in"));
        ArrayList<ThiTuyen> list = new ArrayList<>();
        int t = Integer.parseInt(sc.nextLine());
        for(int i=1;i<=t;i++){
            String hoten = sc.nextLine();
            String ngaysinh = sc.nextLine();
            double lythuyet = Double.parseDouble(sc.nextLine());
            double thuchanh = Double.parseDouble(sc.nextLine());
            ThiTuyen a = new ThiTuyen(i,chuanTen(hoten),ngaysinh,lythuyet,thuchanh);
            list.add(a);
        }
        for(ThiTuyen x:list){
            System.out.println(x);
        }
        // TODO code application logic here
    }
    
    public static String chuanTen(String hoten){
        StringTokenizer st = new StringTokenizer(hoten);
        StringBuilder kq = new StringBuilder();
        while(st.hasMoreTokens()){
            String t = st.nextToken();
            kq.append(Character.toUpperCase(t.charAt(0)));
            for(int i=1;i<t.length();i++){
                kq.append(Character.toLowerCase(t.charAt(i)));
            }
            kq.append(" ");
        }
        return kq.toString().trim();
    }
}
