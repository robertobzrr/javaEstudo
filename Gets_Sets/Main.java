import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            Pessoa p = new Pessoa();


        System.out.println("===== Gets e Sets =====");
        System.out.println("\n-> Digite seu nome: ");
        p.setNome (sc.nextLine());

        System.out.println("\n-> Digite sua idade: ");
        p.setIdade (sc.nextInt());
        sc.nextLine();

        System.out.println("-> Digite sua altura: ");
        p.setAltura(sc.nextDouble());
        sc.nextLine();

        System.out.println("-> Digite seu peso: ");
        p.setPeso(sc.nextDouble());
        sc.nextLine();


        System.out.println("\nLista de Cadastro:\n- Nome: "+p.getNome()+"\n- Idade: "+ p.getIdade()+ "\n- Altura: "+p.getAltura()+ "\n- Peso: "+ p.getPeso());


    }
}
