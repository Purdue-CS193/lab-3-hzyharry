public class MathUtils {
    /**
     * divideNumbers -- a / b
     * Divide a by b and return the result
     */
    public static double divideNumbers(double dividend, double divisor) {
        /* Do some casual division ... Super easy ... Shouldn't be any problems here */
        double res = dividend / divisor;
        /* Return the DEFINITELY CORRECT result */
        double ress=(double)(Math.round(res*100000000)/100000000.0);
        return ress;
    }

    /**
     * raiseToPower -- (base)^(exp)
     * Raise the number base to power exp
     */
    public static double raiseToPower(int base, int exp) {
        /* Set initial result to be just the number */
        int res = base;

        /* Determine if the exponent is negative */
        boolean isNegative = false;
        if (exp < 0) {
            exp *= -1;
            isNegative = true;
        }

        /* Multiply the result by the base exp times
            Ex: base = 2, exp = 2
               --> res = 2, then res = 4 */


        /* If it's a negative exponent, we should invert it! */
        if (isNegative) {
            double dividedRes = Math.pow(base, exp);
            dividedRes=1.0/dividedRes;
            return dividedRes;
        }
        /* Otherwise, we are safe to just return the result */
        else if (base==0) {
            res=0;
            return res;
        }

        else {
            for (int i = 0; i < exp-1; i++) {
            res *= base;
        }
            return res;
        }
    }    
}