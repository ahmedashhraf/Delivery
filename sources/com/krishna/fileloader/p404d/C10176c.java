package com.krishna.fileloader.p404d;

import android.content.Context;
import com.krishna.fileloader.C10171b;
import com.krishna.fileloader.C10171b.C5875b;
import com.krishna.fileloader.C10173c;
import com.krishna.fileloader.p194h.C10184c;
import com.krishna.fileloader.p405e.C10178b;
import com.krishna.fileloader.p408i.C10188d;
import java.util.List;

/* renamed from: com.krishna.fileloader.d.c */
/* compiled from: MultiFileDownloader */
public class C10176c {

    /* renamed from: a */
    private Context f27143a;

    /* renamed from: b */
    private String f27144b = C10171b.f27108j;

    /* renamed from: c */
    private int f27145c = 2;

    /* renamed from: d */
    private C10178b f27146d;

    /* renamed from: e */
    private boolean f27147e;

    /* renamed from: f */
    private boolean f27148f;

    /* renamed from: g */
    private boolean f27149g;

    /* renamed from: h */
    private C10173c f27150h;

    public C10176c(Context context) {
        this.f27143a = context;
    }

    /* renamed from: a */
    public C10176c mo36441a(String str, @C5875b int i) {
        this.f27144b = str;
        this.f27145c = i;
        return this;
    }

    /* renamed from: a */
    public C10176c mo36440a(C10178b bVar) {
        this.f27146d = bVar;
        return this;
    }

    /* renamed from: a */
    public C10176c mo36442a(boolean z) {
        this.f27149g = z;
        return this;
    }

    public C10176c(Context context, boolean z) {
        this.f27143a = context;
        this.f27148f = z;
    }

    /* renamed from: a */
    public void mo36447a(String... strArr) {
        C10184c[] cVarArr = new C10184c[strArr.length];
        for (int i = 0; i < strArr.length; i++) {
            C10184c cVar = new C10184c(strArr[i], this.f27144b, this.f27145c, this.f27147e);
            cVar.mo36499a(this.f27148f);
            cVar.mo36502b(this.f27149g);
            cVarArr[i] = cVar;
        }
        this.f27150h = new C10173c(this.f27143a, this.f27146d);
        this.f27150h.executeOnExecutor(C10188d.m47382a(), cVarArr);
    }

    /* renamed from: a */
    public void mo36446a(boolean z, String... strArr) {
        this.f27147e = z;
        mo36447a(strArr);
    }

    /* renamed from: a */
    public void mo36445a(boolean z, List<C10184c> list) {
        this.f27147e = z;
        C10184c[] cVarArr = new C10184c[list.size()];
        for (int i = 0; i < list.size(); i++) {
            cVarArr[i] = (C10184c) list.get(i);
            cVarArr[i].mo36499a(this.f27148f);
            cVarArr[i].mo36502b(this.f27149g);
        }
        this.f27150h = new C10173c(this.f27143a, this.f27146d);
        this.f27150h.executeOnExecutor(C10188d.m47382a(), cVarArr);
    }

    /* renamed from: a */
    public void mo36444a(List<C10184c> list) {
        mo36445a(false, list);
    }

    /* renamed from: a */
    public void mo36443a() {
        C10173c cVar = this.f27150h;
        if (cVar != null) {
            cVar.cancel(true);
        }
    }
}
