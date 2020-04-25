package com.google.android.play.core.splitinstall;

import android.app.PendingIntent;
import android.content.Intent;
import java.util.List;

/* renamed from: com.google.android.play.core.splitinstall.f */
final class C7166f extends SplitInstallSessionState {

    /* renamed from: a */
    private final int f20283a;

    /* renamed from: b */
    private final int f20284b;

    /* renamed from: c */
    private final int f20285c;

    /* renamed from: d */
    private final long f20286d;

    /* renamed from: e */
    private final long f20287e;

    /* renamed from: f */
    private final List<String> f20288f;

    /* renamed from: g */
    private final List<String> f20289g;

    /* renamed from: h */
    private final PendingIntent f20290h;

    /* renamed from: i */
    private final List<Intent> f20291i;

    C7166f(int i, int i2, int i3, long j, long j2, List<String> list, List<String> list2, PendingIntent pendingIntent, List<Intent> list3) {
        this.f20283a = i;
        this.f20284b = i2;
        this.f20285c = i3;
        this.f20286d = j;
        this.f20287e = j2;
        this.f20288f = list;
        this.f20289g = list2;
        this.f20290h = pendingIntent;
        this.f20291i = list3;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final List<String> mo28562a() {
        return this.f20288f;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final List<String> mo28563b() {
        return this.f20289g;
    }

    public final long bytesDownloaded() {
        return this.f20286d;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final List<Intent> mo28565c() {
        return this.f20291i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof SplitInstallSessionState) {
            SplitInstallSessionState splitInstallSessionState = (SplitInstallSessionState) obj;
            if (this.f20283a == splitInstallSessionState.sessionId() && this.f20284b == splitInstallSessionState.status() && this.f20285c == splitInstallSessionState.errorCode() && this.f20286d == splitInstallSessionState.bytesDownloaded() && this.f20287e == splitInstallSessionState.totalBytesToDownload()) {
                List<String> list = this.f20288f;
                if (list != null ? list.equals(splitInstallSessionState.mo28562a()) : splitInstallSessionState.mo28562a() == null) {
                    List<String> list2 = this.f20289g;
                    if (list2 != null ? list2.equals(splitInstallSessionState.mo28563b()) : splitInstallSessionState.mo28563b() == null) {
                        PendingIntent pendingIntent = this.f20290h;
                        if (pendingIntent != null ? pendingIntent.equals(splitInstallSessionState.resolutionIntent()) : splitInstallSessionState.resolutionIntent() == null) {
                            List<Intent> list3 = this.f20291i;
                            List c = splitInstallSessionState.mo28565c();
                            return list3 != null ? list3.equals(c) : c == null;
                        }
                    }
                }
            }
        }
    }

    public final int errorCode() {
        return this.f20285c;
    }

    public final int hashCode() {
        int i = (((((this.f20283a ^ 1000003) * 1000003) ^ this.f20284b) * 1000003) ^ this.f20285c) * 1000003;
        long j = this.f20286d;
        int i2 = (i ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        long j2 = this.f20287e;
        int i3 = (i2 ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        List<String> list = this.f20288f;
        int i4 = 0;
        int hashCode = (i3 ^ (list == null ? 0 : list.hashCode())) * 1000003;
        List<String> list2 = this.f20289g;
        int hashCode2 = (hashCode ^ (list2 == null ? 0 : list2.hashCode())) * 1000003;
        PendingIntent pendingIntent = this.f20290h;
        int hashCode3 = (hashCode2 ^ (pendingIntent == null ? 0 : pendingIntent.hashCode())) * 1000003;
        List<Intent> list3 = this.f20291i;
        if (list3 != null) {
            i4 = list3.hashCode();
        }
        return hashCode3 ^ i4;
    }

    public final PendingIntent resolutionIntent() {
        return this.f20290h;
    }

    public final int sessionId() {
        return this.f20283a;
    }

    public final int status() {
        return this.f20284b;
    }

    public final String toString() {
        int i = this.f20283a;
        int i2 = this.f20284b;
        int i3 = this.f20285c;
        long j = this.f20286d;
        long j2 = this.f20287e;
        String valueOf = String.valueOf(this.f20288f);
        String valueOf2 = String.valueOf(this.f20289g);
        String valueOf3 = String.valueOf(this.f20290h);
        String valueOf4 = String.valueOf(this.f20291i);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 251 + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length() + String.valueOf(valueOf4).length());
        sb.append("SplitInstallSessionState{sessionId=");
        sb.append(i);
        sb.append(", status=");
        sb.append(i2);
        sb.append(", errorCode=");
        sb.append(i3);
        sb.append(", bytesDownloaded=");
        sb.append(j);
        sb.append(", totalBytesToDownload=");
        sb.append(j2);
        sb.append(", moduleNamesNullable=");
        sb.append(valueOf);
        sb.append(", languagesNullable=");
        sb.append(valueOf2);
        sb.append(", resolutionIntent=");
        sb.append(valueOf3);
        sb.append(", splitFileIntents=");
        sb.append(valueOf4);
        sb.append("}");
        return sb.toString();
    }

    public final long totalBytesToDownload() {
        return this.f20287e;
    }
}
