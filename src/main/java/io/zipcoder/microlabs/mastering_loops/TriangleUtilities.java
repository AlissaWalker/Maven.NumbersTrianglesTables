package io.zipcoder.microlabs.mastering_loops;

public class TriangleUtilities {

    public static String getTriangle(int numberOfRows) {
        String input =""; //place holder
        //create methods method that uses numb of rows instead of specfic  ones
        for(int i=1; i < numberOfRows ; i++ ){
            input = input + getRow(i);
            input = input +"\n";
        }
        return input;


    }

    public static String getRow(int numberOfStars) {
        String input ="";           // needed blank string because when the string was 1 it added an extra star to expected method
        //do for loop to go through the stars until it stops at the width enter
        for(int i=0; i< numberOfStars; i++){       // the for loop is used as a counter
             input  =input + "*";     // sets input = to a new value
                                                // the stars extend each time a star is counted
        }

        return input ;
    }



    public static String getSmallTriangle() {
        //base and height =4
        // "\n" ---> prints new line
        String input ="";

        for(int i=1; i < 5; i++ ){     // end for loop @ 5 because we want 4 lines 4<5
            input = input + getRow(i);
            input = input +"\n";
        }

        return input;
    }

    public static String getLargeTriangle() {
        String input ="";
        for(int i=1; i < 10; i++){ //stops at 11 because the read me says 10 is the ending point
            input= input + getRow(i);  // the i is the # that was given from the get row method
            input = input +  "\n";
        }
        return input; // there is a bug in test method; Had to change to i < 9 ;
    }
}
