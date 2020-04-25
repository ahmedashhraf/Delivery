package com.oppwa.mobile.connect.checkout.dialog;

import android.app.Activity;
import android.os.AsyncTask;
import com.alipay.sdk.app.PayTask;
import com.oppwa.mobile.connect.provider.Transaction;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.oppwa.mobile.connect.checkout.dialog.f0 */
class C11835f0 extends AsyncTask<String, Void, String> {

    /* renamed from: a */
    private Activity f34209a;

    /* renamed from: b */
    private Transaction f34210b;

    /* renamed from: c */
    private C11870l0 f34211c;

    C11835f0(Activity activity, Transaction transaction, C11870l0 l0Var) {
        this.f34209a = activity;
        this.f34210b = transaction;
        this.f34211c = l0Var;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public String doInBackground(String... strArr) {
        return new PayTask(this.f34209a).pay(strArr[0], true);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void onPostExecute(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(Pattern.quote("resultStatus={"));
        sb.append("(.*?)");
        sb.append(Pattern.quote("}"));
        Matcher matcher = Pattern.compile(sb.toString()).matcher(str);
        if (matcher.find()) {
            if ("6001".equals(matcher.group(1))) {
                this.f34211c.mo40418y();
                return;
            }
        }
        this.f34211c.mo40413c(this.f34210b);
    }
}
