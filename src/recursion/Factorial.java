package recursion;

public class Factorial {
    //recursive
    public int findFactorialRecursive(int number){

        if(number == 1){
            return 1;
        }

        return number * findFactorialRecursive(number - 1);
    }
    //iterative
    public int findFactorialIterative(int number){
        int result = 1;
        for(int i=number; i > 0; i--){
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        Factorial factorial = new Factorial();

        System.out.println(factorial.findFactorialIterative(5));
        System.out.println(factorial.findFactorialRecursive(5));
    }
}
