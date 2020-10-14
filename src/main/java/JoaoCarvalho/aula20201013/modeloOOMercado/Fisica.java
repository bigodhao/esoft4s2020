package JoaoCarvalho.aula20201013.modeloOOMercado;

public class Fisica extends Pessoa {
    private String telefone;
    private String email;
    private String cpf;

    public Fisica( String nome, String código, String telefone, String email, String cpf){
        super(nome, código);
        this.telefone = telefone;
        this.email = email;
        this.cpf = cpf;
    }
    
}
