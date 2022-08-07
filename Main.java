import java.util.Scanner;

public class Main {
    public static void main(String Args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen adınızı giriniz");
        String isim = input.nextLine();
        System.out.println("Lütfen soyadınızı giriniz");
        String soyadi = input.nextLine();
        System.out.println("Lütfen quiz notunuzu giriniz");
        int quiz = input.nextInt();
        System.out.println("Lütfen vize notunuzu giriniz");
        int vize = input.nextInt();
        System.out.println("Lütfen final notunuzu giriniz");
        int finalnotu = input.nextInt();
        double notOrtalamasi;
        notOrtalamasi=(quiz*0.10)+(vize*0.3)+(finalnotu*0.6);

        if(notOrtalamasi>=85){
            System.out.println("Sayın " + isim + " " + soyadi + " not ortalamanız AA");
            System.out.println("Sınıfı geçtiniz");
        } else if (notOrtalamasi<85 && notOrtalamasi>=70) {
            System.out.println("Sayın " + isim + " " + soyadi + " not ortalamanız BB");
            System.out.println("Sınıfı geçtiniz");
        } else if (notOrtalamasi<70 && notOrtalamasi>=60){
            System.out.println("Sayın " + isim + " " + soyadi + " not ortalamanız CC");
            System.out.println("Sınıfı geçtiniz");
        } else if (notOrtalamasi <60 && notOrtalamasi>=45) {
            System.out.println("Sayın " + isim + " " + soyadi + " not ortalamanız DD");
            System.out.println("Sınıfı geçtiniz");
        }else{
            System.out.println("Sayın " + isim + " " + soyadi + " not ortalamanız FF");
            System.out.println("Sınıfta kaldınız");
        }
    }
}


