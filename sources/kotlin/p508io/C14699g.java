package kotlin.p508io;

import com.mrsool.utils.C11644i;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Stack;
import kotlin.C14737p0;
import kotlin.C14742t0;
import kotlin.C6121u;
import kotlin.NoWhenBranchMatchedException;
import kotlin.p214b1.p215t.C6080l;
import kotlin.p214b1.p215t.C6084p;
import kotlin.p214b1.p216u.C14445h0;
import kotlin.p219v0.C14752c;
import kotlin.p506g1.C14594m;
import p205i.p209c.p210a.C6003d;
import p205i.p209c.p210a.C6004e;

@C6121u(mo24988bv = {1, 0, 2}, mo24989d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010(\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u001a\u001b\u001cB\u0019\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006B\u0001\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000b\u0018\u00010\b\u00128\u0010\f\u001a4\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0010\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00020\u000b\u0018\u00010\r\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0014¢\u0006\u0002\u0010\u0015J\u000f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u0017H\u0002J\u000e\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u0014J\u001a\u0010\u0007\u001a\u00020\u00002\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t0\bJ \u0010\f\u001a\u00020\u00002\u0018\u0010\u0019\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u000b0\rJ\u001a\u0010\n\u001a\u00020\u00002\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000b0\bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t\u0018\u00010\bX\u0004¢\u0006\u0002\n\u0000R@\u0010\f\u001a4\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0010\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00020\u000b\u0018\u00010\rX\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000b\u0018\u00010\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0002X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, mo24990d2 = {"Lkotlin/io/FileTreeWalk;", "Lkotlin/sequences/Sequence;", "Ljava/io/File;", "start", "direction", "Lkotlin/io/FileWalkDirection;", "(Ljava/io/File;Lkotlin/io/FileWalkDirection;)V", "onEnter", "Lkotlin/Function1;", "", "onLeave", "", "onFail", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "f", "Ljava/io/IOException;", "e", "maxDepth", "", "(Ljava/io/File;Lkotlin/io/FileWalkDirection;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;I)V", "iterator", "", "depth", "function", "DirectoryState", "FileTreeWalkIterator", "WalkState", "kotlin-stdlib"}, mo24991k = 1, mo24992mv = {1, 1, 10})
/* renamed from: kotlin.io.g */
/* compiled from: FileTreeWalk.kt */
public final class C14699g implements C14594m<File> {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final File f42938a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C14707i f42939b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C6080l<File, Boolean> f42940c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C6080l<File, C14737p0> f42941d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C6084p<File, IOException, C14737p0> f42942e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final int f42943f;

    /* renamed from: kotlin.io.g$a */
    /* compiled from: FileTreeWalk.kt */
    private static abstract class C14700a extends C14705c {
        public C14700a(@C6003d File file) {
            C14445h0.m62478f(file, "rootDir");
            super(file);
            if (C14742t0.f42986a) {
                boolean isDirectory = file.isDirectory();
                if (C14742t0.f42986a && !isDirectory) {
                    throw new AssertionError("rootDir must be verified to be directory beforehand.");
                }
            }
        }
    }

    @C6121u(mo24988bv = {1, 0, 2}, mo24989d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\r\u000e\u000fB\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u0007\u001a\u00020\bH\u0014J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0002H\u0002J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0002H\u0010R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, mo24990d2 = {"Lkotlin/io/FileTreeWalk$FileTreeWalkIterator;", "Lkotlin/collections/AbstractIterator;", "Ljava/io/File;", "(Lkotlin/io/FileTreeWalk;)V", "state", "Ljava/util/Stack;", "Lkotlin/io/FileTreeWalk$WalkState;", "computeNext", "", "directoryState", "Lkotlin/io/FileTreeWalk$DirectoryState;", "root", "gotoNext", "BottomUpDirectoryState", "SingleFileState", "TopDownDirectoryState", "kotlin-stdlib"}, mo24991k = 1, mo24992mv = {1, 1, 10})
    /* renamed from: kotlin.io.g$b */
    /* compiled from: FileTreeWalk.kt */
    private final class C14701b extends C14752c<File> {

        /* renamed from: N */
        private final Stack<C14705c> f42944N = new Stack<>();

        /* renamed from: kotlin.io.g$b$a */
        /* compiled from: FileTreeWalk.kt */
        private final class C14702a extends C14700a {

            /* renamed from: b */
            private boolean f42946b;

            /* renamed from: c */
            private File[] f42947c;

            /* renamed from: d */
            private int f42948d;

            /* renamed from: e */
            private boolean f42949e;

            /* renamed from: f */
            final /* synthetic */ C14701b f42950f;

            public C14702a(@C6003d C14701b bVar, File file) {
                C14445h0.m62478f(file, "rootDir");
                this.f42950f = bVar;
                super(file);
            }

            @C6004e
            /* renamed from: b */
            public File mo45965b() {
                if (!this.f42949e && this.f42947c == null) {
                    C6080l c = C14699g.this.f42940c;
                    if (c != null && !((Boolean) c.invoke(mo45966a())).booleanValue()) {
                        return null;
                    }
                    this.f42947c = mo45966a().listFiles();
                    if (this.f42947c == null) {
                        C6084p d = C14699g.this.f42942e;
                        if (d != null) {
                            File a = mo45966a();
                            AccessDeniedException accessDeniedException = new AccessDeniedException(mo45966a(), null, "Cannot list files in a directory", 2, null);
                            C14737p0 p0Var = (C14737p0) d.mo24962d(a, accessDeniedException);
                        }
                        this.f42949e = true;
                    }
                }
                File[] fileArr = this.f42947c;
                if (fileArr != null) {
                    int i = this.f42948d;
                    if (fileArr == null) {
                        C14445h0.m62474e();
                    }
                    if (i < fileArr.length) {
                        File[] fileArr2 = this.f42947c;
                        if (fileArr2 == null) {
                            C14445h0.m62474e();
                        }
                        int i2 = this.f42948d;
                        this.f42948d = i2 + 1;
                        return fileArr2[i2];
                    }
                }
                if (!this.f42946b) {
                    this.f42946b = true;
                    return mo45966a();
                }
                C6080l e = C14699g.this.f42941d;
                if (e != null) {
                    C14737p0 p0Var2 = (C14737p0) e.invoke(mo45966a());
                }
                return null;
            }
        }

        /* renamed from: kotlin.io.g$b$b */
        /* compiled from: FileTreeWalk.kt */
        private final class C14703b extends C14705c {

            /* renamed from: b */
            private boolean f42951b;

            /* renamed from: c */
            final /* synthetic */ C14701b f42952c;

            public C14703b(@C6003d C14701b bVar, File file) {
                C14445h0.m62478f(file, "rootFile");
                this.f42952c = bVar;
                super(file);
                if (C14742t0.f42986a) {
                    boolean isFile = file.isFile();
                    if (C14742t0.f42986a && !isFile) {
                        throw new AssertionError("rootFile must be verified to be file beforehand.");
                    }
                }
            }

            @C6004e
            /* renamed from: b */
            public File mo45965b() {
                if (this.f42951b) {
                    return null;
                }
                this.f42951b = true;
                return mo45966a();
            }
        }

        /* renamed from: kotlin.io.g$b$c */
        /* compiled from: FileTreeWalk.kt */
        private final class C14704c extends C14700a {

            /* renamed from: b */
            private boolean f42953b;

            /* renamed from: c */
            private File[] f42954c;

            /* renamed from: d */
            private int f42955d;

            /* renamed from: e */
            final /* synthetic */ C14701b f42956e;

            public C14704c(@C6003d C14701b bVar, File file) {
                C14445h0.m62478f(file, "rootDir");
                this.f42956e = bVar;
                super(file);
            }

            /* JADX WARNING: Code restructure failed: missing block: B:32:0x008b, code lost:
                if (r0.length == 0) goto L_0x008d;
             */
            @p205i.p209c.p210a.C6004e
            /* renamed from: b */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public java.io.File mo45965b() {
                /*
                    r10 = this;
                    boolean r0 = r10.f42953b
                    r1 = 0
                    if (r0 != 0) goto L_0x0028
                    kotlin.io.g$b r0 = r10.f42956e
                    kotlin.io.g r0 = kotlin.p508io.C14699g.this
                    kotlin.b1.t.l r0 = r0.f42940c
                    if (r0 == 0) goto L_0x0020
                    java.io.File r2 = r10.mo45966a()
                    java.lang.Object r0 = r0.invoke(r2)
                    java.lang.Boolean r0 = (java.lang.Boolean) r0
                    boolean r0 = r0.booleanValue()
                    if (r0 != 0) goto L_0x0020
                    return r1
                L_0x0020:
                    r0 = 1
                    r10.f42953b = r0
                    java.io.File r0 = r10.mo45966a()
                    return r0
                L_0x0028:
                    java.io.File[] r0 = r10.f42954c
                    if (r0 == 0) goto L_0x004c
                    int r2 = r10.f42955d
                    if (r0 != 0) goto L_0x0033
                    kotlin.p214b1.p216u.C14445h0.m62474e()
                L_0x0033:
                    int r0 = r0.length
                    if (r2 >= r0) goto L_0x0037
                    goto L_0x004c
                L_0x0037:
                    kotlin.io.g$b r0 = r10.f42956e
                    kotlin.io.g r0 = kotlin.p508io.C14699g.this
                    kotlin.b1.t.l r0 = r0.f42941d
                    if (r0 == 0) goto L_0x004b
                    java.io.File r2 = r10.mo45966a()
                    java.lang.Object r0 = r0.invoke(r2)
                    kotlin.p0 r0 = (kotlin.C14737p0) r0
                L_0x004b:
                    return r1
                L_0x004c:
                    java.io.File[] r0 = r10.f42954c
                    if (r0 != 0) goto L_0x00a2
                    java.io.File r0 = r10.mo45966a()
                    java.io.File[] r0 = r0.listFiles()
                    r10.f42954c = r0
                    java.io.File[] r0 = r10.f42954c
                    if (r0 != 0) goto L_0x0081
                    kotlin.io.g$b r0 = r10.f42956e
                    kotlin.io.g r0 = kotlin.p508io.C14699g.this
                    kotlin.b1.t.p r0 = r0.f42942e
                    if (r0 == 0) goto L_0x0081
                    java.io.File r2 = r10.mo45966a()
                    kotlin.io.AccessDeniedException r9 = new kotlin.io.AccessDeniedException
                    java.io.File r4 = r10.mo45966a()
                    r5 = 0
                    r7 = 2
                    r8 = 0
                    java.lang.String r6 = "Cannot list files in a directory"
                    r3 = r9
                    r3.<init>(r4, r5, r6, r7, r8)
                    java.lang.Object r0 = r0.mo24962d(r2, r9)
                    kotlin.p0 r0 = (kotlin.C14737p0) r0
                L_0x0081:
                    java.io.File[] r0 = r10.f42954c
                    if (r0 == 0) goto L_0x008d
                    if (r0 != 0) goto L_0x008a
                    kotlin.p214b1.p216u.C14445h0.m62474e()
                L_0x008a:
                    int r0 = r0.length
                    if (r0 != 0) goto L_0x00a2
                L_0x008d:
                    kotlin.io.g$b r0 = r10.f42956e
                    kotlin.io.g r0 = kotlin.p508io.C14699g.this
                    kotlin.b1.t.l r0 = r0.f42941d
                    if (r0 == 0) goto L_0x00a1
                    java.io.File r2 = r10.mo45966a()
                    java.lang.Object r0 = r0.invoke(r2)
                    kotlin.p0 r0 = (kotlin.C14737p0) r0
                L_0x00a1:
                    return r1
                L_0x00a2:
                    java.io.File[] r0 = r10.f42954c
                    if (r0 != 0) goto L_0x00a9
                    kotlin.p214b1.p216u.C14445h0.m62474e()
                L_0x00a9:
                    int r1 = r10.f42955d
                    int r2 = r1 + 1
                    r10.f42955d = r2
                    r0 = r0[r1]
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlin.p508io.C14699g.C14701b.C14704c.mo45965b():java.io.File");
            }
        }

        public C14701b() {
            if (C14699g.this.f42938a.isDirectory()) {
                this.f42944N.push(m63752a(C14699g.this.f42938a));
            } else if (C14699g.this.f42938a.isFile()) {
                this.f42944N.push(new C14703b(this, C14699g.this.f42938a));
            } else {
                mo46026c();
            }
        }

        /* renamed from: a */
        private final C14700a m63752a(File file) {
            int i = C14706h.f42958a[C14699g.this.f42939b.ordinal()];
            if (i == 1) {
                return new C14704c(this, file);
            }
            if (i == 2) {
                return new C14702a(this, file);
            }
            throw new NoWhenBranchMatchedException();
        }

        /* renamed from: d */
        private final File m63753d() {
            while (!this.f42944N.empty()) {
                Object peek = this.f42944N.peek();
                if (peek == null) {
                    C14445h0.m62474e();
                }
                C14705c cVar = (C14705c) peek;
                File b = cVar.mo45965b();
                if (b == null) {
                    this.f42944N.pop();
                } else if (C14445h0.m62463a((Object) b, (Object) cVar.mo45966a()) || !b.isDirectory() || this.f42944N.size() >= C14699g.this.f42943f) {
                    return b;
                } else {
                    this.f42944N.push(m63752a(b));
                }
            }
            return null;
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void mo45765b() {
            File d = m63753d();
            if (d != null) {
                mo46025b(d);
            } else {
                mo46026c();
            }
        }
    }

    /* renamed from: kotlin.io.g$c */
    /* compiled from: FileTreeWalk.kt */
    private static abstract class C14705c {
        @C6003d

        /* renamed from: a */
        private final File f42957a;

        public C14705c(@C6003d File file) {
            C14445h0.m62478f(file, "root");
            this.f42957a = file;
        }

        @C6003d
        /* renamed from: a */
        public final File mo45966a() {
            return this.f42957a;
        }

        @C6004e
        /* renamed from: b */
        public abstract File mo45965b();
    }

    private C14699g(File file, C14707i iVar, C6080l<? super File, Boolean> lVar, C6080l<? super File, C14737p0> lVar2, C6084p<? super File, ? super IOException, C14737p0> pVar, int i) {
        this.f42938a = file;
        this.f42939b = iVar;
        this.f42940c = lVar;
        this.f42941d = lVar2;
        this.f42942e = pVar;
        this.f42943f = i;
    }

    @C6003d
    public Iterator<File> iterator() {
        return new C14701b();
    }

    /* synthetic */ C14699g(File file, C14707i iVar, C6080l lVar, C6080l lVar2, C6084p pVar, int i, int i2, C14487u uVar) {
        if ((i2 & 2) != 0) {
            iVar = C14707i.TOP_DOWN;
        }
        this(file, iVar, lVar, lVar2, pVar, (i2 & 32) != 0 ? Integer.MAX_VALUE : i);
    }

    @C6003d
    /* renamed from: a */
    public final C14699g mo45961a(@C6003d C6080l<? super File, Boolean> lVar) {
        C14445h0.m62478f(lVar, "function");
        C14699g gVar = new C14699g(this.f42938a, this.f42939b, lVar, this.f42941d, this.f42942e, this.f42943f);
        return gVar;
    }

    @C6003d
    /* renamed from: b */
    public final C14699g mo45963b(@C6003d C6080l<? super File, C14737p0> lVar) {
        C14445h0.m62478f(lVar, "function");
        C14699g gVar = new C14699g(this.f42938a, this.f42939b, this.f42940c, lVar, this.f42942e, this.f42943f);
        return gVar;
    }

    @C6003d
    /* renamed from: c */
    public final C14699g mo45964c(int i) {
        if (i > 0) {
            C14699g gVar = new C14699g(this.f42938a, this.f42939b, this.f42940c, this.f42941d, this.f42942e, i);
            return gVar;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("depth must be positive, but was ");
        sb.append(i);
        sb.append('.');
        throw new IllegalArgumentException(sb.toString());
    }

    @C6003d
    /* renamed from: a */
    public final C14699g mo45962a(@C6003d C6084p<? super File, ? super IOException, C14737p0> pVar) {
        C14445h0.m62478f(pVar, "function");
        C14699g gVar = new C14699g(this.f42938a, this.f42939b, this.f42940c, this.f42941d, pVar, this.f42943f);
        return gVar;
    }

    public C14699g(@C6003d File file, @C6003d C14707i iVar) {
        C14445h0.m62478f(file, C11644i.f33457y3);
        C14445h0.m62478f(iVar, "direction");
        this(file, iVar, null, null, null, 0, 32, null);
    }

    public /* synthetic */ C14699g(File file, C14707i iVar, int i, C14487u uVar) {
        if ((i & 2) != 0) {
            iVar = C14707i.TOP_DOWN;
        }
        this(file, iVar);
    }
}
