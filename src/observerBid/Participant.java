package observerBid;

public class Participant extends Observator {

  public Participant(String name) {
    super(name);
  }


  @Override
  public void update(Bid bid) {
    System.out.println("new bid");
  }

  public void follow(Item item) {
    observedItemList.add(item);
    item.addFollower(this);
  }
}
