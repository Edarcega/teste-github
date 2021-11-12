package applications;

import entities.membros;

import java.text.ParseException;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nome: ");
        String name = sc.nextLine();
        System.out.print("Nascimento: ");
        String nascimento = sc.nextLine();

        membros membro = new membros(name,nascimento);
        System.out.print("O membro: " + membro.getName() + " Tem " + membro.getIdade() + " Anos de idade");

        sc.close();
    }

}
