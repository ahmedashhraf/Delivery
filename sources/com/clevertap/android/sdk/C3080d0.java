package com.clevertap.android.sdk;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.RelativeLayout;
import androidx.annotation.C0193h0;
import androidx.recyclerview.widget.RecyclerView.C1635d0;
import com.google.android.exoplayer2.SimpleExoPlayer;
import java.lang.ref.WeakReference;
import java.text.SimpleDateFormat;
import java.util.Date;

/* renamed from: com.clevertap.android.sdk.d0 */
/* compiled from: CTInboxBaseMessageViewHolder */
class C3080d0 extends C1635d0 {

    /* renamed from: A0 */
    FrameLayout f11021A0;
    /* access modifiers changed from: private */

    /* renamed from: B0 */
    public ImageView f11022B0;

    /* renamed from: C0 */
    RelativeLayout f11023C0;

    /* renamed from: D0 */
    private WeakReference<C3100g0> f11024D0;

    /* renamed from: E0 */
    private CTInboxMessage f11025E0;

    /* renamed from: F0 */
    private CTInboxMessageContent f11026F0;

    /* renamed from: G0 */
    private boolean f11027G0;

    /* renamed from: s0 */
    RelativeLayout f11028s0;

    /* renamed from: t0 */
    RelativeLayout f11029t0;

    /* renamed from: u0 */
    LinearLayout f11030u0;

    /* renamed from: v0 */
    LinearLayout f11031v0;

    /* renamed from: w0 */
    FrameLayout f11032w0;

    /* renamed from: x0 */
    Context f11033x0;

    /* renamed from: y0 */
    ImageView f11034y0;

    /* renamed from: z0 */
    ImageView f11035z0;

    /* renamed from: com.clevertap.android.sdk.d0$a */
    /* compiled from: CTInboxBaseMessageViewHolder */
    class C3081a implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ SimpleExoPlayer f11037a;

        /* renamed from: b */
        final /* synthetic */ Resources f11038b;

        C3081a(SimpleExoPlayer simpleExoPlayer, Resources resources) {
            this.f11037a = simpleExoPlayer;
            this.f11038b = resources;
        }

        public void onClick(View view) {
            float volume = this.f11037a.getVolume();
            if (volume > 0.0f) {
                this.f11037a.setVolume(0.0f);
                C3080d0.this.f11022B0.setImageDrawable(this.f11038b.getDrawable(C3058R.C3060drawable.ct_volume_off));
            } else if (volume == 0.0f) {
                this.f11037a.setVolume(1.0f);
                C3080d0.this.f11022B0.setImageDrawable(this.f11038b.getDrawable(C3058R.C3060drawable.ct_volume_on));
            }
        }
    }

    C3080d0(@C0193h0 View view) {
        super(view);
    }

    /* renamed from: K */
    private FrameLayout m14761K() {
        return this.f11032w0;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: D */
    public int mo8948D() {
        return 0;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: E */
    public C3100g0 mo12222E() {
        return (C3100g0) this.f11024D0.get();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: F */
    public boolean mo12223F() {
        return this.f11027G0;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: G */
    public void mo12224G() {
        FrameLayout frameLayout = this.f11021A0;
        if (frameLayout != null) {
            frameLayout.setVisibility(0);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: H */
    public void mo12225H() {
        m14761K().setVisibility(0);
        ImageView imageView = this.f11022B0;
        if (imageView != null) {
            imageView.setVisibility(0);
        }
        FrameLayout frameLayout = this.f11021A0;
        if (frameLayout != null) {
            frameLayout.setVisibility(8);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: I */
    public void mo12226I() {
        FrameLayout frameLayout = this.f11021A0;
        if (frameLayout != null) {
            frameLayout.setVisibility(8);
        }
        ImageView imageView = this.f11022B0;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        FrameLayout K = m14761K();
        if (K != null) {
            K.removeAllViews();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: J */
    public boolean mo12227J() {
        return this.f11026F0.mo12063s();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo12231b(Button button, Button button2, Button button3) {
        button2.setVisibility(8);
        button3.setVisibility(8);
        button.setLayoutParams(new LayoutParams(0, -1, 6.0f));
        button2.setLayoutParams(new LayoutParams(0, -1, 0.0f));
        button3.setLayoutParams(new LayoutParams(0, -1, 0.0f));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo12219a(CTInboxMessage cTInboxMessage, C3100g0 g0Var, int i) {
        this.f11033x0 = g0Var.getContext();
        this.f11024D0 = new WeakReference<>(g0Var);
        this.f11025E0 = cTInboxMessage;
        boolean z = false;
        this.f11026F0 = (CTInboxMessageContent) this.f11025E0.mo12022p().get(0);
        if (this.f11026F0.mo12060p() || this.f11026F0.mo12063s()) {
            z = true;
        }
        this.f11027G0 = z;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public String mo12228a(long j) {
        StringBuilder sb;
        String str;
        long currentTimeMillis = (System.currentTimeMillis() / 1000) - j;
        if (currentTimeMillis < 60) {
            return "Just Now";
        }
        if (currentTimeMillis > 60 && currentTimeMillis < 3540) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(currentTimeMillis / 60);
            sb2.append(" mins ago");
            return sb2.toString();
        } else if (currentTimeMillis > 3540 && currentTimeMillis < 81420) {
            long j2 = currentTimeMillis / 3600;
            if (j2 > 1) {
                sb = new StringBuilder();
                sb.append(j2);
                str = " hours ago";
            } else {
                sb = new StringBuilder();
                sb.append(j2);
                str = " hour ago";
            }
            sb.append(str);
            return sb.toString();
        } else if (currentTimeMillis <= 86400 || currentTimeMillis >= 172800) {
            return new SimpleDateFormat("dd MMM").format(new Date(j));
        } else {
            return "Yesterday";
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo12229a(Button button, Button button2, Button button3) {
        button3.setVisibility(8);
        button.setLayoutParams(new LayoutParams(0, -1, 3.0f));
        button2.setLayoutParams(new LayoutParams(0, -1, 3.0f));
        button3.setLayoutParams(new LayoutParams(0, -1, 0.0f));
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0131  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo12230a(com.google.android.exoplayer2.ui.PlayerView r11) {
        /*
            r10 = this;
            boolean r0 = r10.f11027G0
            r1 = 0
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            android.widget.FrameLayout r0 = r10.m14761K()
            if (r0 != 0) goto L_0x000d
            return r1
        L_0x000d:
            r0.removeAllViews()
            r2 = 8
            r0.setVisibility(r2)
            android.content.Context r3 = r10.f11033x0
            android.content.res.Resources r3 = r3.getResources()
            android.util.DisplayMetrics r4 = r3.getDisplayMetrics()
            int r5 = com.clevertap.android.sdk.CTInboxActivity.f10825R
            r6 = 2
            java.lang.String r7 = "l"
            if (r5 != r6) goto L_0x0051
            com.clevertap.android.sdk.CTInboxMessage r5 = r10.f11025E0
            java.lang.String r5 = r5.mo12024r()
            boolean r5 = r5.equalsIgnoreCase(r7)
            if (r5 == 0) goto L_0x0049
            android.widget.ImageView r5 = r10.f11034y0
            int r5 = r5.getMeasuredHeight()
            float r5 = (float) r5
            r6 = 1071728558(0x3fe147ae, float:1.76)
            float r5 = r5 * r6
            int r5 = java.lang.Math.round(r5)
            android.widget.ImageView r6 = r10.f11034y0
            int r6 = r6.getMeasuredHeight()
            goto L_0x006c
        L_0x0049:
            android.widget.ImageView r5 = r10.f11035z0
            int r5 = r5.getMeasuredHeight()
        L_0x004f:
            r6 = r5
            goto L_0x006c
        L_0x0051:
            android.util.DisplayMetrics r5 = r3.getDisplayMetrics()
            int r5 = r5.widthPixels
            com.clevertap.android.sdk.CTInboxMessage r6 = r10.f11025E0
            java.lang.String r6 = r6.mo12024r()
            boolean r6 = r6.equalsIgnoreCase(r7)
            if (r6 == 0) goto L_0x004f
            float r6 = (float) r5
            r7 = 1058013184(0x3f100000, float:0.5625)
            float r6 = r6 * r7
            int r6 = java.lang.Math.round(r6)
        L_0x006c:
            android.widget.FrameLayout$LayoutParams r7 = new android.widget.FrameLayout$LayoutParams
            r7.<init>(r5, r6)
            r11.setLayoutParams(r7)
            r0.addView(r11)
            com.clevertap.android.sdk.CTInboxMessage r5 = r10.f11025E0
            java.lang.String r5 = r5.mo12012b()
            int r5 = android.graphics.Color.parseColor(r5)
            r0.setBackgroundColor(r5)
            android.widget.FrameLayout r5 = r10.f11021A0
            if (r5 == 0) goto L_0x008b
            r5.setVisibility(r1)
        L_0x008b:
            com.google.android.exoplayer2.Player r5 = r11.getPlayer()
            com.google.android.exoplayer2.SimpleExoPlayer r5 = (com.google.android.exoplayer2.SimpleExoPlayer) r5
            float r6 = r5.getVolume()
            com.clevertap.android.sdk.CTInboxMessageContent r7 = r10.f11026F0
            boolean r7 = r7.mo12063s()
            r8 = 1
            if (r7 == 0) goto L_0x010f
            android.widget.ImageView r7 = new android.widget.ImageView
            android.content.Context r9 = r10.f11033x0
            r7.<init>(r9)
            r10.f11022B0 = r7
            android.widget.ImageView r7 = r10.f11022B0
            r7.setVisibility(r2)
            r2 = 0
            int r2 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r2 <= 0) goto L_0x00c3
            android.widget.ImageView r2 = r10.f11022B0
            android.content.Context r7 = r10.f11033x0
            android.content.res.Resources r7 = r7.getResources()
            int r9 = com.clevertap.android.sdk.C3058R.C3060drawable.ct_volume_on
            android.graphics.drawable.Drawable r7 = r7.getDrawable(r9)
            r2.setImageDrawable(r7)
            goto L_0x00d4
        L_0x00c3:
            android.widget.ImageView r2 = r10.f11022B0
            android.content.Context r7 = r10.f11033x0
            android.content.res.Resources r7 = r7.getResources()
            int r9 = com.clevertap.android.sdk.C3058R.C3060drawable.ct_volume_off
            android.graphics.drawable.Drawable r7 = r7.getDrawable(r9)
            r2.setImageDrawable(r7)
        L_0x00d4:
            r2 = 1106247680(0x41f00000, float:30.0)
            float r7 = android.util.TypedValue.applyDimension(r8, r2, r4)
            int r7 = (int) r7
            float r2 = android.util.TypedValue.applyDimension(r8, r2, r4)
            int r2 = (int) r2
            android.widget.FrameLayout$LayoutParams r9 = new android.widget.FrameLayout$LayoutParams
            r9.<init>(r7, r2)
            r2 = 1082130432(0x40800000, float:4.0)
            float r2 = android.util.TypedValue.applyDimension(r8, r2, r4)
            int r2 = (int) r2
            r7 = 1073741824(0x40000000, float:2.0)
            float r4 = android.util.TypedValue.applyDimension(r8, r7, r4)
            int r4 = (int) r4
            r9.setMargins(r1, r2, r4, r1)
            r2 = 8388613(0x800005, float:1.175495E-38)
            r9.gravity = r2
            android.widget.ImageView r2 = r10.f11022B0
            r2.setLayoutParams(r9)
            android.widget.ImageView r2 = r10.f11022B0
            com.clevertap.android.sdk.d0$a r4 = new com.clevertap.android.sdk.d0$a
            r4.<init>(r5, r3)
            r2.setOnClickListener(r4)
            android.widget.ImageView r2 = r10.f11022B0
            r0.addView(r2)
        L_0x010f:
            r11.requestFocus()
            r11.setShowBuffering(r1)
            com.google.android.exoplayer2.upstream.DefaultBandwidthMeter r0 = new com.google.android.exoplayer2.upstream.DefaultBandwidthMeter
            r0.<init>()
            com.google.android.exoplayer2.upstream.DefaultDataSourceFactory r2 = new com.google.android.exoplayer2.upstream.DefaultDataSourceFactory
            android.content.Context r3 = r10.f11033x0
            java.lang.String r4 = r3.getPackageName()
            java.lang.String r4 = com.google.android.exoplayer2.util.Util.getUserAgent(r3, r4)
            r2.<init>(r3, r4, r0)
            com.clevertap.android.sdk.CTInboxMessageContent r0 = r10.f11026F0
            java.lang.String r0 = r0.mo12054j()
            if (r0 == 0) goto L_0x0163
            com.google.android.exoplayer2.source.hls.HlsMediaSource$Factory r3 = new com.google.android.exoplayer2.source.hls.HlsMediaSource$Factory
            r3.<init>(r2)
            android.net.Uri r0 = android.net.Uri.parse(r0)
            com.google.android.exoplayer2.source.hls.HlsMediaSource r0 = r3.createMediaSource(r0)
            r5.prepare(r0)
            com.clevertap.android.sdk.CTInboxMessageContent r0 = r10.f11026F0
            boolean r0 = r0.mo12060p()
            if (r0 == 0) goto L_0x0155
            r11.showController()
            r5.setPlayWhenReady(r1)
            r11 = 1065353216(0x3f800000, float:1.0)
            r5.setVolume(r11)
            goto L_0x0163
        L_0x0155:
            com.clevertap.android.sdk.CTInboxMessageContent r11 = r10.f11026F0
            boolean r11 = r11.mo12063s()
            if (r11 == 0) goto L_0x0163
            r5.setPlayWhenReady(r8)
            r5.setVolume(r6)
        L_0x0163:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.clevertap.android.sdk.C3080d0.mo12230a(com.google.android.exoplayer2.ui.PlayerView):boolean");
    }
}
