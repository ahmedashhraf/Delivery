package org.jcodec.containers.mp4.muxer;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import org.jcodec.common.model.Rational;
import org.jcodec.common.model.Size;
import org.jcodec.common.model.Unit;
import org.jcodec.containers.mp4.TrackType;
import org.jcodec.containers.mp4.boxes.Box;
import org.jcodec.containers.mp4.boxes.ClearApertureBox;
import org.jcodec.containers.mp4.boxes.DataInfoBox;
import org.jcodec.containers.mp4.boxes.DataRefBox;
import org.jcodec.containers.mp4.boxes.Edit;
import org.jcodec.containers.mp4.boxes.EditListBox;
import org.jcodec.containers.mp4.boxes.EncodedPixelBox;
import org.jcodec.containers.mp4.boxes.GenericMediaInfoBox;
import org.jcodec.containers.mp4.boxes.Header;
import org.jcodec.containers.mp4.boxes.LeafBox;
import org.jcodec.containers.mp4.boxes.MediaInfoBox;
import org.jcodec.containers.mp4.boxes.MovieHeaderBox;
import org.jcodec.containers.mp4.boxes.NameBox;
import org.jcodec.containers.mp4.boxes.NodeBox;
import org.jcodec.containers.mp4.boxes.PixelAspectExt;
import org.jcodec.containers.mp4.boxes.ProductionApertureBox;
import org.jcodec.containers.mp4.boxes.SampleEntry;
import org.jcodec.containers.mp4.boxes.SampleToChunkBox.SampleToChunkEntry;
import org.jcodec.containers.mp4.boxes.SoundMediaHeaderBox;
import org.jcodec.containers.mp4.boxes.TimecodeMediaInfoBox;
import org.jcodec.containers.mp4.boxes.TrakBox;
import org.jcodec.containers.mp4.boxes.VideoMediaHeaderBox;
import org.jcodec.containers.mp4.boxes.VideoSampleEntry;

public abstract class AbstractMP4MuxerTrack {
    protected long chunkDuration;
    protected int chunkNo = 0;
    protected List<ByteBuffer> curChunk = new ArrayList();
    protected List<Edit> edits;
    protected boolean finished;
    private String name;
    protected List<SampleEntry> sampleEntries = new ArrayList();
    protected List<SampleToChunkEntry> samplesInChunks = new ArrayList();
    protected int samplesInLastChunk = -1;
    protected Rational tgtChunkDuration;
    protected Unit tgtChunkDurationUnit;
    protected int timescale;
    protected int trackId;
    protected TrackType type;

    /* renamed from: org.jcodec.containers.mp4.muxer.AbstractMP4MuxerTrack$a */
    static /* synthetic */ class C15547a {

        /* renamed from: a */
        static final /* synthetic */ int[] f44845a = new int[TrackType.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|8) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        static {
            /*
                org.jcodec.containers.mp4.TrackType[] r0 = org.jcodec.containers.mp4.TrackType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f44845a = r0
                int[] r0 = f44845a     // Catch:{ NoSuchFieldError -> 0x0014 }
                org.jcodec.containers.mp4.TrackType r1 = org.jcodec.containers.mp4.TrackType.VIDEO     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = f44845a     // Catch:{ NoSuchFieldError -> 0x001f }
                org.jcodec.containers.mp4.TrackType r1 = org.jcodec.containers.mp4.TrackType.SOUND     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = f44845a     // Catch:{ NoSuchFieldError -> 0x002a }
                org.jcodec.containers.mp4.TrackType r1 = org.jcodec.containers.mp4.TrackType.TIMECODE     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: org.jcodec.containers.mp4.muxer.AbstractMP4MuxerTrack.C15547a.<clinit>():void");
        }
    }

    public AbstractMP4MuxerTrack(int i, TrackType trackType, int i2) {
        this.trackId = i;
        this.type = trackType;
        this.timescale = i2;
    }

    /* access modifiers changed from: protected */
    public void addDref(NodeBox nodeBox) {
        DataInfoBox dataInfoBox = new DataInfoBox();
        nodeBox.add(dataInfoBox);
        DataRefBox dataRefBox = new DataRefBox();
        dataInfoBox.add(dataRefBox);
        dataRefBox.add(new LeafBox(new Header("alis", 0), ByteBuffer.wrap(new byte[]{0, 0, 0, 1})));
    }

    public void addSampleEntry(SampleEntry sampleEntry) {
        if (!this.finished) {
            this.sampleEntries.add(sampleEntry);
            return;
        }
        throw new IllegalStateException("The muxer track has finished muxing");
    }

    /* access modifiers changed from: protected */
    public abstract Box finish(MovieHeaderBox movieHeaderBox) throws IOException;

    public Size getDisplayDimensions() {
        int i;
        int i2 = 0;
        if (this.sampleEntries.get(0) instanceof VideoSampleEntry) {
            VideoSampleEntry videoSampleEntry = (VideoSampleEntry) this.sampleEntries.get(0);
            PixelAspectExt pixelAspectExt = (PixelAspectExt) Box.findFirst(videoSampleEntry, PixelAspectExt.class, PixelAspectExt.fourcc());
            Rational rational = pixelAspectExt != null ? pixelAspectExt.getRational() : new Rational(1, 1);
            i2 = (rational.getNum() * videoSampleEntry.getWidth()) / rational.getDen();
            i = videoSampleEntry.getHeight();
        } else {
            i = 0;
        }
        return new Size(i2, i);
    }

    public List<SampleEntry> getEntries() {
        return this.sampleEntries;
    }

    public int getTimescale() {
        return this.timescale;
    }

    public abstract long getTrackTotalDuration();

    public boolean isAudio() {
        return this.type == TrackType.SOUND;
    }

    public boolean isTimecode() {
        return this.type == TrackType.TIMECODE;
    }

    public boolean isVideo() {
        return this.type == TrackType.VIDEO;
    }

    /* access modifiers changed from: protected */
    public void mediaHeader(MediaInfoBox mediaInfoBox, TrackType trackType) {
        int i = C15547a.f44845a[trackType.ordinal()];
        if (i == 1) {
            VideoMediaHeaderBox videoMediaHeaderBox = new VideoMediaHeaderBox(0, 0, 0, 0);
            videoMediaHeaderBox.setFlags(1);
            mediaInfoBox.add(videoMediaHeaderBox);
        } else if (i == 2) {
            SoundMediaHeaderBox soundMediaHeaderBox = new SoundMediaHeaderBox();
            soundMediaHeaderBox.setFlags(1);
            mediaInfoBox.add(soundMediaHeaderBox);
        } else if (i == 3) {
            NodeBox nodeBox = new NodeBox(new Header("gmhd"));
            nodeBox.add(new GenericMediaInfoBox());
            NodeBox nodeBox2 = new NodeBox(new Header("tmcd"));
            nodeBox.add(nodeBox2);
            TimecodeMediaInfoBox timecodeMediaInfoBox = new TimecodeMediaInfoBox(0, 0, 12, new short[]{0, 0, 0}, new short[]{255, 255, 255}, "Lucida Grande");
            nodeBox2.add(timecodeMediaInfoBox);
            mediaInfoBox.add(nodeBox);
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Handler ");
            sb.append(trackType.getHandler());
            sb.append(" not supported");
            throw new IllegalStateException(sb.toString());
        }
    }

    /* access modifiers changed from: protected */
    public void putEdits(TrakBox trakBox) {
        if (this.edits != null) {
            NodeBox nodeBox = new NodeBox(new Header("edts"));
            nodeBox.add(new EditListBox(this.edits));
            trakBox.add(nodeBox);
        }
    }

    /* access modifiers changed from: protected */
    public void putName(TrakBox trakBox) {
        if (this.name != null) {
            NodeBox nodeBox = new NodeBox(new Header("udta"));
            nodeBox.add(new NameBox(this.name));
            trakBox.add(nodeBox);
        }
    }

    public void setEdits(List<Edit> list) {
        this.edits = list;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setTgtChunkDuration(Rational rational, Unit unit) {
        this.tgtChunkDuration = rational;
        this.tgtChunkDurationUnit = unit;
    }

    public void tapt(TrakBox trakBox) {
        Size displayDimensions = getDisplayDimensions();
        if (this.type == TrackType.VIDEO) {
            NodeBox nodeBox = new NodeBox(new Header("tapt"));
            nodeBox.add(new ClearApertureBox(displayDimensions.getWidth(), displayDimensions.getHeight()));
            nodeBox.add(new ProductionApertureBox(displayDimensions.getWidth(), displayDimensions.getHeight()));
            nodeBox.add(new EncodedPixelBox(displayDimensions.getWidth(), displayDimensions.getHeight()));
            trakBox.add(nodeBox);
        }
    }
}
