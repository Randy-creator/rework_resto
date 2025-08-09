package randy.creator.resto.resto_miam.repository;

import org.springframework.context.annotation.Configuration;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

@Configuration
public class Datasource {
  Connection connection = null;

  public Connection getConnection() {
    try {
      connection = DriverManager.getConnection(System.getenv("DB_URL"),
              System.getenv("DB_USER"),
              System.getenv("DB_PASSWORD"));
    } catch (SQLException e) {
      throw new RuntimeException(e);
    }
    return connection;
  }
}
