package JoaoCarvalho.aula20201020.modeloOOMercado;

import java.util.UUID;

public abstract class Papel {
    private String id;


    public Papel() {
        id = UUID.randomUUID().toString();
    }

    public String getId() {
        return id;
    }

}
