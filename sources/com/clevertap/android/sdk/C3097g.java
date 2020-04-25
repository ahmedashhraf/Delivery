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

/* renamed from: com.clevertap.android.sdk.g */
/* compiled from: CTIconMessageViewHolder */
class C3097g extends C3080d0 {
    /* access modifiers changed from: private */

    /* renamed from: H0 */
    public ImageView f11104H0;

    /* renamed from: I0 */
    private ImageView f11105I0;

    /* renamed from: J0 */
    private Button f11106J0;

    /* renamed from: K0 */
    private Button f11107K0;

    /* renamed from: L0 */
    private Button f11108L0;

    /* renamed from: M0 */
    private TextView f11109M0;

    /* renamed from: N0 */
    private TextView f11110N0;

    /* renamed from: O0 */
    private TextView f11111O0;

    /* renamed from: P0 */
    private RelativeLayout f11112P0;

    /* renamed from: Q0 */
    private LinearLayout f11113Q0;

    /* renamed from: com.clevertap.android.sdk.g$a */
    /* compiled from: CTIconMessageViewHolder */
    class C3098a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ int f11114a;

        /* renamed from: com.clevertap.android.sdk.g$a$a */
        /* compiled from: CTIconMessageViewHolder */
        class C3099a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C3100g0 f11116a;

            C3099a(C3100g0 g0Var) {
                this.f11116a = g0Var;
            }

            public void run() {
                if (C3097g.this.f11104H0.getVisibility() == 0) {
                    this.f11116a.mo12271b(null, C3098a.this.f11114a);
                }
                C3097g.this.f11104H0.setVisibility(8);
            }
        }

        C3098a(int i) {
            this.f11114a = i;
        }

        public void run() {
            C3100g0 E = C3097g.this.mo12222E();
            if (E != null) {
                C1376c activity = E.getActivity();
                if (activity != null) {
                    activity.runOnUiThread(new C3099a(E));
                }
            }
        }
    }

    C3097g(@C0193h0 View view) {
        super(view);
        view.setTag(this);
        this.f11109M0 = (TextView) view.findViewById(C3058R.C3061id.messageTitle);
        this.f11110N0 = (TextView) view.findViewById(C3058R.C3061id.messageText);
        this.f11034y0 = (ImageView) view.findViewById(C3058R.C3061id.media_image);
        this.f11105I0 = (ImageView) view.findViewById(C3058R.C3061id.image_icon);
        this.f11104H0 = (ImageView) view.findViewById(C3058R.C3061id.read_circle);
        this.f11111O0 = (TextView) view.findViewById(C3058R.C3061id.timestamp);
        this.f11106J0 = (Button) view.findViewById(C3058R.C3061id.cta_button_1);
        this.f11107K0 = (Button) view.findViewById(C3058R.C3061id.cta_button_2);
        this.f11108L0 = (Button) view.findViewById(C3058R.C3061id.cta_button_3);
        this.f11032w0 = (FrameLayout) view.findViewById(C3058R.C3061id.icon_message_frame_layout);
        this.f11035z0 = (ImageView) view.findViewById(C3058R.C3061id.square_media_image);
        this.f11112P0 = (RelativeLayout) view.findViewById(C3058R.C3061id.click_relative_layout);
        this.f11113Q0 = (LinearLayout) view.findViewById(C3058R.C3061id.cta_linear_layout);
        this.f11021A0 = (FrameLayout) view.findViewById(C3058R.C3061id.icon_progress_frame_layout);
        this.f11023C0 = (RelativeLayout) view.findViewById(C3058R.C3061id.media_layout);
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Can't wrap try/catch for region: R(12:87|88|89|90|91|120|(0)(0)|127|128|129|(0)(0)|(0)(0)) */
    /* JADX WARNING: Can't wrap try/catch for region: R(12:94|95|96|97|98|120|(0)(0)|127|128|129|(0)(0)|(0)(0)) */
    /* JADX WARNING: Can't wrap try/catch for region: R(5:103|104|105|106|107) */
    /* JADX WARNING: Can't wrap try/catch for region: R(5:131|132|133|134|135) */
    /* JADX WARNING: Can't wrap try/catch for region: R(5:47|48|49|50|51) */
    /* JADX WARNING: Can't wrap try/catch for region: R(5:54|55|56|57|58) */
    /* JADX WARNING: Can't wrap try/catch for region: R(7:63|64|(2:66|67)(1:68)|69|70|71|72) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:106:0x0621 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:134:0x074a */
    /* JADX WARNING: Missing exception handler attribute for start block: B:50:0x0348 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:57:0x03b7 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:71:0x0441 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:90:0x0537 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:97:0x05a7 */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x06be  */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x06cd  */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x070d A[Catch:{ NoClassDefFoundError -> 0x076d }] */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x0765 A[Catch:{ NoClassDefFoundError -> 0x076d }] */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x0772  */
    /* JADX WARNING: Removed duplicated region for block: B:142:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x02f3  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x04e6 A[Catch:{ NoClassDefFoundError -> 0x06b1 }] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:57:0x03b7=Splitter:B:57:0x03b7, B:50:0x0348=Splitter:B:50:0x0348} */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:71:0x0441=Splitter:B:71:0x0441, B:106:0x0621=Splitter:B:106:0x0621, B:90:0x0537=Splitter:B:90:0x0537, B:97:0x05a7=Splitter:B:97:0x05a7} */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo12219a(com.clevertap.android.sdk.CTInboxMessage r20, com.clevertap.android.sdk.C3100g0 r21, int r22) {
        /*
            r19 = this;
            r1 = r19
            java.lang.String r2 = "l"
            java.lang.String r3 = "CleverTap SDK requires Glide dependency. Please refer CleverTap Documentation for more info"
            java.lang.String r4 = "CleverTap SDK requires Glide v4.9.0 or above. Please refer CleverTap Documentation for more info"
            java.lang.String r5 = "ct_image"
            super.mo12219a(r20, r21, r22)
            com.clevertap.android.sdk.g0 r12 = r19.mo12222E()
            java.util.ArrayList r0 = r20.mo12022p()
            r13 = 0
            java.lang.Object r0 = r0.get(r13)
            r14 = r0
            com.clevertap.android.sdk.CTInboxMessageContent r14 = (com.clevertap.android.sdk.CTInboxMessageContent) r14
            android.widget.TextView r0 = r1.f11109M0
            java.lang.String r6 = r14.mo12058n()
            r0.setText(r6)
            android.widget.TextView r0 = r1.f11109M0
            java.lang.String r6 = r14.mo12059o()
            int r6 = android.graphics.Color.parseColor(r6)
            r0.setTextColor(r6)
            android.widget.TextView r0 = r1.f11110N0
            java.lang.String r6 = r14.mo12055k()
            r0.setText(r6)
            android.widget.TextView r0 = r1.f11110N0
            java.lang.String r6 = r14.mo12056l()
            int r6 = android.graphics.Color.parseColor(r6)
            r0.setTextColor(r6)
            android.widget.RelativeLayout r0 = r1.f11112P0
            java.lang.String r6 = r20.mo12012b()
            int r6 = android.graphics.Color.parseColor(r6)
            r0.setBackgroundColor(r6)
            long r6 = r20.mo12019m()
            java.lang.String r0 = r1.mo12228a(r6)
            android.widget.TextView r6 = r1.f11111O0
            r6.setText(r0)
            android.widget.TextView r0 = r1.f11111O0
            java.lang.String r6 = r14.mo12059o()
            int r6 = android.graphics.Color.parseColor(r6)
            r0.setTextColor(r6)
            boolean r0 = r20.mo12029w()
            r15 = 8
            if (r0 == 0) goto L_0x007e
            android.widget.ImageView r0 = r1.f11104H0
            r0.setVisibility(r15)
            goto L_0x0083
        L_0x007e:
            android.widget.ImageView r0 = r1.f11104H0
            r0.setVisibility(r13)
        L_0x0083:
            android.widget.FrameLayout r0 = r1.f11032w0
            r0.setVisibility(r15)
            org.json.JSONArray r0 = r14.mo12052i()
            r11 = 1
            r10 = 2
            if (r0 == 0) goto L_0x0293
            android.widget.LinearLayout r6 = r1.f11113Q0
            r6.setVisibility(r13)
            int r6 = r0.length()
            if (r6 == r11) goto L_0x0224
            if (r6 == r10) goto L_0x0187
            r7 = 3
            if (r6 == r7) goto L_0x00a2
            goto L_0x0290
        L_0x00a2:
            org.json.JSONObject r9 = r0.getJSONObject(r13)     // Catch:{ JSONException -> 0x0277 }
            android.widget.Button r6 = r1.f11106J0     // Catch:{ JSONException -> 0x0277 }
            r6.setVisibility(r13)     // Catch:{ JSONException -> 0x0277 }
            android.widget.Button r6 = r1.f11106J0     // Catch:{ JSONException -> 0x0277 }
            java.lang.String r7 = r14.mo12042d(r9)     // Catch:{ JSONException -> 0x0277 }
            r6.setText(r7)     // Catch:{ JSONException -> 0x0277 }
            android.widget.Button r6 = r1.f11106J0     // Catch:{ JSONException -> 0x0277 }
            java.lang.String r7 = r14.mo12038b(r9)     // Catch:{ JSONException -> 0x0277 }
            int r7 = android.graphics.Color.parseColor(r7)     // Catch:{ JSONException -> 0x0277 }
            r6.setTextColor(r7)     // Catch:{ JSONException -> 0x0277 }
            android.widget.Button r6 = r1.f11106J0     // Catch:{ JSONException -> 0x0277 }
            java.lang.String r7 = r14.mo12034a(r9)     // Catch:{ JSONException -> 0x0277 }
            int r7 = android.graphics.Color.parseColor(r7)     // Catch:{ JSONException -> 0x0277 }
            r6.setBackgroundColor(r7)     // Catch:{ JSONException -> 0x0277 }
            org.json.JSONObject r8 = r0.getJSONObject(r11)     // Catch:{ JSONException -> 0x0277 }
            android.widget.Button r6 = r1.f11107K0     // Catch:{ JSONException -> 0x0277 }
            r6.setVisibility(r13)     // Catch:{ JSONException -> 0x0277 }
            android.widget.Button r6 = r1.f11107K0     // Catch:{ JSONException -> 0x0277 }
            java.lang.String r7 = r14.mo12042d(r8)     // Catch:{ JSONException -> 0x0277 }
            r6.setText(r7)     // Catch:{ JSONException -> 0x0277 }
            android.widget.Button r6 = r1.f11107K0     // Catch:{ JSONException -> 0x0277 }
            java.lang.String r7 = r14.mo12038b(r8)     // Catch:{ JSONException -> 0x0277 }
            int r7 = android.graphics.Color.parseColor(r7)     // Catch:{ JSONException -> 0x0277 }
            r6.setTextColor(r7)     // Catch:{ JSONException -> 0x0277 }
            android.widget.Button r6 = r1.f11107K0     // Catch:{ JSONException -> 0x0277 }
            java.lang.String r7 = r14.mo12034a(r8)     // Catch:{ JSONException -> 0x0277 }
            int r7 = android.graphics.Color.parseColor(r7)     // Catch:{ JSONException -> 0x0277 }
            r6.setBackgroundColor(r7)     // Catch:{ JSONException -> 0x0277 }
            org.json.JSONObject r0 = r0.getJSONObject(r10)     // Catch:{ JSONException -> 0x0277 }
            android.widget.Button r6 = r1.f11108L0     // Catch:{ JSONException -> 0x0277 }
            r6.setVisibility(r13)     // Catch:{ JSONException -> 0x0277 }
            android.widget.Button r6 = r1.f11108L0     // Catch:{ JSONException -> 0x0277 }
            java.lang.String r7 = r14.mo12042d(r0)     // Catch:{ JSONException -> 0x0277 }
            r6.setText(r7)     // Catch:{ JSONException -> 0x0277 }
            android.widget.Button r6 = r1.f11108L0     // Catch:{ JSONException -> 0x0277 }
            java.lang.String r7 = r14.mo12038b(r0)     // Catch:{ JSONException -> 0x0277 }
            int r7 = android.graphics.Color.parseColor(r7)     // Catch:{ JSONException -> 0x0277 }
            r6.setTextColor(r7)     // Catch:{ JSONException -> 0x0277 }
            android.widget.Button r6 = r1.f11108L0     // Catch:{ JSONException -> 0x0277 }
            java.lang.String r7 = r14.mo12034a(r0)     // Catch:{ JSONException -> 0x0277 }
            int r7 = android.graphics.Color.parseColor(r7)     // Catch:{ JSONException -> 0x0277 }
            r6.setBackgroundColor(r7)     // Catch:{ JSONException -> 0x0277 }
            if (r12 == 0) goto L_0x0290
            android.widget.Button r7 = r1.f11106J0     // Catch:{ JSONException -> 0x0277 }
            com.clevertap.android.sdk.e0 r6 = new com.clevertap.android.sdk.e0     // Catch:{ JSONException -> 0x0277 }
            android.widget.Button r10 = r1.f11106J0     // Catch:{ JSONException -> 0x0277 }
            java.lang.CharSequence r10 = r10.getText()     // Catch:{ JSONException -> 0x0277 }
            java.lang.String r10 = r10.toString()     // Catch:{ JSONException -> 0x0277 }
            r16 = r6
            r6 = r16
            r15 = r7
            r7 = r22
            r17 = r8
            r8 = r20
            r18 = r9
            r9 = r10
            r10 = r18
            r11 = r12
            r6.<init>(r7, r8, r9, r10, r11)     // Catch:{ JSONException -> 0x0277 }
            r15.setOnClickListener(r6)     // Catch:{ JSONException -> 0x0277 }
            android.widget.Button r15 = r1.f11107K0     // Catch:{ JSONException -> 0x0277 }
            com.clevertap.android.sdk.e0 r11 = new com.clevertap.android.sdk.e0     // Catch:{ JSONException -> 0x0277 }
            android.widget.Button r6 = r1.f11107K0     // Catch:{ JSONException -> 0x0277 }
            java.lang.CharSequence r6 = r6.getText()     // Catch:{ JSONException -> 0x0277 }
            java.lang.String r9 = r6.toString()     // Catch:{ JSONException -> 0x0277 }
            r6 = r11
            r7 = r22
            r8 = r20
            r10 = r17
            r13 = r11
            r11 = r12
            r6.<init>(r7, r8, r9, r10, r11)     // Catch:{ JSONException -> 0x0277 }
            r15.setOnClickListener(r13)     // Catch:{ JSONException -> 0x0277 }
            android.widget.Button r13 = r1.f11108L0     // Catch:{ JSONException -> 0x0277 }
            com.clevertap.android.sdk.e0 r15 = new com.clevertap.android.sdk.e0     // Catch:{ JSONException -> 0x0277 }
            android.widget.Button r6 = r1.f11108L0     // Catch:{ JSONException -> 0x0277 }
            java.lang.CharSequence r6 = r6.getText()     // Catch:{ JSONException -> 0x0277 }
            java.lang.String r9 = r6.toString()     // Catch:{ JSONException -> 0x0277 }
            r6 = r15
            r7 = r22
            r8 = r20
            r10 = r0
            r11 = r12
            r6.<init>(r7, r8, r9, r10, r11)     // Catch:{ JSONException -> 0x0277 }
            r13.setOnClickListener(r15)     // Catch:{ JSONException -> 0x0277 }
            goto L_0x0290
        L_0x0187:
            r6 = 0
            org.json.JSONObject r10 = r0.getJSONObject(r6)     // Catch:{ JSONException -> 0x0277 }
            android.widget.Button r7 = r1.f11106J0     // Catch:{ JSONException -> 0x0277 }
            r7.setVisibility(r6)     // Catch:{ JSONException -> 0x0277 }
            android.widget.Button r6 = r1.f11106J0     // Catch:{ JSONException -> 0x0277 }
            java.lang.String r7 = r14.mo12042d(r10)     // Catch:{ JSONException -> 0x0277 }
            r6.setText(r7)     // Catch:{ JSONException -> 0x0277 }
            android.widget.Button r6 = r1.f11106J0     // Catch:{ JSONException -> 0x0277 }
            java.lang.String r7 = r14.mo12038b(r10)     // Catch:{ JSONException -> 0x0277 }
            int r7 = android.graphics.Color.parseColor(r7)     // Catch:{ JSONException -> 0x0277 }
            r6.setTextColor(r7)     // Catch:{ JSONException -> 0x0277 }
            android.widget.Button r6 = r1.f11106J0     // Catch:{ JSONException -> 0x0277 }
            java.lang.String r7 = r14.mo12034a(r10)     // Catch:{ JSONException -> 0x0277 }
            int r7 = android.graphics.Color.parseColor(r7)     // Catch:{ JSONException -> 0x0277 }
            r6.setBackgroundColor(r7)     // Catch:{ JSONException -> 0x0277 }
            r13 = 1
            org.json.JSONObject r0 = r0.getJSONObject(r13)     // Catch:{ JSONException -> 0x0277 }
            android.widget.Button r6 = r1.f11107K0     // Catch:{ JSONException -> 0x0277 }
            r7 = 0
            r6.setVisibility(r7)     // Catch:{ JSONException -> 0x0277 }
            android.widget.Button r6 = r1.f11107K0     // Catch:{ JSONException -> 0x0277 }
            java.lang.String r7 = r14.mo12042d(r0)     // Catch:{ JSONException -> 0x0277 }
            r6.setText(r7)     // Catch:{ JSONException -> 0x0277 }
            android.widget.Button r6 = r1.f11107K0     // Catch:{ JSONException -> 0x0277 }
            java.lang.String r7 = r14.mo12038b(r0)     // Catch:{ JSONException -> 0x0277 }
            int r7 = android.graphics.Color.parseColor(r7)     // Catch:{ JSONException -> 0x0277 }
            r6.setTextColor(r7)     // Catch:{ JSONException -> 0x0277 }
            android.widget.Button r6 = r1.f11107K0     // Catch:{ JSONException -> 0x0277 }
            java.lang.String r7 = r14.mo12034a(r0)     // Catch:{ JSONException -> 0x0277 }
            int r7 = android.graphics.Color.parseColor(r7)     // Catch:{ JSONException -> 0x0277 }
            r6.setBackgroundColor(r7)     // Catch:{ JSONException -> 0x0277 }
            android.widget.Button r6 = r1.f11106J0     // Catch:{ JSONException -> 0x0277 }
            android.widget.Button r7 = r1.f11107K0     // Catch:{ JSONException -> 0x0277 }
            android.widget.Button r8 = r1.f11108L0     // Catch:{ JSONException -> 0x0277 }
            r1.mo12229a(r6, r7, r8)     // Catch:{ JSONException -> 0x0277 }
            if (r12 == 0) goto L_0x0290
            android.widget.Button r15 = r1.f11106J0     // Catch:{ JSONException -> 0x0277 }
            com.clevertap.android.sdk.e0 r11 = new com.clevertap.android.sdk.e0     // Catch:{ JSONException -> 0x0277 }
            android.widget.Button r6 = r1.f11106J0     // Catch:{ JSONException -> 0x0277 }
            java.lang.CharSequence r6 = r6.getText()     // Catch:{ JSONException -> 0x0277 }
            java.lang.String r9 = r6.toString()     // Catch:{ JSONException -> 0x0277 }
            r6 = r11
            r7 = r22
            r8 = r20
            r13 = r11
            r11 = r12
            r6.<init>(r7, r8, r9, r10, r11)     // Catch:{ JSONException -> 0x0277 }
            r15.setOnClickListener(r13)     // Catch:{ JSONException -> 0x0277 }
            android.widget.Button r13 = r1.f11107K0     // Catch:{ JSONException -> 0x0277 }
            com.clevertap.android.sdk.e0 r15 = new com.clevertap.android.sdk.e0     // Catch:{ JSONException -> 0x0277 }
            android.widget.Button r6 = r1.f11107K0     // Catch:{ JSONException -> 0x0277 }
            java.lang.CharSequence r6 = r6.getText()     // Catch:{ JSONException -> 0x0277 }
            java.lang.String r9 = r6.toString()     // Catch:{ JSONException -> 0x0277 }
            r6 = r15
            r7 = r22
            r8 = r20
            r10 = r0
            r11 = r12
            r6.<init>(r7, r8, r9, r10, r11)     // Catch:{ JSONException -> 0x0277 }
            r13.setOnClickListener(r15)     // Catch:{ JSONException -> 0x0277 }
            goto L_0x0290
        L_0x0224:
            r6 = 0
            org.json.JSONObject r10 = r0.getJSONObject(r6)     // Catch:{ JSONException -> 0x0277 }
            android.widget.Button r0 = r1.f11106J0     // Catch:{ JSONException -> 0x0277 }
            r0.setVisibility(r6)     // Catch:{ JSONException -> 0x0277 }
            android.widget.Button r0 = r1.f11106J0     // Catch:{ JSONException -> 0x0277 }
            java.lang.String r6 = r14.mo12042d(r10)     // Catch:{ JSONException -> 0x0277 }
            r0.setText(r6)     // Catch:{ JSONException -> 0x0277 }
            android.widget.Button r0 = r1.f11106J0     // Catch:{ JSONException -> 0x0277 }
            java.lang.String r6 = r14.mo12038b(r10)     // Catch:{ JSONException -> 0x0277 }
            int r6 = android.graphics.Color.parseColor(r6)     // Catch:{ JSONException -> 0x0277 }
            r0.setTextColor(r6)     // Catch:{ JSONException -> 0x0277 }
            android.widget.Button r0 = r1.f11106J0     // Catch:{ JSONException -> 0x0277 }
            java.lang.String r6 = r14.mo12034a(r10)     // Catch:{ JSONException -> 0x0277 }
            int r6 = android.graphics.Color.parseColor(r6)     // Catch:{ JSONException -> 0x0277 }
            r0.setBackgroundColor(r6)     // Catch:{ JSONException -> 0x0277 }
            android.widget.Button r0 = r1.f11106J0     // Catch:{ JSONException -> 0x0277 }
            android.widget.Button r6 = r1.f11107K0     // Catch:{ JSONException -> 0x0277 }
            android.widget.Button r7 = r1.f11108L0     // Catch:{ JSONException -> 0x0277 }
            r1.mo12231b(r0, r6, r7)     // Catch:{ JSONException -> 0x0277 }
            if (r12 == 0) goto L_0x0290
            android.widget.Button r0 = r1.f11106J0     // Catch:{ JSONException -> 0x0277 }
            com.clevertap.android.sdk.e0 r13 = new com.clevertap.android.sdk.e0     // Catch:{ JSONException -> 0x0277 }
            android.widget.Button r6 = r1.f11106J0     // Catch:{ JSONException -> 0x0277 }
            java.lang.CharSequence r6 = r6.getText()     // Catch:{ JSONException -> 0x0277 }
            java.lang.String r9 = r6.toString()     // Catch:{ JSONException -> 0x0277 }
            r6 = r13
            r7 = r22
            r8 = r20
            r11 = r12
            r6.<init>(r7, r8, r9, r10, r11)     // Catch:{ JSONException -> 0x0277 }
            r0.setOnClickListener(r13)     // Catch:{ JSONException -> 0x0277 }
            goto L_0x0290
        L_0x0277:
            r0 = move-exception
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "Error parsing CTA JSON - "
            r6.append(r7)
            java.lang.String r0 = r0.getLocalizedMessage()
            r6.append(r0)
            java.lang.String r0 = r6.toString()
            com.clevertap.android.sdk.C3111h1.m14930d(r0)
        L_0x0290:
            r6 = 8
            goto L_0x029a
        L_0x0293:
            android.widget.LinearLayout r0 = r1.f11113Q0
            r6 = 8
            r0.setVisibility(r6)
        L_0x029a:
            android.widget.ImageView r0 = r1.f11034y0
            r0.setVisibility(r6)
            android.widget.ImageView r0 = r1.f11034y0
            java.lang.String r7 = r20.mo12012b()
            int r7 = android.graphics.Color.parseColor(r7)
            r0.setBackgroundColor(r7)
            android.widget.ImageView r0 = r1.f11035z0
            r0.setVisibility(r6)
            android.widget.ImageView r0 = r1.f11035z0
            java.lang.String r7 = r20.mo12012b()
            int r7 = android.graphics.Color.parseColor(r7)
            r0.setBackgroundColor(r7)
            android.widget.RelativeLayout r0 = r1.f11023C0
            r0.setVisibility(r6)
            android.widget.FrameLayout r0 = r1.f11021A0
            r0.setVisibility(r6)
            java.lang.String r0 = r20.mo12024r()     // Catch:{ NoClassDefFoundError -> 0x06b0 }
            int r6 = r0.hashCode()     // Catch:{ NoClassDefFoundError -> 0x06b0 }
            r7 = 108(0x6c, float:1.51E-43)
            r13 = -1
            if (r6 == r7) goto L_0x02e4
            r7 = 112(0x70, float:1.57E-43)
            if (r6 == r7) goto L_0x02da
            goto L_0x02ec
        L_0x02da:
            java.lang.String r6 = "p"
            boolean r0 = r0.equals(r6)     // Catch:{ NoClassDefFoundError -> 0x06b0 }
            if (r0 == 0) goto L_0x02ec
            r0 = 1
            goto L_0x02ed
        L_0x02e4:
            boolean r0 = r0.equals(r2)     // Catch:{ NoClassDefFoundError -> 0x06b0 }
            if (r0 == 0) goto L_0x02ec
            r0 = 0
            goto L_0x02ed
        L_0x02ec:
            r0 = -1
        L_0x02ed:
            java.lang.String r6 = "ct_audio"
            java.lang.String r7 = "ct_video_1"
            if (r0 == 0) goto L_0x04e6
            r8 = 1
            if (r0 == r8) goto L_0x02f9
        L_0x02f6:
            r8 = 2
            goto L_0x06b4
        L_0x02f9:
            boolean r0 = r14.mo12062r()     // Catch:{ NoClassDefFoundError -> 0x06b0 }
            if (r0 == 0) goto L_0x0363
            android.widget.RelativeLayout r0 = r1.f11023C0     // Catch:{ NoClassDefFoundError -> 0x06b0 }
            r6 = 0
            r0.setVisibility(r6)     // Catch:{ NoClassDefFoundError -> 0x06b0 }
            android.widget.ImageView r0 = r1.f11035z0     // Catch:{ NoClassDefFoundError -> 0x06b0 }
            r0.setVisibility(r6)     // Catch:{ NoClassDefFoundError -> 0x06b0 }
            android.widget.ImageView r0 = r1.f11035z0     // Catch:{ NoClassDefFoundError -> 0x06b0 }
            android.widget.ImageView$ScaleType r6 = android.widget.ImageView.ScaleType.CENTER_CROP     // Catch:{ NoClassDefFoundError -> 0x06b0 }
            r0.setScaleType(r6)     // Catch:{ NoClassDefFoundError -> 0x06b0 }
            android.widget.ImageView r0 = r1.f11035z0     // Catch:{ NoSuchMethodError -> 0x0348 }
            android.content.Context r0 = r0.getContext()     // Catch:{ NoSuchMethodError -> 0x0348 }
            c.c.a.q r0 = p076c.p082c.p083a.C2232l.m11649c(r0)     // Catch:{ NoSuchMethodError -> 0x0348 }
            java.lang.String r6 = r14.mo12054j()     // Catch:{ NoSuchMethodError -> 0x0348 }
            com.bumptech.glide.RequestBuilder r0 = r0.load(r6)     // Catch:{ NoSuchMethodError -> 0x0348 }
            com.bumptech.glide.request.RequestOptions r6 = new com.bumptech.glide.request.RequestOptions     // Catch:{ NoSuchMethodError -> 0x0348 }
            r6.<init>()     // Catch:{ NoSuchMethodError -> 0x0348 }
            android.content.Context r7 = r1.f11033x0     // Catch:{ NoSuchMethodError -> 0x0348 }
            int r7 = com.clevertap.android.sdk.C3238w1.m15655a(r7, r5)     // Catch:{ NoSuchMethodError -> 0x0348 }
            com.bumptech.glide.request.BaseRequestOptions r6 = r6.placeholder(r7)     // Catch:{ NoSuchMethodError -> 0x0348 }
            com.bumptech.glide.request.RequestOptions r6 = (com.bumptech.glide.request.RequestOptions) r6     // Catch:{ NoSuchMethodError -> 0x0348 }
            android.content.Context r7 = r1.f11033x0     // Catch:{ NoSuchMethodError -> 0x0348 }
            int r7 = com.clevertap.android.sdk.C3238w1.m15655a(r7, r5)     // Catch:{ NoSuchMethodError -> 0x0348 }
            com.bumptech.glide.request.BaseRequestOptions r6 = r6.error(r7)     // Catch:{ NoSuchMethodError -> 0x0348 }
            com.bumptech.glide.RequestBuilder r0 = r0.apply(r6)     // Catch:{ NoSuchMethodError -> 0x0348 }
            android.widget.ImageView r6 = r1.f11035z0     // Catch:{ NoSuchMethodError -> 0x0348 }
            r0.into(r6)     // Catch:{ NoSuchMethodError -> 0x0348 }
            goto L_0x02f6
        L_0x0348:
            com.clevertap.android.sdk.C3111h1.m14930d(r4)     // Catch:{ NoClassDefFoundError -> 0x06b0 }
            android.widget.ImageView r0 = r1.f11035z0     // Catch:{ NoClassDefFoundError -> 0x06b0 }
            android.content.Context r0 = r0.getContext()     // Catch:{ NoClassDefFoundError -> 0x06b0 }
            c.c.a.q r0 = p076c.p082c.p083a.C2232l.m11649c(r0)     // Catch:{ NoClassDefFoundError -> 0x06b0 }
            java.lang.String r6 = r14.mo12054j()     // Catch:{ NoClassDefFoundError -> 0x06b0 }
            com.bumptech.glide.RequestBuilder r0 = r0.load(r6)     // Catch:{ NoClassDefFoundError -> 0x06b0 }
            android.widget.ImageView r6 = r1.f11035z0     // Catch:{ NoClassDefFoundError -> 0x06b0 }
            r0.into(r6)     // Catch:{ NoClassDefFoundError -> 0x06b0 }
            goto L_0x02f6
        L_0x0363:
            boolean r0 = r14.mo12061q()     // Catch:{ NoClassDefFoundError -> 0x06b0 }
            if (r0 == 0) goto L_0x03d7
            android.widget.RelativeLayout r0 = r1.f11023C0     // Catch:{ NoClassDefFoundError -> 0x06b0 }
            r6 = 0
            r0.setVisibility(r6)     // Catch:{ NoClassDefFoundError -> 0x06b0 }
            android.widget.ImageView r0 = r1.f11035z0     // Catch:{ NoClassDefFoundError -> 0x06b0 }
            r0.setVisibility(r6)     // Catch:{ NoClassDefFoundError -> 0x06b0 }
            android.widget.ImageView r0 = r1.f11035z0     // Catch:{ NoClassDefFoundError -> 0x06b0 }
            android.widget.ImageView$ScaleType r6 = android.widget.ImageView.ScaleType.FIT_CENTER     // Catch:{ NoClassDefFoundError -> 0x06b0 }
            r0.setScaleType(r6)     // Catch:{ NoClassDefFoundError -> 0x06b0 }
            android.widget.ImageView r0 = r1.f11035z0     // Catch:{ NoSuchMethodError -> 0x03b7 }
            android.content.Context r0 = r0.getContext()     // Catch:{ NoSuchMethodError -> 0x03b7 }
            c.c.a.q r0 = p076c.p082c.p083a.C2232l.m11649c(r0)     // Catch:{ NoSuchMethodError -> 0x03b7 }
            com.bumptech.glide.RequestBuilder r0 = r0.asGif()     // Catch:{ NoSuchMethodError -> 0x03b7 }
            java.lang.String r6 = r14.mo12054j()     // Catch:{ NoSuchMethodError -> 0x03b7 }
            com.bumptech.glide.RequestBuilder r0 = r0.load(r6)     // Catch:{ NoSuchMethodError -> 0x03b7 }
            com.bumptech.glide.request.RequestOptions r6 = new com.bumptech.glide.request.RequestOptions     // Catch:{ NoSuchMethodError -> 0x03b7 }
            r6.<init>()     // Catch:{ NoSuchMethodError -> 0x03b7 }
            android.content.Context r7 = r1.f11033x0     // Catch:{ NoSuchMethodError -> 0x03b7 }
            int r7 = com.clevertap.android.sdk.C3238w1.m15655a(r7, r5)     // Catch:{ NoSuchMethodError -> 0x03b7 }
            com.bumptech.glide.request.BaseRequestOptions r6 = r6.placeholder(r7)     // Catch:{ NoSuchMethodError -> 0x03b7 }
            com.bumptech.glide.request.RequestOptions r6 = (com.bumptech.glide.request.RequestOptions) r6     // Catch:{ NoSuchMethodError -> 0x03b7 }
            android.content.Context r7 = r1.f11033x0     // Catch:{ NoSuchMethodError -> 0x03b7 }
            int r7 = com.clevertap.android.sdk.C3238w1.m15655a(r7, r5)     // Catch:{ NoSuchMethodError -> 0x03b7 }
            com.bumptech.glide.request.BaseRequestOptions r6 = r6.error(r7)     // Catch:{ NoSuchMethodError -> 0x03b7 }
            com.bumptech.glide.RequestBuilder r0 = r0.apply(r6)     // Catch:{ NoSuchMethodError -> 0x03b7 }
            android.widget.ImageView r6 = r1.f11035z0     // Catch:{ NoSuchMethodError -> 0x03b7 }
            r0.into(r6)     // Catch:{ NoSuchMethodError -> 0x03b7 }
            goto L_0x02f6
        L_0x03b7:
            com.clevertap.android.sdk.C3111h1.m14930d(r4)     // Catch:{ NoClassDefFoundError -> 0x06b0 }
            android.widget.ImageView r0 = r1.f11035z0     // Catch:{ NoClassDefFoundError -> 0x06b0 }
            android.content.Context r0 = r0.getContext()     // Catch:{ NoClassDefFoundError -> 0x06b0 }
            c.c.a.q r0 = p076c.p082c.p083a.C2232l.m11649c(r0)     // Catch:{ NoClassDefFoundError -> 0x06b0 }
            com.bumptech.glide.RequestBuilder r0 = r0.asGif()     // Catch:{ NoClassDefFoundError -> 0x06b0 }
            java.lang.String r6 = r14.mo12054j()     // Catch:{ NoClassDefFoundError -> 0x06b0 }
            com.bumptech.glide.RequestBuilder r0 = r0.load(r6)     // Catch:{ NoClassDefFoundError -> 0x06b0 }
            android.widget.ImageView r6 = r1.f11035z0     // Catch:{ NoClassDefFoundError -> 0x06b0 }
            r0.into(r6)     // Catch:{ NoClassDefFoundError -> 0x06b0 }
            goto L_0x02f6
        L_0x03d7:
            boolean r0 = r14.mo12063s()     // Catch:{ NoClassDefFoundError -> 0x06b0 }
            if (r0 == 0) goto L_0x04a3
            android.widget.RelativeLayout r0 = r1.f11023C0     // Catch:{ NoClassDefFoundError -> 0x06b0 }
            r6 = 0
            r0.setVisibility(r6)     // Catch:{ NoClassDefFoundError -> 0x06b0 }
            java.lang.String r0 = r14.mo12057m()     // Catch:{ NoClassDefFoundError -> 0x06b0 }
            boolean r0 = r0.isEmpty()     // Catch:{ NoClassDefFoundError -> 0x06b0 }
            if (r0 != 0) goto L_0x045a
            android.widget.ImageView r0 = r1.f11035z0     // Catch:{ NoClassDefFoundError -> 0x06b0 }
            r0.setVisibility(r6)     // Catch:{ NoClassDefFoundError -> 0x06b0 }
            int r0 = com.clevertap.android.sdk.CTInboxActivity.f10825R     // Catch:{ NoClassDefFoundError -> 0x06b0 }
            r8 = 2
            if (r0 != r8) goto L_0x03ff
            android.widget.ImageView r0 = r1.f11035z0     // Catch:{ NoClassDefFoundError -> 0x06b1 }
            android.widget.ImageView$ScaleType r6 = android.widget.ImageView.ScaleType.CENTER_CROP     // Catch:{ NoClassDefFoundError -> 0x06b1 }
            r0.setScaleType(r6)     // Catch:{ NoClassDefFoundError -> 0x06b1 }
            goto L_0x0406
        L_0x03ff:
            android.widget.ImageView r0 = r1.f11035z0     // Catch:{ NoClassDefFoundError -> 0x06b1 }
            android.widget.ImageView$ScaleType r6 = android.widget.ImageView.ScaleType.FIT_CENTER     // Catch:{ NoClassDefFoundError -> 0x06b1 }
            r0.setScaleType(r6)     // Catch:{ NoClassDefFoundError -> 0x06b1 }
        L_0x0406:
            com.clevertap.android.sdk.C3111h1.m14930d(r4)     // Catch:{ NoSuchMethodError -> 0x0441 }
            android.widget.ImageView r0 = r1.f11035z0     // Catch:{ NoSuchMethodError -> 0x0441 }
            android.content.Context r0 = r0.getContext()     // Catch:{ NoSuchMethodError -> 0x0441 }
            c.c.a.q r0 = p076c.p082c.p083a.C2232l.m11649c(r0)     // Catch:{ NoSuchMethodError -> 0x0441 }
            java.lang.String r6 = r14.mo12057m()     // Catch:{ NoSuchMethodError -> 0x0441 }
            com.bumptech.glide.RequestBuilder r0 = r0.load(r6)     // Catch:{ NoSuchMethodError -> 0x0441 }
            com.bumptech.glide.request.RequestOptions r6 = new com.bumptech.glide.request.RequestOptions     // Catch:{ NoSuchMethodError -> 0x0441 }
            r6.<init>()     // Catch:{ NoSuchMethodError -> 0x0441 }
            android.content.Context r9 = r1.f11033x0     // Catch:{ NoSuchMethodError -> 0x0441 }
            int r9 = com.clevertap.android.sdk.C3238w1.m15655a(r9, r7)     // Catch:{ NoSuchMethodError -> 0x0441 }
            com.bumptech.glide.request.BaseRequestOptions r6 = r6.placeholder(r9)     // Catch:{ NoSuchMethodError -> 0x0441 }
            com.bumptech.glide.request.RequestOptions r6 = (com.bumptech.glide.request.RequestOptions) r6     // Catch:{ NoSuchMethodError -> 0x0441 }
            android.content.Context r9 = r1.f11033x0     // Catch:{ NoSuchMethodError -> 0x0441 }
            int r7 = com.clevertap.android.sdk.C3238w1.m15655a(r9, r7)     // Catch:{ NoSuchMethodError -> 0x0441 }
            com.bumptech.glide.request.BaseRequestOptions r6 = r6.error(r7)     // Catch:{ NoSuchMethodError -> 0x0441 }
            com.bumptech.glide.RequestBuilder r0 = r0.apply(r6)     // Catch:{ NoSuchMethodError -> 0x0441 }
            android.widget.ImageView r6 = r1.f11035z0     // Catch:{ NoSuchMethodError -> 0x0441 }
            r0.into(r6)     // Catch:{ NoSuchMethodError -> 0x0441 }
            goto L_0x06b4
        L_0x0441:
            android.widget.ImageView r0 = r1.f11035z0     // Catch:{ NoClassDefFoundError -> 0x06b1 }
            android.content.Context r0 = r0.getContext()     // Catch:{ NoClassDefFoundError -> 0x06b1 }
            c.c.a.q r0 = p076c.p082c.p083a.C2232l.m11649c(r0)     // Catch:{ NoClassDefFoundError -> 0x06b1 }
            java.lang.String r6 = r14.mo12057m()     // Catch:{ NoClassDefFoundError -> 0x06b1 }
            com.bumptech.glide.RequestBuilder r0 = r0.load(r6)     // Catch:{ NoClassDefFoundError -> 0x06b1 }
            android.widget.ImageView r6 = r1.f11035z0     // Catch:{ NoClassDefFoundError -> 0x06b1 }
            r0.into(r6)     // Catch:{ NoClassDefFoundError -> 0x06b1 }
            goto L_0x06b4
        L_0x045a:
            r8 = 2
            android.widget.RelativeLayout r0 = r1.f11023C0     // Catch:{ NoClassDefFoundError -> 0x06b1 }
            r6 = 0
            r0.setVisibility(r6)     // Catch:{ NoClassDefFoundError -> 0x06b1 }
            android.widget.ImageView r0 = r1.f11035z0     // Catch:{ NoClassDefFoundError -> 0x06b1 }
            r0.setVisibility(r6)     // Catch:{ NoClassDefFoundError -> 0x06b1 }
            int r0 = com.clevertap.android.sdk.CTInboxActivity.f10825R     // Catch:{ NoClassDefFoundError -> 0x06b1 }
            if (r0 != r8) goto L_0x0472
            android.widget.ImageView r0 = r1.f11035z0     // Catch:{ NoClassDefFoundError -> 0x06b1 }
            android.widget.ImageView$ScaleType r6 = android.widget.ImageView.ScaleType.CENTER_CROP     // Catch:{ NoClassDefFoundError -> 0x06b1 }
            r0.setScaleType(r6)     // Catch:{ NoClassDefFoundError -> 0x06b1 }
            goto L_0x0479
        L_0x0472:
            android.widget.ImageView r0 = r1.f11035z0     // Catch:{ NoClassDefFoundError -> 0x06b1 }
            android.widget.ImageView$ScaleType r6 = android.widget.ImageView.ScaleType.FIT_CENTER     // Catch:{ NoClassDefFoundError -> 0x06b1 }
            r0.setScaleType(r6)     // Catch:{ NoClassDefFoundError -> 0x06b1 }
        L_0x0479:
            android.widget.ImageView r0 = r1.f11035z0     // Catch:{ NoClassDefFoundError -> 0x06b1 }
            int r6 = r19.mo8948D()     // Catch:{ NoClassDefFoundError -> 0x06b1 }
            r0.setBackgroundColor(r6)     // Catch:{ NoClassDefFoundError -> 0x06b1 }
            android.content.Context r0 = r1.f11033x0     // Catch:{ NoClassDefFoundError -> 0x06b1 }
            int r0 = com.clevertap.android.sdk.C3238w1.m15655a(r0, r7)     // Catch:{ NoClassDefFoundError -> 0x06b1 }
            if (r0 == r13) goto L_0x06b4
            android.widget.ImageView r6 = r1.f11035z0     // Catch:{ NoClassDefFoundError -> 0x06b1 }
            android.content.Context r6 = r6.getContext()     // Catch:{ NoClassDefFoundError -> 0x06b1 }
            c.c.a.q r6 = p076c.p082c.p083a.C2232l.m11649c(r6)     // Catch:{ NoClassDefFoundError -> 0x06b1 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ NoClassDefFoundError -> 0x06b1 }
            com.bumptech.glide.RequestBuilder r0 = r6.load(r0)     // Catch:{ NoClassDefFoundError -> 0x06b1 }
            android.widget.ImageView r6 = r1.f11035z0     // Catch:{ NoClassDefFoundError -> 0x06b1 }
            r0.into(r6)     // Catch:{ NoClassDefFoundError -> 0x06b1 }
            goto L_0x06b4
        L_0x04a3:
            r8 = 2
            boolean r0 = r14.mo12060p()     // Catch:{ NoClassDefFoundError -> 0x06b1 }
            if (r0 == 0) goto L_0x06b4
            android.widget.RelativeLayout r0 = r1.f11023C0     // Catch:{ NoClassDefFoundError -> 0x06b1 }
            r7 = 0
            r0.setVisibility(r7)     // Catch:{ NoClassDefFoundError -> 0x06b1 }
            android.widget.ImageView r0 = r1.f11035z0     // Catch:{ NoClassDefFoundError -> 0x06b1 }
            r0.setVisibility(r7)     // Catch:{ NoClassDefFoundError -> 0x06b1 }
            android.widget.ImageView r0 = r1.f11035z0     // Catch:{ NoClassDefFoundError -> 0x06b1 }
            android.widget.ImageView$ScaleType r7 = android.widget.ImageView.ScaleType.FIT_CENTER     // Catch:{ NoClassDefFoundError -> 0x06b1 }
            r0.setScaleType(r7)     // Catch:{ NoClassDefFoundError -> 0x06b1 }
            android.widget.ImageView r0 = r1.f11035z0     // Catch:{ NoClassDefFoundError -> 0x06b1 }
            int r7 = r19.mo8948D()     // Catch:{ NoClassDefFoundError -> 0x06b1 }
            r0.setBackgroundColor(r7)     // Catch:{ NoClassDefFoundError -> 0x06b1 }
            android.content.Context r0 = r1.f11033x0     // Catch:{ NoClassDefFoundError -> 0x06b1 }
            int r0 = com.clevertap.android.sdk.C3238w1.m15655a(r0, r6)     // Catch:{ NoClassDefFoundError -> 0x06b1 }
            if (r0 == r13) goto L_0x06b4
            android.widget.ImageView r6 = r1.f11035z0     // Catch:{ NoClassDefFoundError -> 0x06b1 }
            android.content.Context r6 = r6.getContext()     // Catch:{ NoClassDefFoundError -> 0x06b1 }
            c.c.a.q r6 = p076c.p082c.p083a.C2232l.m11649c(r6)     // Catch:{ NoClassDefFoundError -> 0x06b1 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ NoClassDefFoundError -> 0x06b1 }
            com.bumptech.glide.RequestBuilder r0 = r6.load(r0)     // Catch:{ NoClassDefFoundError -> 0x06b1 }
            android.widget.ImageView r6 = r1.f11035z0     // Catch:{ NoClassDefFoundError -> 0x06b1 }
            r0.into(r6)     // Catch:{ NoClassDefFoundError -> 0x06b1 }
            goto L_0x06b4
        L_0x04e6:
            r8 = 2
            boolean r0 = r14.mo12062r()     // Catch:{ NoClassDefFoundError -> 0x06b1 }
            if (r0 == 0) goto L_0x0553
            android.widget.RelativeLayout r0 = r1.f11023C0     // Catch:{ NoClassDefFoundError -> 0x06b1 }
            r6 = 0
            r0.setVisibility(r6)     // Catch:{ NoClassDefFoundError -> 0x06b1 }
            android.widget.ImageView r0 = r1.f11034y0     // Catch:{ NoClassDefFoundError -> 0x06b1 }
            r0.setVisibility(r6)     // Catch:{ NoClassDefFoundError -> 0x06b1 }
            android.widget.ImageView r0 = r1.f11034y0     // Catch:{ NoClassDefFoundError -> 0x06b1 }
            android.widget.ImageView$ScaleType r6 = android.widget.ImageView.ScaleType.CENTER_CROP     // Catch:{ NoClassDefFoundError -> 0x06b1 }
            r0.setScaleType(r6)     // Catch:{ NoClassDefFoundError -> 0x06b1 }
            android.widget.ImageView r0 = r1.f11034y0     // Catch:{ NoSuchMethodError -> 0x0537 }
            android.content.Context r0 = r0.getContext()     // Catch:{ NoSuchMethodError -> 0x0537 }
            c.c.a.q r0 = p076c.p082c.p083a.C2232l.m11649c(r0)     // Catch:{ NoSuchMethodError -> 0x0537 }
            java.lang.String r6 = r14.mo12054j()     // Catch:{ NoSuchMethodError -> 0x0537 }
            com.bumptech.glide.RequestBuilder r0 = r0.load(r6)     // Catch:{ NoSuchMethodError -> 0x0537 }
            com.bumptech.glide.request.RequestOptions r6 = new com.bumptech.glide.request.RequestOptions     // Catch:{ NoSuchMethodError -> 0x0537 }
            r6.<init>()     // Catch:{ NoSuchMethodError -> 0x0537 }
            android.content.Context r7 = r1.f11033x0     // Catch:{ NoSuchMethodError -> 0x0537 }
            int r7 = com.clevertap.android.sdk.C3238w1.m15655a(r7, r5)     // Catch:{ NoSuchMethodError -> 0x0537 }
            com.bumptech.glide.request.BaseRequestOptions r6 = r6.placeholder(r7)     // Catch:{ NoSuchMethodError -> 0x0537 }
            com.bumptech.glide.request.RequestOptions r6 = (com.bumptech.glide.request.RequestOptions) r6     // Catch:{ NoSuchMethodError -> 0x0537 }
            android.content.Context r7 = r1.f11033x0     // Catch:{ NoSuchMethodError -> 0x0537 }
            int r7 = com.clevertap.android.sdk.C3238w1.m15655a(r7, r5)     // Catch:{ NoSuchMethodError -> 0x0537 }
            com.bumptech.glide.request.BaseRequestOptions r6 = r6.error(r7)     // Catch:{ NoSuchMethodError -> 0x0537 }
            com.bumptech.glide.RequestBuilder r0 = r0.apply(r6)     // Catch:{ NoSuchMethodError -> 0x0537 }
            android.widget.ImageView r6 = r1.f11034y0     // Catch:{ NoSuchMethodError -> 0x0537 }
            r0.into(r6)     // Catch:{ NoSuchMethodError -> 0x0537 }
            goto L_0x06b4
        L_0x0537:
            com.clevertap.android.sdk.C3111h1.m14930d(r4)     // Catch:{ NoClassDefFoundError -> 0x06b1 }
            android.widget.ImageView r0 = r1.f11034y0     // Catch:{ NoClassDefFoundError -> 0x06b1 }
            android.content.Context r0 = r0.getContext()     // Catch:{ NoClassDefFoundError -> 0x06b1 }
            c.c.a.q r0 = p076c.p082c.p083a.C2232l.m11649c(r0)     // Catch:{ NoClassDefFoundError -> 0x06b1 }
            java.lang.String r6 = r14.mo12054j()     // Catch:{ NoClassDefFoundError -> 0x06b1 }
            com.bumptech.glide.RequestBuilder r0 = r0.load(r6)     // Catch:{ NoClassDefFoundError -> 0x06b1 }
            android.widget.ImageView r6 = r1.f11034y0     // Catch:{ NoClassDefFoundError -> 0x06b1 }
            r0.into(r6)     // Catch:{ NoClassDefFoundError -> 0x06b1 }
            goto L_0x06b4
        L_0x0553:
            boolean r0 = r14.mo12061q()     // Catch:{ NoClassDefFoundError -> 0x06b1 }
            if (r0 == 0) goto L_0x05c7
            android.widget.RelativeLayout r0 = r1.f11023C0     // Catch:{ NoClassDefFoundError -> 0x06b1 }
            r6 = 0
            r0.setVisibility(r6)     // Catch:{ NoClassDefFoundError -> 0x06b1 }
            android.widget.ImageView r0 = r1.f11034y0     // Catch:{ NoClassDefFoundError -> 0x06b1 }
            r0.setVisibility(r6)     // Catch:{ NoClassDefFoundError -> 0x06b1 }
            android.widget.ImageView r0 = r1.f11034y0     // Catch:{ NoClassDefFoundError -> 0x06b1 }
            android.widget.ImageView$ScaleType r6 = android.widget.ImageView.ScaleType.FIT_CENTER     // Catch:{ NoClassDefFoundError -> 0x06b1 }
            r0.setScaleType(r6)     // Catch:{ NoClassDefFoundError -> 0x06b1 }
            android.widget.ImageView r0 = r1.f11034y0     // Catch:{ NoSuchMethodError -> 0x05a7 }
            android.content.Context r0 = r0.getContext()     // Catch:{ NoSuchMethodError -> 0x05a7 }
            c.c.a.q r0 = p076c.p082c.p083a.C2232l.m11649c(r0)     // Catch:{ NoSuchMethodError -> 0x05a7 }
            com.bumptech.glide.RequestBuilder r0 = r0.asGif()     // Catch:{ NoSuchMethodError -> 0x05a7 }
            java.lang.String r6 = r14.mo12054j()     // Catch:{ NoSuchMethodError -> 0x05a7 }
            com.bumptech.glide.RequestBuilder r0 = r0.load(r6)     // Catch:{ NoSuchMethodError -> 0x05a7 }
            com.bumptech.glide.request.RequestOptions r6 = new com.bumptech.glide.request.RequestOptions     // Catch:{ NoSuchMethodError -> 0x05a7 }
            r6.<init>()     // Catch:{ NoSuchMethodError -> 0x05a7 }
            android.content.Context r7 = r1.f11033x0     // Catch:{ NoSuchMethodError -> 0x05a7 }
            int r7 = com.clevertap.android.sdk.C3238w1.m15655a(r7, r5)     // Catch:{ NoSuchMethodError -> 0x05a7 }
            com.bumptech.glide.request.BaseRequestOptions r6 = r6.placeholder(r7)     // Catch:{ NoSuchMethodError -> 0x05a7 }
            com.bumptech.glide.request.RequestOptions r6 = (com.bumptech.glide.request.RequestOptions) r6     // Catch:{ NoSuchMethodError -> 0x05a7 }
            android.content.Context r7 = r1.f11033x0     // Catch:{ NoSuchMethodError -> 0x05a7 }
            int r7 = com.clevertap.android.sdk.C3238w1.m15655a(r7, r5)     // Catch:{ NoSuchMethodError -> 0x05a7 }
            com.bumptech.glide.request.BaseRequestOptions r6 = r6.error(r7)     // Catch:{ NoSuchMethodError -> 0x05a7 }
            com.bumptech.glide.RequestBuilder r0 = r0.apply(r6)     // Catch:{ NoSuchMethodError -> 0x05a7 }
            android.widget.ImageView r6 = r1.f11034y0     // Catch:{ NoSuchMethodError -> 0x05a7 }
            r0.into(r6)     // Catch:{ NoSuchMethodError -> 0x05a7 }
            goto L_0x06b4
        L_0x05a7:
            com.clevertap.android.sdk.C3111h1.m14930d(r4)     // Catch:{ NoClassDefFoundError -> 0x06b1 }
            android.widget.ImageView r0 = r1.f11034y0     // Catch:{ NoClassDefFoundError -> 0x06b1 }
            android.content.Context r0 = r0.getContext()     // Catch:{ NoClassDefFoundError -> 0x06b1 }
            c.c.a.q r0 = p076c.p082c.p083a.C2232l.m11649c(r0)     // Catch:{ NoClassDefFoundError -> 0x06b1 }
            com.bumptech.glide.RequestBuilder r0 = r0.asGif()     // Catch:{ NoClassDefFoundError -> 0x06b1 }
            java.lang.String r6 = r14.mo12054j()     // Catch:{ NoClassDefFoundError -> 0x06b1 }
            com.bumptech.glide.RequestBuilder r0 = r0.load(r6)     // Catch:{ NoClassDefFoundError -> 0x06b1 }
            android.widget.ImageView r6 = r1.f11034y0     // Catch:{ NoClassDefFoundError -> 0x06b1 }
            r0.into(r6)     // Catch:{ NoClassDefFoundError -> 0x06b1 }
            goto L_0x06b4
        L_0x05c7:
            boolean r0 = r14.mo12063s()     // Catch:{ NoClassDefFoundError -> 0x06b1 }
            if (r0 == 0) goto L_0x066f
            android.widget.RelativeLayout r0 = r1.f11023C0     // Catch:{ NoClassDefFoundError -> 0x06b1 }
            r6 = 0
            r0.setVisibility(r6)     // Catch:{ NoClassDefFoundError -> 0x06b1 }
            java.lang.String r0 = r14.mo12057m()     // Catch:{ NoClassDefFoundError -> 0x06b1 }
            boolean r0 = r0.isEmpty()     // Catch:{ NoClassDefFoundError -> 0x06b1 }
            if (r0 != 0) goto L_0x063d
            android.widget.ImageView r0 = r1.f11034y0     // Catch:{ NoClassDefFoundError -> 0x06b1 }
            r0.setVisibility(r6)     // Catch:{ NoClassDefFoundError -> 0x06b1 }
            android.widget.ImageView r0 = r1.f11034y0     // Catch:{ NoClassDefFoundError -> 0x06b1 }
            android.widget.ImageView$ScaleType r6 = android.widget.ImageView.ScaleType.CENTER_CROP     // Catch:{ NoClassDefFoundError -> 0x06b1 }
            r0.setScaleType(r6)     // Catch:{ NoClassDefFoundError -> 0x06b1 }
            android.widget.ImageView r0 = r1.f11034y0     // Catch:{ NoSuchMethodError -> 0x0621 }
            android.content.Context r0 = r0.getContext()     // Catch:{ NoSuchMethodError -> 0x0621 }
            c.c.a.q r0 = p076c.p082c.p083a.C2232l.m11649c(r0)     // Catch:{ NoSuchMethodError -> 0x0621 }
            java.lang.String r6 = r14.mo12057m()     // Catch:{ NoSuchMethodError -> 0x0621 }
            com.bumptech.glide.RequestBuilder r0 = r0.load(r6)     // Catch:{ NoSuchMethodError -> 0x0621 }
            com.bumptech.glide.request.RequestOptions r6 = new com.bumptech.glide.request.RequestOptions     // Catch:{ NoSuchMethodError -> 0x0621 }
            r6.<init>()     // Catch:{ NoSuchMethodError -> 0x0621 }
            android.content.Context r9 = r1.f11033x0     // Catch:{ NoSuchMethodError -> 0x0621 }
            int r9 = com.clevertap.android.sdk.C3238w1.m15655a(r9, r7)     // Catch:{ NoSuchMethodError -> 0x0621 }
            com.bumptech.glide.request.BaseRequestOptions r6 = r6.placeholder(r9)     // Catch:{ NoSuchMethodError -> 0x0621 }
            com.bumptech.glide.request.RequestOptions r6 = (com.bumptech.glide.request.RequestOptions) r6     // Catch:{ NoSuchMethodError -> 0x0621 }
            android.content.Context r9 = r1.f11033x0     // Catch:{ NoSuchMethodError -> 0x0621 }
            int r7 = com.clevertap.android.sdk.C3238w1.m15655a(r9, r7)     // Catch:{ NoSuchMethodError -> 0x0621 }
            com.bumptech.glide.request.BaseRequestOptions r6 = r6.error(r7)     // Catch:{ NoSuchMethodError -> 0x0621 }
            com.bumptech.glide.RequestBuilder r0 = r0.apply(r6)     // Catch:{ NoSuchMethodError -> 0x0621 }
            android.widget.ImageView r6 = r1.f11034y0     // Catch:{ NoSuchMethodError -> 0x0621 }
            r0.into(r6)     // Catch:{ NoSuchMethodError -> 0x0621 }
            goto L_0x06b4
        L_0x0621:
            com.clevertap.android.sdk.C3111h1.m14930d(r4)     // Catch:{ NoClassDefFoundError -> 0x06b1 }
            android.widget.ImageView r0 = r1.f11034y0     // Catch:{ NoClassDefFoundError -> 0x06b1 }
            android.content.Context r0 = r0.getContext()     // Catch:{ NoClassDefFoundError -> 0x06b1 }
            c.c.a.q r0 = p076c.p082c.p083a.C2232l.m11649c(r0)     // Catch:{ NoClassDefFoundError -> 0x06b1 }
            java.lang.String r6 = r14.mo12057m()     // Catch:{ NoClassDefFoundError -> 0x06b1 }
            com.bumptech.glide.RequestBuilder r0 = r0.load(r6)     // Catch:{ NoClassDefFoundError -> 0x06b1 }
            android.widget.ImageView r6 = r1.f11034y0     // Catch:{ NoClassDefFoundError -> 0x06b1 }
            r0.into(r6)     // Catch:{ NoClassDefFoundError -> 0x06b1 }
            goto L_0x06b4
        L_0x063d:
            android.widget.RelativeLayout r0 = r1.f11023C0     // Catch:{ NoClassDefFoundError -> 0x06b1 }
            r6 = 0
            r0.setVisibility(r6)     // Catch:{ NoClassDefFoundError -> 0x06b1 }
            android.widget.ImageView r0 = r1.f11034y0     // Catch:{ NoClassDefFoundError -> 0x06b1 }
            r0.setVisibility(r6)     // Catch:{ NoClassDefFoundError -> 0x06b1 }
            android.widget.ImageView r0 = r1.f11034y0     // Catch:{ NoClassDefFoundError -> 0x06b1 }
            android.widget.ImageView$ScaleType r6 = android.widget.ImageView.ScaleType.CENTER_CROP     // Catch:{ NoClassDefFoundError -> 0x06b1 }
            r0.setScaleType(r6)     // Catch:{ NoClassDefFoundError -> 0x06b1 }
            android.content.Context r0 = r1.f11033x0     // Catch:{ NoClassDefFoundError -> 0x06b1 }
            int r0 = com.clevertap.android.sdk.C3238w1.m15655a(r0, r7)     // Catch:{ NoClassDefFoundError -> 0x06b1 }
            if (r0 == r13) goto L_0x06b4
            android.widget.ImageView r6 = r1.f11034y0     // Catch:{ NoClassDefFoundError -> 0x06b1 }
            android.content.Context r6 = r6.getContext()     // Catch:{ NoClassDefFoundError -> 0x06b1 }
            c.c.a.q r6 = p076c.p082c.p083a.C2232l.m11649c(r6)     // Catch:{ NoClassDefFoundError -> 0x06b1 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ NoClassDefFoundError -> 0x06b1 }
            com.bumptech.glide.RequestBuilder r0 = r6.load(r0)     // Catch:{ NoClassDefFoundError -> 0x06b1 }
            android.widget.ImageView r6 = r1.f11034y0     // Catch:{ NoClassDefFoundError -> 0x06b1 }
            r0.into(r6)     // Catch:{ NoClassDefFoundError -> 0x06b1 }
            goto L_0x06b4
        L_0x066f:
            boolean r0 = r14.mo12060p()     // Catch:{ NoClassDefFoundError -> 0x06b1 }
            if (r0 == 0) goto L_0x06b4
            android.widget.RelativeLayout r0 = r1.f11023C0     // Catch:{ NoClassDefFoundError -> 0x06b1 }
            r7 = 0
            r0.setVisibility(r7)     // Catch:{ NoClassDefFoundError -> 0x06b1 }
            android.widget.ImageView r0 = r1.f11034y0     // Catch:{ NoClassDefFoundError -> 0x06b1 }
            r0.setVisibility(r7)     // Catch:{ NoClassDefFoundError -> 0x06b1 }
            android.widget.ImageView r0 = r1.f11034y0     // Catch:{ NoClassDefFoundError -> 0x06b1 }
            android.widget.ImageView$ScaleType r7 = android.widget.ImageView.ScaleType.CENTER_CROP     // Catch:{ NoClassDefFoundError -> 0x06b1 }
            r0.setScaleType(r7)     // Catch:{ NoClassDefFoundError -> 0x06b1 }
            android.widget.ImageView r0 = r1.f11034y0     // Catch:{ NoClassDefFoundError -> 0x06b1 }
            int r7 = r19.mo8948D()     // Catch:{ NoClassDefFoundError -> 0x06b1 }
            r0.setBackgroundColor(r7)     // Catch:{ NoClassDefFoundError -> 0x06b1 }
            android.content.Context r0 = r1.f11033x0     // Catch:{ NoClassDefFoundError -> 0x06b1 }
            int r0 = com.clevertap.android.sdk.C3238w1.m15655a(r0, r6)     // Catch:{ NoClassDefFoundError -> 0x06b1 }
            if (r0 == r13) goto L_0x06b4
            android.widget.ImageView r6 = r1.f11034y0     // Catch:{ NoClassDefFoundError -> 0x06b1 }
            android.content.Context r6 = r6.getContext()     // Catch:{ NoClassDefFoundError -> 0x06b1 }
            c.c.a.q r6 = p076c.p082c.p083a.C2232l.m11649c(r6)     // Catch:{ NoClassDefFoundError -> 0x06b1 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ NoClassDefFoundError -> 0x06b1 }
            com.bumptech.glide.RequestBuilder r0 = r6.load(r0)     // Catch:{ NoClassDefFoundError -> 0x06b1 }
            android.widget.ImageView r6 = r1.f11034y0     // Catch:{ NoClassDefFoundError -> 0x06b1 }
            r0.into(r6)     // Catch:{ NoClassDefFoundError -> 0x06b1 }
            goto L_0x06b4
        L_0x06b0:
            r8 = 2
        L_0x06b1:
            com.clevertap.android.sdk.C3111h1.m14930d(r3)
        L_0x06b4:
            android.content.Context r0 = r1.f11033x0
            android.content.res.Resources r0 = r0.getResources()
            int r6 = com.clevertap.android.sdk.CTInboxActivity.f10825R
            if (r6 != r8) goto L_0x06cd
            android.util.DisplayMetrics r2 = r0.getDisplayMetrics()
            int r2 = r2.heightPixels
            int r2 = r2 / r8
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            int r0 = r0.widthPixels
            int r0 = r0 / r8
            goto L_0x06e8
        L_0x06cd:
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            int r0 = r0.widthPixels
            java.lang.String r6 = r20.mo12024r()
            boolean r2 = r6.equalsIgnoreCase(r2)
            if (r2 == 0) goto L_0x06e7
            float r2 = (float) r0
            r6 = 1058013184(0x3f100000, float:0.5625)
            float r2 = r2 * r6
            int r2 = java.lang.Math.round(r2)
            goto L_0x06e8
        L_0x06e7:
            r2 = r0
        L_0x06e8:
            android.widget.FrameLayout r6 = r1.f11021A0
            android.widget.RelativeLayout$LayoutParams r7 = new android.widget.RelativeLayout$LayoutParams
            r7.<init>(r0, r2)
            r6.setLayoutParams(r7)
            com.clevertap.android.sdk.g$a r0 = new com.clevertap.android.sdk.g$a
            r2 = r22
            r0.<init>(r2)
            android.os.Handler r6 = new android.os.Handler
            r6.<init>()
            r7 = 2000(0x7d0, double:9.88E-321)
            r6.postDelayed(r0, r7)
            java.lang.String r0 = r14.mo12039c()     // Catch:{ NoClassDefFoundError -> 0x076d }
            boolean r0 = r0.isEmpty()     // Catch:{ NoClassDefFoundError -> 0x076d }
            if (r0 != 0) goto L_0x0765
            android.widget.ImageView r0 = r1.f11105I0     // Catch:{ NoClassDefFoundError -> 0x076d }
            r6 = 0
            r0.setVisibility(r6)     // Catch:{ NoClassDefFoundError -> 0x076d }
            android.widget.ImageView r0 = r1.f11105I0     // Catch:{ NoSuchMethodError -> 0x074a }
            android.content.Context r0 = r0.getContext()     // Catch:{ NoSuchMethodError -> 0x074a }
            c.c.a.q r0 = p076c.p082c.p083a.C2232l.m11649c(r0)     // Catch:{ NoSuchMethodError -> 0x074a }
            java.lang.String r6 = r14.mo12039c()     // Catch:{ NoSuchMethodError -> 0x074a }
            com.bumptech.glide.RequestBuilder r0 = r0.load(r6)     // Catch:{ NoSuchMethodError -> 0x074a }
            com.bumptech.glide.request.RequestOptions r6 = new com.bumptech.glide.request.RequestOptions     // Catch:{ NoSuchMethodError -> 0x074a }
            r6.<init>()     // Catch:{ NoSuchMethodError -> 0x074a }
            android.content.Context r7 = r1.f11033x0     // Catch:{ NoSuchMethodError -> 0x074a }
            int r7 = com.clevertap.android.sdk.C3238w1.m15655a(r7, r5)     // Catch:{ NoSuchMethodError -> 0x074a }
            com.bumptech.glide.request.BaseRequestOptions r6 = r6.placeholder(r7)     // Catch:{ NoSuchMethodError -> 0x074a }
            com.bumptech.glide.request.RequestOptions r6 = (com.bumptech.glide.request.RequestOptions) r6     // Catch:{ NoSuchMethodError -> 0x074a }
            android.content.Context r7 = r1.f11033x0     // Catch:{ NoSuchMethodError -> 0x074a }
            int r5 = com.clevertap.android.sdk.C3238w1.m15655a(r7, r5)     // Catch:{ NoSuchMethodError -> 0x074a }
            com.bumptech.glide.request.BaseRequestOptions r5 = r6.error(r5)     // Catch:{ NoSuchMethodError -> 0x074a }
            com.bumptech.glide.RequestBuilder r0 = r0.apply(r5)     // Catch:{ NoSuchMethodError -> 0x074a }
            android.widget.ImageView r5 = r1.f11105I0     // Catch:{ NoSuchMethodError -> 0x074a }
            r0.into(r5)     // Catch:{ NoSuchMethodError -> 0x074a }
            goto L_0x0770
        L_0x074a:
            com.clevertap.android.sdk.C3111h1.m14930d(r4)     // Catch:{ NoClassDefFoundError -> 0x076d }
            android.widget.ImageView r0 = r1.f11105I0     // Catch:{ NoClassDefFoundError -> 0x076d }
            android.content.Context r0 = r0.getContext()     // Catch:{ NoClassDefFoundError -> 0x076d }
            c.c.a.q r0 = p076c.p082c.p083a.C2232l.m11649c(r0)     // Catch:{ NoClassDefFoundError -> 0x076d }
            java.lang.String r4 = r14.mo12039c()     // Catch:{ NoClassDefFoundError -> 0x076d }
            com.bumptech.glide.RequestBuilder r0 = r0.load(r4)     // Catch:{ NoClassDefFoundError -> 0x076d }
            android.widget.ImageView r4 = r1.f11105I0     // Catch:{ NoClassDefFoundError -> 0x076d }
            r0.into(r4)     // Catch:{ NoClassDefFoundError -> 0x076d }
            goto L_0x0770
        L_0x0765:
            android.widget.ImageView r0 = r1.f11105I0     // Catch:{ NoClassDefFoundError -> 0x076d }
            r4 = 8
            r0.setVisibility(r4)     // Catch:{ NoClassDefFoundError -> 0x076d }
            goto L_0x0770
        L_0x076d:
            com.clevertap.android.sdk.C3111h1.m14930d(r3)
        L_0x0770:
            if (r12 == 0) goto L_0x0784
            android.widget.RelativeLayout r0 = r1.f11112P0
            com.clevertap.android.sdk.e0 r3 = new com.clevertap.android.sdk.e0
            r9 = 0
            r10 = 0
            r6 = r3
            r7 = r22
            r8 = r20
            r11 = r12
            r6.<init>(r7, r8, r9, r10, r11)
            r0.setOnClickListener(r3)
        L_0x0784:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.clevertap.android.sdk.C3097g.mo12219a(com.clevertap.android.sdk.CTInboxMessage, com.clevertap.android.sdk.g0, int):void");
    }
}
