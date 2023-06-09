public abstract class House {

  //Задача 1
//Создайте абстрактный класс "Дом". В качестве аргумента конструктора принимайте адрес.
//Напишите для адреса сеттер и геттер.
//Создайте классы "Частный дом" и "Многоквартирный дом" - наследники класса "Дом".
//При создании многоквартирного дома дополнительно принимайте в конструкторе целое число -
// количество подъездов.
//В методе toString() выводите в удобном виде всю известную информацию о доме.
//В основном файле программы создайте список домов, в который поместите два частных дома
// и один многоквартирный.
//Выведите информацию о домах в списке с использованием цикла for-each.
  private String address;

  public House(String address) {
    this.address = address;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public abstract String toString();

  public abstract String toDestroy();
}

