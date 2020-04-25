package androidx.appcompat.widget;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.AccessibilityDelegate;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.BaseAdapter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.PopupWindow.OnDismissListener;
import android.widget.TextView;
import androidx.annotation.C0207n0;
import androidx.annotation.C0207n0.C0208a;
import androidx.appcompat.C0238R;
import androidx.appcompat.view.menu.C0391q;
import androidx.appcompat.widget.C0475c.C0476a;
import androidx.core.p034l.C0950b;
import androidx.core.p034l.p035o0.C1016d;
import p076c.p112d.p148d.p150g.C6637f;

@C0207n0({C0208a.LIBRARY_GROUP_PREFIX})
public class ActivityChooserView extends ViewGroup implements C0476a {

    /* renamed from: g0 */
    private static final String f1574g0 = "ActivityChooserView";

    /* renamed from: N */
    private final View f1575N;

    /* renamed from: O */
    private final Drawable f1576O;

    /* renamed from: P */
    final FrameLayout f1577P;

    /* renamed from: Q */
    private final ImageView f1578Q;

    /* renamed from: R */
    final FrameLayout f1579R;

    /* renamed from: S */
    private final ImageView f1580S;

    /* renamed from: T */
    private final int f1581T;

    /* renamed from: U */
    C0950b f1582U;

    /* renamed from: V */
    final DataSetObserver f1583V;

    /* renamed from: W */
    private final OnGlobalLayoutListener f1584W;

    /* renamed from: a */
    final C0421f f1585a;

    /* renamed from: a0 */
    private C0495f0 f1586a0;

    /* renamed from: b */
    private final C0422g f1587b;

    /* renamed from: b0 */
    OnDismissListener f1588b0;

    /* renamed from: c0 */
    boolean f1589c0;

    /* renamed from: d0 */
    int f1590d0;

    /* renamed from: e0 */
    private boolean f1591e0;

    /* renamed from: f0 */
    private int f1592f0;

    @C0207n0({C0208a.LIBRARY_GROUP_PREFIX})
    public static class InnerLayout extends LinearLayout {

        /* renamed from: a */
        private static final int[] f1593a = {16842964};

        public InnerLayout(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            C0549t0 a = C0549t0.m2909a(context, attributeSet, f1593a);
            setBackgroundDrawable(a.mo2875b(0));
            a.mo2887f();
        }
    }

    /* renamed from: androidx.appcompat.widget.ActivityChooserView$a */
    class C0416a extends DataSetObserver {
        C0416a() {
        }

        public void onChanged() {
            super.onChanged();
            ActivityChooserView.this.f1585a.notifyDataSetChanged();
        }

        public void onInvalidated() {
            super.onInvalidated();
            ActivityChooserView.this.f1585a.notifyDataSetInvalidated();
        }
    }

    /* renamed from: androidx.appcompat.widget.ActivityChooserView$b */
    class C0417b implements OnGlobalLayoutListener {
        C0417b() {
        }

        public void onGlobalLayout() {
            if (!ActivityChooserView.this.mo1999b()) {
                return;
            }
            if (!ActivityChooserView.this.isShown()) {
                ActivityChooserView.this.getListPopupWindow().dismiss();
                return;
            }
            ActivityChooserView.this.getListPopupWindow().mo1509b();
            C0950b bVar = ActivityChooserView.this.f1582U;
            if (bVar != null) {
                bVar.mo4767a(true);
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.ActivityChooserView$c */
    class C0418c extends AccessibilityDelegate {
        C0418c() {
        }

        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
            C1016d.m5806a(accessibilityNodeInfo).mo4950b(true);
        }
    }

    /* renamed from: androidx.appcompat.widget.ActivityChooserView$d */
    class C0419d extends C0486d0 {
        C0419d(View view) {
            super(view);
        }

        /* renamed from: a */
        public C0391q mo1408a() {
            return ActivityChooserView.this.getListPopupWindow();
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public boolean mo1409b() {
            ActivityChooserView.this.mo2000c();
            return true;
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public boolean mo1967c() {
            ActivityChooserView.this.mo1998a();
            return true;
        }
    }

    /* renamed from: androidx.appcompat.widget.ActivityChooserView$e */
    class C0420e extends DataSetObserver {
        C0420e() {
        }

        public void onChanged() {
            super.onChanged();
            ActivityChooserView.this.mo2001d();
        }
    }

    /* renamed from: androidx.appcompat.widget.ActivityChooserView$f */
    private class C0421f extends BaseAdapter {

        /* renamed from: R */
        public static final int f1599R = Integer.MAX_VALUE;

        /* renamed from: S */
        public static final int f1600S = 4;

        /* renamed from: T */
        private static final int f1601T = 0;

        /* renamed from: U */
        private static final int f1602U = 1;

        /* renamed from: V */
        private static final int f1603V = 3;

        /* renamed from: N */
        private boolean f1604N;

        /* renamed from: O */
        private boolean f1605O;

        /* renamed from: P */
        private boolean f1606P;

        /* renamed from: a */
        private C0475c f1608a;

        /* renamed from: b */
        private int f1609b = 4;

        C0421f() {
        }

        /* renamed from: a */
        public void mo2022a(C0475c cVar) {
            C0475c b = ActivityChooserView.this.f1585a.mo2025b();
            if (b != null && ActivityChooserView.this.isShown()) {
                b.unregisterObserver(ActivityChooserView.this.f1583V);
            }
            this.f1608a = cVar;
            if (cVar != null && ActivityChooserView.this.isShown()) {
                cVar.registerObserver(ActivityChooserView.this.f1583V);
            }
            notifyDataSetChanged();
        }

        /* renamed from: b */
        public C0475c mo2025b() {
            return this.f1608a;
        }

        /* renamed from: c */
        public ResolveInfo mo2026c() {
            return this.f1608a.mo2496b();
        }

        /* renamed from: d */
        public int mo2027d() {
            return this.f1608a.mo2500d();
        }

        /* renamed from: e */
        public boolean mo2028e() {
            return this.f1604N;
        }

        /* renamed from: f */
        public int mo2029f() {
            int i = this.f1609b;
            this.f1609b = Integer.MAX_VALUE;
            int makeMeasureSpec = MeasureSpec.makeMeasureSpec(0, 0);
            int makeMeasureSpec2 = MeasureSpec.makeMeasureSpec(0, 0);
            int count = getCount();
            View view = null;
            int i2 = 0;
            for (int i3 = 0; i3 < count; i3++) {
                view = getView(i3, view, null);
                view.measure(makeMeasureSpec, makeMeasureSpec2);
                i2 = Math.max(i2, view.getMeasuredWidth());
            }
            this.f1609b = i;
            return i2;
        }

        public int getCount() {
            int a = this.f1608a.mo2490a();
            if (!this.f1604N && this.f1608a.mo2496b() != null) {
                a--;
            }
            int min = Math.min(a, this.f1609b);
            return this.f1606P ? min + 1 : min;
        }

        public Object getItem(int i) {
            int itemViewType = getItemViewType(i);
            if (itemViewType == 0) {
                if (!this.f1604N && this.f1608a.mo2496b() != null) {
                    i++;
                }
                return this.f1608a.mo2497b(i);
            } else if (itemViewType == 1) {
                return null;
            } else {
                throw new IllegalArgumentException();
            }
        }

        public long getItemId(int i) {
            return (long) i;
        }

        public int getItemViewType(int i) {
            return (!this.f1606P || i != getCount() - 1) ? 0 : 1;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            int itemViewType = getItemViewType(i);
            if (itemViewType == 0) {
                if (view == null || view.getId() != C0238R.C0241id.list_item) {
                    view = LayoutInflater.from(ActivityChooserView.this.getContext()).inflate(C0238R.layout.abc_activity_chooser_view_list_item, viewGroup, false);
                }
                PackageManager packageManager = ActivityChooserView.this.getContext().getPackageManager();
                ResolveInfo resolveInfo = (ResolveInfo) getItem(i);
                ((ImageView) view.findViewById(C0238R.C0241id.icon)).setImageDrawable(resolveInfo.loadIcon(packageManager));
                ((TextView) view.findViewById(C0238R.C0241id.title)).setText(resolveInfo.loadLabel(packageManager));
                if (!this.f1604N || i != 0 || !this.f1605O) {
                    view.setActivated(false);
                } else {
                    view.setActivated(true);
                }
                return view;
            } else if (itemViewType == 1) {
                if (view == null || view.getId() != 1) {
                    view = LayoutInflater.from(ActivityChooserView.this.getContext()).inflate(C0238R.layout.abc_activity_chooser_view_list_item, viewGroup, false);
                    view.setId(1);
                    ((TextView) view.findViewById(C0238R.C0241id.title)).setText(ActivityChooserView.this.getContext().getString(C0238R.string.abc_activity_chooser_view_see_all));
                }
                return view;
            } else {
                throw new IllegalArgumentException();
            }
        }

        public int getViewTypeCount() {
            return 3;
        }

        /* renamed from: a */
        public void mo2021a(int i) {
            if (this.f1609b != i) {
                this.f1609b = i;
                notifyDataSetChanged();
            }
        }

        /* renamed from: a */
        public void mo2023a(boolean z) {
            if (this.f1606P != z) {
                this.f1606P = z;
                notifyDataSetChanged();
            }
        }

        /* renamed from: a */
        public int mo2020a() {
            return this.f1608a.mo2490a();
        }

        /* renamed from: a */
        public void mo2024a(boolean z, boolean z2) {
            if (this.f1604N != z || this.f1605O != z2) {
                this.f1604N = z;
                this.f1605O = z2;
                notifyDataSetChanged();
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.ActivityChooserView$g */
    private class C0422g implements OnItemClickListener, OnClickListener, OnLongClickListener, OnDismissListener {
        C0422g() {
        }

        /* renamed from: a */
        private void m2395a() {
            OnDismissListener onDismissListener = ActivityChooserView.this.f1588b0;
            if (onDismissListener != null) {
                onDismissListener.onDismiss();
            }
        }

        public void onClick(View view) {
            ActivityChooserView activityChooserView = ActivityChooserView.this;
            if (view == activityChooserView.f1579R) {
                activityChooserView.mo1998a();
                Intent a = ActivityChooserView.this.f1585a.mo2025b().mo2492a(ActivityChooserView.this.f1585a.mo2025b().mo2491a(ActivityChooserView.this.f1585a.mo2026c()));
                if (a != null) {
                    a.addFlags(524288);
                    ActivityChooserView.this.getContext().startActivity(a);
                }
            } else if (view == activityChooserView.f1577P) {
                activityChooserView.f1589c0 = false;
                activityChooserView.mo1997a(activityChooserView.f1590d0);
            } else {
                throw new IllegalArgumentException();
            }
        }

        public void onDismiss() {
            m2395a();
            C0950b bVar = ActivityChooserView.this.f1582U;
            if (bVar != null) {
                bVar.mo4767a(false);
            }
        }

        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            int itemViewType = ((C0421f) adapterView.getAdapter()).getItemViewType(i);
            if (itemViewType == 0) {
                ActivityChooserView.this.mo1998a();
                ActivityChooserView activityChooserView = ActivityChooserView.this;
                if (!activityChooserView.f1589c0) {
                    if (!activityChooserView.f1585a.mo2028e()) {
                        i++;
                    }
                    Intent a = ActivityChooserView.this.f1585a.mo2025b().mo2492a(i);
                    if (a != null) {
                        a.addFlags(524288);
                        ActivityChooserView.this.getContext().startActivity(a);
                    }
                } else if (i > 0) {
                    activityChooserView.f1585a.mo2025b().mo2499c(i);
                }
            } else if (itemViewType == 1) {
                ActivityChooserView.this.mo1997a(Integer.MAX_VALUE);
            } else {
                throw new IllegalArgumentException();
            }
        }

        public boolean onLongClick(View view) {
            ActivityChooserView activityChooserView = ActivityChooserView.this;
            if (view == activityChooserView.f1579R) {
                if (activityChooserView.f1585a.getCount() > 0) {
                    ActivityChooserView activityChooserView2 = ActivityChooserView.this;
                    activityChooserView2.f1589c0 = true;
                    activityChooserView2.mo1997a(activityChooserView2.f1590d0);
                }
                return true;
            }
            throw new IllegalArgumentException();
        }
    }

    public ActivityChooserView(Context context) {
        this(context, null);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo1997a(int i) {
        if (this.f1585a.mo2025b() != null) {
            getViewTreeObserver().addOnGlobalLayoutListener(this.f1584W);
            boolean z = this.f1579R.getVisibility() == 0;
            int a = this.f1585a.mo2020a();
            if (i == Integer.MAX_VALUE || a <= i + (z ? 1 : 0)) {
                this.f1585a.mo2023a(false);
                this.f1585a.mo2021a(i);
            } else {
                this.f1585a.mo2023a(true);
                this.f1585a.mo2021a(i - 1);
            }
            C0495f0 listPopupWindow = getListPopupWindow();
            if (!listPopupWindow.mo1515d()) {
                if (this.f1589c0 || !z) {
                    this.f1585a.mo2024a(true, z);
                } else {
                    this.f1585a.mo2024a(false, false);
                }
                listPopupWindow.mo2611f(Math.min(this.f1585a.mo2029f(), this.f1581T));
                listPopupWindow.mo1509b();
                C0950b bVar = this.f1582U;
                if (bVar != null) {
                    bVar.mo4767a(true);
                }
                listPopupWindow.mo1518f().setContentDescription(getContext().getString(C0238R.string.abc_activitychooserview_choose_application));
                listPopupWindow.mo1518f().setSelector(new ColorDrawable(0));
                return;
            }
            return;
        }
        throw new IllegalStateException("No data model. Did you call #setDataModel?");
    }

    /* renamed from: b */
    public boolean mo1999b() {
        return getListPopupWindow().mo1515d();
    }

    /* renamed from: c */
    public boolean mo2000c() {
        if (mo1999b() || !this.f1591e0) {
            return false;
        }
        this.f1589c0 = false;
        mo1997a(this.f1590d0);
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public void mo2001d() {
        if (this.f1585a.getCount() > 0) {
            this.f1577P.setEnabled(true);
        } else {
            this.f1577P.setEnabled(false);
        }
        int a = this.f1585a.mo2020a();
        int d = this.f1585a.mo2027d();
        if (a == 1 || (a > 1 && d > 0)) {
            this.f1579R.setVisibility(0);
            ResolveInfo c = this.f1585a.mo2026c();
            PackageManager packageManager = getContext().getPackageManager();
            this.f1580S.setImageDrawable(c.loadIcon(packageManager));
            if (this.f1592f0 != 0) {
                CharSequence loadLabel = c.loadLabel(packageManager);
                this.f1579R.setContentDescription(getContext().getString(this.f1592f0, new Object[]{loadLabel}));
            }
        } else {
            this.f1579R.setVisibility(8);
        }
        if (this.f1579R.getVisibility() == 0) {
            this.f1575N.setBackgroundDrawable(this.f1576O);
        } else {
            this.f1575N.setBackgroundDrawable(null);
        }
    }

    public C0475c getDataModel() {
        return this.f1585a.mo2025b();
    }

    /* access modifiers changed from: 0000 */
    public C0495f0 getListPopupWindow() {
        if (this.f1586a0 == null) {
            this.f1586a0 = new C0495f0(getContext());
            this.f1586a0.mo2100a((ListAdapter) this.f1585a);
            this.f1586a0.mo2601b((View) this);
            this.f1586a0.mo2605c(true);
            this.f1586a0.mo2594a((OnItemClickListener) this.f1587b);
            this.f1586a0.mo2596a((OnDismissListener) this.f1587b);
        }
        return this.f1586a0;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        C0475c b = this.f1585a.mo2025b();
        if (b != null) {
            b.registerObserver(this.f1583V);
        }
        this.f1591e0 = true;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C0475c b = this.f1585a.mo2025b();
        if (b != null) {
            b.unregisterObserver(this.f1583V);
        }
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeGlobalOnLayoutListener(this.f1584W);
        }
        if (mo1999b()) {
            mo1998a();
        }
        this.f1591e0 = false;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.f1575N.layout(0, 0, i3 - i, i4 - i2);
        if (!mo1999b()) {
            mo1998a();
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        View view = this.f1575N;
        if (this.f1579R.getVisibility() != 0) {
            i2 = MeasureSpec.makeMeasureSpec(MeasureSpec.getSize(i2), C6637f.f18605b);
        }
        measureChild(view, i, i2);
        setMeasuredDimension(view.getMeasuredWidth(), view.getMeasuredHeight());
    }

    public void setActivityChooserModel(C0475c cVar) {
        this.f1585a.mo2022a(cVar);
        if (mo1999b()) {
            mo1998a();
            mo2000c();
        }
    }

    public void setDefaultActionButtonContentDescription(int i) {
        this.f1592f0 = i;
    }

    public void setExpandActivityOverflowButtonContentDescription(int i) {
        this.f1578Q.setContentDescription(getContext().getString(i));
    }

    public void setExpandActivityOverflowButtonDrawable(Drawable drawable) {
        this.f1578Q.setImageDrawable(drawable);
    }

    public void setInitialActivityCount(int i) {
        this.f1590d0 = i;
    }

    public void setOnDismissListener(OnDismissListener onDismissListener) {
        this.f1588b0 = onDismissListener;
    }

    @C0207n0({C0208a.LIBRARY_GROUP_PREFIX})
    public void setProvider(C0950b bVar) {
        this.f1582U = bVar;
    }

    public ActivityChooserView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ActivityChooserView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1583V = new C0416a();
        this.f1584W = new C0417b();
        this.f1590d0 = 4;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0238R.styleable.ActivityChooserView, i, 0);
        if (VERSION.SDK_INT >= 29) {
            saveAttributeDataForStyleable(context, C0238R.styleable.ActivityChooserView, attributeSet, obtainStyledAttributes, i, 0);
        }
        this.f1590d0 = obtainStyledAttributes.getInt(C0238R.styleable.ActivityChooserView_initialActivityCount, 4);
        Drawable drawable = obtainStyledAttributes.getDrawable(C0238R.styleable.ActivityChooserView_expandActivityOverflowButtonDrawable);
        obtainStyledAttributes.recycle();
        LayoutInflater.from(getContext()).inflate(C0238R.layout.abc_activity_chooser_view, this, true);
        this.f1587b = new C0422g();
        this.f1575N = findViewById(C0238R.C0241id.activity_chooser_view_content);
        this.f1576O = this.f1575N.getBackground();
        this.f1579R = (FrameLayout) findViewById(C0238R.C0241id.default_activity_button);
        this.f1579R.setOnClickListener(this.f1587b);
        this.f1579R.setOnLongClickListener(this.f1587b);
        this.f1580S = (ImageView) this.f1579R.findViewById(C0238R.C0241id.image);
        FrameLayout frameLayout = (FrameLayout) findViewById(C0238R.C0241id.expand_activities_button);
        frameLayout.setOnClickListener(this.f1587b);
        frameLayout.setAccessibilityDelegate(new C0418c());
        frameLayout.setOnTouchListener(new C0419d(frameLayout));
        this.f1577P = frameLayout;
        this.f1578Q = (ImageView) frameLayout.findViewById(C0238R.C0241id.image);
        this.f1578Q.setImageDrawable(drawable);
        this.f1585a = new C0421f();
        this.f1585a.registerDataSetObserver(new C0420e());
        Resources resources = context.getResources();
        this.f1581T = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(C0238R.dimen.abc_config_prefDialogWidth));
    }

    /* renamed from: a */
    public boolean mo1998a() {
        if (mo1999b()) {
            getListPopupWindow().dismiss();
            ViewTreeObserver viewTreeObserver = getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeGlobalOnLayoutListener(this.f1584W);
            }
        }
        return true;
    }
}
