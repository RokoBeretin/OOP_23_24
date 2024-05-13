package primjervjezbA;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean provod = true;
        int a = AUX_CLS.generateRandomNumber(1,99);
        System.out.println(a);
        int cnt = 0;
        List<Integer> brojPogodaka = new ArrayList<>();
        while (provod){
            cnt++;
            System.out.println("Pogodi broj!: ");
            int pogodak;
            pogodak = sc.nextInt();
            if (pogodak<a){
                System.out.println("Unjeli ste broj koji je manji od pogodka!");
            } else if (pogodak>a) {
                System.out.println("Unjeli ste broj koji je veci od pogotka!");

            } else {
                System.out.println("Pogodili ste broj: " + a + " u " + cnt + " broj puta");
                brojPogodaka.add(cnt);
                System.out.println("Unesite bilo koji broj za nastavak - u suprotnom igra se zavrsava!");
                if(sc.hasNextInt()){
                    System.out.println("Nastavlja se igra!");
                    a = AUX_CLS.generateRandomNumber(1, 99);
                } else {
                    System.out.println("Igra se gasi!");
                    provod = false;
                    sc.close();
                }
            }
        }
        System.out.println(brojPogodaka);

    }
}
