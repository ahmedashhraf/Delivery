package com.instabug.featuresrequest.p373ui.p374a;

import androidx.fragment.app.Fragment;
import com.instabug.featuresrequest.models.C9571c;
import com.instabug.featuresrequest.p369b.C9535a;
import com.instabug.featuresrequest.p371d.p372a.C9562a;
import com.instabug.featuresrequest.p371d.p372a.C9565b;
import com.instabug.featuresrequest.p373ui.p374a.C9585a.C9586a;
import com.instabug.library.core.InstabugCore;
import com.instabug.library.core.p382ui.BasePresenter;
import org.json.JSONObject;
import p205i.p471b.p472a.p473a.p474c.C13938g;

/* renamed from: com.instabug.featuresrequest.ui.a.c */
/* compiled from: AddCommentPresenter */
public class C9595c extends BasePresenter<C9586a> implements C9565b<JSONObject> {

    /* renamed from: c */
    private static transient /* synthetic */ boolean[] f25389c;

    /* renamed from: a */
    private final C9562a f25390a;

    /* renamed from: b */
    private final C9586a f25391b = ((C9586a) this.view.get());

    public C9595c(C9586a aVar) {
        boolean[] j = m44863j();
        super(aVar);
        j[0] = true;
        j[1] = true;
        this.f25390a = C9562a.m44678a(((Fragment) aVar.getViewContext()).getContext());
        j[2] = true;
    }

    /* renamed from: j */
    private static /* synthetic */ boolean[] m44863j() {
        boolean[] zArr = f25389c;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(6134377702835681787L, "com/instabug/featuresrequest/ui/addcomment/AddCommentPresenter", 42);
        f25389c = a;
        return a;
    }

    /* renamed from: a */
    public /* synthetic */ void mo34246a(Object obj) {
        boolean[] j = m44863j();
        mo34356a((JSONObject) obj);
        j[41] = true;
    }

    /* renamed from: c */
    public void mo34357c() {
        boolean[] j = m44863j();
        C9586a aVar = this.f25391b;
        if (aVar == null) {
            j[7] = true;
        } else {
            j[8] = true;
            aVar.mo34337c();
            j[9] = true;
        }
        j[10] = true;
    }

    /* renamed from: d */
    public void mo34358d() {
        boolean[] j = m44863j();
        C9586a aVar = this.f25391b;
        if (aVar == null) {
            j[3] = true;
        } else {
            j[4] = true;
            aVar.mo34338d();
            j[5] = true;
        }
        j[6] = true;
    }

    /* renamed from: e */
    public void mo34359e() {
        boolean[] j = m44863j();
        C9586a aVar = this.f25391b;
        if (aVar == null) {
            j[11] = true;
        } else {
            j[12] = true;
            aVar.mo34334a(mo34362h());
            j[13] = true;
            this.f25391b.mo34336b(mo34361g());
            j[14] = true;
        }
        j[15] = true;
    }

    /* renamed from: f */
    public boolean mo34360f() {
        boolean[] j = m44863j();
        boolean b = C9535a.m44611c().mo34222b();
        j[32] = true;
        return b;
    }

    /* renamed from: g */
    public String mo34361g() {
        boolean[] j = m44863j();
        String enteredEmail = InstabugCore.getEnteredEmail();
        j[33] = true;
        return enteredEmail;
    }

    /* renamed from: h */
    public String mo34362h() {
        boolean[] j = m44863j();
        String enteredUsername = InstabugCore.getEnteredUsername();
        j[34] = true;
        return enteredUsername;
    }

    /* renamed from: i */
    public void mo34363i() {
        boolean[] j = m44863j();
        if (this.f25391b == null) {
            j[35] = true;
        } else {
            j[36] = true;
            if (C9535a.m44611c().mo34222b()) {
                j[37] = true;
                this.f25391b.mo34335a(true);
                j[38] = true;
            } else {
                this.f25391b.mo34335a(false);
                j[39] = true;
            }
        }
        j[40] = true;
    }

    /* renamed from: a */
    public void mo34355a(C9571c cVar) {
        boolean[] j = m44863j();
        C9586a aVar = this.f25391b;
        if (aVar == null) {
            j[16] = true;
        } else {
            j[17] = true;
            InstabugCore.setEnteredUsername(aVar.mo34343i());
            j[18] = true;
            InstabugCore.setEnteredEmail(this.f25391b.mo34344j());
            j[19] = true;
            this.f25391b.mo34339e();
            j[20] = true;
        }
        this.f25390a.mo34241a(cVar, (C9565b<JSONObject>) this);
        j[21] = true;
    }

    /* renamed from: a */
    public void mo34356a(JSONObject jSONObject) {
        boolean[] j = m44863j();
        C9586a aVar = this.f25391b;
        if (aVar == null) {
            j[22] = true;
        } else {
            j[23] = true;
            aVar.mo34340f();
            j[24] = true;
            this.f25391b.mo34341g();
            j[25] = true;
        }
        j[26] = true;
    }

    /* renamed from: a */
    public void mo34247a(Throwable th) {
        boolean[] j = m44863j();
        C9586a aVar = this.f25391b;
        if (aVar == null) {
            j[27] = true;
        } else {
            j[28] = true;
            aVar.mo34340f();
            j[29] = true;
            this.f25391b.mo34342h();
            j[30] = true;
        }
        j[31] = true;
    }
}
