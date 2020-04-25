package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Path;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.InflateException;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.ListView;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import androidx.annotation.C0207n0;
import androidx.annotation.C0207n0.C0208a;
import androidx.annotation.C0225w;
import androidx.collection.C0635a;
import androidx.collection.C0642f;
import androidx.collection.C0649h;
import androidx.core.content.p020h.C0878h;
import androidx.core.p034l.C0962e0;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.StringTokenizer;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: androidx.transition.f0 */
/* compiled from: Transition */
public abstract class C1880f0 implements Cloneable {

    /* renamed from: A0 */
    private static final String f7249A0 = "instance";

    /* renamed from: B0 */
    private static final String f7250B0 = "name";

    /* renamed from: C0 */
    private static final String f7251C0 = "id";

    /* renamed from: D0 */
    private static final String f7252D0 = "itemId";

    /* renamed from: E0 */
    private static final int[] f7253E0 = {2, 1, 3, 4};

    /* renamed from: F0 */
    private static final C1950w f7254F0 = new C1881a();

    /* renamed from: G0 */
    private static ThreadLocal<C0635a<Animator, C1884d>> f7255G0 = new ThreadLocal<>();

    /* renamed from: s0 */
    private static final String f7256s0 = "Transition";

    /* renamed from: t0 */
    static final boolean f7257t0 = false;

    /* renamed from: u0 */
    public static final int f7258u0 = 1;

    /* renamed from: v0 */
    private static final int f7259v0 = 1;

    /* renamed from: w0 */
    public static final int f7260w0 = 2;

    /* renamed from: x0 */
    public static final int f7261x0 = 3;

    /* renamed from: y0 */
    public static final int f7262y0 = 4;

    /* renamed from: z0 */
    private static final int f7263z0 = 4;

    /* renamed from: N */
    long f7264N = -1;

    /* renamed from: O */
    private TimeInterpolator f7265O = null;

    /* renamed from: P */
    ArrayList<Integer> f7266P = new ArrayList<>();

    /* renamed from: Q */
    ArrayList<View> f7267Q = new ArrayList<>();

    /* renamed from: R */
    private ArrayList<String> f7268R = null;

    /* renamed from: S */
    private ArrayList<Class<?>> f7269S = null;

    /* renamed from: T */
    private ArrayList<Integer> f7270T = null;

    /* renamed from: U */
    private ArrayList<View> f7271U = null;

    /* renamed from: V */
    private ArrayList<Class<?>> f7272V = null;

    /* renamed from: W */
    private ArrayList<String> f7273W = null;

    /* renamed from: X */
    private ArrayList<Integer> f7274X = null;

    /* renamed from: Y */
    private ArrayList<View> f7275Y = null;

    /* renamed from: Z */
    private ArrayList<Class<?>> f7276Z = null;

    /* renamed from: a */
    private String f7277a = getClass().getName();

    /* renamed from: a0 */
    private C1928n0 f7278a0 = new C1928n0();

    /* renamed from: b */
    private long f7279b = -1;

    /* renamed from: b0 */
    private C1928n0 f7280b0 = new C1928n0();

    /* renamed from: c0 */
    C1913k0 f7281c0 = null;

    /* renamed from: d0 */
    private int[] f7282d0 = f7253E0;

    /* renamed from: e0 */
    private ArrayList<C1922m0> f7283e0;

    /* renamed from: f0 */
    private ArrayList<C1922m0> f7284f0;

    /* renamed from: g0 */
    private ViewGroup f7285g0 = null;

    /* renamed from: h0 */
    boolean f7286h0 = false;

    /* renamed from: i0 */
    ArrayList<Animator> f7287i0 = new ArrayList<>();

    /* renamed from: j0 */
    private int f7288j0 = 0;

    /* renamed from: k0 */
    private boolean f7289k0 = false;

    /* renamed from: l0 */
    private boolean f7290l0 = false;

    /* renamed from: m0 */
    private ArrayList<C1888h> f7291m0 = null;

    /* renamed from: n0 */
    private ArrayList<Animator> f7292n0 = new ArrayList<>();

    /* renamed from: o0 */
    C1911j0 f7293o0;

    /* renamed from: p0 */
    private C1886f f7294p0;

    /* renamed from: q0 */
    private C0635a<String, String> f7295q0;

    /* renamed from: r0 */
    private C1950w f7296r0 = f7254F0;

    /* renamed from: androidx.transition.f0$a */
    /* compiled from: Transition */
    static class C1881a extends C1950w {
        C1881a() {
        }

        /* renamed from: a */
        public Path mo8239a(float f, float f2, float f3, float f4) {
            Path path = new Path();
            path.moveTo(f, f2);
            path.lineTo(f3, f4);
            return path;
        }
    }

    /* renamed from: androidx.transition.f0$b */
    /* compiled from: Transition */
    class C1882b extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ C0635a f7297a;

        C1882b(C0635a aVar) {
            this.f7297a = aVar;
        }

        public void onAnimationEnd(Animator animator) {
            this.f7297a.remove(animator);
            C1880f0.this.f7287i0.remove(animator);
        }

        public void onAnimationStart(Animator animator) {
            C1880f0.this.f7287i0.add(animator);
        }
    }

    /* renamed from: androidx.transition.f0$c */
    /* compiled from: Transition */
    class C1883c extends AnimatorListenerAdapter {
        C1883c() {
        }

        public void onAnimationEnd(Animator animator) {
            C1880f0.this.mo8346b();
            animator.removeListener(this);
        }
    }

    /* renamed from: androidx.transition.f0$d */
    /* compiled from: Transition */
    private static class C1884d {

        /* renamed from: a */
        View f7300a;

        /* renamed from: b */
        String f7301b;

        /* renamed from: c */
        C1922m0 f7302c;

        /* renamed from: d */
        C1909i1 f7303d;

        /* renamed from: e */
        C1880f0 f7304e;

        C1884d(View view, String str, C1880f0 f0Var, C1909i1 i1Var, C1922m0 m0Var) {
            this.f7300a = view;
            this.f7301b = str;
            this.f7302c = m0Var;
            this.f7303d = i1Var;
            this.f7304e = f0Var;
        }
    }

    /* renamed from: androidx.transition.f0$e */
    /* compiled from: Transition */
    private static class C1885e {
        private C1885e() {
        }

        /* renamed from: a */
        static <T> ArrayList<T> m9998a(ArrayList<T> arrayList, T t) {
            if (arrayList == null) {
                arrayList = new ArrayList<>();
            }
            if (!arrayList.contains(t)) {
                arrayList.add(t);
            }
            return arrayList;
        }

        /* renamed from: b */
        static <T> ArrayList<T> m9999b(ArrayList<T> arrayList, T t) {
            if (arrayList == null) {
                return arrayList;
            }
            arrayList.remove(t);
            if (arrayList.isEmpty()) {
                return null;
            }
            return arrayList;
        }
    }

    /* renamed from: androidx.transition.f0$f */
    /* compiled from: Transition */
    public static abstract class C1886f {
        /* renamed from: a */
        public abstract Rect mo8378a(@C0193h0 C1880f0 f0Var);
    }

    @C0207n0({C0208a.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: androidx.transition.f0$g */
    /* compiled from: Transition */
    public @interface C1887g {
    }

    /* renamed from: androidx.transition.f0$h */
    /* compiled from: Transition */
    public interface C1888h {
        /* renamed from: a */
        void mo8312a(@C0193h0 C1880f0 f0Var);

        /* renamed from: b */
        void mo8301b(@C0193h0 C1880f0 f0Var);

        /* renamed from: c */
        void mo8302c(@C0193h0 C1880f0 f0Var);

        /* renamed from: d */
        void mo8303d(@C0193h0 C1880f0 f0Var);

        /* renamed from: e */
        void mo8304e(@C0193h0 C1880f0 f0Var);
    }

    public C1880f0() {
    }

    /* renamed from: c */
    private static boolean mo8310c(int i) {
        return i >= 1 && i <= 4;
    }

    /* renamed from: d */
    private static int[] m9935d(String str) {
        StringTokenizer stringTokenizer = new StringTokenizer(str, ",");
        int[] iArr = new int[stringTokenizer.countTokens()];
        int i = 0;
        while (stringTokenizer.hasMoreTokens()) {
            String trim = stringTokenizer.nextToken().trim();
            if ("id".equalsIgnoreCase(trim)) {
                iArr[i] = 3;
            } else if (f7249A0.equalsIgnoreCase(trim)) {
                iArr[i] = 1;
            } else if ("name".equalsIgnoreCase(trim)) {
                iArr[i] = 2;
            } else if (f7252D0.equalsIgnoreCase(trim)) {
                iArr[i] = 4;
            } else if (trim.isEmpty()) {
                int[] iArr2 = new int[(iArr.length - 1)];
                System.arraycopy(iArr, 0, iArr2, 0, i);
                i--;
                iArr = iArr2;
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("Unknown match type in matchOrder: '");
                sb.append(trim);
                sb.append("'");
                throw new InflateException(sb.toString());
            }
            i++;
        }
        return iArr;
    }

    /* renamed from: e */
    private void m9936e(View view, boolean z) {
        if (view != null) {
            int id = view.getId();
            ArrayList<Integer> arrayList = this.f7270T;
            if (arrayList == null || !arrayList.contains(Integer.valueOf(id))) {
                ArrayList<View> arrayList2 = this.f7271U;
                if (arrayList2 == null || !arrayList2.contains(view)) {
                    ArrayList<Class<?>> arrayList3 = this.f7272V;
                    if (arrayList3 != null) {
                        int size = arrayList3.size();
                        int i = 0;
                        while (i < size) {
                            if (!((Class) this.f7272V.get(i)).isInstance(view)) {
                                i++;
                            } else {
                                return;
                            }
                        }
                    }
                    if (view.getParent() instanceof ViewGroup) {
                        C1922m0 m0Var = new C1922m0(view);
                        if (z) {
                            mo8263c(m0Var);
                        } else {
                            mo8261a(m0Var);
                        }
                        m0Var.f7405c.add(this);
                        mo8348b(m0Var);
                        if (z) {
                            m9929a(this.f7278a0, view, m0Var);
                        } else {
                            m9929a(this.f7280b0, view, m0Var);
                        }
                    }
                    if (view instanceof ViewGroup) {
                        ArrayList<Integer> arrayList4 = this.f7274X;
                        if (arrayList4 == null || !arrayList4.contains(Integer.valueOf(id))) {
                            ArrayList<View> arrayList5 = this.f7275Y;
                            if (arrayList5 == null || !arrayList5.contains(view)) {
                                ArrayList<Class<?>> arrayList6 = this.f7276Z;
                                if (arrayList6 != null) {
                                    int size2 = arrayList6.size();
                                    int i2 = 0;
                                    while (i2 < size2) {
                                        if (!((Class) this.f7276Z.get(i2)).isInstance(view)) {
                                            i2++;
                                        } else {
                                            return;
                                        }
                                    }
                                }
                                ViewGroup viewGroup = (ViewGroup) view;
                                for (int i3 = 0; i3 < viewGroup.getChildCount(); i3++) {
                                    m9936e(viewGroup.getChildAt(i3), z);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    /* renamed from: r */
    private static C0635a<Animator, C1884d> mo8273r() {
        C0635a<Animator, C1884d> aVar = (C0635a) f7255G0.get();
        if (aVar != null) {
            return aVar;
        }
        C0635a<Animator, C1884d> aVar2 = new C0635a<>();
        f7255G0.set(aVar2);
        return aVar2;
    }

    @C0195i0
    /* renamed from: a */
    public Animator mo8270a(@C0193h0 ViewGroup viewGroup, @C0195i0 C1922m0 m0Var, @C0195i0 C1922m0 m0Var2) {
        return null;
    }

    @C0193h0
    /* renamed from: a */
    public C1880f0 mo8320a(long j) {
        this.f7264N = j;
        return this;
    }

    /* renamed from: a */
    public abstract void mo8261a(@C0193h0 C1922m0 m0Var);

    @C0193h0
    /* renamed from: b */
    public C1880f0 mo8340b(long j) {
        this.f7279b = j;
        return this;
    }

    /* renamed from: c */
    public long mo8351c() {
        return this.f7264N;
    }

    /* renamed from: c */
    public abstract void mo8263c(@C0193h0 C1922m0 m0Var);

    /* access modifiers changed from: protected */
    @C0207n0({C0208a.LIBRARY_GROUP_PREFIX})
    public void cancel() {
        for (int size = this.f7287i0.size() - 1; size >= 0; size--) {
            ((Animator) this.f7287i0.get(size)).cancel();
        }
        ArrayList<C1888h> arrayList = this.f7291m0;
        if (arrayList != null && arrayList.size() > 0) {
            ArrayList arrayList2 = (ArrayList) this.f7291m0.clone();
            int size2 = arrayList2.size();
            for (int i = 0; i < size2; i++) {
                ((C1888h) arrayList2.get(i)).mo8303d(this);
            }
        }
    }

    @C0195i0
    /* renamed from: f */
    public TimeInterpolator mo8363f() {
        return this.f7265O;
    }

    @C0193h0
    /* renamed from: g */
    public String mo8364g() {
        return this.f7277a;
    }

    @C0193h0
    /* renamed from: h */
    public C1950w mo8365h() {
        return this.f7296r0;
    }

    @C0195i0
    /* renamed from: i */
    public C1911j0 mo8366i() {
        return this.f7293o0;
    }

    /* renamed from: j */
    public long mo8367j() {
        return this.f7279b;
    }

    @C0193h0
    /* renamed from: k */
    public List<Integer> mo8368k() {
        return this.f7266P;
    }

    @C0195i0
    /* renamed from: l */
    public List<String> mo8369l() {
        return this.f7268R;
    }

    @C0195i0
    /* renamed from: m */
    public List<Class<?>> mo8370m() {
        return this.f7269S;
    }

    @C0193h0
    /* renamed from: n */
    public List<View> mo8371n() {
        return this.f7267Q;
    }

    @C0195i0
    /* renamed from: o */
    public String[] mo8272o() {
        return null;
    }

    /* access modifiers changed from: protected */
    @C0207n0({C0208a.LIBRARY_GROUP_PREFIX})
    /* renamed from: p */
    public void mo8372p() {
        mo8373q();
        C0635a r = mo8273r();
        Iterator it = this.f7292n0.iterator();
        while (it.hasNext()) {
            Animator animator = (Animator) it.next();
            if (r.containsKey(animator)) {
                mo8373q();
                m9924a(animator, r);
            }
        }
        this.f7292n0.clear();
        mo8346b();
    }

    /* access modifiers changed from: protected */
    @C0207n0({C0208a.LIBRARY_GROUP_PREFIX})
    /* renamed from: q */
    public void mo8373q() {
        if (this.f7288j0 == 0) {
            ArrayList<C1888h> arrayList = this.f7291m0;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.f7291m0.clone();
                int size = arrayList2.size();
                for (int i = 0; i < size; i++) {
                    ((C1888h) arrayList2.get(i)).mo8312a(this);
                }
            }
            this.f7290l0 = false;
        }
        this.f7288j0++;
    }

    public String toString() {
        return mo8354c("");
    }

    /* renamed from: b */
    private void m9933b(C0635a<View, C1922m0> aVar, C0635a<View, C1922m0> aVar2) {
        for (int size = aVar.size() - 1; size >= 0; size--) {
            View view = (View) aVar.mo3361b(size);
            if (view != null && mo8350b(view)) {
                C1922m0 m0Var = (C1922m0) aVar2.remove(view);
                if (m0Var != null && mo8350b(m0Var.f7404b)) {
                    this.f7283e0.add((C1922m0) aVar.mo3363c(size));
                    this.f7284f0.add(m0Var);
                }
            }
        }
    }

    @C0193h0
    /* renamed from: a */
    public C1880f0 mo8321a(@C0195i0 TimeInterpolator timeInterpolator) {
        this.f7265O = timeInterpolator;
        return this;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public C1922m0 mo8353c(View view, boolean z) {
        C1913k0 k0Var = this.f7281c0;
        if (k0Var != null) {
            return k0Var.mo8353c(view, z);
        }
        ArrayList<C1922m0> arrayList = z ? this.f7283e0 : this.f7284f0;
        C1922m0 m0Var = null;
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i = -1;
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                break;
            }
            C1922m0 m0Var2 = (C1922m0) arrayList.get(i2);
            if (m0Var2 == null) {
                return null;
            }
            if (m0Var2.f7404b == view) {
                i = i2;
                break;
            }
            i2++;
        }
        if (i >= 0) {
            m0Var = (C1922m0) (z ? this.f7284f0 : this.f7283e0).get(i);
        }
        return m0Var;
    }

    public C1880f0 clone() {
        try {
            C1880f0 f0Var = (C1880f0) super.clone();
            f0Var.f7292n0 = new ArrayList<>();
            f0Var.f7278a0 = new C1928n0();
            f0Var.f7280b0 = new C1928n0();
            f0Var.f7283e0 = null;
            f0Var.f7284f0 = null;
            return f0Var;
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    /* renamed from: a */
    public void mo8337a(int... iArr) {
        if (iArr == null || iArr.length == 0) {
            this.f7282d0 = f7253E0;
            return;
        }
        int i = 0;
        while (i < iArr.length) {
            if (!mo8310c(iArr[i])) {
                throw new IllegalArgumentException("matches contains invalid value");
            } else if (!m9932a(iArr, i)) {
                i++;
            } else {
                throw new IllegalArgumentException("matches contains a duplicate value");
            }
        }
        this.f7282d0 = (int[]) iArr.clone();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public boolean mo8350b(View view) {
        int id = view.getId();
        ArrayList<Integer> arrayList = this.f7270T;
        if (arrayList != null && arrayList.contains(Integer.valueOf(id))) {
            return false;
        }
        ArrayList<View> arrayList2 = this.f7271U;
        if (arrayList2 != null && arrayList2.contains(view)) {
            return false;
        }
        ArrayList<Class<?>> arrayList3 = this.f7272V;
        if (arrayList3 != null) {
            int size = arrayList3.size();
            for (int i = 0; i < size; i++) {
                if (((Class) this.f7272V.get(i)).isInstance(view)) {
                    return false;
                }
            }
        }
        if (this.f7273W != null && C0962e0.m5415S(view) != null && this.f7273W.contains(C0962e0.m5415S(view))) {
            return false;
        }
        if (this.f7266P.size() == 0 && this.f7267Q.size() == 0) {
            ArrayList<Class<?>> arrayList4 = this.f7269S;
            if (arrayList4 == null || arrayList4.isEmpty()) {
                ArrayList<String> arrayList5 = this.f7268R;
                if (arrayList5 == null || arrayList5.isEmpty()) {
                    return true;
                }
            }
        }
        if (this.f7266P.contains(Integer.valueOf(id)) || this.f7267Q.contains(view)) {
            return true;
        }
        ArrayList<String> arrayList6 = this.f7268R;
        if (arrayList6 != null && arrayList6.contains(C0962e0.m5415S(view))) {
            return true;
        }
        if (this.f7269S != null) {
            for (int i2 = 0; i2 < this.f7269S.size(); i2++) {
                if (((Class) this.f7269S.get(i2)).isInstance(view)) {
                    return true;
                }
            }
        }
        return false;
    }

    @C0207n0({C0208a.LIBRARY_GROUP_PREFIX})
    /* renamed from: c */
    public void mo8355c(View view) {
        if (!this.f7290l0) {
            C0635a r = mo8273r();
            int size = r.size();
            C1909i1 d = C1953x0.m10270d(view);
            for (int i = size - 1; i >= 0; i--) {
                C1884d dVar = (C1884d) r.mo3367d(i);
                if (dVar.f7300a != null && d.equals(dVar.f7303d)) {
                    C1826a.m9800a((Animator) r.mo3361b(i));
                }
            }
            ArrayList<C1888h> arrayList = this.f7291m0;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.f7291m0.clone();
                int size2 = arrayList2.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    ((C1888h) arrayList2.get(i2)).mo8301b(this);
                }
            }
            this.f7289k0 = true;
        }
    }

    /* renamed from: a */
    private static boolean m9932a(int[] iArr, int i) {
        int i2 = iArr[i];
        for (int i3 = 0; i3 < i; i3++) {
            if (iArr[i3] == i2) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    private void m9928a(C0635a<View, C1922m0> aVar, C0635a<View, C1922m0> aVar2, C0642f<View> fVar, C0642f<View> fVar2) {
        int d = fVar.mo3287d();
        for (int i = 0; i < d; i++) {
            View view = (View) fVar.mo3282c(i);
            if (view != null && mo8350b(view)) {
                View view2 = (View) fVar2.mo3283c(fVar.mo3270a(i));
                if (view2 != null && mo8350b(view2)) {
                    C1922m0 m0Var = (C1922m0) aVar.get(view);
                    C1922m0 m0Var2 = (C1922m0) aVar2.get(view2);
                    if (!(m0Var == null || m0Var2 == null)) {
                        this.f7283e0.add(m0Var);
                        this.f7284f0.add(m0Var2);
                        aVar.remove(view);
                        aVar2.remove(view2);
                    }
                }
            }
        }
    }

    @C0193h0
    /* renamed from: d */
    public C1880f0 mo8359d(@C0193h0 View view) {
        this.f7267Q.remove(view);
        return this;
    }

    @C0195i0
    /* renamed from: d */
    public C1922m0 mo8360d(@C0193h0 View view, boolean z) {
        C1913k0 k0Var = this.f7281c0;
        if (k0Var != null) {
            return k0Var.mo8360d(view, z);
        }
        return (C1922m0) (z ? this.f7278a0 : this.f7280b0).f7420a.get(view);
    }

    @C0195i0
    /* renamed from: d */
    public Rect mo8358d() {
        C1886f fVar = this.f7294p0;
        if (fVar == null) {
            return null;
        }
        return fVar.mo8378a(this);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public C1880f0 mo8352c(ViewGroup viewGroup) {
        this.f7285g0 = viewGroup;
        return this;
    }

    @C0207n0({C0208a.LIBRARY_GROUP_PREFIX})
    /* renamed from: e */
    public void mo8362e(View view) {
        if (this.f7289k0) {
            if (!this.f7290l0) {
                C0635a r = mo8273r();
                int size = r.size();
                C1909i1 d = C1953x0.m10270d(view);
                for (int i = size - 1; i >= 0; i--) {
                    C1884d dVar = (C1884d) r.mo3367d(i);
                    if (dVar.f7300a != null && d.equals(dVar.f7303d)) {
                        C1826a.m9802b((Animator) r.mo3361b(i));
                    }
                }
                ArrayList<C1888h> arrayList = this.f7291m0;
                if (arrayList != null && arrayList.size() > 0) {
                    ArrayList arrayList2 = (ArrayList) this.f7291m0.clone();
                    int size2 = arrayList2.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        ((C1888h) arrayList2.get(i2)).mo8304e(this);
                    }
                }
            }
            this.f7289k0 = false;
        }
    }

    /* renamed from: a */
    private void m9926a(C0635a<View, C1922m0> aVar, C0635a<View, C1922m0> aVar2, SparseArray<View> sparseArray, SparseArray<View> sparseArray2) {
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            View view = (View) sparseArray.valueAt(i);
            if (view != null && mo8350b(view)) {
                View view2 = (View) sparseArray2.get(sparseArray.keyAt(i));
                if (view2 != null && mo8350b(view2)) {
                    C1922m0 m0Var = (C1922m0) aVar.get(view);
                    C1922m0 m0Var2 = (C1922m0) aVar2.get(view2);
                    if (!(m0Var == null || m0Var2 == null)) {
                        this.f7283e0.add(m0Var);
                        this.f7284f0.add(m0Var2);
                        aVar.remove(view);
                        aVar2.remove(view2);
                    }
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public String mo8354c(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(getClass().getSimpleName());
        sb.append("@");
        sb.append(Integer.toHexString(hashCode()));
        sb.append(": ");
        String sb2 = sb.toString();
        String str2 = ") ";
        if (this.f7264N != -1) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(sb2);
            sb3.append("dur(");
            sb3.append(this.f7264N);
            sb3.append(str2);
            sb2 = sb3.toString();
        }
        if (this.f7279b != -1) {
            StringBuilder sb4 = new StringBuilder();
            sb4.append(sb2);
            sb4.append("dly(");
            sb4.append(this.f7279b);
            sb4.append(str2);
            sb2 = sb4.toString();
        }
        if (this.f7265O != null) {
            StringBuilder sb5 = new StringBuilder();
            sb5.append(sb2);
            sb5.append("interp(");
            sb5.append(this.f7265O);
            sb5.append(str2);
            sb2 = sb5.toString();
        }
        if (this.f7266P.size() <= 0 && this.f7267Q.size() <= 0) {
            return sb2;
        }
        StringBuilder sb6 = new StringBuilder();
        sb6.append(sb2);
        sb6.append("tgts(");
        String sb7 = sb6.toString();
        String str3 = ", ";
        if (this.f7266P.size() > 0) {
            String str4 = sb7;
            for (int i = 0; i < this.f7266P.size(); i++) {
                if (i > 0) {
                    StringBuilder sb8 = new StringBuilder();
                    sb8.append(str4);
                    sb8.append(str3);
                    str4 = sb8.toString();
                }
                StringBuilder sb9 = new StringBuilder();
                sb9.append(str4);
                sb9.append(this.f7266P.get(i));
                str4 = sb9.toString();
            }
            sb7 = str4;
        }
        if (this.f7267Q.size() > 0) {
            for (int i2 = 0; i2 < this.f7267Q.size(); i2++) {
                if (i2 > 0) {
                    StringBuilder sb10 = new StringBuilder();
                    sb10.append(sb7);
                    sb10.append(str3);
                    sb7 = sb10.toString();
                }
                StringBuilder sb11 = new StringBuilder();
                sb11.append(sb7);
                sb11.append(this.f7267Q.get(i2));
                sb7 = sb11.toString();
            }
        }
        StringBuilder sb12 = new StringBuilder();
        sb12.append(sb7);
        sb12.append(")");
        return sb12.toString();
    }

    @C0193h0
    /* renamed from: b */
    public C1880f0 mo8338b(@C0225w int i) {
        if (i != 0) {
            this.f7266P.remove(Integer.valueOf(i));
        }
        return this;
    }

    @C0193h0
    /* renamed from: b */
    public C1880f0 mo8345b(@C0193h0 String str) {
        ArrayList<String> arrayList = this.f7268R;
        if (arrayList != null) {
            arrayList.remove(str);
        }
        return this;
    }

    @SuppressLint({"RestrictedApi"})
    public C1880f0(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1861e0.f7188c);
        XmlResourceParser xmlResourceParser = (XmlResourceParser) attributeSet;
        long b = (long) C0878h.m5077b(obtainStyledAttributes, xmlResourceParser, "duration", 1, -1);
        if (b >= 0) {
            mo8320a(b);
        }
        long b2 = (long) C0878h.m5077b(obtainStyledAttributes, xmlResourceParser, "startDelay", 2, -1);
        if (b2 > 0) {
            mo8340b(b2);
        }
        int c = C0878h.m5080c(obtainStyledAttributes, xmlResourceParser, "interpolator", 0, 0);
        if (c > 0) {
            mo8321a((TimeInterpolator) AnimationUtils.loadInterpolator(context, c));
        }
        String a = C0878h.m5072a(obtainStyledAttributes, (XmlPullParser) xmlResourceParser, "matchOrder", 3);
        if (a != null) {
            mo8337a(m9935d(a));
        }
        obtainStyledAttributes.recycle();
    }

    @C0193h0
    /* renamed from: b */
    public C1880f0 mo8343b(@C0193h0 Class<?> cls) {
        ArrayList<Class<?>> arrayList = this.f7269S;
        if (arrayList != null) {
            arrayList.remove(cls);
        }
        return this;
    }

    @C0193h0
    /* renamed from: b */
    public C1880f0 mo8341b(@C0193h0 View view, boolean z) {
        this.f7271U = m9921a(this.f7271U, view, z);
        return this;
    }

    @C0193h0
    /* renamed from: b */
    public C1880f0 mo8339b(@C0225w int i, boolean z) {
        this.f7270T = m9920a(this.f7270T, i, z);
        return this;
    }

    @C0193h0
    /* renamed from: b */
    public C1880f0 mo8344b(@C0193h0 Class<?> cls, boolean z) {
        this.f7272V = m9922a(this.f7272V, cls, z);
        return this;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo8347b(ViewGroup viewGroup) {
        this.f7283e0 = new ArrayList<>();
        this.f7284f0 = new ArrayList<>();
        m9930a(this.f7278a0, this.f7280b0);
        C0635a r = mo8273r();
        int size = r.size();
        C1909i1 d = C1953x0.m10270d(viewGroup);
        for (int i = size - 1; i >= 0; i--) {
            Animator animator = (Animator) r.mo3361b(i);
            if (animator != null) {
                C1884d dVar = (C1884d) r.get(animator);
                if (!(dVar == null || dVar.f7300a == null || !d.equals(dVar.f7303d))) {
                    C1922m0 m0Var = dVar.f7302c;
                    View view = dVar.f7300a;
                    C1922m0 d2 = mo8360d(view, true);
                    C1922m0 c = mo8353c(view, true);
                    if (d2 == null && c == null) {
                        c = (C1922m0) this.f7280b0.f7420a.get(view);
                    }
                    if (!(d2 == null && c == null) && dVar.f7304e.mo8308a(m0Var, c)) {
                        if (animator.isRunning() || animator.isStarted()) {
                            animator.cancel();
                        } else {
                            r.remove(animator);
                        }
                    }
                }
            }
        }
        mo8331a(viewGroup, this.f7278a0, this.f7280b0, this.f7283e0, this.f7284f0);
        mo8372p();
    }

    /* renamed from: a */
    private void m9927a(C0635a<View, C1922m0> aVar, C0635a<View, C1922m0> aVar2, C0635a<String, View> aVar3, C0635a<String, View> aVar4) {
        int size = aVar3.size();
        for (int i = 0; i < size; i++) {
            View view = (View) aVar3.mo3367d(i);
            if (view != null && mo8350b(view)) {
                View view2 = (View) aVar4.get(aVar3.mo3361b(i));
                if (view2 != null && mo8350b(view2)) {
                    C1922m0 m0Var = (C1922m0) aVar.get(view);
                    C1922m0 m0Var2 = (C1922m0) aVar2.get(view2);
                    if (!(m0Var == null || m0Var2 == null)) {
                        this.f7283e0.add(m0Var);
                        this.f7284f0.add(m0Var2);
                        aVar.remove(view);
                        aVar2.remove(view2);
                    }
                }
            }
        }
    }

    @C0195i0
    /* renamed from: e */
    public C1886f mo8361e() {
        return this.f7294p0;
    }

    /* renamed from: a */
    private void m9925a(C0635a<View, C1922m0> aVar, C0635a<View, C1922m0> aVar2) {
        for (int i = 0; i < aVar.size(); i++) {
            C1922m0 m0Var = (C1922m0) aVar.mo3367d(i);
            if (mo8350b(m0Var.f7404b)) {
                this.f7283e0.add(m0Var);
                this.f7284f0.add(null);
            }
        }
        for (int i2 = 0; i2 < aVar2.size(); i2++) {
            C1922m0 m0Var2 = (C1922m0) aVar2.mo3367d(i2);
            if (mo8350b(m0Var2.f7404b)) {
                this.f7284f0.add(m0Var2);
                this.f7283e0.add(null);
            }
        }
    }

    /* renamed from: a */
    private void m9930a(C1928n0 n0Var, C1928n0 n0Var2) {
        C0635a aVar = new C0635a((C0649h) n0Var.f7420a);
        C0635a aVar2 = new C0635a((C0649h) n0Var2.f7420a);
        int i = 0;
        while (true) {
            int[] iArr = this.f7282d0;
            if (i < iArr.length) {
                int i2 = iArr[i];
                if (i2 == 1) {
                    m9933b(aVar, aVar2);
                } else if (i2 == 2) {
                    m9927a(aVar, aVar2, n0Var.f7423d, n0Var2.f7423d);
                } else if (i2 == 3) {
                    m9926a(aVar, aVar2, n0Var.f7421b, n0Var2.f7421b);
                } else if (i2 == 4) {
                    m9928a(aVar, aVar2, n0Var.f7422c, n0Var2.f7422c);
                }
                i++;
            } else {
                m9925a(aVar, aVar2);
                return;
            }
        }
    }

    /* access modifiers changed from: protected */
    @C0207n0({C0208a.LIBRARY_GROUP_PREFIX})
    /* renamed from: b */
    public void mo8346b() {
        this.f7288j0--;
        if (this.f7288j0 == 0) {
            ArrayList<C1888h> arrayList = this.f7291m0;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.f7291m0.clone();
                int size = arrayList2.size();
                for (int i = 0; i < size; i++) {
                    ((C1888h) arrayList2.get(i)).mo8302c(this);
                }
            }
            for (int i2 = 0; i2 < this.f7278a0.f7422c.mo3287d(); i2++) {
                View view = (View) this.f7278a0.f7422c.mo3282c(i2);
                if (view != null) {
                    C0962e0.m5497e(view, false);
                }
            }
            for (int i3 = 0; i3 < this.f7280b0.f7422c.mo3287d(); i3++) {
                View view2 = (View) this.f7280b0.f7422c.mo3282c(i3);
                if (view2 != null) {
                    C0962e0.m5497e(view2, false);
                }
            }
            this.f7290l0 = true;
        }
    }

    /* access modifiers changed from: protected */
    @C0207n0({C0208a.LIBRARY_GROUP_PREFIX})
    /* renamed from: a */
    public void mo8331a(ViewGroup viewGroup, C1928n0 n0Var, C1928n0 n0Var2, ArrayList<C1922m0> arrayList, ArrayList<C1922m0> arrayList2) {
        int i;
        int i2;
        View view;
        Animator animator;
        C1922m0 m0Var;
        C1922m0 m0Var2;
        Animator animator2;
        ViewGroup viewGroup2 = viewGroup;
        C0635a r = mo8273r();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        long j = Long.MAX_VALUE;
        int i3 = 0;
        while (i3 < size) {
            C1922m0 m0Var3 = (C1922m0) arrayList.get(i3);
            C1922m0 m0Var4 = (C1922m0) arrayList2.get(i3);
            if (m0Var3 != null && !m0Var3.f7405c.contains(this)) {
                m0Var3 = null;
            }
            if (m0Var4 != null && !m0Var4.f7405c.contains(this)) {
                m0Var4 = null;
            }
            if (!(m0Var3 == null && m0Var4 == null)) {
                if (m0Var3 == null || m0Var4 == null || mo8308a(m0Var3, m0Var4)) {
                    Animator a = mo8270a(viewGroup2, m0Var3, m0Var4);
                    if (a != null) {
                        if (m0Var4 != null) {
                            view = m0Var4.f7404b;
                            String[] o = mo8272o();
                            if (o != null && o.length > 0) {
                                m0Var2 = new C1922m0(view);
                                Animator animator3 = a;
                                i2 = size;
                                C1922m0 m0Var5 = (C1922m0) n0Var2.f7420a.get(view);
                                if (m0Var5 != null) {
                                    int i4 = 0;
                                    while (i4 < o.length) {
                                        int i5 = i3;
                                        C1922m0 m0Var6 = m0Var5;
                                        m0Var2.f7403a.put(o[i4], m0Var5.f7403a.get(o[i4]));
                                        i4++;
                                        ArrayList<C1922m0> arrayList3 = arrayList2;
                                        i3 = i5;
                                        m0Var5 = m0Var6;
                                    }
                                }
                                i = i3;
                                int size2 = r.size();
                                int i6 = 0;
                                while (true) {
                                    if (i6 >= size2) {
                                        animator2 = animator3;
                                        break;
                                    }
                                    C1884d dVar = (C1884d) r.get((Animator) r.mo3361b(i6));
                                    if (dVar.f7302c != null && dVar.f7300a == view && dVar.f7301b.equals(mo8364g()) && dVar.f7302c.equals(m0Var2)) {
                                        animator2 = null;
                                        break;
                                    }
                                    i6++;
                                }
                            } else {
                                i2 = size;
                                i = i3;
                                animator2 = a;
                                m0Var2 = null;
                            }
                            animator = animator2;
                            m0Var = m0Var2;
                        } else {
                            Animator animator4 = a;
                            i2 = size;
                            i = i3;
                            view = m0Var3.f7404b;
                            animator = animator4;
                            m0Var = null;
                        }
                        if (animator != null) {
                            C1911j0 j0Var = this.f7293o0;
                            if (j0Var != null) {
                                long a2 = j0Var.mo8252a(viewGroup2, this, m0Var3, m0Var4);
                                sparseIntArray.put(this.f7292n0.size(), (int) a2);
                                j = Math.min(a2, j);
                            }
                            long j2 = j;
                            C1884d dVar2 = new C1884d(view, mo8364g(), this, C1953x0.m10270d(viewGroup), m0Var);
                            r.put(animator, dVar2);
                            this.f7292n0.add(animator);
                            j = j2;
                        }
                        i3 = i + 1;
                        size = i2;
                    }
                }
            }
            i2 = size;
            i = i3;
            i3 = i + 1;
            size = i2;
        }
        if (sparseIntArray.size() != 0) {
            for (int i7 = 0; i7 < sparseIntArray.size(); i7++) {
                Animator animator5 = (Animator) this.f7292n0.get(sparseIntArray.keyAt(i7));
                animator5.setStartDelay((((long) sparseIntArray.valueAt(i7)) - j) + animator5.getStartDelay());
            }
        }
    }

    @C0193h0
    /* renamed from: b */
    public C1880f0 mo8342b(@C0193h0 C1888h hVar) {
        ArrayList<C1888h> arrayList = this.f7291m0;
        if (arrayList == null) {
            return this;
        }
        arrayList.remove(hVar);
        if (this.f7291m0.size() == 0) {
            this.f7291m0 = null;
        }
        return this;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo8348b(C1922m0 m0Var) {
        if (this.f7293o0 != null && !m0Var.f7403a.isEmpty()) {
            String[] a = this.f7293o0.mo8380a();
            if (a != null) {
                boolean z = false;
                int i = 0;
                while (true) {
                    if (i >= a.length) {
                        z = true;
                        break;
                    } else if (!m0Var.f7403a.containsKey(a[i])) {
                        break;
                    } else {
                        i++;
                    }
                }
                if (!z) {
                    this.f7293o0.mo8379a(m0Var);
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo8349b(boolean z) {
        this.f7286h0 = z;
    }

    /* renamed from: a */
    private void m9924a(Animator animator, C0635a<Animator, C1884d> aVar) {
        if (animator != null) {
            animator.addListener(new C1882b(aVar));
            mo8329a(animator);
        }
    }

    @C0193h0
    /* renamed from: a */
    public C1880f0 mo8322a(@C0193h0 View view) {
        this.f7267Q.add(view);
        return this;
    }

    @C0193h0
    /* renamed from: a */
    public C1880f0 mo8318a(@C0225w int i) {
        if (i != 0) {
            this.f7266P.add(Integer.valueOf(i));
        }
        return this;
    }

    @C0193h0
    /* renamed from: a */
    public C1880f0 mo8327a(@C0193h0 String str) {
        if (this.f7268R == null) {
            this.f7268R = new ArrayList<>();
        }
        this.f7268R.add(str);
        return this;
    }

    @C0193h0
    /* renamed from: a */
    public C1880f0 mo8325a(@C0193h0 Class<?> cls) {
        if (this.f7269S == null) {
            this.f7269S = new ArrayList<>();
        }
        this.f7269S.add(cls);
        return this;
    }

    /* renamed from: a */
    private static <T> ArrayList<T> m9923a(ArrayList<T> arrayList, T t, boolean z) {
        if (t == null) {
            return arrayList;
        }
        if (z) {
            return C1885e.m9998a(arrayList, t);
        }
        return C1885e.m9999b(arrayList, t);
    }

    @C0193h0
    /* renamed from: a */
    public C1880f0 mo8328a(@C0193h0 String str, boolean z) {
        this.f7273W = m9923a(this.f7273W, (T) str, z);
        return this;
    }

    @C0193h0
    /* renamed from: a */
    public C1880f0 mo8323a(@C0193h0 View view, boolean z) {
        this.f7275Y = m9921a(this.f7275Y, view, z);
        return this;
    }

    @C0193h0
    /* renamed from: a */
    public C1880f0 mo8319a(@C0225w int i, boolean z) {
        this.f7274X = m9920a(this.f7274X, i, z);
        return this;
    }

    /* renamed from: a */
    private ArrayList<Integer> m9920a(ArrayList<Integer> arrayList, int i, boolean z) {
        if (i <= 0) {
            return arrayList;
        }
        if (z) {
            return C1885e.m9998a(arrayList, Integer.valueOf(i));
        }
        return C1885e.m9999b(arrayList, Integer.valueOf(i));
    }

    /* renamed from: a */
    private ArrayList<View> m9921a(ArrayList<View> arrayList, View view, boolean z) {
        if (view == null) {
            return arrayList;
        }
        if (z) {
            return C1885e.m9998a(arrayList, view);
        }
        return C1885e.m9999b(arrayList, view);
    }

    @C0193h0
    /* renamed from: a */
    public C1880f0 mo8326a(@C0193h0 Class<?> cls, boolean z) {
        this.f7276Z = m9922a(this.f7276Z, cls, z);
        return this;
    }

    /* renamed from: a */
    private ArrayList<Class<?>> m9922a(ArrayList<Class<?>> arrayList, Class<?> cls, boolean z) {
        if (cls == null) {
            return arrayList;
        }
        if (z) {
            return C1885e.m9998a(arrayList, cls);
        }
        return C1885e.m9999b(arrayList, cls);
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:61:? A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo8332a(android.view.ViewGroup r6, boolean r7) {
        /*
            r5 = this;
            r5.mo8336a(r7)
            java.util.ArrayList<java.lang.Integer> r0 = r5.f7266P
            int r0 = r0.size()
            r1 = 0
            if (r0 > 0) goto L_0x0014
            java.util.ArrayList<android.view.View> r0 = r5.f7267Q
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x0029
        L_0x0014:
            java.util.ArrayList<java.lang.String> r0 = r5.f7268R
            if (r0 == 0) goto L_0x001e
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0029
        L_0x001e:
            java.util.ArrayList<java.lang.Class<?>> r0 = r5.f7269S
            if (r0 == 0) goto L_0x002e
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0029
            goto L_0x002e
        L_0x0029:
            r5.m9936e(r6, r7)
            goto L_0x00a6
        L_0x002e:
            r0 = 0
        L_0x002f:
            java.util.ArrayList<java.lang.Integer> r2 = r5.f7266P
            int r2 = r2.size()
            if (r0 >= r2) goto L_0x006f
            java.util.ArrayList<java.lang.Integer> r2 = r5.f7266P
            java.lang.Object r2 = r2.get(r0)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            android.view.View r2 = r6.findViewById(r2)
            if (r2 == 0) goto L_0x006c
            androidx.transition.m0 r3 = new androidx.transition.m0
            r3.<init>(r2)
            if (r7 == 0) goto L_0x0054
            r5.mo8263c(r3)
            goto L_0x0057
        L_0x0054:
            r5.mo8261a(r3)
        L_0x0057:
            java.util.ArrayList<androidx.transition.f0> r4 = r3.f7405c
            r4.add(r5)
            r5.mo8348b(r3)
            if (r7 == 0) goto L_0x0067
            androidx.transition.n0 r4 = r5.f7278a0
            m9929a(r4, r2, r3)
            goto L_0x006c
        L_0x0067:
            androidx.transition.n0 r4 = r5.f7280b0
            m9929a(r4, r2, r3)
        L_0x006c:
            int r0 = r0 + 1
            goto L_0x002f
        L_0x006f:
            r6 = 0
        L_0x0070:
            java.util.ArrayList<android.view.View> r0 = r5.f7267Q
            int r0 = r0.size()
            if (r6 >= r0) goto L_0x00a6
            java.util.ArrayList<android.view.View> r0 = r5.f7267Q
            java.lang.Object r0 = r0.get(r6)
            android.view.View r0 = (android.view.View) r0
            androidx.transition.m0 r2 = new androidx.transition.m0
            r2.<init>(r0)
            if (r7 == 0) goto L_0x008b
            r5.mo8263c(r2)
            goto L_0x008e
        L_0x008b:
            r5.mo8261a(r2)
        L_0x008e:
            java.util.ArrayList<androidx.transition.f0> r3 = r2.f7405c
            r3.add(r5)
            r5.mo8348b(r2)
            if (r7 == 0) goto L_0x009e
            androidx.transition.n0 r3 = r5.f7278a0
            m9929a(r3, r0, r2)
            goto L_0x00a3
        L_0x009e:
            androidx.transition.n0 r3 = r5.f7280b0
            m9929a(r3, r0, r2)
        L_0x00a3:
            int r6 = r6 + 1
            goto L_0x0070
        L_0x00a6:
            if (r7 != 0) goto L_0x00ea
            androidx.collection.a<java.lang.String, java.lang.String> r6 = r5.f7295q0
            if (r6 == 0) goto L_0x00ea
            int r6 = r6.size()
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>(r6)
            r0 = 0
        L_0x00b6:
            if (r0 >= r6) goto L_0x00ce
            androidx.collection.a<java.lang.String, java.lang.String> r2 = r5.f7295q0
            java.lang.Object r2 = r2.mo3361b(r0)
            java.lang.String r2 = (java.lang.String) r2
            androidx.transition.n0 r3 = r5.f7278a0
            androidx.collection.a<java.lang.String, android.view.View> r3 = r3.f7423d
            java.lang.Object r2 = r3.remove(r2)
            r7.add(r2)
            int r0 = r0 + 1
            goto L_0x00b6
        L_0x00ce:
            if (r1 >= r6) goto L_0x00ea
            java.lang.Object r0 = r7.get(r1)
            android.view.View r0 = (android.view.View) r0
            if (r0 == 0) goto L_0x00e7
            androidx.collection.a<java.lang.String, java.lang.String> r2 = r5.f7295q0
            java.lang.Object r2 = r2.mo3367d(r1)
            java.lang.String r2 = (java.lang.String) r2
            androidx.transition.n0 r3 = r5.f7278a0
            androidx.collection.a<java.lang.String, android.view.View> r3 = r3.f7423d
            r3.put(r2, r0)
        L_0x00e7:
            int r1 = r1 + 1
            goto L_0x00ce
        L_0x00ea:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.transition.C1880f0.mo8332a(android.view.ViewGroup, boolean):void");
    }

    /* renamed from: a */
    private static void m9929a(C1928n0 n0Var, View view, C1922m0 m0Var) {
        n0Var.f7420a.put(view, m0Var);
        int id = view.getId();
        if (id >= 0) {
            if (n0Var.f7421b.indexOfKey(id) >= 0) {
                n0Var.f7421b.put(id, null);
            } else {
                n0Var.f7421b.put(id, view);
            }
        }
        String S = C0962e0.m5415S(view);
        if (S != null) {
            if (n0Var.f7423d.containsKey(S)) {
                n0Var.f7423d.put(S, null);
            } else {
                n0Var.f7423d.put(S, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                if (n0Var.f7422c.mo3288d(itemIdAtPosition) >= 0) {
                    View view2 = (View) n0Var.f7422c.mo3283c(itemIdAtPosition);
                    if (view2 != null) {
                        C0962e0.m5497e(view2, false);
                        n0Var.f7422c.mo3284c(itemIdAtPosition, null);
                        return;
                    }
                    return;
                }
                C0962e0.m5497e(view, true);
                n0Var.f7422c.mo3284c(itemIdAtPosition, view);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo8336a(boolean z) {
        if (z) {
            this.f7278a0.f7420a.clear();
            this.f7278a0.f7421b.clear();
            this.f7278a0.f7422c.mo3279b();
            return;
        }
        this.f7280b0.f7420a.clear();
        this.f7280b0.f7421b.clear();
        this.f7280b0.f7422c.mo3279b();
    }

    /* renamed from: a */
    public boolean mo8308a(@C0195i0 C1922m0 m0Var, @C0195i0 C1922m0 m0Var2) {
        if (m0Var == null || m0Var2 == null) {
            return false;
        }
        String[] o = mo8272o();
        if (o != null) {
            int length = o.length;
            int i = 0;
            while (i < length) {
                if (!m9931a(m0Var, m0Var2, o[i])) {
                    i++;
                }
            }
            return false;
        }
        for (String a : m0Var.f7403a.keySet()) {
            if (m9931a(m0Var, m0Var2, a)) {
            }
        }
        return false;
        return true;
    }

    /* renamed from: a */
    private static boolean m9931a(C1922m0 m0Var, C1922m0 m0Var2, String str) {
        Object obj = m0Var.f7403a.get(str);
        Object obj2 = m0Var2.f7403a.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj == null || obj2 == null) {
            return true;
        }
        return true ^ obj.equals(obj2);
    }

    /* access modifiers changed from: protected */
    @C0207n0({C0208a.LIBRARY_GROUP_PREFIX})
    /* renamed from: a */
    public void mo8329a(Animator animator) {
        if (animator == null) {
            mo8346b();
            return;
        }
        if (mo8351c() >= 0) {
            animator.setDuration(mo8351c());
        }
        if (mo8367j() >= 0) {
            animator.setStartDelay(mo8367j() + animator.getStartDelay());
        }
        if (mo8363f() != null) {
            animator.setInterpolator(mo8363f());
        }
        animator.addListener(new C1883c());
        animator.start();
    }

    /* access modifiers changed from: 0000 */
    @C0207n0({C0208a.LIBRARY_GROUP_PREFIX})
    /* renamed from: a */
    public void mo8330a(ViewGroup viewGroup) {
        C0635a r = mo8273r();
        int size = r.size();
        if (viewGroup != null && size != 0) {
            C1909i1 d = C1953x0.m10270d(viewGroup);
            C0635a aVar = new C0635a((C0649h) r);
            r.clear();
            for (int i = size - 1; i >= 0; i--) {
                C1884d dVar = (C1884d) aVar.mo3367d(i);
                if (!(dVar.f7300a == null || d == null || !d.equals(dVar.f7303d))) {
                    ((Animator) aVar.mo3361b(i)).end();
                }
            }
        }
    }

    @C0193h0
    /* renamed from: a */
    public C1880f0 mo8324a(@C0193h0 C1888h hVar) {
        if (this.f7291m0 == null) {
            this.f7291m0 = new ArrayList<>();
        }
        this.f7291m0.add(hVar);
        return this;
    }

    /* renamed from: a */
    public void mo8335a(@C0195i0 C1950w wVar) {
        if (wVar == null) {
            this.f7296r0 = f7254F0;
        } else {
            this.f7296r0 = wVar;
        }
    }

    /* renamed from: a */
    public void mo8333a(@C0195i0 C1886f fVar) {
        this.f7294p0 = fVar;
    }

    /* renamed from: a */
    public void mo8334a(@C0195i0 C1911j0 j0Var) {
        this.f7293o0 = j0Var;
    }
}
