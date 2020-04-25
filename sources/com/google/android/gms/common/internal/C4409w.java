package com.google.android.gms.common.internal;

import android.content.Context;
import android.os.IInterface;
import androidx.annotation.C0193h0;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C4086i.C4088b;
import com.google.android.gms.common.api.C4086i.C4089c;

@Deprecated
/* renamed from: com.google.android.gms.common.internal.w */
/* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
public abstract class C4409w<T extends IInterface> extends C4346k<T> {

    /* renamed from: L */
    private final GmsClientEventManager f13537L;

    public C4409w(Context context, int i, C4329f fVar, C4088b bVar, C4089c cVar) {
        super(context, context.getMainLooper(), i, fVar);
        this.f13537L = new GmsClientEventManager(context.getMainLooper(), this);
        this.f13537L.mo18194b(bVar);
        this.f13537L.mo18195b(cVar);
    }

    /* renamed from: a */
    public void mo18230a() {
        this.f13537L.mo18193b();
        super.mo18230a();
    }

    /* renamed from: b */
    public void mo18396b(C4088b bVar) {
        this.f13537L.mo18194b(bVar);
    }

    /* renamed from: c */
    public void mo18243c() {
        this.f13537L.mo18196c();
        super.mo18243c();
    }

    /* renamed from: b */
    public void mo18397b(C4089c cVar) {
        this.f13537L.mo18195b(cVar);
    }

    /* renamed from: a */
    public void mo18235a(@C0193h0 T t) {
        super.mo18235a(t);
        this.f13537L.mo18188a(getConnectionHint());
    }

    /* renamed from: c */
    public void mo18398c(C4088b bVar) {
        this.f13537L.mo18197c(bVar);
    }

    /* renamed from: c */
    public void mo18399c(C4089c cVar) {
        this.f13537L.mo18198c(cVar);
    }

    /* renamed from: a */
    public void mo18231a(int i) {
        super.mo18231a(i);
        this.f13537L.mo18187a(i);
    }

    /* renamed from: a */
    public void mo18236a(ConnectionResult connectionResult) {
        super.mo18236a(connectionResult);
        this.f13537L.mo18189a(connectionResult);
    }

    /* renamed from: a */
    public boolean mo18394a(C4088b bVar) {
        return this.f13537L.mo18191a(bVar);
    }

    /* renamed from: a */
    public boolean mo18395a(C4089c cVar) {
        return this.f13537L.mo18192a(cVar);
    }
}
