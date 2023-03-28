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
class TheoDoi_1{
    private String mamh;
    private long slnhap;

    public TheoDoi_1(String mamh, long slnhap) {
        this.mamh = mamh;
        this.slnhap = slnhap;
    }

    public String getMamh() {
        return mamh;
    }
    
    public long SlXuat(){
        if(mamh.substring(0, 1).equals("A")){
            return Math.round(slnhap*60.0/100.0);
        }
        else return Math.round(slnhap*70.0/100.0);
    }
    
    public long DonGia(){
        if(mamh.substring(4, 5).equals("Y")){
            return 110000;
        }
        else return 135000;
    }
    
    public long Tien(){
        return SlXuat()*DonGia();
    }
    
    public long Thue(){
        if(mamh.substring(0, 1).equals("A") && mamh.substring(4, 5).equals("Y")){
            return Math.round(Tien()*8.0/100.0);
        }
        else if(mamh.substring(0, 1).equals("A") && mamh.substring(4, 5).equals("N")){
            return Math.round(Tien()*11.0/100.0);
        }
        else if(mamh.substring(0, 1).equals("B") && mamh.substring(4, 5).equals("Y")){
            return Math.round(Tien()*17.0/100.0);
        }
        else return Math.round(Tien()*22.0/100.0);
    }
    
    @Override
    public String toString(){
        return mamh + " " + slnhap + " " + SlXuat() + " " + DonGia() + " " + Tien() + " " + Thue();
    }
}

public class LietKeNhapXuatHang {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<TheoDoi_1> list = new ArrayList<>();
        int t = Integer.parseInt(sc.nextLine());
        for(int i=1;i<=t;i++){
            String mamh = sc.nextLine();
            long slnhap = Long.parseLong(sc.nextLine());
            TheoDoi_1 a = new TheoDoi_1(mamh,slnhap);
            list.add(a);
        }
        Collections.sort(list, Comparator.comparingLong(TheoDoi_1::Thue).reversed());
        String nhom = sc.nextLine();
        for(TheoDoi_1 x:list){
            if(x.getMamh().substring(0, 1).equals(nhom)){
                System.out.println(x);
            }
        }
        // TODO code application logic here
    }
    
}
