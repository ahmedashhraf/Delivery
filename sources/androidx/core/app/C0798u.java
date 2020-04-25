package androidx.core.app;

import android.app.AppOpsManager;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationChannelGroup;
import android.app.NotificationManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ApplicationInfo;
import android.content.pm.ResolveInfo;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Message;
import android.os.RemoteException;
import android.provider.Settings.Secure;
import android.support.p003v4.app.C0009a;
import android.support.p003v4.app.C0009a.C0010a;
import android.util.Log;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import androidx.annotation.C0221u;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/* renamed from: androidx.core.app.u */
/* compiled from: NotificationManagerCompat */
public final class C0798u {

    /* renamed from: c */
    private static final String f3791c = "NotifManCompat";

    /* renamed from: d */
    private static final String f3792d = "checkOpNoThrow";

    /* renamed from: e */
    private static final String f3793e = "OP_POST_NOTIFICATION";

    /* renamed from: f */
    public static final String f3794f = "android.support.useSideChannel";

    /* renamed from: g */
    public static final String f3795g = "android.support.BIND_NOTIFICATION_SIDE_CHANNEL";

    /* renamed from: h */
    static final int f3796h = 19;

    /* renamed from: i */
    private static final int f3797i = 1000;

    /* renamed from: j */
    private static final int f3798j = 6;

    /* renamed from: k */
    private static final String f3799k = "enabled_notification_listeners";

    /* renamed from: l */
    private static final Object f3800l = new Object();
    @C0221u("sEnabledNotificationListenersLock")

    /* renamed from: m */
    private static String f3801m = null;
    @C0221u("sEnabledNotificationListenersLock")

    /* renamed from: n */
    private static Set<String> f3802n = new HashSet();

    /* renamed from: o */
    private static final Object f3803o = new Object();
    @C0221u("sLock")

    /* renamed from: p */
    private static C0802d f3804p = null;

    /* renamed from: q */
    public static final int f3805q = -1000;

    /* renamed from: r */
    public static final int f3806r = 0;

    /* renamed from: s */
    public static final int f3807s = 1;

    /* renamed from: t */
    public static final int f3808t = 2;

    /* renamed from: u */
    public static final int f3809u = 3;

    /* renamed from: v */
    public static final int f3810v = 4;

    /* renamed from: w */
    public static final int f3811w = 5;

    /* renamed from: a */
    private final Context f3812a;

    /* renamed from: b */
    private final NotificationManager f3813b = ((NotificationManager) this.f3812a.getSystemService("notification"));

    /* renamed from: androidx.core.app.u$a */
    /* compiled from: NotificationManagerCompat */
    private static class C0799a implements C0804e {

        /* renamed from: a */
        final String f3814a;

        /* renamed from: b */
        final int f3815b;

        /* renamed from: c */
        final String f3816c;

        /* renamed from: d */
        final boolean f3817d;

        C0799a(String str) {
            this.f3814a = str;
            this.f3815b = 0;
            this.f3816c = null;
            this.f3817d = true;
        }

        /* renamed from: a */
        public void mo4378a(C0009a aVar) throws RemoteException {
            if (this.f3817d) {
                aVar.mo30d(this.f3814a);
            } else {
                aVar.mo28a(this.f3814a, this.f3815b, this.f3816c);
            }
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("CancelTask[");
            sb.append("packageName:");
            sb.append(this.f3814a);
            sb.append(", id:");
            sb.append(this.f3815b);
            sb.append(", tag:");
            sb.append(this.f3816c);
            sb.append(", all:");
            sb.append(this.f3817d);
            sb.append("]");
            return sb.toString();
        }

        C0799a(String str, int i, String str2) {
            this.f3814a = str;
            this.f3815b = i;
            this.f3816c = str2;
            this.f3817d = false;
        }
    }

    /* renamed from: androidx.core.app.u$b */
    /* compiled from: NotificationManagerCompat */
    private static class C0800b implements C0804e {

        /* renamed from: a */
        final String f3818a;

        /* renamed from: b */
        final int f3819b;

        /* renamed from: c */
        final String f3820c;

        /* renamed from: d */
        final Notification f3821d;

        C0800b(String str, int i, String str2, Notification notification) {
            this.f3818a = str;
            this.f3819b = i;
            this.f3820c = str2;
            this.f3821d = notification;
        }

        /* renamed from: a */
        public void mo4378a(C0009a aVar) throws RemoteException {
            aVar.mo29a(this.f3818a, this.f3819b, this.f3820c, this.f3821d);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("NotifyTask[");
            sb.append("packageName:");
            sb.append(this.f3818a);
            sb.append(", id:");
            sb.append(this.f3819b);
            sb.append(", tag:");
            sb.append(this.f3820c);
            sb.append("]");
            return sb.toString();
        }
    }

    /* renamed from: androidx.core.app.u$c */
    /* compiled from: NotificationManagerCompat */
    private static class C0801c {

        /* renamed from: a */
        final ComponentName f3822a;

        /* renamed from: b */
        final IBinder f3823b;

        C0801c(ComponentName componentName, IBinder iBinder) {
            this.f3822a = componentName;
            this.f3823b = iBinder;
        }
    }

    /* renamed from: androidx.core.app.u$d */
    /* compiled from: NotificationManagerCompat */
    private static class C0802d implements Callback, ServiceConnection {

        /* renamed from: f */
        private static final int f3824f = 0;

        /* renamed from: g */
        private static final int f3825g = 1;

        /* renamed from: h */
        private static final int f3826h = 2;

        /* renamed from: i */
        private static final int f3827i = 3;

        /* renamed from: a */
        private final Context f3828a;

        /* renamed from: b */
        private final HandlerThread f3829b;

        /* renamed from: c */
        private final Handler f3830c;

        /* renamed from: d */
        private final Map<ComponentName, C0803a> f3831d = new HashMap();

        /* renamed from: e */
        private Set<String> f3832e = new HashSet();

        /* renamed from: androidx.core.app.u$d$a */
        /* compiled from: NotificationManagerCompat */
        private static class C0803a {

            /* renamed from: a */
            final ComponentName f3833a;

            /* renamed from: b */
            boolean f3834b = false;

            /* renamed from: c */
            C0009a f3835c;

            /* renamed from: d */
            ArrayDeque<C0804e> f3836d = new ArrayDeque<>();

            /* renamed from: e */
            int f3837e = 0;

            C0803a(ComponentName componentName) {
                this.f3833a = componentName;
            }
        }

        C0802d(Context context) {
            this.f3828a = context;
            this.f3829b = new HandlerThread("NotificationManagerCompat");
            this.f3829b.start();
            this.f3830c = new Handler(this.f3829b.getLooper(), this);
        }

        /* renamed from: b */
        private void m4670b(C0804e eVar) {
            m4664a();
            for (C0803a aVar : this.f3831d.values()) {
                aVar.f3836d.add(eVar);
                m4671c(aVar);
            }
        }

        /* renamed from: c */
        private void m4671c(C0803a aVar) {
            String str = C0798u.f3791c;
            if (Log.isLoggable(str, 3)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Processing component ");
                sb.append(aVar.f3833a);
                sb.append(", ");
                sb.append(aVar.f3836d.size());
                sb.append(" queued tasks");
                sb.toString();
            }
            if (!aVar.f3836d.isEmpty()) {
                if (!m4667a(aVar) || aVar.f3835c == null) {
                    m4672d(aVar);
                    return;
                }
                while (true) {
                    C0804e eVar = (C0804e) aVar.f3836d.peek();
                    if (eVar == null) {
                        break;
                    }
                    try {
                        if (Log.isLoggable(str, 3)) {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("Sending task ");
                            sb2.append(eVar);
                            sb2.toString();
                        }
                        eVar.mo4378a(aVar.f3835c);
                        aVar.f3836d.remove();
                    } catch (DeadObjectException unused) {
                        if (Log.isLoggable(str, 3)) {
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append("Remote service has died: ");
                            sb3.append(aVar.f3833a);
                            sb3.toString();
                        }
                    } catch (RemoteException unused2) {
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append("RemoteException communicating with ");
                        sb4.append(aVar.f3833a);
                        sb4.toString();
                    }
                }
                if (!aVar.f3836d.isEmpty()) {
                    m4672d(aVar);
                }
            }
        }

        /* renamed from: d */
        private void m4672d(C0803a aVar) {
            if (!this.f3830c.hasMessages(3, aVar.f3833a)) {
                aVar.f3837e++;
                int i = aVar.f3837e;
                if (i > 6) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Giving up on delivering ");
                    sb.append(aVar.f3836d.size());
                    sb.append(" tasks to ");
                    sb.append(aVar.f3833a);
                    sb.append(" after ");
                    sb.append(aVar.f3837e);
                    sb.append(" retries");
                    sb.toString();
                    aVar.f3836d.clear();
                    return;
                }
                int i2 = (1 << (i - 1)) * 1000;
                if (Log.isLoggable(C0798u.f3791c, 3)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Scheduling retry for ");
                    sb2.append(i2);
                    sb2.append(" ms");
                    sb2.toString();
                }
                this.f3830c.sendMessageDelayed(this.f3830c.obtainMessage(3, aVar.f3833a), (long) i2);
            }
        }

        /* renamed from: a */
        public void mo4381a(C0804e eVar) {
            this.f3830c.obtainMessage(0, eVar).sendToTarget();
        }

        public boolean handleMessage(Message message) {
            int i = message.what;
            if (i == 0) {
                m4670b((C0804e) message.obj);
                return true;
            } else if (i == 1) {
                C0801c cVar = (C0801c) message.obj;
                m4666a(cVar.f3822a, cVar.f3823b);
                return true;
            } else if (i == 2) {
                m4668b((ComponentName) message.obj);
                return true;
            } else if (i != 3) {
                return false;
            } else {
                m4665a((ComponentName) message.obj);
                return true;
            }
        }

        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            if (Log.isLoggable(C0798u.f3791c, 3)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Connected to service ");
                sb.append(componentName);
                sb.toString();
            }
            this.f3830c.obtainMessage(1, new C0801c(componentName, iBinder)).sendToTarget();
        }

        public void onServiceDisconnected(ComponentName componentName) {
            if (Log.isLoggable(C0798u.f3791c, 3)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Disconnected from service ");
                sb.append(componentName);
                sb.toString();
            }
            this.f3830c.obtainMessage(2, componentName).sendToTarget();
        }

        /* renamed from: a */
        private void m4666a(ComponentName componentName, IBinder iBinder) {
            C0803a aVar = (C0803a) this.f3831d.get(componentName);
            if (aVar != null) {
                aVar.f3835c = C0010a.m39a(iBinder);
                aVar.f3837e = 0;
                m4671c(aVar);
            }
        }

        /* renamed from: b */
        private void m4668b(ComponentName componentName) {
            C0803a aVar = (C0803a) this.f3831d.get(componentName);
            if (aVar != null) {
                m4669b(aVar);
            }
        }

        /* renamed from: a */
        private void m4665a(ComponentName componentName) {
            C0803a aVar = (C0803a) this.f3831d.get(componentName);
            if (aVar != null) {
                m4671c(aVar);
            }
        }

        /* renamed from: b */
        private void m4669b(C0803a aVar) {
            if (aVar.f3834b) {
                this.f3828a.unbindService(this);
                aVar.f3834b = false;
            }
            aVar.f3835c = null;
        }

        /* renamed from: a */
        private void m4664a() {
            String str;
            Set<String> b = C0798u.m4644b(this.f3828a);
            if (!b.equals(this.f3832e)) {
                this.f3832e = b;
                List<ResolveInfo> queryIntentServices = this.f3828a.getPackageManager().queryIntentServices(new Intent().setAction(C0798u.f3795g), 0);
                HashSet hashSet = new HashSet();
                for (ResolveInfo resolveInfo : queryIntentServices) {
                    if (b.contains(resolveInfo.serviceInfo.packageName)) {
                        ComponentName componentName = new ComponentName(resolveInfo.serviceInfo.packageName, resolveInfo.serviceInfo.name);
                        if (resolveInfo.serviceInfo.permission != null) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("Permission present on component ");
                            sb.append(componentName);
                            sb.append(", not adding listener record.");
                            sb.toString();
                        } else {
                            hashSet.add(componentName);
                        }
                    }
                }
                Iterator it = hashSet.iterator();
                while (true) {
                    boolean hasNext = it.hasNext();
                    str = C0798u.f3791c;
                    if (!hasNext) {
                        break;
                    }
                    ComponentName componentName2 = (ComponentName) it.next();
                    if (!this.f3831d.containsKey(componentName2)) {
                        if (Log.isLoggable(str, 3)) {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("Adding listener record for ");
                            sb2.append(componentName2);
                            sb2.toString();
                        }
                        this.f3831d.put(componentName2, new C0803a(componentName2));
                    }
                }
                Iterator it2 = this.f3831d.entrySet().iterator();
                while (it2.hasNext()) {
                    Entry entry = (Entry) it2.next();
                    if (!hashSet.contains(entry.getKey())) {
                        if (Log.isLoggable(str, 3)) {
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append("Removing listener record for ");
                            sb3.append(entry.getKey());
                            sb3.toString();
                        }
                        m4669b((C0803a) entry.getValue());
                        it2.remove();
                    }
                }
            }
        }

        /* renamed from: a */
        private boolean m4667a(C0803a aVar) {
            if (aVar.f3834b) {
                return true;
            }
            aVar.f3834b = this.f3828a.bindService(new Intent(C0798u.f3795g).setComponent(aVar.f3833a), this, 33);
            if (aVar.f3834b) {
                aVar.f3837e = 0;
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("Unable to bind to listener ");
                sb.append(aVar.f3833a);
                sb.toString();
                this.f3828a.unbindService(this);
            }
            return aVar.f3834b;
        }
    }

    /* renamed from: androidx.core.app.u$e */
    /* compiled from: NotificationManagerCompat */
    private interface C0804e {
        /* renamed from: a */
        void mo4378a(C0009a aVar) throws RemoteException;
    }

    private C0798u(Context context) {
        this.f3812a = context;
    }

    @C0193h0
    /* renamed from: a */
    public static C0798u m4641a(@C0193h0 Context context) {
        return new C0798u(context);
    }

    /* renamed from: b */
    public void mo4370b() {
        this.f3813b.cancelAll();
        if (VERSION.SDK_INT <= 19) {
            m4642a((C0804e) new C0799a(this.f3812a.getPackageName()));
        }
    }

    /* renamed from: c */
    public int mo4373c() {
        return VERSION.SDK_INT >= 24 ? this.f3813b.getImportance() : f3805q;
    }

    @C0195i0
    /* renamed from: d */
    public NotificationChannelGroup mo4375d(@C0193h0 String str) {
        int i = VERSION.SDK_INT;
        if (i >= 28) {
            return this.f3813b.getNotificationChannelGroup(str);
        }
        if (i >= 26) {
            for (NotificationChannelGroup notificationChannelGroup : mo4376d()) {
                if (notificationChannelGroup.getId().equals(str)) {
                    return notificationChannelGroup;
                }
            }
        }
        return null;
    }

    @C0193h0
    /* renamed from: e */
    public List<NotificationChannel> mo4377e() {
        if (VERSION.SDK_INT >= 26) {
            return this.f3813b.getNotificationChannels();
        }
        return Collections.emptyList();
    }

    /* renamed from: a */
    public void mo4361a(int i) {
        mo4366a((String) null, i);
    }

    /* renamed from: a */
    public void mo4366a(@C0195i0 String str, int i) {
        this.f3813b.cancel(str, i);
        if (VERSION.SDK_INT <= 19) {
            m4642a((C0804e) new C0799a(this.f3812a.getPackageName(), i, str));
        }
    }

    @C0195i0
    /* renamed from: c */
    public NotificationChannel mo4374c(@C0193h0 String str) {
        if (VERSION.SDK_INT >= 26) {
            return this.f3813b.getNotificationChannel(str);
        }
        return null;
    }

    /* renamed from: b */
    public void mo4372b(@C0193h0 List<NotificationChannel> list) {
        if (VERSION.SDK_INT >= 26) {
            this.f3813b.createNotificationChannels(list);
        }
    }

    @C0193h0
    /* renamed from: d */
    public List<NotificationChannelGroup> mo4376d() {
        if (VERSION.SDK_INT >= 26) {
            return this.f3813b.getNotificationChannelGroups();
        }
        return Collections.emptyList();
    }

    /* renamed from: a */
    public void mo4362a(int i, @C0193h0 Notification notification) {
        mo4367a(null, i, notification);
    }

    /* renamed from: b */
    public void mo4371b(@C0193h0 String str) {
        if (VERSION.SDK_INT >= 26) {
            this.f3813b.deleteNotificationChannelGroup(str);
        }
    }

    /* renamed from: a */
    public void mo4367a(@C0195i0 String str, int i, @C0193h0 Notification notification) {
        if (m4643a(notification)) {
            m4642a((C0804e) new C0800b(this.f3812a.getPackageName(), i, str, notification));
            this.f3813b.cancel(str, i);
            return;
        }
        this.f3813b.notify(str, i, notification);
    }

    @C0193h0
    /* renamed from: b */
    public static Set<String> m4644b(@C0193h0 Context context) {
        Set<String> set;
        String string = Secure.getString(context.getContentResolver(), f3799k);
        synchronized (f3800l) {
            if (string != null) {
                if (!string.equals(f3801m)) {
                    String[] split = string.split(":", -1);
                    HashSet hashSet = new HashSet(split.length);
                    for (String unflattenFromString : split) {
                        ComponentName unflattenFromString2 = ComponentName.unflattenFromString(unflattenFromString);
                        if (unflattenFromString2 != null) {
                            hashSet.add(unflattenFromString2.getPackageName());
                        }
                    }
                    f3802n = hashSet;
                    f3801m = string;
                }
            }
            set = f3802n;
        }
        return set;
    }

    /* renamed from: a */
    public boolean mo4369a() {
        int i = VERSION.SDK_INT;
        if (i >= 24) {
            return this.f3813b.areNotificationsEnabled();
        }
        boolean z = true;
        if (i >= 19) {
            AppOpsManager appOpsManager = (AppOpsManager) this.f3812a.getSystemService("appops");
            ApplicationInfo applicationInfo = this.f3812a.getApplicationInfo();
            String packageName = this.f3812a.getApplicationContext().getPackageName();
            int i2 = applicationInfo.uid;
            try {
                Class cls = Class.forName(AppOpsManager.class.getName());
                if (((Integer) cls.getMethod(f3792d, new Class[]{Integer.TYPE, Integer.TYPE, String.class}).invoke(appOpsManager, new Object[]{Integer.valueOf(((Integer) cls.getDeclaredField(f3793e).get(Integer.class)).intValue()), Integer.valueOf(i2), packageName})).intValue() != 0) {
                    z = false;
                }
            } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException | NoSuchMethodException | RuntimeException | InvocationTargetException unused) {
            }
        }
        return z;
    }

    /* renamed from: a */
    public void mo4363a(@C0193h0 NotificationChannel notificationChannel) {
        if (VERSION.SDK_INT >= 26) {
            this.f3813b.createNotificationChannel(notificationChannel);
        }
    }

    /* renamed from: a */
    public void mo4364a(@C0193h0 NotificationChannelGroup notificationChannelGroup) {
        if (VERSION.SDK_INT >= 26) {
            this.f3813b.createNotificationChannelGroup(notificationChannelGroup);
        }
    }

    /* renamed from: a */
    public void mo4368a(@C0193h0 List<NotificationChannelGroup> list) {
        if (VERSION.SDK_INT >= 26) {
            this.f3813b.createNotificationChannelGroups(list);
        }
    }

    /* renamed from: a */
    public void mo4365a(@C0193h0 String str) {
        if (VERSION.SDK_INT >= 26) {
            this.f3813b.deleteNotificationChannel(str);
        }
    }

    /* renamed from: a */
    private static boolean m4643a(Notification notification) {
        Bundle f = C0770p.m4373f(notification);
        return f != null && f.getBoolean(f3794f);
    }

    /* renamed from: a */
    private void m4642a(C0804e eVar) {
        synchronized (f3803o) {
            if (f3804p == null) {
                f3804p = new C0802d(this.f3812a.getApplicationContext());
            }
            f3804p.mo4381a(eVar);
        }
    }
}
