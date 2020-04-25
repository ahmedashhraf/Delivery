package androidx.core.p033k;

import androidx.annotation.C0207n0;
import androidx.annotation.C0207n0.C0208a;
import java.io.Writer;

@C0207n0({C0208a.LIBRARY_GROUP_PREFIX})
/* renamed from: androidx.core.k.d */
/* compiled from: LogWriter */
public class C0936d extends Writer {

    /* renamed from: a */
    private final String f4241a;

    /* renamed from: b */
    private StringBuilder f4242b = new StringBuilder(128);

    public C0936d(String str) {
        this.f4241a = str;
    }

    /* renamed from: a */
    private void m5325a() {
        if (this.f4242b.length() > 0) {
            this.f4242b.toString();
            StringBuilder sb = this.f4242b;
            sb.delete(0, sb.length());
        }
    }

    public void close() {
        m5325a();
    }

    public void flush() {
        m5325a();
    }

    public void write(char[] cArr, int i, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            char c = cArr[i + i3];
            if (c == 10) {
                m5325a();
            } else {
                this.f4242b.append(c);
            }
        }
    }
}
