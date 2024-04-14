import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o PRIMEIRO parâmetro: ");
        int firstParameter = scanner.nextInt();

        System.out.println("Digite o SEGUNDO parâmetro");
        int secondParameter = scanner.nextInt();

        try {
            contar(firstParameter, secondParameter);
        } catch (ParametrosInvalidosException e){
            System.out.println("O Segundo parâmetro deve ser maior que o primeiro");
        }

    }

    static void contar(int firstParameter, int secondParameter) throws ParametrosInvalidosException{
        if (firstParameter > secondParameter){
            throw new ParametrosInvalidosException();
        }

        int difference = secondParameter - firstParameter;

        for (int i = 0; i < difference; i++) {
            System.out.println("Imprimindo Número " + (i + 1));
        }
    }
}
