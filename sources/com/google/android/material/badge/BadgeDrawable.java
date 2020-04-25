package com.google.android.material.badge;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint.Align;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.C0188f;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import androidx.annotation.C0197j0;
import androidx.annotation.C0198k;
import androidx.annotation.C0207n0;
import androidx.annotation.C0207n0.C0208a;
import androidx.annotation.C0211p;
import androidx.annotation.C0214q0;
import androidx.annotation.C0216r0;
import androidx.annotation.C0218s0;
import androidx.annotation.C0231x0;
import androidx.core.p034l.C0962e0;
import com.google.android.material.C5582R;
import com.google.android.material.internal.C6923n;
import com.google.android.material.internal.C6923n.C6925b;
import com.google.android.material.internal.C6928p;
import com.google.android.material.p187p.C6978j;
import com.google.android.material.p297g.C6882a;
import com.google.android.material.p302m.C6952c;
import com.google.android.material.p302m.C6953d;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;

public class BadgeDrawable extends Drawable implements C6925b {

    /* renamed from: b0 */
    public static final int f16064b0 = 8388661;

    /* renamed from: c0 */
    public static final int f16065c0 = 8388659;

    /* renamed from: d0 */
    public static final int f16066d0 = 8388693;

    /* renamed from: e0 */
    public static final int f16067e0 = 8388691;

    /* renamed from: f0 */
    private static final int f16068f0 = 4;

    /* renamed from: g0 */
    private static final int f16069g0 = -1;

    /* renamed from: h0 */
    private static final int f16070h0 = 9;
    @C0216r0

    /* renamed from: i0 */
    private static final int f16071i0 = C5582R.style.Widget_MaterialComponents_Badge;
    @C0188f

    /* renamed from: j0 */
    private static final int f16072j0 = C5582R.attr.badgeStyle;

    /* renamed from: k0 */
    static final String f16073k0 = "+";
    @C0193h0

    /* renamed from: N */
    private final C6923n f16074N;
    @C0193h0

    /* renamed from: O */
    private final Rect f16075O = new Rect();

    /* renamed from: P */
    private final float f16076P;

    /* renamed from: Q */
    private final float f16077Q;

    /* renamed from: R */
    private final float f16078R;
    @C0193h0

    /* renamed from: S */
    private final SavedState f16079S;

    /* renamed from: T */
    private float f16080T;

    /* renamed from: U */
    private float f16081U;

    /* renamed from: V */
    private int f16082V;

    /* renamed from: W */
    private float f16083W;

    /* renamed from: X */
    private float f16084X;

    /* renamed from: Y */
    private float f16085Y;
    @C0195i0

    /* renamed from: Z */
    private WeakReference<View> f16086Z;
    @C0193h0

    /* renamed from: a */
    private final WeakReference<Context> f16087a;
    @C0195i0

    /* renamed from: a0 */
    private WeakReference<ViewGroup> f16088a0;
    @C0193h0

    /* renamed from: b */
    private final C6978j f16089b = new C6978j();

    @C0207n0({C0208a.LIBRARY_GROUP})
    public static final class SavedState implements Parcelable {
        public static final Creator<SavedState> CREATOR = new C5620a();
        /* access modifiers changed from: private */
        public int alpha = 255;
        /* access modifiers changed from: private */
        @C0198k
        public int backgroundColor;
        /* access modifiers changed from: private */
        public int badgeGravity;
        /* access modifiers changed from: private */
        @C0198k
        public int badgeTextColor;
        /* access modifiers changed from: private */
        @C0195i0
        public CharSequence contentDescriptionNumberless;
        /* access modifiers changed from: private */
        @C0197j0
        public int contentDescriptionQuantityStrings;
        /* access modifiers changed from: private */
        @C0211p(unit = 1)
        public int horizontalOffset;
        /* access modifiers changed from: private */
        public int maxCharacterCount;
        /* access modifiers changed from: private */
        public int number = -1;
        /* access modifiers changed from: private */
        @C0211p(unit = 1)
        public int verticalOffset;

        /* renamed from: com.google.android.material.badge.BadgeDrawable$SavedState$a */
        static class C5620a implements Creator<SavedState> {
            C5620a() {
            }

            @C0193h0
            public SavedState createFromParcel(@C0193h0 Parcel parcel) {
                return new SavedState(parcel);
            }

            @C0193h0
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        public SavedState(@C0193h0 Context context) {
            this.badgeTextColor = new C6953d(context, C5582R.style.TextAppearance_MaterialComponents_Badge).f19445b.getDefaultColor();
            this.contentDescriptionNumberless = context.getString(C5582R.string.mtrl_badge_numberless_content_description);
            this.contentDescriptionQuantityStrings = C5582R.plurals.mtrl_badge_content_description;
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(@C0193h0 Parcel parcel, int i) {
            parcel.writeInt(this.backgroundColor);
            parcel.writeInt(this.badgeTextColor);
            parcel.writeInt(this.alpha);
            parcel.writeInt(this.number);
            parcel.writeInt(this.maxCharacterCount);
            parcel.writeString(this.contentDescriptionNumberless.toString());
            parcel.writeInt(this.contentDescriptionQuantityStrings);
            parcel.writeInt(this.badgeGravity);
            parcel.writeInt(this.horizontalOffset);
            parcel.writeInt(this.verticalOffset);
        }

        protected SavedState(@C0193h0 Parcel parcel) {
            this.backgroundColor = parcel.readInt();
            this.badgeTextColor = parcel.readInt();
            this.alpha = parcel.readInt();
            this.number = parcel.readInt();
            this.maxCharacterCount = parcel.readInt();
            this.contentDescriptionNumberless = parcel.readString();
            this.contentDescriptionQuantityStrings = parcel.readInt();
            this.badgeGravity = parcel.readInt();
            this.horizontalOffset = parcel.readInt();
            this.verticalOffset = parcel.readInt();
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: com.google.android.material.badge.BadgeDrawable$a */
    public @interface C5621a {
    }

    private BadgeDrawable(@C0193h0 Context context) {
        this.f16087a = new WeakReference<>(context);
        C6928p.m33262b(context);
        Resources resources = context.getResources();
        this.f16076P = (float) resources.getDimensionPixelSize(C5582R.dimen.mtrl_badge_radius);
        this.f16078R = (float) resources.getDimensionPixelSize(C5582R.dimen.mtrl_badge_long_text_horizontal_padding);
        this.f16077Q = (float) resources.getDimensionPixelSize(C5582R.dimen.mtrl_badge_with_text_radius);
        this.f16074N = new C6923n(this);
        this.f16074N.mo27653b().setTextAlign(Align.CENTER);
        this.f16079S = new SavedState(context);
        m24479i(C5582R.style.TextAppearance_MaterialComponents_Badge);
    }

    @C0193h0
    /* renamed from: a */
    static BadgeDrawable m24473a(@C0193h0 Context context, @C0193h0 SavedState savedState) {
        BadgeDrawable badgeDrawable = new BadgeDrawable(context);
        badgeDrawable.m24476a(savedState);
        return badgeDrawable;
    }

    /* renamed from: b */
    private void m24478b(Context context, AttributeSet attributeSet, @C0188f int i, @C0216r0 int i2) {
        TypedArray c = C6928p.m33264c(context, attributeSet, C5582R.styleable.Badge, i, i2, new int[0]);
        mo22264f(c.getInt(C5582R.styleable.Badge_maxCharacterCount, 4));
        if (c.hasValue(C5582R.styleable.Badge_number)) {
            mo22266g(c.getInt(C5582R.styleable.Badge_number, 0));
        }
        mo22250a(m24469a(context, c, C5582R.styleable.Badge_backgroundColor));
        if (c.hasValue(C5582R.styleable.Badge_badgeTextColor)) {
            mo22257c(m24469a(context, c, C5582R.styleable.Badge_badgeTextColor));
        }
        mo22255b(c.getInt(C5582R.styleable.Badge_badgeGravity, f16064b0));
        mo22262e(c.getDimensionPixelOffset(C5582R.styleable.Badge_horizontalOffset, 0));
        mo22272h(c.getDimensionPixelOffset(C5582R.styleable.Badge_verticalOffset, 0));
        c.recycle();
    }

    @C0193h0
    /* renamed from: m */
    private String m24480m() {
        if (mo22273i() <= this.f16082V) {
            return Integer.toString(mo22273i());
        }
        Context context = (Context) this.f16087a.get();
        if (context == null) {
            return "";
        }
        return context.getString(C5582R.string.mtrl_exceed_max_badge_number_suffix, new Object[]{Integer.valueOf(this.f16082V), "+"});
    }

    /* renamed from: n */
    private void m24481n() {
        Context context = (Context) this.f16087a.get();
        WeakReference<View> weakReference = this.f16086Z;
        ViewGroup viewGroup = null;
        View view = weakReference != null ? (View) weakReference.get() : null;
        if (context != null && view != null) {
            Rect rect = new Rect();
            rect.set(this.f16075O);
            Rect rect2 = new Rect();
            view.getDrawingRect(rect2);
            WeakReference<ViewGroup> weakReference2 = this.f16088a0;
            if (weakReference2 != null) {
                viewGroup = (ViewGroup) weakReference2.get();
            }
            if (viewGroup != null || C5622a.f16090a) {
                if (viewGroup == null) {
                    viewGroup = (ViewGroup) view.getParent();
                }
                viewGroup.offsetDescendantRectToMyCoords(view, rect2);
            }
            m24474a(context, rect2, view);
            C5622a.m24508a(this.f16075O, this.f16080T, this.f16081U, this.f16084X, this.f16085Y);
            this.f16089b.mo27783a(this.f16083W);
            if (!rect.equals(this.f16075O)) {
                this.f16089b.setBounds(this.f16075O);
            }
        }
    }

    /* renamed from: o */
    private void m24482o() {
        double h = (double) mo22271h();
        Double.isNaN(h);
        this.f16082V = ((int) Math.pow(10.0d, h - 1.0d)) - 1;
    }

    @C0198k
    /* renamed from: c */
    public int mo22256c() {
        return this.f16089b.mo27815f().getDefaultColor();
    }

    /* renamed from: d */
    public int mo22258d() {
        return this.f16079S.badgeGravity;
    }

    public void draw(@C0193h0 Canvas canvas) {
        if (!getBounds().isEmpty() && getAlpha() != 0 && isVisible()) {
            this.f16089b.draw(canvas);
            if (mo22277l()) {
                m24475a(canvas);
            }
        }
    }

    @C0198k
    /* renamed from: e */
    public int mo22261e() {
        return this.f16074N.mo27653b().getColor();
    }

    /* renamed from: f */
    public void mo22264f(int i) {
        if (this.f16079S.maxCharacterCount != i) {
            this.f16079S.maxCharacterCount = i;
            m24482o();
            this.f16074N.mo27652a(true);
            m24481n();
            invalidateSelf();
        }
    }

    /* renamed from: g */
    public void mo22266g(int i) {
        int max = Math.max(0, i);
        if (this.f16079S.number != max) {
            this.f16079S.number = max;
            this.f16074N.mo27652a(true);
            m24481n();
            invalidateSelf();
        }
    }

    public int getAlpha() {
        return this.f16079S.alpha;
    }

    public int getIntrinsicHeight() {
        return this.f16075O.height();
    }

    public int getIntrinsicWidth() {
        return this.f16075O.width();
    }

    public int getOpacity() {
        return -3;
    }

    /* renamed from: h */
    public int mo22271h() {
        return this.f16079S.maxCharacterCount;
    }

    /* renamed from: i */
    public int mo22273i() {
        if (!mo22277l()) {
            return 0;
        }
        return this.f16079S.number;
    }

    public boolean isStateful() {
        return false;
    }

    @C0193h0
    /* renamed from: j */
    public SavedState mo22275j() {
        return this.f16079S;
    }

    /* renamed from: k */
    public int mo22276k() {
        return this.f16079S.verticalOffset;
    }

    /* renamed from: l */
    public boolean mo22277l() {
        return this.f16079S.number != -1;
    }

    public boolean onStateChange(int[] iArr) {
        return super.onStateChange(iArr);
    }

    public void setAlpha(int i) {
        this.f16079S.alpha = i;
        this.f16074N.mo27653b().setAlpha(i);
        invalidateSelf();
    }

    public void setColorFilter(ColorFilter colorFilter) {
    }

    /* renamed from: c */
    public void mo22257c(@C0198k int i) {
        this.f16079S.badgeTextColor = i;
        if (this.f16074N.mo27653b().getColor() != i) {
            this.f16074N.mo27653b().setColor(i);
            invalidateSelf();
        }
    }

    /* renamed from: d */
    public void mo22259d(@C0214q0 int i) {
        this.f16079S.contentDescriptionQuantityStrings = i;
    }

    /* renamed from: e */
    public void mo22262e(int i) {
        this.f16079S.horizontalOffset = i;
        m24481n();
    }

    /* renamed from: h */
    public void mo22272h(int i) {
        this.f16079S.verticalOffset = i;
        m24481n();
    }

    @C0193h0
    /* renamed from: a */
    public static BadgeDrawable m24470a(@C0193h0 Context context) {
        return m24472a(context, null, f16072j0, f16071i0);
    }

    /* renamed from: i */
    private void m24479i(@C0216r0 int i) {
        Context context = (Context) this.f16087a.get();
        if (context != null) {
            m24477a(new C6953d(context, i));
        }
    }

    @C0193h0
    /* renamed from: a */
    public static BadgeDrawable m24471a(@C0193h0 Context context, @C0231x0 int i) {
        AttributeSet a = C6882a.m33052a(context, i, (CharSequence) "badge");
        int styleAttribute = a.getStyleAttribute();
        if (styleAttribute == 0) {
            styleAttribute = f16071i0;
        }
        return m24472a(context, a, f16072j0, styleAttribute);
    }

    @C0195i0
    /* renamed from: f */
    public CharSequence mo22263f() {
        if (!isVisible()) {
            return null;
        }
        if (!mo22277l()) {
            return this.f16079S.contentDescriptionNumberless;
        }
        if (this.f16079S.contentDescriptionQuantityStrings <= 0) {
            return null;
        }
        Context context = (Context) this.f16087a.get();
        if (context == null) {
            return null;
        }
        return context.getResources().getQuantityString(this.f16079S.contentDescriptionQuantityStrings, mo22273i(), new Object[]{Integer.valueOf(mo22273i())});
    }

    /* renamed from: g */
    public int mo22265g() {
        return this.f16079S.horizontalOffset;
    }

    @C0193h0
    /* renamed from: a */
    private static BadgeDrawable m24472a(@C0193h0 Context context, AttributeSet attributeSet, @C0188f int i, @C0216r0 int i2) {
        BadgeDrawable badgeDrawable = new BadgeDrawable(context);
        badgeDrawable.m24478b(context, attributeSet, i, i2);
        return badgeDrawable;
    }

    /* renamed from: a */
    public void mo22253a(boolean z) {
        setVisible(z, false);
    }

    /* renamed from: a */
    private void m24476a(@C0193h0 SavedState savedState) {
        mo22264f(savedState.maxCharacterCount);
        if (savedState.number != -1) {
            mo22266g(savedState.number);
        }
        mo22250a(savedState.backgroundColor);
        mo22257c(savedState.badgeTextColor);
        mo22255b(savedState.badgeGravity);
        mo22262e(savedState.horizontalOffset);
        mo22272h(savedState.verticalOffset);
    }

    /* renamed from: b */
    public void mo22254b() {
        this.f16079S.number = -1;
        invalidateSelf();
    }

    /* renamed from: b */
    public void mo22255b(int i) {
        if (this.f16079S.badgeGravity != i) {
            this.f16079S.badgeGravity = i;
            WeakReference<View> weakReference = this.f16086Z;
            if (weakReference != null && weakReference.get() != null) {
                View view = (View) this.f16086Z.get();
                WeakReference<ViewGroup> weakReference2 = this.f16088a0;
                mo22251a(view, weakReference2 != null ? (ViewGroup) weakReference2.get() : null);
            }
        }
    }

    /* renamed from: a */
    private static int m24469a(Context context, @C0193h0 TypedArray typedArray, @C0218s0 int i) {
        return C6952c.m33332a(context, typedArray, i).getDefaultColor();
    }

    /* renamed from: a */
    public void mo22251a(@C0193h0 View view, @C0195i0 ViewGroup viewGroup) {
        this.f16086Z = new WeakReference<>(view);
        this.f16088a0 = new WeakReference<>(viewGroup);
        m24481n();
        invalidateSelf();
    }

    /* renamed from: a */
    public void mo22250a(@C0198k int i) {
        this.f16079S.backgroundColor = i;
        ColorStateList valueOf = ColorStateList.valueOf(i);
        if (this.f16089b.mo27815f() != valueOf) {
            this.f16089b.mo27790a(valueOf);
            invalidateSelf();
        }
    }

    @C0207n0({C0208a.LIBRARY_GROUP})
    /* renamed from: a */
    public void mo22249a() {
        invalidateSelf();
    }

    /* renamed from: a */
    public void mo22252a(CharSequence charSequence) {
        this.f16079S.contentDescriptionNumberless = charSequence;
    }

    /* renamed from: a */
    private void m24477a(@C0195i0 C6953d dVar) {
        if (this.f16074N.mo27648a() != dVar) {
            Context context = (Context) this.f16087a.get();
            if (context != null) {
                this.f16074N.mo27651a(dVar, context);
                m24481n();
            }
        }
    }

    /* renamed from: a */
    private void m24474a(@C0193h0 Context context, @C0193h0 Rect rect, @C0193h0 View view) {
        float f;
        float f2;
        int access$400 = this.f16079S.badgeGravity;
        if (access$400 == 8388691 || access$400 == 8388693) {
            this.f16081U = (float) (rect.bottom - this.f16079S.verticalOffset);
        } else {
            this.f16081U = (float) (rect.top + this.f16079S.verticalOffset);
        }
        if (mo22273i() <= 9) {
            this.f16083W = !mo22277l() ? this.f16076P : this.f16077Q;
            float f3 = this.f16083W;
            this.f16085Y = f3;
            this.f16084X = f3;
        } else {
            this.f16083W = this.f16077Q;
            this.f16085Y = this.f16083W;
            this.f16084X = (this.f16074N.mo27647a(m24480m()) / 2.0f) + this.f16078R;
        }
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(mo22277l() ? C5582R.dimen.mtrl_badge_text_horizontal_edge_offset : C5582R.dimen.mtrl_badge_horizontal_edge_offset);
        int access$4002 = this.f16079S.badgeGravity;
        if (access$4002 == 8388659 || access$4002 == 8388691) {
            if (C0962e0.m5566x(view) == 0) {
                f = (((float) rect.left) - this.f16084X) + ((float) dimensionPixelSize) + ((float) this.f16079S.horizontalOffset);
            } else {
                f = ((((float) rect.right) + this.f16084X) - ((float) dimensionPixelSize)) - ((float) this.f16079S.horizontalOffset);
            }
            this.f16080T = f;
            return;
        }
        if (C0962e0.m5566x(view) == 0) {
            f2 = ((((float) rect.right) + this.f16084X) - ((float) dimensionPixelSize)) - ((float) this.f16079S.horizontalOffset);
        } else {
            f2 = (((float) rect.left) - this.f16084X) + ((float) dimensionPixelSize) + ((float) this.f16079S.horizontalOffset);
        }
        this.f16080T = f2;
    }

    /* renamed from: a */
    private void m24475a(Canvas canvas) {
        Rect rect = new Rect();
        String m = m24480m();
        this.f16074N.mo27653b().getTextBounds(m, 0, m.length(), rect);
        canvas.drawText(m, this.f16080T, this.f16081U + ((float) (rect.height() / 2)), this.f16074N.mo27653b());
    }
}
