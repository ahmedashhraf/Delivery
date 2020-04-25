package com.google.gson.p321x.p322m;

import com.google.gson.C8775f;
import com.google.gson.C8803u;
import com.google.gson.C8805v;
import com.google.gson.p321x.C8840h;
import com.google.gson.p324y.C8928a;
import com.google.gson.stream.C8795a;
import com.google.gson.stream.C8798c;
import com.google.gson.stream.C8799d;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: com.google.gson.x.m.h */
/* compiled from: ObjectTypeAdapter */
public final class C8871h extends C8803u<Object> {

    /* renamed from: b */
    public static final C8805v f23242b = new C8872a();

    /* renamed from: a */
    private final C8775f f23243a;

    /* renamed from: com.google.gson.x.m.h$a */
    /* compiled from: ObjectTypeAdapter */
    static class C8872a implements C8805v {
        C8872a() {
        }

        /* renamed from: a */
        public <T> C8803u<T> mo32486a(C8775f fVar, C8928a<T> aVar) {
            if (aVar.mo32660a() == Object.class) {
                return new C8871h(fVar);
            }
            return null;
        }
    }

    /* renamed from: com.google.gson.x.m.h$b */
    /* compiled from: ObjectTypeAdapter */
    static /* synthetic */ class C8873b {

        /* renamed from: a */
        static final /* synthetic */ int[] f23244a = new int[C8798c.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|(3:11|12|14)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0040 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0035 */
        static {
            /*
                com.google.gson.stream.c[] r0 = com.google.gson.stream.C8798c.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f23244a = r0
                int[] r0 = f23244a     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.google.gson.stream.c r1 = com.google.gson.stream.C8798c.BEGIN_ARRAY     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = f23244a     // Catch:{ NoSuchFieldError -> 0x001f }
                com.google.gson.stream.c r1 = com.google.gson.stream.C8798c.BEGIN_OBJECT     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = f23244a     // Catch:{ NoSuchFieldError -> 0x002a }
                com.google.gson.stream.c r1 = com.google.gson.stream.C8798c.STRING     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                int[] r0 = f23244a     // Catch:{ NoSuchFieldError -> 0x0035 }
                com.google.gson.stream.c r1 = com.google.gson.stream.C8798c.NUMBER     // Catch:{ NoSuchFieldError -> 0x0035 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0035 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0035 }
            L_0x0035:
                int[] r0 = f23244a     // Catch:{ NoSuchFieldError -> 0x0040 }
                com.google.gson.stream.c r1 = com.google.gson.stream.C8798c.BOOLEAN     // Catch:{ NoSuchFieldError -> 0x0040 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0040 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0040 }
            L_0x0040:
                int[] r0 = f23244a     // Catch:{ NoSuchFieldError -> 0x004b }
                com.google.gson.stream.c r1 = com.google.gson.stream.C8798c.NULL     // Catch:{ NoSuchFieldError -> 0x004b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x004b }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x004b }
            L_0x004b:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.gson.p321x.p322m.C8871h.C8873b.<clinit>():void");
        }
    }

    C8871h(C8775f fVar) {
        this.f23243a = fVar;
    }

    /* renamed from: a */
    public Object mo32287a(C8795a aVar) throws IOException {
        switch (C8873b.f23244a[aVar.peek().ordinal()]) {
            case 1:
                ArrayList arrayList = new ArrayList();
                aVar.mo32444a();
                while (aVar.mo32452i()) {
                    arrayList.add(mo32287a(aVar));
                }
                aVar.mo32449f();
                return arrayList;
            case 2:
                C8840h hVar = new C8840h();
                aVar.mo32447d();
                while (aVar.mo32452i()) {
                    hVar.put(aVar.mo32440K(), mo32287a(aVar));
                }
                aVar.mo32450g();
                return hVar;
            case 3:
                return aVar.mo32442M();
            case 4:
                return Double.valueOf(aVar.mo32437H());
            case 5:
                return Boolean.valueOf(aVar.mo32436G());
            case 6:
                aVar.mo32441L();
                return null;
            default:
                throw new IllegalStateException();
        }
    }

    /* renamed from: a */
    public void mo32288a(C8799d dVar, Object obj) throws IOException {
        if (obj == null) {
            dVar.mo32456B();
            return;
        }
        C8803u a = this.f23243a.mo32307a(obj.getClass());
        if (a instanceof C8871h) {
            dVar.mo32468d();
            dVar.mo32473f();
            return;
        }
        a.mo32288a(dVar, obj);
    }
}
