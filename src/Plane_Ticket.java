import java.util.Scanner;
public class Plane_Ticket {
    public static void main (String[] args) {
        int yas, yolcuTipi;
        double km, formul, indirimlitutar, indirimlitutar1, gidisdonus, yasindirimi, toplamucret, cocuk = 0.50, genc = 0.10, yasli = 0.30, yolculuk = 0.20;

        Scanner input = new Scanner(System.in);

        System.out.print("Mesafenizi Giriniz : ");
        km = input.nextDouble();

        System.out.print("Yaşınızı Giriniz : ");
        yas = input.nextInt();

        System.out.print("Tek Yön => 1 Gidiş Dönüş => 2 : ");
        yolcuTipi = input.nextInt();

        formul = ( km*0.10 );

        if (yolcuTipi == 1 && yas>= 1 && km >= 1){
            if (yas < 12){
                yasindirimi = (formul*cocuk);
                indirimlitutar = (formul - yasindirimi);
                System.out.println("Ücretiniz : " + indirimlitutar);
            } else if (yas >= 12 && yas <= 24) {
                yasindirimi = (formul*genc);
                indirimlitutar = (formul - yasindirimi);
                System.out.println("Ücretiniz : " + indirimlitutar);
            } else if (yas > 65) {
                yasindirimi = (formul*yasli);
                indirimlitutar = (formul - yasindirimi);
                System.out.println("Ücretiniz : " + indirimlitutar);
            }else{
                toplamucret = formul;
                System.out.println("Ücretiniz : " + toplamucret);
            }

        }if (yolcuTipi == 2 && yas >= 1 && km >= 1){
            if (yas < 12){
                yasindirimi = (formul*cocuk);
                indirimlitutar = (formul - yasindirimi);
                indirimlitutar1 = (indirimlitutar * 0.20);
                gidisdonus = (indirimlitutar - indirimlitutar1)*2;
                System.out.println("Ücretiniz : " + gidisdonus);
            } else if (yas >=12 && yas <= 24) {
                yasindirimi = (formul*genc);
                indirimlitutar = (formul - yasindirimi);
                indirimlitutar1 = (indirimlitutar * 0.20);
                gidisdonus = (indirimlitutar - indirimlitutar1)*2;
                System.out.println("Ücretiniz : " + gidisdonus);
            } else if (yas > 65) {
                yasindirimi = (formul*yasli);
                indirimlitutar = (formul - yasindirimi);
                indirimlitutar1 = (indirimlitutar * 0.20);
                gidisdonus = (indirimlitutar - indirimlitutar1)*2;
                System.out.println("Ücretiniz : " + gidisdonus);
            }else{
                toplamucret = formul;
                indirimlitutar1 = toplamucret - (toplamucret*yolculuk);
                System.out.println("Ücretiniz : " + indirimlitutar1);
            }
        }else{
            System.out.println("Hatalı Bir Giriş Yaptınız");
        }
    }
}
