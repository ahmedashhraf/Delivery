package p205i.p471b.p472a.p473a.p474c.p478j.p480c.p481d;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: i.b.a.a.c.j.c.d.b */
/* compiled from: CompactDataInput */
public class C14000b extends DataInputStream {
    public C14000b(InputStream inputStream) {
        super(inputStream);
    }

    /* renamed from: a */
    public boolean[] mo44292a() throws IOException {
        boolean[] zArr = new boolean[mo44293d()];
        int i = 0;
        for (int i2 = 0; i2 < zArr.length; i2++) {
            if (i2 % 8 == 0) {
                i = readByte();
            }
            zArr[i2] = (i & 1) != 0;
            i >>>= 1;
        }
        return zArr;
    }

    /* renamed from: d */
    public int mo44293d() throws IOException {
        byte readByte = readByte() & 255;
        if ((readByte & 128) == 0) {
            return readByte;
        }
        return (readByte & Byte.MAX_VALUE) | (mo44293d() << 7);
    }
}
