public class SequenciaFibonacci {
    public static boolean isFibonacci(int num) {
        int a = 0, b = 1, c;
        if (num == a || num == b) return true;
        while (true) {
            c = a + b;
            if (c == num) return true;
            if (c > num) return false;
            a = b;
            b = c;
        }
    }

    public static void main(String[] args) {

        int num = 2;

        if (isFibonacci(num)) {
            System.out.println("o número" + num + " pertence a sequência de Fibonacci.");
        } else {
            System.out.println("o número" + num + " NÃO pertence a sequência de Fibonacci.");
        }
    }

}
