package com.mrsool.shopmenu;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.content.C0841b;
import androidx.recyclerview.widget.RecyclerView.C1635d0;
import androidx.recyclerview.widget.RecyclerView.C1638g;
import com.fasterxml.jackson.core.p162w.C3868i;
import com.mrsool.C10232R;
import com.mrsool.shopmenu.bean.MenuAddonsBean;
import com.mrsool.shopmenu.bean.MenuAddonsOptionsBean;
import com.mrsool.utils.C11644i;
import com.mrsool.utils.C5887x;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.mrsool.shopmenu.n */
/* compiled from: AddOnsListAdapter */
public class C11378n extends C1638g<C11382d> {

    /* renamed from: c */
    private Context f31942c;

    /* renamed from: d */
    private List<MenuAddonsBean> f31943d = new ArrayList();

    /* renamed from: e */
    private C5887x f31944e;

    /* renamed from: f */
    private C11381c f31945f;

    /* renamed from: g */
    private String f31946g;

    /* renamed from: h */
    private boolean f31947h = true;

    /* renamed from: com.mrsool.shopmenu.n$a */
    /* compiled from: AddOnsListAdapter */
    class C11379a implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ int f31948a;

        C11379a(int i) {
            this.f31948a = i;
        }

        public void onClick(View view) {
            C11378n.this.m51454e(this.f31948a, ((Integer) view.getTag()).intValue());
        }
    }

    /* renamed from: com.mrsool.shopmenu.n$b */
    /* compiled from: AddOnsListAdapter */
    class C11380b implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ int f31951a;

        /* renamed from: b */
        final /* synthetic */ MenuAddonsBean f31952b;

        C11380b(int i, MenuAddonsBean menuAddonsBean) {
            this.f31951a = i;
            this.f31952b = menuAddonsBean;
        }

        public void onClick(View view) {
            C11378n.this.m51452b(this.f31951a, Boolean.valueOf(!TextUtils.isEmpty(this.f31952b.getErrorMessage())));
        }
    }

    /* renamed from: com.mrsool.shopmenu.n$c */
    /* compiled from: AddOnsListAdapter */
    public interface C11381c {
        /* renamed from: a */
        void mo39432a(int i);
    }

    /* renamed from: com.mrsool.shopmenu.n$d */
    /* compiled from: AddOnsListAdapter */
    public static class C11382d extends C1635d0 {

        /* renamed from: A0 */
        TextView f31953A0;

        /* renamed from: B0 */
        ImageView f31954B0;

        /* renamed from: C0 */
        ImageView f31955C0;

        /* renamed from: D0 */
        LinearLayout f31956D0;

        /* renamed from: E0 */
        LinearLayout f31957E0;

        /* renamed from: F0 */
        LinearLayout f31958F0;

        /* renamed from: G0 */
        RelativeLayout f31959G0;

        /* renamed from: s0 */
        TextView f31960s0;

        /* renamed from: t0 */
        TextView f31961t0;

        /* renamed from: u0 */
        TextView f31962u0;

        /* renamed from: v0 */
        TextView f31963v0;

        /* renamed from: w0 */
        TextView f31964w0;

        /* renamed from: x0 */
        TextView f31965x0;

        /* renamed from: y0 */
        TextView f31966y0;

        /* renamed from: z0 */
        TextView f31967z0;

        public C11382d(View view) {
            super(view);
            this.f31960s0 = (TextView) view.findViewById(C10232R.C10236id.tvName);
            this.f31961t0 = (TextView) view.findViewById(C10232R.C10236id.tvMaxOptions);
            this.f31962u0 = (TextView) view.findViewById(C10232R.C10236id.tvNameSingle);
            this.f31963v0 = (TextView) view.findViewById(C10232R.C10236id.tvAmountSingle);
            this.f31964w0 = (TextView) view.findViewById(C10232R.C10236id.tvCurrencySingle);
            this.f31954B0 = (ImageView) view.findViewById(C10232R.C10236id.ivCheckmarkMulti);
            this.f31955C0 = (ImageView) view.findViewById(C10232R.C10236id.ivCheckmarkSingle);
            this.f31956D0 = (LinearLayout) view.findViewById(C10232R.C10236id.rlMultiple);
            this.f31959G0 = (RelativeLayout) view.findViewById(C10232R.C10236id.rlSingle);
            this.f31957E0 = (LinearLayout) view.findViewById(C10232R.C10236id.llAddonsContainer);
            this.f31958F0 = (LinearLayout) view.findViewById(C10232R.C10236id.llMain);
            this.f31965x0 = (TextView) view.findViewById(C10232R.C10236id.tvAmountMultiple);
            this.f31966y0 = (TextView) view.findViewById(C10232R.C10236id.tvCurrencyMultiple);
            this.f31967z0 = (TextView) view.findViewById(C10232R.C10236id.tvErrorSingle);
            this.f31953A0 = (TextView) view.findViewById(C10232R.C10236id.tvCaloriesSingle);
        }
    }

    public C11378n(List<MenuAddonsBean> list, Context context, String str) {
        this.f31942c = context;
        this.f31943d = list;
        this.f31944e = new C5887x(context);
        this.f31946g = str;
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public void m51454e(int i, int i2) {
        if (!((MenuAddonsBean) this.f31943d.get(i)).getStatus().equalsIgnoreCase(C11644i.f33275c7) && !((MenuAddonsOptionsBean) ((MenuAddonsBean) this.f31943d.get(i)).getMenuAddonOptions().get(i2)).getStatus().equalsIgnoreCase(C11644i.f33275c7)) {
            boolean z = !((MenuAddonsOptionsBean) ((MenuAddonsBean) this.f31943d.get(i)).getMenuAddonOptions().get(i2)).isSelected();
            if (!z || !m51455g(i)) {
                ((MenuAddonsOptionsBean) ((MenuAddonsBean) this.f31943d.get(i)).getMenuAddonOptions().get(i2)).setSelected(z);
                Boolean valueOf = Boolean.valueOf(false);
                int i3 = 0;
                while (true) {
                    if (i3 >= ((MenuAddonsBean) this.f31943d.get(i)).getMenuAddonOptions().size()) {
                        break;
                    } else if (((MenuAddonsOptionsBean) ((MenuAddonsBean) this.f31943d.get(i)).getMenuAddonOptions().get(i3)).isSelected()) {
                        valueOf = Boolean.valueOf(true);
                        break;
                    } else {
                        i3++;
                    }
                }
                ((MenuAddonsBean) this.f31943d.get(i)).setValidationError(false);
                ((MenuAddonsBean) this.f31943d.get(i)).setSelected(valueOf.booleanValue());
                mo7337d(i);
            }
        }
    }

    /* renamed from: g */
    private boolean m51455g(int i) {
        boolean z = false;
        if (((MenuAddonsBean) this.f31943d.get(i)).getMaxAllowedOption() == 0) {
            return false;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < ((MenuAddonsBean) this.f31943d.get(i)).getMenuAddonOptions().size(); i3++) {
            if (((MenuAddonsOptionsBean) ((MenuAddonsBean) this.f31943d.get(i)).getMenuAddonOptions().get(i3)).isSelected()) {
                i2++;
            }
        }
        if (i2 >= ((MenuAddonsBean) this.f31943d.get(i)).getMaxAllowedOption()) {
            z = true;
        }
        return z;
    }

    /* renamed from: f */
    public C11381c mo39429f() {
        return this.f31945f;
    }

    /* JADX WARNING: type inference failed for: r14v0 */
    /* JADX WARNING: type inference failed for: r14v1, types: [int, boolean] */
    /* JADX WARNING: type inference failed for: r14v2 */
    /* JADX WARNING: type inference failed for: r14v7 */
    /* JADX WARNING: type inference failed for: r14v8 */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r14v7
      assigns: []
      uses: [int, ?[int, short, byte, char], boolean]
      mth insns count: 469
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
    	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:49)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:49)
    	at jadx.core.ProcessClass.process(ProcessClass.java:35)
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
    	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
     */
    /* JADX WARNING: Unknown variable types count: 3 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo7330b(com.mrsool.shopmenu.C11378n.C11382d r24, int r25) {
        /*
            r23 = this;
            r8 = r23
            r9 = r24
            r10 = r25
            java.util.List<com.mrsool.shopmenu.bean.MenuAddonsBean> r0 = r8.f31943d
            java.lang.Object r0 = r0.get(r10)
            r11 = r0
            com.mrsool.shopmenu.bean.MenuAddonsBean r11 = (com.mrsool.shopmenu.bean.MenuAddonsBean) r11
            com.mrsool.utils.x r0 = r8.f31944e
            r12 = 4
            android.view.View[] r1 = new android.view.View[r12]
            android.widget.TextView r2 = r9.f31960s0
            r13 = 0
            r1[r13] = r2
            android.widget.TextView r2 = r9.f31961t0
            r14 = 1
            r1[r14] = r2
            android.widget.TextView r2 = r9.f31962u0
            r15 = 2
            r1[r15] = r2
            android.widget.TextView r2 = r9.f31967z0
            r7 = 3
            r1[r7] = r2
            r0.mo23582b(r1)
            java.util.ArrayList r0 = r11.getMenuAddonOptions()
            int r0 = r0.size()
            r6 = 8
            if (r0 <= 0) goto L_0x0490
            android.widget.RelativeLayout r0 = r9.f31959G0
            r0.setVisibility(r6)
            android.widget.LinearLayout r0 = r9.f31956D0
            r0.setVisibility(r13)
            android.widget.TextView r0 = r9.f31960s0
            java.lang.String r1 = r11.getName()
            r0.setText(r1)
            android.widget.TextView r0 = r9.f31965x0
            com.mrsool.utils.x r1 = r8.f31944e
            java.lang.Double r2 = r11.getPrice()
            java.lang.String r2 = com.mrsool.utils.C5887x.m25809b(r2)
            java.lang.CharSequence r1 = r1.mo23649p(r2)
            r0.setText(r1)
            android.widget.TextView r0 = r9.f31966y0
            java.lang.String r1 = r8.f31946g
            r0.setText(r1)
            android.widget.TextView r0 = r9.f31965x0
            boolean r1 = r11.isSelected()
            r0.setSelected(r1)
            android.widget.TextView r0 = r9.f31966y0
            boolean r1 = r11.isSelected()
            r0.setSelected(r1)
            android.widget.TextView r0 = r9.f31960s0
            boolean r1 = r11.isSelected()
            r0.setSelected(r1)
            android.widget.TextView r0 = r9.f31961t0
            boolean r1 = r11.isSelected()
            r0.setSelected(r1)
            android.widget.TextView[] r0 = new android.widget.TextView[r12]
            android.widget.TextView r1 = r9.f31960s0
            r0[r13] = r1
            android.widget.TextView r1 = r9.f31966y0
            r0[r14] = r1
            android.widget.TextView r1 = r9.f31965x0
            r0[r15] = r1
            android.widget.TextView r1 = r9.f31961t0
            r0[r7] = r1
            r8.m51449a(r0)
            int r0 = r11.getMaxAllowedOption()
            java.lang.String r1 = ""
            if (r0 <= 0) goto L_0x00f4
            int r0 = r11.getMinAllowedOption()
            if (r0 <= 0) goto L_0x00f4
            android.widget.TextView r0 = r9.f31961t0
            r0.setVisibility(r13)
            android.widget.TextView r0 = r9.f31961t0
            android.content.Context r2 = r8.f31942c
            android.content.res.Resources r2 = r2.getResources()
            r3 = 2131887017(0x7f1203a9, float:1.940863E38)
            java.lang.String r2 = r2.getString(r3)
            java.lang.Object[] r3 = new java.lang.Object[r15]
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r1)
            int r5 = r11.getMinAllowedOption()
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            r3[r13] = r4
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r1)
            int r1 = r11.getMaxAllowedOption()
            r4.append(r1)
            java.lang.String r1 = r4.toString()
            r3[r14] = r1
            java.lang.String r1 = java.lang.String.format(r2, r3)
            r0.setText(r1)
            goto L_0x016b
        L_0x00f4:
            int r0 = r11.getMaxAllowedOption()
            if (r0 <= 0) goto L_0x012d
            android.widget.TextView r0 = r9.f31961t0
            r0.setVisibility(r13)
            android.widget.TextView r0 = r9.f31961t0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            int r1 = r11.getMaxAllowedOption()
            r2.append(r1)
            java.lang.String r1 = " "
            r2.append(r1)
            android.content.Context r1 = r8.f31942c
            android.content.res.Resources r1 = r1.getResources()
            r3 = 2131887015(0x7f1203a7, float:1.9408625E38)
            java.lang.String r1 = r1.getString(r3)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r0.setText(r1)
            goto L_0x016b
        L_0x012d:
            int r0 = r11.getMinAllowedOption()
            if (r0 <= 0) goto L_0x0166
            android.widget.TextView r0 = r9.f31961t0
            r0.setVisibility(r13)
            android.widget.TextView r0 = r9.f31961t0
            android.content.Context r2 = r8.f31942c
            android.content.res.Resources r2 = r2.getResources()
            r3 = 2131887016(0x7f1203a8, float:1.9408627E38)
            java.lang.String r2 = r2.getString(r3)
            java.lang.Object[] r3 = new java.lang.Object[r14]
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r1)
            int r1 = r11.getMinAllowedOption()
            r4.append(r1)
            java.lang.String r1 = r4.toString()
            r3[r13] = r1
            java.lang.String r1 = java.lang.String.format(r2, r3)
            r0.setText(r1)
            goto L_0x016b
        L_0x0166:
            android.widget.TextView r0 = r9.f31961t0
            r0.setVisibility(r6)
        L_0x016b:
            android.widget.ImageView r0 = r9.f31954B0
            boolean r1 = r11.isSelected()
            r0.setSelected(r1)
            java.lang.String r0 = r11.getErrorMessage()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x018e
            java.lang.String r0 = r11.getStatus()
            java.lang.String r1 = com.mrsool.utils.C11644i.f33275c7
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L_0x018e
            r8.m51442a(r10, r9)
            goto L_0x01e3
        L_0x018e:
            java.lang.String r0 = r11.getErrorMessage()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x01b4
            java.lang.String r0 = r11.getStatus()
            java.lang.String r1 = com.mrsool.utils.C11644i.f33275c7
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L_0x01b4
            r3 = 1
            r4 = 1
            boolean r5 = r11.isValidationError()
            r0 = r23
            r1 = r25
            r2 = r24
            r0.m51443a(r1, r2, r3, r4, r5)
            goto L_0x01e3
        L_0x01b4:
            java.lang.String r0 = r11.getErrorMessage()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x01ce
            r3 = 0
            r4 = 0
            boolean r5 = r11.isValidationError()
            r0 = r23
            r1 = r25
            r2 = r24
            r0.m51443a(r1, r2, r3, r4, r5)
            goto L_0x01e3
        L_0x01ce:
            boolean r0 = r11.isValidationError()
            if (r0 == 0) goto L_0x01e3
            r3 = 0
            r4 = 0
            boolean r5 = r11.isValidationError()
            r0 = r23
            r1 = r25
            r2 = r24
            r0.m51443a(r1, r2, r3, r4, r5)
        L_0x01e3:
            android.widget.LinearLayout r0 = r9.f31957E0
            r0.removeAllViews()
            r5 = 0
        L_0x01e9:
            java.util.ArrayList r0 = r11.getMenuAddonOptions()
            int r0 = r0.size()
            if (r5 >= r0) goto L_0x0482
            android.content.Context r0 = r8.f31942c
            java.lang.String r1 = "layout_inflater"
            java.lang.Object r0 = r0.getSystemService(r1)
            android.view.LayoutInflater r0 = (android.view.LayoutInflater) r0
            r1 = 2131558890(0x7f0d01ea, float:1.8743109E38)
            r2 = 0
            android.view.View r4 = r0.inflate(r1, r2)
            r0 = 2131363080(0x7f0a0508, float:1.8345959E38)
            android.view.View r0 = r4.findViewById(r0)
            r3 = r0
            android.widget.RelativeLayout r3 = (android.widget.RelativeLayout) r3
            r0 = 2131362755(0x7f0a03c3, float:1.83453E38)
            android.view.View r0 = r4.findViewById(r0)
            r2 = r0
            android.widget.ImageView r2 = (android.widget.ImageView) r2
            r0 = 2131363909(0x7f0a0845, float:1.834764E38)
            android.view.View r0 = r4.findViewById(r0)
            r1 = r0
            android.widget.TextView r1 = (android.widget.TextView) r1
            r0 = 2131363774(0x7f0a07be, float:1.8347366E38)
            android.view.View r0 = r4.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r12 = 2131363817(0x7f0a07e9, float:1.8347454E38)
            android.view.View r12 = r4.findViewById(r12)
            android.widget.TextView r12 = (android.widget.TextView) r12
            r6 = 2131363854(0x7f0a080e, float:1.8347529E38)
            android.view.View r6 = r4.findViewById(r6)
            android.widget.TextView r6 = (android.widget.TextView) r6
            r15 = 2131363788(0x7f0a07cc, float:1.8347395E38)
            android.view.View r15 = r4.findViewById(r15)
            android.widget.TextView r15 = (android.widget.TextView) r15
            com.mrsool.utils.x r7 = r8.f31944e
            r18 = r4
            android.view.View[] r4 = new android.view.View[r14]
            r4[r13] = r1
            r7.mo23582b(r4)
            java.util.ArrayList r4 = r11.getMenuAddonOptions()
            java.lang.Object r4 = r4.get(r5)
            com.mrsool.shopmenu.bean.MenuAddonsOptionsBean r4 = (com.mrsool.shopmenu.bean.MenuAddonsOptionsBean) r4
            java.lang.String r4 = r4.getName()
            r1.setText(r4)
            com.mrsool.utils.x r4 = r8.f31944e
            java.util.ArrayList r7 = r11.getMenuAddonOptions()
            java.lang.Object r7 = r7.get(r5)
            com.mrsool.shopmenu.bean.MenuAddonsOptionsBean r7 = (com.mrsool.shopmenu.bean.MenuAddonsOptionsBean) r7
            java.lang.Double r7 = r7.getPrice()
            java.lang.String r7 = com.mrsool.utils.C5887x.m25809b(r7)
            java.lang.CharSequence r4 = r4.mo23649p(r7)
            r0.setText(r4)
            java.util.ArrayList r4 = r11.getMenuAddonOptions()
            java.lang.Object r4 = r4.get(r5)
            com.mrsool.shopmenu.bean.MenuAddonsOptionsBean r4 = (com.mrsool.shopmenu.bean.MenuAddonsOptionsBean) r4
            java.lang.String r4 = r4.getName()
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 != 0) goto L_0x02a3
            java.util.ArrayList r4 = r11.getMenuAddonOptions()
            java.lang.Object r4 = r4.get(r5)
            com.mrsool.shopmenu.bean.MenuAddonsOptionsBean r4 = (com.mrsool.shopmenu.bean.MenuAddonsOptionsBean) r4
            java.lang.String r4 = r4.getCalories()
            r15.setText(r4)
        L_0x02a3:
            java.lang.String r4 = r8.f31946g
            r12.setText(r4)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r5)
            r3.setTag(r4)
            r4 = 3
            android.widget.TextView[] r7 = new android.widget.TextView[r4]
            r7[r13] = r1
            r7[r14] = r0
            r4 = 2
            r7[r4] = r12
            r8.m51449a(r7)
            java.util.ArrayList r4 = r11.getMenuAddonOptions()
            java.lang.Object r4 = r4.get(r5)
            com.mrsool.shopmenu.bean.MenuAddonsOptionsBean r4 = (com.mrsool.shopmenu.bean.MenuAddonsOptionsBean) r4
            boolean r4 = r4.isSelected()
            r2.setSelected(r4)
            java.util.ArrayList r4 = r11.getMenuAddonOptions()
            java.lang.Object r4 = r4.get(r5)
            com.mrsool.shopmenu.bean.MenuAddonsOptionsBean r4 = (com.mrsool.shopmenu.bean.MenuAddonsOptionsBean) r4
            boolean r4 = r4.isSelected()
            r1.setSelected(r4)
            java.util.ArrayList r4 = r11.getMenuAddonOptions()
            java.lang.Object r4 = r4.get(r5)
            com.mrsool.shopmenu.bean.MenuAddonsOptionsBean r4 = (com.mrsool.shopmenu.bean.MenuAddonsOptionsBean) r4
            boolean r4 = r4.isSelected()
            r15.setSelected(r4)
            java.util.ArrayList r4 = r11.getMenuAddonOptions()
            java.lang.Object r4 = r4.get(r5)
            com.mrsool.shopmenu.bean.MenuAddonsOptionsBean r4 = (com.mrsool.shopmenu.bean.MenuAddonsOptionsBean) r4
            boolean r4 = r4.isSelected()
            r0.setSelected(r4)
            java.util.ArrayList r4 = r11.getMenuAddonOptions()
            java.lang.Object r4 = r4.get(r5)
            com.mrsool.shopmenu.bean.MenuAddonsOptionsBean r4 = (com.mrsool.shopmenu.bean.MenuAddonsOptionsBean) r4
            boolean r4 = r4.isSelected()
            r12.setSelected(r4)
            r7 = 8
            r6.setVisibility(r7)
            r3.setEnabled(r14)
            java.lang.String r4 = r11.getErrorMessage()
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 != 0) goto L_0x0332
            java.lang.String r4 = r11.getStatus()
            java.lang.String r7 = com.mrsool.utils.C11644i.f33275c7
            boolean r4 = r4.equalsIgnoreCase(r7)
            if (r4 == 0) goto L_0x0332
            r3.setEnabled(r13)
        L_0x0332:
            java.util.ArrayList r4 = r11.getMenuAddonOptions()
            java.lang.Object r4 = r4.get(r5)
            com.mrsool.shopmenu.bean.MenuAddonsOptionsBean r4 = (com.mrsool.shopmenu.bean.MenuAddonsOptionsBean) r4
            java.lang.String r4 = r4.getErrorMessage()
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 == 0) goto L_0x0384
            java.util.ArrayList r4 = r11.getMenuAddonOptions()
            java.lang.Object r4 = r4.get(r5)
            com.mrsool.shopmenu.bean.MenuAddonsOptionsBean r4 = (com.mrsool.shopmenu.bean.MenuAddonsOptionsBean) r4
            java.lang.String r4 = r4.getStatus()
            java.lang.String r7 = com.mrsool.utils.C11644i.f33275c7
            boolean r4 = r4.equalsIgnoreCase(r7)
            if (r4 == 0) goto L_0x0384
            com.mrsool.utils.x r0 = r8.f31944e
            r0.mo23557a(r13, r3, r14)
            java.util.List<com.mrsool.shopmenu.bean.MenuAddonsBean> r0 = r8.f31943d
            java.lang.Object r0 = r0.get(r10)
            com.mrsool.shopmenu.bean.MenuAddonsBean r0 = (com.mrsool.shopmenu.bean.MenuAddonsBean) r0
            java.util.ArrayList r0 = r0.getMenuAddonOptions()
            java.lang.Object r0 = r0.get(r5)
            com.mrsool.shopmenu.bean.MenuAddonsOptionsBean r0 = (com.mrsool.shopmenu.bean.MenuAddonsOptionsBean) r0
            r0.setSelected(r13)
            r2.setSelected(r13)
            r17 = r1
            r20 = r3
            r12 = r5
            r21 = r18
            r16 = 3
            goto L_0x0448
        L_0x0384:
            java.util.ArrayList r4 = r11.getMenuAddonOptions()
            java.lang.Object r4 = r4.get(r5)
            com.mrsool.shopmenu.bean.MenuAddonsOptionsBean r4 = (com.mrsool.shopmenu.bean.MenuAddonsOptionsBean) r4
            java.lang.String r4 = r4.getErrorMessage()
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            r7 = 5
            if (r4 != 0) goto L_0x03f3
            java.util.ArrayList r4 = r11.getMenuAddonOptions()
            java.lang.Object r4 = r4.get(r5)
            com.mrsool.shopmenu.bean.MenuAddonsOptionsBean r4 = (com.mrsool.shopmenu.bean.MenuAddonsOptionsBean) r4
            java.lang.String r4 = r4.getStatus()
            java.lang.String r14 = com.mrsool.utils.C11644i.f33275c7
            boolean r4 = r4.equalsIgnoreCase(r14)
            if (r4 == 0) goto L_0x03f3
            r14 = 1
            r19 = 1
            android.widget.TextView[] r7 = new android.widget.TextView[r7]
            r7[r13] = r1
            r4 = 1
            r7[r4] = r0
            r0 = 2
            r7[r0] = r12
            r12 = 3
            r7[r12] = r6
            r0 = 4
            r7[r0] = r15
            r0 = r23
            r17 = r1
            r1 = r25
            r4 = r2
            r2 = r5
            r20 = r3
            r3 = r4
            r21 = r18
            r4 = r20
            r22 = r5
            r5 = r14
            r14 = r6
            r6 = r19
            r16 = 3
            r0.m51441a(r1, r2, r3, r4, r5, r6, r7)
            r14.setVisibility(r13)
            java.util.ArrayList r0 = r11.getMenuAddonOptions()
            r6 = r22
            java.lang.Object r0 = r0.get(r6)
            com.mrsool.shopmenu.bean.MenuAddonsOptionsBean r0 = (com.mrsool.shopmenu.bean.MenuAddonsOptionsBean) r0
            java.lang.String r0 = r0.getErrorMessage()
            r14.setText(r0)
            goto L_0x0447
        L_0x03f3:
            r17 = r1
            r4 = r2
            r20 = r3
            r14 = r6
            r21 = r18
            r16 = 3
            r6 = r5
            java.util.ArrayList r1 = r11.getMenuAddonOptions()
            java.lang.Object r1 = r1.get(r6)
            com.mrsool.shopmenu.bean.MenuAddonsOptionsBean r1 = (com.mrsool.shopmenu.bean.MenuAddonsOptionsBean) r1
            java.lang.String r1 = r1.getErrorMessage()
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x0447
            r5 = 0
            r18 = 0
            android.widget.TextView[] r7 = new android.widget.TextView[r7]
            r7[r13] = r17
            r1 = 1
            r7[r1] = r0
            r0 = 2
            r7[r0] = r12
            r7[r16] = r14
            r12 = 4
            r7[r12] = r15
            r0 = r23
            r1 = r25
            r2 = r6
            r3 = r4
            r4 = r20
            r12 = r6
            r6 = r18
            r0.m51441a(r1, r2, r3, r4, r5, r6, r7)
            r14.setVisibility(r13)
            java.util.ArrayList r0 = r11.getMenuAddonOptions()
            java.lang.Object r0 = r0.get(r12)
            com.mrsool.shopmenu.bean.MenuAddonsOptionsBean r0 = (com.mrsool.shopmenu.bean.MenuAddonsOptionsBean) r0
            java.lang.String r0 = r0.getErrorMessage()
            r14.setText(r0)
            goto L_0x0448
        L_0x0447:
            r12 = r6
        L_0x0448:
            com.mrsool.shopmenu.n$a r0 = new com.mrsool.shopmenu.n$a
            r0.<init>(r10)
            r1 = r20
            r1.setOnClickListener(r0)
            android.view.ViewParent r0 = r21.getParent()
            if (r0 == 0) goto L_0x0464
            android.view.ViewParent r0 = r21.getParent()
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r1 = r21
            r0.removeView(r1)
            goto L_0x0466
        L_0x0464:
            r1 = r21
        L_0x0466:
            com.mrsool.utils.x r0 = r8.f31944e
            r2 = 2
            android.view.View[] r3 = new android.view.View[r2]
            r3[r13] = r17
            r2 = 1
            r3[r2] = r15
            r0.mo23608d(r3)
            android.widget.LinearLayout r0 = r9.f31957E0
            r0.addView(r1)
            int r5 = r12 + 1
            r6 = 8
            r7 = 3
            r12 = 4
            r14 = 1
            r15 = 2
            goto L_0x01e9
        L_0x0482:
            r2 = 1
            com.mrsool.utils.x r0 = r8.f31944e
            android.view.View[] r1 = new android.view.View[r2]
            android.widget.TextView r2 = r9.f31960s0
            r1[r13] = r2
            r0.mo23608d(r1)
            goto L_0x058a
        L_0x0490:
            android.widget.RelativeLayout r0 = r9.f31959G0
            r0.setVisibility(r13)
            android.widget.LinearLayout r0 = r9.f31956D0
            r1 = 8
            r0.setVisibility(r1)
            android.widget.TextView r0 = r9.f31962u0
            java.lang.String r2 = r11.getName()
            r0.setText(r2)
            java.lang.String r0 = r11.getName()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x04b8
            android.widget.TextView r0 = r9.f31953A0
            java.lang.String r2 = r11.getCalories()
            r0.setText(r2)
        L_0x04b8:
            android.widget.TextView r0 = r9.f31963v0
            com.mrsool.utils.x r2 = r8.f31944e
            java.lang.Double r3 = r11.getPrice()
            java.lang.String r3 = com.mrsool.utils.C5887x.m25809b(r3)
            java.lang.CharSequence r2 = r2.mo23649p(r3)
            r0.setText(r2)
            android.widget.TextView r0 = r9.f31964w0
            java.lang.String r2 = r8.f31946g
            r0.setText(r2)
            android.widget.ImageView r0 = r9.f31955C0
            boolean r2 = r11.isSelected()
            r0.setSelected(r2)
            android.widget.TextView r0 = r9.f31962u0
            boolean r2 = r11.isSelected()
            r0.setSelected(r2)
            android.widget.TextView r0 = r9.f31953A0
            boolean r2 = r11.isSelected()
            r0.setSelected(r2)
            android.widget.TextView r0 = r9.f31963v0
            boolean r2 = r11.isSelected()
            r0.setSelected(r2)
            android.widget.TextView r0 = r9.f31964w0
            boolean r2 = r11.isSelected()
            r0.setSelected(r2)
            android.widget.TextView r0 = r9.f31967z0
            r0.setVisibility(r1)
            android.widget.RelativeLayout r0 = r9.f31959G0
            r1 = 1
            r0.setEnabled(r1)
            java.lang.String r0 = r11.getErrorMessage()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x052d
            java.lang.String r0 = r11.getStatus()
            java.lang.String r1 = com.mrsool.utils.C11644i.f33275c7
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L_0x052d
            r3 = 1
            r4 = 1
            r5 = 0
            r0 = r23
            r1 = r25
            r2 = r24
            r0.m51451b(r1, r2, r3, r4, r5)
            goto L_0x0566
        L_0x052d:
            java.lang.String r0 = r11.getErrorMessage()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0550
            java.lang.String r0 = r11.getStatus()
            java.lang.String r1 = com.mrsool.utils.C11644i.f33275c7
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L_0x0550
            r3 = 1
            r4 = 1
            r5 = 1
            r0 = r23
            r1 = r25
            r2 = r24
            r0.m51451b(r1, r2, r3, r4, r5)
            goto L_0x0566
        L_0x0550:
            java.lang.String r0 = r11.getErrorMessage()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0566
            r3 = 0
            r4 = 0
            r5 = 1
            r0 = r23
            r1 = r25
            r2 = r24
            r0.m51451b(r1, r2, r3, r4, r5)
        L_0x0566:
            android.widget.TextView r0 = r9.f31960s0
            java.lang.String r1 = r11.getName()
            r0.setText(r1)
            com.mrsool.utils.x r0 = r8.f31944e
            r1 = 2
            android.view.View[] r1 = new android.view.View[r1]
            android.widget.TextView r2 = r9.f31962u0
            r1[r13] = r2
            android.widget.TextView r2 = r9.f31953A0
            r3 = 1
            r1[r3] = r2
            r0.mo23608d(r1)
            android.widget.RelativeLayout r0 = r9.f31959G0
            com.mrsool.shopmenu.n$b r1 = new com.mrsool.shopmenu.n$b
            r1.<init>(r10, r11)
            r0.setOnClickListener(r1)
        L_0x058a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mrsool.shopmenu.C11378n.mo7330b(com.mrsool.shopmenu.n$d, int):void");
    }

    /* renamed from: b */
    public C11382d m51460b(ViewGroup viewGroup, int i) {
        return new C11382d(LayoutInflater.from(viewGroup.getContext()).inflate(C10232R.layout.row_menu_addon_multiple, viewGroup, false));
    }

    /* renamed from: b */
    private void m51451b(int i, C11382d dVar, boolean z, boolean z2, boolean z3) {
        if (z3) {
            m51453b(dVar.f31962u0, dVar.f31963v0, dVar.f31964w0, dVar.f31953A0);
        } else {
            m51449a(dVar.f31962u0, dVar.f31963v0, dVar.f31964w0, dVar.f31953A0);
        }
        m51448a(true, dVar.f31962u0, dVar.f31963v0, dVar.f31964w0, dVar.f31953A0);
        if (z3) {
            dVar.f31967z0.setVisibility(0);
            dVar.f31967z0.setText(((MenuAddonsBean) this.f31943d.get(i)).getErrorMessage());
        }
        if (z) {
            dVar.f31959G0.setEnabled(false);
            this.f31944e.mo23557a(false, (View) dVar.f31959G0, !z3);
        }
        if (z2) {
            dVar.f31955C0.setSelected(false);
            ((MenuAddonsBean) this.f31943d.get(i)).setSelected(false);
        }
        if (!z3 && z) {
            m51448a(false, dVar.f31962u0, dVar.f31963v0, dVar.f31964w0, dVar.f31953A0);
        }
    }

    /* renamed from: b */
    private void m51450b(int i, C11382d dVar) {
        m51453b(dVar.f31962u0, dVar.f31963v0, dVar.f31964w0, dVar.f31953A0);
        ((MenuAddonsBean) this.f31943d.get(i)).setSelected(false);
        dVar.f31962u0.setSelected(true);
        dVar.f31953A0.setSelected(true);
        dVar.f31963v0.setSelected(true);
        dVar.f31964w0.setSelected(true);
        dVar.f31955C0.setSelected(false);
        dVar.f31959G0.setEnabled(false);
        dVar.f31967z0.setVisibility(0);
        dVar.f31967z0.setText(((MenuAddonsBean) this.f31943d.get(i)).getErrorMessage());
    }

    /* renamed from: b */
    private void m51453b(TextView... textViewArr) {
        for (TextView textView : textViewArr) {
            if (textView != null) {
                textView.setTextColor(this.f31942c.getResources().getColorStateList(C10232R.C10234color.bg_menu_text_price_red));
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m51452b(int i, Boolean bool) {
        boolean z = !((MenuAddonsBean) this.f31943d.get(i)).isSelected();
        if (bool.booleanValue() || z || ((MenuAddonsBean) this.f31943d.get(i)).getMinAllowedOption() != 1) {
            ((MenuAddonsBean) this.f31943d.get(i)).setSelected(z);
            mo7337d(i);
        }
    }

    /* renamed from: b */
    public int mo7325b() {
        List<MenuAddonsBean> list = this.f31943d;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    /* renamed from: a */
    private void m51448a(boolean z, TextView... textViewArr) {
        for (TextView textView : textViewArr) {
            if (textView != null) {
                textView.setSelected(z);
            }
        }
    }

    /* renamed from: a */
    private void m51443a(int i, C11382d dVar, boolean z, boolean z2, boolean z3) {
        m51453b(dVar.f31960s0, dVar.f31965x0, dVar.f31966y0, dVar.f31961t0);
        dVar.f31960s0.setSelected(true);
        dVar.f31965x0.setSelected(true);
        dVar.f31966y0.setSelected(true);
        dVar.f31961t0.setSelected(true);
        if (z3) {
            String str = "";
            if (((MenuAddonsBean) this.f31943d.get(i)).getMaxAllowedOption() <= 0 || ((MenuAddonsBean) this.f31943d.get(i)).getMinAllowedOption() <= 0) {
                int maxAllowedOption = ((MenuAddonsBean) this.f31943d.get(i)).getMaxAllowedOption();
                String str2 = C3868i.f12248b;
                if (maxAllowedOption > 0) {
                    TextView textView = dVar.f31961t0;
                    StringBuilder sb = new StringBuilder();
                    sb.append(str);
                    sb.append(((MenuAddonsBean) this.f31943d.get(i)).getMaxAllowedOption());
                    sb.append(str2);
                    sb.append(this.f31942c.getResources().getString(C10232R.string.lbl_option_max));
                    textView.setText(sb.toString());
                } else if (((MenuAddonsBean) this.f31943d.get(i)).getMinAllowedOption() > 0) {
                    TextView textView2 = dVar.f31961t0;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(str);
                    sb2.append(((MenuAddonsBean) this.f31943d.get(i)).getMinAllowedOption());
                    sb2.append(str2);
                    sb2.append(this.f31942c.getResources().getString(C10232R.string.lbl_option_min));
                    textView2.setText(sb2.toString());
                }
            } else {
                TextView textView3 = dVar.f31961t0;
                String string = this.f31942c.getResources().getString(C10232R.string.lbl_option_min_max);
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str);
                sb3.append(((MenuAddonsBean) this.f31943d.get(i)).getMinAllowedOption());
                StringBuilder sb4 = new StringBuilder();
                sb4.append(str);
                sb4.append(((MenuAddonsBean) this.f31943d.get(i)).getMaxAllowedOption());
                textView3.setText(String.format(string, new Object[]{sb3.toString(), sb4.toString()}));
            }
        } else {
            dVar.f31961t0.setText(((MenuAddonsBean) this.f31943d.get(i)).getErrorMessage());
        }
        dVar.f31961t0.setSelected(true);
        dVar.f31961t0.setVisibility(0);
        if (z) {
            this.f31944e.mo23557a(false, (View) dVar.f31957E0, true);
        }
        if (z2) {
            Iterator it = ((MenuAddonsBean) this.f31943d.get(i)).getMenuAddonOptions().iterator();
            while (it.hasNext()) {
                ((MenuAddonsOptionsBean) it.next()).setSelected(false);
            }
        }
    }

    /* renamed from: a */
    private void m51445a(C11382d dVar, boolean z) {
        if (z) {
            dVar.f31960s0.setTextColor(C0841b.m4915a(this.f31942c, (int) C10232R.C10234color.red_lite_2));
            dVar.f31961t0.setTextColor(C0841b.m4915a(this.f31942c, (int) C10232R.C10234color.red_lite_2));
            dVar.f31965x0.setTextColor(C0841b.m4915a(this.f31942c, (int) C10232R.C10234color.red_lite_2));
            dVar.f31966y0.setTextColor(C0841b.m4915a(this.f31942c, (int) C10232R.C10234color.red_lite_2));
            return;
        }
        dVar.f31960s0.setTextColor(C0841b.m4915a(this.f31942c, (int) C10232R.C10234color.shops_title_text_gray));
        dVar.f31961t0.setTextColor(C0841b.m4915a(this.f31942c, (int) C10232R.C10234color.search_text_gray));
        dVar.f31965x0.setTextColor(C0841b.m4915a(this.f31942c, (int) C10232R.C10234color.bg_menu_text_price_blue));
        dVar.f31966y0.setTextColor(C0841b.m4915a(this.f31942c, (int) C10232R.C10234color.bg_menu_text_price_blue));
    }

    /* renamed from: a */
    private void m51442a(int i, C11382d dVar) {
        ((MenuAddonsBean) this.f31943d.get(i)).setSelected(false);
        this.f31944e.mo23557a(false, (View) dVar.f31957E0, true);
        dVar.f31954B0.setSelected(false);
        m51448a(false, dVar.f31960s0, dVar.f31965x0, dVar.f31966y0);
        Iterator it = ((MenuAddonsBean) this.f31943d.get(i)).getMenuAddonOptions().iterator();
        while (it.hasNext()) {
            ((MenuAddonsOptionsBean) it.next()).setSelected(false);
        }
    }

    /* renamed from: a */
    private void m51441a(int i, int i2, ImageView imageView, View view, boolean z, boolean z2, TextView... textViewArr) {
        for (TextView textView : textViewArr) {
            if (textView != null) {
                m51453b(textViewArr);
                textView.setSelected(true);
            }
        }
        if (z) {
            this.f31944e.mo23557a(false, view, false);
        }
        if (z2) {
            ((MenuAddonsOptionsBean) ((MenuAddonsBean) this.f31943d.get(i)).getMenuAddonOptions().get(i2)).setSelected(false);
            imageView.setSelected(false);
        }
    }

    /* renamed from: a */
    private void m51449a(TextView... textViewArr) {
        for (TextView textView : textViewArr) {
            if (textView != null) {
                textView.setTextColor(this.f31942c.getResources().getColorStateList(C10232R.C10234color.bg_menu_text_price_blue));
            }
        }
    }

    /* renamed from: a */
    private void m51444a(int i, Boolean bool) {
        for (int i2 = 0; i2 < ((MenuAddonsBean) this.f31943d.get(i)).getMenuAddonOptions().size(); i2++) {
            ((MenuAddonsOptionsBean) ((MenuAddonsBean) this.f31943d.get(i)).getMenuAddonOptions().get(i2)).setSelected(bool.booleanValue());
        }
        ((MenuAddonsBean) this.f31943d.get(i)).setSelected(bool.booleanValue());
        mo7337d(i);
    }

    /* renamed from: a */
    public void mo39427a(C11381c cVar) {
        this.f31945f = cVar;
    }
}
