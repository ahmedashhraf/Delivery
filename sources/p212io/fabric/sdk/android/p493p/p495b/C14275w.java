package p212io.fabric.sdk.android.p493p.p495b;

import android.content.Context;
import android.content.res.Resources.NotFoundException;
import android.os.Handler;
import android.os.Looper;
import android.widget.Toast;
import p212io.fabric.sdk.android.services.concurrency.C14364k;

/* renamed from: io.fabric.sdk.android.p.b.w */
/* compiled from: SafeToast */
public class C14275w extends Toast {

    /* renamed from: io.fabric.sdk.android.p.b.w$a */
    /* compiled from: SafeToast */
    class C14276a extends C14364k {
        C14276a() {
        }

        public void run() {
            C14275w.super.show();
        }
    }

    public C14275w(Context context) {
        super(context);
    }

    public static Toast makeText(Context context, CharSequence charSequence, int i) {
        Toast makeText = Toast.makeText(context, charSequence, i);
        C14275w wVar = new C14275w(context);
        wVar.setView(makeText.getView());
        wVar.setDuration(makeText.getDuration());
        return wVar;
    }

    public void show() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            super.show();
        } else {
            new Handler(Looper.getMainLooper()).post(new C14276a());
        }
    }

    public static Toast makeText(Context context, int i, int i2) throws NotFoundException {
        return makeText(context, context.getResources().getText(i), i2);
    }
}
