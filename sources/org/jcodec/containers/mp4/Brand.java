package org.jcodec.containers.mp4;

import java.util.Arrays;
import org.jcodec.containers.mp4.boxes.FileTypeBox;

public enum Brand {
    MOV("qt  ", 512, new String[]{"qt  "}),
    MP4("isom", 512, new String[]{"isom", "iso2", "avc1", "mp41"});
    
    private FileTypeBox ftyp;

    private Brand(String str, int i, String[] strArr) {
        this.ftyp = new FileTypeBox(str, i, Arrays.asList(strArr));
    }

    public FileTypeBox getFileTypeBox() {
        return this.ftyp;
    }
}
