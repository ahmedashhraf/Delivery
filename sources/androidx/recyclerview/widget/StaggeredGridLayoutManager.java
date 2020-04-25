package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.accessibility.AccessibilityEvent;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import androidx.annotation.C0207n0;
import androidx.annotation.C0207n0.C0208a;
import androidx.core.p034l.p035o0.C1016d;
import androidx.core.p034l.p035o0.C1016d.C1019c;
import androidx.recyclerview.widget.RecyclerView.C1627a0;
import androidx.recyclerview.widget.RecyclerView.C1627a0.C1629b;
import androidx.recyclerview.widget.RecyclerView.C1651o;
import androidx.recyclerview.widget.RecyclerView.C1651o.C1654c;
import androidx.recyclerview.widget.RecyclerView.C1651o.C1655d;
import androidx.recyclerview.widget.RecyclerView.C1656p;
import androidx.recyclerview.widget.RecyclerView.C1664w;
import androidx.recyclerview.widget.RecyclerView.State;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.List;

public class StaggeredGridLayoutManager extends C1651o implements C1629b {

    /* renamed from: Q */
    private static final String f6370Q = "StaggeredGridLManager";

    /* renamed from: R */
    static final boolean f6371R = false;

    /* renamed from: S */
    public static final int f6372S = 0;

    /* renamed from: T */
    public static final int f6373T = 1;

    /* renamed from: U */
    public static final int f6374U = 0;
    @Deprecated

    /* renamed from: V */
    public static final int f6375V = 1;

    /* renamed from: W */
    public static final int f6376W = 2;

    /* renamed from: X */
    static final int f6377X = Integer.MIN_VALUE;

    /* renamed from: Y */
    private static final float f6378Y = 0.33333334f;

    /* renamed from: A */
    boolean f6379A = false;

    /* renamed from: B */
    private BitSet f6380B;

    /* renamed from: C */
    int f6381C = -1;

    /* renamed from: D */
    int f6382D = Integer.MIN_VALUE;

    /* renamed from: E */
    LazySpanLookup f6383E = new LazySpanLookup();

    /* renamed from: F */
    private int f6384F = 2;

    /* renamed from: G */
    private boolean f6385G;

    /* renamed from: H */
    private boolean f6386H;

    /* renamed from: I */
    private SavedState f6387I;

    /* renamed from: J */
    private int f6388J;

    /* renamed from: K */
    private final Rect f6389K = new Rect();

    /* renamed from: L */
    private final C1671b f6390L = new C1671b();

    /* renamed from: M */
    private boolean f6391M = false;

    /* renamed from: N */
    private boolean f6392N = true;

    /* renamed from: O */
    private int[] f6393O;

    /* renamed from: P */
    private final Runnable f6394P = new C1670a();

    /* renamed from: s */
    private int f6395s = -1;

    /* renamed from: t */
    C1673d[] f6396t;
    @C0193h0

    /* renamed from: u */
    C1775w f6397u;
    @C0193h0

    /* renamed from: v */
    C1775w f6398v;

    /* renamed from: w */
    private int f6399w;

    /* renamed from: x */
    private int f6400x;
    @C0193h0

    /* renamed from: y */
    private final C1760p f6401y;

    /* renamed from: z */
    boolean f6402z = false;

    static class LazySpanLookup {

        /* renamed from: c */
        private static final int f6403c = 10;

        /* renamed from: a */
        int[] f6404a;

        /* renamed from: b */
        List<FullSpanItem> f6405b;

        @SuppressLint({"BanParcelableUsage"})
        static class FullSpanItem implements Parcelable {
            public static final Creator<FullSpanItem> CREATOR = new C1668a();

            /* renamed from: N */
            int[] f6406N;

            /* renamed from: O */
            boolean f6407O;

            /* renamed from: a */
            int f6408a;

            /* renamed from: b */
            int f6409b;

            /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem$a */
            static class C1668a implements Creator<FullSpanItem> {
                C1668a() {
                }

                public FullSpanItem createFromParcel(Parcel parcel) {
                    return new FullSpanItem(parcel);
                }

                public FullSpanItem[] newArray(int i) {
                    return new FullSpanItem[i];
                }
            }

            FullSpanItem(Parcel parcel) {
                this.f6408a = parcel.readInt();
                this.f6409b = parcel.readInt();
                boolean z = true;
                if (parcel.readInt() != 1) {
                    z = false;
                }
                this.f6407O = z;
                int readInt = parcel.readInt();
                if (readInt > 0) {
                    this.f6406N = new int[readInt];
                    parcel.readIntArray(this.f6406N);
                }
            }

            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public int mo7626a(int i) {
                int[] iArr = this.f6406N;
                if (iArr == null) {
                    return 0;
                }
                return iArr[i];
            }

            public int describeContents() {
                return 0;
            }

            public String toString() {
                StringBuilder sb = new StringBuilder();
                sb.append("FullSpanItem{mPosition=");
                sb.append(this.f6408a);
                sb.append(", mGapDir=");
                sb.append(this.f6409b);
                sb.append(", mHasUnwantedGapAfter=");
                sb.append(this.f6407O);
                sb.append(", mGapPerSpan=");
                sb.append(Arrays.toString(this.f6406N));
                sb.append('}');
                return sb.toString();
            }

            public void writeToParcel(Parcel parcel, int i) {
                parcel.writeInt(this.f6408a);
                parcel.writeInt(this.f6409b);
                parcel.writeInt(this.f6407O ? 1 : 0);
                int[] iArr = this.f6406N;
                if (iArr == null || iArr.length <= 0) {
                    parcel.writeInt(0);
                    return;
                }
                parcel.writeInt(iArr.length);
                parcel.writeIntArray(this.f6406N);
            }

            FullSpanItem() {
            }
        }

        LazySpanLookup() {
        }

        /* renamed from: c */
        private void m8972c(int i, int i2) {
            List<FullSpanItem> list = this.f6405b;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    FullSpanItem fullSpanItem = (FullSpanItem) this.f6405b.get(size);
                    int i3 = fullSpanItem.f6408a;
                    if (i3 >= i) {
                        fullSpanItem.f6408a = i3 + i2;
                    }
                }
            }
        }

        /* renamed from: g */
        private int m8974g(int i) {
            if (this.f6405b == null) {
                return -1;
            }
            FullSpanItem c = mo7622c(i);
            if (c != null) {
                this.f6405b.remove(c);
            }
            int size = this.f6405b.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    i2 = -1;
                    break;
                } else if (((FullSpanItem) this.f6405b.get(i2)).f6408a >= i) {
                    break;
                } else {
                    i2++;
                }
            }
            if (i2 == -1) {
                return -1;
            }
            FullSpanItem fullSpanItem = (FullSpanItem) this.f6405b.get(i2);
            this.f6405b.remove(i2);
            return fullSpanItem.f6408a;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo7618a(int i, C1673d dVar) {
            mo7616a(i);
            this.f6404a[i] = dVar.f6426e;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public int mo7620b(int i) {
            List<FullSpanItem> list = this.f6405b;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    if (((FullSpanItem) this.f6405b.get(size)).f6408a >= i) {
                        this.f6405b.remove(size);
                    }
                }
            }
            return mo7624e(i);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: d */
        public int mo7623d(int i) {
            int[] iArr = this.f6404a;
            if (iArr == null || i >= iArr.length) {
                return -1;
            }
            return iArr[i];
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: e */
        public int mo7624e(int i) {
            int[] iArr = this.f6404a;
            if (iArr == null || i >= iArr.length) {
                return -1;
            }
            int g = m8974g(i);
            if (g == -1) {
                int[] iArr2 = this.f6404a;
                Arrays.fill(iArr2, i, iArr2.length, -1);
                return this.f6404a.length;
            }
            int i2 = g + 1;
            Arrays.fill(this.f6404a, i, i2, -1);
            return i2;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: f */
        public int mo7625f(int i) {
            int length = this.f6404a.length;
            while (length <= i) {
                length *= 2;
            }
            return length;
        }

        /* renamed from: d */
        private void m8973d(int i, int i2) {
            List<FullSpanItem> list = this.f6405b;
            if (list != null) {
                int i3 = i + i2;
                for (int size = list.size() - 1; size >= 0; size--) {
                    FullSpanItem fullSpanItem = (FullSpanItem) this.f6405b.get(size);
                    int i4 = fullSpanItem.f6408a;
                    if (i4 >= i) {
                        if (i4 < i3) {
                            this.f6405b.remove(size);
                        } else {
                            fullSpanItem.f6408a = i4 - i2;
                        }
                    }
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo7616a(int i) {
            int[] iArr = this.f6404a;
            if (iArr == null) {
                this.f6404a = new int[(Math.max(i, 10) + 1)];
                Arrays.fill(this.f6404a, -1);
            } else if (i >= iArr.length) {
                this.f6404a = new int[mo7625f(i)];
                System.arraycopy(iArr, 0, this.f6404a, 0, iArr.length);
                int[] iArr2 = this.f6404a;
                Arrays.fill(iArr2, iArr.length, iArr2.length, -1);
            }
        }

        /* renamed from: c */
        public FullSpanItem mo7622c(int i) {
            List<FullSpanItem> list = this.f6405b;
            if (list == null) {
                return null;
            }
            for (int size = list.size() - 1; size >= 0; size--) {
                FullSpanItem fullSpanItem = (FullSpanItem) this.f6405b.get(size);
                if (fullSpanItem.f6408a == i) {
                    return fullSpanItem;
                }
            }
            return null;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo7621b(int i, int i2) {
            int[] iArr = this.f6404a;
            if (iArr != null && i < iArr.length) {
                int i3 = i + i2;
                mo7616a(i3);
                int[] iArr2 = this.f6404a;
                System.arraycopy(iArr2, i3, iArr2, i, (iArr2.length - i) - i2);
                int[] iArr3 = this.f6404a;
                Arrays.fill(iArr3, iArr3.length - i2, iArr3.length, -1);
                m8973d(i, i2);
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo7615a() {
            int[] iArr = this.f6404a;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            this.f6405b = null;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo7617a(int i, int i2) {
            int[] iArr = this.f6404a;
            if (iArr != null && i < iArr.length) {
                int i3 = i + i2;
                mo7616a(i3);
                int[] iArr2 = this.f6404a;
                System.arraycopy(iArr2, i, iArr2, i3, (iArr2.length - i) - i2);
                Arrays.fill(this.f6404a, i, i3, -1);
                m8972c(i, i2);
            }
        }

        /* renamed from: a */
        public void mo7619a(FullSpanItem fullSpanItem) {
            if (this.f6405b == null) {
                this.f6405b = new ArrayList();
            }
            int size = this.f6405b.size();
            for (int i = 0; i < size; i++) {
                FullSpanItem fullSpanItem2 = (FullSpanItem) this.f6405b.get(i);
                if (fullSpanItem2.f6408a == fullSpanItem.f6408a) {
                    this.f6405b.remove(i);
                }
                if (fullSpanItem2.f6408a >= fullSpanItem.f6408a) {
                    this.f6405b.add(i, fullSpanItem);
                    return;
                }
            }
            this.f6405b.add(fullSpanItem);
        }

        /* renamed from: a */
        public FullSpanItem mo7614a(int i, int i2, int i3, boolean z) {
            List<FullSpanItem> list = this.f6405b;
            if (list == null) {
                return null;
            }
            int size = list.size();
            for (int i4 = 0; i4 < size; i4++) {
                FullSpanItem fullSpanItem = (FullSpanItem) this.f6405b.get(i4);
                int i5 = fullSpanItem.f6408a;
                if (i5 >= i2) {
                    return null;
                }
                if (i5 >= i && (i3 == 0 || fullSpanItem.f6409b == i3 || (z && fullSpanItem.f6407O))) {
                    return fullSpanItem;
                }
            }
            return null;
        }
    }

    @SuppressLint({"BanParcelableUsage"})
    @C0207n0({C0208a.LIBRARY})
    public static class SavedState implements Parcelable {
        public static final Creator<SavedState> CREATOR = new C1669a();
        boolean mAnchorLayoutFromEnd;
        int mAnchorPosition;
        List<FullSpanItem> mFullSpanItems;
        boolean mLastLayoutRTL;
        boolean mReverseLayout;
        int[] mSpanLookup;
        int mSpanLookupSize;
        int[] mSpanOffsets;
        int mSpanOffsetsSize;
        int mVisibleAnchorPosition;

        /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$SavedState$a */
        static class C1669a implements Creator<SavedState> {
            C1669a() {
            }

            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        public SavedState() {
        }

        public int describeContents() {
            return 0;
        }

        /* access modifiers changed from: 0000 */
        public void invalidateAnchorPositionInfo() {
            this.mSpanOffsets = null;
            this.mSpanOffsetsSize = 0;
            this.mAnchorPosition = -1;
            this.mVisibleAnchorPosition = -1;
        }

        /* access modifiers changed from: 0000 */
        public void invalidateSpanInfo() {
            this.mSpanOffsets = null;
            this.mSpanOffsetsSize = 0;
            this.mSpanLookupSize = 0;
            this.mSpanLookup = null;
            this.mFullSpanItems = null;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.mAnchorPosition);
            parcel.writeInt(this.mVisibleAnchorPosition);
            parcel.writeInt(this.mSpanOffsetsSize);
            if (this.mSpanOffsetsSize > 0) {
                parcel.writeIntArray(this.mSpanOffsets);
            }
            parcel.writeInt(this.mSpanLookupSize);
            if (this.mSpanLookupSize > 0) {
                parcel.writeIntArray(this.mSpanLookup);
            }
            parcel.writeInt(this.mReverseLayout ? 1 : 0);
            parcel.writeInt(this.mAnchorLayoutFromEnd ? 1 : 0);
            parcel.writeInt(this.mLastLayoutRTL ? 1 : 0);
            parcel.writeList(this.mFullSpanItems);
        }

        SavedState(Parcel parcel) {
            this.mAnchorPosition = parcel.readInt();
            this.mVisibleAnchorPosition = parcel.readInt();
            this.mSpanOffsetsSize = parcel.readInt();
            int i = this.mSpanOffsetsSize;
            if (i > 0) {
                this.mSpanOffsets = new int[i];
                parcel.readIntArray(this.mSpanOffsets);
            }
            this.mSpanLookupSize = parcel.readInt();
            int i2 = this.mSpanLookupSize;
            if (i2 > 0) {
                this.mSpanLookup = new int[i2];
                parcel.readIntArray(this.mSpanLookup);
            }
            boolean z = false;
            this.mReverseLayout = parcel.readInt() == 1;
            this.mAnchorLayoutFromEnd = parcel.readInt() == 1;
            if (parcel.readInt() == 1) {
                z = true;
            }
            this.mLastLayoutRTL = z;
            this.mFullSpanItems = parcel.readArrayList(FullSpanItem.class.getClassLoader());
        }

        public SavedState(SavedState savedState) {
            this.mSpanOffsetsSize = savedState.mSpanOffsetsSize;
            this.mAnchorPosition = savedState.mAnchorPosition;
            this.mVisibleAnchorPosition = savedState.mVisibleAnchorPosition;
            this.mSpanOffsets = savedState.mSpanOffsets;
            this.mSpanLookupSize = savedState.mSpanLookupSize;
            this.mSpanLookup = savedState.mSpanLookup;
            this.mReverseLayout = savedState.mReverseLayout;
            this.mAnchorLayoutFromEnd = savedState.mAnchorLayoutFromEnd;
            this.mLastLayoutRTL = savedState.mLastLayoutRTL;
            this.mFullSpanItems = savedState.mFullSpanItems;
        }
    }

    /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$a */
    class C1670a implements Runnable {
        C1670a() {
        }

        public void run() {
            StaggeredGridLayoutManager.this.mo7587M();
        }
    }

    /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$b */
    class C1671b {

        /* renamed from: a */
        int f6411a;

        /* renamed from: b */
        int f6412b;

        /* renamed from: c */
        boolean f6413c;

        /* renamed from: d */
        boolean f6414d;

        /* renamed from: e */
        boolean f6415e;

        /* renamed from: f */
        int[] f6416f;

        C1671b() {
            mo7642b();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo7641a(C1673d[] dVarArr) {
            int length = dVarArr.length;
            int[] iArr = this.f6416f;
            if (iArr == null || iArr.length < length) {
                this.f6416f = new int[StaggeredGridLayoutManager.this.f6396t.length];
            }
            for (int i = 0; i < length; i++) {
                this.f6416f[i] = dVarArr[i].mo7653b(Integer.MIN_VALUE);
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo7642b() {
            this.f6411a = -1;
            this.f6412b = Integer.MIN_VALUE;
            this.f6413c = false;
            this.f6414d = false;
            this.f6415e = false;
            int[] iArr = this.f6416f;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo7639a() {
            int i;
            if (this.f6413c) {
                i = StaggeredGridLayoutManager.this.f6397u.mo8015b();
            } else {
                i = StaggeredGridLayoutManager.this.f6397u.mo8025g();
            }
            this.f6412b = i;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo7640a(int i) {
            if (this.f6413c) {
                this.f6412b = StaggeredGridLayoutManager.this.f6397u.mo8015b() - i;
            } else {
                this.f6412b = StaggeredGridLayoutManager.this.f6397u.mo8025g() + i;
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$c */
    public static class C1672c extends C1656p {

        /* renamed from: g */
        public static final int f6418g = -1;

        /* renamed from: e */
        C1673d f6419e;

        /* renamed from: f */
        boolean f6420f;

        public C1672c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        /* renamed from: a */
        public void mo7643a(boolean z) {
            this.f6420f = z;
        }

        /* renamed from: h */
        public final int mo7644h() {
            C1673d dVar = this.f6419e;
            if (dVar == null) {
                return -1;
            }
            return dVar.f6426e;
        }

        /* renamed from: i */
        public boolean mo7645i() {
            return this.f6420f;
        }

        public C1672c(int i, int i2) {
            super(i, i2);
        }

        public C1672c(MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public C1672c(LayoutParams layoutParams) {
            super(layoutParams);
        }

        public C1672c(C1656p pVar) {
            super(pVar);
        }
    }

    /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$d */
    class C1673d {

        /* renamed from: g */
        static final int f6421g = Integer.MIN_VALUE;

        /* renamed from: a */
        ArrayList<View> f6422a = new ArrayList<>();

        /* renamed from: b */
        int f6423b = Integer.MIN_VALUE;

        /* renamed from: c */
        int f6424c = Integer.MIN_VALUE;

        /* renamed from: d */
        int f6425d = 0;

        /* renamed from: e */
        final int f6426e;

        C1673d(int i) {
            this.f6426e = i;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public int mo7646a(int i) {
            int i2 = this.f6424c;
            if (i2 != Integer.MIN_VALUE) {
                return i2;
            }
            if (this.f6422a.size() == 0) {
                return i;
            }
            mo7650a();
            return this.f6424c;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public int mo7653b(int i) {
            int i2 = this.f6423b;
            if (i2 != Integer.MIN_VALUE) {
                return i2;
            }
            if (this.f6422a.size() == 0) {
                return i;
            }
            mo7656b();
            return this.f6423b;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public void mo7659c(View view) {
            C1672c b = mo7655b(view);
            b.f6419e = this;
            this.f6422a.add(0, view);
            this.f6423b = Integer.MIN_VALUE;
            if (this.f6422a.size() == 1) {
                this.f6424c = Integer.MIN_VALUE;
            }
            if (b.mo7522e() || b.mo7521d()) {
                this.f6425d += StaggeredGridLayoutManager.this.f6397u.mo8016b(view);
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: d */
        public void mo7661d(int i) {
            this.f6423b = i;
            this.f6424c = i;
        }

        /* renamed from: e */
        public int mo7662e() {
            if (StaggeredGridLayoutManager.this.f6402z) {
                return mo7647a(this.f6422a.size() - 1, -1, true);
            }
            return mo7647a(0, this.f6422a.size(), true);
        }

        /* renamed from: f */
        public int mo7663f() {
            if (StaggeredGridLayoutManager.this.f6402z) {
                return mo7654b(this.f6422a.size() - 1, -1, false);
            }
            return mo7654b(0, this.f6422a.size(), false);
        }

        /* renamed from: g */
        public int mo7664g() {
            if (StaggeredGridLayoutManager.this.f6402z) {
                return mo7654b(0, this.f6422a.size(), true);
            }
            return mo7654b(this.f6422a.size() - 1, -1, true);
        }

        /* renamed from: h */
        public int mo7665h() {
            if (StaggeredGridLayoutManager.this.f6402z) {
                return mo7647a(0, this.f6422a.size(), true);
            }
            return mo7647a(this.f6422a.size() - 1, -1, true);
        }

        /* renamed from: i */
        public int mo7666i() {
            if (StaggeredGridLayoutManager.this.f6402z) {
                return mo7654b(0, this.f6422a.size(), false);
            }
            return mo7654b(this.f6422a.size() - 1, -1, false);
        }

        /* renamed from: j */
        public int mo7667j() {
            return this.f6425d;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: k */
        public int mo7668k() {
            int i = this.f6424c;
            if (i != Integer.MIN_VALUE) {
                return i;
            }
            mo7650a();
            return this.f6424c;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: l */
        public int mo7669l() {
            int i = this.f6423b;
            if (i != Integer.MIN_VALUE) {
                return i;
            }
            mo7656b();
            return this.f6423b;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: m */
        public void mo7670m() {
            this.f6423b = Integer.MIN_VALUE;
            this.f6424c = Integer.MIN_VALUE;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: n */
        public void mo7671n() {
            int size = this.f6422a.size();
            View view = (View) this.f6422a.remove(size - 1);
            C1672c b = mo7655b(view);
            b.f6419e = null;
            if (b.mo7522e() || b.mo7521d()) {
                this.f6425d -= StaggeredGridLayoutManager.this.f6397u.mo8016b(view);
            }
            if (size == 1) {
                this.f6423b = Integer.MIN_VALUE;
            }
            this.f6424c = Integer.MIN_VALUE;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: o */
        public void mo7672o() {
            View view = (View) this.f6422a.remove(0);
            C1672c b = mo7655b(view);
            b.f6419e = null;
            if (this.f6422a.size() == 0) {
                this.f6424c = Integer.MIN_VALUE;
            }
            if (b.mo7522e() || b.mo7521d()) {
                this.f6425d -= StaggeredGridLayoutManager.this.f6397u.mo8016b(view);
            }
            this.f6423b = Integer.MIN_VALUE;
        }

        /* renamed from: d */
        public int mo7660d() {
            if (StaggeredGridLayoutManager.this.f6402z) {
                return mo7654b(this.f6422a.size() - 1, -1, true);
            }
            return mo7654b(0, this.f6422a.size(), true);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo7650a() {
            ArrayList<View> arrayList = this.f6422a;
            View view = (View) arrayList.get(arrayList.size() - 1);
            C1672c b = mo7655b(view);
            this.f6424c = StaggeredGridLayoutManager.this.f6397u.mo8012a(view);
            if (b.f6420f) {
                FullSpanItem c = StaggeredGridLayoutManager.this.f6383E.mo7622c(b.mo7519b());
                if (c != null && c.f6409b == 1) {
                    this.f6424c += c.mo7626a(this.f6426e);
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo7656b() {
            View view = (View) this.f6422a.get(0);
            C1672c b = mo7655b(view);
            this.f6423b = StaggeredGridLayoutManager.this.f6397u.mo8019d(view);
            if (b.f6420f) {
                FullSpanItem c = StaggeredGridLayoutManager.this.f6383E.mo7622c(b.mo7519b());
                if (c != null && c.f6409b == -1) {
                    this.f6423b -= c.mo7626a(this.f6426e);
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public void mo7657c() {
            this.f6422a.clear();
            mo7670m();
            this.f6425d = 0;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public void mo7658c(int i) {
            int i2 = this.f6423b;
            if (i2 != Integer.MIN_VALUE) {
                this.f6423b = i2 + i;
            }
            int i3 = this.f6424c;
            if (i3 != Integer.MIN_VALUE) {
                this.f6424c = i3 + i;
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo7651a(View view) {
            C1672c b = mo7655b(view);
            b.f6419e = this;
            this.f6422a.add(view);
            this.f6424c = Integer.MIN_VALUE;
            if (this.f6422a.size() == 1) {
                this.f6423b = Integer.MIN_VALUE;
            }
            if (b.mo7522e() || b.mo7521d()) {
                this.f6425d += StaggeredGridLayoutManager.this.f6397u.mo8016b(view);
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public C1672c mo7655b(View view) {
            return (C1672c) view.getLayoutParams();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public int mo7654b(int i, int i2, boolean z) {
            return mo7648a(i, i2, z, true, false);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo7652a(boolean z, int i) {
            int i2;
            if (z) {
                i2 = mo7646a(Integer.MIN_VALUE);
            } else {
                i2 = mo7653b(Integer.MIN_VALUE);
            }
            mo7657c();
            if (i2 != Integer.MIN_VALUE) {
                if ((!z || i2 >= StaggeredGridLayoutManager.this.f6397u.mo8015b()) && (z || i2 <= StaggeredGridLayoutManager.this.f6397u.mo8025g())) {
                    if (i != Integer.MIN_VALUE) {
                        i2 += i;
                    }
                    this.f6424c = i2;
                    this.f6423b = i2;
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public int mo7648a(int i, int i2, boolean z, boolean z2, boolean z3) {
            int g = StaggeredGridLayoutManager.this.f6397u.mo8025g();
            int b = StaggeredGridLayoutManager.this.f6397u.mo8015b();
            int i3 = i2 > i ? 1 : -1;
            while (i != i2) {
                View view = (View) this.f6422a.get(i);
                int d = StaggeredGridLayoutManager.this.f6397u.mo8019d(view);
                int a = StaggeredGridLayoutManager.this.f6397u.mo8012a(view);
                boolean z4 = false;
                boolean z5 = !z3 ? d < b : d <= b;
                if (!z3 ? a > g : a >= g) {
                    z4 = true;
                }
                if (z5 && z4) {
                    if (!z || !z2) {
                        if (z2) {
                            return StaggeredGridLayoutManager.this.mo7496p(view);
                        }
                        if (d < g || a > b) {
                            return StaggeredGridLayoutManager.this.mo7496p(view);
                        }
                    } else if (d >= g && a <= b) {
                        return StaggeredGridLayoutManager.this.mo7496p(view);
                    }
                }
                i += i3;
            }
            return -1;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public int mo7647a(int i, int i2, boolean z) {
            return mo7648a(i, i2, false, false, z);
        }

        /* renamed from: a */
        public View mo7649a(int i, int i2) {
            View view = null;
            if (i2 != -1) {
                int size = this.f6422a.size() - 1;
                while (size >= 0) {
                    View view2 = (View) this.f6422a.get(size);
                    StaggeredGridLayoutManager staggeredGridLayoutManager = StaggeredGridLayoutManager.this;
                    if (staggeredGridLayoutManager.f6402z && staggeredGridLayoutManager.mo7496p(view2) >= i) {
                        break;
                    }
                    StaggeredGridLayoutManager staggeredGridLayoutManager2 = StaggeredGridLayoutManager.this;
                    if ((!staggeredGridLayoutManager2.f6402z && staggeredGridLayoutManager2.mo7496p(view2) <= i) || !view2.hasFocusable()) {
                        break;
                    }
                    size--;
                    view = view2;
                }
            } else {
                int size2 = this.f6422a.size();
                int i3 = 0;
                while (i3 < size2) {
                    View view3 = (View) this.f6422a.get(i3);
                    StaggeredGridLayoutManager staggeredGridLayoutManager3 = StaggeredGridLayoutManager.this;
                    if (staggeredGridLayoutManager3.f6402z && staggeredGridLayoutManager3.mo7496p(view3) <= i) {
                        break;
                    }
                    StaggeredGridLayoutManager staggeredGridLayoutManager4 = StaggeredGridLayoutManager.this;
                    if ((!staggeredGridLayoutManager4.f6402z && staggeredGridLayoutManager4.mo7496p(view3) >= i) || !view3.hasFocusable()) {
                        break;
                    }
                    i3++;
                    view = view3;
                }
            }
            return view;
        }
    }

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        C1655d a = C1651o.m8612a(context, attributeSet, i, i2);
        mo7611k(a.f6344a);
        mo7612l(a.f6345b);
        mo7609f(a.f6346c);
        this.f6401y = new C1760p();
        m8864X();
    }

    /* renamed from: X */
    private void m8864X() {
        this.f6397u = C1775w.m9558a((C1651o) this, this.f6399w);
        this.f6398v = C1775w.m9558a((C1651o) this, 1 - this.f6399w);
    }

    /* renamed from: Y */
    private void m8865Y() {
        if (this.f6398v.mo8021e() != 1073741824) {
            int e = mo7467e();
            float f = 0.0f;
            for (int i = 0; i < e; i++) {
                View d = mo7462d(i);
                float b = (float) this.f6398v.mo8016b(d);
                if (b >= f) {
                    if (((C1672c) d.getLayoutParams()).mo7645i()) {
                        b = (b * 1.0f) / ((float) this.f6395s);
                    }
                    f = Math.max(f, b);
                }
            }
            int i2 = this.f6400x;
            int round = Math.round(f * ((float) this.f6395s));
            if (this.f6398v.mo8021e() == Integer.MIN_VALUE) {
                round = Math.min(round, this.f6398v.mo8026h());
            }
            mo7613m(round);
            if (this.f6400x != i2) {
                for (int i3 = 0; i3 < e; i3++) {
                    View d2 = mo7462d(i3);
                    C1672c cVar = (C1672c) d2.getLayoutParams();
                    if (!cVar.f6420f) {
                        if (!mo7597W() || this.f6399w != 1) {
                            int i4 = cVar.f6419e.f6426e;
                            int i5 = this.f6400x * i4;
                            int i6 = i4 * i2;
                            if (this.f6399w == 1) {
                                d2.offsetLeftAndRight(i5 - i6);
                            } else {
                                d2.offsetTopAndBottom(i5 - i6);
                            }
                        } else {
                            int i7 = this.f6395s;
                            int i8 = i7 - 1;
                            int i9 = cVar.f6419e.f6426e;
                            d2.offsetLeftAndRight(((-(i8 - i9)) * this.f6400x) - ((-((i7 - 1) - i9)) * i2));
                        }
                    }
                }
            }
        }
    }

    /* renamed from: Z */
    private void m8866Z() {
        if (this.f6399w == 1 || !mo7597W()) {
            this.f6379A = this.f6402z;
        } else {
            this.f6379A = !this.f6402z;
        }
    }

    /* renamed from: a */
    private boolean m8877a(C1673d dVar) {
        if (this.f6379A) {
            if (dVar.mo7668k() < this.f6397u.mo8015b()) {
                ArrayList<View> arrayList = dVar.f6422a;
                return !dVar.mo7655b((View) arrayList.get(arrayList.size() - 1)).f6420f;
            }
        } else if (dVar.mo7669l() > this.f6397u.mo8025g()) {
            return !dVar.mo7655b((View) dVar.f6422a.get(0)).f6420f;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0157, code lost:
        if (mo7587M() != false) goto L_0x015b;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m8883c(androidx.recyclerview.widget.RecyclerView.C1664w r9, androidx.recyclerview.widget.RecyclerView.State r10, boolean r11) {
        /*
            r8 = this;
            androidx.recyclerview.widget.StaggeredGridLayoutManager$b r0 = r8.f6390L
            androidx.recyclerview.widget.StaggeredGridLayoutManager$SavedState r1 = r8.f6387I
            r2 = -1
            if (r1 != 0) goto L_0x000b
            int r1 = r8.f6381C
            if (r1 == r2) goto L_0x0018
        L_0x000b:
            int r1 = r10.getItemCount()
            if (r1 != 0) goto L_0x0018
            r8.mo7448b(r9)
            r0.mo7642b()
            return
        L_0x0018:
            boolean r1 = r0.f6415e
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L_0x0029
            int r1 = r8.f6381C
            if (r1 != r2) goto L_0x0029
            androidx.recyclerview.widget.StaggeredGridLayoutManager$SavedState r1 = r8.f6387I
            if (r1 == 0) goto L_0x0027
            goto L_0x0029
        L_0x0027:
            r1 = 0
            goto L_0x002a
        L_0x0029:
            r1 = 1
        L_0x002a:
            if (r1 == 0) goto L_0x0043
            r0.mo7642b()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$SavedState r5 = r8.f6387I
            if (r5 == 0) goto L_0x0037
            r8.m8875a(r0)
            goto L_0x003e
        L_0x0037:
            r8.m8866Z()
            boolean r5 = r8.f6379A
            r0.f6413c = r5
        L_0x003e:
            r8.mo7601b(r10, r0)
            r0.f6415e = r4
        L_0x0043:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$SavedState r5 = r8.f6387I
            if (r5 != 0) goto L_0x0060
            int r5 = r8.f6381C
            if (r5 != r2) goto L_0x0060
            boolean r5 = r0.f6413c
            boolean r6 = r8.f6385G
            if (r5 != r6) goto L_0x0059
            boolean r5 = r8.mo7597W()
            boolean r6 = r8.f6386H
            if (r5 == r6) goto L_0x0060
        L_0x0059:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r5 = r8.f6383E
            r5.mo7615a()
            r0.f6414d = r4
        L_0x0060:
            int r5 = r8.mo7467e()
            if (r5 <= 0) goto L_0x00c9
            androidx.recyclerview.widget.StaggeredGridLayoutManager$SavedState r5 = r8.f6387I
            if (r5 == 0) goto L_0x006e
            int r5 = r5.mSpanOffsetsSize
            if (r5 >= r4) goto L_0x00c9
        L_0x006e:
            boolean r5 = r0.f6414d
            if (r5 == 0) goto L_0x008e
            r1 = 0
        L_0x0073:
            int r5 = r8.f6395s
            if (r1 >= r5) goto L_0x00c9
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d[] r5 = r8.f6396t
            r5 = r5[r1]
            r5.mo7657c()
            int r5 = r0.f6412b
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r5 == r6) goto L_0x008b
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d[] r6 = r8.f6396t
            r6 = r6[r1]
            r6.mo7661d(r5)
        L_0x008b:
            int r1 = r1 + 1
            goto L_0x0073
        L_0x008e:
            if (r1 != 0) goto L_0x00af
            androidx.recyclerview.widget.StaggeredGridLayoutManager$b r1 = r8.f6390L
            int[] r1 = r1.f6416f
            if (r1 != 0) goto L_0x0097
            goto L_0x00af
        L_0x0097:
            r1 = 0
        L_0x0098:
            int r5 = r8.f6395s
            if (r1 >= r5) goto L_0x00c9
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d[] r5 = r8.f6396t
            r5 = r5[r1]
            r5.mo7657c()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$b r6 = r8.f6390L
            int[] r6 = r6.f6416f
            r6 = r6[r1]
            r5.mo7661d(r6)
            int r1 = r1 + 1
            goto L_0x0098
        L_0x00af:
            r1 = 0
        L_0x00b0:
            int r5 = r8.f6395s
            if (r1 >= r5) goto L_0x00c2
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d[] r5 = r8.f6396t
            r5 = r5[r1]
            boolean r6 = r8.f6379A
            int r7 = r0.f6412b
            r5.mo7652a(r6, r7)
            int r1 = r1 + 1
            goto L_0x00b0
        L_0x00c2:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$b r1 = r8.f6390L
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d[] r5 = r8.f6396t
            r1.mo7641a(r5)
        L_0x00c9:
            r8.mo7418a(r9)
            androidx.recyclerview.widget.p r1 = r8.f6401y
            r1.f6845a = r3
            r8.f6391M = r3
            androidx.recyclerview.widget.w r1 = r8.f6398v
            int r1 = r1.mo8026h()
            r8.mo7613m(r1)
            int r1 = r0.f6411a
            r8.m8879b(r1, r10)
            boolean r1 = r0.f6413c
            if (r1 == 0) goto L_0x00fc
            r8.m8902y(r2)
            androidx.recyclerview.widget.p r1 = r8.f6401y
            r8.m8867a(r9, r1, r10)
            r8.m8902y(r4)
            androidx.recyclerview.widget.p r1 = r8.f6401y
            int r2 = r0.f6411a
            int r5 = r1.f6848d
            int r2 = r2 + r5
            r1.f6847c = r2
            r8.m8867a(r9, r1, r10)
            goto L_0x0113
        L_0x00fc:
            r8.m8902y(r4)
            androidx.recyclerview.widget.p r1 = r8.f6401y
            r8.m8867a(r9, r1, r10)
            r8.m8902y(r2)
            androidx.recyclerview.widget.p r1 = r8.f6401y
            int r2 = r0.f6411a
            int r5 = r1.f6848d
            int r2 = r2 + r5
            r1.f6847c = r2
            r8.m8867a(r9, r1, r10)
        L_0x0113:
            r8.m8865Y()
            int r1 = r8.mo7467e()
            if (r1 <= 0) goto L_0x012d
            boolean r1 = r8.f6379A
            if (r1 == 0) goto L_0x0127
            r8.m8873a(r9, r10, r4)
            r8.m8881b(r9, r10, r3)
            goto L_0x012d
        L_0x0127:
            r8.m8881b(r9, r10, r4)
            r8.m8873a(r9, r10, r3)
        L_0x012d:
            if (r11 == 0) goto L_0x015a
            boolean r11 = r10.isPreLayout()
            if (r11 != 0) goto L_0x015a
            int r11 = r8.f6384F
            if (r11 == 0) goto L_0x014b
            int r11 = r8.mo7467e()
            if (r11 <= 0) goto L_0x014b
            boolean r11 = r8.f6391M
            if (r11 != 0) goto L_0x0149
            android.view.View r11 = r8.mo7595U()
            if (r11 == 0) goto L_0x014b
        L_0x0149:
            r11 = 1
            goto L_0x014c
        L_0x014b:
            r11 = 0
        L_0x014c:
            if (r11 == 0) goto L_0x015a
            java.lang.Runnable r11 = r8.f6394P
            r8.mo7452b(r11)
            boolean r11 = r8.mo7587M()
            if (r11 == 0) goto L_0x015a
            goto L_0x015b
        L_0x015a:
            r4 = 0
        L_0x015b:
            boolean r11 = r10.isPreLayout()
            if (r11 == 0) goto L_0x0166
            androidx.recyclerview.widget.StaggeredGridLayoutManager$b r11 = r8.f6390L
            r11.mo7642b()
        L_0x0166:
            boolean r11 = r0.f6413c
            r8.f6385G = r11
            boolean r11 = r8.mo7597W()
            r8.f6386H = r11
            if (r4 == 0) goto L_0x017a
            androidx.recyclerview.widget.StaggeredGridLayoutManager$b r11 = r8.f6390L
            r11.mo7642b()
            r8.m8883c(r9, r10, r3)
        L_0x017a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.m8883c(androidx.recyclerview.widget.RecyclerView$w, androidx.recyclerview.widget.RecyclerView$State, boolean):void");
    }

    /* renamed from: h */
    private int m8886h(State state) {
        if (mo7467e() == 0) {
            return 0;
        }
        return C1782z.m9638a(state, this.f6397u, mo7607e(!this.f6392N), mo7605d(!this.f6392N), this, this.f6392N);
    }

    /* renamed from: i */
    private int m8887i(State state) {
        if (mo7467e() == 0) {
            return 0;
        }
        return C1782z.m9639a(state, this.f6397u, mo7607e(!this.f6392N), mo7605d(!this.f6392N), this, this.f6392N, this.f6379A);
    }

    /* renamed from: n */
    private int m8889n(int i) {
        int i2 = -1;
        if (mo7467e() == 0) {
            if (this.f6379A) {
                i2 = 1;
            }
            return i2;
        }
        if ((i < mo7589O()) == this.f6379A) {
            i2 = 1;
        }
        return i2;
    }

    /* renamed from: o */
    private int m8890o(int i) {
        int i2 = -1;
        int i3 = 1;
        if (i == 1) {
            return (this.f6399w != 1 && mo7597W()) ? 1 : -1;
        }
        if (i == 2) {
            return (this.f6399w != 1 && mo7597W()) ? -1 : 1;
        }
        if (i == 17) {
            if (this.f6399w != 0) {
                i2 = Integer.MIN_VALUE;
            }
            return i2;
        } else if (i == 33) {
            if (this.f6399w != 1) {
                i2 = Integer.MIN_VALUE;
            }
            return i2;
        } else if (i == 66) {
            if (this.f6399w != 0) {
                i3 = Integer.MIN_VALUE;
            }
            return i3;
        } else if (i != 130) {
            return Integer.MIN_VALUE;
        } else {
            if (this.f6399w != 1) {
                i3 = Integer.MIN_VALUE;
            }
            return i3;
        }
    }

    /* renamed from: p */
    private FullSpanItem m8891p(int i) {
        FullSpanItem fullSpanItem = new FullSpanItem();
        fullSpanItem.f6406N = new int[this.f6395s];
        for (int i2 = 0; i2 < this.f6395s; i2++) {
            fullSpanItem.f6406N[i2] = i - this.f6396t[i2].mo7646a(i);
        }
        return fullSpanItem;
    }

    /* renamed from: q */
    private FullSpanItem m8892q(int i) {
        FullSpanItem fullSpanItem = new FullSpanItem();
        fullSpanItem.f6406N = new int[this.f6395s];
        for (int i2 = 0; i2 < this.f6395s; i2++) {
            fullSpanItem.f6406N[i2] = this.f6396t[i2].mo7653b(i) - i;
        }
        return fullSpanItem;
    }

    /* renamed from: r */
    private int m8893r(int i) {
        int e = mo7467e();
        for (int i2 = 0; i2 < e; i2++) {
            int p = mo7496p(mo7462d(i2));
            if (p >= 0 && p < i) {
                return p;
            }
        }
        return 0;
    }

    /* renamed from: s */
    private int m8894s(int i) {
        for (int e = mo7467e() - 1; e >= 0; e--) {
            int p = mo7496p(mo7462d(e));
            if (p >= 0 && p < i) {
                return p;
            }
        }
        return 0;
    }

    /* renamed from: t */
    private int m8895t(int i) {
        int a = this.f6396t[0].mo7646a(i);
        for (int i2 = 1; i2 < this.f6395s; i2++) {
            int a2 = this.f6396t[i2].mo7646a(i);
            if (a2 > a) {
                a = a2;
            }
        }
        return a;
    }

    /* renamed from: u */
    private int m8896u(int i) {
        int b = this.f6396t[0].mo7653b(i);
        for (int i2 = 1; i2 < this.f6395s; i2++) {
            int b2 = this.f6396t[i2].mo7653b(i);
            if (b2 > b) {
                b = b2;
            }
        }
        return b;
    }

    /* renamed from: v */
    private int m8897v(int i) {
        int a = this.f6396t[0].mo7646a(i);
        for (int i2 = 1; i2 < this.f6395s; i2++) {
            int a2 = this.f6396t[i2].mo7646a(i);
            if (a2 < a) {
                a = a2;
            }
        }
        return a;
    }

    /* renamed from: w */
    private void m8899w(View view) {
        for (int i = this.f6395s - 1; i >= 0; i--) {
            this.f6396t[i].mo7651a(view);
        }
    }

    /* renamed from: x */
    private void m8900x(View view) {
        for (int i = this.f6395s - 1; i >= 0; i--) {
            this.f6396t[i].mo7659c(view);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0088  */
    /* renamed from: D */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.os.Parcelable mo6954D() {
        /*
            r4 = this;
            androidx.recyclerview.widget.StaggeredGridLayoutManager$SavedState r0 = r4.f6387I
            if (r0 == 0) goto L_0x000a
            androidx.recyclerview.widget.StaggeredGridLayoutManager$SavedState r1 = new androidx.recyclerview.widget.StaggeredGridLayoutManager$SavedState
            r1.<init>(r0)
            return r1
        L_0x000a:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$SavedState r0 = new androidx.recyclerview.widget.StaggeredGridLayoutManager$SavedState
            r0.<init>()
            boolean r1 = r4.f6402z
            r0.mReverseLayout = r1
            boolean r1 = r4.f6385G
            r0.mAnchorLayoutFromEnd = r1
            boolean r1 = r4.f6386H
            r0.mLastLayoutRTL = r1
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r1 = r4.f6383E
            r2 = 0
            if (r1 == 0) goto L_0x0030
            int[] r3 = r1.f6404a
            if (r3 == 0) goto L_0x0030
            r0.mSpanLookup = r3
            int[] r3 = r0.mSpanLookup
            int r3 = r3.length
            r0.mSpanLookupSize = r3
            java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem> r1 = r1.f6405b
            r0.mFullSpanItems = r1
            goto L_0x0032
        L_0x0030:
            r0.mSpanLookupSize = r2
        L_0x0032:
            int r1 = r4.mo7467e()
            if (r1 <= 0) goto L_0x0088
            boolean r1 = r4.f6385G
            if (r1 == 0) goto L_0x0041
            int r1 = r4.mo7591Q()
            goto L_0x0045
        L_0x0041:
            int r1 = r4.mo7589O()
        L_0x0045:
            r0.mAnchorPosition = r1
            int r1 = r4.mo7588N()
            r0.mVisibleAnchorPosition = r1
            int r1 = r4.f6395s
            r0.mSpanOffsetsSize = r1
            int[] r1 = new int[r1]
            r0.mSpanOffsets = r1
        L_0x0055:
            int r1 = r4.f6395s
            if (r2 >= r1) goto L_0x008f
            boolean r1 = r4.f6385G
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 == 0) goto L_0x0070
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d[] r1 = r4.f6396t
            r1 = r1[r2]
            int r1 = r1.mo7646a(r3)
            if (r1 == r3) goto L_0x0081
            androidx.recyclerview.widget.w r3 = r4.f6397u
            int r3 = r3.mo8015b()
            goto L_0x0080
        L_0x0070:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d[] r1 = r4.f6396t
            r1 = r1[r2]
            int r1 = r1.mo7653b(r3)
            if (r1 == r3) goto L_0x0081
            androidx.recyclerview.widget.w r3 = r4.f6397u
            int r3 = r3.mo8025g()
        L_0x0080:
            int r1 = r1 - r3
        L_0x0081:
            int[] r3 = r0.mSpanOffsets
            r3[r2] = r1
            int r2 = r2 + 1
            goto L_0x0055
        L_0x0088:
            r1 = -1
            r0.mAnchorPosition = r1
            r0.mVisibleAnchorPosition = r1
            r0.mSpanOffsetsSize = r2
        L_0x008f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.mo6954D():android.os.Parcelable");
    }

    /* renamed from: J */
    public boolean mo6906J() {
        return this.f6387I == null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: K */
    public boolean mo7585K() {
        int a = this.f6396t[0].mo7646a(Integer.MIN_VALUE);
        for (int i = 1; i < this.f6395s; i++) {
            if (this.f6396t[i].mo7646a(Integer.MIN_VALUE) != a) {
                return false;
            }
        }
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: L */
    public boolean mo7586L() {
        int b = this.f6396t[0].mo7653b(Integer.MIN_VALUE);
        for (int i = 1; i < this.f6395s; i++) {
            if (this.f6396t[i].mo7653b(Integer.MIN_VALUE) != b) {
                return false;
            }
        }
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: M */
    public boolean mo7587M() {
        int i;
        int i2;
        if (mo7467e() == 0 || this.f6384F == 0 || !mo7510x()) {
            return false;
        }
        if (this.f6379A) {
            i2 = mo7591Q();
            i = mo7589O();
        } else {
            i2 = mo7589O();
            i = mo7591Q();
        }
        if (i2 == 0 && mo7595U() != null) {
            this.f6383E.mo7615a();
            mo7402G();
            mo7401F();
            return true;
        } else if (!this.f6391M) {
            return false;
        } else {
            int i3 = this.f6379A ? -1 : 1;
            int i4 = i + 1;
            FullSpanItem a = this.f6383E.mo7614a(i2, i4, i3, true);
            if (a == null) {
                this.f6391M = false;
                this.f6383E.mo7620b(i4);
                return false;
            }
            FullSpanItem a2 = this.f6383E.mo7614a(i2, a.f6408a, i3 * -1, true);
            if (a2 == null) {
                this.f6383E.mo7620b(a.f6408a);
            } else {
                this.f6383E.mo7620b(a2.f6408a + 1);
            }
            mo7402G();
            mo7401F();
            return true;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: N */
    public int mo7588N() {
        View view;
        if (this.f6379A) {
            view = mo7605d(true);
        } else {
            view = mo7607e(true);
        }
        if (view == null) {
            return -1;
        }
        return mo7496p(view);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: O */
    public int mo7589O() {
        if (mo7467e() == 0) {
            return 0;
        }
        return mo7496p(mo7462d(0));
    }

    /* renamed from: P */
    public int mo7590P() {
        return this.f6384F;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: Q */
    public int mo7591Q() {
        int e = mo7467e();
        if (e == 0) {
            return 0;
        }
        return mo7496p(mo7462d(e - 1));
    }

    /* renamed from: R */
    public int mo7592R() {
        return this.f6399w;
    }

    /* renamed from: S */
    public boolean mo7593S() {
        return this.f6402z;
    }

    /* renamed from: T */
    public int mo7594T() {
        return this.f6395s;
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0074, code lost:
        if (r10 == r11) goto L_0x0088;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0086, code lost:
        if (r10 == r11) goto L_0x0088;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x008a, code lost:
        r10 = false;
     */
    /* renamed from: U */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View mo7595U() {
        /*
            r12 = this;
            int r0 = r12.mo7467e()
            r1 = 1
            int r0 = r0 - r1
            java.util.BitSet r2 = new java.util.BitSet
            int r3 = r12.f6395s
            r2.<init>(r3)
            int r3 = r12.f6395s
            r4 = 0
            r2.set(r4, r3, r1)
            int r3 = r12.f6399w
            r5 = -1
            if (r3 != r1) goto L_0x0020
            boolean r3 = r12.mo7597W()
            if (r3 == 0) goto L_0x0020
            r3 = 1
            goto L_0x0021
        L_0x0020:
            r3 = -1
        L_0x0021:
            boolean r6 = r12.f6379A
            if (r6 == 0) goto L_0x0027
            r6 = -1
            goto L_0x002b
        L_0x0027:
            int r0 = r0 + 1
            r6 = r0
            r0 = 0
        L_0x002b:
            if (r0 >= r6) goto L_0x002e
            r5 = 1
        L_0x002e:
            if (r0 == r6) goto L_0x00ab
            android.view.View r7 = r12.mo7462d(r0)
            android.view.ViewGroup$LayoutParams r8 = r7.getLayoutParams()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r8 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.C1672c) r8
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r9 = r8.f6419e
            int r9 = r9.f6426e
            boolean r9 = r2.get(r9)
            if (r9 == 0) goto L_0x0054
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r9 = r8.f6419e
            boolean r9 = r12.m8877a(r9)
            if (r9 == 0) goto L_0x004d
            return r7
        L_0x004d:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r9 = r8.f6419e
            int r9 = r9.f6426e
            r2.clear(r9)
        L_0x0054:
            boolean r9 = r8.f6420f
            if (r9 == 0) goto L_0x0059
            goto L_0x00a9
        L_0x0059:
            int r9 = r0 + r5
            if (r9 == r6) goto L_0x00a9
            android.view.View r9 = r12.mo7462d(r9)
            boolean r10 = r12.f6379A
            if (r10 == 0) goto L_0x0077
            androidx.recyclerview.widget.w r10 = r12.f6397u
            int r10 = r10.mo8012a(r7)
            androidx.recyclerview.widget.w r11 = r12.f6397u
            int r11 = r11.mo8012a(r9)
            if (r10 >= r11) goto L_0x0074
            return r7
        L_0x0074:
            if (r10 != r11) goto L_0x008a
            goto L_0x0088
        L_0x0077:
            androidx.recyclerview.widget.w r10 = r12.f6397u
            int r10 = r10.mo8019d(r7)
            androidx.recyclerview.widget.w r11 = r12.f6397u
            int r11 = r11.mo8019d(r9)
            if (r10 <= r11) goto L_0x0086
            return r7
        L_0x0086:
            if (r10 != r11) goto L_0x008a
        L_0x0088:
            r10 = 1
            goto L_0x008b
        L_0x008a:
            r10 = 0
        L_0x008b:
            if (r10 == 0) goto L_0x00a9
            android.view.ViewGroup$LayoutParams r9 = r9.getLayoutParams()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r9 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.C1672c) r9
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r8 = r8.f6419e
            int r8 = r8.f6426e
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r9 = r9.f6419e
            int r9 = r9.f6426e
            int r8 = r8 - r9
            if (r8 >= 0) goto L_0x00a0
            r8 = 1
            goto L_0x00a1
        L_0x00a0:
            r8 = 0
        L_0x00a1:
            if (r3 >= 0) goto L_0x00a5
            r9 = 1
            goto L_0x00a6
        L_0x00a5:
            r9 = 0
        L_0x00a6:
            if (r8 == r9) goto L_0x00a9
            return r7
        L_0x00a9:
            int r0 = r0 + r5
            goto L_0x002e
        L_0x00ab:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.mo7595U():android.view.View");
    }

    /* renamed from: V */
    public void mo7596V() {
        this.f6383E.mo7615a();
        mo7401F();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: W */
    public boolean mo7597W() {
        return mo7485k() == 1;
    }

    /* renamed from: b */
    public void mo6985b(RecyclerView recyclerView, C1664w wVar) {
        super.mo6985b(recyclerView, wVar);
        mo7452b(this.f6394P);
        for (int i = 0; i < this.f6395s; i++) {
            this.f6396t[i].mo7657c();
        }
        recyclerView.requestLayout();
    }

    /* renamed from: d */
    public int[] mo7606d(int[] iArr) {
        if (iArr == null) {
            iArr = new int[this.f6395s];
        } else if (iArr.length < this.f6395s) {
            StringBuilder sb = new StringBuilder();
            sb.append("Provided int[]'s size must be more than or equal to span count. Expected:");
            sb.append(this.f6395s);
            sb.append(", array size:");
            sb.append(iArr.length);
            throw new IllegalArgumentException(sb.toString());
        }
        for (int i = 0; i < this.f6395s; i++) {
            iArr[i] = this.f6396t[i].mo7666i();
        }
        return iArr;
    }

    /* renamed from: e */
    public void mo6934e(C1664w wVar, State state) {
        m8883c(wVar, state, true);
    }

    /* renamed from: f */
    public void mo7609f(boolean z) {
        mo6986b((String) null);
        SavedState savedState = this.f6387I;
        if (!(savedState == null || savedState.mReverseLayout == z)) {
            savedState.mReverseLayout = z;
        }
        this.f6402z = z;
        mo7401F();
    }

    /* renamed from: g */
    public void mo7477g(int i) {
        if (i == 0) {
            mo7587M();
        }
    }

    /* renamed from: j */
    public void mo7610j(int i) {
        mo6986b((String) null);
        if (i != this.f6384F) {
            if (i == 0 || i == 2) {
                this.f6384F = i;
                mo7401F();
                return;
            }
            throw new IllegalArgumentException("invalid gap strategy. Must be GAP_HANDLING_NONE or GAP_HANDLING_MOVE_ITEMS_BETWEEN_SPANS");
        }
    }

    /* renamed from: k */
    public void mo7611k(int i) {
        if (i == 0 || i == 1) {
            mo6986b((String) null);
            if (i != this.f6399w) {
                this.f6399w = i;
                C1775w wVar = this.f6397u;
                this.f6397u = this.f6398v;
                this.f6398v = wVar;
                mo7401F();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("invalid orientation.");
    }

    /* renamed from: l */
    public void mo7612l(int i) {
        mo6986b((String) null);
        if (i != this.f6395s) {
            mo7596V();
            this.f6395s = i;
            this.f6380B = new BitSet(this.f6395s);
            this.f6396t = new C1673d[this.f6395s];
            for (int i2 = 0; i2 < this.f6395s; i2++) {
                this.f6396t[i2] = new C1673d(i2);
            }
            mo7401F();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: m */
    public void mo7613m(int i) {
        this.f6400x = i / this.f6395s;
        this.f6388J = MeasureSpec.makeMeasureSpec(i, this.f6398v.mo8021e());
    }

    /* renamed from: y */
    public boolean mo7001y() {
        return this.f6384F != 0;
    }

    /* renamed from: y */
    private void m8902y(int i) {
        C1760p pVar = this.f6401y;
        pVar.f6849e = i;
        int i2 = 1;
        if (this.f6379A != (i == -1)) {
            i2 = -1;
        }
        pVar.f6848d = i2;
    }

    /* renamed from: e */
    public int mo6933e(State state) {
        return m8887i(state);
    }

    /* renamed from: g */
    public void mo6937g(State state) {
        super.mo6937g(state);
        this.f6381C = -1;
        this.f6382D = Integer.MIN_VALUE;
        this.f6387I = null;
        this.f6390L.mo7642b();
    }

    /* renamed from: w */
    private int m8898w(int i) {
        int b = this.f6396t[0].mo7653b(i);
        for (int i2 = 1; i2 < this.f6395s; i2++) {
            int b2 = this.f6396t[i2].mo7653b(i);
            if (b2 < b) {
                b = b2;
            }
        }
        return b;
    }

    /* renamed from: x */
    private boolean m8901x(int i) {
        boolean z = true;
        if (this.f6399w == 0) {
            if ((i == -1) == this.f6379A) {
                z = false;
            }
            return z;
        }
        if (((i == -1) == this.f6379A) != mo7597W()) {
            z = false;
        }
        return z;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public View mo7607e(boolean z) {
        int g = this.f6397u.mo8025g();
        int b = this.f6397u.mo8015b();
        int e = mo7467e();
        View view = null;
        for (int i = 0; i < e; i++) {
            View d = mo7462d(i);
            int d2 = this.f6397u.mo8019d(d);
            if (this.f6397u.mo8012a(d) > g && d2 < b) {
                if (d2 >= g || !z) {
                    return d;
                }
                if (view == null) {
                    view = d;
                }
            }
        }
        return view;
    }

    /* renamed from: j */
    private int m8888j(State state) {
        if (mo7467e() == 0) {
            return 0;
        }
        return C1782z.m9640b(state, this.f6397u, mo7607e(!this.f6392N), mo7605d(!this.f6392N), this, this.f6392N);
    }

    /* renamed from: b */
    public void mo6986b(String str) {
        if (this.f6387I == null) {
            super.mo6986b(str);
        }
    }

    /* renamed from: d */
    public int mo6990d(State state) {
        return m8886h(state);
    }

    /* renamed from: f */
    public int mo6935f(State state) {
        return m8888j(state);
    }

    /* renamed from: i */
    public void mo6997i(int i) {
        SavedState savedState = this.f6387I;
        if (!(savedState == null || savedState.mAnchorPosition == i)) {
            savedState.invalidateAnchorPositionInfo();
        }
        this.f6381C = i;
        this.f6382D = Integer.MIN_VALUE;
        mo7401F();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public View mo7605d(boolean z) {
        int g = this.f6397u.mo8025g();
        int b = this.f6397u.mo8015b();
        View view = null;
        for (int e = mo7467e() - 1; e >= 0; e--) {
            View d = mo7462d(e);
            int d2 = this.f6397u.mo8019d(d);
            int a = this.f6397u.mo8012a(d);
            if (a > g && d2 < b) {
                if (a <= b || !z) {
                    return d;
                }
                if (view == null) {
                    view = d;
                }
            }
        }
        return view;
    }

    /* renamed from: f */
    public void mo7472f(int i) {
        super.mo7472f(i);
        for (int i2 = 0; i2 < this.f6395s; i2++) {
            this.f6396t[i2].mo7658c(i);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo7601b(State state, C1671b bVar) {
        if (!mo7599a(state, bVar) && !m8884c(state, bVar)) {
            bVar.mo7639a();
            bVar.f6411a = 0;
        }
    }

    /* renamed from: e */
    public void mo7468e(int i) {
        super.mo7468e(i);
        for (int i2 = 0; i2 < this.f6395s; i2++) {
            this.f6396t[i2].mo7658c(i);
        }
    }

    /* renamed from: f */
    private void m8885f(int i, int i2) {
        for (int i3 = 0; i3 < this.f6395s; i3++) {
            if (!this.f6396t[i3].f6422a.isEmpty()) {
                m8876a(this.f6396t[i3], i, i2);
            }
        }
    }

    /* renamed from: a */
    public void mo6914a(Rect rect, int i, int i2) {
        int i3;
        int i4;
        int p = mo7495p() + mo7497q();
        int s = mo7501s() + mo7491n();
        if (this.f6399w == 1) {
            i4 = C1651o.m8609a(i2, rect.height() + s, mo7487l());
            i3 = C1651o.m8609a(i, (this.f6400x * this.f6395s) + p, mo7489m());
        } else {
            i3 = C1651o.m8609a(i, rect.width() + p, mo7489m());
            i4 = C1651o.m8609a(i2, (this.f6400x * this.f6395s) + s, mo7487l());
        }
        mo7454c(i3, i4);
    }

    /* renamed from: b */
    public int[] mo7602b(int[] iArr) {
        if (iArr == null) {
            iArr = new int[this.f6395s];
        } else if (iArr.length < this.f6395s) {
            StringBuilder sb = new StringBuilder();
            sb.append("Provided int[]'s size must be more than or equal to span count. Expected:");
            sb.append(this.f6395s);
            sb.append(", array size:");
            sb.append(iArr.length);
            throw new IllegalArgumentException(sb.toString());
        }
        for (int i = 0; i < this.f6395s; i++) {
            iArr[i] = this.f6396t[i].mo7663f();
        }
        return iArr;
    }

    /* renamed from: e */
    public void mo7608e(int i, int i2) {
        SavedState savedState = this.f6387I;
        if (savedState != null) {
            savedState.invalidateAnchorPositionInfo();
        }
        this.f6381C = i;
        this.f6382D = i2;
        mo7401F();
    }

    /* renamed from: d */
    public void mo6932d(RecyclerView recyclerView) {
        this.f6383E.mo7615a();
        mo7401F();
    }

    /* renamed from: b */
    public int mo6926b(State state) {
        return m8887i(state);
    }

    /* renamed from: b */
    public int mo6927b(C1664w wVar, State state) {
        if (this.f6399w == 0) {
            return this.f6395s;
        }
        return super.mo6927b(wVar, state);
    }

    public StaggeredGridLayoutManager(int i, int i2) {
        this.f6399w = i2;
        mo7612l(i);
        this.f6401y = new C1760p();
        m8864X();
    }

    /* renamed from: b */
    private void m8881b(C1664w wVar, State state, boolean z) {
        int w = m8898w(Integer.MAX_VALUE);
        if (w != Integer.MAX_VALUE) {
            int g = w - this.f6397u.mo8025g();
            if (g > 0) {
                int c = g - mo7603c(g, wVar, state);
                if (z && c > 0) {
                    this.f6397u.mo8013a(-c);
                }
            }
        }
    }

    /* renamed from: a */
    private void m8875a(C1671b bVar) {
        int i;
        SavedState savedState = this.f6387I;
        int i2 = savedState.mSpanOffsetsSize;
        if (i2 > 0) {
            if (i2 == this.f6395s) {
                for (int i3 = 0; i3 < this.f6395s; i3++) {
                    this.f6396t[i3].mo7657c();
                    SavedState savedState2 = this.f6387I;
                    int i4 = savedState2.mSpanOffsets[i3];
                    if (i4 != Integer.MIN_VALUE) {
                        if (savedState2.mAnchorLayoutFromEnd) {
                            i = this.f6397u.mo8015b();
                        } else {
                            i = this.f6397u.mo8025g();
                        }
                        i4 += i;
                    }
                    this.f6396t[i3].mo7661d(i4);
                }
            } else {
                savedState.invalidateSpanInfo();
                SavedState savedState3 = this.f6387I;
                savedState3.mAnchorPosition = savedState3.mVisibleAnchorPosition;
            }
        }
        SavedState savedState4 = this.f6387I;
        this.f6386H = savedState4.mLastLayoutRTL;
        mo7609f(savedState4.mReverseLayout);
        m8866Z();
        SavedState savedState5 = this.f6387I;
        int i5 = savedState5.mAnchorPosition;
        if (i5 != -1) {
            this.f6381C = i5;
            bVar.f6413c = savedState5.mAnchorLayoutFromEnd;
        } else {
            bVar.f6413c = this.f6379A;
        }
        SavedState savedState6 = this.f6387I;
        if (savedState6.mSpanLookupSize > 1) {
            LazySpanLookup lazySpanLookup = this.f6383E;
            lazySpanLookup.f6404a = savedState6.mSpanLookup;
            lazySpanLookup.f6405b = savedState6.mFullSpanItems;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x004d  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m8879b(int r5, androidx.recyclerview.widget.RecyclerView.State r6) {
        /*
            r4 = this;
            androidx.recyclerview.widget.p r0 = r4.f6401y
            r1 = 0
            r0.f6846b = r1
            r0.f6847c = r5
            boolean r0 = r4.mo7399C()
            r2 = 1
            if (r0 == 0) goto L_0x002e
            int r6 = r6.getTargetScrollPosition()
            r0 = -1
            if (r6 == r0) goto L_0x002e
            boolean r0 = r4.f6379A
            if (r6 >= r5) goto L_0x001b
            r5 = 1
            goto L_0x001c
        L_0x001b:
            r5 = 0
        L_0x001c:
            if (r0 != r5) goto L_0x0025
            androidx.recyclerview.widget.w r5 = r4.f6397u
            int r5 = r5.mo8026h()
            goto L_0x002f
        L_0x0025:
            androidx.recyclerview.widget.w r5 = r4.f6397u
            int r5 = r5.mo8026h()
            r6 = r5
            r5 = 0
            goto L_0x0030
        L_0x002e:
            r5 = 0
        L_0x002f:
            r6 = 0
        L_0x0030:
            boolean r0 = r4.mo7474f()
            if (r0 == 0) goto L_0x004d
            androidx.recyclerview.widget.p r0 = r4.f6401y
            androidx.recyclerview.widget.w r3 = r4.f6397u
            int r3 = r3.mo8025g()
            int r3 = r3 - r6
            r0.f6850f = r3
            androidx.recyclerview.widget.p r6 = r4.f6401y
            androidx.recyclerview.widget.w r0 = r4.f6397u
            int r0 = r0.mo8015b()
            int r0 = r0 + r5
            r6.f6851g = r0
            goto L_0x005d
        L_0x004d:
            androidx.recyclerview.widget.p r0 = r4.f6401y
            androidx.recyclerview.widget.w r3 = r4.f6397u
            int r3 = r3.mo8011a()
            int r3 = r3 + r5
            r0.f6851g = r3
            androidx.recyclerview.widget.p r5 = r4.f6401y
            int r6 = -r6
            r5.f6850f = r6
        L_0x005d:
            androidx.recyclerview.widget.p r5 = r4.f6401y
            r5.f6852h = r1
            r5.f6845a = r2
            androidx.recyclerview.widget.w r6 = r4.f6397u
            int r6 = r6.mo8021e()
            if (r6 != 0) goto L_0x0074
            androidx.recyclerview.widget.w r6 = r4.f6397u
            int r6 = r6.mo8011a()
            if (r6 != 0) goto L_0x0074
            r1 = 1
        L_0x0074:
            r5.f6853i = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.m8879b(int, androidx.recyclerview.widget.RecyclerView$State):void");
    }

    /* renamed from: b */
    public void mo6928b(RecyclerView recyclerView, int i, int i2) {
        m8878b(i, i2, 2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0027  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0045 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0046  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m8878b(int r7, int r8, int r9) {
        /*
            r6 = this;
            boolean r0 = r6.f6379A
            if (r0 == 0) goto L_0x0009
            int r0 = r6.mo7591Q()
            goto L_0x000d
        L_0x0009:
            int r0 = r6.mo7589O()
        L_0x000d:
            r1 = 8
            if (r9 != r1) goto L_0x001b
            if (r7 >= r8) goto L_0x0016
            int r2 = r8 + 1
            goto L_0x001d
        L_0x0016:
            int r2 = r7 + 1
            r3 = r2
            r2 = r8
            goto L_0x001f
        L_0x001b:
            int r2 = r7 + r8
        L_0x001d:
            r3 = r2
            r2 = r7
        L_0x001f:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r4 = r6.f6383E
            r4.mo7624e(r2)
            r4 = 1
            if (r9 == r4) goto L_0x003e
            r5 = 2
            if (r9 == r5) goto L_0x0038
            if (r9 == r1) goto L_0x002d
            goto L_0x0043
        L_0x002d:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r9 = r6.f6383E
            r9.mo7621b(r7, r4)
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r7 = r6.f6383E
            r7.mo7617a(r8, r4)
            goto L_0x0043
        L_0x0038:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r9 = r6.f6383E
            r9.mo7621b(r7, r8)
            goto L_0x0043
        L_0x003e:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r9 = r6.f6383E
            r9.mo7617a(r7, r8)
        L_0x0043:
            if (r3 > r0) goto L_0x0046
            return
        L_0x0046:
            boolean r7 = r6.f6379A
            if (r7 == 0) goto L_0x004f
            int r7 = r6.mo7589O()
            goto L_0x0053
        L_0x004f:
            int r7 = r6.mo7591Q()
        L_0x0053:
            if (r2 > r7) goto L_0x0058
            r6.mo7401F()
        L_0x0058:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.m8878b(int, int, int):void");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo7599a(State state, C1671b bVar) {
        int i;
        int i2;
        boolean z = false;
        if (!state.isPreLayout()) {
            int i3 = this.f6381C;
            if (i3 != -1) {
                if (i3 < 0 || i3 >= state.getItemCount()) {
                    this.f6381C = -1;
                    this.f6382D = Integer.MIN_VALUE;
                } else {
                    SavedState savedState = this.f6387I;
                    if (savedState == null || savedState.mAnchorPosition == -1 || savedState.mSpanOffsetsSize < 1) {
                        View c = mo6989c(this.f6381C);
                        if (c != null) {
                            if (this.f6379A) {
                                i = mo7591Q();
                            } else {
                                i = mo7589O();
                            }
                            bVar.f6411a = i;
                            if (this.f6382D != Integer.MIN_VALUE) {
                                if (bVar.f6413c) {
                                    bVar.f6412b = (this.f6397u.mo8015b() - this.f6382D) - this.f6397u.mo8012a(c);
                                } else {
                                    bVar.f6412b = (this.f6397u.mo8025g() + this.f6382D) - this.f6397u.mo8019d(c);
                                }
                                return true;
                            } else if (this.f6397u.mo8016b(c) > this.f6397u.mo8026h()) {
                                if (bVar.f6413c) {
                                    i2 = this.f6397u.mo8015b();
                                } else {
                                    i2 = this.f6397u.mo8025g();
                                }
                                bVar.f6412b = i2;
                                return true;
                            } else {
                                int d = this.f6397u.mo8019d(c) - this.f6397u.mo8025g();
                                if (d < 0) {
                                    bVar.f6412b = -d;
                                    return true;
                                }
                                int b = this.f6397u.mo8015b() - this.f6397u.mo8012a(c);
                                if (b < 0) {
                                    bVar.f6412b = b;
                                    return true;
                                }
                                bVar.f6412b = Integer.MIN_VALUE;
                            }
                        } else {
                            bVar.f6411a = this.f6381C;
                            int i4 = this.f6382D;
                            if (i4 == Integer.MIN_VALUE) {
                                if (m8889n(bVar.f6411a) == 1) {
                                    z = true;
                                }
                                bVar.f6413c = z;
                                bVar.mo7639a();
                            } else {
                                bVar.mo7640a(i4);
                            }
                            bVar.f6414d = true;
                        }
                    } else {
                        bVar.f6412b = Integer.MIN_VALUE;
                        bVar.f6411a = this.f6381C;
                    }
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: b */
    private void m8880b(C1664w wVar, int i) {
        while (mo7467e() > 0) {
            View d = mo7462d(0);
            if (this.f6397u.mo8012a(d) > i || this.f6397u.mo8022e(d) > i) {
                break;
            }
            C1672c cVar = (C1672c) d.getLayoutParams();
            if (cVar.f6420f) {
                int i2 = 0;
                while (i2 < this.f6395s) {
                    if (this.f6396t[i2].f6422a.size() != 1) {
                        i2++;
                    } else {
                        return;
                    }
                }
                for (int i3 = 0; i3 < this.f6395s; i3++) {
                    this.f6396t[i3].mo7672o();
                }
            } else if (cVar.f6419e.f6422a.size() != 1) {
                cVar.f6419e.mo7672o();
            } else {
                return;
            }
            mo7446b(d, wVar);
        }
    }

    /* renamed from: b */
    public boolean mo6987b() {
        return this.f6399w == 1;
    }

    /* renamed from: b */
    public int mo6925b(int i, C1664w wVar, State state) {
        return mo7603c(i, wVar, state);
    }

    /* renamed from: c */
    private boolean m8884c(State state, C1671b bVar) {
        int i;
        if (this.f6385G) {
            i = m8894s(state.getItemCount());
        } else {
            i = m8893r(state.getItemCount());
        }
        bVar.f6411a = i;
        bVar.f6412b = Integer.MIN_VALUE;
        return true;
    }

    /* renamed from: c */
    public int[] mo7604c(int[] iArr) {
        if (iArr == null) {
            iArr = new int[this.f6395s];
        } else if (iArr.length < this.f6395s) {
            StringBuilder sb = new StringBuilder();
            sb.append("Provided int[]'s size must be more than or equal to span count. Expected:");
            sb.append(this.f6395s);
            sb.append(", array size:");
            sb.append(iArr.length);
            throw new IllegalArgumentException(sb.toString());
        }
        for (int i = 0; i < this.f6395s; i++) {
            iArr[i] = this.f6396t[i].mo7664g();
        }
        return iArr;
    }

    /* renamed from: c */
    public int mo6930c(State state) {
        return m8888j(state);
    }

    /* renamed from: c */
    private int m8882c(int i, int i2, int i3) {
        if (i2 == 0 && i3 == 0) {
            return i;
        }
        int mode = MeasureSpec.getMode(i);
        if (mode == Integer.MIN_VALUE || mode == 1073741824) {
            return MeasureSpec.makeMeasureSpec(Math.max(0, (MeasureSpec.getSize(i) - i2) - i3), mode);
        }
        return i;
    }

    /* renamed from: a */
    public int[] mo7600a(int[] iArr) {
        if (iArr == null) {
            iArr = new int[this.f6395s];
        } else if (iArr.length < this.f6395s) {
            StringBuilder sb = new StringBuilder();
            sb.append("Provided int[]'s size must be more than or equal to span count. Expected:");
            sb.append(this.f6395s);
            sb.append(", array size:");
            sb.append(iArr.length);
            throw new IllegalArgumentException(sb.toString());
        }
        for (int i = 0; i < this.f6395s; i++) {
            iArr[i] = this.f6396t[i].mo7660d();
        }
        return iArr;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public int mo7603c(int i, C1664w wVar, State state) {
        if (mo7467e() == 0 || i == 0) {
            return 0;
        }
        mo7598a(i, state);
        int a = m8867a(wVar, this.f6401y, state);
        if (this.f6401y.f6846b >= a) {
            i = i < 0 ? -a : a;
        }
        this.f6397u.mo8013a(-i);
        this.f6385G = this.f6379A;
        C1760p pVar = this.f6401y;
        pVar.f6846b = 0;
        m8874a(wVar, pVar);
        return i;
    }

    /* renamed from: a */
    public int mo6971a(State state) {
        return m8886h(state);
    }

    /* renamed from: a */
    private void m8871a(View view, C1672c cVar, boolean z) {
        if (cVar.f6420f) {
            if (this.f6399w == 1) {
                m8869a(view, this.f6388J, C1651o.m8610a(mo7478h(), mo7481i(), mo7501s() + mo7491n(), cVar.height, true), z);
            } else {
                m8869a(view, C1651o.m8610a(mo7503t(), mo7505u(), mo7495p() + mo7497q(), cVar.width, true), this.f6388J, z);
            }
        } else if (this.f6399w == 1) {
            m8869a(view, C1651o.m8610a(this.f6400x, mo7505u(), 0, cVar.width, false), C1651o.m8610a(mo7478h(), mo7481i(), mo7501s() + mo7491n(), cVar.height, true), z);
        } else {
            m8869a(view, C1651o.m8610a(mo7503t(), mo7505u(), mo7495p() + mo7497q(), cVar.width, true), C1651o.m8610a(this.f6400x, mo7481i(), 0, cVar.height, false), z);
        }
    }

    /* renamed from: c */
    public C1656p mo6931c() {
        if (this.f6399w == 0) {
            return new C1672c(-2, -1);
        }
        return new C1672c(-1, -2);
    }

    /* renamed from: a */
    private void m8869a(View view, int i, int i2, boolean z) {
        boolean z2;
        mo7411a(view, this.f6389K);
        C1672c cVar = (C1672c) view.getLayoutParams();
        int i3 = cVar.leftMargin;
        Rect rect = this.f6389K;
        int c = m8882c(i, i3 + rect.left, cVar.rightMargin + rect.right);
        int i4 = cVar.topMargin;
        Rect rect2 = this.f6389K;
        int c2 = m8882c(i2, i4 + rect2.top, cVar.bottomMargin + rect2.bottom);
        if (z) {
            z2 = mo7451b(view, c, c2, cVar);
        } else {
            z2 = mo7428a(view, c, c2, (C1656p) cVar);
        }
        if (z2) {
            view.measure(c, c2);
        }
    }

    /* renamed from: a */
    public void mo6978a(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            this.f6387I = (SavedState) parcelable;
            mo7401F();
        }
    }

    /* renamed from: a */
    public void mo6917a(C1664w wVar, State state, View view, C1016d dVar) {
        LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof C1672c)) {
            super.mo7412a(view, dVar);
            return;
        }
        C1672c cVar = (C1672c) layoutParams;
        if (this.f6399w == 0) {
            dVar.mo4949b((Object) C1019c.m5966a(cVar.mo7644h(), cVar.f6420f ? this.f6395s : 1, -1, -1, false, false));
        } else {
            dVar.mo4949b((Object) C1019c.m5966a(-1, -1, cVar.mo7644h(), cVar.f6420f ? this.f6395s : 1, false, false));
        }
    }

    /* renamed from: a */
    public void mo6980a(AccessibilityEvent accessibilityEvent) {
        super.mo6980a(accessibilityEvent);
        if (mo7467e() > 0) {
            View e = mo7607e(false);
            View d = mo7605d(false);
            if (e != null && d != null) {
                int p = mo7496p(e);
                int p2 = mo7496p(d);
                if (p < p2) {
                    accessibilityEvent.setFromIndex(p);
                    accessibilityEvent.setToIndex(p2);
                    return;
                }
                accessibilityEvent.setFromIndex(p2);
                accessibilityEvent.setToIndex(p);
            }
        }
    }

    /* renamed from: a */
    public int mo6909a(C1664w wVar, State state) {
        if (this.f6399w == 1) {
            return this.f6395s;
        }
        return super.mo6909a(wVar, state);
    }

    /* renamed from: a */
    private void m8873a(C1664w wVar, State state, boolean z) {
        int t = m8895t(Integer.MIN_VALUE);
        if (t != Integer.MIN_VALUE) {
            int b = this.f6397u.mo8015b() - t;
            if (b > 0) {
                int i = b - (-mo7603c(-b, wVar, state));
                if (z && i > 0) {
                    this.f6397u.mo8013a(i);
                }
            }
        }
    }

    /* renamed from: a */
    public void mo6920a(RecyclerView recyclerView, int i, int i2) {
        m8878b(i, i2, 1);
    }

    /* renamed from: a */
    public void mo6921a(RecyclerView recyclerView, int i, int i2, int i3) {
        m8878b(i, i2, 8);
    }

    /* renamed from: a */
    public void mo6922a(RecyclerView recyclerView, int i, int i2, Object obj) {
        m8878b(i, i2, 4);
    }

    /* JADX WARNING: type inference failed for: r9v0 */
    /* JADX WARNING: type inference failed for: r9v1, types: [int, boolean] */
    /* JADX WARNING: type inference failed for: r9v4 */
    /* JADX WARNING: type inference failed for: r9v9 */
    /* JADX WARNING: type inference failed for: r9v10 */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r9v1, types: [int, boolean]
      assigns: []
      uses: [boolean, int, ?[int, short, byte, char]]
      mth insns count: 222
    	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
    	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
    	at jadx.core.ProcessClass.process(ProcessClass.java:30)
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
    	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
     */
    /* JADX WARNING: Unknown variable types count: 3 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int m8867a(androidx.recyclerview.widget.RecyclerView.C1664w r17, androidx.recyclerview.widget.C1760p r18, androidx.recyclerview.widget.RecyclerView.State r19) {
        /*
            r16 = this;
            r6 = r16
            r7 = r17
            r8 = r18
            java.util.BitSet r0 = r6.f6380B
            int r1 = r6.f6395s
            r9 = 0
            r10 = 1
            r0.set(r9, r1, r10)
            androidx.recyclerview.widget.p r0 = r6.f6401y
            boolean r0 = r0.f6853i
            if (r0 == 0) goto L_0x0025
            int r0 = r8.f6849e
            if (r0 != r10) goto L_0x0020
            r0 = 2147483647(0x7fffffff, float:NaN)
            r11 = 2147483647(0x7fffffff, float:NaN)
            goto L_0x0035
        L_0x0020:
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r11 = -2147483648(0xffffffff80000000, float:-0.0)
            goto L_0x0035
        L_0x0025:
            int r0 = r8.f6849e
            if (r0 != r10) goto L_0x002f
            int r0 = r8.f6851g
            int r1 = r8.f6846b
            int r0 = r0 + r1
            goto L_0x0034
        L_0x002f:
            int r0 = r8.f6850f
            int r1 = r8.f6846b
            int r0 = r0 - r1
        L_0x0034:
            r11 = r0
        L_0x0035:
            int r0 = r8.f6849e
            r6.m8885f(r0, r11)
            boolean r0 = r6.f6379A
            if (r0 == 0) goto L_0x0045
            androidx.recyclerview.widget.w r0 = r6.f6397u
            int r0 = r0.mo8015b()
            goto L_0x004b
        L_0x0045:
            androidx.recyclerview.widget.w r0 = r6.f6397u
            int r0 = r0.mo8025g()
        L_0x004b:
            r12 = r0
            r0 = 0
        L_0x004d:
            boolean r1 = r18.mo7986a(r19)
            r2 = -1
            if (r1 == 0) goto L_0x01ce
            androidx.recyclerview.widget.p r1 = r6.f6401y
            boolean r1 = r1.f6853i
            if (r1 != 0) goto L_0x0062
            java.util.BitSet r1 = r6.f6380B
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L_0x01ce
        L_0x0062:
            android.view.View r13 = r8.mo7985a(r7)
            android.view.ViewGroup$LayoutParams r0 = r13.getLayoutParams()
            r14 = r0
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r14 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.C1672c) r14
            int r0 = r14.mo7519b()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r1 = r6.f6383E
            int r1 = r1.mo7623d(r0)
            if (r1 != r2) goto L_0x007b
            r3 = 1
            goto L_0x007c
        L_0x007b:
            r3 = 0
        L_0x007c:
            if (r3 == 0) goto L_0x0091
            boolean r1 = r14.f6420f
            if (r1 == 0) goto L_0x0087
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d[] r1 = r6.f6396t
            r1 = r1[r9]
            goto L_0x008b
        L_0x0087:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r1 = r6.m8868a(r8)
        L_0x008b:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r4 = r6.f6383E
            r4.mo7618a(r0, r1)
            goto L_0x0095
        L_0x0091:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d[] r4 = r6.f6396t
            r1 = r4[r1]
        L_0x0095:
            r15 = r1
            r14.f6419e = r15
            int r1 = r8.f6849e
            if (r1 != r10) goto L_0x00a0
            r6.mo7441b(r13)
            goto L_0x00a3
        L_0x00a0:
            r6.mo7442b(r13, r9)
        L_0x00a3:
            r6.m8871a(r13, r14, r9)
            int r1 = r8.f6849e
            if (r1 != r10) goto L_0x00d4
            boolean r1 = r14.f6420f
            if (r1 == 0) goto L_0x00b3
            int r1 = r6.m8895t(r12)
            goto L_0x00b7
        L_0x00b3:
            int r1 = r15.mo7646a(r12)
        L_0x00b7:
            androidx.recyclerview.widget.w r4 = r6.f6397u
            int r4 = r4.mo8016b(r13)
            int r4 = r4 + r1
            if (r3 == 0) goto L_0x00d1
            boolean r5 = r14.f6420f
            if (r5 == 0) goto L_0x00d1
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem r5 = r6.m8891p(r1)
            r5.f6409b = r2
            r5.f6408a = r0
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r9 = r6.f6383E
            r9.mo7619a(r5)
        L_0x00d1:
            r5 = r4
            r4 = r1
            goto L_0x00fd
        L_0x00d4:
            boolean r1 = r14.f6420f
            if (r1 == 0) goto L_0x00dd
            int r1 = r6.m8898w(r12)
            goto L_0x00e1
        L_0x00dd:
            int r1 = r15.mo7653b(r12)
        L_0x00e1:
            androidx.recyclerview.widget.w r4 = r6.f6397u
            int r4 = r4.mo8016b(r13)
            int r4 = r1 - r4
            if (r3 == 0) goto L_0x00fc
            boolean r5 = r14.f6420f
            if (r5 == 0) goto L_0x00fc
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem r5 = r6.m8892q(r1)
            r5.f6409b = r10
            r5.f6408a = r0
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r9 = r6.f6383E
            r9.mo7619a(r5)
        L_0x00fc:
            r5 = r1
        L_0x00fd:
            boolean r1 = r14.f6420f
            if (r1 == 0) goto L_0x0126
            int r1 = r8.f6848d
            if (r1 != r2) goto L_0x0126
            if (r3 == 0) goto L_0x010a
            r6.f6391M = r10
            goto L_0x0126
        L_0x010a:
            int r1 = r8.f6849e
            if (r1 != r10) goto L_0x0113
            boolean r1 = r16.mo7585K()
            goto L_0x0117
        L_0x0113:
            boolean r1 = r16.mo7586L()
        L_0x0117:
            r1 = r1 ^ r10
            if (r1 == 0) goto L_0x0126
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r1 = r6.f6383E
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem r0 = r1.mo7622c(r0)
            if (r0 == 0) goto L_0x0124
            r0.f6407O = r10
        L_0x0124:
            r6.f6391M = r10
        L_0x0126:
            r6.m8870a(r13, r14, r8)
            boolean r0 = r16.mo7597W()
            if (r0 == 0) goto L_0x015a
            int r0 = r6.f6399w
            if (r0 != r10) goto L_0x015a
            boolean r0 = r14.f6420f
            if (r0 == 0) goto L_0x013e
            androidx.recyclerview.widget.w r0 = r6.f6398v
            int r0 = r0.mo8015b()
            goto L_0x014f
        L_0x013e:
            androidx.recyclerview.widget.w r0 = r6.f6398v
            int r0 = r0.mo8015b()
            int r1 = r6.f6395s
            int r1 = r1 - r10
            int r2 = r15.f6426e
            int r1 = r1 - r2
            int r2 = r6.f6400x
            int r1 = r1 * r2
            int r0 = r0 - r1
        L_0x014f:
            androidx.recyclerview.widget.w r1 = r6.f6398v
            int r1 = r1.mo8016b(r13)
            int r1 = r0 - r1
            r9 = r0
            r3 = r1
            goto L_0x017b
        L_0x015a:
            boolean r0 = r14.f6420f
            if (r0 == 0) goto L_0x0165
            androidx.recyclerview.widget.w r0 = r6.f6398v
            int r0 = r0.mo8025g()
            goto L_0x0172
        L_0x0165:
            int r0 = r15.f6426e
            int r1 = r6.f6400x
            int r0 = r0 * r1
            androidx.recyclerview.widget.w r1 = r6.f6398v
            int r1 = r1.mo8025g()
            int r0 = r0 + r1
        L_0x0172:
            androidx.recyclerview.widget.w r1 = r6.f6398v
            int r1 = r1.mo8016b(r13)
            int r1 = r1 + r0
            r3 = r0
            r9 = r1
        L_0x017b:
            int r0 = r6.f6399w
            if (r0 != r10) goto L_0x0189
            r0 = r16
            r1 = r13
            r2 = r3
            r3 = r4
            r4 = r9
            r0.mo7444b(r1, r2, r3, r4, r5)
            goto L_0x0192
        L_0x0189:
            r0 = r16
            r1 = r13
            r2 = r4
            r4 = r5
            r5 = r9
            r0.mo7444b(r1, r2, r3, r4, r5)
        L_0x0192:
            boolean r0 = r14.f6420f
            if (r0 == 0) goto L_0x019e
            androidx.recyclerview.widget.p r0 = r6.f6401y
            int r0 = r0.f6849e
            r6.m8885f(r0, r11)
            goto L_0x01a5
        L_0x019e:
            androidx.recyclerview.widget.p r0 = r6.f6401y
            int r0 = r0.f6849e
            r6.m8876a(r15, r0, r11)
        L_0x01a5:
            androidx.recyclerview.widget.p r0 = r6.f6401y
            r6.m8874a(r7, r0)
            androidx.recyclerview.widget.p r0 = r6.f6401y
            boolean r0 = r0.f6852h
            if (r0 == 0) goto L_0x01c9
            boolean r0 = r13.hasFocusable()
            if (r0 == 0) goto L_0x01c9
            boolean r0 = r14.f6420f
            if (r0 == 0) goto L_0x01c0
            java.util.BitSet r0 = r6.f6380B
            r0.clear()
            goto L_0x01c9
        L_0x01c0:
            java.util.BitSet r0 = r6.f6380B
            int r1 = r15.f6426e
            r3 = 0
            r0.set(r1, r3)
            goto L_0x01ca
        L_0x01c9:
            r3 = 0
        L_0x01ca:
            r0 = 1
            r9 = 0
            goto L_0x004d
        L_0x01ce:
            r3 = 0
            if (r0 != 0) goto L_0x01d6
            androidx.recyclerview.widget.p r0 = r6.f6401y
            r6.m8874a(r7, r0)
        L_0x01d6:
            androidx.recyclerview.widget.p r0 = r6.f6401y
            int r0 = r0.f6849e
            if (r0 != r2) goto L_0x01ee
            androidx.recyclerview.widget.w r0 = r6.f6397u
            int r0 = r0.mo8025g()
            int r0 = r6.m8898w(r0)
            androidx.recyclerview.widget.w r1 = r6.f6397u
            int r1 = r1.mo8025g()
            int r1 = r1 - r0
            goto L_0x0200
        L_0x01ee:
            androidx.recyclerview.widget.w r0 = r6.f6397u
            int r0 = r0.mo8015b()
            int r0 = r6.m8895t(r0)
            androidx.recyclerview.widget.w r1 = r6.f6397u
            int r1 = r1.mo8015b()
            int r1 = r0 - r1
        L_0x0200:
            if (r1 <= 0) goto L_0x0209
            int r0 = r8.f6846b
            int r9 = java.lang.Math.min(r0, r1)
            r3 = r9
        L_0x0209:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.m8867a(androidx.recyclerview.widget.RecyclerView$w, androidx.recyclerview.widget.p, androidx.recyclerview.widget.RecyclerView$State):int");
    }

    /* renamed from: a */
    private void m8870a(View view, C1672c cVar, C1760p pVar) {
        if (pVar.f6849e == 1) {
            if (cVar.f6420f) {
                m8899w(view);
            } else {
                cVar.f6419e.mo7651a(view);
            }
        } else if (cVar.f6420f) {
            m8900x(view);
        } else {
            cVar.f6419e.mo7659c(view);
        }
    }

    /* renamed from: a */
    private void m8874a(C1664w wVar, C1760p pVar) {
        int i;
        int i2;
        if (pVar.f6845a && !pVar.f6853i) {
            if (pVar.f6846b == 0) {
                if (pVar.f6849e == -1) {
                    m8872a(wVar, pVar.f6851g);
                } else {
                    m8880b(wVar, pVar.f6850f);
                }
            } else if (pVar.f6849e == -1) {
                int i3 = pVar.f6850f;
                int u = i3 - m8896u(i3);
                if (u < 0) {
                    i2 = pVar.f6851g;
                } else {
                    i2 = pVar.f6851g - Math.min(u, pVar.f6846b);
                }
                m8872a(wVar, i2);
            } else {
                int v = m8897v(pVar.f6851g) - pVar.f6851g;
                if (v < 0) {
                    i = pVar.f6850f;
                } else {
                    i = Math.min(v, pVar.f6846b) + pVar.f6850f;
                }
                m8880b(wVar, i);
            }
        }
    }

    /* renamed from: a */
    private void m8876a(C1673d dVar, int i, int i2) {
        int j = dVar.mo7667j();
        if (i == -1) {
            if (dVar.mo7669l() + j <= i2) {
                this.f6380B.set(dVar.f6426e, false);
            }
        } else if (dVar.mo7668k() - j >= i2) {
            this.f6380B.set(dVar.f6426e, false);
        }
    }

    /* renamed from: a */
    private void m8872a(C1664w wVar, int i) {
        for (int e = mo7467e() - 1; e >= 0; e--) {
            View d = mo7462d(e);
            if (this.f6397u.mo8019d(d) < i || this.f6397u.mo8024f(d) < i) {
                break;
            }
            C1672c cVar = (C1672c) d.getLayoutParams();
            if (cVar.f6420f) {
                int i2 = 0;
                while (i2 < this.f6395s) {
                    if (this.f6396t[i2].f6422a.size() != 1) {
                        i2++;
                    } else {
                        return;
                    }
                }
                for (int i3 = 0; i3 < this.f6395s; i3++) {
                    this.f6396t[i3].mo7671n();
                }
            } else if (cVar.f6419e.f6422a.size() != 1) {
                cVar.f6419e.mo7671n();
            } else {
                return;
            }
            mo7446b(d, wVar);
        }
    }

    /* renamed from: a */
    private C1673d m8868a(C1760p pVar) {
        int i;
        int i2;
        int i3 = -1;
        if (m8901x(pVar.f6849e)) {
            i2 = this.f6395s - 1;
            i = -1;
        } else {
            i2 = 0;
            i3 = this.f6395s;
            i = 1;
        }
        C1673d dVar = null;
        if (pVar.f6849e == 1) {
            int i4 = Integer.MAX_VALUE;
            int g = this.f6397u.mo8025g();
            while (i2 != i3) {
                C1673d dVar2 = this.f6396t[i2];
                int a = dVar2.mo7646a(g);
                if (a < i4) {
                    dVar = dVar2;
                    i4 = a;
                }
                i2 += i;
            }
            return dVar;
        }
        int i5 = Integer.MIN_VALUE;
        int b = this.f6397u.mo8015b();
        while (i2 != i3) {
            C1673d dVar3 = this.f6396t[i2];
            int b2 = dVar3.mo7653b(b);
            if (b2 > i5) {
                dVar = dVar3;
                i5 = b2;
            }
            i2 += i;
        }
        return dVar;
    }

    /* renamed from: a */
    public boolean mo6983a() {
        return this.f6399w == 0;
    }

    /* renamed from: a */
    public int mo6908a(int i, C1664w wVar, State state) {
        return mo7603c(i, wVar, state);
    }

    /* renamed from: a */
    public PointF mo6973a(int i) {
        int n = m8889n(i);
        PointF pointF = new PointF();
        if (n == 0) {
            return null;
        }
        if (this.f6399w == 0) {
            pointF.x = (float) n;
            pointF.y = 0.0f;
        } else {
            pointF.x = 0.0f;
            pointF.y = (float) n;
        }
        return pointF;
    }

    /* renamed from: a */
    public void mo6982a(RecyclerView recyclerView, State state, int i) {
        C1761q qVar = new C1761q(recyclerView.getContext());
        qVar.mo7225d(i);
        mo7447b((C1627a0) qVar);
    }

    @C0207n0({C0208a.LIBRARY})
    /* renamed from: a */
    public void mo6976a(int i, int i2, State state, C1654c cVar) {
        int i3;
        int i4;
        if (this.f6399w != 0) {
            i = i2;
        }
        if (mo7467e() != 0 && i != 0) {
            mo7598a(i, state);
            int[] iArr = this.f6393O;
            if (iArr == null || iArr.length < this.f6395s) {
                this.f6393O = new int[this.f6395s];
            }
            int i5 = 0;
            for (int i6 = 0; i6 < this.f6395s; i6++) {
                C1760p pVar = this.f6401y;
                if (pVar.f6848d == -1) {
                    i4 = pVar.f6850f;
                    i3 = this.f6396t[i6].mo7653b(i4);
                } else {
                    i4 = this.f6396t[i6].mo7646a(pVar.f6851g);
                    i3 = this.f6401y.f6851g;
                }
                int i7 = i4 - i3;
                if (i7 >= 0) {
                    this.f6393O[i5] = i7;
                    i5++;
                }
            }
            Arrays.sort(this.f6393O, 0, i5);
            for (int i8 = 0; i8 < i5 && this.f6401y.mo7986a(state); i8++) {
                cVar.mo7517a(this.f6401y.f6847c, this.f6393O[i8]);
                C1760p pVar2 = this.f6401y;
                pVar2.f6847c += pVar2.f6848d;
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo7598a(int i, State state) {
        int i2;
        int i3;
        if (i > 0) {
            i3 = mo7591Q();
            i2 = 1;
        } else {
            i3 = mo7589O();
            i2 = -1;
        }
        this.f6401y.f6845a = true;
        m8879b(i3, state);
        m8902y(i2);
        C1760p pVar = this.f6401y;
        pVar.f6847c = i3 + pVar.f6848d;
        pVar.f6846b = Math.abs(i);
    }

    /* renamed from: a */
    public C1656p mo6912a(Context context, AttributeSet attributeSet) {
        return new C1672c(context, attributeSet);
    }

    /* renamed from: a */
    public C1656p mo6913a(LayoutParams layoutParams) {
        if (layoutParams instanceof MarginLayoutParams) {
            return new C1672c((MarginLayoutParams) layoutParams);
        }
        return new C1672c(layoutParams);
    }

    /* renamed from: a */
    public boolean mo6923a(C1656p pVar) {
        return pVar instanceof C1672c;
    }

    @C0195i0
    /* renamed from: a */
    public View mo6910a(View view, int i, C1664w wVar, State state) {
        int i2;
        int i3;
        int i4;
        int i5;
        if (mo7467e() == 0) {
            return null;
        }
        View f = mo7471f(view);
        if (f == null) {
            return null;
        }
        m8866Z();
        int o = m8890o(i);
        if (o == Integer.MIN_VALUE) {
            return null;
        }
        C1672c cVar = (C1672c) f.getLayoutParams();
        boolean z = cVar.f6420f;
        C1673d dVar = cVar.f6419e;
        if (o == 1) {
            i2 = mo7591Q();
        } else {
            i2 = mo7589O();
        }
        m8879b(i2, state);
        m8902y(o);
        C1760p pVar = this.f6401y;
        pVar.f6847c = pVar.f6848d + i2;
        pVar.f6846b = (int) (((float) this.f6397u.mo8026h()) * f6378Y);
        C1760p pVar2 = this.f6401y;
        pVar2.f6852h = true;
        pVar2.f6845a = false;
        m8867a(wVar, pVar2, state);
        this.f6385G = this.f6379A;
        if (!z) {
            View a = dVar.mo7649a(i2, o);
            if (!(a == null || a == f)) {
                return a;
            }
        }
        if (m8901x(o)) {
            for (int i6 = this.f6395s - 1; i6 >= 0; i6--) {
                View a2 = this.f6396t[i6].mo7649a(i2, o);
                if (a2 != null && a2 != f) {
                    return a2;
                }
            }
        } else {
            for (int i7 = 0; i7 < this.f6395s; i7++) {
                View a3 = this.f6396t[i7].mo7649a(i2, o);
                if (a3 != null && a3 != f) {
                    return a3;
                }
            }
        }
        boolean z2 = (this.f6402z ^ true) == (o == -1);
        if (!z) {
            if (z2) {
                i5 = dVar.mo7662e();
            } else {
                i5 = dVar.mo7665h();
            }
            View c = mo6989c(i5);
            if (!(c == null || c == f)) {
                return c;
            }
        }
        if (m8901x(o)) {
            for (int i8 = this.f6395s - 1; i8 >= 0; i8--) {
                if (i8 != dVar.f6426e) {
                    if (z2) {
                        i4 = this.f6396t[i8].mo7662e();
                    } else {
                        i4 = this.f6396t[i8].mo7665h();
                    }
                    View c2 = mo6989c(i4);
                    if (!(c2 == null || c2 == f)) {
                        return c2;
                    }
                }
            }
        } else {
            for (int i9 = 0; i9 < this.f6395s; i9++) {
                if (z2) {
                    i3 = this.f6396t[i9].mo7662e();
                } else {
                    i3 = this.f6396t[i9].mo7665h();
                }
                View c3 = mo6989c(i3);
                if (c3 != null && c3 != f) {
                    return c3;
                }
            }
        }
        return null;
    }
}
