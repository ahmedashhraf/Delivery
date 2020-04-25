package androidx.appcompat.widget;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.WindowManager.LayoutParams;
import android.widget.TextView;
import androidx.annotation.C0207n0;
import androidx.annotation.C0207n0.C0208a;
import androidx.appcompat.C0238R;

@C0207n0({C0208a.LIBRARY_GROUP_PREFIX})
/* renamed from: androidx.appcompat.widget.x0 */
/* compiled from: TooltipPopup */
class C0563x0 {

    /* renamed from: h */
    private static final String f2282h = "TooltipPopup";

    /* renamed from: a */
    private final Context f2283a;

    /* renamed from: b */
    private final View f2284b;

    /* renamed from: c */
    private final TextView f2285c;

    /* renamed from: d */
    private final LayoutParams f2286d = new LayoutParams();

    /* renamed from: e */
    private final Rect f2287e = new Rect();

    /* renamed from: f */
    private final int[] f2288f = new int[2];

    /* renamed from: g */
    private final int[] f2289g = new int[2];

    C0563x0(Context context) {
        this.f2283a = context;
        this.f2284b = LayoutInflater.from(this.f2283a).inflate(C0238R.layout.abc_tooltip, null);
        this.f2285c = (TextView) this.f2284b.findViewById(C0238R.C0241id.message);
        this.f2286d.setTitle(C0563x0.class.getSimpleName());
        this.f2286d.packageName = this.f2283a.getPackageName();
        LayoutParams layoutParams = this.f2286d;
        layoutParams.type = 1002;
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.windowAnimations = C0238R.style.Animation_AppCompat_Tooltip;
        layoutParams.flags = 24;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo3003a(View view, int i, int i2, boolean z, CharSequence charSequence) {
        if (mo3004b()) {
            mo3002a();
        }
        this.f2285c.setText(charSequence);
        m3072a(view, i, i2, z, this.f2286d);
        ((WindowManager) this.f2283a.getSystemService("window")).addView(this.f2284b, this.f2286d);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public boolean mo3004b() {
        return this.f2284b.getParent() != null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo3002a() {
        if (mo3004b()) {
            ((WindowManager) this.f2283a.getSystemService("window")).removeView(this.f2284b);
        }
    }

    /* renamed from: a */
    private void m3072a(View view, int i, int i2, boolean z, LayoutParams layoutParams) {
        int i3;
        int i4;
        layoutParams.token = view.getApplicationWindowToken();
        int dimensionPixelOffset = this.f2283a.getResources().getDimensionPixelOffset(C0238R.dimen.tooltip_precise_anchor_threshold);
        if (view.getWidth() < dimensionPixelOffset) {
            i = view.getWidth() / 2;
        }
        if (view.getHeight() >= dimensionPixelOffset) {
            int dimensionPixelOffset2 = this.f2283a.getResources().getDimensionPixelOffset(C0238R.dimen.tooltip_precise_anchor_extra_offset);
            i4 = i2 + dimensionPixelOffset2;
            i3 = i2 - dimensionPixelOffset2;
        } else {
            i4 = view.getHeight();
            i3 = 0;
        }
        layoutParams.gravity = 49;
        int dimensionPixelOffset3 = this.f2283a.getResources().getDimensionPixelOffset(z ? C0238R.dimen.tooltip_y_offset_touch : C0238R.dimen.tooltip_y_offset_non_touch);
        View a = m3071a(view);
        if (a != null) {
            a.getWindowVisibleDisplayFrame(this.f2287e);
            Rect rect = this.f2287e;
            if (rect.left < 0 && rect.top < 0) {
                Resources resources = this.f2283a.getResources();
                int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
                int dimensionPixelSize = identifier != 0 ? resources.getDimensionPixelSize(identifier) : 0;
                DisplayMetrics displayMetrics = resources.getDisplayMetrics();
                this.f2287e.set(0, dimensionPixelSize, displayMetrics.widthPixels, displayMetrics.heightPixels);
            }
            a.getLocationOnScreen(this.f2289g);
            view.getLocationOnScreen(this.f2288f);
            int[] iArr = this.f2288f;
            int i5 = iArr[0];
            int[] iArr2 = this.f2289g;
            iArr[0] = i5 - iArr2[0];
            iArr[1] = iArr[1] - iArr2[1];
            layoutParams.x = (iArr[0] + i) - (a.getWidth() / 2);
            int makeMeasureSpec = MeasureSpec.makeMeasureSpec(0, 0);
            this.f2284b.measure(makeMeasureSpec, makeMeasureSpec);
            int measuredHeight = this.f2284b.getMeasuredHeight();
            int[] iArr3 = this.f2288f;
            int i6 = ((iArr3[1] + i3) - dimensionPixelOffset3) - measuredHeight;
            int i7 = iArr3[1] + i4 + dimensionPixelOffset3;
            if (z) {
                if (i6 >= 0) {
                    layoutParams.y = i6;
                } else {
                    layoutParams.y = i7;
                }
            } else if (measuredHeight + i7 <= this.f2287e.height()) {
                layoutParams.y = i7;
            } else {
                layoutParams.y = i6;
            }
        }
    }

    /* renamed from: a */
    private static View m3071a(View view) {
        View rootView = view.getRootView();
        ViewGroup.LayoutParams layoutParams = rootView.getLayoutParams();
        if ((layoutParams instanceof LayoutParams) && ((LayoutParams) layoutParams).type == 2) {
            return rootView;
        }
        for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                return ((Activity) context).getWindow().getDecorView();
            }
        }
        return rootView;
    }
}
