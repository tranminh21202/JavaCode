/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit;
import java.util.*;
/**
 *
 * @author minh
 */
public class TongUocSo_1 {
    public static long[] a = new long[2000001];
    
    public static void Snt(){
        for(int i=2;i<2000001;i++){
            if(a[i]==0){
                for(int j=i;j<2000001;j+=i){
                    a[j] = i;
                }
            }
        }
    }
    
    public static void main(String[] args) {
        Snt();
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        long tong = 0;
        for(int i=1;i<=t;i++){
            int n = sc.nextInt();
            while(n>1){
                tong += a[n];
                n /= a[n];
            }
        }
        System.out.println(tong);
    }
}
