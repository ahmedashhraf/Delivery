package androidx.recyclerview.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import androidx.recyclerview.widget.RecyclerView.C1650n;
import androidx.recyclerview.widget.RecyclerView.State;

/* renamed from: androidx.recyclerview.widget.j */
/* compiled from: DividerItemDecoration */
public class C1734j extends C1650n {

    /* renamed from: d */
    public static final int f6680d = 0;

    /* renamed from: e */
    public static final int f6681e = 1;

    /* renamed from: f */
    private static final String f6682f = "DividerItem";

    /* renamed from: g */
    private static final int[] f6683g = {16843284};

    /* renamed from: a */
    private Drawable f6684a;

    /* renamed from: b */
    private int f6685b;

    /* renamed from: c */
    private final Rect f6686c = new Rect();

    public C1734j(Context context, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(f6683g);
        this.f6684a = obtainStyledAttributes.getDrawable(0);
        Drawable drawable = this.f6684a;
        obtainStyledAttributes.recycle();
        mo7888a(i);
    }

    /* renamed from: c */
    private void m9348c(Canvas canvas, RecyclerView recyclerView) {
        int i;
        int i2;
        canvas.save();
        if (recyclerView.getClipToPadding()) {
            i2 = recyclerView.getPaddingTop();
            i = recyclerView.getHeight() - recyclerView.getPaddingBottom();
            canvas.clipRect(recyclerView.getPaddingLeft(), i2, recyclerView.getWidth() - recyclerView.getPaddingRight(), i);
        } else {
            i = recyclerView.getHeight();
            i2 = 0;
        }
        int childCount = recyclerView.getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = recyclerView.getChildAt(i3);
            recyclerView.getLayoutManager().mo7445b(childAt, this.f6686c);
            int round = this.f6686c.right + Math.round(childAt.getTranslationX());
            this.f6684a.setBounds(round - this.f6684a.getIntrinsicWidth(), i2, round, i);
            this.f6684a.draw(canvas);
        }
        canvas.restore();
    }

    /* renamed from: d */
    private void m9349d(Canvas canvas, RecyclerView recyclerView) {
        int i;
        int i2;
        canvas.save();
        if (recyclerView.getClipToPadding()) {
            i2 = recyclerView.getPaddingLeft();
            i = recyclerView.getWidth() - recyclerView.getPaddingRight();
            canvas.clipRect(i2, recyclerView.getPaddingTop(), i, recyclerView.getHeight() - recyclerView.getPaddingBottom());
        } else {
            i = recyclerView.getWidth();
            i2 = 0;
        }
        int childCount = recyclerView.getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = recyclerView.getChildAt(i3);
            recyclerView.getDecoratedBoundsWithMargins(childAt, this.f6686c);
            int round = this.f6686c.bottom + Math.round(childAt.getTranslationY());
            this.f6684a.setBounds(i2, round - this.f6684a.getIntrinsicHeight(), i, round);
            this.f6684a.draw(canvas);
        }
        canvas.restore();
    }

    /* renamed from: a */
    public void mo7888a(int i) {
        if (i == 0 || i == 1) {
            this.f6685b = i;
            return;
        }
        throw new IllegalArgumentException("Invalid orientation. It should be either HORIZONTAL or VERTICAL");
    }

    /* renamed from: a */
    public void mo7889a(@C0193h0 Drawable drawable) {
        if (drawable != null) {
            this.f6684a = drawable;
            return;
        }
        throw new IllegalArgumentException("Drawable cannot be null.");
    }

    @C0195i0
    /* renamed from: a */
    public Drawable mo7887a() {
        return this.f6684a;
    }

    /* renamed from: a */
    public void mo7392a(Canvas canvas, RecyclerView recyclerView, State state) {
        if (recyclerView.getLayoutManager() != null && this.f6684a != null) {
            if (this.f6685b == 1) {
                m9349d(canvas, recyclerView);
            } else {
                m9348c(canvas, recyclerView);
            }
        }
    }

    /* renamed from: a */
    public void mo7394a(Rect rect, View view, RecyclerView recyclerView, State state) {
        Drawable drawable = this.f6684a;
        if (drawable == null) {
            rect.set(0, 0, 0, 0);
            return;
        }
        if (this.f6685b == 1) {
            rect.set(0, 0, 0, drawable.getIntrinsicHeight());
        } else {
            rect.set(0, 0, drawable.getIntrinsicWidth(), 0);
        }
    }
}
