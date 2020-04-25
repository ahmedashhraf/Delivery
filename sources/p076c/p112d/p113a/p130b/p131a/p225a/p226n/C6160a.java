package p076c.p112d.p113a.p130b.p131a.p225a.p226n;

import android.app.Activity;
import android.content.Context;
import com.google.android.play.core.install.C7120a;
import com.google.android.play.core.install.InstallException;
import com.google.android.play.core.install.InstallState;
import com.google.android.play.core.tasks.C7191d;
import com.google.android.play.core.tasks.C7194f;
import p076c.p112d.p113a.p130b.p131a.p132c.C6162a;
import p076c.p112d.p113a.p130b.p131a.p225a.C6147a;
import p076c.p112d.p113a.p130b.p131a.p225a.C6148b;
import p076c.p112d.p113a.p130b.p131a.p225a.C6150d;

/* renamed from: c.d.a.b.a.a.n.a */
public class C6160a implements C6148b {

    /* renamed from: a */
    private final C6150d f17362a;

    /* renamed from: b */
    private final Context f17363b;

    /* renamed from: c */
    private int f17364c = 0;

    /* renamed from: d */
    private int f17365d = 0;

    /* renamed from: e */
    private boolean f17366e = false;

    /* renamed from: f */
    private int f17367f = 0;

    /* renamed from: g */
    private boolean f17368g = false;

    /* renamed from: h */
    private boolean f17369h = false;

    /* renamed from: i */
    private boolean f17370i = false;

    /* renamed from: j */
    private Integer f17371j;

    /* renamed from: k */
    private Integer f17372k;

    public C6160a(Context context) {
        this.f17362a = new C6150d(context);
        this.f17363b = context;
    }

    /* renamed from: q */
    private final int m28276q() {
        if (!this.f17366e) {
            return 1;
        }
        int i = this.f17364c;
        return (i == 0 || i == 4 || i == 5 || i == 6) ? 2 : 3;
    }

    /* renamed from: r */
    private final void m28277r() {
        this.f17362a.mo10355a(InstallState.m34297a(this.f17364c, this.f17365d, this.f17363b.getPackageName()));
    }

    /* renamed from: a */
    public C7191d<Void> mo25042a() {
        int i = this.f17365d;
        if (i != 0 && i != 1) {
            return C7194f.m34505a((Exception) new InstallException(i));
        }
        int i2 = this.f17364c;
        if (i2 != 11) {
            return i2 == 3 ? C7194f.m34505a((Exception) new InstallException(-8)) : C7194f.m34505a((Exception) new InstallException(-7));
        }
        this.f17364c = 3;
        this.f17370i = true;
        if (Integer.valueOf(0).equals(this.f17372k)) {
            m28277r();
        }
        return C7194f.m34506a(null);
    }

    /* renamed from: a */
    public void mo25056a(int i) {
        this.f17365d = i;
    }

    /* renamed from: a */
    public void mo25043a(C7120a aVar) {
        this.f17362a.mo10354a((C6162a<StateT>) aVar);
    }

    /* renamed from: a */
    public void mo25057a(Integer num) {
        this.f17371j = num;
        this.f17365d = 1;
    }

    /* renamed from: a */
    public boolean mo25044a(C6147a aVar, int i, Activity activity, int i2) {
        Integer num;
        if (!aVar.mo25036a(i)) {
            return false;
        }
        if (i == 1) {
            this.f17369h = true;
            num = Integer.valueOf(1);
        } else {
            this.f17368g = true;
            num = Integer.valueOf(0);
        }
        this.f17372k = num;
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0040  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.android.play.core.tasks.C7191d<p076c.p112d.p113a.p130b.p131a.p225a.C6147a> mo25045b() {
        /*
            r11 = this;
            int r0 = r11.f17365d
            r1 = 1
            if (r0 == 0) goto L_0x0011
            if (r0 == r1) goto L_0x0011
            com.google.android.play.core.install.InstallException r1 = new com.google.android.play.core.install.InstallException
            r1.<init>(r0)
            com.google.android.play.core.tasks.d r0 = com.google.android.play.core.tasks.C7194f.m34505a(r1)
            return r0
        L_0x0011:
            int r0 = r11.m28276q()
            r2 = 2
            r3 = 0
            r4 = 0
            if (r0 != r2) goto L_0x0039
            int r0 = r11.f17365d
            if (r0 == 0) goto L_0x002c
            if (r0 != r1) goto L_0x0039
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
            java.lang.Integer r5 = r11.f17371j
            boolean r0 = r0.equals(r5)
            if (r0 == 0) goto L_0x0039
        L_0x002c:
            android.content.Context r0 = r11.f17363b
            android.content.Intent r5 = new android.content.Intent
            r5.<init>()
            android.app.PendingIntent r0 = android.app.PendingIntent.getBroadcast(r0, r4, r5, r4)
            r10 = r0
            goto L_0x003a
        L_0x0039:
            r10 = r3
        L_0x003a:
            int r0 = r11.m28276q()
            if (r0 != r2) goto L_0x005d
            int r0 = r11.f17365d
            if (r0 == 0) goto L_0x0052
            if (r0 != r1) goto L_0x005d
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            java.lang.Integer r1 = r11.f17371j
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x005d
        L_0x0052:
            android.content.Context r0 = r11.f17363b
            android.content.Intent r1 = new android.content.Intent
            r1.<init>()
            android.app.PendingIntent r3 = android.app.PendingIntent.getBroadcast(r0, r4, r1, r4)
        L_0x005d:
            r9 = r3
            android.content.Context r0 = r11.f17363b
            java.lang.String r5 = r0.getPackageName()
            int r6 = r11.f17367f
            int r7 = r11.m28276q()
            int r8 = r11.f17364c
            c.d.a.b.a.a.a r0 = p076c.p112d.p113a.p130b.p131a.p225a.C6147a.m28230a(r5, r6, r7, r8, r9, r10)
            com.google.android.play.core.tasks.d r0 = com.google.android.play.core.tasks.C7194f.m34506a(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p076c.p112d.p113a.p130b.p131a.p225a.p226n.C6160a.mo25045b():com.google.android.play.core.tasks.d");
    }

    /* renamed from: b */
    public void mo25058b(int i) {
        this.f17366e = true;
        this.f17367f = i;
    }

    /* renamed from: b */
    public void mo25046b(C7120a aVar) {
        this.f17362a.mo10357b(aVar);
    }

    /* renamed from: c */
    public void mo25059c() {
        int i = this.f17364c;
        if (i == 2 || i == 1) {
            this.f17364c = 11;
            if (Integer.valueOf(0).equals(this.f17372k)) {
                m28277r();
            } else if (Integer.valueOf(1).equals(this.f17372k)) {
                mo25042a();
            }
        }
    }

    /* renamed from: d */
    public void mo25060d() {
        int i = this.f17364c;
        if (i == 1 || i == 2) {
            this.f17364c = 5;
            if (Integer.valueOf(0).equals(this.f17372k)) {
                m28277r();
            }
            this.f17372k = null;
            this.f17369h = false;
            this.f17364c = 0;
        }
    }

    /* renamed from: e */
    public void mo25061e() {
        if (this.f17364c == 1) {
            this.f17364c = 2;
            if (Integer.valueOf(0).equals(this.f17372k)) {
                m28277r();
            }
        }
    }

    /* renamed from: f */
    public Integer mo25062f() {
        return this.f17371j;
    }

    /* renamed from: g */
    public Integer mo25063g() {
        return this.f17372k;
    }

    /* renamed from: h */
    public void mo25064h() {
        if (this.f17364c == 3) {
            this.f17364c = 4;
            this.f17366e = false;
            this.f17367f = 0;
            this.f17369h = false;
            this.f17370i = false;
            if (Integer.valueOf(0).equals(this.f17372k)) {
                m28277r();
            }
            this.f17372k = null;
            this.f17364c = 0;
        }
    }

    /* renamed from: i */
    public void mo25065i() {
        if (this.f17364c == 3) {
            this.f17364c = 5;
            if (Integer.valueOf(0).equals(this.f17372k)) {
                m28277r();
            }
            this.f17372k = null;
            this.f17370i = false;
            this.f17369h = false;
            this.f17364c = 0;
        }
    }

    /* renamed from: j */
    public boolean mo25066j() {
        return this.f17368g;
    }

    /* renamed from: k */
    public boolean mo25067k() {
        return this.f17369h;
    }

    /* renamed from: l */
    public boolean mo25068l() {
        return this.f17370i;
    }

    /* renamed from: m */
    public void mo25069m() {
        this.f17366e = false;
    }

    /* renamed from: n */
    public void mo25070n() {
        if (this.f17368g || this.f17369h) {
            this.f17368g = false;
            this.f17364c = 1;
            if (Integer.valueOf(0).equals(this.f17372k)) {
                m28277r();
            }
        }
    }

    /* renamed from: o */
    public void mo25071o() {
        int i = this.f17364c;
        if (i == 1 || i == 2) {
            this.f17364c = 6;
            if (Integer.valueOf(0).equals(this.f17372k)) {
                m28277r();
            }
            this.f17372k = null;
            this.f17369h = false;
            this.f17364c = 0;
        }
    }

    /* renamed from: p */
    public void mo25072p() {
        if (this.f17368g || this.f17369h) {
            this.f17368g = false;
            this.f17369h = false;
            this.f17372k = null;
            this.f17364c = 0;
        }
    }
}
