package com.google.android.gms.auth.api.proxy;

import com.google.android.gms.common.annotation.C4056a;
import com.google.android.gms.common.api.C4086i;
import com.google.android.gms.common.api.C4237l;
import com.google.android.gms.common.api.C4246q;

@C4056a
/* renamed from: com.google.android.gms.auth.api.proxy.b */
public interface C3978b {

    @C4056a
    /* renamed from: com.google.android.gms.auth.api.proxy.b$a */
    public interface C3979a extends C4246q {
        @C4056a
        /* renamed from: J */
        ProxyResponse mo17437J();
    }

    @C4056a
    /* renamed from: com.google.android.gms.auth.api.proxy.b$b */
    public interface C3980b extends C4246q {
        @C4056a
        /* renamed from: H */
        String mo17438H();
    }

    @C4056a
    /* renamed from: a */
    C4237l<C3980b> mo17435a(C4086i iVar);

    @C4056a
    /* renamed from: a */
    C4237l<C3979a> mo17436a(C4086i iVar, ProxyRequest proxyRequest);
}
