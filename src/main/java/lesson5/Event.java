package lesson5;

public class Event {

  private int id;
  private String name;
  private String city;

  public Event(int id, String name, String city) {
    this.id = id;
    this.name = name;
    this.city = city;
  }

  @Override
  public String toString() {
    return "Events{" +
        "id=" + id +
        ", name='" + name + '\'' +
        ", city='" + city + '\'' +
        '}';
  }
}


/*
 CREATE TABLE events (
  id      	SERIAL PRIMARY KEY,
  name    	TEXT NOT NULL,
  city      TEXT NOT NULL
);

 INSERT INTO events (name, city) VALUES ('Violin concert', 'Prague'), ('Opera', 'London'), ('Jass concert', 'Berlin');
*/