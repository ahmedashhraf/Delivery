package androidx.appcompat.widget;

import android.app.PendingIntent;
import android.app.SearchableInfo;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.ClassLoaderCreator;
import android.os.Parcelable.Creator;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.KeyEvent.DispatcherState;
import android.view.LayoutInflater;
import android.view.TouchDelegate;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.View.OnFocusChangeListener;
import android.view.View.OnKeyListener;
import android.view.View.OnLayoutChangeListener;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;
import androidx.annotation.C0195i0;
import androidx.annotation.C0207n0;
import androidx.annotation.C0207n0.C0208a;
import androidx.appcompat.C0238R;
import androidx.appcompat.p011d.C0340c;
import androidx.core.p034l.C0962e0;
import androidx.customview.view.AbsSavedState;
import com.google.api.client.googleapis.media.MediaHttpDownloader;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import p053b.p059b.p060b.C2092a;
import p076c.p112d.p148d.p150g.C6637f;
import p205i.p471b.p472a.p473a.p474c.p475i.C13959t;

public class SearchView extends C0490e0 implements C0340c {

    /* renamed from: n1 */
    static final boolean f1666n1 = false;

    /* renamed from: o1 */
    static final String f1667o1 = "SearchView";

    /* renamed from: p1 */
    private static final String f1668p1 = "nm";

    /* renamed from: q1 */
    static final C0452k f1669q1 = new C0452k();

    /* renamed from: A0 */
    private Rect f1670A0;

    /* renamed from: B0 */
    private int[] f1671B0;

    /* renamed from: C0 */
    private int[] f1672C0;

    /* renamed from: D0 */
    private final ImageView f1673D0;

    /* renamed from: E0 */
    private final Drawable f1674E0;

    /* renamed from: F0 */
    private final int f1675F0;

    /* renamed from: G0 */
    private final int f1676G0;

    /* renamed from: H0 */
    private final Intent f1677H0;

    /* renamed from: I0 */
    private final Intent f1678I0;

    /* renamed from: J0 */
    private final CharSequence f1679J0;

    /* renamed from: K0 */
    private C0454m f1680K0;

    /* renamed from: L0 */
    private C0453l f1681L0;

    /* renamed from: M0 */
    OnFocusChangeListener f1682M0;

    /* renamed from: N0 */
    private C0455n f1683N0;

    /* renamed from: O0 */
    private OnClickListener f1684O0;

    /* renamed from: P0 */
    private boolean f1685P0;

    /* renamed from: Q0 */
    private boolean f1686Q0;

    /* renamed from: R0 */
    C2092a f1687R0;

    /* renamed from: S0 */
    private boolean f1688S0;

    /* renamed from: T0 */
    private CharSequence f1689T0;

    /* renamed from: U0 */
    private boolean f1690U0;

    /* renamed from: V0 */
    private boolean f1691V0;

    /* renamed from: W0 */
    private int f1692W0;

    /* renamed from: X0 */
    private boolean f1693X0;

    /* renamed from: Y0 */
    private CharSequence f1694Y0;

    /* renamed from: Z0 */
    private CharSequence f1695Z0;

    /* renamed from: a1 */
    private boolean f1696a1;

    /* renamed from: b1 */
    private int f1697b1;

    /* renamed from: c1 */
    SearchableInfo f1698c1;

    /* renamed from: d1 */
    private Bundle f1699d1;

    /* renamed from: e1 */
    private final Runnable f1700e1;

    /* renamed from: f1 */
    private Runnable f1701f1;

    /* renamed from: g1 */
    private final WeakHashMap<String, ConstantState> f1702g1;

    /* renamed from: h1 */
    private final OnClickListener f1703h1;

    /* renamed from: i1 */
    OnKeyListener f1704i1;

    /* renamed from: j1 */
    private final OnEditorActionListener f1705j1;

    /* renamed from: k1 */
    private final OnItemClickListener f1706k1;

    /* renamed from: l1 */
    private final OnItemSelectedListener f1707l1;

    /* renamed from: m1 */
    private TextWatcher f1708m1;

    /* renamed from: p0 */
    final SearchAutoComplete f1709p0;

    /* renamed from: q0 */
    private final View f1710q0;

    /* renamed from: r0 */
    private final View f1711r0;

    /* renamed from: s0 */
    private final View f1712s0;

    /* renamed from: t0 */
    final ImageView f1713t0;

    /* renamed from: u0 */
    final ImageView f1714u0;

    /* renamed from: v0 */
    final ImageView f1715v0;

    /* renamed from: w0 */
    final ImageView f1716w0;

    /* renamed from: x0 */
    private final View f1717x0;

    /* renamed from: y0 */
    private C0456o f1718y0;

    /* renamed from: z0 */
    private Rect f1719z0;

    static class SavedState extends AbsSavedState {
        public static final Creator<SavedState> CREATOR = new C0440a();

        /* renamed from: a */
        boolean f1720a;

        /* renamed from: androidx.appcompat.widget.SearchView$SavedState$a */
        static class C0440a implements ClassLoaderCreator<SavedState> {
            C0440a() {
            }

            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }

            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("SearchView.SavedState{");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" isIconified=");
            sb.append(this.f1720a);
            sb.append("}");
            return sb.toString();
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeValue(Boolean.valueOf(this.f1720a));
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f1720a = ((Boolean) parcel.readValue(null)).booleanValue();
        }
    }

    @C0207n0({C0208a.LIBRARY_GROUP_PREFIX})
    public static class SearchAutoComplete extends C0485d {

        /* renamed from: O */
        private int f1721O;

        /* renamed from: P */
        private SearchView f1722P;

        /* renamed from: Q */
        private boolean f1723Q;

        /* renamed from: R */
        final Runnable f1724R;

        /* renamed from: androidx.appcompat.widget.SearchView$SearchAutoComplete$a */
        class C0441a implements Runnable {
            C0441a() {
            }

            public void run() {
                SearchAutoComplete.this.mo2258b();
            }
        }

        public SearchAutoComplete(Context context) {
            this(context, null);
        }

        private int getSearchViewTextMinWidthDp() {
            Configuration configuration = getResources().getConfiguration();
            int i = configuration.screenWidthDp;
            int i2 = configuration.screenHeightDp;
            if (i >= 960 && i2 >= 720 && configuration.orientation == 2) {
                return 256;
            }
            if (i >= 600 || (i >= 640 && i2 >= 480)) {
                return 192;
            }
            return C13959t.f40969w2;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public boolean mo2257a() {
            return TextUtils.getTrimmedLength(getText()) == 0;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo2258b() {
            if (this.f1723Q) {
                ((InputMethodManager) getContext().getSystemService("input_method")).showSoftInput(this, 0);
                this.f1723Q = false;
            }
        }

        public boolean enoughToFilter() {
            return this.f1721O <= 0 || super.enoughToFilter();
        }

        public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
            InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
            if (this.f1723Q) {
                removeCallbacks(this.f1724R);
                post(this.f1724R);
            }
            return onCreateInputConnection;
        }

        /* access modifiers changed from: protected */
        public void onFinishInflate() {
            super.onFinishInflate();
            setMinWidth((int) TypedValue.applyDimension(1, (float) getSearchViewTextMinWidthDp(), getResources().getDisplayMetrics()));
        }

        /* access modifiers changed from: protected */
        public void onFocusChanged(boolean z, int i, Rect rect) {
            super.onFocusChanged(z, i, rect);
            this.f1722P.mo2232p();
        }

        public boolean onKeyPreIme(int i, KeyEvent keyEvent) {
            if (i == 4) {
                if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                    DispatcherState keyDispatcherState = getKeyDispatcherState();
                    if (keyDispatcherState != null) {
                        keyDispatcherState.startTracking(keyEvent, this);
                    }
                    return true;
                } else if (keyEvent.getAction() == 1) {
                    DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                    if (keyDispatcherState2 != null) {
                        keyDispatcherState2.handleUpEvent(keyEvent);
                    }
                    if (keyEvent.isTracking() && !keyEvent.isCanceled()) {
                        this.f1722P.clearFocus();
                        setImeVisibility(false);
                        return true;
                    }
                }
            }
            return super.onKeyPreIme(i, keyEvent);
        }

        public void onWindowFocusChanged(boolean z) {
            super.onWindowFocusChanged(z);
            if (z && this.f1722P.hasFocus() && getVisibility() == 0) {
                this.f1723Q = true;
                if (SearchView.m2463a(getContext())) {
                    SearchView.f1669q1.mo2285a(this, true);
                }
            }
        }

        public void performCompletion() {
        }

        /* access modifiers changed from: protected */
        public void replaceText(CharSequence charSequence) {
        }

        /* access modifiers changed from: 0000 */
        public void setImeVisibility(boolean z) {
            InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
            if (!z) {
                this.f1723Q = false;
                removeCallbacks(this.f1724R);
                inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
            } else if (inputMethodManager.isActive(this)) {
                this.f1723Q = false;
                removeCallbacks(this.f1724R);
                inputMethodManager.showSoftInput(this, 0);
            } else {
                this.f1723Q = true;
            }
        }

        /* access modifiers changed from: 0000 */
        public void setSearchView(SearchView searchView) {
            this.f1722P = searchView;
        }

        public void setThreshold(int i) {
            super.setThreshold(i);
            this.f1721O = i;
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet) {
            this(context, attributeSet, C0238R.attr.autoCompleteTextViewStyle);
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet, int i) {
            super(context, attributeSet, i);
            this.f1724R = new C0441a();
            this.f1721O = getThreshold();
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$a */
    class C0442a implements TextWatcher {
        C0442a() {
        }

        public void afterTextChanged(Editable editable) {
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            SearchView.this.mo2208b(charSequence);
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$b */
    class C0443b implements Runnable {
        C0443b() {
        }

        public void run() {
            SearchView.this.mo2234r();
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$c */
    class C0444c implements Runnable {
        C0444c() {
        }

        public void run() {
            C2092a aVar = SearchView.this.f1687R0;
            if (aVar instanceof C0535n0) {
                aVar.mo2819b(null);
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$d */
    class C0445d implements OnFocusChangeListener {
        C0445d() {
        }

        public void onFocusChange(View view, boolean z) {
            SearchView searchView = SearchView.this;
            OnFocusChangeListener onFocusChangeListener = searchView.f1682M0;
            if (onFocusChangeListener != null) {
                onFocusChangeListener.onFocusChange(searchView, z);
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$e */
    class C0446e implements OnLayoutChangeListener {
        C0446e() {
        }

        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            SearchView.this.mo2211g();
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$f */
    class C0447f implements OnClickListener {
        C0447f() {
        }

        public void onClick(View view) {
            SearchView searchView = SearchView.this;
            if (view == searchView.f1713t0) {
                searchView.mo2226n();
            } else if (view == searchView.f1715v0) {
                searchView.mo2225m();
            } else if (view == searchView.f1714u0) {
                searchView.mo2227o();
            } else if (view == searchView.f1716w0) {
                searchView.mo2233q();
            } else if (view == searchView.f1709p0) {
                searchView.mo2220h();
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$g */
    class C0448g implements OnKeyListener {
        C0448g() {
        }

        public boolean onKey(View view, int i, KeyEvent keyEvent) {
            SearchView searchView = SearchView.this;
            if (searchView.f1698c1 == null) {
                return false;
            }
            if (searchView.f1709p0.isPopupShowing() && SearchView.this.f1709p0.getListSelection() != -1) {
                return SearchView.this.mo2207a(view, i, keyEvent);
            }
            if (SearchView.this.f1709p0.mo2257a() || !keyEvent.hasNoModifiers() || keyEvent.getAction() != 1 || i != 66) {
                return false;
            }
            view.cancelLongPress();
            SearchView searchView2 = SearchView.this;
            searchView2.mo2203a(0, (String) null, searchView2.f1709p0.getText().toString());
            return true;
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$h */
    class C0449h implements OnEditorActionListener {
        C0449h() {
        }

        public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
            SearchView.this.mo2227o();
            return true;
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$i */
    class C0450i implements OnItemClickListener {
        C0450i() {
        }

        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            SearchView.this.mo2206a(i, 0, (String) null);
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$j */
    class C0451j implements OnItemSelectedListener {
        C0451j() {
        }

        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            SearchView.this.mo2210d(i);
        }

        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$k */
    private static class C0452k {

        /* renamed from: a */
        private Method f1736a;

        /* renamed from: b */
        private Method f1737b;

        /* renamed from: c */
        private Method f1738c;

        C0452k() {
            try {
                this.f1736a = AutoCompleteTextView.class.getDeclaredMethod("doBeforeTextChanged", new Class[0]);
                this.f1736a.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            try {
                this.f1737b = AutoCompleteTextView.class.getDeclaredMethod("doAfterTextChanged", new Class[0]);
                this.f1737b.setAccessible(true);
            } catch (NoSuchMethodException unused2) {
            }
            try {
                this.f1738c = AutoCompleteTextView.class.getMethod("ensureImeVisible", new Class[]{Boolean.TYPE});
                this.f1738c.setAccessible(true);
            } catch (NoSuchMethodException unused3) {
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo2284a(AutoCompleteTextView autoCompleteTextView) {
            Method method = this.f1737b;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, new Object[0]);
                } catch (Exception unused) {
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo2286b(AutoCompleteTextView autoCompleteTextView) {
            Method method = this.f1736a;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, new Object[0]);
                } catch (Exception unused) {
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo2285a(AutoCompleteTextView autoCompleteTextView, boolean z) {
            Method method = this.f1738c;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, new Object[]{Boolean.valueOf(z)});
                } catch (Exception unused) {
                }
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$l */
    public interface C0453l {
        boolean onClose();
    }

    /* renamed from: androidx.appcompat.widget.SearchView$m */
    public interface C0454m {
        boolean onQueryTextChange(String str);

        boolean onQueryTextSubmit(String str);
    }

    /* renamed from: androidx.appcompat.widget.SearchView$n */
    public interface C0455n {
        boolean onSuggestionClick(int i);

        boolean onSuggestionSelect(int i);
    }

    /* renamed from: androidx.appcompat.widget.SearchView$o */
    private static class C0456o extends TouchDelegate {

        /* renamed from: a */
        private final View f1739a;

        /* renamed from: b */
        private final Rect f1740b = new Rect();

        /* renamed from: c */
        private final Rect f1741c = new Rect();

        /* renamed from: d */
        private final Rect f1742d = new Rect();

        /* renamed from: e */
        private final int f1743e;

        /* renamed from: f */
        private boolean f1744f;

        public C0456o(Rect rect, Rect rect2, View view) {
            super(rect, view);
            this.f1743e = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
            mo2292a(rect, rect2);
            this.f1739a = view;
        }

        /* renamed from: a */
        public void mo2292a(Rect rect, Rect rect2) {
            this.f1740b.set(rect);
            this.f1742d.set(rect);
            Rect rect3 = this.f1742d;
            int i = this.f1743e;
            rect3.inset(-i, -i);
            this.f1741c.set(rect2);
        }

        /* JADX WARNING: Removed duplicated region for block: B:17:0x003d  */
        /* JADX WARNING: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean onTouchEvent(android.view.MotionEvent r8) {
            /*
                r7 = this;
                float r0 = r8.getX()
                int r0 = (int) r0
                float r1 = r8.getY()
                int r1 = (int) r1
                int r2 = r8.getAction()
                r3 = 2
                r4 = 1
                r5 = 0
                if (r2 == 0) goto L_0x002e
                if (r2 == r4) goto L_0x0020
                if (r2 == r3) goto L_0x0020
                r6 = 3
                if (r2 == r6) goto L_0x001b
                goto L_0x003a
            L_0x001b:
                boolean r2 = r7.f1744f
                r7.f1744f = r5
                goto L_0x003b
            L_0x0020:
                boolean r2 = r7.f1744f
                if (r2 == 0) goto L_0x003b
                android.graphics.Rect r6 = r7.f1742d
                boolean r6 = r6.contains(r0, r1)
                if (r6 != 0) goto L_0x003b
                r4 = 0
                goto L_0x003b
            L_0x002e:
                android.graphics.Rect r2 = r7.f1740b
                boolean r2 = r2.contains(r0, r1)
                if (r2 == 0) goto L_0x003a
                r7.f1744f = r4
                r2 = 1
                goto L_0x003b
            L_0x003a:
                r2 = 0
            L_0x003b:
                if (r2 == 0) goto L_0x006e
                if (r4 == 0) goto L_0x005b
                android.graphics.Rect r2 = r7.f1741c
                boolean r2 = r2.contains(r0, r1)
                if (r2 != 0) goto L_0x005b
                android.view.View r0 = r7.f1739a
                int r0 = r0.getWidth()
                int r0 = r0 / r3
                float r0 = (float) r0
                android.view.View r1 = r7.f1739a
                int r1 = r1.getHeight()
                int r1 = r1 / r3
                float r1 = (float) r1
                r8.setLocation(r0, r1)
                goto L_0x0068
            L_0x005b:
                android.graphics.Rect r2 = r7.f1741c
                int r3 = r2.left
                int r0 = r0 - r3
                float r0 = (float) r0
                int r2 = r2.top
                int r1 = r1 - r2
                float r1 = (float) r1
                r8.setLocation(r0, r1)
            L_0x0068:
                android.view.View r0 = r7.f1739a
                boolean r5 = r0.dispatchTouchEvent(r8)
            L_0x006e:
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SearchView.C0456o.onTouchEvent(android.view.MotionEvent):boolean");
        }
    }

    public SearchView(Context context) {
        this(context, null);
    }

    /* renamed from: b */
    private void m2465b(boolean z) {
        this.f1686Q0 = z;
        int i = 0;
        boolean z2 = !TextUtils.isEmpty(this.f1709p0.getText());
        this.f1713t0.setVisibility(z ? 0 : 8);
        m2462a(z2);
        this.f1710q0.setVisibility(z ? 8 : 0);
        if (this.f1673D0.getDrawable() == null || this.f1685P0) {
            i = 8;
        }
        this.f1673D0.setVisibility(i);
        m2474w();
        m2468c(!z2);
        m2477z();
    }

    /* renamed from: c */
    private CharSequence m2467c(CharSequence charSequence) {
        if (!this.f1685P0 || this.f1674E0 == null) {
            return charSequence;
        }
        double textSize = (double) this.f1709p0.getTextSize();
        Double.isNaN(textSize);
        int i = (int) (textSize * 1.25d);
        this.f1674E0.setBounds(0, 0, i, i);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("   ");
        spannableStringBuilder.setSpan(new ImageSpan(this.f1674E0), 1, 2, 33);
        spannableStringBuilder.append(charSequence);
        return spannableStringBuilder;
    }

    /* renamed from: e */
    private void m2469e(int i) {
        Editable text = this.f1709p0.getText();
        Cursor a = this.f1687R0.mo9083a();
        if (a != null) {
            if (a.moveToPosition(i)) {
                CharSequence a2 = this.f1687R0.mo2816a(a);
                if (a2 != null) {
                    setQuery(a2);
                } else {
                    setQuery(text);
                }
            } else {
                setQuery(text);
            }
        }
    }

    private int getPreferredHeight() {
        return getContext().getResources().getDimensionPixelSize(C0238R.dimen.abc_search_view_preferred_height);
    }

    private int getPreferredWidth() {
        return getContext().getResources().getDimensionPixelSize(C0238R.dimen.abc_search_view_preferred_width);
    }

    /* renamed from: s */
    private void m2470s() {
        this.f1709p0.dismissDropDown();
    }

    private void setQuery(CharSequence charSequence) {
        this.f1709p0.setText(charSequence);
        this.f1709p0.setSelection(TextUtils.isEmpty(charSequence) ? 0 : charSequence.length());
    }

    /* renamed from: t */
    private boolean m2471t() {
        SearchableInfo searchableInfo = this.f1698c1;
        if (searchableInfo == null || !searchableInfo.getVoiceSearchEnabled()) {
            return false;
        }
        Intent intent = null;
        if (this.f1698c1.getVoiceSearchLaunchWebSearch()) {
            intent = this.f1677H0;
        } else if (this.f1698c1.getVoiceSearchLaunchRecognizer()) {
            intent = this.f1678I0;
        }
        if (intent == null || getContext().getPackageManager().resolveActivity(intent, 65536) == null) {
            return false;
        }
        return true;
    }

    /* renamed from: u */
    private boolean m2472u() {
        return (this.f1688S0 || this.f1693X0) && !mo2222j();
    }

    /* renamed from: v */
    private void m2473v() {
        post(this.f1700e1);
    }

    /* renamed from: w */
    private void m2474w() {
        boolean z = true;
        boolean z2 = !TextUtils.isEmpty(this.f1709p0.getText());
        int i = 0;
        if (!z2 && (!this.f1685P0 || this.f1696a1)) {
            z = false;
        }
        ImageView imageView = this.f1715v0;
        if (!z) {
            i = 8;
        }
        imageView.setVisibility(i);
        Drawable drawable = this.f1715v0.getDrawable();
        if (drawable != null) {
            drawable.setState(z2 ? ViewGroup.ENABLED_STATE_SET : ViewGroup.EMPTY_STATE_SET);
        }
    }

    /* renamed from: x */
    private void m2475x() {
        CharSequence queryHint = getQueryHint();
        SearchAutoComplete searchAutoComplete = this.f1709p0;
        if (queryHint == null) {
            queryHint = "";
        }
        searchAutoComplete.setHint(m2467c(queryHint));
    }

    /* renamed from: y */
    private void m2476y() {
        this.f1709p0.setThreshold(this.f1698c1.getSuggestThreshold());
        this.f1709p0.setImeOptions(this.f1698c1.getImeOptions());
        int inputType = this.f1698c1.getInputType();
        int i = 1;
        if ((inputType & 15) == 1) {
            inputType &= -65537;
            if (this.f1698c1.getSuggestAuthority() != null) {
                inputType = inputType | 65536 | 524288;
            }
        }
        this.f1709p0.setInputType(inputType);
        C2092a aVar = this.f1687R0;
        if (aVar != null) {
            aVar.mo2819b(null);
        }
        if (this.f1698c1.getSuggestAuthority() != null) {
            this.f1687R0 = new C0535n0(getContext(), this, this.f1698c1, this.f1702g1);
            this.f1709p0.setAdapter(this.f1687R0);
            C0535n0 n0Var = (C0535n0) this.f1687R0;
            if (this.f1690U0) {
                i = 2;
            }
            n0Var.mo2820c(i);
        }
    }

    /* renamed from: z */
    private void m2477z() {
        this.f1712s0.setVisibility((!m2472u() || !(this.f1714u0.getVisibility() == 0 || this.f1716w0.getVisibility() == 0)) ? 8 : 0);
    }

    /* renamed from: a */
    public void mo2205a(CharSequence charSequence, boolean z) {
        this.f1709p0.setText(charSequence);
        if (charSequence != null) {
            SearchAutoComplete searchAutoComplete = this.f1709p0;
            searchAutoComplete.setSelection(searchAutoComplete.length());
            this.f1695Z0 = charSequence;
        }
        if (z && !TextUtils.isEmpty(charSequence)) {
            mo2227o();
        }
    }

    public void clearFocus() {
        this.f1691V0 = true;
        super.clearFocus();
        this.f1709p0.clearFocus();
        this.f1709p0.setImeVisibility(false);
        this.f1691V0 = false;
    }

    /* renamed from: d */
    public void mo1323d() {
        mo2205a((CharSequence) "", false);
        clearFocus();
        m2465b(true);
        this.f1709p0.setImeOptions(this.f1697b1);
        this.f1696a1 = false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public void mo2211g() {
        int i;
        if (this.f1717x0.getWidth() > 1) {
            Resources resources = getContext().getResources();
            int paddingLeft = this.f1711r0.getPaddingLeft();
            Rect rect = new Rect();
            boolean a = C0567z0.m3141a(this);
            int dimensionPixelSize = this.f1685P0 ? resources.getDimensionPixelSize(C0238R.dimen.abc_dropdownitem_icon_width) + resources.getDimensionPixelSize(C0238R.dimen.abc_dropdownitem_text_padding_left) : 0;
            this.f1709p0.getDropDownBackground().getPadding(rect);
            if (a) {
                i = -rect.left;
            } else {
                i = paddingLeft - (rect.left + dimensionPixelSize);
            }
            this.f1709p0.setDropDownHorizontalOffset(i);
            this.f1709p0.setDropDownWidth((((this.f1717x0.getWidth() + rect.left) + rect.right) + dimensionPixelSize) - paddingLeft);
        }
    }

    public int getImeOptions() {
        return this.f1709p0.getImeOptions();
    }

    public int getInputType() {
        return this.f1709p0.getInputType();
    }

    public int getMaxWidth() {
        return this.f1692W0;
    }

    public CharSequence getQuery() {
        return this.f1709p0.getText();
    }

    @C0195i0
    public CharSequence getQueryHint() {
        CharSequence charSequence = this.f1689T0;
        if (charSequence != null) {
            return charSequence;
        }
        SearchableInfo searchableInfo = this.f1698c1;
        if (searchableInfo == null || searchableInfo.getHintId() == 0) {
            return this.f1679J0;
        }
        return getContext().getText(this.f1698c1.getHintId());
    }

    /* access modifiers changed from: 0000 */
    public int getSuggestionCommitIconResId() {
        return this.f1676G0;
    }

    /* access modifiers changed from: 0000 */
    public int getSuggestionRowLayout() {
        return this.f1675F0;
    }

    public C2092a getSuggestionsAdapter() {
        return this.f1687R0;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public void mo2220h() {
        if (VERSION.SDK_INT >= 29) {
            this.f1709p0.refreshAutoCompleteResults();
            return;
        }
        f1669q1.mo2286b(this.f1709p0);
        f1669q1.mo2284a(this.f1709p0);
    }

    /* renamed from: i */
    public boolean mo2221i() {
        return this.f1685P0;
    }

    /* renamed from: j */
    public boolean mo2222j() {
        return this.f1686Q0;
    }

    /* renamed from: k */
    public boolean mo2223k() {
        return this.f1690U0;
    }

    /* renamed from: l */
    public boolean mo2224l() {
        return this.f1688S0;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: m */
    public void mo2225m() {
        if (!TextUtils.isEmpty(this.f1709p0.getText())) {
            this.f1709p0.setText("");
            this.f1709p0.requestFocus();
            this.f1709p0.setImeVisibility(true);
        } else if (this.f1685P0) {
            C0453l lVar = this.f1681L0;
            if (lVar == null || !lVar.onClose()) {
                clearFocus();
                m2465b(true);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: n */
    public void mo2226n() {
        m2465b(false);
        this.f1709p0.requestFocus();
        this.f1709p0.setImeVisibility(true);
        OnClickListener onClickListener = this.f1684O0;
        if (onClickListener != null) {
            onClickListener.onClick(this);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: o */
    public void mo2227o() {
        Editable text = this.f1709p0.getText();
        if (text != null && TextUtils.getTrimmedLength(text) > 0) {
            C0454m mVar = this.f1680K0;
            if (mVar == null || !mVar.onQueryTextSubmit(text.toString())) {
                if (this.f1698c1 != null) {
                    mo2203a(0, (String) null, text.toString());
                }
                this.f1709p0.setImeVisibility(false);
                m2470s();
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        removeCallbacks(this.f1700e1);
        post(this.f1701f1);
        super.onDetachedFromWindow();
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            m2461a((View) this.f1709p0, this.f1719z0);
            Rect rect = this.f1670A0;
            Rect rect2 = this.f1719z0;
            rect.set(rect2.left, 0, rect2.right, i4 - i2);
            C0456o oVar = this.f1718y0;
            if (oVar == null) {
                this.f1718y0 = new C0456o(this.f1670A0, this.f1719z0, this.f1709p0);
                setTouchDelegate(this.f1718y0);
                return;
            }
            oVar.mo2292a(this.f1670A0, this.f1719z0);
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        if (mo2222j()) {
            super.onMeasure(i, i2);
            return;
        }
        int mode = MeasureSpec.getMode(i);
        int size = MeasureSpec.getSize(i);
        if (mode == Integer.MIN_VALUE) {
            int i3 = this.f1692W0;
            size = i3 > 0 ? Math.min(i3, size) : Math.min(getPreferredWidth(), size);
        } else if (mode == 0) {
            size = this.f1692W0;
            if (size <= 0) {
                size = getPreferredWidth();
            }
        } else if (mode == 1073741824) {
            int i4 = this.f1692W0;
            if (i4 > 0) {
                size = Math.min(i4, size);
            }
        }
        int mode2 = MeasureSpec.getMode(i2);
        int size2 = MeasureSpec.getSize(i2);
        if (mode2 == Integer.MIN_VALUE) {
            size2 = Math.min(getPreferredHeight(), size2);
        } else if (mode2 == 0) {
            size2 = getPreferredHeight();
        }
        super.onMeasure(MeasureSpec.makeMeasureSpec(size, C6637f.f18605b), MeasureSpec.makeMeasureSpec(size2, C6637f.f18605b));
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        m2465b(savedState.f1720a);
        requestLayout();
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f1720a = mo2222j();
        return savedState;
    }

    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        m2473v();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: p */
    public void mo2232p() {
        m2465b(mo2222j());
        m2473v();
        if (this.f1709p0.hasFocus()) {
            mo2220h();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: q */
    public void mo2233q() {
        SearchableInfo searchableInfo = this.f1698c1;
        if (searchableInfo != null) {
            try {
                if (searchableInfo.getVoiceSearchLaunchWebSearch()) {
                    getContext().startActivity(m2464b(this.f1677H0, searchableInfo));
                } else if (searchableInfo.getVoiceSearchLaunchRecognizer()) {
                    getContext().startActivity(m2457a(this.f1678I0, searchableInfo));
                }
            } catch (ActivityNotFoundException unused) {
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: r */
    public void mo2234r() {
        int[] iArr = this.f1709p0.hasFocus() ? ViewGroup.FOCUSED_STATE_SET : ViewGroup.EMPTY_STATE_SET;
        Drawable background = this.f1711r0.getBackground();
        if (background != null) {
            background.setState(iArr);
        }
        Drawable background2 = this.f1712s0.getBackground();
        if (background2 != null) {
            background2.setState(iArr);
        }
        invalidate();
    }

    public boolean requestFocus(int i, Rect rect) {
        if (this.f1691V0 || !isFocusable()) {
            return false;
        }
        if (mo2222j()) {
            return super.requestFocus(i, rect);
        }
        boolean requestFocus = this.f1709p0.requestFocus(i, rect);
        if (requestFocus) {
            m2465b(false);
        }
        return requestFocus;
    }

    @C0207n0({C0208a.LIBRARY_GROUP_PREFIX})
    public void setAppSearchData(Bundle bundle) {
        this.f1699d1 = bundle;
    }

    public void setIconified(boolean z) {
        if (z) {
            mo2225m();
        } else {
            mo2226n();
        }
    }

    public void setIconifiedByDefault(boolean z) {
        if (this.f1685P0 != z) {
            this.f1685P0 = z;
            m2465b(z);
            m2475x();
        }
    }

    public void setImeOptions(int i) {
        this.f1709p0.setImeOptions(i);
    }

    public void setInputType(int i) {
        this.f1709p0.setInputType(i);
    }

    public void setMaxWidth(int i) {
        this.f1692W0 = i;
        requestLayout();
    }

    public void setOnCloseListener(C0453l lVar) {
        this.f1681L0 = lVar;
    }

    public void setOnQueryTextFocusChangeListener(OnFocusChangeListener onFocusChangeListener) {
        this.f1682M0 = onFocusChangeListener;
    }

    public void setOnQueryTextListener(C0454m mVar) {
        this.f1680K0 = mVar;
    }

    public void setOnSearchClickListener(OnClickListener onClickListener) {
        this.f1684O0 = onClickListener;
    }

    public void setOnSuggestionListener(C0455n nVar) {
        this.f1683N0 = nVar;
    }

    public void setQueryHint(@C0195i0 CharSequence charSequence) {
        this.f1689T0 = charSequence;
        m2475x();
    }

    public void setQueryRefinementEnabled(boolean z) {
        this.f1690U0 = z;
        C2092a aVar = this.f1687R0;
        if (aVar instanceof C0535n0) {
            ((C0535n0) aVar).mo2820c(z ? 2 : 1);
        }
    }

    public void setSearchableInfo(SearchableInfo searchableInfo) {
        this.f1698c1 = searchableInfo;
        if (this.f1698c1 != null) {
            m2476y();
            m2475x();
        }
        this.f1693X0 = m2471t();
        if (this.f1693X0) {
            this.f1709p0.setPrivateImeOptions(f1668p1);
        }
        m2465b(mo2222j());
    }

    public void setSubmitButtonEnabled(boolean z) {
        this.f1688S0 = z;
        m2465b(mo2222j());
    }

    public void setSuggestionsAdapter(C2092a aVar) {
        this.f1687R0 = aVar;
        this.f1709p0.setAdapter(this.f1687R0);
    }

    public SearchView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0238R.attr.searchViewStyle);
    }

    public SearchView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1719z0 = new Rect();
        this.f1670A0 = new Rect();
        this.f1671B0 = new int[2];
        this.f1672C0 = new int[2];
        this.f1700e1 = new C0443b();
        this.f1701f1 = new C0444c();
        this.f1702g1 = new WeakHashMap<>();
        this.f1703h1 = new C0447f();
        this.f1704i1 = new C0448g();
        this.f1705j1 = new C0449h();
        this.f1706k1 = new C0450i();
        this.f1707l1 = new C0451j();
        this.f1708m1 = new C0442a();
        C0549t0 a = C0549t0.m2910a(context, attributeSet, C0238R.styleable.SearchView, i, 0);
        LayoutInflater.from(context).inflate(a.mo2888g(C0238R.styleable.SearchView_layout, C0238R.layout.abc_search_view), this, true);
        this.f1709p0 = (SearchAutoComplete) findViewById(C0238R.C0241id.search_src_text);
        this.f1709p0.setSearchView(this);
        this.f1710q0 = findViewById(C0238R.C0241id.search_edit_frame);
        this.f1711r0 = findViewById(C0238R.C0241id.search_plate);
        this.f1712s0 = findViewById(C0238R.C0241id.submit_area);
        this.f1713t0 = (ImageView) findViewById(C0238R.C0241id.search_button);
        this.f1714u0 = (ImageView) findViewById(C0238R.C0241id.search_go_btn);
        this.f1715v0 = (ImageView) findViewById(C0238R.C0241id.search_close_btn);
        this.f1716w0 = (ImageView) findViewById(C0238R.C0241id.search_voice_btn);
        this.f1673D0 = (ImageView) findViewById(C0238R.C0241id.search_mag_icon);
        C0962e0.m5440a(this.f1711r0, a.mo2875b(C0238R.styleable.SearchView_queryBackground));
        C0962e0.m5440a(this.f1712s0, a.mo2875b(C0238R.styleable.SearchView_submitBackground));
        this.f1713t0.setImageDrawable(a.mo2875b(C0238R.styleable.SearchView_searchIcon));
        this.f1714u0.setImageDrawable(a.mo2875b(C0238R.styleable.SearchView_goIcon));
        this.f1715v0.setImageDrawable(a.mo2875b(C0238R.styleable.SearchView_closeIcon));
        this.f1716w0.setImageDrawable(a.mo2875b(C0238R.styleable.SearchView_voiceIcon));
        this.f1673D0.setImageDrawable(a.mo2875b(C0238R.styleable.SearchView_searchIcon));
        this.f1674E0 = a.mo2875b(C0238R.styleable.SearchView_searchHintIcon);
        C0557v0.m3031a(this.f1713t0, getResources().getString(C0238R.string.abc_searchview_description_search));
        this.f1675F0 = a.mo2888g(C0238R.styleable.SearchView_suggestionRowLayout, C0238R.layout.abc_search_dropdown_item_icons_2line);
        this.f1676G0 = a.mo2888g(C0238R.styleable.SearchView_commitIcon, 0);
        this.f1713t0.setOnClickListener(this.f1703h1);
        this.f1715v0.setOnClickListener(this.f1703h1);
        this.f1714u0.setOnClickListener(this.f1703h1);
        this.f1716w0.setOnClickListener(this.f1703h1);
        this.f1709p0.setOnClickListener(this.f1703h1);
        this.f1709p0.addTextChangedListener(this.f1708m1);
        this.f1709p0.setOnEditorActionListener(this.f1705j1);
        this.f1709p0.setOnItemClickListener(this.f1706k1);
        this.f1709p0.setOnItemSelectedListener(this.f1707l1);
        this.f1709p0.setOnKeyListener(this.f1704i1);
        this.f1709p0.setOnFocusChangeListener(new C0445d());
        setIconifiedByDefault(a.mo2871a(C0238R.styleable.SearchView_iconifiedByDefault, true));
        int c = a.mo2876c(C0238R.styleable.SearchView_android_maxWidth, -1);
        if (c != -1) {
            setMaxWidth(c);
        }
        this.f1679J0 = a.mo2889g(C0238R.styleable.SearchView_defaultQueryHint);
        this.f1689T0 = a.mo2889g(C0238R.styleable.SearchView_queryHint);
        int d = a.mo2880d(C0238R.styleable.SearchView_android_imeOptions, -1);
        if (d != -1) {
            setImeOptions(d);
        }
        int d2 = a.mo2880d(C0238R.styleable.SearchView_android_inputType, -1);
        if (d2 != -1) {
            setInputType(d2);
        }
        setFocusable(a.mo2871a(C0238R.styleable.SearchView_android_focusable, true));
        a.mo2887f();
        this.f1677H0 = new Intent("android.speech.action.WEB_SEARCH");
        this.f1677H0.addFlags(268435456);
        this.f1677H0.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
        this.f1678I0 = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        this.f1678I0.addFlags(268435456);
        this.f1717x0 = findViewById(this.f1709p0.getDropDownAnchor());
        View view = this.f1717x0;
        if (view != null) {
            view.addOnLayoutChangeListener(new C0446e());
        }
        m2465b(this.f1685P0);
        m2475x();
    }

    /* renamed from: a */
    private void m2461a(View view, Rect rect) {
        view.getLocationInWindow(this.f1671B0);
        getLocationInWindow(this.f1672C0);
        int[] iArr = this.f1671B0;
        int i = iArr[1];
        int[] iArr2 = this.f1672C0;
        int i2 = i - iArr2[1];
        int i3 = iArr[0] - iArr2[0];
        rect.set(i3, i2, view.getWidth() + i3, view.getHeight() + i2);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public boolean mo2210d(int i) {
        C0455n nVar = this.f1683N0;
        if (nVar != null && nVar.onSuggestionSelect(i)) {
            return false;
        }
        m2469e(i);
        return true;
    }

    /* renamed from: c */
    private void m2468c(boolean z) {
        int i;
        if (!this.f1693X0 || mo2222j() || !z) {
            i = 8;
        } else {
            i = 0;
            this.f1714u0.setVisibility(8);
        }
        this.f1716w0.setVisibility(i);
    }

    /* renamed from: c */
    public void mo1322c() {
        if (!this.f1696a1) {
            this.f1696a1 = true;
            this.f1697b1 = this.f1709p0.getImeOptions();
            this.f1709p0.setImeOptions(this.f1697b1 | MediaHttpDownloader.f20486j);
            this.f1709p0.setText("");
            setIconified(false);
        }
    }

    /* renamed from: a */
    private void m2462a(boolean z) {
        this.f1714u0.setVisibility((!this.f1688S0 || !m2472u() || !hasFocus() || (!z && this.f1693X0)) ? 8 : 0);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo2208b(CharSequence charSequence) {
        Editable text = this.f1709p0.getText();
        this.f1695Z0 = text;
        boolean z = !TextUtils.isEmpty(text);
        m2462a(z);
        m2468c(!z);
        m2474w();
        m2477z();
        if (this.f1680K0 != null && !TextUtils.equals(charSequence, this.f1694Y0)) {
            this.f1680K0.onQueryTextChange(charSequence.toString());
        }
        this.f1694Y0 = charSequence.toString();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo2204a(CharSequence charSequence) {
        setQuery(charSequence);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo2207a(View view, int i, KeyEvent keyEvent) {
        int i2;
        if (this.f1698c1 != null && this.f1687R0 != null && keyEvent.getAction() == 0 && keyEvent.hasNoModifiers()) {
            if (i == 66 || i == 84 || i == 61) {
                return mo2206a(this.f1709p0.getListSelection(), 0, (String) null);
            }
            if (i == 21 || i == 22) {
                if (i == 21) {
                    i2 = 0;
                } else {
                    i2 = this.f1709p0.length();
                }
                this.f1709p0.setSelection(i2);
                this.f1709p0.setListSelection(0);
                this.f1709p0.clearListSelection();
                f1669q1.mo2285a(this.f1709p0, true);
                return true;
            } else if (i != 19 || this.f1709p0.getListSelection() == 0) {
                return false;
            }
        }
        return false;
    }

    /* renamed from: b */
    private boolean m2466b(int i, int i2, String str) {
        Cursor a = this.f1687R0.mo9083a();
        if (a == null || !a.moveToPosition(i)) {
            return false;
        }
        m2460a(m2458a(a, i2, str));
        return true;
    }

    /* renamed from: b */
    private Intent m2464b(Intent intent, SearchableInfo searchableInfo) {
        String str;
        Intent intent2 = new Intent(intent);
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        if (searchActivity == null) {
            str = null;
        } else {
            str = searchActivity.flattenToShortString();
        }
        intent2.putExtra("calling_package", str);
        return intent2;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo2206a(int i, int i2, String str) {
        C0455n nVar = this.f1683N0;
        if (nVar != null && nVar.onSuggestionClick(i)) {
            return false;
        }
        m2466b(i, 0, null);
        this.f1709p0.setImeVisibility(false);
        m2470s();
        return true;
    }

    /* renamed from: a */
    private void m2460a(Intent intent) {
        if (intent != null) {
            try {
                getContext().startActivity(intent);
            } catch (RuntimeException unused) {
                StringBuilder sb = new StringBuilder();
                sb.append("Failed launch activity: ");
                sb.append(intent);
                sb.toString();
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo2203a(int i, String str, String str2) {
        getContext().startActivity(m2459a("android.intent.action.SEARCH", null, null, str2, i, str));
    }

    /* renamed from: a */
    private Intent m2459a(String str, Uri uri, String str2, String str3, int i, String str4) {
        Intent intent = new Intent(str);
        intent.addFlags(268435456);
        if (uri != null) {
            intent.setData(uri);
        }
        intent.putExtra("user_query", this.f1695Z0);
        if (str3 != null) {
            intent.putExtra("query", str3);
        }
        if (str2 != null) {
            intent.putExtra("intent_extra_data_key", str2);
        }
        Bundle bundle = this.f1699d1;
        if (bundle != null) {
            intent.putExtra("app_data", bundle);
        }
        if (i != 0) {
            intent.putExtra("action_key", i);
            intent.putExtra("action_msg", str4);
        }
        intent.setComponent(this.f1698c1.getSearchActivity());
        return intent;
    }

    /* renamed from: a */
    private Intent m2457a(Intent intent, SearchableInfo searchableInfo) {
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        Intent intent2 = new Intent("android.intent.action.SEARCH");
        intent2.setComponent(searchActivity);
        PendingIntent activity = PendingIntent.getActivity(getContext(), 0, intent2, C6637f.f18605b);
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f1699d1;
        if (bundle2 != null) {
            bundle.putParcelable("app_data", bundle2);
        }
        Intent intent3 = new Intent(intent);
        int i = 1;
        Resources resources = getResources();
        String string = searchableInfo.getVoiceLanguageModeId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageModeId()) : "free_form";
        String str = null;
        String string2 = searchableInfo.getVoicePromptTextId() != 0 ? resources.getString(searchableInfo.getVoicePromptTextId()) : null;
        String string3 = searchableInfo.getVoiceLanguageId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageId()) : null;
        if (searchableInfo.getVoiceMaxResults() != 0) {
            i = searchableInfo.getVoiceMaxResults();
        }
        intent3.putExtra("android.speech.extra.LANGUAGE_MODEL", string);
        intent3.putExtra("android.speech.extra.PROMPT", string2);
        intent3.putExtra("android.speech.extra.LANGUAGE", string3);
        intent3.putExtra("android.speech.extra.MAX_RESULTS", i);
        if (searchActivity != null) {
            str = searchActivity.flattenToShortString();
        }
        intent3.putExtra("calling_package", str);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT", activity);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT_BUNDLE", bundle);
        return intent3;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:19|20|23|24) */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        r10 = r10.getPosition();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0066, code lost:
        r10 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0067, code lost:
        r11 = new java.lang.StringBuilder();
        r11.append("Search suggestions cursor at row ");
        r11.append(r10);
        r11.append(" returned exception.");
        r11.toString();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x007c, code lost:
        return null;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0061 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.content.Intent m2458a(android.database.Cursor r10, int r11, java.lang.String r12) {
        /*
            r9 = this;
            r0 = 0
            java.lang.String r1 = "suggest_intent_action"
            java.lang.String r1 = androidx.appcompat.widget.C0535n0.m2856a(r10, r1)     // Catch:{ RuntimeException -> 0x0061 }
            if (r1 != 0) goto L_0x000f
            android.app.SearchableInfo r1 = r9.f1698c1     // Catch:{ RuntimeException -> 0x0061 }
            java.lang.String r1 = r1.getSuggestIntentAction()     // Catch:{ RuntimeException -> 0x0061 }
        L_0x000f:
            if (r1 != 0) goto L_0x0013
            java.lang.String r1 = "android.intent.action.SEARCH"
        L_0x0013:
            r3 = r1
            java.lang.String r1 = "suggest_intent_data"
            java.lang.String r1 = androidx.appcompat.widget.C0535n0.m2856a(r10, r1)     // Catch:{ RuntimeException -> 0x0061 }
            if (r1 != 0) goto L_0x0022
            android.app.SearchableInfo r1 = r9.f1698c1     // Catch:{ RuntimeException -> 0x0061 }
            java.lang.String r1 = r1.getSuggestIntentData()     // Catch:{ RuntimeException -> 0x0061 }
        L_0x0022:
            if (r1 == 0) goto L_0x0044
            java.lang.String r2 = "suggest_intent_data_id"
            java.lang.String r2 = androidx.appcompat.widget.C0535n0.m2856a(r10, r2)     // Catch:{ RuntimeException -> 0x0061 }
            if (r2 == 0) goto L_0x0044
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ RuntimeException -> 0x0061 }
            r4.<init>()     // Catch:{ RuntimeException -> 0x0061 }
            r4.append(r1)     // Catch:{ RuntimeException -> 0x0061 }
            java.lang.String r1 = "/"
            r4.append(r1)     // Catch:{ RuntimeException -> 0x0061 }
            java.lang.String r1 = android.net.Uri.encode(r2)     // Catch:{ RuntimeException -> 0x0061 }
            r4.append(r1)     // Catch:{ RuntimeException -> 0x0061 }
            java.lang.String r1 = r4.toString()     // Catch:{ RuntimeException -> 0x0061 }
        L_0x0044:
            if (r1 != 0) goto L_0x0048
            r4 = r0
            goto L_0x004d
        L_0x0048:
            android.net.Uri r1 = android.net.Uri.parse(r1)     // Catch:{ RuntimeException -> 0x0061 }
            r4 = r1
        L_0x004d:
            java.lang.String r1 = "suggest_intent_query"
            java.lang.String r6 = androidx.appcompat.widget.C0535n0.m2856a(r10, r1)     // Catch:{ RuntimeException -> 0x0061 }
            java.lang.String r1 = "suggest_intent_extra_data"
            java.lang.String r5 = androidx.appcompat.widget.C0535n0.m2856a(r10, r1)     // Catch:{ RuntimeException -> 0x0061 }
            r2 = r9
            r7 = r11
            r8 = r12
            android.content.Intent r10 = r2.m2459a(r3, r4, r5, r6, r7, r8)     // Catch:{ RuntimeException -> 0x0061 }
            return r10
        L_0x0061:
            int r10 = r10.getPosition()     // Catch:{ RuntimeException -> 0x0066 }
            goto L_0x0067
        L_0x0066:
            r10 = -1
        L_0x0067:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = "Search suggestions cursor at row "
            r11.append(r12)
            r11.append(r10)
            java.lang.String r10 = " returned exception."
            r11.append(r10)
            r11.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SearchView.m2458a(android.database.Cursor, int, java.lang.String):android.content.Intent");
    }

    /* renamed from: a */
    static boolean m2463a(Context context) {
        return context.getResources().getConfiguration().orientation == 2;
    }
}
