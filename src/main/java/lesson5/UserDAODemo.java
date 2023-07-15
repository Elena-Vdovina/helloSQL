package lesson5;

import java.sql.SQLException;

public class UserDAODemo {

  public static void main(String[] args) throws SQLException {
    UserDAO userDAO = new UserDAO(MyDataSource.getDataSource());
    User user;
    for (int i = 1; i < 4; ++i) {
      user = userDAO.findById(i);
      System.out.println(user);
    }
    user = userDAO.findByName("Vadim");
    System.out.println(user);
    System.out.println();

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
