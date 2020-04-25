package com.mrsool.utils;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.TextView.BufferType;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.content.C0841b;
import com.mrsool.C10232R;

public class ReadMoreTextView extends AppCompatTextView {

    /* renamed from: h0 */
    private static final int f32727h0 = 0;

    /* renamed from: i0 */
    private static final int f32728i0 = 1;

    /* renamed from: j0 */
    private static final int f32729j0 = 240;

    /* renamed from: k0 */
    private static final int f32730k0 = 10;

    /* renamed from: l0 */
    private static final int f32731l0 = -1;

    /* renamed from: m0 */
    private static final boolean f32732m0 = true;

    /* renamed from: n0 */
    private static final String f32733n0 = "... ";

    /* renamed from: P */
    private CharSequence f32734P;

    /* renamed from: Q */
    private BufferType f32735Q;

    /* renamed from: R */
    private boolean f32736R;

    /* renamed from: S */
    private int f32737S;

    /* renamed from: T */
    private CharSequence f32738T;

    /* renamed from: U */
    private CharSequence f32739U;

    /* renamed from: V */
    private C11564b f32740V;
    /* access modifiers changed from: private */

    /* renamed from: W */
    public int f32741W;

    /* renamed from: a0 */
    private boolean f32742a0;

    /* renamed from: b0 */
    private int f32743b0;

    /* renamed from: c0 */
    private int f32744c0;

    /* renamed from: d0 */
    private int f32745d0;

    /* renamed from: e0 */
    public C11565c f32746e0;

    /* renamed from: f0 */
    public C11564b f32747f0;

    /* renamed from: g0 */
    private boolean f32748g0;

    /* renamed from: com.mrsool.utils.ReadMoreTextView$a */
    class C11563a implements OnGlobalLayoutListener {
        C11563a() {
        }

        public void onGlobalLayout() {
            ReadMoreTextView.this.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            ReadMoreTextView.this.m52118h();
            ReadMoreTextView.this.m52119i();
        }
    }

    /* renamed from: com.mrsool.utils.ReadMoreTextView$b */
    private class C11564b extends ClickableSpan {
        private C11564b() {
        }

        public void onClick(View view) {
        }

        public void updateDrawState(TextPaint textPaint) {
            textPaint.setColor(ReadMoreTextView.this.f32741W);
        }

        /* synthetic */ C11564b(ReadMoreTextView readMoreTextView, C11563a aVar) {
            this();
        }
    }

    /* renamed from: com.mrsool.utils.ReadMoreTextView$c */
    public interface C11565c {
        /* renamed from: a */
        void mo39392a();

        /* renamed from: b */
        void mo39393b();

        /* renamed from: c */
        void mo39394c();
    }

    public ReadMoreTextView(Context context) {
        this(context, null);
    }

    /* renamed from: g */
    private void m52117g() {
        if (this.f32743b0 == 0) {
            getViewTreeObserver().addOnGlobalLayoutListener(new C11563a());
        }
    }

    private CharSequence getDisplayableText() {
        return m52114a(this.f32734P);
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public void m52118h() {
        try {
            if (getLayout() == null) {
                return;
            }
            if (this.f32745d0 == 0) {
                this.f32744c0 = getLayout().getLineEnd(0);
            } else if (this.f32745d0 <= 0 || getLineCount() < this.f32745d0) {
                this.f32744c0 = -1;
            } else {
                this.f32744c0 = getLayout().getLineEnd(this.f32745d0 - 1);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public void m52119i() {
        m52118h();
        super.setText(getDisplayableText(), this.f32735Q);
        setMovementMethod(LinkMovementMethod.getInstance());
        setHighlightColor(0);
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0058  */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.CharSequence m52120j() {
        /*
            r4 = this;
            java.lang.CharSequence r0 = r4.f32734P
            int r0 = r0.length()
            int r1 = r4.f32743b0
            r2 = 1
            if (r1 == 0) goto L_0x0012
            if (r1 == r2) goto L_0x000e
            goto L_0x0023
        L_0x000e:
            int r0 = r4.f32737S
        L_0x0010:
            int r0 = r0 + r2
            goto L_0x0023
        L_0x0012:
            int r0 = r4.f32744c0
            r1 = 4
            java.lang.CharSequence r3 = r4.f32738T
            int r3 = r3.length()
            int r1 = r1 + r3
            int r1 = r1 + r2
            int r0 = r0 - r1
            if (r0 >= 0) goto L_0x0023
            int r0 = r4.f32737S
            goto L_0x0010
        L_0x0023:
            java.lang.CharSequence r1 = r4.f32734P
            int r1 = r1.length()
            r3 = 0
            if (r0 <= r1) goto L_0x0058
            com.mrsool.utils.ReadMoreTextView$c r0 = r4.f32746e0
            r0.mo39392a()
            r4.f32748g0 = r2
            java.lang.CharSequence r0 = r4.f32734P
            int r0 = r0.length()
            int r0 = r0 - r2
            r4.setTrimLines(r3)
            r4.m52118h()
            java.lang.String r1 = ""
            r4.f32738T = r1
            android.text.SpannableStringBuilder r1 = new android.text.SpannableStringBuilder
            java.lang.CharSequence r2 = r4.f32734P
            r1.<init>(r2, r3, r0)
            java.lang.CharSequence r0 = r4.f32738T
            android.text.SpannableStringBuilder r0 = r1.append(r0)
            java.lang.CharSequence r1 = r4.f32738T
            java.lang.CharSequence r0 = r4.m52113a(r0, r1)
            return r0
        L_0x0058:
            android.text.SpannableStringBuilder r1 = new android.text.SpannableStringBuilder
            java.lang.CharSequence r2 = r4.f32734P
            r1.<init>(r2, r3, r0)
            java.lang.String r0 = "... "
            android.text.SpannableStringBuilder r0 = r1.append(r0)
            java.lang.CharSequence r1 = r4.f32738T
            android.text.SpannableStringBuilder r0 = r0.append(r1)
            java.lang.CharSequence r1 = r4.f32738T
            java.lang.CharSequence r0 = r4.m52113a(r0, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mrsool.utils.ReadMoreTextView.m52120j():java.lang.CharSequence");
    }

    /* renamed from: k */
    private CharSequence m52121k() {
        if (!this.f32742a0) {
            return this.f32734P;
        }
        C11565c cVar = this.f32746e0;
        if (cVar != null) {
            cVar.mo39393b();
        }
        CharSequence charSequence = this.f32734P;
        return m52113a(new SpannableStringBuilder(charSequence, 0, charSequence.length()).append(this.f32739U), this.f32739U);
    }

    /* renamed from: e */
    public void mo1393e() {
        this.f32736R = false;
        m52118h();
        m52119i();
    }

    /* renamed from: f */
    public void mo39696f() {
        if (!this.f32748g0) {
            this.f32736R = !this.f32736R;
            m52119i();
        }
    }

    public C11565c getmOnCollapseExpandListner() {
        return this.f32746e0;
    }

    public void setColorClickableText(int i) {
        this.f32741W = i;
    }

    public void setText(CharSequence charSequence, BufferType bufferType) {
        this.f32734P = charSequence;
        this.f32735Q = bufferType;
        m52119i();
    }

    public void setTrimCollapsedText(CharSequence charSequence) {
        this.f32738T = charSequence;
    }

    public void setTrimExpandedText(CharSequence charSequence) {
        this.f32739U = charSequence;
    }

    public void setTrimLength(int i) {
        this.f32737S = i;
        m52119i();
    }

    public void setTrimLines(int i) {
        this.f32745d0 = i;
    }

    public void setTrimMode(int i) {
        this.f32743b0 = i;
    }

    public void setmOnCollapseExpandListner(C11565c cVar) {
        this.f32746e0 = cVar;
    }

    public ReadMoreTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f32736R = true;
        this.f32744c0 = -1;
        this.f32748g0 = false;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C10232R.styleable.ReadMoreTextView);
        this.f32737S = obtainStyledAttributes.getInt(4, f32729j0);
        int resourceId = obtainStyledAttributes.getResourceId(2, C10232R.string.lbl_read_more);
        int resourceId2 = obtainStyledAttributes.getResourceId(3, C10232R.string.lbl_read_less);
        this.f32738T = getResources().getString(resourceId);
        this.f32739U = getResources().getString(resourceId2);
        this.f32745d0 = obtainStyledAttributes.getInt(5, 10);
        this.f32741W = obtainStyledAttributes.getColor(0, C0841b.m4915a(context, (int) C10232R.C10234color.colorAccent));
        this.f32742a0 = obtainStyledAttributes.getBoolean(1, true);
        this.f32743b0 = obtainStyledAttributes.getInt(6, 0);
        obtainStyledAttributes.recycle();
        this.f32740V = new C11564b(this, null);
        m52117g();
        m52119i();
    }

    /* renamed from: a */
    private CharSequence m52114a(CharSequence charSequence) {
        if (this.f32743b0 != 1 || charSequence == null || charSequence.length() <= this.f32737S) {
            if (this.f32743b0 == 0 && charSequence != null && this.f32744c0 > 0) {
                if (!this.f32736R) {
                    charSequence = m52121k();
                } else if (getLayout().getLineCount() > this.f32745d0) {
                    return m52120j();
                }
            }
            return charSequence;
        } else if (this.f32736R) {
            return m52120j();
        } else {
            return m52121k();
        }
    }

    /* renamed from: a */
    private CharSequence m52113a(SpannableStringBuilder spannableStringBuilder, CharSequence charSequence) {
        spannableStringBuilder.setSpan(this.f32740V, spannableStringBuilder.length() - charSequence.length(), spannableStringBuilder.length(), 33);
        return spannableStringBuilder;
    }
}
