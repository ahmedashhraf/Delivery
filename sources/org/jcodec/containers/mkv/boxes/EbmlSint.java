package org.jcodec.containers.mkv.boxes;

import android.support.p003v4.media.session.PlaybackStateCompat;
import java.nio.ByteBuffer;
import org.jcodec.containers.mkv.util.EbmlUtil;

public class EbmlSint extends EbmlBin {
    public static final long[] signedComplement = {0, 63, 8191, 1048575, 134217727, 17179869183L, 2199023255551L, 281474976710655L, 36028797018963967L};

    public EbmlSint(byte[] bArr) {
        super(bArr);
    }

    public static byte[] convertToBytes(long j) {
        int ebmlSignedLength = ebmlSignedLength(j);
        return EbmlUtil.ebmlEncode(j + signedComplement[ebmlSignedLength], ebmlSignedLength);
    }

    public static int ebmlSignedLength(long j) {
        if (j <= 64 && j >= -63) {
            return 1;
        }
        if (j <= PlaybackStateCompat.f476k0 && j >= -8191) {
            return 2;
        }
        if (j <= PlaybackStateCompat.f483r0 && j >= -1048575) {
            return 3;
        }
        if (j <= 134217728 && j >= -134217727) {
            return 4;
        }
        if (j <= 17179869184L && j >= -17179869183L) {
            return 5;
        }
        if (j > 2199023255552L || j < -2199023255551L) {
            return (j > 281474976710656L || j < -281474976710655L) ? 8 : 7;
        }
        return 6;
    }

    public long get() {
        if (this.data.limit() - this.data.position() == 8) {
            return this.data.duplicate().getLong();
        }
        byte[] array = this.data.array();
        long j = 0;
        for (int length = array.length - 1; length >= 0; length--) {
            j |= (((long) array[length]) & 255) << (((array.length - 1) - length) * 8);
        }
        return j;
    }

    public void set(long j) {
        this.data = ByteBuffer.wrap(convertToBytes(j));
    }
}
