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
class TienDien{
    private String makh,masd;
    private int socu, somoi;

    public TienDien(int n, String masd, int socu, int somoi) {
        this.makh = "KH" + String.format("%02d", n);
        this.masd = masd;
        this.socu = socu;
        this.somoi = somoi;
    }
    public int getHeSo(){
        if(masd.equals("KD")){
            return 3;
        }
        else if(masd.equals("NN")){
            return 5;
        }
        else if(masd.equals("TT")){
            return 4;
        }
        else return 2;
    }
    
    public long getTien(){
        return (somoi-socu) * getHeSo() * 550;
    }
    
    public long getPhu(){
        if(somoi-socu < 50){
            return 0;
        }
        else if((somoi-socu)>=50 && (somoi-socu)<=100){
            return Math.round(getTien()*35.0/100.0);
        }
        else return Math.round(getTien()*100.0/100.0);
    }
    
    public long getTong(){
        return getPhu() + getTien();
    }
    
    @Override
    public String toString(){
        return makh + " " + getHeSo() + " " + getTien() + " " + getPhu() + " " + getTong();
    }
}

public class TinhTienDien {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<TienDien> list = new ArrayList<>();
        int t = Integer.parseInt(sc.nextLine());
        for(int i=1;i<=t;i++){
            String masd = sc.nextLine();
            int socu = Integer.parseInt(sc.nextLine());
            int somoi = Integer.parseInt(sc.nextLine());
            TienDien a = new TienDien(i,masd,socu,somoi);
            list.add(a);
        }
        
        for(TienDien x:list){
            System.out.println(x);
        }
        // TODO code application logic here
    }
    
}
