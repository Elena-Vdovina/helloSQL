package lesson5;

import java.sql.SQLException;

public class EventDAODemo {

  public static void main(String[] args) throws SQLException {
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
