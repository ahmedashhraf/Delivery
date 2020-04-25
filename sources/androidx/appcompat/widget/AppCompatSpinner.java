package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.res.ColorStateList;
import android.content.res.Resources.Theme;
import android.database.DataSetObserver;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.BaseSavedState;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow.OnDismissListener;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;
import androidx.annotation.C0195i0;
import androidx.annotation.C0207n0;
import androidx.annotation.C0207n0.C0208a;
import androidx.annotation.C0213q;
import androidx.annotation.C0224v0;
import androidx.appcompat.C0238R;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AlertDialog.C0257a;
import androidx.appcompat.p006a.p007a.C0242a;
import androidx.appcompat.view.menu.C0391q;
import androidx.core.p034l.C0955c0;
import androidx.core.p034l.C0962e0;

public class AppCompatSpinner extends Spinner implements C0955c0 {

    /* renamed from: T */
    private static final int[] f1614T = {16843505};

    /* renamed from: U */
    private static final int f1615U = 15;

    /* renamed from: V */
    private static final String f1616V = "AppCompatSpinner";

    /* renamed from: W */
    private static final int f1617W = 0;

    /* renamed from: a0 */
    private static final int f1618a0 = 1;

    /* renamed from: b0 */
    private static final int f1619b0 = -1;

    /* renamed from: N */
    private C0486d0 f1620N;

    /* renamed from: O */
    private SpinnerAdapter f1621O;

    /* renamed from: P */
    private final boolean f1622P;

    /* renamed from: Q */
    private C0432f f1623Q;

    /* renamed from: R */
    int f1624R;

    /* renamed from: S */
    final Rect f1625S;

    /* renamed from: a */
    private final C0489e f1626a;

    /* renamed from: b */
    private final Context f1627b;

    static class SavedState extends BaseSavedState {
        public static final Creator<SavedState> CREATOR = new C0423a();

        /* renamed from: a */
        boolean f1628a;

        /* renamed from: androidx.appcompat.widget.AppCompatSpinner$SavedState$a */
        static class C0423a implements Creator<SavedState> {
            C0423a() {
            }

            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeByte(this.f1628a ? (byte) 1 : 0);
        }

        SavedState(Parcel parcel) {
            super(parcel);
            this.f1628a = parcel.readByte() != 0;
        }
    }

    /* renamed from: androidx.appcompat.widget.AppCompatSpinner$a */
    class C0424a extends C0486d0 {

        /* renamed from: U */
        final /* synthetic */ C0428e f1629U;

        C0424a(View view, C0428e eVar) {
            this.f1629U = eVar;
            super(view);
        }

        /* renamed from: a */
        public C0391q mo1408a() {
            return this.f1629U;
        }

        @SuppressLint({"SyntheticAccessor"})
        /* renamed from: b */
        public boolean mo1409b() {
            if (!AppCompatSpinner.this.getInternalPopup().mo2105d()) {
                AppCompatSpinner.this.mo2067a();
            }
            return true;
        }
    }

    /* renamed from: androidx.appcompat.widget.AppCompatSpinner$b */
    class C0425b implements OnGlobalLayoutListener {
        C0425b() {
        }

        public void onGlobalLayout() {
            if (!AppCompatSpinner.this.getInternalPopup().mo2105d()) {
                AppCompatSpinner.this.mo2067a();
            }
            ViewTreeObserver viewTreeObserver = AppCompatSpinner.this.getViewTreeObserver();
            if (viewTreeObserver == null) {
                return;
            }
            if (VERSION.SDK_INT >= 16) {
                viewTreeObserver.removeOnGlobalLayoutListener(this);
            } else {
                viewTreeObserver.removeGlobalOnLayoutListener(this);
            }
        }
    }

    @C0224v0
    /* renamed from: androidx.appcompat.widget.AppCompatSpinner$c */
    class C0426c implements C0432f, OnClickListener {

        /* renamed from: N */
        private CharSequence f1632N;
        @C0224v0

        /* renamed from: a */
        AlertDialog f1634a;

        /* renamed from: b */
        private ListAdapter f1635b;

        C0426c() {
        }

        /* renamed from: a */
        public int mo2096a() {
            return 0;
        }

        /* renamed from: a */
        public void mo2097a(int i) {
        }

        /* renamed from: a */
        public void mo2099a(Drawable drawable) {
        }

        /* renamed from: a */
        public void mo2100a(ListAdapter listAdapter) {
            this.f1635b = listAdapter;
        }

        /* renamed from: b */
        public void mo2102b(int i) {
        }

        /* renamed from: c */
        public CharSequence mo2103c() {
            return this.f1632N;
        }

        /* renamed from: c */
        public void mo2104c(int i) {
        }

        /* renamed from: d */
        public boolean mo2105d() {
            AlertDialog alertDialog = this.f1634a;
            if (alertDialog != null) {
                return alertDialog.isShowing();
            }
            return false;
        }

        public void dismiss() {
            AlertDialog alertDialog = this.f1634a;
            if (alertDialog != null) {
                alertDialog.dismiss();
                this.f1634a = null;
            }
        }

        /* renamed from: e */
        public Drawable mo2107e() {
            return null;
        }

        /* renamed from: g */
        public int mo2108g() {
            return 0;
        }

        /* renamed from: h */
        public int mo2109h() {
            return 0;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            AppCompatSpinner.this.setSelection(i);
            if (AppCompatSpinner.this.getOnItemClickListener() != null) {
                AppCompatSpinner.this.performItemClick(null, i, this.f1635b.getItemId(i));
            }
            dismiss();
        }

        /* renamed from: a */
        public void mo2101a(CharSequence charSequence) {
            this.f1632N = charSequence;
        }

        /* renamed from: a */
        public void mo2098a(int i, int i2) {
            if (this.f1635b != null) {
                C0257a aVar = new C0257a(AppCompatSpinner.this.getPopupContext());
                CharSequence charSequence = this.f1632N;
                if (charSequence != null) {
                    aVar.mo770b(charSequence);
                }
                this.f1634a = aVar.mo756a(this.f1635b, AppCompatSpinner.this.getSelectedItemPosition(), (OnClickListener) this).mo764a();
                ListView listView = this.f1634a.getListView();
                if (VERSION.SDK_INT >= 17) {
                    listView.setTextDirection(i);
                    listView.setTextAlignment(i2);
                }
                this.f1634a.show();
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.AppCompatSpinner$d */
    private static class C0427d implements ListAdapter, SpinnerAdapter {

        /* renamed from: a */
        private SpinnerAdapter f1636a;

        /* renamed from: b */
        private ListAdapter f1637b;

        public C0427d(@C0195i0 SpinnerAdapter spinnerAdapter, @C0195i0 Theme theme) {
            this.f1636a = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                this.f1637b = (ListAdapter) spinnerAdapter;
            }
            if (theme == null) {
                return;
            }
            if (VERSION.SDK_INT >= 23 && (spinnerAdapter instanceof ThemedSpinnerAdapter)) {
                ThemedSpinnerAdapter themedSpinnerAdapter = (ThemedSpinnerAdapter) spinnerAdapter;
                if (themedSpinnerAdapter.getDropDownViewTheme() != theme) {
                    themedSpinnerAdapter.setDropDownViewTheme(theme);
                }
            } else if (spinnerAdapter instanceof C0540p0) {
                C0540p0 p0Var = (C0540p0) spinnerAdapter;
                if (p0Var.getDropDownViewTheme() == null) {
                    p0Var.setDropDownViewTheme(theme);
                }
            }
        }

        public boolean areAllItemsEnabled() {
            ListAdapter listAdapter = this.f1637b;
            if (listAdapter != null) {
                return listAdapter.areAllItemsEnabled();
            }
            return true;
        }

        public int getCount() {
            SpinnerAdapter spinnerAdapter = this.f1636a;
            if (spinnerAdapter == null) {
                return 0;
            }
            return spinnerAdapter.getCount();
        }

        public View getDropDownView(int i, View view, ViewGroup viewGroup) {
            SpinnerAdapter spinnerAdapter = this.f1636a;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getDropDownView(i, view, viewGroup);
        }

        public Object getItem(int i) {
            SpinnerAdapter spinnerAdapter = this.f1636a;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getItem(i);
        }

        public long getItemId(int i) {
            SpinnerAdapter spinnerAdapter = this.f1636a;
            if (spinnerAdapter == null) {
                return -1;
            }
            return spinnerAdapter.getItemId(i);
        }

        public int getItemViewType(int i) {
            return 0;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            return getDropDownView(i, view, viewGroup);
        }

        public int getViewTypeCount() {
            return 1;
        }

        public boolean hasStableIds() {
            SpinnerAdapter spinnerAdapter = this.f1636a;
            return spinnerAdapter != null && spinnerAdapter.hasStableIds();
        }

        public boolean isEmpty() {
            return getCount() == 0;
        }

        public boolean isEnabled(int i) {
            ListAdapter listAdapter = this.f1637b;
            if (listAdapter != null) {
                return listAdapter.isEnabled(i);
            }
            return true;
        }

        public void registerDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.f1636a;
            if (spinnerAdapter != null) {
                spinnerAdapter.registerDataSetObserver(dataSetObserver);
            }
        }

        public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.f1636a;
            if (spinnerAdapter != null) {
                spinnerAdapter.unregisterDataSetObserver(dataSetObserver);
            }
        }
    }

    @C0224v0
    /* renamed from: androidx.appcompat.widget.AppCompatSpinner$e */
    class C0428e extends C0495f0 implements C0432f {

        /* renamed from: F0 */
        private CharSequence f1638F0;

        /* renamed from: G0 */
        ListAdapter f1639G0;

        /* renamed from: H0 */
        private final Rect f1640H0 = new Rect();

        /* renamed from: I0 */
        private int f1641I0;

        /* renamed from: androidx.appcompat.widget.AppCompatSpinner$e$a */
        class C0429a implements OnItemClickListener {

            /* renamed from: a */
            final /* synthetic */ AppCompatSpinner f1643a;

            C0429a(AppCompatSpinner appCompatSpinner) {
                this.f1643a = appCompatSpinner;
            }

            public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                AppCompatSpinner.this.setSelection(i);
                if (AppCompatSpinner.this.getOnItemClickListener() != null) {
                    C0428e eVar = C0428e.this;
                    AppCompatSpinner.this.performItemClick(view, i, eVar.f1639G0.getItemId(i));
                }
                C0428e.this.dismiss();
            }
        }

        /* renamed from: androidx.appcompat.widget.AppCompatSpinner$e$b */
        class C0430b implements OnGlobalLayoutListener {
            C0430b() {
            }

            public void onGlobalLayout() {
                C0428e eVar = C0428e.this;
                if (!eVar.mo2124d(AppCompatSpinner.this)) {
                    C0428e.this.dismiss();
                    return;
                }
                C0428e.this.mo2125z();
                C0428e.super.mo1509b();
            }
        }

        /* renamed from: androidx.appcompat.widget.AppCompatSpinner$e$c */
        class C0431c implements OnDismissListener {

            /* renamed from: a */
            final /* synthetic */ OnGlobalLayoutListener f1646a;

            C0431c(OnGlobalLayoutListener onGlobalLayoutListener) {
                this.f1646a = onGlobalLayoutListener;
            }

            public void onDismiss() {
                ViewTreeObserver viewTreeObserver = AppCompatSpinner.this.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.removeGlobalOnLayoutListener(this.f1646a);
                }
            }
        }

        public C0428e(Context context, AttributeSet attributeSet, int i) {
            super(context, attributeSet, i);
            mo2601b((View) AppCompatSpinner.this);
            mo2605c(true);
            mo2620k(0);
            mo2594a((OnItemClickListener) new C0429a(AppCompatSpinner.this));
        }

        /* renamed from: c */
        public CharSequence mo2103c() {
            return this.f1638F0;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: d */
        public boolean mo2124d(View view) {
            return C0962e0.m5515h0(view) && view.getGlobalVisibleRect(this.f1640H0);
        }

        /* renamed from: h */
        public int mo2109h() {
            return this.f1641I0;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: z */
        public void mo2125z() {
            int i;
            Drawable e = mo2609e();
            int i2 = 0;
            if (e != null) {
                e.getPadding(AppCompatSpinner.this.f1625S);
                i2 = C0567z0.m3141a(AppCompatSpinner.this) ? AppCompatSpinner.this.f1625S.right : -AppCompatSpinner.this.f1625S.left;
            } else {
                Rect rect = AppCompatSpinner.this.f1625S;
                rect.right = 0;
                rect.left = 0;
            }
            int paddingLeft = AppCompatSpinner.this.getPaddingLeft();
            int paddingRight = AppCompatSpinner.this.getPaddingRight();
            int width = AppCompatSpinner.this.getWidth();
            AppCompatSpinner appCompatSpinner = AppCompatSpinner.this;
            int i3 = appCompatSpinner.f1624R;
            if (i3 == -2) {
                int a = appCompatSpinner.mo2066a((SpinnerAdapter) this.f1639G0, mo2609e());
                int i4 = AppCompatSpinner.this.getContext().getResources().getDisplayMetrics().widthPixels;
                Rect rect2 = AppCompatSpinner.this.f1625S;
                int i5 = (i4 - rect2.left) - rect2.right;
                if (a > i5) {
                    a = i5;
                }
                mo2611f(Math.max(a, (width - paddingLeft) - paddingRight));
            } else if (i3 == -1) {
                mo2611f((width - paddingLeft) - paddingRight);
            } else {
                mo2611f(i3);
            }
            if (C0567z0.m3141a(AppCompatSpinner.this)) {
                i = i2 + (((width - paddingRight) - mo2634u()) - mo2109h());
            } else {
                i = i2 + paddingLeft + mo2109h();
            }
            mo2591a(i);
        }

        /* renamed from: a */
        public void mo2100a(ListAdapter listAdapter) {
            super.mo2100a(listAdapter);
            this.f1639G0 = listAdapter;
        }

        /* renamed from: c */
        public void mo2104c(int i) {
            this.f1641I0 = i;
        }

        /* renamed from: a */
        public void mo2101a(CharSequence charSequence) {
            this.f1638F0 = charSequence;
        }

        /* renamed from: a */
        public void mo2098a(int i, int i2) {
            boolean d = mo1515d();
            mo2125z();
            mo2616i(2);
            super.mo1509b();
            ListView f = mo1518f();
            f.setChoiceMode(1);
            if (VERSION.SDK_INT >= 17) {
                f.setTextDirection(i);
                f.setTextAlignment(i2);
            }
            mo2622l(AppCompatSpinner.this.getSelectedItemPosition());
            if (!d) {
                ViewTreeObserver viewTreeObserver = AppCompatSpinner.this.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    C0430b bVar = new C0430b();
                    viewTreeObserver.addOnGlobalLayoutListener(bVar);
                    mo2596a((OnDismissListener) new C0431c(bVar));
                }
            }
        }
    }

    @C0224v0
    /* renamed from: androidx.appcompat.widget.AppCompatSpinner$f */
    interface C0432f {
        /* renamed from: a */
        int mo2096a();

        /* renamed from: a */
        void mo2097a(int i);

        /* renamed from: a */
        void mo2098a(int i, int i2);

        /* renamed from: a */
        void mo2099a(Drawable drawable);

        /* renamed from: a */
        void mo2100a(ListAdapter listAdapter);

        /* renamed from: a */
        void mo2101a(CharSequence charSequence);

        /* renamed from: b */
        void mo2102b(int i);

        /* renamed from: c */
        CharSequence mo2103c();

        /* renamed from: c */
        void mo2104c(int i);

        /* renamed from: d */
        boolean mo2105d();

        void dismiss();

        /* renamed from: e */
        Drawable mo2107e();

        /* renamed from: g */
        int mo2108g();

        /* renamed from: h */
        int mo2109h();
    }

    public AppCompatSpinner(Context context) {
        this(context, (AttributeSet) null);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public int mo2066a(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int makeMeasureSpec = MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int makeMeasureSpec2 = MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int max = Math.max(0, getSelectedItemPosition());
        int min = Math.min(spinnerAdapter.getCount(), max + 15);
        View view = null;
        int i2 = 0;
        for (int max2 = Math.max(0, max - (15 - (min - max))); max2 < min; max2++) {
            int itemViewType = spinnerAdapter.getItemViewType(max2);
            if (itemViewType != i) {
                view = null;
                i = itemViewType;
            }
            view = spinnerAdapter.getView(max2, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new LayoutParams(-2, -2));
            }
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            i2 = Math.max(i2, view.getMeasuredWidth());
        }
        if (drawable != null) {
            drawable.getPadding(this.f1625S);
            Rect rect = this.f1625S;
            i2 += rect.left + rect.right;
        }
        return i2;
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C0489e eVar = this.f1626a;
        if (eVar != null) {
            eVar.mo2526a();
        }
    }

    public int getDropDownHorizontalOffset() {
        C0432f fVar = this.f1623Q;
        if (fVar != null) {
            return fVar.mo2096a();
        }
        if (VERSION.SDK_INT >= 16) {
            return super.getDropDownHorizontalOffset();
        }
        return 0;
    }

    public int getDropDownVerticalOffset() {
        C0432f fVar = this.f1623Q;
        if (fVar != null) {
            return fVar.mo2108g();
        }
        if (VERSION.SDK_INT >= 16) {
            return super.getDropDownVerticalOffset();
        }
        return 0;
    }

    public int getDropDownWidth() {
        if (this.f1623Q != null) {
            return this.f1624R;
        }
        if (VERSION.SDK_INT >= 16) {
            return super.getDropDownWidth();
        }
        return 0;
    }

    /* access modifiers changed from: 0000 */
    @C0224v0
    public final C0432f getInternalPopup() {
        return this.f1623Q;
    }

    public Drawable getPopupBackground() {
        C0432f fVar = this.f1623Q;
        if (fVar != null) {
            return fVar.mo2107e();
        }
        if (VERSION.SDK_INT >= 16) {
            return super.getPopupBackground();
        }
        return null;
    }

    public Context getPopupContext() {
        return this.f1627b;
    }

    public CharSequence getPrompt() {
        C0432f fVar = this.f1623Q;
        return fVar != null ? fVar.mo2103c() : super.getPrompt();
    }

    @C0207n0({C0208a.LIBRARY_GROUP_PREFIX})
    @C0195i0
    public ColorStateList getSupportBackgroundTintList() {
        C0489e eVar = this.f1626a;
        if (eVar != null) {
            return eVar.mo2532b();
        }
        return null;
    }

    @C0207n0({C0208a.LIBRARY_GROUP_PREFIX})
    @C0195i0
    public Mode getSupportBackgroundTintMode() {
        C0489e eVar = this.f1626a;
        if (eVar != null) {
            return eVar.mo2534c();
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C0432f fVar = this.f1623Q;
        if (fVar != null && fVar.mo2105d()) {
            this.f1623Q.dismiss();
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f1623Q != null && MeasureSpec.getMode(i) == Integer.MIN_VALUE) {
            setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), mo2066a(getAdapter(), getBackground())), MeasureSpec.getSize(i)), getMeasuredHeight());
        }
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        if (savedState.f1628a) {
            ViewTreeObserver viewTreeObserver = getViewTreeObserver();
            if (viewTreeObserver != null) {
                viewTreeObserver.addOnGlobalLayoutListener(new C0425b());
            }
        }
    }

    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        C0432f fVar = this.f1623Q;
        savedState.f1628a = fVar != null && fVar.mo2105d();
        return savedState;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        C0486d0 d0Var = this.f1620N;
        if (d0Var == null || !d0Var.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    public boolean performClick() {
        C0432f fVar = this.f1623Q;
        if (fVar == null) {
            return super.performClick();
        }
        if (!fVar.mo2105d()) {
            mo2067a();
        }
        return true;
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0489e eVar = this.f1626a;
        if (eVar != null) {
            eVar.mo2530a(drawable);
        }
    }

    public void setBackgroundResource(@C0213q int i) {
        super.setBackgroundResource(i);
        C0489e eVar = this.f1626a;
        if (eVar != null) {
            eVar.mo2527a(i);
        }
    }

    public void setDropDownHorizontalOffset(int i) {
        C0432f fVar = this.f1623Q;
        if (fVar != null) {
            fVar.mo2104c(i);
            this.f1623Q.mo2097a(i);
        } else if (VERSION.SDK_INT >= 16) {
            super.setDropDownHorizontalOffset(i);
        }
    }

    public void setDropDownVerticalOffset(int i) {
        C0432f fVar = this.f1623Q;
        if (fVar != null) {
            fVar.mo2102b(i);
        } else if (VERSION.SDK_INT >= 16) {
            super.setDropDownVerticalOffset(i);
        }
    }

    public void setDropDownWidth(int i) {
        if (this.f1623Q != null) {
            this.f1624R = i;
        } else if (VERSION.SDK_INT >= 16) {
            super.setDropDownWidth(i);
        }
    }

    public void setPopupBackgroundDrawable(Drawable drawable) {
        C0432f fVar = this.f1623Q;
        if (fVar != null) {
            fVar.mo2099a(drawable);
        } else if (VERSION.SDK_INT >= 16) {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    public void setPopupBackgroundResource(@C0213q int i) {
        setPopupBackgroundDrawable(C0242a.m1109c(getPopupContext(), i));
    }

    public void setPrompt(CharSequence charSequence) {
        C0432f fVar = this.f1623Q;
        if (fVar != null) {
            fVar.mo2101a(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    @C0207n0({C0208a.LIBRARY_GROUP_PREFIX})
    public void setSupportBackgroundTintList(@C0195i0 ColorStateList colorStateList) {
        C0489e eVar = this.f1626a;
        if (eVar != null) {
            eVar.mo2533b(colorStateList);
        }
    }

    @C0207n0({C0208a.LIBRARY_GROUP_PREFIX})
    public void setSupportBackgroundTintMode(@C0195i0 Mode mode) {
        C0489e eVar = this.f1626a;
        if (eVar != null) {
            eVar.mo2529a(mode);
        }
    }

    public AppCompatSpinner(Context context, int i) {
        this(context, null, C0238R.attr.spinnerStyle, i);
    }

    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.f1622P) {
            this.f1621O = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        if (this.f1623Q != null) {
            Context context = this.f1627b;
            if (context == null) {
                context = getContext();
            }
            this.f1623Q.mo2100a((ListAdapter) new C0427d(spinnerAdapter, context.getTheme()));
        }
    }

    public AppCompatSpinner(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0238R.attr.spinnerStyle);
    }

    public AppCompatSpinner(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, -1);
    }

    public AppCompatSpinner(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, attributeSet, i, i2, null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0048, code lost:
        if (r10 != null) goto L_0x004a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004a, code lost:
        r10.recycle();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0059, code lost:
        if (r10 != null) goto L_0x004a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0054  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AppCompatSpinner(android.content.Context r6, android.util.AttributeSet r7, int r8, int r9, android.content.res.Resources.Theme r10) {
        /*
            r5 = this;
            r5.<init>(r6, r7, r8)
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r5.f1625S = r0
            int[] r0 = androidx.appcompat.C0238R.styleable.Spinner
            r1 = 0
            androidx.appcompat.widget.t0 r0 = androidx.appcompat.widget.C0549t0.m2910a(r6, r7, r0, r8, r1)
            androidx.appcompat.widget.e r2 = new androidx.appcompat.widget.e
            r2.<init>(r5)
            r5.f1626a = r2
            if (r10 == 0) goto L_0x0022
            androidx.appcompat.d.d r2 = new androidx.appcompat.d.d
            r2.<init>(r6, r10)
            r5.f1627b = r2
            goto L_0x0034
        L_0x0022:
            int r10 = androidx.appcompat.C0238R.styleable.Spinner_popupTheme
            int r10 = r0.mo2888g(r10, r1)
            if (r10 == 0) goto L_0x0032
            androidx.appcompat.d.d r2 = new androidx.appcompat.d.d
            r2.<init>(r6, r10)
            r5.f1627b = r2
            goto L_0x0034
        L_0x0032:
            r5.f1627b = r6
        L_0x0034:
            r10 = -1
            r2 = 0
            if (r9 != r10) goto L_0x005c
            int[] r10 = f1614T     // Catch:{ Exception -> 0x0058, all -> 0x0050 }
            android.content.res.TypedArray r10 = r6.obtainStyledAttributes(r7, r10, r8, r1)     // Catch:{ Exception -> 0x0058, all -> 0x0050 }
            boolean r3 = r10.hasValue(r1)     // Catch:{ Exception -> 0x0059, all -> 0x004e }
            if (r3 == 0) goto L_0x0048
            int r9 = r10.getInt(r1, r1)     // Catch:{ Exception -> 0x0059, all -> 0x004e }
        L_0x0048:
            if (r10 == 0) goto L_0x005c
        L_0x004a:
            r10.recycle()
            goto L_0x005c
        L_0x004e:
            r6 = move-exception
            goto L_0x0052
        L_0x0050:
            r6 = move-exception
            r10 = r2
        L_0x0052:
            if (r10 == 0) goto L_0x0057
            r10.recycle()
        L_0x0057:
            throw r6
        L_0x0058:
            r10 = r2
        L_0x0059:
            if (r10 == 0) goto L_0x005c
            goto L_0x004a
        L_0x005c:
            r10 = 1
            if (r9 == 0) goto L_0x0099
            if (r9 == r10) goto L_0x0062
            goto L_0x00ab
        L_0x0062:
            androidx.appcompat.widget.AppCompatSpinner$e r9 = new androidx.appcompat.widget.AppCompatSpinner$e
            android.content.Context r3 = r5.f1627b
            r9.<init>(r3, r7, r8)
            android.content.Context r3 = r5.f1627b
            int[] r4 = androidx.appcompat.C0238R.styleable.Spinner
            androidx.appcompat.widget.t0 r1 = androidx.appcompat.widget.C0549t0.m2910a(r3, r7, r4, r8, r1)
            int r3 = androidx.appcompat.C0238R.styleable.Spinner_android_dropDownWidth
            r4 = -2
            int r3 = r1.mo2885f(r3, r4)
            r5.f1624R = r3
            int r3 = androidx.appcompat.C0238R.styleable.Spinner_android_popupBackground
            android.graphics.drawable.Drawable r3 = r1.mo2875b(r3)
            r9.mo2593a(r3)
            int r3 = androidx.appcompat.C0238R.styleable.Spinner_android_prompt
            java.lang.String r3 = r0.mo2886f(r3)
            r9.mo2101a(r3)
            r1.mo2887f()
            r5.f1623Q = r9
            androidx.appcompat.widget.AppCompatSpinner$a r1 = new androidx.appcompat.widget.AppCompatSpinner$a
            r1.<init>(r5, r9)
            r5.f1620N = r1
            goto L_0x00ab
        L_0x0099:
            androidx.appcompat.widget.AppCompatSpinner$c r9 = new androidx.appcompat.widget.AppCompatSpinner$c
            r9.<init>()
            r5.f1623Q = r9
            androidx.appcompat.widget.AppCompatSpinner$f r9 = r5.f1623Q
            int r1 = androidx.appcompat.C0238R.styleable.Spinner_android_prompt
            java.lang.String r1 = r0.mo2886f(r1)
            r9.mo2101a(r1)
        L_0x00ab:
            int r9 = androidx.appcompat.C0238R.styleable.Spinner_android_entries
            java.lang.CharSequence[] r9 = r0.mo2890h(r9)
            if (r9 == 0) goto L_0x00c3
            android.widget.ArrayAdapter r1 = new android.widget.ArrayAdapter
            r3 = 17367048(0x1090008, float:2.5162948E-38)
            r1.<init>(r6, r3, r9)
            int r6 = androidx.appcompat.C0238R.layout.support_simple_spinner_dropdown_item
            r1.setDropDownViewResource(r6)
            r5.setAdapter(r1)
        L_0x00c3:
            r0.mo2887f()
            r5.f1622P = r10
            android.widget.SpinnerAdapter r6 = r5.f1621O
            if (r6 == 0) goto L_0x00d1
            r5.setAdapter(r6)
            r5.f1621O = r2
        L_0x00d1:
            androidx.appcompat.widget.e r6 = r5.f1626a
            r6.mo2531a(r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.AppCompatSpinner.<init>(android.content.Context, android.util.AttributeSet, int, int, android.content.res.Resources$Theme):void");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo2067a() {
        if (VERSION.SDK_INT >= 17) {
            this.f1623Q.mo2098a(getTextDirection(), getTextAlignment());
        } else {
            this.f1623Q.mo2098a(-1, -1);
        }
    }
}
