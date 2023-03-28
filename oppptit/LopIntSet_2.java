/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package oppptit;
import java.util.*;
import java.io.*;
/**
 *
 * @author minh
 */
class IntSet{
    private int[] a;

    public IntSet(int[] a) {
        this.a = a;
    }
    
    public int[] getA(){
        return a;
    }
    
    public IntSet intersection(IntSet a1){
        TreeSet<Integer> arr1 = new TreeSet<>();
        TreeSet<Integer> arr2 = new TreeSet<>();
        ArrayList<Integer> list = new ArrayList<>();
        for(int x:a){
            arr1.add(x);
        }
        for(Integer x:a1.getA()){
            arr2.add(x);
        }
        for(Integer x:arr1){
            if(arr2.contains(x)){
                list.add(x);
            }
        }
        int[] res = new int[list.size()];
        int i=0;
        for(Integer x:list){
            res[i++] = x;
        }
        return new IntSet(res);
    }
    
    @Override
    public String toString(){
        String s="";
        for(int x:a){
            s += String.valueOf(x) + " ";
        }
        return s;
    }
}

public class LopIntSet_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("DATA.in"));
        int n = sc.nextInt(), m = sc.nextInt(), a[] = new int[n], b[] = new int[m];
        for(int i = 0; i<n; i++) a[i] = sc.nextInt();
        for(int i = 0; i<m; i++) b[i] = sc.nextInt();
        IntSet s1 = new IntSet(a);
        IntSet s2 = new IntSet(b);
        IntSet s3 = s1.intersection(s2);
        System.out.println(s3);
    }
    
}
