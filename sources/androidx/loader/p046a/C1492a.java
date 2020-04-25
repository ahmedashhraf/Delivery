package androidx.loader.p046a;

import android.os.Bundle;
import androidx.annotation.C0187e0;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import androidx.lifecycle.C1459i;
import androidx.lifecycle.C1484w;
import androidx.loader.p047b.C1502c;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* renamed from: androidx.loader.a.a */
/* compiled from: LoaderManager */
public abstract class C1492a {

    /* renamed from: androidx.loader.a.a$a */
    /* compiled from: LoaderManager */
    public interface C1493a<D> {
        @C0193h0
        @C0187e0
        /* renamed from: a */
        C1502c<D> mo6550a(int i, @C0195i0 Bundle bundle);

        @C0187e0
        /* renamed from: a */
        void mo6551a(@C0193h0 C1502c<D> cVar);

        @C0187e0
        /* renamed from: a */
        void mo6552a(@C0193h0 C1502c<D> cVar, D d);
    }

    @C0193h0
    /* renamed from: a */
    public static <T extends C1459i & C1484w> C1492a m7755a(@C0193h0 T t) {
        return new C1494b(t, ((C1484w) t).getViewModelStore());
    }

    @C0193h0
    @C0187e0
    /* renamed from: a */
    public abstract <D> C1502c<D> mo6543a(int i, @C0195i0 Bundle bundle, @C0193h0 C1493a<D> aVar);

    @C0187e0
    /* renamed from: a */
    public abstract void mo6544a(int i);

    @Deprecated
    /* renamed from: a */
    public abstract void mo6545a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    /* renamed from: a */
    public boolean mo6546a() {
        return false;
    }

    @C0195i0
    /* renamed from: b */
    public abstract <D> C1502c<D> mo6547b(int i);

    @C0193h0
    @C0187e0
    /* renamed from: b */
    public abstract <D> C1502c<D> mo6548b(int i, @C0195i0 Bundle bundle, @C0193h0 C1493a<D> aVar);

    /* renamed from: b */
    public abstract void mo6549b();

    /* renamed from: a */
    public static void m7756a(boolean z) {
        C1494b.f5743d = z;
    }
}
