package JoaoCarvalho.prova.organizacaoEscala;

public class motorista {
    private String nome;
    private String matricula;
    private char cnh;
    private boolean apto;
    public motorista(String nome, String matricula, char cnh){
        this.nome = nome;
        this.matricula = matricula;
        this.cnh = cnh;
        this.apto = tipoCnh();
    }
    public char getCnh() {
        return cnh;
    }
    public String getMatricula() {
        return matricula;
    }
    public String getNome() {
        return nome;
    }
    public boolean getApto() {
        return apto;
    }
    public void setApto(boolean apto) {
        this.apto = apto;
    }
    public void setCnh(char cnh) {
        this.cnh = cnh;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setAtualizacao(String nome, boolean apto){
        this.apto = apto;
        this.nome = nome;
    }
    private boolean tipoCnh(){
        if((cnh == 'd')||(cnh == 'e')){
            return true;
        }else{
            return false;
        }
    }
    @Override
    public String toString() {
        return "Aprovado para trabalhar = " + apto;
    }
}
