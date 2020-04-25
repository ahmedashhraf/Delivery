package com.google.common.collect;

import com.google.common.base.C7359j;
import com.google.common.base.C7380p;
import com.google.common.base.C7397x;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.ref.ReferenceQueue;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ExecutionException;
import p201f.p202a.C5952h;
import p201f.p202a.p203u.C5966a;

/* renamed from: com.google.common.collect.d0 */
/* compiled from: ComputingConcurrentHashMap */
class C7648d0<K, V> extends C7717e4<K, V> {
    private static final long serialVersionUID = 4;

    /* renamed from: m0 */
    final C7380p<? super K, ? extends V> f21234m0;

    /* renamed from: com.google.common.collect.d0$a */
    /* compiled from: ComputingConcurrentHashMap */
    private static final class C7649a<K, V> implements C7725d0<K, V> {

        /* renamed from: a */
        final Throwable f21235a;

        C7649a(Throwable th) {
            this.f21235a = th;
        }

        /* renamed from: a */
        public C7725d0<K, V> mo29921a(ReferenceQueue<V> referenceQueue, V v, C7755o<K, V> oVar) {
            return this;
        }

        /* renamed from: a */
        public V mo29922a() throws ExecutionException {
            throw new ExecutionException(this.f21235a);
        }

        /* renamed from: a */
        public void mo29923a(C7725d0<K, V> d0Var) {
        }

        /* renamed from: b */
        public C7755o<K, V> mo29924b() {
            return null;
        }

        /* renamed from: c */
        public boolean mo29925c() {
            return false;
        }

        public V get() {
            return null;
        }
    }

    /* renamed from: com.google.common.collect.d0$b */
    /* compiled from: ComputingConcurrentHashMap */
    private static final class C7650b<K, V> implements C7725d0<K, V> {

        /* renamed from: a */
        final V f21236a;

        C7650b(@C5952h V v) {
            this.f21236a = v;
        }

        /* renamed from: a */
        public C7725d0<K, V> mo29921a(ReferenceQueue<V> referenceQueue, V v, C7755o<K, V> oVar) {
            return this;
        }

        /* renamed from: a */
        public V mo29922a() {
            return get();
        }

        /* renamed from: a */
        public void mo29923a(C7725d0<K, V> d0Var) {
        }

        /* renamed from: b */
        public C7755o<K, V> mo29924b() {
            return null;
        }

        /* renamed from: c */
        public boolean mo29925c() {
            return false;
        }

        public V get() {
            return this.f21236a;
        }
    }

    /* renamed from: com.google.common.collect.d0$c */
    /* compiled from: ComputingConcurrentHashMap */
    static final class C7651c<K, V> extends C7756p<K, V> {
        C7651c(C7717e4<K, V> e4Var, int i, int i2) {
            super(e4Var, i, i2);
        }

        /* JADX INFO: used method not loaded: com.google.common.collect.e4.p.a(java.lang.Object, int, java.lang.Object, com.google.common.collect.d4$e):null, types can be incorrect */
        /* JADX INFO: used method not loaded: com.google.common.collect.e4.b(com.google.common.collect.e4$o):null, types can be incorrect */
        /* JADX INFO: used method not loaded: com.google.common.collect.e4.p.b(com.google.common.collect.e4$o):null, types can be incorrect */
        /* access modifiers changed from: 0000 */
        /* JADX WARNING: Code restructure failed: missing block: B:12:0x001f, code lost:
            if (r0.mo30195e().mo29925c() == false) goto L_0x0021;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:23:0x005a, code lost:
            if (r7.mo30195e().mo29925c() == false) goto L_0x005e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:24:0x005c, code lost:
            r3 = false;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:25:0x005e, code lost:
            r9 = r7.mo30195e().get();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:26:0x0066, code lost:
            if (r9 != null) goto L_0x006e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:27:0x0068, code lost:
            mo30264a(r8, r13, (java.lang.Object) r9, com.google.common.collect.C7660d4.C7665e.COLLECTED);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:29:0x0074, code lost:
            if (r11.f21429a.mo30160d() == false) goto L_0x0090;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:31:0x007c, code lost:
            if (r11.f21429a.mo30153b(r7) == false) goto L_0x0090;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:32:0x007e, code lost:
            mo30264a(r8, r13, (java.lang.Object) r9, com.google.common.collect.C7660d4.C7665e.EXPIRED);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:33:0x0083, code lost:
            r11.f21427V.remove(r7);
            r11.f21428W.remove(r7);
            r11.f21430b = r3;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:34:0x0090, code lost:
            mo30278b(r7);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:36:?, code lost:
            unlock();
            mo30297o();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:37:0x0099, code lost:
            mo30296n();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:38:0x009c, code lost:
            return r9;
         */
        /* JADX WARNING: Removed duplicated region for block: B:57:0x00d4 A[Catch:{ all -> 0x00eb, all -> 0x00f3 }] */
        /* JADX WARNING: Removed duplicated region for block: B:71:0x00c6 A[SYNTHETIC] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public V mo29927a(K r12, int r13, com.google.common.base.C7380p<? super K, ? extends V> r14) throws java.util.concurrent.ExecutionException {
            /*
                r11 = this;
            L_0x0000:
                com.google.common.collect.e4$o r0 = r11.mo30280c(r12, r13)     // Catch:{ all -> 0x00f3 }
                if (r0 == 0) goto L_0x0013
                java.lang.Object r1 = r11.mo30258a(r0)     // Catch:{ all -> 0x00f3 }
                if (r1 == 0) goto L_0x0013
                r11.mo30281c(r0)     // Catch:{ all -> 0x00f3 }
                r11.mo30296n()
                return r1
            L_0x0013:
                r1 = 0
                r2 = 1
                if (r0 == 0) goto L_0x0021
                com.google.common.collect.e4$d0 r3 = r0.mo30195e()     // Catch:{ all -> 0x00f3 }
                boolean r3 = r3.mo29925c()     // Catch:{ all -> 0x00f3 }
                if (r3 != 0) goto L_0x00ce
            L_0x0021:
                r0 = 0
                r11.lock()     // Catch:{ all -> 0x00f3 }
                r11.mo30298p()     // Catch:{ all -> 0x00eb }
                int r3 = r11.f21430b     // Catch:{ all -> 0x00eb }
                int r3 = r3 - r2
                java.util.concurrent.atomic.AtomicReferenceArray<com.google.common.collect.e4$o<K, V>> r4 = r11.f21421P     // Catch:{ all -> 0x00eb }
                int r5 = r4.length()     // Catch:{ all -> 0x00eb }
                int r5 = r5 - r2
                r5 = r5 & r13
                java.lang.Object r6 = r4.get(r5)     // Catch:{ all -> 0x00eb }
                com.google.common.collect.e4$o r6 = (com.google.common.collect.C7717e4.C7755o) r6     // Catch:{ all -> 0x00eb }
                r7 = r6
            L_0x003a:
                if (r7 == 0) goto L_0x00a2
                java.lang.Object r8 = r7.getKey()     // Catch:{ all -> 0x00eb }
                int r9 = r7.mo30196f()     // Catch:{ all -> 0x00eb }
                if (r9 != r13) goto L_0x009d
                if (r8 == 0) goto L_0x009d
                com.google.common.collect.e4<K, V> r9 = r11.f21429a     // Catch:{ all -> 0x00eb }
                com.google.common.base.j<java.lang.Object> r9 = r9.f21345P     // Catch:{ all -> 0x00eb }
                boolean r9 = r9.mo29253b(r12, r8)     // Catch:{ all -> 0x00eb }
                if (r9 == 0) goto L_0x009d
                com.google.common.collect.e4$d0 r9 = r7.mo30195e()     // Catch:{ all -> 0x00eb }
                boolean r9 = r9.mo29925c()     // Catch:{ all -> 0x00eb }
                if (r9 == 0) goto L_0x005e
                r3 = 0
                goto L_0x00a3
            L_0x005e:
                com.google.common.collect.e4$d0 r9 = r7.mo30195e()     // Catch:{ all -> 0x00eb }
                java.lang.Object r9 = r9.get()     // Catch:{ all -> 0x00eb }
                if (r9 != 0) goto L_0x006e
                com.google.common.collect.d4$e r10 = com.google.common.collect.C7660d4.C7665e.COLLECTED     // Catch:{ all -> 0x00eb }
                r11.mo30264a(r8, r13, r9, r10)     // Catch:{ all -> 0x00eb }
                goto L_0x0083
            L_0x006e:
                com.google.common.collect.e4<K, V> r10 = r11.f21429a     // Catch:{ all -> 0x00eb }
                boolean r10 = r10.mo30160d()     // Catch:{ all -> 0x00eb }
                if (r10 == 0) goto L_0x0090
                com.google.common.collect.e4<K, V> r10 = r11.f21429a     // Catch:{ all -> 0x00eb }
                boolean r10 = r10.mo30153b(r7)     // Catch:{ all -> 0x00eb }
                if (r10 == 0) goto L_0x0090
                com.google.common.collect.d4$e r10 = com.google.common.collect.C7660d4.C7665e.EXPIRED     // Catch:{ all -> 0x00eb }
                r11.mo30264a(r8, r13, r9, r10)     // Catch:{ all -> 0x00eb }
            L_0x0083:
                java.util.Queue<com.google.common.collect.e4$o<K, V>> r8 = r11.f21427V     // Catch:{ all -> 0x00eb }
                r8.remove(r7)     // Catch:{ all -> 0x00eb }
                java.util.Queue<com.google.common.collect.e4$o<K, V>> r8 = r11.f21428W     // Catch:{ all -> 0x00eb }
                r8.remove(r7)     // Catch:{ all -> 0x00eb }
                r11.f21430b = r3     // Catch:{ all -> 0x00eb }
                goto L_0x00a2
            L_0x0090:
                r11.mo30278b(r7)     // Catch:{ all -> 0x00eb }
                r11.unlock()     // Catch:{ all -> 0x00f3 }
                r11.mo30297o()     // Catch:{ all -> 0x00f3 }
                r11.mo30296n()
                return r9
            L_0x009d:
                com.google.common.collect.e4$o r7 = r7.mo30194d()     // Catch:{ all -> 0x00eb }
                goto L_0x003a
            L_0x00a2:
                r3 = 1
            L_0x00a3:
                if (r3 == 0) goto L_0x00bc
                com.google.common.collect.d0$e r0 = new com.google.common.collect.d0$e     // Catch:{ all -> 0x00eb }
                r0.<init>(r14)     // Catch:{ all -> 0x00eb }
                if (r7 != 0) goto L_0x00b9
                com.google.common.collect.e4$o r6 = r11.mo30257a(r12, r13, r6)     // Catch:{ all -> 0x00eb }
                r6.mo30193a(r0)     // Catch:{ all -> 0x00eb }
                r4.set(r5, r6)     // Catch:{ all -> 0x00eb }
                r4 = r0
                r0 = r6
                goto L_0x00be
            L_0x00b9:
                r7.mo30193a(r0)     // Catch:{ all -> 0x00eb }
            L_0x00bc:
                r4 = r0
                r0 = r7
            L_0x00be:
                r11.unlock()     // Catch:{ all -> 0x00f3 }
                r11.mo30297o()     // Catch:{ all -> 0x00f3 }
                if (r3 == 0) goto L_0x00ce
                java.lang.Object r12 = r11.mo29928a(r12, r13, r0, r4)     // Catch:{ all -> 0x00f3 }
                r11.mo30296n()
                return r12
            L_0x00ce:
                boolean r3 = java.lang.Thread.holdsLock(r0)     // Catch:{ all -> 0x00f3 }
                if (r3 != 0) goto L_0x00d5
                r1 = 1
            L_0x00d5:
                java.lang.String r2 = "Recursive computation"
                com.google.common.base.C7397x.m35677b(r1, r2)     // Catch:{ all -> 0x00f3 }
                com.google.common.collect.e4$d0 r1 = r0.mo30195e()     // Catch:{ all -> 0x00f3 }
                java.lang.Object r1 = r1.mo29922a()     // Catch:{ all -> 0x00f3 }
                if (r1 == 0) goto L_0x0000
                r11.mo30281c(r0)     // Catch:{ all -> 0x00f3 }
                r11.mo30296n()
                return r1
            L_0x00eb:
                r12 = move-exception
                r11.unlock()     // Catch:{ all -> 0x00f3 }
                r11.mo30297o()     // Catch:{ all -> 0x00f3 }
                throw r12     // Catch:{ all -> 0x00f3 }
            L_0x00f3:
                r12 = move-exception
                r11.mo30296n()
                goto L_0x00f9
            L_0x00f8:
                throw r12
            L_0x00f9:
                goto L_0x00f8
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.collect.C7648d0.C7651c.mo29927a(java.lang.Object, int, com.google.common.base.p):java.lang.Object");
        }

        /* JADX INFO: used method not loaded: com.google.common.collect.e4.p.a(java.lang.Object, int, java.lang.Object, boolean):null, types can be incorrect */
        /* JADX INFO: used method not loaded: com.google.common.collect.e4.p.a(java.lang.Object, int, java.lang.Object, com.google.common.collect.d4$e):null, types can be incorrect */
        /* JADX INFO: used method not loaded: com.google.common.collect.e4.p.a(java.lang.Object, int, com.google.common.collect.e4$d0):null, types can be incorrect */
        /* access modifiers changed from: 0000 */
        /* JADX WARNING: Code restructure failed: missing block: B:11:0x0017, code lost:
            if (mo30259a((java.lang.Object) r7, r8, (java.lang.Object) r2, true) == null) goto L_0x001e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0019, code lost:
            mo30264a((java.lang.Object) r7, r8, (java.lang.Object) r2, com.google.common.collect.C7660d4.C7665e.REPLACED);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0020, code lost:
            if (r3 != 0) goto L_0x0025;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x0022, code lost:
            java.lang.System.nanoTime();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x0025, code lost:
            if (r2 != null) goto L_0x002a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x0027, code lost:
            mo30271a((java.lang.Object) r7, r8, (com.google.common.collect.C7717e4.C7725d0) r10);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x002a, code lost:
            return r2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:25:0x002f, code lost:
            r9 = th;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:7:0x0010, code lost:
            if (r2 == null) goto L_0x001e;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public V mo29928a(K r7, int r8, com.google.common.collect.C7717e4.C7755o<K, V> r9, com.google.common.collect.C7648d0.C7653e<K, V> r10) throws java.util.concurrent.ExecutionException {
            /*
                r6 = this;
                java.lang.System.nanoTime()
                r0 = 0
                r2 = 0
                monitor-enter(r9)     // Catch:{ all -> 0x0033 }
                java.lang.Object r2 = r10.mo29930a(r7, r8)     // Catch:{ all -> 0x002b }
                long r3 = java.lang.System.nanoTime()     // Catch:{ all -> 0x002b }
                monitor-exit(r9)     // Catch:{ all -> 0x0031 }
                if (r2 == 0) goto L_0x001e
                r9 = 1
                java.lang.Object r9 = r6.mo30259a(r7, r8, r2, r9)     // Catch:{ all -> 0x002f }
                if (r9 == 0) goto L_0x001e
                com.google.common.collect.d4$e r9 = com.google.common.collect.C7660d4.C7665e.REPLACED     // Catch:{ all -> 0x002f }
                r6.mo30264a(r7, r8, r2, r9)     // Catch:{ all -> 0x002f }
            L_0x001e:
                int r9 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
                if (r9 != 0) goto L_0x0025
                java.lang.System.nanoTime()
            L_0x0025:
                if (r2 != 0) goto L_0x002a
                r6.mo30271a(r7, r8, r10)
            L_0x002a:
                return r2
            L_0x002b:
                r5 = move-exception
                r3 = r0
            L_0x002d:
                monitor-exit(r9)     // Catch:{ all -> 0x0031 }
                throw r5     // Catch:{ all -> 0x002f }
            L_0x002f:
                r9 = move-exception
                goto L_0x0035
            L_0x0031:
                r5 = move-exception
                goto L_0x002d
            L_0x0033:
                r9 = move-exception
                r3 = r0
            L_0x0035:
                int r5 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
                if (r5 != 0) goto L_0x003c
                java.lang.System.nanoTime()
            L_0x003c:
                if (r2 != 0) goto L_0x0041
                r6.mo30271a(r7, r8, r10)
            L_0x0041:
                goto L_0x0043
            L_0x0042:
                throw r9
            L_0x0043:
                goto L_0x0042
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.collect.C7648d0.C7651c.mo29928a(java.lang.Object, int, com.google.common.collect.e4$o, com.google.common.collect.d0$e):java.lang.Object");
        }
    }

    /* renamed from: com.google.common.collect.d0$d */
    /* compiled from: ComputingConcurrentHashMap */
    static final class C7652d<K, V> extends C7724d<K, V> {
        private static final long serialVersionUID = 4;

        /* renamed from: V */
        final C7380p<? super K, ? extends V> f21237V;

        C7652d(C7763w wVar, C7763w wVar2, C7359j<Object> jVar, C7359j<Object> jVar2, long j, long j2, int i, int i2, C7671f<? super K, ? super V> fVar, ConcurrentMap<K, V> concurrentMap, C7380p<? super K, ? extends V> pVar) {
            super(wVar, wVar2, jVar, jVar2, j, j2, i, i2, fVar, concurrentMap);
            this.f21237V = pVar;
        }

        private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
            objectInputStream.defaultReadObject();
            this.f21375U = mo30201b(objectInputStream).mo29948a(this.f21237V);
            mo30199a(objectInputStream);
        }

        private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
            objectOutputStream.defaultWriteObject();
            mo30200a(objectOutputStream);
        }

        /* access modifiers changed from: 0000 */
        public Object readResolve() {
            return this.f21375U;
        }
    }

    /* renamed from: com.google.common.collect.d0$e */
    /* compiled from: ComputingConcurrentHashMap */
    private static final class C7653e<K, V> implements C7725d0<K, V> {

        /* renamed from: a */
        final C7380p<? super K, ? extends V> f21238a;
        @C5966a("ComputingValueReference.this")

        /* renamed from: b */
        volatile C7725d0<K, V> f21239b = C7717e4.m36831m();

        public C7653e(C7380p<? super K, ? extends V> pVar) {
            this.f21238a = pVar;
        }

        /* renamed from: a */
        public C7725d0<K, V> mo29921a(ReferenceQueue<V> referenceQueue, @C5952h V v, C7755o<K, V> oVar) {
            return this;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:22:0x0023, code lost:
            r0 = th;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public V mo29922a() throws java.util.concurrent.ExecutionException {
            /*
                r3 = this;
                com.google.common.collect.e4$d0<K, V> r0 = r3.f21239b
                com.google.common.collect.e4$d0<java.lang.Object, java.lang.Object> r1 = com.google.common.collect.C7717e4.f21341k0
                if (r0 != r1) goto L_0x0032
                r0 = 0
                monitor-enter(r3)     // Catch:{ all -> 0x0025 }
                r1 = 0
            L_0x0009:
                com.google.common.collect.e4$d0<K, V> r0 = r3.f21239b     // Catch:{ all -> 0x0020 }
                com.google.common.collect.e4$d0<java.lang.Object, java.lang.Object> r2 = com.google.common.collect.C7717e4.f21341k0     // Catch:{ all -> 0x0020 }
                if (r0 != r2) goto L_0x0015
                r3.wait()     // Catch:{ InterruptedException -> 0x0013 }
                goto L_0x0009
            L_0x0013:
                r1 = 1
                goto L_0x0009
            L_0x0015:
                monitor-exit(r3)     // Catch:{ all -> 0x0020 }
                if (r1 == 0) goto L_0x0032
                java.lang.Thread r0 = java.lang.Thread.currentThread()
                r0.interrupt()
                goto L_0x0032
            L_0x0020:
                r0 = move-exception
                monitor-exit(r3)     // Catch:{ all -> 0x0020 }
                throw r0     // Catch:{ all -> 0x0023 }
            L_0x0023:
                r0 = move-exception
                goto L_0x0028
            L_0x0025:
                r1 = move-exception
                r0 = r1
                r1 = 0
            L_0x0028:
                if (r1 == 0) goto L_0x0031
                java.lang.Thread r1 = java.lang.Thread.currentThread()
                r1.interrupt()
            L_0x0031:
                throw r0
            L_0x0032:
                com.google.common.collect.e4$d0<K, V> r0 = r3.f21239b
                java.lang.Object r0 = r0.mo29922a()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.collect.C7648d0.C7653e.mo29922a():java.lang.Object");
        }

        /* renamed from: b */
        public C7755o<K, V> mo29924b() {
            return null;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo29931b(C7725d0<K, V> d0Var) {
            synchronized (this) {
                if (this.f21239b == C7717e4.f21341k0) {
                    this.f21239b = d0Var;
                    notifyAll();
                }
            }
        }

        /* renamed from: c */
        public boolean mo29925c() {
            return true;
        }

        public V get() {
            return null;
        }

        /* renamed from: a */
        public void mo29923a(C7725d0<K, V> d0Var) {
            mo29931b(d0Var);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public V mo29930a(K k, int i) throws ExecutionException {
            try {
                V apply = this.f21238a.apply(k);
                mo29931b(new C7650b(apply));
                return apply;
            } catch (Throwable th) {
                mo29931b(new C7649a(th));
                throw new ExecutionException(th);
            }
        }
    }

    C7648d0(C7660d4 d4Var, C7380p<? super K, ? extends V> pVar) {
        super(d4Var);
        this.f21234m0 = (C7380p) C7397x.m35664a(pVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C7756p<K, V> mo29917a(int i, int i2) {
        return new C7651c(this, i, i2);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public V mo29919d(K k) throws ExecutionException {
        int c = mo30154c(C7397x.m35664a(k));
        return m36569b(c).mo29927a(k, c, this.f21234m0);
    }

    /* access modifiers changed from: 0000 */
    public Object writeReplace() {
        C7652d dVar = new C7652d(this.f21347R, this.f21348S, this.f21345P, this.f21346Q, this.f21351V, this.f21350U, this.f21349T, this.f21344O, this.f21353X, this, this.f21234m0);
        return dVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public C7651c<K, V> m36569b(int i) {
        return (C7651c) super.mo29918b(i);
    }
}
