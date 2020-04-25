package androidx.core.p034l.p035o0;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;
import androidx.annotation.C0207n0;
import androidx.annotation.C0207n0.C0208a;

/* renamed from: androidx.core.l.o0.a */
/* compiled from: AccessibilityClickableSpanCompat */
public final class C1008a extends ClickableSpan {
    @C0207n0({C0208a.LIBRARY_GROUP_PREFIX})

    /* renamed from: O */
    public static final String f4509O = "ACCESSIBILITY_CLICKABLE_SPAN_ID";

    /* renamed from: N */
    private final int f4510N;

    /* renamed from: a */
    private final int f4511a;

    /* renamed from: b */
    private final C1016d f4512b;

    @C0207n0({C0208a.LIBRARY_GROUP_PREFIX})
    public C1008a(int i, C1016d dVar, int i2) {
        this.f4511a = i;
        this.f4512b = dVar;
        this.f4510N = i2;
    }

    public void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt(f4509O, this.f4511a);
        this.f4512b.mo4942a(this.f4510N, bundle);
    }
}
