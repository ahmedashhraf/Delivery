package p212io.fabric.sdk.android.p493p.p497d;

import android.annotation.SuppressLint;

/* renamed from: io.fabric.sdk.android.p.d.f */
/* compiled from: PreferenceStoreStrategy */
public class C14304f<T> implements C14301c<T> {

    /* renamed from: a */
    private final C14302d f42158a;

    /* renamed from: b */
    private final C14305g<T> f42159b;

    /* renamed from: c */
    private final String f42160c;

    public C14304f(C14302d dVar, C14305g<T> gVar, String str) {
        this.f42158a = dVar;
        this.f42159b = gVar;
        this.f42160c = str;
    }

    @SuppressLint({"CommitPrefEdits"})
    /* renamed from: a */
    public void mo45249a(T t) {
        C14302d dVar = this.f42158a;
        dVar.mo45252a(dVar.mo45251a().putString(this.f42160c, this.f42159b.mo45255a(t)));
    }

    @SuppressLint({"CommitPrefEdits"})
    public void clear() {
        this.f42158a.mo45251a().remove(this.f42160c).commit();
    }

    /* renamed from: a */
    public T mo45248a() {
        return this.f42159b.mo45254a(this.f42158a.get().getString(this.f42160c, null));
    }
}
