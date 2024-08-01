import java.util.Scanner;

public class ContaBancaria {

    public static void main(String[] args) {
        String nome = "Marcos Vinicius";
        String tipoConta = "Corrente";
        double saldo = 1000;
        mostraCliente(nome, tipoConta, saldo);
        Scanner s = new Scanner(System.in);
        boolean sair = false;
        while (!sair) {
            mostraMenu();
            int opt = s.nextInt();
            switch (opt) {
                case 1: { // Visualizar o saldo
                    System.out.println(
                        "\nO saldo na conta e de R$ %.2f\n".formatted(saldo)
                    );
                    break;
                }
                case 2: {
                    System.out.println("\nQual o valor a receber? ");
                    saldo += s.nextDouble();
                    System.out.println(
                        "\nSaldo na conta atualizado R$ %.2f\n".formatted(saldo)
                    );
                    break;
                }
                case 3: {
                    System.out.println("\nQual o valor a transferir? ");
                    double transferencia = s.nextDouble();
                    if (saldo < transferencia) {
                        System.out.println(
                            "\nNão e possivel fazer a transferencia, pois não saldo suficiente na conta."
                        );
                        System.out.println(
                            "\nSaldo na conta R$ %.2f\n".formatted(saldo)
                        );
                        break;
                    }
                    System.out.println(
                        "\nTransferindo R$ %d".formatted(transferencia)
                    );
                    saldo -= transferencia;
                    System.out.println(
                        "\nSaldo na conta atualizado R$ %.2f\n".formatted(saldo)
                    );
                    break;
                }
                case 4: {
                    sair = true;
                    System.out.println("Até logo!");
                    break;
                }
                default:
                    System.out.println("Opção invalida");
                    continue;
            }
        }
        s.close();
    }

    public static void mostraCliente(
        String nome,
        String tipoConta,
        double saldo
    ) {
        System.out.println("        Conta Bancaria");
        System.out.println("*****************************");
        System.out.println("    Cliente: " + nome);
        System.out.println("    Tipo: " + tipoConta);
        System.out.println("    Saldo: R$ %.2f".formatted(saldo));
        System.out.println("*****************************");
    }

    public static void mostraMenu() {
        System.out.println("Opções:");
        System.out.println("   1. Consulta");
        System.out.println("   2. Receber");
        System.out.println("   3. Transferencia");
        System.out.println("   4. Sair");
    }
}
