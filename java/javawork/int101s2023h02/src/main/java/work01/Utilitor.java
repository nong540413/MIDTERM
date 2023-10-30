package work01;



public class Utilitor {
    public static String testString(String value){
    if(value == null)throw new NullPointerException();
    if(value.isBlank()) throw  new IllegalArgumentException();
        return value;
    }

    public static double testPositive(double value){
        if (value <= 0.00 )throw new IllegalArgumentException();
            return value;
    }

    public static long computeIsbn10(long isbn10){

        int sum = 0;
        long digit = isbn10;

        for(int mod = 2;mod < 11;mod++){
            digit = digit / 10;
            sum += (digit % 10) * mod;

        }
       sum %=11;
       if(sum == 0){
        isbn10 = isbn10 - (isbn10 % 10);

        return isbn10;
       }
       sum = 11 - sum;
       isbn10 = isbn10 - (isbn10 % 10);
       isbn10 += sum;

       return isbn10;
    }


}
