package android.support.p003v4.p004os;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.os.RemoteException;
import android.support.p003v4.p004os.C0163a.C0164a;
import androidx.annotation.C0207n0;
import androidx.annotation.C0207n0.C0208a;

@SuppressLint({"BanParcelableUsage"})
@C0207n0({C0208a.LIBRARY_GROUP_PREFIX})
/* renamed from: android.support.v4.os.ResultReceiver */
public class ResultReceiver implements Parcelable {
    public static final Creator<ResultReceiver> CREATOR = new C0160a();

    /* renamed from: N */
    C0163a f597N;

    /* renamed from: a */
    final boolean f598a;

    /* renamed from: b */
    final Handler f599b;

    /* renamed from: android.support.v4.os.ResultReceiver$a */
    static class C0160a implements Creator<ResultReceiver> {
        C0160a() {
        }

        public ResultReceiver createFromParcel(Parcel parcel) {
            return new ResultReceiver(parcel);
        }

        public ResultReceiver[] newArray(int i) {
            return new ResultReceiver[i];
        }
    }

    /* renamed from: android.support.v4.os.ResultReceiver$b */
    class C0161b extends C0164a {
        C0161b() {
        }

        /* renamed from: b */
        public void mo616b(int i, Bundle bundle) {
            ResultReceiver resultReceiver = ResultReceiver.this;
            Handler handler = resultReceiver.f599b;
            if (handler != null) {
                handler.post(new C0162c(i, bundle));
            } else {
                resultReceiver.mo50a(i, bundle);
            }
        }
    }

    /* renamed from: android.support.v4.os.ResultReceiver$c */
    class C0162c implements Runnable {

        /* renamed from: a */
        final int f602a;

        /* renamed from: b */
        final Bundle f603b;

        C0162c(int i, Bundle bundle) {
            this.f602a = i;
            this.f603b = bundle;
        }

        public void run() {
            ResultReceiver.this.mo50a(this.f602a, this.f603b);
        }
    }

    public ResultReceiver(Handler handler) {
        this.f598a = true;
        this.f599b = handler;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo50a(int i, Bundle bundle) {
    }

    /* renamed from: b */
    public void mo611b(int i, Bundle bundle) {
        if (this.f598a) {
            Handler handler = this.f599b;
            if (handler != null) {
                handler.post(new C0162c(i, bundle));
            } else {
                mo50a(i, bundle);
            }
            return;
        }
        C0163a aVar = this.f597N;
        if (aVar != null) {
            try {
                aVar.mo616b(i, bundle);
            } catch (RemoteException unused) {
            }
        }
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        synchronized (this) {
            if (this.f597N == null) {
                this.f597N = new C0161b();
            }
            parcel.writeStrongBinder(this.f597N.asBinder());
        }
    }

    ResultReceiver(Parcel parcel) {
        this.f598a = false;
        this.f599b = null;
        this.f597N = C0164a.m1084a(parcel.readStrongBinder());
    }
}
