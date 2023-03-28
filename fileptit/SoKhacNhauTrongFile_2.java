/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fileptit;
import java.io.*;
import java.util.*;
/**
 *
 * @author minh
 */
public class SoKhacNhauTrongFile_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try(DataInputStream sc = new DataInputStream(new FileInputStream("DATA.IN"))){
            TreeMap<Integer, Integer> map = new TreeMap<>();
            try{
                while(true){
                    Integer t = sc.readInt();
                    Integer tim = map.getOrDefault(t, 0);
                    map.put(t, tim+1);
                }
            }
            catch(EOFException e){
                map.forEach((key,val) -> System.out.println(key + " " + val));
            }
        }
        catch(IOException e){
            e.printStackTrace();
        }
        // TODO code application logic here
    }
    
}
