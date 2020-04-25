package com.krishna.fileloader.p404d;

import android.content.Context;
import android.graphics.Bitmap;
import com.krishna.fileloader.C10171b;
import com.krishna.fileloader.C10171b.C5875b;
import com.krishna.fileloader.p194h.C10183b;
import com.krishna.fileloader.p194h.C10183b.C5876a;
import com.krishna.fileloader.p405e.C10177a;
import com.krishna.fileloader.p407g.C10181b;
import java.io.File;

/* renamed from: com.krishna.fileloader.d.b */
/* compiled from: FileLoaderBuilder */
public class C10175b {

    /* renamed from: a */
    private Context f27130a;

    /* renamed from: b */
    private String f27131b;

    /* renamed from: c */
    private String f27132c;

    /* renamed from: d */
    private String f27133d = C10171b.f27108j;

    /* renamed from: e */
    private int f27134e = 2;

    /* renamed from: f */
    private String f27135f = "";

    /* renamed from: g */
    private C10177a f27136g;
    @C5876a

    /* renamed from: h */
    private int f27137h;

    /* renamed from: i */
    private Class f27138i;

    /* renamed from: j */
    private C10171b f27139j;

    /* renamed from: k */
    private boolean f27140k;

    /* renamed from: l */
    private boolean f27141l;

    /* renamed from: m */
    private boolean f27142m;

    public C10175b(Context context) {
        this.f27130a = context;
    }

    /* renamed from: a */
    public C10175b mo36426a(String str) {
        this.f27131b = str;
        return this;
    }

    /* renamed from: b */
    public C10175b mo36434b(String str) {
        this.f27132c = str;
        return this;
    }

    /* renamed from: c */
    public C10181b mo36437c() throws Exception {
        this.f27137h = 4;
        m47282d();
        return this.f27139j.mo36410f();
    }

    /* renamed from: d */
    public void mo36439d(C10177a<String> aVar) {
        this.f27137h = 4;
        this.f27136g = aVar;
        m47282d();
        this.f27139j.mo36411g();
    }

    /* renamed from: a */
    public C10175b mo36428a(String str, boolean z) {
        this.f27140k = z;
        return mo36426a(str);
    }

    /* renamed from: b */
    public C10181b mo36435b() throws Exception {
        this.f27137h = 1;
        m47282d();
        return this.f27139j.mo36410f();
    }

    /* renamed from: a */
    public C10175b mo36429a(String str, boolean z, String str2) {
        this.f27140k = z;
        this.f27132c = str2;
        return mo36426a(str);
    }

    /* renamed from: c */
    public void mo36438c(C10177a<? extends Object> aVar) {
        this.f27137h = 3;
        this.f27136g = aVar;
        m47282d();
        this.f27139j.mo36411g();
    }

    /* renamed from: d */
    private void m47282d() {
        this.f27139j = new C10171b(this.f27130a);
        C10183b bVar = new C10183b(this.f27131b, this.f27133d, this.f27134e, this.f27137h, this.f27138i, this.f27135f, this.f27140k, this.f27141l, this.f27142m, this.f27136g);
        bVar.mo36483c(this.f27132c);
        this.f27139j.mo36405a(bVar);
    }

    /* renamed from: b */
    public void mo36436b(C10177a<File> aVar) {
        this.f27137h = 1;
        this.f27136g = aVar;
        m47282d();
        this.f27139j.mo36411g();
    }

    public C10175b(Context context, boolean z) {
        this.f27130a = context;
        this.f27141l = z;
    }

    /* renamed from: a */
    public C10175b mo36427a(String str, @C5875b int i) {
        this.f27133d = str;
        this.f27134e = i;
        return this;
    }

    /* renamed from: a */
    public C10175b mo36430a(boolean z) {
        this.f27142m = z;
        return this;
    }

    /* renamed from: a */
    public C10181b mo36431a() throws Exception {
        this.f27137h = 2;
        m47282d();
        return this.f27139j.mo36410f();
    }

    /* renamed from: a */
    public void mo36433a(C10177a<Bitmap> aVar) {
        this.f27137h = 2;
        this.f27136g = aVar;
        m47282d();
        this.f27139j.mo36411g();
    }

    /* renamed from: a */
    public C10181b mo36432a(Class cls) throws Exception {
        this.f27137h = 3;
        this.f27138i = cls;
        m47282d();
        return this.f27139j.mo36410f();
    }
}
