package com.google.android.material.button;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.text.TextUtils.TruncateAt;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import androidx.annotation.C0192h;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import androidx.annotation.C0224v0;
import androidx.annotation.C0225w;
import androidx.core.p034l.C0962e0;
import androidx.core.p034l.C0999l;
import com.google.android.material.C5582R;
import com.google.android.material.button.MaterialButton.C5674b;
import com.google.android.material.internal.C6928p;
import com.google.android.material.internal.C6936w;
import com.google.android.material.p187p.C6969a;
import com.google.android.material.p187p.C6971d;
import com.google.android.material.p187p.C6986o;
import com.google.android.material.p187p.C6986o.C6988b;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.TreeMap;

public class MaterialButtonToggleGroup extends LinearLayout {

    /* renamed from: V */
    private static final String f16355V = MaterialButtonToggleGroup.class.getSimpleName();

    /* renamed from: N */
    private final C5680e f16356N;

    /* renamed from: O */
    private final LinkedHashSet<C5679d> f16357O;

    /* renamed from: P */
    private final Comparator<MaterialButton> f16358P;

    /* renamed from: Q */
    private Integer[] f16359Q;
    /* access modifiers changed from: private */

    /* renamed from: R */
    public boolean f16360R;
    /* access modifiers changed from: private */

    /* renamed from: S */
    public boolean f16361S;

    /* renamed from: T */
    private boolean f16362T;
    /* access modifiers changed from: private */
    @C0225w

    /* renamed from: U */
    public int f16363U;

    /* renamed from: a */
    private final List<C5678c> f16364a;

    /* renamed from: b */
    private final C5677b f16365b;

    /* renamed from: com.google.android.material.button.MaterialButtonToggleGroup$a */
    class C5676a implements Comparator<MaterialButton> {
        C5676a() {
        }

        /* renamed from: a */
        public int compare(MaterialButton materialButton, MaterialButton materialButton2) {
            int compareTo = Boolean.valueOf(materialButton.isChecked()).compareTo(Boolean.valueOf(materialButton2.isChecked()));
            if (compareTo != 0) {
                return compareTo;
            }
            int compareTo2 = Boolean.valueOf(materialButton.isPressed()).compareTo(Boolean.valueOf(materialButton2.isPressed()));
            if (compareTo2 != 0) {
                return compareTo2;
            }
            return Integer.valueOf(MaterialButtonToggleGroup.this.indexOfChild(materialButton)).compareTo(Integer.valueOf(MaterialButtonToggleGroup.this.indexOfChild(materialButton2)));
        }
    }

    /* renamed from: com.google.android.material.button.MaterialButtonToggleGroup$b */
    private class C5677b implements C5674b {
        private C5677b() {
        }

        /* renamed from: a */
        public void mo22551a(@C0193h0 MaterialButton materialButton, boolean z) {
            if (!MaterialButtonToggleGroup.this.f16360R) {
                if (MaterialButtonToggleGroup.this.f16361S) {
                    MaterialButtonToggleGroup.this.f16363U = z ? materialButton.getId() : -1;
                }
                MaterialButtonToggleGroup.this.m24799a(materialButton.getId(), z);
                MaterialButtonToggleGroup.this.m24807c(materialButton.getId(), z);
                MaterialButtonToggleGroup.this.invalidate();
            }
        }

        /* synthetic */ C5677b(MaterialButtonToggleGroup materialButtonToggleGroup, C5676a aVar) {
            this();
        }
    }

    /* renamed from: com.google.android.material.button.MaterialButtonToggleGroup$c */
    private static class C5678c {

        /* renamed from: e */
        private static final C6971d f16368e = new C6969a(0.0f);

        /* renamed from: a */
        C6971d f16369a;

        /* renamed from: b */
        C6971d f16370b;

        /* renamed from: c */
        C6971d f16371c;

        /* renamed from: d */
        C6971d f16372d;

        C5678c(C6971d dVar, C6971d dVar2, C6971d dVar3, C6971d dVar4) {
            this.f16369a = dVar;
            this.f16370b = dVar3;
            this.f16371c = dVar4;
            this.f16372d = dVar2;
        }

        /* renamed from: a */
        public static C5678c m24825a(C5678c cVar, View view) {
            return C6936w.m33301e(view) ? m24826b(cVar) : m24828c(cVar);
        }

        /* renamed from: b */
        public static C5678c m24827b(C5678c cVar, View view) {
            return C6936w.m33301e(view) ? m24828c(cVar) : m24826b(cVar);
        }

        /* renamed from: c */
        public static C5678c m24828c(C5678c cVar) {
            C6971d dVar = f16368e;
            return new C5678c(dVar, dVar, cVar.f16370b, cVar.f16371c);
        }

        /* renamed from: d */
        public static C5678c m24829d(C5678c cVar) {
            C6971d dVar = cVar.f16369a;
            C6971d dVar2 = f16368e;
            return new C5678c(dVar, dVar2, cVar.f16370b, dVar2);
        }

        /* renamed from: a */
        public static C5678c m24824a(C5678c cVar) {
            C6971d dVar = f16368e;
            return new C5678c(dVar, cVar.f16372d, dVar, cVar.f16371c);
        }

        /* renamed from: b */
        public static C5678c m24826b(C5678c cVar) {
            C6971d dVar = cVar.f16369a;
            C6971d dVar2 = cVar.f16372d;
            C6971d dVar3 = f16368e;
            return new C5678c(dVar, dVar2, dVar3, dVar3);
        }
    }

    /* renamed from: com.google.android.material.button.MaterialButtonToggleGroup$d */
    public interface C5679d {
        /* renamed from: a */
        void mo22576a(MaterialButtonToggleGroup materialButtonToggleGroup, @C0225w int i, boolean z);
    }

    /* renamed from: com.google.android.material.button.MaterialButtonToggleGroup$e */
    private class C5680e implements C5675c {
        private C5680e() {
        }

        /* renamed from: a */
        public void mo22552a(@C0193h0 MaterialButton materialButton, boolean z) {
            MaterialButtonToggleGroup.this.m24807c(materialButton.getId(), materialButton.isChecked());
            MaterialButtonToggleGroup.this.invalidate();
        }

        /* synthetic */ C5680e(MaterialButtonToggleGroup materialButtonToggleGroup, C5676a aVar) {
            this();
        }
    }

    public MaterialButtonToggleGroup(@C0193h0 Context context) {
        this(context, null);
    }

    /* renamed from: f */
    private void m24810f() {
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        if (firstVisibleChildIndex != -1) {
            for (int i = firstVisibleChildIndex + 1; i < getChildCount(); i++) {
                MaterialButton d = m24808d(i);
                int min = Math.min(d.getStrokeWidth(), m24808d(i - 1).getStrokeWidth());
                LayoutParams a = m24797a((View) d);
                if (getOrientation() == 0) {
                    C0999l.m5725c(a, 0);
                    C0999l.m5726d(a, -min);
                } else {
                    a.bottomMargin = 0;
                    a.topMargin = -min;
                }
                d.setLayoutParams(a);
            }
            m24811f(firstVisibleChildIndex);
        }
    }

    /* renamed from: g */
    private void m24812g() {
        TreeMap treeMap = new TreeMap(this.f16358P);
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            treeMap.put(m24808d(i), Integer.valueOf(i));
        }
        this.f16359Q = (Integer[]) treeMap.values().toArray(new Integer[0]);
    }

    private int getFirstVisibleChildIndex() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (m24809e(i)) {
                return i;
            }
        }
        return -1;
    }

    private int getLastVisibleChildIndex() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            if (m24809e(childCount)) {
                return childCount;
            }
        }
        return -1;
    }

    private void setCheckedId(int i) {
        this.f16363U = i;
        m24799a(i, true);
    }

    private void setGeneratedIdIfNeeded(@C0193h0 MaterialButton materialButton) {
        if (materialButton.getId() == -1) {
            materialButton.setId(C0962e0.m5482c());
        }
    }

    private void setupButtonChild(@C0193h0 MaterialButton materialButton) {
        materialButton.setMaxLines(1);
        materialButton.setEllipsize(TruncateAt.END);
        materialButton.setCheckable(true);
        materialButton.mo22501a((C5674b) this.f16365b);
        materialButton.setOnPressedChangeListenerInternal(this.f16356N);
        materialButton.setShouldDrawSurfaceColorStroke(true);
    }

    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (view instanceof MaterialButton) {
            super.addView(view, i, layoutParams);
            MaterialButton materialButton = (MaterialButton) view;
            setGeneratedIdIfNeeded(materialButton);
            setupButtonChild(materialButton);
            if (materialButton.isChecked()) {
                m24807c(materialButton.getId(), true);
                setCheckedId(materialButton.getId());
            }
            C6986o shapeAppearanceModel = materialButton.getShapeAppearanceModel();
            this.f16364a.add(new C5678c(shapeAppearanceModel.mo27868j(), shapeAppearanceModel.mo27861c(), shapeAppearanceModel.mo27870l(), shapeAppearanceModel.mo27863e()));
        }
    }

    /* renamed from: c */
    public boolean mo22560c() {
        return this.f16362T;
    }

    /* renamed from: d */
    public boolean mo22561d() {
        return this.f16361S;
    }

    /* access modifiers changed from: protected */
    public void dispatchDraw(@C0193h0 Canvas canvas) {
        m24812g();
        super.dispatchDraw(canvas);
    }

    /* access modifiers changed from: 0000 */
    @C0224v0
    /* renamed from: e */
    public void mo22563e() {
        int childCount = getChildCount();
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        int lastVisibleChildIndex = getLastVisibleChildIndex();
        for (int i = 0; i < childCount; i++) {
            MaterialButton d = m24808d(i);
            if (d.getVisibility() != 8) {
                C6988b m = d.getShapeAppearanceModel().mo27871m();
                m24801a(m, m24798a(i, firstVisibleChildIndex, lastVisibleChildIndex));
                d.setShapeAppearanceModel(m.mo27878a());
            }
        }
    }

    @C0193h0
    public CharSequence getAccessibilityClassName() {
        return MaterialButtonToggleGroup.class.getName();
    }

    @C0225w
    public int getCheckedButtonId() {
        if (this.f16361S) {
            return this.f16363U;
        }
        return -1;
    }

    @C0193h0
    public List<Integer> getCheckedButtonIds() {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < getChildCount(); i++) {
            MaterialButton d = m24808d(i);
            if (d.isChecked()) {
                arrayList.add(Integer.valueOf(d.getId()));
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: protected */
    public int getChildDrawingOrder(int i, int i2) {
        Integer[] numArr = this.f16359Q;
        return (numArr == null || i2 >= numArr.length) ? i2 : numArr[i2].intValue();
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        int i = this.f16363U;
        if (i != -1) {
            m24806c(i);
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        mo22563e();
        m24810f();
        super.onMeasure(i, i2);
    }

    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        if (view instanceof MaterialButton) {
            MaterialButton materialButton = (MaterialButton) view;
            materialButton.mo22502b((C5674b) this.f16365b);
            materialButton.setOnPressedChangeListenerInternal(null);
        }
        int indexOfChild = indexOfChild(view);
        if (indexOfChild >= 0) {
            this.f16364a.remove(indexOfChild);
        }
        mo22563e();
        m24810f();
    }

    public void setSelectionRequired(boolean z) {
        this.f16362T = z;
    }

    public void setSingleSelection(boolean z) {
        if (this.f16361S != z) {
            this.f16361S = z;
            mo22553a();
        }
    }

    public MaterialButtonToggleGroup(@C0193h0 Context context, @C0195i0 AttributeSet attributeSet) {
        this(context, attributeSet, C5582R.attr.materialButtonToggleGroupStyle);
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void m24807c(int i, boolean z) {
        List<Integer> checkedButtonIds = getCheckedButtonIds();
        if (!this.f16362T || !checkedButtonIds.isEmpty()) {
            if (z && this.f16361S) {
                checkedButtonIds.remove(Integer.valueOf(i));
                for (Integer intValue : checkedButtonIds) {
                    int intValue2 = intValue.intValue();
                    m24803b(intValue2, false);
                    m24799a(intValue2, false);
                }
            }
            return;
        }
        m24803b(i, true);
    }

    /* renamed from: d */
    private MaterialButton m24808d(int i) {
        return (MaterialButton) getChildAt(i);
    }

    public MaterialButtonToggleGroup(@C0193h0 Context context, @C0195i0 AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f16364a = new ArrayList();
        this.f16365b = new C5677b(this, null);
        this.f16356N = new C5680e(this, null);
        this.f16357O = new LinkedHashSet<>();
        this.f16358P = new C5676a();
        this.f16360R = false;
        TypedArray c = C6928p.m33264c(context, attributeSet, C5582R.styleable.MaterialButtonToggleGroup, i, C5582R.style.Widget_MaterialComponents_MaterialButtonToggleGroup, new int[0]);
        setSingleSelection(c.getBoolean(C5582R.styleable.MaterialButtonToggleGroup_singleSelection, false));
        this.f16363U = c.getResourceId(C5582R.styleable.MaterialButtonToggleGroup_checkedButton, -1);
        this.f16362T = c.getBoolean(C5582R.styleable.MaterialButtonToggleGroup_selectionRequired, false);
        setChildrenDrawingOrderEnabled(true);
        c.recycle();
    }

    /* renamed from: b */
    public void mo22558b(@C0225w int i) {
        m24803b(i, false);
        m24807c(i, false);
        this.f16363U = -1;
        m24799a(i, false);
    }

    /* renamed from: a */
    public void mo22554a(@C0225w int i) {
        if (i != this.f16363U) {
            m24806c(i);
        }
    }

    public void setSingleSelection(@C0192h int i) {
        setSingleSelection(getResources().getBoolean(i));
    }

    /* renamed from: a */
    public void mo22553a() {
        this.f16360R = true;
        for (int i = 0; i < getChildCount(); i++) {
            MaterialButton d = m24808d(i);
            d.setChecked(false);
            m24799a(d.getId(), false);
        }
        this.f16360R = false;
        setCheckedId(-1);
    }

    /* renamed from: b */
    public void mo22559b(@C0193h0 C5679d dVar) {
        this.f16357O.remove(dVar);
    }

    /* renamed from: b */
    public void mo22557b() {
        this.f16357O.clear();
    }

    /* renamed from: b */
    private void m24803b(@C0225w int i, boolean z) {
        View findViewById = findViewById(i);
        if (findViewById instanceof MaterialButton) {
            this.f16360R = true;
            ((MaterialButton) findViewById).setChecked(z);
            this.f16360R = false;
        }
    }

    /* renamed from: c */
    private void m24806c(int i) {
        m24803b(i, true);
        m24807c(i, true);
        setCheckedId(i);
    }

    /* renamed from: e */
    private boolean m24809e(int i) {
        return getChildAt(i).getVisibility() != 8;
    }

    /* renamed from: a */
    public void mo22555a(@C0193h0 C5679d dVar) {
        this.f16357O.add(dVar);
    }

    @C0195i0
    /* renamed from: a */
    private C5678c m24798a(int i, int i2, int i3) {
        C5678c cVar = (C5678c) this.f16364a.get(i);
        boolean z = true;
        if (getChildCount() == 1) {
            return cVar;
        }
        if (getOrientation() != 0) {
            z = false;
        }
        if (i == i2) {
            return z ? C5678c.m24827b(cVar, this) : C5678c.m24829d(cVar);
        } else if (i != i3) {
            return null;
        } else {
            return z ? C5678c.m24825a(cVar, this) : C5678c.m24824a(cVar);
        }
    }

    /* renamed from: f */
    private void m24811f(int i) {
        if (!(getChildCount() == 0 || i == -1)) {
            LayoutParams layoutParams = (LayoutParams) m24808d(i).getLayoutParams();
            if (getOrientation() == 1) {
                layoutParams.topMargin = 0;
                layoutParams.bottomMargin = 0;
                return;
            }
            C0999l.m5725c(layoutParams, 0);
            C0999l.m5726d(layoutParams, 0);
            layoutParams.leftMargin = 0;
            layoutParams.rightMargin = 0;
        }
    }

    /* renamed from: a */
    private static void m24801a(C6988b bVar, @C0195i0 C5678c cVar) {
        if (cVar == null) {
            bVar.mo27872a(0.0f);
        } else {
            bVar.mo27894d(cVar.f16369a).mo27882b(cVar.f16372d).mo27899e(cVar.f16370b).mo27888c(cVar.f16371c);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m24799a(@C0225w int i, boolean z) {
        Iterator it = this.f16357O.iterator();
        while (it.hasNext()) {
            ((C5679d) it.next()).mo22576a(this, i, z);
        }
    }

    @C0193h0
    /* renamed from: a */
    private LayoutParams m24797a(@C0193h0 View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof LayoutParams) {
            return (LayoutParams) layoutParams;
        }
        return new LayoutParams(layoutParams.width, layoutParams.height);
    }
}
