
package ortalamahesaplama;
import java.util.Scanner;
public class OrtalamaHesaplama {

    public static void main(String[] args) {
    Scanner k = new Scanner(System.in);
    System.out.println("Üç sayı giriniz:");
    double sayi1=k.nextDouble();
    double sayi2=k.nextDouble();
    double sayi3=k.nextDouble();
    
    double ortalama=(sayi1+sayi2+sayi3)/3;
    System.out.println(sayi1+" "+ sayi2+" "+sayi3+" "+ "ortalaması"+ortalama);
    
    
    }
    
}
