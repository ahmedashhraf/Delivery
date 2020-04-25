package com.google.android.material.chip;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewGroup.OnHierarchyChangeListener;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import androidx.annotation.C0192h;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import androidx.annotation.C0209o;
import androidx.annotation.C0211p;
import androidx.annotation.C0225w;
import com.google.android.material.C5582R;
import com.google.android.material.internal.C6898e;
import com.google.android.material.internal.C6928p;
import java.util.ArrayList;
import java.util.List;

public class ChipGroup extends C6898e {
    @C0211p

    /* renamed from: O */
    private int f16463O;
    @C0211p

    /* renamed from: P */
    private int f16464P;
    /* access modifiers changed from: private */

    /* renamed from: Q */
    public boolean f16465Q;
    /* access modifiers changed from: private */

    /* renamed from: R */
    public boolean f16466R;
    @C0195i0

    /* renamed from: S */
    private C5692d f16467S;
    /* access modifiers changed from: private */

    /* renamed from: T */
    public final C5690b f16468T;
    @C0193h0

    /* renamed from: U */
    private C5693e f16469U;
    /* access modifiers changed from: private */
    @C0225w

    /* renamed from: V */
    public int f16470V;
    /* access modifiers changed from: private */

    /* renamed from: W */
    public boolean f16471W;

    /* renamed from: com.google.android.material.chip.ChipGroup$b */
    private class C5690b implements OnCheckedChangeListener {
        private C5690b() {
        }

        public void onCheckedChanged(@C0193h0 CompoundButton compoundButton, boolean z) {
            if (!ChipGroup.this.f16471W) {
                if (!ChipGroup.this.getCheckedChipIds().isEmpty() || !ChipGroup.this.f16466R) {
                    int id = compoundButton.getId();
                    if (z) {
                        if (!(ChipGroup.this.f16470V == -1 || ChipGroup.this.f16470V == id || !ChipGroup.this.f16465Q)) {
                            ChipGroup chipGroup = ChipGroup.this;
                            chipGroup.m24962a(chipGroup.f16470V, false);
                        }
                        ChipGroup.this.setCheckedId(id);
                    } else if (ChipGroup.this.f16470V == id) {
                        ChipGroup.this.setCheckedId(-1);
                    }
                    return;
                }
                ChipGroup.this.m24962a(compoundButton.getId(), true);
                ChipGroup.this.setCheckedId(compoundButton.getId());
            }
        }
    }

    /* renamed from: com.google.android.material.chip.ChipGroup$c */
    public static class C5691c extends MarginLayoutParams {
        public C5691c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public C5691c(LayoutParams layoutParams) {
            super(layoutParams);
        }

        public C5691c(int i, int i2) {
            super(i, i2);
        }

        public C5691c(MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }
    }

    /* renamed from: com.google.android.material.chip.ChipGroup$d */
    public interface C5692d {
        /* renamed from: a */
        void mo22855a(ChipGroup chipGroup, @C0225w int i);
    }

    /* renamed from: com.google.android.material.chip.ChipGroup$e */
    private class C5693e implements OnHierarchyChangeListener {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public OnHierarchyChangeListener f16473a;

        private C5693e() {
        }

        public void onChildViewAdded(View view, View view2) {
            int i;
            if (view == ChipGroup.this && (view2 instanceof Chip)) {
                if (view2.getId() == -1) {
                    if (VERSION.SDK_INT >= 17) {
                        i = View.generateViewId();
                    } else {
                        i = view2.hashCode();
                    }
                    view2.setId(i);
                }
                ((Chip) view2).setOnCheckedChangeListenerInternal(ChipGroup.this.f16468T);
            }
            OnHierarchyChangeListener onHierarchyChangeListener = this.f16473a;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewAdded(view, view2);
            }
        }

        public void onChildViewRemoved(View view, View view2) {
            if (view == ChipGroup.this && (view2 instanceof Chip)) {
                ((Chip) view2).setOnCheckedChangeListenerInternal(null);
            }
            OnHierarchyChangeListener onHierarchyChangeListener = this.f16473a;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewRemoved(view, view2);
            }
        }
    }

    public ChipGroup(Context context) {
        this(context, null);
    }

    /* access modifiers changed from: private */
    public void setCheckedId(int i) {
        this.f16470V = i;
        C5692d dVar = this.f16467S;
        if (dVar != null && this.f16465Q) {
            dVar.mo22855a(this, i);
        }
    }

    public void addView(View view, int i, LayoutParams layoutParams) {
        if (view instanceof Chip) {
            Chip chip = (Chip) view;
            if (chip.isChecked()) {
                int i2 = this.f16470V;
                if (i2 != -1 && this.f16465Q) {
                    m24962a(i2, false);
                }
                setCheckedId(chip.getId());
            }
        }
        super.addView(view, i, layoutParams);
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof C5691c);
    }

    /* access modifiers changed from: protected */
    @C0193h0
    public LayoutParams generateDefaultLayoutParams() {
        return new C5691c(-2, -2);
    }

    @C0193h0
    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C5691c(getContext(), attributeSet);
    }

    @C0225w
    public int getCheckedChipId() {
        if (this.f16465Q) {
            return this.f16470V;
        }
        return -1;
    }

    @C0193h0
    public List<Integer> getCheckedChipIds() {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if ((childAt instanceof Chip) && ((Chip) childAt).isChecked()) {
                arrayList.add(Integer.valueOf(childAt.getId()));
                if (this.f16465Q) {
                    return arrayList;
                }
            }
        }
        return arrayList;
    }

    @C0211p
    public int getChipSpacingHorizontal() {
        return this.f16463O;
    }

    @C0211p
    public int getChipSpacingVertical() {
        return this.f16464P;
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        int i = this.f16470V;
        if (i != -1) {
            m24962a(i, true);
            setCheckedId(this.f16470V);
        }
    }

    public void setChipSpacing(@C0211p int i) {
        setChipSpacingHorizontal(i);
        setChipSpacingVertical(i);
    }

    public void setChipSpacingHorizontal(@C0211p int i) {
        if (this.f16463O != i) {
            this.f16463O = i;
            setItemSpacing(i);
            requestLayout();
        }
    }

    public void setChipSpacingHorizontalResource(@C0209o int i) {
        setChipSpacingHorizontal(getResources().getDimensionPixelOffset(i));
    }

    public void setChipSpacingResource(@C0209o int i) {
        setChipSpacing(getResources().getDimensionPixelOffset(i));
    }

    public void setChipSpacingVertical(@C0211p int i) {
        if (this.f16464P != i) {
            this.f16464P = i;
            setLineSpacing(i);
            requestLayout();
        }
    }

    public void setChipSpacingVerticalResource(@C0209o int i) {
        setChipSpacingVertical(getResources().getDimensionPixelOffset(i));
    }

    @Deprecated
    public void setDividerDrawableHorizontal(Drawable drawable) {
        throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setDividerDrawableVertical(@C0195i0 Drawable drawable) {
        throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setFlexWrap(int i) {
        throw new UnsupportedOperationException("Changing flex wrap not allowed. ChipGroup exposes a singleLine attribute instead.");
    }

    public void setOnCheckedChangeListener(C5692d dVar) {
        this.f16467S = dVar;
    }

    public void setOnHierarchyChangeListener(OnHierarchyChangeListener onHierarchyChangeListener) {
        this.f16469U.f16473a = onHierarchyChangeListener;
    }

    public void setSelectionRequired(boolean z) {
        this.f16466R = z;
    }

    @Deprecated
    public void setShowDividerHorizontal(int i) {
        throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setShowDividerVertical(int i) {
        throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    public void setSingleLine(boolean z) {
        super.setSingleLine(z);
    }

    public void setSingleSelection(boolean z) {
        if (this.f16465Q != z) {
            this.f16465Q = z;
            mo22824b();
        }
    }

    public ChipGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C5582R.attr.chipGroupStyle);
    }

    /* renamed from: b */
    public void mo22824b() {
        this.f16471W = true;
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof Chip) {
                ((Chip) childAt).setChecked(false);
            }
        }
        this.f16471W = false;
        setCheckedId(-1);
    }

    /* renamed from: c */
    public boolean mo22825c() {
        return this.f16466R;
    }

    /* renamed from: d */
    public boolean mo22827d() {
        return this.f16465Q;
    }

    /* access modifiers changed from: protected */
    @C0193h0
    public LayoutParams generateLayoutParams(LayoutParams layoutParams) {
        return new C5691c(layoutParams);
    }

    public void setSingleLine(@C0192h int i) {
        setSingleLine(getResources().getBoolean(i));
    }

    public ChipGroup(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f16468T = new C5690b();
        this.f16469U = new C5693e();
        this.f16470V = -1;
        this.f16471W = false;
        TypedArray c = C6928p.m33264c(context, attributeSet, C5582R.styleable.ChipGroup, i, C5582R.style.Widget_MaterialComponents_ChipGroup, new int[0]);
        int dimensionPixelOffset = c.getDimensionPixelOffset(C5582R.styleable.ChipGroup_chipSpacing, 0);
        setChipSpacingHorizontal(c.getDimensionPixelOffset(C5582R.styleable.ChipGroup_chipSpacingHorizontal, dimensionPixelOffset));
        setChipSpacingVertical(c.getDimensionPixelOffset(C5582R.styleable.ChipGroup_chipSpacingVertical, dimensionPixelOffset));
        setSingleLine(c.getBoolean(C5582R.styleable.ChipGroup_singleLine, false));
        setSingleSelection(c.getBoolean(C5582R.styleable.ChipGroup_singleSelection, false));
        setSelectionRequired(c.getBoolean(C5582R.styleable.ChipGroup_selectionRequired, false));
        int resourceId = c.getResourceId(C5582R.styleable.ChipGroup_checkedChip, -1);
        if (resourceId != -1) {
            this.f16470V = resourceId;
        }
        c.recycle();
        super.setOnHierarchyChangeListener(this.f16469U);
    }

    /* renamed from: a */
    public void mo22821a(@C0225w int i) {
        int i2 = this.f16470V;
        if (i != i2) {
            if (i2 != -1 && this.f16465Q) {
                m24962a(i2, false);
            }
            if (i != -1) {
                m24962a(i, true);
            }
            setCheckedId(i);
        }
    }

    public void setSingleSelection(@C0192h int i) {
        setSingleSelection(getResources().getBoolean(i));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m24962a(@C0225w int i, boolean z) {
        View findViewById = findViewById(i);
        if (findViewById instanceof Chip) {
            this.f16471W = true;
            ((Chip) findViewById).setChecked(z);
            this.f16471W = false;
        }
    }

    /* renamed from: a */
    public boolean mo22822a() {
        return super.mo22822a();
    }
}
