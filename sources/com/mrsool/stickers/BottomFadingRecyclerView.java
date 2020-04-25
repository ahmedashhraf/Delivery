package com.mrsool.stickers;

import android.content.Context;
import android.util.AttributeSet;
import androidx.annotation.C0195i0;
import androidx.recyclerview.widget.RecyclerView;

public class BottomFadingRecyclerView extends RecyclerView {
    public BottomFadingRecyclerView(Context context) {
        super(context);
    }

    /* access modifiers changed from: protected */
    public float getTopFadingEdgeStrength() {
        return 0.0f;
    }

    public BottomFadingRecyclerView(Context context, @C0195i0 AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public BottomFadingRecyclerView(Context context, @C0195i0 AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
