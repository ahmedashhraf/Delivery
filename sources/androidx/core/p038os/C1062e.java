package androidx.core.p038os;

import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Looper;
import android.os.Message;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import java.lang.reflect.InvocationTargetException;

/* renamed from: androidx.core.os.e */
/* compiled from: HandlerCompat */
public final class C1062e {

    /* renamed from: a */
    private static final String f4730a = "HandlerCompat";

    private C1062e() {
    }

    @C0193h0
    /* renamed from: a */
    public static Handler m6156a(@C0193h0 Looper looper) {
        int i = VERSION.SDK_INT;
        if (i >= 28) {
            return Handler.createAsync(looper);
        }
        if (i >= 16) {
            try {
                return (Handler) Handler.class.getDeclaredConstructor(new Class[]{Looper.class, Callback.class, Boolean.TYPE}).newInstance(new Object[]{looper, null, Boolean.valueOf(true)});
            } catch (IllegalAccessException | InstantiationException | NoSuchMethodException unused) {
            } catch (InvocationTargetException e) {
                Throwable cause = e.getCause();
                if (cause instanceof RuntimeException) {
                    throw ((RuntimeException) cause);
                } else if (cause instanceof Error) {
                    throw ((Error) cause);
                } else {
                    throw new RuntimeException(cause);
                }
            }
        }
        return new Handler(looper);
    }

    @C0193h0
    /* renamed from: a */
    public static Handler m6157a(@C0193h0 Looper looper, @C0193h0 Callback callback) {
        int i = VERSION.SDK_INT;
        if (i >= 28) {
            return Handler.createAsync(looper, callback);
        }
        if (i >= 16) {
            try {
                return (Handler) Handler.class.getDeclaredConstructor(new Class[]{Looper.class, Callback.class, Boolean.TYPE}).newInstance(new Object[]{looper, callback, Boolean.valueOf(true)});
            } catch (IllegalAccessException | InstantiationException | NoSuchMethodException unused) {
            } catch (InvocationTargetException e) {
                Throwable cause = e.getCause();
                if (cause instanceof RuntimeException) {
                    throw ((RuntimeException) cause);
                } else if (cause instanceof Error) {
                    throw ((Error) cause);
                } else {
                    throw new RuntimeException(cause);
                }
            }
        }
        return new Handler(looper, callback);
    }

    /* renamed from: a */
    public static boolean m6158a(@C0193h0 Handler handler, @C0193h0 Runnable runnable, @C0195i0 Object obj, long j) {
        if (VERSION.SDK_INT >= 28) {
            return handler.postDelayed(runnable, obj, j);
        }
        Message obtain = Message.obtain(handler, runnable);
        obtain.obj = obj;
        return handler.sendMessageDelayed(obtain, j);
    }
}
