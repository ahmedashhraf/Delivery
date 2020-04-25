package com.krishna.fileloader;

import android.content.Context;
import android.os.AsyncTask;
import android.text.TextUtils;
import androidx.annotation.C0193h0;
import com.krishna.fileloader.p194h.C10182a;
import com.krishna.fileloader.p194h.C10183b;
import com.krishna.fileloader.p404d.C10174a;
import com.krishna.fileloader.p404d.C10175b;
import com.krishna.fileloader.p404d.C10176c;
import com.krishna.fileloader.p405e.C10177a;
import com.krishna.fileloader.p406f.C10179a;
import com.krishna.fileloader.p407g.C10180a;
import com.krishna.fileloader.p407g.C10181b;
import com.krishna.fileloader.p408i.C10185a;
import com.krishna.fileloader.p408i.C10188d;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

/* renamed from: com.krishna.fileloader.b */
/* compiled from: FileLoader */
public class C10171b {

    /* renamed from: d */
    private static final String f27102d = "FileLoader";

    /* renamed from: e */
    public static final int f27103e = 1;

    /* renamed from: f */
    public static final int f27104f = 2;

    /* renamed from: g */
    public static final int f27105g = 3;

    /* renamed from: h */
    public static final int f27106h = 4;

    /* renamed from: i */
    public static final int f27107i = 2;

    /* renamed from: j */
    public static final String f27108j = "file_loader";

    /* renamed from: k */
    public static String f27109k;

    /* renamed from: l */
    private static Map<C10183b, Boolean> f27110l = new WeakHashMap();

    /* renamed from: m */
    private static Set<C10183b> f27111m = Collections.newSetFromMap(f27110l);

    /* renamed from: n */
    private static Map<C10183b, List<C10177a>> f27112n = new WeakHashMap();
    /* access modifiers changed from: private */

    /* renamed from: o */
    public static Map<C10183b, C10181b> f27113o = new WeakHashMap();

    /* renamed from: p */
    private static final Object f27114p = new Object();

    /* renamed from: q */
    private static final Object f27115q = new Object();
    /* access modifiers changed from: private */

    /* renamed from: a */
    public Context f27116a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public C10183b f27117b;

    /* renamed from: c */
    private C10182a f27118c;

    /* renamed from: com.krishna.fileloader.b$b */
    /* compiled from: FileLoader */
    public @interface C5875b {
    }

    /* renamed from: com.krishna.fileloader.b$a */
    /* compiled from: FileLoader */
    class C10172a extends AsyncTask<Void, Void, C10180a> {
        C10172a() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public C10180a doInBackground(Void... voidArr) {
            C10180a aVar = new C10180a();
            try {
                File b = !C10171b.this.f27117b.mo36495k() ? C10185a.m47372b(C10171b.this.f27116a, C10171b.this.f27117b.mo36491h(), C10171b.this.f27117b.mo36472a(), C10171b.this.f27117b.mo36478b(), C10171b.this.f27117b.mo36485d()) : null;
                if (b == null || !b.exists()) {
                    b = new C10179a(C10171b.this.f27116a, C10171b.this.f27117b.mo36491h(), C10171b.this.f27117b.mo36472a(), C10171b.this.f27117b.mo36478b()).mo36453a(C10171b.this.f27117b.mo36493i(), C10171b.this.f27117b.mo36494j(), C10171b.this.f27117b.mo36485d());
                }
                aVar.mo36455a(b);
            } catch (Exception e) {
                StringBuilder sb = new StringBuilder();
                sb.append("doInBackground: ");
                sb.append(e.getMessage());
                sb.toString();
                aVar.mo36456a(e);
            }
            return aVar;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void onPostExecute(C10180a aVar) {
            super.onPostExecute(aVar);
            if (C10171b.this.f27117b.mo36490g() != null) {
                File a = aVar.mo36454a();
                if (a == null || aVar.mo36457b() != null) {
                    C10171b.this.m47252a((Throwable) aVar.mo36457b());
                } else {
                    C10181b a2 = C10171b.this.m47247a(a);
                    C10171b.f27113o.put(C10171b.this.f27117b, a2);
                    C10171b.this.m47251a(a2);
                }
            }
        }
    }

    public C10171b(Context context) {
        this.f27116a = context.getApplicationContext();
    }

    /* renamed from: c */
    public static C10175b m47256c(Context context) {
        return new C10175b(context);
    }

    /* renamed from: i */
    private void m47258i() {
        if (f27112n.containsKey(this.f27117b)) {
            synchronized (f27115q) {
                ((List) f27112n.get(this.f27117b)).add(this.f27117b.mo36490g());
            }
            return;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.f27117b.mo36490g());
        f27112n.put(this.f27117b, arrayList);
    }

    @C0193h0
    /* renamed from: j */
    private AsyncTask<Void, Void, C10180a> m47259j() {
        return new C10172a();
    }

    /* renamed from: k */
    private void m47260k() throws Exception {
        if (TextUtils.isEmpty(this.f27117b.mo36472a())) {
            throw new NullPointerException("Directory name should not be null or empty");
        } else if (TextUtils.isEmpty(this.f27117b.mo36491h())) {
            throw new NullPointerException("File uri should not be null or empty");
        } else if (this.f27117b.mo36482c() == null) {
            throw new NullPointerException("File extension should not be null");
        }
    }

    /* renamed from: d */
    public C10182a mo36408d() {
        return this.f27118c;
    }

    /* renamed from: e */
    public C10183b mo36409e() {
        return this.f27117b;
    }

    /* renamed from: f */
    public C10181b mo36410f() throws Exception {
        m47260k();
        C10180a aVar = (C10180a) m47259j().executeOnExecutor(C10188d.m47382a(), new Void[0]).get();
        if (aVar.mo36454a() != null) {
            return m47247a(aVar.mo36454a());
        }
        throw aVar.mo36457b();
    }

    /* renamed from: g */
    public void mo36411g() {
        m47258i();
        try {
            m47260k();
            if (this.f27117b.mo36490g() != null) {
                if (!f27111m.contains(this.f27117b)) {
                    synchronized (f27114p) {
                        f27111m.add(this.f27117b);
                    }
                    m47259j().executeOnExecutor(C10188d.m47382a(), new Void[0]);
                } else if (f27113o.get(this.f27117b) != null) {
                    m47251a((C10181b) f27113o.get(this.f27117b));
                }
                return;
            }
            throw new NullPointerException("File Request listener should not be null");
        } catch (Exception e) {
            m47252a((Throwable) e);
        }
    }

    /* renamed from: b */
    public static C10175b m47254b(Context context, boolean z) {
        return new C10175b(context, z);
    }

    /* renamed from: c */
    public int mo36407c() throws Exception {
        Iterator it = this.f27118c.mo36471c().iterator();
        int i = 0;
        while (it.hasNext()) {
            File b = C10185a.m47371b(this.f27116a, (String) it.next(), this.f27118c.mo36466a(), this.f27118c.mo36470b());
            if (b.exists()) {
                b.delete();
                i++;
            }
        }
        return i;
    }

    /* renamed from: b */
    public static C10176c m47255b(Context context) {
        return new C10176c(context);
    }

    /* renamed from: b */
    public int mo36406b() throws Exception {
        String[] list;
        File a = C10185a.m47366a(this.f27116a, this.f27118c.mo36466a(), this.f27118c.mo36470b());
        HashSet hashSet = new HashSet();
        Iterator it = this.f27118c.mo36471c().iterator();
        while (it.hasNext()) {
            try {
                hashSet.add(C10185a.m47374b((String) it.next()));
            } catch (Exception unused) {
            }
        }
        int i = 0;
        for (String str : a.list()) {
            if (!hashSet.contains(str)) {
                new File(a, str).delete();
                i++;
            }
        }
        return i;
    }

    /* renamed from: a */
    public static C10175b m47244a(Context context, String str) {
        return new C10175b(context);
    }

    /* renamed from: a */
    public static C10174a m47243a(Context context) {
        return new C10174a(context);
    }

    /* renamed from: a */
    public static C10176c m47245a(Context context, boolean z) {
        return new C10176c(context, z);
    }

    /* renamed from: a */
    public int mo36403a() throws Exception {
        File a = C10185a.m47366a(this.f27116a, this.f27118c.mo36466a(), this.f27118c.mo36470b());
        int i = 0;
        for (File delete : a.listFiles()) {
            delete.delete();
            i++;
        }
        a.delete();
        return i;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m47252a(Throwable th) {
        if (!f27112n.isEmpty()) {
            synchronized (f27115q) {
                List list = (List) f27112n.get(this.f27117b);
                if (list != null) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        try {
                            C10177a aVar = (C10177a) it.next();
                            it.remove();
                            aVar.mo36449a(this.f27117b, th);
                        } catch (Exception unused) {
                        }
                    }
                    f27112n.remove(this.f27117b);
                }
            }
            synchronized (f27114p) {
                f27111m.remove(this.f27117b);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public C10181b m47247a(File file) {
        C10181b bVar;
        if (this.f27117b.mo36487e() == 2) {
            bVar = new C10181b(200, C10185a.m47364a(file), file.length());
        } else if (this.f27117b.mo36487e() == 4) {
            bVar = new C10181b(200, C10185a.m47373b(file), file.length());
        } else if (this.f27117b.mo36487e() == 3) {
            bVar = new C10181b(200, C10188d.m47386c(file, this.f27117b.mo36489f()), file.length());
        } else {
            bVar = new C10181b(200, file, file.length());
        }
        bVar.mo36461a(file);
        return bVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m47251a(C10181b bVar) {
        if (!f27112n.isEmpty()) {
            synchronized (f27115q) {
                List list = (List) f27112n.get(this.f27117b);
                if (list != null) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        try {
                            C10177a aVar = (C10177a) it.next();
                            it.remove();
                            aVar.mo36448a(this.f27117b, bVar);
                        } catch (Exception e) {
                            m47252a((Throwable) e);
                        }
                    }
                    f27112n.remove(this.f27117b);
                }
            }
            synchronized (f27114p) {
                f27111m.remove(this.f27117b);
                f27113o.remove(this.f27117b);
            }
        }
    }

    /* renamed from: a */
    public void mo36405a(C10183b bVar) {
        this.f27117b = bVar;
    }

    /* renamed from: a */
    public void mo36404a(C10182a aVar) {
        this.f27118c = aVar;
    }
}
