
package deneme;
import java.util.Scanner;
public class Deneme {

    
    public static void main(String[] args) {
    Scanner k=new Scanner(System.in);
        System.out.println("İSMİNİZİ GİRİNİZ");
        String isim=k.nextLine();
        String a="anne";
        if(isim.equals(a)) {
            System.out.println("annelerin hepsi guzeldir");
          
        }
        else {              
    int max=100;
    int min=10;
    int guzellik=(int)Math.floor(Math.random()*(max-min+1)+min);
        System.out.println("yuzde "+guzellik+" guzelsiniz");
    }
    
}
}
