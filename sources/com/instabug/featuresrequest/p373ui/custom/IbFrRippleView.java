package com.instabug.featuresrequest.p373ui.custom;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.MotionEvent;
import android.view.animation.ScaleAnimation;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import androidx.annotation.RequiresApi;
import com.instabug.featuresrequest.C9525R;
import p205i.p471b.p472a.p473a.p474c.C13938g;
import p205i.p471b.p472a.p473a.p474c.p475i.C13959t;

/* renamed from: com.instabug.featuresrequest.ui.custom.IbFrRippleView */
public class IbFrRippleView extends LinearLayout {

    /* renamed from: o0 */
    private static transient /* synthetic */ boolean[] f25510o0;

    /* renamed from: N */
    private int f25511N;

    /* renamed from: O */
    private int f25512O = 10;

    /* renamed from: P */
    private int f25513P = 200;

    /* renamed from: Q */
    private int f25514Q = 90;

    /* renamed from: R */
    private Handler f25515R;

    /* renamed from: S */
    private float f25516S = 0.0f;

    /* renamed from: T */
    private boolean f25517T = false;

    /* renamed from: U */
    private int f25518U = 0;

    /* renamed from: V */
    private int f25519V = 0;

    /* renamed from: W */
    private int f25520W = -1;

    /* renamed from: a */
    private final Runnable f25521a = new C9632a(this);

    /* renamed from: a0 */
    private float f25522a0 = -1.0f;

    /* renamed from: b */
    private int f25523b;

    /* renamed from: b0 */
    private float f25524b0 = -1.0f;

    /* renamed from: c0 */
    private int f25525c0 = 200;

    /* renamed from: d0 */
    private float f25526d0;

    /* renamed from: e0 */
    private ScaleAnimation f25527e0;

    /* renamed from: f0 */
    private Boolean f25528f0;

    /* renamed from: g0 */
    private Boolean f25529g0;

    /* renamed from: h0 */
    private Integer f25530h0;

    /* renamed from: i0 */
    private Paint f25531i0;

    /* renamed from: j0 */
    private Bitmap f25532j0;

    /* renamed from: k0 */
    private int f25533k0;

    /* renamed from: l0 */
    private int f25534l0;

    /* renamed from: m0 */
    private GestureDetector f25535m0;

    /* renamed from: n0 */
    private C9634c f25536n0;

    /* renamed from: com.instabug.featuresrequest.ui.custom.IbFrRippleView$a */
    class C9632a implements Runnable {

        /* renamed from: b */
        private static transient /* synthetic */ boolean[] f25537b;

        /* renamed from: a */
        final /* synthetic */ IbFrRippleView f25538a;

        C9632a(IbFrRippleView ibFrRippleView) {
            boolean[] a = m45051a();
            this.f25538a = ibFrRippleView;
            a[0] = true;
        }

        /* renamed from: a */
        private static /* synthetic */ boolean[] m45051a() {
            boolean[] zArr = f25537b;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(-7004338248183397777L, "com/instabug/featuresrequest/ui/custom/IbFrRippleView$1", 2);
            f25537b = a;
            return a;
        }

        public void run() {
            boolean[] a = m45051a();
            this.f25538a.invalidate();
            a[1] = true;
        }
    }

    /* renamed from: com.instabug.featuresrequest.ui.custom.IbFrRippleView$b */
    class C9633b extends SimpleOnGestureListener {

        /* renamed from: b */
        private static transient /* synthetic */ boolean[] f25539b;

        /* renamed from: a */
        final /* synthetic */ IbFrRippleView f25540a;

        C9633b(IbFrRippleView ibFrRippleView) {
            boolean[] a = m45052a();
            this.f25540a = ibFrRippleView;
            a[0] = true;
        }

        /* renamed from: a */
        private static /* synthetic */ boolean[] m45052a() {
            boolean[] zArr = f25539b;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(-1802493220540669332L, "com/instabug/featuresrequest/ui/custom/IbFrRippleView$2", 6);
            f25539b = a;
            return a;
        }

        public void onLongPress(MotionEvent motionEvent) {
            boolean[] a = m45052a();
            super.onLongPress(motionEvent);
            a[1] = true;
            this.f25540a.mo34465a(motionEvent);
            a[2] = true;
            IbFrRippleView.m45047a(this.f25540a, Boolean.valueOf(true));
            a[3] = true;
        }

        public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
            m45052a()[4] = true;
            return true;
        }

        public boolean onSingleTapUp(MotionEvent motionEvent) {
            m45052a()[5] = true;
            return true;
        }
    }

    /* renamed from: com.instabug.featuresrequest.ui.custom.IbFrRippleView$c */
    public interface C9634c {
        /* renamed from: a */
        void mo34494a(IbFrRippleView ibFrRippleView);
    }

    /* renamed from: com.instabug.featuresrequest.ui.custom.IbFrRippleView$d */
    public enum C9635d {
        SIMPLE(0),
        DOUBLE(1),
        RECTANGLE(2);
        
        int type;

        static {
            boolean[] d;
            d[5] = true;
        }

        private C9635d(int i) {
            boolean[] d = m45054d();
            this.type = i;
            d[2] = true;
        }
    }

    public IbFrRippleView(Context context) {
        boolean[] a = m45049a();
        super(context);
        a[0] = true;
        a[1] = true;
        this.f25530h0 = Integer.valueOf(2);
        a[2] = true;
    }

    /* renamed from: a */
    static /* synthetic */ void m45047a(IbFrRippleView ibFrRippleView, Boolean bool) {
        boolean[] a = m45049a();
        ibFrRippleView.m45048a(bool);
        a[147] = true;
    }

    /* renamed from: a */
    private static /* synthetic */ boolean[] m45049a() {
        boolean[] zArr = f25510o0;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(5679378589381822L, "com/instabug/featuresrequest/ui/custom/IbFrRippleView", C13959t.f40921k2);
        f25510o0 = a;
        return a;
    }

    public void draw(Canvas canvas) {
        boolean[] a = m45049a();
        super.draw(canvas);
        if (!this.f25517T) {
            a[36] = true;
        } else {
            a[37] = true;
            canvas.save();
            int i = this.f25513P;
            int i2 = this.f25518U;
            int i3 = this.f25512O;
            if (i <= i2 * i3) {
                this.f25517T = false;
                this.f25518U = 0;
                this.f25520W = -1;
                this.f25519V = 0;
                if (VERSION.SDK_INT == 23) {
                    a[38] = true;
                } else {
                    a[39] = true;
                    canvas.restore();
                    a[40] = true;
                }
                invalidate();
                a[41] = true;
                C9634c cVar = this.f25536n0;
                if (cVar == null) {
                    a[42] = true;
                } else {
                    cVar.mo34494a(this);
                    a[43] = true;
                }
                a[44] = true;
                return;
            }
            this.f25515R.postDelayed(this.f25521a, (long) i3);
            if (this.f25518U != 0) {
                a[45] = true;
            } else {
                a[46] = true;
                canvas.save();
                a[47] = true;
            }
            canvas.drawCircle(this.f25522a0, this.f25524b0, this.f25516S * ((((float) this.f25518U) * ((float) this.f25512O)) / ((float) this.f25513P)), this.f25531i0);
            a[48] = true;
            this.f25531i0.setColor(Color.parseColor("#ffff4444"));
            a[49] = true;
            if (this.f25530h0.intValue() != 1) {
                a[50] = true;
            } else if (this.f25532j0 == null) {
                a[51] = true;
            } else {
                int i4 = this.f25518U;
                float f = (float) i4;
                int i5 = this.f25512O;
                float f2 = f * ((float) i5);
                int i6 = this.f25513P;
                if (f2 / ((float) i6) <= 0.4f) {
                    a[52] = true;
                } else {
                    if (this.f25520W != -1) {
                        a[53] = true;
                    } else {
                        this.f25520W = i6 - (i4 * i5);
                        a[54] = true;
                    }
                    this.f25519V++;
                    a[55] = true;
                    Bitmap a2 = m45044a((int) (this.f25516S * ((((float) this.f25519V) * ((float) this.f25512O)) / ((float) this.f25520W))));
                    a[56] = true;
                    canvas.drawBitmap(a2, 0.0f, 0.0f, this.f25531i0);
                    a[57] = true;
                    a2.recycle();
                    a[58] = true;
                }
            }
            this.f25531i0.setColor(this.f25533k0);
            a[59] = true;
            if (this.f25530h0.intValue() == 1) {
                float f3 = (float) this.f25518U;
                int i7 = this.f25512O;
                if ((f3 * ((float) i7)) / ((float) this.f25513P) > 0.6f) {
                    a[60] = true;
                    Paint paint = this.f25531i0;
                    int i8 = this.f25514Q;
                    paint.setAlpha((int) (((float) i8) - (((float) i8) * ((((float) this.f25519V) * ((float) i7)) / ((float) this.f25520W)))));
                    a[61] = true;
                } else {
                    this.f25531i0.setAlpha(this.f25514Q);
                    a[62] = true;
                }
            } else {
                Paint paint2 = this.f25531i0;
                int i9 = this.f25514Q;
                paint2.setAlpha((int) (((float) i9) - (((float) i9) * ((((float) this.f25518U) * ((float) this.f25512O)) / ((float) this.f25513P)))));
                a[63] = true;
            }
            this.f25518U++;
            a[64] = true;
        }
        a[65] = true;
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        boolean[] a = m45049a();
        super.drawableStateChanged();
        a[35] = true;
    }

    public int getFrameRate() {
        boolean[] a = m45049a();
        int i = this.f25512O;
        a[142] = true;
        return i;
    }

    public int getRippleAlpha() {
        boolean[] a = m45049a();
        int i = this.f25514Q;
        a[144] = true;
        return i;
    }

    public int getRippleColor() {
        boolean[] a = m45049a();
        int i = this.f25533k0;
        a[126] = true;
        return i;
    }

    public int getRippleDuration() {
        boolean[] a = m45049a();
        int i = this.f25513P;
        a[140] = true;
        return i;
    }

    public int getRipplePadding() {
        boolean[] a = m45049a();
        int i = this.f25534l0;
        a[132] = true;
        return i;
    }

    public C9635d getRippleType() {
        boolean[] a = m45049a();
        C9635d dVar = C9635d.values()[this.f25530h0.intValue()];
        a[128] = true;
        return dVar;
    }

    public int getZoomDuration() {
        boolean[] a = m45049a();
        int i = this.f25525c0;
        a[138] = true;
        return i;
    }

    public float getZoomScale() {
        boolean[] a = m45049a();
        float f = this.f25526d0;
        a[136] = true;
        return f;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean[] a = m45049a();
        onTouchEvent(motionEvent);
        a[100] = true;
        boolean onInterceptTouchEvent = super.onInterceptTouchEvent(motionEvent);
        a[101] = true;
        return onInterceptTouchEvent;
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        boolean[] a = m45049a();
        super.onSizeChanged(i, i2, i3, i4);
        this.f25523b = i;
        this.f25511N = i2;
        a[66] = true;
        float f = this.f25526d0;
        ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f, f, 1.0f, f, ((float) i) / 2.0f, ((float) i2) / 2.0f);
        this.f25527e0 = scaleAnimation;
        a[67] = true;
        this.f25527e0.setDuration((long) this.f25525c0);
        a[68] = true;
        this.f25527e0.setRepeatMode(2);
        a[69] = true;
        this.f25527e0.setRepeatCount(1);
        a[70] = true;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean[] a = m45049a();
        if (!this.f25535m0.onTouchEvent(motionEvent)) {
            a[95] = true;
        } else {
            a[96] = true;
            mo34465a(motionEvent);
            a[97] = true;
            m45048a(Boolean.valueOf(false));
            a[98] = true;
        }
        boolean onTouchEvent = super.onTouchEvent(motionEvent);
        a[99] = true;
        return onTouchEvent;
    }

    public void setCentered(Boolean bool) {
        boolean[] a = m45049a();
        this.f25529g0 = bool;
        a[131] = true;
    }

    public void setFrameRate(int i) {
        boolean[] a = m45049a();
        this.f25512O = i;
        a[143] = true;
    }

    public void setOnRippleCompleteListener(C9634c cVar) {
        boolean[] a = m45049a();
        this.f25536n0 = cVar;
        a[146] = true;
    }

    public void setRippleAlpha(int i) {
        boolean[] a = m45049a();
        this.f25514Q = i;
        a[145] = true;
    }

    public void setRippleColor(int i) {
        boolean[] a = m45049a();
        this.f25533k0 = i;
        a[127] = true;
    }

    public void setRippleDuration(int i) {
        boolean[] a = m45049a();
        this.f25513P = i;
        a[141] = true;
    }

    public void setRipplePadding(int i) {
        boolean[] a = m45049a();
        this.f25534l0 = i;
        a[133] = true;
    }

    public void setRippleType(C9635d dVar) {
        boolean[] a = m45049a();
        this.f25530h0 = Integer.valueOf(dVar.ordinal());
        a[129] = true;
    }

    public void setZoomDuration(int i) {
        boolean[] a = m45049a();
        this.f25525c0 = i;
        a[139] = true;
    }

    public void setZoomScale(float f) {
        boolean[] a = m45049a();
        this.f25526d0 = f;
        a[137] = true;
    }

    public void setZooming(Boolean bool) {
        boolean[] a = m45049a();
        this.f25528f0 = bool;
        a[135] = true;
    }

    /* renamed from: a */
    private void m45046a(Context context, AttributeSet attributeSet) {
        boolean[] a = m45049a();
        if (isInEditMode()) {
            a[11] = true;
            return;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C9525R.styleable.IbFrRippleView);
        int i = C9525R.styleable.IbFrRippleView_ib_fr_rv_color;
        a[12] = true;
        int color = getResources().getColor(C9525R.C9527color.ib_fr_ripple_color);
        a[13] = true;
        this.f25533k0 = obtainStyledAttributes.getColor(i, color);
        a[14] = true;
        this.f25530h0 = Integer.valueOf(obtainStyledAttributes.getInt(C9525R.styleable.IbFrRippleView_ib_fr_rv_type, 2));
        a[15] = true;
        this.f25528f0 = Boolean.valueOf(obtainStyledAttributes.getBoolean(C9525R.styleable.IbFrRippleView_ib_fr_rv_zoom, true));
        a[16] = true;
        this.f25529g0 = Boolean.valueOf(obtainStyledAttributes.getBoolean(C9525R.styleable.IbFrRippleView_ib_fr_rv_centered, true));
        a[17] = true;
        this.f25513P = obtainStyledAttributes.getInteger(C9525R.styleable.IbFrRippleView_ib_fr_rv_rippleDuration, 200);
        a[18] = true;
        this.f25512O = obtainStyledAttributes.getInteger(C9525R.styleable.IbFrRippleView_ib_fr_rv_framerate, this.f25512O);
        a[19] = true;
        this.f25514Q = obtainStyledAttributes.getInteger(C9525R.styleable.IbFrRippleView_ib_fr_rv_alpha, this.f25514Q);
        a[20] = true;
        this.f25534l0 = obtainStyledAttributes.getDimensionPixelSize(C9525R.styleable.IbFrRippleView_ib_fr_rv_ripplePadding, 0);
        a[21] = true;
        this.f25515R = new Handler();
        a[22] = true;
        this.f25526d0 = obtainStyledAttributes.getFloat(C9525R.styleable.IbFrRippleView_ib_fr_rv_zoomScale, 1.03f);
        a[23] = true;
        this.f25525c0 = obtainStyledAttributes.getInt(C9525R.styleable.IbFrRippleView_ib_fr_rv_zoomDuration, 200);
        a[24] = true;
        obtainStyledAttributes.recycle();
        a[25] = true;
        this.f25531i0 = new Paint();
        a[26] = true;
        this.f25531i0.setAntiAlias(true);
        a[27] = true;
        this.f25531i0.setStyle(Style.FILL);
        a[28] = true;
        this.f25531i0.setColor(this.f25533k0);
        a[29] = true;
        this.f25531i0.setAlpha(this.f25514Q);
        a[30] = true;
        setWillNotDraw(false);
        a[31] = true;
        this.f25535m0 = new GestureDetector(context, new C9633b(this));
        a[32] = true;
        setDrawingCacheEnabled(true);
        a[33] = true;
        setClickable(true);
        a[34] = true;
    }

    public IbFrRippleView(Context context, AttributeSet attributeSet) {
        boolean[] a = m45049a();
        super(context, attributeSet);
        a[3] = true;
        a[4] = true;
        this.f25530h0 = Integer.valueOf(2);
        a[5] = true;
        m45046a(context, attributeSet);
        a[6] = true;
    }

    /* renamed from: a */
    public void mo34465a(MotionEvent motionEvent) {
        boolean[] a = m45049a();
        m45045a(motionEvent.getX(), motionEvent.getY());
        a[71] = true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x00b5  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00ba  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m45045a(float r6, float r7) {
        /*
            r5 = this;
            boolean[] r0 = m45049a()
            boolean r1 = r5.isEnabled()
            r2 = 1
            if (r1 != 0) goto L_0x0011
            r6 = 73
            r0[r6] = r2
            goto L_0x00d8
        L_0x0011:
            boolean r1 = r5.f25517T
            if (r1 == 0) goto L_0x001b
            r6 = 74
            r0[r6] = r2
            goto L_0x00d8
        L_0x001b:
            r1 = 75
            r0[r1] = r2
            java.lang.Boolean r1 = r5.f25528f0
            boolean r1 = r1.booleanValue()
            if (r1 != 0) goto L_0x002c
            r1 = 76
            r0[r1] = r2
            goto L_0x0039
        L_0x002c:
            r1 = 77
            r0[r1] = r2
            android.view.animation.ScaleAnimation r1 = r5.f25527e0
            r5.startAnimation(r1)
            r1 = 78
            r0[r1] = r2
        L_0x0039:
            int r1 = r5.f25523b
            int r3 = r5.f25511N
            int r1 = java.lang.Math.max(r1, r3)
            float r1 = (float) r1
            r5.f25516S = r1
            r1 = 79
            r0[r1] = r2
            java.lang.Integer r1 = r5.f25530h0
            int r1 = r1.intValue()
            r3 = 2
            r4 = 1073741824(0x40000000, float:2.0)
            if (r1 != r3) goto L_0x0058
            r1 = 80
            r0[r1] = r2
            goto L_0x0061
        L_0x0058:
            float r1 = r5.f25516S
            float r1 = r1 / r4
            r5.f25516S = r1
            r1 = 81
            r0[r1] = r2
        L_0x0061:
            float r1 = r5.f25516S
            int r3 = r5.f25534l0
            float r3 = (float) r3
            float r1 = r1 - r3
            r5.f25516S = r1
            r1 = 82
            r0[r1] = r2
            java.lang.Boolean r1 = r5.f25529g0
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L_0x007a
            r6 = 83
            r0[r6] = r2
            goto L_0x0086
        L_0x007a:
            java.lang.Integer r1 = r5.f25530h0
            int r1 = r1.intValue()
            if (r1 != r2) goto L_0x009f
            r6 = 84
            r0[r6] = r2
        L_0x0086:
            int r6 = r5.getMeasuredWidth()
            float r6 = (float) r6
            float r6 = r6 / r4
            r5.f25522a0 = r6
            r6 = 85
            r0[r6] = r2
            int r6 = r5.getMeasuredHeight()
            float r6 = (float) r6
            float r6 = r6 / r4
            r5.f25524b0 = r6
            r6 = 86
            r0[r6] = r2
            goto L_0x00a7
        L_0x009f:
            r5.f25522a0 = r6
            r5.f25524b0 = r7
            r6 = 87
            r0[r6] = r2
        L_0x00a7:
            r5.f25517T = r2
            r6 = 88
            r0[r6] = r2
            java.lang.Integer r6 = r5.f25530h0
            int r6 = r6.intValue()
            if (r6 == r2) goto L_0x00ba
            r6 = 89
            r0[r6] = r2
            goto L_0x00d1
        L_0x00ba:
            android.graphics.Bitmap r6 = r5.f25532j0
            if (r6 == 0) goto L_0x00c3
            r6 = 90
            r0[r6] = r2
            goto L_0x00d1
        L_0x00c3:
            r6 = 91
            r0[r6] = r2
            android.graphics.Bitmap r6 = r5.getDrawingCache(r2)
            r5.f25532j0 = r6
            r6 = 92
            r0[r6] = r2
        L_0x00d1:
            r5.invalidate()
            r6 = 93
            r0[r6] = r2
        L_0x00d8:
            r6 = 94
            r0[r6] = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instabug.featuresrequest.p373ui.custom.IbFrRippleView.m45045a(float, float):void");
    }

    @RequiresApi(api = 11)
    public IbFrRippleView(Context context, AttributeSet attributeSet, int i) {
        boolean[] a = m45049a();
        super(context, attributeSet, i);
        a[7] = true;
        a[8] = true;
        this.f25530h0 = Integer.valueOf(2);
        a[9] = true;
        m45046a(context, attributeSet);
        a[10] = true;
    }

    /* renamed from: a */
    private void m45048a(Boolean bool) {
        boolean[] a = m45049a();
        if (!(getParent() instanceof AdapterView)) {
            a[102] = true;
        } else {
            a[103] = true;
            AdapterView adapterView = (AdapterView) getParent();
            a[104] = true;
            int positionForView = adapterView.getPositionForView(this);
            a[105] = true;
            long itemIdAtPosition = adapterView.getItemIdAtPosition(positionForView);
            a[106] = true;
            if (bool.booleanValue()) {
                a[107] = true;
                if (adapterView.getOnItemLongClickListener() == null) {
                    a[108] = true;
                } else {
                    a[109] = true;
                    adapterView.getOnItemLongClickListener().onItemLongClick(adapterView, this, positionForView, itemIdAtPosition);
                    a[110] = true;
                }
            } else if (adapterView.getOnItemClickListener() == null) {
                a[111] = true;
            } else {
                a[112] = true;
                adapterView.getOnItemClickListener().onItemClick(adapterView, this, positionForView, itemIdAtPosition);
                a[113] = true;
            }
        }
        a[114] = true;
    }

    /* renamed from: a */
    private Bitmap m45044a(int i) {
        boolean[] a = m45049a();
        int width = this.f25532j0.getWidth();
        Bitmap bitmap = this.f25532j0;
        a[115] = true;
        int height = bitmap.getHeight();
        Config config = Config.ARGB_8888;
        a[116] = true;
        Bitmap createBitmap = Bitmap.createBitmap(width, height, config);
        a[117] = true;
        Canvas canvas = new Canvas(createBitmap);
        a[118] = true;
        Paint paint = new Paint();
        a[119] = true;
        float f = this.f25522a0;
        float f2 = (float) i;
        int i2 = (int) (f - f2);
        float f3 = this.f25524b0;
        Rect rect = new Rect(i2, (int) (f3 - f2), (int) (f + f2), (int) (f3 + f2));
        a[120] = true;
        paint.setAntiAlias(true);
        a[121] = true;
        canvas.drawARGB(0, 0, 0, 0);
        a[122] = true;
        canvas.drawCircle(this.f25522a0, this.f25524b0, f2, paint);
        a[123] = true;
        paint.setXfermode(new PorterDuffXfermode(Mode.SRC_IN));
        a[124] = true;
        canvas.drawBitmap(this.f25532j0, rect, rect, paint);
        a[125] = true;
        return createBitmap;
    }
}
