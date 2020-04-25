package org.jcodec.containers.mps.index;

import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import org.jcodec.common.Assert;
import org.jcodec.common.NIOUtils;
import org.jcodec.common.NIOUtils.FileReader;
import org.jcodec.common.NIOUtils.FileReaderListener;
import org.jcodec.common.SeekableByteChannel;
import org.jcodec.common.logging.Logger;
import org.jcodec.containers.mps.MPSDemuxer.PESPacket;
import org.jcodec.containers.mps.MPSUtils;
import org.jcodec.containers.mps.MTSUtils;
import org.jcodec.containers.mps.index.MTSIndex.MTSProgram;
import p205i.p471b.p472a.p473a.p474c.p475i.C13959t;

public class MTSIndexer {
    public static final int BUFFER_SIZE = 96256;
    /* access modifiers changed from: private */
    public C15564c[] indexers;

    /* renamed from: org.jcodec.containers.mps.index.MTSIndexer$a */
    class C15562a extends FileReader {
        C15562a() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo49158a(ByteBuffer byteBuffer, long j) {
            while (byteBuffer.hasRemaining()) {
                ByteBuffer read = NIOUtils.read(byteBuffer, (int) C13959t.f40864Y2);
                j += 188;
                Assert.assertEquals(71, (int) read.get() & 255);
                byte b = (((read.get() & 255) << 8) | (read.get() & 255)) & 8191;
                for (int i = 0; i < MTSIndexer.this.indexers.length; i++) {
                    if (b == MTSIndexer.this.indexers[i].f44888a) {
                        if ((read.get() & 255 & 32) != 0) {
                            NIOUtils.skip(read, read.get() & 255);
                        }
                        MTSIndexer.this.indexers[i].analyseBuffer(read, j - ((long) read.remaining()));
                    }
                }
            }
        }

        /* access modifiers changed from: protected */
        public void data(ByteBuffer byteBuffer, long j) {
            mo49158a(byteBuffer, j);
        }

        /* access modifiers changed from: protected */
        public void done() {
            for (C15564c finishAnalyse : MTSIndexer.this.indexers) {
                finishAnalyse.finishAnalyse();
            }
        }
    }

    /* renamed from: org.jcodec.containers.mps.index.MTSIndexer$b */
    static class C15563b implements FileReaderListener {
        C15563b() {
        }

        public void progress(int i) {
            System.out.println(i);
        }
    }

    /* renamed from: org.jcodec.containers.mps.index.MTSIndexer$c */
    private class C15564c extends BaseIndexer {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public int f44888a;

        /* renamed from: b */
        private long f44889b;

        public C15564c(int i) {
            this.f44888a = i;
        }

        /* access modifiers changed from: protected */
        public void pes(ByteBuffer byteBuffer, long j, int i, int i2) {
            if (MPSUtils.mediaStream(i2)) {
                int i3 = 0;
                Logger.debug(String.format("PES: %08x, %d", new Object[]{Long.valueOf(j), Integer.valueOf(i)}));
                PESPacket readPESHeader = MPSUtils.readPESHeader(byteBuffer, j);
                long j2 = this.f44889b;
                if (j2 != j) {
                    i3 = (int) ((j / 188) - j2);
                }
                this.f44889b = (((long) i) + j) / 188;
                savePESMeta(i2, MPSIndex.makePESToken((long) i3, (long) ((int) (this.f44889b - (j / 188))), (long) byteBuffer.remaining()));
                getAnalyser(i2).pkt(byteBuffer, readPESHeader);
            }
        }

        /* renamed from: a */
        public MTSProgram mo49159a() {
            return new MTSProgram(super.serialize(), this.f44888a);
        }
    }

    public static void main(String[] strArr) throws IOException {
        File file = new File(strArr[0]);
        MTSIndexer mTSIndexer = new MTSIndexer();
        mTSIndexer.index(file, (FileReaderListener) new C15563b());
        NIOUtils.writeTo(mTSIndexer.serialize().serialize(), new File(strArr[1]));
    }

    public void index(File file, FileReaderListener fileReaderListener) throws IOException {
        index(fileReaderListener, MTSUtils.getMediaPids(file)).readFile(file, 96256, fileReaderListener);
    }

    public MTSIndex serialize() {
        MTSProgram[] mTSProgramArr = new MTSProgram[this.indexers.length];
        int i = 0;
        while (true) {
            C15564c[] cVarArr = this.indexers;
            if (i >= cVarArr.length) {
                return new MTSIndex(mTSProgramArr);
            }
            mTSProgramArr[i] = cVarArr[i].mo49159a();
            i++;
        }
    }

    public void index(SeekableByteChannel seekableByteChannel, FileReaderListener fileReaderListener) throws IOException {
        index(fileReaderListener, MTSUtils.getMediaPids(seekableByteChannel)).readFile(seekableByteChannel, 96256, fileReaderListener);
    }

    public FileReader index(FileReaderListener fileReaderListener, int[] iArr) throws IOException {
        this.indexers = new C15564c[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            this.indexers[i] = new C15564c(iArr[i]);
        }
        return new C15562a();
    }
}
