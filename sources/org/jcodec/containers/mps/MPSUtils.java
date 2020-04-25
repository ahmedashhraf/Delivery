package org.jcodec.containers.mps;

import com.facebook.imagepipeline.producers.HttpUrlConnectionNetworkFetcher;
import com.google.common.base.C5785c;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import org.jcodec.common.NIOUtils;
import org.jcodec.common.model.Rational;
import org.jcodec.containers.mps.MPSDemuxer.PESPacket;

public class MPSUtils {
    public static final int AUDIO_MAX = 479;
    public static final int AUDIO_MIN = 448;
    public static final int PACK = 442;
    public static final int PRIVATE_1 = 445;
    public static final int PRIVATE_2 = 447;
    public static final int PSM = 444;
    public static final int SYSTEM = 443;
    public static final int VIDEO_MAX = 495;
    public static final int VIDEO_MIN = 480;
    public static Class<? extends MPEGMediaDescriptor>[] dMapping = new Class[256];

    public static class AACAudioDescriptor extends MPEGMediaDescriptor {
        private int channel;
        private int flags;
        private int profile;

        public void parse(ByteBuffer byteBuffer) {
            super.parse(byteBuffer);
            this.profile = byteBuffer.get() & 255;
            this.channel = byteBuffer.get() & 255;
            this.flags = byteBuffer.get() & 255;
        }
    }

    public static class AVCVideoDescriptor extends MPEGMediaDescriptor {
        private int flags;
        private int level;
        private int profileIdc;

        public void parse(ByteBuffer byteBuffer) {
            super.parse(byteBuffer);
            this.profileIdc = byteBuffer.get() & 255;
            this.flags = byteBuffer.get() & 255;
            this.level = byteBuffer.get() & 255;
        }
    }

    public static class AudioStreamDescriptor extends MPEGMediaDescriptor {
        public void parse(ByteBuffer byteBuffer) {
            super.parse(byteBuffer);
            byteBuffer.get();
        }
    }

    public static class ISO639LanguageDescriptor extends MPEGMediaDescriptor {
        public void parse(ByteBuffer byteBuffer) {
            super.parse(byteBuffer);
            while (byteBuffer.remaining() >= 4) {
                byteBuffer.getInt();
            }
        }
    }

    public static class MP4TextDescriptor extends MPEGMediaDescriptor {
    }

    public static class MPEGMediaDescriptor {
        private int len;
        private int tag;

        public void parse(ByteBuffer byteBuffer) {
            this.tag = byteBuffer.get() & 255;
            this.len = byteBuffer.get() & 255;
        }
    }

    public static class Mpeg4AudioDescriptor extends MPEGMediaDescriptor {
        private int profileLevel;

        public void parse(ByteBuffer byteBuffer) {
            super.parse(byteBuffer);
            this.profileLevel = byteBuffer.get() & 255;
        }
    }

    public static class Mpeg4VideoDescriptor extends MPEGMediaDescriptor {
        private int profileLevel;

        public void parse(ByteBuffer byteBuffer) {
            super.parse(byteBuffer);
            this.profileLevel = byteBuffer.get() & 255;
        }
    }

    public static abstract class PESReader {
        private int lenFieldLeft;
        private int marker = -1;
        private boolean pes;
        private ByteBuffer pesBuffer = ByteBuffer.allocate(2097152);
        private long pesFileStart = -1;
        private int pesLeft;
        private int pesLen;
        private int stream;

        private void flushMarker() {
            this.pesBuffer.put((byte) (this.marker >>> 24));
            this.pesBuffer.put((byte) ((this.marker >>> 16) & 255));
            this.pesBuffer.put((byte) ((this.marker >>> 8) & 255));
            this.pesBuffer.put((byte) (this.marker & 255));
        }

        private void pes1(ByteBuffer byteBuffer, long j, int i, int i2) {
            byteBuffer.flip();
            pes(byteBuffer, j, i, i2);
            byteBuffer.clear();
        }

        public void analyseBuffer(ByteBuffer byteBuffer, long j) {
            int position = byteBuffer.position();
            while (byteBuffer.hasRemaining()) {
                if (this.pesLeft > 0) {
                    int min = Math.min(byteBuffer.remaining(), this.pesLeft);
                    this.pesBuffer.put(NIOUtils.read(byteBuffer, min));
                    this.pesLeft -= min;
                    if (this.pesLeft == 0) {
                        long position2 = (j + ((long) byteBuffer.position())) - ((long) position);
                        ByteBuffer byteBuffer2 = this.pesBuffer;
                        long j2 = this.pesFileStart;
                        pes1(byteBuffer2, j2, (int) (position2 - j2), this.stream);
                        this.pesFileStart = -1;
                        this.pes = false;
                        this.stream = -1;
                    }
                } else {
                    ByteBuffer byteBuffer3 = byteBuffer;
                    byte b = byteBuffer.get() & 255;
                    if (this.pes) {
                        this.pesBuffer.put((byte) (this.marker >>> 24));
                    }
                    this.marker = (this.marker << 8) | b;
                    int i = this.marker;
                    if (i < 443 || i > 495) {
                        int i2 = this.marker;
                        if (i2 < 441 || i2 > 511) {
                            int i3 = this.lenFieldLeft;
                            if (i3 > 0) {
                                this.pesLen = b | (this.pesLen << 8);
                                this.lenFieldLeft = i3 - 1;
                                if (this.lenFieldLeft == 0) {
                                    int i4 = this.pesLen;
                                    this.pesLeft = i4;
                                    if (i4 != 0) {
                                        flushMarker();
                                        this.marker = -1;
                                    }
                                }
                            }
                        } else {
                            if (this.pes) {
                                long position3 = ((j + ((long) byteBuffer.position())) - ((long) position)) - 4;
                                ByteBuffer byteBuffer4 = this.pesBuffer;
                                long j3 = this.pesFileStart;
                                pes1(byteBuffer4, j3, (int) (position3 - j3), this.stream);
                            }
                            this.pesFileStart = -1;
                            this.pes = false;
                            this.stream = -1;
                        }
                    } else {
                        long position4 = ((j + ((long) byteBuffer.position())) - ((long) position)) - 4;
                        if (this.pes) {
                            ByteBuffer byteBuffer5 = this.pesBuffer;
                            long j4 = this.pesFileStart;
                            pes1(byteBuffer5, j4, (int) (position4 - j4), this.stream);
                        }
                        this.pesFileStart = position4;
                        this.pes = true;
                        this.stream = this.marker & 255;
                        this.lenFieldLeft = 2;
                        this.pesLen = 0;
                    }
                }
            }
        }

        public void finishRead() {
            if (this.pesLeft <= 4) {
                flushMarker();
                ByteBuffer byteBuffer = this.pesBuffer;
                pes1(byteBuffer, this.pesFileStart, byteBuffer.position(), this.stream);
            }
        }

        /* access modifiers changed from: protected */
        public abstract void pes(ByteBuffer byteBuffer, long j, int i, int i2);
    }

    public static class VideoStreamDescriptor extends MPEGMediaDescriptor {
        private int chromaFormat;
        private int constrainedParameter;
        private int frameRateCode;
        private int frameRateExtension;
        Rational[] frameRates = {null, new Rational(24000, 1001), new Rational(24, 1), new Rational(25, 1), new Rational(HttpUrlConnectionNetworkFetcher.HTTP_DEFAULT_TIMEOUT, 1001), new Rational(30, 1), new Rational(50, 1), new Rational(60000, 1001), new Rational(60, 1), null, null, null, null, null, null, null};
        private boolean mpeg1Only;
        private int multipleFrameRate;
        private int profileAndLevel;
        private int stillPicture;

        public Rational getFrameRate() {
            return this.frameRates[this.frameRateCode];
        }

        public void parse(ByteBuffer byteBuffer) {
            super.parse(byteBuffer);
            byte b = byteBuffer.get() & 255;
            this.multipleFrameRate = (b >> 7) & 1;
            this.frameRateCode = (b >> 3) & 15;
            this.mpeg1Only = ((b >> 2) & 1) == 0;
            this.constrainedParameter = (b >> 1) & 1;
            this.stillPicture = b & 1;
            if (!this.mpeg1Only) {
                this.profileAndLevel = byteBuffer.get() & 255;
                byte b2 = byteBuffer.get() & 255;
                this.chromaFormat = b2 >> 6;
                this.frameRateExtension = (b2 >> 5) & 1;
            }
        }
    }

    /* renamed from: $ */
    static int m68688$(int i) {
        return i & 255;
    }

    static {
        Object[] objArr = dMapping;
        objArr[2] = VideoStreamDescriptor.class;
        objArr[3] = AudioStreamDescriptor.class;
        objArr[10] = ISO639LanguageDescriptor.class;
        objArr[27] = Mpeg4VideoDescriptor.class;
        objArr[28] = Mpeg4AudioDescriptor.class;
        objArr[40] = AVCVideoDescriptor.class;
        objArr[43] = AACAudioDescriptor.class;
    }

    public static boolean audioStream(int i) {
        return (i >= m68688$(AUDIO_MIN) && i <= m68688$(AUDIO_MAX)) || i == m68688$(PRIVATE_1) || i == m68688$(PRIVATE_2);
    }

    public static final boolean mediaMarker(int i) {
        return (i >= 448 && i <= 495) || i == 445 || i == 447;
    }

    public static final boolean mediaStream(int i) {
        return (i >= m68688$(AUDIO_MIN) && i <= m68688$(VIDEO_MAX)) || i == m68688$(PRIVATE_1) || i == m68688$(PRIVATE_2);
    }

    public static PESPacket mpeg1Pes(int i, int i2, int i3, ByteBuffer byteBuffer, long j) {
        long j2;
        long j3;
        ByteBuffer byteBuffer2 = byteBuffer;
        byte b = i;
        while (b == 255) {
            b = byteBuffer.get() & 255;
        }
        if ((b & 192) == 64) {
            byteBuffer.get();
            b = byteBuffer.get() & 255;
        }
        int i4 = b & 240;
        if (i4 == 32) {
            j3 = readTs(byteBuffer2, b);
            j2 = -1;
        } else if (i4 == 48) {
            long readTs = readTs(byteBuffer2, b);
            j2 = readTs(byteBuffer);
            j3 = readTs;
        } else if (b == 15) {
            j3 = -1;
            j2 = -1;
        } else {
            throw new RuntimeException("Invalid data");
        }
        PESPacket pESPacket = new PESPacket(null, j3, i3, i2, j, j2);
        return pESPacket;
    }

    public static PESPacket mpeg2Pes(int i, int i2, int i3, ByteBuffer byteBuffer, long j) {
        long j2;
        long j3;
        ByteBuffer byteBuffer2 = byteBuffer;
        byte b = byteBuffer.get() & 255;
        byte b2 = byteBuffer.get() & 255 & 192;
        if (b2 == 128) {
            long readTs = readTs(byteBuffer);
            NIOUtils.skip(byteBuffer2, b - 5);
            j2 = -1;
            j3 = readTs;
        } else if (b2 == 192) {
            long readTs2 = readTs(byteBuffer);
            long readTs3 = readTs(byteBuffer);
            NIOUtils.skip(byteBuffer2, b - 10);
            j3 = readTs2;
            j2 = readTs3;
        } else {
            NIOUtils.skip(byteBuffer2, b);
            j3 = -1;
            j2 = -1;
        }
        PESPacket pESPacket = new PESPacket(null, j3, i3, i2, j, j2);
        return pESPacket;
    }

    public static List<MPEGMediaDescriptor> parseDescriptors(ByteBuffer byteBuffer) {
        ArrayList arrayList = new ArrayList();
        while (byteBuffer.remaining() >= 2) {
            byte b = byteBuffer.get() & 255;
            ByteBuffer read = NIOUtils.read(byteBuffer, (int) byteBuffer.get() & 255);
            Class<? extends MPEGMediaDescriptor>[] clsArr = dMapping;
            if (clsArr[b] != null) {
                try {
                    ((MPEGMediaDescriptor) clsArr[b].newInstance()).parse(read);
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }
        }
        return arrayList;
    }

    public static final boolean psMarker(int i) {
        return i >= 445 && i <= 495;
    }

    public static PESPacket readPESHeader(ByteBuffer byteBuffer, long j) {
        int i = byteBuffer.getInt() & 255;
        short s = byteBuffer.getShort();
        if (i != 191) {
            byte b = byteBuffer.get() & 255;
            if ((b & 192) == 128) {
                return mpeg2Pes(b, s, i, byteBuffer, j);
            }
            return mpeg1Pes(b, s, i, byteBuffer, j);
        }
        PESPacket pESPacket = new PESPacket(null, -1, i, s, j, -1);
        return pESPacket;
    }

    public static long readTs(ByteBuffer byteBuffer, int i) {
        return ((long) ((byteBuffer.get() & 255) >> 1)) | ((((long) i) & 14) << 29) | ((long) ((byteBuffer.get() & 255) << C5785c.f16707z)) | ((long) (((byteBuffer.get() & 255) >> 1) << 15)) | ((long) ((byteBuffer.get() & 255) << 7));
    }

    public static boolean videoMarker(int i) {
        return i >= 480 && i <= 495;
    }

    public static final boolean videoStream(int i) {
        return i >= m68688$(VIDEO_MIN) && i <= m68688$(VIDEO_MAX);
    }

    public static void writeTs(ByteBuffer byteBuffer, long j) {
        byteBuffer.put((byte) ((int) ((j >> 29) << 1)));
        byteBuffer.put((byte) ((int) (j >> 22)));
        byteBuffer.put((byte) ((int) ((j >> 15) << 1)));
        byteBuffer.put((byte) ((int) (j >> 7)));
        byteBuffer.put((byte) ((int) (j >> 1)));
    }

    public static long readTs(ByteBuffer byteBuffer) {
        return ((((long) byteBuffer.get()) & 14) << 29) | ((long) ((byteBuffer.get() & 255) << C5785c.f16707z)) | ((long) (((byteBuffer.get() & 255) >> 1) << 15)) | ((long) ((byteBuffer.get() & 255) << 7)) | ((long) ((byteBuffer.get() & 255) >> 1));
    }
}
