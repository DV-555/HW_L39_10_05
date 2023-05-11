public class ApartmentsHouse extends House {
  private int numberOfEntrances;
  public ApartmentsHouse(String address, int numberOfEntrances) {
    super(address);
    this.numberOfEntrances = numberOfEntrances;
  }
  public int getNumberOfEntrances() {
    return numberOfEntrances;
  }
  public void setNumberOfEntrances(int numberOfEntrances) {
    this.numberOfEntrances = numberOfEntrances;
  }
  @Override
  public String toString() {
    return "ApartmentsHouse at address: " + getAddress()+
        " NumberOfEntrances: " + numberOfEntrances;
  }
}