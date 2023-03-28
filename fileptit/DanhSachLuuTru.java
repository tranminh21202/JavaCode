/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fileptit;
import java.util.*;
import java.io.*;
import java.text.*;
import java.util.concurrent.TimeUnit;
/**
 *
 * @author minh
 */
class LuuTru{
    private String makh, hoten, maphong;
    private Date vao, ra;
    private SimpleDateFormat date = new SimpleDateFormat("dd/MM/yyyy");

    public LuuTru(int n, String hoten, String maphong, String vao, String ra)throws ParseException {
        this.makh = "KH" + String.format("%02d", n);
        this.hoten = hoten;
        this.maphong = maphong;
        this.vao = date.parse(vao);
        this.ra = date.parse(ra);
    }
    
    public long getNgay(){
        long day = ra.getTime() - vao.getTime();
        TimeUnit t =TimeUnit.DAYS;
        long res = t.convert(day, TimeUnit.MILLISECONDS);
        return res;
    }
    
    @Override
    public String toString(){
        return makh + " " + hoten + " " + maphong + " " + getNgay();
    }
    
}

public class DanhSachLuuTru {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)throws IOException, ParseException {
        Scanner sc = new Scanner(new File("KHACH.in"));
        ArrayList<LuuTru> list = new ArrayList<>();
        int t = Integer.parseInt(sc.nextLine());
        for(int i=1;i<=t;i++){
            list.add(new LuuTru(i,sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine()));
        }
        Collections.sort(list, Comparator.comparingLong(LuuTru::getNgay).reversed());
        for(LuuTru x:list){
            System.out.println(x);
        }
        // TODO code application logic here
    }
    
}
