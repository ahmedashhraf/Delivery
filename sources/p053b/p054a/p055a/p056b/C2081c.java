package p053b.p054a.p055a.p056b;

import androidx.annotation.C0193h0;
import androidx.annotation.C0207n0;
import androidx.annotation.C0207n0.C0208a;

@C0207n0({C0208a.LIBRARY_GROUP})
/* renamed from: b.a.a.b.c */
/* compiled from: TaskExecutor */
public abstract class C2081c {
    /* renamed from: a */
    public abstract void mo9047a(@C0193h0 Runnable runnable);

    /* renamed from: a */
    public abstract boolean mo9048a();

    /* renamed from: b */
    public void mo9053b(@C0193h0 Runnable runnable) {
        if (mo9048a()) {
            runnable.run();
        } else {
            mo9049c(runnable);
        }
    }

    /* renamed from: c */
    public abstract void mo9049c(@C0193h0 Runnable runnable);
}
