import java.util.Scanner;
import java.lang.Math;
public class App {
    public static void main(String[] args) {
        double tamanho;
        double velocidade;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Qual o tamanho do arquivo a ser baixado? ");
        tamanho = teclado.nextDouble();

        System.out.println("Qual a velocidade da sua internet? ");
        velocidade = teclado.nextDouble();

        double tempoSeg = Math.floor((tamanho / velocidade));
        double tempoMin = Math.floor((tempoSeg / 60));
        double TempoMinRes = Math.floor((tempoSeg % 60));

        System.out.print("Você baixará esse arquivo em " +tempoMin);
        System.out.print(" minutos e "+TempoMinRes);
        System.out.println(" segundos.");
        teclado.close();
    }
}
