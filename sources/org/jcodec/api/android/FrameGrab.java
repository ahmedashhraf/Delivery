package org.jcodec.api.android;

import android.graphics.Bitmap;
import java.io.File;
import java.io.IOException;
import java.nio.channels.ReadableByteChannel;
import org.jcodec.api.JCodecException;
import org.jcodec.api.specific.ContainerAdaptor;
import org.jcodec.common.AndroidUtil;
import org.jcodec.common.FileChannelWrapper;
import org.jcodec.common.NIOUtils;
import org.jcodec.common.SeekableByteChannel;
import org.jcodec.common.SeekableDemuxerTrack;

public class FrameGrab extends org.jcodec.api.FrameGrab {
    public FrameGrab(SeekableByteChannel seekableByteChannel) throws IOException, JCodecException {
        super(seekableByteChannel);
    }

    public static Bitmap getFrame(File file, double d) throws IOException, JCodecException {
        FileChannelWrapper fileChannelWrapper;
        try {
            fileChannelWrapper = NIOUtils.readableFileChannel(file);
            try {
                Bitmap frame = ((FrameGrab) new FrameGrab(fileChannelWrapper).seekToSecondPrecise(d)).getFrame();
                NIOUtils.closeQuietly((ReadableByteChannel) fileChannelWrapper);
                return frame;
            } catch (Throwable th) {
                th = th;
                NIOUtils.closeQuietly((ReadableByteChannel) fileChannelWrapper);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            fileChannelWrapper = null;
            NIOUtils.closeQuietly((ReadableByteChannel) fileChannelWrapper);
            throw th;
        }
    }

    public static Bitmap getFrameSloppy(SeekableDemuxerTrack seekableDemuxerTrack, ContainerAdaptor containerAdaptor, int i) throws IOException, JCodecException {
        return ((FrameGrab) new FrameGrab(seekableDemuxerTrack, containerAdaptor).seekToFrameSloppy(i)).getFrame();
    }

    public FrameGrab(SeekableDemuxerTrack seekableDemuxerTrack, ContainerAdaptor containerAdaptor) {
        super(seekableDemuxerTrack, containerAdaptor);
    }

    public static Bitmap getFrameSloppy(SeekableDemuxerTrack seekableDemuxerTrack, ContainerAdaptor containerAdaptor, double d) throws IOException, JCodecException {
        return ((FrameGrab) new FrameGrab(seekableDemuxerTrack, containerAdaptor).seekToSecondSloppy(d)).getFrame();
    }

    public static Bitmap getFrame(SeekableByteChannel seekableByteChannel, double d) throws JCodecException, IOException {
        return ((FrameGrab) new FrameGrab(seekableByteChannel).seekToSecondPrecise(d)).getFrame();
    }

    public Bitmap getFrame() throws IOException {
        return AndroidUtil.toBitmap(getNativeFrame());
    }

    public void getFrame(Bitmap bitmap) throws IOException {
        AndroidUtil.toBitmap(getNativeFrame(), bitmap);
    }

    public static Bitmap getFrame(File file, int i) throws IOException, JCodecException {
        FileChannelWrapper fileChannelWrapper;
        try {
            fileChannelWrapper = NIOUtils.readableFileChannel(file);
            try {
                Bitmap frame = ((FrameGrab) new FrameGrab(fileChannelWrapper).seekToFramePrecise(i)).getFrame();
                NIOUtils.closeQuietly((ReadableByteChannel) fileChannelWrapper);
                return frame;
            } catch (Throwable th) {
                th = th;
                NIOUtils.closeQuietly((ReadableByteChannel) fileChannelWrapper);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            fileChannelWrapper = null;
            NIOUtils.closeQuietly((ReadableByteChannel) fileChannelWrapper);
            throw th;
        }
    }

    public static Bitmap getFrame(SeekableByteChannel seekableByteChannel, int i) throws JCodecException, IOException {
        return ((FrameGrab) new FrameGrab(seekableByteChannel).seekToFramePrecise(i)).getFrame();
    }

    public static Bitmap getFrame(SeekableDemuxerTrack seekableDemuxerTrack, ContainerAdaptor containerAdaptor, int i) throws IOException, JCodecException {
        return ((FrameGrab) new FrameGrab(seekableDemuxerTrack, containerAdaptor).seekToFramePrecise(i)).getFrame();
    }

    public static Bitmap getFrame(SeekableDemuxerTrack seekableDemuxerTrack, ContainerAdaptor containerAdaptor, double d) throws IOException, JCodecException {
        return ((FrameGrab) new FrameGrab(seekableDemuxerTrack, containerAdaptor).seekToSecondPrecise(d)).getFrame();
    }
}
