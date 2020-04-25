package org.jcodec.containers.mp4;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import org.jcodec.common.model.RationalLarge;
import org.jcodec.containers.mp4.boxes.Box;
import org.jcodec.containers.mp4.boxes.Edit;
import org.jcodec.containers.mp4.boxes.MovieBox;
import org.jcodec.containers.mp4.boxes.TimeToSampleBox;
import org.jcodec.containers.mp4.boxes.TimeToSampleBox.TimeToSampleEntry;
import org.jcodec.containers.mp4.boxes.TimecodeSampleEntry;
import org.jcodec.containers.mp4.boxes.TrakBox;
import org.jcodec.containers.mp4.demuxer.TimecodeMP4DemuxerTrack;
import p212io.fabric.sdk.android.p493p.p496c.C14282d;

public class QTTimeUtil {
    public static long editedToMedia(TrakBox trakBox, long j, int i) {
        if (trakBox.getEdits() == null) {
            return j;
        }
        long j2 = 0;
        for (Edit edit : trakBox.getEdits()) {
            long rescale = trakBox.rescale(edit.getDuration(), (long) i) + j2;
            if (rescale > j) {
                return (edit.getMediaTime() + j) - j2;
            }
            j2 = rescale;
        }
        return j2;
    }

    public static String formatTimecode(TrakBox trakBox, int i) {
        byte numFrames = ((TimecodeSampleEntry) Box.findFirst(trakBox, TimecodeSampleEntry.class, "mdia", "minf", "stbl", "stsd", "tmcd")).getNumFrames();
        String str = "%02d";
        String format = String.format(str, new Object[]{Integer.valueOf(i % numFrames)});
        int i2 = i / numFrames;
        StringBuilder sb = new StringBuilder();
        sb.append(String.format(str, new Object[]{Integer.valueOf(i2 % 60)}));
        String str2 = ":";
        sb.append(str2);
        sb.append(format);
        String sb2 = sb.toString();
        int i3 = i2 / 60;
        StringBuilder sb3 = new StringBuilder();
        sb3.append(String.format(str, new Object[]{Integer.valueOf(i3 % 60)}));
        sb3.append(str2);
        sb3.append(sb2);
        String sb4 = sb3.toString();
        int i4 = i3 / 60;
        StringBuilder sb5 = new StringBuilder();
        sb5.append(String.format(str, new Object[]{Integer.valueOf(i4)}));
        sb5.append(str2);
        sb5.append(sb4);
        return sb5.toString();
    }

    public static long frameToTimevalue(TrakBox trakBox, int i) {
        int i2 = 0;
        TimeToSampleEntry[] entries = ((TimeToSampleBox) Box.findFirst(trakBox, TimeToSampleBox.class, "mdia", "minf", "stbl", "stts")).getEntries();
        long j = 0;
        while (i >= entries[i2].getSampleCount()) {
            i -= entries[i2].getSampleCount();
            j += (long) (entries[i2].getSampleCount() * entries[i2].getSampleDuration());
            i2++;
        }
        return j + ((long) (entries[i2].getSampleDuration() * i));
    }

    public static long getEditedDuration(TrakBox trakBox) {
        List<Edit> edits = trakBox.getEdits();
        if (edits == null) {
            return trakBox.getDuration();
        }
        long j = 0;
        for (Edit duration : edits) {
            j += duration.getDuration();
        }
        return j;
    }

    public static long mediaToEdited(TrakBox trakBox, long j, int i) {
        if (trakBox.getEdits() == null) {
            return j;
        }
        long j2 = 0;
        Iterator it = trakBox.getEdits().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Edit edit = (Edit) it.next();
            if (j >= edit.getMediaTime()) {
                long rescale = trakBox.rescale(edit.getDuration(), (long) i);
                if (edit.getMediaTime() != -1 && j >= edit.getMediaTime() && j < edit.getMediaTime() + rescale) {
                    j2 += j - edit.getMediaTime();
                    break;
                }
                j2 += rescale;
            } else {
                return j2;
            }
        }
        return j2;
    }

    public static int qtPlayerFrameNo(MovieBox movieBox, int i) {
        TrakBox videoTrack = movieBox.getVideoTrack();
        return tv2QTFrameNo(movieBox, mediaToEdited(videoTrack, frameToTimevalue(videoTrack, i), movieBox.getTimescale()));
    }

    public static String qtPlayerTime(MovieBox movieBox, int i) {
        TrakBox videoTrack = movieBox.getVideoTrack();
        int mediaToEdited = (int) (mediaToEdited(videoTrack, frameToTimevalue(videoTrack, i), movieBox.getTimescale()) / ((long) videoTrack.getTimescale()));
        StringBuilder sb = new StringBuilder();
        String str = "%02d";
        sb.append(String.format(str, new Object[]{Integer.valueOf(mediaToEdited / 3600)}));
        String str2 = C14282d.ROLL_OVER_FILE_NAME_SEPARATOR;
        sb.append(str2);
        sb.append(String.format(str, new Object[]{Integer.valueOf((mediaToEdited % 3600) / 60)}));
        sb.append(str2);
        sb.append(String.format(str, new Object[]{Integer.valueOf(mediaToEdited % 60)}));
        return sb.toString();
    }

    public static String qtPlayerTimecode(MovieBox movieBox, TimecodeMP4DemuxerTrack timecodeMP4DemuxerTrack, int i) throws IOException {
        TrakBox videoTrack = movieBox.getVideoTrack();
        long mediaToEdited = mediaToEdited(videoTrack, frameToTimevalue(videoTrack, i), movieBox.getTimescale());
        TrakBox box = timecodeMP4DemuxerTrack.getBox();
        long timescale = (long) box.getTimescale();
        return formatTimecode(timecodeMP4DemuxerTrack.getBox(), timecodeMP4DemuxerTrack.getStartTimecode() + timevalueToTimecodeFrame(timecodeMP4DemuxerTrack.getBox(), new RationalLarge(editedToMedia(box, (mediaToEdited * timescale) / ((long) videoTrack.getTimescale()), movieBox.getTimescale()), timescale), movieBox.getTimescale()));
    }

    public static int timevalueToFrame(TrakBox trakBox, long j) {
        int i = 0;
        TimeToSampleEntry[] entries = ((TimeToSampleBox) Box.findFirst(trakBox, TimeToSampleBox.class, "mdia", "minf", "stbl", "stts")).getEntries();
        int i2 = 0;
        while (j > 0 && i < entries.length) {
            long sampleDuration = j / ((long) entries[i].getSampleDuration());
            j -= (long) (entries[i].getSampleCount() * entries[i].getSampleDuration());
            long j2 = (long) i2;
            if (j > 0) {
                sampleDuration = (long) entries[i].getSampleCount();
            }
            i2 = (int) (j2 + sampleDuration);
            i++;
        }
        return i2;
    }

    public static int timevalueToTimecodeFrame(TrakBox trakBox, RationalLarge rationalLarge, int i) {
        TimecodeSampleEntry timecodeSampleEntry = (TimecodeSampleEntry) trakBox.getSampleEntries()[0];
        return ((int) (((rationalLarge.multiplyS((long) timecodeSampleEntry.getTimescale()) * 2) / ((long) timecodeSampleEntry.getFrameDuration())) + 1)) / 2;
    }

    public static int tv2QTFrameNo(MovieBox movieBox, long j) {
        TrakBox videoTrack = movieBox.getVideoTrack();
        TrakBox timecodeTrack = movieBox.getTimecodeTrack();
        if (timecodeTrack != null) {
            if (Box.findFirst(videoTrack, "tref", "tmcd") != null) {
                return timevalueToTimecodeFrame(timecodeTrack, new RationalLarge(j, (long) videoTrack.getTimescale()), movieBox.getTimescale());
            }
        }
        return timevalueToFrame(videoTrack, j);
    }

    public static String qtPlayerTimecode(TimecodeMP4DemuxerTrack timecodeMP4DemuxerTrack, RationalLarge rationalLarge, int i) throws IOException {
        TrakBox box = timecodeMP4DemuxerTrack.getBox();
        long timescale = (long) box.getTimescale();
        return formatTimecode(timecodeMP4DemuxerTrack.getBox(), timecodeMP4DemuxerTrack.getStartTimecode() + timevalueToTimecodeFrame(timecodeMP4DemuxerTrack.getBox(), new RationalLarge(editedToMedia(box, rationalLarge.multiplyS(timescale), i), timescale), i));
    }
}
