package com.lucasalvess.util;

import com.lucasalvess.model.Player;
import com.lucasalvess.model.Video;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class PopulateHelper {

    private static final String S3_VIDEO_URL = "/video.csv";

    public static List<Video> generateVideoListByLength(int length){
        List<Video> videos = new ArrayList<>();

        for (int i=0; i < length;i++){
            videos.add(new Video(S3_VIDEO_URL));
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
