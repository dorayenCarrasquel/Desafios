package br.com.zup;

import java.security.Key;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DesafioModulo1_2 {

    public static void main(String[] args) {
        //Instanciando   o contruido
        Scanner leitor = new Scanner(System.in);

        Map<String, String> cadastro = new HashMap<String, String>();


        //ENTREGA MÁXIMA *********************
        //Entrega Máxima: O Sistema permite excluir um funcionário usando como
        //parâmetro o CPF e não permite inserir um funcionário com o CPF repetido.

        //VARIAVEIS
        String nomeFuncionario;
        String telefoneFuncionario;
        String emailFuncionario;
        String cpfFuncionario = "";
        int menu = 1;
        int menuopcao;


        //menu
        while (menu != 4) {
            System.out.println("\n***** Cadastro de Funcincionario *****");
            System.out.println("[1] Adicionar Funcionarios");
            System.out.println("[2] Exibir Lista de Funcionarios");
            System.out.println("[3] Excluir Funcionarios");
            System.out.println("[4] Sair do Programa");

            menuopcao = leitor.nextInt();
            leitor.nextLine();

            //[1] Adicionar Funcionarios


            switch (menuopcao) {
                case 1:
                    System.out.println("[1] Adicionar Funcionarios");
                    //ENTRADA DADOS DO USUARIO
                    System.out.println("\n******* CADASTRO DE FUNCIONARIOS *******");

                    System.out.println("\nPor favor, digite o nome do funcionario: ");
                    nomeFuncionario = leitor.nextLine();

                    System.out.println("\nPor favor, digite o CPF do funcionario: ");
                    cpfFuncionario = leitor.nextLine();

                    System.out.println("\nPor favor, digite o email do funcionario:");
                    emailFuncionario = leitor.nextLine();

                    System.out.println("\nPor favor, digite o número de telefone do funcionario: ");
                    telefoneFuncionario = leitor.nextLine();


                    if (cadastro.size() != 0) {
                        for (String verificar : cadastro.keySet()) {
                            if (verificar.equals(cpfFuncionario)) {
                                System.out.println("Este CPF já está cadastrado");
                            } else {
                                cadastro.put(cpfFuncionario, " Funcionario: " + nomeFuncionario + " E-mail: " + emailFuncionario + " Telefone: " + telefoneFuncionario);
                                System.out.println("\nCadastro finalizado com Suceso");
                            }
                        }
                    } else {
                        //Almacenando os dados
                        cadastro.put(cpfFuncionario, " Funcionario: " + nomeFuncionario + " E-mail: " + emailFuncionario + " Telefone: " + telefoneFuncionario);
                        System.out.println("\nCadastro finalizado com Suceso");

                    }
                    break;

                case 2:
                    System.out.println("\n[2] Exibir Lista de Funcionarios");

                    // validando para percorrer a lista
                    if (cadastro.isEmpty()) {

                        System.out.println("\nPor Favor Adicione Funcionarios a su cadastro");

                    } else {

                        for (String referencia : cadastro.keySet()) {
                            System.out.println(referencia + cadastro.get(referencia));
                        }
                    }
                    break;

                case 3:
                    System.out.println("\n[3] Excluir Funcionarios");
                    System.out.println("\nPor favor digite o CPF do funcionario a excluir: ");
                    String excluir = leitor.nextLine();

                    if (cpfFuncionario.isEmpty()) {
                        System.out.println("Não tem cadastro para ser excluidos");
                    } else {
                        if (excluir.equals(cpfFuncionario)) {
                            cadastro.remove(excluir);
                        }
                    }
                    break;

                case 4:
                    System.out.println("[4] Sair do Programa\n");
                    menu = 4;

                    //Quando o usuario introduz um valor diferente ao mostrado no menu

                    break;

                default:
                    System.out.println("Marque uma opçao valida");
            }
        }
    }
}
