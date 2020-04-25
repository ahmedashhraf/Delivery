package com.instabug.featuresrequest.p373ui.p378d;

import android.os.Bundle;
import androidx.annotation.C0193h0;
import androidx.fragment.app.Fragment;
import com.instabug.featuresrequest.models.C9567a;
import com.instabug.featuresrequest.p373ui.p375b.C9612b;
import com.instabug.featuresrequest.p373ui.p375b.C9613c;
import com.instabug.featuresrequest.p373ui.p375b.p376a.C9601c.C9603b;
import com.instabug.featuresrequest.p373ui.p375b.p376a.C9604d;
import com.instabug.featuresrequest.p373ui.p375b.p376a.C9606e;
import com.instabug.featuresrequest.p373ui.p375b.p376a.C9610f;
import com.instabug.library.core.p382ui.BaseContract.Presenter;
import com.instabug.library.core.p382ui.BaseContract.View;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import java.util.ArrayList;
import java.util.List;
import p205i.p471b.p472a.p473a.p474c.C13938g;

/* renamed from: com.instabug.featuresrequest.ui.d.a */
/* compiled from: FeaturesMainContract */
public class C9662a {

    /* renamed from: com.instabug.featuresrequest.ui.d.a$a */
    interface C9663a extends Presenter {
    }

    /* renamed from: com.instabug.featuresrequest.ui.d.a$b */
    /* compiled from: FeaturesMainContract */
    interface C9664b extends View<Fragment> {
        /* renamed from: c */
        void mo34549c();

        /* renamed from: d */
        void mo34550d();
    }

    /* renamed from: com.instabug.featuresrequest.ui.d.a$c */
    /* compiled from: MainAllFeaturesDao */
    public class C9665c extends C9612b {

        /* renamed from: d */
        private static volatile C9665c f25606d;

        /* renamed from: e */
        private static transient /* synthetic */ boolean[] f25607e;

        /* renamed from: c */
        private List<C9567a> f25608c;

        private C9665c() {
            boolean[] f = m45161f();
            if (f25606d == null) {
                this.f25608c = new ArrayList();
                f[2] = true;
                return;
            }
            f[0] = true;
            RuntimeException runtimeException = new RuntimeException("Use getInstance() method to get the single instance of this class");
            f[1] = true;
            throw runtimeException;
        }

        /* JADX INFO: finally extract failed */
        /* renamed from: e */
        public static C9665c m45160e() {
            boolean[] f = m45161f();
            if (f25606d != null) {
                f[3] = true;
            } else {
                synchronized (C9665c.class) {
                    try {
                        f[4] = true;
                        if (f25606d != null) {
                            f[5] = true;
                        } else {
                            f[6] = true;
                            f25606d = new C9665c();
                            f[7] = true;
                        }
                    } catch (Throwable th) {
                        while (true) {
                            f[9] = true;
                            throw th;
                        }
                    }
                }
                f[8] = true;
            }
            C9665c cVar = f25606d;
            f[10] = true;
            return cVar;
        }

        /* renamed from: f */
        private static /* synthetic */ boolean[] m45161f() {
            boolean[] zArr = f25607e;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(-4105134084394670170L, "com/instabug/featuresrequest/ui/featuresmain/mainallfeatures/MainAllFeaturesDao", 18);
            f25607e = a;
            return a;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public C9567a mo34420a(int i) {
            C9567a aVar = (C9567a) this.f25608c.get(i);
            m45161f()[14] = true;
            return aVar;
        }

        /* renamed from: b */
        public List<C9567a> mo34423b() {
            boolean[] f = m45161f();
            List<C9567a> list = this.f25608c;
            f[11] = true;
            return list;
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public int mo34424c() {
            boolean[] f = m45161f();
            int size = this.f25608c.size();
            f[13] = true;
            return size;
        }

        /* access modifiers changed from: protected */
        /* renamed from: d */
        public void mo34425d() {
            boolean[] f = m45161f();
            this.f25608c.clear();
            f[17] = true;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo34422a(List<C9567a> list) {
            boolean[] f = m45161f();
            this.f25608c.addAll(list);
            f[15] = true;
        }
    }

    @SuppressFBWarnings({"RCN_REDUNDANT_NULLCHECK_OF_NONNULL_VALUE"})
    /* renamed from: com.instabug.featuresrequest.ui.d.a$d */
    /* compiled from: MainAllFeaturesFragment */
    public class C9666d extends C9604d {

        /* renamed from: Y */
        private static transient /* synthetic */ boolean[] f25609Y;

        public C9666d() {
            m45168x()[0] = true;
        }

        /* renamed from: c */
        public static C9666d m45167c(boolean z) {
            boolean[] x = m45168x();
            Bundle bundle = new Bundle();
            x[1] = true;
            bundle.putBoolean("sort_by_top_voted", z);
            x[2] = true;
            bundle.putBoolean("my_posts", false);
            x[3] = true;
            C9666d dVar = new C9666d();
            x[4] = true;
            dVar.setArguments(bundle);
            x[5] = true;
            return dVar;
        }

        /* renamed from: x */
        private static /* synthetic */ boolean[] m45168x() {
            boolean[] zArr = f25609Y;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(-5992172471635163057L, "com/instabug/featuresrequest/ui/featuresmain/mainallfeatures/MainAllFeaturesFragment", 8);
            f25609Y = a;
            return a;
        }

        @C0193h0
        /* renamed from: w */
        public C9606e mo34397w() {
            boolean[] x = m45168x();
            x[6] = true;
            C9667e eVar = new C9667e(this, new C9613c(C9665c.m45160e()));
            x[7] = true;
            return eVar;
        }
    }

    /* renamed from: com.instabug.featuresrequest.ui.d.a$e */
    /* compiled from: MainAllFeaturesPresenter */
    public class C9667e extends C9610f {

        /* renamed from: e */
        private static transient /* synthetic */ boolean[] f25610e;

        public C9667e(C9603b bVar, C9613c cVar) {
            boolean[] l = m45170l();
            super(bVar, cVar, false);
            l[0] = true;
        }

        /* renamed from: l */
        private static /* synthetic */ boolean[] m45170l() {
            boolean[] zArr = f25610e;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(-1851107872174542821L, "com/instabug/featuresrequest/ui/featuresmain/mainallfeatures/MainAllFeaturesPresenter", 1);
            f25610e = a;
            return a;
        }
    }
}
