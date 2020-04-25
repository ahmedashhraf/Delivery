package com.instabug.chat.cache;

import android.content.Context;
import com.instabug.chat.model.C9426d;
import com.instabug.chat.model.Chat;
import com.instabug.library.internal.storage.cache.CacheManager;
import com.instabug.library.internal.storage.cache.OnDiskCache;
import com.instabug.library.util.threading.PoolProvider;
import p205i.p471b.p472a.p473a.p474c.C13938g;

/* renamed from: com.instabug.chat.cache.a */
/* compiled from: CacheUtility */
public class C9409a {

    /* renamed from: a */
    private static transient /* synthetic */ boolean[] f24904a;

    /* renamed from: com.instabug.chat.cache.a$a */
    /* compiled from: CacheUtility */
    static class C9410a implements Runnable {

        /* renamed from: b */
        private static transient /* synthetic */ boolean[] f24905b;

        /* renamed from: a */
        final /* synthetic */ Context f24906a;

        C9410a(Context context) {
            boolean[] a = m44006a();
            this.f24906a = context;
            a[0] = true;
        }

        /* renamed from: a */
        private static /* synthetic */ boolean[] m44006a() {
            boolean[] zArr = f24905b;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(1272269102801244006L, "com/instabug/chat/cache/CacheUtility$1", 5);
            f24905b = a;
            return a;
        }

        public void run() {
            boolean[] a = m44006a();
            OnDiskCache onDiskCache = new OnDiskCache(this.f24906a, ChatsCacheManager.CHATS_DISK_CACHE_KEY, ChatsCacheManager.CHATS_DISK_CACHE_FILE_NAME, Chat.class);
            a[1] = true;
            CacheManager.getInstance().addCache(onDiskCache);
            a[2] = true;
            OnDiskCache onDiskCache2 = new OnDiskCache(this.f24906a, ReadQueueCacheManager.READ_QUEUE_DISK_CACHE_KEY, ReadQueueCacheManager.READ_QUEUE_DISK_CACHE_FILE_NAME, C9426d.class);
            a[3] = true;
            CacheManager.getInstance().addCache(onDiskCache2);
            a[4] = true;
        }
    }

    /* renamed from: com.instabug.chat.cache.a$b */
    /* compiled from: CacheUtility */
    static class C9411b implements Runnable {

        /* renamed from: a */
        private static transient /* synthetic */ boolean[] f24907a;

        C9411b() {
            m44007a()[0] = true;
        }

        /* renamed from: a */
        private static /* synthetic */ boolean[] m44007a() {
            boolean[] zArr = f24907a;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(-6634435192821967147L, "com/instabug/chat/cache/CacheUtility$2", 2);
            f24907a = a;
            return a;
        }

        public void run() {
            boolean[] a = m44007a();
            ChatsCacheManager.cleanupChats();
            a[1] = true;
        }
    }

    /* renamed from: com.instabug.chat.cache.a$c */
    /* compiled from: CacheUtility */
    static class C9412c implements Runnable {

        /* renamed from: a */
        private static transient /* synthetic */ boolean[] f24908a;

        C9412c() {
            m44008a()[0] = true;
        }

        /* renamed from: a */
        private static /* synthetic */ boolean[] m44008a() {
            boolean[] zArr = f24908a;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(1917590465113596204L, "com/instabug/chat/cache/CacheUtility$3", 3);
            f24908a = a;
            return a;
        }

        public void run() {
            boolean[] a = m44008a();
            ChatsCacheManager.saveCacheToDisk();
            a[1] = true;
            ReadQueueCacheManager.saveCacheToDisk();
            a[2] = true;
        }
    }

    /* renamed from: a */
    public static void m44003a(Context context) {
        boolean[] c = m44005c();
        PoolProvider.postIOTask(new C9410a(context));
        c[1] = true;
    }

    /* renamed from: b */
    public static void m44004b() {
        boolean[] c = m44005c();
        PoolProvider.postIOTask(new C9412c());
        c[3] = true;
    }

    /* renamed from: c */
    private static /* synthetic */ boolean[] m44005c() {
        boolean[] zArr = f24904a;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(-3041755605344559754L, "com/instabug/chat/cache/CacheUtility", 4);
        f24904a = a;
        return a;
    }

    /* renamed from: a */
    public static void m44002a() {
        boolean[] c = m44005c();
        PoolProvider.postIOTask(new C9411b());
        c[2] = true;
    }
}
