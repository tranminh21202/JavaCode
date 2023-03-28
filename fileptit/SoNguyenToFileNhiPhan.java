/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fileptit;
import java.util.*;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author minh
 */
public class SoNguyenToFileNhiPhan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ClassNotFoundException {
        try(ObjectInputStream sc = new ObjectInputStream(new FileInputStream("SONGUYEN.in"))){
            TreeMap<Integer, Integer> map = new TreeMap<>();
            ArrayList<Integer> list = (ArrayList<Integer>) sc.readObject();
            for(int x:list){
                if(checksnt(x)){
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
            for(Map.Entry<Integer, Integer> entry : map.entrySet()){
                System.out.println(entry.getKey() + " " + entry.getValue());
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        // TODO code application logic here
    }
    
    public static boolean checksnt(int x){
        if(x<2){
            return false;
        }
        for(int i=2;i<=Math.sqrt(x);i++){
            if(x%i==0) return false;
        }
        return true;
    }
    
}
