package lesson5.spring;

import java.sql.SQLException;
import lesson5.Event;
import lesson5.EventDAO;
import lesson5.MyDataSource;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class EventDAOSpringDemo {

  public static void main(String[] args) throws SQLException {
    ApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
    EventDAO eventDAO = new EventDAO(MyDataSource.getDataSource());
    Event event;
    for (int i = 1; i < 4; ++i) {
      event = eventDAO.findById(i);
      System.out.println(event);
    }
    event = eventDAO.findByName("Opera");
    System.out.println(event);
  }

}
