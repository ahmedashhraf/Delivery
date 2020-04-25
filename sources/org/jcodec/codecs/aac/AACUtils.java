package org.jcodec.codecs.aac;

import java.nio.ByteBuffer;
import org.jcodec.codecs.mpeg4.mp4.EsdsBox;
import org.jcodec.common.AudioFormat;
import org.jcodec.common.model.ChannelLabel;
import org.jcodec.common.p554io.BitReader;
import org.jcodec.containers.mp4.boxes.Box;
import org.jcodec.containers.mp4.boxes.LeafBox;
import org.jcodec.containers.mp4.boxes.SampleEntry;

public class AACUtils {
    private static ChannelLabel[][] AAC_DEFAULT_CONFIGS = {null, new ChannelLabel[]{ChannelLabel.MONO}, new ChannelLabel[]{ChannelLabel.STEREO_LEFT, ChannelLabel.STEREO_RIGHT}, new ChannelLabel[]{ChannelLabel.CENTER, ChannelLabel.FRONT_LEFT, ChannelLabel.FRONT_RIGHT}, new ChannelLabel[]{ChannelLabel.CENTER, ChannelLabel.FRONT_LEFT, ChannelLabel.FRONT_RIGHT, ChannelLabel.REAR_CENTER}, new ChannelLabel[]{ChannelLabel.CENTER, ChannelLabel.FRONT_LEFT, ChannelLabel.FRONT_RIGHT, ChannelLabel.REAR_LEFT, ChannelLabel.REAR_RIGHT}, new ChannelLabel[]{ChannelLabel.CENTER, ChannelLabel.FRONT_LEFT, ChannelLabel.FRONT_RIGHT, ChannelLabel.REAR_LEFT, ChannelLabel.REAR_RIGHT, ChannelLabel.LFE}, new ChannelLabel[]{ChannelLabel.CENTER, ChannelLabel.FRONT_LEFT, ChannelLabel.FRONT_RIGHT, ChannelLabel.SIDE_LEFT, ChannelLabel.SIDE_RIGHT, ChannelLabel.REAR_LEFT, ChannelLabel.REAR_RIGHT, ChannelLabel.LFE}};

    public static class AudioInfo {
        private AudioFormat format;
        private ChannelLabel[] labels;

        public AudioInfo(AudioFormat audioFormat, ChannelLabel[] channelLabelArr) {
            this.format = audioFormat;
            this.labels = channelLabelArr;
        }

        public AudioFormat getFormat() {
            return this.format;
        }

        public ChannelLabel[] getLabels() {
            return this.labels;
        }
    }

    public static AudioInfo getChannels(SampleEntry sampleEntry) {
        Class<LeafBox> cls = LeafBox.class;
        if ("mp4a".equals(sampleEntry.getFourcc())) {
            String str = "esds";
            LeafBox leafBox = (LeafBox) Box.findFirst(sampleEntry, cls, str);
            if (leafBox == null) {
                leafBox = (LeafBox) Box.findFirst(sampleEntry, cls, null, str);
            }
            if (leafBox == null) {
                return null;
            }
            EsdsBox esdsBox = new EsdsBox();
            esdsBox.parse(leafBox.getData());
            return parseAudioInfo(esdsBox.getStreamInfo());
        }
        throw new IllegalArgumentException("Not mp4a sample entry");
    }

    private static int getObjectType(BitReader bitReader) {
        int readNBit = bitReader.readNBit(5);
        return readNBit == ObjectType.AOT_ESCAPE.ordinal() ? bitReader.readNBit(6) + 32 : readNBit;
    }

    public static AudioInfo parseAudioInfo(ByteBuffer byteBuffer) {
        BitReader bitReader = new BitReader(byteBuffer);
        getObjectType(bitReader);
        int readNBit = bitReader.readNBit(4);
        int readNBit2 = readNBit == 15 ? bitReader.readNBit(24) : AACConts.AAC_SAMPLE_RATES[readNBit];
        int readNBit3 = bitReader.readNBit(4);
        if (readNBit3 != 0) {
            ChannelLabel[][] channelLabelArr = AAC_DEFAULT_CONFIGS;
            if (readNBit3 < channelLabelArr.length) {
                ChannelLabel[] channelLabelArr2 = channelLabelArr[readNBit3];
                AudioFormat audioFormat = new AudioFormat(readNBit2, 16, channelLabelArr2.length, true, false);
                return new AudioInfo(audioFormat, channelLabelArr2);
            }
        }
        return null;
    }
}
