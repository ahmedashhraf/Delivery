package org.jcodec.containers.mp4.muxer;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.jcodec.common.AudioFormat;
import org.jcodec.common.NIOUtils;
import org.jcodec.common.SeekableByteChannel;
import org.jcodec.common.model.Size;
import org.jcodec.containers.mp4.Brand;
import org.jcodec.containers.mp4.MP4Util;
import org.jcodec.containers.mp4.TrackType;
import org.jcodec.containers.mp4.boxes.AudioSampleEntry;
import org.jcodec.containers.mp4.boxes.Box;
import org.jcodec.containers.mp4.boxes.EndianBox;
import org.jcodec.containers.mp4.boxes.EndianBox.Endian;
import org.jcodec.containers.mp4.boxes.FileTypeBox;
import org.jcodec.containers.mp4.boxes.FormatBox;
import org.jcodec.containers.mp4.boxes.Header;
import org.jcodec.containers.mp4.boxes.LeafBox;
import org.jcodec.containers.mp4.boxes.MovieBox;
import org.jcodec.containers.mp4.boxes.MovieHeaderBox;
import org.jcodec.containers.mp4.boxes.NodeBox;
import org.jcodec.containers.mp4.boxes.SampleEntry;
import org.jcodec.containers.mp4.boxes.VideoSampleEntry;
import p076c.p112d.p148d.p150g.C6637f;

public class MP4Muxer {
    protected long mdatOffset;
    private int nextTrackId;
    protected SeekableByteChannel out;
    private List<AbstractMP4MuxerTrack> tracks;

    public MP4Muxer(SeekableByteChannel seekableByteChannel) throws IOException {
        this(seekableByteChannel, Brand.MP4);
    }

    public static AudioSampleEntry audioSampleEntry(String str, int i, int i2, int i3, int i4, Endian endian) {
        int i5 = i3;
        AudioSampleEntry audioSampleEntry = r1;
        AudioSampleEntry audioSampleEntry2 = new AudioSampleEntry(new Header(str, 0), (short) i, (short) i5, 16, i4, 0, 0, 65535, 0, 1, i2, i5 * i2, i2, 1);
        NodeBox nodeBox = new NodeBox(new Header("wave"));
        audioSampleEntry.add(nodeBox);
        AudioSampleEntry audioSampleEntry3 = audioSampleEntry;
        nodeBox.add(new FormatBox(str));
        nodeBox.add(new EndianBox(endian));
        nodeBox.add(terminatorAtom());
        return audioSampleEntry3;
    }

    public static String lookupFourcc(AudioFormat audioFormat) {
        if (audioFormat.getSampleSizeInBits() == 16 && !audioFormat.isBigEndian()) {
            return "sowt";
        }
        if (audioFormat.getSampleSizeInBits() == 24) {
            return "in24";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Audio format ");
        sb.append(audioFormat);
        sb.append(" is not supported.");
        throw new IllegalArgumentException(sb.toString());
    }

    private MovieHeaderBox movieHeader(NodeBox nodeBox) {
        int timescale = ((AbstractMP4MuxerTrack) this.tracks.get(0)).getTimescale();
        long trackTotalDuration = ((AbstractMP4MuxerTrack) this.tracks.get(0)).getTrackTotalDuration();
        AbstractMP4MuxerTrack videoTrack = getVideoTrack();
        if (videoTrack != null) {
            timescale = videoTrack.getTimescale();
            trackTotalDuration = videoTrack.getTrackTotalDuration();
        }
        MovieHeaderBox movieHeaderBox = new MovieHeaderBox(timescale, trackTotalDuration, 1.0f, 1.0f, new Date().getTime(), new Date().getTime(), new int[]{65536, 0, 0, 0, 65536, 0, 0, 0, C6637f.f18605b}, this.nextTrackId);
        return movieHeaderBox;
    }

    public static LeafBox terminatorAtom() {
        return new LeafBox(new Header(new String(new byte[4])), ByteBuffer.allocate(0));
    }

    public static VideoSampleEntry videoSampleEntry(String str, Size size, String str2) {
        VideoSampleEntry videoSampleEntry = new VideoSampleEntry(new Header(str), 0, 0, "jcod", 0, 768, (short) size.getWidth(), (short) size.getHeight(), 72, 72, 1, str2 != null ? str2 : "jcodec", 24, 1, -1);
        return videoSampleEntry;
    }

    public FramesMP4MuxerTrack addCompressedAudioTrack(String str, int i, int i2, int i3, int i4, Box... boxArr) {
        String str2 = str;
        Box[] boxArr2 = boxArr;
        FramesMP4MuxerTrack addTrack = addTrack(TrackType.SOUND, i);
        AudioSampleEntry audioSampleEntry = r4;
        AudioSampleEntry audioSampleEntry2 = new AudioSampleEntry(new Header(str2, 0), 1, (short) i2, 16, i3, 0, 0, 65534, 0, i4, 0, 0, 2, 1);
        NodeBox nodeBox = new NodeBox(new Header("wave"));
        AudioSampleEntry audioSampleEntry3 = audioSampleEntry;
        audioSampleEntry3.add(nodeBox);
        nodeBox.add(new FormatBox(str2));
        for (Box add : boxArr2) {
            nodeBox.add(add);
        }
        nodeBox.add(terminatorAtom());
        addTrack.addSampleEntry(audioSampleEntry3);
        return addTrack;
    }

    public PCMMP4MuxerTrack addPCMAudioTrack(AudioFormat audioFormat) {
        return addPCMTrack(audioFormat.getSampleRate(), 1, (audioFormat.getSampleSizeInBits() >> 3) * audioFormat.getChannels(), audioSampleEntry(audioFormat));
    }

    public PCMMP4MuxerTrack addPCMTrack(int i, int i2, int i3, SampleEntry sampleEntry) {
        SeekableByteChannel seekableByteChannel = this.out;
        int i4 = this.nextTrackId;
        this.nextTrackId = i4 + 1;
        PCMMP4MuxerTrack pCMMP4MuxerTrack = new PCMMP4MuxerTrack(seekableByteChannel, i4, TrackType.SOUND, i, i2, i3, sampleEntry);
        this.tracks.add(pCMMP4MuxerTrack);
        return pCMMP4MuxerTrack;
    }

    public TimecodeMP4MuxerTrack addTimecodeTrack(int i) {
        SeekableByteChannel seekableByteChannel = this.out;
        int i2 = this.nextTrackId;
        this.nextTrackId = i2 + 1;
        TimecodeMP4MuxerTrack timecodeMP4MuxerTrack = new TimecodeMP4MuxerTrack(seekableByteChannel, i2, i);
        this.tracks.add(timecodeMP4MuxerTrack);
        return timecodeMP4MuxerTrack;
    }

    public FramesMP4MuxerTrack addTrack(TrackType trackType, int i) {
        SeekableByteChannel seekableByteChannel = this.out;
        int i2 = this.nextTrackId;
        this.nextTrackId = i2 + 1;
        FramesMP4MuxerTrack framesMP4MuxerTrack = new FramesMP4MuxerTrack(seekableByteChannel, i2, trackType, i);
        this.tracks.add(framesMP4MuxerTrack);
        return framesMP4MuxerTrack;
    }

    public FramesMP4MuxerTrack addVideoTrack(String str, Size size, String str2, int i) {
        FramesMP4MuxerTrack addTrack = addTrack(TrackType.VIDEO, i);
        addTrack.addSampleEntry(videoSampleEntry(str, size, str2));
        return addTrack;
    }

    public FramesMP4MuxerTrack addVideoTrackWithTimecode(String str, Size size, String str2, int i) {
        TimecodeMP4MuxerTrack addTimecodeTrack = addTimecodeTrack(i);
        FramesMP4MuxerTrack addTrack = addTrack(TrackType.VIDEO, i);
        addTrack.addSampleEntry(videoSampleEntry(str, size, str2));
        addTrack.setTimecode(addTimecodeTrack);
        return addTrack;
    }

    public MovieBox finalizeHeader() throws IOException {
        MovieBox movieBox = new MovieBox();
        MovieHeaderBox movieHeader = movieHeader(movieBox);
        movieBox.addFirst(movieHeader);
        for (AbstractMP4MuxerTrack finish : this.tracks) {
            Box finish2 = finish.finish(movieHeader);
            if (finish2 != null) {
                movieBox.add(finish2);
            }
        }
        return movieBox;
    }

    public List<AbstractMP4MuxerTrack> getAudioTracks() {
        ArrayList arrayList = new ArrayList();
        for (AbstractMP4MuxerTrack abstractMP4MuxerTrack : this.tracks) {
            if (abstractMP4MuxerTrack.isAudio()) {
                arrayList.add(abstractMP4MuxerTrack);
            }
        }
        return arrayList;
    }

    public AbstractMP4MuxerTrack getTimecodeTrack() {
        for (AbstractMP4MuxerTrack abstractMP4MuxerTrack : this.tracks) {
            if (abstractMP4MuxerTrack.isTimecode()) {
                return abstractMP4MuxerTrack;
            }
        }
        return null;
    }

    public List<AbstractMP4MuxerTrack> getTracks() {
        return this.tracks;
    }

    public AbstractMP4MuxerTrack getVideoTrack() {
        for (AbstractMP4MuxerTrack abstractMP4MuxerTrack : this.tracks) {
            if (abstractMP4MuxerTrack.isVideo()) {
                return abstractMP4MuxerTrack;
            }
        }
        return null;
    }

    public void storeHeader(MovieBox movieBox) throws IOException {
        long position = (this.out.position() - this.mdatOffset) + 8;
        MP4Util.writeMovie(this.out, movieBox);
        this.out.position(this.mdatOffset);
        NIOUtils.writeLong(this.out, position);
    }

    public void writeHeader() throws IOException {
        storeHeader(finalizeHeader());
    }

    public MP4Muxer(SeekableByteChannel seekableByteChannel, Brand brand) throws IOException {
        this(seekableByteChannel, brand.getFileTypeBox());
    }

    public MP4Muxer(SeekableByteChannel seekableByteChannel, FileTypeBox fileTypeBox) throws IOException {
        this.tracks = new ArrayList();
        this.nextTrackId = 1;
        this.out = seekableByteChannel;
        ByteBuffer allocate = ByteBuffer.allocate(1024);
        fileTypeBox.write(allocate);
        new Header("wide", 8).write(allocate);
        new Header("mdat", 1).write(allocate);
        this.mdatOffset = (long) allocate.position();
        allocate.putLong(0);
        allocate.flip();
        seekableByteChannel.write(allocate);
    }

    public static AudioSampleEntry audioSampleEntry(AudioFormat audioFormat) {
        return audioSampleEntry(lookupFourcc(audioFormat), 1, audioFormat.getSampleSizeInBits() >> 3, audioFormat.getChannels(), audioFormat.getSampleRate(), audioFormat.isBigEndian() ? Endian.BIG_ENDIAN : Endian.LITTLE_ENDIAN);
    }
}
