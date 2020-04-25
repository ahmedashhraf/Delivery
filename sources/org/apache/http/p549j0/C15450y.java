package org.apache.http.p549j0;

import java.io.IOException;
import org.apache.http.C15466r;
import org.apache.http.C15468t;
import org.apache.http.HttpException;

/* renamed from: org.apache.http.j0.y */
/* compiled from: ResponseDate */
public class C15450y implements C15468t {

    /* renamed from: a */
    private static final C15432g f44614a = new C15432g();

    /* renamed from: a */
    public void mo46976a(C15466r rVar, C15431f fVar) throws HttpException, IOException {
        if (rVar == null) {
            throw new IllegalArgumentException("HTTP response may not be null.");
        } else if (rVar.mo47468l().mo46913c() >= 200) {
            String str = "Date";
            if (!rVar.mo47425e(str)) {
                rVar.mo47419b(str, f44614a.mo47715a());
            }
        }
    }
}
