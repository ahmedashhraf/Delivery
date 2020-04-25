package com.cleveroad.audiovisualization;

import android.content.Context;
import android.media.MediaPlayer;
import androidx.annotation.C0193h0;
import androidx.annotation.C0194i;
import com.cleveroad.audiovisualization.C3020l.C3021a;
import java.util.Timer;
import java.util.TimerTask;

/* renamed from: com.cleveroad.audiovisualization.d */
/* compiled from: DbmHandler */
public abstract class C3001d<TData> {

    /* renamed from: S */
    private static final long f10633S = 16;

    /* renamed from: N */
    private float[] f10634N;

    /* renamed from: O */
    private float[] f10635O;
    /* access modifiers changed from: private */

    /* renamed from: P */
    public float[] f10636P;

    /* renamed from: Q */
    private boolean f10637Q;

    /* renamed from: R */
    private Timer f10638R;

    /* renamed from: a */
    private int f10639a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public C3020l f10640b;

    /* renamed from: com.cleveroad.audiovisualization.d$a */
    /* compiled from: DbmHandler */
    class C3002a extends TimerTask {
        C3002a() {
        }

        public void run() {
            if (C3001d.this.f10640b != null) {
                C3001d.this.f10640b.mo11841a(C3001d.this.f10636P, C3001d.this.f10636P);
            }
        }
    }

    /* renamed from: com.cleveroad.audiovisualization.d$b */
    /* compiled from: DbmHandler */
    class C3003b implements C3021a {
        C3003b() {
        }

        /* renamed from: a */
        public void mo11838a() {
            C3001d.this.mo11836f();
        }
    }

    /* renamed from: com.cleveroad.audiovisualization.d$c */
    /* compiled from: DbmHandler */
    public static class C3004c {
        /* renamed from: a */
        public static C3024o m14341a(@C0193h0 Context context, int i) {
            return new C3024o(context, i);
        }

        /* renamed from: a */
        public static C3024o m14342a(@C0193h0 Context context, @C0193h0 MediaPlayer mediaPlayer) {
            return new C3024o(context, mediaPlayer);
        }

        /* renamed from: a */
        public static C3022m m14339a(@C0193h0 Context context) {
            return new C3022m(context);
        }

        /* renamed from: a */
        public static C3022m m14340a(@C0193h0 Context context, float f, float f2) {
            return new C3022m(context, f, f2);
        }
    }

    /* renamed from: g */
    private void mo10544g() {
        Timer timer = this.f10638R;
        if (timer != null) {
            timer.cancel();
            this.f10638R.purge();
            this.f10638R = null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo10543a(TData tdata, int i, float[] fArr, float[] fArr2);

    /* renamed from: b */
    public void mo11832b() {
    }

    /* renamed from: c */
    public void mo11833c() {
    }

    @C0194i
    /* renamed from: d */
    public void mo11834d() {
        this.f10637Q = true;
        this.f10634N = null;
        this.f10635O = null;
        this.f10640b = null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final void mo11835e() {
        mo10544g();
        this.f10640b.mo11842b();
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo11836f() {
        mo10544g();
        this.f10640b.mo11839a();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo11830a(@C0193h0 C3020l lVar, int i) {
        this.f10640b = lVar;
        this.f10639a = i;
        this.f10634N = new float[i];
        this.f10635O = new float[i];
        this.f10636P = new float[i];
    }

    /* renamed from: a */
    public final void mo11831a(TData tdata) {
        if (!this.f10637Q) {
            mo10543a(tdata, this.f10639a, this.f10634N, this.f10635O);
            this.f10640b.mo11841a(this.f10634N, this.f10635O);
            mo11835e();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo11829a() {
        if (this.f10638R == null) {
            this.f10638R = new Timer("Stop Rendering Timer");
            this.f10638R.scheduleAtFixedRate(new C3002a(), 16, 16);
        }
        this.f10640b.mo11840a(new C3003b());
    }
}
