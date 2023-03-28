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
class DanhSachTT{
    private String ma,hoten;
    private double toan,ly,hoa;

    public DanhSachTT(String ma, String hoten, double toan, double ly, double hoa) {
        this.ma = ma;
        this.hoten = hoten;
        this.toan = toan;
        this.ly = ly;
        this.hoa = hoa;
    }

    public String getMa() {
        return ma;
    }
    
    public double getUu(){
        String tmp = ma.substring(0, 3);
        if(tmp.equals("KV1")){
            return 0.5;
        }
        else if(tmp.equals("KV2")){
            return 1.0;
        }
        else return 2.5;
    }
    
    public double getTong(){
        return toan*2 + ly + hoa + getUu();
    }
    
    public String so(double diem){
        double tmp = diem;
        if((double)((int)tmp) - diem == 0){
            return String.format("%.0f", diem);
        }
        else return String.format("%.1f", diem);
    }
    
    @Override
    public String toString(){
        return ma + " " + hoten + " " + so(getUu()) + " " + so(getTong());
    }
}

public class DanhSachTrungTuyen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)throws IOException {
        Scanner sc = new Scanner(new File("THISINH.in"));
        ArrayList<DanhSachTT> list = new ArrayList<>();
        int t = Integer.parseInt(sc.nextLine());
        double arr[] = new double[t];
        for(int i=1;i<=t;i++){
            String ma = sc.nextLine();
            String hoten = sc.nextLine();
            double toan = Double.parseDouble(sc.nextLine());
            double ly = Double.parseDouble(sc.nextLine());
            double hoa = Double.parseDouble(sc.nextLine());
            DanhSachTT a = new DanhSachTT(ma,chuanhoa(hoten),toan,ly,hoa);
            arr[i-1] = a.getTong();
            list.add(a);
        }
        Arrays.sort(arr);
        int chitieu = Integer.parseInt(sc.nextLine());
        double diemct = arr[t-chitieu];
        System.out.println(diemct);
        Collections.sort(list, Comparator.comparingDouble(DanhSachTT::getTong).reversed().thenComparing(DanhSachTT::getMa));
        for(DanhSachTT x:list){
            if(x.getTong() >= diemct){
                System.out.print(x);
                System.out.println(" TRUNG TUYEN");
            }
            else{
                System.out.print(x);
                System.out.println(" TRUOT");
            }
        }
        // TODO code application logic here
    }
    
    public static String chuanhoa(String hoten){
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
