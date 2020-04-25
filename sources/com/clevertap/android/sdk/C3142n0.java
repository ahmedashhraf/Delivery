package com.clevertap.android.sdk;

import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.C0193h0;
import androidx.fragment.app.C1376c;

/* renamed from: com.clevertap.android.sdk.n0 */
/* compiled from: CTSimpleMessageViewHolder */
class C3142n0 extends C3080d0 {

    /* renamed from: H0 */
    private TextView f11215H0;

    /* renamed from: I0 */
    private TextView f11216I0;

    /* renamed from: J0 */
    private TextView f11217J0;
    /* access modifiers changed from: private */

    /* renamed from: K0 */
    public ImageView f11218K0;

    /* renamed from: L0 */
    private Button f11219L0;

    /* renamed from: M0 */
    private Button f11220M0;

    /* renamed from: N0 */
    private Button f11221N0;

    /* renamed from: com.clevertap.android.sdk.n0$a */
    /* compiled from: CTSimpleMessageViewHolder */
    class C3143a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ int f11222a;

        /* renamed from: com.clevertap.android.sdk.n0$a$a */
        /* compiled from: CTSimpleMessageViewHolder */
        class C3144a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C3100g0 f11224a;

            C3144a(C3100g0 g0Var) {
                this.f11224a = g0Var;
            }

            public void run() {
                if (C3142n0.this.f11218K0.getVisibility() == 0) {
                    this.f11224a.mo12271b(null, C3143a.this.f11222a);
                }
                C3142n0.this.f11218K0.setVisibility(8);
            }
        }

        C3143a(int i) {
            this.f11222a = i;
        }

        public void run() {
            C3100g0 E = C3142n0.this.mo12222E();
            if (E != null) {
                C1376c activity = E.getActivity();
                if (activity != null) {
                    activity.runOnUiThread(new C3144a(E));
                }
            }
        }
    }

    C3142n0(@C0193h0 View view) {
        super(view);
        view.setTag(this);
        this.f11215H0 = (TextView) view.findViewById(C3058R.C3061id.messageTitle);
        this.f11216I0 = (TextView) view.findViewById(C3058R.C3061id.messageText);
        this.f11217J0 = (TextView) view.findViewById(C3058R.C3061id.timestamp);
        this.f11218K0 = (ImageView) view.findViewById(C3058R.C3061id.read_circle);
        this.f11219L0 = (Button) view.findViewById(C3058R.C3061id.cta_button_1);
        this.f11220M0 = (Button) view.findViewById(C3058R.C3061id.cta_button_2);
        this.f11221N0 = (Button) view.findViewById(C3058R.C3061id.cta_button_3);
        this.f11034y0 = (ImageView) view.findViewById(C3058R.C3061id.media_image);
        this.f11028s0 = (RelativeLayout) view.findViewById(C3058R.C3061id.simple_message_relative_layout);
        this.f11032w0 = (FrameLayout) view.findViewById(C3058R.C3061id.simple_message_frame_layout);
        this.f11035z0 = (ImageView) view.findViewById(C3058R.C3061id.square_media_image);
        this.f11029t0 = (RelativeLayout) view.findViewById(C3058R.C3061id.click_relative_layout);
        this.f11030u0 = (LinearLayout) view.findViewById(C3058R.C3061id.cta_linear_layout);
        this.f11031v0 = (LinearLayout) view.findViewById(C3058R.C3061id.body_linear_layout);
        this.f11021A0 = (FrameLayout) view.findViewById(C3058R.C3061id.simple_progress_frame_layout);
        this.f11023C0 = (RelativeLayout) view.findViewById(C3058R.C3061id.media_layout);
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Can't wrap try/catch for region: R(5:45|46|47|48|49) */
    /* JADX WARNING: Can't wrap try/catch for region: R(5:52|53|54|55|56) */
    /* JADX WARNING: Can't wrap try/catch for region: R(5:99|100|101|102|103) */
    /* JADX WARNING: Can't wrap try/catch for region: R(6:61|(1:63)(1:64)|65|66|67|68) */
    /* JADX WARNING: Can't wrap try/catch for region: R(9:83|84|85|86|87|114|(0)(0)|121|(0)(0)) */
    /* JADX WARNING: Can't wrap try/catch for region: R(9:90|91|92|93|94|114|(0)(0)|121|(0)(0)) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:102:0x05fe */
    /* JADX WARNING: Missing exception handler attribute for start block: B:48:0x0336 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:55:0x03a5 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:67:0x042b */
    /* JADX WARNING: Missing exception handler attribute for start block: B:86:0x0516 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:93:0x0585 */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x069b  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x06aa  */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x06e2  */
    /* JADX WARNING: Removed duplicated region for block: B:125:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x02e3  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x04c7 A[Catch:{ NoClassDefFoundError -> 0x068b }] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:55:0x03a5=Splitter:B:55:0x03a5, B:93:0x0585=Splitter:B:93:0x0585, B:48:0x0336=Splitter:B:48:0x0336, B:86:0x0516=Splitter:B:86:0x0516, B:67:0x042b=Splitter:B:67:0x042b, B:102:0x05fe=Splitter:B:102:0x05fe} */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo12219a(com.clevertap.android.sdk.CTInboxMessage r18, com.clevertap.android.sdk.C3100g0 r19, int r20) {
        /*
            r17 = this;
            r1 = r17
            java.lang.String r2 = "l"
            super.mo12219a(r18, r19, r20)
            com.clevertap.android.sdk.g0 r9 = r17.mo12222E()
            java.util.ArrayList r0 = r18.mo12022p()
            r10 = 0
            java.lang.Object r0 = r0.get(r10)
            r11 = r0
            com.clevertap.android.sdk.CTInboxMessageContent r11 = (com.clevertap.android.sdk.CTInboxMessageContent) r11
            android.widget.TextView r0 = r1.f11215H0
            java.lang.String r3 = r11.mo12058n()
            r0.setText(r3)
            android.widget.TextView r0 = r1.f11215H0
            java.lang.String r3 = r11.mo12059o()
            int r3 = android.graphics.Color.parseColor(r3)
            r0.setTextColor(r3)
            android.widget.TextView r0 = r1.f11216I0
            java.lang.String r3 = r11.mo12055k()
            r0.setText(r3)
            android.widget.TextView r0 = r1.f11216I0
            java.lang.String r3 = r11.mo12056l()
            int r3 = android.graphics.Color.parseColor(r3)
            r0.setTextColor(r3)
            android.widget.LinearLayout r0 = r1.f11031v0
            java.lang.String r3 = r18.mo12012b()
            int r3 = android.graphics.Color.parseColor(r3)
            r0.setBackgroundColor(r3)
            long r3 = r18.mo12019m()
            java.lang.String r0 = r1.mo12228a(r3)
            android.widget.TextView r3 = r1.f11217J0
            r3.setText(r0)
            android.widget.TextView r0 = r1.f11217J0
            java.lang.String r3 = r11.mo12059o()
            int r3 = android.graphics.Color.parseColor(r3)
            r0.setTextColor(r3)
            boolean r0 = r18.mo12029w()
            r12 = 8
            if (r0 == 0) goto L_0x0078
            android.widget.ImageView r0 = r1.f11218K0
            r0.setVisibility(r12)
            goto L_0x007d
        L_0x0078:
            android.widget.ImageView r0 = r1.f11218K0
            r0.setVisibility(r10)
        L_0x007d:
            android.widget.FrameLayout r0 = r1.f11032w0
            r0.setVisibility(r12)
            org.json.JSONArray r0 = r11.mo12052i()
            r13 = 1
            r14 = 2
            if (r0 == 0) goto L_0x027f
            android.widget.LinearLayout r3 = r1.f11030u0
            r3.setVisibility(r10)
            int r3 = r0.length()
            if (r3 == r13) goto L_0x0211
            if (r3 == r14) goto L_0x0178
            r4 = 3
            if (r3 == r4) goto L_0x009c
            goto L_0x027c
        L_0x009c:
            org.json.JSONObject r7 = r0.getJSONObject(r10)     // Catch:{ JSONException -> 0x0263 }
            android.widget.Button r3 = r1.f11219L0     // Catch:{ JSONException -> 0x0263 }
            r3.setVisibility(r10)     // Catch:{ JSONException -> 0x0263 }
            android.widget.Button r3 = r1.f11219L0     // Catch:{ JSONException -> 0x0263 }
            java.lang.String r4 = r11.mo12042d(r7)     // Catch:{ JSONException -> 0x0263 }
            r3.setText(r4)     // Catch:{ JSONException -> 0x0263 }
            android.widget.Button r3 = r1.f11219L0     // Catch:{ JSONException -> 0x0263 }
            java.lang.String r4 = r11.mo12038b(r7)     // Catch:{ JSONException -> 0x0263 }
            int r4 = android.graphics.Color.parseColor(r4)     // Catch:{ JSONException -> 0x0263 }
            r3.setTextColor(r4)     // Catch:{ JSONException -> 0x0263 }
            android.widget.Button r3 = r1.f11219L0     // Catch:{ JSONException -> 0x0263 }
            java.lang.String r4 = r11.mo12034a(r7)     // Catch:{ JSONException -> 0x0263 }
            int r4 = android.graphics.Color.parseColor(r4)     // Catch:{ JSONException -> 0x0263 }
            r3.setBackgroundColor(r4)     // Catch:{ JSONException -> 0x0263 }
            org.json.JSONObject r15 = r0.getJSONObject(r13)     // Catch:{ JSONException -> 0x0263 }
            android.widget.Button r3 = r1.f11220M0     // Catch:{ JSONException -> 0x0263 }
            r3.setVisibility(r10)     // Catch:{ JSONException -> 0x0263 }
            android.widget.Button r3 = r1.f11220M0     // Catch:{ JSONException -> 0x0263 }
            java.lang.String r4 = r11.mo12042d(r15)     // Catch:{ JSONException -> 0x0263 }
            r3.setText(r4)     // Catch:{ JSONException -> 0x0263 }
            android.widget.Button r3 = r1.f11220M0     // Catch:{ JSONException -> 0x0263 }
            java.lang.String r4 = r11.mo12038b(r15)     // Catch:{ JSONException -> 0x0263 }
            int r4 = android.graphics.Color.parseColor(r4)     // Catch:{ JSONException -> 0x0263 }
            r3.setTextColor(r4)     // Catch:{ JSONException -> 0x0263 }
            android.widget.Button r3 = r1.f11220M0     // Catch:{ JSONException -> 0x0263 }
            java.lang.String r4 = r11.mo12034a(r15)     // Catch:{ JSONException -> 0x0263 }
            int r4 = android.graphics.Color.parseColor(r4)     // Catch:{ JSONException -> 0x0263 }
            r3.setBackgroundColor(r4)     // Catch:{ JSONException -> 0x0263 }
            org.json.JSONObject r0 = r0.getJSONObject(r14)     // Catch:{ JSONException -> 0x0263 }
            android.widget.Button r3 = r1.f11221N0     // Catch:{ JSONException -> 0x0263 }
            r3.setVisibility(r10)     // Catch:{ JSONException -> 0x0263 }
            android.widget.Button r3 = r1.f11221N0     // Catch:{ JSONException -> 0x0263 }
            java.lang.String r4 = r11.mo12042d(r0)     // Catch:{ JSONException -> 0x0263 }
            r3.setText(r4)     // Catch:{ JSONException -> 0x0263 }
            android.widget.Button r3 = r1.f11221N0     // Catch:{ JSONException -> 0x0263 }
            java.lang.String r4 = r11.mo12038b(r0)     // Catch:{ JSONException -> 0x0263 }
            int r4 = android.graphics.Color.parseColor(r4)     // Catch:{ JSONException -> 0x0263 }
            r3.setTextColor(r4)     // Catch:{ JSONException -> 0x0263 }
            android.widget.Button r3 = r1.f11221N0     // Catch:{ JSONException -> 0x0263 }
            java.lang.String r4 = r11.mo12034a(r0)     // Catch:{ JSONException -> 0x0263 }
            int r4 = android.graphics.Color.parseColor(r4)     // Catch:{ JSONException -> 0x0263 }
            r3.setBackgroundColor(r4)     // Catch:{ JSONException -> 0x0263 }
            if (r9 == 0) goto L_0x027c
            android.widget.Button r8 = r1.f11219L0     // Catch:{ JSONException -> 0x0263 }
            com.clevertap.android.sdk.e0 r6 = new com.clevertap.android.sdk.e0     // Catch:{ JSONException -> 0x0263 }
            android.widget.Button r3 = r1.f11219L0     // Catch:{ JSONException -> 0x0263 }
            java.lang.CharSequence r3 = r3.getText()     // Catch:{ JSONException -> 0x0263 }
            java.lang.String r16 = r3.toString()     // Catch:{ JSONException -> 0x0263 }
            r3 = r6
            r4 = r20
            r5 = r18
            r14 = r6
            r6 = r16
            r12 = r8
            r8 = r9
            r3.<init>(r4, r5, r6, r7, r8)     // Catch:{ JSONException -> 0x0263 }
            r12.setOnClickListener(r14)     // Catch:{ JSONException -> 0x0263 }
            android.widget.Button r12 = r1.f11220M0     // Catch:{ JSONException -> 0x0263 }
            com.clevertap.android.sdk.e0 r14 = new com.clevertap.android.sdk.e0     // Catch:{ JSONException -> 0x0263 }
            android.widget.Button r3 = r1.f11220M0     // Catch:{ JSONException -> 0x0263 }
            java.lang.CharSequence r3 = r3.getText()     // Catch:{ JSONException -> 0x0263 }
            java.lang.String r6 = r3.toString()     // Catch:{ JSONException -> 0x0263 }
            r3 = r14
            r4 = r20
            r5 = r18
            r7 = r15
            r8 = r9
            r3.<init>(r4, r5, r6, r7, r8)     // Catch:{ JSONException -> 0x0263 }
            r12.setOnClickListener(r14)     // Catch:{ JSONException -> 0x0263 }
            android.widget.Button r12 = r1.f11221N0     // Catch:{ JSONException -> 0x0263 }
            com.clevertap.android.sdk.e0 r14 = new com.clevertap.android.sdk.e0     // Catch:{ JSONException -> 0x0263 }
            android.widget.Button r3 = r1.f11221N0     // Catch:{ JSONException -> 0x0263 }
            java.lang.CharSequence r3 = r3.getText()     // Catch:{ JSONException -> 0x0263 }
            java.lang.String r6 = r3.toString()     // Catch:{ JSONException -> 0x0263 }
            r3 = r14
            r4 = r20
            r5 = r18
            r7 = r0
            r8 = r9
            r3.<init>(r4, r5, r6, r7, r8)     // Catch:{ JSONException -> 0x0263 }
            r12.setOnClickListener(r14)     // Catch:{ JSONException -> 0x0263 }
            goto L_0x027c
        L_0x0178:
            org.json.JSONObject r7 = r0.getJSONObject(r10)     // Catch:{ JSONException -> 0x0263 }
            android.widget.Button r3 = r1.f11219L0     // Catch:{ JSONException -> 0x0263 }
            r3.setVisibility(r10)     // Catch:{ JSONException -> 0x0263 }
            android.widget.Button r3 = r1.f11219L0     // Catch:{ JSONException -> 0x0263 }
            java.lang.String r4 = r11.mo12042d(r7)     // Catch:{ JSONException -> 0x0263 }
            r3.setText(r4)     // Catch:{ JSONException -> 0x0263 }
            android.widget.Button r3 = r1.f11219L0     // Catch:{ JSONException -> 0x0263 }
            java.lang.String r4 = r11.mo12038b(r7)     // Catch:{ JSONException -> 0x0263 }
            int r4 = android.graphics.Color.parseColor(r4)     // Catch:{ JSONException -> 0x0263 }
            r3.setTextColor(r4)     // Catch:{ JSONException -> 0x0263 }
            android.widget.Button r3 = r1.f11219L0     // Catch:{ JSONException -> 0x0263 }
            java.lang.String r4 = r11.mo12034a(r7)     // Catch:{ JSONException -> 0x0263 }
            int r4 = android.graphics.Color.parseColor(r4)     // Catch:{ JSONException -> 0x0263 }
            r3.setBackgroundColor(r4)     // Catch:{ JSONException -> 0x0263 }
            org.json.JSONObject r0 = r0.getJSONObject(r13)     // Catch:{ JSONException -> 0x0263 }
            android.widget.Button r3 = r1.f11220M0     // Catch:{ JSONException -> 0x0263 }
            r3.setVisibility(r10)     // Catch:{ JSONException -> 0x0263 }
            android.widget.Button r3 = r1.f11220M0     // Catch:{ JSONException -> 0x0263 }
            java.lang.String r4 = r11.mo12042d(r0)     // Catch:{ JSONException -> 0x0263 }
            r3.setText(r4)     // Catch:{ JSONException -> 0x0263 }
            android.widget.Button r3 = r1.f11220M0     // Catch:{ JSONException -> 0x0263 }
            java.lang.String r4 = r11.mo12038b(r0)     // Catch:{ JSONException -> 0x0263 }
            int r4 = android.graphics.Color.parseColor(r4)     // Catch:{ JSONException -> 0x0263 }
            r3.setTextColor(r4)     // Catch:{ JSONException -> 0x0263 }
            android.widget.Button r3 = r1.f11220M0     // Catch:{ JSONException -> 0x0263 }
            java.lang.String r4 = r11.mo12034a(r0)     // Catch:{ JSONException -> 0x0263 }
            int r4 = android.graphics.Color.parseColor(r4)     // Catch:{ JSONException -> 0x0263 }
            r3.setBackgroundColor(r4)     // Catch:{ JSONException -> 0x0263 }
            android.widget.Button r3 = r1.f11219L0     // Catch:{ JSONException -> 0x0263 }
            android.widget.Button r4 = r1.f11220M0     // Catch:{ JSONException -> 0x0263 }
            android.widget.Button r5 = r1.f11221N0     // Catch:{ JSONException -> 0x0263 }
            r1.mo12229a(r3, r4, r5)     // Catch:{ JSONException -> 0x0263 }
            if (r9 == 0) goto L_0x027c
            android.widget.Button r12 = r1.f11219L0     // Catch:{ JSONException -> 0x0263 }
            com.clevertap.android.sdk.e0 r14 = new com.clevertap.android.sdk.e0     // Catch:{ JSONException -> 0x0263 }
            android.widget.Button r3 = r1.f11219L0     // Catch:{ JSONException -> 0x0263 }
            java.lang.CharSequence r3 = r3.getText()     // Catch:{ JSONException -> 0x0263 }
            java.lang.String r6 = r3.toString()     // Catch:{ JSONException -> 0x0263 }
            r3 = r14
            r4 = r20
            r5 = r18
            r8 = r9
            r3.<init>(r4, r5, r6, r7, r8)     // Catch:{ JSONException -> 0x0263 }
            r12.setOnClickListener(r14)     // Catch:{ JSONException -> 0x0263 }
            android.widget.Button r12 = r1.f11220M0     // Catch:{ JSONException -> 0x0263 }
            com.clevertap.android.sdk.e0 r14 = new com.clevertap.android.sdk.e0     // Catch:{ JSONException -> 0x0263 }
            android.widget.Button r3 = r1.f11220M0     // Catch:{ JSONException -> 0x0263 }
            java.lang.CharSequence r3 = r3.getText()     // Catch:{ JSONException -> 0x0263 }
            java.lang.String r6 = r3.toString()     // Catch:{ JSONException -> 0x0263 }
            r3 = r14
            r4 = r20
            r5 = r18
            r7 = r0
            r8 = r9
            r3.<init>(r4, r5, r6, r7, r8)     // Catch:{ JSONException -> 0x0263 }
            r12.setOnClickListener(r14)     // Catch:{ JSONException -> 0x0263 }
            goto L_0x027c
        L_0x0211:
            org.json.JSONObject r7 = r0.getJSONObject(r10)     // Catch:{ JSONException -> 0x0263 }
            android.widget.Button r0 = r1.f11219L0     // Catch:{ JSONException -> 0x0263 }
            r0.setVisibility(r10)     // Catch:{ JSONException -> 0x0263 }
            android.widget.Button r0 = r1.f11219L0     // Catch:{ JSONException -> 0x0263 }
            java.lang.String r3 = r11.mo12042d(r7)     // Catch:{ JSONException -> 0x0263 }
            r0.setText(r3)     // Catch:{ JSONException -> 0x0263 }
            android.widget.Button r0 = r1.f11219L0     // Catch:{ JSONException -> 0x0263 }
            java.lang.String r3 = r11.mo12038b(r7)     // Catch:{ JSONException -> 0x0263 }
            int r3 = android.graphics.Color.parseColor(r3)     // Catch:{ JSONException -> 0x0263 }
            r0.setTextColor(r3)     // Catch:{ JSONException -> 0x0263 }
            android.widget.Button r0 = r1.f11219L0     // Catch:{ JSONException -> 0x0263 }
            java.lang.String r3 = r11.mo12034a(r7)     // Catch:{ JSONException -> 0x0263 }
            int r3 = android.graphics.Color.parseColor(r3)     // Catch:{ JSONException -> 0x0263 }
            r0.setBackgroundColor(r3)     // Catch:{ JSONException -> 0x0263 }
            android.widget.Button r0 = r1.f11219L0     // Catch:{ JSONException -> 0x0263 }
            android.widget.Button r3 = r1.f11220M0     // Catch:{ JSONException -> 0x0263 }
            android.widget.Button r4 = r1.f11221N0     // Catch:{ JSONException -> 0x0263 }
            r1.mo12231b(r0, r3, r4)     // Catch:{ JSONException -> 0x0263 }
            if (r9 == 0) goto L_0x027c
            android.widget.Button r0 = r1.f11219L0     // Catch:{ JSONException -> 0x0263 }
            com.clevertap.android.sdk.e0 r12 = new com.clevertap.android.sdk.e0     // Catch:{ JSONException -> 0x0263 }
            android.widget.Button r3 = r1.f11219L0     // Catch:{ JSONException -> 0x0263 }
            java.lang.CharSequence r3 = r3.getText()     // Catch:{ JSONException -> 0x0263 }
            java.lang.String r6 = r3.toString()     // Catch:{ JSONException -> 0x0263 }
            r3 = r12
            r4 = r20
            r5 = r18
            r8 = r9
            r3.<init>(r4, r5, r6, r7, r8)     // Catch:{ JSONException -> 0x0263 }
            r0.setOnClickListener(r12)     // Catch:{ JSONException -> 0x0263 }
            goto L_0x027c
        L_0x0263:
            r0 = move-exception
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Error parsing CTA JSON - "
            r3.append(r4)
            java.lang.String r0 = r0.getLocalizedMessage()
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            com.clevertap.android.sdk.C3111h1.m14930d(r0)
        L_0x027c:
            r3 = 8
            goto L_0x0286
        L_0x027f:
            android.widget.LinearLayout r0 = r1.f11030u0
            r3 = 8
            r0.setVisibility(r3)
        L_0x0286:
            android.widget.ImageView r0 = r1.f11034y0
            r0.setVisibility(r3)
            android.widget.ImageView r0 = r1.f11034y0
            java.lang.String r4 = r18.mo12012b()
            int r4 = android.graphics.Color.parseColor(r4)
            r0.setBackgroundColor(r4)
            android.widget.ImageView r0 = r1.f11035z0
            r0.setVisibility(r3)
            android.widget.ImageView r0 = r1.f11035z0
            java.lang.String r4 = r18.mo12012b()
            int r4 = android.graphics.Color.parseColor(r4)
            r0.setBackgroundColor(r4)
            android.widget.RelativeLayout r0 = r1.f11023C0
            r0.setVisibility(r3)
            android.widget.FrameLayout r0 = r1.f11021A0
            r0.setVisibility(r3)
            java.lang.String r0 = r18.mo12024r()     // Catch:{ NoClassDefFoundError -> 0x068b }
            int r3 = r0.hashCode()     // Catch:{ NoClassDefFoundError -> 0x068b }
            r4 = 108(0x6c, float:1.51E-43)
            r5 = -1
            if (r3 == r4) goto L_0x02d0
            r4 = 112(0x70, float:1.57E-43)
            if (r3 == r4) goto L_0x02c6
            goto L_0x02d8
        L_0x02c6:
            java.lang.String r3 = "p"
            boolean r0 = r0.equals(r3)     // Catch:{ NoClassDefFoundError -> 0x068b }
            if (r0 == 0) goto L_0x02d8
            r0 = 1
            goto L_0x02d9
        L_0x02d0:
            boolean r0 = r0.equals(r2)     // Catch:{ NoClassDefFoundError -> 0x068b }
            if (r0 == 0) goto L_0x02d8
            r0 = 0
            goto L_0x02d9
        L_0x02d8:
            r0 = -1
        L_0x02d9:
            java.lang.String r3 = "ct_audio"
            java.lang.String r4 = "ct_video_1"
            java.lang.String r6 = "CleverTap SDK requires Glide v4.9.0 or above. Please refer CleverTap Documentation for more info"
            java.lang.String r7 = "ct_image"
            if (r0 == 0) goto L_0x04c7
            if (r0 == r13) goto L_0x02e7
            goto L_0x0690
        L_0x02e7:
            boolean r0 = r11.mo12062r()     // Catch:{ NoClassDefFoundError -> 0x068b }
            if (r0 == 0) goto L_0x0352
            android.widget.RelativeLayout r0 = r1.f11023C0     // Catch:{ NoClassDefFoundError -> 0x068b }
            r0.setVisibility(r10)     // Catch:{ NoClassDefFoundError -> 0x068b }
            android.widget.ImageView r0 = r1.f11035z0     // Catch:{ NoClassDefFoundError -> 0x068b }
            r0.setVisibility(r10)     // Catch:{ NoClassDefFoundError -> 0x068b }
            android.widget.ImageView r0 = r1.f11035z0     // Catch:{ NoClassDefFoundError -> 0x068b }
            android.widget.ImageView$ScaleType r3 = android.widget.ImageView.ScaleType.CENTER_CROP     // Catch:{ NoClassDefFoundError -> 0x068b }
            r0.setScaleType(r3)     // Catch:{ NoClassDefFoundError -> 0x068b }
            android.widget.ImageView r0 = r1.f11035z0     // Catch:{ NoSuchMethodError -> 0x0336 }
            android.content.Context r0 = r0.getContext()     // Catch:{ NoSuchMethodError -> 0x0336 }
            c.c.a.q r0 = p076c.p082c.p083a.C2232l.m11649c(r0)     // Catch:{ NoSuchMethodError -> 0x0336 }
            java.lang.String r3 = r11.mo12054j()     // Catch:{ NoSuchMethodError -> 0x0336 }
            com.bumptech.glide.RequestBuilder r0 = r0.load(r3)     // Catch:{ NoSuchMethodError -> 0x0336 }
            com.bumptech.glide.request.RequestOptions r3 = new com.bumptech.glide.request.RequestOptions     // Catch:{ NoSuchMethodError -> 0x0336 }
            r3.<init>()     // Catch:{ NoSuchMethodError -> 0x0336 }
            android.content.Context r4 = r1.f11033x0     // Catch:{ NoSuchMethodError -> 0x0336 }
            int r4 = com.clevertap.android.sdk.C3238w1.m15655a(r4, r7)     // Catch:{ NoSuchMethodError -> 0x0336 }
            com.bumptech.glide.request.BaseRequestOptions r3 = r3.placeholder(r4)     // Catch:{ NoSuchMethodError -> 0x0336 }
            com.bumptech.glide.request.RequestOptions r3 = (com.bumptech.glide.request.RequestOptions) r3     // Catch:{ NoSuchMethodError -> 0x0336 }
            android.content.Context r4 = r1.f11033x0     // Catch:{ NoSuchMethodError -> 0x0336 }
            int r4 = com.clevertap.android.sdk.C3238w1.m15655a(r4, r7)     // Catch:{ NoSuchMethodError -> 0x0336 }
            com.bumptech.glide.request.BaseRequestOptions r3 = r3.error(r4)     // Catch:{ NoSuchMethodError -> 0x0336 }
            com.bumptech.glide.RequestBuilder r0 = r0.apply(r3)     // Catch:{ NoSuchMethodError -> 0x0336 }
            android.widget.ImageView r3 = r1.f11035z0     // Catch:{ NoSuchMethodError -> 0x0336 }
            r0.into(r3)     // Catch:{ NoSuchMethodError -> 0x0336 }
            goto L_0x0690
        L_0x0336:
            com.clevertap.android.sdk.C3111h1.m14930d(r6)     // Catch:{ NoClassDefFoundError -> 0x068b }
            android.widget.ImageView r0 = r1.f11035z0     // Catch:{ NoClassDefFoundError -> 0x068b }
            android.content.Context r0 = r0.getContext()     // Catch:{ NoClassDefFoundError -> 0x068b }
            c.c.a.q r0 = p076c.p082c.p083a.C2232l.m11649c(r0)     // Catch:{ NoClassDefFoundError -> 0x068b }
            java.lang.String r3 = r11.mo12054j()     // Catch:{ NoClassDefFoundError -> 0x068b }
            com.bumptech.glide.RequestBuilder r0 = r0.load(r3)     // Catch:{ NoClassDefFoundError -> 0x068b }
            android.widget.ImageView r3 = r1.f11035z0     // Catch:{ NoClassDefFoundError -> 0x068b }
            r0.into(r3)     // Catch:{ NoClassDefFoundError -> 0x068b }
            goto L_0x0690
        L_0x0352:
            boolean r0 = r11.mo12061q()     // Catch:{ NoClassDefFoundError -> 0x068b }
            if (r0 == 0) goto L_0x03c5
            android.widget.RelativeLayout r0 = r1.f11023C0     // Catch:{ NoClassDefFoundError -> 0x068b }
            r0.setVisibility(r10)     // Catch:{ NoClassDefFoundError -> 0x068b }
            android.widget.ImageView r0 = r1.f11035z0     // Catch:{ NoClassDefFoundError -> 0x068b }
            r0.setVisibility(r10)     // Catch:{ NoClassDefFoundError -> 0x068b }
            android.widget.ImageView r0 = r1.f11035z0     // Catch:{ NoClassDefFoundError -> 0x068b }
            android.widget.ImageView$ScaleType r3 = android.widget.ImageView.ScaleType.FIT_CENTER     // Catch:{ NoClassDefFoundError -> 0x068b }
            r0.setScaleType(r3)     // Catch:{ NoClassDefFoundError -> 0x068b }
            android.widget.ImageView r0 = r1.f11035z0     // Catch:{ NoSuchMethodError -> 0x03a5 }
            android.content.Context r0 = r0.getContext()     // Catch:{ NoSuchMethodError -> 0x03a5 }
            c.c.a.q r0 = p076c.p082c.p083a.C2232l.m11649c(r0)     // Catch:{ NoSuchMethodError -> 0x03a5 }
            com.bumptech.glide.RequestBuilder r0 = r0.asGif()     // Catch:{ NoSuchMethodError -> 0x03a5 }
            java.lang.String r3 = r11.mo12054j()     // Catch:{ NoSuchMethodError -> 0x03a5 }
            com.bumptech.glide.RequestBuilder r0 = r0.load(r3)     // Catch:{ NoSuchMethodError -> 0x03a5 }
            com.bumptech.glide.request.RequestOptions r3 = new com.bumptech.glide.request.RequestOptions     // Catch:{ NoSuchMethodError -> 0x03a5 }
            r3.<init>()     // Catch:{ NoSuchMethodError -> 0x03a5 }
            android.content.Context r4 = r1.f11033x0     // Catch:{ NoSuchMethodError -> 0x03a5 }
            int r4 = com.clevertap.android.sdk.C3238w1.m15655a(r4, r7)     // Catch:{ NoSuchMethodError -> 0x03a5 }
            com.bumptech.glide.request.BaseRequestOptions r3 = r3.placeholder(r4)     // Catch:{ NoSuchMethodError -> 0x03a5 }
            com.bumptech.glide.request.RequestOptions r3 = (com.bumptech.glide.request.RequestOptions) r3     // Catch:{ NoSuchMethodError -> 0x03a5 }
            android.content.Context r4 = r1.f11033x0     // Catch:{ NoSuchMethodError -> 0x03a5 }
            int r4 = com.clevertap.android.sdk.C3238w1.m15655a(r4, r7)     // Catch:{ NoSuchMethodError -> 0x03a5 }
            com.bumptech.glide.request.BaseRequestOptions r3 = r3.error(r4)     // Catch:{ NoSuchMethodError -> 0x03a5 }
            com.bumptech.glide.RequestBuilder r0 = r0.apply(r3)     // Catch:{ NoSuchMethodError -> 0x03a5 }
            android.widget.ImageView r3 = r1.f11035z0     // Catch:{ NoSuchMethodError -> 0x03a5 }
            r0.into(r3)     // Catch:{ NoSuchMethodError -> 0x03a5 }
            goto L_0x0690
        L_0x03a5:
            com.clevertap.android.sdk.C3111h1.m14930d(r6)     // Catch:{ NoClassDefFoundError -> 0x068b }
            android.widget.ImageView r0 = r1.f11035z0     // Catch:{ NoClassDefFoundError -> 0x068b }
            android.content.Context r0 = r0.getContext()     // Catch:{ NoClassDefFoundError -> 0x068b }
            c.c.a.q r0 = p076c.p082c.p083a.C2232l.m11649c(r0)     // Catch:{ NoClassDefFoundError -> 0x068b }
            com.bumptech.glide.RequestBuilder r0 = r0.asGif()     // Catch:{ NoClassDefFoundError -> 0x068b }
            java.lang.String r3 = r11.mo12054j()     // Catch:{ NoClassDefFoundError -> 0x068b }
            com.bumptech.glide.RequestBuilder r0 = r0.load(r3)     // Catch:{ NoClassDefFoundError -> 0x068b }
            android.widget.ImageView r3 = r1.f11035z0     // Catch:{ NoClassDefFoundError -> 0x068b }
            r0.into(r3)     // Catch:{ NoClassDefFoundError -> 0x068b }
            goto L_0x0690
        L_0x03c5:
            boolean r0 = r11.mo12063s()     // Catch:{ NoClassDefFoundError -> 0x068b }
            if (r0 == 0) goto L_0x0486
            java.lang.String r0 = r11.mo12057m()     // Catch:{ NoClassDefFoundError -> 0x068b }
            boolean r0 = r0.isEmpty()     // Catch:{ NoClassDefFoundError -> 0x068b }
            if (r0 != 0) goto L_0x0447
            android.widget.RelativeLayout r0 = r1.f11023C0     // Catch:{ NoClassDefFoundError -> 0x068b }
            r0.setVisibility(r10)     // Catch:{ NoClassDefFoundError -> 0x068b }
            android.widget.ImageView r0 = r1.f11035z0     // Catch:{ NoClassDefFoundError -> 0x068b }
            r0.setVisibility(r10)     // Catch:{ NoClassDefFoundError -> 0x068b }
            int r0 = com.clevertap.android.sdk.CTInboxActivity.f10825R     // Catch:{ NoClassDefFoundError -> 0x068b }
            r3 = 2
            if (r0 != r3) goto L_0x03ec
            android.widget.ImageView r0 = r1.f11035z0     // Catch:{ NoClassDefFoundError -> 0x068b }
            android.widget.ImageView$ScaleType r3 = android.widget.ImageView.ScaleType.CENTER_CROP     // Catch:{ NoClassDefFoundError -> 0x068b }
            r0.setScaleType(r3)     // Catch:{ NoClassDefFoundError -> 0x068b }
            goto L_0x03f3
        L_0x03ec:
            android.widget.ImageView r0 = r1.f11035z0     // Catch:{ NoClassDefFoundError -> 0x068b }
            android.widget.ImageView$ScaleType r3 = android.widget.ImageView.ScaleType.FIT_CENTER     // Catch:{ NoClassDefFoundError -> 0x068b }
            r0.setScaleType(r3)     // Catch:{ NoClassDefFoundError -> 0x068b }
        L_0x03f3:
            android.widget.ImageView r0 = r1.f11035z0     // Catch:{ NoSuchMethodError -> 0x042b }
            android.content.Context r0 = r0.getContext()     // Catch:{ NoSuchMethodError -> 0x042b }
            c.c.a.q r0 = p076c.p082c.p083a.C2232l.m11649c(r0)     // Catch:{ NoSuchMethodError -> 0x042b }
            java.lang.String r3 = r11.mo12057m()     // Catch:{ NoSuchMethodError -> 0x042b }
            com.bumptech.glide.RequestBuilder r0 = r0.load(r3)     // Catch:{ NoSuchMethodError -> 0x042b }
            com.bumptech.glide.request.RequestOptions r3 = new com.bumptech.glide.request.RequestOptions     // Catch:{ NoSuchMethodError -> 0x042b }
            r3.<init>()     // Catch:{ NoSuchMethodError -> 0x042b }
            android.content.Context r5 = r1.f11033x0     // Catch:{ NoSuchMethodError -> 0x042b }
            int r5 = com.clevertap.android.sdk.C3238w1.m15655a(r5, r4)     // Catch:{ NoSuchMethodError -> 0x042b }
            com.bumptech.glide.request.BaseRequestOptions r3 = r3.placeholder(r5)     // Catch:{ NoSuchMethodError -> 0x042b }
            com.bumptech.glide.request.RequestOptions r3 = (com.bumptech.glide.request.RequestOptions) r3     // Catch:{ NoSuchMethodError -> 0x042b }
            android.content.Context r5 = r1.f11033x0     // Catch:{ NoSuchMethodError -> 0x042b }
            int r4 = com.clevertap.android.sdk.C3238w1.m15655a(r5, r4)     // Catch:{ NoSuchMethodError -> 0x042b }
            com.bumptech.glide.request.BaseRequestOptions r3 = r3.error(r4)     // Catch:{ NoSuchMethodError -> 0x042b }
            com.bumptech.glide.RequestBuilder r0 = r0.apply(r3)     // Catch:{ NoSuchMethodError -> 0x042b }
            android.widget.ImageView r3 = r1.f11035z0     // Catch:{ NoSuchMethodError -> 0x042b }
            r0.into(r3)     // Catch:{ NoSuchMethodError -> 0x042b }
            goto L_0x0690
        L_0x042b:
            com.clevertap.android.sdk.C3111h1.m14930d(r6)     // Catch:{ NoClassDefFoundError -> 0x068b }
            android.widget.ImageView r0 = r1.f11035z0     // Catch:{ NoClassDefFoundError -> 0x068b }
            android.content.Context r0 = r0.getContext()     // Catch:{ NoClassDefFoundError -> 0x068b }
            c.c.a.q r0 = p076c.p082c.p083a.C2232l.m11649c(r0)     // Catch:{ NoClassDefFoundError -> 0x068b }
            java.lang.String r3 = r11.mo12057m()     // Catch:{ NoClassDefFoundError -> 0x068b }
            com.bumptech.glide.RequestBuilder r0 = r0.load(r3)     // Catch:{ NoClassDefFoundError -> 0x068b }
            android.widget.ImageView r3 = r1.f11035z0     // Catch:{ NoClassDefFoundError -> 0x068b }
            r0.into(r3)     // Catch:{ NoClassDefFoundError -> 0x068b }
            goto L_0x0690
        L_0x0447:
            android.widget.RelativeLayout r0 = r1.f11023C0     // Catch:{ NoClassDefFoundError -> 0x068b }
            r0.setVisibility(r10)     // Catch:{ NoClassDefFoundError -> 0x068b }
            android.widget.ImageView r0 = r1.f11035z0     // Catch:{ NoClassDefFoundError -> 0x068b }
            r0.setVisibility(r10)     // Catch:{ NoClassDefFoundError -> 0x068b }
            int r0 = com.clevertap.android.sdk.CTInboxActivity.f10825R     // Catch:{ NoClassDefFoundError -> 0x068b }
            r3 = 2
            if (r0 != r3) goto L_0x045e
            android.widget.ImageView r0 = r1.f11035z0     // Catch:{ NoClassDefFoundError -> 0x068b }
            android.widget.ImageView$ScaleType r3 = android.widget.ImageView.ScaleType.CENTER_CROP     // Catch:{ NoClassDefFoundError -> 0x068b }
            r0.setScaleType(r3)     // Catch:{ NoClassDefFoundError -> 0x068b }
            goto L_0x0465
        L_0x045e:
            android.widget.ImageView r0 = r1.f11035z0     // Catch:{ NoClassDefFoundError -> 0x068b }
            android.widget.ImageView$ScaleType r3 = android.widget.ImageView.ScaleType.FIT_CENTER     // Catch:{ NoClassDefFoundError -> 0x068b }
            r0.setScaleType(r3)     // Catch:{ NoClassDefFoundError -> 0x068b }
        L_0x0465:
            android.content.Context r0 = r1.f11033x0     // Catch:{ NoClassDefFoundError -> 0x068b }
            int r0 = com.clevertap.android.sdk.C3238w1.m15655a(r0, r4)     // Catch:{ NoClassDefFoundError -> 0x068b }
            if (r0 == r5) goto L_0x0690
            android.widget.ImageView r3 = r1.f11035z0     // Catch:{ NoClassDefFoundError -> 0x068b }
            android.content.Context r3 = r3.getContext()     // Catch:{ NoClassDefFoundError -> 0x068b }
            c.c.a.q r3 = p076c.p082c.p083a.C2232l.m11649c(r3)     // Catch:{ NoClassDefFoundError -> 0x068b }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ NoClassDefFoundError -> 0x068b }
            com.bumptech.glide.RequestBuilder r0 = r3.load(r0)     // Catch:{ NoClassDefFoundError -> 0x068b }
            android.widget.ImageView r3 = r1.f11035z0     // Catch:{ NoClassDefFoundError -> 0x068b }
            r0.into(r3)     // Catch:{ NoClassDefFoundError -> 0x068b }
            goto L_0x0690
        L_0x0486:
            boolean r0 = r11.mo12060p()     // Catch:{ NoClassDefFoundError -> 0x068b }
            if (r0 == 0) goto L_0x0690
            android.widget.RelativeLayout r0 = r1.f11023C0     // Catch:{ NoClassDefFoundError -> 0x068b }
            r0.setVisibility(r10)     // Catch:{ NoClassDefFoundError -> 0x068b }
            android.widget.ImageView r0 = r1.f11035z0     // Catch:{ NoClassDefFoundError -> 0x068b }
            r0.setVisibility(r10)     // Catch:{ NoClassDefFoundError -> 0x068b }
            android.widget.ImageView r0 = r1.f11035z0     // Catch:{ NoClassDefFoundError -> 0x068b }
            android.widget.ImageView$ScaleType r4 = android.widget.ImageView.ScaleType.FIT_CENTER     // Catch:{ NoClassDefFoundError -> 0x068b }
            r0.setScaleType(r4)     // Catch:{ NoClassDefFoundError -> 0x068b }
            android.widget.ImageView r0 = r1.f11035z0     // Catch:{ NoClassDefFoundError -> 0x068b }
            int r4 = r17.mo8948D()     // Catch:{ NoClassDefFoundError -> 0x068b }
            r0.setBackgroundColor(r4)     // Catch:{ NoClassDefFoundError -> 0x068b }
            android.content.Context r0 = r1.f11033x0     // Catch:{ NoClassDefFoundError -> 0x068b }
            int r0 = com.clevertap.android.sdk.C3238w1.m15655a(r0, r3)     // Catch:{ NoClassDefFoundError -> 0x068b }
            if (r0 == r5) goto L_0x0690
            android.widget.ImageView r3 = r1.f11035z0     // Catch:{ NoClassDefFoundError -> 0x068b }
            android.content.Context r3 = r3.getContext()     // Catch:{ NoClassDefFoundError -> 0x068b }
            c.c.a.q r3 = p076c.p082c.p083a.C2232l.m11649c(r3)     // Catch:{ NoClassDefFoundError -> 0x068b }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ NoClassDefFoundError -> 0x068b }
            com.bumptech.glide.RequestBuilder r0 = r3.load(r0)     // Catch:{ NoClassDefFoundError -> 0x068b }
            android.widget.ImageView r3 = r1.f11035z0     // Catch:{ NoClassDefFoundError -> 0x068b }
            r0.into(r3)     // Catch:{ NoClassDefFoundError -> 0x068b }
            goto L_0x0690
        L_0x04c7:
            boolean r0 = r11.mo12062r()     // Catch:{ NoClassDefFoundError -> 0x068b }
            if (r0 == 0) goto L_0x0532
            android.widget.RelativeLayout r0 = r1.f11023C0     // Catch:{ NoClassDefFoundError -> 0x068b }
            r0.setVisibility(r10)     // Catch:{ NoClassDefFoundError -> 0x068b }
            android.widget.ImageView r0 = r1.f11034y0     // Catch:{ NoClassDefFoundError -> 0x068b }
            r0.setVisibility(r10)     // Catch:{ NoClassDefFoundError -> 0x068b }
            android.widget.ImageView r0 = r1.f11034y0     // Catch:{ NoClassDefFoundError -> 0x068b }
            android.widget.ImageView$ScaleType r3 = android.widget.ImageView.ScaleType.CENTER_CROP     // Catch:{ NoClassDefFoundError -> 0x068b }
            r0.setScaleType(r3)     // Catch:{ NoClassDefFoundError -> 0x068b }
            android.widget.ImageView r0 = r1.f11034y0     // Catch:{ NoSuchMethodError -> 0x0516 }
            android.content.Context r0 = r0.getContext()     // Catch:{ NoSuchMethodError -> 0x0516 }
            c.c.a.q r0 = p076c.p082c.p083a.C2232l.m11649c(r0)     // Catch:{ NoSuchMethodError -> 0x0516 }
            java.lang.String r3 = r11.mo12054j()     // Catch:{ NoSuchMethodError -> 0x0516 }
            com.bumptech.glide.RequestBuilder r0 = r0.load(r3)     // Catch:{ NoSuchMethodError -> 0x0516 }
            com.bumptech.glide.request.RequestOptions r3 = new com.bumptech.glide.request.RequestOptions     // Catch:{ NoSuchMethodError -> 0x0516 }
            r3.<init>()     // Catch:{ NoSuchMethodError -> 0x0516 }
            android.content.Context r4 = r1.f11033x0     // Catch:{ NoSuchMethodError -> 0x0516 }
            int r4 = com.clevertap.android.sdk.C3238w1.m15655a(r4, r7)     // Catch:{ NoSuchMethodError -> 0x0516 }
            com.bumptech.glide.request.BaseRequestOptions r3 = r3.placeholder(r4)     // Catch:{ NoSuchMethodError -> 0x0516 }
            com.bumptech.glide.request.RequestOptions r3 = (com.bumptech.glide.request.RequestOptions) r3     // Catch:{ NoSuchMethodError -> 0x0516 }
            android.content.Context r4 = r1.f11033x0     // Catch:{ NoSuchMethodError -> 0x0516 }
            int r4 = com.clevertap.android.sdk.C3238w1.m15655a(r4, r7)     // Catch:{ NoSuchMethodError -> 0x0516 }
            com.bumptech.glide.request.BaseRequestOptions r3 = r3.error(r4)     // Catch:{ NoSuchMethodError -> 0x0516 }
            com.bumptech.glide.RequestBuilder r0 = r0.apply(r3)     // Catch:{ NoSuchMethodError -> 0x0516 }
            android.widget.ImageView r3 = r1.f11034y0     // Catch:{ NoSuchMethodError -> 0x0516 }
            r0.into(r3)     // Catch:{ NoSuchMethodError -> 0x0516 }
            goto L_0x0690
        L_0x0516:
            com.clevertap.android.sdk.C3111h1.m14930d(r6)     // Catch:{ NoClassDefFoundError -> 0x068b }
            android.widget.ImageView r0 = r1.f11034y0     // Catch:{ NoClassDefFoundError -> 0x068b }
            android.content.Context r0 = r0.getContext()     // Catch:{ NoClassDefFoundError -> 0x068b }
            c.c.a.q r0 = p076c.p082c.p083a.C2232l.m11649c(r0)     // Catch:{ NoClassDefFoundError -> 0x068b }
            java.lang.String r3 = r11.mo12054j()     // Catch:{ NoClassDefFoundError -> 0x068b }
            com.bumptech.glide.RequestBuilder r0 = r0.load(r3)     // Catch:{ NoClassDefFoundError -> 0x068b }
            android.widget.ImageView r3 = r1.f11034y0     // Catch:{ NoClassDefFoundError -> 0x068b }
            r0.into(r3)     // Catch:{ NoClassDefFoundError -> 0x068b }
            goto L_0x0690
        L_0x0532:
            boolean r0 = r11.mo12061q()     // Catch:{ NoClassDefFoundError -> 0x068b }
            if (r0 == 0) goto L_0x05a5
            android.widget.RelativeLayout r0 = r1.f11023C0     // Catch:{ NoClassDefFoundError -> 0x068b }
            r0.setVisibility(r10)     // Catch:{ NoClassDefFoundError -> 0x068b }
            android.widget.ImageView r0 = r1.f11034y0     // Catch:{ NoClassDefFoundError -> 0x068b }
            r0.setVisibility(r10)     // Catch:{ NoClassDefFoundError -> 0x068b }
            android.widget.ImageView r0 = r1.f11034y0     // Catch:{ NoClassDefFoundError -> 0x068b }
            android.widget.ImageView$ScaleType r3 = android.widget.ImageView.ScaleType.FIT_CENTER     // Catch:{ NoClassDefFoundError -> 0x068b }
            r0.setScaleType(r3)     // Catch:{ NoClassDefFoundError -> 0x068b }
            android.widget.ImageView r0 = r1.f11034y0     // Catch:{ NoSuchMethodError -> 0x0585 }
            android.content.Context r0 = r0.getContext()     // Catch:{ NoSuchMethodError -> 0x0585 }
            c.c.a.q r0 = p076c.p082c.p083a.C2232l.m11649c(r0)     // Catch:{ NoSuchMethodError -> 0x0585 }
            com.bumptech.glide.RequestBuilder r0 = r0.asGif()     // Catch:{ NoSuchMethodError -> 0x0585 }
            java.lang.String r3 = r11.mo12054j()     // Catch:{ NoSuchMethodError -> 0x0585 }
            com.bumptech.glide.RequestBuilder r0 = r0.load(r3)     // Catch:{ NoSuchMethodError -> 0x0585 }
            com.bumptech.glide.request.RequestOptions r3 = new com.bumptech.glide.request.RequestOptions     // Catch:{ NoSuchMethodError -> 0x0585 }
            r3.<init>()     // Catch:{ NoSuchMethodError -> 0x0585 }
            android.content.Context r4 = r1.f11033x0     // Catch:{ NoSuchMethodError -> 0x0585 }
            int r4 = com.clevertap.android.sdk.C3238w1.m15655a(r4, r7)     // Catch:{ NoSuchMethodError -> 0x0585 }
            com.bumptech.glide.request.BaseRequestOptions r3 = r3.placeholder(r4)     // Catch:{ NoSuchMethodError -> 0x0585 }
            com.bumptech.glide.request.RequestOptions r3 = (com.bumptech.glide.request.RequestOptions) r3     // Catch:{ NoSuchMethodError -> 0x0585 }
            android.content.Context r4 = r1.f11033x0     // Catch:{ NoSuchMethodError -> 0x0585 }
            int r4 = com.clevertap.android.sdk.C3238w1.m15655a(r4, r7)     // Catch:{ NoSuchMethodError -> 0x0585 }
            com.bumptech.glide.request.BaseRequestOptions r3 = r3.error(r4)     // Catch:{ NoSuchMethodError -> 0x0585 }
            com.bumptech.glide.RequestBuilder r0 = r0.apply(r3)     // Catch:{ NoSuchMethodError -> 0x0585 }
            android.widget.ImageView r3 = r1.f11034y0     // Catch:{ NoSuchMethodError -> 0x0585 }
            r0.into(r3)     // Catch:{ NoSuchMethodError -> 0x0585 }
            goto L_0x0690
        L_0x0585:
            com.clevertap.android.sdk.C3111h1.m14930d(r6)     // Catch:{ NoClassDefFoundError -> 0x068b }
            android.widget.ImageView r0 = r1.f11034y0     // Catch:{ NoClassDefFoundError -> 0x068b }
            android.content.Context r0 = r0.getContext()     // Catch:{ NoClassDefFoundError -> 0x068b }
            c.c.a.q r0 = p076c.p082c.p083a.C2232l.m11649c(r0)     // Catch:{ NoClassDefFoundError -> 0x068b }
            com.bumptech.glide.RequestBuilder r0 = r0.asGif()     // Catch:{ NoClassDefFoundError -> 0x068b }
            java.lang.String r3 = r11.mo12054j()     // Catch:{ NoClassDefFoundError -> 0x068b }
            com.bumptech.glide.RequestBuilder r0 = r0.load(r3)     // Catch:{ NoClassDefFoundError -> 0x068b }
            android.widget.ImageView r3 = r1.f11034y0     // Catch:{ NoClassDefFoundError -> 0x068b }
            r0.into(r3)     // Catch:{ NoClassDefFoundError -> 0x068b }
            goto L_0x0690
        L_0x05a5:
            boolean r0 = r11.mo12063s()     // Catch:{ NoClassDefFoundError -> 0x068b }
            if (r0 == 0) goto L_0x064b
            java.lang.String r0 = r11.mo12057m()     // Catch:{ NoClassDefFoundError -> 0x068b }
            boolean r0 = r0.isEmpty()     // Catch:{ NoClassDefFoundError -> 0x068b }
            if (r0 != 0) goto L_0x061a
            android.widget.RelativeLayout r0 = r1.f11023C0     // Catch:{ NoClassDefFoundError -> 0x068b }
            r0.setVisibility(r10)     // Catch:{ NoClassDefFoundError -> 0x068b }
            android.widget.ImageView r0 = r1.f11034y0     // Catch:{ NoClassDefFoundError -> 0x068b }
            r0.setVisibility(r10)     // Catch:{ NoClassDefFoundError -> 0x068b }
            android.widget.ImageView r0 = r1.f11034y0     // Catch:{ NoClassDefFoundError -> 0x068b }
            android.widget.ImageView$ScaleType r3 = android.widget.ImageView.ScaleType.CENTER_CROP     // Catch:{ NoClassDefFoundError -> 0x068b }
            r0.setScaleType(r3)     // Catch:{ NoClassDefFoundError -> 0x068b }
            android.widget.ImageView r0 = r1.f11034y0     // Catch:{ NoSuchMethodError -> 0x05fe }
            android.content.Context r0 = r0.getContext()     // Catch:{ NoSuchMethodError -> 0x05fe }
            c.c.a.q r0 = p076c.p082c.p083a.C2232l.m11649c(r0)     // Catch:{ NoSuchMethodError -> 0x05fe }
            java.lang.String r3 = r11.mo12057m()     // Catch:{ NoSuchMethodError -> 0x05fe }
            com.bumptech.glide.RequestBuilder r0 = r0.load(r3)     // Catch:{ NoSuchMethodError -> 0x05fe }
            com.bumptech.glide.request.RequestOptions r3 = new com.bumptech.glide.request.RequestOptions     // Catch:{ NoSuchMethodError -> 0x05fe }
            r3.<init>()     // Catch:{ NoSuchMethodError -> 0x05fe }
            android.content.Context r5 = r1.f11033x0     // Catch:{ NoSuchMethodError -> 0x05fe }
            int r5 = com.clevertap.android.sdk.C3238w1.m15655a(r5, r4)     // Catch:{ NoSuchMethodError -> 0x05fe }
            com.bumptech.glide.request.BaseRequestOptions r3 = r3.placeholder(r5)     // Catch:{ NoSuchMethodError -> 0x05fe }
            com.bumptech.glide.request.RequestOptions r3 = (com.bumptech.glide.request.RequestOptions) r3     // Catch:{ NoSuchMethodError -> 0x05fe }
            android.content.Context r5 = r1.f11033x0     // Catch:{ NoSuchMethodError -> 0x05fe }
            int r4 = com.clevertap.android.sdk.C3238w1.m15655a(r5, r4)     // Catch:{ NoSuchMethodError -> 0x05fe }
            com.bumptech.glide.request.BaseRequestOptions r3 = r3.error(r4)     // Catch:{ NoSuchMethodError -> 0x05fe }
            com.bumptech.glide.RequestBuilder r0 = r0.apply(r3)     // Catch:{ NoSuchMethodError -> 0x05fe }
            android.widget.ImageView r3 = r1.f11034y0     // Catch:{ NoSuchMethodError -> 0x05fe }
            r0.into(r3)     // Catch:{ NoSuchMethodError -> 0x05fe }
            goto L_0x0690
        L_0x05fe:
            com.clevertap.android.sdk.C3111h1.m14930d(r6)     // Catch:{ NoClassDefFoundError -> 0x068b }
            android.widget.ImageView r0 = r1.f11034y0     // Catch:{ NoClassDefFoundError -> 0x068b }
            android.content.Context r0 = r0.getContext()     // Catch:{ NoClassDefFoundError -> 0x068b }
            c.c.a.q r0 = p076c.p082c.p083a.C2232l.m11649c(r0)     // Catch:{ NoClassDefFoundError -> 0x068b }
            java.lang.String r3 = r11.mo12057m()     // Catch:{ NoClassDefFoundError -> 0x068b }
            com.bumptech.glide.RequestBuilder r0 = r0.load(r3)     // Catch:{ NoClassDefFoundError -> 0x068b }
            android.widget.ImageView r3 = r1.f11034y0     // Catch:{ NoClassDefFoundError -> 0x068b }
            r0.into(r3)     // Catch:{ NoClassDefFoundError -> 0x068b }
            goto L_0x0690
        L_0x061a:
            android.widget.RelativeLayout r0 = r1.f11023C0     // Catch:{ NoClassDefFoundError -> 0x068b }
            r0.setVisibility(r10)     // Catch:{ NoClassDefFoundError -> 0x068b }
            android.widget.ImageView r0 = r1.f11034y0     // Catch:{ NoClassDefFoundError -> 0x068b }
            r0.setVisibility(r10)     // Catch:{ NoClassDefFoundError -> 0x068b }
            android.widget.ImageView r0 = r1.f11034y0     // Catch:{ NoClassDefFoundError -> 0x068b }
            android.widget.ImageView$ScaleType r3 = android.widget.ImageView.ScaleType.CENTER_CROP     // Catch:{ NoClassDefFoundError -> 0x068b }
            r0.setScaleType(r3)     // Catch:{ NoClassDefFoundError -> 0x068b }
            android.content.Context r0 = r1.f11033x0     // Catch:{ NoClassDefFoundError -> 0x068b }
            int r0 = com.clevertap.android.sdk.C3238w1.m15655a(r0, r4)     // Catch:{ NoClassDefFoundError -> 0x068b }
            if (r0 == r5) goto L_0x0690
            android.widget.ImageView r3 = r1.f11034y0     // Catch:{ NoClassDefFoundError -> 0x068b }
            android.content.Context r3 = r3.getContext()     // Catch:{ NoClassDefFoundError -> 0x068b }
            c.c.a.q r3 = p076c.p082c.p083a.C2232l.m11649c(r3)     // Catch:{ NoClassDefFoundError -> 0x068b }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ NoClassDefFoundError -> 0x068b }
            com.bumptech.glide.RequestBuilder r0 = r3.load(r0)     // Catch:{ NoClassDefFoundError -> 0x068b }
            android.widget.ImageView r3 = r1.f11034y0     // Catch:{ NoClassDefFoundError -> 0x068b }
            r0.into(r3)     // Catch:{ NoClassDefFoundError -> 0x068b }
            goto L_0x0690
        L_0x064b:
            boolean r0 = r11.mo12060p()     // Catch:{ NoClassDefFoundError -> 0x068b }
            if (r0 == 0) goto L_0x0690
            android.widget.RelativeLayout r0 = r1.f11023C0     // Catch:{ NoClassDefFoundError -> 0x068b }
            r0.setVisibility(r10)     // Catch:{ NoClassDefFoundError -> 0x068b }
            android.widget.ImageView r0 = r1.f11034y0     // Catch:{ NoClassDefFoundError -> 0x068b }
            r0.setVisibility(r10)     // Catch:{ NoClassDefFoundError -> 0x068b }
            android.widget.ImageView r0 = r1.f11034y0     // Catch:{ NoClassDefFoundError -> 0x068b }
            android.widget.ImageView$ScaleType r4 = android.widget.ImageView.ScaleType.CENTER_CROP     // Catch:{ NoClassDefFoundError -> 0x068b }
            r0.setScaleType(r4)     // Catch:{ NoClassDefFoundError -> 0x068b }
            android.widget.ImageView r0 = r1.f11034y0     // Catch:{ NoClassDefFoundError -> 0x068b }
            int r4 = r17.mo8948D()     // Catch:{ NoClassDefFoundError -> 0x068b }
            r0.setBackgroundColor(r4)     // Catch:{ NoClassDefFoundError -> 0x068b }
            android.content.Context r0 = r1.f11033x0     // Catch:{ NoClassDefFoundError -> 0x068b }
            int r0 = com.clevertap.android.sdk.C3238w1.m15655a(r0, r3)     // Catch:{ NoClassDefFoundError -> 0x068b }
            if (r0 == r5) goto L_0x0690
            android.widget.ImageView r3 = r1.f11034y0     // Catch:{ NoClassDefFoundError -> 0x068b }
            android.content.Context r3 = r3.getContext()     // Catch:{ NoClassDefFoundError -> 0x068b }
            c.c.a.q r3 = p076c.p082c.p083a.C2232l.m11649c(r3)     // Catch:{ NoClassDefFoundError -> 0x068b }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ NoClassDefFoundError -> 0x068b }
            com.bumptech.glide.RequestBuilder r0 = r3.load(r0)     // Catch:{ NoClassDefFoundError -> 0x068b }
            android.widget.ImageView r3 = r1.f11034y0     // Catch:{ NoClassDefFoundError -> 0x068b }
            r0.into(r3)     // Catch:{ NoClassDefFoundError -> 0x068b }
            goto L_0x0690
        L_0x068b:
            java.lang.String r0 = "CleverTap SDK requires Glide dependency. Please refer CleverTap Documentation for more info"
            com.clevertap.android.sdk.C3111h1.m14930d(r0)
        L_0x0690:
            android.content.Context r0 = r1.f11033x0
            android.content.res.Resources r0 = r0.getResources()
            int r3 = com.clevertap.android.sdk.CTInboxActivity.f10825R
            r4 = 2
            if (r3 != r4) goto L_0x06aa
            android.util.DisplayMetrics r2 = r0.getDisplayMetrics()
            int r2 = r2.heightPixels
            int r2 = r2 / r4
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            int r0 = r0.widthPixels
            int r0 = r0 / r4
            goto L_0x06c5
        L_0x06aa:
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            int r0 = r0.widthPixels
            java.lang.String r3 = r18.mo12024r()
            boolean r2 = r3.equalsIgnoreCase(r2)
            if (r2 == 0) goto L_0x06c4
            float r2 = (float) r0
            r3 = 1058013184(0x3f100000, float:0.5625)
            float r2 = r2 * r3
            int r2 = java.lang.Math.round(r2)
            goto L_0x06c5
        L_0x06c4:
            r2 = r0
        L_0x06c5:
            android.widget.FrameLayout r3 = r1.f11021A0
            android.widget.RelativeLayout$LayoutParams r4 = new android.widget.RelativeLayout$LayoutParams
            r4.<init>(r0, r2)
            r3.setLayoutParams(r4)
            com.clevertap.android.sdk.n0$a r0 = new com.clevertap.android.sdk.n0$a
            r2 = r20
            r0.<init>(r2)
            android.os.Handler r3 = new android.os.Handler
            r3.<init>()
            r4 = 2000(0x7d0, double:9.88E-321)
            r3.postDelayed(r0, r4)
            if (r9 == 0) goto L_0x06f4
            android.widget.RelativeLayout r0 = r1.f11029t0
            com.clevertap.android.sdk.e0 r10 = new com.clevertap.android.sdk.e0
            r6 = 0
            r7 = 0
            r3 = r10
            r4 = r20
            r5 = r18
            r8 = r9
            r3.<init>(r4, r5, r6, r7, r8)
            r0.setOnClickListener(r10)
        L_0x06f4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.clevertap.android.sdk.C3142n0.mo12219a(com.clevertap.android.sdk.CTInboxMessage, com.clevertap.android.sdk.g0, int):void");
    }
}
