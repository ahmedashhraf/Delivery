package org.jcodec.containers.mps.index;

import java.nio.ByteBuffer;
import org.jcodec.common.NIOUtils;
import org.jcodec.common.RunLength.Integer;
import org.jcodec.containers.mps.index.MPSIndex.MPSStreamIndex;

public class MTSIndex {
    private MTSProgram[] programs;

    public static class MTSProgram extends MPSIndex {
        private int targetGuid;

        public MTSProgram(long[] jArr, Integer integer, MPSStreamIndex[] mPSStreamIndexArr, int i) {
            super(jArr, integer, mPSStreamIndexArr);
            this.targetGuid = i;
        }

        public static MTSProgram parse(ByteBuffer byteBuffer) {
            return new MTSProgram(MPSIndex.parseIndex(byteBuffer), byteBuffer.getInt());
        }

        public int getTargetGuid() {
            return this.targetGuid;
        }

        public void serializeTo(ByteBuffer byteBuffer) {
            byteBuffer.putInt(this.targetGuid);
            super.serializeTo(byteBuffer);
        }

        public MTSProgram(MPSIndex mPSIndex, int i) {
            super(mPSIndex);
            this.targetGuid = i;
        }
    }

    public MTSIndex(MTSProgram[] mTSProgramArr) {
        this.programs = mTSProgramArr;
    }

    public static MTSIndex parse(ByteBuffer byteBuffer) {
        int i = byteBuffer.getInt();
        MTSProgram[] mTSProgramArr = new MTSProgram[i];
        for (int i2 = 0; i2 < i; i2++) {
            mTSProgramArr[i2] = MTSProgram.parse(NIOUtils.read(byteBuffer, byteBuffer.getInt()));
        }
        return new MTSIndex(mTSProgramArr);
    }

    public int estimateSize() {
        int i = 64;
        for (MTSProgram estimateSize : this.programs) {
            i += estimateSize.estimateSize() + 4;
        }
        return i;
    }

    public MTSProgram[] getPrograms() {
        return this.programs;
    }

    public ByteBuffer serialize() {
        ByteBuffer allocate = ByteBuffer.allocate(estimateSize());
        serializeTo(allocate);
        allocate.flip();
        return allocate;
    }

    public void serializeTo(ByteBuffer byteBuffer) {
        MTSProgram[] mTSProgramArr;
        byteBuffer.putInt(this.programs.length);
        for (MTSProgram mTSProgram : this.programs) {
            ByteBuffer duplicate = byteBuffer.duplicate();
            NIOUtils.skip(byteBuffer, 4);
            mTSProgram.serializeTo(byteBuffer);
            duplicate.putInt((byteBuffer.position() - duplicate.position()) - 4);
        }
    }
}
