package com.instabug.chat.p361ui;

import android.content.Context;
import com.instabug.chat.cache.ChatsCacheManager;
import com.instabug.chat.model.Attachment;
import com.instabug.chat.model.Chat;
import com.instabug.chat.settings.C9441a;
import com.instabug.library.OnSdkDismissCallback;
import com.instabug.library.OnSdkDismissCallback.DismissType;
import com.instabug.library.OnSdkDismissCallback.ReportType;
import com.instabug.library.OnSdkDismissedCallback;
import com.instabug.library.bugreporting.model.Bug.Type;
import com.instabug.library.core.p382ui.BasePresenter;
import java.lang.ref.WeakReference;
import p205i.p471b.p472a.p473a.p474c.C13938g;

/* renamed from: com.instabug.chat.ui.e */
/* compiled from: ChatPresenter */
public class C9497e extends BasePresenter<C9459b> implements C9458a {

    /* renamed from: a */
    private static transient /* synthetic */ boolean[] f25151a;

    public C9497e(C9459b bVar) {
        boolean[] h = m44492h();
        super(bVar);
        h[0] = true;
    }

    /* renamed from: e */
    private void m44489e() {
        boolean[] h = m44492h();
        if (m44490f()) {
            WeakReference<V> weakReference = this.view;
            if (weakReference == null) {
                h[28] = true;
            } else {
                h[29] = true;
                C9459b bVar = (C9459b) weakReference.get();
                if (bVar == null) {
                    h[30] = true;
                } else {
                    h[31] = true;
                    bVar.mo34057d();
                    h[32] = true;
                }
                h[33] = true;
            }
        } else {
            mo34074d();
            h[34] = true;
        }
        h[35] = true;
    }

    /* renamed from: f */
    private boolean m44490f() {
        boolean z;
        boolean[] h = m44492h();
        if (ChatsCacheManager.getValidChats().size() > 0) {
            h[58] = true;
            z = true;
        } else {
            z = false;
            h[59] = true;
        }
        h[60] = true;
        return z;
    }

    /* renamed from: g */
    private Chat m44491g() {
        boolean[] h = m44492h();
        WeakReference<V> weakReference = this.view;
        if (weakReference == null) {
            h[61] = true;
        } else {
            h[62] = true;
            C9459b bVar = (C9459b) weakReference.get();
            if (bVar == null) {
                h[63] = true;
            } else {
                h[64] = true;
                Chat addOfflineChat = ChatsCacheManager.addOfflineChat((Context) bVar.getViewContext());
                h[65] = true;
                return addOfflineChat;
            }
        }
        h[66] = true;
        return null;
    }

    /* renamed from: h */
    private static /* synthetic */ boolean[] m44492h() {
        boolean[] zArr = f25151a;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(-4885630011055987434L, "com/instabug/chat/ui/ChatPresenter", 67);
        f25151a = a;
        return a;
    }

    /* renamed from: a */
    public void mo34071a(String str) {
        boolean[] h = m44492h();
        m44488b(str);
        h[20] = true;
    }

    /* renamed from: b */
    public void mo34072b(int i) {
        boolean[] h = m44492h();
        if (i == 160) {
            h[1] = true;
            m44489e();
            h[2] = true;
        } else if (i == 161) {
            WeakReference<V> weakReference = this.view;
            if (weakReference == null) {
                h[3] = true;
            } else {
                h[4] = true;
                C9459b bVar = (C9459b) weakReference.get();
                if (bVar == null) {
                    h[5] = true;
                } else {
                    h[6] = true;
                    m44488b(bVar.mo34056c());
                    h[7] = true;
                }
                h[8] = true;
            }
        } else if (i == 162) {
            h[9] = true;
            mo34074d();
            h[10] = true;
        } else if (i != 164) {
            h[11] = true;
        } else {
            WeakReference<V> weakReference2 = this.view;
            if (weakReference2 == null) {
                h[12] = true;
            } else {
                h[13] = true;
                C9459b bVar2 = (C9459b) weakReference2.get();
                if (bVar2 == null) {
                    h[14] = true;
                } else {
                    h[15] = true;
                    String c = bVar2.mo34056c();
                    h[16] = true;
                    Attachment e = bVar2.mo34058e();
                    h[17] = true;
                    m44487a(c, e);
                    h[18] = true;
                }
            }
        }
        h[19] = true;
    }

    /* renamed from: c */
    public void mo34073c() {
        boolean[] h = m44492h();
        OnSdkDismissCallback l = C9441a.m44209l();
        if (l != null) {
            h[22] = true;
            l.call(DismissType.CANCEL, ReportType.OTHER);
            h[23] = true;
            return;
        }
        OnSdkDismissedCallback k = C9441a.m44208k();
        if (k == null) {
            h[24] = true;
        } else {
            h[25] = true;
            k.onSdkDismissed(OnSdkDismissedCallback.DismissType.CANCEL, Type.NOT_AVAILABLE);
            h[26] = true;
        }
        h[27] = true;
    }

    /* renamed from: d */
    public void mo34074d() {
        boolean[] h = m44492h();
        m44488b(m44491g().getId());
        h[21] = true;
    }

    /* renamed from: a */
    private void m44487a(String str, Attachment attachment) {
        C9459b bVar;
        boolean[] h = m44492h();
        WeakReference<V> weakReference = this.view;
        if (weakReference == null) {
            h[47] = true;
            bVar = null;
        } else {
            h[48] = true;
            bVar = (C9459b) weakReference.get();
            h[49] = true;
        }
        if (!m44490f()) {
            h[50] = true;
        } else if (bVar == null) {
            h[51] = true;
        } else {
            h[52] = true;
            bVar.mo34057d();
            h[53] = true;
        }
        if (bVar == null) {
            h[54] = true;
        } else {
            h[55] = true;
            bVar.mo34054a(str, attachment);
            h[56] = true;
        }
        h[57] = true;
    }

    /* renamed from: b */
    private void m44488b(String str) {
        C9459b bVar;
        boolean[] h = m44492h();
        WeakReference<V> weakReference = this.view;
        if (weakReference == null) {
            h[36] = true;
            bVar = null;
        } else {
            h[37] = true;
            bVar = (C9459b) weakReference.get();
            h[38] = true;
        }
        if (!m44490f()) {
            h[39] = true;
        } else if (bVar == null) {
            h[40] = true;
        } else {
            h[41] = true;
            bVar.mo34057d();
            h[42] = true;
        }
        if (bVar == null) {
            h[43] = true;
        } else {
            h[44] = true;
            bVar.mo34053a(str);
            h[45] = true;
        }
        h[46] = true;
    }
}
