package br.com.zup;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DesafioModulo1_2 {

    public static void main(String[] args) {
        //Instanciando   o contruido
        Scanner leitor = new Scanner(System.in);
        Map<String, String> cadastro = new HashMap<String, String>();


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

        System.out.printf("\nPor favor, digite o número de telefone do funcionario: \n");
        telefoneFuncionario = leitor.nextLine();

        //Almacenando od dados
        cadastro.put("O CPF: " + cpfFuncionario, " Funcionario: " + nomeFuncionario + " E-mail: " + emailFuncionario + " Telefone: " + telefoneFuncionario);


        //EXIBIR LISTA
        System.out.println(cadastro);

    }
}
