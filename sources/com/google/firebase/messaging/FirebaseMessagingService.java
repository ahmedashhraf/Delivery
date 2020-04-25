package com.google.firebase.messaging;

import android.app.PendingIntent;
import android.app.PendingIntent.CanceledException;
import android.content.Intent;
import androidx.annotation.C0193h0;
import androidx.annotation.C0226w0;
import com.google.firebase.iid.C8721t;
import java.util.ArrayDeque;
import java.util.Queue;

/* compiled from: com.google.firebase:firebase-messaging@@20.0.0 */
public class FirebaseMessagingService extends C8747e {

    /* renamed from: Q */
    private static final Queue<String> f22908Q = new ArrayDeque(10);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Intent mo32189a(Intent intent) {
        return C8721t.m40887b().mo32154a();
    }

    @C0226w0
    /* renamed from: a */
    public void mo32190a() {
    }

    @C0226w0
    /* renamed from: a */
    public void mo12649a(@C0193h0 RemoteMessage remoteMessage) {
    }

    @C0226w0
    /* renamed from: a */
    public void mo32191a(@C0193h0 String str) {
    }

    @C0226w0
    /* renamed from: a */
    public void mo32192a(@C0193h0 String str, @C0193h0 Exception exc) {
    }

    @C0226w0
    /* renamed from: b */
    public void mo32193b(@C0193h0 String str) {
    }

    /* renamed from: b */
    public final boolean mo32194b(Intent intent) {
        if (!"com.google.firebase.messaging.NOTIFICATION_OPEN".equals(intent.getAction())) {
            return false;
        }
        PendingIntent pendingIntent = (PendingIntent) intent.getParcelableExtra("pending_intent");
        if (pendingIntent != null) {
            try {
                pendingIntent.send();
            } catch (CanceledException unused) {
            }
        }
        if (C8744b.m41013e(intent)) {
            C8744b.m41011c(intent);
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00eb, code lost:
        if (r1.equals(r4) != false) goto L_0x00f9;
     */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00bf  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo32195c(android.content.Intent r11) {
        /*
            r10 = this;
            java.lang.String r0 = r11.getAction()
            java.lang.String r1 = "com.google.android.c2dm.intent.RECEIVE"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L_0x0053
            java.lang.String r1 = "com.google.firebase.messaging.RECEIVE_DIRECT_BOOT"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x0015
            goto L_0x0053
        L_0x0015:
            java.lang.String r1 = "com.google.firebase.messaging.NOTIFICATION_DISMISS"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x0027
            boolean r0 = com.google.firebase.messaging.C8744b.m41013e(r11)
            if (r0 == 0) goto L_0x0052
            com.google.firebase.messaging.C8744b.m41008a(r11)
            return
        L_0x0027:
            java.lang.String r1 = "com.google.firebase.messaging.NEW_TOKEN"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0039
            java.lang.String r0 = "token"
            java.lang.String r11 = r11.getStringExtra(r0)
            r10.mo32193b(r11)
            return
        L_0x0039:
            java.lang.String r0 = "Unknown intent action: "
            java.lang.String r11 = r11.getAction()
            java.lang.String r11 = java.lang.String.valueOf(r11)
            int r1 = r11.length()
            if (r1 == 0) goto L_0x004d
            r0.concat(r11)
            goto L_0x0052
        L_0x004d:
            java.lang.String r11 = new java.lang.String
            r11.<init>(r0)
        L_0x0052:
            return
        L_0x0053:
            java.lang.String r0 = "google.message_id"
            java.lang.String r1 = r11.getStringExtra(r0)
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            r3 = 2
            if (r2 == 0) goto L_0x0066
            r2 = 0
            com.google.android.gms.tasks.k r2 = com.google.android.gms.tasks.C5566n.m24211a(r2)
            goto L_0x0076
        L_0x0066:
            android.os.Bundle r2 = new android.os.Bundle
            r2.<init>()
            r2.putString(r0, r1)
            com.google.firebase.iid.a1 r4 = com.google.firebase.iid.C8679a1.m40806a(r10)
            com.google.android.gms.tasks.k r2 = r4.mo32093a(r3, r2)
        L_0x0076:
            boolean r4 = android.text.TextUtils.isEmpty(r1)
            r5 = 1
            r6 = 3
            r7 = 0
            if (r4 == 0) goto L_0x0081
        L_0x007f:
            r1 = 0
            goto L_0x00bd
        L_0x0081:
            java.util.Queue<java.lang.String> r4 = f22908Q
            boolean r4 = r4.contains(r1)
            if (r4 == 0) goto L_0x00a8
            java.lang.String r4 = "FirebaseMessaging"
            boolean r4 = android.util.Log.isLoggable(r4, r6)
            if (r4 == 0) goto L_0x00a6
            java.lang.String r4 = "Received duplicate message: "
            java.lang.String r1 = java.lang.String.valueOf(r1)
            int r8 = r1.length()
            if (r8 == 0) goto L_0x00a1
            r4.concat(r1)
            goto L_0x00a6
        L_0x00a1:
            java.lang.String r1 = new java.lang.String
            r1.<init>(r4)
        L_0x00a6:
            r1 = 1
            goto L_0x00bd
        L_0x00a8:
            java.util.Queue<java.lang.String> r4 = f22908Q
            int r4 = r4.size()
            r8 = 10
            if (r4 < r8) goto L_0x00b7
            java.util.Queue<java.lang.String> r4 = f22908Q
            r4.remove()
        L_0x00b7:
            java.util.Queue<java.lang.String> r4 = f22908Q
            r4.add(r1)
            goto L_0x007f
        L_0x00bd:
            if (r1 != 0) goto L_0x0191
            java.lang.String r1 = "message_type"
            java.lang.String r1 = r11.getStringExtra(r1)
            java.lang.String r4 = "gcm"
            if (r1 != 0) goto L_0x00ca
            r1 = r4
        L_0x00ca:
            r8 = -1
            int r9 = r1.hashCode()
            switch(r9) {
                case -2062414158: goto L_0x00ee;
                case 102161: goto L_0x00e7;
                case 814694033: goto L_0x00dd;
                case 814800675: goto L_0x00d3;
                default: goto L_0x00d2;
            }
        L_0x00d2:
            goto L_0x00f8
        L_0x00d3:
            java.lang.String r4 = "send_event"
            boolean r4 = r1.equals(r4)
            if (r4 == 0) goto L_0x00f8
            r7 = 2
            goto L_0x00f9
        L_0x00dd:
            java.lang.String r4 = "send_error"
            boolean r4 = r1.equals(r4)
            if (r4 == 0) goto L_0x00f8
            r7 = 3
            goto L_0x00f9
        L_0x00e7:
            boolean r4 = r1.equals(r4)
            if (r4 == 0) goto L_0x00f8
            goto L_0x00f9
        L_0x00ee:
            java.lang.String r4 = "deleted_messages"
            boolean r4 = r1.equals(r4)
            if (r4 == 0) goto L_0x00f8
            r7 = 1
            goto L_0x00f9
        L_0x00f8:
            r7 = -1
        L_0x00f9:
            if (r7 == 0) goto L_0x0140
            if (r7 == r5) goto L_0x013c
            if (r7 == r3) goto L_0x0134
            if (r7 == r6) goto L_0x0119
            java.lang.String r11 = "Received message with unknown type: "
            java.lang.String r0 = java.lang.String.valueOf(r1)
            int r1 = r0.length()
            if (r1 == 0) goto L_0x0112
            r11.concat(r0)
            goto L_0x0191
        L_0x0112:
            java.lang.String r0 = new java.lang.String
            r0.<init>(r11)
            goto L_0x0191
        L_0x0119:
            java.lang.String r0 = r11.getStringExtra(r0)
            if (r0 != 0) goto L_0x0125
            java.lang.String r0 = "message_id"
            java.lang.String r0 = r11.getStringExtra(r0)
        L_0x0125:
            com.google.firebase.messaging.SendException r1 = new com.google.firebase.messaging.SendException
            java.lang.String r3 = "error"
            java.lang.String r11 = r11.getStringExtra(r3)
            r1.<init>(r11)
            r10.mo32192a(r0, r1)
            goto L_0x0191
        L_0x0134:
            java.lang.String r11 = r11.getStringExtra(r0)
            r10.mo32191a(r11)
            goto L_0x0191
        L_0x013c:
            r10.mo32190a()
            goto L_0x0191
        L_0x0140:
            boolean r0 = com.google.firebase.messaging.C8744b.m41013e(r11)
            if (r0 == 0) goto L_0x0149
            com.google.firebase.messaging.C8744b.m41012d(r11)
        L_0x0149:
            android.os.Bundle r0 = r11.getExtras()
            if (r0 != 0) goto L_0x0154
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
        L_0x0154:
            java.lang.String r1 = "androidx.contentpager.content.wakelockid"
            r0.remove(r1)
            boolean r1 = com.google.firebase.messaging.C8755m.m41037a(r0)
            if (r1 == 0) goto L_0x0189
            com.google.firebase.messaging.m r1 = new com.google.firebase.messaging.m
            r1.<init>(r0)
            java.util.concurrent.ExecutorService r3 = java.util.concurrent.Executors.newSingleThreadExecutor()
            com.google.firebase.messaging.f r4 = new com.google.firebase.messaging.f
            r4.<init>(r10, r1, r3)
            boolean r1 = r4.mo32254a()     // Catch:{ all -> 0x0184 }
            if (r1 == 0) goto L_0x0177
            r3.shutdown()
            goto L_0x0191
        L_0x0177:
            r3.shutdown()
            boolean r1 = com.google.firebase.messaging.C8744b.m41013e(r11)
            if (r1 == 0) goto L_0x0189
            com.google.firebase.messaging.C8744b.m41010b(r11)
            goto L_0x0189
        L_0x0184:
            r11 = move-exception
            r3.shutdown()
            throw r11
        L_0x0189:
            com.google.firebase.messaging.RemoteMessage r11 = new com.google.firebase.messaging.RemoteMessage
            r11.<init>(r0)
            r10.mo12649a(r11)
        L_0x0191:
            r0 = 1
            java.util.concurrent.TimeUnit r11 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ ExecutionException -> 0x019d, InterruptedException -> 0x019b, TimeoutException -> 0x0199 }
            com.google.android.gms.tasks.C5566n.m24217a(r2, r0, r11)     // Catch:{ ExecutionException -> 0x019d, InterruptedException -> 0x019b, TimeoutException -> 0x0199 }
            return
        L_0x0199:
            r11 = move-exception
            goto L_0x019e
        L_0x019b:
            r11 = move-exception
            goto L_0x019e
        L_0x019d:
            r11 = move-exception
        L_0x019e:
            java.lang.String r11 = java.lang.String.valueOf(r11)
            java.lang.String r0 = java.lang.String.valueOf(r11)
            int r0 = r0.length()
            int r0 = r0 + 20
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            java.lang.String r0 = "Message ack failed: "
            r1.append(r0)
            r1.append(r11)
            r1.toString()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.FirebaseMessagingService.mo32195c(android.content.Intent):void");
    }
}
