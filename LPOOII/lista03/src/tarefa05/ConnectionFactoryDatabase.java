package tarefa05;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConnectionFactoryDatabase {
  public Connection getConnection() {
    try (InputStream input = getClass().getResourceAsStream("../resources/contatos.properties")) {
      if (input == null) {
        throw new RuntimeException("Unable to locate database.properties");
      }

      Properties prop = new Properties();
      prop.load(input);
      String dbDriver = prop.getProperty("db.driver");
      String dbUrl = prop.getProperty("db.url");
      String dbUser = prop.getProperty("db.user");
      String dbPwd = prop.getProperty("db.pwd");

      Class.forName(dbDriver);
      return DriverManager.getConnection(dbUrl, dbUser, dbPwd);

    } catch (ClassNotFoundException clEx) {
      throw new RuntimeException(clEx);
    } catch (IOException | SQLException ex) {
      throw new RuntimeException(ex);
    }
  }
}
