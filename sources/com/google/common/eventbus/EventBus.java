package com.google.common.eventbus;

import com.google.common.base.C7358i0;
import com.google.common.base.C7397x;
import com.google.common.cache.C5832d;
import com.google.common.cache.C7446i;
import com.google.common.cache.CacheLoader;
import com.google.common.collect.C7886h4;
import com.google.common.collect.C8022l5;
import com.google.common.collect.C8067n2;
import com.google.common.util.concurrent.UncheckedExecutionException;
import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.LinkedList;
import java.util.Map.Entry;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.logging.Level;
import java.util.logging.Logger;
import p076c.p112d.p148d.p149a.C2775a;
import p076c.p112d.p148d.p149a.C2778d;
import p076c.p112d.p148d.p280h.C6693m;
import p212io.branch.referral.C6009d;

@C2775a
public class EventBus {
    private static final C7446i<Class<?>, Set<Class<?>>> flattenHierarchyCache = C5832d.m25587w().mo23191s().mo23167a((CacheLoader<? super K1, V1>) new C8330a<Object,V1>());
    private final ThreadLocal<Queue<C8333d>> eventsToDispatch;
    private final C8342h finder;
    private final ThreadLocal<Boolean> isDispatching;
    private C8341g subscriberExceptionHandler;
    private final C8022l5<Class<?>, C8339d> subscribersByType;
    private final ReadWriteLock subscribersByTypeLock;

    /* renamed from: com.google.common.eventbus.EventBus$a */
    static class C8330a extends CacheLoader<Class<?>, Set<Class<?>>> {
        C8330a() {
        }

        /* renamed from: a */
        public Set<Class<?>> mo29318a(Class<?> cls) {
            return C6693m.m31985e(cls).mo26850i().mo26860H();
        }
    }

    /* renamed from: com.google.common.eventbus.EventBus$b */
    class C8331b extends ThreadLocal<Queue<C8333d>> {
        C8331b() {
        }

        /* access modifiers changed from: protected */
        public Queue<C8333d> initialValue() {
            return new LinkedList();
        }
    }

    /* renamed from: com.google.common.eventbus.EventBus$c */
    class C8332c extends ThreadLocal<Boolean> {
        C8332c() {
        }

        /* access modifiers changed from: protected */
        public Boolean initialValue() {
            return Boolean.valueOf(false);
        }
    }

    /* renamed from: com.google.common.eventbus.EventBus$d */
    static class C8333d {

        /* renamed from: a */
        final Object f22226a;

        /* renamed from: b */
        final C8339d f22227b;

        public C8333d(Object obj, C8339d dVar) {
            this.f22226a = C7397x.m35664a(obj);
            this.f22227b = (C8339d) C7397x.m35664a(dVar);
        }
    }

    /* renamed from: com.google.common.eventbus.EventBus$e */
    private static final class C8334e implements C8341g {

        /* renamed from: a */
        private final Logger f22228a;

        public C8334e(String str) {
            StringBuilder sb = new StringBuilder();
            sb.append(EventBus.class.getName());
            sb.append(".");
            sb.append((String) C7397x.m35664a(str));
            this.f22228a = Logger.getLogger(sb.toString());
        }

        /* renamed from: a */
        public void mo31371a(Throwable th, C8340f fVar) {
            Logger logger = this.f22228a;
            Level level = Level.SEVERE;
            StringBuilder sb = new StringBuilder();
            sb.append("Could not dispatch event: ");
            sb.append(fVar.mo31386c());
            sb.append(" to ");
            sb.append(fVar.mo31387d());
            logger.log(level, sb.toString(), th.getCause());
        }
    }

    public EventBus() {
        this(C6009d.f17209I);
    }

    /* access modifiers changed from: 0000 */
    public void dispatch(Object obj, C8339d dVar) {
        try {
            dVar.mo31379a(obj);
        } catch (InvocationTargetException e) {
            this.subscriberExceptionHandler.mo31371a(e.getCause(), new C8340f(this, obj, dVar.mo31380b(), dVar.mo31378a()));
        } catch (Throwable th) {
            Logger.getLogger(EventBus.class.getName()).log(Level.SEVERE, String.format("Exception %s thrown while handling exception: %s", new Object[]{th, e.getCause()}), th);
        }
    }

    /* access modifiers changed from: 0000 */
    public void dispatchQueuedEvents() {
        if (!((Boolean) this.isDispatching.get()).booleanValue()) {
            this.isDispatching.set(Boolean.valueOf(true));
            try {
                Queue queue = (Queue) this.eventsToDispatch.get();
                while (true) {
                    C8333d dVar = (C8333d) queue.poll();
                    if (dVar != null) {
                        dispatch(dVar.f22226a, dVar.f22227b);
                    } else {
                        return;
                    }
                }
            } finally {
                this.isDispatching.remove();
                this.eventsToDispatch.remove();
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public void enqueueEvent(Object obj, C8339d dVar) {
        ((Queue) this.eventsToDispatch.get()).offer(new C8333d(obj, dVar));
    }

    /* access modifiers changed from: 0000 */
    @C2778d
    public Set<Class<?>> flattenHierarchy(Class<?> cls) {
        try {
            return (Set) flattenHierarchyCache.mo29334c(cls);
        } catch (UncheckedExecutionException e) {
            throw C7358i0.m35589d(e.getCause());
        }
    }

    public void post(Object obj) {
        boolean z = false;
        for (Class cls : flattenHierarchy(obj.getClass())) {
            this.subscribersByTypeLock.readLock().lock();
            try {
                Set<C8339d> set = this.subscribersByType.get(cls);
                if (!set.isEmpty()) {
                    z = true;
                    for (C8339d enqueueEvent : set) {
                        enqueueEvent(obj, enqueueEvent);
                    }
                }
            } finally {
                this.subscribersByTypeLock.readLock().unlock();
            }
        }
        if (!z && !(obj instanceof C8338c)) {
            post(new C8338c(this, obj));
        }
        dispatchQueuedEvents();
    }

    public void register(Object obj) {
        C7886h4 a = this.finder.mo31372a(obj);
        this.subscribersByTypeLock.writeLock().lock();
        try {
            this.subscribersByType.mo29701a(a);
        } finally {
            this.subscribersByTypeLock.writeLock().unlock();
        }
    }

    public void unregister(Object obj) {
        for (Entry entry : this.finder.mo31372a(obj).mo29703j().entrySet()) {
            Class cls = (Class) entry.getKey();
            Collection collection = (Collection) entry.getValue();
            this.subscribersByTypeLock.writeLock().lock();
            try {
                Set set = this.subscribersByType.get(cls);
                if (set.containsAll(collection)) {
                    set.removeAll(collection);
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("missing event subscriber for an annotated method. Is ");
                    sb.append(obj);
                    sb.append(" registered?");
                    throw new IllegalArgumentException(sb.toString());
                }
            } finally {
                this.subscribersByTypeLock.writeLock().unlock();
            }
        }
    }

    public EventBus(String str) {
        this((C8341g) new C8334e(str));
    }

    public EventBus(C8341g gVar) {
        this.subscribersByType = C8067n2.m38579s();
        this.subscribersByTypeLock = new ReentrantReadWriteLock();
        this.finder = new C8335b();
        this.eventsToDispatch = new C8331b();
        this.isDispatching = new C8332c();
        this.subscriberExceptionHandler = (C8341g) C7397x.m35664a(gVar);
    }
}
