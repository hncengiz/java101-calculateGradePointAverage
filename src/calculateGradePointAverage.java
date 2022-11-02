
    import java.util.Scanner;

    public class calculateGradePointAverage {
        public static void  main(String[] args){

            // Declare math, physic, chemistry, turkish, history, music as int variables
            int math, physic, chemistry, turkish, history, music;

            // create a new object
            Scanner input = new Scanner (System.in);


            // prompt the user to input integers for all variables respectively
            System.out.print( " Enter Math grade : ");
            math = input.nextInt();

            System.out.print( " Enter Physic grade : ");
            physic = input.nextInt();

            System.out.print( " Enter Chemistry grade : " );
            chemistry = input.nextInt();

            System.out.print( " Enter Turkish grade : ");
            turkish = input.nextInt();

            System.out.print(" Enter History grade : ");
            history = input.nextInt ();

            System.out.print( " Enter Music grade : ");
            music = input.nextInt();

        /* calculate grade point average by adding up all accumulated grades and
           dividing that figure by the number of grades awarded.
         */

            int total = ( math + physic + chemistry + turkish + history + music );
            double result = total / 6.0;

            // Display result
            System.out.println( " Grade Point Average : " + result );

            // Display : Is student passed or failed?
            boolean result2 = result >= 60 ;
            String str = result2 ? " Passed " : " Failed ";

            // Display result2
            System.out.println(str);

        }

    }
