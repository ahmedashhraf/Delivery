package org.jcodec.codecs.mpeg12;

import java.io.File;
import java.io.IOException;

public class SetBaseTimestamp extends FixTimestamp {
    private int baseTs;
    private long firstPts = -1;
    private boolean video;

    public SetBaseTimestamp(boolean z, int i) {
        this.video = z;
        this.baseTs = i;
    }

    public static void main(String[] strArr) throws IOException {
        new SetBaseTimestamp("video".equalsIgnoreCase(strArr[1]), Integer.parseInt(strArr[2])).fix(new File(strArr[0]));
    }

    /* access modifiers changed from: protected */
    public long doWithTimestamp(int i, long j, boolean z) {
        if ((!this.video || !isVideo(i)) && (this.video || !isAudio(i))) {
            return j;
        }
        if (this.firstPts == -1) {
            this.firstPts = j;
        }
        return (j - this.firstPts) + ((long) this.baseTs);
    }
}
