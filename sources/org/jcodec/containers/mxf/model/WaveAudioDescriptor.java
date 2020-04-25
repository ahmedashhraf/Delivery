package org.jcodec.containers.mxf.model;

import java.io.PrintStream;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class WaveAudioDescriptor extends GenericSoundEssenceDescriptor {
    private int avgBps;
    private short blockAlign;
    private C15568UL channelAssignment;
    private int peakChannels;
    private int peakEnvelopeBlockSize;
    private ByteBuffer peakEnvelopeData;
    private int peakEnvelopeFormat;
    private ByteBuffer peakEnvelopeTimestamp;
    private int peakEnvelopeVersion;
    private int peakFrames;
    private ByteBuffer peakOfPeaksPosition;
    private int pointsPerPeakValue;
    private byte sequenceOffset;

    public WaveAudioDescriptor(C15568UL ul) {
        super(ul);
    }

    public int getAvgBps() {
        return this.avgBps;
    }

    public short getBlockAlign() {
        return this.blockAlign;
    }

    public C15568UL getChannelAssignment() {
        return this.channelAssignment;
    }

    public int getPeakChannels() {
        return this.peakChannels;
    }

    public int getPeakEnvelopeBlockSize() {
        return this.peakEnvelopeBlockSize;
    }

    public ByteBuffer getPeakEnvelopeData() {
        return this.peakEnvelopeData;
    }

    public int getPeakEnvelopeFormat() {
        return this.peakEnvelopeFormat;
    }

    public ByteBuffer getPeakEnvelopeTimestamp() {
        return this.peakEnvelopeTimestamp;
    }

    public int getPeakEnvelopeVersion() {
        return this.peakEnvelopeVersion;
    }

    public int getPeakFrames() {
        return this.peakFrames;
    }

    public ByteBuffer getPeakOfPeaksPosition() {
        return this.peakOfPeaksPosition;
    }

    public int getPointsPerPeakValue() {
        return this.pointsPerPeakValue;
    }

    public byte getSequenceOffset() {
        return this.sequenceOffset;
    }

    /* access modifiers changed from: protected */
    public void read(Map<Integer, ByteBuffer> map) {
        super.read(map);
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            Entry entry = (Entry) it.next();
            ByteBuffer byteBuffer = (ByteBuffer) entry.getValue();
            int intValue = ((Integer) entry.getKey()).intValue();
            switch (intValue) {
                case 15625:
                    this.avgBps = byteBuffer.getInt();
                    break;
                case 15626:
                    this.blockAlign = byteBuffer.getShort();
                    break;
                case 15627:
                    this.sequenceOffset = byteBuffer.get();
                    break;
                default:
                    switch (intValue) {
                        case 15657:
                            this.peakEnvelopeVersion = byteBuffer.getInt();
                            break;
                        case 15658:
                            this.peakEnvelopeFormat = byteBuffer.getInt();
                            break;
                        case 15659:
                            this.pointsPerPeakValue = byteBuffer.getInt();
                            break;
                        case 15660:
                            this.peakEnvelopeBlockSize = byteBuffer.getInt();
                            break;
                        case 15661:
                            this.peakChannels = byteBuffer.getInt();
                            break;
                        case 15662:
                            this.peakFrames = byteBuffer.getInt();
                            break;
                        case 15663:
                            this.peakOfPeaksPosition = byteBuffer;
                            break;
                        case 15664:
                            this.peakEnvelopeTimestamp = byteBuffer;
                            break;
                        case 15665:
                            this.peakEnvelopeData = byteBuffer;
                            break;
                        case 15666:
                            this.channelAssignment = C15568UL.read(byteBuffer);
                            break;
                        default:
                            PrintStream printStream = System.out;
                            StringBuilder sb = new StringBuilder();
                            sb.append("Unknown tag [ ");
                            sb.append(this.f44898ul);
                            sb.append("]: %04x");
                            printStream.println(String.format(sb.toString(), new Object[]{entry.getKey()}));
                            continue;
                            continue;
                    }
            }
            it.remove();
        }
    }
}
