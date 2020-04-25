package com.mrsool.utils.ConnectivityChange;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.annotation.RequiresApi;
import com.mrsool.utils.C11644i;
import com.mrsool.utils.ConnectivityChange.C11561a.C11562a;
import p053b.p072g.p073b.C2128a;

@RequiresApi(api = 21)
public class NetworkSchedulerService extends JobService implements C11562a {

    /* renamed from: b */
    private static final String f32722b = NetworkSchedulerService.class.getSimpleName();

    /* renamed from: a */
    private C11561a f32723a;

    /* renamed from: a */
    public void mo39687a(boolean z) {
        Intent intent = new Intent(C11644i.f33110I4);
        intent.putExtra("isOn", z);
        C2128a.m11089a((Context) this).mo9219a(intent);
    }

    public void onCreate() {
        super.onCreate();
        this.f32723a = new C11561a(this);
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        return 2;
    }

    public boolean onStartJob(JobParameters jobParameters) {
        StringBuilder sb = new StringBuilder();
        sb.append("onStartJob");
        sb.append(this.f32723a);
        sb.toString();
        registerReceiver(this.f32723a, new IntentFilter(C11644i.f33356l7));
        return true;
    }

    public boolean onStopJob(JobParameters jobParameters) {
        try {
            unregisterReceiver(this.f32723a);
        } catch (Exception unused) {
        }
        return true;
    }
}
