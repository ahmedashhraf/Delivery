package org.jcodec.common;

import org.jcodec.common.model.Size;

public class DemuxerTrackMeta {
    private Size dimensions;
    private int[] seekFrames;
    private double totalDuration;
    private int totalFrames;
    private Type type;

    public enum Type {
        VIDEO,
        AUDIO,
        OTHER
    }

    public DemuxerTrackMeta(Type type2, int[] iArr, int i, double d, Size size) {
        this.type = type2;
        this.seekFrames = iArr;
        this.totalFrames = i;
        this.totalDuration = d;
        this.dimensions = size;
    }

    public Size getDimensions() {
        return this.dimensions;
    }

    public int[] getSeekFrames() {
        return this.seekFrames;
    }

    public double getTotalDuration() {
        return this.totalDuration;
    }

    public int getTotalFrames() {
        return this.totalFrames;
    }

    public Type getType() {
        return this.type;
    }
}
