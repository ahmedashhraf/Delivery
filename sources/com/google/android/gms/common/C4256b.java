package com.google.android.gms.common;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.google.android.gms.common.annotation.C4056a;
import com.google.android.gms.common.internal.C4300a0;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

@C4056a
/* renamed from: com.google.android.gms.common.b */
public class C4256b implements ServiceConnection {

    /* renamed from: a */
    private boolean f13231a = false;

    /* renamed from: b */
    private final BlockingQueue<IBinder> f13232b = new LinkedBlockingQueue();

    @C4056a
    /* renamed from: a */
    public IBinder mo18021a(long j, TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        C4300a0.m18634c("BlockingServiceConnection.getServiceWithTimeout() called on main thread");
        if (!this.f13231a) {
            this.f13231a = true;
            IBinder iBinder = (IBinder) this.f13232b.poll(j, timeUnit);
            if (iBinder != null) {
                return iBinder;
            }
            throw new TimeoutException("Timed out waiting for the service connection");
        }
        throw new IllegalStateException("Cannot call get on this connection more than once");
    }

    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f13232b.add(iBinder);
    }

    public void onServiceDisconnected(ComponentName componentName) {
    }

    @C4056a
    /* renamed from: a */
    public IBinder mo18020a() throws InterruptedException {
        C4300a0.m18634c("BlockingServiceConnection.getService() called on main thread");
        if (!this.f13231a) {
            this.f13231a = true;
            return (IBinder) this.f13232b.take();
        }
        throw new IllegalStateException("Cannot call get on this connection more than once");
    }
}
