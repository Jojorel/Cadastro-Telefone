package Cadastrostelefone;

public class Agenda {
    private String nome;
    private Contato[] contatos;

    public Agenda() {

    }

    public Agenda(String nome) {
        this.nome = nome;

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Contato[] getContatos() {
        return this.contatos;
    }
    // setando o contatos dentro do vetor contato
    public void setContatos(Contato[] contatos) {
        this.contatos = contatos;
    }

    public String obterInformacoes() {

        //escreve na tela o nome da agente recebido e tambem armazena dentro da variavel o nome
        String info = "Nome da Agenda = " + nome + "\n";
        if (contatos != null) {

            // Contato c : percorre o vetor de contatos 
            for (Contato c : contatos) {
            // Dentro do vetor ele itentifica pelo CONTATO C : e procura nos contatos 
            //as informaçoes de obterinfo
                info += c.obterInfo() + "\n";
            }
        }

        return info;
    }

}
