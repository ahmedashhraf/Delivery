package com.google.api.client.googleapis.extensions.android.gms.auth;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.auth.C4025b;
import com.google.android.gms.auth.GoogleAuthException;
import com.google.android.gms.auth.GooglePlayServicesAvailabilityException;
import com.google.android.gms.auth.UserRecoverableAuthException;
import com.google.android.gms.common.C4054a;
import com.google.api.client.http.C7255b0;
import com.google.api.client.http.C7298p;
import com.google.api.client.http.C7299q;
import com.google.api.client.http.C7305u;
import com.google.api.client.http.C7308w;
import com.google.api.client.http.C7309x;
import java.io.IOException;
import java.util.Collection;
import p076c.p112d.p134b.p135a.p143g.C2766f;
import p076c.p112d.p134b.p135a.p143g.C6365c;
import p076c.p112d.p134b.p135a.p143g.C6381h0;
import p076c.p112d.p134b.p135a.p143g.C6389k0;
import p076c.p112d.p134b.p135a.p143g.C6435u;
import p076c.p112d.p134b.p135a.p235c.p242g.p243a.p244a.C6235a;

@C2766f
/* renamed from: com.google.api.client.googleapis.extensions.android.gms.auth.a */
/* compiled from: GoogleAccountCredential */
public class C7242a implements C7308w {

    /* renamed from: a */
    final Context f20466a;

    /* renamed from: b */
    final String f20467b;

    /* renamed from: c */
    private final C6235a f20468c;

    /* renamed from: d */
    private String f20469d;

    /* renamed from: e */
    private Account f20470e;

    /* renamed from: f */
    private C6389k0 f20471f = C6389k0.f17813a;

    /* renamed from: g */
    private C6365c f20472g;

    @C2766f
    /* renamed from: com.google.api.client.googleapis.extensions.android.gms.auth.a$a */
    /* compiled from: GoogleAccountCredential */
    class C7243a implements C7298p, C7255b0 {

        /* renamed from: a */
        boolean f20473a;

        /* renamed from: b */
        String f20474b;

        C7243a() {
        }

        /* renamed from: a */
        public void mo25080a(C7305u uVar) throws IOException {
            try {
                this.f20474b = C7242a.this.mo28775i();
                C7299q i = uVar.mo29111i();
                String str = "Bearer ";
                String valueOf = String.valueOf(this.f20474b);
                i.mo29020f(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
            } catch (GooglePlayServicesAvailabilityException e) {
                throw new GooglePlayServicesAvailabilityIOException(e);
            } catch (UserRecoverableAuthException e2) {
                throw new UserRecoverableAuthIOException(e2);
            } catch (GoogleAuthException e3) {
                throw new GoogleAuthIOException(e3);
            }
        }

        /* renamed from: a */
        public boolean mo25648a(C7305u uVar, C7309x xVar, boolean z) {
            if (xVar.mo29153j() != 401 || this.f20473a) {
                return false;
            }
            this.f20473a = true;
            C4025b.m17464c(C7242a.this.f20466a, this.f20474b);
            return true;
        }
    }

    public C7242a(Context context, String str) {
        this.f20468c = new C6235a(context);
        this.f20466a = context;
        this.f20467b = str;
    }

    /* renamed from: a */
    public static C7242a m34847a(Context context, Collection<String> collection) {
        C6381h0.m29666a(collection != null && collection.iterator().hasNext());
        String str = "oauth2: ";
        String valueOf = String.valueOf(C6435u.m29851a(' ').mo25875a((Iterable<?>) collection));
        return new C7242a(context, valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
    }

    /* renamed from: b */
    public void mo25083b(C7305u uVar) {
        C7243a aVar = new C7243a();
        uVar.mo29086a((C7298p) aVar);
        uVar.mo29081a((C7255b0) aVar);
    }

    /* renamed from: c */
    public final Context mo28769c() {
        return this.f20466a;
    }

    /* renamed from: d */
    public final C6235a mo28770d() {
        return this.f20468c;
    }

    /* renamed from: e */
    public final String mo28771e() {
        return this.f20467b;
    }

    /* renamed from: f */
    public final Account mo28772f() {
        return this.f20470e;
    }

    /* renamed from: g */
    public final String mo28773g() {
        return this.f20469d;
    }

    /* renamed from: h */
    public final C6389k0 mo28774h() {
        return this.f20471f;
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0007 */
    /* JADX WARNING: Removed duplicated region for block: B:3:0x0007 A[LOOP:0: B:3:0x0007->B:15:0x0007, LOOP_START, SYNTHETIC, Splitter:B:3:0x0007] */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String mo28775i() throws java.io.IOException, com.google.android.gms.auth.GoogleAuthException {
        /*
            r3 = this;
            c.d.b.a.g.c r0 = r3.f20472g
            if (r0 == 0) goto L_0x0007
            r0.reset()
        L_0x0007:
            android.content.Context r0 = r3.f20466a     // Catch:{ IOException -> 0x0012 }
            java.lang.String r1 = r3.f20469d     // Catch:{ IOException -> 0x0012 }
            java.lang.String r2 = r3.f20467b     // Catch:{ IOException -> 0x0012 }
            java.lang.String r0 = com.google.android.gms.auth.C4025b.m17455a(r0, r1, r2)     // Catch:{ IOException -> 0x0012 }
            return r0
        L_0x0012:
            r0 = move-exception
            c.d.b.a.g.c r1 = r3.f20472g     // Catch:{ InterruptedException -> 0x0007 }
            if (r1 == 0) goto L_0x0022
            c.d.b.a.g.k0 r1 = r3.f20471f     // Catch:{ InterruptedException -> 0x0007 }
            c.d.b.a.g.c r2 = r3.f20472g     // Catch:{ InterruptedException -> 0x0007 }
            boolean r1 = p076c.p112d.p134b.p135a.p143g.C6370d.m29639a(r1, r2)     // Catch:{ InterruptedException -> 0x0007 }
            if (r1 == 0) goto L_0x0022
            goto L_0x0007
        L_0x0022:
            goto L_0x0024
        L_0x0023:
            throw r0
        L_0x0024:
            goto L_0x0023
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.api.client.googleapis.extensions.android.gms.auth.C7242a.mo28775i():java.lang.String");
    }

    /* renamed from: j */
    public final Intent mo28776j() {
        return C4054a.m17522a(this.f20470e, null, new String[]{"com.google"}, true, null, null, null, null);
    }

    /* renamed from: a */
    public static C7242a m34846a(Context context, String str) {
        C6381h0.m29666a(str.length() != 0);
        String str2 = "audience:";
        String valueOf = String.valueOf(str);
        return new C7242a(context, valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
    }

    /* renamed from: b */
    public C6365c mo28768b() {
        return this.f20472g;
    }

    /* renamed from: a */
    public final C7242a mo28766a(String str) {
        this.f20470e = this.f20468c.mo25364a(str);
        if (this.f20470e == null) {
            str = null;
        }
        this.f20469d = str;
        return this;
    }

    /* renamed from: a */
    public final C7242a mo28763a(Account account) {
        String str;
        this.f20470e = account;
        if (account == null) {
            str = null;
        } else {
            str = account.name;
        }
        this.f20469d = str;
        return this;
    }

    /* renamed from: a */
    public final Account[] mo28767a() {
        return this.f20468c.mo25367b();
    }

    /* renamed from: a */
    public C7242a mo28764a(C6365c cVar) {
        this.f20472g = cVar;
        return this;
    }

    /* renamed from: a */
    public final C7242a mo28765a(C6389k0 k0Var) {
        this.f20471f = (C6389k0) C6381h0.m29663a(k0Var);
        return this;
    }
}
