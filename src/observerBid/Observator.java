package observerBid;

import java.util.List;


public abstract class Observator {

  protected String name;
  protected List<Item> observedItemList;

  public Observator(String name) {
    this.name = name;
  }

  public abstract void update(Bid bid);

}