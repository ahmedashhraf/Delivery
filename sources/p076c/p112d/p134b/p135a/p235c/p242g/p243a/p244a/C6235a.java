package p076c.p112d.p134b.p135a.p235c.p242g.p243a.p244a;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.content.Context;
import p076c.p112d.p134b.p135a.p143g.C2766f;
import p076c.p112d.p134b.p135a.p143g.C6381h0;

@C2766f
/* renamed from: c.d.b.a.c.g.a.a.a */
/* compiled from: GoogleAccountManager */
public final class C6235a {

    /* renamed from: b */
    public static final String f17547b = "com.google";

    /* renamed from: a */
    private final AccountManager f17548a;

    public C6235a(AccountManager accountManager) {
        this.f17548a = (AccountManager) C6381h0.m29663a(accountManager);
    }

    /* renamed from: a */
    public AccountManager mo25365a() {
        return this.f17548a;
    }

    /* renamed from: b */
    public Account[] mo25367b() {
        return this.f17548a.getAccountsByType("com.google");
    }

    /* renamed from: a */
    public Account mo25364a(String str) {
        Account[] b;
        if (str != null) {
            for (Account account : mo25367b()) {
                if (str.equals(account.name)) {
                    return account;
                }
            }
        }
        return null;
    }

    /* renamed from: b */
    public void mo25366b(String str) {
        this.f17548a.invalidateAuthToken("com.google", str);
    }

    public C6235a(Context context) {
        this(AccountManager.get(context));
    }
}
