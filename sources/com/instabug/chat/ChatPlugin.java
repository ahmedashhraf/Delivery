package com.instabug.chat;

import android.content.Context;
import android.content.Intent;
import androidx.annotation.C0193h0;
import com.instabug.chat.C9377a.C9397d;
import com.instabug.chat.model.Message;
import com.instabug.chat.network.InstabugPushNotificationTokenService;
import com.instabug.chat.settings.C9441a;
import com.instabug.chat.synchronization.C9448a;
import com.instabug.chat.synchronization.C9449b;
import com.instabug.library.PresentationManager;
import com.instabug.library.core.plugin.Plugin;
import com.instabug.library.core.plugin.PluginPromptOption;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import p195e.p196a.p447u0.C12314c;
import p205i.p471b.p472a.p473a.p474c.C13938g;

public class ChatPlugin extends Plugin implements C9449b {
    private static transient /* synthetic */ boolean[] $jacocoData;
    private C12314c coreEventsDisposable;

    /* renamed from: com.instabug.chat.ChatPlugin$a */
    class C9370a implements Runnable {

        /* renamed from: O */
        private static transient /* synthetic */ boolean[] f24807O;

        /* renamed from: N */
        final /* synthetic */ ChatPlugin f24808N;

        /* renamed from: a */
        final /* synthetic */ Context f24809a;

        /* renamed from: b */
        final /* synthetic */ List f24810b;

        C9370a(ChatPlugin chatPlugin, Context context, List list) {
            boolean[] a = m43861a();
            this.f24808N = chatPlugin;
            this.f24809a = context;
            this.f24810b = list;
            a[0] = true;
        }

        /* renamed from: a */
        private static /* synthetic */ boolean[] m43861a() {
            boolean[] zArr = f24807O;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(7395903491667181122L, "com/instabug/chat/ChatPlugin$1", 2);
            f24807O = a;
            return a;
        }

        public void run() {
            boolean[] a = m43861a();
            C9397d.m43935a().mo33835a(this.f24809a, this.f24810b);
            a[1] = true;
        }
    }

    private static /* synthetic */ boolean[] $jacocoInit() {
        boolean[] zArr = $jacocoData;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(8739501152815439843L, "com/instabug/chat/ChatPlugin", 30);
        $jacocoData = a;
        return a;
    }

    public ChatPlugin() {
        $jacocoInit()[0] = true;
    }

    private void sendPushNotificationToken() {
        boolean[] $jacocoInit = $jacocoInit();
        if (C9441a.m44211n()) {
            $jacocoInit[21] = true;
        } else {
            $jacocoInit[22] = true;
            if (C9441a.m44210m().isEmpty()) {
                $jacocoInit[23] = true;
            } else {
                WeakReference<Context> weakReference = this.contextWeakReference;
                if (weakReference == null) {
                    $jacocoInit[24] = true;
                } else {
                    $jacocoInit[25] = true;
                    Context context = (Context) weakReference.get();
                    if (context == null) {
                        $jacocoInit[26] = true;
                    } else {
                        $jacocoInit[27] = true;
                        InstabugPushNotificationTokenService.m44123a(context, new Intent(context, InstabugPushNotificationTokenService.class));
                        $jacocoInit[28] = true;
                    }
                }
            }
        }
        $jacocoInit[29] = true;
    }

    private void subscribeOnCoreEvents() {
        boolean[] $jacocoInit = $jacocoInit();
        WeakReference<Context> weakReference = this.contextWeakReference;
        $jacocoInit[17] = true;
        Context context = (Context) weakReference.get();
        $jacocoInit[18] = true;
        this.coreEventsDisposable = C9377a.m43863a(C9377a.m43869c(context));
        $jacocoInit[19] = true;
    }

    private void unSubscribeFromCoreEvents() {
        boolean[] $jacocoInit = $jacocoInit();
        C9377a.m43866a(this.coreEventsDisposable);
        $jacocoInit[20] = true;
    }

    public long getLastActivityTime() {
        boolean[] $jacocoInit = $jacocoInit();
        long b = C9377a.m43867b();
        $jacocoInit[9] = true;
        return b;
    }

    public ArrayList<PluginPromptOption> getPromptOptions() {
        boolean[] $jacocoInit = $jacocoInit();
        ArrayList<PluginPromptOption> b = C9377a.m43868b((Context) this.contextWeakReference.get());
        $jacocoInit[10] = true;
        return b;
    }

    public void init(Context context) {
        boolean[] $jacocoInit = $jacocoInit();
        super.init(context);
        $jacocoInit[1] = true;
        C9377a.m43865a(context);
        $jacocoInit[2] = true;
        subscribeOnCoreEvents();
        $jacocoInit[3] = true;
        C9448a.m44260a().mo34050a((C9449b) this);
        $jacocoInit[4] = true;
        sendPushNotificationToken();
        $jacocoInit[5] = true;
    }

    public List<Message> onNewMessagesReceived(@C0193h0 List<Message> list) {
        boolean[] $jacocoInit = $jacocoInit();
        WeakReference<Context> weakReference = this.contextWeakReference;
        if (weakReference == null) {
            $jacocoInit[11] = true;
        } else {
            $jacocoInit[12] = true;
            Context context = (Context) weakReference.get();
            if (context == null) {
                $jacocoInit[13] = true;
            } else {
                $jacocoInit[14] = true;
                PresentationManager.getInstance().show(new C9370a(this, context, list));
                $jacocoInit[15] = true;
            }
        }
        $jacocoInit[16] = true;
        return null;
    }

    public void release() {
        boolean[] $jacocoInit = $jacocoInit();
        unSubscribeFromCoreEvents();
        $jacocoInit[6] = true;
        C9377a.m43864a();
        $jacocoInit[7] = true;
        C9448a.m44260a().mo34051b((C9449b) this);
        $jacocoInit[8] = true;
    }
}
