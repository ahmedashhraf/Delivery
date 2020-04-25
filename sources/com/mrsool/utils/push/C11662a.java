package com.mrsool.utils.push;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import androidx.appcompat.app.C0295d;
import androidx.core.app.C0770p.C0771a.C0772a;
import androidx.core.app.C0770p.C0779e;
import androidx.core.app.C0807w.C0808a;
import com.mrsool.C10232R;
import org.jcodec.codecs.common.biari.MQEncoder;

/* renamed from: com.mrsool.utils.push.a */
/* compiled from: TempActivity */
public class C11662a extends C0295d {

    /* renamed from: N */
    public static final String f33552N = "keyintenthelp";

    /* renamed from: O */
    public static final int f33553O = 100;

    /* renamed from: P */
    public static final int f33554P = 101;

    /* renamed from: Q */
    public static final int f33555Q = 200;

    /* renamed from: a */
    public static final String f33556a = "NotificationReply";

    /* renamed from: b */
    public static final String f33557b = "keyintentmore";

    /* renamed from: com.mrsool.utils.push.a$a */
    /* compiled from: TempActivity */
    class C11663a implements OnClickListener {
        C11663a() {
        }

        public void onClick(View view) {
            C11662a.this.mo40025C();
        }
    }

    /* renamed from: C */
    public void mo40025C() {
        PendingIntent broadcast = PendingIntent.getBroadcast(this, 101, new Intent(this, NotificationReceiver.class).putExtra("keyintenthelp", 101), MQEncoder.CARRY_MASK);
        ((NotificationManager) getSystemService("notification")).notify(200, new C0779e(this, "temp").mo4253g(17301545).mo4234c((CharSequence) "Hey this is Simplified Coding...").mo4228b((CharSequence) "Please share your name with us").mo4217a(true).mo4204a(broadcast).mo4211a(new C0772a(17301533, "Reply Now...", broadcast).mo4169a(new C0808a("NotificationReply").mo4410a((CharSequence) "Please enter your name").mo4414a()).mo4171a()).mo4196a());
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) C10232R.layout.activity_temp);
        findViewById(C10232R.C10236id.buttonCreateNotification).setOnClickListener(new C11663a());
    }
}
