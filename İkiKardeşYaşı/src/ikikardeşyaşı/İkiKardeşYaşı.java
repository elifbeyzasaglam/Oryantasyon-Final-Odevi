
package ikikardeşyaşı;
import java.util.Scanner;
public class İkiKardeşYaşı {

    public static void main(String[] args) {
    Scanner k =new Scanner(System.in);
    System.out.println("iki kardeşin yaşlarını giriniz:");
    double kardes1=k.nextDouble();
    double kardes2=k.nextDouble();
    
    double top;
    top=kardes1+kardes2;
    System.out.println("Yaşları toplamı:"+top);
    
    double ortalama;
    ortalama=(kardes1+kardes2)/2;
    System.out.println("Yaşları ortalaması:"+ortalama);
    }
    
}
