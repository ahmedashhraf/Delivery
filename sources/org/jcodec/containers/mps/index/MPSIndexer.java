package org.jcodec.containers.mps.index;

import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import org.jcodec.common.NIOUtils;
import org.jcodec.common.NIOUtils.FileReader;
import org.jcodec.common.NIOUtils.FileReaderListener;
import org.jcodec.common.SeekableByteChannel;
import org.jcodec.containers.mps.MPSDemuxer.PESPacket;
import org.jcodec.containers.mps.MPSUtils;

public class MPSIndexer extends BaseIndexer {
    private long predFileStart;

    /* renamed from: org.jcodec.containers.mps.index.MPSIndexer$a */
    class C15560a extends FileReader {
        C15560a() {
        }

        /* access modifiers changed from: protected */
        public void data(ByteBuffer byteBuffer, long j) {
            MPSIndexer.this.analyseBuffer(byteBuffer, j);
        }

        /* access modifiers changed from: protected */
        public void done() {
            MPSIndexer.this.finishAnalyse();
        }
    }

    /* renamed from: org.jcodec.containers.mps.index.MPSIndexer$b */
    static class C15561b implements FileReaderListener {
        C15561b() {
        }

        public void progress(int i) {
            System.out.println(i);
        }
    }

    public static void main(String[] strArr) throws IOException {
        MPSIndexer mPSIndexer = new MPSIndexer();
        mPSIndexer.index(new File(strArr[0]), (FileReaderListener) new C15561b());
        ByteBuffer allocate = ByteBuffer.allocate(65536);
        mPSIndexer.serialize().serializeTo(allocate);
        NIOUtils.writeTo(allocate, new File(strArr[1]));
    }

    private FileReader newReader() {
        return new C15560a();
    }

    public void index(File file, FileReaderListener fileReaderListener) throws IOException {
        newReader().readFile(file, 65536, fileReaderListener);
    }

    /* access modifiers changed from: protected */
    public void pes(ByteBuffer byteBuffer, long j, int i, int i2) {
        if (MPSUtils.mediaStream(i2)) {
            PESPacket readPESHeader = MPSUtils.readPESHeader(byteBuffer, j);
            int i3 = 0;
            long j2 = this.predFileStart;
            if (j2 != j) {
                i3 = 0 + ((int) (j - j2));
            }
            long j3 = (long) i;
            this.predFileStart = j + j3;
            savePESMeta(i2, MPSIndex.makePESToken((long) i3, j3, (long) byteBuffer.remaining()));
            getAnalyser(i2).pkt(byteBuffer, readPESHeader);
        }
    }

    public void index(SeekableByteChannel seekableByteChannel, FileReaderListener fileReaderListener) throws IOException {
        newReader().readFile(seekableByteChannel, 65536, fileReaderListener);
    }
}
