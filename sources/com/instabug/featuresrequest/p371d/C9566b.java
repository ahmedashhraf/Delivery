package com.instabug.featuresrequest.p371d;

import com.instabug.featuresrequest.models.C9571c;
import com.instabug.library.network.Request;
import org.json.JSONException;
import p205i.p471b.p472a.p473a.p474c.C13938g;

/* renamed from: com.instabug.featuresrequest.d.b */
/* compiled from: AddCommentUtil */
public class C9566b {

    /* renamed from: a */
    private static transient /* synthetic */ boolean[] f25283a;

    /* renamed from: a */
    public static void m44690a(Request request, C9571c cVar) throws JSONException {
        boolean[] a = m44691a();
        request.mo35528a("body", cVar.mo34292h());
        a[1] = true;
        request.mo35528a("created_at", Long.valueOf(cVar.mo34308a()));
        a[2] = true;
        if (cVar.mo34294j() == null) {
            a[3] = true;
        } else {
            a[4] = true;
            if (cVar.mo34294j().trim().isEmpty()) {
                a[5] = true;
            } else {
                a[6] = true;
                request.mo35528a("name", cVar.mo34294j());
                a[7] = true;
            }
        }
        request.mo35528a("email", cVar.mo34300n());
        a[8] = true;
    }

    /* renamed from: a */
    private static /* synthetic */ boolean[] m44691a() {
        boolean[] zArr = f25283a;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(-27197018421790039L, "com/instabug/featuresrequest/network/AddCommentUtil", 9);
        f25283a = a;
        return a;
    }
}
