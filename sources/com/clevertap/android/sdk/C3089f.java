package com.clevertap.android.sdk;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.LinearLayout.LayoutParams;
import androidx.annotation.C0193h0;
import androidx.viewpager.widget.C2024a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* renamed from: com.clevertap.android.sdk.f */
/* compiled from: CTCarouselViewPagerAdapter */
public class C3089f extends C2024a {

    /* renamed from: e */
    private Context f11079e;

    /* renamed from: f */
    private LayoutInflater f11080f;

    /* renamed from: g */
    private ArrayList<String> f11081g;

    /* renamed from: h */
    private View f11082h;

    /* renamed from: i */
    private LayoutParams f11083i;

    /* renamed from: j */
    private CTInboxMessage f11084j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public int f11085k;

    /* renamed from: l */
    private WeakReference<C3100g0> f11086l;

    /* renamed from: com.clevertap.android.sdk.f$a */
    /* compiled from: CTCarouselViewPagerAdapter */
    class C3090a implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ int f11087a;

        C3090a(int i) {
            this.f11087a = i;
        }

        public void onClick(View view) {
            C3100g0 d = C3089f.this.mo12248d();
            if (d != null) {
                d.mo12266a(C3089f.this.f11085k, this.f11087a);
            }
        }
    }

    /* renamed from: com.clevertap.android.sdk.f$b */
    /* compiled from: CTCarouselViewPagerAdapter */
    class C3091b implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ int f11089a;

        C3091b(int i) {
            this.f11089a = i;
        }

        public void onClick(View view) {
            C3100g0 d = C3089f.this.mo12248d();
            if (d != null) {
                d.mo12266a(C3089f.this.f11085k, this.f11089a);
            }
        }
    }

    C3089f(Context context, C3100g0 g0Var, CTInboxMessage cTInboxMessage, LayoutParams layoutParams, int i) {
        this.f11079e = context;
        this.f11086l = new WeakReference<>(g0Var);
        this.f11081g = cTInboxMessage.mo12016j();
        this.f11083i = layoutParams;
        this.f11084j = cTInboxMessage;
        this.f11085k = i;
    }

    /* renamed from: a */
    public boolean mo6384a(@C0193h0 View view, @C0193h0 Object obj) {
        return view == obj;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public C3100g0 mo12248d() {
        return (C3100g0) this.f11086l.get();
    }

    /* renamed from: a */
    public int mo8886a() {
        return this.f11081g.size();
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:14|15|16|17|18|19) */
    /* JADX WARNING: Can't wrap try/catch for region: R(9:5|6|7|8|9|10|11|22|23) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x00ec */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x006d */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:17:0x00ec=Splitter:B:17:0x00ec, B:9:0x006d=Splitter:B:9:0x006d} */
    @androidx.annotation.C0193h0
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object mo6380a(@androidx.annotation.C0193h0 android.view.ViewGroup r7, int r8) {
        /*
            r6 = this;
            android.content.Context r0 = r6.f11079e
            java.lang.String r1 = "layout_inflater"
            java.lang.Object r0 = r0.getSystemService(r1)
            android.view.LayoutInflater r0 = (android.view.LayoutInflater) r0
            r6.f11080f = r0
            android.view.LayoutInflater r0 = r6.f11080f
            int r1 = com.clevertap.android.sdk.C3058R.layout.inbox_carousel_image_layout
            r2 = 0
            android.view.View r0 = r0.inflate(r1, r7, r2)
            r6.f11082h = r0
            com.clevertap.android.sdk.CTInboxMessage r0 = r6.f11084j     // Catch:{ NoClassDefFoundError -> 0x0118 }
            java.lang.String r0 = r0.mo12024r()     // Catch:{ NoClassDefFoundError -> 0x0118 }
            java.lang.String r1 = "l"
            boolean r0 = r0.equalsIgnoreCase(r1)     // Catch:{ NoClassDefFoundError -> 0x0118 }
            java.lang.String r1 = "CleverTap SDK requires Glide v4.9.0 or above. Please refer CleverTap Documentation for more info"
            java.lang.String r3 = "ct_image"
            if (r0 == 0) goto L_0x009a
            android.view.View r0 = r6.f11082h     // Catch:{ NoClassDefFoundError -> 0x0118 }
            int r4 = com.clevertap.android.sdk.C3058R.C3061id.imageView     // Catch:{ NoClassDefFoundError -> 0x0118 }
            android.view.View r0 = r0.findViewById(r4)     // Catch:{ NoClassDefFoundError -> 0x0118 }
            android.widget.ImageView r0 = (android.widget.ImageView) r0     // Catch:{ NoClassDefFoundError -> 0x0118 }
            r0.setVisibility(r2)     // Catch:{ NoClassDefFoundError -> 0x0118 }
            android.content.Context r2 = r0.getContext()     // Catch:{ NoSuchMethodError -> 0x006d }
            c.c.a.q r2 = p076c.p082c.p083a.C2232l.m11649c(r2)     // Catch:{ NoSuchMethodError -> 0x006d }
            java.util.ArrayList<java.lang.String> r4 = r6.f11081g     // Catch:{ NoSuchMethodError -> 0x006d }
            java.lang.Object r4 = r4.get(r8)     // Catch:{ NoSuchMethodError -> 0x006d }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ NoSuchMethodError -> 0x006d }
            com.bumptech.glide.RequestBuilder r2 = r2.load(r4)     // Catch:{ NoSuchMethodError -> 0x006d }
            com.bumptech.glide.request.RequestOptions r4 = new com.bumptech.glide.request.RequestOptions     // Catch:{ NoSuchMethodError -> 0x006d }
            r4.<init>()     // Catch:{ NoSuchMethodError -> 0x006d }
            android.content.Context r5 = r6.f11079e     // Catch:{ NoSuchMethodError -> 0x006d }
            int r5 = com.clevertap.android.sdk.C3238w1.m15655a(r5, r3)     // Catch:{ NoSuchMethodError -> 0x006d }
            com.bumptech.glide.request.BaseRequestOptions r4 = r4.placeholder(r5)     // Catch:{ NoSuchMethodError -> 0x006d }
            com.bumptech.glide.request.RequestOptions r4 = (com.bumptech.glide.request.RequestOptions) r4     // Catch:{ NoSuchMethodError -> 0x006d }
            android.content.Context r5 = r6.f11079e     // Catch:{ NoSuchMethodError -> 0x006d }
            int r3 = com.clevertap.android.sdk.C3238w1.m15655a(r5, r3)     // Catch:{ NoSuchMethodError -> 0x006d }
            com.bumptech.glide.request.BaseRequestOptions r3 = r4.error(r3)     // Catch:{ NoSuchMethodError -> 0x006d }
            com.bumptech.glide.RequestBuilder r2 = r2.apply(r3)     // Catch:{ NoSuchMethodError -> 0x006d }
            r2.into(r0)     // Catch:{ NoSuchMethodError -> 0x006d }
            goto L_0x0087
        L_0x006d:
            com.clevertap.android.sdk.C3111h1.m14930d(r1)     // Catch:{ NoClassDefFoundError -> 0x0118 }
            android.content.Context r1 = r0.getContext()     // Catch:{ NoClassDefFoundError -> 0x0118 }
            c.c.a.q r1 = p076c.p082c.p083a.C2232l.m11649c(r1)     // Catch:{ NoClassDefFoundError -> 0x0118 }
            java.util.ArrayList<java.lang.String> r2 = r6.f11081g     // Catch:{ NoClassDefFoundError -> 0x0118 }
            java.lang.Object r2 = r2.get(r8)     // Catch:{ NoClassDefFoundError -> 0x0118 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ NoClassDefFoundError -> 0x0118 }
            com.bumptech.glide.RequestBuilder r1 = r1.load(r2)     // Catch:{ NoClassDefFoundError -> 0x0118 }
            r1.into(r0)     // Catch:{ NoClassDefFoundError -> 0x0118 }
        L_0x0087:
            android.view.View r0 = r6.f11082h     // Catch:{ NoClassDefFoundError -> 0x0118 }
            android.widget.LinearLayout$LayoutParams r1 = r6.f11083i     // Catch:{ NoClassDefFoundError -> 0x0118 }
            r7.addView(r0, r1)     // Catch:{ NoClassDefFoundError -> 0x0118 }
            android.view.View r7 = r6.f11082h     // Catch:{ NoClassDefFoundError -> 0x0118 }
            com.clevertap.android.sdk.f$a r0 = new com.clevertap.android.sdk.f$a     // Catch:{ NoClassDefFoundError -> 0x0118 }
            r0.<init>(r8)     // Catch:{ NoClassDefFoundError -> 0x0118 }
            r7.setOnClickListener(r0)     // Catch:{ NoClassDefFoundError -> 0x0118 }
            goto L_0x011d
        L_0x009a:
            com.clevertap.android.sdk.CTInboxMessage r0 = r6.f11084j     // Catch:{ NoClassDefFoundError -> 0x0118 }
            java.lang.String r0 = r0.mo12024r()     // Catch:{ NoClassDefFoundError -> 0x0118 }
            java.lang.String r4 = "p"
            boolean r0 = r0.equalsIgnoreCase(r4)     // Catch:{ NoClassDefFoundError -> 0x0118 }
            if (r0 == 0) goto L_0x011d
            android.view.View r0 = r6.f11082h     // Catch:{ NoClassDefFoundError -> 0x0118 }
            int r4 = com.clevertap.android.sdk.C3058R.C3061id.squareImageView     // Catch:{ NoClassDefFoundError -> 0x0118 }
            android.view.View r0 = r0.findViewById(r4)     // Catch:{ NoClassDefFoundError -> 0x0118 }
            android.widget.ImageView r0 = (android.widget.ImageView) r0     // Catch:{ NoClassDefFoundError -> 0x0118 }
            r0.setVisibility(r2)     // Catch:{ NoClassDefFoundError -> 0x0118 }
            android.content.Context r2 = r0.getContext()     // Catch:{ NoSuchMethodError -> 0x00ec }
            c.c.a.q r2 = p076c.p082c.p083a.C2232l.m11649c(r2)     // Catch:{ NoSuchMethodError -> 0x00ec }
            java.util.ArrayList<java.lang.String> r4 = r6.f11081g     // Catch:{ NoSuchMethodError -> 0x00ec }
            java.lang.Object r4 = r4.get(r8)     // Catch:{ NoSuchMethodError -> 0x00ec }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ NoSuchMethodError -> 0x00ec }
            com.bumptech.glide.RequestBuilder r2 = r2.load(r4)     // Catch:{ NoSuchMethodError -> 0x00ec }
            com.bumptech.glide.request.RequestOptions r4 = new com.bumptech.glide.request.RequestOptions     // Catch:{ NoSuchMethodError -> 0x00ec }
            r4.<init>()     // Catch:{ NoSuchMethodError -> 0x00ec }
            android.content.Context r5 = r6.f11079e     // Catch:{ NoSuchMethodError -> 0x00ec }
            int r5 = com.clevertap.android.sdk.C3238w1.m15655a(r5, r3)     // Catch:{ NoSuchMethodError -> 0x00ec }
            com.bumptech.glide.request.BaseRequestOptions r4 = r4.placeholder(r5)     // Catch:{ NoSuchMethodError -> 0x00ec }
            com.bumptech.glide.request.RequestOptions r4 = (com.bumptech.glide.request.RequestOptions) r4     // Catch:{ NoSuchMethodError -> 0x00ec }
            android.content.Context r5 = r6.f11079e     // Catch:{ NoSuchMethodError -> 0x00ec }
            int r3 = com.clevertap.android.sdk.C3238w1.m15655a(r5, r3)     // Catch:{ NoSuchMethodError -> 0x00ec }
            com.bumptech.glide.request.BaseRequestOptions r3 = r4.error(r3)     // Catch:{ NoSuchMethodError -> 0x00ec }
            com.bumptech.glide.RequestBuilder r2 = r2.apply(r3)     // Catch:{ NoSuchMethodError -> 0x00ec }
            r2.into(r0)     // Catch:{ NoSuchMethodError -> 0x00ec }
            goto L_0x0106
        L_0x00ec:
            com.clevertap.android.sdk.C3111h1.m14930d(r1)     // Catch:{ NoClassDefFoundError -> 0x0118 }
            android.content.Context r1 = r0.getContext()     // Catch:{ NoClassDefFoundError -> 0x0118 }
            c.c.a.q r1 = p076c.p082c.p083a.C2232l.m11649c(r1)     // Catch:{ NoClassDefFoundError -> 0x0118 }
            java.util.ArrayList<java.lang.String> r2 = r6.f11081g     // Catch:{ NoClassDefFoundError -> 0x0118 }
            java.lang.Object r2 = r2.get(r8)     // Catch:{ NoClassDefFoundError -> 0x0118 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ NoClassDefFoundError -> 0x0118 }
            com.bumptech.glide.RequestBuilder r1 = r1.load(r2)     // Catch:{ NoClassDefFoundError -> 0x0118 }
            r1.into(r0)     // Catch:{ NoClassDefFoundError -> 0x0118 }
        L_0x0106:
            android.view.View r0 = r6.f11082h     // Catch:{ NoClassDefFoundError -> 0x0118 }
            android.widget.LinearLayout$LayoutParams r1 = r6.f11083i     // Catch:{ NoClassDefFoundError -> 0x0118 }
            r7.addView(r0, r1)     // Catch:{ NoClassDefFoundError -> 0x0118 }
            android.view.View r7 = r6.f11082h     // Catch:{ NoClassDefFoundError -> 0x0118 }
            com.clevertap.android.sdk.f$b r0 = new com.clevertap.android.sdk.f$b     // Catch:{ NoClassDefFoundError -> 0x0118 }
            r0.<init>(r8)     // Catch:{ NoClassDefFoundError -> 0x0118 }
            r7.setOnClickListener(r0)     // Catch:{ NoClassDefFoundError -> 0x0118 }
            goto L_0x011d
        L_0x0118:
            java.lang.String r7 = "CleverTap SDK requires Glide dependency. Please refer CleverTap Documentation for more info"
            com.clevertap.android.sdk.C3111h1.m14930d(r7)
        L_0x011d:
            android.view.View r7 = r6.f11082h
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.clevertap.android.sdk.C3089f.mo6380a(android.view.ViewGroup, int):java.lang.Object");
    }

    /* renamed from: a */
    public void mo6383a(@C0193h0 ViewGroup viewGroup, int i, @C0193h0 Object obj) {
        viewGroup.removeView((View) obj);
    }
}
