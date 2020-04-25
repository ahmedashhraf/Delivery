package org.jcodec.containers.mp4.boxes;

import com.facebook.imagepipeline.producers.DecodeProducer;
import java.nio.ByteBuffer;
import java.util.List;

public class TrunBox extends FullBox {
    private static final int DATA_OFFSET_AVAILABLE = 1;
    private static final int FIRST_SAMPLE_FLAGS_AVAILABLE = 4;
    private static final int SAMPLE_COMPOSITION_OFFSET_AVAILABLE = 2048;
    private static final int SAMPLE_DURATION_AVAILABLE = 256;
    private static final int SAMPLE_FLAGS_AVAILABLE = 1024;
    private static final int SAMPLE_SIZE_AVAILABLE = 512;
    /* access modifiers changed from: private */
    public int dataOffset;
    /* access modifiers changed from: private */
    public int firstSampleFlags;
    /* access modifiers changed from: private */
    public int[] sampleCompositionOffset;
    /* access modifiers changed from: private */
    public int sampleCount;
    /* access modifiers changed from: private */
    public int[] sampleDuration;
    /* access modifiers changed from: private */
    public int[] sampleFlags;
    /* access modifiers changed from: private */
    public int[] sampleSize;

    public static class Factory {
        private TrunBox box;

        protected Factory(int i) {
            this.box = new TrunBox(i);
        }

        public TrunBox create() {
            try {
                return this.box;
            } finally {
                this.box = null;
            }
        }

        public Factory dataOffset(long j) {
            TrunBox trunBox = this.box;
            trunBox.flags |= 1;
            trunBox.dataOffset = (int) j;
            return this;
        }

        public Factory firstSampleFlags(int i) {
            if (!this.box.isSampleFlagsAvailable()) {
                TrunBox trunBox = this.box;
                trunBox.flags |= 4;
                trunBox.firstSampleFlags = i;
                return this;
            }
            throw new IllegalStateException("Sample flags already set on this object");
        }

        public Factory sampleCompositionOffset(int[] iArr) {
            if (iArr.length == this.box.sampleCount) {
                TrunBox trunBox = this.box;
                trunBox.flags |= 2048;
                trunBox.sampleCompositionOffset = iArr;
                return this;
            }
            throw new IllegalArgumentException("Argument array length not equal to sampleCount");
        }

        public Factory sampleDuration(int[] iArr) {
            if (iArr.length == this.box.sampleCount) {
                TrunBox trunBox = this.box;
                trunBox.flags |= 256;
                trunBox.sampleDuration = iArr;
                return this;
            }
            throw new IllegalArgumentException("Argument array length not equal to sampleCount");
        }

        public Factory sampleFlags(int[] iArr) {
            if (iArr.length != this.box.sampleCount) {
                throw new IllegalArgumentException("Argument array length not equal to sampleCount");
            } else if (!this.box.isFirstSampleFlagsAvailable()) {
                TrunBox trunBox = this.box;
                trunBox.flags |= 1024;
                trunBox.sampleFlags = iArr;
                return this;
            } else {
                throw new IllegalStateException("First sample flags already set on this object");
            }
        }

        public Factory sampleSize(int[] iArr) {
            if (iArr.length == this.box.sampleCount) {
                TrunBox trunBox = this.box;
                trunBox.flags |= 512;
                trunBox.sampleSize = iArr;
                return this;
            }
            throw new IllegalArgumentException("Argument array length not equal to sampleCount");
        }

        public Factory(TrunBox trunBox) {
            TrunBox trunBox2 = new TrunBox(trunBox.sampleCount, trunBox.dataOffset, trunBox.firstSampleFlags, trunBox.sampleDuration, trunBox.sampleSize, trunBox.sampleFlags, trunBox.sampleCompositionOffset);
            this.box = trunBox2;
            this.box.setFlags(trunBox.getFlags());
            this.box.setVersion(trunBox.getVersion());
        }
    }

    public TrunBox() {
        super(new Header(fourcc()));
    }

    public static Factory copy(TrunBox trunBox) {
        return new Factory(trunBox);
    }

    public static Factory create(int i) {
        return new Factory(i);
    }

    public static int flagsGetSampleDegradationPriority(int i) {
        return (i >> 16) & 65535;
    }

    public static int flagsGetSampleDependsOn(int i) {
        return (i >> 6) & 3;
    }

    public static int flagsGetSampleHasRedundancy(int i) {
        return (i >> 10) & 3;
    }

    public static int flagsGetSampleIsDependedOn(int i) {
        return (i >> 8) & 3;
    }

    public static int flagsGetSampleIsDifferentSample(int i) {
        return (i >> 15) & 1;
    }

    public static int flagsGetSamplePaddingValue(int i) {
        return (i >> 12) & 7;
    }

    public static String fourcc() {
        return "trun";
    }

    public void doWrite(ByteBuffer byteBuffer) {
        super.doWrite(byteBuffer);
        byteBuffer.putInt(this.sampleCount);
        if (isDataOffsetAvailable()) {
            byteBuffer.putInt(this.dataOffset);
        }
        if (isFirstSampleFlagsAvailable()) {
            byteBuffer.putInt(this.firstSampleFlags);
        }
        for (int i = 0; i < this.sampleCount; i++) {
            if (isSampleDurationAvailable()) {
                byteBuffer.putInt(this.sampleDuration[i]);
            }
            if (isSampleSizeAvailable()) {
                byteBuffer.putInt(this.sampleSize[i]);
            }
            if (isSampleFlagsAvailable()) {
                byteBuffer.putInt(this.sampleFlags[i]);
            }
            if (isSampleCompositionOffsetAvailable()) {
                byteBuffer.putInt(this.sampleCompositionOffset[i]);
            }
        }
    }

    public int getDataOffset() {
        return this.dataOffset;
    }

    public int getFirstSampleFlags() {
        return this.firstSampleFlags;
    }

    /* access modifiers changed from: protected */
    public void getModelFields(List<String> list) {
        list.add("sampleCount");
        if (isDataOffsetAvailable()) {
            list.add("dataOffset");
        }
        if (isFirstSampleFlagsAvailable()) {
            list.add("firstSampleFlags");
        }
        if (isSampleDurationAvailable()) {
            list.add("sampleDuration");
        }
        if (isSampleSizeAvailable()) {
            list.add(DecodeProducer.SAMPLE_SIZE);
        }
        if (isSampleFlagsAvailable()) {
            list.add("sampleFlags");
        }
        if (isSampleCompositionOffsetAvailable()) {
            list.add("sampleCompositionOffset");
        }
    }

    public int[] getSampleCompositionOffset() {
        return this.sampleCompositionOffset;
    }

    public long getSampleCount() {
        return ((long) this.sampleCount) & 4294967295L;
    }

    public int[] getSampleDuration() {
        return this.sampleDuration;
    }

    public int[] getSampleFlags() {
        return this.sampleFlags;
    }

    public int[] getSampleSize() {
        return this.sampleSize;
    }

    public boolean isDataOffsetAvailable() {
        return (this.flags & 1) != 0;
    }

    public boolean isFirstSampleFlagsAvailable() {
        return (this.flags & 4) != 0;
    }

    public boolean isSampleCompositionOffsetAvailable() {
        return (this.flags & 2048) != 0;
    }

    public boolean isSampleDurationAvailable() {
        return (this.flags & 256) != 0;
    }

    public boolean isSampleFlagsAvailable() {
        return (this.flags & 1024) != 0;
    }

    public boolean isSampleSizeAvailable() {
        return (this.flags & 512) != 0;
    }

    public void parse(ByteBuffer byteBuffer) {
        super.parse(byteBuffer);
        if (!isSampleFlagsAvailable() || !isFirstSampleFlagsAvailable()) {
            this.sampleCount = byteBuffer.getInt();
            if (isDataOffsetAvailable()) {
                this.dataOffset = byteBuffer.getInt();
            }
            if (isFirstSampleFlagsAvailable()) {
                this.firstSampleFlags = byteBuffer.getInt();
            }
            if (isSampleDurationAvailable()) {
                this.sampleDuration = new int[this.sampleCount];
            }
            if (isSampleSizeAvailable()) {
                this.sampleSize = new int[this.sampleCount];
            }
            if (isSampleFlagsAvailable()) {
                this.sampleFlags = new int[this.sampleCount];
            }
            if (isSampleCompositionOffsetAvailable()) {
                this.sampleCompositionOffset = new int[this.sampleCount];
            }
            for (int i = 0; i < this.sampleCount; i++) {
                if (isSampleDurationAvailable()) {
                    this.sampleDuration[i] = byteBuffer.getInt();
                }
                if (isSampleSizeAvailable()) {
                    this.sampleSize[i] = byteBuffer.getInt();
                }
                if (isSampleFlagsAvailable()) {
                    this.sampleFlags[i] = byteBuffer.getInt();
                }
                if (isSampleCompositionOffsetAvailable()) {
                    this.sampleCompositionOffset[i] = byteBuffer.getInt();
                }
            }
            return;
        }
        throw new RuntimeException("Broken stream");
    }

    public void setDataOffset(int i) {
        this.dataOffset = i;
    }

    protected TrunBox(int i, int i2, int i3, int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4) {
        this();
        this.sampleCount = i;
        this.dataOffset = i2;
        this.firstSampleFlags = i3;
        this.sampleDuration = iArr;
        this.sampleSize = iArr2;
        this.sampleFlags = iArr3;
        this.sampleCompositionOffset = iArr4;
    }

    public long getSampleCompositionOffset(int i) {
        return ((long) this.sampleCompositionOffset[i]) & 4294967295L;
    }

    public long getSampleDuration(int i) {
        return ((long) this.sampleDuration[i]) & 4294967295L;
    }

    public int getSampleFlags(int i) {
        return this.sampleFlags[i];
    }

    public long getSampleSize(int i) {
        return ((long) this.sampleSize[i]) & 4294967295L;
    }

    protected TrunBox(int i) {
        this();
        this.sampleCount = i;
    }
}
