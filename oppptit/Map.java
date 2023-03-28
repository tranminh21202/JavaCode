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
public class Map {

    /**
     * @param args the command line arguments
     */
                //(key,value) = String, String
                //put get size isEmpty remove replace
        //LinkedHashMap luu lai thu tu xuat hien va nhu HashMap 
        //TreeMap luu lai phan tu da duoc sap xep
    public static void main(String[] args) {
//        HashMap<String, String> map = new HashMap<>();
//        map.put("US", "Biden");
//        map.put("Rus", "Putin");
//        map.put("China", "Can Binh");
//        for(HashMap.Entry<String, String> entry : map.entrySet()){
//            System.out.println(entry.getKey() + " " + entry.getValue());
//        }
//        System.out.println(" ");
////        map.remove("China");
//        map.replace("China", "Nguyen Van A");
//        for(HashMap.Entry<String, String> entry : map.entrySet()){
//            System.out.println(entry.getKey() + " " + entry.getValue());
//        }
//         TODO code application logic here



        HashMap<Character, Integer> map = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        for(int i=0;i<s.length();i++){
            if(map.containsKey(s.charAt(i))){
                int tansuat = map.get(s.charAt(i));
                tansuat++;
                map.put(s.charAt(i), tansuat);
            }
            else{
                map.put(s.charAt(i), 1);
            }
        }
        for(HashMap.Entry<Character,Integer> entry : map.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
        
//        Comparator<String> cmp = new Comparator<String>() {
//        @Override
//        public int compare(String o1, String o2) {
//            return o1.length() - o2.length();
//        }
//        };
//        TreeMap<String, Integer> map2 = new TreeMap<>(cmp);
//        map2.put("abcd", 5);
//        map2.put("z", 3);
//        map2.put("yyyy", 4);
//        for(Map.Entry<String,Integer> entry : map2.entrySet()){
//            System.out.println(entry.);
//        }
    }
}
    
    