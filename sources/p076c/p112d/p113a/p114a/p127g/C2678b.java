package p076c.p112d.p113a.p114a.p127g;

import android.content.Context;
import android.os.AsyncTask;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import p076c.p112d.p113a.p114a.p127g.C2676a.C2677a;

/* renamed from: c.d.a.a.g.b */
final class C2678b extends AsyncTask<Void, Void, Integer> {

    /* renamed from: a */
    private final /* synthetic */ Context f9759a;

    /* renamed from: b */
    private final /* synthetic */ C2677a f9760b;

    C2678b(Context context, C2677a aVar) {
        this.f9759a = context;
        this.f9760b = aVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final Integer doInBackground(Void... voidArr) {
        try {
            C2676a.m13028a(this.f9759a);
            return Integer.valueOf(0);
        } catch (GooglePlayServicesRepairableException e) {
            return Integer.valueOf(e.mo17592d());
        } catch (GooglePlayServicesNotAvailableException e2) {
            return Integer.valueOf(e2.f12771a);
        }
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ void onPostExecute(Object obj) {
        Integer num = (Integer) obj;
        if (num.intValue() == 0) {
            this.f9760b.mo10327a();
            return;
        }
        this.f9760b.mo10328a(num.intValue(), C2676a.f9755a.mo18099a(this.f9759a, num.intValue(), "pi"));
    }
}
