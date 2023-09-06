package autorlivro.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import autorlivro.entidade.Livro;
import autorlivro.util.ConnectionDatabase;

public class LivroDAO {
  private String sql = "INSERT INTO livro (livro) VALUES(?)";

  public void adicionar(Livro livro) throws SQLException {
    Connection connection = null;
    PreparedStatement ps = null;

    try {
      connection = new ConnectionDatabase().getConnection();
      ps = connection.prepareStatement(sql);

      ps.setString(1, livro.getTitulo());
      ps.execute();
    } catch (SQLException e) {
      throw new RuntimeException(e);
    } finally {
      ps.close();
      connection.close();
    }
  }
}
