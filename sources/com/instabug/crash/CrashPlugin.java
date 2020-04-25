package com.instabug.crash;

import android.content.Context;
import android.content.Intent;
import com.instabug.crash.network.InstabugCrashesUploaderService;
import com.instabug.crash.p366d.C9509a;
import com.instabug.crash.p366d.C9511c;
import com.instabug.library.core.eventbus.coreeventbus.SDKCoreEvent;
import com.instabug.library.core.eventbus.coreeventbus.SDKCoreEventSubscriber;
import com.instabug.library.core.plugin.Plugin;
import java.lang.ref.WeakReference;
import p195e.p196a.p447u0.C12314c;
import p195e.p196a.p449w0.C12331g;
import p205i.p471b.p472a.p473a.p474c.C13938g;

public class CrashPlugin extends Plugin {
    private static transient /* synthetic */ boolean[] $jacocoData;
    public C12314c subscribe;

    /* renamed from: com.instabug.crash.CrashPlugin$a */
    class C9498a implements C12331g<SDKCoreEvent> {

        /* renamed from: b */
        private static transient /* synthetic */ boolean[] f25152b;

        /* renamed from: a */
        final /* synthetic */ CrashPlugin f25153a;

        C9498a(CrashPlugin crashPlugin) {
            boolean[] a = m44497a();
            this.f25153a = crashPlugin;
            a[0] = true;
        }

        /* renamed from: a */
        private static /* synthetic */ boolean[] m44497a() {
            boolean[] zArr = f25152b;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(-6421928017230515966L, "com/instabug/crash/CrashPlugin$1", 22);
            f25152b = a;
            return a;
        }

        /* JADX WARNING: Removed duplicated region for block: B:24:0x0065  */
        /* JADX WARNING: Removed duplicated region for block: B:35:0x00ac  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo34162a(com.instabug.library.core.eventbus.coreeventbus.SDKCoreEvent r8) {
            /*
                r7 = this;
                boolean[] r0 = m44497a()
                boolean r1 = com.instabug.crash.p367e.C9512a.m44530a()
                r2 = 1
                if (r1 != 0) goto L_0x000f
                r0[r2] = r2
                goto L_0x00ca
            L_0x000f:
                r1 = 2
                r0[r1] = r2
                java.lang.String r3 = r8.getType()
                r4 = -1
                int r5 = r3.hashCode()
                r6 = 3599307(0x36ebcb, float:5.043703E-39)
                if (r5 == r6) goto L_0x0052
                r6 = 1843485230(0x6de15a2e, float:8.7178935E27)
                if (r5 == r6) goto L_0x003f
                r6 = 1984987798(0x76508296, float:1.0572718E33)
                if (r5 == r6) goto L_0x002e
                r3 = 3
                r0[r3] = r2
                goto L_0x005d
            L_0x002e:
                java.lang.String r5 = "session"
                boolean r3 = r3.equals(r5)
                if (r3 != 0) goto L_0x003a
                r3 = 6
                r0[r3] = r2
                goto L_0x005d
            L_0x003a:
                r3 = 7
                r0[r3] = r2
                r3 = 1
                goto L_0x0063
            L_0x003f:
                java.lang.String r5 = "network"
                boolean r3 = r3.equals(r5)
                if (r3 != 0) goto L_0x004c
                r3 = 8
                r0[r3] = r2
                goto L_0x005d
            L_0x004c:
                r3 = 9
                r0[r3] = r2
                r3 = 2
                goto L_0x0063
            L_0x0052:
                java.lang.String r5 = "user"
                boolean r3 = r3.equals(r5)
                if (r3 != 0) goto L_0x005f
                r3 = 4
                r0[r3] = r2
            L_0x005d:
                r3 = -1
                goto L_0x0063
            L_0x005f:
                r3 = 0
                r4 = 5
                r0[r4] = r2
            L_0x0063:
                if (r3 == 0) goto L_0x00ac
                if (r3 == r2) goto L_0x008d
                if (r3 == r1) goto L_0x006e
                r8 = 10
                r0[r8] = r2
                goto L_0x00ca
            L_0x006e:
                java.lang.String r8 = r8.getValue()
                java.lang.String r1 = "activated"
                boolean r8 = r8.equals(r1)
                if (r8 != 0) goto L_0x007f
                r8 = 17
                r0[r8] = r2
                goto L_0x00ca
            L_0x007f:
                r8 = 18
                r0[r8] = r2
                com.instabug.crash.CrashPlugin r8 = r7.f25153a
                com.instabug.crash.CrashPlugin.access$000(r8)
                r8 = 19
                r0[r8] = r2
                goto L_0x00ca
            L_0x008d:
                java.lang.String r8 = r8.getValue()
                java.lang.String r1 = "started"
                boolean r8 = r8.equals(r1)
                if (r8 != 0) goto L_0x009e
                r8 = 14
                r0[r8] = r2
                goto L_0x00ca
            L_0x009e:
                r8 = 15
                r0[r8] = r2
                com.instabug.crash.CrashPlugin r8 = r7.f25153a
                com.instabug.crash.CrashPlugin.access$000(r8)
                r8 = 16
                r0[r8] = r2
                goto L_0x00ca
            L_0x00ac:
                java.lang.String r8 = r8.getValue()
                java.lang.String r1 = "logged_out"
                boolean r8 = r8.equals(r1)
                if (r8 != 0) goto L_0x00bd
                r8 = 11
                r0[r8] = r2
                goto L_0x00ca
            L_0x00bd:
                r8 = 12
                r0[r8] = r2
                com.instabug.crash.CrashPlugin r8 = r7.f25153a
                r8.clearUserActivities()
                r8 = 13
                r0[r8] = r2
            L_0x00ca:
                r8 = 20
                r0[r8] = r2
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.instabug.crash.CrashPlugin.C9498a.mo34162a(com.instabug.library.core.eventbus.coreeventbus.SDKCoreEvent):void");
        }

        /* renamed from: c */
        public /* synthetic */ void mo33410c(Object obj) throws Exception {
            boolean[] a = m44497a();
            mo34162a((SDKCoreEvent) obj);
            a[21] = true;
        }
    }

    private static /* synthetic */ boolean[] $jacocoInit() {
        boolean[] zArr = $jacocoData;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(-3691076199717056648L, "com/instabug/crash/CrashPlugin", 21);
        $jacocoData = a;
        return a;
    }

    public CrashPlugin() {
        $jacocoInit()[0] = true;
    }

    static /* synthetic */ void access$000(CrashPlugin crashPlugin) {
        boolean[] $jacocoInit = $jacocoInit();
        crashPlugin.startCrashesUploaderService();
        $jacocoInit[20] = true;
    }

    private void setExceptionHandler() {
        boolean[] $jacocoInit = $jacocoInit();
        Thread.setDefaultUncaughtExceptionHandler(new C9506b());
        $jacocoInit[19] = true;
    }

    private void startCrashesUploaderService() {
        boolean[] $jacocoInit = $jacocoInit();
        WeakReference<Context> weakReference = this.contextWeakReference;
        if (weakReference == null) {
            $jacocoInit[12] = true;
        } else {
            $jacocoInit[13] = true;
            Context context = (Context) weakReference.get();
            if (context == null) {
                $jacocoInit[14] = true;
            } else {
                $jacocoInit[15] = true;
                InstabugCrashesUploaderService.m44558a(context, new Intent((Context) this.contextWeakReference.get(), InstabugCrashesUploaderService.class));
                $jacocoInit[16] = true;
            }
        }
        $jacocoInit[17] = true;
    }

    public void clearUserActivities() {
        boolean[] $jacocoInit = $jacocoInit();
        C9511c.m44526b().mo34173a(0);
        $jacocoInit[18] = true;
    }

    public long getLastActivityTime() {
        boolean[] $jacocoInit = $jacocoInit();
        long a = C9509a.m44519b().mo34170a();
        $jacocoInit[9] = true;
        return a;
    }

    public C12314c getSDKEventSubscriber() {
        boolean[] $jacocoInit = $jacocoInit();
        C12314c subscribe2 = SDKCoreEventSubscriber.subscribe(new C9498a(this));
        $jacocoInit[11] = true;
        return subscribe2;
    }

    public void init(Context context) {
        boolean[] $jacocoInit = $jacocoInit();
        super.init(context);
        $jacocoInit[1] = true;
        C9509a.m44518a(context);
        $jacocoInit[2] = true;
        subscribeOnSDKEvents();
        $jacocoInit[3] = true;
        setExceptionHandler();
        $jacocoInit[4] = true;
    }

    public void release() {
        boolean[] $jacocoInit = $jacocoInit();
        C12314c cVar = this.subscribe;
        if (cVar == null) {
            $jacocoInit[5] = true;
        } else {
            $jacocoInit[6] = true;
            cVar.dispose();
            $jacocoInit[7] = true;
        }
        $jacocoInit[8] = true;
    }

    public void subscribeOnSDKEvents() {
        boolean[] $jacocoInit = $jacocoInit();
        this.subscribe = getSDKEventSubscriber();
        $jacocoInit[10] = true;
    }
}
