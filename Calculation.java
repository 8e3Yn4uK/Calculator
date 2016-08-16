package Calc;



/**
 * Created by 1nsomnia on 14-Aug-16.
 */
public class Calculation {
    public static double calc(double d1, String zn, double d2) {

            double res = 0;
            try {
            if (zn.equals("+")) {
                res = d1 + d2;
            } else if (zn.equals("-")) {
                res = d1 - d2;
            } else if (zn.equals("*")) {
                res = d1 * d2;
            } else if (zn.equals("/")) {
                res = d1 / d2;
            } else throw new Exception();

        } catch (Exception e) {
            System.out.println("Wrong operation character ");
            }
        return res;
    }

}

