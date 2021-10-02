package model;

public class Video {

    private String s3FileUrl;

    public void watch(Player player) {
        try {
            Thread.sleep(50);
            System.out.println("Watching match for player " + player.getName());
        }catch (InterruptedException e){
            System.out.println(e);
        }

    }
}
