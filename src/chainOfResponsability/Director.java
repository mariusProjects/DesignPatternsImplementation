package chainOfResponsability;

public class Director extends Handler {

  @Override
  public void handleRequest(Request request) {
    if(request.getType() == RequestType.CONFERENCE){
      //his area
      System.out.println("Director can approve conferences, approved!");
    } else{
      succesor.handleRequest(request);
    }
  }
}
