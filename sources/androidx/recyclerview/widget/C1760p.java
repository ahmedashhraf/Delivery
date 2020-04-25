package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView.C1664w;
import androidx.recyclerview.widget.RecyclerView.State;

/* renamed from: androidx.recyclerview.widget.p */
/* compiled from: LayoutState */
class C1760p {

    /* renamed from: j */
    static final int f6840j = -1;

    /* renamed from: k */
    static final int f6841k = 1;

    /* renamed from: l */
    static final int f6842l = Integer.MIN_VALUE;

    /* renamed from: m */
    static final int f6843m = -1;

    /* renamed from: n */
    static final int f6844n = 1;

    /* renamed from: a */
    boolean f6845a = true;

    /* renamed from: b */
    int f6846b;

    /* renamed from: c */
    int f6847c;

    /* renamed from: d */
    int f6848d;

    /* renamed from: e */
    int f6849e;

    /* renamed from: f */
    int f6850f = 0;

    /* renamed from: g */
    int f6851g = 0;

    /* renamed from: h */
    boolean f6852h;

    /* renamed from: i */
    boolean f6853i;

    C1760p() {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo7986a(State state) {
        int i = this.f6847c;
        return i >= 0 && i < state.getItemCount();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("LayoutState{mAvailable=");
        sb.append(this.f6846b);
        sb.append(", mCurrentPosition=");
        sb.append(this.f6847c);
        sb.append(", mItemDirection=");
        sb.append(this.f6848d);
        sb.append(", mLayoutDirection=");
        sb.append(this.f6849e);
        sb.append(", mStartLine=");
        sb.append(this.f6850f);
        sb.append(", mEndLine=");
        sb.append(this.f6851g);
        sb.append('}');
        return sb.toString();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public View mo7985a(C1664w wVar) {
        View d = wVar.mo7572d(this.f6847c);
        this.f6847c += this.f6848d;
        return d;
    }
}
