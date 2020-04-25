package org.jcodec.codecs.mpeg12;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class FixHLSTimestamps extends FixTimestamp {
    private long[] lastPts = new long[256];

    private void doIt(String str, int i) throws IOException {
        Arrays.fill(this.lastPts, -1);
        while (true) {
            File file = new File(String.format(str, new Object[]{Integer.valueOf(i)}));
            System.out.println(file.getAbsolutePath());
            if (file.exists()) {
                fix(file);
                i++;
            } else {
                return;
            }
        }
    }

    public static void main(String[] strArr) throws IOException {
        new FixHLSTimestamps().doIt(strArr[0], Integer.parseInt(strArr[1]));
    }

    /* access modifiers changed from: protected */
    public long doWithTimestamp(int i, long j, boolean z) {
        if (!z) {
            return j;
        }
        long[] jArr = this.lastPts;
        if (jArr[i] == -1) {
            jArr[i] = j;
            return j;
        } else if (isVideo(i)) {
            long[] jArr2 = this.lastPts;
            jArr2[i] = jArr2[i] + 3003;
            return jArr2[i];
        } else if (isAudio(i)) {
            long[] jArr3 = this.lastPts;
            jArr3[i] = jArr3[i] + 1920;
            return jArr3[i];
        } else {
            throw new RuntimeException("Unexpected!!!");
        }
    }
}
