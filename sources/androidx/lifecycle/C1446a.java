package androidx.lifecycle;

import android.annotation.SuppressLint;
import android.app.Application;
import androidx.annotation.C0193h0;

/* renamed from: androidx.lifecycle.a */
/* compiled from: AndroidViewModel */
public class C1446a extends C1477t {
    @SuppressLint({"StaticFieldLeak"})

    /* renamed from: c */
    private Application f5690c;

    public C1446a(@C0193h0 Application application) {
        this.f5690c = application;
    }

    @C0193h0
    /* renamed from: c */
    public <T extends Application> T mo6493c() {
        return this.f5690c;
    }
}
