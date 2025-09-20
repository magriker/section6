public class forLoop {

    public static void main(String[] args){
        for(int counter = 1; counter <= 5;counter++){
            System.out.println(counter);

        }

        for (double rate =7.5; rate<=10; rate +=0.25){
            double interestAmount = calculateInterest(100,rate);
            if (interestAmount > 8.5){
                break;
            }

            System.out.println("10,000 at "+ rate+ "% interest = " + interestAmount);

        }
        int counter=0;
        int sumNum=0;
        for(int i = 1;counter< 5 && i <= 1000;i++ ){
            if((i%3==0) && (i%5==0)){
                counter ++;
                sumNum = sumNum +i;
                System.out.println(i);
            }

        }
        System.out.println(sumNum);

        int number = 0;
        while(number < 50){
            number+=5;
            if (number % 25 == 0){
                continue;
            }
            System.out.println(number+"_");
        }

        System.out.println(sumDigits(-10));



    }

    public static double calculateInterest(double amount, double interestRate){
        return (amount * (interestRate /100));
    }


    public static int sumDigits(int number){
        if(number<0)return-1;
        if(number<10)return number;
        int num = number;
        int sum = 0;

        while (num > 0) {
            sum += num % 10;
            num = num/10;
        }

        return sum;

    }




}
