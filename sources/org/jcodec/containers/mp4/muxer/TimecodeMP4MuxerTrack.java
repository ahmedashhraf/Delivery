package org.jcodec.containers.mp4.muxer;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import org.jcodec.common.SeekableByteChannel;
import org.jcodec.common.model.Packet;
import org.jcodec.common.model.Rational;
import org.jcodec.common.model.TapeTimecode;
import org.jcodec.containers.mp4.MP4Packet;
import org.jcodec.containers.mp4.TrackType;
import org.jcodec.containers.mp4.boxes.Box;
import org.jcodec.containers.mp4.boxes.Edit;
import org.jcodec.containers.mp4.boxes.MovieHeaderBox;
import org.jcodec.containers.mp4.boxes.TimecodeSampleEntry;
import org.jcodec.movtool.Util;
import p212io.fabric.sdk.android.p493p.p498e.C14330v;

public class TimecodeMP4MuxerTrack extends FramesMP4MuxerTrack {
    private TapeTimecode firstTimecode;
    private int fpsEstimate;
    private List<Packet> gop = new ArrayList();
    private List<Edit> lower = new ArrayList();
    private TapeTimecode prevTimecode;
    private long sampleDuration;
    private long samplePts;
    private int tcFrames;

    /* renamed from: org.jcodec.containers.mp4.muxer.TimecodeMP4MuxerTrack$a */
    class C15548a implements Comparator<Packet> {
        C15548a() {
        }

        /* renamed from: a */
        public int compare(Packet packet, Packet packet2) {
            int i = 0;
            if (packet == null && packet2 == null) {
                return 0;
            }
            if (packet == null) {
                return -1;
            }
            if (packet2 == null) {
                return 1;
            }
            if (packet.getDisplayOrder() > packet2.getDisplayOrder()) {
                i = 1;
            } else if (packet.getDisplayOrder() != packet2.getDisplayOrder()) {
                i = -1;
            }
            return i;
        }
    }

    public TimecodeMP4MuxerTrack(SeekableByteChannel seekableByteChannel, int i, int i2) {
        super(seekableByteChannel, i, TrackType.TIMECODE, i2);
    }

    private void addTimecodeInt(Packet packet) throws IOException {
        TapeTimecode tapeTimecode = packet.getTapeTimecode();
        boolean isGap = isGap(this.prevTimecode, tapeTimecode);
        this.prevTimecode = tapeTimecode;
        if (isGap) {
            outTimecodeSample();
            this.firstTimecode = tapeTimecode;
            this.fpsEstimate = tapeTimecode.isDropFrame() ? 30 : -1;
            this.samplePts += this.sampleDuration;
            this.sampleDuration = 0;
            this.tcFrames = 0;
        }
        this.sampleDuration += packet.getDuration();
        this.tcFrames++;
    }

    private boolean isGap(TapeTimecode tapeTimecode, TapeTimecode tapeTimecode2) {
        if (tapeTimecode == null && tapeTimecode2 != null) {
            return true;
        }
        if (tapeTimecode == null) {
            return false;
        }
        if (tapeTimecode2 != null && tapeTimecode.isDropFrame() == tapeTimecode2.isDropFrame()) {
            return isTimeGap(tapeTimecode, tapeTimecode2);
        }
        return true;
    }

    private boolean isTimeGap(TapeTimecode tapeTimecode, TapeTimecode tapeTimecode2) {
        int sec = toSec(tapeTimecode2);
        int sec2 = sec - toSec(tapeTimecode);
        if (sec2 == 0) {
            int frame = tapeTimecode2.getFrame() - tapeTimecode.getFrame();
            int i = this.fpsEstimate;
            if (i != -1) {
                frame = (frame + i) % i;
            }
            if (frame == 1) {
                return false;
            }
        } else if (sec2 == 1) {
            if (this.fpsEstimate != -1) {
                if (tapeTimecode2.getFrame() == ((!tapeTimecode2.isDropFrame() || sec % 60 != 0 || sec % C14330v.f42355w == 0) ? (byte) 0 : 2) && tapeTimecode.getFrame() == this.fpsEstimate - 1) {
                    return false;
                }
            } else if (tapeTimecode2.getFrame() == 0) {
                this.fpsEstimate = tapeTimecode.getFrame() + 1;
                return false;
            }
        }
        return true;
    }

    private void outTimecodeSample() throws IOException {
        long j = this.sampleDuration;
        if (j <= 0) {
            return;
        }
        if (this.firstTimecode != null) {
            if (this.fpsEstimate == -1) {
                this.fpsEstimate = this.prevTimecode.getFrame() + 1;
            }
            boolean isDropFrame = this.firstTimecode.isDropFrame();
            this.sampleEntries.add(new TimecodeSampleEntry(isDropFrame ? 1 : 0, this.timescale, (int) (this.sampleDuration / ((long) this.tcFrames)), this.fpsEstimate));
            ByteBuffer allocate = ByteBuffer.allocate(4);
            allocate.putInt(toCounter(this.firstTimecode, this.fpsEstimate));
            allocate.flip();
            long j2 = this.samplePts;
            MP4Packet mP4Packet = new MP4Packet(allocate, j2, (long) this.timescale, this.sampleDuration, 0, true, null, j2, this.sampleEntries.size() - 1);
            addFrame(mP4Packet);
            List<Edit> list = this.lower;
            Edit edit = new Edit(this.sampleDuration, this.samplePts, 1.0f);
            list.add(edit);
            return;
        }
        List<Edit> list2 = this.lower;
        Edit edit2 = new Edit(j, -1, 1.0f);
        list2.add(edit2);
    }

    private void processGop() throws IOException {
        if (this.gop.size() > 0) {
            for (Packet addTimecodeInt : sortByDisplay(this.gop)) {
                addTimecodeInt(addTimecodeInt);
            }
            this.gop.clear();
        }
    }

    private List<Packet> sortByDisplay(List<Packet> list) {
        ArrayList arrayList = new ArrayList(list);
        Collections.sort(arrayList, new C15548a());
        return arrayList;
    }

    private int toCounter(TapeTimecode tapeTimecode, int i) {
        int sec = (toSec(tapeTimecode) * i) + tapeTimecode.getFrame();
        return tapeTimecode.isDropFrame() ? (int) (((long) sec) - ((((long) (sec / 18000)) * 18) + (((((long) (sec % 18000)) - 2) / 1800) * 2))) : sec;
    }

    private int toSec(TapeTimecode tapeTimecode) {
        return (tapeTimecode.getHour() * 3600) + (tapeTimecode.getMinute() * 60) + tapeTimecode.getSecond();
    }

    public void addTimecode(Packet packet) throws IOException {
        if (packet.isKeyFrame()) {
            processGop();
        }
        this.gop.add(new Packet(packet, (ByteBuffer) null));
    }

    /* access modifiers changed from: protected */
    public Box finish(MovieHeaderBox movieHeaderBox) throws IOException {
        processGop();
        outTimecodeSample();
        if (this.sampleEntries.size() == 0) {
            return null;
        }
        if (this.edits != null) {
            this.edits = Util.editsOnEdits(new Rational(1, 1), this.lower, this.edits);
        } else {
            this.edits = this.lower;
        }
        return super.finish(movieHeaderBox);
    }
}
