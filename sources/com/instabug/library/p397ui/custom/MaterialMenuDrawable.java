package com.instabug.library.p397ui.custom;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;
import android.util.Property;
import android.util.TypedValue;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import androidx.annotation.RequiresApi;
import p205i.p471b.p472a.p473a.p474c.C13938g;

@RequiresApi(api = 14)
/* renamed from: com.instabug.library.ui.custom.MaterialMenuDrawable */
public class MaterialMenuDrawable extends Drawable implements Animatable, MaterialMenu {
    private static transient /* synthetic */ boolean[] $jacocoData = null;
    private static final float ARROW_BOT_LINE_ANGLE = 225.0f;
    private static final float ARROW_MID_LINE_ANGLE = 180.0f;
    private static final float ARROW_TOP_LINE_ANGLE = 135.0f;
    private static final int BASE_CIRCLE_RADIUS = 18;
    private static final int BASE_DRAWABLE_HEIGHT = 40;
    private static final int BASE_DRAWABLE_WIDTH = 40;
    private static final int BASE_ICON_WIDTH = 20;
    private static final float CHECK_BOTTOM_ANGLE = -90.0f;
    private static final float CHECK_MIDDLE_ANGLE = 135.0f;
    private static final int DEFAULT_CIRCLE_ALPHA = 200;
    public static final int DEFAULT_COLOR = -1;
    public static final int DEFAULT_SCALE = 1;
    public static final int DEFAULT_TRANSFORM_DURATION = 800;
    public static final boolean DEFAULT_VISIBLE = true;
    private static final float TRANSFORMATION_END = 2.0f;
    private static final float TRANSFORMATION_MID = 1.0f;
    private static final float TRANSFORMATION_START = 0.0f;
    private static final float X_BOT_LINE_ANGLE = -44.0f;
    private static final float X_ROTATION_ANGLE = 90.0f;
    private static final float X_TOP_LINE_ANGLE = 44.0f;
    private IconState animatingIconState;
    private AnimationState animationState;
    private AnimatorListener animatorListener;
    private final Paint circlePaint;
    private final float circleRadius;
    private IconState currentIconState;
    private final float dip1;
    private final float dip2;
    private final float dip3;
    private final float dip4;
    private final float dip8;
    private final float diph;
    private final int height;
    private final Paint iconPaint;
    private final float iconWidth;
    private final Object lock;
    private MaterialMenuState materialMenuState;
    private boolean rtlEnabled;
    private final float sidePadding;
    private final Stroke stroke;
    private final float strokeWidth;
    private final float topPadding;
    private ObjectAnimator transformation;
    private Property<MaterialMenuDrawable, Float> transformationProperty;
    private boolean transformationRunning;
    private float transformationValue;
    private boolean visible;
    private final int width;

    /* renamed from: com.instabug.library.ui.custom.MaterialMenuDrawable$3 */
    static /* synthetic */ class C99983 {

        /* renamed from: $SwitchMap$com$instabug$library$ui$custom$MaterialMenuDrawable$AnimationState */
        static final /* synthetic */ int[] f26601xec836c19 = new int[AnimationState.values().length];

        /* renamed from: $SwitchMap$com$instabug$library$ui$custom$MaterialMenuDrawable$IconState */
        static final /* synthetic */ int[] f26602xf8499f6c = new int[IconState.values().length];

        /* renamed from: $SwitchMap$com$instabug$library$ui$custom$MaterialMenuDrawable$Stroke */
        static final /* synthetic */ int[] f26603x329502e4 = new int[Stroke.values().length];
        private static transient /* synthetic */ boolean[] $jacocoData;

        private static /* synthetic */ boolean[] $jacocoInit() {
            boolean[] zArr = $jacocoData;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(3603659545249303741L, "com/instabug/library/ui/custom/MaterialMenuDrawable$3", 30);
            $jacocoData = a;
            return a;
        }

        /* JADX WARNING: Can't wrap try/catch for region: R(2:12|13) */
        /* JADX WARNING: Can't wrap try/catch for region: R(2:4|5) */
        /* JADX WARNING: Can't wrap try/catch for region: R(2:8|9) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            r0[6] = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x0051, code lost:
            r0[8] = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:5:?, code lost:
            r0[2] = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:9:?, code lost:
            r0[4] = true;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x0041 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:4:0x0023 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x0032 */
        static {
            /*
                boolean[] r0 = $jacocoInit()
                com.instabug.library.ui.custom.MaterialMenuDrawable$IconState[] r1 = com.instabug.library.p397ui.custom.MaterialMenuDrawable.IconState.values()
                int r1 = r1.length
                int[] r1 = new int[r1]
                f26602xf8499f6c = r1
                r1 = 0
                r2 = 5
                r3 = 6
                r4 = 4
                r5 = 3
                r6 = 2
                r7 = 1
                r0[r1] = r7     // Catch:{ NoSuchFieldError -> 0x0023 }
                int[] r1 = f26602xf8499f6c     // Catch:{ NoSuchFieldError -> 0x0023 }
                com.instabug.library.ui.custom.MaterialMenuDrawable$IconState r8 = com.instabug.library.p397ui.custom.MaterialMenuDrawable.IconState.BURGER     // Catch:{ NoSuchFieldError -> 0x0023 }
                int r8 = r8.ordinal()     // Catch:{ NoSuchFieldError -> 0x0023 }
                r1[r8] = r7     // Catch:{ NoSuchFieldError -> 0x0023 }
                r0[r7] = r7
                goto L_0x0025
            L_0x0023:
                r0[r6] = r7     // Catch:{ NoSuchFieldError -> 0x0032 }
            L_0x0025:
                int[] r1 = f26602xf8499f6c     // Catch:{ NoSuchFieldError -> 0x0032 }
                com.instabug.library.ui.custom.MaterialMenuDrawable$IconState r8 = com.instabug.library.p397ui.custom.MaterialMenuDrawable.IconState.ARROW     // Catch:{ NoSuchFieldError -> 0x0032 }
                int r8 = r8.ordinal()     // Catch:{ NoSuchFieldError -> 0x0032 }
                r1[r8] = r6     // Catch:{ NoSuchFieldError -> 0x0032 }
                r0[r5] = r7
                goto L_0x0034
            L_0x0032:
                r0[r4] = r7     // Catch:{ NoSuchFieldError -> 0x0041 }
            L_0x0034:
                int[] r1 = f26602xf8499f6c     // Catch:{ NoSuchFieldError -> 0x0041 }
                com.instabug.library.ui.custom.MaterialMenuDrawable$IconState r8 = com.instabug.library.p397ui.custom.MaterialMenuDrawable.IconState.X     // Catch:{ NoSuchFieldError -> 0x0041 }
                int r8 = r8.ordinal()     // Catch:{ NoSuchFieldError -> 0x0041 }
                r1[r8] = r5     // Catch:{ NoSuchFieldError -> 0x0041 }
                r0[r2] = r7
                goto L_0x0043
            L_0x0041:
                r0[r3] = r7     // Catch:{ NoSuchFieldError -> 0x0051 }
            L_0x0043:
                int[] r1 = f26602xf8499f6c     // Catch:{ NoSuchFieldError -> 0x0051 }
                com.instabug.library.ui.custom.MaterialMenuDrawable$IconState r8 = com.instabug.library.p397ui.custom.MaterialMenuDrawable.IconState.CHECK     // Catch:{ NoSuchFieldError -> 0x0051 }
                int r8 = r8.ordinal()     // Catch:{ NoSuchFieldError -> 0x0051 }
                r1[r8] = r4     // Catch:{ NoSuchFieldError -> 0x0051 }
                r1 = 7
                r0[r1] = r7
                goto L_0x0055
            L_0x0051:
                r1 = 8
                r0[r1] = r7
            L_0x0055:
                com.instabug.library.ui.custom.MaterialMenuDrawable$Stroke[] r1 = com.instabug.library.p397ui.custom.MaterialMenuDrawable.Stroke.values()
                int r1 = r1.length
                int[] r1 = new int[r1]
                f26603x329502e4 = r1
                r1 = 9
                r0[r1] = r7     // Catch:{ NoSuchFieldError -> 0x0071 }
                int[] r1 = f26603x329502e4     // Catch:{ NoSuchFieldError -> 0x0071 }
                com.instabug.library.ui.custom.MaterialMenuDrawable$Stroke r8 = com.instabug.library.p397ui.custom.MaterialMenuDrawable.Stroke.REGULAR     // Catch:{ NoSuchFieldError -> 0x0071 }
                int r8 = r8.ordinal()     // Catch:{ NoSuchFieldError -> 0x0071 }
                r1[r8] = r7     // Catch:{ NoSuchFieldError -> 0x0071 }
                r1 = 10
                r0[r1] = r7
                goto L_0x0075
            L_0x0071:
                r1 = 11
                r0[r1] = r7     // Catch:{ NoSuchFieldError -> 0x0084 }
            L_0x0075:
                int[] r1 = f26603x329502e4     // Catch:{ NoSuchFieldError -> 0x0084 }
                com.instabug.library.ui.custom.MaterialMenuDrawable$Stroke r8 = com.instabug.library.p397ui.custom.MaterialMenuDrawable.Stroke.THIN     // Catch:{ NoSuchFieldError -> 0x0084 }
                int r8 = r8.ordinal()     // Catch:{ NoSuchFieldError -> 0x0084 }
                r1[r8] = r6     // Catch:{ NoSuchFieldError -> 0x0084 }
                r1 = 12
                r0[r1] = r7
                goto L_0x0088
            L_0x0084:
                r1 = 13
                r0[r1] = r7     // Catch:{ NoSuchFieldError -> 0x0097 }
            L_0x0088:
                int[] r1 = f26603x329502e4     // Catch:{ NoSuchFieldError -> 0x0097 }
                com.instabug.library.ui.custom.MaterialMenuDrawable$Stroke r8 = com.instabug.library.p397ui.custom.MaterialMenuDrawable.Stroke.EXTRA_THIN     // Catch:{ NoSuchFieldError -> 0x0097 }
                int r8 = r8.ordinal()     // Catch:{ NoSuchFieldError -> 0x0097 }
                r1[r8] = r5     // Catch:{ NoSuchFieldError -> 0x0097 }
                r1 = 14
                r0[r1] = r7
                goto L_0x009b
            L_0x0097:
                r1 = 15
                r0[r1] = r7
            L_0x009b:
                com.instabug.library.ui.custom.MaterialMenuDrawable$AnimationState[] r1 = com.instabug.library.p397ui.custom.MaterialMenuDrawable.AnimationState.values()
                int r1 = r1.length
                int[] r1 = new int[r1]
                f26601xec836c19 = r1
                r1 = 16
                r0[r1] = r7     // Catch:{ NoSuchFieldError -> 0x00b7 }
                int[] r1 = f26601xec836c19     // Catch:{ NoSuchFieldError -> 0x00b7 }
                com.instabug.library.ui.custom.MaterialMenuDrawable$AnimationState r8 = com.instabug.library.p397ui.custom.MaterialMenuDrawable.AnimationState.BURGER_ARROW     // Catch:{ NoSuchFieldError -> 0x00b7 }
                int r8 = r8.ordinal()     // Catch:{ NoSuchFieldError -> 0x00b7 }
                r1[r8] = r7     // Catch:{ NoSuchFieldError -> 0x00b7 }
                r1 = 17
                r0[r1] = r7
                goto L_0x00bb
            L_0x00b7:
                r1 = 18
                r0[r1] = r7     // Catch:{ NoSuchFieldError -> 0x00ca }
            L_0x00bb:
                int[] r1 = f26601xec836c19     // Catch:{ NoSuchFieldError -> 0x00ca }
                com.instabug.library.ui.custom.MaterialMenuDrawable$AnimationState r8 = com.instabug.library.p397ui.custom.MaterialMenuDrawable.AnimationState.BURGER_X     // Catch:{ NoSuchFieldError -> 0x00ca }
                int r8 = r8.ordinal()     // Catch:{ NoSuchFieldError -> 0x00ca }
                r1[r8] = r6     // Catch:{ NoSuchFieldError -> 0x00ca }
                r1 = 19
                r0[r1] = r7
                goto L_0x00ce
            L_0x00ca:
                r1 = 20
                r0[r1] = r7     // Catch:{ NoSuchFieldError -> 0x00dd }
            L_0x00ce:
                int[] r1 = f26601xec836c19     // Catch:{ NoSuchFieldError -> 0x00dd }
                com.instabug.library.ui.custom.MaterialMenuDrawable$AnimationState r6 = com.instabug.library.p397ui.custom.MaterialMenuDrawable.AnimationState.ARROW_X     // Catch:{ NoSuchFieldError -> 0x00dd }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x00dd }
                r1[r6] = r5     // Catch:{ NoSuchFieldError -> 0x00dd }
                r1 = 21
                r0[r1] = r7
                goto L_0x00e1
            L_0x00dd:
                r1 = 22
                r0[r1] = r7     // Catch:{ NoSuchFieldError -> 0x00f0 }
            L_0x00e1:
                int[] r1 = f26601xec836c19     // Catch:{ NoSuchFieldError -> 0x00f0 }
                com.instabug.library.ui.custom.MaterialMenuDrawable$AnimationState r5 = com.instabug.library.p397ui.custom.MaterialMenuDrawable.AnimationState.ARROW_CHECK     // Catch:{ NoSuchFieldError -> 0x00f0 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x00f0 }
                r1[r5] = r4     // Catch:{ NoSuchFieldError -> 0x00f0 }
                r1 = 23
                r0[r1] = r7
                goto L_0x00f4
            L_0x00f0:
                r1 = 24
                r0[r1] = r7     // Catch:{ NoSuchFieldError -> 0x0103 }
            L_0x00f4:
                int[] r1 = f26601xec836c19     // Catch:{ NoSuchFieldError -> 0x0103 }
                com.instabug.library.ui.custom.MaterialMenuDrawable$AnimationState r4 = com.instabug.library.p397ui.custom.MaterialMenuDrawable.AnimationState.BURGER_CHECK     // Catch:{ NoSuchFieldError -> 0x0103 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0103 }
                r1[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0103 }
                r1 = 25
                r0[r1] = r7
                goto L_0x0107
            L_0x0103:
                r1 = 26
                r0[r1] = r7     // Catch:{ NoSuchFieldError -> 0x0116 }
            L_0x0107:
                int[] r1 = f26601xec836c19     // Catch:{ NoSuchFieldError -> 0x0116 }
                com.instabug.library.ui.custom.MaterialMenuDrawable$AnimationState r2 = com.instabug.library.p397ui.custom.MaterialMenuDrawable.AnimationState.X_CHECK     // Catch:{ NoSuchFieldError -> 0x0116 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0116 }
                r1[r2] = r3     // Catch:{ NoSuchFieldError -> 0x0116 }
                r1 = 27
                r0[r1] = r7
                goto L_0x011a
            L_0x0116:
                r1 = 28
                r0[r1] = r7
            L_0x011a:
                r1 = 29
                r0[r1] = r7
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.instabug.library.p397ui.custom.MaterialMenuDrawable.C99983.<clinit>():void");
        }
    }

    /* renamed from: com.instabug.library.ui.custom.MaterialMenuDrawable$AnimationState */
    public enum AnimationState {
        BURGER_ARROW,
        BURGER_X,
        ARROW_X,
        ARROW_CHECK,
        BURGER_CHECK,
        X_CHECK;

        static {
            boolean[] $jacocoInit;
            $jacocoInit[17] = true;
        }

        public IconState getFirstState() {
            boolean[] $jacocoInit = $jacocoInit();
            switch (C99983.f26601xec836c19[ordinal()]) {
                case 1:
                    IconState iconState = IconState.BURGER;
                    $jacocoInit[3] = true;
                    return iconState;
                case 2:
                    IconState iconState2 = IconState.BURGER;
                    $jacocoInit[4] = true;
                    return iconState2;
                case 3:
                    IconState iconState3 = IconState.ARROW;
                    $jacocoInit[5] = true;
                    return iconState3;
                case 4:
                    IconState iconState4 = IconState.ARROW;
                    $jacocoInit[6] = true;
                    return iconState4;
                case 5:
                    IconState iconState5 = IconState.BURGER;
                    $jacocoInit[7] = true;
                    return iconState5;
                case 6:
                    IconState iconState6 = IconState.X;
                    $jacocoInit[8] = true;
                    return iconState6;
                default:
                    $jacocoInit[9] = true;
                    return null;
            }
        }

        public IconState getSecondState() {
            boolean[] $jacocoInit = $jacocoInit();
            switch (C99983.f26601xec836c19[ordinal()]) {
                case 1:
                    IconState iconState = IconState.ARROW;
                    $jacocoInit[10] = true;
                    return iconState;
                case 2:
                    IconState iconState2 = IconState.X;
                    $jacocoInit[11] = true;
                    return iconState2;
                case 3:
                    IconState iconState3 = IconState.X;
                    $jacocoInit[12] = true;
                    return iconState3;
                case 4:
                    IconState iconState4 = IconState.CHECK;
                    $jacocoInit[13] = true;
                    return iconState4;
                case 5:
                    IconState iconState5 = IconState.CHECK;
                    $jacocoInit[14] = true;
                    return iconState5;
                case 6:
                    IconState iconState6 = IconState.CHECK;
                    $jacocoInit[15] = true;
                    return iconState6;
                default:
                    $jacocoInit[16] = true;
                    return null;
            }
        }
    }

    /* renamed from: com.instabug.library.ui.custom.MaterialMenuDrawable$IconState */
    public enum IconState {
        BURGER,
        ARROW,
        X,
        CHECK;

        static {
            boolean[] $jacocoInit;
            $jacocoInit[3] = true;
        }
    }

    /* renamed from: com.instabug.library.ui.custom.MaterialMenuDrawable$MaterialMenuState */
    private final class MaterialMenuState extends ConstantState {
        private static transient /* synthetic */ boolean[] $jacocoData;
        private int changingConfigurations;
        final /* synthetic */ MaterialMenuDrawable this$0;

        private static /* synthetic */ boolean[] $jacocoInit() {
            boolean[] zArr = $jacocoData;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(7623824224208396406L, "com/instabug/library/ui/custom/MaterialMenuDrawable$MaterialMenuState", 12);
            $jacocoData = a;
            return a;
        }

        /* synthetic */ MaterialMenuState(MaterialMenuDrawable materialMenuDrawable, C99961 r3) {
            boolean[] $jacocoInit = $jacocoInit();
            this(materialMenuDrawable);
            $jacocoInit[10] = true;
        }

        static /* synthetic */ int access$402(MaterialMenuState materialMenuState, int i) {
            boolean[] $jacocoInit = $jacocoInit();
            materialMenuState.changingConfigurations = i;
            $jacocoInit[11] = true;
            return i;
        }

        public int getChangingConfigurations() {
            boolean[] $jacocoInit = $jacocoInit();
            int i = this.changingConfigurations;
            $jacocoInit[9] = true;
            return i;
        }

        public Drawable newDrawable() {
            IconState iconState;
            boolean[] $jacocoInit = $jacocoInit();
            MaterialMenuDrawable materialMenuDrawable = this.this$0;
            $jacocoInit[1] = true;
            int color = MaterialMenuDrawable.access$500(materialMenuDrawable).getColor();
            Stroke access$600 = MaterialMenuDrawable.access$600(this.this$0);
            long duration = MaterialMenuDrawable.access$700(this.this$0).getDuration();
            MaterialMenuDrawable materialMenuDrawable2 = this.this$0;
            $jacocoInit[2] = true;
            MaterialMenuDrawable materialMenuDrawable3 = new MaterialMenuDrawable(color, access$600, duration, MaterialMenuDrawable.access$800(materialMenuDrawable2), MaterialMenuDrawable.access$900(this.this$0), MaterialMenuDrawable.access$1000(this.this$0), MaterialMenuDrawable.access$1100(this.this$0), MaterialMenuDrawable.access$1200(this.this$0), MaterialMenuDrawable.access$1300(this.this$0), null);
            $jacocoInit[3] = true;
            if (MaterialMenuDrawable.access$300(this.this$0) != null) {
                iconState = MaterialMenuDrawable.access$300(this.this$0);
                $jacocoInit[4] = true;
            } else {
                iconState = MaterialMenuDrawable.access$1500(this.this$0);
                $jacocoInit[5] = true;
            }
            materialMenuDrawable3.setIconState(iconState);
            $jacocoInit[6] = true;
            materialMenuDrawable3.setVisible(MaterialMenuDrawable.access$1600(this.this$0));
            $jacocoInit[7] = true;
            materialMenuDrawable3.setRTLEnabled(MaterialMenuDrawable.access$1700(this.this$0));
            $jacocoInit[8] = true;
            return materialMenuDrawable3;
        }

        private MaterialMenuState(MaterialMenuDrawable materialMenuDrawable) {
            boolean[] $jacocoInit = $jacocoInit();
            this.this$0 = materialMenuDrawable;
            $jacocoInit[0] = true;
        }
    }

    /* renamed from: com.instabug.library.ui.custom.MaterialMenuDrawable$Stroke */
    public enum Stroke {
        REGULAR(3),
        THIN(2),
        EXTRA_THIN(1);
        
        private final int strokeWidth;

        static {
            boolean[] $jacocoInit;
            $jacocoInit[10] = true;
        }

        private Stroke(int i) {
            boolean[] $jacocoInit = $jacocoInit();
            this.strokeWidth = i;
            $jacocoInit[2] = true;
        }

        protected static Stroke valueOf(int i) {
            boolean[] $jacocoInit = $jacocoInit();
            if (i == 1) {
                Stroke stroke = EXTRA_THIN;
                $jacocoInit[5] = true;
                return stroke;
            } else if (i == 2) {
                Stroke stroke2 = THIN;
                $jacocoInit[4] = true;
                return stroke2;
            } else if (i != 3) {
                Stroke stroke3 = THIN;
                $jacocoInit[6] = true;
                return stroke3;
            } else {
                Stroke stroke4 = REGULAR;
                $jacocoInit[3] = true;
                return stroke4;
            }
        }
    }

    private static /* synthetic */ boolean[] $jacocoInit() {
        boolean[] zArr = $jacocoData;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(5865723260144247551L, "com/instabug/library/ui/custom/MaterialMenuDrawable", 289);
        $jacocoData = a;
        return a;
    }

    /* synthetic */ MaterialMenuDrawable(int i, Stroke stroke2, long j, int i2, int i3, float f, float f2, float f3, float f4, C99961 r11) {
        boolean[] $jacocoInit = $jacocoInit();
        this(i, stroke2, j, i2, i3, f, f2, f3, f4);
        $jacocoInit[285] = true;
    }

    static /* synthetic */ float access$1000(MaterialMenuDrawable materialMenuDrawable) {
        boolean[] $jacocoInit = $jacocoInit();
        float f = materialMenuDrawable.iconWidth;
        $jacocoInit[281] = true;
        return f;
    }

    static /* synthetic */ float access$1100(MaterialMenuDrawable materialMenuDrawable) {
        boolean[] $jacocoInit = $jacocoInit();
        float f = materialMenuDrawable.circleRadius;
        $jacocoInit[282] = true;
        return f;
    }

    static /* synthetic */ float access$1200(MaterialMenuDrawable materialMenuDrawable) {
        boolean[] $jacocoInit = $jacocoInit();
        float f = materialMenuDrawable.strokeWidth;
        $jacocoInit[283] = true;
        return f;
    }

    static /* synthetic */ float access$1300(MaterialMenuDrawable materialMenuDrawable) {
        boolean[] $jacocoInit = $jacocoInit();
        float f = materialMenuDrawable.dip1;
        $jacocoInit[284] = true;
        return f;
    }

    static /* synthetic */ IconState access$1500(MaterialMenuDrawable materialMenuDrawable) {
        boolean[] $jacocoInit = $jacocoInit();
        IconState iconState = materialMenuDrawable.currentIconState;
        $jacocoInit[286] = true;
        return iconState;
    }

    static /* synthetic */ boolean access$1600(MaterialMenuDrawable materialMenuDrawable) {
        boolean[] $jacocoInit = $jacocoInit();
        boolean z = materialMenuDrawable.visible;
        $jacocoInit[287] = true;
        return z;
    }

    static /* synthetic */ boolean access$1700(MaterialMenuDrawable materialMenuDrawable) {
        boolean[] $jacocoInit = $jacocoInit();
        boolean z = materialMenuDrawable.rtlEnabled;
        $jacocoInit[288] = true;
        return z;
    }

    static /* synthetic */ boolean access$202(MaterialMenuDrawable materialMenuDrawable, boolean z) {
        boolean[] $jacocoInit = $jacocoInit();
        materialMenuDrawable.transformationRunning = z;
        $jacocoInit[274] = true;
        return z;
    }

    static /* synthetic */ IconState access$300(MaterialMenuDrawable materialMenuDrawable) {
        boolean[] $jacocoInit = $jacocoInit();
        IconState iconState = materialMenuDrawable.animatingIconState;
        $jacocoInit[275] = true;
        return iconState;
    }

    static /* synthetic */ Paint access$500(MaterialMenuDrawable materialMenuDrawable) {
        boolean[] $jacocoInit = $jacocoInit();
        Paint paint = materialMenuDrawable.circlePaint;
        $jacocoInit[276] = true;
        return paint;
    }

    static /* synthetic */ Stroke access$600(MaterialMenuDrawable materialMenuDrawable) {
        boolean[] $jacocoInit = $jacocoInit();
        Stroke stroke2 = materialMenuDrawable.stroke;
        $jacocoInit[277] = true;
        return stroke2;
    }

    static /* synthetic */ ObjectAnimator access$700(MaterialMenuDrawable materialMenuDrawable) {
        boolean[] $jacocoInit = $jacocoInit();
        ObjectAnimator objectAnimator = materialMenuDrawable.transformation;
        $jacocoInit[278] = true;
        return objectAnimator;
    }

    static /* synthetic */ int access$800(MaterialMenuDrawable materialMenuDrawable) {
        boolean[] $jacocoInit = $jacocoInit();
        int i = materialMenuDrawable.width;
        $jacocoInit[279] = true;
        return i;
    }

    static /* synthetic */ int access$900(MaterialMenuDrawable materialMenuDrawable) {
        boolean[] $jacocoInit = $jacocoInit();
        int i = materialMenuDrawable.height;
        $jacocoInit[280] = true;
        return i;
    }

    static float dpToPx(Resources resources, float f) {
        boolean[] $jacocoInit = $jacocoInit();
        float applyDimension = TypedValue.applyDimension(1, f, resources.getDisplayMetrics());
        $jacocoInit[273] = true;
        return applyDimension;
    }

    private void drawBottomLine(Canvas canvas, float f) {
        float f2;
        boolean z;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        Canvas canvas2 = canvas;
        float f9 = f;
        boolean[] $jacocoInit = $jacocoInit();
        canvas.restore();
        $jacocoInit[87] = true;
        canvas.save();
        int i = this.width;
        float f10 = (((float) i) / TRANSFORMATION_END) + (this.dip3 / TRANSFORMATION_END);
        int i2 = this.height;
        float f11 = (float) i2;
        float f12 = this.topPadding;
        float f13 = f11 - f12;
        float f14 = this.dip2;
        float f15 = f13 - f14;
        float f16 = this.sidePadding;
        float f17 = (((float) i2) - f12) - f14;
        float f18 = ((float) i) - f16;
        float f19 = (((float) i2) - f12) - f14;
        $jacocoInit[88] = true;
        switch (C99983.f26601xec836c19[this.animationState.ordinal()]) {
            case 1:
                z = true;
                if (isMorphingForward()) {
                    float f20 = f9 * 135.0f;
                    $jacocoInit[90] = true;
                    f7 = f20;
                } else {
                    f7 = ((1.0f - f9) * ARROW_BOT_LINE_ANGLE) + 135.0f;
                    $jacocoInit[91] = true;
                }
                int i3 = this.width;
                float f21 = ((float) i3) / TRANSFORMATION_END;
                float f22 = ((float) this.height) / TRANSFORMATION_END;
                $jacocoInit[92] = true;
                float resolveStrokeModifier = (((float) i3) - this.sidePadding) - resolveStrokeModifier(f9);
                float f23 = this.sidePadding + (this.dip3 * f9);
                $jacocoInit[93] = true;
                f16 = f23;
                f6 = 0.0f;
                f3 = f22;
                f4 = f21;
                f5 = f7;
                f2 = resolveStrokeModifier;
                break;
            case 2:
                if (isMorphingForward()) {
                    f8 = f9 * CHECK_BOTTOM_ANGLE;
                    $jacocoInit[94] = true;
                } else {
                    f8 = X_ROTATION_ANGLE * f9;
                    $jacocoInit[95] = true;
                }
                float f24 = f8;
                f5 = f9 * X_BOT_LINE_ANGLE;
                f4 = this.sidePadding + this.dip4;
                float f25 = ((float) this.height) - this.topPadding;
                float f26 = this.dip3;
                f3 = f25 - f26;
                f16 += f26 * f9;
                z = true;
                $jacocoInit[96] = true;
                f2 = f18;
                f6 = f24;
                break;
            case 3:
                float f27 = (181.0f * f9) + 135.0f;
                float f28 = f9 * CHECK_BOTTOM_ANGLE;
                int i4 = this.width;
                f4 = (((float) i4) / TRANSFORMATION_END) + (((this.sidePadding + this.dip4) - (((float) i4) / TRANSFORMATION_END)) * f9);
                int i5 = this.height;
                f3 = ((((((float) i5) / TRANSFORMATION_END) - this.topPadding) - this.dip3) * f9) + (((float) i5) / TRANSFORMATION_END);
                $jacocoInit[97] = true;
                float resolveStrokeModifier2 = f18 - resolveStrokeModifier(f9);
                f16 += this.dip3;
                $jacocoInit[98] = true;
                f2 = resolveStrokeModifier2;
                f6 = f28;
                f5 = f27;
                break;
            case 4:
                f5 = (f9 * CHECK_BOTTOM_ANGLE) + 135.0f;
                float f29 = ((float) this.width) / TRANSFORMATION_END;
                float f30 = this.dip3;
                f4 = f29 + (f30 * f9);
                f3 = (((float) this.height) / TRANSFORMATION_END) - (f30 * f9);
                $jacocoInit[99] = true;
                float resolveStrokeModifier3 = f18 - resolveStrokeModifier(1.0f);
                f16 += this.dip3 + ((this.dip4 + this.dip1) * f9);
                z = true;
                $jacocoInit[100] = true;
                f2 = resolveStrokeModifier3;
                f6 = 0.0f;
                break;
            case 5:
                f5 = 45.0f * f9;
                float f31 = ((float) this.width) / TRANSFORMATION_END;
                float f32 = this.dip3;
                f4 = f31 + (f32 * f9);
                f3 = (((float) this.height) / TRANSFORMATION_END) - (f32 * f9);
                f16 += this.dip8 * f9;
                $jacocoInit[101] = true;
                float resolveStrokeModifier4 = f18 - resolveStrokeModifier(f9);
                $jacocoInit[102] = true;
                f2 = resolveStrokeModifier4;
                f6 = 0.0f;
                break;
            case 6:
                float f33 = 1.0f - f9;
                float f34 = f33 * CHECK_BOTTOM_ANGLE;
                float f35 = (89.0f * f9) + X_BOT_LINE_ANGLE;
                float f36 = this.sidePadding;
                float f37 = this.dip4;
                float f38 = f36 + f37;
                float f39 = ((float) this.width) / TRANSFORMATION_END;
                float f40 = this.dip3;
                float f41 = f38 + ((((f39 + f40) - f36) - f37) * f9);
                int i6 = this.height;
                float f42 = f41;
                float f43 = (float) i6;
                float f44 = f35;
                float f45 = this.topPadding;
                float f46 = ((f43 - f45) - f40) + (((f45 + (((float) i6) / TRANSFORMATION_END)) - ((float) i6)) * f9);
                f16 += this.dip8 - ((f37 + this.dip1) * f33);
                $jacocoInit[103] = true;
                float resolveStrokeModifier5 = f18 - resolveStrokeModifier(f33);
                $jacocoInit[104] = true;
                f3 = f46;
                f2 = resolveStrokeModifier5;
                f4 = f42;
                f6 = f34;
                f5 = f44;
                break;
            default:
                z = true;
                $jacocoInit[89] = true;
                f2 = f18;
                f6 = 0.0f;
                f5 = 0.0f;
                f4 = 0.0f;
                f3 = 0.0f;
                break;
        }
        z = true;
        canvas2.rotate(f5, f4, f3);
        $jacocoInit[105] = z;
        canvas2.rotate(f6, f10, f15);
        $jacocoInit[106] = z;
        canvas.drawLine(f16, f17, f2, f19, this.iconPaint);
        $jacocoInit[107] = z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x00ea, code lost:
        r16 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0114, code lost:
        r0.iconPaint.setAlpha(r1);
        r2[65] = true;
        r21.rotate(r14, r5, r7);
        r2[66] = true;
        r21.drawLine(r8, r15, r16, r17, r0.iconPaint);
        r2[67] = true;
        r0.iconPaint.setAlpha(255);
        r2[68] = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x013d, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x004e, code lost:
        r16 = r4;
        r1 = 255;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void drawMiddleLine(android.graphics.Canvas r21, float r22) {
        /*
            r20 = this;
            r0 = r20
            r1 = r22
            boolean[] r2 = $jacocoInit()
            r21.restore()
            r3 = 1
            r4 = 52
            r2[r4] = r3
            r21.save()
            int r4 = r0.width
            float r5 = (float) r4
            r6 = 1073741824(0x40000000, float:2.0)
            float r5 = r5 / r6
            float r7 = (float) r4
            float r7 = r7 / r6
            float r8 = r0.sidePadding
            float r9 = r0.topPadding
            float r10 = r0.dip3
            float r11 = r10 / r6
            r12 = 1084227584(0x40a00000, float:5.0)
            float r11 = r11 * r12
            float r15 = r9 + r11
            float r4 = (float) r4
            float r4 = r4 - r8
            float r10 = r10 / r6
            float r10 = r10 * r12
            float r17 = r9 + r10
            r9 = 53
            r2[r9] = r3
            int[] r9 = com.instabug.library.p397ui.custom.MaterialMenuDrawable.C99983.f26601xec836c19
            com.instabug.library.ui.custom.MaterialMenuDrawable$AnimationState r10 = r0.animationState
            int r10 = r10.ordinal()
            r9 = r9[r10]
            r10 = 255(0xff, float:3.57E-43)
            r11 = 1132396544(0x437f0000, float:255.0)
            r12 = 1124532224(0x43070000, float:135.0)
            r13 = 1065353216(0x3f800000, float:1.0)
            r14 = 0
            switch(r9) {
                case 1: goto L_0x00ed;
                case 2: goto L_0x00e2;
                case 3: goto L_0x00d4;
                case 4: goto L_0x009b;
                case 5: goto L_0x007d;
                case 6: goto L_0x0054;
                default: goto L_0x004a;
            }
        L_0x004a:
            r1 = 54
            r2[r1] = r3
        L_0x004e:
            r16 = r4
            r1 = 255(0xff, float:3.57E-43)
            goto L_0x0114
        L_0x0054:
            float r5 = r1 * r11
            int r5 = (int) r5
            float r14 = r1 * r12
            float r9 = r0.dip4
            float r11 = r0.dip3
            float r12 = r11 / r6
            float r9 = r9 + r12
            float r9 = r9 * r1
            float r8 = r8 + r9
            float r9 = r0.dip1
            float r1 = r1 * r9
            float r4 = r4 + r1
            int r1 = r0.width
            float r1 = (float) r1
            float r1 = r1 / r6
            float r1 = r1 + r11
            float r6 = r0.diph
            float r1 = r1 + r6
            r6 = 64
            r2[r6] = r3
            r16 = r4
            r19 = r5
            r5 = r1
            r1 = r19
            goto L_0x0114
        L_0x007d:
            float r14 = r1 * r12
            float r5 = r0.dip4
            float r9 = r0.dip3
            float r11 = r9 / r6
            float r5 = r5 + r11
            float r5 = r5 * r1
            float r8 = r8 + r5
            float r5 = r0.dip1
            float r1 = r1 * r5
            float r4 = r4 + r1
            int r1 = r0.width
            float r1 = (float) r1
            float r1 = r1 / r6
            float r1 = r1 + r9
            float r5 = r0.diph
            float r5 = r5 + r1
            r1 = 63
            r2[r1] = r3
            goto L_0x004e
        L_0x009b:
            boolean r5 = r20.isMorphingForward()
            if (r5 == 0) goto L_0x00a9
            float r5 = r1 * r12
            r9 = 60
            r2[r9] = r3
            r14 = r5
            goto L_0x00b3
        L_0x00a9:
            float r5 = r13 - r1
            float r5 = r5 * r12
            float r12 = r12 - r5
            r5 = 61
            r2[r5] = r3
            r14 = r12
        L_0x00b3:
            float r5 = r0.dip3
            float r9 = r5 / r6
            float r11 = r0.dip4
            float r9 = r9 + r11
            float r13 = r13 - r1
            float r11 = r0.dip2
            float r13 = r13 * r11
            float r9 = r9 - r13
            float r8 = r8 + r9
            float r9 = r0.dip1
            float r1 = r1 * r9
            float r4 = r4 + r1
            int r1 = r0.width
            float r1 = (float) r1
            float r1 = r1 / r6
            float r1 = r1 + r5
            float r5 = r0.diph
            float r5 = r5 + r1
            r1 = 62
            r2[r1] = r3
            goto L_0x004e
        L_0x00d4:
            float r13 = r13 - r1
            float r11 = r11 * r13
            int r1 = (int) r11
            float r6 = r0.dip2
            float r13 = r13 * r6
            float r8 = r8 + r13
            r6 = 59
            r2[r6] = r3
            goto L_0x00ea
        L_0x00e2:
            float r13 = r13 - r1
            float r13 = r13 * r11
            int r1 = (int) r13
            r6 = 58
            r2[r6] = r3
        L_0x00ea:
            r16 = r4
            goto L_0x0114
        L_0x00ed:
            boolean r9 = r20.isMorphingForward()
            r11 = 1127481344(0x43340000, float:180.0)
            if (r9 == 0) goto L_0x00fd
            float r9 = r1 * r11
            r11 = 55
            r2[r11] = r3
            r14 = r9
            goto L_0x0106
        L_0x00fd:
            float r13 = r13 - r1
            float r13 = r13 * r11
            float r13 = r13 + r11
            r9 = 56
            r2[r9] = r3
            r14 = r13
        L_0x0106:
            float r9 = r0.resolveStrokeModifier(r1)
            float r1 = r1 * r9
            float r1 = r1 / r6
            float r4 = r4 - r1
            r1 = 57
            r2[r1] = r3
            goto L_0x004e
        L_0x0114:
            android.graphics.Paint r4 = r0.iconPaint
            r4.setAlpha(r1)
            r1 = 65
            r2[r1] = r3
            r1 = r21
            r1.rotate(r14, r5, r7)
            r4 = 66
            r2[r4] = r3
            android.graphics.Paint r4 = r0.iconPaint
            r13 = r21
            r14 = r8
            r18 = r4
            r13.drawLine(r14, r15, r16, r17, r18)
            r1 = 67
            r2[r1] = r3
            android.graphics.Paint r1 = r0.iconPaint
            r1.setAlpha(r10)
            r1 = 68
            r2[r1] = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instabug.library.p397ui.custom.MaterialMenuDrawable.drawMiddleLine(android.graphics.Canvas, float):void");
    }

    private void drawTopLine(Canvas canvas, float f) {
        float f2;
        int i;
        float f3;
        float f4;
        float f5;
        Canvas canvas2 = canvas;
        float f6 = f;
        boolean[] $jacocoInit = $jacocoInit();
        canvas.save();
        int i2 = this.width;
        float f7 = (((float) i2) / TRANSFORMATION_END) + (this.dip3 / TRANSFORMATION_END);
        float f8 = this.topPadding;
        float f9 = this.dip2;
        float f10 = f8 + f9;
        float f11 = this.sidePadding;
        float f12 = f8 + f9;
        float f13 = ((float) i2) - f11;
        float f14 = f8 + f9;
        boolean z = true;
        $jacocoInit[69] = true;
        int i3 = C99983.f26601xec836c19[this.animationState.ordinal()];
        float f15 = X_TOP_LINE_ANGLE;
        switch (i3) {
            case 1:
                if (isMorphingForward()) {
                    float f16 = f6 * ARROW_BOT_LINE_ANGLE;
                    $jacocoInit[71] = true;
                    f15 = f16;
                } else {
                    float f17 = ((1.0f - f6) * 135.0f) + ARROW_BOT_LINE_ANGLE;
                    $jacocoInit[72] = true;
                    f15 = f17;
                }
                f3 = ((float) this.width) / TRANSFORMATION_END;
                f4 = ((float) this.height) / TRANSFORMATION_END;
                $jacocoInit[73] = true;
                float resolveStrokeModifier = f13 - resolveStrokeModifier(f6);
                f11 += this.dip3 * f6;
                $jacocoInit[74] = true;
                f2 = resolveStrokeModifier;
                f5 = 0.0f;
                break;
            case 2:
                f15 = X_TOP_LINE_ANGLE * f6;
                float f18 = X_ROTATION_ANGLE * f6;
                float f19 = this.sidePadding + this.dip4;
                float f20 = this.topPadding;
                float f21 = this.dip3;
                f4 = f20 + f21;
                f11 += f21 * f6;
                z = true;
                $jacocoInit[75] = true;
                f2 = f13;
                f5 = f18;
                f3 = f19;
                break;
            case 3:
                f15 = (-181.0f * f6) + ARROW_BOT_LINE_ANGLE;
                float f22 = X_ROTATION_ANGLE * f6;
                int i4 = this.width;
                float f23 = (((float) i4) / TRANSFORMATION_END) + (((this.sidePadding + this.dip4) - (((float) i4) / TRANSFORMATION_END)) * f6);
                int i5 = this.height;
                f4 = (((float) i5) / TRANSFORMATION_END) + (((this.topPadding + this.dip3) - (((float) i5) / TRANSFORMATION_END)) * f6);
                $jacocoInit[76] = true;
                float resolveStrokeModifier2 = f13 - resolveStrokeModifier(f6);
                f11 += this.dip3;
                $jacocoInit[77] = true;
                f2 = resolveStrokeModifier2;
                f5 = f22;
                f3 = f23;
                z = true;
                break;
            case 4:
                int i6 = (int) ((1.0f - f6) * 255.0f);
                f3 = ((float) this.width) / TRANSFORMATION_END;
                f4 = ((float) this.height) / TRANSFORMATION_END;
                $jacocoInit[78] = true;
                float resolveStrokeModifier3 = f13 - resolveStrokeModifier(1.0f);
                f11 += this.dip3;
                $jacocoInit[79] = true;
                i = i6;
                f2 = resolveStrokeModifier3;
                f5 = 0.0f;
                f15 = ARROW_BOT_LINE_ANGLE;
                break;
            case 5:
                i = (int) ((1.0f - f6) * 255.0f);
                $jacocoInit[80] = true;
                f2 = f13;
                f5 = 0.0f;
                f4 = 0.0f;
                f3 = 0.0f;
                f15 = 0.0f;
                break;
            case 6:
                float f24 = this.sidePadding + this.dip4;
                float f25 = this.topPadding;
                float f26 = this.dip3;
                f4 = f25 + f26;
                float f27 = 1.0f - f6;
                float f28 = f13 + (f26 - (f26 * f27));
                f11 += f26;
                i = (int) (f27 * 255.0f);
                $jacocoInit[81] = true;
                f2 = f28;
                f3 = f24;
                f5 = X_ROTATION_ANGLE;
                break;
            default:
                $jacocoInit[70] = true;
                f2 = f13;
                f5 = 0.0f;
                f4 = 0.0f;
                f3 = 0.0f;
                f15 = 0.0f;
                break;
        }
        i = 255;
        this.iconPaint.setAlpha(i);
        $jacocoInit[82] = z;
        canvas2.rotate(f15, f3, f4);
        $jacocoInit[83] = z;
        canvas2.rotate(f5, f7, f10);
        $jacocoInit[84] = z;
        canvas.drawLine(f11, f12, f2, f14, this.iconPaint);
        $jacocoInit[85] = z;
        this.iconPaint.setAlpha(255);
        $jacocoInit[86] = z;
    }

    private void initAnimations(int i) {
        boolean[] $jacocoInit = $jacocoInit();
        this.transformation = ObjectAnimator.ofFloat(this, this.transformationProperty, new float[]{0.0f});
        $jacocoInit[185] = true;
        this.transformation.setInterpolator(new DecelerateInterpolator(3.0f));
        $jacocoInit[186] = true;
        this.transformation.setDuration((long) i);
        $jacocoInit[187] = true;
        this.transformation.addListener(new AnimatorListenerAdapter(this) {
            private static transient /* synthetic */ boolean[] $jacocoData;
            final /* synthetic */ MaterialMenuDrawable this$0;

            private static /* synthetic */ boolean[] $jacocoInit() {
                boolean[] zArr = $jacocoData;
                if (zArr != null) {
                    return zArr;
                }
                boolean[] a = C13938g.m59885a(-1239853638551981600L, "com/instabug/library/ui/custom/MaterialMenuDrawable$2", 3);
                $jacocoData = a;
                return a;
            }

            {
                boolean[] $jacocoInit = $jacocoInit();
                this.this$0 = r3;
                $jacocoInit[0] = true;
            }

            public void onAnimationEnd(Animator animator) {
                boolean[] $jacocoInit = $jacocoInit();
                MaterialMenuDrawable.access$202(this.this$0, false);
                $jacocoInit[1] = true;
                MaterialMenuDrawable materialMenuDrawable = this.this$0;
                materialMenuDrawable.setIconState(MaterialMenuDrawable.access$300(materialMenuDrawable));
                $jacocoInit[2] = true;
            }
        });
        $jacocoInit[188] = true;
    }

    private void initPaint(int i) {
        boolean[] $jacocoInit = $jacocoInit();
        this.iconPaint.setAntiAlias(true);
        $jacocoInit[29] = true;
        this.iconPaint.setStyle(Style.STROKE);
        $jacocoInit[30] = true;
        this.iconPaint.setStrokeWidth(this.strokeWidth);
        $jacocoInit[31] = true;
        this.iconPaint.setColor(i);
        $jacocoInit[32] = true;
        this.circlePaint.setAntiAlias(true);
        $jacocoInit[33] = true;
        this.circlePaint.setStyle(Style.FILL);
        $jacocoInit[34] = true;
        this.circlePaint.setColor(i);
        $jacocoInit[35] = true;
        this.circlePaint.setAlpha(200);
        $jacocoInit[36] = true;
        setBounds(0, 0, this.width, this.height);
        $jacocoInit[37] = true;
    }

    private boolean isMorphingForward() {
        boolean z;
        boolean[] $jacocoInit = $jacocoInit();
        if (this.transformationValue <= 1.0f) {
            $jacocoInit[108] = true;
            z = true;
        } else {
            z = false;
            $jacocoInit[109] = true;
        }
        $jacocoInit[110] = true;
        return z;
    }

    private float resolveStrokeModifier(float f) {
        boolean[] $jacocoInit = $jacocoInit();
        int i = C99983.f26603x329502e4[this.stroke.ordinal()];
        if (i == 1) {
            AnimationState animationState2 = this.animationState;
            if (animationState2 == AnimationState.ARROW_X) {
                $jacocoInit[111] = true;
            } else if (animationState2 == AnimationState.X_CHECK) {
                $jacocoInit[112] = true;
            } else {
                float f2 = f * this.dip3;
                $jacocoInit[114] = true;
                return f2;
            }
            float f3 = this.dip3;
            float f4 = f3 - (f * f3);
            $jacocoInit[113] = true;
            return f4;
        } else if (i == 2) {
            AnimationState animationState3 = this.animationState;
            if (animationState3 == AnimationState.ARROW_X) {
                $jacocoInit[115] = true;
            } else if (animationState3 == AnimationState.X_CHECK) {
                $jacocoInit[116] = true;
            } else {
                float f5 = f * (this.dip3 + this.diph);
                $jacocoInit[118] = true;
                return f5;
            }
            float f6 = this.dip3;
            float f7 = this.diph;
            float f8 = (f6 + f7) - ((f6 + f7) * f);
            $jacocoInit[117] = true;
            return f8;
        } else if (i != 3) {
            $jacocoInit[123] = true;
            return 0.0f;
        } else {
            AnimationState animationState4 = this.animationState;
            if (animationState4 == AnimationState.ARROW_X) {
                $jacocoInit[119] = true;
            } else if (animationState4 == AnimationState.X_CHECK) {
                $jacocoInit[120] = true;
            } else {
                float f9 = f * this.dip4;
                $jacocoInit[122] = true;
                return f9;
            }
            float f10 = this.dip4 - ((this.dip3 + this.dip1) * f);
            $jacocoInit[121] = true;
            return f10;
        }
    }

    private boolean resolveTransformation() {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean[] $jacocoInit = $jacocoInit();
        if (this.currentIconState == IconState.BURGER) {
            $jacocoInit[189] = true;
            z = true;
        } else {
            $jacocoInit[190] = true;
            z = false;
        }
        if (this.currentIconState == IconState.ARROW) {
            $jacocoInit[191] = true;
            z2 = true;
        } else {
            $jacocoInit[192] = true;
            z2 = false;
        }
        if (this.currentIconState == IconState.X) {
            $jacocoInit[193] = true;
            z3 = true;
        } else {
            $jacocoInit[194] = true;
            z3 = false;
        }
        if (this.currentIconState == IconState.CHECK) {
            $jacocoInit[195] = true;
            z4 = true;
        } else {
            $jacocoInit[196] = true;
            z4 = false;
        }
        if (this.animatingIconState == IconState.BURGER) {
            $jacocoInit[197] = true;
            z5 = true;
        } else {
            $jacocoInit[198] = true;
            z5 = false;
        }
        if (this.animatingIconState == IconState.ARROW) {
            $jacocoInit[199] = true;
            z6 = true;
        } else {
            $jacocoInit[200] = true;
            z6 = false;
        }
        if (this.animatingIconState == IconState.X) {
            $jacocoInit[201] = true;
            z7 = true;
        } else {
            $jacocoInit[202] = true;
            z7 = false;
        }
        if (this.animatingIconState == IconState.CHECK) {
            $jacocoInit[203] = true;
            z8 = true;
        } else {
            $jacocoInit[204] = true;
            z8 = false;
        }
        if (!z) {
            $jacocoInit[205] = true;
        } else if (z6) {
            $jacocoInit[206] = true;
            this.animationState = AnimationState.BURGER_ARROW;
            $jacocoInit[211] = true;
            return z;
        } else {
            $jacocoInit[207] = true;
        }
        if (!z2) {
            $jacocoInit[208] = true;
        } else if (!z5) {
            $jacocoInit[209] = true;
        } else {
            $jacocoInit[210] = true;
            this.animationState = AnimationState.BURGER_ARROW;
            $jacocoInit[211] = true;
            return z;
        }
        if (!z2) {
            $jacocoInit[212] = true;
        } else if (z7) {
            $jacocoInit[213] = true;
            this.animationState = AnimationState.ARROW_X;
            $jacocoInit[218] = true;
            return z2;
        } else {
            $jacocoInit[214] = true;
        }
        if (!z3) {
            $jacocoInit[215] = true;
        } else if (!z6) {
            $jacocoInit[216] = true;
        } else {
            $jacocoInit[217] = true;
            this.animationState = AnimationState.ARROW_X;
            $jacocoInit[218] = true;
            return z2;
        }
        if (!z) {
            $jacocoInit[219] = true;
        } else if (z7) {
            $jacocoInit[220] = true;
            this.animationState = AnimationState.BURGER_X;
            $jacocoInit[225] = true;
            return z;
        } else {
            $jacocoInit[221] = true;
        }
        if (!z3) {
            $jacocoInit[222] = true;
        } else if (!z5) {
            $jacocoInit[223] = true;
        } else {
            $jacocoInit[224] = true;
            this.animationState = AnimationState.BURGER_X;
            $jacocoInit[225] = true;
            return z;
        }
        if (!z2) {
            $jacocoInit[226] = true;
        } else if (z8) {
            $jacocoInit[227] = true;
            this.animationState = AnimationState.ARROW_CHECK;
            $jacocoInit[232] = true;
            return z2;
        } else {
            $jacocoInit[228] = true;
        }
        if (!z4) {
            $jacocoInit[229] = true;
        } else if (!z6) {
            $jacocoInit[230] = true;
        } else {
            $jacocoInit[231] = true;
            this.animationState = AnimationState.ARROW_CHECK;
            $jacocoInit[232] = true;
            return z2;
        }
        if (!z) {
            $jacocoInit[233] = true;
        } else if (z8) {
            $jacocoInit[234] = true;
            this.animationState = AnimationState.BURGER_CHECK;
            $jacocoInit[239] = true;
            return z;
        } else {
            $jacocoInit[235] = true;
        }
        if (!z4) {
            $jacocoInit[236] = true;
        } else if (!z5) {
            $jacocoInit[237] = true;
        } else {
            $jacocoInit[238] = true;
            this.animationState = AnimationState.BURGER_CHECK;
            $jacocoInit[239] = true;
            return z;
        }
        if (!z3) {
            $jacocoInit[240] = true;
        } else if (z8) {
            $jacocoInit[241] = true;
            this.animationState = AnimationState.X_CHECK;
            $jacocoInit[246] = true;
            return z3;
        } else {
            $jacocoInit[242] = true;
        }
        if (!z4) {
            $jacocoInit[243] = true;
        } else if (z7) {
            $jacocoInit[245] = true;
            this.animationState = AnimationState.X_CHECK;
            $jacocoInit[246] = true;
            return z3;
        } else {
            $jacocoInit[244] = true;
        }
        Object[] objArr = {this.currentIconState, this.animatingIconState};
        $jacocoInit[247] = true;
        IllegalStateException illegalStateException = new IllegalStateException(String.format("Animating from %s to %s is not supported", objArr));
        $jacocoInit[248] = true;
        throw illegalStateException;
    }

    /* JADX INFO: finally extract failed */
    public void animateIconState(IconState iconState) {
        boolean[] $jacocoInit = $jacocoInit();
        synchronized (this.lock) {
            try {
                $jacocoInit[153] = true;
                if (!this.transformationRunning) {
                    $jacocoInit[154] = true;
                } else {
                    $jacocoInit[155] = true;
                    this.transformation.end();
                    $jacocoInit[156] = true;
                }
                this.animatingIconState = iconState;
                $jacocoInit[157] = true;
                start();
            } catch (Throwable th) {
                while (true) {
                    $jacocoInit[158] = true;
                    throw th;
                }
            }
        }
        $jacocoInit[159] = true;
    }

    public void draw(Canvas canvas) {
        boolean[] $jacocoInit = $jacocoInit();
        if (!this.visible) {
            $jacocoInit[38] = true;
            return;
        }
        float f = this.transformationValue;
        if (f <= 1.0f) {
            $jacocoInit[39] = true;
        } else {
            f = TRANSFORMATION_END - f;
            $jacocoInit[40] = true;
        }
        if (!this.rtlEnabled) {
            $jacocoInit[41] = true;
        } else {
            $jacocoInit[42] = true;
            canvas.save();
            $jacocoInit[43] = true;
            canvas.scale(-1.0f, 1.0f, 0.0f, 0.0f);
            $jacocoInit[44] = true;
            canvas.translate((float) (-getIntrinsicWidth()), 0.0f);
            $jacocoInit[45] = true;
        }
        drawTopLine(canvas, f);
        $jacocoInit[46] = true;
        drawMiddleLine(canvas, f);
        $jacocoInit[47] = true;
        drawBottomLine(canvas, f);
        if (!this.rtlEnabled) {
            $jacocoInit[48] = true;
        } else {
            $jacocoInit[49] = true;
            canvas.restore();
            $jacocoInit[50] = true;
        }
        $jacocoInit[51] = true;
    }

    public ConstantState getConstantState() {
        boolean[] $jacocoInit = $jacocoInit();
        MaterialMenuState.access$402(this.materialMenuState, getChangingConfigurations());
        MaterialMenuState materialMenuState2 = this.materialMenuState;
        $jacocoInit[271] = true;
        return materialMenuState2;
    }

    public IconState getIconState() {
        boolean[] $jacocoInit = $jacocoInit();
        IconState iconState = this.currentIconState;
        $jacocoInit[180] = true;
        return iconState;
    }

    public int getIntrinsicHeight() {
        boolean[] $jacocoInit = $jacocoInit();
        int i = this.height;
        $jacocoInit[270] = true;
        return i;
    }

    public int getIntrinsicWidth() {
        boolean[] $jacocoInit = $jacocoInit();
        int i = this.width;
        $jacocoInit[269] = true;
        return i;
    }

    public int getOpacity() {
        $jacocoInit()[126] = true;
        return -2;
    }

    public Float getTransformationValue() {
        boolean[] $jacocoInit = $jacocoInit();
        Float valueOf = Float.valueOf(this.transformationValue);
        $jacocoInit[182] = true;
        return valueOf;
    }

    public boolean isDrawableVisible() {
        boolean[] $jacocoInit = $jacocoInit();
        boolean z = this.visible;
        $jacocoInit[181] = true;
        return z;
    }

    public boolean isRunning() {
        boolean[] $jacocoInit = $jacocoInit();
        boolean z = this.transformationRunning;
        $jacocoInit[268] = true;
        return z;
    }

    public Drawable mutate() {
        boolean[] $jacocoInit = $jacocoInit();
        this.materialMenuState = new MaterialMenuState(this, null);
        $jacocoInit[272] = true;
        return this;
    }

    public void setAlpha(int i) {
        boolean[] $jacocoInit = $jacocoInit();
        this.iconPaint.setAlpha(i);
        $jacocoInit[124] = true;
    }

    public void setAnimationListener(AnimatorListener animatorListener2) {
        boolean[] $jacocoInit = $jacocoInit();
        AnimatorListener animatorListener3 = this.animatorListener;
        if (animatorListener3 == null) {
            $jacocoInit[132] = true;
        } else {
            $jacocoInit[133] = true;
            this.transformation.removeListener(animatorListener3);
            $jacocoInit[134] = true;
        }
        if (animatorListener2 == null) {
            $jacocoInit[135] = true;
        } else {
            $jacocoInit[136] = true;
            this.transformation.addListener(animatorListener2);
            $jacocoInit[137] = true;
        }
        this.animatorListener = animatorListener2;
        $jacocoInit[138] = true;
    }

    public void setColor(int i) {
        boolean[] $jacocoInit = $jacocoInit();
        this.iconPaint.setColor(i);
        $jacocoInit[127] = true;
        this.circlePaint.setColor(i);
        $jacocoInit[128] = true;
        invalidateSelf();
        $jacocoInit[129] = true;
    }

    public void setColorFilter(ColorFilter colorFilter) {
        boolean[] $jacocoInit = $jacocoInit();
        this.iconPaint.setColorFilter(colorFilter);
        $jacocoInit[125] = true;
    }

    /* JADX INFO: finally extract failed */
    public void setIconState(IconState iconState) {
        boolean[] $jacocoInit = $jacocoInit();
        synchronized (this.lock) {
            try {
                $jacocoInit[139] = true;
                if (!this.transformationRunning) {
                    $jacocoInit[140] = true;
                } else {
                    $jacocoInit[141] = true;
                    this.transformation.cancel();
                    this.transformationRunning = false;
                    $jacocoInit[142] = true;
                }
                if (this.currentIconState != iconState) {
                    $jacocoInit[143] = true;
                    int i = C99983.f26602xf8499f6c[iconState.ordinal()];
                    if (i == 1) {
                        this.animationState = AnimationState.BURGER_ARROW;
                        this.transformationValue = 0.0f;
                        $jacocoInit[146] = true;
                    } else if (i == 2) {
                        this.animationState = AnimationState.BURGER_ARROW;
                        this.transformationValue = 1.0f;
                        $jacocoInit[147] = true;
                    } else if (i == 3) {
                        this.animationState = AnimationState.BURGER_X;
                        this.transformationValue = 1.0f;
                        $jacocoInit[148] = true;
                    } else if (i != 4) {
                        $jacocoInit[145] = true;
                    } else {
                        this.animationState = AnimationState.BURGER_CHECK;
                        this.transformationValue = 1.0f;
                        $jacocoInit[149] = true;
                    }
                    this.currentIconState = iconState;
                    $jacocoInit[150] = true;
                    invalidateSelf();
                    $jacocoInit[152] = true;
                    return;
                }
                $jacocoInit[144] = true;
            } catch (Throwable th) {
                while (true) {
                    $jacocoInit[151] = true;
                    throw th;
                }
            }
        }
    }

    public void setInterpolator(Interpolator interpolator) {
        boolean[] $jacocoInit = $jacocoInit();
        this.transformation.setInterpolator(interpolator);
        $jacocoInit[131] = true;
    }

    public void setRTLEnabled(boolean z) {
        boolean[] $jacocoInit = $jacocoInit();
        this.rtlEnabled = z;
        $jacocoInit[178] = true;
        invalidateSelf();
        $jacocoInit[179] = true;
    }

    @RequiresApi(api = 11)
    public void setTransformationDuration(int i) {
        boolean[] $jacocoInit = $jacocoInit();
        this.transformation.setDuration((long) i);
        $jacocoInit[130] = true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0058  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.instabug.library.p397ui.custom.MaterialMenuDrawable.IconState setTransformationOffset(com.instabug.library.p397ui.custom.MaterialMenuDrawable.AnimationState r7, float r8) {
        /*
            r6 = this;
            boolean[] r0 = $jacocoInit()
            r1 = 0
            r2 = 0
            r3 = 1073741824(0x40000000, float:2.0)
            r4 = 1
            int r5 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r5 < 0) goto L_0x0079
            int r5 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r5 > 0) goto L_0x0074
            r6.animationState = r7
            r2 = 1065353216(0x3f800000, float:1.0)
            int r2 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r2 >= 0) goto L_0x001e
            r1 = 164(0xa4, float:2.3E-43)
            r0[r1] = r4
            goto L_0x0026
        L_0x001e:
            int r2 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r2 != 0) goto L_0x002c
            r1 = 165(0xa5, float:2.31E-43)
            r0[r1] = r4
        L_0x0026:
            r1 = 166(0xa6, float:2.33E-43)
            r0[r1] = r4
            r1 = 1
            goto L_0x0030
        L_0x002c:
            r2 = 167(0xa7, float:2.34E-43)
            r0[r2] = r4
        L_0x0030:
            r2 = 168(0xa8, float:2.35E-43)
            r0[r2] = r4
            if (r1 == 0) goto L_0x003f
            com.instabug.library.ui.custom.MaterialMenuDrawable$IconState r2 = r7.getFirstState()
            r3 = 169(0xa9, float:2.37E-43)
            r0[r3] = r4
            goto L_0x0047
        L_0x003f:
            com.instabug.library.ui.custom.MaterialMenuDrawable$IconState r2 = r7.getSecondState()
            r3 = 170(0xaa, float:2.38E-43)
            r0[r3] = r4
        L_0x0047:
            r6.currentIconState = r2
            r2 = 171(0xab, float:2.4E-43)
            r0[r2] = r4
            if (r1 == 0) goto L_0x0058
            com.instabug.library.ui.custom.MaterialMenuDrawable$IconState r7 = r7.getSecondState()
            r1 = 172(0xac, float:2.41E-43)
            r0[r1] = r4
            goto L_0x0060
        L_0x0058:
            com.instabug.library.ui.custom.MaterialMenuDrawable$IconState r7 = r7.getFirstState()
            r1 = 173(0xad, float:2.42E-43)
            r0[r1] = r4
        L_0x0060:
            r6.animatingIconState = r7
            r7 = 174(0xae, float:2.44E-43)
            r0[r7] = r4
            java.lang.Float r7 = java.lang.Float.valueOf(r8)
            r6.setTransformationValue(r7)
            com.instabug.library.ui.custom.MaterialMenuDrawable$IconState r7 = r6.currentIconState
            r8 = 175(0xaf, float:2.45E-43)
            r0[r8] = r4
            return r7
        L_0x0074:
            r7 = 161(0xa1, float:2.26E-43)
            r0[r7] = r4
            goto L_0x007d
        L_0x0079:
            r7 = 160(0xa0, float:2.24E-43)
            r0[r7] = r4
        L_0x007d:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            r8 = 2
            java.lang.Object[] r8 = new java.lang.Object[r8]
            r5 = 162(0xa2, float:2.27E-43)
            r0[r5] = r4
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
            r8[r1] = r2
            java.lang.Float r1 = java.lang.Float.valueOf(r3)
            r8[r4] = r1
            java.lang.String r1 = "Value must be between %s and %s"
            java.lang.String r8 = java.lang.String.format(r1, r8)
            r7.<init>(r8)
            r8 = 163(0xa3, float:2.28E-43)
            r0[r8] = r4
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instabug.library.p397ui.custom.MaterialMenuDrawable.setTransformationOffset(com.instabug.library.ui.custom.MaterialMenuDrawable$AnimationState, float):com.instabug.library.ui.custom.MaterialMenuDrawable$IconState");
    }

    public void setTransformationValue(Float f) {
        boolean[] $jacocoInit = $jacocoInit();
        this.transformationValue = f.floatValue();
        $jacocoInit[183] = true;
        invalidateSelf();
        $jacocoInit[184] = true;
    }

    public void setVisible(boolean z) {
        boolean[] $jacocoInit = $jacocoInit();
        this.visible = z;
        $jacocoInit[176] = true;
        invalidateSelf();
        $jacocoInit[177] = true;
    }

    public void start() {
        float f;
        boolean[] $jacocoInit = $jacocoInit();
        if (this.transformationRunning) {
            $jacocoInit[249] = true;
            return;
        }
        IconState iconState = this.animatingIconState;
        if (iconState == null) {
            $jacocoInit[250] = true;
        } else if (iconState == this.currentIconState) {
            $jacocoInit[251] = true;
        } else {
            this.transformationRunning = true;
            $jacocoInit[252] = true;
            boolean resolveTransformation = resolveTransformation();
            $jacocoInit[253] = true;
            ObjectAnimator objectAnimator = this.transformation;
            float[] fArr = new float[2];
            float f2 = 1.0f;
            if (resolveTransformation) {
                f = 0.0f;
                $jacocoInit[254] = true;
            } else {
                $jacocoInit[255] = true;
                f = 1.0f;
            }
            fArr[0] = f;
            if (resolveTransformation) {
                $jacocoInit[256] = true;
            } else {
                f2 = TRANSFORMATION_END;
                $jacocoInit[257] = true;
            }
            fArr[1] = f2;
            objectAnimator.setFloatValues(fArr);
            $jacocoInit[258] = true;
            this.transformation.start();
            $jacocoInit[259] = true;
        }
        invalidateSelf();
        $jacocoInit[260] = true;
    }

    public void stop() {
        boolean[] $jacocoInit = $jacocoInit();
        if (!isRunning()) {
            $jacocoInit[261] = true;
        } else if (!this.transformation.isRunning()) {
            $jacocoInit[262] = true;
        } else {
            $jacocoInit[263] = true;
            this.transformation.end();
            $jacocoInit[264] = true;
            $jacocoInit[267] = true;
        }
        this.transformationRunning = false;
        $jacocoInit[265] = true;
        invalidateSelf();
        $jacocoInit[266] = true;
        $jacocoInit[267] = true;
    }

    public MaterialMenuDrawable(Context context, int i, Stroke stroke2) {
        boolean[] $jacocoInit = $jacocoInit();
        this(context, i, stroke2, 1, DEFAULT_TRANSFORM_DURATION);
        $jacocoInit[0] = true;
    }

    public MaterialMenuDrawable(Context context, int i, Stroke stroke2, int i2) {
        boolean[] $jacocoInit = $jacocoInit();
        this(context, i, stroke2, 1, i2);
        $jacocoInit[1] = true;
    }

    public MaterialMenuDrawable(Context context, int i, Stroke stroke2, int i2, int i3) {
        boolean[] $jacocoInit = $jacocoInit();
        $jacocoInit[2] = true;
        this.lock = new Object();
        $jacocoInit[3] = true;
        this.iconPaint = new Paint();
        $jacocoInit[4] = true;
        this.circlePaint = new Paint();
        this.transformationValue = 0.0f;
        this.transformationRunning = false;
        this.currentIconState = IconState.BURGER;
        this.animationState = AnimationState.BURGER_ARROW;
        $jacocoInit[5] = true;
        this.transformationProperty = new Property<MaterialMenuDrawable, Float>(this, Float.class, "transformation") {
            private static transient /* synthetic */ boolean[] $jacocoData;
            final /* synthetic */ MaterialMenuDrawable this$0;

            private static /* synthetic */ boolean[] $jacocoInit() {
                boolean[] zArr = $jacocoData;
                if (zArr != null) {
                    return zArr;
                }
                boolean[] a = C13938g.m59885a(5583512078730874358L, "com/instabug/library/ui/custom/MaterialMenuDrawable$1", 5);
                $jacocoData = a;
                return a;
            }

            {
                boolean[] $jacocoInit = $jacocoInit();
                this.this$0 = r2;
                $jacocoInit[0] = true;
            }

            public /* synthetic */ Object get(Object obj) {
                boolean[] $jacocoInit = $jacocoInit();
                Float f = get((MaterialMenuDrawable) obj);
                $jacocoInit[3] = true;
                return f;
            }

            public /* synthetic */ void set(Object obj, Object obj2) {
                boolean[] $jacocoInit = $jacocoInit();
                set((MaterialMenuDrawable) obj, (Float) obj2);
                $jacocoInit[4] = true;
            }

            public Float get(MaterialMenuDrawable materialMenuDrawable) {
                boolean[] $jacocoInit = $jacocoInit();
                Float transformationValue = materialMenuDrawable.getTransformationValue();
                $jacocoInit[1] = true;
                return transformationValue;
            }

            public void set(MaterialMenuDrawable materialMenuDrawable, Float f) {
                boolean[] $jacocoInit = $jacocoInit();
                materialMenuDrawable.setTransformationValue(f);
                $jacocoInit[2] = true;
            }
        };
        $jacocoInit[6] = true;
        Resources resources = context.getResources();
        $jacocoInit[7] = true;
        float f = (float) i2;
        this.dip1 = dpToPx(resources, 1.0f) * f;
        $jacocoInit[8] = true;
        this.dip2 = dpToPx(resources, TRANSFORMATION_END) * f;
        $jacocoInit[9] = true;
        this.dip3 = dpToPx(resources, 3.0f) * f;
        $jacocoInit[10] = true;
        this.dip4 = dpToPx(resources, 4.0f) * f;
        $jacocoInit[11] = true;
        this.dip8 = dpToPx(resources, 8.0f) * f;
        this.diph = this.dip1 / TRANSFORMATION_END;
        this.stroke = stroke2;
        this.visible = true;
        $jacocoInit[12] = true;
        this.width = (int) (dpToPx(resources, 40.0f) * f);
        $jacocoInit[13] = true;
        this.height = (int) (dpToPx(resources, 40.0f) * f);
        $jacocoInit[14] = true;
        this.iconWidth = dpToPx(resources, 20.0f) * f;
        $jacocoInit[15] = true;
        this.circleRadius = dpToPx(resources, 18.0f) * f;
        $jacocoInit[16] = true;
        this.strokeWidth = dpToPx(resources, (float) Stroke.access$000(stroke2)) * f;
        this.sidePadding = (((float) this.width) - this.iconWidth) / TRANSFORMATION_END;
        this.topPadding = (((float) this.height) - (this.dip3 * 5.0f)) / TRANSFORMATION_END;
        $jacocoInit[17] = true;
        initPaint(i);
        $jacocoInit[18] = true;
        initAnimations(i3);
        $jacocoInit[19] = true;
        this.materialMenuState = new MaterialMenuState(this, null);
        $jacocoInit[20] = true;
    }

    private MaterialMenuDrawable(int i, Stroke stroke2, long j, int i2, int i3, float f, float f2, float f3, float f4) {
        boolean[] $jacocoInit = $jacocoInit();
        $jacocoInit[21] = true;
        this.lock = new Object();
        $jacocoInit[22] = true;
        this.iconPaint = new Paint();
        $jacocoInit[23] = true;
        this.circlePaint = new Paint();
        this.transformationValue = 0.0f;
        this.transformationRunning = false;
        this.currentIconState = IconState.BURGER;
        this.animationState = AnimationState.BURGER_ARROW;
        $jacocoInit[24] = true;
        this.transformationProperty = new Property<MaterialMenuDrawable, Float>(this, Float.class, "transformation") {
            private static transient /* synthetic */ boolean[] $jacocoData;
            final /* synthetic */ MaterialMenuDrawable this$0;

            private static /* synthetic */ boolean[] $jacocoInit() {
                boolean[] zArr = $jacocoData;
                if (zArr != null) {
                    return zArr;
                }
                boolean[] a = C13938g.m59885a(5583512078730874358L, "com/instabug/library/ui/custom/MaterialMenuDrawable$1", 5);
                $jacocoData = a;
                return a;
            }

            {
                boolean[] $jacocoInit = $jacocoInit();
                this.this$0 = r2;
                $jacocoInit[0] = true;
            }

            public /* synthetic */ Object get(Object obj) {
                boolean[] $jacocoInit = $jacocoInit();
                Float f = get((MaterialMenuDrawable) obj);
                $jacocoInit[3] = true;
                return f;
            }

            public /* synthetic */ void set(Object obj, Object obj2) {
                boolean[] $jacocoInit = $jacocoInit();
                set((MaterialMenuDrawable) obj, (Float) obj2);
                $jacocoInit[4] = true;
            }

            public Float get(MaterialMenuDrawable materialMenuDrawable) {
                boolean[] $jacocoInit = $jacocoInit();
                Float transformationValue = materialMenuDrawable.getTransformationValue();
                $jacocoInit[1] = true;
                return transformationValue;
            }

            public void set(MaterialMenuDrawable materialMenuDrawable, Float f) {
                boolean[] $jacocoInit = $jacocoInit();
                materialMenuDrawable.setTransformationValue(f);
                $jacocoInit[2] = true;
            }
        };
        this.dip1 = f4;
        this.dip2 = f4 * TRANSFORMATION_END;
        this.dip3 = 3.0f * f4;
        this.dip4 = 4.0f * f4;
        this.dip8 = 8.0f * f4;
        this.diph = f4 / TRANSFORMATION_END;
        this.stroke = stroke2;
        this.width = i2;
        this.height = i3;
        this.iconWidth = f;
        this.circleRadius = f2;
        this.strokeWidth = f3;
        this.sidePadding = (((float) i2) - f) / TRANSFORMATION_END;
        this.topPadding = (((float) i3) - (this.dip3 * 5.0f)) / TRANSFORMATION_END;
        $jacocoInit[25] = true;
        initPaint(i);
        $jacocoInit[26] = true;
        initAnimations((int) j);
        $jacocoInit[27] = true;
        this.materialMenuState = new MaterialMenuState(this, null);
        $jacocoInit[28] = true;
    }
}
