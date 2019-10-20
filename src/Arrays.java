import java.util.Scanner;

    public class Arrays {

        public static void main(String[] args) {

            String[] mynames = {"david", "Eric", "Jose", "Mustapha",
                    "Kevin", "Melissa", "Rodolfo", "Peter", "Efrem", "John"};


            String renault = "I'm shocked, shocked to find that gambling is going on in here!";
            String renault2;

            int pos1, pos2;
            int pos1len = renault.length();
            String newword = "shocked";  // Search word

            pos1 = renault.indexOf("shocked");  // Find the 1st occurance
            newword = newword.toUpperCase();
            pos2 = pos1 + newword.length();

            renault2 = renault.substring(0,pos1)+newword+renault.substring(pos2);

            System.out.println("Original:\n"+renault+"\n");
            System.out.println("New word:\n"+renault2);
            System.out.println();



            int i;
            int size = mynames.length;  // Return the value of 10
            for (i = 0; size > i; i++) {

                // i=0 ,  test 10 > 0 ==> true
                // i=9,  test 10 > 9 ==> true
                // i=10,  test 10 > 10 ==> false

                System.out.println(mynames[i]);
            }
            //mynames = new String[10];
            //String name;


            //Scanner inputDevice = new Scanner(System.in);
// mynames[i] = inputDevice.nextLine();
            // for (i = 0; i < mynames.length; i++) {
            //  System.out.println(i+") Please enter your name >> ");
            // mynames[i] = inputDevice.nextLine();
            //  }

            // Print the list of names
            //System.out.println("\nName list\n=================\n");
            // ConsoleWrite("")
            //for (i = mynames.length-1; i>=0 ;i--) {

            //System.out.println(i+") "+mynames[i]);
            //System.out.println("Lenght of array is: " + length);

            //}
        /*
         i = mynames.length;
         while (i != 0) {
            System.out.println(mynames[i]);
            i--;
        }

         */
            // for (start; condition; incr) { statements }
            // while (condition) { statements }
            // do {  statements  } while (condition)

            // 9; 9<9 = False ; i=9-1
            //  ; 8<9 = True ; i=8-1
            //  ; 7<9 = True ; i=7-1

        }
    }

