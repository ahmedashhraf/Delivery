package org.jcodec.common;

import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.ReadableByteChannel;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.jcodec.codecs.h264.H264Decoder;
import org.jcodec.codecs.mpeg12.MPEGDecoder;
import org.jcodec.codecs.ppm.PPMEncoder;
import org.jcodec.codecs.prores.ProresDecoder;
import org.jcodec.common.model.ColorSpace;
import org.jcodec.common.model.Picture;
import org.jcodec.common.tools.MathUtil;
import org.jcodec.containers.mp4.demuxer.MP4Demuxer;
import org.jcodec.containers.mps.MPSDemuxer;
import org.jcodec.containers.mps.MTSDemuxer;
import org.jcodec.scale.ColorUtil;
import org.jcodec.scale.Transform;
import p205i.p471b.p472a.p473a.p474c.p475i.C13959t;

public class JCodecUtil {
    private static final VideoDecoder[] knownDecoders = {new ProresDecoder(), new MPEGDecoder(), new H264Decoder()};

    public enum Format {
        MOV,
        MPEG_PS,
        MPEG_TS
    }

    /* renamed from: org.jcodec.common.JCodecUtil$a */
    static class C15535a extends ThreadPoolExecutor {
        C15535a(int i, int i2, long j, TimeUnit timeUnit, BlockingQueue blockingQueue) {
            super(i, i2, j, timeUnit, blockingQueue);
        }

        /* access modifiers changed from: protected */
        public <T> RunnableFuture<T> newTaskFor(Callable<T> callable) {
            return new PriorityFuture(super.newTaskFor(callable), ((PriorityCallable) callable).getPriority());
        }
    }

    public static byte[] asciiString(String str) {
        char[] charArray = str.toCharArray();
        byte[] bArr = new byte[charArray.length];
        for (int i = 0; i < charArray.length; i++) {
            bArr[i] = (byte) charArray[i];
        }
        return bArr;
    }

    public static VideoDecoder detectDecoder(ByteBuffer byteBuffer) {
        VideoDecoder[] videoDecoderArr;
        VideoDecoder videoDecoder = null;
        int i = 0;
        for (VideoDecoder videoDecoder2 : knownDecoders) {
            int probe = videoDecoder2.probe(byteBuffer);
            if (probe > i) {
                videoDecoder = videoDecoder2;
                i = probe;
            }
        }
        return videoDecoder;
    }

    public static Format detectFormat(File file) throws IOException {
        return detectFormat(NIOUtils.fetchFrom(file, 204800));
    }

    public static int[] getAsIntArray(ByteBuffer byteBuffer, int i) {
        byte[] bArr = new byte[i];
        int[] iArr = new int[i];
        byteBuffer.get(bArr);
        for (int i2 = 0; i2 < bArr.length; i2++) {
            iArr[i2] = bArr[i2] & 255;
        }
        return iArr;
    }

    public static ThreadPoolExecutor getPriorityExecutor(int i) {
        C15535a aVar = new C15535a(i, i, 0, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(10, PriorityFuture.COMP));
        return aVar;
    }

    public static VideoDecoder getVideoDecoder(String str) {
        if ("apch".equals(str) || "apcs".equals(str) || "apco".equals(str) || "apcn".equals(str) || "ap4h".equals(str)) {
            return new ProresDecoder();
        }
        if ("m2v1".equals(str)) {
            return new MPEGDecoder();
        }
        return null;
    }

    public static int readBER32(ByteBuffer byteBuffer) {
        byte b = 0;
        for (int i = 0; i < 4; i++) {
            byte b2 = byteBuffer.get();
            b = (b << 7) | (b2 & Byte.MAX_VALUE);
            if (((b2 & 255) >> 7) == 0) {
                break;
            }
        }
        return b;
    }

    public static String removeExtension(String str) {
        if (str == null) {
            return null;
        }
        return str.replaceAll("\\.[^\\.]+$", "");
    }

    public static void savePictureAsPPM(Picture picture, File file) throws IOException {
        Transform transform = ColorUtil.getTransform(picture.getColor(), ColorSpace.RGB);
        Picture create = Picture.create(picture.getWidth(), picture.getHeight(), ColorSpace.RGB);
        transform.transform(picture, create);
        NIOUtils.writeTo(new PPMEncoder().encodeFrame(create), file);
    }

    public static void writeBER32(ByteBuffer byteBuffer, int i) {
        byteBuffer.put((byte) ((i >> 21) | 128));
        byteBuffer.put((byte) ((i >> 14) | 128));
        byteBuffer.put((byte) ((i >> 7) | 128));
        byteBuffer.put((byte) (i & C13959t.f40827P1));
    }

    public static void writeBER32Var(ByteBuffer byteBuffer, int i) {
        int log2 = MathUtil.log2(i);
        for (int i2 = 0; i2 < 4 && log2 > 0; i2++) {
            log2 -= 7;
            int i3 = i >> log2;
            if (log2 > 0) {
                i3 |= 128;
            }
            byteBuffer.put((byte) i3);
        }
    }

    public static Format detectFormat(ReadableByteChannel readableByteChannel) throws IOException {
        return detectFormat(NIOUtils.fetchFrom(readableByteChannel, 204800));
    }

    public static Format detectFormat(ByteBuffer byteBuffer) {
        Format format;
        int probe = MP4Demuxer.probe(byteBuffer.duplicate());
        int probe2 = MPSDemuxer.probe(byteBuffer.duplicate());
        int probe3 = MTSDemuxer.probe(byteBuffer.duplicate());
        if (probe == 0 && probe2 == 0 && probe3 == 0) {
            return null;
        }
        if (probe > probe2) {
            if (probe > probe3) {
                format = Format.MOV;
                return format;
            }
        } else if (probe2 > probe3) {
            format = Format.MPEG_PS;
            return format;
        }
        format = Format.MPEG_TS;
        return format;
    }
}
