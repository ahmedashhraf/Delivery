package com.mrsool.stores;

import android.content.Context;
import android.text.TextUtils;
import com.google.gson.C8775f;
import com.google.gson.p324y.C8928a;
import com.mrsool.utils.C5881v;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.mrsool.stores.e */
/* compiled from: SearchHistoryHelper */
public class C11535e {

    /* renamed from: a */
    private C5881v f32631a;

    /* renamed from: b */
    private String f32632b = "currentShopHistory";

    /* renamed from: c */
    private String f32633c = "currentLocationHistory";

    /* renamed from: d */
    private int f32634d = 5;

    /* renamed from: com.mrsool.stores.e$a */
    /* compiled from: SearchHistoryHelper */
    class C11536a extends C8928a<List<String>> {
        C11536a() {
        }
    }

    public C11535e(Context context) {
        this.f32631a = new C5881v(context);
    }

    /* renamed from: b */
    private List<String> m51998b(String str, boolean z) {
        List<String> b = mo39675b(z);
        for (int i = 0; i < b.size(); i++) {
            if (str.equalsIgnoreCase((String) b.get(i))) {
                b.remove(i);
            }
        }
        int size = b.size();
        int i2 = this.f32634d;
        if (size > i2 - 1) {
            b.remove(i2 - 1);
        }
        b.add(0, str);
        return b;
    }

    /* renamed from: a */
    public void mo39673a(String str, boolean z) {
        if (!TextUtils.isEmpty(str)) {
            this.f32631a.mo23449a(z ? this.f32632b : this.f32633c, new C8775f().mo32317a((Object) m51998b(str, z)));
        }
    }

    /* renamed from: a */
    public void mo39674a(boolean z) {
        this.f32631a.mo23449a(z ? this.f32632b : this.f32633c, "");
    }

    /* renamed from: a */
    public C5881v mo39671a() {
        return this.f32631a;
    }

    /* renamed from: a */
    public void mo39672a(C5881v vVar) {
        this.f32631a = vVar;
    }

    /* renamed from: b */
    public List<String> mo39675b(boolean z) {
        List<String> list = (List) new C8775f().mo32315a(mo39671a().mo23459f(z ? this.f32632b : this.f32633c), new C11536a().mo32664b());
        return list == null ? new ArrayList() : list;
    }
}
