import java.util.Scanner;
public class Notas {
    private static final Scanner ENTRADA = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Digite sua primeira nota: ");
        double n1 = ENTRADA.nextDouble();
        System.out.print("Digite sua segunda nota: ");
        double n2 = ENTRADA.nextDouble();
        double mediaUnidade = n1+n2/2;
        double mediaFinal;
        String status;
        if(mediaUnidade < 4){
            mediaFinal = mediaUnidade;
            status = "reprovado direto!";
        }else if(mediaUnidade >=7){
            mediaFinal =mediaUnidade;
            status = "aprovado por média!";
        } else{
            System.out.print("Digite a nota da final: ");
            double notaFinal = ENTRADA.nextDouble();
            mediaFinal = mediaUnidade + notaFinal/2;
            if(mediaFinal >=5){
                status = "aprovado na final";
            } else{
                status = "reprovado na final";
            }
        }
        System.out.println("Média da unidade: " + mediaUnidade);
        System.out.println("Média final: " + mediaFinal);
        System.out.println("Status: " + status);
    }
}
