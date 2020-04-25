package org.jcodec.movtool.streaming.tracks;

import org.jcodec.codecs.mjpeg.JpegDecoder;
import org.jcodec.codecs.mjpeg.JpegToThumb2x2;
import org.jcodec.codecs.mjpeg.JpegToThumb4x4;
import org.jcodec.common.VideoDecoder;
import org.jcodec.common.model.Size;
import org.jcodec.movtool.streaming.VideoCodecMeta;
import org.jcodec.movtool.streaming.VirtualTrack;

public class Jpeg2AVCTrack extends Transcode2AVCTrack {
    public Jpeg2AVCTrack(VirtualTrack virtualTrack, Size size) {
        super(virtualTrack, size);
    }

    /* access modifiers changed from: protected */
    public void checkFourCC(VirtualTrack virtualTrack) {
        String fourcc = virtualTrack.getCodecMeta().getFourcc();
        if (!"jpeg".equals(fourcc) && !"mjpa".equals(fourcc)) {
            throw new IllegalArgumentException("Input track is not Jpeg");
        }
    }

    /* access modifiers changed from: protected */
    public VideoDecoder getDecoder(int i) {
        VideoCodecMeta videoCodecMeta = (VideoCodecMeta) this.src.getCodecMeta();
        if (i == 0) {
            return new JpegDecoder(videoCodecMeta.isInterlaced(), videoCodecMeta.isTopFieldFirst());
        }
        if (i == 1) {
            return new JpegToThumb4x4(videoCodecMeta.isInterlaced(), videoCodecMeta.isTopFieldFirst());
        }
        if (i == 2) {
            return new JpegToThumb2x2(videoCodecMeta.isInterlaced(), videoCodecMeta.isTopFieldFirst());
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
