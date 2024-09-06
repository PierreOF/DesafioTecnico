public class ExerciciosTecnicos {

    // 1º questão
    public static boolean fibonacci(int num) {
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

    // 2º Questão
    public static int contarLetraA(String str) {
        int contador = 0;
        for (char c : str.toCharArray()) {
            if (c == 'a' || c == 'A') {
                contador++;
            }
        }
        return contador;
    }

    // 3º Questão
    public static int iterar(){
        int indice = 12;
        int soma = 0;
        int k = 1;

        while(k < indice) {
            k++;
            soma = soma + k;
            System.out.println(soma);
        }
        return soma;
    }

    // Testando as funções em sequência
    public static void main(String[] args) {

        // 1º Questão
        int num = 2;
        if (fibonacci(num)) {
            System.out.println("o número " + num + " pertence a sequência de Fibonacci.");
        } else {
            System.out.println("o número " + num + " NÃO pertence a sequência de Fibonacci.");
        }

        // 2º Questão
        String string = "AAAAAaaaaa...";

        int contador = contarLetraA(string);
        if (contador > 0) {
            System.out.println("A letra 'a' ou 'A' ocorre " + contador + " vezes na string.");
        } else {
            System.out.println("A letra 'a' ou 'A' não ocorre na string.");
        }

        // 3º Questão
        System.out.println("ao final da iteração o valor da variável 'soma' será igual a " + iterar());

    }
}

// 4º Questão

// A sequência é de números ímpares em ordem crescente
  //   a) 1, 3, 5, 7, 9
// A sequência é de potências de 2
  //   b) 2, 4, 8, 16, 32, 64, 128
// A sequência é de quadrados perfeitos
  //   c) 0, 1, 4, 9, 16, 25, 36, 49
// A sequência é de números quadrados multiplicados por 4
  //   d) 4, 16, 36, 64, 100
// A sequência é de Fibonacci.
  //   e) 1, 1, 2, 3, 5, 8, 13
//  A sequência segue os números iniciando a partir de 10, omitindo o número 11 e pulando de 16 para 17 e depois continua.
  //   f) 2, 10, 12, 16, 17, 18, 19, 20

// 5º Questão

// Ligue um dos interruptores e espere um pouco.
// Desligue e ligue um segundo interruptor. Vá até a sala.
// A lâmpada desligada e quente corresponde ao primeiro interruptor, a lâmpada acesa ao segundo e a lâmpada apagada e fria ao terceiro.
