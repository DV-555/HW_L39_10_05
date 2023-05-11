public class PrivateHouse extends House{

  public PrivateHouse(String address){
    super(address);
  }

  public String toString() {
    return "PrivateHouse address is: " + getAddress();
  }
}
