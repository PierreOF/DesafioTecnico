public class VariavelSoma {

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

    public static void main(String[] args) {
        System.out.println("ao final da iteração o valor da variável 'soma' será igual a " + iterar());
    }
}