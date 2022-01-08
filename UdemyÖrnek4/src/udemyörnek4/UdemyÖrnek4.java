package udemyörnek4;
 
public class UdemyÖrnek4 {

    public static void main(String[] args) {
     char grade='D';
     switch (grade)  {
        case 'A' :
        System.out.println("Mükemmel,Geçtiniz");
        break;
        case'B' :
        System.out.println("Çok güzel , geçtiniz");
        break;
        case'C' :
        System.out.println("iyi geçtiniz");
        break;
        case'D':
        System.out.println("Fena değil, Geçtiniz");
        break;
        case'F':
        System.out.println("Maalesef Kaldınız");
        break;
        default:
        System.out.println("Geçersiz not girdiniz");
        
        
        
    }
    }
    
}
