package okhttp3.internal.p515f;

import java.io.IOException;
import java.nio.channels.FileChannel;
import p470h.C13887c;

/* renamed from: okhttp3.internal.f.a */
/* compiled from: FileOperator */
final class C14938a {

    /* renamed from: a */
    private final FileChannel f43309a;

    C14938a(FileChannel fileChannel) {
        this.f43309a = fileChannel;
    }

    /* renamed from: a */
    public void mo46449a(long j, C13887c cVar, long j2) throws IOException {
        if (j2 >= 0) {
            while (j2 > 0) {
                long transferTo = this.f43309a.transferTo(j, j2, cVar);
                j += transferTo;
                j2 -= transferTo;
            }
            return;
        }
        throw new IndexOutOfBoundsException();
    }

    /* renamed from: b */
    public void mo46450b(long j, C13887c cVar, long j2) throws IOException {
        if (j2 < 0 || j2 > cVar.size()) {
            throw new IndexOutOfBoundsException();
        }
        long j3 = j;
        long j4 = j2;
        while (j4 > 0) {
            long transferFrom = this.f43309a.transferFrom(cVar, j3, j4);
            j3 += transferFrom;
            j4 -= transferFrom;
        }
    }
}
