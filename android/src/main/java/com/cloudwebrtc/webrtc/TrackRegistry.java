package com.cloudwebrtc.webrtc;

import org.webrtc.VideoTrack;
import java.util.HashMap;

import io.flutter.view.TextureRegistry;

public class TrackRegistry {
    private static final HashMap<String, VideoTrack> tracks = new HashMap<>();
    private static final HashMap<Integer, TextureRegistry.SurfaceProducer> surfaceProducers = new HashMap<>();

    public static void register(VideoTrack track) {
        tracks.put(track.id(), track);
    }

    public static void registerSurfaceProducer(int textureId, TextureRegistry.SurfaceProducer surfaceProducer) {
        surfaceProducers.put(textureId, surfaceProducer);
    }

    public static VideoTrack get(String trackId) {
        return tracks.get(trackId);
    }

    public static TextureRegistry.SurfaceProducer getSurfaceProducer(int textureId) {
        return surfaceProducers.get(textureId);
    }

    public static void unregister(String trackId) {
        tracks.remove(trackId);
    }

    public static void unregisterSurfaceProducer(int textureId) {
        surfaceProducers.remove(textureId);
    }
}