import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Qual o tamanho do arquivo a ser baixado? ");
        double tamanho = teclado.nextDouble();

        System.out.println("Qual a velocidade da sua internet? ");
        double velocidade = teclado.nextDouble();

        double tempoSegundos = tamanho / velocidade;
        int horas = (int) (tempoSegundos / 3600);
        int minutos = (int) ((tempoSegundos % 3600) / 60);
        int segundos = (int) (tempoSegundos % 60);
        
        System.out.printf("Você baixará esse arquivo em %d horas, %d minutos e %d segundos ", horas, minutos, segundos);

        teclado.close();
    }
}
