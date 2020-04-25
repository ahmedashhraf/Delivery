package org.jcodec.movtool;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.ListIterator;
import org.jcodec.common.ArrayUtil;
import org.jcodec.common.model.Rational;
import org.jcodec.containers.mp4.boxes.Box;
import org.jcodec.containers.mp4.boxes.ChunkOffsets64Box;
import org.jcodec.containers.mp4.boxes.ChunkOffsetsBox;
import org.jcodec.containers.mp4.boxes.DataRefBox;
import org.jcodec.containers.mp4.boxes.Edit;
import org.jcodec.containers.mp4.boxes.MediaHeaderBox;
import org.jcodec.containers.mp4.boxes.MovieBox;
import org.jcodec.containers.mp4.boxes.MovieHeaderBox;
import org.jcodec.containers.mp4.boxes.NodeBox;
import org.jcodec.containers.mp4.boxes.SampleDescriptionBox;
import org.jcodec.containers.mp4.boxes.SampleEntry;
import org.jcodec.containers.mp4.boxes.SampleSizesBox;
import org.jcodec.containers.mp4.boxes.SampleToChunkBox;
import org.jcodec.containers.mp4.boxes.SampleToChunkBox.SampleToChunkEntry;
import org.jcodec.containers.mp4.boxes.TimeToSampleBox;
import org.jcodec.containers.mp4.boxes.TimeToSampleBox.TimeToSampleEntry;
import org.jcodec.containers.mp4.boxes.TrakBox;

public class Util {

    public static class Pair<T> {

        /* renamed from: a */
        private T f44907a;

        /* renamed from: b */
        private T f44908b;

        public Pair(T t, T t2) {
            this.f44907a = t;
            this.f44908b = t2;
        }

        public T getA() {
            return this.f44907a;
        }

        public T getB() {
            return this.f44908b;
        }
    }

    private static void appendChunkOffsets(TrakBox trakBox, TrakBox trakBox2) {
        TrakBox trakBox3 = trakBox;
        TrakBox trakBox4 = trakBox2;
        Class<ChunkOffsets64Box> cls = ChunkOffsets64Box.class;
        Class<ChunkOffsetsBox> cls2 = ChunkOffsetsBox.class;
        String str = "mdia";
        String str2 = "minf";
        String str3 = "stbl";
        String str4 = "stco";
        ChunkOffsetsBox chunkOffsetsBox = (ChunkOffsetsBox) Box.findFirst(trakBox3, cls2, str, str2, str3, str4);
        String str5 = "co64";
        ChunkOffsets64Box chunkOffsets64Box = (ChunkOffsets64Box) Box.findFirst(trakBox3, cls, str, str2, str3, str5);
        ChunkOffsetsBox chunkOffsetsBox2 = (ChunkOffsetsBox) Box.findFirst(trakBox4, cls2, str, str2, str3, str4);
        ChunkOffsets64Box chunkOffsets64Box2 = (ChunkOffsets64Box) Box.findFirst(trakBox4, cls, str, str2, str3, str5);
        long[] chunkOffsets = chunkOffsetsBox == null ? chunkOffsets64Box.getChunkOffsets() : chunkOffsetsBox.getChunkOffsets();
        long[] chunkOffsets2 = chunkOffsetsBox2 == null ? chunkOffsets64Box2.getChunkOffsets() : chunkOffsetsBox2.getChunkOffsets();
        NodeBox nodeBox = (NodeBox) Box.findFirst(trakBox3, NodeBox.class, str, str2, str3);
        nodeBox.removeChildren(str4, str5);
        nodeBox.add((chunkOffsets64Box == null && chunkOffsets64Box2 == null) ? new ChunkOffsetsBox(ArrayUtil.addAll(chunkOffsets, chunkOffsets2)) : new ChunkOffsets64Box(ArrayUtil.addAll(chunkOffsets, chunkOffsets2)));
    }

    private static void appendDrefs(TrakBox trakBox, TrakBox trakBox2) {
        Class<DataRefBox> cls = DataRefBox.class;
        String str = "mdia";
        String str2 = "minf";
        String str3 = "dinf";
        String str4 = "dref";
        ((DataRefBox) Box.findFirst(trakBox, cls, str, str2, str3, str4)).getBoxes().addAll(((DataRefBox) Box.findFirst(trakBox2, cls, str, str2, str3, str4)).getBoxes());
    }

    private static void appendEdits(TrakBox trakBox, TrakBox trakBox2, int i) {
        for (Edit shift : trakBox2.getEdits()) {
            shift.shift(trakBox.getMediaDuration());
        }
        trakBox.getEdits().addAll(i, trakBox2.getEdits());
        trakBox.setEdits(trakBox.getEdits());
    }

    private static int appendEntries(TrakBox trakBox, TrakBox trakBox2) {
        TrakBox trakBox3 = trakBox;
        Class<SampleEntry> cls = SampleEntry.class;
        appendDrefs(trakBox, trakBox2);
        String str = "mdia";
        String str2 = "minf";
        String str3 = "stbl";
        String str4 = "stsd";
        SampleEntry[] sampleEntryArr = (SampleEntry[]) Box.findAll(trakBox3, cls, str, str2, str3, str4, null);
        SampleEntry[] sampleEntryArr2 = (SampleEntry[]) Box.findAll(trakBox2, cls, str, str2, str3, str4, null);
        SampleDescriptionBox sampleDescriptionBox = new SampleDescriptionBox(sampleEntryArr);
        for (SampleEntry sampleEntry : sampleEntryArr2) {
            sampleEntry.setDrefInd((short) (sampleEntry.getDrefInd() + sampleEntryArr.length));
            sampleDescriptionBox.add(sampleEntry);
        }
        ((NodeBox) Box.findFirst(trakBox3, NodeBox.class, str, str2, str3)).replace(str4, sampleDescriptionBox);
        return sampleEntryArr.length;
    }

    private static void appendSampleSizes(TrakBox trakBox, TrakBox trakBox2) {
        SampleSizesBox sampleSizesBox;
        Class<SampleSizesBox> cls = SampleSizesBox.class;
        String str = "mdia";
        String str2 = "minf";
        String str3 = "stbl";
        String str4 = "stsz";
        SampleSizesBox sampleSizesBox2 = (SampleSizesBox) Box.findFirst(trakBox, cls, str, str2, str3, str4);
        SampleSizesBox sampleSizesBox3 = (SampleSizesBox) Box.findFirst(trakBox2, cls, str, str2, str3, str4);
        if (sampleSizesBox2.getDefaultSize() == sampleSizesBox3.getDefaultSize()) {
            if (sampleSizesBox2.getDefaultSize() > 0) {
                sampleSizesBox = new SampleSizesBox(sampleSizesBox2.getDefaultSize(), sampleSizesBox2.getCount() + sampleSizesBox3.getCount());
            } else {
                sampleSizesBox = new SampleSizesBox(ArrayUtil.addAll(sampleSizesBox2.getSizes(), sampleSizesBox3.getSizes()));
            }
            ((NodeBox) Box.findFirst(trakBox, NodeBox.class, str, str2, str3)).replace(str4, sampleSizesBox);
            return;
        }
        throw new IllegalArgumentException("Can't append to track that has different default sample size");
    }

    private static void appendSampleToChunk(TrakBox trakBox, TrakBox trakBox2, int i) {
        TrakBox trakBox3 = trakBox;
        Class<SampleToChunkBox> cls = SampleToChunkBox.class;
        String str = "mdia";
        String str2 = "minf";
        String str3 = "stbl";
        String str4 = "stsc";
        SampleToChunkBox sampleToChunkBox = (SampleToChunkBox) Box.findFirst(trakBox3, cls, str, str2, str3, str4);
        SampleToChunkEntry[] sampleToChunk = ((SampleToChunkBox) Box.findFirst(trakBox2, cls, str, str2, str3, str4)).getSampleToChunk();
        SampleToChunkEntry[] sampleToChunkEntryArr = new SampleToChunkEntry[sampleToChunk.length];
        int i2 = 0;
        while (i2 < sampleToChunk.length) {
            String str5 = str3;
            sampleToChunkEntryArr[i2] = new SampleToChunkEntry(sampleToChunk[i2].getFirst() + ((long) sampleToChunkBox.getSampleToChunk().length), sampleToChunk[i2].getCount(), sampleToChunk[i2].getEntry() + i);
            i2++;
            str3 = str5;
        }
        ((NodeBox) Box.findFirst(trakBox3, NodeBox.class, str, str2, str3)).replace(str4, new SampleToChunkBox((SampleToChunkEntry[]) ArrayUtil.addAll((Object[]) sampleToChunkBox.getSampleToChunk(), (Object[]) sampleToChunkEntryArr)));
    }

    private static void appendTimeToSamples(TrakBox trakBox, TrakBox trakBox2) {
        Class<TimeToSampleBox> cls = TimeToSampleBox.class;
        String str = "mdia";
        String str2 = "minf";
        String str3 = "stbl";
        String str4 = "stts";
        ((NodeBox) Box.findFirst(trakBox, NodeBox.class, str, str2, str3)).replace(str4, new TimeToSampleBox((TimeToSampleEntry[]) ArrayUtil.addAll((Object[]) ((TimeToSampleBox) Box.findFirst(trakBox, cls, str, str2, str3, str4)).getEntries(), (Object[]) ((TimeToSampleBox) Box.findFirst(trakBox2, cls, str, str2, str3, str4)).getEntries())));
    }

    public static void appendTo(MovieBox movieBox, TrakBox trakBox, TrakBox trakBox2) {
        appendToInternal(movieBox, trakBox, trakBox2);
        appendEdits(trakBox, trakBox2, trakBox.getEdits().size());
        updateDuration(trakBox, trakBox2);
    }

    private static void appendToInternal(MovieBox movieBox, TrakBox trakBox, TrakBox trakBox2) {
        int appendEntries = appendEntries(trakBox, trakBox2);
        appendChunkOffsets(trakBox, trakBox2);
        appendTimeToSamples(trakBox, trakBox2);
        appendSampleToChunk(trakBox, trakBox2, appendEntries);
        appendSampleSizes(trakBox, trakBox2);
    }

    public static List<Edit> editsOnEdits(Rational rational, List<Edit> list, List<Edit> list2) {
        ArrayList arrayList = new ArrayList();
        List arrayList2 = new ArrayList(list);
        for (Edit edit : list2) {
            long multiply = rational.multiply(edit.getMediaTime());
            Pair split = split((List) split(arrayList2, rational.flip(), multiply).getB(), rational.flip(), multiply + edit.getDuration());
            arrayList.addAll((Collection) split.getA());
            arrayList2 = (List) split.getB();
        }
        return arrayList;
    }

    public static void forceEditList(MovieBox movieBox, TrakBox trakBox) {
        List edits = trakBox.getEdits();
        if (edits == null || edits.size() == 0) {
            MovieHeaderBox movieHeaderBox = (MovieHeaderBox) Box.findFirst(movieBox, MovieHeaderBox.class, "mvhd");
            ArrayList arrayList = new ArrayList();
            trakBox.setEdits(arrayList);
            Edit edit = new Edit((long) ((int) movieHeaderBox.getDuration()), 0, 1.0f);
            arrayList.add(edit);
            trakBox.setEdits(arrayList);
        }
    }

    public static long[] getTimevalues(TrakBox trakBox) {
        TimeToSampleEntry[] entries = ((TimeToSampleBox) Box.findFirst(trakBox, TimeToSampleBox.class, "mdia", "minf", "stbl", "stts")).getEntries();
        int i = 0;
        for (TimeToSampleEntry sampleCount : entries) {
            i += sampleCount.getSampleCount();
        }
        long[] jArr = new long[(i + 1)];
        int i2 = 0;
        int i3 = 0;
        while (i2 < entries.length) {
            int i4 = i3;
            int i5 = 0;
            while (i5 < entries[i2].getSampleCount()) {
                int i6 = i4 + 1;
                jArr[i6] = jArr[i4] + ((long) entries[i2].getSampleDuration());
                i5++;
                i4 = i6;
            }
            i2++;
            i3 = i4;
        }
        return jArr;
    }

    private static void insertEdits(MovieBox movieBox, TrakBox trakBox, TrakBox trakBox2, long j) {
        appendEdits(trakBox, trakBox2, ((List) split(movieBox, trakBox, j).getA()).size());
    }

    public static void insertTo(MovieBox movieBox, TrakBox trakBox, TrakBox trakBox2, long j) {
        appendToInternal(movieBox, trakBox, trakBox2);
        insertEdits(movieBox, trakBox, trakBox2, j);
        updateDuration(trakBox, trakBox2);
    }

    public static void shift(MovieBox movieBox, TrakBox trakBox, long j) {
        List edits = trakBox.getEdits();
        Edit edit = new Edit(j, -1, 1.0f);
        edits.add(0, edit);
    }

    public static Pair<List<Edit>> split(List<Edit> list, Rational rational, long j) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ListIterator listIterator = list.listIterator();
        long j2 = 0;
        while (true) {
            if (!listIterator.hasNext()) {
                break;
            }
            Edit edit = (Edit) listIterator.next();
            if (edit.getDuration() + j2 > j) {
                int i = (int) (j - j2);
                int multiplyS = rational.multiplyS(i);
                long j3 = (long) i;
                long j4 = j3;
                Edit edit2 = new Edit(j3, edit.getMediaTime(), 1.0f);
                Edit edit3 = new Edit(edit.getDuration() - j4, ((long) multiplyS) + edit.getMediaTime(), 1.0f);
                listIterator.remove();
                if (edit2.getDuration() > 0) {
                    listIterator.add(edit2);
                    arrayList.add(edit2);
                }
                if (edit3.getDuration() > 0) {
                    listIterator.add(edit3);
                    arrayList2.add(edit3);
                }
            } else {
                Rational rational2 = rational;
                arrayList.add(edit);
                j2 += edit.getDuration();
            }
        }
        while (listIterator.hasNext()) {
            arrayList2.add(listIterator.next());
        }
        return new Pair<>(arrayList, arrayList2);
    }

    public static void spread(MovieBox movieBox, TrakBox trakBox, long j, long j2) {
        Pair split = split(movieBox, trakBox, j);
        List edits = trakBox.getEdits();
        int size = ((List) split.getA()).size();
        Edit edit = new Edit(j2, -1, 1.0f);
        edits.add(size, edit);
    }

    private static void updateDuration(TrakBox trakBox, TrakBox trakBox2) {
        Class<MediaHeaderBox> cls = MediaHeaderBox.class;
        String str = "mdia";
        String str2 = "mdhd";
        MediaHeaderBox mediaHeaderBox = (MediaHeaderBox) Box.findFirst(trakBox, cls, str, str2);
        mediaHeaderBox.setDuration(mediaHeaderBox.getDuration() + ((MediaHeaderBox) Box.findFirst(trakBox2, cls, str, str2)).getDuration());
    }

    public static void forceEditList(MovieBox movieBox) {
        for (TrakBox forceEditList : movieBox.getTracks()) {
            forceEditList(movieBox, forceEditList);
        }
    }

    public static Pair<List<Edit>> split(MovieBox movieBox, TrakBox trakBox, long j) {
        return split(trakBox.getEdits(), new Rational(trakBox.getTimescale(), movieBox.getTimescale()), j);
    }
}
