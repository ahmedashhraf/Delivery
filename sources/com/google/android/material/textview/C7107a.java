package com.google.android.material.textview;

import android.content.Context;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.Filterable;
import android.widget.ListAdapter;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import androidx.appcompat.widget.C0485d;
import androidx.appcompat.widget.C0495f0;
import com.google.android.material.C5582R;
import com.google.android.material.textfield.TextInputLayout;

/* renamed from: com.google.android.material.textview.a */
/* compiled from: MaterialAutoCompleteTextView */
public class C7107a extends C0485d {
    /* access modifiers changed from: private */
    @C0193h0

    /* renamed from: O */
    public final C0495f0 f20168O;
    @C0195i0

    /* renamed from: P */
    private final AccessibilityManager f20169P;

    /* renamed from: com.google.android.material.textview.a$a */
    /* compiled from: MaterialAutoCompleteTextView */
    class C7108a implements OnItemClickListener {
        C7108a() {
        }

        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            C7107a.this.m34243a(i < 0 ? C7107a.this.f20168O.mo2629p() : C7107a.this.getAdapter().getItem(i));
            OnItemClickListener onItemClickListener = C7107a.this.getOnItemClickListener();
            if (onItemClickListener != null) {
                if (view == null || i < 0) {
                    view = C7107a.this.f20168O.mo2632s();
                    i = C7107a.this.f20168O.mo2631r();
                    j = C7107a.this.f20168O.mo2630q();
                }
                onItemClickListener.onItemClick(C7107a.this.f20168O.mo1518f(), view, i, j);
            }
            C7107a.this.f20168O.dismiss();
        }
    }

    public C7107a(@C0193h0 Context context) {
        this(context, null);
    }

    @C0195i0
    public CharSequence getHint() {
        TextInputLayout a = m34241a();
        if (a == null || !a.mo28309n()) {
            return super.getHint();
        }
        return a.getHint();
    }

    public <T extends ListAdapter & Filterable> void setAdapter(@C0195i0 T t) {
        super.setAdapter(t);
        this.f20168O.mo2100a(getAdapter());
    }

    public void showDropDown() {
        if (getInputType() == 0) {
            AccessibilityManager accessibilityManager = this.f20169P;
            if (accessibilityManager != null && accessibilityManager.isTouchExplorationEnabled()) {
                this.f20168O.mo1509b();
                return;
            }
        }
        super.showDropDown();
    }

    public C7107a(@C0193h0 Context context, @C0195i0 AttributeSet attributeSet) {
        this(context, attributeSet, C5582R.attr.autoCompleteTextViewStyle);
    }

    public C7107a(@C0193h0 Context context, @C0195i0 AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f20169P = (AccessibilityManager) context.getSystemService("accessibility");
        this.f20168O = new C0495f0(getContext());
        this.f20168O.mo2605c(true);
        this.f20168O.mo2601b((View) this);
        this.f20168O.mo2616i(2);
        this.f20168O.mo2100a(getAdapter());
        this.f20168O.mo2594a((OnItemClickListener) new C7108a());
    }

    @C0195i0
    /* renamed from: a */
    private TextInputLayout m34241a() {
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof TextInputLayout) {
                return (TextInputLayout) parent;
            }
        }
        return null;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public <T extends ListAdapter & Filterable> void m34243a(Object obj) {
        if (VERSION.SDK_INT >= 17) {
            setText(convertSelectionToString(obj), false);
            return;
        }
        ListAdapter adapter = getAdapter();
        setAdapter(null);
        setText(convertSelectionToString(obj));
        setAdapter(adapter);
    }
}
