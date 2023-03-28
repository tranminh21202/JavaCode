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
public class LietKeTheoThuTuXuatHien {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)throws IOException, ClassNotFoundException {
        Scanner sc1 = new Scanner(new File("VANBAN.in"));
        ObjectInputStream sc2 = new ObjectInputStream(new FileInputStream("NHIPHAN.in"));
        ArrayList<String> list = (ArrayList<String>) sc2.readObject();
        LinkedHashSet<String> set1 = new LinkedHashSet<>();
        LinkedHashSet<String> set2 = new LinkedHashSet<>();
        while(sc1.hasNext()){
            String tmp = sc1.next();
            set1.add(tmp.toLowerCase());
        }
        for(String x:list){
            String[] arr = x.split(" ");
            for(int i=0;i<arr.length;i++){
                set2.add(arr[i].toLowerCase());
            }
        }
        for(String x:set1){
            if(set2.contains(x)){
                System.out.println(x);
            }
        }
        // TODO code application logic here
    }
    
}
