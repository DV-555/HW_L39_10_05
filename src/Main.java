import java.util.ArrayList;
import java.util.List;

public class Main {

  public static void main(String[] args) {

    House houseFirst = new PrivateHouse("Berliner Str 5");
    House houseSecond = new PrivateHouse("Potsdam Str 25");
    House houseThird = new ApartmentsHouse("Wilhelm Str 55", 5);

    List<House> ListOfHouses = new ArrayList<>();
    ListOfHouses.add(houseFirst);
    ListOfHouses.add(houseSecond);
    ListOfHouses.add(houseThird);

    for (House house : ListOfHouses) {
      System.out.println(house);
      System.out.println(house.toDestroy());
    }
  }
}
