package p205i.p471b.p472a.p473a.p474c;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import p205i.p471b.p472a.p473a.p474c.p478j.p480c.p481d.C13999a;

/* renamed from: i.b.a.a.c.b */
/* compiled from: ClassFileDumper */
class C13932b {

    /* renamed from: a */
    private final File f40453a;

    C13932b(String str) {
        if (str == null) {
            this.f40453a = null;
        } else {
            this.f40453a = new File(str);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo44046a(String str, byte[] bArr) throws IOException {
        File file;
        if (this.f40453a != null) {
            int lastIndexOf = str.lastIndexOf(47);
            if (lastIndexOf != -1) {
                file = new File(this.f40453a, str.substring(0, lastIndexOf));
                str = str.substring(lastIndexOf + 1);
            } else {
                file = this.f40453a;
            }
            file.mkdirs();
            FileOutputStream fileOutputStream = new FileOutputStream(new File(file, String.format("%s.%016x.class", new Object[]{str, Long.valueOf(C13999a.m60371a(bArr))})));
            fileOutputStream.write(bArr);
            fileOutputStream.close();
        }
    }
}
