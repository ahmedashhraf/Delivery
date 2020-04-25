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

/* renamed from: com.clevertap.android.sdk.e */
/* compiled from: CTCarouselMessageViewHolder */
class C3083e extends C3080d0 {

    /* renamed from: H0 */
    private CTCarouselViewPager f11047H0;

    /* renamed from: I0 */
    private LinearLayout f11048I0;
    /* access modifiers changed from: private */

    /* renamed from: J0 */
    public TextView f11049J0;
    /* access modifiers changed from: private */

    /* renamed from: K0 */
    public TextView f11050K0;

    /* renamed from: L0 */
    private TextView f11051L0;

    /* renamed from: M0 */
    private TextView f11052M0;
    /* access modifiers changed from: private */

    /* renamed from: N0 */
    public ImageView f11053N0;
    /* access modifiers changed from: private */

    /* renamed from: O0 */
    public ImageView f11054O0;

    /* renamed from: P0 */
    private RelativeLayout f11055P0;

    /* renamed from: com.clevertap.android.sdk.e$a */
    /* compiled from: CTCarouselMessageViewHolder */
    class C3084a implements Runnable {

        /* renamed from: N */
        final /* synthetic */ C3100g0 f11056N;

        /* renamed from: O */
        final /* synthetic */ int f11057O;

        /* renamed from: a */
        final /* synthetic */ C3100g0 f11059a;

        /* renamed from: b */
        final /* synthetic */ CTInboxMessage f11060b;

        /* renamed from: com.clevertap.android.sdk.e$a$a */
        /* compiled from: CTCarouselMessageViewHolder */
        class C3085a implements Runnable {
            C3085a() {
            }

            public void run() {
                if (C3084a.this.f11060b.mo12027u() == C3119j0.CarouselImageMessage) {
                    if (C3083e.this.f11054O0.getVisibility() == 0) {
                        C3084a aVar = C3084a.this;
                        C3100g0 g0Var = aVar.f11056N;
                        if (g0Var != null) {
                            g0Var.mo12271b(null, aVar.f11057O);
                        }
                    }
                    C3083e.this.f11054O0.setVisibility(8);
                    return;
                }
                if (C3083e.this.f11053N0.getVisibility() == 0) {
                    C3084a aVar2 = C3084a.this;
                    C3100g0 g0Var2 = aVar2.f11056N;
                    if (g0Var2 != null) {
                        g0Var2.mo12271b(null, aVar2.f11057O);
                    }
                }
                C3083e.this.f11053N0.setVisibility(8);
            }
        }

        C3084a(C3100g0 g0Var, CTInboxMessage cTInboxMessage, C3100g0 g0Var2, int i) {
            this.f11059a = g0Var;
            this.f11060b = cTInboxMessage;
            this.f11056N = g0Var2;
            this.f11057O = i;
        }

        public void run() {
            C1376c activity = this.f11059a.getActivity();
            if (activity != null) {
                activity.runOnUiThread(new C3085a());
            }
        }
    }

    /* renamed from: com.clevertap.android.sdk.e$b */
    /* compiled from: CTCarouselMessageViewHolder */
    class C3086b implements C2019j {

        /* renamed from: N */
        private CTInboxMessage f11062N;

        /* renamed from: O */
        private Context f11063O;

        /* renamed from: a */
        private C3083e f11065a;

        /* renamed from: b */
        private ImageView[] f11066b;

        C3086b(Context context, C3083e eVar, ImageView[] imageViewArr, CTInboxMessage cTInboxMessage) {
            this.f11063O = context;
            this.f11065a = eVar;
            this.f11066b = imageViewArr;
            this.f11062N = cTInboxMessage;
            this.f11066b[0].setImageDrawable(context.getResources().getDrawable(C3058R.C3060drawable.ct_selected_dot));
        }

        /* renamed from: a */
        public void mo8878a(int i) {
        }

        /* renamed from: a */
        public void mo8879a(int i, float f, int i2) {
        }

        /* renamed from: c */
        public void mo8880c(int i) {
            for (ImageView imageDrawable : this.f11066b) {
                imageDrawable.setImageDrawable(this.f11063O.getResources().getDrawable(C3058R.C3060drawable.ct_unselected_dot));
            }
            this.f11066b[i].setImageDrawable(this.f11063O.getResources().getDrawable(C3058R.C3060drawable.ct_selected_dot));
            this.f11065a.f11049J0.setText(((CTInboxMessageContent) this.f11062N.mo12022p().get(i)).mo12058n());
            this.f11065a.f11049J0.setTextColor(Color.parseColor(((CTInboxMessageContent) this.f11062N.mo12022p().get(i)).mo12059o()));
            this.f11065a.f11050K0.setText(((CTInboxMessageContent) this.f11062N.mo12022p().get(i)).mo12055k());
            this.f11065a.f11050K0.setTextColor(Color.parseColor(((CTInboxMessageContent) this.f11062N.mo12022p().get(i)).mo12056l()));
        }
    }

    C3083e(@C0193h0 View view) {
        super(view);
        this.f11047H0 = (CTCarouselViewPager) view.findViewById(C3058R.C3061id.image_carousel_viewpager);
        this.f11048I0 = (LinearLayout) view.findViewById(C3058R.C3061id.sliderDots);
        this.f11049J0 = (TextView) view.findViewById(C3058R.C3061id.messageTitle);
        this.f11050K0 = (TextView) view.findViewById(C3058R.C3061id.messageText);
        this.f11051L0 = (TextView) view.findViewById(C3058R.C3061id.timestamp);
        this.f11053N0 = (ImageView) view.findViewById(C3058R.C3061id.read_circle);
        this.f11055P0 = (RelativeLayout) view.findViewById(C3058R.C3061id.body_linear_layout);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo12219a(CTInboxMessage cTInboxMessage, C3100g0 g0Var, int i) {
        super.mo12219a(cTInboxMessage, g0Var, i);
        C3100g0 E = mo12222E();
        Context applicationContext = g0Var.getActivity().getApplicationContext();
        CTInboxMessageContent cTInboxMessageContent = (CTInboxMessageContent) cTInboxMessage.mo12022p().get(0);
        this.f11049J0.setVisibility(0);
        this.f11050K0.setVisibility(0);
        this.f11049J0.setText(cTInboxMessageContent.mo12058n());
        this.f11049J0.setTextColor(Color.parseColor(cTInboxMessageContent.mo12059o()));
        this.f11050K0.setText(cTInboxMessageContent.mo12055k());
        this.f11050K0.setTextColor(Color.parseColor(cTInboxMessageContent.mo12056l()));
        if (cTInboxMessage.mo12029w()) {
            this.f11053N0.setVisibility(8);
        } else {
            this.f11053N0.setVisibility(0);
        }
        this.f11051L0.setVisibility(0);
        this.f11051L0.setText(mo12228a(cTInboxMessage.mo12019m()));
        this.f11051L0.setTextColor(Color.parseColor(cTInboxMessageContent.mo12059o()));
        this.f11055P0.setBackgroundColor(Color.parseColor(cTInboxMessage.mo12012b()));
        C3089f fVar = new C3089f(applicationContext, g0Var, cTInboxMessage, (LayoutParams) this.f11047H0.getLayoutParams(), i);
        this.f11047H0.setAdapter(fVar);
        int size = cTInboxMessage.mo12022p().size();
        if (this.f11048I0.getChildCount() > 0) {
            this.f11048I0.removeAllViews();
        }
        ImageView[] imageViewArr = new ImageView[size];
        for (int i2 = 0; i2 < size; i2++) {
            imageViewArr[i2] = new ImageView(g0Var.getActivity());
            imageViewArr[i2].setVisibility(0);
            imageViewArr[i2].setImageDrawable(applicationContext.getResources().getDrawable(C3058R.C3060drawable.ct_unselected_dot));
            LayoutParams layoutParams = new LayoutParams(-2, -2);
            layoutParams.setMargins(8, 6, 4, 6);
            layoutParams.gravity = 17;
            if (this.f11048I0.getChildCount() < size) {
                this.f11048I0.addView(imageViewArr[i2], layoutParams);
            }
        }
        imageViewArr[0].setImageDrawable(g0Var.getActivity().getApplicationContext().getResources().getDrawable(C3058R.C3060drawable.ct_selected_dot));
        C3086b bVar = new C3086b(g0Var.getActivity().getApplicationContext(), this, imageViewArr, cTInboxMessage);
        this.f11047H0.addOnPageChangeListener(bVar);
        RelativeLayout relativeLayout = this.f11055P0;
        C3100g0 g0Var2 = E;
        C3087e0 e0Var = new C3087e0(i, cTInboxMessage, (String) null, g0Var2, (ViewPager) this.f11047H0);
        relativeLayout.setOnClickListener(e0Var);
        C3084a aVar = new C3084a(g0Var, cTInboxMessage, g0Var2, i);
        new Handler().postDelayed(aVar, 2000);
    }
}
