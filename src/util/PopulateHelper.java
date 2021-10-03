package util;

import model.Player;
import model.Video;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class PopulateHelper {

    public static List<Video> generateVideoListByLength(int length){
        List<Video> videos = new ArrayList<>();

        for (int i=0; i < length;i++){
            videos.add(new Video());
        }

        return videos;
    }

    public static Player generatePlayer(int videosPerPlayer){
        return new Player(UUID.randomUUID().toString(),100, generateVideoListByLength(videosPerPlayer));
    }

    public static List<Player> generatePlayerListByLength(int length, int videosPerPlayer){
        List<Player> players = new ArrayList<>();

        for (int i=0; i < length;i++){
            players.add(generatePlayer(length));
        }

        return players;
    }
}
