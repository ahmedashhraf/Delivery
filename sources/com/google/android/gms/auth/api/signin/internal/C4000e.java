package com.google.android.gms.auth.api.signin.internal;

import com.google.android.gms.common.api.C4086i;
import com.google.android.gms.common.api.C4237l;
import com.google.android.gms.common.api.C4239m;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C4226y;
import com.google.android.gms.common.internal.C4300a0;
import com.google.android.gms.common.p169n.C4432a;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

/* renamed from: com.google.android.gms.auth.api.signin.internal.e */
public final class C4000e implements Runnable {

    /* renamed from: N */
    private static final C4432a f12688N = new C4432a("RevokeAccessOperation", new String[0]);

    /* renamed from: a */
    private final String f12689a;

    /* renamed from: b */
    private final C4226y f12690b = new C4226y((C4086i) null);

    private C4000e(String str) {
        C4300a0.m18630b(str);
        this.f12689a = str;
    }

    /* renamed from: a */
    public static C4237l<Status> m17393a(String str) {
        if (str == null) {
            return C4239m.m18368a(new Status(4), (C4086i) null);
        }
        C4000e eVar = new C4000e(str);
        new Thread(eVar).start();
        return eVar.f12690b;
    }

    public final void run() {
        Status status = Status.f12782R;
        try {
            String str = "https://accounts.google.com/o/oauth2/revoke?token=";
            String valueOf = String.valueOf(this.f12689a);
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(valueOf.length() != 0 ? str.concat(valueOf) : new String(str)).openConnection();
            httpURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode == 200) {
                status = Status.f12780P;
            } else {
                f12688N.mo18434b("Unable to revoke access!", new Object[0]);
            }
            C4432a aVar = f12688N;
            StringBuilder sb = new StringBuilder(26);
            sb.append("Response Code: ");
            sb.append(responseCode);
            aVar.mo18430a(sb.toString(), new Object[0]);
        } catch (IOException e) {
            C4432a aVar2 = f12688N;
            String str2 = "IOException when revoking access: ";
            String valueOf2 = String.valueOf(e.toString());
            aVar2.mo18434b(valueOf2.length() != 0 ? str2.concat(valueOf2) : new String(str2), new Object[0]);
        } catch (Exception e2) {
            C4432a aVar3 = f12688N;
            String str3 = "Exception when revoking access: ";
            String valueOf3 = String.valueOf(e2.toString());
            aVar3.mo18434b(valueOf3.length() != 0 ? str3.concat(valueOf3) : new String(str3), new Object[0]);
        }
        this.f12690b.mo17744a(status);
    }
}
