package chainOfResponsability;

public class Main {

  public static void main(String[] args) {
    Request reimbursmentRequest = new Request(RequestType.REIMBURSMENT, 20);
    Manager manager = new Manager();
    manager.handleRequest(reimbursmentRequest);

    Director director = new Director();
    manager.setSuccesor(director);

    VP vp = new VP();
    director.setSuccesor(vp);

    CEO ceo = new CEO();
    vp.setSuccesor(ceo);

    Request conferenceRequest = new Request(RequestType.CONFERENCE, 400);
    manager.handleRequest(conferenceRequest);

    Request purchaseRequest = new Request(RequestType.PURHASE, 700);
    manager.handleRequest(purchaseRequest);

    Request bigPurchaseRequest = new Request(RequestType.PURHASE, 7000);
    manager.handleRequest(bigPurchaseRequest);
  }
}
