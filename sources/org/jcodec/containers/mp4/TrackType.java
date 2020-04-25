package org.jcodec.containers.mp4;

import java.util.EnumSet;
import java.util.Iterator;

public enum TrackType {
    VIDEO("vide"),
    SOUND("soun"),
    TIMECODE("tmcd"),
    HINT("hint"),
    TEXT("text"),
    HYPER_TEXT("wtxt"),
    CC("clcp"),
    SUB("sbtl"),
    MUSIC("musi"),
    MPEG1("MPEG"),
    SPRITE("sprt"),
    TWEEN("twen"),
    CHAPTERS("chap"),
    THREE_D("qd3d"),
    STREAMING("strm"),
    OBJECTS("obje");
    
    private String handler;

    private TrackType(String str) {
        this.handler = str;
    }

    public static TrackType fromHandler(String str) {
        Iterator it = EnumSet.allOf(TrackType.class).iterator();
        while (it.hasNext()) {
            TrackType trackType = (TrackType) it.next();
            if (trackType.getHandler().equals(str)) {
                return trackType;
            }
        }
        return null;
    }

    public String getHandler() {
        return this.handler;
    }
}
