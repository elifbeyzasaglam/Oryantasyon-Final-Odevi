package asalsayıdemo;
import java.util.Scanner;
public class AsalSayıDemo {

    public static void main(String[]args){
        Scanner k =new Scanner(System.in);
   int sayi=k.nextInt();
   for(int a=2; a<sayi; a++){
    if(sayi%a==0){
    System.out.println("Asal değil");
    break;
     }
    System.out.println("Asaldır");
    break;
   }        

    }
    
}
