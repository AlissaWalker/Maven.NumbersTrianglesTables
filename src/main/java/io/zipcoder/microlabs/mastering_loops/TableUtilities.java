package io.zipcoder.microlabs.mastering_loops;

public class TableUtilities {
    public static String getSmallMultiplicationTable() {
        return TableUtilities.getMultiplicationTable(5);// set table size to 5 because test is 5 * 5

    }

    public static String getLargeMultiplicationTable() {
        return TableUtilities.getMultiplicationTable(10); // set table size to 10 because test is 10 * 10
    }

    public static String getMultiplicationTable(int tableSize) {
        String result ="";
        StringBuilder sb= new StringBuilder();
        for(int i= 1; i <= tableSize; i++) {
           for (int j =1; j<= tableSize; j++) {
               sb.append(String.format("%3d |", i*j ));
           }
           sb.append("\n");
           }
        result= sb.toString() ;
        return  result;
    }
}

