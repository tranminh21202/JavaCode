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
class MonHoc{
    private String mamon,tenmon;
    private int sotinchi;

    public MonHoc(String mamon, String tenmon, int sotinchi) {
        this.mamon = mamon;
        this.tenmon = tenmon;
        this.sotinchi = sotinchi;
    }

    public String getMamon() {
        return mamon;
    }

    public String getTenmon() {
        return tenmon;
    }    
}

class LichGD{
    private String manhom,mamonhoc;
    private int ngaygiang,kiphoc;
    private String giangvien;
    private String phonghoc;
    private ArrayList<MonHoc> list = new ArrayList<>();

    public LichGD(int n, String mamonhoc, int ngaygiang, int kiphoc, String giangvien, String phonghoc, ArrayList<MonHoc> list) {
        this.manhom = "HP" + String.format("%03d", n);
        this.mamonhoc = mamonhoc;
        this.ngaygiang = ngaygiang;
        this.kiphoc = kiphoc;
        this.giangvien = giangvien;
        this.phonghoc = phonghoc;
        this.list = list;
    }

    public String getMamonhoc() {
        return mamonhoc;
    }

    public int getNgaygiang() {
        return ngaygiang;
    }

    public int getKiphoc() {
        return kiphoc;
    }

    public String getGiangvien() {
        return giangvien;
    }
    
    public String getTenmon(){
        for(MonHoc x:list){
            if(x.getMamon().equals(mamonhoc)){
                return x.getTenmon();
            }
        }
        return "";
    }
    
    @Override
    public String toString(){
        return manhom + " " + getTenmon() + " " + ngaygiang + " " + kiphoc + " " + phonghoc;
    }
    
}
public class LichGiangDayTheoGV {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)throws IOException {
        Scanner sc1 = new Scanner(new File("MONHOC.in"));
        Scanner sc2 = new Scanner(new File("LICHGD.in"));
        ArrayList<MonHoc> list1 = new ArrayList<>();
        ArrayList<LichGD> list2 = new ArrayList<>();
        int t =Integer.parseInt(sc1.nextLine());
        for(int i=1;i<=t;i++){
            MonHoc a = new MonHoc(sc1.nextLine(), sc1.nextLine(), Integer.parseInt(sc1.nextLine()));
            list1.add(a);
        }
        sc1.close();
        int m = Integer.parseInt(sc2.nextLine());
        for(int i=1;i<=m;i++){
            LichGD a = new LichGD(i, sc2.nextLine(), Integer.parseInt(sc2.nextLine()), Integer.parseInt(sc2.nextLine()), sc2.nextLine(), sc2.nextLine(), list1);
            list2.add(a);
        }
        Collections.sort(list2, Comparator.comparingInt(LichGD::getNgaygiang).thenComparingInt(LichGD::getKiphoc));
        String tengiangvien = sc2.nextLine();
        System.out.println("LICH GIANG DAY GIANG VIEN " + tengiangvien + ":");
        for(LichGD x:list2){
            if(x.getGiangvien().equals(tengiangvien)){
                System.out.println(x);
            }
        }
        // TODO code application logic here
    }
    
}
