package JoaoCarvalho.aula20201013.modeloOOMercado;

public class Pessoa{
    private String nome;
    private String código;
    private Fornecedor f;
    private Cliente c;
    private Vendedor v;
    private Transportadora t;

    public Pessoa( String nome, String código){
        this.nome = nome;
        this.código = código;
    }
    public void setFornecedor(Fornecedor f) {
        this.f = f;
    }
    public void setCliente(Cliente c){
        this.c = c;
    }
    public void setVendedor(Vendedor v){
        this.v = v;
    }
    public void setTransportadora(Transportadora t){
        this.t = t;
    }
}
