package com.oppwa.mobile.connect.checkout.dialog;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.AsyncTask;
import android.text.TextUtils;
import androidx.annotation.C0195i0;
import androidx.recyclerview.widget.C1744m.C1750f;
import com.oppwa.mobile.connect.payment.ImageDetail;
import com.oppwa.mobile.connect.payment.ImagesRequest;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.oppwa.mobile.connect.checkout.dialog.q */
class C11887q {

    /* renamed from: e */
    private static C11887q f34327e;

    /* renamed from: a */
    private ImagesRequest f34328a;

    /* renamed from: b */
    private Set<C11889b> f34329b = new HashSet();
    /* access modifiers changed from: private */

    /* renamed from: c */
    public Context f34330c;

    /* renamed from: d */
    private Set<String> f34331d = new HashSet();

    /* renamed from: com.oppwa.mobile.connect.checkout.dialog.q$a */
    public class C11888a extends AsyncTask<String, Void, Bitmap> {

        /* renamed from: a */
        private String f34332a;

        C11888a(String str) {
            this.f34332a = str;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:15:0x002e, code lost:
            if (r4 != null) goto L_0x001e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x0031, code lost:
            return r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:6:0x001c, code lost:
            if (r4 != null) goto L_0x001e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:7:0x001e, code lost:
            r4.disconnect();
         */
        /* JADX WARNING: Removed duplicated region for block: B:19:0x0035  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private android.graphics.Bitmap m53469a(java.lang.String r4) {
            /*
                r3 = this;
                r0 = 0
                java.net.URL r1 = new java.net.URL     // Catch:{ Exception -> 0x0029, all -> 0x0024 }
                r1.<init>(r4)     // Catch:{ Exception -> 0x0029, all -> 0x0024 }
                java.net.URLConnection r4 = r1.openConnection()     // Catch:{ Exception -> 0x0029, all -> 0x0024 }
                java.net.HttpURLConnection r4 = (java.net.HttpURLConnection) r4     // Catch:{ Exception -> 0x0029, all -> 0x0024 }
                r1 = 10000(0x2710, float:1.4013E-41)
                r4.setConnectTimeout(r1)     // Catch:{ Exception -> 0x0022 }
                r4.setReadTimeout(r1)     // Catch:{ Exception -> 0x0022 }
                java.io.InputStream r1 = r4.getInputStream()     // Catch:{ Exception -> 0x0022 }
                android.graphics.Bitmap r0 = android.graphics.BitmapFactory.decodeStream(r1)     // Catch:{ Exception -> 0x0022 }
                if (r4 == 0) goto L_0x0031
            L_0x001e:
                r4.disconnect()
                goto L_0x0031
            L_0x0022:
                r1 = move-exception
                goto L_0x002b
            L_0x0024:
                r4 = move-exception
                r2 = r0
                r0 = r4
                r4 = r2
                goto L_0x0033
            L_0x0029:
                r1 = move-exception
                r4 = r0
            L_0x002b:
                r1.getMessage()     // Catch:{ all -> 0x0032 }
                if (r4 == 0) goto L_0x0031
                goto L_0x001e
            L_0x0031:
                return r0
            L_0x0032:
                r0 = move-exception
            L_0x0033:
                if (r4 == 0) goto L_0x0038
                r4.disconnect()
            L_0x0038:
                goto L_0x003a
            L_0x0039:
                throw r0
            L_0x003a:
                goto L_0x0039
            */
            throw new UnsupportedOperationException("Method not decompiled: com.oppwa.mobile.connect.checkout.dialog.C11887q.C11888a.m53469a(java.lang.String):android.graphics.Bitmap");
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public Bitmap doInBackground(String... strArr) {
            return m53469a(strArr[0]);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void onPostExecute(Bitmap bitmap) {
            super.onPostExecute(bitmap);
            if (!isCancelled()) {
                if (bitmap != null) {
                    C11883p.m53431a().mo40532b(this.f34332a, bitmap);
                    C11915w0.m53576a(C11887q.this.f34330c, this.f34332a, bitmap);
                } else {
                    C11883p.m53431a().mo40532b(this.f34332a, C11887q.this.m53459c(this.f34332a));
                }
                C11887q.this.m53463g(this.f34332a);
            }
        }
    }

    /* renamed from: com.oppwa.mobile.connect.checkout.dialog.q$b */
    public interface C11889b {
        /* renamed from: e */
        void mo40406e(String str);
    }

    C11887q(Context context) {
        this.f34330c = context;
    }

    /* renamed from: a */
    public static synchronized C11887q m53456a(Context context) {
        C11887q qVar;
        synchronized (C11887q.class) {
            if (f34327e == null) {
                f34327e = new C11887q(context);
            }
            qVar = f34327e;
        }
        return qVar;
    }

    /* renamed from: b */
    private void m53458b(String str) {
        if (!this.f34331d.contains(str)) {
            this.f34331d.add(str);
            C11888a aVar = new C11888a(str);
            try {
                aVar.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new String[]{((ImageDetail) this.f34328a.mo40875a().get(str)).mo40868i()});
            } catch (Exception e) {
                e.getMessage();
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public Bitmap m53459c(String str) {
        Bitmap d = m53460d(str);
        return d == null ? m53461e(str) : d;
    }

    /* renamed from: d */
    private Bitmap m53460d(String str) {
        return BitmapFactory.decodeResource(this.f34330c.getResources(), C11906t0.m53533a(this.f34330c, str));
    }

    /* renamed from: e */
    private Bitmap m53461e(String str) {
        Bitmap createBitmap = Bitmap.createBitmap(C1750f.f6813c, C1750f.f6813c, Config.ALPHA_8);
        Canvas canvas = new Canvas(createBitmap);
        float f = this.f34330c.getResources().getDisplayMetrics().density;
        Paint paint = new Paint(1);
        paint.setColor(Color.rgb(0, 0, 0));
        paint.setTextSize((float) ((int) (f * 14.0f)));
        paint.setShadowLayer(1.0f, 0.0f, 1.0f, -1);
        Rect rect = new Rect();
        paint.getTextBounds(str, 0, str.length(), rect);
        canvas.drawText(str, (float) ((createBitmap.getWidth() - rect.width()) / 2), (float) ((createBitmap.getHeight() + rect.height()) / 2), paint);
        return createBitmap;
    }

    /* renamed from: f */
    private boolean m53462f(String str) {
        ImagesRequest imagesRequest = this.f34328a;
        return !TextUtils.isEmpty((imagesRequest == null || imagesRequest.mo40875a() == null || !this.f34328a.mo40875a().containsKey(str)) ? null : ((ImageDetail) this.f34328a.mo40875a().get(str)).mo40868i());
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public void m53463g(String str) {
        for (C11889b e : this.f34329b) {
            e.mo40406e(str);
        }
        this.f34331d.remove(str);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public Bitmap mo40544a(String str) {
        Bitmap a = C11883p.m53431a().mo40531a(str);
        if (a == null) {
            a = C11915w0.m53573a(this.f34330c, str);
        }
        if (a != null) {
            C11883p.m53431a().mo40532b(str, a);
            return a;
        } else if (!m53462f(str)) {
            return m53459c(str);
        } else {
            m53458b(str);
            return a;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo40545a(C11889b bVar) {
        this.f34329b.add(bVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo40546a(@C0195i0 ImagesRequest imagesRequest) {
        if (imagesRequest != null) {
            ImagesRequest imagesRequest2 = this.f34328a;
            if (imagesRequest2 == null) {
                this.f34328a = imagesRequest;
            } else {
                imagesRequest2.mo40876a(imagesRequest);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo40547a() {
        return this.f34328a == null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo40548b(C11889b bVar) {
        this.f34329b.remove(bVar);
    }
}
