package org.jcodec.movtool.streaming.tracks;

import java.nio.ByteBuffer;
import org.jcodec.codecs.prores.ProresToThumb2x2;
import org.jcodec.codecs.prores.ProresToThumb4x4;
import org.jcodec.codecs.vpx.NopRateControl;
import org.jcodec.codecs.vpx.RateControl;
import org.jcodec.codecs.vpx.VP8Encoder;
import org.jcodec.common.VideoDecoder;
import org.jcodec.common.VideoEncoder;
import org.jcodec.common.model.Size;
import org.jcodec.movtool.streaming.VirtualTrack;

public class Prores2VP8Track extends TranscodeTrack {
    public Prores2VP8Track(VirtualTrack virtualTrack, Size size) {
        super(virtualTrack, size);
    }

    /* access modifiers changed from: protected */
    public void getCodecPrivate(ByteBuffer byteBuffer, Size size) {
    }

    /* access modifiers changed from: protected */
    public VideoDecoder getDecoder(int i) {
        return i == 2 ? new ProresToThumb2x2() : new ProresToThumb4x4();
    }

    /* access modifiers changed from: protected */
    public VideoEncoder getEncoder(int i) {
        return new VP8Encoder((RateControl) new NopRateControl(12));
    }

    /* access modifiers changed from: protected */
    public int getFrameSize(int i, int i2) {
        return 278528;
    }
}
