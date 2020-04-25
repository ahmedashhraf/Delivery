package okhttp3.internal.http2;

import java.io.IOException;
import java.util.List;
import p470h.C13894e;

/* renamed from: okhttp3.internal.http2.k */
/* compiled from: PushObserver */
public interface C14997k {

    /* renamed from: a */
    public static final C14997k f43598a = new C14998a();

    /* renamed from: okhttp3.internal.http2.k$a */
    /* compiled from: PushObserver */
    class C14998a implements C14997k {
        C14998a() {
        }

        /* renamed from: a */
        public void mo46589a(int i, C14963a aVar) {
        }

        /* renamed from: a */
        public boolean mo46590a(int i, C13894e eVar, int i2, boolean z) throws IOException {
            eVar.skip((long) i2);
            return true;
        }

        /* renamed from: a */
        public boolean mo46591a(int i, List<C14964b> list) {
            return true;
        }

        /* renamed from: a */
        public boolean mo46592a(int i, List<C14964b> list, boolean z) {
            return true;
        }
    }

    /* renamed from: a */
    void mo46589a(int i, C14963a aVar);

    /* renamed from: a */
    boolean mo46590a(int i, C13894e eVar, int i2, boolean z) throws IOException;

    /* renamed from: a */
    boolean mo46591a(int i, List<C14964b> list);

    /* renamed from: a */
    boolean mo46592a(int i, List<C14964b> list, boolean z);
}
