package Cadastrostelefone;

public class Contato {

    
    private String nome;
    private String telefone;
    private String email;

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return this.telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String obterInfo(){

        // retorna toda a lista de nome telefone e email e printa na tela
        return  "Nome = " + nome + " - " +
                "Telefone = " + telefone + " - " +
                "Email = " + email;

        }
    }
    

