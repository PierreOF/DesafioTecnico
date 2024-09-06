public class ContadorDeLetras {
    public static void main(String[] args) {

        String string = "AAAAAaaaaa...";

        int contador = contarLetraA(string);
        if (contador > 0) {
            System.out.println("A letra 'a' ou 'A' ocorre " + contador + " vezes na string.");
        } else {
            System.out.println("A letra 'a' ou 'A' não ocorre na string.");
        }
    }

    public static int contarLetraA(String str) {
        int contador = 0;
        for (char c : str.toCharArray()) {
            if (c == 'a' || c == 'A') {
                contador++;
            }
        }
        return contador;
    }
}
