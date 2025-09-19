public class section {

    public static void main(String[] args){

        int switchValue= 3;

        switch (switchValue) {
            case 1 -> System.out.println("Value was 1");
            case 2 -> System.out.println("Value was 2");
            case 3, 4, 5 -> {
                System.out.println("Value was a 3, 4, or 5");
                System.out.println("It was actually " + switchValue);
            }
            default -> System.out.println("unkown");
        }
//        switch (switchValue){
//            case 1:
//                System.out.println("Value was 1");
//                break;
//            case 2:
//                System.out.println("Value was 2");
//                break;
//            case 3: case 4: case 5:
//                System.out.println("Value was a 3, 4, or 5");
//                System.out.println("It was actually "+ switchValue);
//                break;
//            default:
//                System.out.println("unkown");
//                break;
//        }

        String month = "XYZ";
        System.out.println(month + " is in the " + getQuarter(month) + "quarter");

    }


    public static String getQuarter(String month){
        return switch (month){
            case "January","February","March" -> "1st";
            case "April","May","June" -> "2nd";
            case "July","August","September" -> "3rd";
            case "October","November", "December" -> "4th";
            default -> {
                String badResponse = month + " is bad";
                yield badResponse;
            }
        };

    }




}
