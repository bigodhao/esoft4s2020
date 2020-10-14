package JoaoCarvalho.prova.organizacaoEscala;

import java.util.ArrayList;
import java.util.List;

public class appEscala {
    public static void main(String[] args) {
        motorista leo = new motorista("leonardo kitagod", "5526", 'c');
        motorista luan = new motorista("milico luan", "3369", 'd');
        motorista vinicios = new motorista("vinicios barcelos", "9946", 'b');
        motorista joao = new motorista("João Paulo França", "6649", 'e');
        System.out.println(leo.toString());
        System.out.println(luan.toString());
        System.out.println(vinicios.toString());
        System.out.println(joao.toString());
        linha linha001;
        linha linha002 = new linha(002);
        List<linha> linhas = new ArrayList<>();
        for (int i = 0; i < 200; i++) {
            linhas.add(new linha(i));
        }
        for (linha linha : linhas) {
            System.out.println(linha.getLinha());
        }
    }
}
