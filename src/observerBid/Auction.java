package observerBid;

public class Auction {

  public void start() {
    Participant jack = new Participant("jack");
    Participant john = new Participant("john");

    Item bike = new Item("bike", 12);
    Item car = new Item("car", 10000);

    jack.follow(bike);
    car.newBid(new Bid());
  }
}
