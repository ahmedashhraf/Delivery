package com.instabug.featuresrequest.p373ui.p375b.p376a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.instabug.featuresrequest.C9525R;
import com.instabug.featuresrequest.p368a.C9532a;
import p205i.p471b.p472a.p473a.p474c.C13938g;

/* renamed from: com.instabug.featuresrequest.ui.b.a.a */
/* compiled from: FeatureAdapter */
public class C9596a extends BaseAdapter {

    /* renamed from: N */
    private static transient /* synthetic */ boolean[] f25392N;

    /* renamed from: a */
    private C9606e f25393a;

    /* renamed from: b */
    private C9532a f25394b;

    /* renamed from: com.instabug.featuresrequest.ui.b.a.a$a */
    /* compiled from: FeatureAdapter */
    class C9597a implements OnClickListener {

        /* renamed from: N */
        private static transient /* synthetic */ boolean[] f25395N;

        /* renamed from: a */
        final /* synthetic */ int f25396a;

        /* renamed from: b */
        final /* synthetic */ C9596a f25397b;

        C9597a(C9596a aVar, int i) {
            boolean[] a = m44877a();
            this.f25397b = aVar;
            this.f25396a = i;
            a[0] = true;
        }

        /* renamed from: a */
        private static /* synthetic */ boolean[] m44877a() {
            boolean[] zArr = f25395N;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(-7627532237064434506L, "com/instabug/featuresrequest/ui/base/featureslist/FeatureAdapter$1", 2);
            f25395N = a;
            return a;
        }

        public void onClick(View view) {
            boolean[] a = m44877a();
            C9596a.m44875a(this.f25397b).mo34215b(this.f25396a);
            a[1] = true;
        }
    }

    C9596a(C9606e eVar, C9532a aVar) {
        boolean[] a = m44876a();
        this.f25393a = eVar;
        this.f25394b = aVar;
        a[0] = true;
    }

    /* renamed from: a */
    static /* synthetic */ C9532a m44875a(C9596a aVar) {
        boolean[] a = m44876a();
        C9532a aVar2 = aVar.f25394b;
        a[12] = true;
        return aVar2;
    }

    /* renamed from: a */
    private static /* synthetic */ boolean[] m44876a() {
        boolean[] zArr = f25392N;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(-8019344575175889072L, "com/instabug/featuresrequest/ui/base/featureslist/FeatureAdapter", 13);
        f25392N = a;
        return a;
    }

    public int getCount() {
        boolean[] a = m44876a();
        int g = this.f25393a.mo34411g();
        a[1] = true;
        return g;
    }

    public Object getItem(int i) {
        boolean[] a = m44876a();
        Integer valueOf = Integer.valueOf(i);
        a[2] = true;
        return valueOf;
    }

    public long getItemId(int i) {
        long j = (long) i;
        m44876a()[3] = true;
        return j;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        C9598b bVar;
        boolean[] a = m44876a();
        if (view == null) {
            a[4] = true;
            LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
            int i2 = C9525R.layout.ib_fr_feature_request_item;
            a[5] = true;
            view = from.inflate(i2, viewGroup, false);
            a[6] = true;
            bVar = new C9598b(view, this.f25394b);
            a[7] = true;
            view.setTag(bVar);
            a[8] = true;
        } else {
            bVar = (C9598b) view.getTag();
            a[9] = true;
        }
        this.f25393a.mo34401a(i, bVar);
        a[10] = true;
        view.setOnClickListener(new C9597a(this, i));
        a[11] = true;
        return view;
    }
}
