package singleton;

public class Main {

  public static void main(String[] args) {
//    OnlineMusicStore musicStore = OnlineMusicStore.getInstance();
//    musicStore.play();
//
//    OnlineMusicStore anotherMusicStore = OnlineMusicStore.getInstance();
//    anotherMusicStore.play();
//
//    OnlineMusicStore.getInstance().play();

    OnlineMusicStore2.ANOTHER_INSTANCE.play();
    OnlineMusicStore2.INSTANCE.play();

  }
}
