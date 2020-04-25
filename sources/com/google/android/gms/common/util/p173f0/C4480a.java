package com.google.android.gms.common.util.p173f0;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.C0193h0;
import com.google.android.gms.common.annotation.C4056a;
import java.util.concurrent.Executor;
import p076c.p112d.p113a.p114a.p118d.p122d.C2617e;

@C4056a
/* renamed from: com.google.android.gms.common.util.f0.a */
public class C4480a implements Executor {

    /* renamed from: a */
    private final Handler f13718a;

    @C4056a
    public C4480a(Looper looper) {
        this.f13718a = new C2617e(looper);
    }

    public void execute(@C0193h0 Runnable runnable) {
        this.f13718a.post(runnable);
    }
}
