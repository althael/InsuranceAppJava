package DiaxeirishAsfaleiwn;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ergasia1 {

    public static void main(String[] args) {
        int choice = 0;
        boolean run = true;
        String s = "";
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));//System.in =pliktrologio siskeui eisodou dedomenon,
        do {
            //console menu
            System.out.println("**********************************************************");
            System.out.println("** Insurance Application **");
            System.out.println("*Select Functionality to perform*");
            System.out.println("1.Vehicle Insurance Status");
            System.out.println("2.Forecoming Expiries");
            System.out.println("3.Expiries By Plate");
            System.out.println("4.Exit Program");
            System.out.println("Choose Between:1-4");
            System.out.println("**********************************************************");
            try {
                s = br.readLine();
                choice = Integer.parseInt(s); //Integer.parseInt dexetai san parametro ena string pou anaparista akeraio arithmo kai sou epistrefei integer
            } catch (Exception e) //to e einai antikeimeno tis taksis exception kai periexei tin perigrafi tou lathous pou egine otan pigan na treksoun oi entoles mesa stin try.
            {
                System.out.println(e.toString()); // H e.toString() mas epistrefei to string me to minima lathous
            }
            switch (choice) {
                case 1:
                    choosetype();
                    printStatus();
                    break;
                case 2:
                    choosetype();
                    printForecomingExp();
                    break;
                case 3:
                    choosetype();
                    printExpByDate();
                    break;
                case 4:
                    run = false;
                    System.exit(0);
                    break;
                default:
                    System.out.println(s);
                    break;
            }
        } while (run);

    }

    public static void printStatus() {
        System.out.println("//to do");
    }

    public static void printForecomingExp() {
        System.out.println("//to do");
    }

    public static void printExpByDate() {
        System.out.println("//to do");
    }

    public static int choosetype() {
        String s1 = "";
        int choice1 = 0;
        int typeExport = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));//System.in =pliktrologio siskeui eisodou dedomenon,
        System.out.println("Enter Export Type ");
        System.out.println("1. File");
        System.out.println("2. Console");
        try {
            s1 = br.readLine();
            choice1 = Integer.parseInt(s1); //Integer.parseInt dexetai san parametro ena string pou anaparista akeraio arithmo kai sou epistrefei integer
        } catch (Exception e) //to e einai antikeimeno tis taksis exception kai periexei tin perigrafi tou lathous pou egine otan pigan na treksoun oi entoles mesa stin try.
        {
            System.out.println(e.toString()); // H e.toString() mas epistrefei to string me to minima lathous
        }
        if (choice1 == 1) {
            typeExport = 1;
        } else if (choice1 == 2) {
            typeExport = 2;
        } else {
            System.out.println("you made a mistake, type 1 or 2 ");
        }
        return typeExport;
    }

}
