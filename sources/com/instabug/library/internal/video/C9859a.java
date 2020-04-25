package com.instabug.library.internal.video;

import com.instabug.library.util.InstabugSDKLogger;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.ReadableByteChannel;
import java.util.ArrayList;
import java.util.List;
import org.jcodec.codecs.h264.H264Encoder;
import org.jcodec.codecs.h264.H264Utils;
import org.jcodec.common.NIOUtils;
import org.jcodec.common.SeekableByteChannel;
import org.jcodec.common.model.ColorSpace;
import org.jcodec.common.model.Picture;
import org.jcodec.containers.mp4.Brand;
import org.jcodec.containers.mp4.MP4Packet;
import org.jcodec.containers.mp4.TrackType;
import org.jcodec.containers.mp4.muxer.FramesMP4MuxerTrack;
import org.jcodec.containers.mp4.muxer.MP4Muxer;
import org.jcodec.scale.ColorUtil;
import org.jcodec.scale.Transform;
import p205i.p471b.p472a.p473a.p474c.C13938g;

/* renamed from: com.instabug.library.internal.video.a */
/* compiled from: InstabugSequenceEncoder */
public class C9859a {

    /* renamed from: k */
    private static transient /* synthetic */ boolean[] f26119k;

    /* renamed from: a */
    private SeekableByteChannel f26120a;

    /* renamed from: b */
    private Picture f26121b;

    /* renamed from: c */
    private Transform f26122c;

    /* renamed from: d */
    private H264Encoder f26123d;

    /* renamed from: e */
    private ArrayList<ByteBuffer> f26124e;

    /* renamed from: f */
    private ArrayList<ByteBuffer> f26125f;

    /* renamed from: g */
    private FramesMP4MuxerTrack f26126g;

    /* renamed from: h */
    private ByteBuffer f26127h;

    /* renamed from: i */
    private int f26128i;

    /* renamed from: j */
    private MP4Muxer f26129j = new MP4Muxer(this.f26120a, Brand.MP4);

    public C9859a(File file) throws IOException {
        boolean[] b = m45909b();
        b[0] = true;
        this.f26120a = NIOUtils.writableFileChannel(file);
        b[1] = true;
        b[2] = true;
        this.f26126g = this.f26129j.addTrack(TrackType.VIDEO, 8);
        b[3] = true;
        this.f26127h = ByteBuffer.allocate(12441600);
        b[4] = true;
        this.f26123d = new H264Encoder();
        b[5] = true;
        this.f26122c = ColorUtil.getTransform(ColorSpace.RGB, this.f26123d.getSupportedColorSpaces()[0]);
        b[6] = true;
        this.f26124e = new ArrayList<>();
        b[7] = true;
        this.f26125f = new ArrayList<>();
        b[8] = true;
    }

    /* renamed from: b */
    private static /* synthetic */ boolean[] m45909b() {
        boolean[] zArr = f26119k;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(-7347280869419885218L, "com/instabug/library/internal/video/InstabugSequenceEncoder", 25);
        f26119k = a;
        return a;
    }

    /* renamed from: a */
    public void mo35100a(Picture picture) throws IOException {
        boolean[] b = m45909b();
        if (this.f26121b != null) {
            b[9] = true;
        } else {
            b[10] = true;
            this.f26121b = Picture.create(picture.getWidth(), picture.getHeight(), this.f26123d.getSupportedColorSpaces()[0]);
            b[11] = true;
        }
        this.f26122c.transform(picture, this.f26121b);
        b[12] = true;
        this.f26127h.clear();
        b[13] = true;
        ByteBuffer encodeFrame = this.f26123d.encodeFrame(this.f26121b, this.f26127h);
        b[14] = true;
        this.f26124e.clear();
        b[15] = true;
        this.f26125f.clear();
        b[16] = true;
        H264Utils.wipePS(encodeFrame, this.f26124e, this.f26125f);
        b[17] = true;
        H264Utils.encodeMOVPacket(encodeFrame);
        b[18] = true;
        FramesMP4MuxerTrack framesMP4MuxerTrack = this.f26126g;
        int i = this.f26128i;
        MP4Packet mP4Packet = new MP4Packet(encodeFrame, (long) (i * 2), 8, 1, (long) i, true, null, (long) (i * 2), 0);
        framesMP4MuxerTrack.addFrame(mP4Packet);
        this.f26128i++;
        b[19] = true;
    }

    /* renamed from: a */
    public void mo35099a() throws IOException, OutOfMemoryError {
        boolean[] b = m45909b();
        try {
            this.f26126g.addSampleEntry(H264Utils.createMOVSampleEntry((List<ByteBuffer>) this.f26124e, (List<ByteBuffer>) this.f26125f, 4));
            b[20] = true;
            this.f26129j.writeHeader();
            b[21] = true;
        } catch (IndexOutOfBoundsException e) {
            b[22] = true;
            InstabugSDKLogger.wtf(this, "Something went wrong while generating video", e);
            b[23] = true;
        }
        NIOUtils.closeQuietly((ReadableByteChannel) this.f26120a);
        b[24] = true;
    }
}
