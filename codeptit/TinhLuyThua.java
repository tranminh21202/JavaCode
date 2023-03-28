/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package codeptit;
import java.util.*;
/**
 *
 * @author minh
 */
public class TinhLuyThua {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            long a = sc.nextLong();
            long b = sc.nextLong();
            if(a==0 && b==0) break;
            System.out.println(pow(a,b));
        }
        // TODO code application logic here
    }
    
    public static long pow(long a, long b){
        int M = 1000000007;
        if(b==0) return 1;
        long x = pow(a,b/2);
        if(b%2==0) return x*x%M;
        return a*(x*x%M)%M;
    }
    
}
