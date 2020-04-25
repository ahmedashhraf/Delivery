package org.apache.http.p549j0;

import java.io.IOException;
import org.apache.http.C15466r;
import org.apache.http.C15468t;
import org.apache.http.HttpException;
import org.apache.http.p548i0.C15352d;

/* renamed from: org.apache.http.j0.z */
/* compiled from: ResponseServer */
public class C15451z implements C15468t {
    /* renamed from: a */
    public void mo46976a(C15466r rVar, C15431f fVar) throws HttpException, IOException {
        if (rVar != null) {
            String str = "Server";
            if (!rVar.mo47425e(str)) {
                String str2 = (String) rVar.getParams().mo47549b(C15352d.f44432H);
                if (str2 != null) {
                    rVar.mo47414a(str, str2);
                    return;
                }
                return;
            }
            return;
        }
        throw new IllegalArgumentException("HTTP request may not be null");
    }
}
