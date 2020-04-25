package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import androidx.annotation.C0207n0;
import androidx.annotation.C0207n0.C0208a;
import androidx.appcompat.C0238R;
import androidx.appcompat.view.menu.C0370g.C0372b;
import androidx.appcompat.view.menu.C0388o.C0389a;
import androidx.appcompat.widget.ActionMenuView.C0411a;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.C0486d0;
import androidx.appcompat.widget.C0557v0;
import p076c.p112d.p148d.p150g.C6637f;

@C0207n0({C0208a.LIBRARY_GROUP_PREFIX})
public class ActionMenuItemView extends AppCompatTextView implements C0389a, OnClickListener, C0411a {

    /* renamed from: d0 */
    private static final String f1195d0 = "ActionMenuItemView";

    /* renamed from: e0 */
    private static final int f1196e0 = 32;

    /* renamed from: P */
    C0375j f1197P;

    /* renamed from: Q */
    private CharSequence f1198Q;

    /* renamed from: R */
    private Drawable f1199R;

    /* renamed from: S */
    C0372b f1200S;

    /* renamed from: T */
    private C0486d0 f1201T;

    /* renamed from: U */
    C0356b f1202U;

    /* renamed from: V */
    private boolean f1203V;

    /* renamed from: W */
    private boolean f1204W;

    /* renamed from: a0 */
    private int f1205a0;

    /* renamed from: b0 */
    private int f1206b0;

    /* renamed from: c0 */
    private int f1207c0;

    /* renamed from: androidx.appcompat.view.menu.ActionMenuItemView$a */
    private class C0355a extends C0486d0 {
        public C0355a() {
            super(ActionMenuItemView.this);
        }

        /* renamed from: a */
        public C0391q mo1408a() {
            C0356b bVar = ActionMenuItemView.this.f1202U;
            if (bVar != null) {
                return bVar.mo1410a();
            }
            return null;
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public boolean mo1409b() {
            ActionMenuItemView actionMenuItemView = ActionMenuItemView.this;
            C0372b bVar = actionMenuItemView.f1200S;
            if (bVar == null || !bVar.mo1412a(actionMenuItemView.f1197P)) {
                return false;
            }
            C0391q a = mo1408a();
            if (a == null || !a.mo1515d()) {
                return false;
            }
            return true;
        }
    }

    /* renamed from: androidx.appcompat.view.menu.ActionMenuItemView$b */
    public static abstract class C0356b {
        /* renamed from: a */
        public abstract C0391q mo1410a();
    }

    public ActionMenuItemView(Context context) {
        this(context, null);
    }

    /* renamed from: f */
    private boolean m1955f() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i = configuration.screenWidthDp;
        return i >= 480 || (i >= 640 && configuration.screenHeightDp >= 480) || configuration.orientation == 2;
    }

    /* renamed from: g */
    private void m1956g() {
        CharSequence charSequence;
        boolean z = true;
        boolean z2 = !TextUtils.isEmpty(this.f1198Q);
        if (this.f1199R != null && (!this.f1197P.mo1677p() || (!this.f1203V && !this.f1204W))) {
            z = false;
        }
        boolean z3 = z2 & z;
        CharSequence charSequence2 = null;
        setText(z3 ? this.f1198Q : null);
        CharSequence contentDescription = this.f1197P.getContentDescription();
        if (TextUtils.isEmpty(contentDescription)) {
            if (z3) {
                charSequence = null;
            } else {
                charSequence = this.f1197P.getTitle();
            }
            setContentDescription(charSequence);
        } else {
            setContentDescription(contentDescription);
        }
        CharSequence tooltipText = this.f1197P.getTooltipText();
        if (TextUtils.isEmpty(tooltipText)) {
            if (!z3) {
                charSequence2 = this.f1197P.getTitle();
            }
            C0557v0.m3031a(this, charSequence2);
            return;
        }
        C0557v0.m3031a(this, tooltipText);
    }

    /* renamed from: a */
    public void mo1387a(C0375j jVar, int i) {
        this.f1197P = jVar;
        setIcon(jVar.getIcon());
        setTitle(jVar.mo1640a((C0389a) this));
        setId(jVar.getItemId());
        setVisibility(jVar.isVisible() ? 0 : 8);
        setEnabled(jVar.isEnabled());
        if (jVar.hasSubMenu() && this.f1201T == null) {
            this.f1201T = new C0355a();
        }
    }

    /* renamed from: a */
    public void mo1388a(boolean z, char c) {
    }

    /* renamed from: a */
    public boolean mo1389a() {
        return true;
    }

    /* renamed from: b */
    public boolean mo1390b() {
        return true;
    }

    /* renamed from: c */
    public boolean mo1391c() {
        return mo1393e();
    }

    /* renamed from: d */
    public boolean mo1392d() {
        return mo1393e() && this.f1197P.getIcon() == null;
    }

    /* renamed from: e */
    public boolean mo1393e() {
        return !TextUtils.isEmpty(getText());
    }

    public C0375j getItemData() {
        return this.f1197P;
    }

    public void onClick(View view) {
        C0372b bVar = this.f1200S;
        if (bVar != null) {
            bVar.mo1412a(this.f1197P);
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f1203V = m1955f();
        m1956g();
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        boolean e = mo1393e();
        if (e) {
            int i3 = this.f1206b0;
            if (i3 >= 0) {
                super.setPadding(i3, getPaddingTop(), getPaddingRight(), getPaddingBottom());
            }
        }
        super.onMeasure(i, i2);
        int mode = MeasureSpec.getMode(i);
        int size = MeasureSpec.getSize(i);
        int measuredWidth = getMeasuredWidth();
        int min = mode == Integer.MIN_VALUE ? Math.min(size, this.f1205a0) : this.f1205a0;
        if (mode != 1073741824 && this.f1205a0 > 0 && measuredWidth < min) {
            super.onMeasure(MeasureSpec.makeMeasureSpec(min, C6637f.f18605b), i2);
        }
        if (!e && this.f1199R != null) {
            super.setPadding((getMeasuredWidth() - this.f1199R.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f1197P.hasSubMenu()) {
            C0486d0 d0Var = this.f1201T;
            if (d0Var != null && d0Var.onTouch(this, motionEvent)) {
                return true;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setCheckable(boolean z) {
    }

    public void setChecked(boolean z) {
    }

    public void setExpandedFormat(boolean z) {
        if (this.f1204W != z) {
            this.f1204W = z;
            C0375j jVar = this.f1197P;
            if (jVar != null) {
                jVar.mo1646d();
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.f1199R = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i = this.f1207c0;
            if (intrinsicWidth > i) {
                intrinsicHeight = (int) (((float) intrinsicHeight) * (((float) i) / ((float) intrinsicWidth)));
                intrinsicWidth = i;
            }
            int i2 = this.f1207c0;
            if (intrinsicHeight > i2) {
                intrinsicWidth = (int) (((float) intrinsicWidth) * (((float) i2) / ((float) intrinsicHeight)));
                intrinsicHeight = i2;
            }
            drawable.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
        }
        setCompoundDrawables(drawable, null, null, null);
        m1956g();
    }

    public void setItemInvoker(C0372b bVar) {
        this.f1200S = bVar;
    }

    public void setPadding(int i, int i2, int i3, int i4) {
        this.f1206b0 = i;
        super.setPadding(i, i2, i3, i4);
    }

    public void setPopupCallback(C0356b bVar) {
        this.f1202U = bVar;
    }

    public void setTitle(CharSequence charSequence) {
        this.f1198Q = charSequence;
        m1956g();
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Resources resources = context.getResources();
        this.f1203V = m1955f();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0238R.styleable.ActionMenuItemView, i, 0);
        this.f1205a0 = obtainStyledAttributes.getDimensionPixelSize(C0238R.styleable.ActionMenuItemView_android_minWidth, 0);
        obtainStyledAttributes.recycle();
        this.f1207c0 = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.f1206b0 = -1;
        setSaveEnabled(false);
    }
}
