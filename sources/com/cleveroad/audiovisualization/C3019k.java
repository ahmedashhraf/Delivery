package com.cleveroad.audiovisualization;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.cleveroad.audiovisualization.k */
/* compiled from: GLWaveLayer */
class C3019k {

    /* renamed from: a */
    private final C3010e f10730a;

    /* renamed from: b */
    private final C3018j[] f10731b;

    /* renamed from: c */
    private final C3015g f10732c;

    /* renamed from: d */
    private final Random f10733d;

    /* renamed from: e */
    private final float f10734e;

    /* renamed from: f */
    private final float f10735f;

    /* renamed from: g */
    private float f10736g;

    /* renamed from: h */
    private final Set<C3014f> f10737h;

    /* renamed from: i */
    private final Queue<C3014f> f10738i;

    /* renamed from: j */
    private final Set<C3014f> f10739j;

    /* renamed from: k */
    private boolean f10740k;

    /* renamed from: l */
    private final C3014f[] f10741l;

    public C3019k(C3010e eVar, float[] fArr, float f, float f2, Random random) {
        C3010e eVar2 = eVar;
        float f3 = f2;
        this.f10730a = eVar2;
        this.f10733d = random;
        this.f10731b = new C3018j[eVar2.f10660a];
        float f4 = eVar2.f10665f;
        float f5 = f + ((f4 / ((eVar2.f10664e * 2.0f) + f4)) * (f3 - f));
        C3015g gVar = new C3015g(fArr, -1.0f, 1.0f, f, f5);
        this.f10732c = gVar;
        int i = eVar2.f10660a;
        float[] a = m14407a(this.f10733d, i, 2.0f / ((float) i), 0.15f);
        this.f10734e = f5;
        this.f10735f = f3;
        int i2 = 0;
        while (i2 < eVar2.f10660a) {
            byte b = i2 % 2 == 0 ? (byte) 0 : 1;
            int i3 = i2 + 1;
            C3018j[] jVarArr = this.f10731b;
            C3018j jVar = new C3018j(fArr, a[i2], a[i3], f5, f2, b, random);
            jVarArr[i2] = jVar;
            i2 = i3;
        }
        this.f10737h = Collections.newSetFromMap(new ConcurrentHashMap());
        this.f10739j = Collections.newSetFromMap(new ConcurrentHashMap());
        this.f10738i = new LinkedList();
        this.f10741l = m14408a(fArr, eVar2.f10662c);
        Collections.addAll(this.f10738i, this.f10741l);
    }

    /* renamed from: a */
    private static float[] m14407a(Random random, int i, float f, float f2) {
        float[] fArr = new float[(i + 1)];
        for (int i2 = 0; i2 < fArr.length; i2++) {
            if (i2 == 0) {
                fArr[i2] = -1.0f;
            } else {
                float f3 = 1.0f;
                if (i2 == fArr.length - 1) {
                    fArr[i2] = 1.0f;
                } else {
                    float nextFloat = random.nextFloat() * f2 * f;
                    if (!random.nextBoolean()) {
                        f3 = -1.0f;
                    }
                    fArr[i2] = ((((float) i2) * f) - 4.0f) + (nextFloat * f3);
                }
            }
        }
        return fArr;
    }

    /* renamed from: c */
    private void m14409c() {
        int nextInt = this.f10733d.nextInt(3);
        for (int i = 0; i < nextInt; i++) {
            C3014f fVar = (C3014f) this.f10738i.poll();
            if (fVar != null) {
                float nextFloat = this.f10733d.nextFloat() * 0.1f * ((float) (this.f10733d.nextBoolean() ? 1 : -1));
                C3010e eVar = this.f10730a;
                float f = eVar.f10663d;
                if (eVar.f10666g) {
                    f *= (this.f10733d.nextFloat() * 0.8f) + 0.5f;
                }
                fVar.mo11865a((this.f10733d.nextFloat() * 2.0f) - 4.0f, this.f10734e + nextFloat, this.f10735f, f);
                this.f10739j.add(fVar);
            }
        }
    }

    /* renamed from: b */
    public boolean mo11886b() {
        return this.f10740k;
    }

    /* renamed from: a */
    public void mo11884a(long j, float f, float f2) {
        C3018j[] jVarArr;
        float f3 = ((float) j) * f;
        this.f10740k = true;
        for (C3018j jVar : this.f10731b) {
            jVar.mo11879b(f3);
            this.f10740k = jVar.mo11881d() & this.f10740k;
        }
        this.f10737h.addAll(this.f10739j);
        this.f10739j.clear();
        Iterator it = this.f10737h.iterator();
        while (it.hasNext()) {
            C3014f fVar = (C3014f) it.next();
            fVar.mo11866a(j, f2);
            if (fVar.mo11868d()) {
                this.f10738i.add(fVar);
                it.remove();
            }
        }
    }

    /* renamed from: a */
    public void mo11882a() {
        for (C3018j c : this.f10731b) {
            c.mo11880c();
        }
        this.f10732c.mo11869c();
        for (C3014f c2 : this.f10737h) {
            c2.mo11867c();
        }
    }

    /* renamed from: a */
    public void mo11883a(float f, float f2) {
        for (C3018j a : this.f10731b) {
            a.mo11878a(C3023n.m14431a(f, this.f10733d));
        }
        float f3 = this.f10736g;
        if (f2 > f3) {
            this.f10736g = f2;
            if (f > 0.25f) {
                m14409c();
                return;
            }
            return;
        }
        this.f10736g = C3023n.m14440d(f3, f2, 0.8f);
    }

    /* renamed from: a */
    private C3014f[] m14408a(float[] fArr, int i) {
        C3014f[] fVarArr = new C3014f[i];
        for (int i2 = 0; i2 < i; i2++) {
            C3010e eVar = this.f10730a;
            float f = eVar.f10663d;
            if (eVar.f10666g) {
                f *= (this.f10733d.nextFloat() * 0.8f) + 0.5f;
            }
            float f2 = f;
            float nextFloat = this.f10733d.nextFloat() * 0.1f * ((float) (this.f10733d.nextBoolean() ? 1 : -1));
            float[] fArr2 = new float[fArr.length];
            System.arraycopy(fArr, 0, fArr2, 0, fArr2.length);
            C3014f fVar = new C3014f(fArr2, (this.f10733d.nextFloat() * 2.0f) - 4.0f, this.f10734e + nextFloat, this.f10735f, f2, this.f10733d);
            fVarArr[i2] = fVar;
        }
        return fVarArr;
    }

    /* renamed from: a */
    public void mo11885a(float[] fArr) {
        this.f10732c.mo11875a(fArr);
        for (C3018j a : this.f10731b) {
            a.mo11875a(fArr);
        }
        for (C3014f a2 : this.f10741l) {
            a2.mo11875a(fArr);
        }
    }
}
