/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package oppptit;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.TreeSet;

/**
 *
 * @author minh
 */
public class Set {

    /**
     * @param args the command line arguments
     */
    
    // add size contain remove addAll removeAll retainAll
    // LinkedHashSet  luu phan tu theo thu tu nhap vao 
    // TreeSet first last lower higher ceiling floor 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        HashSet<Integer> set = new HashSet<>();
//        set.add(5);
//        set.add(2);
//        set.add(10);
//        set.add(7);
//        for(Integer x:set){
//            System.out.print( x + " ");
//        }

//        LinkedHashSet<Integer> link = new LinkedHashSet<>();
//        link.add(4);
//        link.add(2);
//        link.add(1);
//        link.add(3);
//        for(int x:link){
//            System.out.print(x + " ");
//        }

          TreeSet<Integer> set = new TreeSet<>();
          int t = sc.nextInt();
          for(int i=1;i<=t;i++){
              set.add(sc.nextInt());
          }
          System.out.println(set.first()); // phantudautien
          System.out.println(set.last()); //phantucuoicung
          System.out.println(set.lower(5)); // tra ve phan tu lon nhat ma nho hon 5
          System.out.println(set.higher(5)); // tra ve phan tu nho nhat ma lon hon 5
          System.out.println(set.ceiling(5)); // tra ve phan tu nho nhat ma >= 5
          System.out.println(set.floor(5)); // tra ve pha tu lon nhat ma <= 5
          set.pollLast(); // xoa phan tu o cuoi
          set.pollFirst(); // xoa phan tu o dau
          System.out.println(set.headSet(6)); // in ra cac phan tu nho hon 6
          System.out.println(set.tailSet(6)); // in ra cac phan tu >= 6
        // TODO code application logic here
    }
    
}
