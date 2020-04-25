package com.instabug.library.p397ui.custom.pagerindicator;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import com.instabug.library.C9700R;
import com.instabug.library.view.ViewUtils;
import p205i.p471b.p472a.p473a.p474c.C13938g;
import p205i.p471b.p472a.p473a.p474c.p475i.C13959t;

/* renamed from: com.instabug.library.ui.custom.pagerindicator.Dot */
public final class Dot extends RelativeLayout {
    private static transient /* synthetic */ boolean[] $jacocoData = null;
    private static final int DEFAULT_ACTIVE_COLOR = -1;
    private static final int DEFAULT_ACTIVE_DIAMETER_DP = 9;
    private static final int DEFAULT_INACTIVE_COLOR = -1;
    private static final int DEFAULT_INACTIVE_DIAMETER_DP = 6;
    private static final boolean DEFAULT_INITIALLY_ACTIVE = false;
    private static final int DEFAULT_TRANSITION_DURATION_MS = 200;
    private static final String TAG = "DOT";
    private int activeColor;
    private int activeDiameterPx;
    private AnimatorSet currentAnimator = null;
    private ImageView drawableHolder;
    private int inactiveColor;
    private int inactiveDiameterPx;
    private ShapeDrawable shape;
    private State state;
    private int transitionDurationMs;

    /* renamed from: com.instabug.library.ui.custom.pagerindicator.Dot$State */
    protected enum State {
        INACTIVE(true, null, null),
        ACTIVE(true, null, null),
        TRANSITIONING_TO_ACTIVE(false, ACTIVE, INACTIVE),
        TRANSITIONING_TO_INACTIVE(false, INACTIVE, ACTIVE);
        
        private final State from;
        private final boolean isStable;

        /* renamed from: to */
        private final State f26605to;

        static {
            boolean[] $jacocoInit;
            $jacocoInit[9] = true;
        }

        private State(boolean z, State state, State state2) {
            boolean[] $jacocoInit = $jacocoInit();
            this.isStable = z;
            this.f26605to = state;
            this.from = state2;
            $jacocoInit[2] = true;
        }

        public boolean isStable() {
            boolean[] $jacocoInit = $jacocoInit();
            boolean z = this.isStable;
            $jacocoInit[3] = true;
            return z;
        }

        public State transitioningFrom() {
            boolean[] $jacocoInit = $jacocoInit();
            State state = this.from;
            $jacocoInit[5] = true;
            return state;
        }

        public State transitioningTo() {
            boolean[] $jacocoInit = $jacocoInit();
            State state = this.f26605to;
            $jacocoInit[4] = true;
            return state;
        }
    }

    private static /* synthetic */ boolean[] $jacocoInit() {
        boolean[] zArr = $jacocoData;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(509369024299434150L, "com/instabug/library/ui/custom/pagerindicator/Dot", C13959t.f40827P1);
        $jacocoData = a;
        return a;
    }

    public Dot(Context context) {
        boolean[] $jacocoInit = $jacocoInit();
        super(context);
        $jacocoInit[0] = true;
        init(null, 0, 0);
        $jacocoInit[1] = true;
    }

    static /* synthetic */ State access$000(Dot dot) {
        boolean[] $jacocoInit = $jacocoInit();
        State state2 = dot.state;
        $jacocoInit[122] = true;
        return state2;
    }

    static /* synthetic */ State access$002(Dot dot, State state2) {
        boolean[] $jacocoInit = $jacocoInit();
        dot.state = state2;
        $jacocoInit[123] = true;
        return state2;
    }

    static /* synthetic */ void access$100(Dot dot, int i) {
        boolean[] $jacocoInit = $jacocoInit();
        dot.changeSize(i);
        $jacocoInit[124] = true;
    }

    static /* synthetic */ void access$200(Dot dot, int i) {
        boolean[] $jacocoInit = $jacocoInit();
        dot.changeColor(i);
        $jacocoInit[125] = true;
    }

    static /* synthetic */ AnimatorSet access$302(Dot dot, AnimatorSet animatorSet) {
        boolean[] $jacocoInit = $jacocoInit();
        dot.currentAnimator = animatorSet;
        $jacocoInit[126] = true;
        return animatorSet;
    }

    private void animateDotChange(int i, int i2, int i3, final int i4, int i5) {
        boolean[] $jacocoInit = $jacocoInit();
        if (i < 0) {
            $jacocoInit[38] = true;
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("startSize cannot be less than 0");
            $jacocoInit[39] = true;
            throw illegalArgumentException;
        } else if (i2 < 0) {
            $jacocoInit[40] = true;
            IllegalArgumentException illegalArgumentException2 = new IllegalArgumentException("endSize cannot be less than 0");
            $jacocoInit[41] = true;
            throw illegalArgumentException2;
        } else if (i5 >= 0) {
            AnimatorSet animatorSet = this.currentAnimator;
            if (animatorSet == null) {
                $jacocoInit[44] = true;
            } else {
                $jacocoInit[45] = true;
                animatorSet.cancel();
                $jacocoInit[46] = true;
            }
            this.currentAnimator = new AnimatorSet();
            $jacocoInit[47] = true;
            this.currentAnimator.setDuration((long) i5);
            $jacocoInit[48] = true;
            AnimatorSet animatorSet2 = this.currentAnimator;
            final int i6 = i2;
            final int i7 = i4;
            final int i8 = i;
            final int i9 = i3;
            C99991 r2 = new AnimatorListenerAdapter(this) {
                private static transient /* synthetic */ boolean[] $jacocoData;
                final /* synthetic */ Dot this$0;

                private static /* synthetic */ boolean[] $jacocoInit() {
                    boolean[] zArr = $jacocoData;
                    if (zArr != null) {
                        return zArr;
                    }
                    boolean[] a = C13938g.m59885a(-5695749318904485558L, "com/instabug/library/ui/custom/pagerindicator/Dot$1", 19);
                    $jacocoData = a;
                    return a;
                }

                {
                    boolean[] $jacocoInit = $jacocoInit();
                    this.this$0 = r2;
                    $jacocoInit[0] = true;
                }

                public void onAnimationCancel(Animator animator) {
                    boolean[] $jacocoInit = $jacocoInit();
                    if (Dot.access$000(this.this$0).isStable()) {
                        $jacocoInit[13] = true;
                    } else {
                        $jacocoInit[14] = true;
                        Dot dot = this.this$0;
                        Dot.access$002(dot, Dot.access$000(dot).transitioningFrom());
                        $jacocoInit[15] = true;
                    }
                    Dot.access$100(this.this$0, i8);
                    $jacocoInit[16] = true;
                    Dot.access$200(this.this$0, i9);
                    $jacocoInit[17] = true;
                    Dot.access$302(this.this$0, null);
                    $jacocoInit[18] = true;
                }

                public void onAnimationEnd(Animator animator) {
                    boolean[] $jacocoInit = $jacocoInit();
                    if (Dot.access$000(this.this$0).isStable()) {
                        $jacocoInit[7] = true;
                    } else {
                        $jacocoInit[8] = true;
                        Dot dot = this.this$0;
                        Dot.access$002(dot, Dot.access$000(dot).transitioningTo());
                        $jacocoInit[9] = true;
                    }
                    Dot.access$100(this.this$0, i6);
                    $jacocoInit[10] = true;
                    Dot.access$200(this.this$0, i7);
                    $jacocoInit[11] = true;
                    Dot.access$302(this.this$0, null);
                    $jacocoInit[12] = true;
                }

                public void onAnimationStart(Animator animator) {
                    boolean[] $jacocoInit = $jacocoInit();
                    if (Dot.access$000(this.this$0) == State.INACTIVE) {
                        $jacocoInit[1] = true;
                        Dot.access$002(this.this$0, State.TRANSITIONING_TO_ACTIVE);
                        $jacocoInit[2] = true;
                    } else if (Dot.access$000(this.this$0) != State.ACTIVE) {
                        $jacocoInit[3] = true;
                    } else {
                        $jacocoInit[4] = true;
                        Dot.access$002(this.this$0, State.TRANSITIONING_TO_INACTIVE);
                        $jacocoInit[5] = true;
                    }
                    $jacocoInit[6] = true;
                }
            };
            animatorSet2.addListener(r2);
            $jacocoInit[49] = true;
            ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{i, i2});
            $jacocoInit[50] = true;
            ofInt.addUpdateListener(new AnimatorUpdateListener(this) {
                private static transient /* synthetic */ boolean[] $jacocoData;
                final /* synthetic */ Dot this$0;

                private static /* synthetic */ boolean[] $jacocoInit() {
                    boolean[] zArr = $jacocoData;
                    if (zArr != null) {
                        return zArr;
                    }
                    boolean[] a = C13938g.m59885a(5233700743107557485L, "com/instabug/library/ui/custom/pagerindicator/Dot$2", 3);
                    $jacocoData = a;
                    return a;
                }

                {
                    boolean[] $jacocoInit = $jacocoInit();
                    this.this$0 = r3;
                    $jacocoInit[0] = true;
                }

                public void onAnimationUpdate(ValueAnimator valueAnimator) {
                    boolean[] $jacocoInit = $jacocoInit();
                    int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                    $jacocoInit[1] = true;
                    Dot.access$100(this.this$0, intValue);
                    $jacocoInit[2] = true;
                }
            });
            $jacocoInit[51] = true;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
            $jacocoInit[52] = true;
            ofFloat.addUpdateListener(new AnimatorUpdateListener(this) {
                private static transient /* synthetic */ boolean[] $jacocoData;
                final /* synthetic */ Dot this$0;

                private static /* synthetic */ boolean[] $jacocoInit() {
                    boolean[] zArr = $jacocoData;
                    if (zArr != null) {
                        return zArr;
                    }
                    boolean[] a = C13938g.m59885a(4041308368568560918L, "com/instabug/library/ui/custom/pagerindicator/Dot$3", 2);
                    $jacocoData = a;
                    return a;
                }

                {
                    boolean[] $jacocoInit = $jacocoInit();
                    this.this$0 = r2;
                    $jacocoInit[0] = true;
                }

                public void onAnimationUpdate(ValueAnimator valueAnimator) {
                    boolean[] $jacocoInit = $jacocoInit();
                    Dot.access$200(this.this$0, i4);
                    $jacocoInit[1] = true;
                }
            });
            $jacocoInit[53] = true;
            this.currentAnimator.playTogether(new Animator[]{ofInt, ofFloat});
            $jacocoInit[54] = true;
            this.currentAnimator.start();
            $jacocoInit[55] = true;
        } else {
            $jacocoInit[42] = true;
            IllegalArgumentException illegalArgumentException3 = new IllegalArgumentException("duration cannot be less than 0");
            $jacocoInit[43] = true;
            throw illegalArgumentException3;
        }
    }

    private void changeColor(int i) {
        boolean[] $jacocoInit = $jacocoInit();
        this.shape.getPaint().setColor(i);
        $jacocoInit[60] = true;
    }

    private void changeSize(int i) {
        boolean[] $jacocoInit = $jacocoInit();
        this.shape.setIntrinsicWidth(i);
        $jacocoInit[56] = true;
        this.shape.setIntrinsicHeight(i);
        $jacocoInit[57] = true;
        this.drawableHolder.setImageDrawable(null);
        $jacocoInit[58] = true;
        this.drawableHolder.setImageDrawable(this.shape);
        $jacocoInit[59] = true;
    }

    private void init(AttributeSet attributeSet, int i, int i2) {
        State state2;
        boolean[] $jacocoInit = $jacocoInit();
        Context context = getContext();
        int[] iArr = C9700R.styleable.IBDot;
        $jacocoInit[8] = true;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, i2);
        $jacocoInit[9] = true;
        int convertDpToPx = ViewUtils.convertDpToPx(getContext(), 9.0f);
        $jacocoInit[10] = true;
        int convertDpToPx2 = ViewUtils.convertDpToPx(getContext(), 6.0f);
        int i3 = C9700R.styleable.IBDot_ibViewPagerInactiveDiameter;
        $jacocoInit[11] = true;
        this.inactiveDiameterPx = obtainStyledAttributes.getDimensionPixelSize(i3, convertDpToPx2);
        int i4 = C9700R.styleable.IBDot_ibViewPagerActiveDiameter;
        $jacocoInit[12] = true;
        this.activeDiameterPx = obtainStyledAttributes.getDimensionPixelSize(i4, convertDpToPx);
        $jacocoInit[13] = true;
        this.inactiveColor = obtainStyledAttributes.getColor(C9700R.styleable.IBDot_ibViewPagerInactiveColor, -1);
        $jacocoInit[14] = true;
        this.activeColor = obtainStyledAttributes.getColor(C9700R.styleable.IBDot_ibViewPagerActiveColor, -1);
        int i5 = C9700R.styleable.IBDot_ibViewPagerTransitionDuration;
        $jacocoInit[15] = true;
        this.transitionDurationMs = obtainStyledAttributes.getInt(i5, 200);
        $jacocoInit[16] = true;
        if (obtainStyledAttributes.getBoolean(C9700R.styleable.IBDot_ibViewPagerInitiallyActive, false)) {
            state2 = State.ACTIVE;
            $jacocoInit[17] = true;
        } else {
            state2 = State.INACTIVE;
            $jacocoInit[18] = true;
        }
        this.state = state2;
        $jacocoInit[19] = true;
        obtainStyledAttributes.recycle();
        $jacocoInit[20] = true;
        reflectParametersInView();
        $jacocoInit[21] = true;
    }

    private void reflectParametersInView() {
        int i;
        int i2;
        boolean[] $jacocoInit = $jacocoInit();
        removeAllViews();
        $jacocoInit[22] = true;
        int max = Math.max(this.inactiveDiameterPx, this.activeDiameterPx);
        $jacocoInit[23] = true;
        setLayoutParams(new LayoutParams(max, max));
        $jacocoInit[24] = true;
        setGravity(17);
        if (this.state == State.ACTIVE) {
            i = this.activeDiameterPx;
            $jacocoInit[25] = true;
        } else {
            i = this.inactiveDiameterPx;
            $jacocoInit[26] = true;
        }
        if (this.state == State.ACTIVE) {
            i2 = this.activeColor;
            $jacocoInit[27] = true;
        } else {
            i2 = this.inactiveColor;
            $jacocoInit[28] = true;
        }
        $jacocoInit[29] = true;
        this.shape = new ShapeDrawable(new OvalShape());
        $jacocoInit[30] = true;
        this.shape.setIntrinsicWidth(i);
        $jacocoInit[31] = true;
        this.shape.setIntrinsicHeight(i);
        $jacocoInit[32] = true;
        this.shape.getPaint().setColor(i2);
        $jacocoInit[33] = true;
        this.drawableHolder = new ImageView(getContext());
        $jacocoInit[34] = true;
        this.drawableHolder.setImageDrawable(null);
        $jacocoInit[35] = true;
        this.drawableHolder.setImageDrawable(this.shape);
        $jacocoInit[36] = true;
        addView(this.drawableHolder);
        $jacocoInit[37] = true;
    }

    public int getActiveColor() {
        boolean[] $jacocoInit = $jacocoInit();
        int i = this.activeColor;
        $jacocoInit[80] = true;
        return i;
    }

    public int getActiveDiameter() {
        boolean[] $jacocoInit = $jacocoInit();
        int i = this.activeDiameterPx;
        $jacocoInit[76] = true;
        return i;
    }

    public int getInactiveColor() {
        boolean[] $jacocoInit = $jacocoInit();
        int i = this.inactiveColor;
        $jacocoInit[77] = true;
        return i;
    }

    public int getInactiveDiameter() {
        boolean[] $jacocoInit = $jacocoInit();
        int i = this.inactiveDiameterPx;
        $jacocoInit[68] = true;
        return i;
    }

    public int getTransitionDuration() {
        boolean[] $jacocoInit = $jacocoInit();
        int i = this.transitionDurationMs;
        $jacocoInit[83] = true;
        return i;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0057  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setActive(boolean r10) {
        /*
            r9 = this;
            boolean[] r0 = $jacocoInit()
            android.animation.AnimatorSet r1 = r9.currentAnimator
            r2 = 1
            if (r1 != 0) goto L_0x000e
            r1 = 109(0x6d, float:1.53E-43)
            r0[r1] = r2
            goto L_0x0019
        L_0x000e:
            r3 = 110(0x6e, float:1.54E-43)
            r0[r3] = r2
            r1.cancel()
            r1 = 111(0x6f, float:1.56E-43)
            r0[r1] = r2
        L_0x0019:
            if (r10 != 0) goto L_0x0020
            r10 = 112(0x70, float:1.57E-43)
            r0[r10] = r2
            goto L_0x0033
        L_0x0020:
            com.instabug.library.ui.custom.pagerindicator.Dot$State r10 = r9.state
            com.instabug.library.ui.custom.pagerindicator.Dot$State r1 = com.instabug.library.p397ui.custom.pagerindicator.Dot.State.ACTIVE
            if (r10 != r1) goto L_0x002b
            r10 = 113(0x71, float:1.58E-43)
            r0[r10] = r2
            goto L_0x0033
        L_0x002b:
            int r10 = r9.transitionDurationMs
            if (r10 > 0) goto L_0x0039
            r10 = 114(0x72, float:1.6E-43)
            r0[r10] = r2
        L_0x0033:
            r10 = 0
            r1 = 116(0x74, float:1.63E-43)
            r0[r1] = r2
            goto L_0x003e
        L_0x0039:
            r10 = 115(0x73, float:1.61E-43)
            r0[r10] = r2
            r10 = 1
        L_0x003e:
            if (r10 == 0) goto L_0x0057
            r10 = 117(0x75, float:1.64E-43)
            r0[r10] = r2
            int r4 = r9.inactiveDiameterPx
            int r5 = r9.activeDiameterPx
            int r6 = r9.inactiveColor
            int r7 = r9.activeColor
            int r8 = r9.transitionDurationMs
            r3 = r9
            r3.animateDotChange(r4, r5, r6, r7, r8)
            r10 = 118(0x76, float:1.65E-43)
            r0[r10] = r2
            goto L_0x006d
        L_0x0057:
            int r10 = r9.activeDiameterPx
            r9.changeSize(r10)
            r10 = 119(0x77, float:1.67E-43)
            r0[r10] = r2
            int r10 = r9.activeColor
            r9.changeColor(r10)
            com.instabug.library.ui.custom.pagerindicator.Dot$State r10 = com.instabug.library.p397ui.custom.pagerindicator.Dot.State.ACTIVE
            r9.state = r10
            r10 = 120(0x78, float:1.68E-43)
            r0[r10] = r2
        L_0x006d:
            r10 = 121(0x79, float:1.7E-43)
            r0[r10] = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instabug.library.p397ui.custom.pagerindicator.Dot.setActive(boolean):void");
    }

    public Dot setActiveColor(int i) {
        boolean[] $jacocoInit = $jacocoInit();
        this.activeColor = i;
        $jacocoInit[81] = true;
        reflectParametersInView();
        $jacocoInit[82] = true;
        return this;
    }

    public Dot setActiveDiameterDp(int i) {
        boolean[] $jacocoInit = $jacocoInit();
        if (i >= 0) {
            setActiveDiameterPx(i);
            $jacocoInit[75] = true;
            return this;
        }
        $jacocoInit[73] = true;
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("activeDiameterDp cannot be less than 0");
        $jacocoInit[74] = true;
        throw illegalArgumentException;
    }

    public Dot setActiveDiameterPx(int i) {
        boolean[] $jacocoInit = $jacocoInit();
        if (i >= 0) {
            this.activeDiameterPx = i;
            $jacocoInit[71] = true;
            reflectParametersInView();
            $jacocoInit[72] = true;
            return this;
        }
        $jacocoInit[69] = true;
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("activeDiameterPx cannot be less than 0");
        $jacocoInit[70] = true;
        throw illegalArgumentException;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0057  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setInactive(boolean r10) {
        /*
            r9 = this;
            boolean[] r0 = $jacocoInit()
            android.animation.AnimatorSet r1 = r9.currentAnimator
            r2 = 1
            if (r1 != 0) goto L_0x000e
            r1 = 96
            r0[r1] = r2
            goto L_0x0019
        L_0x000e:
            r3 = 97
            r0[r3] = r2
            r1.cancel()
            r1 = 98
            r0[r1] = r2
        L_0x0019:
            if (r10 != 0) goto L_0x0020
            r10 = 99
            r0[r10] = r2
            goto L_0x0033
        L_0x0020:
            com.instabug.library.ui.custom.pagerindicator.Dot$State r10 = r9.state
            com.instabug.library.ui.custom.pagerindicator.Dot$State r1 = com.instabug.library.p397ui.custom.pagerindicator.Dot.State.INACTIVE
            if (r10 != r1) goto L_0x002b
            r10 = 100
            r0[r10] = r2
            goto L_0x0033
        L_0x002b:
            int r10 = r9.transitionDurationMs
            if (r10 > 0) goto L_0x0039
            r10 = 101(0x65, float:1.42E-43)
            r0[r10] = r2
        L_0x0033:
            r10 = 0
            r1 = 103(0x67, float:1.44E-43)
            r0[r1] = r2
            goto L_0x003e
        L_0x0039:
            r10 = 102(0x66, float:1.43E-43)
            r0[r10] = r2
            r10 = 1
        L_0x003e:
            if (r10 == 0) goto L_0x0057
            r10 = 104(0x68, float:1.46E-43)
            r0[r10] = r2
            int r4 = r9.activeDiameterPx
            int r5 = r9.inactiveDiameterPx
            int r6 = r9.activeColor
            int r7 = r9.inactiveColor
            int r8 = r9.transitionDurationMs
            r3 = r9
            r3.animateDotChange(r4, r5, r6, r7, r8)
            r10 = 105(0x69, float:1.47E-43)
            r0[r10] = r2
            goto L_0x006d
        L_0x0057:
            int r10 = r9.inactiveDiameterPx
            r9.changeSize(r10)
            r10 = 106(0x6a, float:1.49E-43)
            r0[r10] = r2
            int r10 = r9.inactiveColor
            r9.changeColor(r10)
            com.instabug.library.ui.custom.pagerindicator.Dot$State r10 = com.instabug.library.p397ui.custom.pagerindicator.Dot.State.INACTIVE
            r9.state = r10
            r10 = 107(0x6b, float:1.5E-43)
            r0[r10] = r2
        L_0x006d:
            r10 = 108(0x6c, float:1.51E-43)
            r0[r10] = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instabug.library.p397ui.custom.pagerindicator.Dot.setInactive(boolean):void");
    }

    public Dot setInactiveColor(int i) {
        boolean[] $jacocoInit = $jacocoInit();
        this.inactiveColor = i;
        $jacocoInit[78] = true;
        reflectParametersInView();
        $jacocoInit[79] = true;
        return this;
    }

    public Dot setInactiveDiameterDp(int i) {
        boolean[] $jacocoInit = $jacocoInit();
        if (i >= 0) {
            setInactiveDiameterPx(ViewUtils.convertDpToPx(getContext(), (float) i));
            $jacocoInit[67] = true;
            return this;
        }
        $jacocoInit[65] = true;
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("inactiveDiameterDp cannot be less than 0");
        $jacocoInit[66] = true;
        throw illegalArgumentException;
    }

    public Dot setInactiveDiameterPx(int i) {
        boolean[] $jacocoInit = $jacocoInit();
        if (i >= 0) {
            this.inactiveDiameterPx = i;
            $jacocoInit[63] = true;
            reflectParametersInView();
            $jacocoInit[64] = true;
            return this;
        }
        $jacocoInit[61] = true;
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("inactiveDiameterPx cannot be less than 0");
        $jacocoInit[62] = true;
        throw illegalArgumentException;
    }

    public Dot setTransitionDuration(int i) {
        boolean[] $jacocoInit = $jacocoInit();
        if (i >= 0) {
            this.transitionDurationMs = i;
            $jacocoInit[86] = true;
            return this;
        }
        $jacocoInit[84] = true;
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("transitionDurationMs cannot be less than 0");
        $jacocoInit[85] = true;
        throw illegalArgumentException;
    }

    public void toggleState(boolean z) {
        boolean[] $jacocoInit = $jacocoInit();
        AnimatorSet animatorSet = this.currentAnimator;
        if (animatorSet == null) {
            $jacocoInit[87] = true;
        } else {
            $jacocoInit[88] = true;
            animatorSet.cancel();
            $jacocoInit[89] = true;
        }
        State state2 = this.state;
        if (state2 != State.ACTIVE) {
            $jacocoInit[90] = true;
            setActive(z);
            $jacocoInit[91] = true;
        } else if (state2 != State.INACTIVE) {
            $jacocoInit[92] = true;
            setInactive(z);
            $jacocoInit[93] = true;
        } else {
            $jacocoInit[94] = true;
        }
        $jacocoInit[95] = true;
    }

    public Dot(Context context, AttributeSet attributeSet) {
        boolean[] $jacocoInit = $jacocoInit();
        super(context, attributeSet);
        $jacocoInit[2] = true;
        init(attributeSet, 0, 0);
        $jacocoInit[3] = true;
    }

    public Dot(Context context, AttributeSet attributeSet, int i) {
        boolean[] $jacocoInit = $jacocoInit();
        super(context, attributeSet, i);
        $jacocoInit[4] = true;
        init(attributeSet, i, 0);
        $jacocoInit[5] = true;
    }

    @TargetApi(21)
    public Dot(Context context, AttributeSet attributeSet, int i, int i2) {
        boolean[] $jacocoInit = $jacocoInit();
        super(context, attributeSet, i, i2);
        $jacocoInit[6] = true;
        init(attributeSet, i, i2);
        $jacocoInit[7] = true;
    }
}
