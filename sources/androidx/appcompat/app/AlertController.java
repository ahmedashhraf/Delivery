package androidx.appcompat.app;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnDismissListener;
import android.content.DialogInterface.OnKeyListener;
import android.content.DialogInterface.OnMultiChoiceClickListener;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckedTextView;
import android.widget.CursorAdapter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import androidx.annotation.C0195i0;
import androidx.appcompat.C0238R;
import androidx.appcompat.widget.C0490e0.C0492b;
import androidx.core.p034l.C0962e0;
import androidx.core.widget.NestedScrollView;
import androidx.core.widget.NestedScrollView.C1103b;
import java.lang.ref.WeakReference;

class AlertController {

    /* renamed from: A */
    NestedScrollView f645A;

    /* renamed from: B */
    private int f646B = 0;

    /* renamed from: C */
    private Drawable f647C;

    /* renamed from: D */
    private ImageView f648D;

    /* renamed from: E */
    private TextView f649E;

    /* renamed from: F */
    private TextView f650F;

    /* renamed from: G */
    private View f651G;

    /* renamed from: H */
    ListAdapter f652H;

    /* renamed from: I */
    int f653I = -1;

    /* renamed from: J */
    private int f654J;

    /* renamed from: K */
    private int f655K;

    /* renamed from: L */
    int f656L;

    /* renamed from: M */
    int f657M;

    /* renamed from: N */
    int f658N;

    /* renamed from: O */
    int f659O;

    /* renamed from: P */
    private boolean f660P;

    /* renamed from: Q */
    private int f661Q = 0;

    /* renamed from: R */
    Handler f662R;

    /* renamed from: S */
    private final OnClickListener f663S = new C0244a();

    /* renamed from: a */
    private final Context f664a;

    /* renamed from: b */
    final C0299g f665b;

    /* renamed from: c */
    private final Window f666c;

    /* renamed from: d */
    private final int f667d;

    /* renamed from: e */
    private CharSequence f668e;

    /* renamed from: f */
    private CharSequence f669f;

    /* renamed from: g */
    ListView f670g;

    /* renamed from: h */
    private View f671h;

    /* renamed from: i */
    private int f672i;

    /* renamed from: j */
    private int f673j;

    /* renamed from: k */
    private int f674k;

    /* renamed from: l */
    private int f675l;

    /* renamed from: m */
    private int f676m;

    /* renamed from: n */
    private boolean f677n = false;

    /* renamed from: o */
    Button f678o;

    /* renamed from: p */
    private CharSequence f679p;

    /* renamed from: q */
    Message f680q;

    /* renamed from: r */
    private Drawable f681r;

    /* renamed from: s */
    Button f682s;

    /* renamed from: t */
    private CharSequence f683t;

    /* renamed from: u */
    Message f684u;

    /* renamed from: v */
    private Drawable f685v;

    /* renamed from: w */
    Button f686w;

    /* renamed from: x */
    private CharSequence f687x;

    /* renamed from: y */
    Message f688y;

    /* renamed from: z */
    private Drawable f689z;

    public static class RecycleListView extends ListView {

        /* renamed from: a */
        private final int f690a;

        /* renamed from: b */
        private final int f691b;

        public RecycleListView(Context context) {
            this(context, null);
        }

        /* renamed from: a */
        public void mo708a(boolean z, boolean z2) {
            if (!z2 || !z) {
                setPadding(getPaddingLeft(), z ? getPaddingTop() : this.f690a, getPaddingRight(), z2 ? getPaddingBottom() : this.f691b);
            }
        }

        public RecycleListView(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0238R.styleable.RecycleListView);
            this.f691b = obtainStyledAttributes.getDimensionPixelOffset(C0238R.styleable.RecycleListView_paddingBottomNoButtons, -1);
            this.f690a = obtainStyledAttributes.getDimensionPixelOffset(C0238R.styleable.RecycleListView_paddingTopNoTitle, -1);
        }
    }

    /* renamed from: androidx.appcompat.app.AlertController$a */
    class C0244a implements OnClickListener {
        C0244a() {
        }

        /* JADX WARNING: Removed duplicated region for block: B:17:0x0030  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onClick(android.view.View r3) {
            /*
                r2 = this;
                androidx.appcompat.app.AlertController r0 = androidx.appcompat.app.AlertController.this
                android.widget.Button r1 = r0.f678o
                if (r3 != r1) goto L_0x000f
                android.os.Message r0 = r0.f680q
                if (r0 == 0) goto L_0x000f
                android.os.Message r3 = android.os.Message.obtain(r0)
                goto L_0x002e
            L_0x000f:
                androidx.appcompat.app.AlertController r0 = androidx.appcompat.app.AlertController.this
                android.widget.Button r1 = r0.f682s
                if (r3 != r1) goto L_0x001e
                android.os.Message r0 = r0.f684u
                if (r0 == 0) goto L_0x001e
                android.os.Message r3 = android.os.Message.obtain(r0)
                goto L_0x002e
            L_0x001e:
                androidx.appcompat.app.AlertController r0 = androidx.appcompat.app.AlertController.this
                android.widget.Button r1 = r0.f686w
                if (r3 != r1) goto L_0x002d
                android.os.Message r3 = r0.f688y
                if (r3 == 0) goto L_0x002d
                android.os.Message r3 = android.os.Message.obtain(r3)
                goto L_0x002e
            L_0x002d:
                r3 = 0
            L_0x002e:
                if (r3 == 0) goto L_0x0033
                r3.sendToTarget()
            L_0x0033:
                androidx.appcompat.app.AlertController r3 = androidx.appcompat.app.AlertController.this
                android.os.Handler r0 = r3.f662R
                r1 = 1
                androidx.appcompat.app.g r3 = r3.f665b
                android.os.Message r3 = r0.obtainMessage(r1, r3)
                r3.sendToTarget()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AlertController.C0244a.onClick(android.view.View):void");
        }
    }

    /* renamed from: androidx.appcompat.app.AlertController$b */
    class C0245b implements C1103b {

        /* renamed from: a */
        final /* synthetic */ View f693a;

        /* renamed from: b */
        final /* synthetic */ View f694b;

        C0245b(View view, View view2) {
            this.f693a = view;
            this.f694b = view2;
        }

        /* renamed from: a */
        public void mo710a(NestedScrollView nestedScrollView, int i, int i2, int i3, int i4) {
            AlertController.m1113a(nestedScrollView, this.f693a, this.f694b);
        }
    }

    /* renamed from: androidx.appcompat.app.AlertController$c */
    class C0246c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ View f697a;

        /* renamed from: b */
        final /* synthetic */ View f698b;

        C0246c(View view, View view2) {
            this.f697a = view;
            this.f698b = view2;
        }

        public void run() {
            AlertController.m1113a(AlertController.this.f645A, this.f697a, this.f698b);
        }
    }

    /* renamed from: androidx.appcompat.app.AlertController$d */
    class C0247d implements OnScrollListener {

        /* renamed from: a */
        final /* synthetic */ View f699a;

        /* renamed from: b */
        final /* synthetic */ View f700b;

        C0247d(View view, View view2) {
            this.f699a = view;
            this.f700b = view2;
        }

        public void onScroll(AbsListView absListView, int i, int i2, int i3) {
            AlertController.m1113a(absListView, this.f699a, this.f700b);
        }

        public void onScrollStateChanged(AbsListView absListView, int i) {
        }
    }

    /* renamed from: androidx.appcompat.app.AlertController$e */
    class C0248e implements Runnable {

        /* renamed from: a */
        final /* synthetic */ View f703a;

        /* renamed from: b */
        final /* synthetic */ View f704b;

        C0248e(View view, View view2) {
            this.f703a = view;
            this.f704b = view2;
        }

        public void run() {
            AlertController.m1113a(AlertController.this.f670g, this.f703a, this.f704b);
        }
    }

    /* renamed from: androidx.appcompat.app.AlertController$f */
    public static class C0249f {

        /* renamed from: A */
        public int f705A;

        /* renamed from: B */
        public int f706B;

        /* renamed from: C */
        public int f707C;

        /* renamed from: D */
        public int f708D;

        /* renamed from: E */
        public boolean f709E = false;

        /* renamed from: F */
        public boolean[] f710F;

        /* renamed from: G */
        public boolean f711G;

        /* renamed from: H */
        public boolean f712H;

        /* renamed from: I */
        public int f713I = -1;

        /* renamed from: J */
        public OnMultiChoiceClickListener f714J;

        /* renamed from: K */
        public Cursor f715K;

        /* renamed from: L */
        public String f716L;

        /* renamed from: M */
        public String f717M;

        /* renamed from: N */
        public boolean f718N;

        /* renamed from: O */
        public OnItemSelectedListener f719O;

        /* renamed from: P */
        public C0254e f720P;

        /* renamed from: Q */
        public boolean f721Q = true;

        /* renamed from: a */
        public final Context f722a;

        /* renamed from: b */
        public final LayoutInflater f723b;

        /* renamed from: c */
        public int f724c = 0;

        /* renamed from: d */
        public Drawable f725d;

        /* renamed from: e */
        public int f726e = 0;

        /* renamed from: f */
        public CharSequence f727f;

        /* renamed from: g */
        public View f728g;

        /* renamed from: h */
        public CharSequence f729h;

        /* renamed from: i */
        public CharSequence f730i;

        /* renamed from: j */
        public Drawable f731j;

        /* renamed from: k */
        public DialogInterface.OnClickListener f732k;

        /* renamed from: l */
        public CharSequence f733l;

        /* renamed from: m */
        public Drawable f734m;

        /* renamed from: n */
        public DialogInterface.OnClickListener f735n;

        /* renamed from: o */
        public CharSequence f736o;

        /* renamed from: p */
        public Drawable f737p;

        /* renamed from: q */
        public DialogInterface.OnClickListener f738q;

        /* renamed from: r */
        public boolean f739r;

        /* renamed from: s */
        public OnCancelListener f740s;

        /* renamed from: t */
        public OnDismissListener f741t;

        /* renamed from: u */
        public OnKeyListener f742u;

        /* renamed from: v */
        public CharSequence[] f743v;

        /* renamed from: w */
        public ListAdapter f744w;

        /* renamed from: x */
        public DialogInterface.OnClickListener f745x;

        /* renamed from: y */
        public int f746y;

        /* renamed from: z */
        public View f747z;

        /* renamed from: androidx.appcompat.app.AlertController$f$a */
        class C0250a extends ArrayAdapter<CharSequence> {

            /* renamed from: a */
            final /* synthetic */ RecycleListView f748a;

            C0250a(Context context, int i, int i2, CharSequence[] charSequenceArr, RecycleListView recycleListView) {
                this.f748a = recycleListView;
                super(context, i, i2, charSequenceArr);
            }

            public View getView(int i, View view, ViewGroup viewGroup) {
                View view2 = super.getView(i, view, viewGroup);
                boolean[] zArr = C0249f.this.f710F;
                if (zArr != null && zArr[i]) {
                    this.f748a.setItemChecked(i, true);
                }
                return view2;
            }
        }

        /* renamed from: androidx.appcompat.app.AlertController$f$b */
        class C0251b extends CursorAdapter {

            /* renamed from: N */
            final /* synthetic */ RecycleListView f750N;

            /* renamed from: O */
            final /* synthetic */ AlertController f751O;

            /* renamed from: a */
            private final int f753a;

            /* renamed from: b */
            private final int f754b;

            C0251b(Context context, Cursor cursor, boolean z, RecycleListView recycleListView, AlertController alertController) {
                this.f750N = recycleListView;
                this.f751O = alertController;
                super(context, cursor, z);
                Cursor cursor2 = getCursor();
                this.f753a = cursor2.getColumnIndexOrThrow(C0249f.this.f716L);
                this.f754b = cursor2.getColumnIndexOrThrow(C0249f.this.f717M);
            }

            public void bindView(View view, Context context, Cursor cursor) {
                ((CheckedTextView) view.findViewById(16908308)).setText(cursor.getString(this.f753a));
                RecycleListView recycleListView = this.f750N;
                int position = cursor.getPosition();
                boolean z = true;
                if (cursor.getInt(this.f754b) != 1) {
                    z = false;
                }
                recycleListView.setItemChecked(position, z);
            }

            public View newView(Context context, Cursor cursor, ViewGroup viewGroup) {
                return C0249f.this.f723b.inflate(this.f751O.f657M, viewGroup, false);
            }
        }

        /* renamed from: androidx.appcompat.app.AlertController$f$c */
        class C0252c implements OnItemClickListener {

            /* renamed from: a */
            final /* synthetic */ AlertController f755a;

            C0252c(AlertController alertController) {
                this.f755a = alertController;
            }

            public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                C0249f.this.f745x.onClick(this.f755a.f665b, i);
                if (!C0249f.this.f712H) {
                    this.f755a.f665b.dismiss();
                }
            }
        }

        /* renamed from: androidx.appcompat.app.AlertController$f$d */
        class C0253d implements OnItemClickListener {

            /* renamed from: a */
            final /* synthetic */ RecycleListView f758a;

            /* renamed from: b */
            final /* synthetic */ AlertController f759b;

            C0253d(RecycleListView recycleListView, AlertController alertController) {
                this.f758a = recycleListView;
                this.f759b = alertController;
            }

            public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                boolean[] zArr = C0249f.this.f710F;
                if (zArr != null) {
                    zArr[i] = this.f758a.isItemChecked(i);
                }
                C0249f.this.f714J.onClick(this.f759b.f665b, i, this.f758a.isItemChecked(i));
            }
        }

        /* renamed from: androidx.appcompat.app.AlertController$f$e */
        public interface C0254e {
            /* renamed from: a */
            void mo721a(ListView listView);
        }

        public C0249f(Context context) {
            this.f722a = context;
            this.f739r = true;
            this.f723b = (LayoutInflater) context.getSystemService("layout_inflater");
        }

        /* JADX WARNING: type inference failed for: r9v0, types: [android.widget.ListAdapter] */
        /* JADX WARNING: type inference failed for: r9v1, types: [android.widget.ListAdapter] */
        /* JADX WARNING: type inference failed for: r9v2, types: [androidx.appcompat.app.AlertController$h] */
        /* JADX WARNING: type inference failed for: r2v3, types: [android.widget.SimpleCursorAdapter] */
        /* JADX WARNING: type inference failed for: r1v17, types: [androidx.appcompat.app.AlertController$f$b] */
        /* JADX WARNING: type inference failed for: r1v18, types: [androidx.appcompat.app.AlertController$f$a] */
        /* JADX WARNING: type inference failed for: r9v6 */
        /* JADX WARNING: type inference failed for: r2v6, types: [android.widget.SimpleCursorAdapter] */
        /* JADX WARNING: type inference failed for: r1v19, types: [androidx.appcompat.app.AlertController$f$b] */
        /* JADX WARNING: type inference failed for: r1v20, types: [androidx.appcompat.app.AlertController$f$a] */
        /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r9v1, types: [android.widget.ListAdapter]
          assigns: [android.widget.ListAdapter, android.widget.SimpleCursorAdapter, androidx.appcompat.app.AlertController$f$b, androidx.appcompat.app.AlertController$f$a]
          uses: [?[int, boolean, OBJECT, ARRAY, byte, short, char], android.widget.ListAdapter, android.widget.SimpleCursorAdapter, androidx.appcompat.app.AlertController$f$b, androidx.appcompat.app.AlertController$f$a]
          mth insns count: 68
        	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$0(DepthTraversal.java:13)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:13)
        	at jadx.core.ProcessClass.process(ProcessClass.java:30)
        	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
        	at jadx.api.JavaClass.decompile(JavaClass.java:62)
        	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
         */
        /* JADX WARNING: Unknown variable types count: 5 */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private void m1142b(androidx.appcompat.app.AlertController r12) {
            /*
                r11 = this;
                android.view.LayoutInflater r0 = r11.f723b
                int r1 = r12.f656L
                r2 = 0
                android.view.View r0 = r0.inflate(r1, r2)
                androidx.appcompat.app.AlertController$RecycleListView r0 = (androidx.appcompat.app.AlertController.RecycleListView) r0
                boolean r1 = r11.f711G
                r8 = 1
                if (r1 == 0) goto L_0x0033
                android.database.Cursor r4 = r11.f715K
                if (r4 != 0) goto L_0x0026
                androidx.appcompat.app.AlertController$f$a r9 = new androidx.appcompat.app.AlertController$f$a
                android.content.Context r3 = r11.f722a
                int r4 = r12.f657M
                r5 = 16908308(0x1020014, float:2.3877285E-38)
                java.lang.CharSequence[] r6 = r11.f743v
                r1 = r9
                r2 = r11
                r7 = r0
                r1.<init>(r3, r4, r5, r6, r7)
                goto L_0x0067
            L_0x0026:
                androidx.appcompat.app.AlertController$f$b r9 = new androidx.appcompat.app.AlertController$f$b
                android.content.Context r3 = r11.f722a
                r5 = 0
                r1 = r9
                r2 = r11
                r6 = r0
                r7 = r12
                r1.<init>(r3, r4, r5, r6, r7)
                goto L_0x0067
            L_0x0033:
                boolean r1 = r11.f712H
                if (r1 == 0) goto L_0x003a
                int r1 = r12.f658N
                goto L_0x003c
            L_0x003a:
                int r1 = r12.f659O
            L_0x003c:
                r4 = r1
                android.database.Cursor r5 = r11.f715K
                r1 = 16908308(0x1020014, float:2.3877285E-38)
                if (r5 == 0) goto L_0x0059
                android.widget.SimpleCursorAdapter r9 = new android.widget.SimpleCursorAdapter
                android.content.Context r3 = r11.f722a
                java.lang.String[] r6 = new java.lang.String[r8]
                java.lang.String r2 = r11.f716L
                r7 = 0
                r6[r7] = r2
                int[] r10 = new int[r8]
                r10[r7] = r1
                r2 = r9
                r7 = r10
                r2.<init>(r3, r4, r5, r6, r7)
                goto L_0x0067
            L_0x0059:
                android.widget.ListAdapter r9 = r11.f744w
                if (r9 == 0) goto L_0x005e
                goto L_0x0067
            L_0x005e:
                androidx.appcompat.app.AlertController$h r9 = new androidx.appcompat.app.AlertController$h
                android.content.Context r2 = r11.f722a
                java.lang.CharSequence[] r3 = r11.f743v
                r9.<init>(r2, r4, r1, r3)
            L_0x0067:
                androidx.appcompat.app.AlertController$f$e r1 = r11.f720P
                if (r1 == 0) goto L_0x006e
                r1.mo721a(r0)
            L_0x006e:
                r12.f652H = r9
                int r1 = r11.f713I
                r12.f653I = r1
                android.content.DialogInterface$OnClickListener r1 = r11.f745x
                if (r1 == 0) goto L_0x0081
                androidx.appcompat.app.AlertController$f$c r1 = new androidx.appcompat.app.AlertController$f$c
                r1.<init>(r12)
                r0.setOnItemClickListener(r1)
                goto L_0x008d
            L_0x0081:
                android.content.DialogInterface$OnMultiChoiceClickListener r1 = r11.f714J
                if (r1 == 0) goto L_0x008d
                androidx.appcompat.app.AlertController$f$d r1 = new androidx.appcompat.app.AlertController$f$d
                r1.<init>(r0, r12)
                r0.setOnItemClickListener(r1)
            L_0x008d:
                android.widget.AdapterView$OnItemSelectedListener r1 = r11.f719O
                if (r1 == 0) goto L_0x0094
                r0.setOnItemSelectedListener(r1)
            L_0x0094:
                boolean r1 = r11.f712H
                if (r1 == 0) goto L_0x009c
                r0.setChoiceMode(r8)
                goto L_0x00a4
            L_0x009c:
                boolean r1 = r11.f711G
                if (r1 == 0) goto L_0x00a4
                r1 = 2
                r0.setChoiceMode(r1)
            L_0x00a4:
                r12.f670g = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AlertController.C0249f.m1142b(androidx.appcompat.app.AlertController):void");
        }

        /* renamed from: a */
        public void mo715a(AlertController alertController) {
            View view = this.f728g;
            if (view != null) {
                alertController.mo696a(view);
            } else {
                CharSequence charSequence = this.f727f;
                if (charSequence != null) {
                    alertController.mo703b(charSequence);
                }
                Drawable drawable = this.f725d;
                if (drawable != null) {
                    alertController.mo695a(drawable);
                }
                int i = this.f724c;
                if (i != 0) {
                    alertController.mo706d(i);
                }
                int i2 = this.f726e;
                if (i2 != 0) {
                    alertController.mo706d(alertController.mo700b(i2));
                }
            }
            CharSequence charSequence2 = this.f729h;
            if (charSequence2 != null) {
                alertController.mo698a(charSequence2);
            }
            if (!(this.f730i == null && this.f731j == null)) {
                alertController.mo694a(-1, this.f730i, this.f732k, (Message) null, this.f731j);
            }
            if (!(this.f733l == null && this.f734m == null)) {
                alertController.mo694a(-2, this.f733l, this.f735n, (Message) null, this.f734m);
            }
            if (!(this.f736o == null && this.f737p == null)) {
                alertController.mo694a(-3, this.f736o, this.f738q, (Message) null, this.f737p);
            }
            if (!(this.f743v == null && this.f715K == null && this.f744w == null)) {
                m1142b(alertController);
            }
            View view2 = this.f747z;
            if (view2 == null) {
                int i3 = this.f746y;
                if (i3 != 0) {
                    alertController.mo707e(i3);
                }
            } else if (this.f709E) {
                alertController.mo697a(view2, this.f705A, this.f706B, this.f707C, this.f708D);
            } else {
                alertController.mo702b(view2);
            }
        }
    }

    /* renamed from: androidx.appcompat.app.AlertController$g */
    private static final class C0255g extends Handler {

        /* renamed from: b */
        private static final int f760b = 1;

        /* renamed from: a */
        private WeakReference<DialogInterface> f761a;

        public C0255g(DialogInterface dialogInterface) {
            this.f761a = new WeakReference<>(dialogInterface);
        }

        public void handleMessage(Message message) {
            int i = message.what;
            if (i == -3 || i == -2 || i == -1) {
                ((DialogInterface.OnClickListener) message.obj).onClick((DialogInterface) this.f761a.get(), message.what);
            } else if (i == 1) {
                ((DialogInterface) message.obj).dismiss();
            }
        }
    }

    /* renamed from: androidx.appcompat.app.AlertController$h */
    private static class C0256h extends ArrayAdapter<CharSequence> {
        public C0256h(Context context, int i, int i2, CharSequence[] charSequenceArr) {
            super(context, i, i2, charSequenceArr);
        }

        public long getItemId(int i) {
            return (long) i;
        }

        public boolean hasStableIds() {
            return true;
        }
    }

    public AlertController(Context context, C0299g gVar, Window window) {
        this.f664a = context;
        this.f665b = gVar;
        this.f666c = window;
        this.f662R = new C0255g(gVar);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, C0238R.styleable.AlertDialog, C0238R.attr.alertDialogStyle, 0);
        this.f654J = obtainStyledAttributes.getResourceId(C0238R.styleable.AlertDialog_android_layout, 0);
        this.f655K = obtainStyledAttributes.getResourceId(C0238R.styleable.AlertDialog_buttonPanelSideLayout, 0);
        this.f656L = obtainStyledAttributes.getResourceId(C0238R.styleable.AlertDialog_listLayout, 0);
        this.f657M = obtainStyledAttributes.getResourceId(C0238R.styleable.AlertDialog_multiChoiceItemLayout, 0);
        this.f658N = obtainStyledAttributes.getResourceId(C0238R.styleable.AlertDialog_singleChoiceItemLayout, 0);
        this.f659O = obtainStyledAttributes.getResourceId(C0238R.styleable.AlertDialog_listItemLayout, 0);
        this.f660P = obtainStyledAttributes.getBoolean(C0238R.styleable.AlertDialog_showTitle, true);
        this.f667d = obtainStyledAttributes.getDimensionPixelSize(C0238R.styleable.AlertDialog_buttonIconDimen, 0);
        obtainStyledAttributes.recycle();
        gVar.supportRequestWindowFeature(1);
    }

    /* renamed from: a */
    private static boolean m1117a(Context context) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(C0238R.attr.alertDialogCenterButtons, typedValue, true);
        if (typedValue.data != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    static boolean m1121c(View view) {
        if (view.onCheckIsTextEditor()) {
            return true;
        }
        if (!(view instanceof ViewGroup)) {
            return false;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        while (childCount > 0) {
            childCount--;
            if (m1121c(viewGroup.getChildAt(childCount))) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public void mo701b() {
        this.f665b.setContentView(m1119c());
        m1122d();
    }

    /* renamed from: d */
    public void mo706d(int i) {
        this.f647C = null;
        this.f646B = i;
        ImageView imageView = this.f648D;
        if (imageView == null) {
            return;
        }
        if (i != 0) {
            imageView.setVisibility(0);
            this.f648D.setImageResource(this.f646B);
            return;
        }
        imageView.setVisibility(8);
    }

    /* renamed from: e */
    public void mo707e(int i) {
        this.f671h = null;
        this.f672i = i;
        this.f677n = false;
    }

    /* renamed from: a */
    public void mo696a(View view) {
        this.f651G = view;
    }

    /* renamed from: b */
    public void mo703b(CharSequence charSequence) {
        this.f668e = charSequence;
        TextView textView = this.f649E;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    /* renamed from: a */
    public void mo698a(CharSequence charSequence) {
        this.f669f = charSequence;
        TextView textView = this.f650F;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    /* renamed from: c */
    private int m1119c() {
        int i = this.f655K;
        if (i == 0) {
            return this.f654J;
        }
        if (this.f661Q == 1) {
            return i;
        }
        return this.f654J;
    }

    /* renamed from: d */
    private void m1122d() {
        View findViewById = this.f666c.findViewById(C0238R.C0241id.parentPanel);
        View findViewById2 = findViewById.findViewById(C0238R.C0241id.topPanel);
        View findViewById3 = findViewById.findViewById(C0238R.C0241id.contentPanel);
        View findViewById4 = findViewById.findViewById(C0238R.C0241id.buttonPanel);
        ViewGroup viewGroup = (ViewGroup) findViewById.findViewById(C0238R.C0241id.customPanel);
        m1120c(viewGroup);
        View findViewById5 = viewGroup.findViewById(C0238R.C0241id.topPanel);
        View findViewById6 = viewGroup.findViewById(C0238R.C0241id.contentPanel);
        View findViewById7 = viewGroup.findViewById(C0238R.C0241id.buttonPanel);
        ViewGroup a = m1112a(findViewById5, findViewById2);
        ViewGroup a2 = m1112a(findViewById6, findViewById3);
        ViewGroup a3 = m1112a(findViewById7, findViewById4);
        m1118b(a2);
        m1114a(a3);
        m1123d(a);
        char c = 0;
        boolean z = (viewGroup == null || viewGroup.getVisibility() == 8) ? false : true;
        boolean z2 = (a == null || a.getVisibility() == 8) ? false : true;
        boolean z3 = (a3 == null || a3.getVisibility() == 8) ? false : true;
        if (!z3 && a2 != null) {
            View findViewById8 = a2.findViewById(C0238R.C0241id.textSpacerNoButtons);
            if (findViewById8 != null) {
                findViewById8.setVisibility(0);
            }
        }
        if (z2) {
            NestedScrollView nestedScrollView = this.f645A;
            if (nestedScrollView != null) {
                nestedScrollView.setClipToPadding(true);
            }
            View view = null;
            if (!(this.f669f == null && this.f670g == null)) {
                view = a.findViewById(C0238R.C0241id.titleDividerNoCustom);
            }
            if (view != null) {
                view.setVisibility(0);
            }
        } else if (a2 != null) {
            View findViewById9 = a2.findViewById(C0238R.C0241id.textSpacerNoTitle);
            if (findViewById9 != null) {
                findViewById9.setVisibility(0);
            }
        }
        ListView listView = this.f670g;
        if (listView instanceof RecycleListView) {
            ((RecycleListView) listView).mo708a(z2, z3);
        }
        if (!z) {
            View view2 = this.f670g;
            if (view2 == null) {
                view2 = this.f645A;
            }
            if (view2 != null) {
                if (z3) {
                    c = 2;
                }
                m1115a(a2, view2, z2 | c ? 1 : 0, 3);
            }
        }
        ListView listView2 = this.f670g;
        if (listView2 != null) {
            ListAdapter listAdapter = this.f652H;
            if (listAdapter != null) {
                listView2.setAdapter(listAdapter);
                int i = this.f653I;
                if (i > -1) {
                    listView2.setItemChecked(i, true);
                    listView2.setSelection(i);
                }
            }
        }
    }

    /* renamed from: b */
    public void mo702b(View view) {
        this.f671h = view;
        this.f672i = 0;
        this.f677n = false;
    }

    /* renamed from: a */
    public void mo697a(View view, int i, int i2, int i3, int i4) {
        this.f671h = view;
        this.f672i = 0;
        this.f677n = true;
        this.f673j = i;
        this.f674k = i2;
        this.f675l = i3;
        this.f676m = i4;
    }

    /* renamed from: b */
    public int mo700b(int i) {
        TypedValue typedValue = new TypedValue();
        this.f664a.getTheme().resolveAttribute(i, typedValue, true);
        return typedValue.resourceId;
    }

    /* renamed from: c */
    public void mo705c(int i) {
        this.f661Q = i;
    }

    /* renamed from: c */
    private void m1120c(ViewGroup viewGroup) {
        View view = this.f671h;
        boolean z = false;
        if (view == null) {
            view = this.f672i != 0 ? LayoutInflater.from(this.f664a).inflate(this.f672i, viewGroup, false) : null;
        }
        if (view != null) {
            z = true;
        }
        if (!z || !m1121c(view)) {
            this.f666c.setFlags(131072, 131072);
        }
        if (z) {
            FrameLayout frameLayout = (FrameLayout) this.f666c.findViewById(C0238R.C0241id.custom);
            frameLayout.addView(view, new LayoutParams(-1, -1));
            if (this.f677n) {
                frameLayout.setPadding(this.f673j, this.f674k, this.f675l, this.f676m);
            }
            if (this.f670g != null) {
                ((C0492b) viewGroup.getLayoutParams()).f1972a = 0.0f;
                return;
            }
            return;
        }
        viewGroup.setVisibility(8);
    }

    /* renamed from: b */
    public boolean mo704b(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f645A;
        return nestedScrollView != null && nestedScrollView.mo5280a(keyEvent);
    }

    /* renamed from: b */
    private void m1118b(ViewGroup viewGroup) {
        this.f645A = (NestedScrollView) this.f666c.findViewById(C0238R.C0241id.scrollView);
        this.f645A.setFocusable(false);
        this.f645A.setNestedScrollingEnabled(false);
        this.f650F = (TextView) viewGroup.findViewById(16908299);
        TextView textView = this.f650F;
        if (textView != null) {
            CharSequence charSequence = this.f669f;
            if (charSequence != null) {
                textView.setText(charSequence);
            } else {
                textView.setVisibility(8);
                this.f645A.removeView(this.f650F);
                if (this.f670g != null) {
                    ViewGroup viewGroup2 = (ViewGroup) this.f645A.getParent();
                    int indexOfChild = viewGroup2.indexOfChild(this.f645A);
                    viewGroup2.removeViewAt(indexOfChild);
                    viewGroup2.addView(this.f670g, indexOfChild, new LayoutParams(-1, -1));
                } else {
                    viewGroup.setVisibility(8);
                }
            }
        }
    }

    /* renamed from: a */
    public void mo694a(int i, CharSequence charSequence, DialogInterface.OnClickListener onClickListener, Message message, Drawable drawable) {
        if (message == null && onClickListener != null) {
            message = this.f662R.obtainMessage(i, onClickListener);
        }
        if (i == -3) {
            this.f687x = charSequence;
            this.f688y = message;
            this.f689z = drawable;
        } else if (i == -2) {
            this.f683t = charSequence;
            this.f684u = message;
            this.f685v = drawable;
        } else if (i == -1) {
            this.f679p = charSequence;
            this.f680q = message;
            this.f681r = drawable;
        } else {
            throw new IllegalArgumentException("Button does not exist");
        }
    }

    /* renamed from: a */
    public void mo695a(Drawable drawable) {
        this.f647C = drawable;
        this.f646B = 0;
        ImageView imageView = this.f648D;
        if (imageView == null) {
            return;
        }
        if (drawable != null) {
            imageView.setVisibility(0);
            this.f648D.setImageDrawable(drawable);
            return;
        }
        imageView.setVisibility(8);
    }

    /* renamed from: a */
    public ListView mo693a() {
        return this.f670g;
    }

    /* renamed from: a */
    public Button mo692a(int i) {
        if (i == -3) {
            return this.f686w;
        }
        if (i == -2) {
            return this.f682s;
        }
        if (i != -1) {
            return null;
        }
        return this.f678o;
    }

    /* renamed from: a */
    public boolean mo699a(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f645A;
        return nestedScrollView != null && nestedScrollView.mo5280a(keyEvent);
    }

    @C0195i0
    /* renamed from: a */
    private ViewGroup m1112a(@C0195i0 View view, @C0195i0 View view2) {
        if (view == null) {
            if (view2 instanceof ViewStub) {
                view2 = ((ViewStub) view2).inflate();
            }
            return (ViewGroup) view2;
        }
        if (view2 != null) {
            ViewParent parent = view2.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view2);
            }
        }
        if (view instanceof ViewStub) {
            view = ((ViewStub) view).inflate();
        }
        return (ViewGroup) view;
    }

    /* renamed from: d */
    private void m1123d(ViewGroup viewGroup) {
        if (this.f651G != null) {
            viewGroup.addView(this.f651G, 0, new LayoutParams(-1, -2));
            this.f666c.findViewById(C0238R.C0241id.title_template).setVisibility(8);
            return;
        }
        this.f648D = (ImageView) this.f666c.findViewById(16908294);
        if (!(!TextUtils.isEmpty(this.f668e)) || !this.f660P) {
            this.f666c.findViewById(C0238R.C0241id.title_template).setVisibility(8);
            this.f648D.setVisibility(8);
            viewGroup.setVisibility(8);
            return;
        }
        this.f649E = (TextView) this.f666c.findViewById(C0238R.C0241id.alertTitle);
        this.f649E.setText(this.f668e);
        int i = this.f646B;
        if (i != 0) {
            this.f648D.setImageResource(i);
            return;
        }
        Drawable drawable = this.f647C;
        if (drawable != null) {
            this.f648D.setImageDrawable(drawable);
            return;
        }
        this.f649E.setPadding(this.f648D.getPaddingLeft(), this.f648D.getPaddingTop(), this.f648D.getPaddingRight(), this.f648D.getPaddingBottom());
        this.f648D.setVisibility(8);
    }

    /* renamed from: a */
    private void m1115a(ViewGroup viewGroup, View view, int i, int i2) {
        View findViewById = this.f666c.findViewById(C0238R.C0241id.scrollIndicatorUp);
        View findViewById2 = this.f666c.findViewById(C0238R.C0241id.scrollIndicatorDown);
        if (VERSION.SDK_INT >= 23) {
            C0962e0.m5432a(view, i, i2);
            if (findViewById != null) {
                viewGroup.removeView(findViewById);
            }
            if (findViewById2 != null) {
                viewGroup.removeView(findViewById2);
                return;
            }
            return;
        }
        View view2 = null;
        if (findViewById != null && (i & 1) == 0) {
            viewGroup.removeView(findViewById);
            findViewById = null;
        }
        if (findViewById2 == null || (i & 2) != 0) {
            view2 = findViewById2;
        } else {
            viewGroup.removeView(findViewById2);
        }
        if (findViewById != null || view2 != null) {
            if (this.f669f != null) {
                this.f645A.setOnScrollChangeListener(new C0245b(findViewById, view2));
                this.f645A.post(new C0246c(findViewById, view2));
                return;
            }
            ListView listView = this.f670g;
            if (listView != null) {
                listView.setOnScrollListener(new C0247d(findViewById, view2));
                this.f670g.post(new C0248e(findViewById, view2));
                return;
            }
            if (findViewById != null) {
                viewGroup.removeView(findViewById);
            }
            if (view2 != null) {
                viewGroup.removeView(view2);
            }
        }
    }

    /* renamed from: a */
    static void m1113a(View view, View view2, View view3) {
        int i = 0;
        if (view2 != null) {
            view2.setVisibility(view.canScrollVertically(-1) ? 0 : 4);
        }
        if (view3 != null) {
            if (!view.canScrollVertically(1)) {
                i = 4;
            }
            view3.setVisibility(i);
        }
    }

    /* renamed from: a */
    private void m1114a(ViewGroup viewGroup) {
        boolean z;
        this.f678o = (Button) viewGroup.findViewById(16908313);
        this.f678o.setOnClickListener(this.f663S);
        boolean z2 = true;
        if (!TextUtils.isEmpty(this.f679p) || this.f681r != null) {
            this.f678o.setText(this.f679p);
            Drawable drawable = this.f681r;
            if (drawable != null) {
                int i = this.f667d;
                drawable.setBounds(0, 0, i, i);
                this.f678o.setCompoundDrawables(this.f681r, null, null, null);
            }
            this.f678o.setVisibility(0);
            z = true;
        } else {
            this.f678o.setVisibility(8);
            z = false;
        }
        this.f682s = (Button) viewGroup.findViewById(16908314);
        this.f682s.setOnClickListener(this.f663S);
        if (!TextUtils.isEmpty(this.f683t) || this.f685v != null) {
            this.f682s.setText(this.f683t);
            Drawable drawable2 = this.f685v;
            if (drawable2 != null) {
                int i2 = this.f667d;
                drawable2.setBounds(0, 0, i2, i2);
                this.f682s.setCompoundDrawables(this.f685v, null, null, null);
            }
            this.f682s.setVisibility(0);
            z |= true;
        } else {
            this.f682s.setVisibility(8);
        }
        this.f686w = (Button) viewGroup.findViewById(16908315);
        this.f686w.setOnClickListener(this.f663S);
        if (!TextUtils.isEmpty(this.f687x) || this.f689z != null) {
            this.f686w.setText(this.f687x);
            Drawable drawable3 = this.f681r;
            if (drawable3 != null) {
                int i3 = this.f667d;
                drawable3.setBounds(0, 0, i3, i3);
                this.f678o.setCompoundDrawables(this.f681r, null, null, null);
            }
            this.f686w.setVisibility(0);
            z |= true;
        } else {
            this.f686w.setVisibility(8);
        }
        if (m1117a(this.f664a)) {
            if (z) {
                m1116a(this.f678o);
            } else if (z) {
                m1116a(this.f682s);
            } else if (z) {
                m1116a(this.f686w);
            }
        }
        if (!z) {
            z2 = false;
        }
        if (!z2) {
            viewGroup.setVisibility(8);
        }
    }

    /* renamed from: a */
    private void m1116a(Button button) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button.getLayoutParams();
        layoutParams.gravity = 1;
        layoutParams.weight = 0.5f;
        button.setLayoutParams(layoutParams);
    }
}
