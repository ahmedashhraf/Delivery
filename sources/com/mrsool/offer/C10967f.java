package com.mrsool.offer;

import android.content.Context;
import android.os.Parcelable;
import android.text.method.ScrollingMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.viewpager.widget.C2024a;
import com.mrsool.C10232R;
import com.mrsool.newBean.WalkThroughStepBean;
import java.util.ArrayList;
import p076c.p082c.p083a.C2232l;

/* renamed from: com.mrsool.offer.f */
/* compiled from: PriceWalkThroughAdapter */
public class C10967f extends C2024a {

    /* renamed from: j */
    static final /* synthetic */ boolean f30235j = false;

    /* renamed from: e */
    private LayoutInflater f30236e;

    /* renamed from: f */
    private Context f30237f;

    /* renamed from: g */
    private C10968a f30238g;

    /* renamed from: h */
    private ArrayList<WalkThroughStepBean> f30239h;

    /* renamed from: i */
    private boolean f30240i;

    /* renamed from: com.mrsool.offer.f$a */
    /* compiled from: PriceWalkThroughAdapter */
    public interface C10968a {
        /* renamed from: a */
        void mo38734a();
    }

    public C10967f(Context context, ArrayList<WalkThroughStepBean> arrayList, boolean z) {
        this.f30237f = context;
        this.f30239h = arrayList;
        this.f30236e = LayoutInflater.from(context);
        this.f30240i = z;
    }

    /* renamed from: a */
    public void mo6381a(Parcelable parcelable, ClassLoader classLoader) {
    }

    /* renamed from: a */
    public void mo38732a(C10968a aVar) {
        this.f30238g = aVar;
    }

    /* renamed from: c */
    public Parcelable mo6387c() {
        return null;
    }

    /* renamed from: d */
    public C10968a mo38733d() {
        return this.f30238g;
    }

    /* renamed from: a */
    public void mo6383a(ViewGroup viewGroup, int i, Object obj) {
        viewGroup.removeView((View) obj);
    }

    /* renamed from: a */
    public int mo8886a() {
        ArrayList<WalkThroughStepBean> arrayList = this.f30239h;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    /* renamed from: a */
    public Object mo6380a(ViewGroup viewGroup, int i) {
        View inflate = this.f30236e.inflate(C10232R.layout.content_offer_price, viewGroup, false);
        ImageView imageView = (ImageView) inflate.findViewById(C10232R.C10236id.ivImage);
        TextView textView = (TextView) inflate.findViewById(C10232R.C10236id.tvTitle);
        TextView textView2 = (TextView) inflate.findViewById(C10232R.C10236id.tvDesc);
        textView2.setMovementMethod(new ScrollingMovementMethod());
        textView.setText(((WalkThroughStepBean) this.f30239h.get(i)).getTitle());
        textView2.setText(((WalkThroughStepBean) this.f30239h.get(i)).getDescription());
        C2232l.m11649c(this.f30237f).mo9515a(((WalkThroughStepBean) this.f30239h.get(i)).getImageUrl()).m11500e((int) C10232R.C10235drawable.ic_price_walkthrough_place_holder).mo9424a(imageView);
        viewGroup.addView(inflate, 0);
        return inflate;
    }

    /* renamed from: a */
    public boolean mo6384a(View view, Object obj) {
        return view.equals(obj);
    }
}
