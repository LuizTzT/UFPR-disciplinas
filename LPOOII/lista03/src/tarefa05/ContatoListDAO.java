package tarefa05;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class ContatoListDAO {
  private String sqlAltera = "UPDATE contatos SET nome = ?, email = ?, endereco = ?, dataNascimento = ? WHERE id = ?";
  private String sqlRemove = "DELETE FROM contatos WHERE id = ?";
  private String sqlList = "SELECT * FROM contatos";

  // public void altera(Contato contato)
  public void altera(Contato contato) throws SQLException {
    Connection connection = null;
    PreparedStatement pstmt = null;

    try {
      connection = new ConnectionFactoryDatabase().getConnection();
      pstmt = connection.prepareStatement(sqlAltera);

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
  public void remove(Contato contato) throws SQLException {
    Connection connection = null;
    PreparedStatement pstmt = null;

    try {
      connection = new ConnectionFactoryDatabase().getConnection();
      pstmt = connection.prepareStatement(sqlRemove);

      pstmt.setLong(1, contato.getId());
      pstmt.executeUpdate();

    } catch (SQLException e) {
      throw new RuntimeException(e);
    } finally {
      if (pstmt != null) {
        pstmt.close();
      }

      if (pstmt != null) {
        pstmt.close();
      }
    }
  }

  // public List<Contato> lista()
  public List<Contato> list() throws SQLException {
    Connection connection = null;
    PreparedStatement pstmt = null;
    ResultSet rs = null;
    List<Contato> contatos = new ArrayList<>();

    try {
      connection = new ConnectionFactoryDatabase().getConnection();
      pstmt = connection.prepareStatement(sqlList);
      rs = pstmt.executeQuery();

      while (rs.next()) {
        Contato contato = new Contato();

        contato.setId(rs.getLong("id"));
        contato.setNome(rs.getString("nome"));
        contato.setEmail(rs.getString("email"));
        contato.setEndereco(rs.getString("endereco"));

        // Converter o tipo Date em Calendar
        Date sqlDate = rs.getDate("dataNascimento");
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(sqlDate.getTime());

        contato.setDataNascimento(calendar);

        contatos.add(contato);
      }

      return contatos;

    } catch (SQLException e) {
      throw new RuntimeException(e);
    } finally {
      if (connection != null) {
        connection.close();
      }
      if (pstmt != null) {
        pstmt.close();
      }
      if (rs != null) {
        rs.close();
      }
    }
  }

  // public void insere(Contato contato)
}
