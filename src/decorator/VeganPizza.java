package decorator;

public class VeganPizza implements Pizza {

  @Override
  public double getCost() {
    System.out.println("Vegan pizza: 20ron");
    return 20;
  }
}
