package database;

import java.sql.*;

public class ConnectionDbStudents_03 {

    static final String DB_URL = "jdbc:mysql://localhost/escola";
    static final String USER = "root";
    static final String PASS = "teste123";

    // Melhoria
    // criar objeto Pessoa
    // Popular cada objeto Pessoa com a linha que veio banco
    // Jogar objetos pessoas na lista

    //List<Pessoa> listaPessoas = new ArrayList....
    //Pessoa p = new Pessoa(id, nome, dataNascimento);
    //listaPessoas.add(p);


    public static void main(String[] args) {
        // Open a connection
        try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
             Statement stmt = conn.createStatement();
        ) {

            // Criar Lista Pessoa

            String sql = "select * from estudante";

            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {

                Integer id = rs.getInt("id");
                String nome = rs.getString("nome");
                Date dataNascimento = rs.getDate("data_nascimento");

                // Popular Objeto Pessoa

                // Adicionar objeto pessoa na lista

                //Display values
                System.out.println("ID: " + id);
                System.out.println(", Nome: " + nome);
                System.out.println(", Data Nascimento: " + dataNascimento);
            }

            // Fazer o loop na lista pessoa e imprimir atributos de cada objeto pessoa

            System.out.println("Connected to Students database successfully...");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
