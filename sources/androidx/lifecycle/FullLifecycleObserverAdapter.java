package androidx.lifecycle;

import androidx.lifecycle.Lifecycle.C1441a;

class FullLifecycleObserverAdapter implements C1457g {

    /* renamed from: a */
    private final C1454d f5659a;

    /* renamed from: b */
    private final C1457g f5660b;

    /* renamed from: androidx.lifecycle.FullLifecycleObserverAdapter$a */
    static /* synthetic */ class C1440a {

        /* renamed from: a */
        static final /* synthetic */ int[] f5661a = new int[C1441a.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|(3:13|14|16)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(16:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|16) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0040 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x004b */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0035 */
        static {
            /*
                androidx.lifecycle.Lifecycle$a[] r0 = androidx.lifecycle.Lifecycle.C1441a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f5661a = r0
                int[] r0 = f5661a     // Catch:{ NoSuchFieldError -> 0x0014 }
                androidx.lifecycle.Lifecycle$a r1 = androidx.lifecycle.Lifecycle.C1441a.ON_CREATE     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = f5661a     // Catch:{ NoSuchFieldError -> 0x001f }
                androidx.lifecycle.Lifecycle$a r1 = androidx.lifecycle.Lifecycle.C1441a.ON_START     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = f5661a     // Catch:{ NoSuchFieldError -> 0x002a }
                androidx.lifecycle.Lifecycle$a r1 = androidx.lifecycle.Lifecycle.C1441a.ON_RESUME     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                int[] r0 = f5661a     // Catch:{ NoSuchFieldError -> 0x0035 }
                androidx.lifecycle.Lifecycle$a r1 = androidx.lifecycle.Lifecycle.C1441a.ON_PAUSE     // Catch:{ NoSuchFieldError -> 0x0035 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0035 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0035 }
            L_0x0035:
                int[] r0 = f5661a     // Catch:{ NoSuchFieldError -> 0x0040 }
                androidx.lifecycle.Lifecycle$a r1 = androidx.lifecycle.Lifecycle.C1441a.ON_STOP     // Catch:{ NoSuchFieldError -> 0x0040 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0040 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0040 }
            L_0x0040:
                int[] r0 = f5661a     // Catch:{ NoSuchFieldError -> 0x004b }
                androidx.lifecycle.Lifecycle$a r1 = androidx.lifecycle.Lifecycle.C1441a.ON_DESTROY     // Catch:{ NoSuchFieldError -> 0x004b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x004b }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x004b }
            L_0x004b:
                int[] r0 = f5661a     // Catch:{ NoSuchFieldError -> 0x0056 }
                androidx.lifecycle.Lifecycle$a r1 = androidx.lifecycle.Lifecycle.C1441a.ON_ANY     // Catch:{ NoSuchFieldError -> 0x0056 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0056 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0056 }
            L_0x0056:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.FullLifecycleObserverAdapter.C1440a.<clinit>():void");
        }
    }

    FullLifecycleObserverAdapter(C1454d dVar, C1457g gVar) {
        this.f5659a = dVar;
        this.f5660b = gVar;
    }

    /* renamed from: a */
    public void mo632a(C1459i iVar, C1441a aVar) {
        switch (C1440a.f5661a[aVar.ordinal()]) {
            case 1:
                this.f5659a.mo6506b(iVar);
                break;
            case 2:
                this.f5659a.mo6510f(iVar);
                break;
            case 3:
                this.f5659a.mo6505a(iVar);
                break;
            case 4:
                this.f5659a.mo6507c(iVar);
                break;
            case 5:
                this.f5659a.mo6508d(iVar);
                break;
            case 6:
                this.f5659a.mo6509e(iVar);
                break;
            case 7:
                throw new IllegalArgumentException("ON_ANY must not been send by anybody");
        }
        C1457g gVar = this.f5660b;
        if (gVar != null) {
            gVar.mo632a(iVar, aVar);
        }
    }
}
