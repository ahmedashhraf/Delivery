package com.instabug.library.invocation;

import android.app.Activity;
import android.net.Uri;
import android.view.MotionEvent;
import androidx.annotation.C0195i0;
import androidx.annotation.C0224v0;
import com.instabug.library.C9780c;
import com.instabug.library.C9794d.C9797c;
import com.instabug.library.Feature;
import com.instabug.library.Feature.State;
import com.instabug.library.Instabug;
import com.instabug.library.InstabugState;
import com.instabug.library.core.InitialScreenshotHelper;
import com.instabug.library.core.InitialScreenshotHelper.InitialScreenshotCapturingListener;
import com.instabug.library.core.InstabugCore;
import com.instabug.library.core.eventbus.CurrentActivityLifeCycleEventBus;
import com.instabug.library.core.plugin.C9789a;
import com.instabug.library.core.plugin.PluginPromptOption;
import com.instabug.library.invocation.p390a.C9882a;
import com.instabug.library.invocation.p390a.C9883b;
import com.instabug.library.invocation.p390a.C9902d;
import com.instabug.library.invocation.p390a.C9906e;
import com.instabug.library.invocation.p390a.C9907f;
import com.instabug.library.p392k.p393a.C9926a;
import com.instabug.library.tracking.ActivityLifeCycleEvent;
import com.instabug.library.tracking.InstabugInternalTrackingDelegate;
import com.instabug.library.util.InstabugSDKLogger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import p195e.p196a.p447u0.C12314c;
import p195e.p196a.p449w0.C12331g;
import p205i.p471b.p472a.p473a.p474c.C13938g;
import p205i.p471b.p472a.p473a.p474c.p475i.C13959t;

public class InvocationManager implements C9909b {
    private static transient /* synthetic */ boolean[] $jacocoData;
    private static InvocationManager INSTANCE;
    private C12314c currentActivityLifeCycleDisposable;
    private InstabugInvocationEvent[] currentInstabugInvocationEvents;
    private InvocationSettings currentInvocationSettings;
    private List<C9882a> currentInvokers;
    private boolean isInvocationAvailable = true;

    /* renamed from: com.instabug.library.invocation.InvocationManager$a */
    class C9878a implements InitialScreenshotCapturingListener {

        /* renamed from: b */
        private static transient /* synthetic */ boolean[] f26223b;

        /* renamed from: a */
        final /* synthetic */ InvocationManager f26224a;

        C9878a(InvocationManager invocationManager) {
            boolean[] a = m45985a();
            this.f26224a = invocationManager;
            a[0] = true;
        }

        /* renamed from: a */
        private static /* synthetic */ boolean[] m45985a() {
            boolean[] zArr = f26223b;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(-2828388073108970869L, "com/instabug/library/invocation/InvocationManager$1", 3);
            f26223b = a;
            return a;
        }

        public void onScreenshotCapturedSuccessfully(Uri uri) {
            boolean[] a = m45985a();
            InvocationManager.access$000(this.f26224a, uri);
            a[1] = true;
        }

        public void onScreenshotCapturingFailed(Throwable th) {
            boolean[] a = m45985a();
            InvocationManager.access$000(this.f26224a, null);
            a[2] = true;
        }
    }

    /* renamed from: com.instabug.library.invocation.InvocationManager$b */
    class C9879b implements InitialScreenshotCapturingListener {

        /* renamed from: c */
        private static transient /* synthetic */ boolean[] f26225c;

        /* renamed from: a */
        final /* synthetic */ int f26226a;

        /* renamed from: b */
        final /* synthetic */ InvocationManager f26227b;

        C9879b(InvocationManager invocationManager, int i) {
            boolean[] a = m45986a();
            this.f26227b = invocationManager;
            this.f26226a = i;
            a[0] = true;
        }

        /* renamed from: a */
        private static /* synthetic */ boolean[] m45986a() {
            boolean[] zArr = f26225c;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(-7748916545700422049L, "com/instabug/library/invocation/InvocationManager$2", 3);
            f26225c = a;
            return a;
        }

        public void onScreenshotCapturedSuccessfully(Uri uri) {
            boolean[] a = m45986a();
            InvocationManager.access$100(this.f26227b, this.f26226a, uri);
            a[1] = true;
        }

        public void onScreenshotCapturingFailed(Throwable th) {
            boolean[] a = m45986a();
            InvocationManager.access$100(this.f26227b, this.f26226a, null);
            a[2] = true;
        }
    }

    /* renamed from: com.instabug.library.invocation.InvocationManager$c */
    class C9880c implements C12331g<ActivityLifeCycleEvent> {

        /* renamed from: b */
        private static transient /* synthetic */ boolean[] f26228b;

        /* renamed from: a */
        final /* synthetic */ InvocationManager f26229a;

        C9880c(InvocationManager invocationManager) {
            boolean[] a = m45987a();
            this.f26229a = invocationManager;
            a[0] = true;
        }

        /* renamed from: a */
        private static /* synthetic */ boolean[] m45987a() {
            boolean[] zArr = f26228b;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(538939431666028597L, "com/instabug/library/invocation/InvocationManager$3", 8);
            f26228b = a;
            return a;
        }

        /* renamed from: a */
        public void mo35170a(ActivityLifeCycleEvent activityLifeCycleEvent) {
            boolean[] a = m45987a();
            int i = C9881d.f26231b[activityLifeCycleEvent.ordinal()];
            if (i == 1) {
                InstabugSDKLogger.m46626v(this, "current activity resumed");
                a[2] = true;
                InvocationManager.access$200(this.f26229a);
                a[3] = true;
            } else if (i != 2) {
                a[1] = true;
            } else {
                InstabugSDKLogger.m46626v(this, "current activity paused");
                a[4] = true;
                this.f26229a.sleep();
                a[5] = true;
            }
            a[6] = true;
        }

        /* renamed from: c */
        public /* synthetic */ void mo33410c(Object obj) throws Exception {
            boolean[] a = m45987a();
            mo35170a((ActivityLifeCycleEvent) obj);
            a[7] = true;
        }
    }

    /* renamed from: com.instabug.library.invocation.InvocationManager$d */
    static /* synthetic */ class C9881d {

        /* renamed from: a */
        static final /* synthetic */ int[] f26230a = new int[InstabugInvocationEvent.values().length];

        /* renamed from: b */
        static final /* synthetic */ int[] f26231b = new int[ActivityLifeCycleEvent.values().length];

        /* renamed from: c */
        private static transient /* synthetic */ boolean[] f26232c;

        /* JADX WARNING: Can't wrap try/catch for region: R(2:4|5) */
        /* JADX WARNING: Code restructure failed: missing block: B:5:?, code lost:
            r0[2] = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:8:0x0030, code lost:
            r0[4] = true;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:4:0x0021 */
        static {
            /*
                boolean[] r0 = m45990a()
                com.instabug.library.tracking.ActivityLifeCycleEvent[] r1 = com.instabug.library.tracking.ActivityLifeCycleEvent.values()
                int r1 = r1.length
                int[] r1 = new int[r1]
                f26231b = r1
                r1 = 0
                r2 = 3
                r3 = 4
                r4 = 2
                r5 = 1
                r0[r1] = r5     // Catch:{ NoSuchFieldError -> 0x0021 }
                int[] r1 = f26231b     // Catch:{ NoSuchFieldError -> 0x0021 }
                com.instabug.library.tracking.ActivityLifeCycleEvent r6 = com.instabug.library.tracking.ActivityLifeCycleEvent.RESUMED     // Catch:{ NoSuchFieldError -> 0x0021 }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x0021 }
                r1[r6] = r5     // Catch:{ NoSuchFieldError -> 0x0021 }
                r0[r5] = r5
                goto L_0x0023
            L_0x0021:
                r0[r4] = r5     // Catch:{ NoSuchFieldError -> 0x0030 }
            L_0x0023:
                int[] r1 = f26231b     // Catch:{ NoSuchFieldError -> 0x0030 }
                com.instabug.library.tracking.ActivityLifeCycleEvent r6 = com.instabug.library.tracking.ActivityLifeCycleEvent.PAUSED     // Catch:{ NoSuchFieldError -> 0x0030 }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x0030 }
                r1[r6] = r4     // Catch:{ NoSuchFieldError -> 0x0030 }
                r0[r2] = r5
                goto L_0x0032
            L_0x0030:
                r0[r3] = r5
            L_0x0032:
                com.instabug.library.invocation.InstabugInvocationEvent[] r1 = com.instabug.library.invocation.InstabugInvocationEvent.values()
                int r1 = r1.length
                int[] r1 = new int[r1]
                f26230a = r1
                r1 = 5
                r0[r1] = r5     // Catch:{ NoSuchFieldError -> 0x004c }
                int[] r6 = f26230a     // Catch:{ NoSuchFieldError -> 0x004c }
                com.instabug.library.invocation.InstabugInvocationEvent r7 = com.instabug.library.invocation.InstabugInvocationEvent.SHAKE     // Catch:{ NoSuchFieldError -> 0x004c }
                int r7 = r7.ordinal()     // Catch:{ NoSuchFieldError -> 0x004c }
                r6[r7] = r5     // Catch:{ NoSuchFieldError -> 0x004c }
                r6 = 6
                r0[r6] = r5
                goto L_0x004f
            L_0x004c:
                r6 = 7
                r0[r6] = r5     // Catch:{ NoSuchFieldError -> 0x005e }
            L_0x004f:
                int[] r6 = f26230a     // Catch:{ NoSuchFieldError -> 0x005e }
                com.instabug.library.invocation.InstabugInvocationEvent r7 = com.instabug.library.invocation.InstabugInvocationEvent.FLOATING_BUTTON     // Catch:{ NoSuchFieldError -> 0x005e }
                int r7 = r7.ordinal()     // Catch:{ NoSuchFieldError -> 0x005e }
                r6[r7] = r4     // Catch:{ NoSuchFieldError -> 0x005e }
                r4 = 8
                r0[r4] = r5
                goto L_0x0062
            L_0x005e:
                r4 = 9
                r0[r4] = r5     // Catch:{ NoSuchFieldError -> 0x0071 }
            L_0x0062:
                int[] r4 = f26230a     // Catch:{ NoSuchFieldError -> 0x0071 }
                com.instabug.library.invocation.InstabugInvocationEvent r6 = com.instabug.library.invocation.InstabugInvocationEvent.TWO_FINGER_SWIPE_LEFT     // Catch:{ NoSuchFieldError -> 0x0071 }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x0071 }
                r4[r6] = r2     // Catch:{ NoSuchFieldError -> 0x0071 }
                r2 = 10
                r0[r2] = r5
                goto L_0x0075
            L_0x0071:
                r2 = 11
                r0[r2] = r5     // Catch:{ NoSuchFieldError -> 0x0084 }
            L_0x0075:
                int[] r2 = f26230a     // Catch:{ NoSuchFieldError -> 0x0084 }
                com.instabug.library.invocation.InstabugInvocationEvent r4 = com.instabug.library.invocation.InstabugInvocationEvent.SCREENSHOT     // Catch:{ NoSuchFieldError -> 0x0084 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0084 }
                r2[r4] = r3     // Catch:{ NoSuchFieldError -> 0x0084 }
                r2 = 12
                r0[r2] = r5
                goto L_0x0088
            L_0x0084:
                r2 = 13
                r0[r2] = r5     // Catch:{ NoSuchFieldError -> 0x0097 }
            L_0x0088:
                int[] r2 = f26230a     // Catch:{ NoSuchFieldError -> 0x0097 }
                com.instabug.library.invocation.InstabugInvocationEvent r3 = com.instabug.library.invocation.InstabugInvocationEvent.SCREENSHOT_GESTURE     // Catch:{ NoSuchFieldError -> 0x0097 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0097 }
                r2[r3] = r1     // Catch:{ NoSuchFieldError -> 0x0097 }
                r1 = 14
                r0[r1] = r5
                goto L_0x009b
            L_0x0097:
                r1 = 15
                r0[r1] = r5
            L_0x009b:
                r1 = 16
                r0[r1] = r5
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.instabug.library.invocation.InvocationManager.C9881d.<clinit>():void");
        }

        /* renamed from: a */
        private static /* synthetic */ boolean[] m45990a() {
            boolean[] zArr = f26232c;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(-2083893617811390858L, "com/instabug/library/invocation/InvocationManager$4", 17);
            f26232c = a;
            return a;
        }
    }

    private static /* synthetic */ boolean[] $jacocoInit() {
        boolean[] zArr = $jacocoData;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(1808479213154081753L, "com/instabug/library/invocation/InvocationManager", C13959t.f40973x2);
        $jacocoData = a;
        return a;
    }

    private InvocationManager() {
        boolean[] $jacocoInit = $jacocoInit();
        $jacocoInit[0] = true;
        this.currentInvocationSettings = new InvocationSettings();
        this.currentInstabugInvocationEvents = new InstabugInvocationEvent[]{InstabugInvocationEvent.SHAKE};
        $jacocoInit[1] = true;
        this.currentInvokers = new ArrayList();
        $jacocoInit[2] = true;
        subscribeToCarenActivityLifeCycle();
        $jacocoInit[3] = true;
    }

    static /* synthetic */ void access$000(InvocationManager invocationManager, Uri uri) {
        boolean[] $jacocoInit = $jacocoInit();
        invocationManager.launchPromptOptionActivity(uri);
        $jacocoInit[158] = true;
    }

    static /* synthetic */ void access$100(InvocationManager invocationManager, int i, Uri uri) {
        boolean[] $jacocoInit = $jacocoInit();
        invocationManager.invoke(i, uri);
        $jacocoInit[159] = true;
    }

    static /* synthetic */ void access$200(InvocationManager invocationManager) {
        boolean[] $jacocoInit = $jacocoInit();
        invocationManager.listen();
        $jacocoInit[160] = true;
    }

    private void captureScreenshotThenInvoke(int i) {
        boolean[] $jacocoInit = $jacocoInit();
        InitialScreenshotHelper.captureScreenshot(new C9879b(this, i));
        $jacocoInit[129] = true;
    }

    private void captureScreenshotThenLaunchPromptOptionActivity() {
        boolean[] $jacocoInit = $jacocoInit();
        InitialScreenshotHelper.captureScreenshot(new C9878a(this));
        $jacocoInit[128] = true;
    }

    public static InvocationManager getInstance() {
        boolean[] $jacocoInit = $jacocoInit();
        InvocationManager invocationManager = INSTANCE;
        if (invocationManager != null) {
            $jacocoInit[8] = true;
            return invocationManager;
        }
        IllegalStateException illegalStateException = new IllegalStateException("calling InvocationManager.getInstance() before calling InvocationManager.init()");
        $jacocoInit[9] = true;
        throw illegalStateException;
    }

    public static void init() {
        boolean[] $jacocoInit = $jacocoInit();
        InstabugSDKLogger.m46626v(InvocationManager.class, "initializing invocationManager");
        InvocationManager invocationManager = INSTANCE;
        if (invocationManager == null) {
            $jacocoInit[4] = true;
            INSTANCE = new InvocationManager();
            $jacocoInit[5] = true;
        } else {
            invocationManager.listen();
            $jacocoInit[6] = true;
        }
        $jacocoInit[7] = true;
    }

    private void invokeWithAvailableOptions(Uri uri) {
        boolean[] $jacocoInit = $jacocoInit();
        ArrayList availablePromptOptions = getAvailablePromptOptions();
        $jacocoInit[106] = true;
        if (availablePromptOptions.size() >= 2) {
            if (uri == null) {
                $jacocoInit[107] = true;
                captureScreenshotThenLaunchPromptOptionActivity();
                $jacocoInit[108] = true;
            } else {
                launchPromptOptionActivity(uri);
                $jacocoInit[109] = true;
            }
        } else if (availablePromptOptions.size() == 1) {
            $jacocoInit[110] = true;
            PluginPromptOption pluginPromptOption = (PluginPromptOption) availablePromptOptions.get(0);
            $jacocoInit[111] = true;
            int invocationMode = pluginPromptOption.getInvocationMode();
            if (invocationMode == 1 || invocationMode == 2) {
                if (uri == null) {
                    $jacocoInit[113] = true;
                    captureScreenshotThenInvoke(invocationMode);
                    $jacocoInit[114] = true;
                } else {
                    invoke(invocationMode, uri);
                    $jacocoInit[115] = true;
                }
            } else if (invocationMode != 4) {
                $jacocoInit[112] = true;
            } else {
                pluginPromptOption.invoke();
                $jacocoInit[116] = true;
            }
            $jacocoInit[117] = true;
        } else {
            InstabugSDKLogger.m46627w(InvocationManager.class, "No plugins prompt options available");
            $jacocoInit[118] = true;
        }
        $jacocoInit[119] = true;
    }

    private boolean isInstabugEnabled() {
        boolean z;
        boolean[] $jacocoInit = $jacocoInit();
        if (C9780c.m45631b().mo34869b(Feature.INSTABUG) != State.ENABLED) {
            $jacocoInit[139] = true;
        } else {
            $jacocoInit[140] = true;
            if (!C9780c.m45631b().mo34868a(Feature.INSTABUG)) {
                $jacocoInit[141] = true;
            } else {
                $jacocoInit[142] = true;
                z = true;
                $jacocoInit[144] = true;
                return z;
            }
        }
        z = false;
        $jacocoInit[143] = true;
        $jacocoInit[144] = true;
        return z;
    }

    private boolean isPromptOptionsAvailable() {
        boolean z;
        boolean[] $jacocoInit = $jacocoInit();
        if (getAvailablePromptOptions().size() > 0) {
            $jacocoInit[145] = true;
            z = true;
        } else {
            z = false;
            $jacocoInit[146] = true;
        }
        $jacocoInit[147] = true;
        return z;
    }

    private void launchPromptOptionActivity(Uri uri) {
        boolean[] $jacocoInit = $jacocoInit();
        InstabugInternalTrackingDelegate instance = InstabugInternalTrackingDelegate.getInstance();
        $jacocoInit[132] = true;
        Activity currentActivity = instance.getCurrentActivity();
        if (currentActivity == null) {
            $jacocoInit[133] = true;
        } else {
            $jacocoInit[134] = true;
            C9926a.m46180a().mo35260a(currentActivity, uri);
            $jacocoInit[135] = true;
        }
        $jacocoInit[136] = true;
    }

    private void listen() {
        boolean[] $jacocoInit = $jacocoInit();
        if (!Instabug.getState().equals(InstabugState.ENABLED)) {
            $jacocoInit[59] = true;
        } else if (!this.isInvocationAvailable) {
            $jacocoInit[60] = true;
        } else {
            $jacocoInit[61] = true;
            if (!isPromptOptionsAvailable()) {
                $jacocoInit[62] = true;
            } else {
                List<C9882a> list = this.currentInvokers;
                if (list == null) {
                    $jacocoInit[63] = true;
                } else {
                    $jacocoInit[64] = true;
                    $jacocoInit[65] = true;
                    for (C9882a aVar : list) {
                        $jacocoInit[67] = true;
                        aVar.mo35185d();
                        $jacocoInit[68] = true;
                    }
                    $jacocoInit[66] = true;
                }
            }
        }
        $jacocoInit[69] = true;
    }

    private void subscribeToCarenActivityLifeCycle() {
        boolean[] $jacocoInit = $jacocoInit();
        CurrentActivityLifeCycleEventBus instance = CurrentActivityLifeCycleEventBus.getInstance();
        C9880c cVar = new C9880c(this);
        $jacocoInit[137] = true;
        this.currentActivityLifeCycleDisposable = instance.subscribe(cVar);
        $jacocoInit[138] = true;
    }

    public ArrayList<PluginPromptOption> getAvailablePromptOptions() {
        boolean[] $jacocoInit = $jacocoInit();
        ArrayList<PluginPromptOption> arrayList = new ArrayList<>();
        $jacocoInit[120] = true;
        Iterator it = C9789a.m45662c().iterator();
        $jacocoInit[121] = true;
        while (it.hasNext()) {
            PluginPromptOption pluginPromptOption = (PluginPromptOption) it.next();
            $jacocoInit[122] = true;
            if (!this.currentInvocationSettings.getEnabledPromptOptions()[pluginPromptOption.getInvocationMode()]) {
                $jacocoInit[123] = true;
            } else {
                $jacocoInit[124] = true;
                arrayList.add(pluginPromptOption);
                $jacocoInit[125] = true;
            }
            $jacocoInit[126] = true;
        }
        $jacocoInit[127] = true;
        return arrayList;
    }

    public InstabugInvocationEvent[] getCurrentInstabugInvocationEvents() {
        boolean[] $jacocoInit = $jacocoInit();
        InstabugInvocationEvent[] instabugInvocationEventArr = this.currentInstabugInvocationEvents;
        InstabugInvocationEvent[] instabugInvocationEventArr2 = (InstabugInvocationEvent[]) Arrays.copyOf(instabugInvocationEventArr, instabugInvocationEventArr.length);
        $jacocoInit[56] = true;
        return instabugInvocationEventArr2;
    }

    public InvocationSettings getCurrentInvocationSettings() {
        boolean[] $jacocoInit = $jacocoInit();
        InvocationSettings invocationSettings = this.currentInvocationSettings;
        $jacocoInit[57] = true;
        return invocationSettings;
    }

    /* access modifiers changed from: 0000 */
    public List<C9882a> getCurrentInvokers() {
        boolean[] $jacocoInit = $jacocoInit();
        List<C9882a> list = this.currentInvokers;
        $jacocoInit[58] = true;
        return list;
    }

    public void handle(MotionEvent motionEvent) {
        boolean[] $jacocoInit = $jacocoInit();
        if (!Instabug.getState().equals(InstabugState.ENABLED)) {
            $jacocoInit[70] = true;
        } else if (InstabugCore.isForegroundBusy()) {
            $jacocoInit[71] = true;
        } else {
            $jacocoInit[72] = true;
            Iterator it = this.currentInvokers.iterator();
            $jacocoInit[73] = true;
            while (true) {
                if (!it.hasNext()) {
                    $jacocoInit[74] = true;
                    break;
                }
                C9882a aVar = (C9882a) it.next();
                if (aVar instanceof C9907f) {
                    $jacocoInit[75] = true;
                    ((C9907f) aVar).mo35219a(motionEvent);
                    $jacocoInit[76] = true;
                    break;
                }
                $jacocoInit[77] = true;
            }
        }
        $jacocoInit[78] = true;
    }

    public void invoke() {
        boolean[] $jacocoInit = $jacocoInit();
        if (InstabugCore.isForegroundBusy()) {
            $jacocoInit[88] = true;
        } else {
            $jacocoInit[89] = true;
            invoke(this.currentInvocationSettings.getDefaultInvocationMode());
            $jacocoInit[90] = true;
        }
        $jacocoInit[91] = true;
    }

    public void notifyPrimaryColorChanged() {
        boolean[] $jacocoInit = $jacocoInit();
        List<C9882a> list = this.currentInvokers;
        if (list == null) {
            $jacocoInit[148] = true;
        } else {
            $jacocoInit[149] = true;
            $jacocoInit[150] = true;
            for (C9882a aVar : list) {
                if (!(aVar instanceof C9883b)) {
                    $jacocoInit[152] = true;
                } else {
                    $jacocoInit[153] = true;
                    aVar.mo35184c();
                    $jacocoInit[154] = true;
                    aVar.mo35185d();
                    $jacocoInit[155] = true;
                }
                $jacocoInit[156] = true;
            }
            $jacocoInit[151] = true;
        }
        $jacocoInit[157] = true;
    }

    public void onInvocationRequested(Uri uri) {
        boolean[] $jacocoInit = $jacocoInit();
        invoke(this.currentInvocationSettings.getDefaultInvocationMode(), uri);
        $jacocoInit[130] = true;
    }

    public void release() {
        boolean[] $jacocoInit = $jacocoInit();
        C12314c cVar = this.currentActivityLifeCycleDisposable;
        if (cVar == null) {
            $jacocoInit[10] = true;
        } else {
            $jacocoInit[11] = true;
            if (cVar.mo41878d()) {
                $jacocoInit[12] = true;
            } else {
                $jacocoInit[13] = true;
                this.currentActivityLifeCycleDisposable.dispose();
                $jacocoInit[14] = true;
            }
        }
        $jacocoInit[15] = true;
    }

    /* access modifiers changed from: 0000 */
    @C0224v0
    public InstabugInvocationEvent[] removeDuplicates(InstabugInvocationEvent[] instabugInvocationEventArr) {
        boolean[] $jacocoInit = $jacocoInit();
        ArrayList arrayList = new ArrayList();
        $jacocoInit[46] = true;
        HashSet hashSet = new HashSet();
        int length = instabugInvocationEventArr.length;
        $jacocoInit[47] = true;
        int i = 0;
        while (i < length) {
            InstabugInvocationEvent instabugInvocationEvent = instabugInvocationEventArr[i];
            $jacocoInit[48] = true;
            if (hashSet.contains(instabugInvocationEvent)) {
                $jacocoInit[49] = true;
            } else {
                $jacocoInit[50] = true;
                arrayList.add(instabugInvocationEvent);
                $jacocoInit[51] = true;
                hashSet.add(instabugInvocationEvent);
                $jacocoInit[52] = true;
            }
            i++;
            $jacocoInit[53] = true;
        }
        InstabugInvocationEvent[] instabugInvocationEventArr2 = new InstabugInvocationEvent[arrayList.size()];
        $jacocoInit[54] = true;
        InstabugInvocationEvent[] instabugInvocationEventArr3 = (InstabugInvocationEvent[]) arrayList.toArray(instabugInvocationEventArr2);
        $jacocoInit[55] = true;
        return instabugInvocationEventArr3;
    }

    public void setInstabugInvocationEvent(InstabugInvocationEvent... instabugInvocationEventArr) {
        boolean[] $jacocoInit = $jacocoInit();
        this.currentInstabugInvocationEvents = removeDuplicates(instabugInvocationEventArr);
        List<C9882a> list = this.currentInvokers;
        if (list == null) {
            $jacocoInit[16] = true;
        } else {
            $jacocoInit[17] = true;
            $jacocoInit[18] = true;
            for (C9882a aVar : list) {
                $jacocoInit[19] = true;
                aVar.mo35184c();
                $jacocoInit[20] = true;
            }
            this.currentInvokers.clear();
            $jacocoInit[21] = true;
        }
        int length = instabugInvocationEventArr.length;
        int i = 0;
        $jacocoInit[22] = true;
        while (true) {
            if (i >= length) {
                $jacocoInit[23] = true;
                break;
            }
            InstabugInvocationEvent instabugInvocationEvent = instabugInvocationEventArr[i];
            if (instabugInvocationEvent == InstabugInvocationEvent.NONE) {
                if (instabugInvocationEventArr.length == 1) {
                    this.currentInvokers = null;
                    $jacocoInit[26] = true;
                    break;
                }
                $jacocoInit[25] = true;
            } else {
                $jacocoInit[24] = true;
            }
            if (this.currentInvokers != null) {
                $jacocoInit[27] = true;
            } else {
                $jacocoInit[28] = true;
                this.currentInvokers = new ArrayList();
                $jacocoInit[29] = true;
            }
            int i2 = C9881d.f26230a[instabugInvocationEvent.ordinal()];
            if (i2 == 1) {
                C9906e eVar = new C9906e(Instabug.getApplicationContext(), this);
                InvocationSettings invocationSettings = this.currentInvocationSettings;
                $jacocoInit[31] = true;
                int shakeThreshold = invocationSettings.getShakeThreshold();
                $jacocoInit[32] = true;
                eVar.mo35217a(shakeThreshold);
                $jacocoInit[33] = true;
                this.currentInvokers.add(eVar);
                $jacocoInit[34] = true;
            } else if (i2 == 2) {
                this.currentInvokers.add(new C9883b(this));
                $jacocoInit[35] = true;
            } else if (i2 == 3) {
                this.currentInvokers.add(new C9907f(Instabug.getApplicationContext(), this));
                $jacocoInit[36] = true;
            } else if (i2 == 4 || i2 == 5) {
                this.currentInvokers.add(new C9902d(this));
                $jacocoInit[37] = true;
            } else {
                $jacocoInit[30] = true;
            }
            i++;
            $jacocoInit[38] = true;
        }
        List<C9882a> list2 = this.currentInvokers;
        if (list2 == null) {
            $jacocoInit[39] = true;
        } else {
            $jacocoInit[40] = true;
            $jacocoInit[41] = true;
            for (C9882a aVar2 : list2) {
                $jacocoInit[43] = true;
                aVar2.mo35185d();
                $jacocoInit[44] = true;
            }
            $jacocoInit[42] = true;
        }
        $jacocoInit[45] = true;
    }

    public void sleep() {
        boolean[] $jacocoInit = $jacocoInit();
        List<C9882a> list = this.currentInvokers;
        if (list == null) {
            $jacocoInit[79] = true;
        } else {
            $jacocoInit[80] = true;
            $jacocoInit[81] = true;
            for (C9882a aVar : list) {
                $jacocoInit[83] = true;
                aVar.mo35184c();
                $jacocoInit[84] = true;
            }
            $jacocoInit[82] = true;
        }
        $jacocoInit[85] = true;
    }

    public void switchOffInvocation() {
        boolean[] $jacocoInit = $jacocoInit();
        this.isInvocationAvailable = false;
        $jacocoInit[86] = true;
    }

    public void switchOnInvocation() {
        boolean[] $jacocoInit = $jacocoInit();
        this.isInvocationAvailable = true;
        $jacocoInit[87] = true;
    }

    public void onInvocationRequested() {
        boolean[] $jacocoInit = $jacocoInit();
        invoke();
        $jacocoInit[131] = true;
    }

    public void invoke(int i) {
        boolean[] $jacocoInit = $jacocoInit();
        if (!isInstabugEnabled()) {
            $jacocoInit[92] = true;
        } else if (InstabugCore.isForegroundBusy()) {
            $jacocoInit[93] = true;
        } else {
            if (i != 0) {
                if (i == 1 || i == 2) {
                    captureScreenshotThenInvoke(i);
                    $jacocoInit[96] = true;
                } else if (!(i == 3 || i == 4)) {
                    $jacocoInit[94] = true;
                }
            }
            invoke(i, null);
            $jacocoInit[95] = true;
        }
        $jacocoInit[97] = true;
    }

    private void invoke(int i, @C0195i0 Uri uri) {
        boolean[] $jacocoInit = $jacocoInit();
        if (i != 0) {
            if (!(i == 1 || i == 2)) {
                if (i == 3) {
                    C9797c.m45702b();
                    $jacocoInit[104] = true;
                } else if (i != 4) {
                    $jacocoInit[98] = true;
                }
            }
            $jacocoInit[100] = true;
            PluginPromptOption promptOptionByInvocationMode = PluginPromptOption.getPromptOptionByInvocationMode(i);
            if (promptOptionByInvocationMode != null) {
                $jacocoInit[101] = true;
                promptOptionByInvocationMode.invoke(uri);
                $jacocoInit[102] = true;
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("'");
                sb.append(i);
                sb.append("' invocationMode isn't available");
                InstabugSDKLogger.m46627w(InvocationManager.class, sb.toString());
                $jacocoInit[103] = true;
            }
        } else {
            invokeWithAvailableOptions(uri);
            $jacocoInit[99] = true;
        }
        $jacocoInit[105] = true;
    }
}
