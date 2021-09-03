package br.com.zup;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DesafioModulo1_2 {

    public static void main(String[] args) {
        //Instanciando   o contruido
        Scanner leitor = new Scanner(System.in);
        Map<String, String> cadastro = new HashMap<String, String>();


        //ENTREGA MEDIA *********************
        //Entrega Media: O sistema permite adicionar mais de um funcionário
        // e apresenta
        //um menu para decidir se deverá:
        //1. Adicionar mais funcionários.
        //2. Exibir a lista de todos os funcionários cadastrados.
        //3. Encerrar o programa.

        //VARIAVEIS
        String nomeFuncionario = "";
        String telefoneFuncionario = "";
        String emailFuncionario = "";
        String cpfFuncionario = "";
        boolean menu = true;
        int menuopcao = 0;

        //menu
        while (menu = true) {
            System.out.println("***** Cadastro de Funcincionario *****");
            System.out.println("[1] Adicionar Funcionarios");
            System.out.println("[2] Exibir Lista de Funcionarios");
            System.out.println("[3] Sair do Programa");
            menuopcao = leitor.nextInt();
            leitor.nextLine();
            //[1] Adicionar Funcionarios
            if (menuopcao == 1) {
                //ENTRADA DADOS DO USUARIO
                System.out.printf("\n******* CADASTRO DE FUNCIONARIOS *******\n");

                System.out.printf("\nPor favor, digite o nome do funcionario: \n");
                nomeFuncionario = leitor.nextLine();

                System.out.printf("\nPor favor, digite o CPF do funcionario: \n");
                cpfFuncionario = leitor.nextLine();

                System.out.printf("\nPor favor, digite o email do funcionario: \n");
                emailFuncionario = leitor.nextLine();

                System.out.printf("\nPor favor, digite o número de telefone do funcionario: \n");
                telefoneFuncionario = leitor.nextLine();

                //Almacenando od dados
                cadastro.put("O CPF: " + cpfFuncionario, " Funcionario: " + nomeFuncionario + " E-mail: " + emailFuncionario + " Telefone: " + telefoneFuncionario);
                System.out.println("Cadastro finalizado com Suceso");
            //[2] Exibir Lista de Funcionarios
            } else if (menuopcao == 2) {
                // validando para percorrer a lista
                if (cadastro.isEmpty() == true) {
                    System.out.println("Por Favor Adicione Funcionarios a su cadastro");
                } else {
                    for (String referencia : cadastro.keySet()) {
                        System.out.printf("\n Funcionario: \t%S" + cadastro.get(referencia));
                    }
                }
                //[3] Sair do Programa
            } else if (menuopcao == 3) {
                System.out.println("Saindo do Programa");
                menu = false;
            } else {
                System.out.println("Marque uma opçao valida");
            }


        }


        //EXIBIR LISTA
        System.out.println(cadastro);

    }
}
