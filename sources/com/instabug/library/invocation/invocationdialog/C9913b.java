package com.instabug.library.invocation.invocationdialog;

import android.os.Handler;
import com.instabug.library.core.p382ui.BasePresenter;
import com.instabug.library.invocation.InstabugInvocationEvent;
import com.instabug.library.invocation.InvocationManager;
import com.instabug.library.invocation.invocationdialog.C9910a.C9911a;
import com.instabug.library.invocation.invocationdialog.C9910a.C9912b;
import com.instabug.library.settings.SettingsManager;
import p205i.p471b.p472a.p473a.p474c.C13938g;

/* renamed from: com.instabug.library.invocation.invocationdialog.b */
/* compiled from: InstabugDialogActivityPresenter */
public class C9913b extends BasePresenter<C9912b> implements C9911a {

    /* renamed from: c */
    private static transient /* synthetic */ boolean[] f26355c;

    /* renamed from: a */
    private final C9912b f26356a = ((C9912b) this.view.get());

    /* renamed from: b */
    private Handler f26357b;

    /* renamed from: com.instabug.library.invocation.invocationdialog.b$a */
    /* compiled from: InstabugDialogActivityPresenter */
    class C9914a implements Runnable {

        /* renamed from: b */
        private static transient /* synthetic */ boolean[] f26358b;

        /* renamed from: a */
        final /* synthetic */ C9913b f26359a;

        C9914a(C9913b bVar) {
            boolean[] a = m46136a();
            this.f26359a = bVar;
            a[0] = true;
        }

        /* renamed from: a */
        private static /* synthetic */ boolean[] m46136a() {
            boolean[] zArr = f26358b;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(-560886574788829868L, "com/instabug/library/invocation/invocationdialog/InstabugDialogActivityPresenter$1", 2);
            f26358b = a;
            return a;
        }

        public void run() {
            boolean[] a = m46136a();
            C9913b.m46128a(this.f26359a).finishActivity();
            a[1] = true;
        }
    }

    public C9913b(C9912b bVar) {
        boolean[] i = m46131i();
        super(bVar);
        i[0] = true;
        i[1] = true;
    }

    /* renamed from: a */
    static /* synthetic */ C9912b m46128a(C9913b bVar) {
        boolean[] i = m46131i();
        C9912b bVar2 = bVar.f26356a;
        i[23] = true;
        return bVar2;
    }

    /* renamed from: g */
    private void m46129g() {
        boolean[] i = m46131i();
        this.f26357b = new Handler();
        if (this.f26356a == null) {
            i[10] = true;
        } else {
            i[11] = true;
            this.f26357b.postDelayed(new C9914a(this), 10000);
            i[12] = true;
        }
        i[13] = true;
    }

    /* renamed from: h */
    private void m46130h() {
        boolean[] i = m46131i();
        Handler handler = this.f26357b;
        if (handler == null) {
            i[14] = true;
        } else {
            i[15] = true;
            handler.removeCallbacksAndMessages(null);
            i[16] = true;
        }
        i[17] = true;
    }

    /* renamed from: i */
    private static /* synthetic */ boolean[] m46131i() {
        boolean[] zArr = f26355c;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(-2240698455255079567L, "com/instabug/library/invocation/invocationdialog/InstabugDialogActivityPresenter", 24);
        f26355c = a;
        return a;
    }

    /* renamed from: c */
    public void mo35232c() {
        boolean[] i = m46131i();
        m46130h();
        i[8] = true;
        SettingsManager.getInstance().setShouldAutoShowOnboarding(false);
        i[9] = true;
    }

    /* renamed from: d */
    public void mo35233d() {
        boolean[] i = m46131i();
        InstabugInvocationEvent[] currentInstabugInvocationEvents = InvocationManager.getInstance().getCurrentInstabugInvocationEvents();
        int length = currentInstabugInvocationEvents.length;
        i[2] = true;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                i[3] = true;
                break;
            } else if (currentInstabugInvocationEvents[i2] == InstabugInvocationEvent.SHAKE) {
                i[4] = true;
                m46129g();
                i[5] = true;
                break;
            } else {
                i2++;
                i[6] = true;
            }
        }
        i[7] = true;
    }

    /* renamed from: e */
    public void mo35234e() {
        boolean[] i = m46131i();
        m46130h();
        i[18] = true;
    }

    /* renamed from: f */
    public void mo35235f() {
        boolean[] i = m46131i();
        if (SettingsManager.getInstance().getOnInvokeCallback() == null) {
            i[19] = true;
        } else {
            i[20] = true;
            SettingsManager.getInstance().getOnInvokeCallback().onInvoke();
            i[21] = true;
        }
        i[22] = true;
    }
}
