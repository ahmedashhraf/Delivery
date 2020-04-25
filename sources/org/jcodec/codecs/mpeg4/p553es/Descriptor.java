package org.jcodec.codecs.mpeg4.p553es;

import java.nio.ByteBuffer;
import org.jcodec.common.JCodecUtil;
import org.jcodec.common.NIOUtils;

/* renamed from: org.jcodec.codecs.mpeg4.es.Descriptor */
public abstract class Descriptor {
    private static DescriptorFactory factory = new DescriptorFactory();
    private int size;
    private int tag;

    public Descriptor(int i) {
        this(i, 0);
    }

    public static <T> T find(Descriptor descriptor, Class<T> cls, int i) {
        if (descriptor.getTag() == i) {
            return descriptor;
        }
        if (descriptor instanceof NodeDescriptor) {
            for (Descriptor find : ((NodeDescriptor) descriptor).getChildren()) {
                T find2 = find(find, cls, i);
                if (find2 != null) {
                    return find2;
                }
            }
        }
        return null;
    }

    private int getTag() {
        return this.tag;
    }

    public static Descriptor read(ByteBuffer byteBuffer) {
        if (byteBuffer.remaining() < 2) {
            return null;
        }
        byte b = byteBuffer.get() & 255;
        int readBER32 = JCodecUtil.readBER32(byteBuffer);
        try {
            Descriptor descriptor = (Descriptor) factory.byTag(b).getConstructor(new Class[]{Integer.TYPE, Integer.TYPE}).newInstance(new Object[]{Integer.valueOf(b), Integer.valueOf(readBER32)});
            descriptor.parse(NIOUtils.read(byteBuffer, readBER32));
            return descriptor;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    /* access modifiers changed from: protected */
    public abstract void doWrite(ByteBuffer byteBuffer);

    /* access modifiers changed from: protected */
    public abstract void parse(ByteBuffer byteBuffer);

    public void write(ByteBuffer byteBuffer) {
        ByteBuffer duplicate = byteBuffer.duplicate();
        NIOUtils.skip(byteBuffer, 5);
        doWrite(byteBuffer);
        int position = (byteBuffer.position() - duplicate.position()) - 5;
        duplicate.put((byte) this.tag);
        JCodecUtil.writeBER32(duplicate, position);
    }

    public Descriptor(int i, int i2) {
        this.tag = i;
        this.size = i2;
    }
}
