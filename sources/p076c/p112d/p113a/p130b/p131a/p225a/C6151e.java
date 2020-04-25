package p076c.p112d.p113a.p130b.p131a.p225a;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.IntentSender.SendIntentException;
import com.google.android.play.core.install.C7120a;
import com.google.android.play.core.tasks.C7191d;
import p076c.p112d.p113a.p130b.p131a.p132c.C6162a;

/* renamed from: c.d.a.b.a.a.e */
final class C6151e implements C6148b {

    /* renamed from: a */
    private final C6153g f17337a;

    /* renamed from: b */
    private final C6150d f17338b;

    /* renamed from: c */
    private final Context f17339c;

    C6151e(C6153g gVar, Context context) {
        this.f17337a = gVar;
        this.f17338b = new C6150d(context);
        this.f17339c = context;
    }

    /* renamed from: a */
    public final C7191d<Void> mo25042a() {
        return this.f17337a.mo25049b(this.f17339c.getPackageName());
    }

    /* renamed from: a */
    public final synchronized void mo25043a(C7120a aVar) {
        this.f17338b.mo10354a((C6162a<StateT>) aVar);
    }

    /* renamed from: a */
    public final boolean mo25044a(C6147a aVar, int i, Activity activity, int i2) throws SendIntentException {
        if (!aVar.mo25036a(i)) {
            return false;
        }
        PendingIntent pendingIntent = i == 0 ? aVar.mo25038c() : i == 1 ? aVar.mo25035a() : null;
        activity.startIntentSenderForResult(pendingIntent.getIntentSender(), i2, null, 0, 0, 0);
        return true;
    }

    /* renamed from: b */
    public final C7191d<C6147a> mo25045b() {
        return this.f17337a.mo25048a(this.f17339c.getPackageName());
    }

    /* renamed from: b */
    public final synchronized void mo25046b(C7120a aVar) {
        this.f17338b.mo10357b(aVar);
    }
}
