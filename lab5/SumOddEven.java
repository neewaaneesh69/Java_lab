package lab5;


public class SumOddEven {
    public static void main(String[] args){
        int sumEven = 0;
        int sumOdd = 0;
        int i =0;
       for(i = 1; i<=100; i++){
        if(i % 2 == 0){
            sumEven += i;
        }else{
            sumOdd += i;
        }
       
       }
       System.out.println("Sum of even numbers:" + sumEven);
       System.out.println("Sum of odd numbers:" + sumOdd);
    }
}
