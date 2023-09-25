import java.util.*;

public class Menu {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int entrada=0;
        double salario = 0;
        double novoSalario;
        while (entrada != 4) {
            System.out.println("MENU\n1: Novo salário\n2:Férias\n3:Décimo terceiro\n4:Sair\nDigite a opção:");
            entrada = sc.nextInt();
            switch (entrada) {
                case 1:
                    while (salario <= 0) {
                        System.out.println("Digite seu salario: ");
                        salario = sc.nextInt();
                    }
                    if (salario < 1000) {
                        novoSalario = salario * 1.15;
                    } else if (salario > 1000 && salario <= 2000) {
                        novoSalario = salario * 1.10;
                    } else {
                        novoSalario = salario * 1.05;
                    }
                    System.out.println("Novo salario: R$" + novoSalario);
                    break;
                case 2:
                    while (salario <= 0) {
                        System.out.println("Digite seu salario: ");
                        salario = sc.nextInt();
                    }
                    novoSalario = salario + (salario / 3);
                    System.out.println("Ferias: R$" + novoSalario);
                    break;
                case 3:
                    while (salario <= 0) {
                        System.out.println("Digite seu salario: ");
                        salario = sc.nextInt();
                    }
                    System.out.println("Digite os meses de empresa (maximo 12): ");
                    int meses = sc.nextInt();
                    novoSalario = (salario * meses) / 12;
                    System.out.println("Decimo terceiro: R$" + novoSalario);
                    break;
                case 4:
                    System.out.println("FIM!");
                    break;
                default:
                    System.out.println("Opção invalida!");
            }
        }
        sc.close();
    }
}
