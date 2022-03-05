package io.zipcoder.microlabs.mastering_loops;


public class NumberUtilities {
    public static String getEvenNumbers(int start, int stop) {
        String result = "";
        for (int i = start; i < stop; i++) {
            if (i % 2 == 0) {
                result = result + i;
            }


        }
        return result;
    }


    public static String getOddNumbers(int start, int stop) {
        String result = "";
        for (int i = start; i < stop; i++) {
            if (i % 2 != 0) {
                result = result + i;
            }


        }
        return result;
    }


    public static String getSquareNumbers(int start, int stop, int step) {



       return NumberUtilities.getExponentiations( start, stop, step ,2);
    }

    public static String getRange(int stop) {
        return NumberUtilities.getRange(0,stop );
    }

    public static String getRange(int start, int stop) {
        return NumberUtilities.getRange(start, stop,1);

    }


    public static String getRange(int start, int stop, int step) {
// range = start - stop // step hasnt been defined
        String result = "";
        for (  int i = start ;  i  < stop ; i = i + step ){
             result =  result + i ;
        }
      return result;
    }


    public static String getExponentiations(int start, int stop, int step, int exponent) {
        String result= "";
        for(int i= start; i < stop; i= i+ step ){
            result = result+ Math.round((Math.pow(i,exponent)));
        }
        return result;

    }
}
