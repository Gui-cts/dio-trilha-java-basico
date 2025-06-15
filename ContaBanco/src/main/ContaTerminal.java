package main;

import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        var name = sc.next();
        System.out.println("Digite o numero da sua Agencia: ");
        var agency = sc.nextInt();
        System.out.println("Digite o numero da sua conta: ");
        var account = sc.nextInt();
        System.out.println("Saldo: ");
        var balance = sc.nextDouble();
        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %s e seu saldo %s já está disponível para saque \n", name, agency, account, balance);
    }
    
}
