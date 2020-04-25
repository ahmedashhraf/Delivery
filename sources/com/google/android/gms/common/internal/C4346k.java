package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.content.Context;
import android.os.Handler;
import android.os.IInterface;
import android.os.Looper;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import com.google.android.gms.common.C4279e;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.annotation.C4056a;
import com.google.android.gms.common.api.C4059a.C4071f;
import com.google.android.gms.common.api.C4086i.C4088b;
import com.google.android.gms.common.api.C4086i.C4089c;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.internal.C4122f;
import com.google.android.gms.common.api.internal.C4180p;
import com.google.android.gms.common.internal.C4314e.C4315a;
import com.google.android.gms.common.internal.C4314e.C4316b;
import com.google.android.gms.common.internal.GmsClientEventManager.GmsClientEventState;
import com.google.android.gms.common.util.C4476d0;
import java.util.Collections;
import java.util.Set;

@C4056a
/* renamed from: com.google.android.gms.common.internal.k */
/* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
public abstract class C4346k<T extends IInterface> extends C4314e<T> implements C4071f, GmsClientEventState {

    /* renamed from: I */
    private final C4329f f13494I;

    /* renamed from: J */
    private final Set<Scope> f13495J;

    /* renamed from: K */
    private final Account f13496K;

    @C4056a
    @C4476d0
    protected C4346k(Context context, Handler handler, int i, C4329f fVar) {
        this(context, handler, C4362l.m18835a(context), C4279e.m18476a(), i, fVar, (C4088b) null, (C4089c) null);
    }

    @C0195i0
    /* renamed from: a */
    private static C4315a m18808a(C4122f fVar) {
        if (fVar == null) {
            return null;
        }
        return new C4383q0(fVar);
    }

    /* renamed from: b */
    private final Set<Scope> m18810b(@C0193h0 Set<Scope> set) {
        Set<Scope> a = mo18329a(set);
        for (Scope contains : a) {
            if (!set.contains(contains)) {
                throw new IllegalStateException("Expanding scopes is not permitted, use implied scopes instead");
            }
        }
        return a;
    }

    /* access modifiers changed from: protected */
    @C4056a
    /* renamed from: D */
    public final C4329f mo18328D() {
        return this.f13494I;
    }

    /* access modifiers changed from: protected */
    @C0193h0
    @C4056a
    /* renamed from: a */
    public Set<Scope> mo18329a(@C0193h0 Set<Scope> set) {
        return set;
    }

    @C0193h0
    @C4056a
    /* renamed from: g */
    public Set<Scope> mo17640g() {
        return mo18251o() ? this.f13495J : Collections.emptySet();
    }

    @C4056a
    /* renamed from: j */
    public Feature[] mo17643j() {
        return new Feature[0];
    }

    /* renamed from: l */
    public int mo10085l() {
        return super.mo10085l();
    }

    /* renamed from: s */
    public final Account mo18255s() {
        return this.f13496K;
    }

    /* access modifiers changed from: protected */
    @C4056a
    /* renamed from: y */
    public final Set<Scope> mo18261y() {
        return this.f13495J;
    }

    @C0195i0
    /* renamed from: a */
    private static C4316b m18809a(C4180p pVar) {
        if (pVar == null) {
            return null;
        }
        return new C4387r0(pVar);
    }

    @C4056a
    protected C4346k(Context context, Looper looper, int i, C4329f fVar, C4122f fVar2, C4180p pVar) {
        this(context, looper, C4362l.m18835a(context), C4279e.m18476a(), i, fVar, (C4122f) C4300a0.m18620a(fVar2), (C4180p) C4300a0.m18620a(pVar));
    }

    @C4056a
    @Deprecated
    protected C4346k(Context context, Looper looper, int i, C4329f fVar, C4088b bVar, C4089c cVar) {
        this(context, looper, i, fVar, (C4122f) bVar, (C4180p) cVar);
    }

    @C4056a
    protected C4346k(Context context, Looper looper, int i, C4329f fVar) {
        this(context, looper, C4362l.m18835a(context), C4279e.m18476a(), i, fVar, (C4088b) null, (C4089c) null);
    }

    @C4476d0
    protected C4346k(Context context, Looper looper, C4362l lVar, C4279e eVar, int i, C4329f fVar, C4122f fVar2, C4180p pVar) {
        super(context, looper, lVar, eVar, i, m18808a(fVar2), m18809a(pVar), fVar.mo18301h());
        this.f13494I = fVar;
        this.f13496K = fVar.mo18292a();
        this.f13495J = m18810b(fVar.mo18297d());
    }

    @C4476d0
    protected C4346k(Context context, Looper looper, C4362l lVar, C4279e eVar, int i, C4329f fVar, C4088b bVar, C4089c cVar) {
        this(context, looper, lVar, eVar, i, fVar, (C4122f) bVar, (C4180p) cVar);
    }

    @C4476d0
    protected C4346k(Context context, Handler handler, C4362l lVar, C4279e eVar, int i, C4329f fVar, C4122f fVar2, C4180p pVar) {
        super(context, handler, lVar, eVar, i, m18808a(fVar2), m18809a(pVar));
        this.f13494I = (C4329f) C4300a0.m18620a(fVar);
        this.f13496K = fVar.mo18292a();
        this.f13495J = m18810b(fVar.mo18297d());
    }

    @Deprecated
    @C4476d0
    protected C4346k(Context context, Handler handler, C4362l lVar, C4279e eVar, int i, C4329f fVar, C4088b bVar, C4089c cVar) {
        this(context, handler, lVar, eVar, i, fVar, (C4122f) bVar, (C4180p) cVar);
    }
}
