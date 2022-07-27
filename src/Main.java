import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double armut,perArmut,elma,perElma,domates,perDomates,muz,perMuz,patlican,perPatlican,toplam;

        System.out.print("Armut Kac Kilo: ");
        perArmut = input.nextDouble();
        System.out.print("Elma Kac Kilo: ");
        perElma = input.nextDouble();
        System.out.print("Domates Kac Kilo: ");
        perDomates = input.nextDouble();
        System.out.print("Muz Kac Kilo: ");
        perMuz = input.nextDouble();
        System.out.print("Patlican Kac Kilo: ");
        perPatlican = input.nextDouble();

        armut = perArmut * 2.14;
        elma = perElma * 3.67;
        domates = perDomates * 1.11;
        muz = perMuz * 0.95;
        patlican = perPatlican * 5.00;

        toplam = armut+elma+domates+muz+patlican;

        System.out.print("Toplam Tutar: " + toplam);
    }
}
