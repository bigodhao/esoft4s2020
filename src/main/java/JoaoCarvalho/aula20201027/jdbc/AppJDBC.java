package JoaoCarvalho.aula20201027.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class AppJDBC {

    public static void main(String[] args) {
        try {
            long inicio = System.currentTimeMillis();
            //String exemploUrlSQLServer = "jdbc:sqlserver://localhost;databaseName=NOME_DO_BANCO;user=NOME_USUÁRIO;password=SENHA";
            Connection conn = DriverManager.getConnection(
                "jdbc:postgresql://localhost:5432/esoft4s2020", "postgres", "postgres");
            conn.setAutoCommit(false);

            Statement createTable =  conn.createStatement();    
            
            createTable.executeUpdate("create table if not exists endereco ("
                +"ID_ENDERECO NUMERIC CONSTRAINT ID_ENDERECO_NN NOT NULL," 
                +"ESTADO_ENDERECO CHAR(2)," 
                +"CIDADE_ENDERECO VARCHAR(30),"
                +"BAIRRO_ENDERECO VARCHAR(30),"
                +"LOGRADOURO_ENDERECO VARCHAR(30),"
                +"NUMERO_ENDERECO VARCHAR(10),"
                +"CONSTRAINT ID_ENDERECO_PK PRIMARY KEY (ID_ENDERECO) )");

            createTable.executeUpdate("create table if not exists usuario("
                +"ID_USUARIO NUMERIC CONSTRAINT ID_USUARIO_NN NOT NULL,"
                +"NOME_USUARIO VARCHAR(30),"
                +"CPF_USUARIO CHAR(11) CONSTRAINT CPF_USUARIO_NN NOT NULL,"
                +"DATA_NASC_USUARIO DATE,"
                +"TELEFONE_USUARIO CHAR(11),"
                +"EMAIL_USUARIO VARCHAR(50) CONSTRAINT EMAIL_USUARIO_NN NOT NULL,"
                +"SENHA_USUARIO VARCHAR(30),"
                +"ID_ENDERECO_USUARIO NUMERIC CONSTRAINT ID_ENDERECO_USUARIO_NN NOT NULL,"
    
                +"CONSTRAINT ID_USUARIO_PK PRIMARY KEY (ID_USUARIO, CPF_USUARIO),"
                +"CONSTRAINT ID_ENDERECO_USUARIO_FK FOREIGN KEY (ID_ENDERECO_USUARIO) REFERENCES ENDERECO,"
                +"CONSTRAINT EMAIL_USUARIO_UK UNIQUE (EMAIL_USUARIO) )");
            
            PreparedStatement insertProduto = conn
                .prepareStatement("insert into produto (id, descricao, preco) values (?,?,?)");
            
            for (int i = 1; i <= 100; i++) {
                long novoId = System.nanoTime();
                insertProduto.setLong(1, novoId);
                insertProduto.setString(2, "Produto Descrição Boa, número " + novoId );
                insertProduto.setDouble(3, 2.25 * i);
                insertProduto.executeUpdate();
            }            
            conn.commit();

            System.out.println("Foi! Tempo total = " + (System.currentTimeMillis()-inicio) + " ms.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
