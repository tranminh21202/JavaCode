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
class DonHang{
    private String ten,ma;
    private long dongia,sl;

    public DonHang(String ten, String ma, long dongia, long sl) {
        this.ten = ten;
        this.ma = ma;
        this.dongia = dongia;
        this.sl = sl;
    }
    
    public String getSTT(){
        return ma.substring(1, 4);
    }
    
    public long getGiam(){
        if(ma.substring(4, 5).equals("1")){
            return Math.round(dongia*sl*50.0/100.0);
        }
        else return Math.round(dongia*sl*30.0/100.0);
    }
    
    public long getTien(){
        return dongia*sl - getGiam();
    }
    
    @Override
    public String toString(){
        return ten + " " + ma + " " + getSTT() + " " + getGiam() + " " + getTien();
    }
}

public class TraCuuDonHang {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<DonHang> list = new ArrayList<>();
        int t = Integer.parseInt(sc.nextLine());
        for(int i=1;i<=t;i++){
            String ten = sc.nextLine();
            String ma = sc.nextLine();
            long dongia = Long.parseLong(sc.nextLine());
            long sl = Long.parseLong(sc.nextLine());
            DonHang a = new DonHang(ten,ma,dongia,sl);
            list.add(a);
        }
        for(DonHang x:list){
            System.out.println(x);
        }
        // TODO code application logic here
    }
    
}
