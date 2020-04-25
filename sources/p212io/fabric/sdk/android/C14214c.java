package p212io.fabric.sdk.android;

import android.util.Log;

/* renamed from: io.fabric.sdk.android.c */
/* compiled from: DefaultLogger */
public class C14214c implements C14228l {

    /* renamed from: a */
    private int f41918a;

    public C14214c(int i) {
        this.f41918a = i;
    }

    /* renamed from: a */
    public boolean mo45041a(String str, int i) {
        return this.f41918a <= i || Log.isLoggable(str, i);
    }

    /* renamed from: d */
    public void mo45043d(String str, String str2, Throwable th) {
        boolean a = mo45041a(str, 3);
    }

    /* renamed from: e */
    public void mo45045e(String str, String str2, Throwable th) {
        boolean a = mo45041a(str, 6);
    }

    /* renamed from: i */
    public void mo45047i(String str, String str2, Throwable th) {
        boolean a = mo45041a(str, 4);
    }

    public void log(int i, String str, String str2) {
        mo45040a(i, str, str2, false);
    }

    /* renamed from: v */
    public void mo45050v(String str, String str2, Throwable th) {
        boolean a = mo45041a(str, 2);
    }

    /* renamed from: w */
    public void mo45052w(String str, String str2, Throwable th) {
        boolean a = mo45041a(str, 5);
    }

    /* renamed from: a */
    public int mo45038a() {
        return this.f41918a;
    }

    /* renamed from: d */
    public void mo45042d(String str, String str2) {
        mo45043d(str, str2, null);
    }

    /* renamed from: e */
    public void mo45044e(String str, String str2) {
        mo45045e(str, str2, null);
    }

    /* renamed from: i */
    public void mo45046i(String str, String str2) {
        mo45047i(str, str2, null);
    }

    /* renamed from: v */
    public void mo45049v(String str, String str2) {
        mo45050v(str, str2, null);
    }

    /* renamed from: w */
    public void mo45051w(String str, String str2) {
        mo45052w(str, str2, null);
    }

    public C14214c() {
        this.f41918a = 4;
    }

    /* renamed from: a */
    public void mo45039a(int i) {
        this.f41918a = i;
    }

    /* renamed from: a */
    public void mo45040a(int i, String str, String str2, boolean z) {
        if (!z) {
            boolean a = mo45041a(str, i);
        }
    }
}
