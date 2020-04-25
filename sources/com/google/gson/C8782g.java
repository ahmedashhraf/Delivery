package com.google.gson;

import com.google.gson.p321x.C8806a;
import com.google.gson.p321x.C8826d;
import com.google.gson.p321x.p322m.C8882l;
import com.google.gson.p321x.p322m.C8887n;
import com.google.gson.p324y.C8928a;
import java.lang.reflect.Type;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.gson.g */
/* compiled from: GsonBuilder */
public final class C8782g {

    /* renamed from: a */
    private C8826d f23015a = C8826d.f23133S;

    /* renamed from: b */
    private C8800t f23016b = C8800t.DEFAULT;

    /* renamed from: c */
    private C8774e f23017c = C8768d.IDENTITY;

    /* renamed from: d */
    private final Map<Type, C8783h<?>> f23018d = new HashMap();

    /* renamed from: e */
    private final List<C8805v> f23019e = new ArrayList();

    /* renamed from: f */
    private final List<C8805v> f23020f = new ArrayList();

    /* renamed from: g */
    private boolean f23021g = false;

    /* renamed from: h */
    private String f23022h;

    /* renamed from: i */
    private int f23023i = 2;

    /* renamed from: j */
    private int f23024j = 2;

    /* renamed from: k */
    private boolean f23025k = false;

    /* renamed from: l */
    private boolean f23026l = false;

    /* renamed from: m */
    private boolean f23027m = true;

    /* renamed from: n */
    private boolean f23028n = false;

    /* renamed from: o */
    private boolean f23029o = false;

    /* renamed from: p */
    private boolean f23030p = false;

    /* renamed from: a */
    public C8782g mo32337a(double d) {
        this.f23015a = this.f23015a.mo32505a(d);
        return this;
    }

    /* renamed from: b */
    public C8782g mo32351b(C8766b bVar) {
        this.f23015a = this.f23015a.mo32506a(bVar, true, false);
        return this;
    }

    /* renamed from: c */
    public C8782g mo32352c() {
        this.f23015a = this.f23015a.mo32510b();
        return this;
    }

    /* renamed from: d */
    public C8782g mo32353d() {
        this.f23025k = true;
        return this;
    }

    /* renamed from: e */
    public C8782g mo32354e() {
        this.f23015a = this.f23015a.mo32511c();
        return this;
    }

    /* renamed from: f */
    public C8782g mo32355f() {
        this.f23029o = true;
        return this;
    }

    /* renamed from: g */
    public C8782g mo32356g() {
        this.f23021g = true;
        return this;
    }

    /* renamed from: h */
    public C8782g mo32357h() {
        this.f23026l = true;
        return this;
    }

    /* renamed from: i */
    public C8782g mo32358i() {
        this.f23030p = true;
        return this;
    }

    /* renamed from: j */
    public C8782g mo32359j() {
        this.f23028n = true;
        return this;
    }

    /* renamed from: a */
    public C8782g mo32348a(int... iArr) {
        this.f23015a = this.f23015a.mo32507a(iArr);
        return this;
    }

    /* renamed from: b */
    public C8782g mo32350b() {
        this.f23027m = false;
        return this;
    }

    /* renamed from: a */
    public C8782g mo32343a(C8800t tVar) {
        this.f23016b = tVar;
        return this;
    }

    /* renamed from: a */
    public C8782g mo32341a(C8768d dVar) {
        this.f23017c = dVar;
        return this;
    }

    /* renamed from: a */
    public C8782g mo32342a(C8774e eVar) {
        this.f23017c = eVar;
        return this;
    }

    /* renamed from: a */
    public C8782g mo32349a(C8766b... bVarArr) {
        for (C8766b a : bVarArr) {
            this.f23015a = this.f23015a.mo32506a(a, true, true);
        }
        return this;
    }

    /* renamed from: a */
    public C8782g mo32340a(C8766b bVar) {
        this.f23015a = this.f23015a.mo32506a(bVar, false, true);
        return this;
    }

    /* renamed from: a */
    public C8782g mo32346a(String str) {
        this.f23022h = str;
        return this;
    }

    /* renamed from: a */
    public C8782g mo32338a(int i) {
        this.f23023i = i;
        this.f23022h = null;
        return this;
    }

    /* renamed from: a */
    public C8782g mo32339a(int i, int i2) {
        this.f23023i = i;
        this.f23024j = i2;
        this.f23022h = null;
        return this;
    }

    /* renamed from: a */
    public C8782g mo32347a(Type type, Object obj) {
        boolean z = obj instanceof C8793r;
        C8806a.m41345a(z || (obj instanceof C8786k) || (obj instanceof C8783h) || (obj instanceof C8803u));
        if (obj instanceof C8783h) {
            this.f23018d.put(type, (C8783h) obj);
        }
        if (z || (obj instanceof C8786k)) {
            this.f23019e.add(C8882l.m41541b(C8928a.m41700b(type), obj));
        }
        if (obj instanceof C8803u) {
            this.f23019e.add(C8887n.m41551a(C8928a.m41700b(type), (C8803u) obj));
        }
        return this;
    }

    /* renamed from: a */
    public C8782g mo32344a(C8805v vVar) {
        this.f23019e.add(vVar);
        return this;
    }

    /* renamed from: a */
    public C8782g mo32345a(Class<?> cls, Object obj) {
        boolean z = obj instanceof C8793r;
        C8806a.m41345a(z || (obj instanceof C8786k) || (obj instanceof C8803u));
        if ((obj instanceof C8786k) || z) {
            this.f23020f.add(C8882l.m41539a(cls, obj));
        }
        if (obj instanceof C8803u) {
            this.f23019e.add(C8887n.m41554b(cls, (C8803u) obj));
        }
        return this;
    }

    /* renamed from: a */
    public C8775f mo32336a() {
        ArrayList arrayList = new ArrayList(this.f23019e.size() + this.f23020f.size() + 3);
        arrayList.addAll(this.f23019e);
        Collections.reverse(arrayList);
        Collections.reverse(this.f23020f);
        arrayList.addAll(this.f23020f);
        m41148a(this.f23022h, this.f23023i, this.f23024j, arrayList);
        C8775f fVar = new C8775f(this.f23015a, this.f23017c, this.f23018d, this.f23021g, this.f23025k, this.f23029o, this.f23027m, this.f23028n, this.f23030p, this.f23026l, this.f23016b, arrayList);
        return fVar;
    }

    /* renamed from: a */
    private void m41148a(String str, int i, int i2, List<C8805v> list) {
        C8765a aVar;
        C8765a aVar2;
        C8765a aVar3;
        if (str != null) {
            if (!"".equals(str.trim())) {
                C8765a aVar4 = new C8765a(Date.class, str);
                aVar = new C8765a(Timestamp.class, str);
                aVar3 = new C8765a(java.sql.Date.class, str);
                aVar2 = aVar4;
                list.add(C8887n.m41552a(Date.class, (C8803u<TT>) aVar2));
                list.add(C8887n.m41552a(Timestamp.class, (C8803u<TT>) aVar));
                list.add(C8887n.m41552a(java.sql.Date.class, (C8803u<TT>) aVar3));
            }
        }
        if (i != 2 && i2 != 2) {
            aVar2 = new C8765a(Date.class, i, i2);
            C8765a aVar5 = new C8765a(Timestamp.class, i, i2);
            C8765a aVar6 = new C8765a(java.sql.Date.class, i, i2);
            aVar = aVar5;
            aVar3 = aVar6;
            list.add(C8887n.m41552a(Date.class, (C8803u<TT>) aVar2));
            list.add(C8887n.m41552a(Timestamp.class, (C8803u<TT>) aVar));
            list.add(C8887n.m41552a(java.sql.Date.class, (C8803u<TT>) aVar3));
        }
    }
}
