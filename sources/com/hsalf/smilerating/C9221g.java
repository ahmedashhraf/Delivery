package com.hsalf.smilerating;

import android.content.Context;
import android.view.View;

/* renamed from: com.hsalf.smilerating.g */
/* compiled from: SmileRatingMain */
public class C9221g extends View {

    /* renamed from: N */
    boolean f24414N;

    /* renamed from: O */
    private C9214d f24415O = null;

    /* renamed from: P */
    private C9215e f24416P = null;

    /* renamed from: a */
    SmileRating f24417a;

    /* renamed from: b */
    C9216f f24418b;

    public C9221g(Context context) {
        super(context);
    }

    public int getRating() {
        if (this.f24414N) {
            return this.f24417a.getRating();
        }
        return this.f24418b.getRating();
    }

    public C9214d getmOnRatingSelectedListener() {
        return this.f24415O;
    }

    public C9215e getmOnSmileySelectionListener() {
        return this.f24416P;
    }

    public void setmOnRatingSelectedListener(C9214d dVar) {
        this.f24415O = dVar;
    }

    public void setmOnSmileySelectionListener(C9215e eVar) {
        this.f24416P = eVar;
    }

    public C9221g(Context context, boolean z) {
        super(context);
        this.f24414N = z;
        if (z) {
            this.f24417a = new SmileRating(context);
        } else {
            this.f24418b = new C9216f(context);
        }
    }
}
