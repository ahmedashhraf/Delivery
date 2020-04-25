package com.google.android.material.datepicker;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.GridView;
import android.widget.ListAdapter;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import androidx.core.p033k.C0938f;
import androidx.core.p034l.C0947a;
import androidx.core.p034l.C0962e0;
import androidx.core.p034l.p035o0.C1016d;
import com.google.android.material.C5582R;
import java.util.Calendar;

final class MaterialCalendarGridView extends GridView {

    /* renamed from: a */
    private final Calendar f18903a;

    /* renamed from: com.google.android.material.datepicker.MaterialCalendarGridView$a */
    class C6797a extends C0947a {
        C6797a() {
        }

        /* renamed from: a */
        public void mo4749a(View view, @C0193h0 C1016d dVar) {
            super.mo4749a(view, dVar);
            dVar.mo4939a((Object) null);
        }
    }

    public MaterialCalendarGridView(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    private void m32502a(int i, Rect rect) {
        if (i == 33) {
            setSelection(getAdapter().mo27196b());
        } else if (i == 130) {
            setSelection(getAdapter().mo27194a());
        } else {
            super.onFocusChanged(true, i, rect);
        }
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        getAdapter().notifyDataSetChanged();
    }

    /* access modifiers changed from: protected */
    public final void onDraw(@C0193h0 Canvas canvas) {
        int i;
        int i2;
        int i3;
        int i4;
        MaterialCalendarGridView materialCalendarGridView = this;
        super.onDraw(canvas);
        C6832k adapter = getAdapter();
        DateSelector<?> dateSelector = adapter.f19037b;
        C6805b bVar = adapter.f19034N;
        Long item = adapter.getItem(adapter.mo27194a());
        Long item2 = adapter.getItem(adapter.mo27196b());
        for (C0938f fVar : dateSelector.mo27098d()) {
            F f = fVar.f4243a;
            if (f != null) {
                if (fVar.f4244b == null) {
                    continue;
                } else {
                    long longValue = ((Long) f).longValue();
                    long longValue2 = ((Long) fVar.f4244b).longValue();
                    if (!m32503a(item, item2, Long.valueOf(longValue), Long.valueOf(longValue2))) {
                        if (longValue < item.longValue()) {
                            i2 = adapter.mo27194a();
                            if (adapter.mo27197b(i2)) {
                                i = 0;
                            } else {
                                i = materialCalendarGridView.getChildAt(i2 - 1).getRight();
                            }
                        } else {
                            materialCalendarGridView.f18903a.setTimeInMillis(longValue);
                            i2 = adapter.mo27195a(materialCalendarGridView.f18903a.get(5));
                            i = m32501a(materialCalendarGridView.getChildAt(i2));
                        }
                        if (longValue2 > item2.longValue()) {
                            i4 = adapter.mo27196b();
                            if (adapter.mo27198c(i4)) {
                                i3 = getWidth();
                            } else {
                                i3 = materialCalendarGridView.getChildAt(i4).getRight();
                            }
                        } else {
                            materialCalendarGridView.f18903a.setTimeInMillis(longValue2);
                            i4 = adapter.mo27195a(materialCalendarGridView.f18903a.get(5));
                            i3 = m32501a(materialCalendarGridView.getChildAt(i4));
                        }
                        int itemId = (int) adapter.getItemId(i2);
                        int itemId2 = (int) adapter.getItemId(i4);
                        while (itemId <= itemId2) {
                            int numColumns = getNumColumns() * itemId;
                            int numColumns2 = (getNumColumns() + numColumns) - 1;
                            View childAt = materialCalendarGridView.getChildAt(numColumns);
                            canvas.drawRect((float) (numColumns > i2 ? 0 : i), (float) (childAt.getTop() + bVar.f18935a.mo27147d()), (float) (i4 > numColumns2 ? getWidth() : i3), (float) (childAt.getBottom() - bVar.f18935a.mo27143a()), bVar.f18942h);
                            itemId++;
                            materialCalendarGridView = this;
                        }
                    } else {
                        return;
                    }
                }
            }
            materialCalendarGridView = this;
        }
    }

    /* access modifiers changed from: protected */
    public void onFocusChanged(boolean z, int i, Rect rect) {
        if (z) {
            m32502a(i, rect);
        } else {
            super.onFocusChanged(false, i, rect);
        }
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (!super.onKeyDown(i, keyEvent)) {
            return false;
        }
        if (getSelectedItemPosition() == -1 || getSelectedItemPosition() >= getAdapter().mo27194a()) {
            return true;
        }
        if (19 != i) {
            return false;
        }
        setSelection(getAdapter().mo27194a());
        return true;
    }

    public void setSelection(int i) {
        if (i < getAdapter().mo27194a()) {
            super.setSelection(getAdapter().mo27194a());
        } else {
            super.setSelection(i);
        }
    }

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public final void setAdapter(ListAdapter listAdapter) {
        if (listAdapter instanceof C6832k) {
            super.setAdapter(listAdapter);
        } else {
            throw new IllegalArgumentException(String.format("%1$s must have its Adapter set to a %2$s", new Object[]{MaterialCalendarGridView.class.getCanonicalName(), C6832k.class.getCanonicalName()}));
        }
    }

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f18903a = C6840p.m32703h();
        if (C6822g.m32623f(getContext())) {
            setNextFocusLeftId(C5582R.C5586id.cancel_button);
            setNextFocusRightId(C5582R.C5586id.confirm_button);
        }
        C0962e0.m5443a((View) this, (C0947a) new C6797a());
    }

    @C0193h0
    public C6832k getAdapter() {
        return (C6832k) super.getAdapter();
    }

    /* renamed from: a */
    private static boolean m32503a(@C0195i0 Long l, @C0195i0 Long l2, @C0195i0 Long l3, @C0195i0 Long l4) {
        return l == null || l2 == null || l3 == null || l4 == null || l3.longValue() > l2.longValue() || l4.longValue() < l.longValue();
    }

    /* renamed from: a */
    private static int m32501a(@C0193h0 View view) {
        return view.getLeft() + (view.getWidth() / 2);
    }
}
