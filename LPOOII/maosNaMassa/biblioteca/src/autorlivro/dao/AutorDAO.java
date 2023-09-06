package autorlivro.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import autorlivro.entidade.Autor;
import autorlivro.util.ConnectionDatabase;

public class AutorDAO {
  private String sql = "INSERT INTO autor (nome) VALUES(?)";

  public void adicionar(Autor autor) throws SQLException {
    Connection connection = null;
    PreparedStatement ps = null;

    try {
      connection = new ConnectionDatabase().getConnection();
      ps = connection.prepareStatement(sql);

      ps.setString(1, autor.getNome());
      ps.execute();
    } catch (SQLException e) {
      throw new RuntimeException(e);
    } finally {
      ps.close();
      connection.close();
    }
  }
}
