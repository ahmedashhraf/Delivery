package androidx.transition;

import android.animation.TimeInterpolator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import androidx.annotation.C0207n0;
import androidx.annotation.C0207n0.C0208a;
import androidx.annotation.C0225w;
import androidx.core.content.p020h.C0878h;
import androidx.transition.C1880f0.C1886f;
import androidx.transition.C1880f0.C1888h;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: androidx.transition.k0 */
/* compiled from: TransitionSet */
public class C1913k0 extends C1880f0 {

    /* renamed from: M0 */
    private static final int f7373M0 = 1;

    /* renamed from: N0 */
    private static final int f7374N0 = 2;

    /* renamed from: O0 */
    private static final int f7375O0 = 4;

    /* renamed from: P0 */
    private static final int f7376P0 = 8;

    /* renamed from: Q0 */
    public static final int f7377Q0 = 0;

    /* renamed from: R0 */
    public static final int f7378R0 = 1;

    /* renamed from: H0 */
    private ArrayList<C1880f0> f7379H0 = new ArrayList<>();

    /* renamed from: I0 */
    private boolean f7380I0 = true;

    /* renamed from: J0 */
    int f7381J0;

    /* renamed from: K0 */
    boolean f7382K0 = false;

    /* renamed from: L0 */
    private int f7383L0 = 0;

    /* renamed from: androidx.transition.k0$a */
    /* compiled from: TransitionSet */
    class C1914a extends C1897h0 {

        /* renamed from: a */
        final /* synthetic */ C1880f0 f7384a;

        C1914a(C1880f0 f0Var) {
            this.f7384a = f0Var;
        }

        /* renamed from: c */
        public void mo8302c(@C0193h0 C1880f0 f0Var) {
            this.f7384a.mo8372p();
            f0Var.mo8342b((C1888h) this);
        }
    }

    /* renamed from: androidx.transition.k0$b */
    /* compiled from: TransitionSet */
    static class C1915b extends C1897h0 {

        /* renamed from: a */
        C1913k0 f7386a;

        C1915b(C1913k0 k0Var) {
            this.f7386a = k0Var;
        }

        /* renamed from: a */
        public void mo8312a(@C0193h0 C1880f0 f0Var) {
            C1913k0 k0Var = this.f7386a;
            if (!k0Var.f7382K0) {
                k0Var.mo8373q();
                this.f7386a.f7382K0 = true;
            }
        }

        /* renamed from: c */
        public void mo8302c(@C0193h0 C1880f0 f0Var) {
            C1913k0 k0Var = this.f7386a;
            k0Var.f7381J0--;
            if (k0Var.f7381J0 == 0) {
                k0Var.f7382K0 = false;
                k0Var.mo8346b();
            }
            f0Var.mo8342b((C1888h) this);
        }
    }

    public C1913k0() {
    }

    /* renamed from: t */
    private void m10101t() {
        C1915b bVar = new C1915b(this);
        Iterator it = this.f7379H0.iterator();
        while (it.hasNext()) {
            ((C1880f0) it.next()).mo8324a((C1888h) bVar);
        }
        this.f7381J0 = this.f7379H0.size();
    }

    /* access modifiers changed from: protected */
    @C0207n0({C0208a.LIBRARY_GROUP_PREFIX})
    public void cancel() {
        super.cancel();
        int size = this.f7379H0.size();
        for (int i = 0; i < size; i++) {
            ((C1880f0) this.f7379H0.get(i)).cancel();
        }
    }

    @C0207n0({C0208a.LIBRARY_GROUP_PREFIX})
    /* renamed from: e */
    public void mo8362e(View view) {
        super.mo8362e(view);
        int size = this.f7379H0.size();
        for (int i = 0; i < size; i++) {
            ((C1880f0) this.f7379H0.get(i)).mo8362e(view);
        }
    }

    /* access modifiers changed from: protected */
    @C0207n0({C0208a.LIBRARY_GROUP_PREFIX})
    /* renamed from: p */
    public void mo8372p() {
        if (this.f7379H0.isEmpty()) {
            mo8373q();
            mo8346b();
            return;
        }
        m10101t();
        if (!this.f7380I0) {
            for (int i = 1; i < this.f7379H0.size(); i++) {
                ((C1880f0) this.f7379H0.get(i - 1)).mo8324a((C1888h) new C1914a((C1880f0) this.f7379H0.get(i)));
            }
            C1880f0 f0Var = (C1880f0) this.f7379H0.get(0);
            if (f0Var != null) {
                f0Var.mo8372p();
            }
        } else {
            Iterator it = this.f7379H0.iterator();
            while (it.hasNext()) {
                ((C1880f0) it.next()).mo8372p();
            }
        }
    }

    /* renamed from: r */
    public int mo8273r() {
        return this.f7380I0 ^ true ? 1 : 0;
    }

    /* renamed from: s */
    public int mo8427s() {
        return this.f7379H0.size();
    }

    /* renamed from: c */
    private void m10100c(@C0193h0 C1880f0 f0Var) {
        this.f7379H0.add(f0Var);
        f0Var.f7281c0 = this;
    }

    public C1880f0 clone() {
        C1913k0 k0Var = (C1913k0) super.clone();
        k0Var.f7379H0 = new ArrayList<>();
        int size = this.f7379H0.size();
        for (int i = 0; i < size; i++) {
            k0Var.m10100c(((C1880f0) this.f7379H0.get(i)).clone());
        }
        return k0Var;
    }

    @C0193h0
    /* renamed from: d */
    public C1913k0 mo8426d(int i) {
        if (i == 0) {
            this.f7380I0 = true;
        } else if (i == 1) {
            this.f7380I0 = false;
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Invalid parameter for TransitionSet ordering: ");
            sb.append(i);
            throw new AndroidRuntimeException(sb.toString());
        }
        return this;
    }

    @C0195i0
    /* renamed from: c */
    public C1880f0 mo8310c(int i) {
        if (i < 0 || i >= this.f7379H0.size()) {
            return null;
        }
        return (C1880f0) this.f7379H0.get(i);
    }

    @C0193h0
    /* renamed from: d */
    public C1913k0 m10148d(@C0193h0 View view) {
        for (int i = 0; i < this.f7379H0.size(); i++) {
            ((C1880f0) this.f7379H0.get(i)).mo8359d(view);
        }
        return (C1913k0) super.mo8359d(view);
    }

    @SuppressLint({"RestrictedApi"})
    public C1913k0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1861e0.f7194i);
        mo8426d(C0878h.m5077b(obtainStyledAttributes, (XmlResourceParser) attributeSet, "transitionOrdering", 0, 0));
        obtainStyledAttributes.recycle();
    }

    @C0193h0
    /* renamed from: b */
    public C1913k0 m10133b(long j) {
        return (C1913k0) super.mo8340b(j);
    }

    /* renamed from: c */
    public void mo8263c(@C0193h0 C1922m0 m0Var) {
        if (mo8350b(m0Var.f7404b)) {
            Iterator it = this.f7379H0.iterator();
            while (it.hasNext()) {
                C1880f0 f0Var = (C1880f0) it.next();
                if (f0Var.mo8350b(m0Var.f7404b)) {
                    f0Var.mo8263c(m0Var);
                    m0Var.f7405c.add(f0Var);
                }
            }
        }
    }

    @C0193h0
    /* renamed from: b */
    public C1913k0 m10132b(@C0225w int i) {
        for (int i2 = 0; i2 < this.f7379H0.size(); i2++) {
            ((C1880f0) this.f7379H0.get(i2)).mo8338b(i);
        }
        return (C1913k0) super.mo8338b(i);
    }

    @C0193h0
    /* renamed from: a */
    public C1913k0 mo8424a(@C0193h0 C1880f0 f0Var) {
        m10100c(f0Var);
        long j = this.f7264N;
        if (j >= 0) {
            f0Var.mo8320a(j);
        }
        if ((this.f7383L0 & 1) != 0) {
            f0Var.mo8321a(mo8363f());
        }
        if ((this.f7383L0 & 2) != 0) {
            f0Var.mo8334a(mo8366i());
        }
        if ((this.f7383L0 & 4) != 0) {
            f0Var.mo8335a(mo8365h());
        }
        if ((this.f7383L0 & 8) != 0) {
            f0Var.mo8333a(mo8361e());
        }
        return this;
    }

    @C0193h0
    /* renamed from: b */
    public C1913k0 m10136b(@C0193h0 Class<?> cls) {
        for (int i = 0; i < this.f7379H0.size(); i++) {
            ((C1880f0) this.f7379H0.get(i)).mo8343b(cls);
        }
        return (C1913k0) super.mo8343b(cls);
    }

    @C0207n0({C0208a.LIBRARY_GROUP_PREFIX})
    /* renamed from: c */
    public void mo8355c(View view) {
        super.mo8355c(view);
        int size = this.f7379H0.size();
        for (int i = 0; i < size; i++) {
            ((C1880f0) this.f7379H0.get(i)).mo8355c(view);
        }
    }

    @C0193h0
    /* renamed from: b */
    public C1913k0 m10137b(@C0193h0 String str) {
        for (int i = 0; i < this.f7379H0.size(); i++) {
            ((C1880f0) this.f7379H0.get(i)).mo8345b(str);
        }
        return (C1913k0) super.mo8345b(str);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public C1913k0 m10142c(ViewGroup viewGroup) {
        super.mo8352c(viewGroup);
        int size = this.f7379H0.size();
        for (int i = 0; i < size; i++) {
            ((C1880f0) this.f7379H0.get(i)).mo8352c(viewGroup);
        }
        return this;
    }

    @C0193h0
    /* renamed from: b */
    public C1880f0 mo8341b(@C0193h0 View view, boolean z) {
        for (int i = 0; i < this.f7379H0.size(); i++) {
            ((C1880f0) this.f7379H0.get(i)).mo8341b(view, z);
        }
        return super.mo8341b(view, z);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public String mo8354c(String str) {
        String c = super.mo8354c(str);
        for (int i = 0; i < this.f7379H0.size(); i++) {
            StringBuilder sb = new StringBuilder();
            sb.append(c);
            sb.append("\n");
            C1880f0 f0Var = (C1880f0) this.f7379H0.get(i);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            sb2.append("  ");
            sb.append(f0Var.mo8354c(sb2.toString()));
            c = sb.toString();
        }
        return c;
    }

    @C0193h0
    /* renamed from: a */
    public C1913k0 m10111a(long j) {
        super.mo8320a(j);
        if (this.f7264N >= 0) {
            ArrayList<C1880f0> arrayList = this.f7379H0;
            if (arrayList != null) {
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    ((C1880f0) this.f7379H0.get(i)).mo8320a(j);
                }
            }
        }
        return this;
    }

    @C0193h0
    /* renamed from: b */
    public C1880f0 mo8339b(int i, boolean z) {
        for (int i2 = 0; i2 < this.f7379H0.size(); i2++) {
            ((C1880f0) this.f7379H0.get(i2)).mo8339b(i, z);
        }
        return super.mo8339b(i, z);
    }

    @C0193h0
    /* renamed from: b */
    public C1880f0 mo8344b(@C0193h0 Class<?> cls, boolean z) {
        for (int i = 0; i < this.f7379H0.size(); i++) {
            ((C1880f0) this.f7379H0.get(i)).mo8344b(cls, z);
        }
        return super.mo8344b(cls, z);
    }

    @C0193h0
    /* renamed from: a */
    public C1913k0 m10112a(@C0195i0 TimeInterpolator timeInterpolator) {
        this.f7383L0 |= 1;
        ArrayList<C1880f0> arrayList = this.f7379H0;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((C1880f0) this.f7379H0.get(i)).mo8321a(timeInterpolator);
            }
        }
        return (C1913k0) super.mo8321a(timeInterpolator);
    }

    @C0193h0
    /* renamed from: b */
    public C1913k0 m10134b(@C0193h0 C1888h hVar) {
        return (C1913k0) super.mo8342b(hVar);
    }

    @C0193h0
    /* renamed from: b */
    public C1913k0 mo8425b(@C0193h0 C1880f0 f0Var) {
        this.f7379H0.remove(f0Var);
        f0Var.f7281c0 = null;
        return this;
    }

    @C0193h0
    /* renamed from: a */
    public C1913k0 m10113a(@C0193h0 View view) {
        for (int i = 0; i < this.f7379H0.size(); i++) {
            ((C1880f0) this.f7379H0.get(i)).mo8322a(view);
        }
        return (C1913k0) super.mo8322a(view);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo8348b(C1922m0 m0Var) {
        super.mo8348b(m0Var);
        int size = this.f7379H0.size();
        for (int i = 0; i < size; i++) {
            ((C1880f0) this.f7379H0.get(i)).mo8348b(m0Var);
        }
    }

    @C0193h0
    /* renamed from: a */
    public C1913k0 m10110a(@C0225w int i) {
        for (int i2 = 0; i2 < this.f7379H0.size(); i2++) {
            ((C1880f0) this.f7379H0.get(i2)).mo8318a(i);
        }
        return (C1913k0) super.mo8318a(i);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo8349b(boolean z) {
        super.mo8349b(z);
        int size = this.f7379H0.size();
        for (int i = 0; i < size; i++) {
            ((C1880f0) this.f7379H0.get(i)).mo8349b(z);
        }
    }

    @C0193h0
    /* renamed from: a */
    public C1913k0 m10117a(@C0193h0 String str) {
        for (int i = 0; i < this.f7379H0.size(); i++) {
            ((C1880f0) this.f7379H0.get(i)).mo8327a(str);
        }
        return (C1913k0) super.mo8327a(str);
    }

    @C0193h0
    /* renamed from: a */
    public C1913k0 m10116a(@C0193h0 Class<?> cls) {
        for (int i = 0; i < this.f7379H0.size(); i++) {
            ((C1880f0) this.f7379H0.get(i)).mo8325a(cls);
        }
        return (C1913k0) super.mo8325a(cls);
    }

    @C0193h0
    /* renamed from: a */
    public C1913k0 m10114a(@C0193h0 C1888h hVar) {
        return (C1913k0) super.mo8324a(hVar);
    }

    @C0193h0
    /* renamed from: a */
    public C1880f0 mo8328a(@C0193h0 String str, boolean z) {
        for (int i = 0; i < this.f7379H0.size(); i++) {
            ((C1880f0) this.f7379H0.get(i)).mo8328a(str, z);
        }
        return super.mo8328a(str, z);
    }

    /* renamed from: a */
    public void mo8335a(C1950w wVar) {
        super.mo8335a(wVar);
        this.f7383L0 |= 4;
        if (this.f7379H0 != null) {
            for (int i = 0; i < this.f7379H0.size(); i++) {
                ((C1880f0) this.f7379H0.get(i)).mo8335a(wVar);
            }
        }
    }

    /* access modifiers changed from: protected */
    @C0207n0({C0208a.LIBRARY_GROUP_PREFIX})
    /* renamed from: a */
    public void mo8331a(ViewGroup viewGroup, C1928n0 n0Var, C1928n0 n0Var2, ArrayList<C1922m0> arrayList, ArrayList<C1922m0> arrayList2) {
        long j = mo8367j();
        int size = this.f7379H0.size();
        for (int i = 0; i < size; i++) {
            C1880f0 f0Var = (C1880f0) this.f7379H0.get(i);
            if (j > 0 && (this.f7380I0 || i == 0)) {
                long j2 = f0Var.mo8367j();
                if (j2 > 0) {
                    f0Var.mo8340b(j2 + j);
                } else {
                    f0Var.mo8340b(j);
                }
            }
            f0Var.mo8331a(viewGroup, n0Var, n0Var2, arrayList, arrayList2);
        }
    }

    /* renamed from: a */
    public void mo8261a(@C0193h0 C1922m0 m0Var) {
        if (mo8350b(m0Var.f7404b)) {
            Iterator it = this.f7379H0.iterator();
            while (it.hasNext()) {
                C1880f0 f0Var = (C1880f0) it.next();
                if (f0Var.mo8350b(m0Var.f7404b)) {
                    f0Var.mo8261a(m0Var);
                    m0Var.f7405c.add(f0Var);
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    @C0207n0({C0208a.LIBRARY_GROUP_PREFIX})
    /* renamed from: a */
    public void mo8330a(ViewGroup viewGroup) {
        super.mo8330a(viewGroup);
        int size = this.f7379H0.size();
        for (int i = 0; i < size; i++) {
            ((C1880f0) this.f7379H0.get(i)).mo8330a(viewGroup);
        }
    }

    /* renamed from: a */
    public void mo8334a(C1911j0 j0Var) {
        super.mo8334a(j0Var);
        this.f7383L0 |= 2;
        int size = this.f7379H0.size();
        for (int i = 0; i < size; i++) {
            ((C1880f0) this.f7379H0.get(i)).mo8334a(j0Var);
        }
    }

    /* renamed from: a */
    public void mo8333a(C1886f fVar) {
        super.mo8333a(fVar);
        this.f7383L0 |= 8;
        int size = this.f7379H0.size();
        for (int i = 0; i < size; i++) {
            ((C1880f0) this.f7379H0.get(i)).mo8333a(fVar);
        }
    }
}
