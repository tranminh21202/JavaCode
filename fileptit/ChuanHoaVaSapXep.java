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
class HoTen{
    private String ho;
    private String dem;
    private String ten;

    public HoTen(String hovaten) {
        String[] arr = hovaten.split("\\s+");
        this.ho = arr[0];
        String tmp = "";
        for(int i=1;i<arr.length-1;i++){
            tmp = tmp + arr[i] + " ";
        }
        this.dem = tmp;
        this.ten = arr[arr.length - 1];
    }

    public String getHo() {
        return ho;
    }

    public String getDem() {
        return dem;
    }

    public String getTen() {
        return ten;
    }
    
    @Override
    public String toString(){
        return ho + " " + dem + ten;
    }
}

public class ChuanHoaVaSapXep {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)throws IOException {
        Scanner sc = new Scanner(new File("DANHSACH.in"));
        ArrayList<HoTen> list = new ArrayList<>();
        while(sc.hasNextLine()){
            String hovaten = sc.nextLine();
            HoTen a = new HoTen(chuanHoa(hovaten));
            list.add(a);
        }
        Collections.sort(list, Comparator.comparing(HoTen::getTen).thenComparing(HoTen::getHo).thenComparing(HoTen::getDem));
        for(HoTen x:list){
            System.out.println(x);
        }
        // TODO code application logic here
    }
    
    public static String chuanHoa(String hovaten){
        StringTokenizer st = new StringTokenizer(hovaten);
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
