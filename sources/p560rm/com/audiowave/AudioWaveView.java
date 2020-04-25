package p560rm.com.audiowave;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.OvershootInterpolator;
import androidx.core.p034l.C0962e0;
import kotlin.C14737p0;
import kotlin.C6121u;
import kotlin.p214b1.C6056f;
import kotlin.p214b1.p215t.C6069a;
import kotlin.p214b1.p215t.C6080l;
import kotlin.p214b1.p215t.C6084p;
import kotlin.p214b1.p216u.C14445h0;
import kotlin.p214b1.p216u.C14448i0;
import kotlin.p504e1.C14519g;
import kotlin.p504e1.C14525k;
import p205i.p209c.p210a.C6003d;
import p205i.p209c.p210a.C6004e;
import p205i.p471b.p472a.p473a.p474c.p475i.C13959t;

@C6121u(mo24988bv = {1, 0, 2}, mo24989d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0012\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004B\u001b\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007B#\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\b\u0010e\u001a\u00020;H\u0002J\u0012\u0010f\u001a\u00020;2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0002J\u0012\u0010g\u001a\u00020;2\b\u0010h\u001a\u0004\u0018\u00010iH\u0014J0\u0010j\u001a\u00020;2\u0006\u0010k\u001a\u00020,2\u0006\u0010l\u001a\u00020\t2\u0006\u0010m\u001a\u00020\t2\u0006\u0010n\u001a\u00020\t2\u0006\u0010o\u001a\u00020\tH\u0015J\u0012\u0010p\u001a\u00020,2\b\u0010q\u001a\u0004\u0018\u00010rH\u0017J\u001e\u0010s\u001a\u00020;2\n\b\u0002\u0010h\u001a\u0004\u0018\u00010i2\b\b\u0002\u0010t\u001a\u00020:H\u0002J \u0010u\u001a\u00020;2\u0006\u0010v\u001a\u00020V2\u000e\b\u0002\u0010w\u001a\b\u0012\u0004\u0012\u00020;0xH\u0007J\u0016\u0010u\u001a\u00020;2\u0006\u0010v\u001a\u00020V2\u0006\u0010w\u001a\u00020yJ\f\u0010z\u001a\u00020:*\u00020rH\u0002R\u0014\u0010\u000b\u001a\u00020\t8BX\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR&\u0010\u000f\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\t8F@FX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\r\"\u0004\b\u0011\u0010\u0012R$\u0010\u0013\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\t@FX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\r\"\u0004\b\u0015\u0010\u0012R$\u0010\u0016\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\t@FX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\r\"\u0004\b\u0018\u0010\u0012R\u0014\u0010\u0019\u001a\u00020\t8BX\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\rR$\u0010\u001b\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\t@FX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\r\"\u0004\b\u001d\u0010\u0012R\u0011\u0010\u001e\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u001f\u0010\rR\u0016\u0010 \u001a\n \"*\u0004\u0018\u00010!0!X\u0004¢\u0006\u0002\n\u0000R$\u0010$\u001a\u00020#2\u0006\u0010\u000e\u001a\u00020#@FX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u000e\u0010)\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020#XD¢\u0006\u0002\n\u0000R\u001a\u0010+\u001a\u00020,X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010-\"\u0004\b.\u0010/R\u001a\u00100\u001a\u00020,X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u0010-\"\u0004\b1\u0010/R$\u00103\u001a\u00020,2\u0006\u00102\u001a\u00020,@BX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b3\u0010-\"\u0004\b4\u0010/R$\u00105\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\t@FX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b6\u0010\r\"\u0004\b7\u0010\u0012R,\u00108\u001a\u0014\u0012\u0004\u0012\u00020:\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020;09X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R\u001c\u0010@\u001a\u0004\u0018\u00010AX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bB\u0010C\"\u0004\bD\u0010ER&\u0010F\u001a\u000e\u0012\u0004\u0012\u00020:\u0012\u0004\u0012\u00020;0GX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010KR&\u0010L\u001a\u000e\u0012\u0004\u0012\u00020:\u0012\u0004\u0012\u00020;0GX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bM\u0010I\"\u0004\bN\u0010KR$\u0010O\u001a\u00020:2\u0006\u0010\u000e\u001a\u00020:@FX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bP\u0010Q\"\u0004\bR\u0010SR\u0014\u0010T\u001a\u00020:8BX\u0004¢\u0006\u0006\u001a\u0004\bU\u0010QR$\u0010W\u001a\u00020V2\u0006\u0010\u000e\u001a\u00020V@FX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bX\u0010Y\"\u0004\bZ\u0010[R\u000e\u0010\\\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010]\u001a\u0004\u0018\u00010^X\u000e¢\u0006\u0002\n\u0000R$\u0010_\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\t@FX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b`\u0010\r\"\u0004\ba\u0010\u0012R\u000e\u0010b\u001a\u00020cX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010d\u001a\u00020cX\u000e¢\u0006\u0002\n\u0000¨\u0006{"}, mo24990d2 = {"Lrm/com/audiowave/AudioWaveView;", "Landroid/view/View;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "centerY", "getCenterY", "()I", "value", "chunkHeight", "getChunkHeight", "setChunkHeight", "(I)V", "chunkRadius", "getChunkRadius", "setChunkRadius", "chunkSpacing", "getChunkSpacing", "setChunkSpacing", "chunkStep", "getChunkStep", "chunkWidth", "getChunkWidth", "setChunkWidth", "chunksCount", "getChunksCount", "expansionAnimator", "Landroid/animation/ValueAnimator;", "kotlin.jvm.PlatformType", "", "expansionDuration", "getExpansionDuration", "()J", "setExpansionDuration", "(J)V", "h", "initialDelay", "isExpansionAnimated", "", "()Z", "setExpansionAnimated", "(Z)V", "isTouchable", "setTouchable", "<set-?>", "isTouched", "setTouched", "minChunkHeight", "getMinChunkHeight", "setMinChunkHeight", "onProgressChanged", "Lkotlin/Function2;", "", "", "getOnProgressChanged", "()Lkotlin/jvm/functions/Function2;", "setOnProgressChanged", "(Lkotlin/jvm/functions/Function2;)V", "onProgressListener", "Lrm/com/audiowave/OnProgressListener;", "getOnProgressListener", "()Lrm/com/audiowave/OnProgressListener;", "setOnProgressListener", "(Lrm/com/audiowave/OnProgressListener;)V", "onStartTracking", "Lkotlin/Function1;", "getOnStartTracking", "()Lkotlin/jvm/functions/Function1;", "setOnStartTracking", "(Lkotlin/jvm/functions/Function1;)V", "onStopTracking", "getOnStopTracking", "setOnStopTracking", "progress", "getProgress", "()F", "setProgress", "(F)V", "progressFactor", "getProgressFactor", "", "scaledData", "getScaledData", "()[B", "setScaledData", "([B)V", "w", "waveBitmap", "Landroid/graphics/Bitmap;", "waveColor", "getWaveColor", "setWaveColor", "waveFilledPaint", "Landroid/graphics/Paint;", "wavePaint", "animateExpansion", "inflateAttrs", "onDraw", "canvas", "Landroid/graphics/Canvas;", "onLayout", "changed", "left", "top", "right", "bottom", "onTouchEvent", "event", "Landroid/view/MotionEvent;", "redrawData", "factor", "setRawData", "raw", "callback", "Lkotlin/Function0;", "Lrm/com/audiowave/OnSamplingListener;", "toProgress", "audiowave_release"}, mo24991k = 1, mo24992mv = {1, 1, 10})
/* renamed from: rm.com.audiowave.AudioWaveView */
/* compiled from: AudioWaveView.kt */
public final class AudioWaveView extends View {
    @C6003d

    /* renamed from: N */
    private C6080l<? super Float, C14737p0> f45043N = C15773e.f45070a;
    @C6003d

    /* renamed from: O */
    private C6080l<? super Float, C14737p0> f45044O = C15774f.f45071a;

    /* renamed from: P */
    private int f45045P;

    /* renamed from: Q */
    private int f45046Q = C15781b.m68763a((View) this, 2);

    /* renamed from: R */
    private int f45047R = C15781b.m68763a((View) this, 1);

    /* renamed from: S */
    private int f45048S;

    /* renamed from: T */
    private int f45049T = C15781b.m68763a((View) this, 2);

    /* renamed from: U */
    private int f45050U = C0962e0.f4343t;

    /* renamed from: V */
    private float f45051V;
    @C6003d

    /* renamed from: W */
    private byte[] f45052W = new byte[0];
    @C6004e

    /* renamed from: a */
    private C15782c f45053a;

    /* renamed from: a0 */
    private long f45054a0 = 400;
    @C6003d

    /* renamed from: b */
    private C6084p<? super Float, ? super Boolean, C14737p0> f45055b = C15772d.f45069a;

    /* renamed from: b0 */
    private boolean f45056b0 = true;

    /* renamed from: c0 */
    private boolean f45057c0 = true;

    /* renamed from: d0 */
    private boolean f45058d0;

    /* renamed from: e0 */
    private final long f45059e0 = 50;

    /* renamed from: f0 */
    private final ValueAnimator f45060f0;
    /* access modifiers changed from: private */

    /* renamed from: g0 */
    public Paint f45061g0;
    /* access modifiers changed from: private */

    /* renamed from: h0 */
    public Paint f45062h0;
    /* access modifiers changed from: private */

    /* renamed from: i0 */
    public Bitmap f45063i0;
    /* access modifiers changed from: private */

    /* renamed from: j0 */
    public int f45064j0;
    /* access modifiers changed from: private */

    /* renamed from: k0 */
    public int f45065k0;

    /* renamed from: rm.com.audiowave.AudioWaveView$a */
    /* compiled from: AudioWaveView.kt */
    static final class C15769a implements AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ AudioWaveView f45066a;

        C15769a(AudioWaveView audioWaveView) {
            this.f45066a = audioWaveView;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            AudioWaveView audioWaveView = this.f45066a;
            C14445h0.m62453a((Object) valueAnimator, "it");
            AudioWaveView.m68735a(audioWaveView, (Canvas) null, valueAnimator.getAnimatedFraction(), 1, (Object) null);
        }
    }

    /* renamed from: rm.com.audiowave.AudioWaveView$b */
    /* compiled from: AudioWaveView.kt */
    static final class C15770b implements AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ AudioWaveView f45067a;

        C15770b(AudioWaveView audioWaveView) {
            this.f45067a = audioWaveView;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            AudioWaveView audioWaveView = this.f45067a;
            C14445h0.m62453a((Object) valueAnimator, "it");
            AudioWaveView.m68735a(audioWaveView, (Canvas) null, valueAnimator.getAnimatedFraction(), 1, (Object) null);
        }
    }

    /* renamed from: rm.com.audiowave.AudioWaveView$c */
    /* compiled from: AudioWaveView.kt */
    static final class C15771c implements AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ AudioWaveView f45068a;

        C15771c(AudioWaveView audioWaveView) {
            this.f45068a = audioWaveView;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            AudioWaveView audioWaveView = this.f45068a;
            C14445h0.m62453a((Object) valueAnimator, "it");
            AudioWaveView.m68735a(audioWaveView, (Canvas) null, valueAnimator.getAnimatedFraction(), 1, (Object) null);
        }
    }

    /* renamed from: rm.com.audiowave.AudioWaveView$d */
    /* compiled from: AudioWaveView.kt */
    static final class C15772d extends C14448i0 implements C6084p<Float, Boolean, C14737p0> {

        /* renamed from: a */
        public static final C15772d f45069a = new C15772d();

        C15772d() {
            super(2);
        }

        /* renamed from: a */
        public final void mo51986a(float f, boolean z) {
        }

        /* renamed from: d */
        public /* bridge */ /* synthetic */ Object mo24962d(Object obj, Object obj2) {
            mo51986a(((Number) obj).floatValue(), ((Boolean) obj2).booleanValue());
            return C14737p0.f42983a;
        }
    }

    /* renamed from: rm.com.audiowave.AudioWaveView$e */
    /* compiled from: AudioWaveView.kt */
    static final class C15773e extends C14448i0 implements C6080l<Float, C14737p0> {

        /* renamed from: a */
        public static final C15773e f45070a = new C15773e();

        C15773e() {
            super(1);
        }

        /* renamed from: a */
        public final void mo51987a(float f) {
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo51987a(((Number) obj).floatValue());
            return C14737p0.f42983a;
        }
    }

    /* renamed from: rm.com.audiowave.AudioWaveView$f */
    /* compiled from: AudioWaveView.kt */
    static final class C15774f extends C14448i0 implements C6080l<Float, C14737p0> {

        /* renamed from: a */
        public static final C15774f f45071a = new C15774f();

        C15774f() {
            super(1);
        }

        /* renamed from: a */
        public final void mo51988a(float f) {
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo51988a(((Number) obj).floatValue());
            return C14737p0.f42983a;
        }
    }

    /* renamed from: rm.com.audiowave.AudioWaveView$g */
    /* compiled from: AudioWaveView.kt */
    static final class C15775g extends C14448i0 implements C6069a<C14737p0> {

        /* renamed from: a */
        final /* synthetic */ C15783d f45072a;

        C15775g(C15783d dVar) {
            this.f45072a = dVar;
            super(0);
        }

        /* renamed from: p */
        public final void m68757p() {
            this.f45072a.onComplete();
        }
    }

    /* renamed from: rm.com.audiowave.AudioWaveView$h */
    /* compiled from: AudioWaveView.kt */
    static final class C15776h extends C14448i0 implements C6069a<C14737p0> {

        /* renamed from: a */
        public static final C15776h f45073a = new C15776h();

        C15776h() {
            super(0);
        }

        /* renamed from: p */
        public final void m68759p() {
        }
    }

    @C6121u(mo24988bv = {1, 0, 2}, mo24989d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, mo24990d2 = {"<anonymous>", "", "run"}, mo24991k = 3, mo24992mv = {1, 1, 10})
    /* renamed from: rm.com.audiowave.AudioWaveView$i */
    /* compiled from: AudioWaveView.kt */
    static final class C15777i implements Runnable {

        /* renamed from: N */
        final /* synthetic */ C6069a f45074N;

        /* renamed from: a */
        final /* synthetic */ AudioWaveView f45075a;

        /* renamed from: b */
        final /* synthetic */ byte[] f45076b;

        /* renamed from: rm.com.audiowave.AudioWaveView$i$a */
        /* compiled from: AudioWaveView.kt */
        static final class C15778a extends C14448i0 implements C6080l<byte[], C14737p0> {

            /* renamed from: a */
            final /* synthetic */ C15777i f45077a;

            C15778a(C15777i iVar) {
                this.f45077a = iVar;
                super(1);
            }

            /* renamed from: a */
            public final void mo51990a(@C6003d byte[] bArr) {
                C14445h0.m62478f(bArr, "it");
                this.f45077a.f45075a.setScaledData(bArr);
                this.f45077a.f45074N.mo24947p();
                if (this.f45077a.f45075a.mo51947a()) {
                    this.f45077a.f45075a.m68743d();
                }
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo51990a((byte[]) obj);
                return C14737p0.f42983a;
            }
        }

        C15777i(AudioWaveView audioWaveView, byte[] bArr, C6069a aVar) {
            this.f45075a = audioWaveView;
            this.f45076b = bArr;
            this.f45074N = aVar;
        }

        public final void run() {
            C15784e.f45084a.mo51992a(this.f45076b, this.f45075a.getChunksCount(), new C15778a(this));
        }
    }

    public AudioWaveView(@C6004e Context context) {
        super(context);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        ofFloat.setDuration(this.f45054a0);
        ofFloat.setInterpolator(new OvershootInterpolator());
        ofFloat.addUpdateListener(new C15769a(this));
        this.f45060f0 = ofFloat;
        this.f45061g0 = C15781b.m68773c(C15781b.m68762a(this.f45050U, (int) C13959t.f40792G2));
        this.f45062h0 = C15781b.m68771b(this.f45050U);
        setWillNotDraw(false);
    }

    private final int getCenterY() {
        return this.f45065k0 / 2;
    }

    private final int getChunkStep() {
        return this.f45046Q + this.f45047R;
    }

    /* access modifiers changed from: private */
    public final float getProgressFactor() {
        return this.f45051V / 100.0f;
    }

    private final void setTouched(boolean z) {
        this.f45058d0 = z;
    }

    public final int getChunkHeight() {
        int i = this.f45045P;
        return i == 0 ? this.f45065k0 : Math.abs(i);
    }

    public final int getChunkRadius() {
        return this.f45048S;
    }

    public final int getChunkSpacing() {
        return this.f45047R;
    }

    public final int getChunkWidth() {
        return this.f45046Q;
    }

    public final int getChunksCount() {
        return this.f45064j0 / getChunkStep();
    }

    public final long getExpansionDuration() {
        return this.f45054a0;
    }

    public final int getMinChunkHeight() {
        return this.f45049T;
    }

    @C6003d
    public final C6084p<Float, Boolean, C14737p0> getOnProgressChanged() {
        return this.f45055b;
    }

    @C6004e
    public final C15782c getOnProgressListener() {
        return this.f45053a;
    }

    @C6003d
    public final C6080l<Float, C14737p0> getOnStartTracking() {
        return this.f45043N;
    }

    @C6003d
    public final C6080l<Float, C14737p0> getOnStopTracking() {
        return this.f45044O;
    }

    public final float getProgress() {
        return this.f45051V;
    }

    @C6003d
    public final byte[] getScaledData() {
        return this.f45052W;
    }

    public final int getWaveColor() {
        return this.f45050U;
    }

    /* access modifiers changed from: protected */
    public void onDraw(@C6004e Canvas canvas) {
        super.onDraw(canvas);
        if (canvas != null) {
            canvas.save();
            canvas.clipRect(0, 0, this.f45064j0, this.f45065k0);
            canvas.drawBitmap(this.f45063i0, 0.0f, 0.0f, this.f45061g0);
            canvas.restore();
            canvas.save();
            canvas.clipRect(0.0f, 0.0f, ((float) this.f45064j0) * getProgressFactor(), (float) this.f45065k0);
            canvas.drawBitmap(this.f45063i0, 0.0f, 0.0f, this.f45062h0);
            canvas.restore();
        }
    }

    /* access modifiers changed from: protected */
    @SuppressLint({"DrawAllocation"})
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.f45064j0 = i3 - i;
        this.f45065k0 = i4 - i2;
        if (!C15781b.m68769a(this.f45063i0, this.f45064j0, this.f45065k0) && z) {
            C15781b.m68775c(this.f45063i0);
            this.f45063i0 = Bitmap.createBitmap(this.f45064j0, this.f45065k0, Config.ARGB_8888);
            byte[] bArr = this.f45052W;
            if (bArr.length == 0) {
                bArr = new byte[0];
            }
            setScaledData(bArr);
        }
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(@C6004e MotionEvent motionEvent) {
        if (motionEvent == null) {
            return super.onTouchEvent(motionEvent);
        }
        if (!this.f45057c0 || !isEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f45058d0 = true;
            setProgress(m68729a(motionEvent));
            C15782c cVar = this.f45053a;
            if (cVar != null) {
                cVar.mo37883a(this.f45051V);
            }
            this.f45043N.invoke(Float.valueOf(this.f45051V));
            return true;
        } else if (action == 1) {
            this.f45058d0 = false;
            C15782c cVar2 = this.f45053a;
            if (cVar2 != null) {
                cVar2.mo37885b(this.f45051V);
            }
            this.f45044O.invoke(Float.valueOf(this.f45051V));
            return false;
        } else if (action != 2) {
            this.f45058d0 = false;
            return super.onTouchEvent(motionEvent);
        } else {
            this.f45058d0 = true;
            setProgress(m68729a(motionEvent));
            return true;
        }
    }

    public final void setChunkHeight(int i) {
        this.f45045P = i;
        m68735a(this, (Canvas) null, 0.0f, 3, (Object) null);
    }

    public final void setChunkRadius(int i) {
        this.f45048S = Math.abs(i);
        m68735a(this, (Canvas) null, 0.0f, 3, (Object) null);
    }

    public final void setChunkSpacing(int i) {
        this.f45047R = Math.abs(i);
        m68735a(this, (Canvas) null, 0.0f, 3, (Object) null);
    }

    public final void setChunkWidth(int i) {
        this.f45046Q = Math.abs(i);
        m68735a(this, (Canvas) null, 0.0f, 3, (Object) null);
    }

    public final void setExpansionAnimated(boolean z) {
        this.f45056b0 = z;
    }

    public final void setExpansionDuration(long j) {
        this.f45054a0 = Math.max(400, j);
        ValueAnimator valueAnimator = this.f45060f0;
        C14445h0.m62453a((Object) valueAnimator, "expansionAnimator");
        valueAnimator.setDuration(this.f45054a0);
    }

    public final void setMinChunkHeight(int i) {
        this.f45049T = Math.abs(i);
        m68735a(this, (Canvas) null, 0.0f, 3, (Object) null);
    }

    public final void setOnProgressChanged(@C6003d C6084p<? super Float, ? super Boolean, C14737p0> pVar) {
        C14445h0.m62478f(pVar, "<set-?>");
        this.f45055b = pVar;
    }

    public final void setOnProgressListener(@C6004e C15782c cVar) {
        this.f45053a = cVar;
    }

    public final void setOnStartTracking(@C6003d C6080l<? super Float, C14737p0> lVar) {
        C14445h0.m62478f(lVar, "<set-?>");
        this.f45043N = lVar;
    }

    public final void setOnStopTracking(@C6003d C6080l<? super Float, C14737p0> lVar) {
        C14445h0.m62478f(lVar, "<set-?>");
        this.f45044O = lVar;
    }

    public final void setProgress(float f) {
        if (C14534q.m62985c((C14519g<Integer>) new C14525k<Integer>(0, 100), f)) {
            this.f45051V = Math.abs(f);
            C15782c cVar = this.f45053a;
            if (cVar != null) {
                cVar.mo37884a(this.f45051V, this.f45058d0);
            }
            this.f45055b.mo24962d(Float.valueOf(this.f45051V), Boolean.valueOf(this.f45058d0));
            postInvalidate();
            return;
        }
        throw new IllegalArgumentException("Progress must be in 0..100".toString());
    }

    @C6056f
    public final void setRawData(@C6003d byte[] bArr) {
        m68737a(this, bArr, (C6069a) null, 2, (Object) null);
    }

    public final void setScaledData(@C6003d byte[] bArr) {
        C14445h0.m62478f(bArr, "value");
        if (bArr.length <= getChunksCount()) {
            bArr = C15787f.m68783a(new byte[getChunksCount()], bArr);
        }
        this.f45052W = bArr;
        m68735a(this, (Canvas) null, 0.0f, 3, (Object) null);
    }

    public final void setTouchable(boolean z) {
        this.f45057c0 = z;
    }

    public final void setWaveColor(int i) {
        this.f45061g0 = C15781b.m68773c(C15781b.m68762a(i, (int) C13959t.f40792G2));
        this.f45062h0 = C15781b.m68771b(i);
        m68735a(this, (Canvas) null, 0.0f, 3, (Object) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public final void m68743d() {
        this.f45060f0.start();
    }

    /* renamed from: c */
    public final boolean mo51949c() {
        return this.f45058d0;
    }

    /* renamed from: b */
    public final boolean mo51948b() {
        return this.f45057c0;
    }

    /* renamed from: a */
    public final boolean mo51947a() {
        return this.f45056b0;
    }

    /* renamed from: a */
    public final void mo51946a(@C6003d byte[] bArr, @C6003d C15783d dVar) {
        C14445h0.m62478f(bArr, "raw");
        C14445h0.m62478f(dVar, "callback");
        mo51945a(bArr, (C6069a<C14737p0>) new C15775g<C14737p0>(dVar));
    }

    @C6056f
    /* renamed from: a */
    public static /* bridge */ /* synthetic */ void m68737a(AudioWaveView audioWaveView, byte[] bArr, C6069a aVar, int i, Object obj) {
        if ((i & 2) != 0) {
            aVar = C15776h.f45073a;
        }
        audioWaveView.mo51945a(bArr, aVar);
    }

    @C6056f
    /* renamed from: a */
    public final void mo51945a(@C6003d byte[] bArr, @C6003d C6069a<C14737p0> aVar) {
        C14445h0.m62478f(bArr, "raw");
        C14445h0.m62478f(aVar, "callback");
        C15787f.m68782a().postDelayed(new C15777i(this, bArr, aVar), this.f45059e0);
    }

    /* renamed from: a */
    private final float m68729a(@C6003d MotionEvent motionEvent) {
        return (C15781b.m68761a(motionEvent.getX(), 0.0f, (float) this.f45064j0) / ((float) this.f45064j0)) * 100.0f;
    }

    /* renamed from: a */
    static /* bridge */ /* synthetic */ void m68735a(AudioWaveView audioWaveView, Canvas canvas, float f, int i, Object obj) {
        if ((i & 1) != 0) {
            Bitmap bitmap = audioWaveView.f45063i0;
            canvas = bitmap != null ? C15781b.m68770b(bitmap) : null;
        }
        if ((i & 2) != 0) {
            f = 1.0f;
        }
        audioWaveView.m68730a(canvas, f);
    }

    /* renamed from: a */
    private final void m68730a(Canvas canvas, float f) {
        Bitmap bitmap = this.f45063i0;
        if (bitmap != null && canvas != null) {
            C15781b.m68767a(bitmap);
            byte[] bArr = this.f45052W;
            int length = bArr.length;
            int i = 0;
            int i2 = 0;
            while (i < length) {
                int i3 = i2 + 1;
                int max = (int) (((float) (Math.max((int) ((((float) C15787f.m68781a(bArr[i])) / ((float) C13959t.f40827P1)) * ((float) getChunkHeight())), this.f45049T) - this.f45049T)) * f);
                RectF a = C15781b.m68766a((this.f45047R / 2) + (getChunkStep() * i2), (getCenterY() - this.f45049T) - max, (this.f45047R / 2) + (i2 * getChunkStep()) + this.f45046Q, getCenterY() + this.f45049T + max);
                int i4 = this.f45048S;
                canvas.drawRoundRect(a, (float) i4, (float) i4, this.f45061g0);
                i++;
                i2 = i3;
            }
            postInvalidate();
        }
    }

    public AudioWaveView(@C6004e Context context, @C6004e AttributeSet attributeSet) {
        super(context, attributeSet);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        ofFloat.setDuration(this.f45054a0);
        ofFloat.setInterpolator(new OvershootInterpolator());
        ofFloat.addUpdateListener(new C15770b(this));
        this.f45060f0 = ofFloat;
        this.f45061g0 = C15781b.m68773c(C15781b.m68762a(this.f45050U, (int) C13959t.f40792G2));
        this.f45062h0 = C15781b.m68771b(this.f45050U);
        setWillNotDraw(false);
        m68731a(attributeSet);
    }

    /* renamed from: a */
    private final void m68731a(AttributeSet attributeSet) {
        Context context = getContext();
        C14445h0.m62453a((Object) context, "context");
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, C15779R.styleable.AudioWaveView, 0, 0);
        if (obtainStyledAttributes != null) {
            setChunkHeight(obtainStyledAttributes.getDimensionPixelSize(C15779R.styleable.AudioWaveView_chunkHeight, getChunkHeight()));
            setChunkWidth(obtainStyledAttributes.getDimensionPixelSize(C15779R.styleable.AudioWaveView_chunkWidth, this.f45046Q));
            setChunkSpacing(obtainStyledAttributes.getDimensionPixelSize(C15779R.styleable.AudioWaveView_chunkSpacing, this.f45047R));
            setMinChunkHeight(obtainStyledAttributes.getDimensionPixelSize(C15779R.styleable.AudioWaveView_minChunkHeight, this.f45049T));
            setChunkRadius(obtainStyledAttributes.getDimensionPixelSize(C15779R.styleable.AudioWaveView_chunkRadius, this.f45048S));
            this.f45057c0 = obtainStyledAttributes.getBoolean(C15779R.styleable.AudioWaveView_touchable, this.f45057c0);
            setWaveColor(obtainStyledAttributes.getColor(C15779R.styleable.AudioWaveView_waveColor, this.f45050U));
            setProgress(obtainStyledAttributes.getFloat(C15779R.styleable.AudioWaveView_progress, this.f45051V));
            this.f45056b0 = obtainStyledAttributes.getBoolean(C15779R.styleable.AudioWaveView_animateExpansion, this.f45056b0);
            obtainStyledAttributes.recycle();
        }
    }

    public AudioWaveView(@C6004e Context context, @C6004e AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        ofFloat.setDuration(this.f45054a0);
        ofFloat.setInterpolator(new OvershootInterpolator());
        ofFloat.addUpdateListener(new C15771c(this));
        this.f45060f0 = ofFloat;
        this.f45061g0 = C15781b.m68773c(C15781b.m68762a(this.f45050U, (int) C13959t.f40792G2));
        this.f45062h0 = C15781b.m68771b(this.f45050U);
        setWillNotDraw(false);
        m68731a(attributeSet);
    }
}
