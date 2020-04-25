package com.google.firebase.iid;

import androidx.annotation.Keep;
import com.google.android.gms.common.annotation.C4056a;
import com.google.firebase.FirebaseApp;
import com.google.firebase.components.C8641e;
import com.google.firebase.components.C8650i;
import com.google.firebase.components.C8659o;
import com.google.firebase.iid.internal.FirebaseInstanceIdInternal;
import com.google.firebase.p192p.C8763f;
import com.google.firebase.p192p.C8764g;
import com.google.firebase.p314i.C8674d;
import java.util.Arrays;
import java.util.List;

@C4056a
@Keep
/* compiled from: com.google.firebase:firebase-iid@@20.0.0 */
public final class Registrar implements C8650i {

    /* renamed from: com.google.firebase.iid.Registrar$a */
    /* compiled from: com.google.firebase:firebase-iid@@20.0.0 */
    private static class C8676a implements FirebaseInstanceIdInternal {

        /* renamed from: a */
        private final FirebaseInstanceId f22785a;

        public C8676a(FirebaseInstanceId firebaseInstanceId) {
            this.f22785a = firebaseInstanceId;
        }

        public final String getId() {
            return this.f22785a.mo32071c();
        }

        public final String getToken() {
            return this.f22785a.mo32074e();
        }
    }

    @Keep
    public final List<C8641e<?>> getComponents() {
        Class<FirebaseInstanceId> cls = FirebaseInstanceId.class;
        return Arrays.asList(new C8641e[]{C8641e.m40631a(cls).mo32002a(C8659o.m40696c(FirebaseApp.class)).mo32002a(C8659o.m40696c(C8674d.class)).mo32002a(C8659o.m40696c(C8764g.class)).mo32001a(C8709n.f22840a).mo32000a().mo32004b(), C8641e.m40631a(FirebaseInstanceIdInternal.class).mo32002a(C8659o.m40696c(cls)).mo32001a(C8711o.f22845a).mo32004b(), C8763f.m41064a("fire-iid", "20.0.0")});
    }
}
