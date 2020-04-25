package com.google.android.gms.common.api;

import android.text.TextUtils;
import androidx.collection.C0635a;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C4059a.C4063d;
import com.google.android.gms.common.api.internal.C4102c;
import com.google.android.gms.common.internal.C4300a0;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
public class AvailabilityException extends Exception {

    /* renamed from: a */
    private final C0635a<C4102c<?>, ConnectionResult> f12776a;

    public AvailabilityException(C0635a<C4102c<?>, ConnectionResult> aVar) {
        this.f12776a = aVar;
    }

    /* renamed from: a */
    public ConnectionResult mo17597a(C4083h<? extends C4063d> hVar) {
        C4102c b = hVar.mo17676b();
        C4300a0.m18628a(this.f12776a.get(b) != null, (Object) "The given API was not part of the availability request.");
        return (ConnectionResult) this.f12776a.get(b);
    }

    public String getMessage() {
        ArrayList arrayList = new ArrayList();
        boolean z = true;
        for (C4102c cVar : this.f12776a.keySet()) {
            ConnectionResult connectionResult = (ConnectionResult) this.f12776a.get(cVar);
            if (connectionResult.mo17580R()) {
                z = false;
            }
            String a = cVar.mo17780a();
            String valueOf = String.valueOf(connectionResult);
            StringBuilder sb = new StringBuilder(String.valueOf(a).length() + 2 + String.valueOf(valueOf).length());
            sb.append(a);
            sb.append(": ");
            sb.append(valueOf);
            arrayList.add(sb.toString());
        }
        StringBuilder sb2 = new StringBuilder();
        if (z) {
            sb2.append("None of the queried APIs are available. ");
        } else {
            sb2.append("Some of the queried APIs are unavailable. ");
        }
        sb2.append(TextUtils.join("; ", arrayList));
        return sb2.toString();
    }

    /* renamed from: a */
    public ConnectionResult mo17598a(C4235j<? extends C4063d> jVar) {
        C4102c b = jVar.mo17676b();
        C4300a0.m18628a(this.f12776a.get(b) != null, (Object) "The given API was not part of the availability request.");
        return (ConnectionResult) this.f12776a.get(b);
    }

    /* renamed from: a */
    public final C0635a<C4102c<?>, ConnectionResult> mo17596a() {
        return this.f12776a;
    }
}
