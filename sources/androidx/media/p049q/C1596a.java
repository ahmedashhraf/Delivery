package androidx.media.p049q;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.BroadcastReceiver.PendingResult;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Build.VERSION;
import android.os.RemoteException;
import android.support.p003v4.media.MediaBrowserCompat;
import android.support.p003v4.media.MediaBrowserCompat.C0015b;
import android.support.p003v4.media.session.MediaControllerCompat;
import android.support.p003v4.media.session.MediaSessionCompat;
import android.support.p003v4.media.session.PlaybackStateCompat;
import android.view.KeyEvent;
import androidx.annotation.C0207n0;
import androidx.annotation.C0207n0.C0208a;
import androidx.media.C1528f;
import java.util.List;

/* renamed from: androidx.media.q.a */
/* compiled from: MediaButtonReceiver */
public class C1596a extends BroadcastReceiver {

    /* renamed from: a */
    private static final String f6077a = "MediaButtonReceiver";

    /* renamed from: androidx.media.q.a$a */
    /* compiled from: MediaButtonReceiver */
    private static class C1597a extends C0015b {

        /* renamed from: c */
        private final Context f6078c;

        /* renamed from: d */
        private final Intent f6079d;

        /* renamed from: e */
        private final PendingResult f6080e;

        /* renamed from: f */
        private MediaBrowserCompat f6081f;

        C1597a(Context context, Intent intent, PendingResult pendingResult) {
            this.f6078c = context;
            this.f6079d = intent;
            this.f6080e = pendingResult;
        }

        /* renamed from: d */
        private void m8131d() {
            this.f6081f.mo42b();
            this.f6080e.finish();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo6828a(MediaBrowserCompat mediaBrowserCompat) {
            this.f6081f = mediaBrowserCompat;
        }

        /* renamed from: b */
        public void mo65b() {
            m8131d();
        }

        /* renamed from: c */
        public void mo66c() {
            m8131d();
        }

        /* renamed from: a */
        public void mo63a() {
            try {
                new MediaControllerCompat(this.f6078c, this.f6081f.mo48g()).mo215a((KeyEvent) this.f6079d.getParcelableExtra("android.intent.extra.KEY_EVENT"));
            } catch (RemoteException unused) {
            }
            m8131d();
        }
    }

    /* renamed from: a */
    public static KeyEvent m8129a(MediaSessionCompat mediaSessionCompat, Intent intent) {
        if (!(mediaSessionCompat == null || intent == null)) {
            if ("android.intent.action.MEDIA_BUTTON".equals(intent.getAction())) {
                String str = "android.intent.extra.KEY_EVENT";
                if (intent.hasExtra(str)) {
                    KeyEvent keyEvent = (KeyEvent) intent.getParcelableExtra(str);
                    mediaSessionCompat.mo344b().mo215a(keyEvent);
                    return keyEvent;
                }
            }
        }
        return null;
    }

    public void onReceive(Context context, Intent intent) {
        if (intent != null) {
            String str = "android.intent.action.MEDIA_BUTTON";
            if (str.equals(intent.getAction()) && intent.hasExtra("android.intent.extra.KEY_EVENT")) {
                ComponentName a = m8128a(context, str);
                if (a != null) {
                    intent.setComponent(a);
                    m8130a(context, intent);
                    return;
                }
                ComponentName a2 = m8128a(context, C1528f.f5912T);
                if (a2 != null) {
                    PendingResult goAsync = goAsync();
                    Context applicationContext = context.getApplicationContext();
                    C1597a aVar = new C1597a(applicationContext, intent, goAsync);
                    MediaBrowserCompat mediaBrowserCompat = new MediaBrowserCompat(applicationContext, a2, aVar, null);
                    aVar.mo6828a(mediaBrowserCompat);
                    mediaBrowserCompat.mo35a();
                    return;
                }
                throw new IllegalStateException("Could not find any Service that handles android.intent.action.MEDIA_BUTTON or implements a media browser service.");
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Ignore unsupported intent: ");
        sb.append(intent);
        sb.toString();
    }

    /* renamed from: a */
    public static PendingIntent m8125a(Context context, long j) {
        ComponentName a = m8127a(context);
        if (a == null) {
            return null;
        }
        return m8126a(context, a, j);
    }

    /* renamed from: a */
    public static PendingIntent m8126a(Context context, ComponentName componentName, long j) {
        if (componentName == null) {
            return null;
        }
        int c = PlaybackStateCompat.m808c(j);
        if (c == 0) {
            StringBuilder sb = new StringBuilder();
            sb.append("Cannot build a media button pending intent with the given action: ");
            sb.append(j);
            sb.toString();
            return null;
        }
        Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
        intent.setComponent(componentName);
        intent.putExtra("android.intent.extra.KEY_EVENT", new KeyEvent(0, c));
        return PendingIntent.getBroadcast(context, c, intent, 0);
    }

    @C0207n0({C0208a.LIBRARY})
    /* renamed from: a */
    public static ComponentName m8127a(Context context) {
        Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
        intent.setPackage(context.getPackageName());
        List queryBroadcastReceivers = context.getPackageManager().queryBroadcastReceivers(intent, 0);
        if (queryBroadcastReceivers.size() == 1) {
            ResolveInfo resolveInfo = (ResolveInfo) queryBroadcastReceivers.get(0);
            return new ComponentName(resolveInfo.activityInfo.packageName, resolveInfo.activityInfo.name);
        }
        int size = queryBroadcastReceivers.size();
        return null;
    }

    /* renamed from: a */
    private static void m8130a(Context context, Intent intent) {
        if (VERSION.SDK_INT >= 26) {
            context.startForegroundService(intent);
        } else {
            context.startService(intent);
        }
    }

    /* renamed from: a */
    private static ComponentName m8128a(Context context, String str) {
        PackageManager packageManager = context.getPackageManager();
        Intent intent = new Intent(str);
        intent.setPackage(context.getPackageName());
        List queryIntentServices = packageManager.queryIntentServices(intent, 0);
        if (queryIntentServices.size() == 1) {
            ResolveInfo resolveInfo = (ResolveInfo) queryIntentServices.get(0);
            return new ComponentName(resolveInfo.serviceInfo.packageName, resolveInfo.serviceInfo.name);
        } else if (queryIntentServices.isEmpty()) {
            return null;
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Expected 1 service that handles ");
            sb.append(str);
            sb.append(", found ");
            sb.append(queryIntentServices.size());
            throw new IllegalStateException(sb.toString());
        }
    }
}
