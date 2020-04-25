package bolts;

/* renamed from: bolts.o */
/* compiled from: TaskCompletionSource */
public class C2196o<TResult> {

    /* renamed from: a */
    private final C2177n<TResult> f8707a = new C2177n<>();

    /* renamed from: a */
    public C2177n<TResult> mo9338a() {
        return this.f8707a;
    }

    /* renamed from: b */
    public boolean mo9343b(TResult tresult) {
        return this.f8707a.mo9311a(tresult);
    }

    /* renamed from: c */
    public boolean mo9344c() {
        return this.f8707a.mo9330h();
    }

    /* renamed from: a */
    public void mo9340a(TResult tresult) {
        if (!mo9343b(tresult)) {
            throw new IllegalStateException("Cannot set the result of a completed task.");
        }
    }

    /* renamed from: b */
    public boolean mo9342b(Exception exc) {
        return this.f8707a.mo9310a(exc);
    }

    /* renamed from: b */
    public void mo9341b() {
        if (!mo9344c()) {
            throw new IllegalStateException("Cannot cancel a completed task.");
        }
    }

    /* renamed from: a */
    public void mo9339a(Exception exc) {
        if (!mo9342b(exc)) {
            throw new IllegalStateException("Cannot set the error on a completed task.");
        }
    }
}
