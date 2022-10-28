/*
 *  To run the code, you must have java installed
    Go to: https://www.oracle.com/java/technologies/downloads
    Once installed, open your terminal and type:
        `java fizzbuzz.java`
    
    Make sure you are in the java folder so that the
     code file can be found
 */

public class fizzbuzz {

    public static void main(String[] args) {
        int lower = 0;
        int upper = 100;

        int fizz = 1;
        int buzz = 2;

        for (int i = lower; i <= upper; i++){
            boolean isFizz = i % fizz == 0;
            boolean isBuzz = i % buzz == 0;

            if(isFizz && isBuzz){
                System.out.println("fizzbuzz");
            } else if(isFizz){
                System.out.println("fizz");
            } else if(isBuzz) {
                System.out.println("buzz");
            } else {
                System.out.println(i);
            }
        }


    }

}