package androidx.core.p034l;

import android.app.ActionBar;
import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface.OnKeyListener;
import android.os.Build.VERSION;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.view.Window.Callback;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import androidx.annotation.C0207n0;
import androidx.annotation.C0207n0.C0208a;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

@C0207n0({C0208a.LIBRARY_GROUP_PREFIX})
/* renamed from: androidx.core.l.i */
/* compiled from: KeyEventDispatcher */
public class C0988i {

    /* renamed from: a */
    private static boolean f4422a = false;

    /* renamed from: b */
    private static Method f4423b = null;

    /* renamed from: c */
    private static boolean f4424c = false;

    /* renamed from: d */
    private static Field f4425d;

    /* renamed from: androidx.core.l.i$a */
    /* compiled from: KeyEventDispatcher */
    public interface C0989a {
        boolean superDispatchKeyEvent(KeyEvent keyEvent);
    }

    private C0988i() {
    }

    /* renamed from: a */
    public static boolean m5667a(@C0193h0 View view, @C0193h0 KeyEvent keyEvent) {
        return C0962e0.m5480b(view, keyEvent);
    }

    /* renamed from: a */
    public static boolean m5668a(@C0193h0 C0989a aVar, @C0195i0 View view, @C0195i0 Callback callback, @C0193h0 KeyEvent keyEvent) {
        boolean z = false;
        if (aVar == null) {
            return false;
        }
        if (VERSION.SDK_INT >= 28) {
            return aVar.superDispatchKeyEvent(keyEvent);
        }
        if (callback instanceof Activity) {
            return m5665a((Activity) callback, keyEvent);
        }
        if (callback instanceof Dialog) {
            return m5666a((Dialog) callback, keyEvent);
        }
        if ((view != null && C0962e0.m5467a(view, keyEvent)) || aVar.superDispatchKeyEvent(keyEvent)) {
            z = true;
        }
        return z;
    }

    /* renamed from: a */
    private static boolean m5664a(ActionBar actionBar, KeyEvent keyEvent) {
        if (!f4422a) {
            try {
                f4423b = actionBar.getClass().getMethod("onMenuKeyEvent", new Class[]{KeyEvent.class});
            } catch (NoSuchMethodException unused) {
            }
            f4422a = true;
        }
        Method method = f4423b;
        if (method != null) {
            try {
                return ((Boolean) method.invoke(actionBar, new Object[]{keyEvent})).booleanValue();
            } catch (IllegalAccessException | InvocationTargetException unused2) {
            }
        }
        return false;
    }

    /* renamed from: a */
    private static boolean m5665a(Activity activity, KeyEvent keyEvent) {
        activity.onUserInteraction();
        Window window = activity.getWindow();
        if (window.hasFeature(8)) {
            ActionBar actionBar = activity.getActionBar();
            if (keyEvent.getKeyCode() == 82 && actionBar != null && m5664a(actionBar, keyEvent)) {
                return true;
            }
        }
        if (window.superDispatchKeyEvent(keyEvent)) {
            return true;
        }
        View decorView = window.getDecorView();
        if (C0962e0.m5467a(decorView, keyEvent)) {
            return true;
        }
        return keyEvent.dispatch(activity, decorView != null ? decorView.getKeyDispatcherState() : null, activity);
    }

    /* renamed from: a */
    private static OnKeyListener m5663a(Dialog dialog) {
        if (!f4424c) {
            try {
                f4425d = Dialog.class.getDeclaredField("mOnKeyListener");
                f4425d.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            f4424c = true;
        }
        Field field = f4425d;
        if (field != null) {
            try {
                return (OnKeyListener) field.get(dialog);
            } catch (IllegalAccessException unused2) {
            }
        }
        return null;
    }

    /* renamed from: a */
    private static boolean m5666a(Dialog dialog, KeyEvent keyEvent) {
        OnKeyListener a = m5663a(dialog);
        if (a != null && a.onKey(dialog, keyEvent.getKeyCode(), keyEvent)) {
            return true;
        }
        Window window = dialog.getWindow();
        if (window.superDispatchKeyEvent(keyEvent)) {
            return true;
        }
        View decorView = window.getDecorView();
        if (C0962e0.m5467a(decorView, keyEvent)) {
            return true;
        }
        return keyEvent.dispatch(dialog, decorView != null ? decorView.getKeyDispatcherState() : null, dialog);
    }
}
