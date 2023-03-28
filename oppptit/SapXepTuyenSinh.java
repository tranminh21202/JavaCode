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
class SXBangDiem{
    private String ma, ten;
    private double toan,ly,hoa;

    public SXBangDiem(String ma, String ten, double toan, double ly, double hoa) {
        this.ma = ma;
        this.ten = ten;
        this.toan = toan;
        this.ly = ly;
        this.hoa = hoa;
    }

    public String getMa() {
        return ma;
    }
    
    public double getUu(){
        if(ma.substring(0, 3).equals("KV1")){
            return 0.5;
        }
        else if(ma.substring(0, 3).equals("KV2")){
            return 1;
        }
        else return 2.5;
    }
    
    public double getTong(){
        return toan*2 + ly + hoa;
    }
    
    public double getXet(){
        return getUu() + getTong();
    }
    
    public String So(double diem){
        double tmp = diem;
        if((double) ((int)tmp)-diem == 0){
            return String.format("%.0f", diem);
        }
        else return String.format("%.1f", diem);
    }
    
    public String getTT(){
        if(getTong()+getUu() >= 24){
            return "TRUNG TUYEN";
        }
        else return "TRUOT";
    }
    
    @Override
    public String toString(){
        return ma + " " + ten + " " + So(getUu()) + " " + So(getXet()) + " " + getTT();
    }
}

public class SapXepTuyenSinh {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<SXBangDiem> list = new ArrayList<>();
        int t = Integer.parseInt(sc.nextLine());
        for(int i=1;i<=t;i++){
            String ma = sc.nextLine();
            String ten = sc.nextLine();
            double toan = Double.parseDouble(sc.nextLine());
            double ly = Double.parseDouble(sc.nextLine());
            double hoa = Double.parseDouble(sc.nextLine());
            SXBangDiem a = new SXBangDiem(ma,ten,toan,ly,hoa);
            list.add(a);
        }
        Collections.sort(list, Comparator.comparingDouble(SXBangDiem::getXet).reversed().thenComparing(SXBangDiem::getMa));
        for(SXBangDiem x:list){
            System.out.println(x);
        }
        // TODO code application logic here
    }
    
}
