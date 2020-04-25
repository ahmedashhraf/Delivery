package com.google.android.material.textfield;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.ClassLoaderCreator;
import android.os.Parcelable.Creator;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewStructure;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import androidx.annotation.C0198k;
import androidx.annotation.C0202m;
import androidx.annotation.C0207n0;
import androidx.annotation.C0207n0.C0208a;
import androidx.annotation.C0209o;
import androidx.annotation.C0213q;
import androidx.annotation.C0214q0;
import androidx.annotation.C0216r0;
import androidx.annotation.C0224v0;
import androidx.appcompat.p006a.p007a.C0242a;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.C0469a0;
import androidx.appcompat.widget.C0510i;
import androidx.appcompat.widget.C0549t0;
import androidx.core.content.C0841b;
import androidx.core.graphics.drawable.C0892a;
import androidx.core.p034l.C0947a;
import androidx.core.p034l.C0962e0;
import androidx.core.p034l.C0984g;
import androidx.core.p034l.C0999l;
import androidx.core.p034l.p035o0.C1016d;
import androidx.core.widget.C1120m;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.C5582R;
import com.google.android.material.badge.BadgeDrawable;
import com.google.android.material.internal.C6893a;
import com.google.android.material.internal.C6897c;
import com.google.android.material.internal.C6928p;
import com.google.android.material.internal.C6936w;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.p179a.C5587a;
import com.google.android.material.p185e.C5713a;
import com.google.android.material.p187p.C6978j;
import com.google.android.material.p187p.C6986o;
import com.google.android.material.p187p.C6986o.C6988b;
import com.google.android.material.p302m.C6952c;
import com.google.android.material.theme.p307a.C7109a;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Iterator;
import java.util.LinkedHashSet;
import p212io.branch.referral.C14130h;

public class TextInputLayout extends LinearLayout {

    /* renamed from: A1 */
    public static final int f19978A1 = 0;

    /* renamed from: B1 */
    public static final int f19979B1 = 1;

    /* renamed from: C1 */
    public static final int f19980C1 = 2;

    /* renamed from: D1 */
    public static final int f19981D1 = 3;

    /* renamed from: s1 */
    private static final int f19982s1 = C5582R.style.Widget_Design_TextInputLayout;

    /* renamed from: t1 */
    private static final int f19983t1 = 167;

    /* renamed from: u1 */
    private static final int f19984u1 = -1;

    /* renamed from: v1 */
    private static final String f19985v1 = "TextInputLayout";

    /* renamed from: w1 */
    public static final int f19986w1 = 0;

    /* renamed from: x1 */
    public static final int f19987x1 = 1;

    /* renamed from: y1 */
    public static final int f19988y1 = 2;

    /* renamed from: z1 */
    public static final int f19989z1 = -1;

    /* renamed from: A0 */
    private final Rect f19990A0;

    /* renamed from: B0 */
    private final Rect f19991B0;

    /* renamed from: C0 */
    private final RectF f19992C0;

    /* renamed from: D0 */
    private Typeface f19993D0;
    @C0193h0

    /* renamed from: E0 */
    private final CheckableImageButton f19994E0;

    /* renamed from: F0 */
    private ColorStateList f19995F0;

    /* renamed from: G0 */
    private boolean f19996G0;

    /* renamed from: H0 */
    private Mode f19997H0;

    /* renamed from: I0 */
    private boolean f19998I0;
    @C0195i0

    /* renamed from: J0 */
    private Drawable f19999J0;

    /* renamed from: K0 */
    private int f20000K0;

    /* renamed from: L0 */
    private OnLongClickListener f20001L0;

    /* renamed from: M0 */
    private final LinkedHashSet<C7074h> f20002M0;
    @C0193h0

    /* renamed from: N */
    private final LinearLayout f20003N;

    /* renamed from: N0 */
    private int f20004N0;
    @C0193h0

    /* renamed from: O */
    private final FrameLayout f20005O;

    /* renamed from: O0 */
    private final SparseArray<C7098e> f20006O0;

    /* renamed from: P */
    EditText f20007P;
    /* access modifiers changed from: private */
    @C0193h0

    /* renamed from: P0 */
    public final CheckableImageButton f20008P0;

    /* renamed from: Q */
    private CharSequence f20009Q;

    /* renamed from: Q0 */
    private final LinkedHashSet<C7075i> f20010Q0;

    /* renamed from: R */
    private final C7099f f20011R;

    /* renamed from: R0 */
    private ColorStateList f20012R0;

    /* renamed from: S */
    boolean f20013S;

    /* renamed from: S0 */
    private boolean f20014S0;

    /* renamed from: T */
    private int f20015T;

    /* renamed from: T0 */
    private Mode f20016T0;

    /* renamed from: U */
    private boolean f20017U;

    /* renamed from: U0 */
    private boolean f20018U0;
    @C0195i0

    /* renamed from: V */
    private TextView f20019V;
    @C0195i0

    /* renamed from: V0 */
    private Drawable f20020V0;

    /* renamed from: W */
    private int f20021W;

    /* renamed from: W0 */
    private int f20022W0;

    /* renamed from: X0 */
    private Drawable f20023X0;

    /* renamed from: Y0 */
    private OnLongClickListener f20024Y0;
    @C0193h0

    /* renamed from: Z0 */
    private final CheckableImageButton f20025Z0;
    @C0193h0

    /* renamed from: a */
    private final FrameLayout f20026a;

    /* renamed from: a0 */
    private int f20027a0;

    /* renamed from: a1 */
    private ColorStateList f20028a1;
    @C0193h0

    /* renamed from: b */
    private final LinearLayout f20029b;

    /* renamed from: b0 */
    private CharSequence f20030b0;

    /* renamed from: b1 */
    private ColorStateList f20031b1;
    /* access modifiers changed from: private */

    /* renamed from: c0 */
    public boolean f20032c0;

    /* renamed from: c1 */
    private ColorStateList f20033c1;

    /* renamed from: d0 */
    private TextView f20034d0;
    @C0198k

    /* renamed from: d1 */
    private int f20035d1;
    @C0195i0

    /* renamed from: e0 */
    private ColorStateList f20036e0;
    @C0198k

    /* renamed from: e1 */
    private int f20037e1;

    /* renamed from: f0 */
    private int f20038f0;
    @C0198k

    /* renamed from: f1 */
    private int f20039f1;
    @C0195i0

    /* renamed from: g0 */
    private ColorStateList f20040g0;

    /* renamed from: g1 */
    private ColorStateList f20041g1;
    @C0195i0

    /* renamed from: h0 */
    private ColorStateList f20042h0;
    @C0198k

    /* renamed from: h1 */
    private int f20043h1;
    @C0195i0

    /* renamed from: i0 */
    private CharSequence f20044i0;
    @C0198k

    /* renamed from: i1 */
    private final int f20045i1;
    @C0193h0

    /* renamed from: j0 */
    private final TextView f20046j0;
    @C0198k

    /* renamed from: j1 */
    private final int f20047j1;
    @C0195i0

    /* renamed from: k0 */
    private CharSequence f20048k0;
    @C0198k

    /* renamed from: k1 */
    private final int f20049k1;
    @C0193h0

    /* renamed from: l0 */
    private final TextView f20050l0;
    @C0198k

    /* renamed from: l1 */
    private int f20051l1;

    /* renamed from: m0 */
    private boolean f20052m0;

    /* renamed from: m1 */
    private boolean f20053m1;

    /* renamed from: n0 */
    private CharSequence f20054n0;

    /* renamed from: n1 */
    final C6893a f20055n1;

    /* renamed from: o0 */
    private boolean f20056o0;

    /* renamed from: o1 */
    private boolean f20057o1;
    @C0195i0

    /* renamed from: p0 */
    private C6978j f20058p0;

    /* renamed from: p1 */
    private ValueAnimator f20059p1;
    @C0195i0

    /* renamed from: q0 */
    private C6978j f20060q0;

    /* renamed from: q1 */
    private boolean f20061q1;
    @C0193h0

    /* renamed from: r0 */
    private C6986o f20062r0;
    /* access modifiers changed from: private */

    /* renamed from: r1 */
    public boolean f20063r1;

    /* renamed from: s0 */
    private final int f20064s0;

    /* renamed from: t0 */
    private int f20065t0;

    /* renamed from: u0 */
    private final int f20066u0;

    /* renamed from: v0 */
    private int f20067v0;

    /* renamed from: w0 */
    private final int f20068w0;

    /* renamed from: x0 */
    private final int f20069x0;
    @C0198k

    /* renamed from: y0 */
    private int f20070y0;
    @C0198k

    /* renamed from: z0 */
    private int f20071z0;

    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: com.google.android.material.textfield.TextInputLayout$f */
    public @interface C5726f {
    }

    @C0207n0({C0208a.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: com.google.android.material.textfield.TextInputLayout$g */
    public @interface C5727g {
    }

    static class SavedState extends AbsSavedState {
        public static final Creator<SavedState> CREATOR = new C7068a();
        @C0195i0

        /* renamed from: a */
        CharSequence f20072a;

        /* renamed from: b */
        boolean f20073b;

        /* renamed from: com.google.android.material.textfield.TextInputLayout$SavedState$a */
        static class C7068a implements ClassLoaderCreator<SavedState> {
            C7068a() {
            }

            @C0193h0
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }

            @C0193h0
            public SavedState createFromParcel(@C0193h0 Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @C0195i0
            public SavedState createFromParcel(@C0193h0 Parcel parcel) {
                return new SavedState(parcel, null);
            }
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        @C0193h0
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("TextInputLayout.SavedState{");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" error=");
            sb.append(this.f20072a);
            sb.append("}");
            return sb.toString();
        }

        public void writeToParcel(@C0193h0 Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            TextUtils.writeToParcel(this.f20072a, parcel, i);
            parcel.writeInt(this.f20073b ? 1 : 0);
        }

        SavedState(@C0193h0 Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f20072a = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            boolean z = true;
            if (parcel.readInt() != 1) {
                z = false;
            }
            this.f20073b = z;
        }
    }

    /* renamed from: com.google.android.material.textfield.TextInputLayout$a */
    class C7069a implements TextWatcher {
        C7069a() {
        }

        public void afterTextChanged(@C0193h0 Editable editable) {
            TextInputLayout textInputLayout = TextInputLayout.this;
            textInputLayout.mo28248b(!textInputLayout.f20063r1);
            TextInputLayout textInputLayout2 = TextInputLayout.this;
            if (textInputLayout2.f20013S) {
                textInputLayout2.mo28238a(editable.length());
            }
            if (TextInputLayout.this.f20032c0) {
                TextInputLayout.this.m34081c(editable.length());
            }
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: com.google.android.material.textfield.TextInputLayout$b */
    class C7070b implements Runnable {
        C7070b() {
        }

        public void run() {
            TextInputLayout.this.f20008P0.performClick();
            TextInputLayout.this.f20008P0.jumpDrawablesToCurrentState();
        }
    }

    /* renamed from: com.google.android.material.textfield.TextInputLayout$c */
    class C7071c implements Runnable {
        C7071c() {
        }

        public void run() {
            TextInputLayout.this.f20007P.requestLayout();
        }
    }

    /* renamed from: com.google.android.material.textfield.TextInputLayout$d */
    class C7072d implements AnimatorUpdateListener {
        C7072d() {
        }

        public void onAnimationUpdate(@C0193h0 ValueAnimator valueAnimator) {
            TextInputLayout.this.f20055n1.mo27554c(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    /* renamed from: com.google.android.material.textfield.TextInputLayout$e */
    public static class C7073e extends C0947a {

        /* renamed from: d */
        private final TextInputLayout f20078d;

        public C7073e(TextInputLayout textInputLayout) {
            this.f20078d = textInputLayout;
        }

        /* renamed from: a */
        public void mo4749a(@C0193h0 View view, @C0193h0 C1016d dVar) {
            super.mo4749a(view, dVar);
            EditText editText = this.f20078d.getEditText();
            Editable text = editText != null ? editText.getText() : null;
            CharSequence hint = this.f20078d.getHint();
            CharSequence helperText = this.f20078d.getHelperText();
            CharSequence error = this.f20078d.getError();
            int counterMaxLength = this.f20078d.getCounterMaxLength();
            CharSequence counterOverflowDescription = this.f20078d.getCounterOverflowDescription();
            boolean z = !TextUtils.isEmpty(text);
            boolean z2 = !TextUtils.isEmpty(hint);
            boolean z3 = !TextUtils.isEmpty(helperText);
            boolean z4 = !TextUtils.isEmpty(error);
            boolean z5 = z4 || !TextUtils.isEmpty(counterOverflowDescription);
            String str = "";
            String charSequence = z2 ? hint.toString() : str;
            StringBuilder sb = new StringBuilder();
            sb.append(charSequence);
            String str2 = ", ";
            sb.append(((z4 || z3) && !TextUtils.isEmpty(charSequence)) ? str2 : str);
            String sb2 = sb.toString();
            StringBuilder sb3 = new StringBuilder();
            sb3.append(sb2);
            if (z4) {
                helperText = error;
            } else if (!z3) {
                helperText = str;
            }
            sb3.append(helperText);
            String sb4 = sb3.toString();
            if (z) {
                dVar.mo4997h((CharSequence) text);
            } else if (!TextUtils.isEmpty(sb4)) {
                dVar.mo4997h((CharSequence) sb4);
            }
            if (!TextUtils.isEmpty(sb4)) {
                if (VERSION.SDK_INT >= 26) {
                    dVar.mo4969d((CharSequence) sb4);
                } else {
                    if (z) {
                        StringBuilder sb5 = new StringBuilder();
                        sb5.append(text);
                        sb5.append(str2);
                        sb5.append(sb4);
                        sb4 = sb5.toString();
                    }
                    dVar.mo4997h((CharSequence) sb4);
                }
                dVar.mo5029u(!z);
            }
            if (text == null || text.length() != counterMaxLength) {
                counterMaxLength = -1;
            }
            dVar.mo5001i(counterMaxLength);
            if (z5) {
                if (!z4) {
                    error = counterOverflowDescription;
                }
                dVar.mo4960c(error);
            }
        }
    }

    /* renamed from: com.google.android.material.textfield.TextInputLayout$h */
    public interface C7074h {
        /* renamed from: a */
        void mo28400a(TextInputLayout textInputLayout);
    }

    /* renamed from: com.google.android.material.textfield.TextInputLayout$i */
    public interface C7075i {
        /* renamed from: a */
        void mo28401a(TextInputLayout textInputLayout, int i);
    }

    public TextInputLayout(@C0193h0 Context context) {
        this(context, null);
    }

    /* renamed from: A */
    private boolean m34030A() {
        return this.f20065t0 == 2 && m34031B();
    }

    /* renamed from: B */
    private boolean m34031B() {
        return this.f20067v0 > -1 && this.f20070y0 != 0;
    }

    /* renamed from: C */
    private void m34032C() {
        if (m34033D()) {
            ((C7086c) this.f20058p0).mo22864F();
        }
    }

    /* renamed from: D */
    private boolean m34033D() {
        return this.f20052m0 && !TextUtils.isEmpty(this.f20054n0) && (this.f20058p0 instanceof C7086c);
    }

    /* renamed from: E */
    private void m34034E() {
        Iterator it = this.f20002M0.iterator();
        while (it.hasNext()) {
            ((C7074h) it.next()).mo28400a(this);
        }
    }

    /* renamed from: F */
    private boolean m34035F() {
        return this.f20004N0 != 0;
    }

    /* renamed from: G */
    private void m34036G() {
        TextView textView = this.f20034d0;
        if (textView != null && this.f20032c0) {
            textView.setText(null);
            this.f20034d0.setVisibility(4);
        }
    }

    /* renamed from: H */
    private boolean m34037H() {
        return this.f20025Z0.getVisibility() == 0;
    }

    /* renamed from: I */
    private boolean m34038I() {
        if (this.f20065t0 != 1 || (VERSION.SDK_INT >= 16 && this.f20007P.getMinLines() > 1)) {
            return false;
        }
        return true;
    }

    /* renamed from: J */
    private void m34039J() {
        m34091x();
        m34042M();
        mo28317r();
        if (this.f20065t0 != 0) {
            m34051V();
        }
    }

    /* renamed from: K */
    private void m34040K() {
        if (m34033D()) {
            RectF rectF = this.f19992C0;
            this.f20055n1.mo27541a(rectF, this.f20007P.getWidth(), this.f20007P.getGravity());
            m34062a(rectF);
            rectF.offset((float) (-getPaddingLeft()), 0.0f);
            ((C7086c) this.f20058p0).mo28414a(rectF);
        }
    }

    /* renamed from: L */
    private void m34041L() {
        TextView textView = this.f20034d0;
        if (textView != null) {
            textView.setVisibility(8);
        }
    }

    /* renamed from: M */
    private void m34042M() {
        if (m34045P()) {
            C0962e0.m5440a((View) this.f20007P, (Drawable) this.f20058p0);
        }
    }

    /* renamed from: N */
    private boolean m34043N() {
        return (this.f20025Z0.getVisibility() == 0 || ((m34035F() && mo28256f()) || this.f20048k0 != null)) && this.f20003N.getMeasuredWidth() > 0;
    }

    /* renamed from: O */
    private boolean m34044O() {
        return !(getStartIconDrawable() == null && this.f20044i0 == null) && this.f20029b.getMeasuredWidth() > 0;
    }

    /* renamed from: P */
    private boolean m34045P() {
        EditText editText = this.f20007P;
        return (editText == null || this.f20058p0 == null || editText.getBackground() != null || this.f20065t0 == 0) ? false : true;
    }

    /* renamed from: Q */
    private void m34046Q() {
        TextView textView = this.f20034d0;
        if (textView != null && this.f20032c0) {
            textView.setText(this.f20030b0);
            this.f20034d0.setVisibility(0);
            this.f20034d0.bringToFront();
        }
    }

    /* renamed from: R */
    private void m34047R() {
        if (this.f20019V != null) {
            EditText editText = this.f20007P;
            mo28238a(editText == null ? 0 : editText.getText().length());
        }
    }

    /* renamed from: S */
    private void m34048S() {
        TextView textView = this.f20019V;
        if (textView != null) {
            mo28240a(textView, this.f20017U ? this.f20021W : this.f20027a0);
            if (!this.f20017U) {
                ColorStateList colorStateList = this.f20040g0;
                if (colorStateList != null) {
                    this.f20019V.setTextColor(colorStateList);
                }
            }
            if (this.f20017U) {
                ColorStateList colorStateList2 = this.f20042h0;
                if (colorStateList2 != null) {
                    this.f20019V.setTextColor(colorStateList2);
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00de  */
    /* renamed from: T */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m34049T() {
        /*
            r10 = this;
            android.widget.EditText r0 = r10.f20007P
            r1 = 0
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            boolean r0 = r10.m34044O()
            r2 = 0
            r3 = 3
            r4 = 2
            r5 = 1
            if (r0 == 0) goto L_0x004d
            android.widget.LinearLayout r0 = r10.f20029b
            int r0 = r0.getMeasuredWidth()
            android.widget.EditText r6 = r10.f20007P
            int r6 = r6.getPaddingLeft()
            int r0 = r0 - r6
            android.graphics.drawable.Drawable r6 = r10.f19999J0
            if (r6 == 0) goto L_0x0025
            int r6 = r10.f20000K0
            if (r6 == r0) goto L_0x0035
        L_0x0025:
            android.graphics.drawable.ColorDrawable r6 = new android.graphics.drawable.ColorDrawable
            r6.<init>()
            r10.f19999J0 = r6
            r10.f20000K0 = r0
            android.graphics.drawable.Drawable r0 = r10.f19999J0
            int r6 = r10.f20000K0
            r0.setBounds(r1, r1, r6, r5)
        L_0x0035:
            android.widget.EditText r0 = r10.f20007P
            android.graphics.drawable.Drawable[] r0 = androidx.core.widget.C1120m.m6394h(r0)
            r6 = r0[r1]
            android.graphics.drawable.Drawable r7 = r10.f19999J0
            if (r6 == r7) goto L_0x0066
            android.widget.EditText r6 = r10.f20007P
            r8 = r0[r5]
            r9 = r0[r4]
            r0 = r0[r3]
            androidx.core.widget.C1120m.m6376a(r6, r7, r8, r9, r0)
            goto L_0x0064
        L_0x004d:
            android.graphics.drawable.Drawable r0 = r10.f19999J0
            if (r0 == 0) goto L_0x0066
            android.widget.EditText r0 = r10.f20007P
            android.graphics.drawable.Drawable[] r0 = androidx.core.widget.C1120m.m6394h(r0)
            android.widget.EditText r6 = r10.f20007P
            r7 = r0[r5]
            r8 = r0[r4]
            r0 = r0[r3]
            androidx.core.widget.C1120m.m6376a(r6, r2, r7, r8, r0)
            r10.f19999J0 = r2
        L_0x0064:
            r0 = 1
            goto L_0x0067
        L_0x0066:
            r0 = 0
        L_0x0067:
            boolean r6 = r10.m34043N()
            if (r6 == 0) goto L_0x00de
            android.widget.TextView r2 = r10.f20050l0
            int r2 = r2.getMeasuredWidth()
            android.widget.EditText r6 = r10.f20007P
            int r6 = r6.getPaddingRight()
            int r2 = r2 - r6
            com.google.android.material.internal.CheckableImageButton r6 = r10.getEndIconToUpdateDummyDrawable()
            if (r6 == 0) goto L_0x0090
            int r7 = r6.getMeasuredWidth()
            int r2 = r2 + r7
            android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r6 = (android.view.ViewGroup.MarginLayoutParams) r6
            int r6 = androidx.core.p034l.C0999l.m5724c(r6)
            int r2 = r2 + r6
        L_0x0090:
            android.widget.EditText r6 = r10.f20007P
            android.graphics.drawable.Drawable[] r6 = androidx.core.widget.C1120m.m6394h(r6)
            android.graphics.drawable.Drawable r7 = r10.f20020V0
            if (r7 == 0) goto L_0x00b4
            int r8 = r10.f20022W0
            if (r8 == r2) goto L_0x00b4
            r10.f20022W0 = r2
            int r0 = r10.f20022W0
            r7.setBounds(r1, r1, r0, r5)
            android.widget.EditText r0 = r10.f20007P
            r1 = r6[r1]
            r2 = r6[r5]
            android.graphics.drawable.Drawable r4 = r10.f20020V0
            r3 = r6[r3]
            androidx.core.widget.C1120m.m6376a(r0, r1, r2, r4, r3)
        L_0x00b2:
            r0 = 1
            goto L_0x00fe
        L_0x00b4:
            android.graphics.drawable.Drawable r7 = r10.f20020V0
            if (r7 != 0) goto L_0x00c8
            android.graphics.drawable.ColorDrawable r7 = new android.graphics.drawable.ColorDrawable
            r7.<init>()
            r10.f20020V0 = r7
            r10.f20022W0 = r2
            android.graphics.drawable.Drawable r2 = r10.f20020V0
            int r7 = r10.f20022W0
            r2.setBounds(r1, r1, r7, r5)
        L_0x00c8:
            r2 = r6[r4]
            android.graphics.drawable.Drawable r7 = r10.f20020V0
            if (r2 == r7) goto L_0x00fe
            r0 = r6[r4]
            r10.f20023X0 = r0
            android.widget.EditText r0 = r10.f20007P
            r1 = r6[r1]
            r2 = r6[r5]
            r3 = r6[r3]
            androidx.core.widget.C1120m.m6376a(r0, r1, r2, r7, r3)
            goto L_0x00b2
        L_0x00de:
            android.graphics.drawable.Drawable r6 = r10.f20020V0
            if (r6 == 0) goto L_0x00fe
            android.widget.EditText r6 = r10.f20007P
            android.graphics.drawable.Drawable[] r6 = androidx.core.widget.C1120m.m6394h(r6)
            r4 = r6[r4]
            android.graphics.drawable.Drawable r7 = r10.f20020V0
            if (r4 != r7) goto L_0x00fc
            android.widget.EditText r0 = r10.f20007P
            r1 = r6[r1]
            r4 = r6[r5]
            android.graphics.drawable.Drawable r7 = r10.f20023X0
            r3 = r6[r3]
            androidx.core.widget.C1120m.m6376a(r0, r1, r4, r7, r3)
            r0 = 1
        L_0x00fc:
            r10.f20020V0 = r2
        L_0x00fe:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.m34049T():boolean");
    }

    /* renamed from: U */
    private boolean m34050U() {
        if (this.f20007P == null) {
            return false;
        }
        int max = Math.max(this.f20003N.getMeasuredHeight(), this.f20029b.getMeasuredHeight());
        if (this.f20007P.getMeasuredHeight() >= max) {
            return false;
        }
        this.f20007P.setMinimumHeight(max);
        return true;
    }

    /* renamed from: V */
    private void m34051V() {
        if (this.f20065t0 != 1) {
            LayoutParams layoutParams = (LayoutParams) this.f20026a.getLayoutParams();
            int z = m34093z();
            if (z != layoutParams.topMargin) {
                layoutParams.topMargin = z;
                this.f20026a.requestLayout();
            }
        }
    }

    /* renamed from: W */
    private void m34052W() {
        if (this.f20034d0 != null) {
            EditText editText = this.f20007P;
            if (editText != null) {
                this.f20034d0.setGravity((editText.getGravity() & C14130h.f41560o) | 48);
                this.f20034d0.setPadding(this.f20007P.getCompoundPaddingLeft(), this.f20007P.getCompoundPaddingTop(), this.f20007P.getCompoundPaddingRight(), this.f20007P.getCompoundPaddingBottom());
            }
        }
    }

    /* renamed from: X */
    private void m34053X() {
        EditText editText = this.f20007P;
        m34081c(editText == null ? 0 : editText.getText().length());
    }

    /* renamed from: Y */
    private void m34054Y() {
        if (this.f20007P != null) {
            this.f20046j0.setPadding(mo28315p() ? 0 : this.f20007P.getPaddingLeft(), this.f20007P.getCompoundPaddingTop(), this.f20046j0.getCompoundPaddingRight(), this.f20007P.getCompoundPaddingBottom());
        }
    }

    /* renamed from: Z */
    private void m34055Z() {
        this.f20046j0.setVisibility((this.f20044i0 == null || mo28307l()) ? 8 : 0);
        m34049T();
    }

    /* renamed from: a0 */
    private void m34071a0() {
        if (this.f20007P != null) {
            TextView textView = this.f20050l0;
            textView.setPadding(textView.getPaddingLeft(), this.f20007P.getPaddingTop(), (mo28256f() || m34037H()) ? 0 : this.f20007P.getPaddingRight(), this.f20007P.getPaddingBottom());
        }
    }

    /* renamed from: b0 */
    private void m34079b0() {
        int visibility = this.f20050l0.getVisibility();
        int i = 0;
        boolean z = this.f20048k0 != null && !mo28307l();
        TextView textView = this.f20050l0;
        if (!z) {
            i = 8;
        }
        textView.setVisibility(i);
        if (visibility != this.f20050l0.getVisibility()) {
            getEndIconDelegate().mo28403a(z);
        }
        m34049T();
    }

    private C7098e getEndIconDelegate() {
        C7098e eVar = (C7098e) this.f20006O0.get(this.f20004N0);
        return eVar != null ? eVar : (C7098e) this.f20006O0.get(0);
    }

    @C0195i0
    private CheckableImageButton getEndIconToUpdateDummyDrawable() {
        if (this.f20025Z0.getVisibility() == 0) {
            return this.f20025Z0;
        }
        if (!m34035F() || !mo28256f()) {
            return null;
        }
        return this.f20008P0;
    }

    /* renamed from: s */
    private void m34086s() {
        TextView textView = this.f20034d0;
        if (textView != null) {
            this.f20026a.addView(textView);
            this.f20034d0.setVisibility(0);
        }
    }

    private void setEditText(EditText editText) {
        if (this.f20007P == null) {
            if (this.f20004N0 != 3) {
                boolean z = editText instanceof TextInputEditText;
            }
            this.f20007P = editText;
            m34039J();
            setTextInputAccessibilityDelegate(new C7073e(this));
            this.f20055n1.mo27556c(this.f20007P.getTypeface());
            this.f20055n1.mo27546b(this.f20007P.getTextSize());
            int gravity = this.f20007P.getGravity();
            this.f20055n1.mo27547b((gravity & C14130h.f41560o) | 48);
            this.f20055n1.mo27558d(gravity);
            this.f20007P.addTextChangedListener(new C7069a());
            if (this.f20031b1 == null) {
                this.f20031b1 = this.f20007P.getHintTextColors();
            }
            if (this.f20052m0) {
                if (TextUtils.isEmpty(this.f20054n0)) {
                    this.f20009Q = this.f20007P.getHint();
                    setHint(this.f20009Q);
                    this.f20007P.setHint(null);
                }
                this.f20056o0 = true;
            }
            if (this.f20019V != null) {
                mo28238a(this.f20007P.getText().length());
            }
            mo28316q();
            this.f20011R.mo28427a();
            this.f20029b.bringToFront();
            this.f20003N.bringToFront();
            this.f20005O.bringToFront();
            this.f20025Z0.bringToFront();
            m34034E();
            m34054Y();
            m34071a0();
            if (!isEnabled()) {
                editText.setEnabled(false);
            }
            m34069a(false, true);
            return;
        }
        throw new IllegalArgumentException("We already have an EditText, can only have one");
    }

    private void setErrorIconVisible(boolean z) {
        int i = 0;
        this.f20025Z0.setVisibility(z ? 0 : 8);
        FrameLayout frameLayout = this.f20005O;
        if (z) {
            i = 8;
        }
        frameLayout.setVisibility(i);
        m34071a0();
        if (!m34035F()) {
            m34049T();
        }
    }

    private void setHintInternal(CharSequence charSequence) {
        if (!TextUtils.equals(charSequence, this.f20054n0)) {
            this.f20054n0 = charSequence;
            this.f20055n1.mo27543a(charSequence);
            if (!this.f20053m1) {
                m34040K();
            }
        }
    }

    private void setPlaceholderTextEnabled(boolean z) {
        if (this.f20032c0 != z) {
            if (z) {
                this.f20034d0 = new AppCompatTextView(getContext());
                this.f20034d0.setId(C5582R.C5586id.textinput_placeholder);
                C0962e0.m5527k((View) this.f20034d0, 1);
                setPlaceholderTextAppearance(this.f20038f0);
                setPlaceholderTextColor(this.f20036e0);
                m34086s();
            } else {
                m34041L();
                this.f20034d0 = null;
            }
            this.f20032c0 = z;
        }
    }

    /* renamed from: t */
    private void m34087t() {
        C6978j jVar = this.f20058p0;
        if (jVar != null) {
            jVar.setShapeAppearanceModel(this.f20062r0);
            if (m34030A()) {
                this.f20058p0.mo27784a((float) this.f20067v0, this.f20070y0);
            }
            this.f20071z0 = m34092y();
            this.f20058p0.mo27790a(ColorStateList.valueOf(this.f20071z0));
            if (this.f20004N0 == 3) {
                this.f20007P.getBackground().invalidateSelf();
            }
            m34088u();
            invalidate();
        }
    }

    /* renamed from: u */
    private void m34088u() {
        if (this.f20060q0 != null) {
            if (m34031B()) {
                this.f20060q0.mo27790a(ColorStateList.valueOf(this.f20070y0));
            }
            invalidate();
        }
    }

    /* renamed from: v */
    private void m34089v() {
        m34067a(this.f20008P0, this.f20014S0, this.f20012R0, this.f20018U0, this.f20016T0);
    }

    /* renamed from: w */
    private void m34090w() {
        m34067a(this.f19994E0, this.f19996G0, this.f19995F0, this.f19998I0, this.f19997H0);
    }

    /* renamed from: x */
    private void m34091x() {
        int i = this.f20065t0;
        if (i == 0) {
            this.f20058p0 = null;
            this.f20060q0 = null;
        } else if (i == 1) {
            this.f20058p0 = new C6978j(this.f20062r0);
            this.f20060q0 = new C6978j();
        } else if (i == 2) {
            if (!this.f20052m0 || (this.f20058p0 instanceof C7086c)) {
                this.f20058p0 = new C6978j(this.f20062r0);
            } else {
                this.f20058p0 = new C7086c(this.f20062r0);
            }
            this.f20060q0 = null;
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f20065t0);
            sb.append(" is illegal; only @BoxBackgroundMode constants are supported.");
            throw new IllegalArgumentException(sb.toString());
        }
    }

    /* renamed from: y */
    private int m34092y() {
        return this.f20065t0 == 1 ? C5713a.m25186a(C5713a.m25191a((View) this, C5582R.attr.colorSurface, 0), this.f20071z0) : this.f20071z0;
    }

    /* renamed from: z */
    private int m34093z() {
        float d;
        if (!this.f20052m0) {
            return 0;
        }
        int i = this.f20065t0;
        if (i == 0 || i == 1) {
            d = this.f20055n1.mo27557d();
        } else if (i != 2) {
            return 0;
        } else {
            d = this.f20055n1.mo27557d() / 2.0f;
        }
        return (int) d;
    }

    public void addView(@C0193h0 View view, int i, @C0193h0 ViewGroup.LayoutParams layoutParams) {
        if (view instanceof EditText) {
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
            layoutParams2.gravity = (layoutParams2.gravity & C14130h.f41560o) | 16;
            this.f20026a.addView(view, layoutParams2);
            this.f20026a.setLayoutParams(layoutParams);
            m34051V();
            setEditText((EditText) view);
            return;
        }
        super.addView(view, i, layoutParams);
    }

    /* renamed from: d */
    public boolean mo28250d() {
        return this.f20013S;
    }

    public void dispatchProvideAutofillStructure(ViewStructure viewStructure, int i) {
        if (this.f20009Q != null) {
            EditText editText = this.f20007P;
            if (editText != null) {
                boolean z = this.f20056o0;
                this.f20056o0 = false;
                CharSequence hint = editText.getHint();
                this.f20007P.setHint(this.f20009Q);
                try {
                    super.dispatchProvideAutofillStructure(viewStructure, i);
                    return;
                } finally {
                    this.f20007P.setHint(hint);
                    this.f20056o0 = z;
                }
            }
        }
        super.dispatchProvideAutofillStructure(viewStructure, i);
    }

    /* access modifiers changed from: protected */
    public void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        this.f20063r1 = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.f20063r1 = false;
    }

    public void draw(@C0193h0 Canvas canvas) {
        super.draw(canvas);
        m34075b(canvas);
        m34061a(canvas);
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        if (!this.f20061q1) {
            boolean z = true;
            this.f20061q1 = true;
            super.drawableStateChanged();
            int[] drawableState = getDrawableState();
            C6893a aVar = this.f20055n1;
            boolean a = aVar != null ? aVar.mo27544a(drawableState) | false : false;
            if (this.f20007P != null) {
                if (!C0962e0.m5540n0(this) || !isEnabled()) {
                    z = false;
                }
                mo28248b(z);
            }
            mo28316q();
            mo28317r();
            if (a) {
                invalidate();
            }
            this.f20061q1 = false;
        }
    }

    /* renamed from: e */
    public boolean mo28255e() {
        return this.f20008P0.mo27496a();
    }

    /* renamed from: f */
    public boolean mo28256f() {
        return this.f20005O.getVisibility() == 0 && this.f20008P0.getVisibility() == 0;
    }

    /* renamed from: g */
    public boolean mo28257g() {
        return this.f20011R.mo28455p();
    }

    public int getBaseline() {
        EditText editText = this.f20007P;
        if (editText != null) {
            return editText.getBaseline() + getPaddingTop() + m34093z();
        }
        return super.getBaseline();
    }

    /* access modifiers changed from: 0000 */
    @C0193h0
    public C6978j getBoxBackground() {
        int i = this.f20065t0;
        if (i == 1 || i == 2) {
            return this.f20058p0;
        }
        throw new IllegalStateException();
    }

    public int getBoxBackgroundColor() {
        return this.f20071z0;
    }

    public int getBoxBackgroundMode() {
        return this.f20065t0;
    }

    public float getBoxCornerRadiusBottomEnd() {
        return this.f20058p0.mo27798b();
    }

    public float getBoxCornerRadiusBottomStart() {
        return this.f20058p0.mo27803c();
    }

    public float getBoxCornerRadiusTopEnd() {
        return this.f20058p0.mo27844x();
    }

    public float getBoxCornerRadiusTopStart() {
        return this.f20058p0.mo27843w();
    }

    public int getBoxStrokeColor() {
        return this.f20039f1;
    }

    @C0195i0
    public ColorStateList getBoxStrokeErrorColor() {
        return this.f20041g1;
    }

    public int getCounterMaxLength() {
        return this.f20015T;
    }

    /* access modifiers changed from: 0000 */
    @C0195i0
    public CharSequence getCounterOverflowDescription() {
        if (this.f20013S && this.f20017U) {
            TextView textView = this.f20019V;
            if (textView != null) {
                return textView.getContentDescription();
            }
        }
        return null;
    }

    @C0195i0
    public ColorStateList getCounterOverflowTextColor() {
        return this.f20040g0;
    }

    @C0195i0
    public ColorStateList getCounterTextColor() {
        return this.f20040g0;
    }

    @C0195i0
    public ColorStateList getDefaultHintTextColor() {
        return this.f20031b1;
    }

    @C0195i0
    public EditText getEditText() {
        return this.f20007P;
    }

    @C0195i0
    public CharSequence getEndIconContentDescription() {
        return this.f20008P0.getContentDescription();
    }

    @C0195i0
    public Drawable getEndIconDrawable() {
        return this.f20008P0.getDrawable();
    }

    public int getEndIconMode() {
        return this.f20004N0;
    }

    /* access modifiers changed from: 0000 */
    @C0193h0
    public CheckableImageButton getEndIconView() {
        return this.f20008P0;
    }

    @C0195i0
    public CharSequence getError() {
        if (this.f20011R.mo28455p()) {
            return this.f20011R.mo28445f();
        }
        return null;
    }

    @C0195i0
    public CharSequence getErrorContentDescription() {
        return this.f20011R.mo28444e();
    }

    @C0198k
    public int getErrorCurrentTextColors() {
        return this.f20011R.mo28446g();
    }

    @C0195i0
    public Drawable getErrorIconDrawable() {
        return this.f20025Z0.getDrawable();
    }

    /* access modifiers changed from: 0000 */
    @C0224v0
    public final int getErrorTextCurrentColor() {
        return this.f20011R.mo28446g();
    }

    @C0195i0
    public CharSequence getHelperText() {
        if (this.f20011R.mo28456q()) {
            return this.f20011R.mo28448i();
        }
        return null;
    }

    @C0198k
    public int getHelperTextCurrentTextColor() {
        return this.f20011R.mo28450k();
    }

    @C0195i0
    public CharSequence getHint() {
        if (this.f20052m0) {
            return this.f20054n0;
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    @C0224v0
    public final float getHintCollapsedTextHeight() {
        return this.f20055n1.mo27557d();
    }

    /* access modifiers changed from: 0000 */
    @C0224v0
    public final int getHintCurrentCollapsedTextColor() {
        return this.f20055n1.mo27561g();
    }

    @C0195i0
    public ColorStateList getHintTextColor() {
        return this.f20033c1;
    }

    @Deprecated
    @C0195i0
    public CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.f20008P0.getContentDescription();
    }

    @Deprecated
    @C0195i0
    public Drawable getPasswordVisibilityToggleDrawable() {
        return this.f20008P0.getDrawable();
    }

    @C0195i0
    public CharSequence getPlaceholderText() {
        if (this.f20032c0) {
            return this.f20030b0;
        }
        return null;
    }

    @C0216r0
    public int getPlaceholderTextAppearance() {
        return this.f20038f0;
    }

    @C0195i0
    public ColorStateList getPlaceholderTextColor() {
        return this.f20036e0;
    }

    @C0195i0
    public CharSequence getPrefixText() {
        return this.f20044i0;
    }

    @C0195i0
    public ColorStateList getPrefixTextColor() {
        return this.f20046j0.getTextColors();
    }

    @C0193h0
    public TextView getPrefixTextView() {
        return this.f20046j0;
    }

    @C0195i0
    public CharSequence getStartIconContentDescription() {
        return this.f19994E0.getContentDescription();
    }

    @C0195i0
    public Drawable getStartIconDrawable() {
        return this.f19994E0.getDrawable();
    }

    @C0195i0
    public CharSequence getSuffixText() {
        return this.f20048k0;
    }

    @C0195i0
    public ColorStateList getSuffixTextColor() {
        return this.f20050l0.getTextColors();
    }

    @C0193h0
    public TextView getSuffixTextView() {
        return this.f20050l0;
    }

    @C0195i0
    public Typeface getTypeface() {
        return this.f19993D0;
    }

    /* access modifiers changed from: 0000 */
    @C0224v0
    /* renamed from: h */
    public final boolean mo28303h() {
        return this.f20011R.mo28451l();
    }

    /* renamed from: i */
    public boolean mo28304i() {
        return this.f20011R.mo28456q();
    }

    /* renamed from: j */
    public boolean mo28305j() {
        return this.f20057o1;
    }

    /* renamed from: k */
    public boolean mo28306k() {
        return this.f20052m0;
    }

    /* access modifiers changed from: 0000 */
    @C0224v0
    /* renamed from: l */
    public final boolean mo28307l() {
        return this.f20053m1;
    }

    @Deprecated
    /* renamed from: m */
    public boolean mo28308m() {
        return this.f20004N0 == 1;
    }

    @C0207n0({C0208a.LIBRARY_GROUP})
    /* renamed from: n */
    public boolean mo28309n() {
        return this.f20056o0;
    }

    /* renamed from: o */
    public boolean mo28310o() {
        return this.f19994E0.mo27496a();
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        EditText editText = this.f20007P;
        if (editText != null) {
            Rect rect = this.f19990A0;
            C6897c.m33153a((ViewGroup) this, (View) editText, rect);
            m34082c(rect);
            if (this.f20052m0) {
                int gravity = this.f20007P.getGravity() & C14130h.f41560o;
                this.f20055n1.mo27547b(gravity | 48);
                this.f20055n1.mo27558d(gravity);
                this.f20055n1.mo27540a(m34059a(rect));
                this.f20055n1.mo27551b(m34073b(rect));
                this.f20055n1.mo27571q();
                if (m34033D() && !this.f20053m1) {
                    m34040K();
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        boolean U = m34050U();
        boolean T = m34049T();
        if (U || T) {
            this.f20007P.post(new C7071c());
        }
        m34052W();
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        setError(savedState.f20072a);
        if (savedState.f20073b) {
            this.f20008P0.post(new C7070b());
        }
        requestLayout();
    }

    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        if (this.f20011R.mo28443d()) {
            savedState.f20072a = getError();
        }
        savedState.f20073b = m34035F() && this.f20008P0.isChecked();
        return savedState;
    }

    /* renamed from: p */
    public boolean mo28315p() {
        return this.f19994E0.getVisibility() == 0;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: q */
    public void mo28316q() {
        EditText editText = this.f20007P;
        if (editText != null && this.f20065t0 == 0) {
            Drawable background = editText.getBackground();
            if (background != null) {
                if (C0469a0.m2595a(background)) {
                    background = background.mutate();
                }
                if (this.f20011R.mo28443d()) {
                    background.setColorFilter(C0510i.m2768a(this.f20011R.mo28446g(), Mode.SRC_IN));
                } else {
                    if (this.f20017U) {
                        TextView textView = this.f20019V;
                        if (textView != null) {
                            background.setColorFilter(C0510i.m2768a(textView.getCurrentTextColor(), Mode.SRC_IN));
                        }
                    }
                    C0892a.m5153b(background);
                    this.f20007P.refreshDrawableState();
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0026  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00ba  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00c5  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00d8  */
    /* renamed from: r */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo28317r() {
        /*
            r6 = this;
            com.google.android.material.p.j r0 = r6.f20058p0
            if (r0 == 0) goto L_0x00fa
            int r0 = r6.f20065t0
            if (r0 != 0) goto L_0x000a
            goto L_0x00fa
        L_0x000a:
            boolean r0 = r6.isFocused()
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L_0x001f
            android.widget.EditText r0 = r6.f20007P
            if (r0 == 0) goto L_0x001d
            boolean r0 = r0.hasFocus()
            if (r0 == 0) goto L_0x001d
            goto L_0x001f
        L_0x001d:
            r0 = 0
            goto L_0x0020
        L_0x001f:
            r0 = 1
        L_0x0020:
            boolean r3 = r6.isHovered()
            if (r3 != 0) goto L_0x0033
            android.widget.EditText r3 = r6.f20007P
            if (r3 == 0) goto L_0x0031
            boolean r3 = r3.isHovered()
            if (r3 == 0) goto L_0x0031
            goto L_0x0033
        L_0x0031:
            r3 = 0
            goto L_0x0034
        L_0x0033:
            r3 = 1
        L_0x0034:
            boolean r4 = r6.isEnabled()
            if (r4 != 0) goto L_0x003f
            int r4 = r6.f20051l1
            r6.f20070y0 = r4
            goto L_0x0081
        L_0x003f:
            com.google.android.material.textfield.f r4 = r6.f20011R
            boolean r4 = r4.mo28443d()
            if (r4 == 0) goto L_0x0058
            android.content.res.ColorStateList r4 = r6.f20041g1
            if (r4 == 0) goto L_0x004f
            r6.m34077b(r0, r3)
            goto L_0x0081
        L_0x004f:
            com.google.android.material.textfield.f r4 = r6.f20011R
            int r4 = r4.mo28446g()
            r6.f20070y0 = r4
            goto L_0x0081
        L_0x0058:
            boolean r4 = r6.f20017U
            if (r4 == 0) goto L_0x006f
            android.widget.TextView r4 = r6.f20019V
            if (r4 == 0) goto L_0x006f
            android.content.res.ColorStateList r5 = r6.f20041g1
            if (r5 == 0) goto L_0x0068
            r6.m34077b(r0, r3)
            goto L_0x0081
        L_0x0068:
            int r4 = r4.getCurrentTextColor()
            r6.f20070y0 = r4
            goto L_0x0081
        L_0x006f:
            if (r0 == 0) goto L_0x0076
            int r4 = r6.f20039f1
            r6.f20070y0 = r4
            goto L_0x0081
        L_0x0076:
            if (r3 == 0) goto L_0x007d
            int r4 = r6.f20037e1
            r6.f20070y0 = r4
            goto L_0x0081
        L_0x007d:
            int r4 = r6.f20035d1
            r6.f20070y0 = r4
        L_0x0081:
            android.graphics.drawable.Drawable r4 = r6.getErrorIconDrawable()
            if (r4 == 0) goto L_0x0098
            com.google.android.material.textfield.f r4 = r6.f20011R
            boolean r4 = r4.mo28455p()
            if (r4 == 0) goto L_0x0098
            com.google.android.material.textfield.f r4 = r6.f20011R
            boolean r4 = r4.mo28443d()
            if (r4 == 0) goto L_0x0098
            r1 = 1
        L_0x0098:
            r6.setErrorIconVisible(r1)
            com.google.android.material.internal.CheckableImageButton r1 = r6.f20025Z0
            android.content.res.ColorStateList r4 = r6.f20028a1
            r6.m34064a(r1, r4)
            com.google.android.material.internal.CheckableImageButton r1 = r6.f19994E0
            android.content.res.ColorStateList r4 = r6.f19995F0
            r6.m34064a(r1, r4)
            com.google.android.material.internal.CheckableImageButton r1 = r6.f20008P0
            android.content.res.ColorStateList r4 = r6.f20012R0
            r6.m34064a(r1, r4)
            com.google.android.material.textfield.e r1 = r6.getEndIconDelegate()
            boolean r1 = r1.mo28416b()
            if (r1 == 0) goto L_0x00c3
            com.google.android.material.textfield.f r1 = r6.f20011R
            boolean r1 = r1.mo28443d()
            r6.m34085e(r1)
        L_0x00c3:
            if (r0 == 0) goto L_0x00d0
            boolean r1 = r6.isEnabled()
            if (r1 == 0) goto L_0x00d0
            int r1 = r6.f20069x0
            r6.f20067v0 = r1
            goto L_0x00d4
        L_0x00d0:
            int r1 = r6.f20068w0
            r6.f20067v0 = r1
        L_0x00d4:
            int r1 = r6.f20065t0
            if (r1 != r2) goto L_0x00f7
            boolean r1 = r6.isEnabled()
            if (r1 != 0) goto L_0x00e3
            int r0 = r6.f20045i1
            r6.f20071z0 = r0
            goto L_0x00f7
        L_0x00e3:
            if (r3 == 0) goto L_0x00ec
            if (r0 != 0) goto L_0x00ec
            int r0 = r6.f20049k1
            r6.f20071z0 = r0
            goto L_0x00f7
        L_0x00ec:
            if (r0 == 0) goto L_0x00f3
            int r0 = r6.f20047j1
            r6.f20071z0 = r0
            goto L_0x00f7
        L_0x00f3:
            int r0 = r6.f20043h1
            r6.f20071z0 = r0
        L_0x00f7:
            r6.m34087t()
        L_0x00fa:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.mo28317r():void");
    }

    public void setBoxBackgroundColor(@C0198k int i) {
        if (this.f20071z0 != i) {
            this.f20071z0 = i;
            this.f20043h1 = i;
            m34087t();
        }
    }

    public void setBoxBackgroundColorResource(@C0202m int i) {
        setBoxBackgroundColor(C0841b.m4915a(getContext(), i));
    }

    public void setBoxBackgroundMode(int i) {
        if (i != this.f20065t0) {
            this.f20065t0 = i;
            if (this.f20007P != null) {
                m34039J();
            }
        }
    }

    public void setBoxStrokeColor(@C0198k int i) {
        if (this.f20039f1 != i) {
            this.f20039f1 = i;
            mo28317r();
        }
    }

    public void setBoxStrokeColorStateList(@C0193h0 ColorStateList colorStateList) {
        if (colorStateList.isStateful()) {
            this.f20035d1 = colorStateList.getDefaultColor();
            this.f20051l1 = colorStateList.getColorForState(new int[]{-16842910}, -1);
            this.f20037e1 = colorStateList.getColorForState(new int[]{16843623, 16842910}, -1);
            this.f20039f1 = colorStateList.getColorForState(new int[]{16842908, 16842910}, -1);
        } else if (this.f20039f1 != colorStateList.getDefaultColor()) {
            this.f20039f1 = colorStateList.getDefaultColor();
        }
        mo28317r();
    }

    public void setBoxStrokeErrorColor(@C0195i0 ColorStateList colorStateList) {
        if (this.f20041g1 != colorStateList) {
            this.f20041g1 = colorStateList;
            mo28317r();
        }
    }

    public void setCounterEnabled(boolean z) {
        if (this.f20013S != z) {
            if (z) {
                this.f20019V = new AppCompatTextView(getContext());
                this.f20019V.setId(C5582R.C5586id.textinput_counter);
                Typeface typeface = this.f19993D0;
                if (typeface != null) {
                    this.f20019V.setTypeface(typeface);
                }
                this.f20019V.setMaxLines(1);
                this.f20011R.mo28430a(this.f20019V, 2);
                C0999l.m5726d((MarginLayoutParams) this.f20019V.getLayoutParams(), getResources().getDimensionPixelOffset(C5582R.dimen.mtrl_textinput_counter_margin_start));
                m34048S();
                m34047R();
            } else {
                this.f20011R.mo28437b(this.f20019V, 2);
                this.f20019V = null;
            }
            this.f20013S = z;
        }
    }

    public void setCounterMaxLength(int i) {
        if (this.f20015T != i) {
            if (i > 0) {
                this.f20015T = i;
            } else {
                this.f20015T = -1;
            }
            if (this.f20013S) {
                m34047R();
            }
        }
    }

    public void setCounterOverflowTextAppearance(int i) {
        if (this.f20021W != i) {
            this.f20021W = i;
            m34048S();
        }
    }

    public void setCounterOverflowTextColor(@C0195i0 ColorStateList colorStateList) {
        if (this.f20042h0 != colorStateList) {
            this.f20042h0 = colorStateList;
            m34048S();
        }
    }

    public void setCounterTextAppearance(int i) {
        if (this.f20027a0 != i) {
            this.f20027a0 = i;
            m34048S();
        }
    }

    public void setCounterTextColor(@C0195i0 ColorStateList colorStateList) {
        if (this.f20040g0 != colorStateList) {
            this.f20040g0 = colorStateList;
            m34048S();
        }
    }

    public void setDefaultHintTextColor(@C0195i0 ColorStateList colorStateList) {
        this.f20031b1 = colorStateList;
        this.f20033c1 = colorStateList;
        if (this.f20007P != null) {
            mo28248b(false);
        }
    }

    public void setEnabled(boolean z) {
        m34063a((ViewGroup) this, z);
        super.setEnabled(z);
    }

    public void setEndIconActivated(boolean z) {
        this.f20008P0.setActivated(z);
    }

    public void setEndIconCheckable(boolean z) {
        this.f20008P0.setCheckable(z);
    }

    public void setEndIconContentDescription(@C0214q0 int i) {
        setEndIconContentDescription(i != 0 ? getResources().getText(i) : null);
    }

    public void setEndIconDrawable(@C0213q int i) {
        setEndIconDrawable(i != 0 ? C0242a.m1109c(getContext(), i) : null);
    }

    public void setEndIconMode(int i) {
        int i2 = this.f20004N0;
        this.f20004N0 = i;
        setEndIconVisible(i != 0);
        if (getEndIconDelegate().mo28415a(this.f20065t0)) {
            getEndIconDelegate().mo28402a();
            m34089v();
            m34074b(i2);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("The current box background mode ");
        sb.append(this.f20065t0);
        sb.append(" is not supported by the end icon mode ");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }

    public void setEndIconOnClickListener(@C0195i0 OnClickListener onClickListener) {
        m34065a(this.f20008P0, onClickListener, this.f20024Y0);
    }

    public void setEndIconOnLongClickListener(@C0195i0 OnLongClickListener onLongClickListener) {
        this.f20024Y0 = onLongClickListener;
        m34076b(this.f20008P0, onLongClickListener);
    }

    public void setEndIconTintList(@C0195i0 ColorStateList colorStateList) {
        if (this.f20012R0 != colorStateList) {
            this.f20012R0 = colorStateList;
            this.f20014S0 = true;
            m34089v();
        }
    }

    public void setEndIconTintMode(@C0195i0 Mode mode) {
        if (this.f20016T0 != mode) {
            this.f20016T0 = mode;
            this.f20018U0 = true;
            m34089v();
        }
    }

    public void setEndIconVisible(boolean z) {
        if (mo28256f() != z) {
            this.f20008P0.setVisibility(z ? 0 : 8);
            m34071a0();
            m34049T();
        }
    }

    public void setError(@C0195i0 CharSequence charSequence) {
        if (!this.f20011R.mo28455p()) {
            if (!TextUtils.isEmpty(charSequence)) {
                setErrorEnabled(true);
            } else {
                return;
            }
        }
        if (!TextUtils.isEmpty(charSequence)) {
            this.f20011R.mo28438b(charSequence);
        } else {
            this.f20011R.mo28453n();
        }
    }

    public void setErrorContentDescription(@C0195i0 CharSequence charSequence) {
        this.f20011R.mo28431a(charSequence);
    }

    public void setErrorEnabled(boolean z) {
        this.f20011R.mo28432a(z);
    }

    public void setErrorIconDrawable(@C0213q int i) {
        setErrorIconDrawable(i != 0 ? C0242a.m1109c(getContext(), i) : null);
    }

    public void setErrorIconTintList(@C0195i0 ColorStateList colorStateList) {
        this.f20028a1 = colorStateList;
        Drawable drawable = this.f20025Z0.getDrawable();
        if (drawable != null) {
            drawable = C0892a.m5161i(drawable).mutate();
            C0892a.m5146a(drawable, colorStateList);
        }
        if (this.f20025Z0.getDrawable() != drawable) {
            this.f20025Z0.setImageDrawable(drawable);
        }
    }

    public void setErrorIconTintMode(@C0195i0 Mode mode) {
        Drawable drawable = this.f20025Z0.getDrawable();
        if (drawable != null) {
            drawable = C0892a.m5161i(drawable).mutate();
            C0892a.m5149a(drawable, mode);
        }
        if (this.f20025Z0.getDrawable() != drawable) {
            this.f20025Z0.setImageDrawable(drawable);
        }
    }

    public void setErrorTextAppearance(@C0216r0 int i) {
        this.f20011R.mo28435b(i);
    }

    public void setErrorTextColor(@C0195i0 ColorStateList colorStateList) {
        this.f20011R.mo28428a(colorStateList);
    }

    public void setHelperText(@C0195i0 CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (!mo28304i()) {
                setHelperTextEnabled(true);
            }
            this.f20011R.mo28441c(charSequence);
        } else if (mo28304i()) {
            setHelperTextEnabled(false);
        }
    }

    public void setHelperTextColor(@C0195i0 ColorStateList colorStateList) {
        this.f20011R.mo28436b(colorStateList);
    }

    public void setHelperTextEnabled(boolean z) {
        this.f20011R.mo28439b(z);
    }

    public void setHelperTextTextAppearance(@C0216r0 int i) {
        this.f20011R.mo28440c(i);
    }

    public void setHint(@C0195i0 CharSequence charSequence) {
        if (this.f20052m0) {
            setHintInternal(charSequence);
            sendAccessibilityEvent(2048);
        }
    }

    public void setHintAnimationEnabled(boolean z) {
        this.f20057o1 = z;
    }

    public void setHintEnabled(boolean z) {
        if (z != this.f20052m0) {
            this.f20052m0 = z;
            if (!this.f20052m0) {
                this.f20056o0 = false;
                if (!TextUtils.isEmpty(this.f20054n0) && TextUtils.isEmpty(this.f20007P.getHint())) {
                    this.f20007P.setHint(this.f20054n0);
                }
                setHintInternal(null);
            } else {
                CharSequence hint = this.f20007P.getHint();
                if (!TextUtils.isEmpty(hint)) {
                    if (TextUtils.isEmpty(this.f20054n0)) {
                        setHint(hint);
                    }
                    this.f20007P.setHint(null);
                }
                this.f20056o0 = true;
            }
            if (this.f20007P != null) {
                m34051V();
            }
        }
    }

    public void setHintTextAppearance(@C0216r0 int i) {
        this.f20055n1.mo27535a(i);
        this.f20033c1 = this.f20055n1.mo27545b();
        if (this.f20007P != null) {
            mo28248b(false);
            m34051V();
        }
    }

    public void setHintTextColor(@C0195i0 ColorStateList colorStateList) {
        if (this.f20033c1 != colorStateList) {
            if (this.f20031b1 == null) {
                this.f20055n1.mo27538a(colorStateList);
            }
            this.f20033c1 = colorStateList;
            if (this.f20007P != null) {
                mo28248b(false);
            }
        }
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(@C0214q0 int i) {
        setPasswordVisibilityToggleContentDescription(i != 0 ? getResources().getText(i) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(@C0213q int i) {
        setPasswordVisibilityToggleDrawable(i != 0 ? C0242a.m1109c(getContext(), i) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleEnabled(boolean z) {
        if (z && this.f20004N0 != 1) {
            setEndIconMode(1);
        } else if (!z) {
            setEndIconMode(0);
        }
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintList(@C0195i0 ColorStateList colorStateList) {
        this.f20012R0 = colorStateList;
        this.f20014S0 = true;
        m34089v();
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintMode(@C0195i0 Mode mode) {
        this.f20016T0 = mode;
        this.f20018U0 = true;
        m34089v();
    }

    public void setPlaceholderText(@C0195i0 CharSequence charSequence) {
        if (!this.f20032c0 || !TextUtils.isEmpty(charSequence)) {
            if (!this.f20032c0) {
                setPlaceholderTextEnabled(true);
            }
            this.f20030b0 = charSequence;
        } else {
            setPlaceholderTextEnabled(false);
        }
        m34053X();
    }

    public void setPlaceholderTextAppearance(@C0216r0 int i) {
        this.f20038f0 = i;
        TextView textView = this.f20034d0;
        if (textView != null) {
            C1120m.m6391e(textView, i);
        }
    }

    public void setPlaceholderTextColor(@C0195i0 ColorStateList colorStateList) {
        if (this.f20036e0 != colorStateList) {
            this.f20036e0 = colorStateList;
            TextView textView = this.f20034d0;
            if (textView != null && colorStateList != null) {
                textView.setTextColor(colorStateList);
            }
        }
    }

    public void setPrefixText(@C0195i0 CharSequence charSequence) {
        this.f20044i0 = TextUtils.isEmpty(charSequence) ? null : charSequence;
        this.f20046j0.setText(charSequence);
        m34055Z();
    }

    public void setPrefixTextAppearance(@C0216r0 int i) {
        C1120m.m6391e(this.f20046j0, i);
    }

    public void setPrefixTextColor(@C0193h0 ColorStateList colorStateList) {
        this.f20046j0.setTextColor(colorStateList);
    }

    public void setStartIconCheckable(boolean z) {
        this.f19994E0.setCheckable(z);
    }

    public void setStartIconContentDescription(@C0214q0 int i) {
        setStartIconContentDescription(i != 0 ? getResources().getText(i) : null);
    }

    public void setStartIconDrawable(@C0213q int i) {
        setStartIconDrawable(i != 0 ? C0242a.m1109c(getContext(), i) : null);
    }

    public void setStartIconOnClickListener(@C0195i0 OnClickListener onClickListener) {
        m34065a(this.f19994E0, onClickListener, this.f20001L0);
    }

    public void setStartIconOnLongClickListener(@C0195i0 OnLongClickListener onLongClickListener) {
        this.f20001L0 = onLongClickListener;
        m34076b(this.f19994E0, onLongClickListener);
    }

    public void setStartIconTintList(@C0195i0 ColorStateList colorStateList) {
        if (this.f19995F0 != colorStateList) {
            this.f19995F0 = colorStateList;
            this.f19996G0 = true;
            m34090w();
        }
    }

    public void setStartIconTintMode(@C0195i0 Mode mode) {
        if (this.f19997H0 != mode) {
            this.f19997H0 = mode;
            this.f19998I0 = true;
            m34090w();
        }
    }

    public void setStartIconVisible(boolean z) {
        if (mo28315p() != z) {
            this.f19994E0.setVisibility(z ? 0 : 8);
            m34054Y();
            m34049T();
        }
    }

    public void setSuffixText(@C0195i0 CharSequence charSequence) {
        this.f20048k0 = TextUtils.isEmpty(charSequence) ? null : charSequence;
        this.f20050l0.setText(charSequence);
        m34079b0();
    }

    public void setSuffixTextAppearance(@C0216r0 int i) {
        C1120m.m6391e(this.f20050l0, i);
    }

    public void setSuffixTextColor(@C0193h0 ColorStateList colorStateList) {
        this.f20050l0.setTextColor(colorStateList);
    }

    public void setTextInputAccessibilityDelegate(C7073e eVar) {
        EditText editText = this.f20007P;
        if (editText != null) {
            C0962e0.m5443a((View) editText, (C0947a) eVar);
        }
    }

    public void setTypeface(@C0195i0 Typeface typeface) {
        if (typeface != this.f19993D0) {
            this.f19993D0 = typeface;
            this.f20055n1.mo27556c(typeface);
            this.f20011R.mo28429a(typeface);
            TextView textView = this.f20019V;
            if (textView != null) {
                textView.setTypeface(typeface);
            }
        }
    }

    public TextInputLayout(@C0193h0 Context context, @C0195i0 AttributeSet attributeSet) {
        this(context, attributeSet, C5582R.attr.textInputStyle);
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void m34081c(int i) {
        if (i != 0 || this.f20053m1) {
            m34036G();
        } else {
            m34046Q();
        }
    }

    /* renamed from: d */
    private void m34084d(boolean z) {
        ValueAnimator valueAnimator = this.f20059p1;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.f20059p1.cancel();
        }
        if (!z || !this.f20057o1) {
            this.f20055n1.mo27554c(0.0f);
        } else {
            mo28236a(0.0f);
        }
        if (m34033D() && ((C7086c) this.f20058p0).mo22862E()) {
            m34032C();
        }
        this.f20053m1 = true;
        m34036G();
        m34055Z();
        m34079b0();
    }

    /* renamed from: e */
    private void m34085e(boolean z) {
        if (!z || getEndIconDrawable() == null) {
            m34089v();
            return;
        }
        Drawable mutate = C0892a.m5161i(getEndIconDrawable()).mutate();
        C0892a.m5154b(mutate, this.f20011R.mo28446g());
        this.f20008P0.setImageDrawable(mutate);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo28248b(boolean z) {
        m34069a(z, false);
    }

    public void setEndIconContentDescription(@C0195i0 CharSequence charSequence) {
        if (getEndIconContentDescription() != charSequence) {
            this.f20008P0.setContentDescription(charSequence);
        }
    }

    public void setEndIconDrawable(@C0195i0 Drawable drawable) {
        this.f20008P0.setImageDrawable(drawable);
    }

    public void setErrorIconDrawable(@C0195i0 Drawable drawable) {
        this.f20025Z0.setImageDrawable(drawable);
        setErrorIconVisible(drawable != null && this.f20011R.mo28455p());
    }

    public void setStartIconContentDescription(@C0195i0 CharSequence charSequence) {
        if (getStartIconContentDescription() != charSequence) {
            this.f19994E0.setContentDescription(charSequence);
        }
    }

    public void setStartIconDrawable(@C0195i0 Drawable drawable) {
        this.f19994E0.setImageDrawable(drawable);
        if (drawable != null) {
            setStartIconVisible(true);
            m34090w();
            return;
        }
        setStartIconVisible(false);
        setStartIconOnClickListener(null);
        setStartIconOnLongClickListener(null);
        setStartIconContentDescription((CharSequence) null);
    }

    public TextInputLayout(@C0193h0 Context context, @C0195i0 AttributeSet attributeSet, int i) {
        AttributeSet attributeSet2 = attributeSet;
        int i2 = i;
        super(C7109a.m34252b(context, attributeSet2, i2, f19982s1), attributeSet2, i2);
        this.f20011R = new C7099f(this);
        this.f19990A0 = new Rect();
        this.f19991B0 = new Rect();
        this.f19992C0 = new RectF();
        this.f20002M0 = new LinkedHashSet<>();
        this.f20004N0 = 0;
        this.f20006O0 = new SparseArray<>();
        this.f20010Q0 = new LinkedHashSet<>();
        this.f20055n1 = new C6893a(this);
        Context context2 = getContext();
        setOrientation(1);
        setWillNotDraw(false);
        setAddStatesFromChildren(true);
        this.f20026a = new FrameLayout(context2);
        this.f20026a.setAddStatesFromChildren(true);
        addView(this.f20026a);
        this.f20029b = new LinearLayout(context2);
        this.f20029b.setOrientation(0);
        this.f20029b.setLayoutParams(new FrameLayout.LayoutParams(-2, -1, C0984g.f4394b));
        this.f20026a.addView(this.f20029b);
        this.f20003N = new LinearLayout(context2);
        this.f20003N.setOrientation(0);
        this.f20003N.setLayoutParams(new FrameLayout.LayoutParams(-2, -1, C0984g.f4395c));
        this.f20026a.addView(this.f20003N);
        this.f20005O = new FrameLayout(context2);
        this.f20005O.setLayoutParams(new FrameLayout.LayoutParams(-2, -1));
        this.f20055n1.mo27549b(C5587a.f15929a);
        this.f20055n1.mo27537a(C5587a.f15929a);
        this.f20055n1.mo27547b((int) BadgeDrawable.f16065c0);
        C0549t0 d = C6928p.m33266d(context2, attributeSet, C5582R.styleable.TextInputLayout, i, f19982s1, C5582R.styleable.TextInputLayout_counterTextAppearance, C5582R.styleable.TextInputLayout_counterOverflowTextAppearance, C5582R.styleable.TextInputLayout_errorTextAppearance, C5582R.styleable.TextInputLayout_helperTextTextAppearance, C5582R.styleable.TextInputLayout_hintTextAppearance);
        this.f20052m0 = d.mo2871a(C5582R.styleable.TextInputLayout_hintEnabled, true);
        setHint(d.mo2889g(C5582R.styleable.TextInputLayout_android_hint));
        this.f20057o1 = d.mo2871a(C5582R.styleable.TextInputLayout_hintAnimationEnabled, true);
        this.f20062r0 = C6986o.m33526a(context2, attributeSet2, i2, f19982s1).mo27878a();
        this.f20064s0 = context2.getResources().getDimensionPixelOffset(C5582R.dimen.mtrl_textinput_box_label_cutout_padding);
        this.f20066u0 = d.mo2874b(C5582R.styleable.TextInputLayout_boxCollapsedPaddingTop, 0);
        this.f20068w0 = d.mo2876c(C5582R.styleable.TextInputLayout_boxStrokeWidth, context2.getResources().getDimensionPixelSize(C5582R.dimen.mtrl_textinput_box_stroke_width_default));
        this.f20069x0 = d.mo2876c(C5582R.styleable.TextInputLayout_boxStrokeWidthFocused, context2.getResources().getDimensionPixelSize(C5582R.dimen.mtrl_textinput_box_stroke_width_focused));
        this.f20067v0 = this.f20068w0;
        float a = d.mo2863a(C5582R.styleable.TextInputLayout_boxCornerRadiusTopStart, -1.0f);
        float a2 = d.mo2863a(C5582R.styleable.TextInputLayout_boxCornerRadiusTopEnd, -1.0f);
        float a3 = d.mo2863a(C5582R.styleable.TextInputLayout_boxCornerRadiusBottomEnd, -1.0f);
        float a4 = d.mo2863a(C5582R.styleable.TextInputLayout_boxCornerRadiusBottomStart, -1.0f);
        C6988b m = this.f20062r0.mo27871m();
        if (a >= 0.0f) {
            m.mo27891d(a);
        }
        if (a2 >= 0.0f) {
            m.mo27897e(a2);
        }
        if (a3 >= 0.0f) {
            m.mo27885c(a3);
        }
        if (a4 >= 0.0f) {
            m.mo27879b(a4);
        }
        this.f20062r0 = m.mo27878a();
        ColorStateList a5 = C6952c.m33333a(context2, d, C5582R.styleable.TextInputLayout_boxBackgroundColor);
        if (a5 != null) {
            this.f20043h1 = a5.getDefaultColor();
            this.f20071z0 = this.f20043h1;
            if (a5.isStateful()) {
                this.f20045i1 = a5.getColorForState(new int[]{-16842910}, -1);
                this.f20047j1 = a5.getColorForState(new int[]{16842908, 16842910}, -1);
                this.f20049k1 = a5.getColorForState(new int[]{16843623, 16842910}, -1);
            } else {
                this.f20047j1 = this.f20043h1;
                ColorStateList b = C0242a.m1108b(context2, C5582R.C5584color.mtrl_filled_background_color);
                this.f20045i1 = b.getColorForState(new int[]{-16842910}, -1);
                this.f20049k1 = b.getColorForState(new int[]{16843623}, -1);
            }
        } else {
            this.f20071z0 = 0;
            this.f20043h1 = 0;
            this.f20045i1 = 0;
            this.f20047j1 = 0;
            this.f20049k1 = 0;
        }
        if (d.mo2892j(C5582R.styleable.TextInputLayout_android_textColorHint)) {
            ColorStateList a6 = d.mo2868a(C5582R.styleable.TextInputLayout_android_textColorHint);
            this.f20033c1 = a6;
            this.f20031b1 = a6;
        }
        ColorStateList a7 = C6952c.m33333a(context2, d, C5582R.styleable.TextInputLayout_boxStrokeColor);
        this.f20039f1 = d.mo2866a(C5582R.styleable.TextInputLayout_boxStrokeColor, 0);
        this.f20035d1 = C0841b.m4915a(context2, C5582R.C5584color.mtrl_textinput_default_box_stroke_color);
        this.f20051l1 = C0841b.m4915a(context2, C5582R.C5584color.mtrl_textinput_disabled_color);
        this.f20037e1 = C0841b.m4915a(context2, C5582R.C5584color.mtrl_textinput_hovered_box_stroke_color);
        if (a7 != null) {
            setBoxStrokeColorStateList(a7);
        }
        if (d.mo2892j(C5582R.styleable.TextInputLayout_boxStrokeErrorColor)) {
            setBoxStrokeErrorColor(C6952c.m33333a(context2, d, C5582R.styleable.TextInputLayout_boxStrokeErrorColor));
        }
        if (d.mo2888g(C5582R.styleable.TextInputLayout_hintTextAppearance, -1) != -1) {
            setHintTextAppearance(d.mo2888g(C5582R.styleable.TextInputLayout_hintTextAppearance, 0));
        }
        int g = d.mo2888g(C5582R.styleable.TextInputLayout_errorTextAppearance, 0);
        CharSequence g2 = d.mo2889g(C5582R.styleable.TextInputLayout_errorContentDescription);
        boolean a8 = d.mo2871a(C5582R.styleable.TextInputLayout_errorEnabled, false);
        this.f20025Z0 = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(C5582R.layout.design_text_input_end_icon, this.f20003N, false);
        this.f20025Z0.setVisibility(8);
        if (d.mo2892j(C5582R.styleable.TextInputLayout_errorIconDrawable)) {
            setErrorIconDrawable(d.mo2875b(C5582R.styleable.TextInputLayout_errorIconDrawable));
        }
        if (d.mo2892j(C5582R.styleable.TextInputLayout_errorIconTint)) {
            setErrorIconTintList(C6952c.m33333a(context2, d, C5582R.styleable.TextInputLayout_errorIconTint));
        }
        if (d.mo2892j(C5582R.styleable.TextInputLayout_errorIconTintMode)) {
            setErrorIconTintMode(C6936w.m33293a(d.mo2880d(C5582R.styleable.TextInputLayout_errorIconTintMode, -1), (Mode) null));
        }
        this.f20025Z0.setContentDescription(getResources().getText(C5582R.string.error_icon_content_description));
        C0962e0.m5531l((View) this.f20025Z0, 2);
        this.f20025Z0.setClickable(false);
        this.f20025Z0.setPressable(false);
        this.f20025Z0.setFocusable(false);
        int g3 = d.mo2888g(C5582R.styleable.TextInputLayout_helperTextTextAppearance, 0);
        boolean a9 = d.mo2871a(C5582R.styleable.TextInputLayout_helperTextEnabled, false);
        CharSequence g4 = d.mo2889g(C5582R.styleable.TextInputLayout_helperText);
        int g5 = d.mo2888g(C5582R.styleable.TextInputLayout_placeholderTextAppearance, 0);
        CharSequence g6 = d.mo2889g(C5582R.styleable.TextInputLayout_placeholderText);
        int g7 = d.mo2888g(C5582R.styleable.TextInputLayout_prefixTextAppearance, 0);
        CharSequence g8 = d.mo2889g(C5582R.styleable.TextInputLayout_prefixText);
        int g9 = d.mo2888g(C5582R.styleable.TextInputLayout_suffixTextAppearance, 0);
        CharSequence g10 = d.mo2889g(C5582R.styleable.TextInputLayout_suffixText);
        int i3 = g9;
        boolean a10 = d.mo2871a(C5582R.styleable.TextInputLayout_counterEnabled, false);
        setCounterMaxLength(d.mo2880d(C5582R.styleable.TextInputLayout_counterMaxLength, -1));
        this.f20027a0 = d.mo2888g(C5582R.styleable.TextInputLayout_counterTextAppearance, 0);
        this.f20021W = d.mo2888g(C5582R.styleable.TextInputLayout_counterOverflowTextAppearance, 0);
        CharSequence charSequence = g10;
        int i4 = g7;
        this.f19994E0 = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(C5582R.layout.design_text_input_start_icon, this.f20029b, false);
        this.f19994E0.setVisibility(8);
        setStartIconOnClickListener(null);
        setStartIconOnLongClickListener(null);
        if (d.mo2892j(C5582R.styleable.TextInputLayout_startIconDrawable)) {
            setStartIconDrawable(d.mo2875b(C5582R.styleable.TextInputLayout_startIconDrawable));
            if (d.mo2892j(C5582R.styleable.TextInputLayout_startIconContentDescription)) {
                setStartIconContentDescription(d.mo2889g(C5582R.styleable.TextInputLayout_startIconContentDescription));
            }
            setStartIconCheckable(d.mo2871a(C5582R.styleable.TextInputLayout_startIconCheckable, true));
        }
        if (d.mo2892j(C5582R.styleable.TextInputLayout_startIconTint)) {
            setStartIconTintList(C6952c.m33333a(context2, d, C5582R.styleable.TextInputLayout_startIconTint));
        }
        if (d.mo2892j(C5582R.styleable.TextInputLayout_startIconTintMode)) {
            setStartIconTintMode(C6936w.m33293a(d.mo2880d(C5582R.styleable.TextInputLayout_startIconTintMode, -1), (Mode) null));
        }
        setBoxBackgroundMode(d.mo2880d(C5582R.styleable.TextInputLayout_boxBackgroundMode, 0));
        this.f20008P0 = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(C5582R.layout.design_text_input_end_icon, this.f20005O, false);
        this.f20005O.addView(this.f20008P0);
        this.f20008P0.setVisibility(8);
        this.f20006O0.append(-1, new C7085b(this));
        this.f20006O0.append(0, new C7101g(this));
        this.f20006O0.append(1, new C7102h(this));
        this.f20006O0.append(2, new C7076a(this));
        this.f20006O0.append(3, new C7087d(this));
        if (d.mo2892j(C5582R.styleable.TextInputLayout_endIconMode)) {
            setEndIconMode(d.mo2880d(C5582R.styleable.TextInputLayout_endIconMode, 0));
            if (d.mo2892j(C5582R.styleable.TextInputLayout_endIconDrawable)) {
                setEndIconDrawable(d.mo2875b(C5582R.styleable.TextInputLayout_endIconDrawable));
            }
            if (d.mo2892j(C5582R.styleable.TextInputLayout_endIconContentDescription)) {
                setEndIconContentDescription(d.mo2889g(C5582R.styleable.TextInputLayout_endIconContentDescription));
            }
            setEndIconCheckable(d.mo2871a(C5582R.styleable.TextInputLayout_endIconCheckable, true));
        } else if (d.mo2892j(C5582R.styleable.TextInputLayout_passwordToggleEnabled)) {
            setEndIconMode(d.mo2871a(C5582R.styleable.TextInputLayout_passwordToggleEnabled, false) ? 1 : 0);
            setEndIconDrawable(d.mo2875b(C5582R.styleable.TextInputLayout_passwordToggleDrawable));
            setEndIconContentDescription(d.mo2889g(C5582R.styleable.TextInputLayout_passwordToggleContentDescription));
            if (d.mo2892j(C5582R.styleable.TextInputLayout_passwordToggleTint)) {
                setEndIconTintList(C6952c.m33333a(context2, d, C5582R.styleable.TextInputLayout_passwordToggleTint));
            }
            if (d.mo2892j(C5582R.styleable.TextInputLayout_passwordToggleTintMode)) {
                setEndIconTintMode(C6936w.m33293a(d.mo2880d(C5582R.styleable.TextInputLayout_passwordToggleTintMode, -1), (Mode) null));
            }
        }
        if (!d.mo2892j(C5582R.styleable.TextInputLayout_passwordToggleEnabled)) {
            if (d.mo2892j(C5582R.styleable.TextInputLayout_endIconTint)) {
                setEndIconTintList(C6952c.m33333a(context2, d, C5582R.styleable.TextInputLayout_endIconTint));
            }
            if (d.mo2892j(C5582R.styleable.TextInputLayout_endIconTintMode)) {
                setEndIconTintMode(C6936w.m33293a(d.mo2880d(C5582R.styleable.TextInputLayout_endIconTintMode, -1), (Mode) null));
            }
        }
        this.f20046j0 = new AppCompatTextView(context2);
        this.f20046j0.setId(C5582R.C5586id.textinput_prefix_text);
        this.f20046j0.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        C0962e0.m5527k((View) this.f20046j0, 1);
        this.f20029b.addView(this.f19994E0);
        this.f20029b.addView(this.f20046j0);
        this.f20050l0 = new AppCompatTextView(context2);
        this.f20050l0.setId(C5582R.C5586id.textinput_suffix_text);
        this.f20050l0.setLayoutParams(new FrameLayout.LayoutParams(-2, -2, 80));
        C0962e0.m5527k((View) this.f20050l0, 1);
        this.f20003N.addView(this.f20050l0);
        this.f20003N.addView(this.f20025Z0);
        this.f20003N.addView(this.f20005O);
        setHelperTextEnabled(a9);
        setHelperText(g4);
        setHelperTextTextAppearance(g3);
        setErrorEnabled(a8);
        setErrorTextAppearance(g);
        setErrorContentDescription(g2);
        setCounterTextAppearance(this.f20027a0);
        setCounterOverflowTextAppearance(this.f20021W);
        setPlaceholderText(g6);
        setPlaceholderTextAppearance(g5);
        setPrefixText(g8);
        setPrefixTextAppearance(i4);
        setSuffixText(charSequence);
        setSuffixTextAppearance(i3);
        if (d.mo2892j(C5582R.styleable.TextInputLayout_errorTextColor)) {
            setErrorTextColor(d.mo2868a(C5582R.styleable.TextInputLayout_errorTextColor));
        }
        if (d.mo2892j(C5582R.styleable.TextInputLayout_helperTextTextColor)) {
            setHelperTextColor(d.mo2868a(C5582R.styleable.TextInputLayout_helperTextTextColor));
        }
        if (d.mo2892j(C5582R.styleable.TextInputLayout_hintTextColor)) {
            setHintTextColor(d.mo2868a(C5582R.styleable.TextInputLayout_hintTextColor));
        }
        if (d.mo2892j(C5582R.styleable.TextInputLayout_counterTextColor)) {
            setCounterTextColor(d.mo2868a(C5582R.styleable.TextInputLayout_counterTextColor));
        }
        if (d.mo2892j(C5582R.styleable.TextInputLayout_counterOverflowTextColor)) {
            setCounterOverflowTextColor(d.mo2868a(C5582R.styleable.TextInputLayout_counterOverflowTextColor));
        }
        if (d.mo2892j(C5582R.styleable.TextInputLayout_placeholderTextColor)) {
            setPlaceholderTextColor(d.mo2868a(C5582R.styleable.TextInputLayout_placeholderTextColor));
        }
        if (d.mo2892j(C5582R.styleable.TextInputLayout_prefixTextColor)) {
            setPrefixTextColor(d.mo2868a(C5582R.styleable.TextInputLayout_prefixTextColor));
        }
        if (d.mo2892j(C5582R.styleable.TextInputLayout_suffixTextColor)) {
            setSuffixTextColor(d.mo2868a(C5582R.styleable.TextInputLayout_suffixTextColor));
        }
        setCounterEnabled(a10);
        setEnabled(d.mo2871a(C5582R.styleable.TextInputLayout_android_enabled, true));
        d.mo2887f();
        C0962e0.m5531l((View) this, 2);
    }

    /* renamed from: b */
    private int m34072b(int i, boolean z) {
        int compoundPaddingRight = i - this.f20007P.getCompoundPaddingRight();
        return (this.f20044i0 == null || !z) ? compoundPaddingRight : compoundPaddingRight + this.f20046j0.getMeasuredWidth() + this.f20046j0.getPaddingRight();
    }

    /* renamed from: a */
    public void mo28239a(@C0209o int i, @C0209o int i2, @C0209o int i3, @C0209o int i4) {
        mo28237a(getContext().getResources().getDimension(i), getContext().getResources().getDimension(i2), getContext().getResources().getDimension(i4), getContext().getResources().getDimension(i3));
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(@C0195i0 CharSequence charSequence) {
        this.f20008P0.setContentDescription(charSequence);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(@C0195i0 Drawable drawable) {
        this.f20008P0.setImageDrawable(drawable);
    }

    /* renamed from: c */
    private void m34082c(@C0193h0 Rect rect) {
        C6978j jVar = this.f20060q0;
        if (jVar != null) {
            int i = rect.bottom;
            jVar.setBounds(rect.left, i - this.f20069x0, rect.right, i);
        }
    }

    @C0193h0
    /* renamed from: b */
    private Rect m34073b(@C0193h0 Rect rect) {
        if (this.f20007P != null) {
            Rect rect2 = this.f19991B0;
            float j = this.f20055n1.mo27564j();
            rect2.left = rect.left + this.f20007P.getCompoundPaddingLeft();
            rect2.top = m34057a(rect, j);
            rect2.right = rect.right - this.f20007P.getCompoundPaddingRight();
            rect2.bottom = m34058a(rect, rect2, j);
            return rect2;
        }
        throw new IllegalStateException();
    }

    /* renamed from: c */
    private void m34083c(boolean z) {
        ValueAnimator valueAnimator = this.f20059p1;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.f20059p1.cancel();
        }
        if (!z || !this.f20057o1) {
            this.f20055n1.mo27554c(1.0f);
        } else {
            mo28236a(1.0f);
        }
        this.f20053m1 = false;
        if (m34033D()) {
            m34040K();
        }
        m34046Q();
        m34055Z();
        m34079b0();
    }

    /* renamed from: a */
    public void mo28237a(float f, float f2, float f3, float f4) {
        if (this.f20058p0.mo27843w() != f || this.f20058p0.mo27844x() != f2 || this.f20058p0.mo27803c() != f4 || this.f20058p0.mo27798b() != f3) {
            this.f20062r0 = this.f20062r0.mo27871m().mo27891d(f).mo27897e(f2).mo27885c(f4).mo27879b(f3).mo27878a();
            m34087t();
        }
    }

    /* renamed from: b */
    public void mo28247b(C7075i iVar) {
        this.f20010Q0.remove(iVar);
    }

    /* renamed from: b */
    public void mo28245b() {
        this.f20010Q0.clear();
    }

    /* renamed from: b */
    public void mo28246b(C7074h hVar) {
        this.f20002M0.remove(hVar);
    }

    /* renamed from: b */
    private void m34074b(int i) {
        Iterator it = this.f20010Q0.iterator();
        while (it.hasNext()) {
            ((C7075i) it.next()).mo28401a(this, i);
        }
    }

    /* renamed from: b */
    private static void m34076b(@C0193h0 CheckableImageButton checkableImageButton, @C0195i0 OnLongClickListener onLongClickListener) {
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        m34066a(checkableImageButton, onLongClickListener);
    }

    /* access modifiers changed from: 0000 */
    @C0224v0
    /* renamed from: c */
    public boolean mo28249c() {
        return m34033D() && ((C7086c) this.f20058p0).mo22862E();
    }

    /* renamed from: a */
    private void m34069a(boolean z, boolean z2) {
        boolean isEnabled = isEnabled();
        EditText editText = this.f20007P;
        boolean z3 = true;
        boolean z4 = editText != null && !TextUtils.isEmpty(editText.getText());
        EditText editText2 = this.f20007P;
        if (editText2 == null || !editText2.hasFocus()) {
            z3 = false;
        }
        boolean d = this.f20011R.mo28443d();
        ColorStateList colorStateList = this.f20031b1;
        if (colorStateList != null) {
            this.f20055n1.mo27538a(colorStateList);
            this.f20055n1.mo27550b(this.f20031b1);
        }
        if (!isEnabled) {
            this.f20055n1.mo27538a(ColorStateList.valueOf(this.f20051l1));
            this.f20055n1.mo27550b(ColorStateList.valueOf(this.f20051l1));
        } else if (d) {
            this.f20055n1.mo27538a(this.f20011R.mo28447h());
        } else {
            if (this.f20017U) {
                TextView textView = this.f20019V;
                if (textView != null) {
                    this.f20055n1.mo27538a(textView.getTextColors());
                }
            }
            if (z3) {
                ColorStateList colorStateList2 = this.f20033c1;
                if (colorStateList2 != null) {
                    this.f20055n1.mo27538a(colorStateList2);
                }
            }
        }
        if (z4 || (isEnabled() && (z3 || d))) {
            if (z2 || this.f20053m1) {
                m34083c(z);
            }
        } else if (z2 || !this.f20053m1) {
            m34084d(z);
        }
    }

    /* renamed from: b */
    private void m34075b(@C0193h0 Canvas canvas) {
        if (this.f20052m0) {
            this.f20055n1.mo27539a(canvas);
        }
    }

    /* renamed from: b */
    private void m34077b(boolean z, boolean z2) {
        int defaultColor = this.f20041g1.getDefaultColor();
        int colorForState = this.f20041g1.getColorForState(new int[]{16843623, 16842910}, defaultColor);
        int colorForState2 = this.f20041g1.getColorForState(new int[]{16843518, 16842910}, defaultColor);
        if (z) {
            this.f20070y0 = colorForState2;
        } else if (z2) {
            this.f20070y0 = colorForState;
        } else {
            this.f20070y0 = defaultColor;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo28238a(int i) {
        boolean z = this.f20017U;
        int i2 = this.f20015T;
        if (i2 == -1) {
            this.f20019V.setText(String.valueOf(i));
            this.f20019V.setContentDescription(null);
            this.f20017U = false;
        } else {
            this.f20017U = i > i2;
            m34060a(getContext(), this.f20019V, i, this.f20015T, this.f20017U);
            if (z != this.f20017U) {
                m34048S();
            }
            this.f20019V.setText(getContext().getString(C5582R.string.character_counter_pattern, new Object[]{Integer.valueOf(i), Integer.valueOf(this.f20015T)}));
        }
        if (this.f20007P != null && z != this.f20017U) {
            mo28248b(false);
            mo28317r();
            mo28316q();
        }
    }

    /* renamed from: a */
    private static void m34060a(@C0193h0 Context context, @C0193h0 TextView textView, int i, int i2, boolean z) {
        textView.setContentDescription(context.getString(z ? C5582R.string.character_counter_overflowed_content_description : C5582R.string.character_counter_content_description, new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}));
    }

    /* renamed from: a */
    private static void m34063a(@C0193h0 ViewGroup viewGroup, boolean z) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            childAt.setEnabled(z);
            if (childAt instanceof ViewGroup) {
                m34063a((ViewGroup) childAt, z);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo28240a(@C0193h0 TextView textView, @C0216r0 int i) {
        boolean z = true;
        try {
            C1120m.m6391e(textView, i);
            if (VERSION.SDK_INT < 23 || textView.getTextColors().getDefaultColor() != -65281) {
                z = false;
            }
        } catch (Exception unused) {
        }
        if (z) {
            C1120m.m6391e(textView, C5582R.style.TextAppearance_AppCompat_Caption);
            textView.setTextColor(C0841b.m4915a(getContext(), C5582R.C5584color.design_error));
        }
    }

    @C0193h0
    /* renamed from: a */
    private Rect m34059a(@C0193h0 Rect rect) {
        if (this.f20007P != null) {
            Rect rect2 = this.f19991B0;
            boolean z = C0962e0.m5566x(this) == 1;
            rect2.bottom = rect.bottom;
            int i = this.f20065t0;
            if (i == 1) {
                rect2.left = m34056a(rect.left, z);
                rect2.top = rect.top + this.f20066u0;
                rect2.right = m34072b(rect.right, z);
                return rect2;
            } else if (i != 2) {
                rect2.left = rect.left + this.f20007P.getCompoundPaddingLeft();
                rect2.top = getPaddingTop();
                rect2.right = rect.right - this.f20007P.getCompoundPaddingRight();
                return rect2;
            } else {
                rect2.left = rect.left + this.f20007P.getPaddingLeft();
                rect2.top = rect.top - m34093z();
                rect2.right = rect.right - this.f20007P.getPaddingRight();
                return rect2;
            }
        } else {
            throw new IllegalStateException();
        }
    }

    /* renamed from: a */
    private int m34056a(int i, boolean z) {
        int compoundPaddingLeft = i + this.f20007P.getCompoundPaddingLeft();
        return (this.f20044i0 == null || z) ? compoundPaddingLeft : (compoundPaddingLeft - this.f20046j0.getMeasuredWidth()) + this.f20046j0.getPaddingLeft();
    }

    /* renamed from: a */
    private int m34057a(@C0193h0 Rect rect, float f) {
        if (m34038I()) {
            return (int) (((float) rect.centerY()) - (f / 2.0f));
        }
        return rect.top + this.f20007P.getCompoundPaddingTop();
    }

    /* renamed from: a */
    private int m34058a(@C0193h0 Rect rect, @C0193h0 Rect rect2, float f) {
        if (this.f20065t0 == 1) {
            return (int) (((float) rect2.top) + f);
        }
        return rect.bottom - this.f20007P.getCompoundPaddingBottom();
    }

    /* renamed from: a */
    public void mo28242a(C7075i iVar) {
        this.f20010Q0.add(iVar);
    }

    /* renamed from: a */
    public void mo28241a(@C0193h0 C7074h hVar) {
        this.f20002M0.add(hVar);
        if (this.f20007P != null) {
            hVar.mo28400a(this);
        }
    }

    /* renamed from: a */
    public void mo28235a() {
        this.f20002M0.clear();
    }

    @Deprecated
    /* renamed from: a */
    public void mo28243a(boolean z) {
        if (this.f20004N0 == 1) {
            this.f20008P0.performClick();
            if (z) {
                this.f20008P0.jumpDrawablesToCurrentState();
            }
        }
    }

    /* renamed from: a */
    private void m34067a(@C0193h0 CheckableImageButton checkableImageButton, boolean z, ColorStateList colorStateList, boolean z2, Mode mode) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (drawable != null && (z || z2)) {
            drawable = C0892a.m5161i(drawable).mutate();
            if (z) {
                C0892a.m5146a(drawable, colorStateList);
            }
            if (z2) {
                C0892a.m5149a(drawable, mode);
            }
        }
        if (checkableImageButton.getDrawable() != drawable) {
            checkableImageButton.setImageDrawable(drawable);
        }
    }

    /* renamed from: a */
    private static void m34065a(@C0193h0 CheckableImageButton checkableImageButton, @C0195i0 OnClickListener onClickListener, @C0195i0 OnLongClickListener onLongClickListener) {
        checkableImageButton.setOnClickListener(onClickListener);
        m34066a(checkableImageButton, onLongClickListener);
    }

    /* renamed from: a */
    private static void m34066a(@C0193h0 CheckableImageButton checkableImageButton, @C0195i0 OnLongClickListener onLongClickListener) {
        boolean d0 = C0962e0.m5493d0(checkableImageButton);
        boolean z = false;
        int i = 1;
        boolean z2 = onLongClickListener != null;
        if (d0 || z2) {
            z = true;
        }
        checkableImageButton.setFocusable(z);
        checkableImageButton.setClickable(d0);
        checkableImageButton.setPressable(d0);
        checkableImageButton.setLongClickable(z2);
        if (!z) {
            i = 2;
        }
        C0962e0.m5531l((View) checkableImageButton, i);
    }

    /* renamed from: a */
    private void m34061a(Canvas canvas) {
        C6978j jVar = this.f20060q0;
        if (jVar != null) {
            Rect bounds = jVar.getBounds();
            bounds.top = bounds.bottom - this.f20067v0;
            this.f20060q0.draw(canvas);
        }
    }

    /* renamed from: a */
    private void m34062a(@C0193h0 RectF rectF) {
        float f = rectF.left;
        int i = this.f20064s0;
        rectF.left = f - ((float) i);
        rectF.top -= (float) i;
        rectF.right += (float) i;
        rectF.bottom += (float) i;
    }

    /* renamed from: a */
    private void m34064a(CheckableImageButton checkableImageButton, ColorStateList colorStateList) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (checkableImageButton.getDrawable() != null && colorStateList != null && colorStateList.isStateful()) {
            int colorForState = colorStateList.getColorForState(getDrawableState(), colorStateList.getDefaultColor());
            Drawable mutate = C0892a.m5161i(drawable).mutate();
            C0892a.m5146a(mutate, ColorStateList.valueOf(colorForState));
            checkableImageButton.setImageDrawable(mutate);
        }
    }

    /* access modifiers changed from: 0000 */
    @C0224v0
    /* renamed from: a */
    public void mo28236a(float f) {
        if (this.f20055n1.mo27567m() != f) {
            if (this.f20059p1 == null) {
                this.f20059p1 = new ValueAnimator();
                this.f20059p1.setInterpolator(C5587a.f15930b);
                this.f20059p1.setDuration(167);
                this.f20059p1.addUpdateListener(new C7072d());
            }
            this.f20059p1.setFloatValues(new float[]{this.f20055n1.mo27567m(), f});
            this.f20059p1.start();
        }
    }
}
