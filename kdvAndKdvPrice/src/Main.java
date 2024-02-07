import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //Java ile kullanıcıdan alınan para değerinin KDV'li fiyatını ve KDV tutarını hesaplayıp ekrana bastıran programı yazın.
        //(100 * 1.8) / 100
        Scanner input = new Scanner(System.in);
        System.out.print("Para miktarı giriniz : ");
        int paraMikt = input.nextInt();
        double kdv = paraMikt >= 1000 ? 0.08 : 0.18;
        double kdvli = paraMikt + (paraMikt * kdv);
        System.out.println("KDV'li miktar : "+kdvli);
        System.out.println("KDV miktarı   : "+(paraMikt * kdv));







    }
}