package tarefa05;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ContatoListDAO {
  private String sql = "UPDATE contatos SET nome = ?, email = ?, endereco = ?, dataNascimento = ? WHERE ID = ?";

  // public void altera(Contato contato)
  public void altera(Contato contato) throws SQLException {
    Connection connection = null;
    PreparedStatement pstmt = null;

    try {
      connection = new ConnectionFactoryDatabase().getConnection();
      pstmt = connection.prepareStatement(sql);

      pstmt.setString(1, contato.getNome());
      pstmt.setString(2, contato.getEmail());
      pstmt.setString(3, contato.getEndereco());
      pstmt.setDate(4, new Date(contato.getDataNascimento().getTimeInMillis()));
      pstmt.setLong(5, contato.getId());

      pstmt.executeUpdate();

    } catch (SQLException e) {
      throw new RuntimeException(e);
    } finally {
      if (pstmt != null) {
        pstmt.close();
      }
      if (connection != null) {
        connection.close();
      }
    }
  }

  // public void remove(Contato contato)

  // public List<Contato> lista()

  // public void insere(Contato contato)
}
