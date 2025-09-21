import java.util.Scanner;

public class parcing71 {

    public static void main(String[] args){

//        int currentYear = 2025;
//        String usersDateOfBirth = "1999";
//        int dateOfBirth = Integer.parseInt(usersDateOfBirth);
//        System.out.println("Age= "+(currentYear- dateOfBirth));
//
//        String aaa = "22.5";
//        double bbb = Double.parseDouble(aaa);
//        System.out.println(bbb);
//
//        try{
//            System.out.println(getInputFormConsole(currentYear));
//        }catch (NullPointerException e){
//            System.out.println(getInputFromScanner(currentYear));
//        }

        checkNumbers();

    }


    public static String getInputFormConsole(int currentYear){
        String name = System.console().readLine("Him what's your Name?");
        System.out.println("Hi "+ name + ", Thanks for taking the curse!");
        return "";
    }

    public static String getInputFromScanner(int currentYear){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hi, What's your Name");
        String name = scanner.nextLine();
        System.out.println("Hi "+ name + ", Thanks for taking the curse!");
        System.out.println("What year were you born?");
        boolean validDOB = false;
        int age = 0;
        do {
            System.out.println("Enter a year of birth >= " +(currentYear-125)+" and <= "+(currentYear));;

            try{
                age = checkData(currentYear,scanner.nextLine());
                validDOB = age < 0 ? false:true;
            }catch (NumberFormatException badUserData){
                System.out.println("Characters not allowed!!! Try again.");
            }


        }while (!validDOB);


      return "So you are " + age + " years old";
    }


    public static int checkData(int currentYear, String deteOfBirth){
        int dob= Integer.parseInt(deteOfBirth);
        int minimumYear= currentYear-125;

        if((dob < minimumYear)|| (dob>currentYear)){
            return -1;
        }

        return currentYear-dob;

    }


    public static void checkNumbers(){
        Scanner scanner = new Scanner(System.in);
        int sum =0;
        int round=0;

        do {
            if(round ==5)continue;
            System.out.println("Enter number #"+(round+1));
            String inputNum = scanner.nextLine();

            try {
                int intNum = Integer.parseInt(inputNum);
                sum+= intNum;
                round= round+1;
            }catch(NumberFormatException dadInput){
                System.out.println("You typed invalid number!!");
            }

        }while (round <5);

        System.out.println("Total sum is "+sum);
    }

}
