package com.instabug.chat.p361ui.p363d;

import android.content.Context;
import androidx.annotation.C0193h0;
import androidx.fragment.app.C1376c;
import androidx.fragment.app.Fragment;
import com.instabug.chat.C9377a.C9397d;
import com.instabug.chat.cache.ChatsCacheManager;
import com.instabug.chat.model.Chat;
import com.instabug.chat.model.Chat.C9415a;
import com.instabug.chat.model.Message;
import com.instabug.chat.synchronization.C9448a;
import com.instabug.chat.synchronization.C9449b;
import com.instabug.library.PresentationManager;
import com.instabug.library.core.p382ui.BasePresenter;
import com.instabug.library.internal.storage.cache.CacheChangedListener;
import com.instabug.library.internal.storage.cache.CacheManager;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p195e.p196a.C5923b0;
import p195e.p196a.p442e1.C12252e;
import p195e.p196a.p444s0.p446d.C12304a;
import p195e.p196a.p447u0.C12314c;
import p195e.p196a.p467z0.C13787e;
import p205i.p471b.p472a.p473a.p474c.C13938g;

/* renamed from: com.instabug.chat.ui.d.d */
/* compiled from: ChatsPresenter */
class C9494d extends BasePresenter<C9491b> implements C9449b, C9490a, CacheChangedListener<Chat> {

    /* renamed from: c */
    private static transient /* synthetic */ boolean[] f25142c;

    /* renamed from: a */
    private C12252e<Long> f25143a;

    /* renamed from: b */
    private C12314c f25144b;

    /* renamed from: com.instabug.chat.ui.d.d$a */
    /* compiled from: ChatsPresenter */
    class C9495a implements Runnable {

        /* renamed from: O */
        private static transient /* synthetic */ boolean[] f25145O;

        /* renamed from: N */
        final /* synthetic */ C9494d f25146N;

        /* renamed from: a */
        final /* synthetic */ C9491b f25147a;

        /* renamed from: b */
        final /* synthetic */ List f25148b;

        C9495a(C9494d dVar, C9491b bVar, List list) {
            boolean[] a = m44483a();
            this.f25146N = dVar;
            this.f25147a = bVar;
            this.f25148b = list;
            a[0] = true;
        }

        /* renamed from: a */
        private static /* synthetic */ boolean[] m44483a() {
            boolean[] zArr = f25145O;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(4785281577390582067L, "com/instabug/chat/ui/chats/ChatsPresenter$1", 5);
            f25145O = a;
            return a;
        }

        public void run() {
            boolean[] a = m44483a();
            C9397d a2 = C9397d.m43935a();
            C9491b bVar = this.f25147a;
            a[1] = true;
            Fragment fragment = (Fragment) bVar.getViewContext();
            a[2] = true;
            C1376c activity = fragment.getActivity();
            List list = this.f25148b;
            a[3] = true;
            a2.mo33835a((Context) activity, list);
            a[4] = true;
        }
    }

    /* renamed from: com.instabug.chat.ui.d.d$b */
    /* compiled from: ChatsPresenter */
    class C9496b extends C13787e<Long> {

        /* renamed from: N */
        private static transient /* synthetic */ boolean[] f25149N;

        /* renamed from: b */
        final /* synthetic */ C9494d f25150b;

        C9496b(C9494d dVar) {
            boolean[] c = m44484c();
            this.f25150b = dVar;
            c[0] = true;
        }

        /* renamed from: c */
        private static /* synthetic */ boolean[] m44484c() {
            boolean[] zArr = f25149N;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(6775435051251043331L, "com/instabug/chat/ui/chats/ChatsPresenter$2", 5);
            f25149N = a;
            return a;
        }

        /* renamed from: a */
        public /* synthetic */ void mo33453a(Object obj) {
            boolean[] c = m44484c();
            mo34158a((Long) obj);
            c[4] = true;
        }

        public void onComplete() {
            m44484c()[1] = true;
        }

        public void onError(Throwable th) {
            m44484c()[2] = true;
        }

        /* renamed from: a */
        public void mo34158a(Long l) {
            boolean[] c = m44484c();
            C9494d.m44472a(this.f25150b);
            c[3] = true;
        }
    }

    C9494d(C9491b bVar) {
        boolean[] i = m44477i();
        super(bVar);
        i[0] = true;
    }

    /* renamed from: a */
    static /* synthetic */ void m44472a(C9494d dVar) {
        boolean[] i = m44477i();
        dVar.m44475g();
        i[50] = true;
    }

    /* renamed from: e */
    private void m44473e() {
        boolean[] i = m44477i();
        this.f25143a = C12252e.m55181U();
        C12252e<Long> eVar = this.f25143a;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        i[26] = true;
        C5923b0 b = eVar.mo23900b(300, timeUnit);
        i[27] = true;
        C5923b0 a = b.mo23825a(C12304a.m55390a());
        C9496b bVar = new C9496b(this);
        i[28] = true;
        this.f25144b = (C12314c) a.mo24007f(bVar);
        i[29] = true;
    }

    /* renamed from: f */
    private void m44474f() {
        boolean[] i = m44477i();
        C12314c cVar = this.f25144b;
        if (cVar == null) {
            i[30] = true;
        } else if (cVar.mo41878d()) {
            i[31] = true;
        } else {
            i[32] = true;
            this.f25144b.dispose();
            i[33] = true;
        }
        i[34] = true;
    }

    /* renamed from: g */
    private void m44475g() {
        boolean[] i = m44477i();
        ArrayList h = m44476h();
        i[35] = true;
        Collections.sort(h, Collections.reverseOrder(new C9415a()));
        WeakReference<V> weakReference = this.view;
        if (weakReference == null) {
            i[36] = true;
        } else {
            i[37] = true;
            C9491b bVar = (C9491b) weakReference.get();
            if (bVar == null) {
                i[38] = true;
            } else {
                i[39] = true;
                bVar.mo34149a(h);
                i[40] = true;
                bVar.mo34151d();
                i[41] = true;
            }
        }
        i[42] = true;
    }

    /* renamed from: h */
    private ArrayList<Chat> m44476h() {
        ArrayList<Chat> arrayList;
        boolean[] i = m44477i();
        if (ChatsCacheManager.getCache() != null) {
            i[43] = true;
            arrayList = new ArrayList<>(ChatsCacheManager.getValidChats());
            i[44] = true;
        } else {
            arrayList = new ArrayList<>();
            i[45] = true;
        }
        Collections.sort(arrayList, Collections.reverseOrder(new C9415a()));
        i[46] = true;
        return arrayList;
    }

    /* renamed from: i */
    private static /* synthetic */ boolean[] m44477i() {
        boolean[] zArr = f25142c;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(5166129839176859006L, "com/instabug/chat/ui/chats/ChatsPresenter", 51);
        f25142c = a;
        return a;
    }

    /* renamed from: b */
    public void mo34156b(Chat chat) {
        boolean[] i = m44477i();
        m44471a(System.currentTimeMillis());
        i[22] = true;
    }

    /* renamed from: c */
    public void mo34147c() {
        boolean[] i = m44477i();
        CacheManager.getInstance().unSubscribe(ChatsCacheManager.CHATS_MEMORY_CACHE_KEY, this);
        i[5] = true;
        C9448a.m44260a().mo34051b((C9449b) this);
        i[6] = true;
        m44474f();
        i[7] = true;
    }

    /* renamed from: d */
    public void mo34148d() {
        boolean[] i = m44477i();
        m44473e();
        i[1] = true;
        CacheManager.getInstance().subscribe(ChatsCacheManager.CHATS_MEMORY_CACHE_KEY, this);
        i[2] = true;
        C9448a.m44260a().mo34050a((C9449b) this);
        i[3] = true;
        m44475g();
        i[4] = true;
    }

    public void onCacheInvalidated() {
        boolean[] i = m44477i();
        m44471a(System.currentTimeMillis());
        i[24] = true;
    }

    public /* synthetic */ void onCachedItemAdded(Object obj) {
        boolean[] i = m44477i();
        mo34156b((Chat) obj);
        i[48] = true;
    }

    public /* synthetic */ void onCachedItemRemoved(Object obj) {
        boolean[] i = m44477i();
        mo34154a((Chat) obj);
        i[49] = true;
    }

    public /* synthetic */ void onCachedItemUpdated(Object obj, Object obj2) {
        boolean[] i = m44477i();
        mo34155a((Chat) obj, (Chat) obj2);
        i[47] = true;
    }

    public List<Message> onNewMessagesReceived(@C0193h0 List<Message> list) {
        boolean[] i = m44477i();
        WeakReference<V> weakReference = this.view;
        if (weakReference == null) {
            i[8] = true;
        } else {
            i[9] = true;
            C9491b bVar = (C9491b) weakReference.get();
            if (bVar == null) {
                i[10] = true;
            } else {
                i[11] = true;
                if (((Fragment) bVar.getViewContext()).getActivity() == null) {
                    i[12] = true;
                } else {
                    i[13] = true;
                    if (bVar.mo34150c()) {
                        i[14] = true;
                        C9397d a = C9397d.m43935a();
                        i[15] = true;
                        Fragment fragment = (Fragment) bVar.getViewContext();
                        i[16] = true;
                        C1376c activity = fragment.getActivity();
                        i[17] = true;
                        a.mo33834a((Context) activity);
                        i[18] = true;
                    } else {
                        PresentationManager.getInstance().show(new C9495a(this, bVar, list));
                        i[19] = true;
                    }
                }
            }
        }
        i[20] = true;
        return null;
    }

    /* renamed from: a */
    public void mo34154a(Chat chat) {
        boolean[] i = m44477i();
        m44471a(System.currentTimeMillis());
        i[21] = true;
    }

    /* renamed from: a */
    public void mo34155a(Chat chat, Chat chat2) {
        boolean[] i = m44477i();
        m44471a(System.currentTimeMillis());
        i[23] = true;
    }

    /* renamed from: a */
    private void m44471a(long j) {
        boolean[] i = m44477i();
        this.f25143a.mo33453a(Long.valueOf(j));
        i[25] = true;
    }
}
