package androidx.fragment.app;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import androidx.annotation.C0207n0;
import androidx.annotation.C0207n0.C0208a;
import androidx.annotation.C0214q0;
import androidx.annotation.C0225w;
import androidx.fragment.app.Fragment.SavedState;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.List;

/* renamed from: androidx.fragment.app.h */
/* compiled from: FragmentManager */
public abstract class C1382h {

    /* renamed from: N */
    public static final int f5422N = 1;

    /* renamed from: b */
    static final C1380f f5423b = new C1380f();

    /* renamed from: a */
    private C1380f f5424a = null;

    /* renamed from: androidx.fragment.app.h$a */
    /* compiled from: FragmentManager */
    public interface C1383a {
        @C0195i0
        /* renamed from: a */
        CharSequence mo6081a();

        @C0214q0
        /* renamed from: b */
        int mo6088b();

        @C0214q0
        /* renamed from: c */
        int mo6091c();

        @C0195i0
        /* renamed from: d */
        CharSequence mo6095d();

        int getId();

        @C0195i0
        String getName();
    }

    /* renamed from: androidx.fragment.app.h$b */
    /* compiled from: FragmentManager */
    public static abstract class C1384b {
        /* renamed from: a */
        public void mo6247a(@C0193h0 C1382h hVar, @C0193h0 Fragment fragment) {
        }

        /* renamed from: a */
        public void mo6248a(@C0193h0 C1382h hVar, @C0193h0 Fragment fragment, @C0193h0 Context context) {
        }

        /* renamed from: a */
        public void mo6249a(@C0193h0 C1382h hVar, @C0193h0 Fragment fragment, @C0195i0 Bundle bundle) {
        }

        /* renamed from: a */
        public void mo6250a(@C0193h0 C1382h hVar, @C0193h0 Fragment fragment, @C0193h0 View view, @C0195i0 Bundle bundle) {
        }

        /* renamed from: b */
        public void mo6251b(@C0193h0 C1382h hVar, @C0193h0 Fragment fragment) {
        }

        /* renamed from: b */
        public void mo6252b(@C0193h0 C1382h hVar, @C0193h0 Fragment fragment, @C0193h0 Context context) {
        }

        /* renamed from: b */
        public void mo6253b(@C0193h0 C1382h hVar, @C0193h0 Fragment fragment, @C0195i0 Bundle bundle) {
        }

        /* renamed from: c */
        public void mo6254c(@C0193h0 C1382h hVar, @C0193h0 Fragment fragment) {
        }

        /* renamed from: c */
        public void mo6255c(@C0193h0 C1382h hVar, @C0193h0 Fragment fragment, @C0195i0 Bundle bundle) {
        }

        /* renamed from: d */
        public void mo6256d(@C0193h0 C1382h hVar, @C0193h0 Fragment fragment) {
        }

        /* renamed from: d */
        public void mo6257d(@C0193h0 C1382h hVar, @C0193h0 Fragment fragment, @C0193h0 Bundle bundle) {
        }

        /* renamed from: e */
        public void mo6258e(@C0193h0 C1382h hVar, @C0193h0 Fragment fragment) {
        }

        /* renamed from: f */
        public void mo6259f(@C0193h0 C1382h hVar, @C0193h0 Fragment fragment) {
        }

        /* renamed from: g */
        public void mo6260g(@C0193h0 C1382h hVar, @C0193h0 Fragment fragment) {
        }
    }

    /* renamed from: androidx.fragment.app.h$c */
    /* compiled from: FragmentManager */
    public interface C1385c {
        /* renamed from: z */
        void mo6261z();
    }

    @C0195i0
    /* renamed from: a */
    public abstract SavedState mo6220a(@C0193h0 Fragment fragment);

    @C0195i0
    /* renamed from: a */
    public abstract Fragment mo6221a(@C0225w int i);

    @C0195i0
    /* renamed from: a */
    public abstract Fragment mo6222a(@C0193h0 Bundle bundle, @C0193h0 String str);

    @C0195i0
    /* renamed from: a */
    public abstract Fragment mo6223a(@C0195i0 String str);

    @C0193h0
    /* renamed from: a */
    public abstract C1406n mo6224a();

    /* renamed from: a */
    public abstract void mo6225a(int i, int i2);

    /* renamed from: a */
    public abstract void mo6226a(@C0193h0 Bundle bundle, @C0193h0 String str, @C0193h0 Fragment fragment);

    /* renamed from: a */
    public void mo6227a(@C0193h0 C1380f fVar) {
        this.f5424a = fVar;
    }

    /* renamed from: a */
    public abstract void mo6228a(@C0193h0 C1384b bVar);

    /* renamed from: a */
    public abstract void mo6229a(@C0193h0 C1384b bVar, boolean z);

    /* renamed from: a */
    public abstract void mo6230a(@C0193h0 C1385c cVar);

    /* renamed from: a */
    public abstract void mo6231a(@C0195i0 String str, int i);

    /* renamed from: a */
    public abstract void mo6232a(@C0193h0 String str, @C0195i0 FileDescriptor fileDescriptor, @C0193h0 PrintWriter printWriter, @C0195i0 String[] strArr);

    @C0193h0
    /* renamed from: b */
    public abstract C1383a mo6233b(int i);

    /* renamed from: b */
    public abstract void mo6234b(@C0193h0 C1385c cVar);

    /* renamed from: b */
    public abstract boolean mo6235b();

    /* renamed from: b */
    public abstract boolean mo6236b(int i, int i2);

    /* renamed from: b */
    public abstract boolean mo6237b(@C0195i0 String str, int i);

    /* renamed from: c */
    public abstract int mo6238c();

    @C0193h0
    /* renamed from: d */
    public C1380f mo6239d() {
        if (this.f5424a == null) {
            this.f5424a = f5423b;
        }
        return this.f5424a;
    }

    @C0193h0
    /* renamed from: e */
    public abstract List<Fragment> mo6240e();

    @C0195i0
    /* renamed from: f */
    public abstract Fragment mo6241f();

    /* renamed from: g */
    public abstract boolean mo6242g();

    /* renamed from: h */
    public abstract boolean mo6243h();

    @C0193h0
    @C0207n0({C0208a.LIBRARY_GROUP_PREFIX})
    @Deprecated
    /* renamed from: i */
    public C1406n mo6244i() {
        return mo6224a();
    }

    /* renamed from: j */
    public abstract void mo6245j();

    /* renamed from: k */
    public abstract boolean mo6246k();

    /* renamed from: a */
    public static void m7282a(boolean z) {
        C1386i.f5433t0 = z;
    }
}
