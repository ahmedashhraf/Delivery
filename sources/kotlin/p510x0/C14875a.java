package kotlin.p510x0;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock;
import java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock;
import kotlin.p213a1.C6041f;
import kotlin.p214b1.C6055e;
import kotlin.p214b1.p215t.C6069a;
import kotlin.p214b1.p216u.C14427e0;
import p205i.p209c.p210a.C6003d;

@C6055e(name = "LocksKt")
/* renamed from: kotlin.x0.a */
/* compiled from: Locks.kt */
public final class C14875a {
    @C6041f
    /* renamed from: a */
    private static final <T> T m65920a(@C6003d Lock lock, C6069a<? extends T> aVar) {
        lock.lock();
        try {
            return aVar.mo24947p();
        } finally {
            C14427e0.m62417b(1);
            lock.unlock();
            C14427e0.m62414a(1);
        }
    }

    @C6041f
    /* renamed from: b */
    private static final <T> T m65922b(@C6003d ReentrantReadWriteLock reentrantReadWriteLock, C6069a<? extends T> aVar) {
        ReadLock readLock = reentrantReadWriteLock.readLock();
        int i = 0;
        int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
        for (int i2 = 0; i2 < readHoldCount; i2++) {
            readLock.unlock();
        }
        WriteLock writeLock = reentrantReadWriteLock.writeLock();
        writeLock.lock();
        try {
            T p = aVar.mo24947p();
            writeLock.unlock();
            C14427e0.m62414a(1);
            return p;
        } finally {
            C14427e0.m62417b(1);
            while (i < readHoldCount) {
                readLock.lock();
                i++;
            }
            writeLock.unlock();
            C14427e0.m62414a(1);
        }
    }

    @C6041f
    /* renamed from: a */
    private static final <T> T m65921a(@C6003d ReentrantReadWriteLock reentrantReadWriteLock, C6069a<? extends T> aVar) {
        ReadLock readLock = reentrantReadWriteLock.readLock();
        readLock.lock();
        try {
            return aVar.mo24947p();
        } finally {
            C14427e0.m62417b(1);
            readLock.unlock();
            C14427e0.m62414a(1);
        }
    }
}
