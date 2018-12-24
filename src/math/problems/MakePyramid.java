package math.problems;

public class MakePyramid {
    public static void main(String[] args) {

        /*   Implement a large Pyramid of stars in the screen with java.

                              *
                             * *
                            * * *
                           * * * *
                          * * * * *
                         * * * * * *

        */

       for(int i=0;i<10;i++) {  // took 10 numbers for the size of the pyramid
                    for(int j=0;j<10-i;j++) {
                        System.out.print(" ");
                    }

                    for (int k=0;k<=i;k++) {
                        System.out.print("* ");
                    }
                    System.out.println();
                }


            }
        }




