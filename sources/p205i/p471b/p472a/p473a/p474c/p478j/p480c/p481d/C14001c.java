package p205i.p471b.p472a.p473a.p474c.p478j.p480c.p481d;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import p205i.p471b.p472a.p473a.p474c.p475i.C13959t;

/* renamed from: i.b.a.a.c.j.c.d.c */
/* compiled from: CompactDataOutput */
public class C14001c extends DataOutputStream {
    public C14001c(OutputStream outputStream) {
        super(outputStream);
    }

    /* renamed from: a */
    public void mo44294a(int i) throws IOException {
        if ((i & -128) == 0) {
            writeByte(i);
            return;
        }
        writeByte((i & C13959t.f40827P1) | 128);
        mo44294a(i >>> 7);
    }

    /* renamed from: a */
    public void mo44295a(boolean[] zArr) throws IOException {
        mo44294a(zArr.length);
        int i = 0;
        int i2 = 0;
        for (boolean z : zArr) {
            if (z) {
                i2 |= 1 << i;
            }
            i++;
            if (i == 8) {
                writeByte(i2);
                i = 0;
                i2 = 0;
            }
        }
        if (i > 0) {
            writeByte(i2);
        }
    }
}
