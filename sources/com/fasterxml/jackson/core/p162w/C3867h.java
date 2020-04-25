package com.fasterxml.jackson.core.p162w;

import com.fasterxml.jackson.core.C3794h;
import com.fasterxml.jackson.core.C3799j;
import com.fasterxml.jackson.core.JsonParseException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.fasterxml.jackson.core.w.h */
/* compiled from: JsonParserSequence */
public class C3867h extends C3866g {

    /* renamed from: R */
    protected final C3794h[] f12246R;

    /* renamed from: S */
    protected int f12247S = 1;

    protected C3867h(C3794h[] hVarArr) {
        super(hVarArr[0]);
        this.f12246R = hVarArr;
    }

    /* renamed from: a */
    public static C3867h m16883a(C3794h hVar, C3794h hVar2) {
        boolean z = hVar instanceof C3867h;
        if (z || (hVar2 instanceof C3867h)) {
            ArrayList arrayList = new ArrayList();
            if (z) {
                ((C3867h) hVar).mo17109a(arrayList);
            } else {
                arrayList.add(hVar);
            }
            if (hVar2 instanceof C3867h) {
                ((C3867h) hVar2).mo17109a(arrayList);
            } else {
                arrayList.add(hVar2);
            }
            return new C3867h((C3794h[]) arrayList.toArray(new C3794h[arrayList.size()]));
        }
        return new C3867h(new C3794h[]{hVar, hVar2});
    }

    public void close() throws IOException {
        do {
            this.f12245Q.close();
        } while (mo17111p0());
    }

    /* renamed from: j0 */
    public C3799j mo16728j0() throws IOException, JsonParseException {
        C3799j j0 = this.f12245Q.mo16728j0();
        if (j0 != null) {
            return j0;
        }
        while (mo17111p0()) {
            C3799j j02 = this.f12245Q.mo16728j0();
            if (j02 != null) {
                return j02;
            }
        }
        return null;
    }

    /* renamed from: o0 */
    public int mo17110o0() {
        return this.f12246R.length;
    }

    /* access modifiers changed from: protected */
    /* renamed from: p0 */
    public boolean mo17111p0() {
        int i = this.f12247S;
        C3794h[] hVarArr = this.f12246R;
        if (i >= hVarArr.length) {
            return false;
        }
        this.f12247S = i + 1;
        this.f12245Q = hVarArr[i];
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo17109a(List<C3794h> list) {
        int length = this.f12246R.length;
        for (int i = this.f12247S - 1; i < length; i++) {
            C3794h hVar = this.f12246R[i];
            if (hVar instanceof C3867h) {
                ((C3867h) hVar).mo17109a(list);
            } else {
                list.add(hVar);
            }
        }
    }
}
