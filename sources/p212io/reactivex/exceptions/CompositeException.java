package p212io.reactivex.exceptions;

import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import p195e.p196a.p198t0.C5937f;

/* renamed from: io.reactivex.exceptions.CompositeException */
public final class CompositeException extends RuntimeException {
    private static final long serialVersionUID = 3026362227162912146L;

    /* renamed from: N */
    private Throwable f42527N;

    /* renamed from: a */
    private final List<Throwable> f42528a;

    /* renamed from: b */
    private final String f42529b;

    /* renamed from: io.reactivex.exceptions.CompositeException$a */
    static final class C14394a extends RuntimeException {

        /* renamed from: a */
        static final String f42530a = "Chain of Causes for CompositeException In Order Received =>";
        private static final long serialVersionUID = 3875212506787802066L;

        C14394a() {
        }

        public String getMessage() {
            return f42530a;
        }
    }

    /* renamed from: io.reactivex.exceptions.CompositeException$b */
    static abstract class C14395b {
        C14395b() {
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public abstract void mo45518a(Object obj);
    }

    /* renamed from: io.reactivex.exceptions.CompositeException$c */
    static final class C14396c extends C14395b {

        /* renamed from: a */
        private final PrintStream f42531a;

        C14396c(PrintStream printStream) {
            this.f42531a = printStream;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo45518a(Object obj) {
            this.f42531a.println(obj);
        }
    }

    /* renamed from: io.reactivex.exceptions.CompositeException$d */
    static final class C14397d extends C14395b {

        /* renamed from: a */
        private final PrintWriter f42532a;

        C14397d(PrintWriter printWriter) {
            this.f42532a = printWriter;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo45518a(Object obj) {
            this.f42532a.println(obj);
        }
    }

    public CompositeException(@C5937f Throwable... thArr) {
        this((Iterable<? extends Throwable>) thArr == null ? Collections.singletonList(new NullPointerException("exceptions was null")) : Arrays.asList(thArr));
    }

    /* renamed from: b */
    private List<Throwable> m62349b(Throwable th) {
        ArrayList arrayList = new ArrayList();
        Throwable cause = th.getCause();
        if (cause != null && cause != th) {
            while (true) {
                arrayList.add(cause);
                Throwable cause2 = cause.getCause();
                if (cause2 == null || cause2 == cause) {
                    break;
                }
                cause = cause2;
            }
        }
        return arrayList;
    }

    @C5937f
    /* renamed from: a */
    public List<Throwable> mo45510a() {
        return this.f42528a;
    }

    /* renamed from: d */
    public int mo45511d() {
        return this.f42528a.size();
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:10|(4:13|(2:15|33)(2:16|34)|32|11)|17|18|19|20|31) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0055 */
    @p195e.p196a.p198t0.C5937f
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized java.lang.Throwable getCause() {
        /*
            r8 = this;
            monitor-enter(r8)
            java.lang.Throwable r0 = r8.f42527N     // Catch:{ all -> 0x0060 }
            if (r0 != 0) goto L_0x005c
            io.reactivex.exceptions.CompositeException$a r0 = new io.reactivex.exceptions.CompositeException$a     // Catch:{ all -> 0x0060 }
            r0.<init>()     // Catch:{ all -> 0x0060 }
            java.util.HashSet r1 = new java.util.HashSet     // Catch:{ all -> 0x0060 }
            r1.<init>()     // Catch:{ all -> 0x0060 }
            java.util.List<java.lang.Throwable> r2 = r8.f42528a     // Catch:{ all -> 0x0060 }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x0060 }
            r3 = r0
        L_0x0016:
            boolean r4 = r2.hasNext()     // Catch:{ all -> 0x0060 }
            if (r4 == 0) goto L_0x005a
            java.lang.Object r4 = r2.next()     // Catch:{ all -> 0x0060 }
            java.lang.Throwable r4 = (java.lang.Throwable) r4     // Catch:{ all -> 0x0060 }
            boolean r5 = r1.contains(r4)     // Catch:{ all -> 0x0060 }
            if (r5 == 0) goto L_0x0029
            goto L_0x0016
        L_0x0029:
            r1.add(r4)     // Catch:{ all -> 0x0060 }
            java.util.List r5 = r8.m62349b(r4)     // Catch:{ all -> 0x0060 }
            java.util.Iterator r5 = r5.iterator()     // Catch:{ all -> 0x0060 }
        L_0x0034:
            boolean r6 = r5.hasNext()     // Catch:{ all -> 0x0060 }
            if (r6 == 0) goto L_0x0052
            java.lang.Object r6 = r5.next()     // Catch:{ all -> 0x0060 }
            java.lang.Throwable r6 = (java.lang.Throwable) r6     // Catch:{ all -> 0x0060 }
            boolean r7 = r1.contains(r6)     // Catch:{ all -> 0x0060 }
            if (r7 == 0) goto L_0x004e
            java.lang.RuntimeException r4 = new java.lang.RuntimeException     // Catch:{ all -> 0x0060 }
            java.lang.String r6 = "Duplicate found in causal chain so cropping to prevent loop ..."
            r4.<init>(r6)     // Catch:{ all -> 0x0060 }
            goto L_0x0034
        L_0x004e:
            r1.add(r6)     // Catch:{ all -> 0x0060 }
            goto L_0x0034
        L_0x0052:
            r3.initCause(r4)     // Catch:{ all -> 0x0055 }
        L_0x0055:
            java.lang.Throwable r3 = r8.mo45509a(r3)     // Catch:{ all -> 0x0060 }
            goto L_0x0016
        L_0x005a:
            r8.f42527N = r0     // Catch:{ all -> 0x0060 }
        L_0x005c:
            java.lang.Throwable r0 = r8.f42527N     // Catch:{ all -> 0x0060 }
            monitor-exit(r8)
            return r0
        L_0x0060:
            r0 = move-exception
            monitor-exit(r8)
            goto L_0x0064
        L_0x0063:
            throw r0
        L_0x0064:
            goto L_0x0063
        */
        throw new UnsupportedOperationException("Method not decompiled: p212io.reactivex.exceptions.CompositeException.getCause():java.lang.Throwable");
    }

    @C5937f
    public String getMessage() {
        return this.f42529b;
    }

    public void printStackTrace() {
        printStackTrace(System.err);
    }

    /* renamed from: a */
    private void m62347a(C14395b bVar) {
        StackTraceElement[] stackTrace;
        StringBuilder sb = new StringBuilder(128);
        sb.append(this);
        sb.append(10);
        for (StackTraceElement stackTraceElement : getStackTrace()) {
            sb.append("\tat ");
            sb.append(stackTraceElement);
            sb.append(10);
        }
        int i = 1;
        for (Throwable th : this.f42528a) {
            sb.append("  ComposedException ");
            sb.append(i);
            sb.append(" :\n");
            m62348a(sb, th, "\t");
            i++;
        }
        bVar.mo45518a(sb.toString());
    }

    public void printStackTrace(PrintStream printStream) {
        m62347a((C14395b) new C14396c(printStream));
    }

    public void printStackTrace(PrintWriter printWriter) {
        m62347a((C14395b) new C14397d(printWriter));
    }

    public CompositeException(@C5937f Iterable<? extends Throwable> iterable) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        ArrayList arrayList = new ArrayList();
        if (iterable != null) {
            for (Throwable th : iterable) {
                if (th instanceof CompositeException) {
                    linkedHashSet.addAll(((CompositeException) th).mo45510a());
                } else if (th != null) {
                    linkedHashSet.add(th);
                } else {
                    linkedHashSet.add(new NullPointerException("Throwable was null!"));
                }
            }
        } else {
            linkedHashSet.add(new NullPointerException("errors was null"));
        }
        if (!linkedHashSet.isEmpty()) {
            arrayList.addAll(linkedHashSet);
            this.f42528a = Collections.unmodifiableList(arrayList);
            StringBuilder sb = new StringBuilder();
            sb.append(this.f42528a.size());
            sb.append(" exceptions occurred. ");
            this.f42529b = sb.toString();
            return;
        }
        throw new IllegalArgumentException("errors is empty");
    }

    /* renamed from: a */
    private void m62348a(StringBuilder sb, Throwable th, String str) {
        StackTraceElement[] stackTrace;
        sb.append(str);
        sb.append(th);
        sb.append(10);
        for (StackTraceElement stackTraceElement : th.getStackTrace()) {
            sb.append("\t\tat ");
            sb.append(stackTraceElement);
            sb.append(10);
        }
        if (th.getCause() != null) {
            sb.append("\tCaused by: ");
            m62348a(sb, th.getCause(), "");
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public Throwable mo45509a(Throwable th) {
        Throwable cause = th.getCause();
        if (cause == null || this.f42527N == cause) {
            return th;
        }
        while (true) {
            Throwable cause2 = cause.getCause();
            if (cause2 == null || cause2 == cause) {
                return cause;
            }
            cause = cause2;
        }
        return cause;
    }
}
