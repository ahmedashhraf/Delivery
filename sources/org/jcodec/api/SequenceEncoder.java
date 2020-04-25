package org.jcodec.api;

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

public class SequenceEncoder {
    private ByteBuffer _out = ByteBuffer.allocate(12441600);

    /* renamed from: ch */
    private SeekableByteChannel f44713ch;
    private H264Encoder encoder = new H264Encoder();
    private int frameNo;
    private MP4Muxer muxer = new MP4Muxer(this.f44713ch, Brand.MP4);
    private FramesMP4MuxerTrack outTrack = this.muxer.addTrack(TrackType.VIDEO, 25);
    private ArrayList<ByteBuffer> ppsList = new ArrayList<>();
    private ArrayList<ByteBuffer> spsList = new ArrayList<>();
    private Picture toEncode;
    private Transform transform = ColorUtil.getTransform(ColorSpace.RGB, this.encoder.getSupportedColorSpaces()[0]);

    public SequenceEncoder(File file) throws IOException {
        this.f44713ch = NIOUtils.writableFileChannel(file);
    }

    public void encodeNativeFrame(Picture picture) throws IOException {
        if (this.toEncode == null) {
            this.toEncode = Picture.create(picture.getWidth(), picture.getHeight(), this.encoder.getSupportedColorSpaces()[0]);
        }
        this.transform.transform(picture, this.toEncode);
        this._out.clear();
        ByteBuffer encodeFrame = this.encoder.encodeFrame(this.toEncode, this._out);
        this.spsList.clear();
        this.ppsList.clear();
        H264Utils.wipePS(encodeFrame, this.spsList, this.ppsList);
        H264Utils.encodeMOVPacket(encodeFrame);
        FramesMP4MuxerTrack framesMP4MuxerTrack = this.outTrack;
        int i = this.frameNo;
        MP4Packet mP4Packet = new MP4Packet(encodeFrame, (long) i, 25, 1, (long) i, true, null, (long) i, 0);
        framesMP4MuxerTrack.addFrame(mP4Packet);
        this.frameNo++;
    }

    public void finish() throws IOException {
        this.outTrack.addSampleEntry(H264Utils.createMOVSampleEntry((List<ByteBuffer>) this.spsList, (List<ByteBuffer>) this.ppsList, 4));
        this.muxer.writeHeader();
        NIOUtils.closeQuietly((ReadableByteChannel) this.f44713ch);
    }
}
