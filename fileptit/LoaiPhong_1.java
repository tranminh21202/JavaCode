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
class LoaiPhong implements Comparable<LoaiPhong>{
    private String kyhieu, ten, dongia, phi;

    public LoaiPhong(String thongtin) {
        String[] arr = thongtin.split(" ");
        this.kyhieu = arr[0];
        this.ten = arr[1];
        this.dongia = arr[2];
        this.phi = arr[3];
    }
    
    @Override
    public String toString(){
        return kyhieu + " " + ten + " " + dongia + " " + phi;
    }

    @Override
    public int compareTo(LoaiPhong o) {
        return ten.compareTo(o.ten);
    }
}

public class LoaiPhong_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        ArrayList<LoaiPhong> ds = new ArrayList<>();
        Scanner in = new Scanner(new File("PHONG.in"));
        int n = Integer.parseInt(in.nextLine());
        while(n-->0){
            ds.add(new LoaiPhong(in.nextLine()));
        }
        Collections.sort(ds);
        for(LoaiPhong tmp : ds){
            System.out.println(tmp);
        }
    }
    
}
