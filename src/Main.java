import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double armut=2.14,elma=3.67,domates=1.11,muz=0.95,patlican=5.00;
        double armutKilo,elmaKilo,domatesKilo,muzKilo,patlicanKilo,toplamTutar;
        Scanner girdi = new Scanner(System.in);
        System.out.print("Armut Kaç Kilo : ");
        armutKilo = girdi.nextDouble();
        System.out.print("Elma Kaç Kilo : ");
        elmaKilo = girdi.nextDouble();
        System.out.print("Domates Kaç Kilo : ");
        domatesKilo = girdi.nextDouble();
        System.out.print("Muz Kaç Kilo : ");
        muzKilo = girdi.nextDouble();
        System.out.print("Patlican Kaç Kilo : ");
        patlicanKilo = girdi.nextDouble();
        toplamTutar = (armutKilo*armut)+(elmaKilo*elma)+(domatesKilo*domates)+(muzKilo*muz)+(patlicanKilo*patlican);
        System.out.println("Toplam Tutar : "+toplamTutar+" TL");


    }
}
