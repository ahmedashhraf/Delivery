package org.jcodec.containers.mp4.boxes;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import org.jcodec.common.model.Rational;
import org.jcodec.common.model.Size;
import org.jcodec.containers.mp4.MP4Util;

public class MovieBox extends NodeBox {
    public MovieBox(Header header) {
        super(header);
    }

    private Size applyMatrix(TrakBox trakBox, Size size) {
        int[] matrix = trakBox.getTrackHeader().getMatrix();
        double width = (double) size.getWidth();
        double d = (double) matrix[0];
        Double.isNaN(width);
        Double.isNaN(d);
        int i = (int) ((width * d) / 65536.0d);
        double height = (double) size.getHeight();
        double d2 = (double) matrix[4];
        Double.isNaN(height);
        Double.isNaN(d2);
        return new Size(i, (int) ((height * d2) / 65536.0d));
    }

    public static String fourcc() {
        return "moov";
    }

    private MovieHeaderBox getMovieHeader() {
        return (MovieHeaderBox) Box.findFirst(this, MovieHeaderBox.class, "mvhd");
    }

    private void setTimescale(int i) {
        ((MovieHeaderBox) Box.findFirst(this, MovieHeaderBox.class, "mvhd")).setTimescale(i);
    }

    public void appendTrack(TrakBox trakBox) {
        trakBox.getTrackHeader().setNo(getMovieHeader().getNextTrackId());
        getMovieHeader().setNextTrackId(getMovieHeader().getNextTrackId() + 1);
        this.boxes.add(trakBox);
    }

    public void fixTimescale(int i) {
        TrakBox[] tracks;
        int timescale = getTimescale();
        setTimescale(i);
        for (TrakBox trakBox : getTracks()) {
            long j = (long) timescale;
            trakBox.setDuration(rescale(trakBox.getDuration(), j));
            List edits = trakBox.getEdits();
            if (edits != null) {
                ListIterator listIterator = edits.listIterator();
                while (listIterator.hasNext()) {
                    Edit edit = (Edit) listIterator.next();
                    Edit edit2 = new Edit(rescale(edit.getDuration(), j), edit.getMediaTime(), edit.getRate());
                    listIterator.set(edit2);
                }
            }
        }
        setDuration(rescale(getDuration(), (long) timescale));
    }

    public List<TrakBox> getAudioTracks() {
        TrakBox[] tracks;
        ArrayList arrayList = new ArrayList();
        for (TrakBox trakBox : getTracks()) {
            if (trakBox.isAudio()) {
                arrayList.add(trakBox);
            }
        }
        return arrayList;
    }

    public Size getDisplaySize() {
        TrakBox videoTrack = getVideoTrack();
        if (videoTrack == null) {
            return null;
        }
        ClearApertureBox clearApertureBox = (ClearApertureBox) Box.findFirst(videoTrack, ClearApertureBox.class, "tapt", "clef");
        if (clearApertureBox != null) {
            return applyMatrix(videoTrack, new Size((int) clearApertureBox.getWidth(), (int) clearApertureBox.getHeight()));
        }
        Box box = (Box) ((SampleDescriptionBox) Box.findFirst(videoTrack, SampleDescriptionBox.class, "mdia", "minf", "stbl", "stsd")).getBoxes().get(0);
        if (box == null || !(box instanceof VideoSampleEntry)) {
            return null;
        }
        VideoSampleEntry videoSampleEntry = (VideoSampleEntry) box;
        Rational par = videoTrack.getPAR();
        return applyMatrix(videoTrack, new Size((videoSampleEntry.getWidth() * par.getNum()) / par.getDen(), videoSampleEntry.getHeight()));
    }

    public long getDuration() {
        return getMovieHeader().getDuration();
    }

    /* access modifiers changed from: protected */
    public void getModelFields(List<String> list) {
    }

    public Size getStoredSize() {
        TrakBox videoTrack = getVideoTrack();
        Size size = null;
        if (videoTrack == null) {
            return null;
        }
        EncodedPixelBox encodedPixelBox = (EncodedPixelBox) Box.findFirst(videoTrack, EncodedPixelBox.class, "tapt", "enof");
        if (encodedPixelBox != null) {
            return new Size((int) encodedPixelBox.getWidth(), (int) encodedPixelBox.getHeight());
        }
        Box box = (Box) ((SampleDescriptionBox) Box.findFirst(videoTrack, SampleDescriptionBox.class, "mdia", "minf", "stbl", "stsd")).getBoxes().get(0);
        if (box != null && (box instanceof VideoSampleEntry)) {
            VideoSampleEntry videoSampleEntry = (VideoSampleEntry) box;
            size = new Size(videoSampleEntry.getWidth(), videoSampleEntry.getHeight());
        }
        return size;
    }

    public TrakBox getTimecodeTrack() {
        TrakBox[] tracks;
        for (TrakBox trakBox : getTracks()) {
            if (trakBox.isTimecode()) {
                return trakBox;
            }
        }
        return null;
    }

    public int getTimescale() {
        return getMovieHeader().getTimescale();
    }

    public TrakBox[] getTracks() {
        return (TrakBox[]) Box.findAll(this, TrakBox.class, "trak");
    }

    public TrakBox getVideoTrack() {
        TrakBox[] tracks;
        for (TrakBox trakBox : getTracks()) {
            if (trakBox.isVideo()) {
                return trakBox;
            }
        }
        return null;
    }

    public TrakBox importTrack(MovieBox movieBox, TrakBox trakBox) {
        TrakBox trakBox2 = (TrakBox) MP4Util.cloneBox(trakBox, 1048576);
        List<Edit> edits = trakBox2.getEdits();
        ArrayList arrayList = new ArrayList();
        if (edits != null) {
            for (Edit edit : edits) {
                Edit edit2 = new Edit(rescale(edit.getDuration(), (long) movieBox.getTimescale()), edit.getMediaTime(), edit.getRate());
                arrayList.add(edit2);
            }
        }
        trakBox2.setEdits(arrayList);
        return trakBox2;
    }

    public boolean isPureRefMovie(MovieBox movieBox) {
        boolean z = true;
        for (TrakBox isPureRef : movieBox.getTracks()) {
            z &= isPureRef.isPureRef();
        }
        return z;
    }

    public long rescale(long j, long j2) {
        return (j * ((long) getTimescale())) / j2;
    }

    public void setDuration(long j) {
        getMovieHeader().setDuration(j);
    }

    public void updateDuration() {
        TrakBox[] tracks;
        long j = 2147483647L;
        for (TrakBox trakBox : getTracks()) {
            if (trakBox.getDuration() < j) {
                j = trakBox.getDuration();
            }
        }
        getMovieHeader().setDuration(j);
    }

    public MovieBox() {
        super(new Header(fourcc()));
    }

    public MovieBox(MovieBox movieBox) {
        super((NodeBox) movieBox);
    }
}
