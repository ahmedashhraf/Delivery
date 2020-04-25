package org.jcodec.containers.mps.index;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.ReadableByteChannel;
import org.jcodec.common.Assert;
import org.jcodec.common.NIOUtils;
import org.jcodec.common.SeekableByteChannel;
import org.jcodec.containers.mps.index.MPSIndex.MPSStreamIndex;
import org.jcodec.containers.mps.index.MPSRandomAccessDemuxer.Stream;
import org.jcodec.containers.mps.index.MTSIndex.MTSProgram;
import p205i.p471b.p472a.p473a.p474c.p475i.C13959t;

public class MTSRandomAccessDemuxer {

    /* renamed from: ch */
    private SeekableByteChannel f44891ch;
    private MTSProgram[] programs;

    /* renamed from: org.jcodec.containers.mps.index.MTSRandomAccessDemuxer$a */
    class C15565a extends MPSRandomAccessDemuxer {

        /* renamed from: a */
        final /* synthetic */ int f44892a;

        /* renamed from: org.jcodec.containers.mps.index.MTSRandomAccessDemuxer$a$a */
        class C15566a extends Stream {
            C15566a(MPSStreamIndex mPSStreamIndex, SeekableByteChannel seekableByteChannel) {
                super(mPSStreamIndex, seekableByteChannel);
            }

            /* access modifiers changed from: protected */
            public ByteBuffer fetch(int i) throws IOException {
                ByteBuffer allocate = ByteBuffer.allocate(i * C13959t.f40864Y2);
                for (int i2 = 0; i2 < i; i2++) {
                    ByteBuffer fetchFrom = NIOUtils.fetchFrom((ReadableByteChannel) this.source, (int) C13959t.f40864Y2);
                    Assert.assertEquals(71, (int) fetchFrom.get() & 255);
                    if (((((fetchFrom.get() & 255) << 8) | (fetchFrom.get() & 255)) & 8191) == C15565a.this.f44892a) {
                        if ((fetchFrom.get() & 255 & 32) != 0) {
                            NIOUtils.skip(fetchFrom, fetchFrom.get() & 255);
                        }
                        allocate.put(fetchFrom);
                    }
                }
                allocate.flip();
                return allocate;
            }

            /* access modifiers changed from: protected */
            public void reset() throws IOException {
                this.source.position(0);
            }

            /* access modifiers changed from: protected */
            public void skip(long j) throws IOException {
                SeekableByteChannel seekableByteChannel = this.source;
                seekableByteChannel.position(seekableByteChannel.position() + (j * 188));
            }
        }

        C15565a(SeekableByteChannel seekableByteChannel, MPSIndex mPSIndex, int i) {
            this.f44892a = i;
            super(seekableByteChannel, mPSIndex);
        }

        /* access modifiers changed from: protected */
        public Stream newStream(SeekableByteChannel seekableByteChannel, MPSStreamIndex mPSStreamIndex) throws IOException {
            return new C15566a(mPSStreamIndex, seekableByteChannel);
        }
    }

    public MTSRandomAccessDemuxer(SeekableByteChannel seekableByteChannel, MTSIndex mTSIndex) {
        this.programs = mTSIndex.getPrograms();
        this.f44891ch = seekableByteChannel;
    }

    private MPSIndex getProgram(int i) {
        MTSProgram[] mTSProgramArr;
        for (MTSProgram mTSProgram : this.programs) {
            if (mTSProgram.getTargetGuid() == i) {
                return mTSProgram;
            }
        }
        return null;
    }

    public int[] getGuids() {
        int[] iArr = new int[this.programs.length];
        int i = 0;
        while (true) {
            MTSProgram[] mTSProgramArr = this.programs;
            if (i >= mTSProgramArr.length) {
                return iArr;
            }
            iArr[i] = mTSProgramArr[i].getTargetGuid();
            i++;
        }
    }

    public MPSRandomAccessDemuxer getProgramDemuxer(int i) throws IOException {
        return new C15565a(this.f44891ch, getProgram(i), i);
    }
}
