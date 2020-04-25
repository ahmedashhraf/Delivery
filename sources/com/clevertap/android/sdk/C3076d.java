package com.clevertap.android.sdk;

import android.content.Context;
import android.graphics.Color;
import android.os.Handler;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.C0193h0;
import androidx.fragment.app.C1376c;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager.widget.ViewPager.C2019j;

/* renamed from: com.clevertap.android.sdk.d */
/* compiled from: CTCarouselImageViewHolder */
public class C3076d extends C3080d0 {

    /* renamed from: H0 */
    private CTCarouselViewPager f11006H0;

    /* renamed from: I0 */
    private LinearLayout f11007I0;

    /* renamed from: J0 */
    private TextView f11008J0;
    /* access modifiers changed from: private */

    /* renamed from: K0 */
    public ImageView f11009K0;

    /* renamed from: L0 */
    private RelativeLayout f11010L0;

    /* renamed from: com.clevertap.android.sdk.d$a */
    /* compiled from: CTCarouselImageViewHolder */
    class C3077a implements Runnable {

        /* renamed from: N */
        final /* synthetic */ int f11011N;

        /* renamed from: a */
        final /* synthetic */ C3100g0 f11013a;

        /* renamed from: b */
        final /* synthetic */ C3100g0 f11014b;

        /* renamed from: com.clevertap.android.sdk.d$a$a */
        /* compiled from: CTCarouselImageViewHolder */
        class C3078a implements Runnable {
            C3078a() {
            }

            public void run() {
                if (C3076d.this.f11009K0.getVisibility() == 0) {
                    C3077a aVar = C3077a.this;
                    C3100g0 g0Var = aVar.f11014b;
                    if (g0Var != null) {
                        g0Var.mo12271b(null, aVar.f11011N);
                    }
                }
                C3076d.this.f11009K0.setVisibility(8);
            }
        }

        C3077a(C3100g0 g0Var, C3100g0 g0Var2, int i) {
            this.f11013a = g0Var;
            this.f11014b = g0Var2;
            this.f11011N = i;
        }

        public void run() {
            C1376c activity = this.f11013a.getActivity();
            if (activity != null) {
                activity.runOnUiThread(new C3078a());
            }
        }
    }

    /* renamed from: com.clevertap.android.sdk.d$b */
    /* compiled from: CTCarouselImageViewHolder */
    class C3079b implements C2019j {

        /* renamed from: N */
        private CTInboxMessage f11016N;

        /* renamed from: O */
        private Context f11017O;

        /* renamed from: a */
        private C3076d f11019a;

        /* renamed from: b */
        private ImageView[] f11020b;

        C3079b(Context context, C3076d dVar, ImageView[] imageViewArr, CTInboxMessage cTInboxMessage) {
            this.f11017O = context;
            this.f11019a = dVar;
            this.f11020b = imageViewArr;
            this.f11016N = cTInboxMessage;
            this.f11020b[0].setImageDrawable(context.getResources().getDrawable(C3058R.C3060drawable.ct_selected_dot));
        }

        /* renamed from: a */
        public void mo8878a(int i) {
        }

        /* renamed from: a */
        public void mo8879a(int i, float f, int i2) {
        }

        /* renamed from: c */
        public void mo8880c(int i) {
            for (ImageView imageDrawable : this.f11020b) {
                imageDrawable.setImageDrawable(this.f11017O.getResources().getDrawable(C3058R.C3060drawable.ct_unselected_dot));
            }
            this.f11020b[i].setImageDrawable(this.f11017O.getResources().getDrawable(C3058R.C3060drawable.ct_selected_dot));
        }
    }

    C3076d(@C0193h0 View view) {
        super(view);
        this.f11006H0 = (CTCarouselViewPager) view.findViewById(C3058R.C3061id.image_carousel_viewpager);
        this.f11007I0 = (LinearLayout) view.findViewById(C3058R.C3061id.sliderDots);
        this.f11008J0 = (TextView) view.findViewById(C3058R.C3061id.carousel_timestamp);
        this.f11009K0 = (ImageView) view.findViewById(C3058R.C3061id.carousel_read_circle);
        this.f11010L0 = (RelativeLayout) view.findViewById(C3058R.C3061id.body_linear_layout);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo12219a(CTInboxMessage cTInboxMessage, C3100g0 g0Var, int i) {
        super.mo12219a(cTInboxMessage, g0Var, i);
        C3100g0 E = mo12222E();
        Context applicationContext = g0Var.getActivity().getApplicationContext();
        CTInboxMessageContent cTInboxMessageContent = (CTInboxMessageContent) cTInboxMessage.mo12022p().get(0);
        this.f11008J0.setVisibility(0);
        if (cTInboxMessage.mo12029w()) {
            this.f11009K0.setVisibility(8);
        } else {
            this.f11009K0.setVisibility(0);
        }
        this.f11008J0.setText(mo12228a(cTInboxMessage.mo12019m()));
        this.f11008J0.setTextColor(Color.parseColor(cTInboxMessageContent.mo12059o()));
        this.f11010L0.setBackgroundColor(Color.parseColor(cTInboxMessage.mo12012b()));
        C3089f fVar = new C3089f(applicationContext, g0Var, cTInboxMessage, (LayoutParams) this.f11006H0.getLayoutParams(), i);
        this.f11006H0.setAdapter(fVar);
        int size = cTInboxMessage.mo12022p().size();
        if (this.f11007I0.getChildCount() > 0) {
            this.f11007I0.removeAllViews();
        }
        ImageView[] imageViewArr = new ImageView[size];
        for (int i2 = 0; i2 < size; i2++) {
            imageViewArr[i2] = new ImageView(g0Var.getActivity());
            imageViewArr[i2].setVisibility(0);
            imageViewArr[i2].setImageDrawable(applicationContext.getResources().getDrawable(C3058R.C3060drawable.ct_unselected_dot));
            LayoutParams layoutParams = new LayoutParams(-2, -2);
            layoutParams.setMargins(8, 6, 4, 6);
            layoutParams.gravity = 17;
            if (this.f11007I0.getChildCount() < size) {
                this.f11007I0.addView(imageViewArr[i2], layoutParams);
            }
        }
        imageViewArr[0].setImageDrawable(g0Var.getActivity().getApplicationContext().getResources().getDrawable(C3058R.C3060drawable.ct_selected_dot));
        C3079b bVar = new C3079b(g0Var.getActivity().getApplicationContext(), this, imageViewArr, cTInboxMessage);
        this.f11006H0.addOnPageChangeListener(bVar);
        RelativeLayout relativeLayout = this.f11010L0;
        C3087e0 e0Var = new C3087e0(i, cTInboxMessage, (String) null, E, (ViewPager) this.f11006H0);
        relativeLayout.setOnClickListener(e0Var);
        new Handler().postDelayed(new C3077a(g0Var, E, i), 2000);
    }
}
