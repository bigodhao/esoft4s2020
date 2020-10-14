package JoaoCarvalho.aula20201013.modeloOOMercado;

public class Juridica extends Pessoa {
    private String telefone;
    private String email;
    private String cnpj;

    public Juridica( String nome, String código, String telefone, String email, String cnpj){
        super(nome, código);
        this.telefone = telefone;
        this.email = email;
        this.cnpj = cnpj;
    } 
}
