package lesson5.spring;

import java.sql.SQLException;
import lesson5.Event;
import lesson5.EventDAO;
import lesson5.User;
import lesson5.UserDAO;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class UserDAOSpringDemo {

  public static void main(String[] args) throws SQLException {
    ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
    UserDAO userDAO = context.getBean(UserDAO.class);
    for (int i = 1; i < 4; ++i) {
      User user = userDAO.findById(i);
      System.out.println(user);
    }
    User user = userDAO.findByName("Vadim");
    System.out.println(user);
    System.out.println();

    EventDAO eventDAO = context.getBean(EventDAO.class);
    for (int i = 1; i < 4; ++i) {
      Event event = eventDAO.findById(i);
      System.out.println(event);
    }
    Event event = eventDAO.findByName("Opera");
    System.out.println(event);
  }

}
