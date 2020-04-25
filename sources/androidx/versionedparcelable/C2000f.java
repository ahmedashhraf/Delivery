package androidx.versionedparcelable;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcelable;
import androidx.annotation.C0207n0;
import androidx.annotation.C0207n0.C0208a;
import androidx.collection.C0635a;
import androidx.versionedparcelable.VersionedParcel.ParcelException;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Method;
import java.nio.charset.Charset;
import java.util.Set;
import org.apache.http.p549j0.C15430e;

@C0207n0({C0208a.LIBRARY})
/* renamed from: androidx.versionedparcelable.f */
/* compiled from: VersionedParcelStream */
class C2000f extends VersionedParcel {

    /* renamed from: C */
    private static final Charset f7722C = Charset.forName(C15430e.f44594u);

    /* renamed from: D */
    private static final int f7723D = 0;

    /* renamed from: E */
    private static final int f7724E = 1;

    /* renamed from: F */
    private static final int f7725F = 2;

    /* renamed from: G */
    private static final int f7726G = 3;

    /* renamed from: H */
    private static final int f7727H = 4;

    /* renamed from: I */
    private static final int f7728I = 5;

    /* renamed from: J */
    private static final int f7729J = 6;

    /* renamed from: K */
    private static final int f7730K = 7;

    /* renamed from: L */
    private static final int f7731L = 8;

    /* renamed from: M */
    private static final int f7732M = 9;

    /* renamed from: N */
    private static final int f7733N = 10;

    /* renamed from: O */
    private static final int f7734O = 11;

    /* renamed from: P */
    private static final int f7735P = 12;

    /* renamed from: Q */
    private static final int f7736Q = 13;

    /* renamed from: R */
    private static final int f7737R = 14;

    /* renamed from: A */
    private int f7738A;

    /* renamed from: B */
    int f7739B;

    /* renamed from: t */
    private final DataInputStream f7740t;

    /* renamed from: u */
    private final DataOutputStream f7741u;

    /* renamed from: v */
    private DataInputStream f7742v;

    /* renamed from: w */
    private DataOutputStream f7743w;

    /* renamed from: x */
    private C2002b f7744x;

    /* renamed from: y */
    private boolean f7745y;

    /* renamed from: z */
    int f7746z;

    /* renamed from: androidx.versionedparcelable.f$a */
    /* compiled from: VersionedParcelStream */
    class C2001a extends FilterInputStream {
        C2001a(InputStream inputStream) {
            super(inputStream);
        }

        public int read() throws IOException {
            C2000f fVar = C2000f.this;
            int i = fVar.f7739B;
            if (i == -1 || fVar.f7746z < i) {
                int read = super.read();
                C2000f.this.f7746z++;
                return read;
            }
            throw new IOException();
        }

        public long skip(long j) throws IOException {
            C2000f fVar = C2000f.this;
            int i = fVar.f7739B;
            if (i == -1 || fVar.f7746z < i) {
                long skip = super.skip(j);
                if (skip > 0) {
                    C2000f.this.f7746z += (int) skip;
                }
                return skip;
            }
            throw new IOException();
        }

        public int read(byte[] bArr, int i, int i2) throws IOException {
            C2000f fVar = C2000f.this;
            int i3 = fVar.f7739B;
            if (i3 == -1 || fVar.f7746z < i3) {
                int read = super.read(bArr, i, i2);
                if (read > 0) {
                    C2000f.this.f7746z += read;
                }
                return read;
            }
            throw new IOException();
        }
    }

    /* renamed from: androidx.versionedparcelable.f$b */
    /* compiled from: VersionedParcelStream */
    private static class C2002b {

        /* renamed from: a */
        final ByteArrayOutputStream f7748a = new ByteArrayOutputStream();

        /* renamed from: b */
        final DataOutputStream f7749b = new DataOutputStream(this.f7748a);

        /* renamed from: c */
        private final int f7750c;

        /* renamed from: d */
        private final DataOutputStream f7751d;

        C2002b(int i, DataOutputStream dataOutputStream) {
            this.f7750c = i;
            this.f7751d = dataOutputStream;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo8791a() throws IOException {
            this.f7749b.flush();
            int size = this.f7748a.size();
            this.f7751d.writeInt((this.f7750c << 16) | (size >= 65535 ? 65535 : size));
            if (size >= 65535) {
                this.f7751d.writeInt(size);
            }
            this.f7748a.writeTo(this.f7751d);
        }
    }

    public C2000f(InputStream inputStream, OutputStream outputStream) {
        this(inputStream, outputStream, new C0635a(), new C0635a(), new C0635a());
    }

    /* renamed from: a */
    public void mo8714a(boolean z, boolean z2) {
        if (z) {
            this.f7745y = z2;
            return;
        }
        throw new RuntimeException("Serialization of this object is not allowed");
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public VersionedParcel mo8734b() {
        C2000f fVar = new C2000f(this.f7742v, this.f7743w, this.f7707a, this.f7708b, this.f7709c);
        return fVar;
    }

    /* renamed from: c */
    public void mo8764c(int i) {
        try {
            this.f7743w.writeInt(i);
        } catch (IOException e) {
            throw new ParcelException(e);
        }
    }

    /* renamed from: c */
    public boolean mo8765c() {
        return true;
    }

    /* renamed from: d */
    public boolean mo8766d() {
        try {
            return this.f7742v.readBoolean();
        } catch (IOException e) {
            throw new ParcelException(e);
        }
    }

    /* renamed from: f */
    public Bundle mo8768f() {
        int m = mo8775m();
        if (m < 0) {
            return null;
        }
        Bundle bundle = new Bundle();
        for (int i = 0; i < m; i++) {
            m10545a(mo8775m(), mo8781s(), bundle);
        }
        return bundle;
    }

    /* renamed from: g */
    public byte[] mo8769g() {
        try {
            int readInt = this.f7742v.readInt();
            if (readInt <= 0) {
                return null;
            }
            byte[] bArr = new byte[readInt];
            this.f7742v.readFully(bArr);
            return bArr;
        } catch (IOException e) {
            throw new ParcelException(e);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public CharSequence mo8770h() {
        return null;
    }

    /* renamed from: i */
    public double mo8771i() {
        try {
            return this.f7742v.readDouble();
        } catch (IOException e) {
            throw new ParcelException(e);
        }
    }

    /* renamed from: k */
    public float mo8773k() {
        try {
            return this.f7742v.readFloat();
        } catch (IOException e) {
            throw new ParcelException(e);
        }
    }

    /* renamed from: m */
    public int mo8775m() {
        try {
            return this.f7742v.readInt();
        } catch (IOException e) {
            throw new ParcelException(e);
        }
    }

    /* renamed from: o */
    public long mo8777o() {
        try {
            return this.f7742v.readLong();
        } catch (IOException e) {
            throw new ParcelException(e);
        }
    }

    /* renamed from: q */
    public <T extends Parcelable> T mo8779q() {
        return null;
    }

    /* renamed from: s */
    public String mo8781s() {
        try {
            int readInt = this.f7742v.readInt();
            if (readInt <= 0) {
                return null;
            }
            byte[] bArr = new byte[readInt];
            this.f7742v.readFully(bArr);
            return new String(bArr, f7722C);
        } catch (IOException e) {
            throw new ParcelException(e);
        }
    }

    /* renamed from: t */
    public IBinder mo8782t() {
        return null;
    }

    private C2000f(InputStream inputStream, OutputStream outputStream, C0635a<String, Method> aVar, C0635a<String, Method> aVar2, C0635a<String, Class> aVar3) {
        super(aVar, aVar2, aVar3);
        this.f7746z = 0;
        this.f7738A = -1;
        this.f7739B = -1;
        DataOutputStream dataOutputStream = null;
        this.f7740t = inputStream != null ? new DataInputStream(new C2001a(inputStream)) : null;
        if (outputStream != null) {
            dataOutputStream = new DataOutputStream(outputStream);
        }
        this.f7741u = dataOutputStream;
        this.f7742v = this.f7740t;
        this.f7743w = this.f7741u;
    }

    /* renamed from: b */
    public void mo8738b(int i) {
        mo8699a();
        this.f7744x = new C2002b(i, this.f7741u);
        this.f7743w = this.f7744x.f7749b;
    }

    /* renamed from: a */
    public void mo8699a() {
        C2002b bVar = this.f7744x;
        if (bVar != null) {
            try {
                if (bVar.f7748a.size() != 0) {
                    this.f7744x.mo8791a();
                }
                this.f7744x = null;
            } catch (IOException e) {
                throw new ParcelException(e);
            }
        }
    }

    /* renamed from: a */
    public boolean mo8723a(int i) {
        while (this.f7738A != i) {
            try {
                if (String.valueOf(this.f7738A).compareTo(String.valueOf(i)) > 0) {
                    return false;
                }
                if (this.f7746z < this.f7739B) {
                    this.f7740t.skip((long) (this.f7739B - this.f7746z));
                }
                this.f7739B = -1;
                int readInt = this.f7740t.readInt();
                this.f7746z = 0;
                int i2 = readInt & 65535;
                if (i2 == 65535) {
                    i2 = this.f7740t.readInt();
                }
                this.f7738A = (readInt >> 16) & 65535;
                this.f7739B = i2;
            } catch (IOException unused) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    public void mo8715a(byte[] bArr) {
        if (bArr != null) {
            try {
                this.f7743w.writeInt(bArr.length);
                this.f7743w.write(bArr);
            } catch (IOException e) {
                throw new ParcelException(e);
            }
        } else {
            this.f7743w.writeInt(-1);
        }
    }

    /* renamed from: a */
    public void mo8716a(byte[] bArr, int i, int i2) {
        if (bArr != null) {
            try {
                this.f7743w.writeInt(i2);
                this.f7743w.write(bArr, i, i2);
            } catch (IOException e) {
                throw new ParcelException(e);
            }
        } else {
            this.f7743w.writeInt(-1);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo8711a(CharSequence charSequence) {
        if (!this.f7745y) {
            throw new RuntimeException("CharSequence cannot be written to an OutputStream");
        }
    }

    /* renamed from: a */
    public void mo8702a(long j) {
        try {
            this.f7743w.writeLong(j);
        } catch (IOException e) {
            throw new ParcelException(e);
        }
    }

    /* renamed from: a */
    public void mo8701a(float f) {
        try {
            this.f7743w.writeFloat(f);
        } catch (IOException e) {
            throw new ParcelException(e);
        }
    }

    /* renamed from: a */
    public void mo8700a(double d) {
        try {
            this.f7743w.writeDouble(d);
        } catch (IOException e) {
            throw new ParcelException(e);
        }
    }

    /* renamed from: a */
    public void mo8712a(String str) {
        if (str != null) {
            try {
                byte[] bytes = str.getBytes(f7722C);
                this.f7743w.writeInt(bytes.length);
                this.f7743w.write(bytes);
            } catch (IOException e) {
                throw new ParcelException(e);
            }
        } else {
            this.f7743w.writeInt(-1);
        }
    }

    /* renamed from: a */
    public void mo8713a(boolean z) {
        try {
            this.f7743w.writeBoolean(z);
        } catch (IOException e) {
            throw new ParcelException(e);
        }
    }

    /* renamed from: a */
    public void mo8704a(IBinder iBinder) {
        if (!this.f7745y) {
            throw new RuntimeException("Binders cannot be written to an OutputStream");
        }
    }

    /* renamed from: a */
    public void mo8707a(Parcelable parcelable) {
        if (!this.f7745y) {
            throw new RuntimeException("Parcelables cannot be written to an OutputStream");
        }
    }

    /* renamed from: a */
    public void mo8705a(IInterface iInterface) {
        if (!this.f7745y) {
            throw new RuntimeException("Binders cannot be written to an OutputStream");
        }
    }

    /* renamed from: a */
    public void mo8703a(Bundle bundle) {
        if (bundle != null) {
            try {
                Set<String> keySet = bundle.keySet();
                this.f7743w.writeInt(keySet.size());
                for (String str : keySet) {
                    mo8712a(str);
                    m10546a(bundle.get(str));
                }
            } catch (IOException e) {
                throw new ParcelException(e);
            }
        } else {
            this.f7743w.writeInt(-1);
        }
    }

    /* renamed from: a */
    private void m10546a(Object obj) {
        if (obj == null) {
            mo8764c(0);
        } else if (obj instanceof Bundle) {
            mo8764c(1);
            mo8703a((Bundle) obj);
        } else if (obj instanceof String) {
            mo8764c(3);
            mo8712a((String) obj);
        } else if (obj instanceof String[]) {
            mo8764c(4);
            mo8761b((T[]) (String[]) obj);
        } else if (obj instanceof Boolean) {
            mo8764c(5);
            mo8713a(((Boolean) obj).booleanValue());
        } else if (obj instanceof boolean[]) {
            mo8764c(6);
            mo8722a((boolean[]) obj);
        } else if (obj instanceof Double) {
            mo8764c(7);
            mo8700a(((Double) obj).doubleValue());
        } else if (obj instanceof double[]) {
            mo8764c(8);
            mo8718a((double[]) obj);
        } else if (obj instanceof Integer) {
            mo8764c(9);
            mo8764c(((Integer) obj).intValue());
        } else if (obj instanceof int[]) {
            mo8764c(10);
            mo8720a((int[]) obj);
        } else if (obj instanceof Long) {
            mo8764c(11);
            mo8702a(((Long) obj).longValue());
        } else if (obj instanceof long[]) {
            mo8764c(12);
            mo8721a((long[]) obj);
        } else if (obj instanceof Float) {
            mo8764c(13);
            mo8701a(((Float) obj).floatValue());
        } else if (obj instanceof float[]) {
            mo8764c(14);
            mo8719a((float[]) obj);
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Unsupported type ");
            sb.append(obj.getClass());
            throw new IllegalArgumentException(sb.toString());
        }
    }

    /* renamed from: a */
    private void m10545a(int i, String str, Bundle bundle) {
        switch (i) {
            case 0:
                bundle.putParcelable(str, null);
                return;
            case 1:
                bundle.putBundle(str, mo8768f());
                return;
            case 2:
                bundle.putBundle(str, mo8768f());
                return;
            case 3:
                bundle.putString(str, mo8781s());
                return;
            case 4:
                bundle.putStringArray(str, (String[]) mo8731a((T[]) new String[0]));
                return;
            case 5:
                bundle.putBoolean(str, mo8766d());
                return;
            case 6:
                bundle.putBooleanArray(str, mo8767e());
                return;
            case 7:
                bundle.putDouble(str, mo8771i());
                return;
            case 8:
                bundle.putDoubleArray(str, mo8772j());
                return;
            case 9:
                bundle.putInt(str, mo8775m());
                return;
            case 10:
                bundle.putIntArray(str, mo8776n());
                return;
            case 11:
                bundle.putLong(str, mo8777o());
                return;
            case 12:
                bundle.putLongArray(str, mo8778p());
                return;
            case 13:
                bundle.putFloat(str, mo8773k());
                return;
            case 14:
                bundle.putFloatArray(str, mo8774l());
                return;
            default:
                StringBuilder sb = new StringBuilder();
                sb.append("Unknown type ");
                sb.append(i);
                throw new RuntimeException(sb.toString());
        }
    }
}
