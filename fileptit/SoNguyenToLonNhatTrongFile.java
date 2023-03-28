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
public class SoNguyenToLonNhatTrongFile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ClassNotFoundException {
        try(ObjectInputStream sc = new ObjectInputStream(new FileInputStream("DATA.in"))){
            TreeMap<Integer,Integer> map = new TreeMap<>();
            TreeSet<Integer> set = new TreeSet<>();
            ArrayList<Integer> list = (ArrayList<Integer>) sc.readObject();
            for(int x:list){
                if(checksnt(x)){
                    set.add(x);
                    if(map.containsKey(x)){
                        int tansuat = map.get(x);
                        tansuat++;
                        map.put(x, tansuat);
                    }
                    else{
                        map.put(x, 1);
                    }
                }
            }
            int t=10;
            while(t-->0){
                System.out.println(set.last() + " " + map.get(set.last()));
                set.pollLast();
            }
        }catch(IOException e){
            e.printStackTrace();;
        }
        // TODO code application logic here
    }
    
    public static boolean checksnt(int n){
        if(n<2) return false;
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0) return false;
        }
        return true;
    }
    
}
