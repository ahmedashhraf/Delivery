package org.jcodec.movtool.streaming.tracks;

import java.io.IOException;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import org.jcodec.codecs.h264.H264Encoder;
import org.jcodec.codecs.h264.H264Utils;
import org.jcodec.codecs.h264.encode.H264FixedRateControl;
import org.jcodec.codecs.mpeg12.MPEGDecoder;
import org.jcodec.codecs.mpeg12.Mpeg2Thumb2x2;
import org.jcodec.codecs.mpeg12.Mpeg2Thumb4x4;
import org.jcodec.common.VideoDecoder;
import org.jcodec.common.logging.Logger;
import org.jcodec.common.model.ColorSpace;
import org.jcodec.common.model.Picture;
import org.jcodec.common.model.Rect;
import org.jcodec.common.model.Size;
import org.jcodec.scale.ColorUtil;
import org.jcodec.scale.Transform;

public class MPEGToAVCTranscoder {
    private VideoDecoder decoder;
    private H264Encoder encoder;
    private Picture pic0;
    private Picture pic1;

    /* renamed from: rc */
    private H264FixedRateControl f44922rc = new H264FixedRateControl(1024);
    private int scaleFactor;
    private int thumbHeight;
    private int thumbWidth;
    private Transform transform;

    public MPEGToAVCTranscoder(int i) {
        this.scaleFactor = i;
        this.decoder = getDecoder(i);
        this.encoder = new H264Encoder(this.f44922rc);
    }

    /* access modifiers changed from: protected */
    public VideoDecoder getDecoder(int i) {
        if (i == 0) {
            return new MPEGDecoder();
        }
        if (i == 1) {
            return new Mpeg2Thumb4x4();
        }
        if (i == 2) {
            return new Mpeg2Thumb2x2();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Unsupported scale factor: ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }

    public ByteBuffer transcodeFrame(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, boolean z, int i) throws IOException {
        if (byteBuffer == null) {
            return null;
        }
        if (this.pic0 == null) {
            Size size = MPEGDecoder.getSize(byteBuffer.duplicate());
            this.thumbWidth = size.getWidth() >> this.scaleFactor;
            this.thumbHeight = size.getHeight() >> this.scaleFactor;
            this.pic0 = Picture.create(((this.thumbWidth + 8) >> 4) << 4, (((this.thumbHeight + 8) >> 4) + 1) << 4, ColorSpace.YUV444);
        }
        Picture decodeFrame = this.decoder.decodeFrame(byteBuffer, this.pic0.getData());
        if (this.pic1 == null) {
            this.pic1 = Picture.create(decodeFrame.getWidth(), decodeFrame.getHeight(), this.encoder.getSupportedColorSpaces()[0]);
            this.transform = ColorUtil.getTransform(decodeFrame.getColor(), this.encoder.getSupportedColorSpaces()[0]);
        }
        Transform transform2 = this.transform;
        if (transform2 != null) {
            transform2.transform(decodeFrame, this.pic1);
            decodeFrame = this.pic1;
        }
        this.pic1.setCrop(new Rect(0, 0, this.thumbWidth, this.thumbHeight));
        int i2 = 1024;
        do {
            try {
                this.encoder.encodeFrame(decodeFrame, byteBuffer2, z, i);
                break;
            } catch (BufferOverflowException unused) {
                StringBuilder sb = new StringBuilder();
                sb.append("Abandon frame, buffer too small: ");
                sb.append(byteBuffer2.capacity());
                Logger.warn(sb.toString());
                i2 -= 10;
                this.f44922rc.setRate(i2);
                if (i2 <= 10) {
                }
            }
        } while (i2 <= 10);
        this.f44922rc.setRate(1024);
        H264Utils.encodeMOVPacket(byteBuffer2);
        return byteBuffer2;
    }
}
