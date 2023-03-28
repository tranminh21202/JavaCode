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
public class CapSoNguyenToTrongFile_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        ObjectInputStream sc1 = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ObjectInputStream sc2 = new ObjectInputStream(new FileInputStream("DATA2.in"));
        ArrayList<Integer> list1 = (ArrayList<Integer>) sc1.readObject();
        ArrayList<Integer> list2 = (ArrayList<Integer>) sc2.readObject();
        TreeSet<Integer> set1 = new TreeSet<>();
        TreeSet<Integer> set2 = new TreeSet<>();
        TreeMap<Integer, Integer> map = new TreeMap<>();
        for(int x:list1){
            if(checksnt(x)){
                set1.add(x);
            }
        }
        for(int y:list2){
            if(checksnt(y)){
                set2.add(y);
            }
        }
        for(int x:set1){
            int y = 1000000 -x;
            if(set2.contains(y) && x<y){
                map.put(x, y);
            }
        }
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
        // TODO code application logic here
    }
    
    public static boolean checksnt(int n){
        if(n<2) return false;
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}
