package com.lucasalvess.model;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Video {

    private String s3FileUrl;
    private Map<Long, String> frames;

    public Video(String s3FileUrl) {
        this.s3FileUrl = s3FileUrl;
        this.frames = new HashMap<>();
    }

    public void watch() {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(s3FileUrl));
            String line = reader.readLine();
            String separator = ",";

            while ((line = reader.readLine()) != null) {
                String[] frame = line.split(separator);
                frames.put(Long.parseLong(frame[0]), frame[1]);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
