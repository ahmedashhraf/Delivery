package com.google.firebase.iid;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcelable;
import android.util.Log;
import androidx.collection.C0649h;
import com.google.android.gms.tasks.C5562l;
import com.google.android.gms.tasks.C5566n;
import com.google.firebase.iid.zzf.C8735a;
import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p201f.p202a.p203u.C5966a;
import p212io.fabric.sdk.android.p493p.p498e.C14330v;

/* renamed from: com.google.firebase.iid.r */
/* compiled from: com.google.firebase:firebase-iid@@20.0.0 */
final class C8717r {

    /* renamed from: g */
    private static int f22860g;

    /* renamed from: h */
    private static PendingIntent f22861h;
    @C5966a("responseCallbacks")

    /* renamed from: a */
    private final C0649h<String, C5562l<Bundle>> f22862a = new C0649h<>();

    /* renamed from: b */
    private final Context f22863b;

    /* renamed from: c */
    private final C8705l f22864c;

    /* renamed from: d */
    private Messenger f22865d;

    /* renamed from: e */
    private Messenger f22866e;

    /* renamed from: f */
    private zzf f22867f;

    public C8717r(Context context, C8705l lVar) {
        this.f22863b = context;
        this.f22864c = lVar;
        this.f22865d = new Messenger(new C8723u(this, Looper.getMainLooper()));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m40878a(Message message) {
        if (message != null) {
            Object obj = message.obj;
            if (obj instanceof Intent) {
                Intent intent = (Intent) obj;
                intent.setExtrasClassLoader(new C8735a());
                if (intent.hasExtra("google.messenger")) {
                    Parcelable parcelableExtra = intent.getParcelableExtra("google.messenger");
                    if (parcelableExtra instanceof zzf) {
                        this.f22867f = (zzf) parcelableExtra;
                    }
                    if (parcelableExtra instanceof Messenger) {
                        this.f22866e = (Messenger) parcelableExtra;
                    }
                }
                Intent intent2 = (Intent) message.obj;
                String action = intent2.getAction();
                if (!"com.google.android.c2dm.intent.REGISTRATION".equals(action)) {
                    if (Log.isLoggable("FirebaseInstanceId", 3)) {
                        String str = "Unexpected response action: ";
                        String valueOf = String.valueOf(action);
                        if (valueOf.length() != 0) {
                            str.concat(valueOf);
                        } else {
                            new String(str);
                        }
                    }
                    return;
                }
                String stringExtra = intent2.getStringExtra("registration_id");
                if (stringExtra == null) {
                    stringExtra = intent2.getStringExtra("unregistered");
                }
                if (stringExtra == null) {
                    String stringExtra2 = intent2.getStringExtra("error");
                    if (stringExtra2 == null) {
                        String valueOf2 = String.valueOf(intent2.getExtras());
                        StringBuilder sb = new StringBuilder(String.valueOf(valueOf2).length() + 49);
                        sb.append("Unexpected response, no error or registration id ");
                        sb.append(valueOf2);
                        sb.toString();
                    } else {
                        if (Log.isLoggable("FirebaseInstanceId", 3)) {
                            String str2 = "Received InstanceID error ";
                            String valueOf3 = String.valueOf(stringExtra2);
                            if (valueOf3.length() != 0) {
                                str2.concat(valueOf3);
                            } else {
                                new String(str2);
                            }
                        }
                        if (stringExtra2.startsWith("|")) {
                            String[] split = stringExtra2.split("\\|");
                            if (split.length > 2) {
                                if ("ID".equals(split[1])) {
                                    String str3 = split[2];
                                    String str4 = split[3];
                                    if (str4.startsWith(":")) {
                                        str4 = str4.substring(1);
                                    }
                                    m40880a(str3, intent2.putExtra("error", str4).getExtras());
                                }
                            }
                            String str5 = "Unexpected structured response ";
                            String valueOf4 = String.valueOf(stringExtra2);
                            if (valueOf4.length() != 0) {
                                str5.concat(valueOf4);
                            } else {
                                new String(str5);
                            }
                        } else {
                            synchronized (this.f22862a) {
                                for (int i = 0; i < this.f22862a.size(); i++) {
                                    m40880a((String) this.f22862a.mo3361b(i), intent2.getExtras());
                                }
                            }
                        }
                    }
                } else {
                    Matcher matcher = Pattern.compile("\\|ID\\|([^|]+)\\|:?+(.*)").matcher(stringExtra);
                    if (!matcher.matches()) {
                        if (Log.isLoggable("FirebaseInstanceId", 3)) {
                            String str6 = "Unexpected response string: ";
                            String valueOf5 = String.valueOf(stringExtra);
                            if (valueOf5.length() != 0) {
                                str6.concat(valueOf5);
                            } else {
                                new String(str6);
                            }
                        }
                        return;
                    }
                    String group = matcher.group(1);
                    String group2 = matcher.group(2);
                    Bundle extras = intent2.getExtras();
                    extras.putString("registration_id", group2);
                    m40880a(group, extras);
                }
            }
        }
    }

    /* renamed from: b */
    private final Bundle m40881b(Bundle bundle) throws IOException {
        Bundle c = m40882c(bundle);
        if (c == null) {
            return c;
        }
        String str = "google.messenger";
        if (!c.containsKey(str)) {
            return c;
        }
        Bundle c2 = m40882c(bundle);
        if (c2 == null || !c2.containsKey(str)) {
            return c2;
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x00e0 A[SYNTHETIC] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final android.os.Bundle m40882c(android.os.Bundle r8) throws java.io.IOException {
        /*
            r7 = this;
            java.lang.String r0 = m40876a()
            com.google.android.gms.tasks.l r1 = new com.google.android.gms.tasks.l
            r1.<init>()
            androidx.collection.h<java.lang.String, com.google.android.gms.tasks.l<android.os.Bundle>> r2 = r7.f22862a
            monitor-enter(r2)
            androidx.collection.h<java.lang.String, com.google.android.gms.tasks.l<android.os.Bundle>> r3 = r7.f22862a     // Catch:{ all -> 0x0110 }
            r3.put(r0, r1)     // Catch:{ all -> 0x0110 }
            monitor-exit(r2)     // Catch:{ all -> 0x0110 }
            com.google.firebase.iid.l r2 = r7.f22864c
            int r2 = r2.mo32137a()
            if (r2 == 0) goto L_0x0108
            android.content.Intent r2 = new android.content.Intent
            r2.<init>()
            java.lang.String r3 = "com.google.android.gms"
            r2.setPackage(r3)
            com.google.firebase.iid.l r3 = r7.f22864c
            int r3 = r3.mo32137a()
            r4 = 2
            if (r3 != r4) goto L_0x0033
            java.lang.String r3 = "com.google.iid.TOKEN_REQUEST"
            r2.setAction(r3)
            goto L_0x0038
        L_0x0033:
            java.lang.String r3 = "com.google.android.c2dm.intent.REGISTER"
            r2.setAction(r3)
        L_0x0038:
            r2.putExtras(r8)
            android.content.Context r8 = r7.f22863b
            m40877a(r8, r2)
            java.lang.String r8 = java.lang.String.valueOf(r0)
            int r8 = r8.length()
            int r8 = r8 + 5
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r8)
            java.lang.String r8 = "|ID|"
            r3.append(r8)
            r3.append(r0)
            java.lang.String r8 = "|"
            r3.append(r8)
            java.lang.String r8 = r3.toString()
            java.lang.String r3 = "kid"
            r2.putExtra(r3, r8)
            r8 = 3
            java.lang.String r3 = "FirebaseInstanceId"
            boolean r3 = android.util.Log.isLoggable(r3, r8)
            if (r3 == 0) goto L_0x0090
            android.os.Bundle r3 = r2.getExtras()
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.String r5 = java.lang.String.valueOf(r3)
            int r5 = r5.length()
            int r5 = r5 + 8
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>(r5)
            java.lang.String r5 = "Sending "
            r6.append(r5)
            r6.append(r3)
            r6.toString()
        L_0x0090:
            android.os.Messenger r3 = r7.f22865d
            java.lang.String r5 = "google.messenger"
            r2.putExtra(r5, r3)
            android.os.Messenger r3 = r7.f22866e
            if (r3 != 0) goto L_0x009f
            com.google.firebase.iid.zzf r3 = r7.f22867f
            if (r3 == 0) goto L_0x00bc
        L_0x009f:
            android.os.Message r3 = android.os.Message.obtain()
            r3.obj = r2
            android.os.Messenger r5 = r7.f22866e     // Catch:{ RemoteException -> 0x00b5 }
            if (r5 == 0) goto L_0x00af
            android.os.Messenger r5 = r7.f22866e     // Catch:{ RemoteException -> 0x00b5 }
            r5.send(r3)     // Catch:{ RemoteException -> 0x00b5 }
            goto L_0x00cf
        L_0x00af:
            com.google.firebase.iid.zzf r5 = r7.f22867f     // Catch:{ RemoteException -> 0x00b5 }
            r5.mo32181a(r3)     // Catch:{ RemoteException -> 0x00b5 }
            goto L_0x00cf
        L_0x00b5:
            java.lang.String r3 = "FirebaseInstanceId"
            boolean r8 = android.util.Log.isLoggable(r3, r8)
        L_0x00bc:
            com.google.firebase.iid.l r8 = r7.f22864c
            int r8 = r8.mo32137a()
            if (r8 != r4) goto L_0x00ca
            android.content.Context r8 = r7.f22863b
            r8.sendBroadcast(r2)
            goto L_0x00cf
        L_0x00ca:
            android.content.Context r8 = r7.f22863b
            r8.startService(r2)
        L_0x00cf:
            com.google.android.gms.tasks.k r8 = r1.mo22017a()     // Catch:{ InterruptedException | TimeoutException -> 0x00f3, ExecutionException -> 0x00ec }
            r1 = 30000(0x7530, double:1.4822E-319)
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ InterruptedException | TimeoutException -> 0x00f3, ExecutionException -> 0x00ec }
            java.lang.Object r8 = com.google.android.gms.tasks.C5566n.m24217a(r8, r1, r3)     // Catch:{ InterruptedException | TimeoutException -> 0x00f3, ExecutionException -> 0x00ec }
            android.os.Bundle r8 = (android.os.Bundle) r8     // Catch:{ InterruptedException | TimeoutException -> 0x00f3, ExecutionException -> 0x00ec }
            androidx.collection.h<java.lang.String, com.google.android.gms.tasks.l<android.os.Bundle>> r1 = r7.f22862a
            monitor-enter(r1)
            androidx.collection.h<java.lang.String, com.google.android.gms.tasks.l<android.os.Bundle>> r2 = r7.f22862a     // Catch:{ all -> 0x00e7 }
            r2.remove(r0)     // Catch:{ all -> 0x00e7 }
            monitor-exit(r1)     // Catch:{ all -> 0x00e7 }
            return r8
        L_0x00e7:
            r8 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x00e7 }
            throw r8
        L_0x00ea:
            r8 = move-exception
            goto L_0x00fb
        L_0x00ec:
            r8 = move-exception
            java.io.IOException r1 = new java.io.IOException     // Catch:{ all -> 0x00ea }
            r1.<init>(r8)     // Catch:{ all -> 0x00ea }
            throw r1     // Catch:{ all -> 0x00ea }
        L_0x00f3:
            java.io.IOException r8 = new java.io.IOException     // Catch:{ all -> 0x00ea }
            java.lang.String r1 = "TIMEOUT"
            r8.<init>(r1)     // Catch:{ all -> 0x00ea }
            throw r8     // Catch:{ all -> 0x00ea }
        L_0x00fb:
            androidx.collection.h<java.lang.String, com.google.android.gms.tasks.l<android.os.Bundle>> r1 = r7.f22862a
            monitor-enter(r1)
            androidx.collection.h<java.lang.String, com.google.android.gms.tasks.l<android.os.Bundle>> r2 = r7.f22862a     // Catch:{ all -> 0x0105 }
            r2.remove(r0)     // Catch:{ all -> 0x0105 }
            monitor-exit(r1)     // Catch:{ all -> 0x0105 }
            throw r8
        L_0x0105:
            r8 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0105 }
            throw r8
        L_0x0108:
            java.io.IOException r8 = new java.io.IOException
            java.lang.String r0 = "MISSING_INSTANCEID_SERVICE"
            r8.<init>(r0)
            throw r8
        L_0x0110:
            r8 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0110 }
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.iid.C8717r.m40882c(android.os.Bundle):android.os.Bundle");
    }

    /* renamed from: a */
    private static synchronized void m40877a(Context context, Intent intent) {
        synchronized (C8717r.class) {
            if (f22861h == null) {
                Intent intent2 = new Intent();
                intent2.setPackage("com.google.example.invalidpackage");
                f22861h = PendingIntent.getBroadcast(context, 0, intent2, 0);
            }
            intent.putExtra(C14330v.f42313b, f22861h);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0023, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m40880a(java.lang.String r3, android.os.Bundle r4) {
        /*
            r2 = this;
            androidx.collection.h<java.lang.String, com.google.android.gms.tasks.l<android.os.Bundle>> r0 = r2.f22862a
            monitor-enter(r0)
            androidx.collection.h<java.lang.String, com.google.android.gms.tasks.l<android.os.Bundle>> r1 = r2.f22862a     // Catch:{ all -> 0x0029 }
            java.lang.Object r1 = r1.remove(r3)     // Catch:{ all -> 0x0029 }
            com.google.android.gms.tasks.l r1 = (com.google.android.gms.tasks.C5562l) r1     // Catch:{ all -> 0x0029 }
            if (r1 != 0) goto L_0x0024
            java.lang.String r4 = "Missing callback for "
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch:{ all -> 0x0029 }
            int r1 = r3.length()     // Catch:{ all -> 0x0029 }
            if (r1 == 0) goto L_0x001d
            r4.concat(r3)     // Catch:{ all -> 0x0029 }
            goto L_0x0022
        L_0x001d:
            java.lang.String r3 = new java.lang.String     // Catch:{ all -> 0x0029 }
            r3.<init>(r4)     // Catch:{ all -> 0x0029 }
        L_0x0022:
            monitor-exit(r0)     // Catch:{ all -> 0x0029 }
            return
        L_0x0024:
            r1.mo22019a(r4)     // Catch:{ all -> 0x0029 }
            monitor-exit(r0)     // Catch:{ all -> 0x0029 }
            return
        L_0x0029:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0029 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.iid.C8717r.m40880a(java.lang.String, android.os.Bundle):void");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final Bundle mo32151a(Bundle bundle) throws IOException {
        if (this.f22864c.mo32140d() < 12000000) {
            return m40881b(bundle);
        }
        try {
            return (Bundle) C5566n.m24216a(C8679a1.m40806a(this.f22863b).mo32094b(1, bundle));
        } catch (InterruptedException | ExecutionException e) {
            if (Log.isLoggable("FirebaseInstanceId", 3)) {
                String valueOf = String.valueOf(e);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 22);
                sb.append("Error making request: ");
                sb.append(valueOf);
                sb.toString();
            }
            if (!(e.getCause() instanceof zzag) || ((zzag) e.getCause()).mo32180a() != 4) {
                return null;
            }
            return m40881b(bundle);
        }
    }

    /* renamed from: a */
    private static synchronized String m40876a() {
        String num;
        synchronized (C8717r.class) {
            int i = f22860g;
            f22860g = i + 1;
            num = Integer.toString(i);
        }
        return num;
    }
}
