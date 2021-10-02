package model;

public class Video {

    private String s3FileUrl;

    public void watch(Player player) throws InterruptedException {
        Thread.sleep(50);
        System.out.println("Watching match for player " + player.getName());
    }
}
