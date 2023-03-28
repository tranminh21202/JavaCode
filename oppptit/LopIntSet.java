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
class IntSet{
    private int[] a;

    public IntSet(int[] a) {
        this.a = a;
    }
    
    public int[] getA(){
        return a;
    }
    
    public IntSet union(IntSet a1){
        TreeSet<Integer> arr = new TreeSet<>();
        for(int x:a){
            arr.add(x);
        }
        for(int x:a1.getA()){
            arr.add(x);
        }
        int[] res = new int[arr.size()];
        int i=0;
        for(int x:arr){
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

public class LopIntSet {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt(), a[] = new int[n], b[] = new int[m];
        for(int i = 0; i<n; i++) a[i] = sc.nextInt();
        for(int i = 0; i<m; i++) b[i] = sc.nextInt();
        IntSet s1 = new IntSet(a);
        IntSet s2 = new IntSet(b);
        IntSet s3 = s1.union(s2);
        System.out.println(s3);
    }
    
}
