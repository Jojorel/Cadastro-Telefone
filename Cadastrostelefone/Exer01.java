package Cadastrostelefone;


import java.util.Scanner;

public class Exer01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //Armazena o nome da agenda
        System.out.println("Entre com o nome da agenda");
        String nome = scan.nextLine();

        Agenda agenda = new Agenda(nome);

        Contato[] contatos = new Contato[2];
        for (int i = 0; i < 2; i++) {
            // Percorre 2 vezes por toda a classe para obter nome telefone e email
            System.out.println("Entre com as informaçoes do contato " + (i+1));
            Contato c = new Contato();

            System.out.println("Entre com o nome : ");
            nome = scan.nextLine();
            c.setNome(nome);

            System.out.println("Entre com o Telefone : ");
            String telefone = scan.nextLine();
            c.setTelefone(telefone);
            
            System.out.println("Entre com o Email : ");
            String email = scan.nextLine();
            c.setEmail(email);

            contatos[i] = c;

        }

        agenda.setContatos(contatos);
        
        if (agenda != null) {
            // se tiver algo dentro da agenda ele vai printar na tela as informaçoes recebidas
            System.out.println(agenda.obterInformacoes());
        }
    }

}
