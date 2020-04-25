package p470h;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: h.q */
/* compiled from: Options */
public final class C13911q extends AbstractList<C13896f> implements RandomAccess {

    /* renamed from: a */
    final C13896f[] f40393a;

    /* renamed from: b */
    final int[] f40394b;

    private C13911q(C13896f[] fVarArr, int[] iArr) {
        this.f40393a = fVarArr;
        this.f40394b = iArr;
    }

    /* renamed from: a */
    public static C13911q m59757a(C13896f... fVarArr) {
        if (fVarArr.length == 0) {
            return new C13911q(new C13896f[0], new int[]{0, -1});
        }
        ArrayList arrayList = new ArrayList(Arrays.asList(fVarArr));
        Collections.sort(arrayList);
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < arrayList.size(); i++) {
            arrayList2.add(Integer.valueOf(-1));
        }
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            arrayList2.set(Collections.binarySearch(arrayList, fVarArr[i2]), Integer.valueOf(i2));
        }
        if (((C13896f) arrayList.get(0)).mo43985r() != 0) {
            int i3 = 0;
            while (i3 < arrayList.size()) {
                C13896f fVar = (C13896f) arrayList.get(i3);
                int i4 = i3 + 1;
                int i5 = i4;
                while (i5 < arrayList.size()) {
                    C13896f fVar2 = (C13896f) arrayList.get(i5);
                    if (!fVar2.mo43978h(fVar)) {
                        continue;
                        break;
                    } else if (fVar2.mo43985r() == fVar.mo43985r()) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("duplicate option: ");
                        sb.append(fVar2);
                        throw new IllegalArgumentException(sb.toString());
                    } else if (((Integer) arrayList2.get(i5)).intValue() > ((Integer) arrayList2.get(i3)).intValue()) {
                        arrayList.remove(i5);
                        arrayList2.remove(i5);
                    } else {
                        i5++;
                    }
                }
                i3 = i4;
            }
            C13887c cVar = new C13887c();
            m59758a(0, cVar, 0, arrayList, 0, arrayList.size(), arrayList2);
            int[] iArr = new int[m59756a(cVar)];
            for (int i6 = 0; i6 < iArr.length; i6++) {
                iArr[i6] = cVar.readInt();
            }
            if (cVar.mo43904p()) {
                return new C13911q((C13896f[]) fVarArr.clone(), iArr);
            }
            throw new AssertionError();
        }
        throw new IllegalArgumentException("the empty byte string is not a supported option");
    }

    public final int size() {
        return this.f40393a.length;
    }

    public C13896f get(int i) {
        return this.f40393a[i];
    }

    /* renamed from: a */
    private static void m59758a(long j, C13887c cVar, int i, List<C13896f> list, int i2, int i3, List<Integer> list2) {
        int i4;
        int i5;
        C13887c cVar2;
        int i6;
        C13887c cVar3 = cVar;
        int i7 = i;
        List<C13896f> list3 = list;
        int i8 = i2;
        int i9 = i3;
        List<Integer> list4 = list2;
        if (i8 < i9) {
            int i10 = i8;
            while (i10 < i9) {
                if (((C13896f) list3.get(i10)).mo43985r() >= i7) {
                    i10++;
                } else {
                    throw new AssertionError();
                }
            }
            C13896f fVar = (C13896f) list.get(i2);
            C13896f fVar2 = (C13896f) list3.get(i9 - 1);
            int i11 = -1;
            if (i7 == fVar.mo43985r()) {
                i11 = ((Integer) list4.get(i8)).intValue();
                i8++;
                fVar = (C13896f) list3.get(i8);
            }
            int i12 = i8;
            if (fVar.mo43949a(i7) != fVar2.mo43949a(i7)) {
                int i13 = 1;
                for (int i14 = i12 + 1; i14 < i9; i14++) {
                    if (((C13896f) list3.get(i14 - 1)).mo43949a(i7) != ((C13896f) list3.get(i14)).mo43949a(i7)) {
                        i13++;
                    }
                }
                long a = j + ((long) m59756a(cVar)) + 2 + ((long) (i13 * 2));
                cVar3.writeInt(i13);
                cVar3.writeInt(i11);
                for (int i15 = i12; i15 < i9; i15++) {
                    byte a2 = ((C13896f) list3.get(i15)).mo43949a(i7);
                    if (i15 == i12 || a2 != ((C13896f) list3.get(i15 - 1)).mo43949a(i7)) {
                        cVar3.writeInt((int) a2 & 255);
                    }
                }
                C13887c cVar4 = new C13887c();
                int i16 = i12;
                while (i16 < i9) {
                    byte a3 = ((C13896f) list3.get(i16)).mo43949a(i7);
                    int i17 = i16 + 1;
                    int i18 = i17;
                    while (true) {
                        if (i18 >= i9) {
                            i5 = i9;
                            break;
                        } else if (a3 != ((C13896f) list3.get(i18)).mo43949a(i7)) {
                            i5 = i18;
                            break;
                        } else {
                            i18++;
                        }
                    }
                    if (i17 == i5 && i7 + 1 == ((C13896f) list3.get(i16)).mo43985r()) {
                        cVar3.writeInt(((Integer) list4.get(i16)).intValue());
                        i6 = i5;
                        cVar2 = cVar4;
                    } else {
                        cVar3.writeInt((int) ((((long) m59756a(cVar4)) + a) * -1));
                        i6 = i5;
                        cVar2 = cVar4;
                        m59758a(a, cVar4, i7 + 1, list, i16, i5, list2);
                    }
                    cVar4 = cVar2;
                    i16 = i6;
                }
                C13887c cVar5 = cVar4;
                cVar3.mo43815b(cVar5, cVar5.size());
                return;
            }
            int min = Math.min(fVar.mo43985r(), fVar2.mo43985r());
            int i19 = i7;
            int i20 = 0;
            while (i19 < min && fVar.mo43949a(i19) == fVar2.mo43949a(i19)) {
                i20++;
                i19++;
            }
            long a4 = 1 + j + ((long) m59756a(cVar)) + 2 + ((long) i20);
            cVar3.writeInt(-i20);
            cVar3.writeInt(i11);
            int i21 = i7;
            while (true) {
                i4 = i7 + i20;
                if (i21 >= i4) {
                    break;
                }
                cVar3.writeInt((int) fVar.mo43949a(i21) & 255);
                i21++;
            }
            if (i12 + 1 != i9) {
                C13887c cVar6 = new C13887c();
                cVar3.writeInt((int) ((((long) m59756a(cVar6)) + a4) * -1));
                m59758a(a4, cVar6, i4, list, i12, i3, list2);
                cVar3.mo43815b(cVar6, cVar6.size());
            } else if (i4 == ((C13896f) list3.get(i12)).mo43985r()) {
                cVar3.writeInt(((Integer) list4.get(i12)).intValue());
            } else {
                throw new AssertionError();
            }
        } else {
            throw new AssertionError();
        }
    }

    /* renamed from: a */
    private static int m59756a(C13887c cVar) {
        return (int) (cVar.size() / 4);
    }
}
