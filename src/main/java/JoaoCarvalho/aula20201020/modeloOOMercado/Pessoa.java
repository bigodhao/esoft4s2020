package JoaoCarvalho.aula20201020.modeloOOMercado;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public abstract class Pessoa {
    private String id;
    private String nome;
    private List<Papel> papéis = new ArrayList<>();

    public Pessoa() {
        this.id = UUID.randomUUID().toString();
    }

    public Pessoa(String nome) {
        this();
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public String getId() {
        return id;
    }

    public void assumirPapel(Papel papel) {
        for (Papel papel1 : papéis){
            if (papel1.getClass().getName() == papel.getClass().getName()){
                throw new RuntimeException("não pode ter o mesmo tipo de papel mais de uma vez!");
            }
        }
        this.papéis.add(papel);
    }
   

    public boolean isReitor() {
        for (Papel papel : papéis) {
            if (papel instanceof Reitor) {
                return true;
            }
        }
        return false;
    }

    public Reitor getReitor() {
        for (Papel papel : papéis) {
            if (papel instanceof Reitor) {
                return (Reitor) papel;
            }
        }
        return null;
    }

}
