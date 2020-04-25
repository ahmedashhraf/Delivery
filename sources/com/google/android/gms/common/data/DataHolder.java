package com.google.android.gms.common.data;

import android.content.ContentValues;
import android.database.CharArrayBuffer;
import android.database.Cursor;
import android.database.CursorIndexOutOfBoundsException;
import android.database.CursorWindow;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.annotation.C4056a;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.internal.C4300a0;
import com.google.android.gms.common.internal.C4311d;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C4399a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4392a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4393b;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4394c;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4396e;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4398g;
import com.google.android.gms.common.p171p.C4436a;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

@C4392a(creator = "DataHolderCreator", validate = true)
@KeepName
@C4056a
/* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
public final class DataHolder extends AbstractSafeParcelable implements Closeable {
    @C4056a
    public static final Creator<DataHolder> CREATOR = new C4278o();

    /* renamed from: V */
    private static final C4262a f13242V = new C4277n(new String[0], null);

    /* renamed from: N */
    private Bundle f13243N;
    @C4394c(getter = "getWindows", mo18384id = 2)

    /* renamed from: O */
    private final CursorWindow[] f13244O;
    @C4394c(getter = "getStatusCode", mo18384id = 3)

    /* renamed from: P */
    private final int f13245P;
    @C4394c(getter = "getMetadata", mo18384id = 4)

    /* renamed from: Q */
    private final Bundle f13246Q;

    /* renamed from: R */
    private int[] f13247R;

    /* renamed from: S */
    private int f13248S;

    /* renamed from: T */
    private boolean f13249T;

    /* renamed from: U */
    private boolean f13250U;
    @C4398g(mo18390id = 1000)

    /* renamed from: a */
    private final int f13251a;
    @C4394c(getter = "getColumns", mo18384id = 1)

    /* renamed from: b */
    private final String[] f13252b;

    @C4056a
    /* renamed from: com.google.android.gms.common.data.DataHolder$a */
    /* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
    public static class C4262a {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public final String[] f13253a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public final ArrayList<HashMap<String, Object>> f13254b;

        /* renamed from: c */
        private final String f13255c;

        /* renamed from: d */
        private final HashMap<Object, Integer> f13256d;

        /* renamed from: e */
        private boolean f13257e;

        /* renamed from: f */
        private String f13258f;

        private C4262a(String[] strArr, String str) {
            this.f13253a = (String[]) C4300a0.m18620a(strArr);
            this.f13254b = new ArrayList<>();
            this.f13255c = str;
            this.f13256d = new HashMap<>();
            this.f13257e = false;
            this.f13258f = null;
        }

        /* JADX WARNING: Removed duplicated region for block: B:10:0x0031  */
        /* JADX WARNING: Removed duplicated region for block: B:11:0x0037  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public com.google.android.gms.common.data.DataHolder.C4262a mo18054a(java.util.HashMap<java.lang.String, java.lang.Object> r5) {
            /*
                r4 = this;
                com.google.android.gms.common.internal.C4311d.m18636a(r5)
                java.lang.String r0 = r4.f13255c
                r1 = -1
                if (r0 != 0) goto L_0x000a
            L_0x0008:
                r0 = -1
                goto L_0x002f
            L_0x000a:
                java.lang.Object r0 = r5.get(r0)
                if (r0 != 0) goto L_0x0011
                goto L_0x0008
            L_0x0011:
                java.util.HashMap<java.lang.Object, java.lang.Integer> r2 = r4.f13256d
                java.lang.Object r2 = r2.get(r0)
                java.lang.Integer r2 = (java.lang.Integer) r2
                if (r2 != 0) goto L_0x002b
                java.util.HashMap<java.lang.Object, java.lang.Integer> r2 = r4.f13256d
                java.util.ArrayList<java.util.HashMap<java.lang.String, java.lang.Object>> r3 = r4.f13254b
                int r3 = r3.size()
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                r2.put(r0, r3)
                goto L_0x0008
            L_0x002b:
                int r0 = r2.intValue()
            L_0x002f:
                if (r0 != r1) goto L_0x0037
                java.util.ArrayList<java.util.HashMap<java.lang.String, java.lang.Object>> r0 = r4.f13254b
                r0.add(r5)
                goto L_0x0041
            L_0x0037:
                java.util.ArrayList<java.util.HashMap<java.lang.String, java.lang.Object>> r1 = r4.f13254b
                r1.remove(r0)
                java.util.ArrayList<java.util.HashMap<java.lang.String, java.lang.Object>> r1 = r4.f13254b
                r1.add(r0, r5)
            L_0x0041:
                r5 = 0
                r4.f13257e = r5
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.data.DataHolder.C4262a.mo18054a(java.util.HashMap):com.google.android.gms.common.data.DataHolder$a");
        }

        /* synthetic */ C4262a(String[] strArr, String str, C4277n nVar) {
            this(strArr, null);
        }

        @C4056a
        /* renamed from: a */
        public C4262a mo18053a(ContentValues contentValues) {
            C4311d.m18636a((Object) contentValues);
            HashMap hashMap = new HashMap(contentValues.size());
            for (Entry entry : contentValues.valueSet()) {
                hashMap.put((String) entry.getKey(), entry.getValue());
            }
            return mo18054a(hashMap);
        }

        @C4056a
        /* renamed from: a */
        public DataHolder mo18055a(int i) {
            return new DataHolder(this, i, (Bundle) null, (C4277n) null);
        }

        @C4056a
        /* renamed from: a */
        public DataHolder mo18056a(int i, Bundle bundle) {
            DataHolder dataHolder = new DataHolder(this, i, bundle, -1, (C4277n) null);
            return dataHolder;
        }
    }

    /* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
    public static class zaa extends RuntimeException {
        public zaa(String str) {
            super(str);
        }
    }

    @C4393b
    DataHolder(@C4396e(mo18387id = 1000) int i, @C4396e(mo18387id = 1) String[] strArr, @C4396e(mo18387id = 2) CursorWindow[] cursorWindowArr, @C4396e(mo18387id = 3) int i2, @C4396e(mo18387id = 4) Bundle bundle) {
        this.f13249T = false;
        this.f13250U = true;
        this.f13251a = i;
        this.f13252b = strArr;
        this.f13244O = cursorWindowArr;
        this.f13245P = i2;
        this.f13246Q = bundle;
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    private static CursorWindow[] m18400a(C4436a aVar) {
        int i;
        ArrayList arrayList = new ArrayList();
        try {
            int count = aVar.getCount();
            CursorWindow window = aVar.getWindow();
            if (window == null || window.getStartPosition() != 0) {
                i = 0;
            } else {
                window.acquireReference();
                aVar.mo18439a(null);
                arrayList.add(window);
                i = window.getNumRows();
            }
            while (i < count && aVar.moveToPosition(i)) {
                CursorWindow window2 = aVar.getWindow();
                if (window2 != null) {
                    window2.acquireReference();
                    aVar.mo18439a(null);
                } else {
                    window2 = new CursorWindow(false);
                    window2.setStartPosition(i);
                    aVar.fillWindow(i, window2);
                }
                if (window2.getNumRows() == 0) {
                    break;
                }
                arrayList.add(window2);
                i = window2.getStartPosition() + window2.getNumRows();
            }
            aVar.close();
            return (CursorWindow[]) arrayList.toArray(new CursorWindow[arrayList.size()]);
        } catch (Throwable th) {
            aVar.close();
            throw th;
        }
    }

    @C4056a
    /* renamed from: N */
    public final int mo18034N() {
        return this.f13245P;
    }

    /* renamed from: O */
    public final void mo18035O() {
        this.f13243N = new Bundle();
        int i = 0;
        int i2 = 0;
        while (true) {
            String[] strArr = this.f13252b;
            if (i2 >= strArr.length) {
                break;
            }
            this.f13243N.putInt(strArr[i2], i2);
            i2++;
        }
        this.f13247R = new int[this.f13244O.length];
        int i3 = 0;
        while (true) {
            CursorWindow[] cursorWindowArr = this.f13244O;
            if (i < cursorWindowArr.length) {
                this.f13247R[i] = i3;
                i3 += this.f13244O[i].getNumRows() - (i3 - cursorWindowArr[i].getStartPosition());
                i++;
            } else {
                this.f13248S = i3;
                return;
            }
        }
    }

    @C4056a
    /* renamed from: b */
    public final boolean mo18037b(String str, int i, int i2) {
        m18398a(str, i);
        return Long.valueOf(this.f13244O[i2].getLong(i, this.f13243N.getInt(str))).longValue() == 1;
    }

    @C4056a
    /* renamed from: c */
    public final boolean mo18038c(String str) {
        return this.f13243N.containsKey(str);
    }

    @C4056a
    public final void close() {
        synchronized (this) {
            if (!this.f13249T) {
                this.f13249T = true;
                for (CursorWindow close : this.f13244O) {
                    close.close();
                }
            }
        }
    }

    @C4056a
    /* renamed from: d */
    public final int mo18041d(String str, int i, int i2) {
        m18398a(str, i);
        return this.f13244O[i2].getInt(i, this.f13243N.getInt(str));
    }

    @C4056a
    /* renamed from: e */
    public final long mo18042e(String str, int i, int i2) {
        m18398a(str, i);
        return this.f13244O[i2].getLong(i, this.f13243N.getInt(str));
    }

    @C4056a
    /* renamed from: f */
    public final String mo18043f(String str, int i, int i2) {
        m18398a(str, i);
        return this.f13244O[i2].getString(i, this.f13243N.getInt(str));
    }

    /* access modifiers changed from: protected */
    public final void finalize() throws Throwable {
        try {
            if (this.f13250U && this.f13244O.length > 0 && !isClosed()) {
                close();
                String obj = toString();
                StringBuilder sb = new StringBuilder(String.valueOf(obj).length() + 178);
                sb.append("Internal data leak within a DataBuffer object detected!  Be sure to explicitly call release() on all DataBuffer extending objects when you are done with them. (internal object: ");
                sb.append(obj);
                sb.append(")");
                sb.toString();
            }
        } finally {
            super.finalize();
        }
    }

    @C4056a
    /* renamed from: g */
    public final boolean mo18046g(String str, int i, int i2) {
        m18398a(str, i);
        return this.f13244O[i2].isNull(i, this.f13243N.getInt(str));
    }

    @C4056a
    public final int getCount() {
        return this.f13248S;
    }

    /* renamed from: h */
    public final float mo18048h(String str, int i, int i2) {
        m18398a(str, i);
        return this.f13244O[i2].getFloat(i, this.f13243N.getInt(str));
    }

    /* renamed from: i */
    public final double mo18049i(String str, int i, int i2) {
        m18398a(str, i);
        return this.f13244O[i2].getDouble(i, this.f13243N.getInt(str));
    }

    @C4056a
    public final boolean isClosed() {
        boolean z;
        synchronized (this) {
            z = this.f13249T;
        }
        return z;
    }

    @C4056a
    /* renamed from: j */
    public final Bundle mo18051j() {
        return this.f13246Q;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C4399a.m18958a(parcel);
        C4399a.m18994a(parcel, 1, this.f13252b, false);
        C4399a.m18993a(parcel, 2, (T[]) this.f13244O, i, false);
        C4399a.m18964a(parcel, 3, mo18034N());
        C4399a.m18966a(parcel, 4, mo18051j(), false);
        C4399a.m18964a(parcel, 1000, this.f13251a);
        C4399a.m18959a(parcel, a);
        if ((i & 1) != 0) {
            close();
        }
    }

    @C4056a
    /* renamed from: c */
    public final byte[] mo18039c(String str, int i, int i2) {
        m18398a(str, i);
        return this.f13244O[i2].getBlob(i, this.f13243N.getInt(str));
    }

    @C4056a
    /* renamed from: h */
    public static DataHolder m18401h(int i) {
        return new DataHolder(f13242V, i, (Bundle) null);
    }

    @C4056a
    /* renamed from: g */
    public final int mo18045g(int i) {
        int i2 = 0;
        C4300a0.m18631b(i >= 0 && i < this.f13248S);
        while (true) {
            int[] iArr = this.f13247R;
            if (i2 >= iArr.length) {
                break;
            } else if (i < iArr[i2]) {
                i2--;
                break;
            } else {
                i2++;
            }
        }
        return i2 == this.f13247R.length ? i2 - 1 : i2;
    }

    @C4056a
    public DataHolder(String[] strArr, CursorWindow[] cursorWindowArr, int i, Bundle bundle) {
        this.f13249T = false;
        this.f13250U = true;
        this.f13251a = 1;
        this.f13252b = (String[]) C4300a0.m18620a(strArr);
        this.f13244O = (CursorWindow[]) C4300a0.m18620a(cursorWindowArr);
        this.f13245P = i;
        this.f13246Q = bundle;
        mo18035O();
    }

    private DataHolder(C4436a aVar, int i, Bundle bundle) {
        this(aVar.getColumnNames(), m18400a(aVar), i, bundle);
    }

    @C4056a
    public DataHolder(Cursor cursor, int i, Bundle bundle) {
        this(new C4436a(cursor), i, bundle);
    }

    private DataHolder(C4262a aVar, int i, Bundle bundle) {
        this(aVar.f13253a, m18399a(aVar, -1), i, (Bundle) null);
    }

    private DataHolder(C4262a aVar, int i, Bundle bundle, int i2) {
        this(aVar.f13253a, m18399a(aVar, -1), i, bundle);
    }

    /* synthetic */ DataHolder(C4262a aVar, int i, Bundle bundle, C4277n nVar) {
        this(aVar, i, (Bundle) null);
    }

    /* renamed from: a */
    private static CursorWindow[] m18399a(C4262a aVar, int i) {
        List list;
        if (aVar.f13253a.length == 0) {
            return new CursorWindow[0];
        }
        if (i < 0 || i >= aVar.f13254b.size()) {
            list = aVar.f13254b;
        } else {
            list = aVar.f13254b.subList(0, i);
        }
        int size = list.size();
        CursorWindow cursorWindow = new CursorWindow(false);
        ArrayList arrayList = new ArrayList();
        arrayList.add(cursorWindow);
        cursorWindow.setNumColumns(aVar.f13253a.length);
        CursorWindow cursorWindow2 = cursorWindow;
        int i2 = 0;
        boolean z = false;
        while (i2 < size) {
            try {
                if (!cursorWindow2.allocRow()) {
                    StringBuilder sb = new StringBuilder(72);
                    sb.append("Allocating additional cursor window for large data set (row ");
                    sb.append(i2);
                    sb.append(")");
                    sb.toString();
                    cursorWindow2 = new CursorWindow(false);
                    cursorWindow2.setStartPosition(i2);
                    cursorWindow2.setNumColumns(aVar.f13253a.length);
                    arrayList.add(cursorWindow2);
                    if (!cursorWindow2.allocRow()) {
                        arrayList.remove(cursorWindow2);
                        return (CursorWindow[]) arrayList.toArray(new CursorWindow[arrayList.size()]);
                    }
                }
                Map map = (Map) list.get(i2);
                boolean z2 = true;
                for (int i3 = 0; i3 < aVar.f13253a.length && z2; i3++) {
                    String str = aVar.f13253a[i3];
                    Object obj = map.get(str);
                    if (obj == null) {
                        z2 = cursorWindow2.putNull(i2, i3);
                    } else if (obj instanceof String) {
                        z2 = cursorWindow2.putString((String) obj, i2, i3);
                    } else if (obj instanceof Long) {
                        z2 = cursorWindow2.putLong(((Long) obj).longValue(), i2, i3);
                    } else if (obj instanceof Integer) {
                        z2 = cursorWindow2.putLong((long) ((Integer) obj).intValue(), i2, i3);
                    } else if (obj instanceof Boolean) {
                        z2 = cursorWindow2.putLong(((Boolean) obj).booleanValue() ? 1 : 0, i2, i3);
                    } else if (obj instanceof byte[]) {
                        z2 = cursorWindow2.putBlob((byte[]) obj, i2, i3);
                    } else if (obj instanceof Double) {
                        z2 = cursorWindow2.putDouble(((Double) obj).doubleValue(), i2, i3);
                    } else if (obj instanceof Float) {
                        z2 = cursorWindow2.putDouble((double) ((Float) obj).floatValue(), i2, i3);
                    } else {
                        String valueOf = String.valueOf(obj);
                        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 32 + String.valueOf(valueOf).length());
                        sb2.append("Unsupported object for column ");
                        sb2.append(str);
                        sb2.append(": ");
                        sb2.append(valueOf);
                        throw new IllegalArgumentException(sb2.toString());
                    }
                }
                if (z2) {
                    z = false;
                } else if (!z) {
                    StringBuilder sb3 = new StringBuilder(74);
                    sb3.append("Couldn't populate window data for row ");
                    sb3.append(i2);
                    sb3.append(" - allocating new window.");
                    sb3.toString();
                    cursorWindow2.freeLastRow();
                    cursorWindow2 = new CursorWindow(false);
                    cursorWindow2.setStartPosition(i2);
                    cursorWindow2.setNumColumns(aVar.f13253a.length);
                    arrayList.add(cursorWindow2);
                    i2--;
                    z = true;
                } else {
                    throw new zaa("Could not add the value to a new CursorWindow. The size of value may be larger than what a CursorWindow can handle.");
                }
                i2++;
            } catch (RuntimeException e) {
                int size2 = arrayList.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    ((CursorWindow) arrayList.get(i4)).close();
                }
                throw e;
            }
        }
        return (CursorWindow[]) arrayList.toArray(new CursorWindow[arrayList.size()]);
    }

    /* synthetic */ DataHolder(C4262a aVar, int i, Bundle bundle, int i2, C4277n nVar) {
        this(aVar, i, bundle, -1);
    }

    /* renamed from: a */
    private final void m18398a(String str, int i) {
        Bundle bundle = this.f13243N;
        if (bundle == null || !bundle.containsKey(str)) {
            String str2 = "No such column: ";
            String valueOf = String.valueOf(str);
            throw new IllegalArgumentException(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
        } else if (isClosed()) {
            throw new IllegalArgumentException("Buffer is closed.");
        } else if (i < 0 || i >= this.f13248S) {
            throw new CursorIndexOutOfBoundsException(i, this.f13248S);
        }
    }

    /* renamed from: a */
    public final void mo18036a(String str, int i, int i2, CharArrayBuffer charArrayBuffer) {
        m18398a(str, i);
        this.f13244O[i2].copyStringToBuffer(i, this.f13243N.getInt(str), charArrayBuffer);
    }

    @C4056a
    /* renamed from: a */
    public static C4262a m18397a(String[] strArr) {
        return new C4262a(strArr, null, null);
    }
}
