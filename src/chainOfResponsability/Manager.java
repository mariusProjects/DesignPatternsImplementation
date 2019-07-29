package chainOfResponsability;

public class Manager extends Handler {

  @Override
  public void handleRequest(Request request) {

    if (request.getType() == RequestType.REIMBURSMENT) {
      // Manager's area of approval
      if (request.getAmount() > 100) {
        System.out.println("Manager can approve but rejects it");
      } else {
        System.out.println("Manager can approve and signs the request");
      }
    } else {
      //not my area of approval, but I know someone higher than me
      succesor.handleRequest(request);
    }


  }
}
