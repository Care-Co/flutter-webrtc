package com.cloudwebrtc.webrtc;

import org.webrtc.VideoTrack;
import java.util.HashMap;

public class TrackRegistry {
    private static final HashMap<String, VideoTrack> tracks = new HashMap<>();

    public static void register(VideoTrack track) {
        tracks.put(track.id(), track);
    }

    public static VideoTrack get(String trackId) {
        return tracks.get(trackId);
    }

    public static void unregister(String trackId) {
        tracks.remove(trackId);
    }
}