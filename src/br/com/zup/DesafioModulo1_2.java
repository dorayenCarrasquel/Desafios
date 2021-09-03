package br.com.zup;

import java.util.Scanner;

public class DesafioModulo1_2 {

    public static void main(String[] args) {
        //Instanciando Scanner
        Scanner leitor = new Scanner(System.in);

        //ENTREGA MINIMA*********************
        //Entrega Mínima: O sistema permite, via terminal,
        // inserir pelo menos 1 funcionário nome, telefone,
        // email e CPF.
        //em uma lista e retornar o mesmo na tela.

        //VARIAVEIS
        String nomeFuncionario = "";
        String telefoneFuncionario = "";
        String emailFuncionario = "";
        String cpfFuncionario = "";

        //ENTRADA DADOS DO USUARIO
        System.out.printf("\n******* CADASTRO DE FUNCIONARIOS *******\n");

        System.out.printf("\nPor favor, digite o nome do funcionario: \n");
        nomeFuncionario = leitor.nextLine();

        System.out.printf("\nPor favor, digite o CPF do funcionario: \n");
        cpfFuncionario = leitor.nextLine();

        System.out.printf("\nPor favor, digite o email do funcionario: \n");
        emailFuncionario = leitor.nextLine();

        System.out.printf("\nPor favor, digite o númerode telefone do funcionario: \n");
        telefoneFuncionario = leitor.nextLine();


        //EXIBIR LISTA


    }
}
