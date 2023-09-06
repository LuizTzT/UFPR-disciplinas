package tarefa05;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ContatoDAO {
  private String sql = "INSERT INTO contatos (nome, email, endereco, dataNascimento) VALUES(?, ?, ?, ?)";

  public void adiciona(Contato contato) throws SQLException {
    Connection connection = null;
    PreparedStatement pstmt = null;
    try {
      connection = new ConnectionFactoryDatabase().getConnection();
      pstmt = connection.prepareStatement(sql);

      pstmt.setString(1, contato.getNome());
      pstmt.setString(2, contato.getEmail());
      pstmt.setString(3, contato.getEndereco());
      pstmt.setDate(4, new Date(contato.getDataNascimento().getTimeInMillis()));

      pstmt.execute();
    } catch (SQLException e) {
      throw new RuntimeException(e);
    } finally {
      pstmt.close();
      connection.close();
    }
  }
}
