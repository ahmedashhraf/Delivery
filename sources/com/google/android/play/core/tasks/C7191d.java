package com.google.android.play.core.tasks;

import java.util.concurrent.Executor;

/* renamed from: com.google.android.play.core.tasks.d */
public abstract class C7191d<ResultT> {
    /* renamed from: a */
    public abstract C7191d<ResultT> mo28612a(C7188a<ResultT> aVar);

    /* renamed from: a */
    public abstract C7191d<ResultT> mo28613a(C7189b bVar);

    /* renamed from: a */
    public abstract C7191d<ResultT> mo28614a(C7190c<? super ResultT> cVar);

    /* renamed from: a */
    public abstract C7191d<ResultT> mo28615a(Executor executor, C7188a<ResultT> aVar);

    /* renamed from: a */
    public abstract C7191d<ResultT> mo28616a(Executor executor, C7189b bVar);

    /* renamed from: a */
    public abstract C7191d<ResultT> mo28617a(Executor executor, C7190c<? super ResultT> cVar);

    /* renamed from: a */
    public abstract Exception mo28618a();

    /* renamed from: a */
    public abstract <X extends Throwable> ResultT mo28619a(Class<X> cls) throws Throwable;

    /* renamed from: b */
    public abstract ResultT mo28620b();

    /* renamed from: c */
    public abstract boolean mo28621c();

    /* renamed from: d */
    public abstract boolean mo28622d();
}
