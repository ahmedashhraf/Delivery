package org.jcodec.codecs.aac.blocks;

import org.jcodec.codecs.aac.ChannelPosition;
import org.jcodec.common.p554io.BitReader;

public class BlockPCE extends Block {
    private static final int MAX_ELEM_ID = 16;

    public static class ChannelMapping {
        ChannelPosition position;
        int someInt;
        RawDataBlockType syn_ele;
    }

    /* renamed from: org.jcodec.codecs.aac.blocks.BlockPCE$a */
    static /* synthetic */ class C15487a {

        /* renamed from: a */
        static final /* synthetic */ int[] f44716a = new int[ChannelPosition.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0035 */
        static {
            /*
                org.jcodec.codecs.aac.ChannelPosition[] r0 = org.jcodec.codecs.aac.ChannelPosition.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f44716a = r0
                int[] r0 = f44716a     // Catch:{ NoSuchFieldError -> 0x0014 }
                org.jcodec.codecs.aac.ChannelPosition r1 = org.jcodec.codecs.aac.ChannelPosition.AAC_CHANNEL_FRONT     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = f44716a     // Catch:{ NoSuchFieldError -> 0x001f }
                org.jcodec.codecs.aac.ChannelPosition r1 = org.jcodec.codecs.aac.ChannelPosition.AAC_CHANNEL_BACK     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = f44716a     // Catch:{ NoSuchFieldError -> 0x002a }
                org.jcodec.codecs.aac.ChannelPosition r1 = org.jcodec.codecs.aac.ChannelPosition.AAC_CHANNEL_SIDE     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                int[] r0 = f44716a     // Catch:{ NoSuchFieldError -> 0x0035 }
                org.jcodec.codecs.aac.ChannelPosition r1 = org.jcodec.codecs.aac.ChannelPosition.AAC_CHANNEL_CC     // Catch:{ NoSuchFieldError -> 0x0035 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0035 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0035 }
            L_0x0035:
                int[] r0 = f44716a     // Catch:{ NoSuchFieldError -> 0x0040 }
                org.jcodec.codecs.aac.ChannelPosition r1 = org.jcodec.codecs.aac.ChannelPosition.AAC_CHANNEL_LFE     // Catch:{ NoSuchFieldError -> 0x0040 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0040 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0040 }
            L_0x0040:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: org.jcodec.codecs.aac.blocks.BlockPCE.C15487a.<clinit>():void");
        }
    }

    private void decodeChannelMap(ChannelMapping[] channelMappingArr, int i, ChannelPosition channelPosition, BitReader bitReader, int i2) {
        while (true) {
            int i3 = i2 - 1;
            if (i2 > 0) {
                RawDataBlockType rawDataBlockType = null;
                int i4 = C15487a.f44716a[channelPosition.ordinal()];
                if (i4 == 1 || i4 == 2 || i4 == 3) {
                    rawDataBlockType = RawDataBlockType.fromOrdinal(bitReader.read1Bit());
                } else if (i4 == 4) {
                    bitReader.read1Bit();
                    rawDataBlockType = RawDataBlockType.TYPE_CCE;
                } else if (i4 == 5) {
                    rawDataBlockType = RawDataBlockType.TYPE_LFE;
                }
                channelMappingArr[i].syn_ele = rawDataBlockType;
                channelMappingArr[i].someInt = bitReader.readNBit(4);
                channelMappingArr[i].position = channelPosition;
                i++;
                i2 = i3;
            } else {
                return;
            }
        }
    }

    public void parse(BitReader bitReader) {
        BitReader bitReader2 = bitReader;
        bitReader2.readNBit(2);
        bitReader2.readNBit(4);
        int readNBit = bitReader2.readNBit(4);
        int readNBit2 = bitReader2.readNBit(4);
        int readNBit3 = bitReader2.readNBit(4);
        int readNBit4 = bitReader2.readNBit(2);
        int readNBit5 = bitReader2.readNBit(3);
        int readNBit6 = bitReader2.readNBit(4);
        if (bitReader.read1Bit() != 0) {
            bitReader2.readNBit(4);
        }
        if (bitReader.read1Bit() != 0) {
            bitReader2.readNBit(4);
        }
        if (bitReader.read1Bit() != 0) {
            bitReader2.readNBit(3);
        }
        ChannelMapping[] channelMappingArr = new ChannelMapping[64];
        BitReader bitReader3 = bitReader;
        decodeChannelMap(channelMappingArr, 0, ChannelPosition.AAC_CHANNEL_FRONT, bitReader3, readNBit);
        decodeChannelMap(channelMappingArr, readNBit, ChannelPosition.AAC_CHANNEL_SIDE, bitReader3, readNBit2);
        int i = readNBit + readNBit2;
        decodeChannelMap(channelMappingArr, i, ChannelPosition.AAC_CHANNEL_BACK, bitReader3, readNBit3);
        int i2 = i + readNBit3;
        decodeChannelMap(channelMappingArr, i2, ChannelPosition.AAC_CHANNEL_LFE, bitReader3, readNBit4);
        int i3 = i2 + readNBit4;
        bitReader2.skip(readNBit5 * 4);
        decodeChannelMap(channelMappingArr, i3, ChannelPosition.AAC_CHANNEL_CC, bitReader3, readNBit6);
        bitReader.align();
        bitReader2.skip(bitReader2.readNBit(8) * 8);
    }
}
