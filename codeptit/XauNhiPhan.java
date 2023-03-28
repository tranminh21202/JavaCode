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
public class XauNhiPhan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long[] f = new long[93];
        f[0] = 0;
        f[1] = 1;
        for(int i=2;i<=92;i++){
            f[i] = f[i-2] + f[i-1];
        }
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            long k = sc.nextLong();
            System.out.println(fibo(n,k,f));
        }
        // TODO code application logic here
    }
    
    public static char fibo(int n, long k, long[] f){
        if(n==1) return '0';
        if(n==2) return '1';
        if(k <= f[n-2]) return fibo(n-2,k,f);
        return fibo(n-1,k-f[n-2],f);
    }
    
}
