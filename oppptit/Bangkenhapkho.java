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
class NhapKho{
    private String ma,ten;
    private int sl,dongia;

    public NhapKho(int n, String ma, String ten, int sl, int dongia) {
        this.ma = ma + String.format("%02d", n);
        this.ten = ten;
        this.sl = sl;
        this.dongia = dongia;
    }
    
    public int getChiet(){
        if(sl>10) return dongia*sl*5/100;
        else if(sl>=8 && sl<=10) return dongia*sl*2/100;
        else if(sl>=5 && sl<8) return dongia*sl*1/100;
        else return 0;
    }
    
    public int getTong(){
        return dongia*sl-getChiet();
    }
    
    @Override
    public String toString(){
        return ma + " " + ten + " " + getChiet() + " " + getTong();
    }
    
}

public class Bangkenhapkho {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<NhapKho> list = new ArrayList<>();
        HashMap<String,Integer> map = new HashMap<>();
        while(t-->0){
            String ten = sc.nextLine();
            String ma = ChuanHoa(ten);
            int sl = Integer.parseInt(sc.nextLine());
            int dongia = Integer.parseInt(sc.nextLine());
            Integer i;
            if(map.containsKey(ma)){
                map.put(ma, map.get(ma)+1);
            }
            else{
                map.put(ma, 1);
            }
            i = map.get(ma);
            NhapKho a = new NhapKho(i,ma,ten,sl,dongia);
            list.add(a);
        }
        for(NhapKho x:list){
            System.out.println(x);
        }
        // TODO code application logic here
    }
    
    public static String ChuanHoa(String ten){
        StringTokenizer st = new StringTokenizer(ten);
        String ans="";
        while(st.hasMoreTokens()){
            String t = st.nextToken();
            if(ans.length()<2){
                ans += Character.toUpperCase(t.charAt(0));
            }
            else break;
        }
        return ans;
    }
    
}
