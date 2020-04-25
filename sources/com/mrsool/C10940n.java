package com.mrsool;

import android.content.Context;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewpager.widget.C2024a;

/* renamed from: com.mrsool.n */
/* compiled from: IntroImageAdapter */
public class C10940n extends C2024a {

    /* renamed from: k */
    static final /* synthetic */ boolean f30118k = false;

    /* renamed from: e */
    private LayoutInflater f30119e;

    /* renamed from: f */
    private Context f30120f;

    /* renamed from: g */
    private String[] f30121g;

    /* renamed from: h */
    private String[] f30122h;

    /* renamed from: i */
    private int[] f30123i;

    /* renamed from: j */
    private C10941a f30124j;

    /* renamed from: com.mrsool.n$a */
    /* compiled from: IntroImageAdapter */
    public interface C10941a {
        /* renamed from: a */
        void mo36583a();
    }

    public C10940n(Context context, String[] strArr, int[] iArr, String[] strArr2) {
        this.f30120f = context;
        this.f30121g = strArr;
        this.f30123i = iArr;
        this.f30122h = strArr2;
        this.f30119e = LayoutInflater.from(context);
    }

    /* renamed from: a */
    public void mo6381a(Parcelable parcelable, ClassLoader classLoader) {
    }

    /* renamed from: a */
    public void mo38563a(C10941a aVar) {
        this.f30124j = aVar;
    }

    /* renamed from: c */
    public Parcelable mo6387c() {
        return null;
    }

    /* renamed from: d */
    public C10941a mo38564d() {
        return this.f30124j;
    }

    /* renamed from: a */
    public void mo6383a(ViewGroup viewGroup, int i, Object obj) {
        viewGroup.removeView((View) obj);
    }

    /* renamed from: a */
    public int mo8886a() {
        return this.f30123i.length;
    }

    /* renamed from: a */
    public Object mo6380a(ViewGroup viewGroup, int i) {
        View inflate = this.f30119e.inflate(C10232R.layout.content_introduction, viewGroup, false);
        TextView textView = (TextView) inflate.findViewById(C10232R.C10236id.tvTitle);
        TextView textView2 = (TextView) inflate.findViewById(C10232R.C10236id.tvDesc);
        LinearLayout linearLayout = (LinearLayout) inflate.findViewById(C10232R.C10236id.llPlay);
        ((ImageView) inflate.findViewById(C10232R.C10236id.ivImage)).setImageResource(this.f30123i[i]);
        StringBuilder sb = new StringBuilder();
        String str = "";
        sb.append(str);
        sb.append(this.f30121g[i]);
        textView.setText(sb.toString());
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(this.f30122h[i]);
        textView2.setText(sb2.toString());
        viewGroup.addView(inflate, 0);
        return inflate;
    }

    /* renamed from: a */
    public boolean mo6384a(View view, Object obj) {
        return view.equals(obj);
    }
}
