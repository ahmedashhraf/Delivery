package com.clevertap.android.sdk;

import android.app.job.JobParameters;
import android.app.job.JobService;
import androidx.annotation.RequiresApi;

@RequiresApi(api = 21)
public class CTBackgroundJobService extends JobService {

    /* renamed from: com.clevertap.android.sdk.CTBackgroundJobService$a */
    class C3028a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ JobParameters f10764a;

        C3028a(JobParameters jobParameters) {
            this.f10764a = jobParameters;
        }

        public void run() {
            C3150p0.m15218b(CTBackgroundJobService.this.getApplicationContext(), this.f10764a);
            CTBackgroundJobService.this.jobFinished(this.f10764a, true);
        }
    }

    public boolean onStartJob(JobParameters jobParameters) {
        C3111h1.m14938f("Job Service is starting");
        new Thread(new C3028a(jobParameters)).start();
        return true;
    }

    public boolean onStopJob(JobParameters jobParameters) {
        return true;
    }
}
