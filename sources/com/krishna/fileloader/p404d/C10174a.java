package com.krishna.fileloader.p404d;

import android.content.Context;
import androidx.annotation.C0193h0;
import com.krishna.fileloader.C10171b;
import com.krishna.fileloader.C10171b.C5875b;
import com.krishna.fileloader.p194h.C10182a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.krishna.fileloader.d.a */
/* compiled from: FileDeleteBuilder */
public class C10174a {

    /* renamed from: a */
    private ArrayList<String> f27125a;

    /* renamed from: b */
    private String f27126b = C10171b.f27108j;

    /* renamed from: c */
    private int f27127c = 2;

    /* renamed from: d */
    private Context f27128d;

    /* renamed from: e */
    private C10171b f27129e;

    public C10174a(Context context) {
        this.f27128d = context.getApplicationContext();
    }

    /* renamed from: a */
    public C10174a mo36424a(String str, @C5875b int i) {
        this.f27126b = str;
        this.f27127c = i;
        return this;
    }

    /* renamed from: b */
    public int mo36425b(String... strArr) throws Exception {
        this.f27125a = new ArrayList<>();
        this.f27125a.addAll(Arrays.asList(strArr));
        this.f27129e = m47275b();
        return this.f27129e.mo36407c();
    }

    /* renamed from: a */
    public int mo36421a(ArrayList<String> arrayList) throws Exception {
        return mo36425b((String[]) arrayList.toArray());
    }

    /* renamed from: a */
    public int mo36420a() throws Exception {
        this.f27129e = m47275b();
        return this.f27129e.mo36403a();
    }

    @C0193h0
    /* renamed from: b */
    private C10171b m47275b() {
        C10182a aVar = new C10182a(this.f27125a, this.f27126b, this.f27127c);
        C10171b bVar = new C10171b(this.f27128d);
        bVar.mo36404a(aVar);
        return bVar;
    }

    /* renamed from: a */
    public int mo36423a(String... strArr) throws Exception {
        this.f27125a = new ArrayList<>();
        for (String add : strArr) {
            this.f27125a.add(add);
        }
        this.f27129e = m47275b();
        return this.f27129e.mo36406b();
    }

    /* renamed from: a */
    public int mo36422a(List<String> list) throws Exception {
        return mo36423a((String[]) list.toArray());
    }
}
