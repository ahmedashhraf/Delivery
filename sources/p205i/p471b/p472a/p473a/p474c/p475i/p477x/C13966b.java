package p205i.p471b.p472a.p473a.p474c.p475i.p477x;

import java.util.ArrayList;
import java.util.List;
import p205i.p471b.p472a.p473a.p474c.p475i.C13940a;

/* renamed from: i.b.a.a.c.i.x.b */
/* compiled from: AnnotationNode */
public class C13966b extends C13940a {

    /* renamed from: c */
    public String f41051c;

    /* renamed from: d */
    public List<Object> f41052d;

    public C13966b(String str) {
        this(327680, str);
        if (getClass() != C13966b.class) {
            throw new IllegalStateException();
        }
    }

    /* renamed from: a */
    public void mo44053a() {
    }

    /* renamed from: a */
    public void mo44231a(int i) {
    }

    /* renamed from: a */
    public void mo44054a(String str, Object obj) {
        if (this.f41052d == null) {
            this.f41052d = new ArrayList(this.f41051c != null ? 2 : 1);
        }
        if (this.f41051c != null) {
            this.f41052d.add(str);
        }
        int i = 0;
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            ArrayList arrayList = new ArrayList(bArr.length);
            int length = bArr.length;
            while (i < length) {
                arrayList.add(Byte.valueOf(bArr[i]));
                i++;
            }
            this.f41052d.add(arrayList);
        } else if (obj instanceof boolean[]) {
            boolean[] zArr = (boolean[]) obj;
            ArrayList arrayList2 = new ArrayList(zArr.length);
            int length2 = zArr.length;
            while (i < length2) {
                arrayList2.add(Boolean.valueOf(zArr[i]));
                i++;
            }
            this.f41052d.add(arrayList2);
        } else if (obj instanceof short[]) {
            short[] sArr = (short[]) obj;
            ArrayList arrayList3 = new ArrayList(sArr.length);
            int length3 = sArr.length;
            while (i < length3) {
                arrayList3.add(Short.valueOf(sArr[i]));
                i++;
            }
            this.f41052d.add(arrayList3);
        } else if (obj instanceof char[]) {
            char[] cArr = (char[]) obj;
            ArrayList arrayList4 = new ArrayList(cArr.length);
            int length4 = cArr.length;
            while (i < length4) {
                arrayList4.add(Character.valueOf(cArr[i]));
                i++;
            }
            this.f41052d.add(arrayList4);
        } else if (obj instanceof int[]) {
            int[] iArr = (int[]) obj;
            ArrayList arrayList5 = new ArrayList(iArr.length);
            int length5 = iArr.length;
            while (i < length5) {
                arrayList5.add(Integer.valueOf(iArr[i]));
                i++;
            }
            this.f41052d.add(arrayList5);
        } else if (obj instanceof long[]) {
            long[] jArr = (long[]) obj;
            ArrayList arrayList6 = new ArrayList(jArr.length);
            int length6 = jArr.length;
            while (i < length6) {
                arrayList6.add(Long.valueOf(jArr[i]));
                i++;
            }
            this.f41052d.add(arrayList6);
        } else if (obj instanceof float[]) {
            float[] fArr = (float[]) obj;
            ArrayList arrayList7 = new ArrayList(fArr.length);
            int length7 = fArr.length;
            while (i < length7) {
                arrayList7.add(Float.valueOf(fArr[i]));
                i++;
            }
            this.f41052d.add(arrayList7);
        } else if (obj instanceof double[]) {
            double[] dArr = (double[]) obj;
            ArrayList arrayList8 = new ArrayList(dArr.length);
            int length8 = dArr.length;
            while (i < length8) {
                arrayList8.add(Double.valueOf(dArr[i]));
                i++;
            }
            this.f41052d.add(arrayList8);
        } else {
            this.f41052d.add(obj);
        }
    }

    public C13966b(int i, String str) {
        super(i);
        this.f41051c = str;
    }

    C13966b(List<Object> list) {
        super(327680);
        this.f41052d = list;
    }

    /* renamed from: a */
    public void mo44055a(String str, String str2, String str3) {
        if (this.f41052d == null) {
            this.f41052d = new ArrayList(this.f41051c != null ? 2 : 1);
        }
        if (this.f41051c != null) {
            this.f41052d.add(str);
        }
        this.f41052d.add(new String[]{str2, str3});
    }

    /* renamed from: a */
    public C13940a mo44052a(String str, String str2) {
        if (this.f41052d == null) {
            this.f41052d = new ArrayList(this.f41051c != null ? 2 : 1);
        }
        if (this.f41051c != null) {
            this.f41052d.add(str);
        }
        C13966b bVar = new C13966b(str2);
        this.f41052d.add(bVar);
        return bVar;
    }

    /* renamed from: a */
    public C13940a mo44051a(String str) {
        if (this.f41052d == null) {
            this.f41052d = new ArrayList(this.f41051c != null ? 2 : 1);
        }
        if (this.f41051c != null) {
            this.f41052d.add(str);
        }
        ArrayList arrayList = new ArrayList();
        this.f41052d.add(arrayList);
        return new C13966b((List<Object>) arrayList);
    }

    /* renamed from: a */
    public void mo44232a(C13940a aVar) {
        if (aVar != null) {
            if (this.f41052d != null) {
                for (int i = 0; i < this.f41052d.size(); i += 2) {
                    m60215a(aVar, (String) this.f41052d.get(i), this.f41052d.get(i + 1));
                }
            }
            aVar.mo44053a();
        }
    }

    /* renamed from: a */
    static void m60215a(C13940a aVar, String str, Object obj) {
        if (aVar != null) {
            if (obj instanceof String[]) {
                String[] strArr = (String[]) obj;
                aVar.mo44055a(str, strArr[0], strArr[1]);
            } else if (obj instanceof C13966b) {
                C13966b bVar = (C13966b) obj;
                bVar.mo44232a(aVar.mo44052a(str, bVar.f41051c));
            } else if (obj instanceof List) {
                C13940a a = aVar.mo44051a(str);
                if (a != null) {
                    List list = (List) obj;
                    for (int i = 0; i < list.size(); i++) {
                        m60215a(a, (String) null, list.get(i));
                    }
                    a.mo44053a();
                }
            } else {
                aVar.mo44054a(str, obj);
            }
        }
    }
}
