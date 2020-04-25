package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.BaseSavedState;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.LinearLayout;
import android.widget.TabHost;
import android.widget.TabHost.OnTabChangeListener;
import android.widget.TabHost.TabContentFactory;
import android.widget.TabHost.TabSpec;
import android.widget.TabWidget;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import java.util.ArrayList;

@Deprecated
public class FragmentTabHost extends TabHost implements OnTabChangeListener {

    /* renamed from: N */
    private Context f5395N;

    /* renamed from: O */
    private C1382h f5396O;

    /* renamed from: P */
    private int f5397P;

    /* renamed from: Q */
    private OnTabChangeListener f5398Q;

    /* renamed from: R */
    private C1372b f5399R;

    /* renamed from: S */
    private boolean f5400S;

    /* renamed from: a */
    private final ArrayList<C1372b> f5401a = new ArrayList<>();

    /* renamed from: b */
    private FrameLayout f5402b;

    static class SavedState extends BaseSavedState {
        public static final Creator<SavedState> CREATOR = new C1370a();

        /* renamed from: a */
        String f5403a;

        /* renamed from: androidx.fragment.app.FragmentTabHost$SavedState$a */
        static class C1370a implements Creator<SavedState> {
            C1370a() {
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

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("FragmentTabHost.SavedState{");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" curTab=");
            sb.append(this.f5403a);
            sb.append("}");
            return sb.toString();
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeString(this.f5403a);
        }

        SavedState(Parcel parcel) {
            super(parcel);
            this.f5403a = parcel.readString();
        }
    }

    /* renamed from: androidx.fragment.app.FragmentTabHost$a */
    static class C1371a implements TabContentFactory {

        /* renamed from: a */
        private final Context f5404a;

        public C1371a(Context context) {
            this.f5404a = context;
        }

        public View createTabContent(String str) {
            View view = new View(this.f5404a);
            view.setMinimumWidth(0);
            view.setMinimumHeight(0);
            return view;
        }
    }

    /* renamed from: androidx.fragment.app.FragmentTabHost$b */
    static final class C1372b {
        @C0193h0

        /* renamed from: a */
        final String f5405a;
        @C0193h0

        /* renamed from: b */
        final Class<?> f5406b;
        @C0195i0

        /* renamed from: c */
        final Bundle f5407c;

        /* renamed from: d */
        Fragment f5408d;

        C1372b(@C0193h0 String str, @C0193h0 Class<?> cls, @C0195i0 Bundle bundle) {
            this.f5405a = str;
            this.f5406b = cls;
            this.f5407c = bundle;
        }
    }

    @Deprecated
    public FragmentTabHost(@C0193h0 Context context) {
        super(context, null);
        m7164a(context, (AttributeSet) null);
    }

    /* renamed from: a */
    private void m7164a(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{16842995}, 0, 0);
        this.f5397P = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.recycle();
        super.setOnTabChangedListener(this);
    }

    /* access modifiers changed from: protected */
    @Deprecated
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        String currentTabTag = getCurrentTabTag();
        int size = this.f5401a.size();
        C1406n nVar = null;
        for (int i = 0; i < size; i++) {
            C1372b bVar = (C1372b) this.f5401a.get(i);
            bVar.f5408d = this.f5396O.mo6223a(bVar.f5405a);
            Fragment fragment = bVar.f5408d;
            if (fragment != null && !fragment.isDetached()) {
                if (bVar.f5405a.equals(currentTabTag)) {
                    this.f5399R = bVar;
                } else {
                    if (nVar == null) {
                        nVar = this.f5396O.mo6224a();
                    }
                    nVar.mo6090b(bVar.f5408d);
                }
            }
        }
        this.f5400S = true;
        C1406n a = m7161a(currentTabTag, nVar);
        if (a != null) {
            a.mo6097e();
            this.f5396O.mo6235b();
        }
    }

    /* access modifiers changed from: protected */
    @Deprecated
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f5400S = false;
    }

    /* access modifiers changed from: protected */
    @Deprecated
    public void onRestoreInstanceState(@SuppressLint({"UnknownNullness"}) Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        setCurrentTabByTag(savedState.f5403a);
    }

    /* access modifiers changed from: protected */
    @C0193h0
    @Deprecated
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f5403a = getCurrentTabTag();
        return savedState;
    }

    @Deprecated
    public void onTabChanged(@C0195i0 String str) {
        if (this.f5400S) {
            C1406n a = m7161a(str, (C1406n) null);
            if (a != null) {
                a.mo6097e();
            }
        }
        OnTabChangeListener onTabChangeListener = this.f5398Q;
        if (onTabChangeListener != null) {
            onTabChangeListener.onTabChanged(str);
        }
    }

    @Deprecated
    public void setOnTabChangedListener(@C0195i0 OnTabChangeListener onTabChangeListener) {
        this.f5398Q = onTabChangeListener;
    }

    @Deprecated
    public void setup() {
        throw new IllegalStateException("Must call setup() that takes a Context and FragmentManager");
    }

    @Deprecated
    public FragmentTabHost(@C0193h0 Context context, @C0195i0 AttributeSet attributeSet) {
        super(context, attributeSet);
        m7164a(context, attributeSet);
    }

    /* renamed from: a */
    private void m7163a(Context context) {
        if (findViewById(16908307) == null) {
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(1);
            addView(linearLayout, new LayoutParams(-1, -1));
            TabWidget tabWidget = new TabWidget(context);
            tabWidget.setId(16908307);
            tabWidget.setOrientation(0);
            linearLayout.addView(tabWidget, new LinearLayout.LayoutParams(-1, -2, 0.0f));
            FrameLayout frameLayout = new FrameLayout(context);
            frameLayout.setId(16908305);
            linearLayout.addView(frameLayout, new LinearLayout.LayoutParams(0, 0, 0.0f));
            FrameLayout frameLayout2 = new FrameLayout(context);
            this.f5402b = frameLayout2;
            this.f5402b.setId(this.f5397P);
            linearLayout.addView(frameLayout2, new LinearLayout.LayoutParams(-1, 0, 1.0f));
        }
    }

    @Deprecated
    /* renamed from: a */
    public void mo6064a(@C0193h0 Context context, @C0193h0 C1382h hVar) {
        m7163a(context);
        super.setup();
        this.f5395N = context;
        this.f5396O = hVar;
        m7162a();
    }

    @Deprecated
    /* renamed from: a */
    public void mo6065a(@C0193h0 Context context, @C0193h0 C1382h hVar, int i) {
        m7163a(context);
        super.setup();
        this.f5395N = context;
        this.f5396O = hVar;
        this.f5397P = i;
        m7162a();
        this.f5402b.setId(i);
        if (getId() == -1) {
            setId(16908306);
        }
    }

    /* renamed from: a */
    private void m7162a() {
        if (this.f5402b == null) {
            this.f5402b = (FrameLayout) findViewById(this.f5397P);
            if (this.f5402b == null) {
                StringBuilder sb = new StringBuilder();
                sb.append("No tab content FrameLayout found for id ");
                sb.append(this.f5397P);
                throw new IllegalStateException(sb.toString());
            }
        }
    }

    @Deprecated
    /* renamed from: a */
    public void mo6066a(@C0193h0 TabSpec tabSpec, @C0193h0 Class<?> cls, @C0195i0 Bundle bundle) {
        tabSpec.setContent(new C1371a(this.f5395N));
        String tag = tabSpec.getTag();
        C1372b bVar = new C1372b(tag, cls, bundle);
        if (this.f5400S) {
            bVar.f5408d = this.f5396O.mo6223a(tag);
            Fragment fragment = bVar.f5408d;
            if (fragment != null && !fragment.isDetached()) {
                C1406n a = this.f5396O.mo6224a();
                a.mo6090b(bVar.f5408d);
                a.mo6097e();
            }
        }
        this.f5401a.add(bVar);
        addTab(tabSpec);
    }

    @C0195i0
    /* renamed from: a */
    private C1406n m7161a(@C0195i0 String str, @C0195i0 C1406n nVar) {
        C1372b a = m7160a(str);
        if (this.f5399R != a) {
            if (nVar == null) {
                nVar = this.f5396O.mo6224a();
            }
            C1372b bVar = this.f5399R;
            if (bVar != null) {
                Fragment fragment = bVar.f5408d;
                if (fragment != null) {
                    nVar.mo6090b(fragment);
                }
            }
            if (a != null) {
                Fragment fragment2 = a.f5408d;
                if (fragment2 == null) {
                    a.f5408d = this.f5396O.mo6239d().mo6216a(this.f5395N.getClassLoader(), a.f5406b.getName());
                    a.f5408d.setArguments(a.f5407c);
                    nVar.mo6395a(this.f5397P, a.f5408d, a.f5405a);
                } else {
                    nVar.mo6397a(fragment2);
                }
            }
            this.f5399R = a;
        }
        return nVar;
    }

    @C0195i0
    /* renamed from: a */
    private C1372b m7160a(String str) {
        int size = this.f5401a.size();
        for (int i = 0; i < size; i++) {
            C1372b bVar = (C1372b) this.f5401a.get(i);
            if (bVar.f5405a.equals(str)) {
                return bVar;
            }
        }
        return null;
    }
}
