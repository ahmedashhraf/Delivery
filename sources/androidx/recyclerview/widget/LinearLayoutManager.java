package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.annotation.C0193h0;
import androidx.annotation.C0207n0;
import androidx.annotation.C0207n0.C0208a;
import androidx.fragment.app.C1406n;
import androidx.recyclerview.widget.C1744m.C1757j;
import androidx.recyclerview.widget.RecyclerView.C1627a0;
import androidx.recyclerview.widget.RecyclerView.C1627a0.C1629b;
import androidx.recyclerview.widget.RecyclerView.C1635d0;
import androidx.recyclerview.widget.RecyclerView.C1651o;
import androidx.recyclerview.widget.RecyclerView.C1651o.C1654c;
import androidx.recyclerview.widget.RecyclerView.C1651o.C1655d;
import androidx.recyclerview.widget.RecyclerView.C1656p;
import androidx.recyclerview.widget.RecyclerView.C1664w;
import androidx.recyclerview.widget.RecyclerView.State;
import java.util.List;

public class LinearLayoutManager extends C1651o implements C1757j, C1629b {

    /* renamed from: I */
    private static final String f6189I = "LinearLayoutManager";

    /* renamed from: J */
    static final boolean f6190J = false;

    /* renamed from: K */
    public static final int f6191K = 0;

    /* renamed from: L */
    public static final int f6192L = 1;

    /* renamed from: M */
    public static final int f6193M = Integer.MIN_VALUE;

    /* renamed from: N */
    private static final float f6194N = 0.33333334f;

    /* renamed from: A */
    int f6195A;

    /* renamed from: B */
    int f6196B;

    /* renamed from: C */
    private boolean f6197C;

    /* renamed from: D */
    SavedState f6198D;

    /* renamed from: E */
    final C1622a f6199E;

    /* renamed from: F */
    private final C1623b f6200F;

    /* renamed from: G */
    private int f6201G;

    /* renamed from: H */
    private int[] f6202H;

    /* renamed from: s */
    int f6203s;

    /* renamed from: t */
    private C1624c f6204t;

    /* renamed from: u */
    C1775w f6205u;

    /* renamed from: v */
    private boolean f6206v;

    /* renamed from: w */
    private boolean f6207w;

    /* renamed from: x */
    boolean f6208x;

    /* renamed from: y */
    private boolean f6209y;

    /* renamed from: z */
    private boolean f6210z;

    @SuppressLint({"BanParcelableUsage"})
    @C0207n0({C0208a.LIBRARY})
    public static class SavedState implements Parcelable {
        public static final Creator<SavedState> CREATOR = new C1621a();
        boolean mAnchorLayoutFromEnd;
        int mAnchorOffset;
        int mAnchorPosition;

        /* renamed from: androidx.recyclerview.widget.LinearLayoutManager$SavedState$a */
        static class C1621a implements Creator<SavedState> {
            C1621a() {
            }

            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        public SavedState() {
        }

        public int describeContents() {
            return 0;
        }

        /* access modifiers changed from: 0000 */
        public boolean hasValidAnchor() {
            return this.mAnchorPosition >= 0;
        }

        /* access modifiers changed from: 0000 */
        public void invalidateAnchor() {
            this.mAnchorPosition = -1;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.mAnchorPosition);
            parcel.writeInt(this.mAnchorOffset);
            parcel.writeInt(this.mAnchorLayoutFromEnd ? 1 : 0);
        }

        SavedState(Parcel parcel) {
            this.mAnchorPosition = parcel.readInt();
            this.mAnchorOffset = parcel.readInt();
            boolean z = true;
            if (parcel.readInt() != 1) {
                z = false;
            }
            this.mAnchorLayoutFromEnd = z;
        }

        public SavedState(SavedState savedState) {
            this.mAnchorPosition = savedState.mAnchorPosition;
            this.mAnchorOffset = savedState.mAnchorOffset;
            this.mAnchorLayoutFromEnd = savedState.mAnchorLayoutFromEnd;
        }
    }

    /* renamed from: androidx.recyclerview.widget.LinearLayoutManager$a */
    static class C1622a {

        /* renamed from: a */
        C1775w f6211a;

        /* renamed from: b */
        int f6212b;

        /* renamed from: c */
        int f6213c;

        /* renamed from: d */
        boolean f6214d;

        /* renamed from: e */
        boolean f6215e;

        C1622a() {
            mo7011b();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo7008a() {
            int i;
            if (this.f6214d) {
                i = this.f6211a.mo8015b();
            } else {
                i = this.f6211a.mo8025g();
            }
            this.f6213c = i;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo7011b() {
            this.f6212b = -1;
            this.f6213c = Integer.MIN_VALUE;
            this.f6214d = false;
            this.f6215e = false;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("AnchorInfo{mPosition=");
            sb.append(this.f6212b);
            sb.append(", mCoordinate=");
            sb.append(this.f6213c);
            sb.append(", mLayoutFromEnd=");
            sb.append(this.f6214d);
            sb.append(", mValid=");
            sb.append(this.f6215e);
            sb.append('}');
            return sb.toString();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public boolean mo7010a(View view, State state) {
            C1656p pVar = (C1656p) view.getLayoutParams();
            return !pVar.mo7522e() && pVar.mo7519b() >= 0 && pVar.mo7519b() < state.getItemCount();
        }

        /* renamed from: b */
        public void mo7012b(View view, int i) {
            int i2 = this.f6211a.mo8027i();
            if (i2 >= 0) {
                mo7009a(view, i);
                return;
            }
            this.f6212b = i;
            if (this.f6214d) {
                int b = (this.f6211a.mo8015b() - i2) - this.f6211a.mo8012a(view);
                this.f6213c = this.f6211a.mo8015b() - b;
                if (b > 0) {
                    int b2 = this.f6213c - this.f6211a.mo8016b(view);
                    int g = this.f6211a.mo8025g();
                    int min = b2 - (g + Math.min(this.f6211a.mo8019d(view) - g, 0));
                    if (min < 0) {
                        this.f6213c += Math.min(b, -min);
                    }
                }
            } else {
                int d = this.f6211a.mo8019d(view);
                int g2 = d - this.f6211a.mo8025g();
                this.f6213c = d;
                if (g2 > 0) {
                    int b3 = (this.f6211a.mo8015b() - Math.min(0, (this.f6211a.mo8015b() - i2) - this.f6211a.mo8012a(view))) - (d + this.f6211a.mo8016b(view));
                    if (b3 < 0) {
                        this.f6213c -= Math.min(g2, -b3);
                    }
                }
            }
        }

        /* renamed from: a */
        public void mo7009a(View view, int i) {
            if (this.f6214d) {
                this.f6213c = this.f6211a.mo8012a(view) + this.f6211a.mo8027i();
            } else {
                this.f6213c = this.f6211a.mo8019d(view);
            }
            this.f6212b = i;
        }
    }

    /* renamed from: androidx.recyclerview.widget.LinearLayoutManager$b */
    protected static class C1623b {

        /* renamed from: a */
        public int f6216a;

        /* renamed from: b */
        public boolean f6217b;

        /* renamed from: c */
        public boolean f6218c;

        /* renamed from: d */
        public boolean f6219d;

        protected C1623b() {
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo7014a() {
            this.f6216a = 0;
            this.f6217b = false;
            this.f6218c = false;
            this.f6219d = false;
        }
    }

    /* renamed from: androidx.recyclerview.widget.LinearLayoutManager$c */
    static class C1624c {

        /* renamed from: n */
        static final String f6220n = "LLM#LayoutState";

        /* renamed from: o */
        static final int f6221o = -1;

        /* renamed from: p */
        static final int f6222p = 1;

        /* renamed from: q */
        static final int f6223q = Integer.MIN_VALUE;

        /* renamed from: r */
        static final int f6224r = -1;

        /* renamed from: s */
        static final int f6225s = 1;

        /* renamed from: t */
        static final int f6226t = Integer.MIN_VALUE;

        /* renamed from: a */
        boolean f6227a = true;

        /* renamed from: b */
        int f6228b;

        /* renamed from: c */
        int f6229c;

        /* renamed from: d */
        int f6230d;

        /* renamed from: e */
        int f6231e;

        /* renamed from: f */
        int f6232f;

        /* renamed from: g */
        int f6233g;

        /* renamed from: h */
        int f6234h = 0;

        /* renamed from: i */
        int f6235i = 0;

        /* renamed from: j */
        boolean f6236j = false;

        /* renamed from: k */
        int f6237k;

        /* renamed from: l */
        List<C1635d0> f6238l = null;

        /* renamed from: m */
        boolean f6239m;

        C1624c() {
        }

        /* renamed from: c */
        private View m8413c() {
            int size = this.f6238l.size();
            for (int i = 0; i < size; i++) {
                View view = ((C1635d0) this.f6238l.get(i)).f6294a;
                C1656p pVar = (C1656p) view.getLayoutParams();
                if (!pVar.mo7522e() && this.f6230d == pVar.mo7519b()) {
                    mo7017a(view);
                    return view;
                }
            }
            return null;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public boolean mo7018a(State state) {
            int i = this.f6230d;
            return i >= 0 && i < state.getItemCount();
        }

        /* renamed from: b */
        public View mo7019b(View view) {
            int size = this.f6238l.size();
            View view2 = null;
            int i = Integer.MAX_VALUE;
            for (int i2 = 0; i2 < size; i2++) {
                View view3 = ((C1635d0) this.f6238l.get(i2)).f6294a;
                C1656p pVar = (C1656p) view3.getLayoutParams();
                if (view3 != view && !pVar.mo7522e()) {
                    int b = (pVar.mo7519b() - this.f6230d) * this.f6231e;
                    if (b >= 0 && b < i) {
                        view2 = view3;
                        if (b == 0) {
                            break;
                        }
                        i = b;
                    }
                }
            }
            return view2;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public View mo7015a(C1664w wVar) {
            if (this.f6238l != null) {
                return m8413c();
            }
            View d = wVar.mo7572d(this.f6230d);
            this.f6230d += this.f6231e;
            return d;
        }

        /* renamed from: a */
        public void mo7016a() {
            mo7017a((View) null);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo7020b() {
            StringBuilder sb = new StringBuilder();
            sb.append("avail:");
            sb.append(this.f6229c);
            sb.append(", ind:");
            sb.append(this.f6230d);
            sb.append(", dir:");
            sb.append(this.f6231e);
            sb.append(", offset:");
            sb.append(this.f6228b);
            sb.append(", layoutDir:");
            sb.append(this.f6232f);
            sb.toString();
        }

        /* renamed from: a */
        public void mo7017a(View view) {
            View b = mo7019b(view);
            if (b == null) {
                this.f6230d = -1;
            } else {
                this.f6230d = ((C1656p) b.getLayoutParams()).mo7519b();
            }
        }
    }

    public LinearLayoutManager(Context context) {
        this(context, 1, false);
    }

    /* renamed from: Z */
    private View mo6907Z() {
        return mo6992e(0, mo7467e());
    }

    /* renamed from: a0 */
    private View mo6924a0() {
        return mo6992e(mo7467e() - 1, -1);
    }

    /* renamed from: b0 */
    private View mo6929b0() {
        if (this.f6208x) {
            return mo6907Z();
        }
        return mo6924a0();
    }

    /* renamed from: c0 */
    private View m8329c0() {
        if (this.f6208x) {
            return mo6924a0();
        }
        return mo6907Z();
    }

    /* renamed from: d0 */
    private View m8330d0() {
        return mo7462d(this.f6208x ? 0 : mo7467e() - 1);
    }

    /* renamed from: e0 */
    private View m8331e0() {
        return mo7462d(this.f6208x ? mo7467e() - 1 : 0);
    }

    /* renamed from: f0 */
    private void m8333f0() {
        for (int i = 0; i < mo7467e(); i++) {
            View d = mo7462d(i);
            StringBuilder sb = new StringBuilder();
            sb.append("item ");
            sb.append(mo7496p(d));
            sb.append(", coord:");
            sb.append(this.f6205u.mo8019d(d));
            sb.toString();
        }
    }

    /* renamed from: g0 */
    private void m8336g0() {
        if (this.f6203s == 1 || !mo6967V()) {
            this.f6208x = this.f6207w;
        } else {
            this.f6208x = !this.f6207w;
        }
    }

    /* renamed from: j */
    private int m8341j(State state) {
        if (mo7467e() == 0) {
            return 0;
        }
        mo6957L();
        C1775w wVar = this.f6205u;
        View b = mo6984b(!this.f6210z, true);
        return C1782z.m9639a(state, wVar, b, mo6975a(!this.f6210z, true), this, this.f6210z, this.f6208x);
    }

    /* renamed from: k */
    private int m8342k(State state) {
        if (mo7467e() == 0) {
            return 0;
        }
        mo6957L();
        C1775w wVar = this.f6205u;
        View b = mo6984b(!this.f6210z, true);
        return C1782z.m9640b(state, wVar, b, mo6975a(!this.f6210z, true), this, this.f6210z);
    }

    /* renamed from: D */
    public Parcelable mo6954D() {
        SavedState savedState = this.f6198D;
        if (savedState != null) {
            return new SavedState(savedState);
        }
        SavedState savedState2 = new SavedState();
        if (mo7467e() > 0) {
            mo6957L();
            boolean z = this.f6206v ^ this.f6208x;
            savedState2.mAnchorLayoutFromEnd = z;
            if (z) {
                View d0 = m8330d0();
                savedState2.mAnchorOffset = this.f6205u.mo8015b() - this.f6205u.mo8012a(d0);
                savedState2.mAnchorPosition = mo7496p(d0);
            } else {
                View e0 = m8331e0();
                savedState2.mAnchorPosition = mo7496p(e0);
                savedState2.mAnchorOffset = this.f6205u.mo8019d(e0) - this.f6205u.mo8025g();
            }
        } else {
            savedState2.invalidateAnchor();
        }
        return savedState2;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: H */
    public boolean mo6955H() {
        return (mo7481i() == 1073741824 || mo7505u() == 1073741824 || !mo7508v()) ? false : true;
    }

    /* renamed from: J */
    public boolean mo6906J() {
        return this.f6198D == null && this.f6206v == this.f6209y;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: K */
    public C1624c mo6956K() {
        return new C1624c();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: L */
    public void mo6957L() {
        if (this.f6204t == null) {
            this.f6204t = mo6956K();
        }
    }

    /* renamed from: M */
    public int mo6958M() {
        View a = mo6974a(0, mo7467e(), true, false);
        if (a == null) {
            return -1;
        }
        return mo7496p(a);
    }

    /* renamed from: N */
    public int mo6959N() {
        View a = mo6974a(0, mo7467e(), false, true);
        if (a == null) {
            return -1;
        }
        return mo7496p(a);
    }

    /* renamed from: O */
    public int mo6960O() {
        View a = mo6974a(mo7467e() - 1, -1, true, false);
        if (a == null) {
            return -1;
        }
        return mo7496p(a);
    }

    /* renamed from: P */
    public int mo6961P() {
        View a = mo6974a(mo7467e() - 1, -1, false, true);
        if (a == null) {
            return -1;
        }
        return mo7496p(a);
    }

    /* renamed from: Q */
    public int mo6962Q() {
        return this.f6201G;
    }

    /* renamed from: R */
    public int mo6963R() {
        return this.f6203s;
    }

    /* renamed from: S */
    public boolean mo6964S() {
        return this.f6197C;
    }

    /* renamed from: T */
    public boolean mo6965T() {
        return this.f6207w;
    }

    /* renamed from: U */
    public boolean mo6966U() {
        return this.f6209y;
    }

    /* access modifiers changed from: protected */
    /* renamed from: V */
    public boolean mo6967V() {
        return mo7485k() == 1;
    }

    /* renamed from: W */
    public boolean mo6968W() {
        return this.f6210z;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: X */
    public boolean mo6969X() {
        return this.f6205u.mo8021e() == 0 && this.f6205u.mo8011a() == 0;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: Y */
    public void mo6970Y() {
        StringBuilder sb = new StringBuilder();
        sb.append("validating child count ");
        sb.append(mo7467e());
        sb.toString();
        if (mo7467e() >= 1) {
            boolean z = false;
            int p = mo7496p(mo7462d(0));
            int d = this.f6205u.mo8019d(mo7462d(0));
            String str = "detected invalid location";
            String str2 = "detected invalid position. loc invalid? ";
            if (this.f6208x) {
                int i = 1;
                while (i < mo7467e()) {
                    View d2 = mo7462d(i);
                    int p2 = mo7496p(d2);
                    int d3 = this.f6205u.mo8019d(d2);
                    if (p2 < p) {
                        m8333f0();
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(str2);
                        if (d3 < d) {
                            z = true;
                        }
                        sb2.append(z);
                        throw new RuntimeException(sb2.toString());
                    } else if (d3 <= d) {
                        i++;
                    } else {
                        m8333f0();
                        throw new RuntimeException(str);
                    }
                }
            } else {
                int i2 = 1;
                while (i2 < mo7467e()) {
                    View d4 = mo7462d(i2);
                    int p3 = mo7496p(d4);
                    int d5 = this.f6205u.mo8019d(d4);
                    if (p3 < p) {
                        m8333f0();
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(str2);
                        if (d5 < d) {
                            z = true;
                        }
                        sb3.append(z);
                        throw new RuntimeException(sb3.toString());
                    } else if (d5 >= d) {
                        i2++;
                    } else {
                        m8333f0();
                        throw new RuntimeException(str);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public void mo6980a(AccessibilityEvent accessibilityEvent) {
        super.mo6980a(accessibilityEvent);
        if (mo7467e() > 0) {
            accessibilityEvent.setFromIndex(mo6959N());
            accessibilityEvent.setToIndex(mo6961P());
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo6918a(C1664w wVar, State state, C1622a aVar, int i) {
    }

    /* renamed from: b */
    public void mo6985b(RecyclerView recyclerView, C1664w wVar) {
        super.mo6985b(recyclerView, wVar);
        if (this.f6197C) {
            mo7448b(wVar);
            wVar.mo7551a();
        }
    }

    /* renamed from: c */
    public C1656p mo6931c() {
        return new C1656p(-2, -2);
    }

    /* renamed from: d */
    public void mo6991d(boolean z) {
        this.f6197C = z;
    }

    /* renamed from: e */
    public void mo6993e(boolean z) {
        mo6986b((String) null);
        if (z != this.f6207w) {
            this.f6207w = z;
            mo7401F();
        }
    }

    /* renamed from: f */
    public void mo6994f(int i, int i2) {
        this.f6195A = i;
        this.f6196B = i2;
        SavedState savedState = this.f6198D;
        if (savedState != null) {
            savedState.invalidateAnchor();
        }
        mo7401F();
    }

    /* renamed from: g */
    public void mo6938g(boolean z) {
        mo6986b((String) null);
        if (this.f6209y != z) {
            this.f6209y = z;
            mo7401F();
        }
    }

    /* access modifiers changed from: protected */
    @Deprecated
    /* renamed from: h */
    public int mo6996h(State state) {
        if (state.hasTargetScrollPosition()) {
            return this.f6205u.mo8026h();
        }
        return 0;
    }

    /* renamed from: i */
    public void mo6997i(int i) {
        this.f6195A = i;
        this.f6196B = Integer.MIN_VALUE;
        SavedState savedState = this.f6198D;
        if (savedState != null) {
            savedState.invalidateAnchor();
        }
        mo7401F();
    }

    /* renamed from: l */
    public void mo7000l(int i) {
        if (i == 0 || i == 1) {
            mo6986b((String) null);
            if (i != this.f6203s || this.f6205u == null) {
                this.f6205u = C1775w.m9558a((C1651o) this, i);
                this.f6199E.f6211a = this.f6205u;
                this.f6203s = i;
                mo7401F();
                return;
            }
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("invalid orientation:");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: y */
    public boolean mo7001y() {
        return true;
    }

    public LinearLayoutManager(Context context, int i, boolean z) {
        this.f6203s = 1;
        this.f6207w = false;
        this.f6208x = false;
        this.f6209y = false;
        this.f6210z = true;
        this.f6195A = -1;
        this.f6196B = Integer.MIN_VALUE;
        this.f6198D = null;
        this.f6199E = new C1622a();
        this.f6200F = new C1623b();
        this.f6201G = 2;
        this.f6202H = new int[2];
        mo7000l(i);
        mo6993e(z);
    }

    /* renamed from: c */
    public View mo6989c(int i) {
        int e = mo7467e();
        if (e == 0) {
            return null;
        }
        int p = i - mo7496p(mo7462d(0));
        if (p >= 0 && p < e) {
            View d = mo7462d(p);
            if (mo7496p(d) == i) {
                return d;
            }
        }
        return super.mo6989c(i);
    }

    /* renamed from: d */
    public int mo6990d(State state) {
        return m8339i(state);
    }

    /* renamed from: h */
    private void m8338h(int i, int i2) {
        this.f6204t.f6229c = i2 - this.f6205u.mo8025g();
        C1624c cVar = this.f6204t;
        cVar.f6230d = i;
        cVar.f6231e = this.f6208x ? 1 : -1;
        C1624c cVar2 = this.f6204t;
        cVar2.f6232f = -1;
        cVar2.f6228b = i2;
        cVar2.f6233g = Integer.MIN_VALUE;
    }

    /* renamed from: a */
    public void mo6978a(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            this.f6198D = (SavedState) parcelable;
            mo7401F();
        }
    }

    /* renamed from: b */
    public boolean mo6987b() {
        return this.f6203s == 1;
    }

    /* renamed from: e */
    public void mo6934e(C1664w wVar, State state) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8 = -1;
        if (!(this.f6198D == null && this.f6195A == -1) && state.getItemCount() == 0) {
            mo7448b(wVar);
            return;
        }
        SavedState savedState = this.f6198D;
        if (savedState != null && savedState.hasValidAnchor()) {
            this.f6195A = this.f6198D.mAnchorPosition;
        }
        mo6957L();
        this.f6204t.f6227a = false;
        m8336g0();
        View g = mo7476g();
        if (!this.f6199E.f6215e || this.f6195A != -1 || this.f6198D != null) {
            this.f6199E.mo7011b();
            C1622a aVar = this.f6199E;
            aVar.f6214d = this.f6208x ^ this.f6209y;
            m8326b(wVar, state, aVar);
            this.f6199E.f6215e = true;
        } else if (g != null && (this.f6205u.mo8019d(g) >= this.f6205u.mo8015b() || this.f6205u.mo8012a(g) <= this.f6205u.mo8025g())) {
            this.f6199E.mo7012b(g, mo7496p(g));
        }
        C1624c cVar = this.f6204t;
        cVar.f6232f = cVar.f6237k >= 0 ? 1 : -1;
        int[] iArr = this.f6202H;
        iArr[0] = 0;
        iArr[1] = 0;
        mo6981a(state, iArr);
        int max = Math.max(0, this.f6202H[0]) + this.f6205u.mo8025g();
        int max2 = Math.max(0, this.f6202H[1]) + this.f6205u.mo8017c();
        if (state.isPreLayout()) {
            int i9 = this.f6195A;
            if (!(i9 == -1 || this.f6196B == Integer.MIN_VALUE)) {
                View c = mo6989c(i9);
                if (c != null) {
                    if (this.f6208x) {
                        i6 = this.f6205u.mo8015b() - this.f6205u.mo8012a(c);
                        i7 = this.f6196B;
                    } else {
                        i7 = this.f6205u.mo8019d(c) - this.f6205u.mo8025g();
                        i6 = this.f6196B;
                    }
                    int i10 = i6 - i7;
                    if (i10 > 0) {
                        max += i10;
                    } else {
                        max2 -= i10;
                    }
                }
            }
        }
        if (!this.f6199E.f6214d ? !this.f6208x : this.f6208x) {
            i8 = 1;
        }
        mo6918a(wVar, state, this.f6199E, i8);
        mo7418a(wVar);
        this.f6204t.f6239m = mo6969X();
        this.f6204t.f6236j = state.isPreLayout();
        this.f6204t.f6235i = 0;
        C1622a aVar2 = this.f6199E;
        if (aVar2.f6214d) {
            m8323b(aVar2);
            C1624c cVar2 = this.f6204t;
            cVar2.f6234h = max;
            mo6972a(wVar, cVar2, state, false);
            C1624c cVar3 = this.f6204t;
            i2 = cVar3.f6228b;
            int i11 = cVar3.f6230d;
            int i12 = cVar3.f6229c;
            if (i12 > 0) {
                max2 += i12;
            }
            m8316a(this.f6199E);
            C1624c cVar4 = this.f6204t;
            cVar4.f6234h = max2;
            cVar4.f6230d += cVar4.f6231e;
            mo6972a(wVar, cVar4, state, false);
            C1624c cVar5 = this.f6204t;
            i = cVar5.f6228b;
            int i13 = cVar5.f6229c;
            if (i13 > 0) {
                m8338h(i11, i2);
                C1624c cVar6 = this.f6204t;
                cVar6.f6234h = i13;
                mo6972a(wVar, cVar6, state, false);
                i2 = this.f6204t.f6228b;
            }
        } else {
            m8316a(aVar2);
            C1624c cVar7 = this.f6204t;
            cVar7.f6234h = max2;
            mo6972a(wVar, cVar7, state, false);
            C1624c cVar8 = this.f6204t;
            i = cVar8.f6228b;
            int i14 = cVar8.f6230d;
            int i15 = cVar8.f6229c;
            if (i15 > 0) {
                max += i15;
            }
            m8323b(this.f6199E);
            C1624c cVar9 = this.f6204t;
            cVar9.f6234h = max;
            cVar9.f6230d += cVar9.f6231e;
            mo6972a(wVar, cVar9, state, false);
            C1624c cVar10 = this.f6204t;
            i2 = cVar10.f6228b;
            int i16 = cVar10.f6229c;
            if (i16 > 0) {
                mo6936g(i14, i);
                C1624c cVar11 = this.f6204t;
                cVar11.f6234h = i16;
                mo6972a(wVar, cVar11, state, false);
                i = this.f6204t.f6228b;
            }
        }
        if (mo7467e() > 0) {
            if (this.f6208x ^ this.f6209y) {
                int a = m8314a(i, wVar, state, true);
                i4 = i2 + a;
                i3 = i + a;
                i5 = m8322b(i4, wVar, state, false);
            } else {
                int b = m8322b(i2, wVar, state, true);
                i4 = i2 + b;
                i3 = i + b;
                i5 = m8314a(i3, wVar, state, false);
            }
            i2 = i4 + i5;
            i = i3 + i5;
        }
        m8325b(wVar, state, i2, i);
        if (!state.isPreLayout()) {
            this.f6205u.mo8028j();
        } else {
            this.f6199E.mo7011b();
        }
        this.f6206v = this.f6209y;
    }

    /* renamed from: g */
    public void mo6937g(State state) {
        super.mo6937g(state);
        this.f6198D = null;
        this.f6195A = -1;
        this.f6196B = Integer.MIN_VALUE;
        this.f6199E.mo7011b();
    }

    /* renamed from: b */
    private void m8325b(C1664w wVar, State state, int i, int i2) {
        C1664w wVar2 = wVar;
        State state2 = state;
        if (state.willRunPredictiveAnimations() && mo7467e() != 0 && !state.isPreLayout() && mo6906J()) {
            List<C1635d0> f = wVar.mo7577f();
            int size = f.size();
            int p = mo7496p(mo7462d(0));
            int i3 = 0;
            int i4 = 0;
            for (int i5 = 0; i5 < size; i5++) {
                C1635d0 d0Var = (C1635d0) f.get(i5);
                if (!d0Var.mo7285r()) {
                    char c = 1;
                    if ((d0Var.mo7276i() < p) != this.f6208x) {
                        c = 65535;
                    }
                    if (c == 65535) {
                        i3 += this.f6205u.mo8016b(d0Var.f6294a);
                    } else {
                        i4 += this.f6205u.mo8016b(d0Var.f6294a);
                    }
                }
            }
            this.f6204t.f6238l = f;
            if (i3 > 0) {
                m8338h(mo7496p(m8331e0()), i);
                C1624c cVar = this.f6204t;
                cVar.f6234h = i3;
                cVar.f6229c = 0;
                cVar.mo7016a();
                mo6972a(wVar2, this.f6204t, state2, false);
            }
            if (i4 > 0) {
                mo6936g(mo7496p(m8330d0()), i2);
                C1624c cVar2 = this.f6204t;
                cVar2.f6234h = i4;
                cVar2.f6229c = 0;
                cVar2.mo7016a();
                mo6972a(wVar2, this.f6204t, state2, false);
            }
            this.f6204t.f6238l = null;
        }
    }

    /* renamed from: i */
    private int m8339i(State state) {
        if (mo7467e() == 0) {
            return 0;
        }
        mo6957L();
        C1775w wVar = this.f6205u;
        View b = mo6984b(!this.f6210z, true);
        return C1782z.m9638a(state, wVar, b, mo6975a(!this.f6210z, true), this, this.f6210z);
    }

    /* renamed from: f */
    public int mo6935f(State state) {
        return m8342k(state);
    }

    /* renamed from: c */
    public int mo6930c(State state) {
        return m8342k(state);
    }

    /* renamed from: f */
    public void mo6995f(boolean z) {
        this.f6210z = z;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: j */
    public int mo6998j(int i) {
        int i2 = -1;
        int i3 = 1;
        if (i == 1) {
            return (this.f6203s != 1 && mo6967V()) ? 1 : -1;
        }
        if (i == 2) {
            return (this.f6203s != 1 && mo6967V()) ? -1 : 1;
        }
        if (i == 17) {
            if (this.f6203s != 0) {
                i2 = Integer.MIN_VALUE;
            }
            return i2;
        } else if (i == 33) {
            if (this.f6203s != 1) {
                i2 = Integer.MIN_VALUE;
            }
            return i2;
        } else if (i == 66) {
            if (this.f6203s != 0) {
                i3 = Integer.MIN_VALUE;
            }
            return i3;
        } else if (i != 130) {
            return Integer.MIN_VALUE;
        } else {
            if (this.f6203s != 1) {
                i3 = Integer.MIN_VALUE;
            }
            return i3;
        }
    }

    /* renamed from: k */
    public void mo6999k(int i) {
        this.f6201G = i;
    }

    /* renamed from: f */
    private View m8332f(C1664w wVar, State state) {
        return mo6911a(wVar, state, 0, mo7467e(), state.getItemCount());
    }

    /* renamed from: a */
    public boolean mo6983a() {
        return this.f6203s == 0;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public int mo6988c(int i, C1664w wVar, State state) {
        if (mo7467e() == 0 || i == 0) {
            return 0;
        }
        mo6957L();
        this.f6204t.f6227a = true;
        int i2 = i > 0 ? 1 : -1;
        int abs = Math.abs(i);
        m8315a(i2, abs, true, state);
        C1624c cVar = this.f6204t;
        int a = cVar.f6233g + mo6972a(wVar, cVar, state, false);
        if (a < 0) {
            return 0;
        }
        if (abs > a) {
            i = i2 * a;
        }
        this.f6205u.mo8013a(-i);
        this.f6204t.f6237k = i;
        return i;
    }

    /* renamed from: h */
    private View m8337h(C1664w wVar, State state) {
        if (this.f6208x) {
            return m8332f(wVar, state);
        }
        return m8334g(wVar, state);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo6981a(@C0193h0 State state, @C0193h0 int[] iArr) {
        int i;
        int h = mo6996h(state);
        if (this.f6204t.f6232f == -1) {
            i = 0;
        } else {
            i = h;
            h = 0;
        }
        iArr[0] = h;
        iArr[1] = i;
    }

    /* renamed from: g */
    private void mo6936g(int i, int i2) {
        this.f6204t.f6229c = this.f6205u.mo8015b() - i2;
        this.f6204t.f6231e = this.f6208x ? -1 : 1;
        C1624c cVar = this.f6204t;
        cVar.f6230d = i;
        cVar.f6232f = 1;
        cVar.f6228b = i2;
        cVar.f6233g = Integer.MIN_VALUE;
    }

    /* renamed from: i */
    private View m8340i(C1664w wVar, State state) {
        if (this.f6208x) {
            return m8334g(wVar, state);
        }
        return m8332f(wVar, state);
    }

    /* renamed from: a */
    public void mo6982a(RecyclerView recyclerView, State state, int i) {
        C1761q qVar = new C1761q(recyclerView.getContext());
        qVar.mo7225d(i);
        mo7447b((C1627a0) qVar);
    }

    /* renamed from: g */
    private View m8334g(C1664w wVar, State state) {
        return mo6911a(wVar, state, mo7467e() - 1, -1, state.getItemCount());
    }

    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.f6203s = 1;
        this.f6207w = false;
        this.f6208x = false;
        this.f6209y = false;
        this.f6210z = true;
        this.f6195A = -1;
        this.f6196B = Integer.MIN_VALUE;
        this.f6198D = null;
        this.f6199E = new C1622a();
        this.f6200F = new C1623b();
        this.f6201G = 2;
        this.f6202H = new int[2];
        C1655d a = C1651o.m8612a(context, attributeSet, i, i2);
        mo7000l(a.f6344a);
        mo6993e(a.f6346c);
        mo6938g(a.f6347d);
    }

    /* renamed from: c */
    private void m8328c(C1664w wVar, int i, int i2) {
        if (i >= 0) {
            int i3 = i - i2;
            int e = mo7467e();
            if (!this.f6208x) {
                int i4 = 0;
                while (true) {
                    if (i4 >= e) {
                        break;
                    }
                    View d = mo7462d(i4);
                    if (this.f6205u.mo8012a(d) > i3 || this.f6205u.mo8022e(d) > i3) {
                        m8317a(wVar, 0, i4);
                    } else {
                        i4++;
                    }
                }
            } else {
                int i5 = e - 1;
                for (int i6 = i5; i6 >= 0; i6--) {
                    View d2 = mo7462d(i6);
                    if (this.f6205u.mo8012a(d2) > i3 || this.f6205u.mo8022e(d2) > i3) {
                        m8317a(wVar, i5, i6);
                        return;
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public PointF mo6973a(int i) {
        if (mo7467e() == 0) {
            return null;
        }
        boolean z = false;
        int i2 = 1;
        if (i < mo7496p(mo7462d(0))) {
            z = true;
        }
        if (z != this.f6208x) {
            i2 = -1;
        }
        if (this.f6203s == 0) {
            return new PointF((float) i2, 0.0f);
        }
        return new PointF(0.0f, (float) i2);
    }

    /* renamed from: a */
    private boolean m8320a(C1664w wVar, State state, C1622a aVar) {
        View view;
        int i;
        boolean z = false;
        if (mo7467e() == 0) {
            return false;
        }
        View g = mo7476g();
        if (g != null && aVar.mo7010a(g, state)) {
            aVar.mo7012b(g, mo7496p(g));
            return true;
        } else if (this.f6206v != this.f6209y) {
            return false;
        } else {
            if (aVar.f6214d) {
                view = m8337h(wVar, state);
            } else {
                view = m8340i(wVar, state);
            }
            if (view == null) {
                return false;
            }
            aVar.mo7009a(view, mo7496p(view));
            if (!state.isPreLayout() && mo6906J()) {
                if (this.f6205u.mo8019d(view) >= this.f6205u.mo8015b() || this.f6205u.mo8012a(view) < this.f6205u.mo8025g()) {
                    z = true;
                }
                if (z) {
                    if (aVar.f6214d) {
                        i = this.f6205u.mo8015b();
                    } else {
                        i = this.f6205u.mo8025g();
                    }
                    aVar.f6213c = i;
                }
            }
            return true;
        }
    }

    /* renamed from: b */
    private void m8326b(C1664w wVar, State state, C1622a aVar) {
        if (!m8319a(state, aVar) && !m8320a(wVar, state, aVar)) {
            aVar.mo7008a();
            aVar.f6212b = this.f6209y ? state.getItemCount() - 1 : 0;
        }
    }

    /* renamed from: b */
    private int m8322b(int i, C1664w wVar, State state, boolean z) {
        int g = i - this.f6205u.mo8025g();
        if (g <= 0) {
            return 0;
        }
        int i2 = -mo6988c(g, wVar, state);
        int i3 = i + i2;
        if (z) {
            int g2 = i3 - this.f6205u.mo8025g();
            if (g2 > 0) {
                this.f6205u.mo8013a(-g2);
                i2 -= g2;
            }
        }
        return i2;
    }

    /* renamed from: b */
    private void m8323b(C1622a aVar) {
        m8338h(aVar.f6212b, aVar.f6213c);
    }

    /* renamed from: b */
    public int mo6925b(int i, C1664w wVar, State state) {
        if (this.f6203s == 0) {
            return 0;
        }
        return mo6988c(i, wVar, state);
    }

    /* renamed from: a */
    private boolean m8319a(State state, C1622a aVar) {
        int i;
        boolean z = false;
        if (!state.isPreLayout()) {
            int i2 = this.f6195A;
            if (i2 != -1) {
                if (i2 < 0 || i2 >= state.getItemCount()) {
                    this.f6195A = -1;
                    this.f6196B = Integer.MIN_VALUE;
                } else {
                    aVar.f6212b = this.f6195A;
                    SavedState savedState = this.f6198D;
                    if (savedState != null && savedState.hasValidAnchor()) {
                        aVar.f6214d = this.f6198D.mAnchorLayoutFromEnd;
                        if (aVar.f6214d) {
                            aVar.f6213c = this.f6205u.mo8015b() - this.f6198D.mAnchorOffset;
                        } else {
                            aVar.f6213c = this.f6205u.mo8025g() + this.f6198D.mAnchorOffset;
                        }
                        return true;
                    } else if (this.f6196B == Integer.MIN_VALUE) {
                        View c = mo6989c(this.f6195A);
                        if (c == null) {
                            if (mo7467e() > 0) {
                                if ((this.f6195A < mo7496p(mo7462d(0))) == this.f6208x) {
                                    z = true;
                                }
                                aVar.f6214d = z;
                            }
                            aVar.mo7008a();
                        } else if (this.f6205u.mo8016b(c) > this.f6205u.mo8026h()) {
                            aVar.mo7008a();
                            return true;
                        } else if (this.f6205u.mo8019d(c) - this.f6205u.mo8025g() < 0) {
                            aVar.f6213c = this.f6205u.mo8025g();
                            aVar.f6214d = false;
                            return true;
                        } else if (this.f6205u.mo8015b() - this.f6205u.mo8012a(c) < 0) {
                            aVar.f6213c = this.f6205u.mo8015b();
                            aVar.f6214d = true;
                            return true;
                        } else {
                            if (aVar.f6214d) {
                                i = this.f6205u.mo8012a(c) + this.f6205u.mo8027i();
                            } else {
                                i = this.f6205u.mo8019d(c);
                            }
                            aVar.f6213c = i;
                        }
                        return true;
                    } else {
                        boolean z2 = this.f6208x;
                        aVar.f6214d = z2;
                        if (z2) {
                            aVar.f6213c = this.f6205u.mo8015b() - this.f6196B;
                        } else {
                            aVar.f6213c = this.f6205u.mo8025g() + this.f6196B;
                        }
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* renamed from: b */
    public int mo6926b(State state) {
        return m8341j(state);
    }

    /* renamed from: b */
    public void mo6986b(String str) {
        if (this.f6198D == null) {
            super.mo6986b(str);
        }
    }

    /* renamed from: b */
    private void m8324b(C1664w wVar, int i, int i2) {
        int e = mo7467e();
        if (i >= 0) {
            int a = (this.f6205u.mo8011a() - i) + i2;
            if (this.f6208x) {
                for (int i3 = 0; i3 < e; i3++) {
                    View d = mo7462d(i3);
                    if (this.f6205u.mo8019d(d) < a || this.f6205u.mo8024f(d) < a) {
                        m8317a(wVar, 0, i3);
                        return;
                    }
                }
            } else {
                int i4 = e - 1;
                int i5 = i4;
                while (true) {
                    if (i5 < 0) {
                        break;
                    }
                    View d2 = mo7462d(i5);
                    if (this.f6205u.mo8019d(d2) < a || this.f6205u.mo8024f(d2) < a) {
                        m8317a(wVar, i4, i5);
                    } else {
                        i5--;
                    }
                }
                m8317a(wVar, i4, i5);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public View mo6984b(boolean z, boolean z2) {
        if (this.f6208x) {
            return mo6974a(mo7467e() - 1, -1, z, z2);
        }
        return mo6974a(0, mo7467e(), z, z2);
    }

    /* renamed from: a */
    private int m8314a(int i, C1664w wVar, State state, boolean z) {
        int b = this.f6205u.mo8015b() - i;
        if (b <= 0) {
            return 0;
        }
        int i2 = -mo6988c(-b, wVar, state);
        int i3 = i + i2;
        if (z) {
            int b2 = this.f6205u.mo8015b() - i3;
            if (b2 > 0) {
                this.f6205u.mo8013a(b2);
                return b2 + i2;
            }
        }
        return i2;
    }

    /* renamed from: a */
    private void m8316a(C1622a aVar) {
        mo6936g(aVar.f6212b, aVar.f6213c);
    }

    /* renamed from: a */
    public int mo6908a(int i, C1664w wVar, State state) {
        if (this.f6203s == 1) {
            return 0;
        }
        return mo6988c(i, wVar, state);
    }

    /* renamed from: a */
    public int mo6971a(State state) {
        return m8339i(state);
    }

    /* renamed from: a */
    private void m8315a(int i, int i2, boolean z, State state) {
        int i3;
        this.f6204t.f6239m = mo6969X();
        this.f6204t.f6232f = i;
        int[] iArr = this.f6202H;
        boolean z2 = false;
        iArr[0] = 0;
        iArr[1] = 0;
        mo6981a(state, iArr);
        int max = Math.max(0, this.f6202H[0]);
        int max2 = Math.max(0, this.f6202H[1]);
        if (i == 1) {
            z2 = true;
        }
        this.f6204t.f6234h = z2 ? max2 : max;
        C1624c cVar = this.f6204t;
        if (!z2) {
            max = max2;
        }
        cVar.f6235i = max;
        int i4 = -1;
        if (z2) {
            this.f6204t.f6234h += this.f6205u.mo8017c();
            View d0 = m8330d0();
            C1624c cVar2 = this.f6204t;
            if (!this.f6208x) {
                i4 = 1;
            }
            cVar2.f6231e = i4;
            C1624c cVar3 = this.f6204t;
            int p = mo7496p(d0);
            C1624c cVar4 = this.f6204t;
            cVar3.f6230d = p + cVar4.f6231e;
            cVar4.f6228b = this.f6205u.mo8012a(d0);
            i3 = this.f6205u.mo8012a(d0) - this.f6205u.mo8015b();
        } else {
            View e0 = m8331e0();
            this.f6204t.f6234h += this.f6205u.mo8025g();
            C1624c cVar5 = this.f6204t;
            if (this.f6208x) {
                i4 = 1;
            }
            cVar5.f6231e = i4;
            C1624c cVar6 = this.f6204t;
            int p2 = mo7496p(e0);
            C1624c cVar7 = this.f6204t;
            cVar6.f6230d = p2 + cVar7.f6231e;
            cVar7.f6228b = this.f6205u.mo8019d(e0);
            i3 = (-this.f6205u.mo8019d(e0)) + this.f6205u.mo8025g();
        }
        C1624c cVar8 = this.f6204t;
        cVar8.f6229c = i2;
        if (z) {
            cVar8.f6229c -= i3;
        }
        this.f6204t.f6233g = i3;
    }

    /* renamed from: e */
    public int mo6933e(State state) {
        return m8341j(state);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public View mo6992e(int i, int i2) {
        int i3;
        int i4;
        View view;
        mo6957L();
        char c = i2 > i ? 1 : i2 < i ? (char) 65535 : 0;
        if (c == 0) {
            return mo7462d(i);
        }
        if (this.f6205u.mo8019d(mo7462d(i)) < this.f6205u.mo8025g()) {
            i4 = 16644;
            i3 = 16388;
        } else {
            i4 = 4161;
            i3 = C1406n.f5541H;
        }
        if (this.f6203s == 0) {
            view = this.f6328e.mo7833a(i, i2, i4, i3);
        } else {
            view = this.f6329f.mo7833a(i, i2, i4, i3);
        }
        return view;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo6916a(State state, C1624c cVar, C1654c cVar2) {
        int i = cVar.f6230d;
        if (i >= 0 && i < state.getItemCount()) {
            cVar2.mo7517a(i, Math.max(0, cVar.f6233g));
        }
    }

    /* renamed from: a */
    public void mo6977a(int i, C1654c cVar) {
        boolean z;
        int i2;
        SavedState savedState = this.f6198D;
        int i3 = -1;
        if (savedState == null || !savedState.hasValidAnchor()) {
            m8336g0();
            z = this.f6208x;
            i2 = this.f6195A;
            if (i2 == -1) {
                i2 = z ? i - 1 : 0;
            }
        } else {
            SavedState savedState2 = this.f6198D;
            z = savedState2.mAnchorLayoutFromEnd;
            i2 = savedState2.mAnchorPosition;
        }
        if (!z) {
            i3 = 1;
        }
        int i4 = i2;
        for (int i5 = 0; i5 < this.f6201G && i4 >= 0 && i4 < i; i5++) {
            cVar.mo7517a(i4, 0);
            i4 += i3;
        }
    }

    /* renamed from: a */
    public void mo6976a(int i, int i2, State state, C1654c cVar) {
        if (this.f6203s != 0) {
            i = i2;
        }
        if (mo7467e() != 0 && i != 0) {
            mo6957L();
            m8315a(i > 0 ? 1 : -1, Math.abs(i), true, state);
            mo6916a(state, this.f6204t, cVar);
        }
    }

    /* renamed from: a */
    private void m8317a(C1664w wVar, int i, int i2) {
        if (i != i2) {
            if (i2 > i) {
                for (int i3 = i2 - 1; i3 >= i; i3--) {
                    mo7440b(i3, wVar);
                }
            } else {
                while (i > i2) {
                    mo7440b(i, wVar);
                    i--;
                }
            }
        }
    }

    /* renamed from: a */
    private void m8318a(C1664w wVar, C1624c cVar) {
        if (cVar.f6227a && !cVar.f6239m) {
            int i = cVar.f6233g;
            int i2 = cVar.f6235i;
            if (cVar.f6232f == -1) {
                m8324b(wVar, i, i2);
            } else {
                m8328c(wVar, i, i2);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public int mo6972a(C1664w wVar, C1624c cVar, State state, boolean z) {
        int i = cVar.f6229c;
        int i2 = cVar.f6233g;
        if (i2 != Integer.MIN_VALUE) {
            if (i < 0) {
                cVar.f6233g = i2 + i;
            }
            m8318a(wVar, cVar);
        }
        int i3 = cVar.f6229c + cVar.f6234h;
        C1623b bVar = this.f6200F;
        while (true) {
            if ((!cVar.f6239m && i3 <= 0) || !cVar.mo7018a(state)) {
                break;
            }
            bVar.mo7014a();
            mo6919a(wVar, state, cVar, bVar);
            if (!bVar.f6217b) {
                cVar.f6228b += bVar.f6216a * cVar.f6232f;
                if (!bVar.f6218c || cVar.f6238l != null || !state.isPreLayout()) {
                    int i4 = cVar.f6229c;
                    int i5 = bVar.f6216a;
                    cVar.f6229c = i4 - i5;
                    i3 -= i5;
                }
                int i6 = cVar.f6233g;
                if (i6 != Integer.MIN_VALUE) {
                    cVar.f6233g = i6 + bVar.f6216a;
                    int i7 = cVar.f6229c;
                    if (i7 < 0) {
                        cVar.f6233g += i7;
                    }
                    m8318a(wVar, cVar);
                }
                if (z && bVar.f6219d) {
                    break;
                }
            } else {
                break;
            }
        }
        return i - cVar.f6229c;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo6919a(C1664w wVar, State state, C1624c cVar, C1623b bVar) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        View a = cVar.mo7015a(wVar);
        if (a == null) {
            bVar.f6217b = true;
            return;
        }
        C1656p pVar = (C1656p) a.getLayoutParams();
        if (cVar.f6238l == null) {
            if (this.f6208x == (cVar.f6232f == -1)) {
                mo7441b(a);
            } else {
                mo7442b(a, 0);
            }
        } else {
            if (this.f6208x == (cVar.f6232f == -1)) {
                mo7406a(a);
            } else {
                mo7407a(a, 0);
            }
        }
        mo7443b(a, 0, 0);
        bVar.f6216a = this.f6205u.mo8016b(a);
        if (this.f6203s == 1) {
            if (mo6967V()) {
                i5 = mo7503t() - mo7497q();
                i4 = i5 - this.f6205u.mo8018c(a);
            } else {
                i4 = mo7495p();
                i5 = this.f6205u.mo8018c(a) + i4;
            }
            if (cVar.f6232f == -1) {
                int i6 = cVar.f6228b;
                i = i6;
                i2 = i5;
                i3 = i6 - bVar.f6216a;
            } else {
                int i7 = cVar.f6228b;
                i3 = i7;
                i2 = i5;
                i = bVar.f6216a + i7;
            }
        } else {
            int s = mo7501s();
            int c = this.f6205u.mo8018c(a) + s;
            if (cVar.f6232f == -1) {
                int i8 = cVar.f6228b;
                i2 = i8;
                i3 = s;
                i = c;
                i4 = i8 - bVar.f6216a;
            } else {
                int i9 = cVar.f6228b;
                i3 = s;
                i2 = bVar.f6216a + i9;
                i = c;
                i4 = i9;
            }
        }
        mo7444b(a, i4, i3, i2, i);
        if (pVar.mo7522e() || pVar.mo7521d()) {
            bVar.f6218c = true;
        }
        bVar.f6219d = a.hasFocusable();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public View mo6975a(boolean z, boolean z2) {
        if (this.f6208x) {
            return mo6974a(0, mo7467e(), z, z2);
        }
        return mo6974a(mo7467e() - 1, -1, z, z2);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public View mo6911a(C1664w wVar, State state, int i, int i2, int i3) {
        mo6957L();
        int g = this.f6205u.mo8025g();
        int b = this.f6205u.mo8015b();
        int i4 = i2 > i ? 1 : -1;
        View view = null;
        View view2 = null;
        while (i != i2) {
            View d = mo7462d(i);
            int p = mo7496p(d);
            if (p >= 0 && p < i3) {
                if (((C1656p) d.getLayoutParams()).mo7522e()) {
                    if (view2 == null) {
                        view2 = d;
                    }
                } else if (this.f6205u.mo8019d(d) < b && this.f6205u.mo8012a(d) >= g) {
                    return d;
                } else {
                    if (view == null) {
                        view = d;
                    }
                }
            }
            i += i4;
        }
        if (view == null) {
            view = view2;
        }
        return view;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public View mo6974a(int i, int i2, boolean z, boolean z2) {
        mo6957L();
        int i3 = 320;
        int i4 = z ? 24579 : 320;
        if (!z2) {
            i3 = 0;
        }
        if (this.f6203s == 0) {
            return this.f6328e.mo7833a(i, i2, i4, i3);
        }
        return this.f6329f.mo7833a(i, i2, i4, i3);
    }

    /* renamed from: a */
    public View mo6910a(View view, int i, C1664w wVar, State state) {
        View view2;
        View view3;
        m8336g0();
        if (mo7467e() == 0) {
            return null;
        }
        int j = mo6998j(i);
        if (j == Integer.MIN_VALUE) {
            return null;
        }
        mo6957L();
        m8315a(j, (int) (((float) this.f6205u.mo8026h()) * f6194N), false, state);
        C1624c cVar = this.f6204t;
        cVar.f6233g = Integer.MIN_VALUE;
        cVar.f6227a = false;
        mo6972a(wVar, cVar, state, true);
        if (j == -1) {
            view2 = m8329c0();
        } else {
            view2 = mo6929b0();
        }
        if (j == -1) {
            view3 = m8331e0();
        } else {
            view3 = m8330d0();
        }
        if (!view3.hasFocusable()) {
            return view2;
        }
        if (view2 == null) {
            return null;
        }
        return view3;
    }

    /* renamed from: a */
    public void mo6979a(@C0193h0 View view, @C0193h0 View view2, int i, int i2) {
        mo6986b("Cannot drop a view during a scroll or layout calculation");
        mo6957L();
        m8336g0();
        int p = mo7496p(view);
        int p2 = mo7496p(view2);
        char c = p < p2 ? (char) 1 : 65535;
        if (this.f6208x) {
            if (c == 1) {
                mo6994f(p2, this.f6205u.mo8015b() - (this.f6205u.mo8019d(view2) + this.f6205u.mo8016b(view)));
            } else {
                mo6994f(p2, this.f6205u.mo8015b() - this.f6205u.mo8012a(view2));
            }
        } else if (c == 65535) {
            mo6994f(p2, this.f6205u.mo8019d(view2));
        } else {
            mo6994f(p2, this.f6205u.mo8012a(view2) - this.f6205u.mo8016b(view));
        }
    }
}
