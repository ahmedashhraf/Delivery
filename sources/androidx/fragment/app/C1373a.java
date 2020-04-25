package androidx.fragment.app;

import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import androidx.core.p033k.C0936d;
import androidx.fragment.app.C1382h.C1383a;
import androidx.lifecycle.Lifecycle.State;
import com.fasterxml.jackson.core.p162w.C3868i;
import java.io.PrintWriter;
import java.util.ArrayList;

/* renamed from: androidx.fragment.app.a */
/* compiled from: BackStackRecord */
final class C1373a extends C1406n implements C1383a, C1398k {

    /* renamed from: N */
    static final String f5409N = "FragmentManager";

    /* renamed from: K */
    final C1386i f5410K;

    /* renamed from: L */
    boolean f5411L;

    /* renamed from: M */
    int f5412M = -1;

    public C1373a(C1386i iVar) {
        this.f5410K = iVar;
    }

    /* renamed from: a */
    public void mo6084a(String str, PrintWriter printWriter) {
        mo6085a(str, printWriter, true);
    }

    /* renamed from: b */
    public int mo6088b() {
        return this.f5564m;
    }

    /* renamed from: c */
    public int mo6091c() {
        return this.f5562k;
    }

    @C0195i0
    /* renamed from: d */
    public CharSequence mo6095d() {
        if (this.f5564m != 0) {
            return this.f5410K.f5454c0.mo6218c().getText(this.f5564m);
        }
        return this.f5565n;
    }

    @C0193h0
    /* renamed from: e */
    public C1406n mo6098e(@C0195i0 Fragment fragment) {
        if (fragment != null) {
            C1386i iVar = fragment.mFragmentManager;
            if (!(iVar == null || iVar == this.f5410K)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Cannot setPrimaryNavigation for Fragment attached to a different FragmentManager. Fragment ");
                sb.append(fragment.toString());
                sb.append(" is already attached to a FragmentManager.");
                throw new IllegalStateException(sb.toString());
            }
        }
        return super.mo6098e(fragment);
    }

    @C0193h0
    /* renamed from: f */
    public C1406n mo6101f(@C0193h0 Fragment fragment) {
        C1386i iVar = fragment.mFragmentManager;
        if (iVar == null || iVar == this.f5410K) {
            return super.mo6101f(fragment);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Cannot show Fragment attached to a different FragmentManager. Fragment ");
        sb.append(fragment.toString());
        sb.append(" is already attached to a FragmentManager.");
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: g */
    public void mo6103g() {
        mo6411i();
        this.f5410K.mo6296b((C1398k) this, false);
    }

    public int getId() {
        return this.f5412M;
    }

    @C0195i0
    public String getName() {
        return this.f5561j;
    }

    /* renamed from: h */
    public void mo6106h() {
        mo6411i();
        this.f5410K.mo6296b((C1398k) this, true);
    }

    /* renamed from: k */
    public boolean mo6107k() {
        return this.f5552a.isEmpty();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: l */
    public void mo6108l() {
        int size = this.f5552a.size();
        for (int i = 0; i < size; i++) {
            C1407a aVar = (C1407a) this.f5552a.get(i);
            Fragment fragment = aVar.f5571b;
            if (fragment != null) {
                fragment.setNextTransition(this.f5557f, this.f5558g);
            }
            switch (aVar.f5570a) {
                case 1:
                    fragment.setNextAnim(aVar.f5572c);
                    this.f5410K.mo6282a(fragment, false);
                    break;
                case 3:
                    fragment.setNextAnim(aVar.f5573d);
                    this.f5410K.mo6331p(fragment);
                    break;
                case 4:
                    fragment.setNextAnim(aVar.f5573d);
                    this.f5410K.mo6317i(fragment);
                    break;
                case 5:
                    fragment.setNextAnim(aVar.f5572c);
                    this.f5410K.mo6342u(fragment);
                    break;
                case 6:
                    fragment.setNextAnim(aVar.f5573d);
                    this.f5410K.mo6309e(fragment);
                    break;
                case 7:
                    fragment.setNextAnim(aVar.f5572c);
                    this.f5410K.mo6301c(fragment);
                    break;
                case 8:
                    this.f5410K.mo6339t(fragment);
                    break;
                case 9:
                    this.f5410K.mo6339t(null);
                    break;
                case 10:
                    this.f5410K.mo6281a(fragment, aVar.f5577h);
                    break;
                default:
                    StringBuilder sb = new StringBuilder();
                    sb.append("Unknown cmd: ");
                    sb.append(aVar.f5570a);
                    throw new IllegalArgumentException(sb.toString());
            }
            if (!(this.f5568q || aVar.f5570a == 1 || fragment == null)) {
                this.f5410K.mo6323m(fragment);
            }
        }
        if (!this.f5568q) {
            C1386i iVar = this.f5410K;
            iVar.mo6272a(iVar.f5453b0, true);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: m */
    public boolean mo6109m() {
        for (int i = 0; i < this.f5552a.size(); i++) {
            if (m7168b((C1407a) this.f5552a.get(i))) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: n */
    public void mo6110n() {
        if (this.f5569r != null) {
            for (int i = 0; i < this.f5569r.size(); i++) {
                ((Runnable) this.f5569r.get(i)).run();
            }
            this.f5569r = null;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.f5412M >= 0) {
            sb.append(" #");
            sb.append(this.f5412M);
        }
        if (this.f5561j != null) {
            sb.append(C3868i.f12248b);
            sb.append(this.f5561j);
        }
        sb.append("}");
        return sb.toString();
    }

    /* renamed from: a */
    public void mo6085a(String str, PrintWriter printWriter, boolean z) {
        String str2;
        if (z) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.f5561j);
            printWriter.print(" mIndex=");
            printWriter.print(this.f5412M);
            printWriter.print(" mCommitted=");
            printWriter.println(this.f5411L);
            if (this.f5557f != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f5557f));
                printWriter.print(" mTransitionStyle=#");
                printWriter.println(Integer.toHexString(this.f5558g));
            }
            if (!(this.f5553b == 0 && this.f5554c == 0)) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f5553b));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.f5554c));
            }
            if (!(this.f5555d == 0 && this.f5556e == 0)) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f5555d));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.f5556e));
            }
            if (!(this.f5562k == 0 && this.f5563l == null)) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.f5562k));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.f5563l);
            }
            if (!(this.f5564m == 0 && this.f5565n == null)) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.f5564m));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.f5565n);
            }
        }
        if (!this.f5552a.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Operations:");
            int size = this.f5552a.size();
            for (int i = 0; i < size; i++) {
                C1407a aVar = (C1407a) this.f5552a.get(i);
                switch (aVar.f5570a) {
                    case 0:
                        str2 = "NULL";
                        break;
                    case 1:
                        str2 = "ADD";
                        break;
                    case 2:
                        str2 = "REPLACE";
                        break;
                    case 3:
                        str2 = "REMOVE";
                        break;
                    case 4:
                        str2 = "HIDE";
                        break;
                    case 5:
                        str2 = "SHOW";
                        break;
                    case 6:
                        str2 = "DETACH";
                        break;
                    case 7:
                        str2 = "ATTACH";
                        break;
                    case 8:
                        str2 = "SET_PRIMARY_NAV";
                        break;
                    case 9:
                        str2 = "UNSET_PRIMARY_NAV";
                        break;
                    case 10:
                        str2 = "OP_SET_MAX_LIFECYCLE";
                        break;
                    default:
                        StringBuilder sb = new StringBuilder();
                        sb.append("cmd=");
                        sb.append(aVar.f5570a);
                        str2 = sb.toString();
                        break;
                }
                printWriter.print(str);
                printWriter.print("  Op #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.print(str2);
                printWriter.print(C3868i.f12248b);
                printWriter.println(aVar.f5571b);
                if (z) {
                    if (!(aVar.f5572c == 0 && aVar.f5573d == 0)) {
                        printWriter.print(str);
                        printWriter.print("enterAnim=#");
                        printWriter.print(Integer.toHexString(aVar.f5572c));
                        printWriter.print(" exitAnim=#");
                        printWriter.println(Integer.toHexString(aVar.f5573d));
                    }
                    if (aVar.f5574e != 0 || aVar.f5575f != 0) {
                        printWriter.print(str);
                        printWriter.print("popEnterAnim=#");
                        printWriter.print(Integer.toHexString(aVar.f5574e));
                        printWriter.print(" popExitAnim=#");
                        printWriter.println(Integer.toHexString(aVar.f5575f));
                    }
                }
            }
        }
    }

    @C0193h0
    /* renamed from: b */
    public C1406n mo6090b(@C0193h0 Fragment fragment) {
        C1386i iVar = fragment.mFragmentManager;
        if (iVar == null || iVar == this.f5410K) {
            return super.mo6090b(fragment);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Cannot detach Fragment attached to a different FragmentManager. Fragment ");
        sb.append(fragment.toString());
        sb.append(" is already attached to a FragmentManager.");
        throw new IllegalStateException(sb.toString());
    }

    @C0193h0
    /* renamed from: c */
    public C1406n mo6093c(@C0193h0 Fragment fragment) {
        C1386i iVar = fragment.mFragmentManager;
        if (iVar == null || iVar == this.f5410K) {
            return super.mo6093c(fragment);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Cannot hide Fragment attached to a different FragmentManager. Fragment ");
        sb.append(fragment.toString());
        sb.append(" is already attached to a FragmentManager.");
        throw new IllegalStateException(sb.toString());
    }

    @C0193h0
    /* renamed from: d */
    public C1406n mo6094d(@C0193h0 Fragment fragment) {
        C1386i iVar = fragment.mFragmentManager;
        if (iVar == null || iVar == this.f5410K) {
            return super.mo6094d(fragment);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Cannot remove Fragment attached to a different FragmentManager. Fragment ");
        sb.append(fragment.toString());
        sb.append(" is already attached to a FragmentManager.");
        throw new IllegalStateException(sb.toString());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public void mo6099e(int i) {
        if (this.f5559h) {
            if (C1386i.f5433t0) {
                StringBuilder sb = new StringBuilder();
                sb.append("Bump nesting in ");
                sb.append(this);
                sb.append(" by ");
                sb.append(i);
                sb.toString();
            }
            int size = this.f5552a.size();
            for (int i2 = 0; i2 < size; i2++) {
                C1407a aVar = (C1407a) this.f5552a.get(i2);
                Fragment fragment = aVar.f5571b;
                if (fragment != null) {
                    fragment.mBackStackNesting += i;
                    if (C1386i.f5433t0) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Bump nesting of ");
                        sb2.append(aVar.f5571b);
                        sb2.append(" to ");
                        sb2.append(aVar.f5571b.mBackStackNesting);
                        sb2.toString();
                    }
                }
            }
        }
    }

    /* renamed from: f */
    public int mo6100f() {
        return mo6092c(true);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public Fragment mo6089b(ArrayList<Fragment> arrayList, Fragment fragment) {
        for (int size = this.f5552a.size() - 1; size >= 0; size--) {
            C1407a aVar = (C1407a) this.f5552a.get(size);
            int i = aVar.f5570a;
            if (i != 1) {
                if (i != 3) {
                    switch (i) {
                        case 6:
                            break;
                        case 7:
                            break;
                        case 8:
                            fragment = null;
                            break;
                        case 9:
                            fragment = aVar.f5571b;
                            break;
                        case 10:
                            aVar.f5577h = aVar.f5576g;
                            break;
                    }
                }
                arrayList.add(aVar.f5571b);
            }
            arrayList.remove(aVar.f5571b);
        }
        return fragment;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public int mo6092c(boolean z) {
        if (!this.f5411L) {
            if (C1386i.f5433t0) {
                StringBuilder sb = new StringBuilder();
                sb.append("Commit: ");
                sb.append(this);
                sb.toString();
                PrintWriter printWriter = new PrintWriter(new C0936d(f5409N));
                mo6084a("  ", printWriter);
                printWriter.close();
            }
            this.f5411L = true;
            if (this.f5559h) {
                this.f5412M = this.f5410K.mo6290b(this);
            } else {
                this.f5412M = -1;
            }
            this.f5410K.mo6286a((C1398k) this, z);
            return this.f5412M;
        }
        throw new IllegalStateException("commit already called");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public boolean mo6102f(int i) {
        int size = this.f5552a.size();
        for (int i2 = 0; i2 < size; i2++) {
            Fragment fragment = ((C1407a) this.f5552a.get(i2)).f5571b;
            int i3 = fragment != null ? fragment.mContainerId : 0;
            if (i3 != 0 && i3 == i) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public void mo6096d(boolean z) {
        for (int size = this.f5552a.size() - 1; size >= 0; size--) {
            C1407a aVar = (C1407a) this.f5552a.get(size);
            Fragment fragment = aVar.f5571b;
            if (fragment != null) {
                fragment.setNextTransition(C1386i.m7351f(this.f5557f), this.f5558g);
            }
            switch (aVar.f5570a) {
                case 1:
                    fragment.setNextAnim(aVar.f5575f);
                    this.f5410K.mo6331p(fragment);
                    break;
                case 3:
                    fragment.setNextAnim(aVar.f5574e);
                    this.f5410K.mo6282a(fragment, false);
                    break;
                case 4:
                    fragment.setNextAnim(aVar.f5574e);
                    this.f5410K.mo6342u(fragment);
                    break;
                case 5:
                    fragment.setNextAnim(aVar.f5575f);
                    this.f5410K.mo6317i(fragment);
                    break;
                case 6:
                    fragment.setNextAnim(aVar.f5574e);
                    this.f5410K.mo6301c(fragment);
                    break;
                case 7:
                    fragment.setNextAnim(aVar.f5575f);
                    this.f5410K.mo6309e(fragment);
                    break;
                case 8:
                    this.f5410K.mo6339t(null);
                    break;
                case 9:
                    this.f5410K.mo6339t(fragment);
                    break;
                case 10:
                    this.f5410K.mo6281a(fragment, aVar.f5576g);
                    break;
                default:
                    StringBuilder sb = new StringBuilder();
                    sb.append("Unknown cmd: ");
                    sb.append(aVar.f5570a);
                    throw new IllegalArgumentException(sb.toString());
            }
            if (!(this.f5568q || aVar.f5570a == 3 || fragment == null)) {
                this.f5410K.mo6323m(fragment);
            }
        }
        if (!this.f5568q && z) {
            C1386i iVar = this.f5410K;
            iVar.mo6272a(iVar.f5453b0, true);
        }
    }

    /* renamed from: e */
    public int mo6097e() {
        return mo6092c(false);
    }

    /* renamed from: b */
    private static boolean m7168b(C1407a aVar) {
        Fragment fragment = aVar.f5571b;
        return fragment != null && fragment.mAdded && fragment.mView != null && !fragment.mDetached && !fragment.mHidden && fragment.isPostponed();
    }

    @C0195i0
    /* renamed from: a */
    public CharSequence mo6081a() {
        if (this.f5562k != 0) {
            return this.f5410K.f5454c0.mo6218c().getText(this.f5562k);
        }
        return this.f5563l;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo6082a(int i, Fragment fragment, @C0195i0 String str, int i2) {
        super.mo6082a(i, fragment, str, i2);
        fragment.mFragmentManager = this.f5410K;
    }

    @C0193h0
    /* renamed from: a */
    public C1406n mo6080a(@C0193h0 Fragment fragment, @C0193h0 State state) {
        if (fragment.mFragmentManager != this.f5410K) {
            StringBuilder sb = new StringBuilder();
            sb.append("Cannot setMaxLifecycle for Fragment not attached to FragmentManager ");
            sb.append(this.f5410K);
            throw new IllegalArgumentException(sb.toString());
        } else if (state.isAtLeast(State.CREATED)) {
            return super.mo6080a(fragment, state);
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Cannot set maximum Lifecycle below ");
            sb2.append(State.CREATED);
            throw new IllegalArgumentException(sb2.toString());
        }
    }

    /* renamed from: a */
    public boolean mo6087a(ArrayList<C1373a> arrayList, ArrayList<Boolean> arrayList2) {
        if (C1386i.f5433t0) {
            StringBuilder sb = new StringBuilder();
            sb.append("Run: ");
            sb.append(this);
            sb.toString();
        }
        arrayList.add(this);
        arrayList2.add(Boolean.valueOf(false));
        if (this.f5559h) {
            this.f5410K.mo6283a(this);
        }
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo6086a(ArrayList<C1373a> arrayList, int i, int i2) {
        if (i2 == i) {
            return false;
        }
        int size = this.f5552a.size();
        int i3 = -1;
        for (int i4 = 0; i4 < size; i4++) {
            Fragment fragment = ((C1407a) this.f5552a.get(i4)).f5571b;
            int i5 = fragment != null ? fragment.mContainerId : 0;
            if (!(i5 == 0 || i5 == i3)) {
                for (int i6 = i; i6 < i2; i6++) {
                    C1373a aVar = (C1373a) arrayList.get(i6);
                    int size2 = aVar.f5552a.size();
                    for (int i7 = 0; i7 < size2; i7++) {
                        Fragment fragment2 = ((C1407a) aVar.f5552a.get(i7)).f5571b;
                        if ((fragment2 != null ? fragment2.mContainerId : 0) == i5) {
                            return true;
                        }
                    }
                }
                i3 = i5;
            }
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public Fragment mo6079a(ArrayList<Fragment> arrayList, Fragment fragment) {
        ArrayList<Fragment> arrayList2 = arrayList;
        Fragment fragment2 = fragment;
        int i = 0;
        while (i < this.f5552a.size()) {
            C1407a aVar = (C1407a) this.f5552a.get(i);
            int i2 = aVar.f5570a;
            if (i2 != 1) {
                if (i2 == 2) {
                    Fragment fragment3 = aVar.f5571b;
                    int i3 = fragment3.mContainerId;
                    Fragment fragment4 = fragment2;
                    int i4 = i;
                    boolean z = false;
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        Fragment fragment5 = (Fragment) arrayList2.get(size);
                        if (fragment5.mContainerId == i3) {
                            if (fragment5 == fragment3) {
                                z = true;
                            } else {
                                if (fragment5 == fragment4) {
                                    this.f5552a.add(i4, new C1407a(9, fragment5));
                                    i4++;
                                    fragment4 = null;
                                }
                                C1407a aVar2 = new C1407a(3, fragment5);
                                aVar2.f5572c = aVar.f5572c;
                                aVar2.f5574e = aVar.f5574e;
                                aVar2.f5573d = aVar.f5573d;
                                aVar2.f5575f = aVar.f5575f;
                                this.f5552a.add(i4, aVar2);
                                arrayList2.remove(fragment5);
                                i4++;
                            }
                        }
                    }
                    if (z) {
                        this.f5552a.remove(i4);
                        i4--;
                    } else {
                        aVar.f5570a = 1;
                        arrayList2.add(fragment3);
                    }
                    i = i4;
                    fragment2 = fragment4;
                } else if (i2 == 3 || i2 == 6) {
                    arrayList2.remove(aVar.f5571b);
                    Fragment fragment6 = aVar.f5571b;
                    if (fragment6 == fragment2) {
                        this.f5552a.add(i, new C1407a(9, fragment6));
                        i++;
                        fragment2 = null;
                    }
                } else if (i2 != 7) {
                    if (i2 == 8) {
                        this.f5552a.add(i, new C1407a(9, fragment2));
                        i++;
                        fragment2 = aVar.f5571b;
                    }
                }
                i++;
            }
            arrayList2.add(aVar.f5571b);
            i++;
        }
        return fragment2;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo6083a(C1367e eVar) {
        for (int i = 0; i < this.f5552a.size(); i++) {
            C1407a aVar = (C1407a) this.f5552a.get(i);
            if (m7168b(aVar)) {
                aVar.f5571b.setOnStartEnterTransitionListener(eVar);
            }
        }
    }
}
