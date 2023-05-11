public class PrivateHouse extends House {

  public PrivateHouse(String address) {
    super(address);
  }

  public String toString() {
    return "PrivateHouse address is: " + "\n" +  getAddress();
  }

  @Override
  public String toDestroy() {
    return "You have destroyed PrivateHouse" + "\n" ;
  }

}
