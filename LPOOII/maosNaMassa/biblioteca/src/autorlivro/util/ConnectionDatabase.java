package autorlivro.util;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConnectionDatabase {
  public Connection getConnection() {
    try (InputStream input = getClass().getResourceAsStream("/biblioteca.properties")) {
      if (input == null) {
        throw new RuntimeException("Não foi possível localizar o arquivo biblioteca.properties");
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
