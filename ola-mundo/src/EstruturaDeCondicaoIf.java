public class EstruturaDeCondicaoIf {

    public static void main(String[] args) {

        // ==, >, <, >=, <=, !=
        // &&, ||, !

        int numero1 = 10;
        int numero2 = 10;

        if (numero1 > numero2) {
            System.out.println("Número 1 é maior!");
        } else if (numero1 == numero2) {
            System.out.println("Número 1 é igual ao Número 2");
        }else {
            System.out.println("Número 2 é maior!");
        }
    }
}
