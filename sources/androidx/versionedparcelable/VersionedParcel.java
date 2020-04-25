package androidx.versionedparcelable;

import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.NetworkOnMainThreadException;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseBooleanArray;
import androidx.annotation.C0193h0;
import androidx.annotation.C0207n0;
import androidx.annotation.C0207n0.C0208a;
import androidx.annotation.RequiresApi;
import androidx.collection.C0635a;
import androidx.collection.C0637b;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamClass;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

@C0207n0({C0208a.LIBRARY_GROUP_PREFIX})
public abstract class VersionedParcel {

    /* renamed from: d */
    private static final String f7691d = "VersionedParcel";

    /* renamed from: e */
    private static final int f7692e = -1;

    /* renamed from: f */
    private static final int f7693f = -2;

    /* renamed from: g */
    private static final int f7694g = -3;

    /* renamed from: h */
    private static final int f7695h = -4;

    /* renamed from: i */
    private static final int f7696i = -5;

    /* renamed from: j */
    private static final int f7697j = -6;

    /* renamed from: k */
    private static final int f7698k = -7;

    /* renamed from: l */
    private static final int f7699l = -9;

    /* renamed from: m */
    private static final int f7700m = 1;

    /* renamed from: n */
    private static final int f7701n = 2;

    /* renamed from: o */
    private static final int f7702o = 3;

    /* renamed from: p */
    private static final int f7703p = 4;

    /* renamed from: q */
    private static final int f7704q = 5;

    /* renamed from: r */
    private static final int f7705r = 7;

    /* renamed from: s */
    private static final int f7706s = 8;

    /* renamed from: a */
    protected final C0635a<String, Method> f7707a;

    /* renamed from: b */
    protected final C0635a<String, Method> f7708b;

    /* renamed from: c */
    protected final C0635a<String, Class> f7709c;

    public static class ParcelException extends RuntimeException {
        public ParcelException(Throwable th) {
            super(th);
        }
    }

    /* renamed from: androidx.versionedparcelable.VersionedParcel$a */
    class C1994a extends ObjectInputStream {
        C1994a(InputStream inputStream) {
            super(inputStream);
        }

        /* access modifiers changed from: protected */
        public Class<?> resolveClass(ObjectStreamClass objectStreamClass) throws IOException, ClassNotFoundException {
            Class<?> cls = Class.forName(objectStreamClass.getName(), false, C1994a.class.getClassLoader());
            if (cls != null) {
                return cls;
            }
            return super.resolveClass(objectStreamClass);
        }
    }

    public VersionedParcel(C0635a<String, Method> aVar, C0635a<String, Method> aVar2, C0635a<String, Class> aVar3) {
        this.f7707a = aVar;
        this.f7708b = aVar2;
        this.f7709c = aVar3;
    }

    /* renamed from: w */
    private int m10403w() {
        return mo8775m();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo8699a();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo8700a(double d);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo8701a(float f);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo8702a(long j);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo8703a(Bundle bundle);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo8704a(IBinder iBinder);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo8705a(IInterface iInterface);

    /* renamed from: a */
    public void mo8706a(IInterface iInterface, int i) {
        mo8738b(i);
        mo8705a(iInterface);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo8707a(Parcelable parcelable);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo8711a(CharSequence charSequence);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo8712a(String str);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo8713a(boolean z);

    /* renamed from: a */
    public void mo8714a(boolean z, boolean z2) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo8715a(byte[] bArr);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo8716a(byte[] bArr, int i, int i2);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract boolean mo8723a(int i);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract VersionedParcel mo8734b();

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo8738b(int i);

    /* renamed from: b */
    public void mo8741b(Bundle bundle, int i) {
        mo8738b(i);
        mo8703a(bundle);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract void mo8764c(int i);

    /* renamed from: c */
    public boolean mo8765c() {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract boolean mo8766d();

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public boolean[] mo8767e() {
        int m = mo8775m();
        if (m < 0) {
            return null;
        }
        boolean[] zArr = new boolean[m];
        for (int i = 0; i < m; i++) {
            zArr[i] = mo8775m() != 0;
        }
        return zArr;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public abstract Bundle mo8768f();

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public abstract byte[] mo8769g();

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public abstract CharSequence mo8770h();

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public abstract double mo8771i();

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public double[] mo8772j() {
        int m = mo8775m();
        if (m < 0) {
            return null;
        }
        double[] dArr = new double[m];
        for (int i = 0; i < m; i++) {
            dArr[i] = mo8771i();
        }
        return dArr;
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public abstract float mo8773k();

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public float[] mo8774l() {
        int m = mo8775m();
        if (m < 0) {
            return null;
        }
        float[] fArr = new float[m];
        for (int i = 0; i < m; i++) {
            fArr[i] = mo8773k();
        }
        return fArr;
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public abstract int mo8775m();

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public int[] mo8776n() {
        int m = mo8775m();
        if (m < 0) {
            return null;
        }
        int[] iArr = new int[m];
        for (int i = 0; i < m; i++) {
            iArr[i] = mo8775m();
        }
        return iArr;
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public abstract long mo8777o();

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public long[] mo8778p() {
        int m = mo8775m();
        if (m < 0) {
            return null;
        }
        long[] jArr = new long[m];
        for (int i = 0; i < m; i++) {
            jArr[i] = mo8777o();
        }
        return jArr;
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public abstract <T extends Parcelable> T mo8779q();

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public Serializable mo8780r() {
        String str = ")";
        String s = mo8781s();
        if (s == null) {
            return null;
        }
        try {
            return (Serializable) new C1994a(new ByteArrayInputStream(mo8769g())).readObject();
        } catch (IOException e) {
            StringBuilder sb = new StringBuilder();
            sb.append("VersionedParcelable encountered IOException reading a Serializable object (name = ");
            sb.append(s);
            sb.append(str);
            throw new RuntimeException(sb.toString(), e);
        } catch (ClassNotFoundException e2) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("VersionedParcelable encountered ClassNotFoundException reading a Serializable object (name = ");
            sb2.append(s);
            sb2.append(str);
            throw new RuntimeException(sb2.toString(), e2);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public abstract String mo8781s();

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public abstract IBinder mo8782t();

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public <T extends C2003g> T mo8783u() {
        String s = mo8781s();
        if (s == null) {
            return null;
        }
        return mo8692a(s, mo8734b());
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public void mo8784v() {
        mo8764c(0);
    }

    /* renamed from: a */
    public void mo8717a(byte[] bArr, int i, int i2, int i3) {
        mo8738b(i3);
        mo8716a(bArr, i, i2);
    }

    /* renamed from: b */
    public void mo8754b(boolean z, int i) {
        mo8738b(i);
        mo8713a(z);
    }

    /* renamed from: a */
    public boolean mo8724a(boolean z, int i) {
        if (!mo8723a(i)) {
            return z;
        }
        return mo8766d();
    }

    /* renamed from: b */
    public void mo8755b(byte[] bArr, int i) {
        mo8738b(i);
        mo8715a(bArr);
    }

    /* renamed from: a */
    public int mo8683a(int i, int i2) {
        if (!mo8723a(i2)) {
            return i;
        }
        return mo8775m();
    }

    /* renamed from: b */
    public void mo8748b(CharSequence charSequence, int i) {
        mo8738b(i);
        mo8711a(charSequence);
    }

    /* renamed from: a */
    public long mo8684a(long j, int i) {
        if (!mo8723a(i)) {
            return j;
        }
        return mo8777o();
    }

    /* renamed from: b */
    public void mo8739b(int i, int i2) {
        mo8738b(i2);
        mo8764c(i);
    }

    /* renamed from: a */
    public float mo8682a(float f, int i) {
        if (!mo8723a(i)) {
            return f;
        }
        return mo8773k();
    }

    /* renamed from: b */
    public void mo8740b(long j, int i) {
        mo8738b(i);
        mo8702a(j);
    }

    /* renamed from: a */
    public double mo8681a(double d, int i) {
        if (!mo8723a(i)) {
            return d;
        }
        return mo8771i();
    }

    /* renamed from: b */
    public void mo8737b(float f, int i) {
        mo8738b(i);
        mo8701a(f);
    }

    /* renamed from: a */
    public String mo8695a(String str, int i) {
        if (!mo8723a(i)) {
            return str;
        }
        return mo8781s();
    }

    /* renamed from: b */
    public void mo8736b(double d, int i) {
        mo8738b(i);
        mo8700a(d);
    }

    /* renamed from: a */
    public IBinder mo8686a(IBinder iBinder, int i) {
        if (!mo8723a(i)) {
            return iBinder;
        }
        return mo8782t();
    }

    /* renamed from: b */
    public void mo8750b(String str, int i) {
        mo8738b(i);
        mo8712a(str);
    }

    /* renamed from: a */
    public byte[] mo8725a(byte[] bArr, int i) {
        if (!mo8723a(i)) {
            return bArr;
        }
        return mo8769g();
    }

    /* renamed from: b */
    public void mo8742b(IBinder iBinder, int i) {
        mo8738b(i);
        mo8704a(iBinder);
    }

    /* renamed from: a */
    public <T extends Parcelable> T mo8687a(T t, int i) {
        if (!mo8723a(i)) {
            return t;
        }
        return mo8779q();
    }

    /* renamed from: b */
    public void mo8743b(Parcelable parcelable, int i) {
        mo8738b(i);
        mo8707a(parcelable);
    }

    /* renamed from: a */
    public Bundle mo8685a(Bundle bundle, int i) {
        if (!mo8723a(i)) {
            return bundle;
        }
        return mo8768f();
    }

    /* renamed from: b */
    public void mo8735b(byte b, int i) {
        mo8738b(i);
        mo8764c(b);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo8722a(boolean[] zArr) {
        if (zArr != null) {
            int length = zArr.length;
            mo8764c(length);
            for (int i = 0; i < length; i++) {
                mo8764c(zArr[i] ? 1 : 0);
            }
            return;
        }
        mo8764c(-1);
    }

    @RequiresApi(api = 21)
    /* renamed from: b */
    public void mo8744b(Size size, int i) {
        mo8738b(i);
        mo8713a(size != null);
        if (size != null) {
            mo8764c(size.getWidth());
            mo8764c(size.getHeight());
        }
    }

    /* renamed from: a */
    public boolean[] mo8733a(boolean[] zArr, int i) {
        if (!mo8723a(i)) {
            return zArr;
        }
        return mo8767e();
    }

    @RequiresApi(api = 21)
    /* renamed from: b */
    public void mo8745b(SizeF sizeF, int i) {
        mo8738b(i);
        mo8713a(sizeF != null);
        if (sizeF != null) {
            mo8701a(sizeF.getWidth());
            mo8701a(sizeF.getHeight());
        }
    }

    /* renamed from: a */
    public CharSequence mo8693a(CharSequence charSequence, int i) {
        if (!mo8723a(i)) {
            return charSequence;
        }
        return mo8770h();
    }

    /* renamed from: a */
    public char[] mo8726a(char[] cArr, int i) {
        if (!mo8723a(i)) {
            return cArr;
        }
        int m = mo8775m();
        if (m < 0) {
            return null;
        }
        char[] cArr2 = new char[m];
        for (int i2 = 0; i2 < m; i2++) {
            cArr2[i2] = (char) mo8775m();
        }
        return cArr2;
    }

    /* renamed from: b */
    public void mo8746b(SparseBooleanArray sparseBooleanArray, int i) {
        mo8738b(i);
        if (sparseBooleanArray == null) {
            mo8764c(-1);
            return;
        }
        int size = sparseBooleanArray.size();
        mo8764c(size);
        for (int i2 = 0; i2 < size; i2++) {
            mo8764c(sparseBooleanArray.keyAt(i2));
            mo8713a(sparseBooleanArray.valueAt(i2));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo8720a(int[] iArr) {
        if (iArr != null) {
            mo8764c(r0);
            for (int c : iArr) {
                mo8764c(c);
            }
            return;
        }
        mo8764c(-1);
    }

    /* renamed from: b */
    public void mo8763b(boolean[] zArr, int i) {
        mo8738b(i);
        mo8722a(zArr);
    }

    /* renamed from: a */
    public int[] mo8729a(int[] iArr, int i) {
        if (!mo8723a(i)) {
            return iArr;
        }
        return mo8776n();
    }

    /* renamed from: b */
    public void mo8756b(char[] cArr, int i) {
        mo8738b(i);
        if (cArr != null) {
            mo8764c(r4);
            for (char c : cArr) {
                mo8764c(c);
            }
            return;
        }
        mo8764c(-1);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo8721a(long[] jArr) {
        if (jArr != null) {
            mo8764c(r0);
            for (long a : jArr) {
                mo8702a(a);
            }
            return;
        }
        mo8764c(-1);
    }

    /* renamed from: b */
    public void mo8759b(int[] iArr, int i) {
        mo8738b(i);
        mo8720a(iArr);
    }

    /* renamed from: a */
    public long[] mo8730a(long[] jArr, int i) {
        if (!mo8723a(i)) {
            return jArr;
        }
        return mo8778p();
    }

    /* renamed from: b */
    public void mo8760b(long[] jArr, int i) {
        mo8738b(i);
        mo8721a(jArr);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo8719a(float[] fArr) {
        if (fArr != null) {
            mo8764c(r0);
            for (float a : fArr) {
                mo8701a(a);
            }
            return;
        }
        mo8764c(-1);
    }

    /* renamed from: b */
    public void mo8758b(float[] fArr, int i) {
        mo8738b(i);
        mo8719a(fArr);
    }

    /* renamed from: b */
    public void mo8757b(double[] dArr, int i) {
        mo8738b(i);
        mo8718a(dArr);
    }

    /* renamed from: a */
    public float[] mo8728a(float[] fArr, int i) {
        if (!mo8723a(i)) {
            return fArr;
        }
        return mo8774l();
    }

    /* renamed from: b */
    public <T> void mo8753b(Set<T> set, int i) {
        m10397a((Collection<T>) set, i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo8718a(double[] dArr) {
        if (dArr != null) {
            mo8764c(r0);
            for (double a : dArr) {
                mo8700a(a);
            }
            return;
        }
        mo8764c(-1);
    }

    /* renamed from: b */
    public <T> void mo8751b(List<T> list, int i) {
        m10397a((Collection<T>) list, i);
    }

    /* renamed from: b */
    public <K, V> void mo8752b(Map<K, V> map, int i) {
        mo8738b(i);
        if (map == null) {
            mo8764c(-1);
            return;
        }
        int size = map.size();
        mo8764c(size);
        if (size != 0) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (Entry entry : map.entrySet()) {
                arrayList.add(entry.getKey());
                arrayList2.add(entry.getValue());
            }
            m10402b((Collection<T>) arrayList);
            m10402b((Collection<T>) arrayList2);
        }
    }

    /* renamed from: a */
    public double[] mo8727a(double[] dArr, int i) {
        if (!mo8723a(i)) {
            return dArr;
        }
        return mo8772j();
    }

    /* renamed from: a */
    private <T> void m10397a(Collection<T> collection, int i) {
        mo8738b(i);
        m10402b(collection);
    }

    /* renamed from: a */
    private <T> int m10391a(T t) {
        if (t instanceof String) {
            return 4;
        }
        if (t instanceof Parcelable) {
            return 2;
        }
        if (t instanceof C2003g) {
            return 1;
        }
        if (t instanceof Serializable) {
            return 3;
        }
        if (t instanceof IBinder) {
            return 5;
        }
        if (t instanceof Integer) {
            return 7;
        }
        if (t instanceof Float) {
            return 8;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(t.getClass().getName());
        sb.append(" cannot be VersionedParcelled");
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: b */
    private <T> void m10402b(Collection<T> collection) {
        if (collection == null) {
            mo8764c(-1);
            return;
        }
        int size = collection.size();
        mo8764c(size);
        if (size > 0) {
            int a = m10391a((T) collection.iterator().next());
            mo8764c(a);
            switch (a) {
                case 1:
                    for (T a2 : collection) {
                        mo8708a((C2003g) a2);
                    }
                    break;
                case 2:
                    for (T a3 : collection) {
                        mo8707a((Parcelable) a3);
                    }
                    break;
                case 3:
                    for (T a4 : collection) {
                        m10396a((Serializable) a4);
                    }
                    break;
                case 4:
                    for (T a5 : collection) {
                        mo8712a((String) a5);
                    }
                    break;
                case 5:
                    for (T a6 : collection) {
                        mo8704a((IBinder) a6);
                    }
                    break;
                case 7:
                    for (T intValue : collection) {
                        mo8764c(intValue.intValue());
                    }
                    break;
                case 8:
                    for (T floatValue : collection) {
                        mo8701a(floatValue.floatValue());
                    }
                    break;
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo8708a(C2003g gVar) {
        if (gVar == null) {
            mo8712a((String) null);
            return;
        }
        m10401b(gVar);
        VersionedParcel b = mo8734b();
        mo8709a((T) gVar, b);
        b.mo8699a();
    }

    /* renamed from: a */
    public void mo8710a(Serializable serializable, int i) {
        mo8738b(i);
        m10396a(serializable);
    }

    /* renamed from: a */
    private void m10396a(Serializable serializable) {
        if (serializable == null) {
            mo8712a((String) null);
            return;
        }
        String name = serializable.getClass().getName();
        mo8712a(name);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            objectOutputStream.writeObject(serializable);
            objectOutputStream.close();
            mo8715a(byteArrayOutputStream.toByteArray());
        } catch (IOException e) {
            StringBuilder sb = new StringBuilder();
            sb.append("VersionedParcelable encountered IOException writing serializable object (name = ");
            sb.append(name);
            sb.append(")");
            throw new RuntimeException(sb.toString(), e);
        }
    }

    /* renamed from: b */
    public <T> void mo8762b(T[] tArr, int i) {
        mo8738b(i);
        mo8761b(tArr);
    }

    /* renamed from: a */
    public Exception mo8694a(Exception exc, int i) {
        if (!mo8723a(i)) {
            return exc;
        }
        int w = m10403w();
        if (w != 0) {
            exc = m10398b(w, mo8781s());
        }
        return exc;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public <T> void mo8761b(T[] tArr) {
        if (tArr == null) {
            mo8764c(-1);
            return;
        }
        int length = tArr.length;
        mo8764c(length);
        if (length > 0) {
            int i = 0;
            int a = m10391a(tArr[0]);
            mo8764c(a);
            if (a == 1) {
                while (i < length) {
                    mo8708a((C2003g) tArr[i]);
                    i++;
                }
            } else if (a == 2) {
                while (i < length) {
                    mo8707a((Parcelable) tArr[i]);
                    i++;
                }
            } else if (a == 3) {
                while (i < length) {
                    m10396a((Serializable) tArr[i]);
                    i++;
                }
            } else if (a == 4) {
                while (i < length) {
                    mo8712a((String) tArr[i]);
                    i++;
                }
            } else if (a == 5) {
                while (i < length) {
                    mo8704a((IBinder) tArr[i]);
                    i++;
                }
            }
        }
    }

    @C0193h0
    /* renamed from: a */
    protected static Throwable m10394a(@C0193h0 Throwable th) {
        while (th.getCause() != null) {
            th = th.getCause();
        }
        return th;
    }

    /* renamed from: a */
    private Exception m10393a(int i, String str) {
        switch (i) {
            case -9:
                return (Exception) mo8779q();
            case -7:
                return new UnsupportedOperationException(str);
            case -6:
                return new NetworkOnMainThreadException();
            case -5:
                return new IllegalStateException(str);
            case -4:
                return new NullPointerException(str);
            case -3:
                return new IllegalArgumentException(str);
            case -2:
                return new BadParcelableException(str);
            case -1:
                return new SecurityException(str);
            default:
                StringBuilder sb = new StringBuilder();
                sb.append("Unknown exception code: ");
                sb.append(i);
                sb.append(" msg ");
                sb.append(str);
                return new RuntimeException(sb.toString());
        }
    }

    /* renamed from: b */
    public void mo8747b(C2003g gVar, int i) {
        mo8738b(i);
        mo8708a(gVar);
    }

    /* renamed from: b */
    private void m10401b(C2003g gVar) {
        try {
            mo8712a(m10392a(gVar.getClass()).getName());
        } catch (ClassNotFoundException e) {
            StringBuilder sb = new StringBuilder();
            sb.append(gVar.getClass().getSimpleName());
            sb.append(" does not have a Parcelizer");
            throw new RuntimeException(sb.toString(), e);
        }
    }

    /* renamed from: a */
    public byte mo8680a(byte b, int i) {
        if (!mo8723a(i)) {
            return b;
        }
        return (byte) (mo8775m() & 255);
    }

    @RequiresApi(api = 21)
    /* renamed from: a */
    public Size mo8688a(Size size, int i) {
        if (!mo8723a(i)) {
            return size;
        }
        if (mo8766d()) {
            return new Size(mo8775m(), mo8775m());
        }
        return null;
    }

    /* renamed from: b */
    public void mo8749b(Exception exc, int i) {
        mo8738b(i);
        if (exc == null) {
            mo8784v();
            return;
        }
        int i2 = 0;
        if ((exc instanceof Parcelable) && exc.getClass().getClassLoader() == Parcelable.class.getClassLoader()) {
            i2 = -9;
        } else if (exc instanceof SecurityException) {
            i2 = -1;
        } else if (exc instanceof BadParcelableException) {
            i2 = -2;
        } else if (exc instanceof IllegalArgumentException) {
            i2 = -3;
        } else if (exc instanceof NullPointerException) {
            i2 = -4;
        } else if (exc instanceof IllegalStateException) {
            i2 = -5;
        } else if (exc instanceof NetworkOnMainThreadException) {
            i2 = -6;
        } else if (exc instanceof UnsupportedOperationException) {
            i2 = -7;
        }
        mo8764c(i2);
        if (i2 != 0) {
            mo8712a(exc.getMessage());
            if (i2 == -9) {
                mo8707a((Parcelable) exc);
            }
        } else if (exc instanceof RuntimeException) {
            throw ((RuntimeException) exc);
        } else {
            throw new RuntimeException(exc);
        }
    }

    @RequiresApi(api = 21)
    /* renamed from: a */
    public SizeF mo8689a(SizeF sizeF, int i) {
        if (!mo8723a(i)) {
            return sizeF;
        }
        if (mo8766d()) {
            return new SizeF(mo8773k(), mo8773k());
        }
        return null;
    }

    /* renamed from: a */
    public SparseBooleanArray mo8690a(SparseBooleanArray sparseBooleanArray, int i) {
        if (!mo8723a(i)) {
            return sparseBooleanArray;
        }
        int m = mo8775m();
        if (m < 0) {
            return null;
        }
        SparseBooleanArray sparseBooleanArray2 = new SparseBooleanArray(m);
        for (int i2 = 0; i2 < m; i2++) {
            sparseBooleanArray2.put(mo8775m(), mo8766d());
        }
        return sparseBooleanArray2;
    }

    /* renamed from: a */
    public <T> Set<T> mo8698a(Set<T> set, int i) {
        if (!mo8723a(i)) {
            return set;
        }
        return (Set) m10395a((S) new C0637b());
    }

    /* renamed from: a */
    public <T> List<T> mo8696a(List<T> list, int i) {
        if (!mo8723a(i)) {
            return list;
        }
        return (List) m10395a((S) new ArrayList());
    }

    /* renamed from: b */
    private Exception m10398b(int i, String str) {
        return m10393a(i, str);
    }

    /* renamed from: a */
    private <T, S extends Collection<T>> S m10395a(S s) {
        int m = mo8775m();
        if (m < 0) {
            return null;
        }
        if (m != 0) {
            int m2 = mo8775m();
            if (m < 0) {
                return null;
            }
            if (m2 == 1) {
                while (m > 0) {
                    s.add(mo8783u());
                    m--;
                }
            } else if (m2 == 2) {
                while (m > 0) {
                    s.add(mo8779q());
                    m--;
                }
            } else if (m2 == 3) {
                while (m > 0) {
                    s.add(mo8780r());
                    m--;
                }
            } else if (m2 == 4) {
                while (m > 0) {
                    s.add(mo8781s());
                    m--;
                }
            } else if (m2 == 5) {
                while (m > 0) {
                    s.add(mo8782t());
                    m--;
                }
            }
        }
        return s;
    }

    /* renamed from: b */
    private Method m10400b(String str) throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException {
        Class<VersionedParcel> cls = VersionedParcel.class;
        Method method = (Method) this.f7707a.get(str);
        if (method != null) {
            return method;
        }
        System.currentTimeMillis();
        Method declaredMethod = Class.forName(str, true, cls.getClassLoader()).getDeclaredMethod("read", new Class[]{cls});
        this.f7707a.put(str, declaredMethod);
        return declaredMethod;
    }

    /* renamed from: b */
    private Method m10399b(Class cls) throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException {
        Method method = (Method) this.f7708b.get(cls.getName());
        if (method != null) {
            return method;
        }
        Class a = m10392a(cls);
        System.currentTimeMillis();
        Method declaredMethod = a.getDeclaredMethod("write", new Class[]{cls, VersionedParcel.class});
        this.f7708b.put(cls.getName(), declaredMethod);
        return declaredMethod;
    }

    /* renamed from: a */
    public <K, V> Map<K, V> mo8697a(Map<K, V> map, int i) {
        if (!mo8723a(i)) {
            return map;
        }
        int m = mo8775m();
        if (m < 0) {
            return null;
        }
        C0635a aVar = new C0635a();
        if (m == 0) {
            return aVar;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        m10395a((S) arrayList);
        m10395a((S) arrayList2);
        for (int i2 = 0; i2 < m; i2++) {
            aVar.put(arrayList.get(i2), arrayList2.get(i2));
        }
        return aVar;
    }

    /* renamed from: a */
    public <T> T[] mo8732a(T[] tArr, int i) {
        if (!mo8723a(i)) {
            return tArr;
        }
        return mo8731a(tArr);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public <T> T[] mo8731a(T[] tArr) {
        int m = mo8775m();
        if (m < 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList(m);
        if (m != 0) {
            int m2 = mo8775m();
            if (m < 0) {
                return null;
            }
            if (m2 == 1) {
                while (m > 0) {
                    arrayList.add(mo8783u());
                    m--;
                }
            } else if (m2 == 2) {
                while (m > 0) {
                    arrayList.add(mo8779q());
                    m--;
                }
            } else if (m2 == 3) {
                while (m > 0) {
                    arrayList.add(mo8780r());
                    m--;
                }
            } else if (m2 == 4) {
                while (m > 0) {
                    arrayList.add(mo8781s());
                    m--;
                }
            } else if (m2 == 5) {
                while (m > 0) {
                    arrayList.add(mo8782t());
                    m--;
                }
            }
        }
        return arrayList.toArray(tArr);
    }

    /* renamed from: a */
    public <T extends C2003g> T mo8691a(T t, int i) {
        if (!mo8723a(i)) {
            return t;
        }
        return mo8783u();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public <T extends C2003g> T mo8692a(String str, VersionedParcel versionedParcel) {
        try {
            return (C2003g) m10400b(str).invoke(null, new Object[]{versionedParcel});
        } catch (IllegalAccessException e) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e);
        } catch (InvocationTargetException e2) {
            if (e2.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e2.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e2);
        } catch (NoSuchMethodException e3) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e3);
        } catch (ClassNotFoundException e4) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e4);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public <T extends C2003g> void mo8709a(T t, VersionedParcel versionedParcel) {
        try {
            m10399b(t.getClass()).invoke(null, new Object[]{t, versionedParcel});
        } catch (IllegalAccessException e) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e);
        } catch (InvocationTargetException e2) {
            if (e2.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e2.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e2);
        } catch (NoSuchMethodException e3) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e3);
        } catch (ClassNotFoundException e4) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e4);
        }
    }

    /* renamed from: a */
    private Class m10392a(Class<? extends C2003g> cls) throws ClassNotFoundException {
        Class cls2 = (Class) this.f7709c.get(cls.getName());
        if (cls2 != null) {
            return cls2;
        }
        Class cls3 = Class.forName(String.format("%s.%sParcelizer", new Object[]{cls.getPackage().getName(), cls.getSimpleName()}), false, cls.getClassLoader());
        this.f7709c.put(cls.getName(), cls3);
        return cls3;
    }
}
