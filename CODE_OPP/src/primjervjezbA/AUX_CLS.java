package primjervjezbA;

import java.util.Random;

public class AUX_CLS {
    public static int generateRandomNumber(int min, int max) {
        Random rand = new Random();
        return rand.nextInt((max - min) + 1) + min;
    }
}
