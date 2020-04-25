package org.jcodec.movtool;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jcodec.containers.mp4.Chunk;
import org.jcodec.containers.mp4.ChunkReader;
import org.jcodec.containers.mp4.boxes.Box;
import org.jcodec.containers.mp4.boxes.ChunkOffsets64Box;
import org.jcodec.containers.mp4.boxes.ChunkOffsetsBox;
import org.jcodec.containers.mp4.boxes.Edit;
import org.jcodec.containers.mp4.boxes.MediaHeaderBox;
import org.jcodec.containers.mp4.boxes.MovieBox;
import org.jcodec.containers.mp4.boxes.NodeBox;
import org.jcodec.containers.mp4.boxes.SampleSizesBox;
import org.jcodec.containers.mp4.boxes.SampleToChunkBox;
import org.jcodec.containers.mp4.boxes.SampleToChunkBox.SampleToChunkEntry;
import org.jcodec.containers.mp4.boxes.TimeToSampleBox;
import org.jcodec.containers.mp4.boxes.TimeToSampleBox.TimeToSampleEntry;
import org.jcodec.containers.mp4.boxes.TrakBox;

public class Strip {
    private List<Edit> deepCopy(List<Edit> list) {
        ArrayList arrayList = new ArrayList();
        for (Edit edit : list) {
            arrayList.add(new Edit(edit));
        }
        return arrayList;
    }

    private boolean intersects(long j, long j2, long j3, long j4) {
        return (j >= j3 && j < j4) || (j2 >= j3 && j2 < j4) || ((j3 >= j && j3 < j2) || (j4 >= j && j4 < j2));
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x006c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void main(java.lang.String[] r5) throws java.lang.Exception {
        /*
            int r0 = r5.length
            r1 = 2
            if (r0 >= r1) goto L_0x000f
            java.io.PrintStream r0 = java.lang.System.out
            java.lang.String r1 = "Syntax: strip <ref movie> <out movie>"
            r0.println(r1)
            r0 = -1
            java.lang.System.exit(r0)
        L_0x000f:
            r0 = 0
            java.io.File r1 = new java.io.File     // Catch:{ all -> 0x0063 }
            r2 = 0
            r3 = r5[r2]     // Catch:{ all -> 0x0063 }
            r1.<init>(r3)     // Catch:{ all -> 0x0063 }
            org.jcodec.common.FileChannelWrapper r1 = org.jcodec.common.NIOUtils.readableFileChannel(r1)     // Catch:{ all -> 0x0063 }
            java.io.File r3 = new java.io.File     // Catch:{ all -> 0x0061 }
            r4 = 1
            r4 = r5[r4]     // Catch:{ all -> 0x0061 }
            r3.<init>(r4)     // Catch:{ all -> 0x0061 }
            r3.delete()     // Catch:{ all -> 0x0061 }
            org.jcodec.common.FileChannelWrapper r0 = org.jcodec.common.NIOUtils.writableFileChannel(r3)     // Catch:{ all -> 0x0061 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0061 }
            r3.<init>()     // Catch:{ all -> 0x0061 }
            java.lang.String r4 = "file://"
            r3.append(r4)     // Catch:{ all -> 0x0061 }
            java.io.File r4 = new java.io.File     // Catch:{ all -> 0x0061 }
            r5 = r5[r2]     // Catch:{ all -> 0x0061 }
            r4.<init>(r5)     // Catch:{ all -> 0x0061 }
            java.lang.String r5 = r4.getAbsolutePath()     // Catch:{ all -> 0x0061 }
            r3.append(r5)     // Catch:{ all -> 0x0061 }
            java.lang.String r5 = r3.toString()     // Catch:{ all -> 0x0061 }
            org.jcodec.containers.mp4.boxes.MovieBox r5 = org.jcodec.containers.mp4.MP4Util.createRefMovie(r1, r5)     // Catch:{ all -> 0x0061 }
            org.jcodec.movtool.Strip r2 = new org.jcodec.movtool.Strip     // Catch:{ all -> 0x0061 }
            r2.<init>()     // Catch:{ all -> 0x0061 }
            r2.strip(r5)     // Catch:{ all -> 0x0061 }
            org.jcodec.containers.mp4.MP4Util.writeMovie(r0, r5)     // Catch:{ all -> 0x0061 }
            if (r1 == 0) goto L_0x005b
            r1.close()
        L_0x005b:
            if (r0 == 0) goto L_0x0060
            r0.close()
        L_0x0060:
            return
        L_0x0061:
            r5 = move-exception
            goto L_0x0065
        L_0x0063:
            r5 = move-exception
            r1 = r0
        L_0x0065:
            if (r1 == 0) goto L_0x006a
            r1.close()
        L_0x006a:
            if (r0 == 0) goto L_0x006f
            r0.close()
        L_0x006f:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: org.jcodec.movtool.Strip.main(java.lang.String[]):void");
    }

    private long totalDuration(List<Chunk> list) {
        long j = 0;
        for (Chunk duration : list) {
            j += (long) duration.getDuration();
        }
        return j;
    }

    public Box getChunkOffsets(List<Chunk> list) {
        long[] jArr = new long[list.size()];
        boolean z = false;
        int i = 0;
        for (Chunk chunk : list) {
            if (chunk.getOffset() >= 4294967296L) {
                z = true;
            }
            int i2 = i + 1;
            jArr[i] = chunk.getOffset();
            i = i2;
        }
        return z ? new ChunkOffsets64Box(jArr) : new ChunkOffsetsBox(jArr);
    }

    public SampleSizesBox getSampleSizes(List<Chunk> list) {
        int sampleSize = ((Chunk) list.get(0)).getSampleSize();
        int i = 0;
        for (Chunk chunk : list) {
            i += chunk.getSampleCount();
            if (sampleSize == 0 && chunk.getSampleSize() != 0) {
                throw new RuntimeException("Mixed sample sizes not supported");
            }
        }
        if (sampleSize > 0) {
            return new SampleSizesBox(sampleSize, i);
        }
        int[] iArr = new int[i];
        int i2 = 0;
        for (Chunk chunk2 : list) {
            System.arraycopy(chunk2.getSampleSizes(), 0, iArr, i2, chunk2.getSampleCount());
            i2 += chunk2.getSampleCount();
        }
        return new SampleSizesBox(iArr);
    }

    public SampleToChunkBox getSamplesToChunk(List<Chunk> list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        Chunk chunk = (Chunk) it.next();
        int sampleCount = chunk.getSampleCount();
        int entry = chunk.getEntry();
        int i = 1;
        int i2 = 1;
        while (it.hasNext()) {
            Chunk chunk2 = (Chunk) it.next();
            int sampleCount2 = chunk2.getSampleCount();
            int entry2 = chunk2.getEntry();
            if (sampleCount != sampleCount2 || entry != entry2) {
                arrayList.add(new SampleToChunkEntry((long) i2, sampleCount, entry));
                i2 += i;
                entry = entry2;
                sampleCount = sampleCount2;
                i = 0;
            }
            i++;
        }
        if (i > 0) {
            arrayList.add(new SampleToChunkEntry((long) i2, sampleCount, entry));
        }
        return new SampleToChunkBox((SampleToChunkEntry[]) arrayList.toArray(new SampleToChunkEntry[0]));
    }

    public TimeToSampleBox getTimeToSamples(List<Chunk> list) {
        int[] sampleDurs;
        ArrayList arrayList = new ArrayList();
        int i = 0;
        int i2 = -1;
        for (Chunk chunk : list) {
            if (chunk.getSampleDur() > 0) {
                if (i2 == -1 || i2 != chunk.getSampleDur()) {
                    if (i2 != -1) {
                        arrayList.add(new TimeToSampleEntry(i, i2));
                    }
                    i2 = chunk.getSampleDur();
                    i = 0;
                }
                i += chunk.getSampleCount();
            } else {
                int i3 = i;
                for (int i4 : chunk.getSampleDurs()) {
                    if (i2 == -1 || i2 != i4) {
                        if (i2 != -1) {
                            arrayList.add(new TimeToSampleEntry(i3, i2));
                        }
                        i2 = i4;
                        i3 = 0;
                    }
                    i3++;
                }
                i = i3;
            }
        }
        if (i > 0) {
            arrayList.add(new TimeToSampleEntry(i, i2));
        }
        return new TimeToSampleBox((TimeToSampleEntry[]) arrayList.toArray(new TimeToSampleEntry[0]));
    }

    public void strip(MovieBox movieBox) throws IOException {
        for (TrakBox stripTrack : movieBox.getTracks()) {
            stripTrack(movieBox, stripTrack);
        }
    }

    public void stripTrack(MovieBox movieBox, TrakBox trakBox) {
        TrakBox trakBox2 = trakBox;
        ChunkReader chunkReader = new ChunkReader(trakBox2);
        List edits = trakBox.getEdits();
        List<Edit> deepCopy = deepCopy(edits);
        ArrayList arrayList = new ArrayList();
        while (true) {
            Chunk next = chunkReader.next();
            if (next != null) {
                boolean z = false;
                for (Edit edit : deepCopy) {
                    if (edit.getMediaTime() != -1) {
                        z = intersects(edit.getMediaTime(), edit.getMediaTime() + trakBox2.rescale(edit.getDuration(), (long) movieBox.getTimescale()), next.getStartTv(), ((long) next.getDuration()) + next.getStartTv());
                        if (z) {
                            break;
                        }
                    }
                }
                if (!z) {
                    for (int i = 0; i < deepCopy.size(); i++) {
                        if (((Edit) deepCopy.get(i)).getMediaTime() >= next.getStartTv() + ((long) next.getDuration())) {
                            ((Edit) edits.get(i)).shift((long) (-next.getDuration()));
                        }
                    }
                } else {
                    arrayList.add(next);
                }
            } else {
                String str = "mdia";
                NodeBox nodeBox = (NodeBox) Box.findFirst(trakBox2, NodeBox.class, str, "minf", "stbl");
                nodeBox.replace("stts", getTimeToSamples(arrayList));
                nodeBox.replace("stsz", getSampleSizes(arrayList));
                nodeBox.replace("stsc", getSamplesToChunk(arrayList));
                nodeBox.removeChildren("stco", "co64");
                nodeBox.add(getChunkOffsets(arrayList));
                ((MediaHeaderBox) Box.findFirst(trakBox2, MediaHeaderBox.class, str, "mdhd")).setDuration(totalDuration(arrayList));
                return;
            }
        }
    }
}
