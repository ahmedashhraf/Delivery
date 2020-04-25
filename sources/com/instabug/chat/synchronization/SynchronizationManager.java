package com.instabug.chat.synchronization;

import android.content.Context;
import android.os.Handler;
import com.instabug.chat.cache.ChatsCacheManager;
import com.instabug.chat.cache.ReadQueueCacheManager;
import com.instabug.chat.eventbus.ChatTimeUpdatedEventBus;
import com.instabug.chat.model.C9426d;
import com.instabug.chat.network.C9428a.C9433e;
import com.instabug.chat.settings.C9441a;
import com.instabug.library.Feature;
import com.instabug.library.Feature.State;
import com.instabug.library.core.InstabugCore;
import com.instabug.library.network.NetworkManager;
import com.instabug.library.network.Request.Callbacks;
import com.instabug.library.network.RequestResponse;
import com.instabug.library.util.InstabugSDKLogger;
import java.lang.ref.WeakReference;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p195e.p196a.p447u0.C12314c;
import p195e.p196a.p449w0.C12331g;
import p205i.p471b.p472a.p473a.p474c.C13938g;

public class SynchronizationManager {
    private static transient /* synthetic */ boolean[] $jacocoData = null;
    private static SynchronizationManager INSTANCE = null;
    private static final String MISSING_MESSAGES = "missing_messages";
    private static final long STOP_PULLING = -1;
    private static final String TTL = "ttl";
    private C12314c chatTimeDisposable;
    private C12331g<Long> chattingTimeUpdateAction;
    private Handler handler;
    private boolean isSyncing = false;
    private boolean shouldSync = false;
    private C12331g<Long> syncAction;
    private C9447d syncRunnable;

    /* renamed from: com.instabug.chat.synchronization.SynchronizationManager$a */
    class C9444a implements C12331g<Long> {

        /* renamed from: b */
        private static transient /* synthetic */ boolean[] f25020b;

        /* renamed from: a */
        final /* synthetic */ SynchronizationManager f25021a;

        C9444a(SynchronizationManager synchronizationManager) {
            boolean[] a = m44249a();
            this.f25021a = synchronizationManager;
            a[0] = true;
        }

        /* renamed from: a */
        private static /* synthetic */ boolean[] m44249a() {
            boolean[] zArr = f25020b;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(-3742897530517415347L, "com/instabug/chat/synchronization/SynchronizationManager$1", 7);
            f25020b = a;
            return a;
        }

        /* renamed from: a */
        public void mo34044a(Long l) {
            boolean[] a = m44249a();
            if (!SynchronizationManager.access$000(this.f25021a)) {
                a[1] = true;
            } else {
                a[2] = true;
                StringBuilder sb = new StringBuilder();
                sb.append("Waiting ");
                sb.append(l);
                sb.append(" seconds until the  next sync");
                InstabugSDKLogger.m46626v(this, sb.toString());
                a[3] = true;
                SynchronizationManager.access$200(this.f25021a).postDelayed(SynchronizationManager.access$100(this.f25021a), l.longValue() * 1000);
                a[4] = true;
            }
            a[5] = true;
        }

        /* renamed from: c */
        public /* synthetic */ void mo33410c(Object obj) throws Exception {
            boolean[] a = m44249a();
            mo34044a((Long) obj);
            a[6] = true;
        }
    }

    /* renamed from: com.instabug.chat.synchronization.SynchronizationManager$b */
    class C9445b implements C12331g<Long> {

        /* renamed from: b */
        private static transient /* synthetic */ boolean[] f25022b;

        /* renamed from: a */
        final /* synthetic */ SynchronizationManager f25023a;

        C9445b(SynchronizationManager synchronizationManager) {
            boolean[] a = m44252a();
            this.f25023a = synchronizationManager;
            a[0] = true;
        }

        /* renamed from: a */
        private static /* synthetic */ boolean[] m44252a() {
            boolean[] zArr = f25022b;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(-793067683039061516L, "com/instabug/chat/synchronization/SynchronizationManager$2", 3);
            f25022b = a;
            return a;
        }

        /* renamed from: a */
        public void mo34045a(Long l) {
            boolean[] a = m44252a();
            this.f25023a.sync();
            a[1] = true;
        }

        /* renamed from: c */
        public /* synthetic */ void mo33410c(Object obj) throws Exception {
            boolean[] a = m44252a();
            mo34045a((Long) obj);
            a[2] = true;
        }
    }

    /* renamed from: com.instabug.chat.synchronization.SynchronizationManager$c */
    class C9446c implements Callbacks<RequestResponse, Throwable> {

        /* renamed from: e */
        private static transient /* synthetic */ boolean[] f25024e;

        /* renamed from: a */
        final /* synthetic */ Context f25025a;

        /* renamed from: b */
        final /* synthetic */ C12331g f25026b;

        /* renamed from: c */
        final /* synthetic */ List f25027c;

        /* renamed from: d */
        final /* synthetic */ SynchronizationManager f25028d;

        C9446c(SynchronizationManager synchronizationManager, Context context, C12331g gVar, List list) {
            boolean[] a = m44255a();
            this.f25028d = synchronizationManager;
            this.f25025a = context;
            this.f25026b = gVar;
            this.f25027c = list;
            a[0] = true;
        }

        /* renamed from: a */
        private static /* synthetic */ boolean[] m44255a() {
            boolean[] zArr = f25024e;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(-4425785931104894257L, "com/instabug/chat/synchronization/SynchronizationManager$3", 6);
            f25024e = a;
            return a;
        }

        /* renamed from: a */
        public void mo34046a(RequestResponse requestResponse) {
            boolean[] a = m44255a();
            SynchronizationManager.access$300(this.f25028d, requestResponse, this.f25025a, this.f25026b);
            a[1] = true;
            SynchronizationManager.access$400(this.f25028d, this.f25027c);
            a[2] = true;
        }

        public /* synthetic */ void onFailed(Object obj) {
            boolean[] a = m44255a();
            mo34047a((Throwable) obj);
            a[4] = true;
        }

        public /* synthetic */ void onSucceeded(Object obj) {
            boolean[] a = m44255a();
            mo34046a((RequestResponse) obj);
            a[5] = true;
        }

        /* renamed from: a */
        public void mo34047a(Throwable th) {
            boolean[] a = m44255a();
            SynchronizationManager.access$500(this.f25028d, this.f25026b);
            a[3] = true;
        }
    }

    /* renamed from: com.instabug.chat.synchronization.SynchronizationManager$d */
    private class C9447d implements Runnable {

        /* renamed from: N */
        private static transient /* synthetic */ boolean[] f25029N;

        /* renamed from: a */
        WeakReference<Context> f25030a;

        /* renamed from: b */
        final /* synthetic */ SynchronizationManager f25031b;

        C9447d(SynchronizationManager synchronizationManager, Context context) {
            boolean[] a = m44258a();
            this.f25031b = synchronizationManager;
            a[0] = true;
            this.f25030a = new WeakReference<>(context);
            a[1] = true;
        }

        /* renamed from: a */
        private static /* synthetic */ boolean[] m44258a() {
            boolean[] zArr = f25029N;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(-9003610381875677226L, "com/instabug/chat/synchronization/SynchronizationManager$SyncRunnable", 10);
            f25029N = a;
            return a;
        }

        public void run() {
            boolean[] a = m44258a();
            WeakReference<Context> weakReference = this.f25030a;
            if (weakReference == null) {
                a[2] = true;
            } else if (weakReference.get() == null) {
                a[3] = true;
            } else {
                a[4] = true;
                SynchronizationManager.access$700(this.f25031b, (Context) this.f25030a.get(), SynchronizationManager.access$600(this.f25031b));
                a[5] = true;
                a[9] = true;
            }
            try {
                SynchronizationManager.access$600(this.f25031b).mo33410c(Long.valueOf(C9441a.m44200e()));
                a[6] = true;
            } catch (Exception e) {
                a[7] = true;
                StringBuilder sb = new StringBuilder();
                sb.append("Exception was occurred,");
                sb.append(e.getMessage());
                InstabugSDKLogger.m46623e(this, sb.toString());
                a[8] = true;
            }
            a[9] = true;
        }
    }

    private static /* synthetic */ boolean[] $jacocoInit() {
        boolean[] zArr = $jacocoData;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(6780217655344041809L, "com/instabug/chat/synchronization/SynchronizationManager", 103);
        $jacocoData = a;
        return a;
    }

    static {
        boolean[] $jacocoInit = $jacocoInit();
        $jacocoInit[102] = true;
    }

    public SynchronizationManager() {
        boolean[] $jacocoInit = $jacocoInit();
        $jacocoInit[0] = true;
        this.syncAction = new C9444a(this);
        $jacocoInit[1] = true;
        this.chattingTimeUpdateAction = new C9445b(this);
        $jacocoInit[2] = true;
    }

    static /* synthetic */ boolean access$000(SynchronizationManager synchronizationManager) {
        boolean[] $jacocoInit = $jacocoInit();
        boolean z = synchronizationManager.shouldSync;
        $jacocoInit[94] = true;
        return z;
    }

    static /* synthetic */ C9447d access$100(SynchronizationManager synchronizationManager) {
        boolean[] $jacocoInit = $jacocoInit();
        C9447d dVar = synchronizationManager.syncRunnable;
        $jacocoInit[95] = true;
        return dVar;
    }

    static /* synthetic */ Handler access$200(SynchronizationManager synchronizationManager) {
        boolean[] $jacocoInit = $jacocoInit();
        Handler handler2 = synchronizationManager.handler;
        $jacocoInit[96] = true;
        return handler2;
    }

    static /* synthetic */ void access$300(SynchronizationManager synchronizationManager, RequestResponse requestResponse, Context context, C12331g gVar) {
        boolean[] $jacocoInit = $jacocoInit();
        synchronizationManager.handleSuccessResponse(requestResponse, context, gVar);
        $jacocoInit[97] = true;
    }

    static /* synthetic */ void access$400(SynchronizationManager synchronizationManager, List list) {
        boolean[] $jacocoInit = $jacocoInit();
        synchronizationManager.clearReadMessages(list);
        $jacocoInit[98] = true;
    }

    static /* synthetic */ void access$500(SynchronizationManager synchronizationManager, C12331g gVar) {
        boolean[] $jacocoInit = $jacocoInit();
        synchronizationManager.handleFailureResponse(gVar);
        $jacocoInit[99] = true;
    }

    static /* synthetic */ C12331g access$600(SynchronizationManager synchronizationManager) {
        boolean[] $jacocoInit = $jacocoInit();
        C12331g<Long> gVar = synchronizationManager.syncAction;
        $jacocoInit[100] = true;
        return gVar;
    }

    static /* synthetic */ void access$700(SynchronizationManager synchronizationManager, Context context, C12331g gVar) {
        boolean[] $jacocoInit = $jacocoInit();
        synchronizationManager.syncMessages(context, gVar);
        $jacocoInit[101] = true;
    }

    private void clearReadMessages(List<C9426d> list) {
        boolean[] $jacocoInit = $jacocoInit();
        ReadQueueCacheManager.getInstance().notify(list);
        $jacocoInit[82] = true;
    }

    public static SynchronizationManager getInstance() {
        boolean[] $jacocoInit = $jacocoInit();
        if (INSTANCE != null) {
            $jacocoInit[3] = true;
        } else {
            $jacocoInit[4] = true;
            INSTANCE = new SynchronizationManager();
            $jacocoInit[5] = true;
        }
        SynchronizationManager synchronizationManager = INSTANCE;
        $jacocoInit[6] = true;
        return synchronizationManager;
    }

    private void handleFailureResponse(C12331g<Long> gVar) {
        boolean[] $jacocoInit = $jacocoInit();
        InstabugSDKLogger.m46626v(this, "Something went wrong while sync messages");
        this.isSyncing = false;
        try {
            $jacocoInit[56] = true;
            gVar.mo33410c(Long.valueOf(C9441a.m44200e()));
            $jacocoInit[57] = true;
        } catch (Exception e) {
            $jacocoInit[58] = true;
            StringBuilder sb = new StringBuilder();
            sb.append("Exception was occurred,");
            sb.append(e.getMessage());
            InstabugSDKLogger.m46623e(this, sb.toString());
            $jacocoInit[59] = true;
        }
        $jacocoInit[60] = true;
    }

    private void handleReceivedMessages(Context context, JSONArray jSONArray, boolean z) throws JSONException {
        boolean[] $jacocoInit = $jacocoInit();
        if (jSONArray.length() == 0) {
            $jacocoInit[72] = true;
        } else {
            $jacocoInit[73] = true;
            StringBuilder sb = new StringBuilder();
            sb.append("new messages received: ");
            sb.append(jSONArray.toString());
            InstabugSDKLogger.m46626v(this, sb.toString());
            $jacocoInit[74] = true;
            JSONObject[] jSONObjectArr = new JSONObject[jSONArray.length()];
            $jacocoInit[75] = true;
            int i = 0;
            $jacocoInit[76] = true;
            while (i < jSONArray.length()) {
                $jacocoInit[77] = true;
                jSONObjectArr[i] = jSONArray.getJSONObject(i);
                i++;
                $jacocoInit[78] = true;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("messages count:");
            sb2.append(jSONObjectArr.length);
            InstabugSDKLogger.m46626v(this, sb2.toString());
            $jacocoInit[79] = true;
            C9448a.m44260a().mo34049a(context, z, jSONObjectArr);
            $jacocoInit[80] = true;
        }
        $jacocoInit[81] = true;
    }

    private void handleSuccessResponse(RequestResponse requestResponse, Context context, C12331g<Long> gVar) {
        boolean[] $jacocoInit = $jacocoInit();
        InstabugSDKLogger.m46626v(this, "Chats synced successfully");
        boolean z = false;
        this.isSyncing = false;
        try {
            $jacocoInit[42] = true;
            $jacocoInit[43] = true;
            String str = (String) requestResponse.getResponseBody();
            $jacocoInit[44] = true;
            JSONArray parseReceivedMessages = parseReceivedMessages(str);
            $jacocoInit[45] = true;
            if (requestResponse.getResponseCode() == 203) {
                $jacocoInit[46] = true;
                z = true;
            } else {
                $jacocoInit[47] = true;
            }
            handleReceivedMessages(context, parseReceivedMessages, z);
            $jacocoInit[48] = true;
            handleTTL(parseTTL((String) requestResponse.getResponseBody()), gVar);
            $jacocoInit[49] = true;
        } catch (Exception e) {
            $jacocoInit[50] = true;
            InstabugSDKLogger.m46624e(this, e.getMessage(), e);
            try {
                $jacocoInit[51] = true;
                gVar.mo33410c(Long.valueOf(C9441a.m44200e()));
                $jacocoInit[52] = true;
            } catch (Exception e2) {
                $jacocoInit[53] = true;
                StringBuilder sb = new StringBuilder();
                sb.append("Exception was occurred,");
                sb.append(e2.getMessage());
                InstabugSDKLogger.m46623e(this, sb.toString());
                $jacocoInit[54] = true;
            }
        }
        $jacocoInit[55] = true;
    }

    private void handleTTL(long j, C12331g<Long> gVar) {
        boolean[] $jacocoInit = $jacocoInit();
        StringBuilder sb = new StringBuilder();
        sb.append("Next TTL: ");
        sb.append(j);
        InstabugSDKLogger.m46626v(this, sb.toString());
        if (j == -1) {
            $jacocoInit[63] = true;
        } else {
            $jacocoInit[64] = true;
            C9441a.m44193b(j);
            try {
                $jacocoInit[65] = true;
                gVar.mo33410c(Long.valueOf(j));
                $jacocoInit[66] = true;
            } catch (Exception e) {
                $jacocoInit[67] = true;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Exception was occurred,");
                sb2.append(e.getMessage());
                InstabugSDKLogger.m46623e(this, sb2.toString());
                $jacocoInit[68] = true;
            }
        }
        $jacocoInit[69] = true;
    }

    private boolean isChatFeatureEnabled() {
        boolean z;
        boolean[] $jacocoInit = $jacocoInit();
        if (InstabugCore.getFeatureState(Feature.IN_APP_MESSAGING) == State.ENABLED) {
            $jacocoInit[91] = true;
            z = true;
        } else {
            z = false;
            $jacocoInit[92] = true;
        }
        $jacocoInit[93] = true;
        return z;
    }

    private boolean isFeaturesFetchedBefore() {
        boolean[] $jacocoInit = $jacocoInit();
        boolean isFeaturesFetchedBefore = InstabugCore.isFeaturesFetchedBefore();
        $jacocoInit[83] = true;
        return isFeaturesFetchedBefore;
    }

    private boolean isSyncing() {
        boolean[] $jacocoInit = $jacocoInit();
        boolean z = this.isSyncing;
        $jacocoInit[23] = true;
        return z;
    }

    private JSONArray parseReceivedMessages(String str) throws JSONException {
        boolean[] $jacocoInit = $jacocoInit();
        JSONObject jSONObject = new JSONObject(str);
        $jacocoInit[70] = true;
        JSONArray jSONArray = jSONObject.getJSONArray(MISSING_MESSAGES);
        $jacocoInit[71] = true;
        return jSONArray;
    }

    private long parseTTL(String str) throws JSONException {
        boolean[] $jacocoInit = $jacocoInit();
        JSONObject jSONObject = new JSONObject(str);
        $jacocoInit[61] = true;
        long j = jSONObject.getLong(TTL);
        $jacocoInit[62] = true;
        return j;
    }

    private void subscribeToChatTimeUpdatedEvents() {
        boolean[] $jacocoInit = $jacocoInit();
        ChatTimeUpdatedEventBus instance = ChatTimeUpdatedEventBus.getInstance();
        C12331g<Long> gVar = this.chattingTimeUpdateAction;
        $jacocoInit[84] = true;
        this.chatTimeDisposable = instance.subscribe(gVar);
        $jacocoInit[85] = true;
    }

    private void syncMessages(Context context, C12331g<Long> gVar) {
        boolean[] $jacocoInit = $jacocoInit();
        if (!NetworkManager.isOnline(context)) {
            $jacocoInit[24] = true;
        } else if (!isFeaturesFetchedBefore()) {
            $jacocoInit[25] = true;
        } else {
            try {
                $jacocoInit[26] = true;
                this.isSyncing = true;
                $jacocoInit[27] = true;
                ReadQueueCacheManager instance = ReadQueueCacheManager.getInstance();
                $jacocoInit[28] = true;
                List all = instance.getAll();
                $jacocoInit[29] = true;
                C9433e a = C9433e.m44147a();
                $jacocoInit[30] = true;
                long lastMessageMessagedAt = ChatsCacheManager.getLastMessageMessagedAt();
                $jacocoInit[31] = true;
                int totalMessagesCount = ChatsCacheManager.getTotalMessagesCount();
                $jacocoInit[32] = true;
                JSONArray readMessagesArray = ReadQueueCacheManager.getInstance().getReadMessagesArray();
                C9446c cVar = new C9446c(this, context, gVar, all);
                $jacocoInit[33] = true;
                a.mo33992a(context, lastMessageMessagedAt, totalMessagesCount, readMessagesArray, cVar);
                $jacocoInit[34] = true;
            } catch (JSONException unused) {
                $jacocoInit[35] = true;
                handleFailureResponse(gVar);
                $jacocoInit[36] = true;
            }
            $jacocoInit[41] = true;
        }
        InstabugSDKLogger.m46627w(this, "device is offline, can't sync");
        try {
            $jacocoInit[37] = true;
            gVar.mo33410c(Long.valueOf(C9441a.m44200e()));
            $jacocoInit[38] = true;
        } catch (Exception e) {
            $jacocoInit[39] = true;
            StringBuilder sb = new StringBuilder();
            sb.append("Exception was occurred,");
            sb.append(e.getMessage());
            InstabugSDKLogger.m46623e(this, sb.toString());
            $jacocoInit[40] = true;
        }
        $jacocoInit[41] = true;
    }

    private void unSubscribeToChatTimeUpdatedEvents() {
        boolean[] $jacocoInit = $jacocoInit();
        C12314c cVar = this.chatTimeDisposable;
        if (cVar == null) {
            $jacocoInit[86] = true;
        } else if (cVar.mo41878d()) {
            $jacocoInit[87] = true;
        } else {
            $jacocoInit[88] = true;
            this.chatTimeDisposable.dispose();
            $jacocoInit[89] = true;
        }
        $jacocoInit[90] = true;
    }

    public void init(Context context) {
        boolean[] $jacocoInit = $jacocoInit();
        this.handler = new Handler();
        $jacocoInit[7] = true;
        this.syncRunnable = new C9447d(this, context);
        $jacocoInit[8] = true;
        subscribeToChatTimeUpdatedEvents();
        $jacocoInit[9] = true;
    }

    public void release() {
        boolean[] $jacocoInit = $jacocoInit();
        stop();
        $jacocoInit[21] = true;
        unSubscribeToChatTimeUpdatedEvents();
        this.handler = null;
        this.syncRunnable = null;
        $jacocoInit[22] = true;
    }

    public void stop() {
        boolean[] $jacocoInit = $jacocoInit();
        this.shouldSync = false;
        Handler handler2 = this.handler;
        if (handler2 == null) {
            $jacocoInit[16] = true;
        } else {
            C9447d dVar = this.syncRunnable;
            if (dVar == null) {
                $jacocoInit[17] = true;
            } else {
                $jacocoInit[18] = true;
                handler2.removeCallbacks(dVar);
                $jacocoInit[19] = true;
            }
        }
        $jacocoInit[20] = true;
    }

    public void sync() {
        boolean[] $jacocoInit = $jacocoInit();
        if (!isChatFeatureEnabled()) {
            $jacocoInit[10] = true;
        } else if (isSyncing()) {
            $jacocoInit[11] = true;
        } else {
            $jacocoInit[12] = true;
            stop();
            this.shouldSync = true;
            $jacocoInit[13] = true;
            this.handler.post(this.syncRunnable);
            $jacocoInit[14] = true;
        }
        $jacocoInit[15] = true;
    }
}
