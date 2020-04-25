package org.jcodec.containers.mp4.demuxer;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import org.jcodec.common.NIOUtils;
import org.jcodec.common.SeekableByteChannel;
import org.jcodec.containers.mp4.MP4Util;
import org.jcodec.containers.mp4.TrackType;
import org.jcodec.containers.mp4.boxes.Box;
import org.jcodec.containers.mp4.boxes.HandlerBox;
import org.jcodec.containers.mp4.boxes.MovieBox;
import org.jcodec.containers.mp4.boxes.NodeBox;
import org.jcodec.containers.mp4.boxes.SampleEntry;
import org.jcodec.containers.mp4.boxes.SampleSizesBox;
import org.jcodec.containers.mp4.boxes.TrakBox;

public class MP4Demuxer {
    private static int free = 1718773093;
    private static int ftyp = 1718909296;
    private static int mdat = 1835295092;
    private static int moov = 1836019574;
    private static int wide = 2003395685;
    private SeekableByteChannel input;
    MovieBox movie;
    private TimecodeMP4DemuxerTrack timecodeTrack;
    private List<AbstractMP4DemuxerTrack> tracks = new LinkedList();

    public MP4Demuxer(SeekableByteChannel seekableByteChannel) throws IOException {
        this.input = seekableByteChannel;
        findMovieBox(seekableByteChannel);
    }

    private void findMovieBox(SeekableByteChannel seekableByteChannel) throws IOException {
        this.movie = MP4Util.parseMovie(seekableByteChannel);
        MovieBox movieBox = this.movie;
        if (movieBox != null) {
            processHeader(movieBox);
            return;
        }
        throw new IOException("Could not find movie meta information box");
    }

    public static TrackType getTrackType(TrakBox trakBox) {
        return TrackType.fromHandler(((HandlerBox) Box.findFirst(trakBox, HandlerBox.class, "mdia", "hdlr")).getComponentSubType());
    }

    public static int probe(ByteBuffer byteBuffer) {
        ByteBuffer duplicate = byteBuffer.duplicate();
        int i = 0;
        int i2 = 0;
        while (true) {
            int i3 = 8;
            if (duplicate.remaining() < 8) {
                break;
            }
            long j = ((long) duplicate.getInt()) & 4294967295L;
            int i4 = duplicate.getInt();
            if (j != 1) {
                if (j < 8) {
                    break;
                }
            } else {
                j = duplicate.getLong();
                i3 = 16;
            }
            if ((i4 == ftyp && j < 64) || ((i4 == moov && j < 104857600) || i4 == free || i4 == mdat || i4 == wide)) {
                i++;
            }
            i2++;
            if (j >= 2147483647L) {
                break;
            }
            NIOUtils.skip(duplicate, (int) (j - ((long) i3)));
        }
        if (i2 == 0) {
            return 0;
        }
        return (i * 100) / i2;
    }

    private void processHeader(NodeBox nodeBox) throws IOException {
        TrakBox[] trakBoxArr;
        TrakBox trakBox = null;
        for (TrakBox trakBox2 : (TrakBox[]) Box.findAll(nodeBox, TrakBox.class, "trak")) {
            if ("tmcd".equals(((SampleEntry) Box.findFirst(trakBox2, SampleEntry.class, "mdia", "minf", "stbl", "stsd", null)).getFourcc())) {
                trakBox = trakBox2;
            } else {
                this.tracks.add(create(trakBox2));
            }
        }
        if (trakBox != null && getVideoTrack() != null) {
            this.timecodeTrack = new TimecodeMP4DemuxerTrack(this.movie, trakBox, this.input);
        }
    }

    public AbstractMP4DemuxerTrack create(TrakBox trakBox) {
        if (((SampleSizesBox) Box.findFirst(trakBox, SampleSizesBox.class, "mdia", "minf", "stbl", "stsz")).getDefaultSize() == 0) {
            return new FramesMP4DemuxerTrack(this.movie, trakBox, this.input);
        }
        return new PCMMP4DemuxerTrack(this.movie, trakBox, this.input);
    }

    public List<AbstractMP4DemuxerTrack> getAudioTracks() {
        ArrayList arrayList = new ArrayList();
        for (AbstractMP4DemuxerTrack abstractMP4DemuxerTrack : this.tracks) {
            if (abstractMP4DemuxerTrack.box.isAudio()) {
                arrayList.add(abstractMP4DemuxerTrack);
            }
        }
        return arrayList;
    }

    public MovieBox getMovie() {
        return this.movie;
    }

    public TimecodeMP4DemuxerTrack getTimecodeTrack() {
        return this.timecodeTrack;
    }

    public AbstractMP4DemuxerTrack getTrack(int i) {
        for (AbstractMP4DemuxerTrack abstractMP4DemuxerTrack : this.tracks) {
            if (abstractMP4DemuxerTrack.getNo() == i) {
                return abstractMP4DemuxerTrack;
            }
        }
        return null;
    }

    public AbstractMP4DemuxerTrack[] getTracks() {
        return (AbstractMP4DemuxerTrack[]) this.tracks.toArray(new AbstractMP4DemuxerTrack[0]);
    }

    public AbstractMP4DemuxerTrack getVideoTrack() {
        for (AbstractMP4DemuxerTrack abstractMP4DemuxerTrack : this.tracks) {
            if (abstractMP4DemuxerTrack.box.isVideo()) {
                return abstractMP4DemuxerTrack;
            }
        }
        return null;
    }
}
