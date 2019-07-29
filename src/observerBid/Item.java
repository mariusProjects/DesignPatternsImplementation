package observerBid;

import java.util.ArrayList;
import java.util.List;

public class Item {

  private String name;
  private int startingPrice;
  private List<Observator> observerList = new ArrayList<>();
  private Bid latestBid;

  public Item(String name, int price) {
    this.name = name;
    this.startingPrice = price;
  }

  public void updateFollowers(Bid bid) {
    //update all

  }

  public void addFollower(Participant participant) {
    observerList.add(participant);
  }

  public void newBid(Bid bid) {
    this.latestBid = bid;
    updateFollowers(bid);
  }
}
