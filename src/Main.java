import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {


        Evento empresa = new Evento();

        Scanner scan = new Scanner(System.in);


        boolean programaFinalizado = false;
        do {
            pulaLinha();
            System.out.println("1. Adicionar participante.");
            System.out.println("2. Quantidade de participantes.");
            System.out.println("3. Verificar participante.");
            System.out.println("4. Lista de participantes.");
            System.out.println("5. Sair.");
            pulaLinha();

            System.out.print("Opção: ");
            int opcao = scan.nextInt();

            scan.nextLine();
            switch (opcao) {
                case 1:
                    pulaLinha();
                    System.out.println("Opção 1: Adicionar participante.");
                    System.out.print("Digite o nome: ");
                    String nome = scan.nextLine();

                    empresa.adicionarParticipante(nome);
                    System.out.println("Participante '" + nome + "' adicionado com sucesso!");
                    pulaLinha();
                    break;
                case 2:
                    System.out.println("Opção 2: Quantidade de participantes.");

                    System.out.println("Total de participantes: " + empresa.quantidadeParticipante());

                    pulaLinha();
                    break;
                case 3:
                    System.out.println("Opção 3: Verificar participante.");
                    System.out.println("Digite o nome para verificação.");
                    System.out.print("Nome: ");
                    String nomeVerificado = scan.nextLine();

                    if (empresa.contemParticipante(nomeVerificado)) {
                        System.out.println(nomeVerificado + " está na lista.");
                    } else {
                        System.out.println(nomeVerificado + " NÃO está na lista.");
                    }
                    pulaLinha();
                    break;
                case 4:
                    System.out.println("Opção 4: Lista de participantes.");
                    System.out.println(empresa.listarParticipantes());
                    pulaLinha();
                    break;
                case 5:

                    programaFinalizado = true;
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Numero inválido! Escolher opções entre 1 e 5.");
                    pulaLinha();

            }
        }while (!programaFinalizado);

        scan.close();
    }

    public static void pulaLinha() {
        System.out.println();
    }
}