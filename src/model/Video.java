package model;

public class Video {

    private String s3FileUrl;

    public void watch() {
        try {
            Thread.sleep(10);
        }catch (InterruptedException e){
            System.out.println(e);
        }

    }
}
