package androidx.fragment.app;

import android.view.View;
import androidx.annotation.C0178a;
import androidx.annotation.C0180b;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import androidx.annotation.C0214q0;
import androidx.annotation.C0216r0;
import androidx.annotation.C0225w;
import androidx.core.p034l.C0962e0;
import androidx.lifecycle.Lifecycle.State;
import java.lang.reflect.Modifier;
import java.util.ArrayList;

/* renamed from: androidx.fragment.app.n */
/* compiled from: FragmentTransaction */
public abstract class C1406n {

    /* renamed from: A */
    static final int f5534A = 8;

    /* renamed from: B */
    static final int f5535B = 9;

    /* renamed from: C */
    static final int f5536C = 10;

    /* renamed from: D */
    public static final int f5537D = 4096;

    /* renamed from: E */
    public static final int f5538E = 8192;

    /* renamed from: F */
    public static final int f5539F = -1;

    /* renamed from: G */
    public static final int f5540G = 0;

    /* renamed from: H */
    public static final int f5541H = 4097;

    /* renamed from: I */
    public static final int f5542I = 8194;

    /* renamed from: J */
    public static final int f5543J = 4099;

    /* renamed from: s */
    static final int f5544s = 0;

    /* renamed from: t */
    static final int f5545t = 1;

    /* renamed from: u */
    static final int f5546u = 2;

    /* renamed from: v */
    static final int f5547v = 3;

    /* renamed from: w */
    static final int f5548w = 4;

    /* renamed from: x */
    static final int f5549x = 5;

    /* renamed from: y */
    static final int f5550y = 6;

    /* renamed from: z */
    static final int f5551z = 7;

    /* renamed from: a */
    ArrayList<C1407a> f5552a = new ArrayList<>();

    /* renamed from: b */
    int f5553b;

    /* renamed from: c */
    int f5554c;

    /* renamed from: d */
    int f5555d;

    /* renamed from: e */
    int f5556e;

    /* renamed from: f */
    int f5557f;

    /* renamed from: g */
    int f5558g;

    /* renamed from: h */
    boolean f5559h;

    /* renamed from: i */
    boolean f5560i = true;
    @C0195i0

    /* renamed from: j */
    String f5561j;

    /* renamed from: k */
    int f5562k;

    /* renamed from: l */
    CharSequence f5563l;

    /* renamed from: m */
    int f5564m;

    /* renamed from: n */
    CharSequence f5565n;

    /* renamed from: o */
    ArrayList<String> f5566o;

    /* renamed from: p */
    ArrayList<String> f5567p;

    /* renamed from: q */
    boolean f5568q = false;

    /* renamed from: r */
    ArrayList<Runnable> f5569r;

    /* renamed from: androidx.fragment.app.n$a */
    /* compiled from: FragmentTransaction */
    static final class C1407a {

        /* renamed from: a */
        int f5570a;

        /* renamed from: b */
        Fragment f5571b;

        /* renamed from: c */
        int f5572c;

        /* renamed from: d */
        int f5573d;

        /* renamed from: e */
        int f5574e;

        /* renamed from: f */
        int f5575f;

        /* renamed from: g */
        State f5576g;

        /* renamed from: h */
        State f5577h;

        C1407a() {
        }

        C1407a(int i, Fragment fragment) {
            this.f5570a = i;
            this.f5571b = fragment;
            State state = State.RESUMED;
            this.f5576g = state;
            this.f5577h = state;
        }

        C1407a(int i, @C0193h0 Fragment fragment, State state) {
            this.f5570a = i;
            this.f5571b = fragment;
            this.f5576g = fragment.mMaxState;
            this.f5577h = state;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo6403a(C1407a aVar) {
        this.f5552a.add(aVar);
        aVar.f5572c = this.f5553b;
        aVar.f5573d = this.f5554c;
        aVar.f5574e = this.f5555d;
        aVar.f5575f = this.f5556e;
    }

    @C0193h0
    /* renamed from: b */
    public C1406n mo6405b(@C0225w int i, @C0193h0 Fragment fragment) {
        return mo6406b(i, fragment, null);
    }

    @C0193h0
    /* renamed from: c */
    public C1406n mo6093c(@C0193h0 Fragment fragment) {
        mo6403a(new C1407a(4, fragment));
        return this;
    }

    @C0193h0
    /* renamed from: d */
    public C1406n mo6094d(@C0193h0 Fragment fragment) {
        mo6403a(new C1407a(3, fragment));
        return this;
    }

    /* renamed from: e */
    public abstract int mo6097e();

    @C0193h0
    /* renamed from: e */
    public C1406n mo6098e(@C0195i0 Fragment fragment) {
        mo6403a(new C1407a(8, fragment));
        return this;
    }

    /* renamed from: f */
    public abstract int mo6100f();

    @C0193h0
    /* renamed from: f */
    public C1406n mo6101f(@C0193h0 Fragment fragment) {
        mo6403a(new C1407a(5, fragment));
        return this;
    }

    /* renamed from: g */
    public abstract void mo6103g();

    /* renamed from: h */
    public abstract void mo6106h();

    @C0193h0
    /* renamed from: i */
    public C1406n mo6411i() {
        if (!this.f5559h) {
            this.f5560i = false;
            return this;
        }
        throw new IllegalStateException("This transaction is already being added to the back stack");
    }

    /* renamed from: j */
    public boolean mo6412j() {
        return this.f5560i;
    }

    /* renamed from: k */
    public boolean mo6107k() {
        return this.f5552a.isEmpty();
    }

    @C0193h0
    /* renamed from: b */
    public C1406n mo6406b(@C0225w int i, @C0193h0 Fragment fragment, @C0195i0 String str) {
        if (i != 0) {
            mo6082a(i, fragment, str, 2);
            return this;
        }
        throw new IllegalArgumentException("Must use non-zero containerViewId");
    }

    @C0193h0
    /* renamed from: c */
    public C1406n mo6409c(int i) {
        this.f5557f = i;
        return this;
    }

    @C0193h0
    /* renamed from: d */
    public C1406n mo6410d(@C0216r0 int i) {
        this.f5558g = i;
        return this;
    }

    @C0193h0
    /* renamed from: b */
    public C1406n mo6090b(@C0193h0 Fragment fragment) {
        mo6403a(new C1407a(6, fragment));
        return this;
    }

    @C0193h0
    /* renamed from: b */
    public C1406n mo6404b(@C0214q0 int i) {
        this.f5562k = i;
        this.f5563l = null;
        return this;
    }

    @C0193h0
    /* renamed from: a */
    public C1406n mo6398a(@C0193h0 Fragment fragment, @C0195i0 String str) {
        mo6082a(0, fragment, str, 1);
        return this;
    }

    @C0193h0
    /* renamed from: a */
    public C1406n mo6394a(@C0225w int i, @C0193h0 Fragment fragment) {
        mo6082a(i, fragment, (String) null, 1);
        return this;
    }

    @C0193h0
    /* renamed from: b */
    public C1406n mo6407b(@C0195i0 CharSequence charSequence) {
        this.f5562k = 0;
        this.f5563l = charSequence;
        return this;
    }

    @C0193h0
    /* renamed from: a */
    public C1406n mo6395a(@C0225w int i, @C0193h0 Fragment fragment, @C0195i0 String str) {
        mo6082a(i, fragment, str, 1);
        return this;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo6082a(int i, Fragment fragment, @C0195i0 String str, int i2) {
        Class cls = fragment.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !Modifier.isPublic(modifiers) || (cls.isMemberClass() && !Modifier.isStatic(modifiers))) {
            StringBuilder sb = new StringBuilder();
            sb.append("Fragment ");
            sb.append(cls.getCanonicalName());
            sb.append(" must be a public static class to be  properly recreated from instance state.");
            throw new IllegalStateException(sb.toString());
        }
        String str2 = " now ";
        String str3 = ": was ";
        if (str != null) {
            String str4 = fragment.mTag;
            if (str4 == null || str.equals(str4)) {
                fragment.mTag = str;
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Can't change tag of fragment ");
                sb2.append(fragment);
                sb2.append(str3);
                sb2.append(fragment.mTag);
                sb2.append(str2);
                sb2.append(str);
                throw new IllegalStateException(sb2.toString());
            }
        }
        if (i != 0) {
            if (i != -1) {
                int i3 = fragment.mFragmentId;
                if (i3 == 0 || i3 == i) {
                    fragment.mFragmentId = i;
                    fragment.mContainerId = i;
                } else {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("Can't change container ID of fragment ");
                    sb3.append(fragment);
                    sb3.append(str3);
                    sb3.append(fragment.mFragmentId);
                    sb3.append(str2);
                    sb3.append(i);
                    throw new IllegalStateException(sb3.toString());
                }
            } else {
                StringBuilder sb4 = new StringBuilder();
                sb4.append("Can't add fragment ");
                sb4.append(fragment);
                sb4.append(" with tag ");
                sb4.append(str);
                sb4.append(" to container view with no id");
                throw new IllegalArgumentException(sb4.toString());
            }
        }
        mo6403a(new C1407a(i2, fragment));
    }

    @C0193h0
    /* renamed from: b */
    public C1406n mo6408b(boolean z) {
        this.f5568q = z;
        return this;
    }

    @C0193h0
    /* renamed from: a */
    public C1406n mo6397a(@C0193h0 Fragment fragment) {
        mo6403a(new C1407a(7, fragment));
        return this;
    }

    @C0193h0
    /* renamed from: a */
    public C1406n mo6080a(@C0193h0 Fragment fragment, @C0193h0 State state) {
        mo6403a(new C1407a(10, fragment, state));
        return this;
    }

    @C0193h0
    /* renamed from: a */
    public C1406n mo6392a(@C0180b @C0178a int i, @C0180b @C0178a int i2) {
        return mo6393a(i, i2, 0, 0);
    }

    @C0193h0
    /* renamed from: a */
    public C1406n mo6393a(@C0180b @C0178a int i, @C0180b @C0178a int i2, @C0180b @C0178a int i3, @C0180b @C0178a int i4) {
        this.f5553b = i;
        this.f5554c = i2;
        this.f5555d = i3;
        this.f5556e = i4;
        return this;
    }

    @C0193h0
    /* renamed from: a */
    public C1406n mo6396a(@C0193h0 View view, @C0193h0 String str) {
        if (C1408o.m7572b()) {
            String S = C0962e0.m5415S(view);
            if (S != null) {
                if (this.f5566o == null) {
                    this.f5566o = new ArrayList<>();
                    this.f5567p = new ArrayList<>();
                } else {
                    String str2 = "' has already been added to the transaction.";
                    if (this.f5567p.contains(str)) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("A shared element with the target name '");
                        sb.append(str);
                        sb.append(str2);
                        throw new IllegalArgumentException(sb.toString());
                    } else if (this.f5566o.contains(S)) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("A shared element with the source name '");
                        sb2.append(S);
                        sb2.append(str2);
                        throw new IllegalArgumentException(sb2.toString());
                    }
                }
                this.f5566o.add(S);
                this.f5567p.add(str);
            } else {
                throw new IllegalArgumentException("Unique transitionNames are required for all sharedElements");
            }
        }
        return this;
    }

    @C0193h0
    /* renamed from: a */
    public C1406n mo6401a(@C0195i0 String str) {
        if (this.f5560i) {
            this.f5559h = true;
            this.f5561j = str;
            return this;
        }
        throw new IllegalStateException("This FragmentTransaction is not allowed to be added to the back stack.");
    }

    @C0193h0
    /* renamed from: a */
    public C1406n mo6391a(@C0214q0 int i) {
        this.f5564m = i;
        this.f5565n = null;
        return this;
    }

    @C0193h0
    /* renamed from: a */
    public C1406n mo6399a(@C0195i0 CharSequence charSequence) {
        this.f5564m = 0;
        this.f5565n = charSequence;
        return this;
    }

    @C0193h0
    @Deprecated
    /* renamed from: a */
    public C1406n mo6402a(boolean z) {
        return mo6408b(z);
    }

    @C0193h0
    /* renamed from: a */
    public C1406n mo6400a(@C0193h0 Runnable runnable) {
        mo6411i();
        if (this.f5569r == null) {
            this.f5569r = new ArrayList<>();
        }
        this.f5569r.add(runnable);
        return this;
    }
}
