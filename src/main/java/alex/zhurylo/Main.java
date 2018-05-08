package alex.zhurylo;

public class Main {
    public static void main(String[] args) {
        long firstNumber = 100000;
        long secondNumber;
        lab1:
        for (long i1 = firstNumber; i1 > 10000; i1--) {
            firstNumber--;
            secondNumber = firstNumber;
            for (long i = secondNumber; i > 10000; i--) {
                long result = firstNumber * secondNumber;
                String str = Long.toString(result);
                String reverse = new StringBuffer(str).reverse().toString();
                if (str.equals(reverse)) {
                    System.out.println("Полиндромное число : " + result);
                    System.out.println("Первый множитель : " + firstNumber);
                    System.out.println("Второй множитель : " + secondNumber);
                    break lab1;
                } else {
                    secondNumber--;
                }
            }
        }
    }
}
