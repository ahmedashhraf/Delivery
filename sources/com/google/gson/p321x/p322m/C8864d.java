package com.google.gson.p321x.p322m;

import com.google.gson.C8775f;
import com.google.gson.C8803u;
import com.google.gson.C8805v;
import com.google.gson.p193w.C5861b;
import com.google.gson.p321x.C8811c;
import com.google.gson.p324y.C8928a;

/* renamed from: com.google.gson.x.m.d */
/* compiled from: JsonAdapterAnnotationTypeAdapterFactory */
public final class C8864d implements C8805v {

    /* renamed from: a */
    private final C8811c f23224a;

    public C8864d(C8811c cVar) {
        this.f23224a = cVar;
    }

    /* renamed from: a */
    public <T> C8803u<T> mo32486a(C8775f fVar, C8928a<T> aVar) {
        C5861b bVar = (C5861b) aVar.mo32660a().getAnnotation(C5861b.class);
        if (bVar == null) {
            return null;
        }
        return mo32611a(this.f23224a, fVar, aVar, bVar);
    }

    /* JADX WARNING: type inference failed for: r9v14, types: [com.google.gson.u] */
    /* JADX WARNING: type inference failed for: r9v15, types: [com.google.gson.u] */
    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.gson.C8803u<?> mo32611a(com.google.gson.p321x.C8811c r9, com.google.gson.C8775f r10, com.google.gson.p324y.C8928a<?> r11, com.google.gson.p193w.C5861b r12) {
        /*
            r8 = this;
            java.lang.Class r0 = r12.value()
            com.google.gson.y.a r0 = com.google.gson.p324y.C8928a.m41699b(r0)
            com.google.gson.x.i r9 = r9.mo32502a(r0)
            java.lang.Object r9 = r9.mo32504a()
            boolean r0 = r9 instanceof com.google.gson.C8803u
            if (r0 == 0) goto L_0x0017
            com.google.gson.u r9 = (com.google.gson.C8803u) r9
            goto L_0x007a
        L_0x0017:
            boolean r0 = r9 instanceof com.google.gson.C8805v
            if (r0 == 0) goto L_0x0022
            com.google.gson.v r9 = (com.google.gson.C8805v) r9
            com.google.gson.u r9 = r9.mo32486a(r10, r11)
            goto L_0x007a
        L_0x0022:
            boolean r0 = r9 instanceof com.google.gson.C8793r
            if (r0 != 0) goto L_0x0060
            boolean r1 = r9 instanceof com.google.gson.C8786k
            if (r1 == 0) goto L_0x002b
            goto L_0x0060
        L_0x002b:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r0 = "Invalid attempt to bind an instance of "
            r12.append(r0)
            java.lang.Class r9 = r9.getClass()
            java.lang.String r9 = r9.getName()
            r12.append(r9)
            java.lang.String r9 = " as a @JsonAdapter for "
            r12.append(r9)
            java.lang.String r9 = r11.toString()
            r12.append(r9)
            java.lang.String r9 = ". @JsonAdapter value must be a TypeAdapter, TypeAdapterFactory,"
            r12.append(r9)
            java.lang.String r9 = " JsonSerializer or JsonDeserializer."
            r12.append(r9)
            java.lang.String r9 = r12.toString()
            r10.<init>(r9)
            throw r10
        L_0x0060:
            r1 = 0
            if (r0 == 0) goto L_0x0068
            r0 = r9
            com.google.gson.r r0 = (com.google.gson.C8793r) r0
            r3 = r0
            goto L_0x0069
        L_0x0068:
            r3 = r1
        L_0x0069:
            boolean r0 = r9 instanceof com.google.gson.C8786k
            if (r0 == 0) goto L_0x0070
            r1 = r9
            com.google.gson.k r1 = (com.google.gson.C8786k) r1
        L_0x0070:
            r4 = r1
            com.google.gson.x.m.l r9 = new com.google.gson.x.m.l
            r7 = 0
            r2 = r9
            r5 = r10
            r6 = r11
            r2.<init>(r3, r4, r5, r6, r7)
        L_0x007a:
            if (r9 == 0) goto L_0x0086
            boolean r10 = r12.nullSafe()
            if (r10 == 0) goto L_0x0086
            com.google.gson.u r9 = r9.mo32479a()
        L_0x0086:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.p321x.p322m.C8864d.mo32611a(com.google.gson.x.c, com.google.gson.f, com.google.gson.y.a, com.google.gson.w.b):com.google.gson.u");
    }
}
