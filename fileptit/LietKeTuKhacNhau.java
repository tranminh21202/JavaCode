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
class WordSet{
    String kq="";
    WordSet(String Source){
        try{
            Scanner sc = new Scanner(new File("VANBAN.in"));
            TreeSet<String> set = new TreeSet<>();
            while(sc.hasNext()){
                String tu = sc.next();
                set.add(tu.toLowerCase());
            }
            for(String x:set){
                kq += x + "\n";
            }
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }
    }
    
//<editor-fold defaultstate="collapsed" desc="/*comment*/">
    @Override
//</editor-fold>
    public String toString(){
        return kq;
    }
}

public class LietKeTuKhacNhau {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)throws IOException {
        WordSet ws = new WordSet("VANBAN.in");
        System.out.println(ws);
        // TODO code application logic here
    }
    
}
