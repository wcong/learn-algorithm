package org.wcong.algorithm.ctci.hard;

/**
 * 231452
 *
 * @author wcong<wc19920415@gmail.com>
 * @since 2018/6/15
 */
public class NumberOfTwos {


    public int numbersOfTwos(int number) {
        int origin = number;
        int sum = 0;
        int power = 0;
        while (number > 0) {
            int modular = number % 10;
            if (modular < 2) {
                sum += numberOf2(power);
            } else if (modular == 2) {
                sum += numberOf2(power);
                sum += origin % Math.pow(10, power);
            } else {
                int powerNumber = numberOf2(power);
                for (int i = 0; i <= modular; i++) {
                    sum += powerNumber;
                }
                sum += Math.pow(10, power);
            }
            number /= 10;
            power += 1;
        }
        return sum;
    }

    private int numberOf2(int power) {
        int sum = 0;
        for (int i = 1; i <= power; i++) {
            sum += sum * 10;
            sum += Math.pow(10, i - 1);
        }
        return sum;
    }


}
