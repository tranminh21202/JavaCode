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
class GiangVien{
    private String mamh,tenmh,nhomlop,giangvien;

    public GiangVien(String mamh, String tenmh, String nhomlop, String giangvien) {
        this.mamh = mamh;
        this.tenmh = tenmh;
        this.nhomlop = nhomlop;
        this.giangvien = giangvien;
    }

    public String getMamh() {
        return mamh;
    }

    public String getNhomlop() {
        return nhomlop;
    }

    public String getGiangvien() {
        return giangvien;
    }
    
    public String toString(){
        return mamh + " " + tenmh + " " + nhomlop;
    }
}

public class LopHocPhan_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<GiangVien> list = new ArrayList<>();
        int t = Integer.parseInt(sc.nextLine());
        for(int i=1;i<=t;i++){
            GiangVien a = new GiangVien(sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine());
            list.add(a);
        }
        Collections.sort(list, Comparator.comparing(GiangVien::getMamh).thenComparing(GiangVien::getNhomlop));
        int m = Integer.parseInt(sc.nextLine());
        while(m-->0){
            String tengiangvien = sc.nextLine();
            boolean check = true;
            for(GiangVien x:list){
                if(x.getGiangvien().equals(tengiangvien)){
                    if(check){
                        System.out.println("Danh sach cho giang vien " + x.getGiangvien() + ":");
                        System.out.println(x);
                        check = false;
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
