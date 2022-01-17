import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Sayı Tahmin Oyununa Hoşgeldiniz! ");
        Random random = new Random();
        int num = random.nextInt(100);
        System.out.println(num);
        int right = 5;
        boolean isWin = false;
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        System.out.println("1'den 100'e kadar bir sayı girilebilir.");
        do{
            count++;
            System.out.print("Tahmininizi Girin : ");
            int tahmin = scanner.nextInt();
            if(tahmin == num){
                isWin = true;
                System.out.println("Tebrikler! " + count +
                        ". hakkınızda bildiniz. ");
                break;
            }else if(tahmin < num){
                System.out.println("Üzgünüm! " + (right-1) +
                        " hakkınız kaldı.");
                System.out.println("Girdiğiniz sayıyı arttırın");
            }else if(tahmin > num){
                System.out.println("Üzgünüm! " + (right-1) +
                        " hakkınız kaldı.");
                System.out.println("Girdiğiniz sayıyı azaltın");
            }
        }while(--right > 0);
        if(!isWin){
            System.out.println("Üzgünüm! Oyun Bitti. Maalesef Kazanamadınız.");
        }
    }
}
