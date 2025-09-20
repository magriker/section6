import java.util.Scanner;

public class parcing71 {

    public static void main(String[] args){

        int currentYear = 2025;
        String usersDateOfBirth = "1999";
        int dateOfBirth = Integer.parseInt(usersDateOfBirth);
        System.out.println("Age= "+(currentYear- dateOfBirth));

        String aaa = "22.5";
        double bbb = Double.parseDouble(aaa);
        System.out.println(bbb);

        try{
            System.out.println(getInputFormConsole(currentYear));
        }catch (NullPointerException e){
            System.out.println(getInputFromScanner(currentYear));
        }

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
        String dateOfBirth =  scanner.nextLine();
        int age = currentYear-Integer.parseInt(dateOfBirth);
      return "So you are " + age + " years old";
    }

}
