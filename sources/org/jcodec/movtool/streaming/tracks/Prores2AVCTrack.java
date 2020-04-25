package org.jcodec.movtool.streaming.tracks;

import java.util.EnumSet;
import java.util.Iterator;
import org.jcodec.codecs.prores.ProresDecoder;
import org.jcodec.codecs.prores.ProresEncoder.Profile;
import org.jcodec.codecs.prores.ProresToThumb2x2;
import org.jcodec.codecs.prores.ProresToThumb4x4;
import org.jcodec.common.VideoDecoder;
import org.jcodec.common.model.Size;
import org.jcodec.movtool.streaming.VirtualTrack;

public class Prores2AVCTrack extends Transcode2AVCTrack {
    public Prores2AVCTrack(VirtualTrack virtualTrack, Size size) {
        super(virtualTrack, size);
    }

    /* access modifiers changed from: protected */
    public void checkFourCC(VirtualTrack virtualTrack) {
        String fourcc = virtualTrack.getCodecMeta().getFourcc();
        if (!"ap4h".equals(fourcc)) {
            Iterator it = EnumSet.allOf(Profile.class).iterator();
            while (it.hasNext()) {
                if (((Profile) it.next()).fourcc.equals(fourcc)) {
                    return;
                }
            }
            throw new IllegalArgumentException("Input track is not ProRes");
        }
    }

    /* access modifiers changed from: protected */
    public VideoDecoder getDecoder(int i) {
        if (i == 0) {
            return new ProresDecoder();
        }
        if (i == 1) {
            return new ProresToThumb4x4();
        }
        if (i == 2) {
            return new ProresToThumb2x2();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Unsupported scale factor: ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }

    /* access modifiers changed from: protected */
    public int selectScaleFactor(Size size) {
        if (size.getWidth() >= 960) {
            return 2;
        }
        return size.getWidth() > 480 ? 1 : 0;
    }
}
