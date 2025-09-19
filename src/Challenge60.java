public class Challenge60 {

    public static void main(String[] args){
    System.out.println(getDate(5));
    }


    public static String getDate(int num){

        int value = num;

        return switch (value){
            case 0 -> "Monday";
            case 1 -> "Tuesday";
            case 2 -> "Wednesday";
            case 3 -> "Thurstay";
            case 4 -> "Friday";
            case 5 -> "Saturday";
            case 6 -> "Sunday";
            default -> "Incalid Day";
        };

    }




}
