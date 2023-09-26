public class Main {
    public static void main(String[] args) {
        int numero = 12;
        String binario = "";

        for (int i = 0; numero > 0; i++) {
            int resto = numero % 2;
            binario = resto + binario;
            numero = numero / 2;
        }

        System.out.println("El número binario es: " + binario);
    }
}