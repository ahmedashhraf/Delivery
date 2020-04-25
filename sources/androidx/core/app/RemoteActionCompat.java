package androidx.core.app;

import android.app.PendingIntent;
import android.app.RemoteAction;
import android.os.Build.VERSION;
import androidx.annotation.C0193h0;
import androidx.annotation.C0207n0;
import androidx.annotation.C0207n0.C0208a;
import androidx.annotation.RequiresApi;
import androidx.core.graphics.drawable.IconCompat;
import androidx.core.p033k.C0944i;
import androidx.versionedparcelable.C2003g;

public final class RemoteActionCompat implements C2003g {
    @C0207n0({C0208a.LIBRARY_GROUP})

    /* renamed from: a */
    public IconCompat f3383a;
    @C0207n0({C0208a.LIBRARY_GROUP})

    /* renamed from: b */
    public CharSequence f3384b;
    @C0207n0({C0208a.LIBRARY_GROUP})

    /* renamed from: c */
    public CharSequence f3385c;
    @C0207n0({C0208a.LIBRARY_GROUP})

    /* renamed from: d */
    public PendingIntent f3386d;
    @C0207n0({C0208a.LIBRARY_GROUP})

    /* renamed from: e */
    public boolean f3387e;
    @C0207n0({C0208a.LIBRARY_GROUP})

    /* renamed from: f */
    public boolean f3388f;

    public RemoteActionCompat(@C0193h0 IconCompat iconCompat, @C0193h0 CharSequence charSequence, @C0193h0 CharSequence charSequence2, @C0193h0 PendingIntent pendingIntent) {
        this.f3383a = (IconCompat) C0944i.m5337a(iconCompat);
        this.f3384b = (CharSequence) C0944i.m5337a(charSequence);
        this.f3385c = (CharSequence) C0944i.m5337a(charSequence2);
        this.f3386d = (PendingIntent) C0944i.m5337a(pendingIntent);
        this.f3387e = true;
        this.f3388f = true;
    }

    @RequiresApi(26)
    @C0193h0
    /* renamed from: a */
    public static RemoteActionCompat m4226a(@C0193h0 RemoteAction remoteAction) {
        C0944i.m5337a(remoteAction);
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat(IconCompat.m5117a(remoteAction.getIcon()), remoteAction.getTitle(), remoteAction.getContentDescription(), remoteAction.getActionIntent());
        remoteActionCompat.mo4051a(remoteAction.isEnabled());
        if (VERSION.SDK_INT >= 28) {
            remoteActionCompat.mo4052b(remoteAction.shouldShowIcon());
        }
        return remoteActionCompat;
    }

    /* renamed from: b */
    public void mo4052b(boolean z) {
        this.f3388f = z;
    }

    @C0193h0
    /* renamed from: g */
    public PendingIntent mo4053g() {
        return this.f3386d;
    }

    @C0193h0
    /* renamed from: h */
    public CharSequence mo4054h() {
        return this.f3385c;
    }

    @C0193h0
    /* renamed from: i */
    public IconCompat mo4055i() {
        return this.f3383a;
    }

    @C0193h0
    /* renamed from: j */
    public CharSequence mo4056j() {
        return this.f3384b;
    }

    /* renamed from: l */
    public boolean mo4057l() {
        return this.f3387e;
    }

    /* renamed from: m */
    public boolean mo4058m() {
        return this.f3388f;
    }

    @RequiresApi(26)
    @C0193h0
    /* renamed from: n */
    public RemoteAction mo4059n() {
        RemoteAction remoteAction = new RemoteAction(this.f3383a.mo4587n(), this.f3384b, this.f3385c, this.f3386d);
        remoteAction.setEnabled(mo4057l());
        if (VERSION.SDK_INT >= 28) {
            remoteAction.setShouldShowIcon(mo4058m());
        }
        return remoteAction;
    }

    @C0207n0({C0208a.LIBRARY_GROUP})
    public RemoteActionCompat() {
    }

    /* renamed from: a */
    public void mo4051a(boolean z) {
        this.f3387e = z;
    }

    public RemoteActionCompat(@C0193h0 RemoteActionCompat remoteActionCompat) {
        C0944i.m5337a(remoteActionCompat);
        this.f3383a = remoteActionCompat.f3383a;
        this.f3384b = remoteActionCompat.f3384b;
        this.f3385c = remoteActionCompat.f3385c;
        this.f3386d = remoteActionCompat.f3386d;
        this.f3387e = remoteActionCompat.f3387e;
        this.f3388f = remoteActionCompat.f3388f;
    }
}
