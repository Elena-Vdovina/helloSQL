package lesson5.spring;

import javax.sql.DataSource;
import lesson5.EventDAO;
import lesson5.UserDAO;
import org.postgresql.ds.PGSimpleDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

  @Bean
  public DataSource dataSource() {
    PGSimpleDataSource pgDataSource = new PGSimpleDataSource();
    pgDataSource.setServerName("localhost");
    pgDataSource.setDatabaseName("ait");
    pgDataSource.setUser("postgres");
    pgDataSource.setPassword("root");
    return pgDataSource;
  }

  @Bean
  public UserDAO userDAO() {
    return new UserDAO(dataSource());
  }

  @Bean
  public EventDAO eventDAO() {
    return new EventDAO(dataSource());
  }

}
