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
public class SoThuanNghichTrongFile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        ObjectInputStream sc1 = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ObjectInputStream sc2 = new ObjectInputStream(new FileInputStream("DATA2.in"));
        int[] dem = new int[1000000];
        ArrayList<Integer> list1 = (ArrayList<Integer>) sc1.readObject();
        ArrayList<Integer> list2 = (ArrayList<Integer>) sc2.readObject();
        TreeSet<Integer> set1 = new TreeSet<>();
        TreeSet<Integer> set2 = new TreeSet<>();
        for(int x:list1){
            if(checkTN(x)){
                set1.add(x);
                dem[x]++;
            }
        }
        for(int x:list2){
            if(checkTN(x)){
                set2.add(x);
                dem[x]++;
            }
        }
        int t=0;
        for(int x:set1){
            if(set2.contains(x) && t<10){
                System.out.println(x + " " + dem[x]);
                t++;
            }
        }
        // TODO code application logic here
    }
    
    public static boolean checkTN(int n){
        String tmp = String.valueOf(n);
        if(tmp.length()%2==0 || tmp.length()==1){
            return false;
        }
        for(int i=0;i<=tmp.length()/2;i++){
            if(tmp.charAt(i)!=tmp.charAt(tmp.length()-1-i)){
                return false;
            }
        }
        while(n>0){
            if((n%10)%2==0){
                return false;
            }
            n/=10;
        }
        return true;
    }
    
}
