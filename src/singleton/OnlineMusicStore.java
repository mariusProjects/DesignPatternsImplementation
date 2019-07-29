package singleton;

public class OnlineMusicStore {

  private static OnlineMusicStore INSTANCE = null;

  private OnlineMusicStore() {
    System.out.println("In Online music store constructor");
  }

  public static OnlineMusicStore getInstance() {
    if (INSTANCE == null) {
      synchronized (OnlineMusicStore.class) {
        if (INSTANCE == null) {
          INSTANCE = new OnlineMusicStore();
        }
      }
    }
    return INSTANCE;
  }

  public static OnlineMusicStore getInstance2() {
    synchronized (OnlineMusicStore.class) {
      if (INSTANCE == null) {
        INSTANCE = new OnlineMusicStore();
      }
    }
    return INSTANCE;
  }

  public void play() {

    System.out.println("Play");

  }
}
