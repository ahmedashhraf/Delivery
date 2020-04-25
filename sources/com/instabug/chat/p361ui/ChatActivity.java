package com.instabug.chat.p361ui;

import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.C0195i0;
import androidx.fragment.app.C1382h;
import androidx.fragment.app.C1406n;
import com.facebook.share.internal.MessengerShareContentUtility;
import com.instabug.chat.C9371R;
import com.instabug.chat.ChatPlugin;
import com.instabug.chat.model.Attachment;
import com.instabug.chat.p361ui.C9457c.C9466e;
import com.instabug.chat.p361ui.p363d.C9492c;
import com.instabug.chat.p361ui.p363d.C9492c.C9493a;
import com.instabug.library._InstabugActivity;
import com.instabug.library.core.InstabugCore;
import com.instabug.library.core.eventbus.coreeventbus.SDKCoreEvent;
import com.instabug.library.core.eventbus.coreeventbus.SDKCoreEvent.ForegroundStatus;
import com.instabug.library.core.eventbus.coreeventbus.SDKCoreEventPublisher;
import com.instabug.library.core.p382ui.BaseFragmentActivity;
import com.instabug.library.util.InstabugSDKLogger;
import com.instabug.library.util.OrientationUtils;
import p205i.p471b.p472a.p473a.p474c.C13938g;
import p205i.p471b.p472a.p473a.p474c.p475i.C13959t;

/* renamed from: com.instabug.chat.ui.ChatActivity */
public class ChatActivity extends BaseFragmentActivity<C9458a> implements C9459b, C9493a, _InstabugActivity {

    /* renamed from: a */
    private static transient /* synthetic */ boolean[] f25035a;

    public ChatActivity() {
        m44281g()[0] = true;
    }

    /* renamed from: g */
    private static /* synthetic */ boolean[] m44281g() {
        boolean[] zArr = f25035a;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(-130833112487924810L, "com/instabug/chat/ui/ChatActivity", 71);
        f25035a = a;
        return a;
    }

    /* renamed from: a */
    public void mo34053a(String str) {
        String str2 = "chat_fragment";
        boolean[] g = m44281g();
        if (isFinishing()) {
            g[31] = true;
        } else {
            try {
                g[32] = true;
                getSupportFragmentManager().mo6235b();
                g[33] = true;
                C1382h supportFragmentManager = getSupportFragmentManager();
                g[34] = true;
                C1406n a = supportFragmentManager.mo6224a();
                int i = C9371R.C9375id.instabug_fragment_container;
                g[35] = true;
                C1406n a2 = a.mo6395a(i, C9466e.m44342a(str), str2);
                g[36] = true;
                if (getSupportFragmentManager().mo6221a(C9371R.C9375id.instabug_fragment_container) == null) {
                    g[37] = true;
                } else {
                    g[38] = true;
                    a2.mo6401a(str2);
                    g[39] = true;
                }
                a2.mo6100f();
                g[40] = true;
            } catch (IllegalStateException e) {
                g[41] = true;
                StringBuilder sb = new StringBuilder();
                sb.append("Couldn't show Chat fragment due to ");
                g[42] = true;
                sb.append(e.getMessage());
                String sb2 = sb.toString();
                g[43] = true;
                InstabugSDKLogger.m46623e(ChatActivity.class, sb2);
                g[44] = true;
            }
        }
        g[45] = true;
    }

    /* renamed from: b */
    public void mo34055b(String str) {
        boolean[] g = m44281g();
        StringBuilder sb = new StringBuilder();
        sb.append("Chat id: ");
        sb.append(str);
        InstabugSDKLogger.m46626v(C9492c.class, sb.toString());
        g[66] = true;
        ((C9458a) this.presenter).mo34071a(str);
        g[67] = true;
    }

    @C0195i0
    /* renamed from: c */
    public String mo34056c() {
        boolean[] g = m44281g();
        Bundle extras = getIntent().getExtras();
        g[62] = true;
        String string = extras.getString("chat_number");
        g[63] = true;
        return string;
    }

    /* renamed from: d */
    public void mo34057d() {
        boolean[] g = m44281g();
        if (isFinishing()) {
            g[23] = true;
        } else {
            g[24] = true;
            C1382h supportFragmentManager = getSupportFragmentManager();
            g[25] = true;
            String str = "chats_fragment";
            if (supportFragmentManager.mo6223a(str) instanceof C9492c) {
                g[26] = true;
            } else {
                C1406n a = getSupportFragmentManager().mo6224a();
                int i = C9371R.C9375id.instabug_fragment_container;
                g[27] = true;
                C1406n b = a.mo6406b(i, C9492c.m44464e(), str);
                g[28] = true;
                b.mo6097e();
                g[29] = true;
            }
        }
        g[30] = true;
    }

    @C0195i0
    /* renamed from: e */
    public Attachment mo34058e() {
        boolean[] g = m44281g();
        Bundle extras = getIntent().getExtras();
        g[64] = true;
        Attachment attachment = (Attachment) extras.getSerializable(MessengerShareContentUtility.ATTACHMENT);
        g[65] = true;
        return attachment;
    }

    /* renamed from: f */
    public void mo34059f() {
        boolean[] g = m44281g();
        ((C9458a) this.presenter).mo34074d();
        g[68] = true;
    }

    public void finish() {
        boolean[] g = m44281g();
        super.finish();
        g[69] = true;
        ((C9458a) this.presenter).mo34073c();
        g[70] = true;
    }

    /* access modifiers changed from: protected */
    public int getLayout() {
        boolean[] g = m44281g();
        int i = C9371R.layout.instabug_activity;
        g[11] = true;
        return i;
    }

    /* access modifiers changed from: protected */
    public void initViews() {
        m44281g()[12] = true;
    }

    public void onCreate(Bundle bundle) {
        boolean[] g = m44281g();
        ChatPlugin chatPlugin = (ChatPlugin) InstabugCore.getXPlugin(ChatPlugin.class);
        if (chatPlugin == null) {
            g[5] = true;
        } else {
            g[6] = true;
            chatPlugin.setState(1);
            g[7] = true;
        }
        super.onCreate(bundle);
        g[8] = true;
        this.presenter = new C9497e(this);
        g[9] = true;
        ((C9458a) this.presenter).mo34072b(mo34052a(getIntent()));
        g[10] = true;
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        boolean[] g = m44281g();
        OrientationUtils.unlockOrientation(this);
        g[20] = true;
        SDKCoreEventPublisher.post(new SDKCoreEvent(ForegroundStatus.TYPE_FOREGROUNDS_STATUS, ForegroundStatus.VALUE_AVAILABLE));
        g[21] = true;
        super.onDestroy();
        g[22] = true;
    }

    /* access modifiers changed from: protected */
    public void onNewIntent(Intent intent) {
        boolean[] g = m44281g();
        super.onNewIntent(intent);
        g[1] = true;
        if (mo34052a(intent) != 161) {
            g[2] = true;
        } else {
            mo34055b(intent.getExtras().getString("chat_number"));
            g[3] = true;
        }
        g[4] = true;
    }

    public void onStop() {
        boolean[] g = m44281g();
        super.onStop();
        g[13] = true;
        ChatPlugin chatPlugin = (ChatPlugin) InstabugCore.getXPlugin(ChatPlugin.class);
        g[14] = true;
        if (chatPlugin == null) {
            g[15] = true;
        } else if (chatPlugin.getState() == 2) {
            g[16] = true;
        } else {
            g[17] = true;
            chatPlugin.setState(0);
            g[18] = true;
        }
        g[19] = true;
    }

    /* renamed from: a */
    public void mo34054a(String str, Attachment attachment) {
        boolean[] g = m44281g();
        if (isFinishing()) {
            g[46] = true;
        } else {
            g[47] = true;
            getSupportFragmentManager().mo6235b();
            g[48] = true;
            C1406n a = getSupportFragmentManager().mo6224a();
            int i = C9371R.C9375id.instabug_fragment_container;
            g[49] = true;
            C9466e a2 = C9466e.m44343a(str, attachment);
            String str2 = "chat_fragment";
            C1406n a3 = a.mo6395a(i, a2, str2);
            g[50] = true;
            if (getSupportFragmentManager().mo6221a(C9371R.C9375id.instabug_fragment_container) == null) {
                g[51] = true;
            } else {
                g[52] = true;
                a3.mo6401a(str2);
                g[53] = true;
            }
            a3.mo6097e();
            g[54] = true;
        }
        g[55] = true;
    }

    /* renamed from: a */
    public int mo34052a(Intent intent) {
        boolean[] g = m44281g();
        Bundle extras = intent.getExtras();
        g[56] = true;
        switch (extras.getInt("chat_process")) {
            case C13959t.f40969w2 /*160*/:
                g[57] = true;
                return C13959t.f40969w2;
            case C13959t.f40973x2 /*161*/:
                g[58] = true;
                return C13959t.f40973x2;
            case C13959t.f40977y2 /*162*/:
                g[59] = true;
                return C13959t.f40977y2;
            case C13959t.f40768A2 /*164*/:
                g[60] = true;
                return C13959t.f40768A2;
            default:
                g[61] = true;
                return C13959t.f40969w2;
        }
    }
}
