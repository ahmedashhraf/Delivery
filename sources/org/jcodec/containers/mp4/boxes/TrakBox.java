package org.jcodec.containers.mp4.boxes;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import org.jcodec.common.model.Rational;
import org.jcodec.common.model.Size;
import org.jcodec.containers.mp4.QTTimeUtil;
import org.jcodec.containers.mp4.boxes.TimeToSampleBox.TimeToSampleEntry;

public class TrakBox extends NodeBox {
    public TrakBox(Header header) {
        super(header);
    }

    public static String fourcc() {
        return "trak";
    }

    public void fixMediaTimescale(int i) {
        TimeToSampleEntry[] entries;
        String str = "mdia";
        MediaHeaderBox mediaHeaderBox = (MediaHeaderBox) Box.findFirst(this, MediaHeaderBox.class, str, "mdhd");
        int timescale = mediaHeaderBox.getTimescale();
        mediaHeaderBox.setTimescale(i);
        long j = (long) i;
        long j2 = (long) timescale;
        mediaHeaderBox.setDuration((mediaHeaderBox.getDuration() * j) / j2);
        List<Edit> edits = getEdits();
        if (edits != null) {
            for (Edit edit : edits) {
                edit.setMediaTime((edit.getMediaTime() * j) / j2);
            }
        }
        for (TimeToSampleEntry timeToSampleEntry : ((TimeToSampleBox) Box.findFirst(this, TimeToSampleBox.class, str, "minf", "stbl", "stts")).getEntries()) {
            timeToSampleEntry.setSampleDuration((timeToSampleEntry.getSampleDuration() * i) / timescale);
        }
    }

    public Size getCodedSize() {
        SampleEntry sampleEntry = getSampleEntries()[0];
        if (sampleEntry instanceof VideoSampleEntry) {
            VideoSampleEntry videoSampleEntry = (VideoSampleEntry) sampleEntry;
            return new Size(videoSampleEntry.getWidth(), videoSampleEntry.getHeight());
        }
        throw new IllegalArgumentException("Not a video track");
    }

    public long getDuration() {
        return getTrackHeader().getDuration();
    }

    public List<Edit> getEdits() {
        EditListBox editListBox = (EditListBox) Box.findFirst(this, EditListBox.class, "edts", "elst");
        if (editListBox == null) {
            return null;
        }
        return editListBox.getEdits();
    }

    public int getFrameCount() {
        SampleSizesBox sampleSizesBox = (SampleSizesBox) Box.findFirst(this, SampleSizesBox.class, "mdia", "minf", "stbl", "stsz");
        return sampleSizesBox.getDefaultSize() != 0 ? sampleSizesBox.getCount() : sampleSizesBox.getSizes().length;
    }

    public String getHandlerType() {
        HandlerBox handlerBox = (HandlerBox) Box.findFirst(this, HandlerBox.class, "mdia", "hdlr");
        if (handlerBox == null) {
            return null;
        }
        return handlerBox.getComponentSubType();
    }

    public MediaBox getMdia() {
        return (MediaBox) Box.findFirst(this, MediaBox.class, "mdia");
    }

    public long getMediaDuration() {
        return ((MediaHeaderBox) Box.findFirst(this, MediaHeaderBox.class, "mdia", "mdhd")).getDuration();
    }

    /* access modifiers changed from: protected */
    public void getModelFields(List<String> list) {
    }

    public String getName() {
        NameBox nameBox = (NameBox) Box.findFirst(this, NameBox.class, "udta", "name");
        if (nameBox == null) {
            return null;
        }
        return nameBox.getName();
    }

    public Rational getPAR() {
        PixelAspectExt pixelAspectExt = (PixelAspectExt) Box.findFirst(this, PixelAspectExt.class, "mdia", "minf", "stbl", "stsd", null, "pasp");
        return pixelAspectExt == null ? new Rational(1, 1) : pixelAspectExt.getRational();
    }

    public long getSampleCount() {
        return (long) ((SampleSizesBox) Box.findFirst(this, SampleSizesBox.class, "mdia", "minf", "stbl", "stsz")).getCount();
    }

    public SampleEntry[] getSampleEntries() {
        return (SampleEntry[]) Box.findAll(this, SampleEntry.class, "mdia", "minf", "stbl", "stsd", null);
    }

    public int getTimescale() {
        return ((MediaHeaderBox) Box.findFirst(this, MediaHeaderBox.class, "mdia", "mdhd")).getTimescale();
    }

    public TrackHeaderBox getTrackHeader() {
        return (TrackHeaderBox) Box.findFirst(this, TrackHeaderBox.class, "tkhd");
    }

    public boolean hasDataRef() {
        DataInfoBox dinf = getMdia().getMinf().getDinf();
        if (dinf == null) {
            return false;
        }
        DataRefBox dref = dinf.getDref();
        if (dref == null) {
            return false;
        }
        Iterator it = dref.boxes.iterator();
        boolean z = false;
        while (it.hasNext()) {
            boolean z2 = true;
            if ((((FullBox) it.next()).getFlags() & 1) == 1) {
                z2 = false;
            }
            z |= z2;
        }
        return z;
    }

    public boolean isAudio() {
        return "soun".equals(getHandlerType());
    }

    public boolean isPureRef() {
        DataInfoBox dinf = getMdia().getMinf().getDinf();
        if (dinf == null) {
            return false;
        }
        DataRefBox dref = dinf.getDref();
        if (dref == null) {
            return false;
        }
        Iterator it = dref.boxes.iterator();
        while (it.hasNext()) {
            if ((((FullBox) it.next()).getFlags() & 1) != 0) {
                return false;
            }
        }
        return true;
    }

    public boolean isTimecode() {
        return "tmcd".equals(getHandlerType());
    }

    public boolean isVideo() {
        return "vide".equals(getHandlerType());
    }

    public long rescale(long j, long j2) {
        return (j * ((long) getTimescale())) / j2;
    }

    public void setAperture(Size size, Size size2) {
        String str = "tapt";
        removeChildren(str);
        NodeBox nodeBox = new NodeBox(new Header(str));
        nodeBox.add(new ClearApertureBox(size2.getWidth(), size2.getHeight()));
        nodeBox.add(new ProductionApertureBox(size2.getWidth(), size2.getHeight()));
        nodeBox.add(new EncodedPixelBox(size.getWidth(), size.getHeight()));
        add(nodeBox);
    }

    public void setClipRect(short s, short s2, short s3, short s4) {
        String str = "clip";
        NodeBox nodeBox = (NodeBox) Box.findFirst(this, NodeBox.class, str);
        if (nodeBox == null) {
            nodeBox = new NodeBox(new Header(str));
            add(nodeBox);
        }
        nodeBox.replace("crgn", new ClipRegionBox(s, s2, s3, s4));
    }

    public void setDataRef(String str) {
        MediaInfoBox minf = getMdia().getMinf();
        DataInfoBox dinf = minf.getDinf();
        if (dinf == null) {
            dinf = new DataInfoBox();
            minf.add(dinf);
        }
        DataRefBox dref = dinf.getDref();
        UrlBox urlBox = new UrlBox(str);
        if (dref == null) {
            DataRefBox dataRefBox = new DataRefBox();
            dinf.add(dataRefBox);
            dataRefBox.add(urlBox);
            return;
        }
        ListIterator listIterator = dref.boxes.listIterator();
        while (listIterator.hasNext()) {
            if ((((FullBox) listIterator.next()).getFlags() & 1) != 0) {
                listIterator.set(urlBox);
            }
        }
    }

    public void setDimensions(Size size) {
        getTrackHeader().setWidth((float) size.getWidth());
        getTrackHeader().setHeight((float) size.getHeight());
    }

    public void setDuration(long j) {
        getTrackHeader().setDuration(j);
    }

    public void setEdits(List<Edit> list) {
        String str = "edts";
        NodeBox nodeBox = (NodeBox) Box.findFirst(this, NodeBox.class, str);
        if (nodeBox == null) {
            nodeBox = new NodeBox(new Header(str));
            add(nodeBox);
        }
        nodeBox.removeChildren("elst");
        nodeBox.add(new EditListBox(list));
        getTrackHeader().setDuration(QTTimeUtil.getEditedDuration(this));
    }

    public void setName(String str) {
        String str2 = "udta";
        NodeBox nodeBox = (NodeBox) Box.findFirst(this, NodeBox.class, str2);
        if (nodeBox == null) {
            nodeBox = new NodeBox(new Header(str2));
            add(nodeBox);
        }
        nodeBox.removeChildren("name");
        nodeBox.add(new NameBox(str));
    }

    public void setPAR(Rational rational) {
        SampleEntry[] sampleEntries;
        for (SampleEntry sampleEntry : getSampleEntries()) {
            sampleEntry.removeChildren("pasp");
            sampleEntry.add(new PixelAspectExt(rational));
        }
    }

    public TrakBox() {
        super(new Header(fourcc()));
    }
}
