package com.clevertap.android.sdk;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.widget.ImageView.ScaleType;
import androidx.appcompat.widget.AppCompatImageView;

class GifImageView extends AppCompatImageView implements Runnable {

    /* renamed from: b0 */
    private static final String f10892b0 = "GifDecoderView";

    /* renamed from: N */
    private final Handler f10893N = new Handler(Looper.getMainLooper());

    /* renamed from: O */
    private boolean f10894O;

    /* renamed from: P */
    private boolean f10895P;
    /* access modifiers changed from: private */

    /* renamed from: Q */
    public boolean f10896Q;
    /* access modifiers changed from: private */

    /* renamed from: R */
    public Thread f10897R;

    /* renamed from: S */
    private C3050e f10898S = null;

    /* renamed from: T */
    private long f10899T = -1;

    /* renamed from: U */
    private C3049d f10900U = null;

    /* renamed from: V */
    private C3048c f10901V = null;

    /* renamed from: W */
    private final Runnable f10902W = new C3046a();
    /* access modifiers changed from: private */

    /* renamed from: a */
    public C3068a1 f10903a;

    /* renamed from: a0 */
    private final Runnable f10904a0 = new C3047b();
    /* access modifiers changed from: private */

    /* renamed from: b */
    public Bitmap f10905b;

    /* renamed from: com.clevertap.android.sdk.GifImageView$a */
    class C3046a implements Runnable {
        C3046a() {
        }

        public void run() {
            if (GifImageView.this.f10905b != null && !GifImageView.this.f10905b.isRecycled()) {
                GifImageView gifImageView = GifImageView.this;
                gifImageView.setImageBitmap(gifImageView.f10905b);
                GifImageView.this.setScaleType(ScaleType.FIT_CENTER);
            }
        }
    }

    /* renamed from: com.clevertap.android.sdk.GifImageView$b */
    class C3047b implements Runnable {
        C3047b() {
        }

        public void run() {
            GifImageView.this.f10905b = null;
            GifImageView.this.f10903a = null;
            GifImageView.this.f10897R = null;
            GifImageView.this.f10896Q = false;
        }
    }

    /* renamed from: com.clevertap.android.sdk.GifImageView$c */
    public interface C3048c {
        /* renamed from: b */
        void mo12145b();
    }

    /* renamed from: com.clevertap.android.sdk.GifImageView$d */
    public interface C3049d {
        /* renamed from: a */
        void mo12146a();
    }

    /* renamed from: com.clevertap.android.sdk.GifImageView$e */
    public interface C3050e {
        /* renamed from: a */
        Bitmap mo12147a(Bitmap bitmap);
    }

    public GifImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: m */
    private boolean m14671m() {
        return (this.f10894O || this.f10895P) && this.f10903a != null && this.f10897R == null;
    }

    /* renamed from: n */
    private void m14672n() {
        if (m14671m()) {
            this.f10897R = new Thread(this);
            this.f10897R.start();
        }
    }

    /* renamed from: b */
    public int mo12131b() {
        return this.f10903a.mo12194f();
    }

    /* renamed from: e */
    public long mo12132e() {
        return this.f10899T;
    }

    /* renamed from: f */
    public int mo12133f() {
        return this.f10903a.mo12195g();
    }

    /* renamed from: g */
    public int mo12134g() {
        return this.f10903a.mo12201m();
    }

    /* renamed from: h */
    public C3049d mo12135h() {
        return this.f10900U;
    }

    /* renamed from: i */
    public C3050e mo12136i() {
        return this.f10898S;
    }

    public boolean isAnimating() {
        return this.f10894O;
    }

    /* renamed from: j */
    public void mo12138j() {
        this.f10903a.mo12203o();
        mo12125a(0);
    }

    /* renamed from: k */
    public void mo12139k() {
        this.f10894O = true;
        m14672n();
    }

    /* renamed from: l */
    public void mo12140l() {
        this.f10894O = false;
        Thread thread = this.f10897R;
        if (thread != null) {
            thread.interrupt();
            this.f10897R = null;
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        mo12124a();
    }

    public void run() {
        long j;
        C3048c cVar = this.f10901V;
        if (cVar != null) {
            cVar.mo12145b();
        }
        while (true) {
            if (!this.f10894O && !this.f10895P) {
                break;
            }
            boolean a = this.f10903a.mo12188a();
            try {
                long nanoTime = System.nanoTime();
                this.f10905b = this.f10903a.mo12199k();
                if (this.f10898S != null) {
                    this.f10905b = this.f10898S.mo12147a(this.f10905b);
                }
                j = (System.nanoTime() - nanoTime) / 1000000;
                try {
                    this.f10893N.post(this.f10902W);
                } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException unused) {
                }
            } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException unused2) {
                j = 0;
            }
            this.f10895P = false;
            if (this.f10894O && a) {
                try {
                    int j2 = (int) (((long) this.f10903a.mo12198j()) - j);
                    if (j2 > 0) {
                        Thread.sleep(this.f10899T > 0 ? this.f10899T : (long) j2);
                    }
                } catch (InterruptedException unused3) {
                }
                if (!this.f10894O) {
                    break;
                }
            } else {
                this.f10894O = false;
            }
        }
        if (this.f10896Q) {
            this.f10893N.post(this.f10904a0);
        }
        this.f10897R = null;
        C3049d dVar = this.f10900U;
        if (dVar != null) {
            dVar.mo12146a();
        }
    }

    /* renamed from: a */
    public void mo12130a(byte[] bArr) {
        this.f10903a = new C3068a1();
        try {
            this.f10903a.mo12184a(bArr);
            if (this.f10894O) {
                m14672n();
            } else {
                mo12125a(0);
            }
        } catch (Exception unused) {
            this.f10903a = null;
        }
    }

    public GifImageView(Context context) {
        super(context);
    }

    /* renamed from: a */
    public void mo12126a(long j) {
        this.f10899T = j;
    }

    /* renamed from: a */
    public void mo12125a(int i) {
        if (this.f10903a.mo12192d() != i && this.f10903a.mo12190b(i - 1) && !this.f10894O) {
            this.f10895P = true;
            m14672n();
        }
    }

    /* renamed from: a */
    public void mo12124a() {
        this.f10894O = false;
        this.f10895P = false;
        this.f10896Q = true;
        mo12140l();
        this.f10893N.post(this.f10904a0);
    }

    /* renamed from: a */
    public void mo12129a(C3050e eVar) {
        this.f10898S = eVar;
    }

    /* renamed from: a */
    public void mo12128a(C3049d dVar) {
        this.f10900U = dVar;
    }

    /* renamed from: a */
    public void mo12127a(C3048c cVar) {
        this.f10901V = cVar;
    }
}
