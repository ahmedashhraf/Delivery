package com.google.android.gms.dynamic;

import android.content.Context;
import android.os.IBinder;
import com.google.android.gms.common.C4284g;
import com.google.android.gms.common.annotation.C4056a;
import com.google.android.gms.common.internal.C4300a0;

@C4056a
public abstract class RemoteCreator<T> {

    /* renamed from: a */
    private final String f13781a;

    /* renamed from: b */
    private T f13782b;

    @C4056a
    public static class RemoteCreatorException extends Exception {
        public RemoteCreatorException(String str) {
            super(str);
        }

        public RemoteCreatorException(String str, Throwable th) {
            super(str, th);
        }
    }

    @C4056a
    protected RemoteCreator(String str) {
        this.f13781a = str;
    }

    /* access modifiers changed from: protected */
    @C4056a
    /* renamed from: a */
    public final T mo18579a(Context context) throws RemoteCreatorException {
        if (this.f13782b == null) {
            C4300a0.m18620a(context);
            Context remoteContext = C4284g.getRemoteContext(context);
            if (remoteContext != null) {
                try {
                    this.f13782b = mo18279a((IBinder) remoteContext.getClassLoader().loadClass(this.f13781a).newInstance());
                } catch (ClassNotFoundException e) {
                    throw new RemoteCreatorException("Could not load creator class.", e);
                } catch (InstantiationException e2) {
                    throw new RemoteCreatorException("Could not instantiate creator.", e2);
                } catch (IllegalAccessException e3) {
                    throw new RemoteCreatorException("Could not access creator.", e3);
                }
            } else {
                throw new RemoteCreatorException("Could not get remote context.");
            }
        }
        return this.f13782b;
    }

    /* access modifiers changed from: protected */
    @C4056a
    /* renamed from: a */
    public abstract T mo18279a(IBinder iBinder);
}
