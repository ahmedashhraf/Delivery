package com.google.android.gms.tasks;

import android.app.Activity;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.tasks.k */
public abstract class C5560k<TResult> {
    @C0193h0
    /* renamed from: a */
    public abstract C5560k<TResult> mo21988a(@C0193h0 Activity activity, @C0193h0 C5549f fVar);

    @C0193h0
    /* renamed from: a */
    public abstract C5560k<TResult> mo21989a(@C0193h0 Activity activity, @C0193h0 C5551g<? super TResult> gVar);

    @C0193h0
    /* renamed from: a */
    public C5560k<TResult> mo21992a(@C0193h0 C5547e<TResult> eVar) {
        throw new UnsupportedOperationException("addOnCompleteListener is not implemented");
    }

    @C0193h0
    /* renamed from: a */
    public abstract C5560k<TResult> mo21993a(@C0193h0 C5549f fVar);

    @C0193h0
    /* renamed from: a */
    public abstract C5560k<TResult> mo21994a(@C0193h0 C5551g<? super TResult> gVar);

    @C0193h0
    /* renamed from: a */
    public abstract C5560k<TResult> mo21999a(@C0193h0 Executor executor, @C0193h0 C5549f fVar);

    @C0193h0
    /* renamed from: a */
    public abstract C5560k<TResult> mo22000a(@C0193h0 Executor executor, @C0193h0 C5551g<? super TResult> gVar);

    @C0195i0
    /* renamed from: a */
    public abstract Exception mo22002a();

    @C0195i0
    /* renamed from: a */
    public abstract <X extends Throwable> TResult mo22003a(@C0193h0 Class<X> cls) throws Throwable;

    @C0193h0
    /* renamed from: b */
    public <TContinuationResult> C5560k<TContinuationResult> mo22006b(@C0193h0 C5543c<TResult, C5560k<TContinuationResult>> cVar) {
        throw new UnsupportedOperationException("continueWithTask is not implemented");
    }

    @C0195i0
    /* renamed from: b */
    public abstract TResult mo22008b();

    /* renamed from: c */
    public abstract boolean mo22011c();

    /* renamed from: d */
    public abstract boolean mo22012d();

    /* renamed from: e */
    public abstract boolean mo22013e();

    @C0193h0
    /* renamed from: a */
    public C5560k<TResult> mo21998a(@C0193h0 Executor executor, @C0193h0 C5547e<TResult> eVar) {
        throw new UnsupportedOperationException("addOnCompleteListener is not implemented");
    }

    @C0193h0
    /* renamed from: b */
    public <TContinuationResult> C5560k<TContinuationResult> mo22007b(@C0193h0 Executor executor, @C0193h0 C5543c<TResult, C5560k<TContinuationResult>> cVar) {
        throw new UnsupportedOperationException("continueWithTask is not implemented");
    }

    @C0193h0
    /* renamed from: a */
    public C5560k<TResult> mo21987a(@C0193h0 Activity activity, @C0193h0 C5547e<TResult> eVar) {
        throw new UnsupportedOperationException("addOnCompleteListener is not implemented");
    }

    @C0193h0
    /* renamed from: a */
    public C5560k<TResult> mo21991a(@C0193h0 C5545d dVar) {
        throw new UnsupportedOperationException("addOnCanceledListener is not implemented.");
    }

    @C0193h0
    /* renamed from: a */
    public C5560k<TResult> mo21997a(@C0193h0 Executor executor, @C0193h0 C5545d dVar) {
        throw new UnsupportedOperationException("addOnCanceledListener is not implemented");
    }

    @C0193h0
    /* renamed from: a */
    public C5560k<TResult> mo21986a(@C0193h0 Activity activity, @C0193h0 C5545d dVar) {
        throw new UnsupportedOperationException("addOnCanceledListener is not implemented.");
    }

    @C0193h0
    /* renamed from: a */
    public <TContinuationResult> C5560k<TContinuationResult> mo21990a(@C0193h0 C5543c<TResult, TContinuationResult> cVar) {
        throw new UnsupportedOperationException("continueWith is not implemented");
    }

    @C0193h0
    /* renamed from: a */
    public <TContinuationResult> C5560k<TContinuationResult> mo21996a(@C0193h0 Executor executor, @C0193h0 C5543c<TResult, TContinuationResult> cVar) {
        throw new UnsupportedOperationException("continueWith is not implemented");
    }

    @C0193h0
    /* renamed from: a */
    public <TContinuationResult> C5560k<TContinuationResult> mo21995a(@C0193h0 C5558j<TResult, TContinuationResult> jVar) {
        throw new UnsupportedOperationException("onSuccessTask is not implemented");
    }

    @C0193h0
    /* renamed from: a */
    public <TContinuationResult> C5560k<TContinuationResult> mo22001a(@C0193h0 Executor executor, @C0193h0 C5558j<TResult, TContinuationResult> jVar) {
        throw new UnsupportedOperationException("onSuccessTask is not implemented");
    }
}
