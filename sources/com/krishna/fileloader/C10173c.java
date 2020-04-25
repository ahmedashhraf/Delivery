package com.krishna.fileloader;

import android.content.Context;
import android.os.AsyncTask;
import com.krishna.fileloader.p194h.C10184c;
import com.krishna.fileloader.p405e.C10178b;
import com.krishna.fileloader.p406f.C10179a;
import com.krishna.fileloader.p408i.C10185a;
import java.io.File;
import java.io.InterruptedIOException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.krishna.fileloader.c */
/* compiled from: MultiFileDownloadTask */
public class C10173c extends AsyncTask<C10184c, Integer, Void> {

    /* renamed from: a */
    private C10178b f27120a;

    /* renamed from: b */
    private Context f27121b;

    /* renamed from: c */
    private int f27122c = 0;

    /* renamed from: d */
    private int f27123d = 0;

    /* renamed from: e */
    private List<File> f27124e;

    public C10173c(Context context, C10178b bVar) {
        this.f27121b = context.getApplicationContext();
        this.f27120a = bVar;
        this.f27124e = new ArrayList();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Void doInBackground(C10184c... cVarArr) {
        this.f27122c = cVarArr.length;
        for (C10184c cVar : cVarArr) {
            try {
                File c = C10185a.m47376c(this.f27121b, cVar.mo36503c(), cVar.mo36496a(), cVar.mo36500b());
                C10179a aVar = new C10179a(this.f27121b, cVar.mo36503c(), cVar.mo36496a(), cVar.mo36500b());
                if (!cVar.mo36507f() && c != null) {
                    if (c.exists()) {
                        if (cVar.mo36505d()) {
                            File a = aVar.mo36452a(true, cVar.mo36506e());
                            if (a != null) {
                                c = a;
                            }
                        }
                        this.f27124e.add(c);
                        int i = this.f27123d + 1;
                        this.f27123d = i;
                        publishProgress(new Integer[]{Integer.valueOf(i)});
                    }
                }
                c = aVar.mo36452a(false, cVar.mo36506e());
                this.f27124e.add(c);
                int i2 = this.f27123d + 1;
                this.f27123d = i2;
                publishProgress(new Integer[]{Integer.valueOf(i2)});
            } catch (InterruptedIOException e) {
                int i3 = this.f27123d + 1;
                this.f27123d = i3;
                m47272a(e, i3);
            } catch (Exception e2) {
                int i4 = this.f27123d + 1;
                this.f27123d = i4;
                m47272a(e2, i4);
            }
        }
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void onProgressUpdate(Integer... numArr) {
        super.onProgressUpdate(numArr);
        C10178b bVar = this.f27120a;
        if (bVar != null) {
            try {
                bVar.mo36450a((File) this.f27124e.get(numArr[0].intValue() - 1), numArr[0].intValue(), this.f27122c);
            } catch (Exception e) {
                m47272a(e, numArr[0].intValue());
            }
        }
    }

    /* renamed from: a */
    private void m47272a(Exception exc, int i) {
        try {
            this.f27120a.mo36451a(exc, i);
        } catch (Exception unused) {
        }
    }
}
