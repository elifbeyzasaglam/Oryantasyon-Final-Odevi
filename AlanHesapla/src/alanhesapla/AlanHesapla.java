
package alanhesapla;
import java.util.Scanner;
public class AlanHesapla {

    public static void main(String[] args) {
    Scanner k=new Scanner(System.in);
    System.out.println("Lutfen capi giriniz");
    int cap=k.nextInt();
    
    if (cap<0){
    System.out.println("Yanlış giriş");
    }
    else{
    double alan=cap*cap*3.14159;
    System.out.println("Alan:"+alan);
    }
    
    
    }
    
}
