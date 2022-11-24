import java.util.Scanner;

public class etkinlikOnerme {
    public static void main(String[] args) {
        int sicaklik;
        Scanner inp = new Scanner(System.in);
        System.out.println("Hava sıcaklığını giriniz: ");
        sicaklik = inp.nextInt();

        if(sicaklik < 5){
            System.out.println("Kayak yapabilirsiniz.");
        }
        else if(sicaklik >= 5 && sicaklik < 10){
            System.out.println("Sinemaya gidebilirsiniz.");
        }
        else if(sicaklik >= 10 && sicaklik < 15){
            System.out.println("Sinemaya gidebilirsiniz.");
            System.out.println("Pikniğe gidebilirsiniz.");
        } else if (sicaklik >= 15 && sicaklik <= 25) {
            System.out.println("Pikniğe gidebilirsiniz.");
        }
        else
            System.out.println("Yüzmeye gidebilirsiniz. ");
    }


}



