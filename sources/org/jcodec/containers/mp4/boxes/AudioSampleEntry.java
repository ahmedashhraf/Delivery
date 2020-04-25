package org.jcodec.containers.mp4.boxes;

import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.jcodec.common.AudioFormat;
import org.jcodec.common.model.ChannelLabel;
import org.jcodec.common.tools.ToJSON;
import org.jcodec.containers.mp4.boxes.EndianBox.Endian;
import org.jcodec.containers.mp4.boxes.channel.ChannelUtils;
import org.jcodec.containers.mp4.boxes.channel.Label;

public class AudioSampleEntry extends SampleEntry {
    private static final MyFactory FACTORY = new MyFactory();
    public static int kAudioFormatFlagIsAlignedHigh = 16;
    public static int kAudioFormatFlagIsBigEndian = 2;
    public static int kAudioFormatFlagIsFloat = 1;
    public static int kAudioFormatFlagIsNonInterleaved = 32;
    public static int kAudioFormatFlagIsNonMixable = 64;
    public static int kAudioFormatFlagIsPacked = 8;
    public static int kAudioFormatFlagIsSignedInteger = 4;
    public static Set<String> pcms = new HashSet();
    private static Map<Label, ChannelLabel> translationStereo = new HashMap();
    private static Map<Label, ChannelLabel> translationSurround = new HashMap();
    private int bytesPerFrame;
    private int bytesPerPkt;
    private int bytesPerSample;
    private short channelCount;
    private int compressionId;
    private int lpcmFlags;
    private int pktSize;
    private short revision;
    private float sampleRate;
    private short sampleSize;
    private int samplesPerPkt;
    private int vendor;
    private short version;

    public static class MyFactory extends BoxFactory {
        private Map<String, Class<? extends Box>> mappings = new HashMap();

        public MyFactory() {
            this.mappings.put(WaveExtension.fourcc(), WaveExtension.class);
            this.mappings.put(ChannelBox.fourcc(), ChannelBox.class);
            this.mappings.put("esds", LeafBox.class);
        }

        public Class<? extends Box> toClass(String str) {
            return (Class) this.mappings.get(str);
        }
    }

    static {
        pcms.add("raw ");
        pcms.add("twos");
        pcms.add("sowt");
        pcms.add("fl32");
        pcms.add("fl64");
        pcms.add("in24");
        pcms.add("in32");
        pcms.add("lpcm");
        translationStereo.put(Label.Left, ChannelLabel.STEREO_LEFT);
        translationStereo.put(Label.Right, ChannelLabel.STEREO_RIGHT);
        translationStereo.put(Label.HeadphonesLeft, ChannelLabel.STEREO_LEFT);
        translationStereo.put(Label.HeadphonesRight, ChannelLabel.STEREO_RIGHT);
        translationStereo.put(Label.LeftTotal, ChannelLabel.STEREO_LEFT);
        translationStereo.put(Label.RightTotal, ChannelLabel.STEREO_RIGHT);
        translationStereo.put(Label.LeftWide, ChannelLabel.STEREO_LEFT);
        translationStereo.put(Label.RightWide, ChannelLabel.STEREO_RIGHT);
        translationSurround.put(Label.Left, ChannelLabel.FRONT_LEFT);
        translationSurround.put(Label.Right, ChannelLabel.FRONT_RIGHT);
        translationSurround.put(Label.LeftCenter, ChannelLabel.FRONT_CENTER_LEFT);
        translationSurround.put(Label.RightCenter, ChannelLabel.FRONT_CENTER_RIGHT);
        translationSurround.put(Label.Center, ChannelLabel.CENTER);
        translationSurround.put(Label.CenterSurround, ChannelLabel.REAR_CENTER);
        translationSurround.put(Label.CenterSurroundDirect, ChannelLabel.REAR_CENTER);
        translationSurround.put(Label.LeftSurround, ChannelLabel.REAR_LEFT);
        translationSurround.put(Label.LeftSurroundDirect, ChannelLabel.REAR_LEFT);
        translationSurround.put(Label.RightSurround, ChannelLabel.REAR_RIGHT);
        translationSurround.put(Label.RightSurroundDirect, ChannelLabel.REAR_RIGHT);
        translationSurround.put(Label.RearSurroundLeft, ChannelLabel.SIDE_LEFT);
        translationSurround.put(Label.RearSurroundRight, ChannelLabel.SIDE_RIGHT);
        translationSurround.put(Label.LFE2, ChannelLabel.LFE);
        translationSurround.put(Label.LFEScreen, ChannelLabel.LFE);
        translationSurround.put(Label.LeftTotal, ChannelLabel.STEREO_LEFT);
        translationSurround.put(Label.RightTotal, ChannelLabel.STEREO_RIGHT);
        translationSurround.put(Label.LeftWide, ChannelLabel.STEREO_LEFT);
        translationSurround.put(Label.RightWide, ChannelLabel.STEREO_RIGHT);
    }

    public AudioSampleEntry(Header header) {
        super(header);
        this.factory = FACTORY;
    }

    private ChannelLabel[] translate(Map<Label, ChannelLabel> map, Label[] labelArr) {
        ChannelLabel[] channelLabelArr = new ChannelLabel[labelArr.length];
        int length = labelArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int i3 = i2 + 1;
            channelLabelArr[i2] = (ChannelLabel) map.get(labelArr[i]);
            i++;
            i2 = i3;
        }
        return channelLabelArr;
    }

    public int calcFrameSize() {
        if (this.version != 0) {
            int i = this.bytesPerFrame;
            if (i != 0) {
                return i;
            }
        }
        return (this.sampleSize >> 3) * this.channelCount;
    }

    public int calcSampleSize() {
        return calcFrameSize() / this.channelCount;
    }

    /* access modifiers changed from: protected */
    public void doWrite(ByteBuffer byteBuffer) {
        super.doWrite(byteBuffer);
        byteBuffer.putShort(this.version);
        byteBuffer.putShort(this.revision);
        byteBuffer.putInt(this.vendor);
        short s = this.version;
        if (s < 2) {
            byteBuffer.putShort(this.channelCount);
            if (this.version == 0) {
                byteBuffer.putShort(this.sampleSize);
            } else {
                byteBuffer.putShort(16);
            }
            byteBuffer.putShort((short) this.compressionId);
            byteBuffer.putShort((short) this.pktSize);
            double d = (double) this.sampleRate;
            Double.isNaN(d);
            byteBuffer.putInt((int) Math.round(d * 65536.0d));
            if (this.version == 1) {
                byteBuffer.putInt(this.samplesPerPkt);
                byteBuffer.putInt(this.bytesPerPkt);
                byteBuffer.putInt(this.bytesPerFrame);
                byteBuffer.putInt(this.bytesPerSample);
            }
        } else if (s == 2) {
            byteBuffer.putShort(3);
            byteBuffer.putShort(16);
            byteBuffer.putShort(-2);
            byteBuffer.putShort(0);
            byteBuffer.putInt(65536);
            byteBuffer.putInt(72);
            byteBuffer.putLong(Double.doubleToLongBits((double) this.sampleRate));
            byteBuffer.putInt(this.channelCount);
            byteBuffer.putInt(2130706432);
            byteBuffer.putInt(this.sampleSize);
            byteBuffer.putInt(this.lpcmFlags);
            byteBuffer.putInt(this.bytesPerFrame);
            byteBuffer.putInt(this.samplesPerPkt);
        }
        writeExtensions(byteBuffer);
    }

    public int getBytesPerFrame() {
        return this.bytesPerFrame;
    }

    public int getBytesPerSample() {
        return this.bytesPerSample;
    }

    public short getChannelCount() {
        return this.channelCount;
    }

    public Endian getEndian() {
        EndianBox endianBox = (EndianBox) Box.findFirst(this, EndianBox.class, WaveExtension.fourcc(), EndianBox.fourcc());
        if (endianBox != null) {
            return endianBox.getEndian();
        }
        if ("twos".equals(this.header.getFourcc())) {
            return Endian.BIG_ENDIAN;
        }
        if ("lpcm".equals(this.header.getFourcc())) {
            return (this.lpcmFlags & kAudioFormatFlagIsBigEndian) != 0 ? Endian.BIG_ENDIAN : Endian.LITTLE_ENDIAN;
        }
        if ("sowt".equals(this.header.getFourcc())) {
            return Endian.LITTLE_ENDIAN;
        }
        return Endian.BIG_ENDIAN;
    }

    public AudioFormat getFormat() {
        AudioFormat audioFormat = new AudioFormat((int) this.sampleRate, calcSampleSize() << 3, this.channelCount, true, getEndian() == Endian.BIG_ENDIAN);
        return audioFormat;
    }

    public ChannelLabel[] getLabels() {
        ChannelBox channelBox = (ChannelBox) Box.findFirst(this, ChannelBox.class, "chan");
        if (channelBox != null) {
            Label[] labels = ChannelUtils.getLabels(channelBox);
            if (this.channelCount == 2) {
                return translate(translationStereo, labels);
            }
            return translate(translationSurround, labels);
        }
        short s = this.channelCount;
        if (s == 1) {
            return new ChannelLabel[]{ChannelLabel.MONO};
        } else if (s == 2) {
            return new ChannelLabel[]{ChannelLabel.STEREO_LEFT, ChannelLabel.STEREO_RIGHT};
        } else if (s != 6) {
            ChannelLabel[] channelLabelArr = new ChannelLabel[s];
            Arrays.fill(channelLabelArr, ChannelLabel.MONO);
            return channelLabelArr;
        } else {
            return new ChannelLabel[]{ChannelLabel.FRONT_LEFT, ChannelLabel.FRONT_RIGHT, ChannelLabel.CENTER, ChannelLabel.LFE, ChannelLabel.REAR_LEFT, ChannelLabel.REAR_RIGHT};
        }
    }

    /* access modifiers changed from: protected */
    public void getModelFields(List<String> list) {
        ToJSON.allFieldsExcept(AudioSampleEntry.class, "endian", "float", "format", "labels");
    }

    public float getSampleRate() {
        return this.sampleRate;
    }

    public short getSampleSize() {
        return this.sampleSize;
    }

    public short getVersion() {
        return this.version;
    }

    public boolean isFloat() {
        if (!"fl32".equals(this.header.getFourcc())) {
            if (!"fl64".equals(this.header.getFourcc())) {
                if (!"lpcm".equals(this.header.getFourcc()) || (this.lpcmFlags & kAudioFormatFlagIsFloat) == 0) {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean isPCM() {
        return pcms.contains(this.header.getFourcc());
    }

    public void parse(ByteBuffer byteBuffer) {
        super.parse(byteBuffer);
        this.version = byteBuffer.getShort();
        this.revision = byteBuffer.getShort();
        this.vendor = byteBuffer.getInt();
        this.channelCount = byteBuffer.getShort();
        this.sampleSize = byteBuffer.getShort();
        this.compressionId = byteBuffer.getShort();
        this.pktSize = byteBuffer.getShort();
        this.sampleRate = ((float) (((long) byteBuffer.getInt()) & 4294967295L)) / 65536.0f;
        short s = this.version;
        if (s == 1) {
            this.samplesPerPkt = byteBuffer.getInt();
            this.bytesPerPkt = byteBuffer.getInt();
            this.bytesPerFrame = byteBuffer.getInt();
            this.bytesPerSample = byteBuffer.getInt();
        } else if (s == 2) {
            byteBuffer.getInt();
            this.sampleRate = (float) Double.longBitsToDouble(byteBuffer.getLong());
            this.channelCount = (short) byteBuffer.getInt();
            byteBuffer.getInt();
            this.sampleSize = (short) byteBuffer.getInt();
            this.lpcmFlags = byteBuffer.getInt();
            this.bytesPerFrame = byteBuffer.getInt();
            this.samplesPerPkt = byteBuffer.getInt();
        }
        parseExtensions(byteBuffer);
    }

    public AudioSampleEntry(Header header, short s, short s2, short s3, int i, short s4, int i2, int i3, int i4, int i5, int i6, int i7, int i8, short s5) {
        super(header, s);
        this.channelCount = s2;
        this.sampleSize = s3;
        this.sampleRate = (float) i;
        this.revision = s4;
        this.vendor = i2;
        this.compressionId = i3;
        this.pktSize = i4;
        this.samplesPerPkt = i5;
        this.bytesPerPkt = i6;
        this.bytesPerFrame = i7;
        this.bytesPerSample = i8;
        this.version = s5;
    }
}
