package kotlin.p508io;

import java.io.File;
import java.util.List;
import kotlin.p214b1.p216u.C14445h0;
import p205i.p209c.p210a.C6003d;

/* renamed from: kotlin.io.f */
/* compiled from: FilePathComponents.kt */
public final class C14698f {
    @C6003d

    /* renamed from: a */
    private final File f42936a;
    @C6003d

    /* renamed from: b */
    private final List<File> f42937b;

    public C14698f(@C6003d File file, @C6003d List<? extends File> list) {
        C14445h0.m62478f(file, "root");
        C14445h0.m62478f(list, "segments");
        this.f42936a = file;
        this.f42937b = list;
    }

    /* JADX WARNING: Incorrect type for immutable var: ssa=java.util.List, code=java.util.List<java.io.File>, for r2v0, types: [java.util.List] */
    @p205i.p209c.p210a.C6003d
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ kotlin.p508io.C14698f m63732a(kotlin.p508io.C14698f r0, java.io.File r1, java.util.List<java.io.File> r2, int r3, java.lang.Object r4) {
        /*
            r4 = r3 & 1
            if (r4 == 0) goto L_0x0006
            java.io.File r1 = r0.f42936a
        L_0x0006:
            r3 = r3 & 2
            if (r3 == 0) goto L_0x000c
            java.util.List<java.io.File> r2 = r0.f42937b
        L_0x000c:
            kotlin.io.f r0 = r0.mo45951a(r1, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.p508io.C14698f.m63732a(kotlin.io.f, java.io.File, java.util.List, int, java.lang.Object):kotlin.io.f");
    }

    @C6003d
    /* renamed from: a */
    public final File mo45949a() {
        return this.f42936a;
    }

    @C6003d
    /* renamed from: a */
    public final File mo45950a(int i, int i2) {
        if (i < 0 || i > i2 || i2 > mo45957f()) {
            throw new IllegalArgumentException();
        }
        List subList = this.f42937b.subList(i, i2);
        String str = File.separator;
        C14445h0.m62453a((Object) str, "File.separator");
        return new File(C14848z.m65690a(subList, str, null, null, 0, null, null, 62, null));
    }

    @C6003d
    /* renamed from: a */
    public final C14698f mo45951a(@C6003d File file, @C6003d List<? extends File> list) {
        C14445h0.m62478f(file, "root");
        C14445h0.m62478f(list, "segments");
        return new C14698f(file, list);
    }

    @C6003d
    /* renamed from: b */
    public final List<File> mo45952b() {
        return this.f42937b;
    }

    @C6003d
    /* renamed from: c */
    public final File mo45953c() {
        return this.f42936a;
    }

    @C6003d
    /* renamed from: d */
    public final String mo45954d() {
        String path = this.f42936a.getPath();
        C14445h0.m62453a((Object) path, "root.path");
        return path;
    }

    @C6003d
    /* renamed from: e */
    public final List<File> mo45955e() {
        return this.f42937b;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
        if (kotlin.p214b1.p216u.C14445h0.m62463a((java.lang.Object) r2.f42937b, (java.lang.Object) r3.f42937b) != false) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x001f
            boolean r0 = r3 instanceof kotlin.p508io.C14698f
            if (r0 == 0) goto L_0x001d
            kotlin.io.f r3 = (kotlin.p508io.C14698f) r3
            java.io.File r0 = r2.f42936a
            java.io.File r1 = r3.f42936a
            boolean r0 = kotlin.p214b1.p216u.C14445h0.m62463a(r0, r1)
            if (r0 == 0) goto L_0x001d
            java.util.List<java.io.File> r0 = r2.f42937b
            java.util.List<java.io.File> r3 = r3.f42937b
            boolean r3 = kotlin.p214b1.p216u.C14445h0.m62463a(r0, r3)
            if (r3 == 0) goto L_0x001d
            goto L_0x001f
        L_0x001d:
            r3 = 0
            return r3
        L_0x001f:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.p508io.C14698f.equals(java.lang.Object):boolean");
    }

    /* renamed from: f */
    public final int mo45957f() {
        return this.f42937b.size();
    }

    /* renamed from: g */
    public final boolean mo45958g() {
        String path = this.f42936a.getPath();
        C14445h0.m62453a((Object) path, "root.path");
        return path.length() > 0;
    }

    public int hashCode() {
        File file = this.f42936a;
        int i = 0;
        int hashCode = (file != null ? file.hashCode() : 0) * 31;
        List<File> list = this.f42937b;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FilePathComponents(root=");
        sb.append(this.f42936a);
        sb.append(", segments=");
        sb.append(this.f42937b);
        sb.append(")");
        return sb.toString();
    }
}
