package org.jcodec.codecs.wav;

import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.ReadableByteChannel;
import java.nio.channels.WritableByteChannel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.jcodec.common.AudioFormat;
import org.jcodec.common.FileChannelWrapper;
import org.jcodec.common.IOUtils;
import org.jcodec.common.JCodecUtil;
import org.jcodec.common.NIOUtils;
import org.jcodec.common.model.ChannelLabel;

public class WavHeader {
    public static final int WAV_HEADER_SIZE = 44;
    static ChannelLabel[] mapping = {ChannelLabel.FRONT_LEFT, ChannelLabel.FRONT_RIGHT, ChannelLabel.CENTER, ChannelLabel.LFE, ChannelLabel.REAR_LEFT, ChannelLabel.REAR_RIGHT, ChannelLabel.FRONT_CENTER_LEFT, ChannelLabel.FRONT_CENTER_RIGHT, ChannelLabel.REAR_CENTER, ChannelLabel.SIDE_LEFT, ChannelLabel.SIDE_RIGHT, ChannelLabel.CENTER, ChannelLabel.FRONT_LEFT, ChannelLabel.CENTER, ChannelLabel.FRONT_RIGHT, ChannelLabel.REAR_LEFT, ChannelLabel.REAR_CENTER, ChannelLabel.REAR_RIGHT, ChannelLabel.STEREO_LEFT, ChannelLabel.STEREO_RIGHT};
    public String chunkId;
    public int chunkSize;
    public int dataOffset;
    public long dataSize;
    public FmtChunk fmt;
    public String format;

    public static class FmtChunk {
        public short audioFormat;
        public short bitsPerSample;
        public short blockAlign;
        public int byteRate;
        public short numChannels;
        public int sampleRate;

        public FmtChunk() {
            this.audioFormat = 1;
        }

        public static FmtChunk get(ByteBuffer byteBuffer) throws IOException {
            ByteOrder order = byteBuffer.order();
            try {
                byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
                FmtChunk fmtChunk = new FmtChunk(byteBuffer.getShort(), byteBuffer.getShort(), byteBuffer.getInt(), byteBuffer.getInt(), byteBuffer.getShort(), byteBuffer.getShort());
                return fmtChunk;
            } finally {
                byteBuffer.order(order);
            }
        }

        public void put(ByteBuffer byteBuffer) throws IOException {
            ByteOrder order = byteBuffer.order();
            byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
            byteBuffer.putShort(this.audioFormat);
            byteBuffer.putShort(this.numChannels);
            byteBuffer.putInt(this.sampleRate);
            byteBuffer.putInt(this.byteRate);
            byteBuffer.putShort(this.blockAlign);
            byteBuffer.putShort(this.bitsPerSample);
            byteBuffer.order(order);
        }

        public int size() {
            return 16;
        }

        public FmtChunk(short s, short s2, int i, int i2, short s3, short s4) {
            this.audioFormat = s;
            this.numChannels = s2;
            this.sampleRate = i;
            this.byteRate = i2;
            this.blockAlign = s3;
            this.bitsPerSample = s4;
        }

        public FmtChunk(FmtChunk fmtChunk) {
            this(fmtChunk.audioFormat, fmtChunk.numChannels, fmtChunk.sampleRate, fmtChunk.byteRate, fmtChunk.blockAlign, fmtChunk.bitsPerSample);
        }
    }

    public static class FmtChunkExtended extends FmtChunk {
        short bitsPerCodedSample;
        short cbSize;
        int channelLayout;
        int guid;

        public FmtChunkExtended(FmtChunk fmtChunk, short s, short s2, int i, int i2) {
            super(fmtChunk);
            this.cbSize = s;
            this.bitsPerCodedSample = s2;
            this.channelLayout = i;
            this.guid = i2;
        }

        public static FmtChunk read(ByteBuffer byteBuffer) throws IOException {
            FmtChunk fmtChunk = FmtChunk.get(byteBuffer);
            ByteOrder order = byteBuffer.order();
            try {
                byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
                FmtChunkExtended fmtChunkExtended = new FmtChunkExtended(fmtChunk, byteBuffer.getShort(), byteBuffer.getShort(), byteBuffer.getInt(), byteBuffer.getInt());
                return fmtChunkExtended;
            } finally {
                byteBuffer.order(order);
            }
        }

        public ChannelLabel[] getLabels() {
            ArrayList arrayList = new ArrayList();
            int i = 0;
            while (true) {
                ChannelLabel[] channelLabelArr = WavHeader.mapping;
                if (i >= channelLabelArr.length) {
                    return (ChannelLabel[]) arrayList.toArray(new ChannelLabel[0]);
                }
                if ((this.channelLayout & (1 << i)) != 0) {
                    arrayList.add(channelLabelArr[i]);
                }
                i++;
            }
        }

        public void put(ByteBuffer byteBuffer) throws IOException {
            super.put(byteBuffer);
            ByteOrder order = byteBuffer.order();
            byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
            byteBuffer.putShort(this.cbSize);
            byteBuffer.putShort(this.bitsPerCodedSample);
            byteBuffer.putInt(this.channelLayout);
            byteBuffer.putInt(this.guid);
            byteBuffer.order(order);
        }

        public int size() {
            return super.size() + 12;
        }

        public FmtChunkExtended(FmtChunkExtended fmtChunkExtended) {
            this(fmtChunkExtended, fmtChunkExtended.cbSize, fmtChunkExtended.bitsPerCodedSample, fmtChunkExtended.channelLayout, fmtChunkExtended.guid);
        }
    }

    public WavHeader(String str, int i, String str2, FmtChunk fmtChunk, int i2, long j) {
        this.chunkId = str;
        this.chunkSize = i;
        this.format = str2;
        this.fmt = fmtChunk;
        this.dataOffset = i2;
        this.dataSize = j;
    }

    public static long calcDataSize(int i, int i2, long j) {
        return j * ((long) i) * ((long) i2);
    }

    public static WavHeader copyWithChannels(WavHeader wavHeader, int i) {
        WavHeader wavHeader2 = new WavHeader(wavHeader);
        wavHeader2.fmt.numChannels = (short) i;
        return wavHeader2;
    }

    public static WavHeader copyWithRate(WavHeader wavHeader, int i) {
        WavHeader wavHeader2 = new WavHeader(wavHeader);
        wavHeader2.fmt.sampleRate = i;
        return wavHeader2;
    }

    public static WavHeader create(AudioFormat audioFormat, int i) {
        WavHeader emptyWavHeader = emptyWavHeader();
        emptyWavHeader.dataSize = (long) i;
        new FmtChunk();
        int sampleSizeInBits = audioFormat.getSampleSizeInBits();
        int i2 = sampleSizeInBits / 8;
        audioFormat.getSampleRate();
        FmtChunk fmtChunk = emptyWavHeader.fmt;
        fmtChunk.bitsPerSample = (short) sampleSizeInBits;
        fmtChunk.blockAlign = audioFormat.getFrameSize();
        emptyWavHeader.fmt.byteRate = audioFormat.getFrameRate() * audioFormat.getFrameSize();
        emptyWavHeader.fmt.numChannels = (short) audioFormat.getChannels();
        emptyWavHeader.fmt.sampleRate = audioFormat.getSampleRate();
        return emptyWavHeader;
    }

    public static WavHeader emptyWavHeader() {
        WavHeader wavHeader = new WavHeader("RIFF", 40, "WAVE", new FmtChunk(), 44, 0);
        return wavHeader;
    }

    public static WavHeader mono48k(long j) {
        FmtChunk fmtChunk = new FmtChunk(1, 1, 48000, 96000, 2, 16);
        WavHeader wavHeader = new WavHeader("RIFF", 40, "WAVE", fmtChunk, 44, calcDataSize(1, 2, j));
        return wavHeader;
    }

    public static WavHeader multiChannelWav(List<File> list) throws IOException {
        return multiChannelWav((File[]) list.toArray(new File[0]));
    }

    public static WavHeader read(File file) throws IOException {
        FileChannelWrapper fileChannelWrapper;
        try {
            fileChannelWrapper = NIOUtils.readableFileChannel(file);
            try {
                WavHeader read = read((ReadableByteChannel) fileChannelWrapper);
                IOUtils.closeQuietly(fileChannelWrapper);
                return read;
            } catch (Throwable th) {
                th = th;
                IOUtils.closeQuietly(fileChannelWrapper);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            fileChannelWrapper = null;
            IOUtils.closeQuietly(fileChannelWrapper);
            throw th;
        }
    }

    public static WavHeader stereo48k() {
        return stereo48k(0);
    }

    public ChannelLabel[] getChannelLabels() {
        FmtChunk fmtChunk = this.fmt;
        if (fmtChunk instanceof FmtChunkExtended) {
            return ((FmtChunkExtended) fmtChunk).getLabels();
        }
        short s = fmtChunk.numChannels;
        switch (s) {
            case 1:
                return new ChannelLabel[]{ChannelLabel.MONO};
            case 2:
                return new ChannelLabel[]{ChannelLabel.STEREO_LEFT, ChannelLabel.STEREO_RIGHT};
            case 3:
                return new ChannelLabel[]{ChannelLabel.FRONT_LEFT, ChannelLabel.FRONT_RIGHT, ChannelLabel.REAR_CENTER};
            case 4:
                return new ChannelLabel[]{ChannelLabel.FRONT_LEFT, ChannelLabel.FRONT_RIGHT, ChannelLabel.REAR_LEFT, ChannelLabel.REAR_RIGHT};
            case 5:
                return new ChannelLabel[]{ChannelLabel.FRONT_LEFT, ChannelLabel.FRONT_RIGHT, ChannelLabel.CENTER, ChannelLabel.REAR_LEFT, ChannelLabel.REAR_RIGHT};
            case 6:
                return new ChannelLabel[]{ChannelLabel.FRONT_LEFT, ChannelLabel.FRONT_RIGHT, ChannelLabel.CENTER, ChannelLabel.LFE, ChannelLabel.REAR_LEFT, ChannelLabel.REAR_RIGHT};
            case 7:
                return new ChannelLabel[]{ChannelLabel.FRONT_LEFT, ChannelLabel.FRONT_RIGHT, ChannelLabel.CENTER, ChannelLabel.LFE, ChannelLabel.REAR_LEFT, ChannelLabel.REAR_RIGHT, ChannelLabel.REAR_CENTER};
            case 8:
                return new ChannelLabel[]{ChannelLabel.FRONT_LEFT, ChannelLabel.FRONT_RIGHT, ChannelLabel.CENTER, ChannelLabel.LFE, ChannelLabel.REAR_LEFT, ChannelLabel.REAR_RIGHT, ChannelLabel.REAR_LEFT, ChannelLabel.REAR_RIGHT};
            default:
                ChannelLabel[] channelLabelArr = new ChannelLabel[s];
                Arrays.fill(channelLabelArr, ChannelLabel.MONO);
                return channelLabelArr;
        }
    }

    public AudioFormat getFormat() {
        FmtChunk fmtChunk = this.fmt;
        AudioFormat audioFormat = new AudioFormat(fmtChunk.sampleRate, fmtChunk.bitsPerSample, fmtChunk.numChannels, true, false);
        return audioFormat;
    }

    public void write(WritableByteChannel writableByteChannel) throws IOException {
        ByteBuffer allocate = ByteBuffer.allocate(44);
        allocate.order(ByteOrder.LITTLE_ENDIAN);
        long j = this.dataSize;
        long j2 = j <= 4294967295L ? j + 36 : 40;
        allocate.put(JCodecUtil.asciiString("RIFF"));
        allocate.putInt((int) j2);
        allocate.put(JCodecUtil.asciiString("WAVE"));
        allocate.put(JCodecUtil.asciiString("fmt "));
        allocate.putInt(this.fmt.size());
        this.fmt.put(allocate);
        allocate.put(JCodecUtil.asciiString("data"));
        long j3 = this.dataSize;
        if (j3 <= 4294967295L) {
            allocate.putInt((int) j3);
        } else {
            allocate.putInt(0);
        }
        allocate.flip();
        writableByteChannel.write(allocate);
    }

    public static WavHeader multiChannelWav(File... fileArr) throws IOException {
        WavHeader[] wavHeaderArr = new WavHeader[fileArr.length];
        for (int i = 0; i < fileArr.length; i++) {
            wavHeaderArr[i] = read(fileArr[i]);
        }
        return multiChannelWav(wavHeaderArr);
    }

    public static WavHeader stereo48k(long j) {
        FmtChunk fmtChunk = new FmtChunk(1, 2, 48000, 192000, 4, 16);
        WavHeader wavHeader = new WavHeader("RIFF", 40, "WAVE", fmtChunk, 44, calcDataSize(2, 2, j));
        return wavHeader;
    }

    public static WavHeader read(ReadableByteChannel readableByteChannel) throws IOException {
        String readString;
        int i;
        String str;
        ByteBuffer allocate = ByteBuffer.allocate(128);
        allocate.order(ByteOrder.LITTLE_ENDIAN);
        readableByteChannel.read(allocate);
        if (allocate.remaining() <= 0) {
            allocate.flip();
            String readString2 = NIOUtils.readString(allocate, 4);
            int i2 = allocate.getInt();
            String readString3 = NIOUtils.readString(allocate, 4);
            FmtChunk fmtChunk = null;
            if (!"RIFF".equals(readString2) || !"WAVE".equals(readString3)) {
                return null;
            }
            do {
                readString = NIOUtils.readString(allocate, 4);
                i = allocate.getInt();
                str = "data";
                if (!"fmt ".equals(readString) || i < 14 || i > 1048576) {
                    if (!str.equals(readString)) {
                        NIOUtils.skip(allocate, i);
                    }
                } else if (i == 16) {
                    fmtChunk = FmtChunk.get(allocate);
                } else if (i == 18) {
                    fmtChunk = FmtChunk.get(allocate);
                    NIOUtils.skip(allocate, 2);
                } else if (i == 28) {
                    fmtChunk = FmtChunk.get(allocate);
                } else if (i == 40) {
                    fmtChunk = FmtChunk.get(allocate);
                    NIOUtils.skip(allocate, 12);
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Don't know how to handle fmt size: ");
                    sb.append(i);
                    throw new IllegalStateException(sb.toString());
                }
            } while (!str.equals(readString));
            WavHeader wavHeader = new WavHeader(readString2, i2, readString3, fmtChunk, allocate.position(), (long) i);
            return wavHeader;
        }
        throw new IOException("Incomplete wav header found");
    }

    public static WavHeader multiChannelWav(WavHeader... wavHeaderArr) {
        WavHeader emptyWavHeader = emptyWavHeader();
        int i = 0;
        for (WavHeader wavHeader : wavHeaderArr) {
            i = (int) (((long) i) + wavHeader.dataSize);
        }
        emptyWavHeader.dataSize = (long) i;
        FmtChunk fmtChunk = wavHeaderArr[0].fmt;
        short s = fmtChunk.bitsPerSample;
        int i2 = s / 8;
        int i3 = fmtChunk.sampleRate;
        FmtChunk fmtChunk2 = emptyWavHeader.fmt;
        fmtChunk2.bitsPerSample = (short) s;
        fmtChunk2.blockAlign = (short) (wavHeaderArr.length * i2);
        fmtChunk2.byteRate = wavHeaderArr.length * i2 * i3;
        fmtChunk2.numChannels = (short) wavHeaderArr.length;
        fmtChunk2.sampleRate = i3;
        return emptyWavHeader;
    }

    public WavHeader(WavHeader wavHeader) {
        String str = wavHeader.chunkId;
        int i = wavHeader.chunkSize;
        String str2 = wavHeader.format;
        FmtChunk fmtChunk = wavHeader.fmt;
        FmtChunk fmtChunkExtended = fmtChunk instanceof FmtChunkExtended ? new FmtChunkExtended((FmtChunkExtended) fmtChunk) : new FmtChunk(fmtChunk);
        this(str, i, str2, fmtChunkExtended, wavHeader.dataOffset, wavHeader.dataSize);
    }

    public WavHeader(AudioFormat audioFormat, int i) {
        FmtChunk fmtChunk = new FmtChunk(1, (short) audioFormat.getChannels(), audioFormat.getSampleRate(), audioFormat.getSampleRate() * audioFormat.getChannels() * (audioFormat.getSampleSizeInBits() >> 3), (short) (audioFormat.getChannels() * (audioFormat.getSampleSizeInBits() >> 3)), (short) audioFormat.getSampleSizeInBits());
        this("RIFF", 40, "WAVE", fmtChunk, 44, calcDataSize(audioFormat.getChannels(), audioFormat.getSampleSizeInBits() >> 3, (long) i));
    }
}
