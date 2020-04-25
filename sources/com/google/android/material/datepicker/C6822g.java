package com.google.android.material.datepicker;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnDismissListener;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import androidx.annotation.C0214q0;
import androidx.annotation.C0216r0;
import androidx.appcompat.p006a.p007a.C0242a;
import androidx.core.p033k.C0938f;
import androidx.core.p034l.C0947a;
import androidx.core.p034l.C0962e0;
import androidx.fragment.app.C1374b;
import androidx.fragment.app.C1406n;
import com.google.android.material.C5582R;
import com.google.android.material.datepicker.CalendarConstraints.C6795b;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.p187p.C6978j;
import com.google.android.material.p296f.C6844a;
import com.google.android.material.p302m.C6951b;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* renamed from: com.google.android.material.datepicker.g */
/* compiled from: MaterialDatePicker */
public final class C6822g<S> extends C1374b {

    /* renamed from: b0 */
    private static final String f18990b0 = "OVERRIDE_THEME_RES_ID";

    /* renamed from: c0 */
    private static final String f18991c0 = "DATE_SELECTOR_KEY";

    /* renamed from: d0 */
    private static final String f18992d0 = "CALENDAR_CONSTRAINTS_KEY";

    /* renamed from: e0 */
    private static final String f18993e0 = "TITLE_TEXT_RES_ID_KEY";

    /* renamed from: f0 */
    private static final String f18994f0 = "TITLE_TEXT_KEY";

    /* renamed from: g0 */
    static final Object f18995g0 = "CONFIRM_BUTTON_TAG";

    /* renamed from: h0 */
    static final Object f18996h0 = "CANCEL_BUTTON_TAG";

    /* renamed from: i0 */
    static final Object f18997i0 = "TOGGLE_BUTTON_TAG";

    /* renamed from: N */
    private final LinkedHashSet<OnCancelListener> f18998N = new LinkedHashSet<>();

    /* renamed from: O */
    private final LinkedHashSet<OnDismissListener> f18999O = new LinkedHashSet<>();
    @C0216r0

    /* renamed from: P */
    private int f19000P;
    /* access modifiers changed from: private */
    @C0195i0

    /* renamed from: Q */
    public DateSelector<S> f19001Q;

    /* renamed from: R */
    private C6837n<S> f19002R;
    @C0195i0

    /* renamed from: S */
    private CalendarConstraints f19003S;

    /* renamed from: T */
    private C6809f<S> f19004T;
    @C0214q0

    /* renamed from: U */
    private int f19005U;

    /* renamed from: V */
    private CharSequence f19006V;

    /* renamed from: W */
    private boolean f19007W;

    /* renamed from: X */
    private TextView f19008X;
    /* access modifiers changed from: private */

    /* renamed from: Y */
    public CheckableImageButton f19009Y;
    @C0195i0

    /* renamed from: Z */
    private C6978j f19010Z;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final LinkedHashSet<C6828h<? super S>> f19011a = new LinkedHashSet<>();
    /* access modifiers changed from: private */

    /* renamed from: a0 */
    public Button f19012a0;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final LinkedHashSet<OnClickListener> f19013b = new LinkedHashSet<>();

    /* renamed from: com.google.android.material.datepicker.g$a */
    /* compiled from: MaterialDatePicker */
    class C6823a implements OnClickListener {
        C6823a() {
        }

        public void onClick(View view) {
            Iterator it = C6822g.this.f19011a.iterator();
            while (it.hasNext()) {
                ((C6828h) it.next()).mo27192a(C6822g.this.mo27169B());
            }
            C6822g.this.dismiss();
        }
    }

    /* renamed from: com.google.android.material.datepicker.g$b */
    /* compiled from: MaterialDatePicker */
    class C6824b implements OnClickListener {
        C6824b() {
        }

        public void onClick(View view) {
            Iterator it = C6822g.this.f19013b.iterator();
            while (it.hasNext()) {
                ((OnClickListener) it.next()).onClick(view);
            }
            C6822g.this.dismiss();
        }
    }

    /* renamed from: com.google.android.material.datepicker.g$c */
    /* compiled from: MaterialDatePicker */
    class C6825c implements C6836m<S> {
        C6825c() {
        }

        /* renamed from: a */
        public void mo27184a(S s) {
            C6822g.this.m32608F();
            if (C6822g.this.f19001Q.mo27100f()) {
                C6822g.this.f19012a0.setEnabled(true);
            } else {
                C6822g.this.f19012a0.setEnabled(false);
            }
        }
    }

    /* renamed from: com.google.android.material.datepicker.g$d */
    /* compiled from: MaterialDatePicker */
    class C6826d implements OnClickListener {
        C6826d() {
        }

        public void onClick(View view) {
            C6822g.this.f19009Y.toggle();
            C6822g gVar = C6822g.this;
            gVar.m32613a(gVar.f19009Y);
            C6822g.this.m32605C();
        }
    }

    /* renamed from: com.google.android.material.datepicker.g$e */
    /* compiled from: MaterialDatePicker */
    public static final class C6827e<S> {

        /* renamed from: a */
        final DateSelector<S> f19018a;

        /* renamed from: b */
        int f19019b = 0;

        /* renamed from: c */
        CalendarConstraints f19020c;

        /* renamed from: d */
        int f19021d = 0;

        /* renamed from: e */
        CharSequence f19022e = null;
        @C0195i0

        /* renamed from: f */
        S f19023f = null;

        private C6827e(DateSelector<S> dateSelector) {
            this.f19018a = dateSelector;
        }

        @C0193h0
        /* renamed from: a */
        static <S> C6827e<S> m32640a(DateSelector<S> dateSelector) {
            return new C6827e<>(dateSelector);
        }

        @C0193h0
        /* renamed from: b */
        public static C6827e<Long> m32641b() {
            return new C6827e<>(new SingleDateSelector());
        }

        @C0193h0
        /* renamed from: c */
        public static C6827e<C0938f<Long, Long>> m32642c() {
            return new C6827e<>(new RangeDateSelector());
        }

        @C0193h0
        /* renamed from: a */
        public C6827e<S> mo27189a(S s) {
            this.f19023f = s;
            return this;
        }

        @C0193h0
        /* renamed from: b */
        public C6827e<S> mo27191b(@C0214q0 int i) {
            this.f19021d = i;
            this.f19022e = null;
            return this;
        }

        @C0193h0
        /* renamed from: a */
        public C6827e<S> mo27186a(@C0216r0 int i) {
            this.f19019b = i;
            return this;
        }

        @C0193h0
        /* renamed from: a */
        public C6827e<S> mo27187a(CalendarConstraints calendarConstraints) {
            this.f19020c = calendarConstraints;
            return this;
        }

        @C0193h0
        /* renamed from: a */
        public C6827e<S> mo27188a(@C0195i0 CharSequence charSequence) {
            this.f19022e = charSequence;
            this.f19021d = 0;
            return this;
        }

        @C0193h0
        /* renamed from: a */
        public C6822g<S> mo27190a() {
            if (this.f19020c == null) {
                this.f19020c = new C6795b().mo27090a();
            }
            if (this.f19021d == 0) {
                this.f19021d = this.f19018a.mo27099e();
            }
            S s = this.f19023f;
            if (s != null) {
                this.f19018a.mo27096a(s);
            }
            return C6822g.m32610a(this);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: C */
    public void m32605C() {
        this.f19004T = C6809f.m32581a(this.f19001Q, m32618d(requireContext()), this.f19003S);
        this.f19002R = this.f19009Y.isChecked() ? C6830j.m32650a(this.f19001Q, this.f19003S) : this.f19004T;
        m32608F();
        C1406n a = getChildFragmentManager().mo6224a();
        a.mo6405b(C5582R.C5586id.mtrl_calendar_frame, this.f19002R);
        a.mo6103g();
        this.f19002R.mo27211a(new C6825c());
    }

    /* renamed from: D */
    public static long m32606D() {
        return Month.m32507k().f18909R;
    }

    /* renamed from: E */
    public static long m32607E() {
        return C6840p.m32699f().getTimeInMillis();
    }

    /* access modifiers changed from: private */
    /* renamed from: F */
    public void m32608F() {
        String A = mo27168A();
        this.f19008X.setContentDescription(String.format(getString(C5582R.string.mtrl_picker_announce_current_selection), new Object[]{A}));
        this.f19008X.setText(A);
    }

    /* renamed from: A */
    public String mo27168A() {
        return this.f19001Q.mo27094a(getContext());
    }

    @C0195i0
    /* renamed from: B */
    public final S mo27169B() {
        return this.f19001Q.mo27102h();
    }

    public final void onCancel(@C0193h0 DialogInterface dialogInterface) {
        Iterator it = this.f18998N.iterator();
        while (it.hasNext()) {
            ((OnCancelListener) it.next()).onCancel(dialogInterface);
        }
        super.onCancel(dialogInterface);
    }

    public final void onCreate(@C0195i0 Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.f19000P = bundle.getInt(f18990b0);
        this.f19001Q = (DateSelector) bundle.getParcelable(f18991c0);
        this.f19003S = (CalendarConstraints) bundle.getParcelable(f18992d0);
        this.f19005U = bundle.getInt(f18993e0);
        this.f19006V = bundle.getCharSequence(f18994f0);
    }

    @C0193h0
    public final Dialog onCreateDialog(@C0195i0 Bundle bundle) {
        Dialog dialog = new Dialog(requireContext(), m32618d(requireContext()));
        Context context = dialog.getContext();
        this.f19007W = m32623f(context);
        int b = C6951b.m33329b(context, C5582R.attr.colorSurface, C6822g.class.getCanonicalName());
        this.f19010Z = new C6978j(context, null, C5582R.attr.materialCalendarStyle, C5582R.style.Widget_MaterialComponents_MaterialCalendar);
        this.f19010Z.mo27789a(context);
        this.f19010Z.mo27790a(ColorStateList.valueOf(b));
        this.f19010Z.mo27799b(C0962e0.m5551r(dialog.getWindow().getDecorView()));
        return dialog;
    }

    @C0193h0
    public final View onCreateView(@C0193h0 LayoutInflater layoutInflater, @C0195i0 ViewGroup viewGroup, @C0195i0 Bundle bundle) {
        View inflate = layoutInflater.inflate(this.f19007W ? C5582R.layout.mtrl_picker_fullscreen : C5582R.layout.mtrl_picker_dialog, viewGroup);
        Context context = inflate.getContext();
        if (this.f19007W) {
            inflate.findViewById(C5582R.C5586id.mtrl_calendar_frame).setLayoutParams(new LayoutParams(m32616c(context), -2));
        } else {
            View findViewById = inflate.findViewById(C5582R.C5586id.mtrl_calendar_main_pane);
            View findViewById2 = inflate.findViewById(C5582R.C5586id.mtrl_calendar_frame);
            findViewById.setLayoutParams(new LayoutParams(m32616c(context), -1));
            findViewById2.setMinimumHeight(m32614b(requireContext()));
        }
        this.f19008X = (TextView) inflate.findViewById(C5582R.C5586id.mtrl_picker_header_selection_text);
        C0962e0.m5527k((View) this.f19008X, 1);
        this.f19009Y = (CheckableImageButton) inflate.findViewById(C5582R.C5586id.mtrl_picker_header_toggle);
        TextView textView = (TextView) inflate.findViewById(C5582R.C5586id.mtrl_picker_title_text);
        CharSequence charSequence = this.f19006V;
        if (charSequence != null) {
            textView.setText(charSequence);
        } else {
            textView.setText(this.f19005U);
        }
        m32621e(context);
        this.f19012a0 = (Button) inflate.findViewById(C5582R.C5586id.confirm_button);
        if (this.f19001Q.mo27100f()) {
            this.f19012a0.setEnabled(true);
        } else {
            this.f19012a0.setEnabled(false);
        }
        this.f19012a0.setTag(f18995g0);
        this.f19012a0.setOnClickListener(new C6823a());
        Button button = (Button) inflate.findViewById(C5582R.C5586id.cancel_button);
        button.setTag(f18996h0);
        button.setOnClickListener(new C6824b());
        return inflate;
    }

    public final void onDismiss(@C0193h0 DialogInterface dialogInterface) {
        Iterator it = this.f18999O.iterator();
        while (it.hasNext()) {
            ((OnDismissListener) it.next()).onDismiss(dialogInterface);
        }
        ViewGroup viewGroup = (ViewGroup) getView();
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        super.onDismiss(dialogInterface);
    }

    public final void onSaveInstanceState(@C0193h0 Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt(f18990b0, this.f19000P);
        bundle.putParcelable(f18991c0, this.f19001Q);
        C6795b bVar = new C6795b(this.f19003S);
        if (this.f19004T.mo27155A() != null) {
            bVar.mo27091b(this.f19004T.mo27155A().f18909R);
        }
        bundle.putParcelable(f18992d0, bVar.mo27090a());
        bundle.putInt(f18993e0, this.f19005U);
        bundle.putCharSequence(f18994f0, this.f19006V);
    }

    public void onStart() {
        super.onStart();
        Window window = requireDialog().getWindow();
        if (this.f19007W) {
            window.setLayout(-1, -1);
            window.setBackgroundDrawable(this.f19010Z);
        } else {
            window.setLayout(-2, -2);
            int dimensionPixelOffset = getResources().getDimensionPixelOffset(C5582R.dimen.mtrl_calendar_dialog_background_inset);
            Rect rect = new Rect(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
            InsetDrawable insetDrawable = new InsetDrawable(this.f19010Z, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
            window.setBackgroundDrawable(insetDrawable);
            window.getDecorView().setOnTouchListener(new C6844a(requireDialog(), rect));
        }
        m32605C();
    }

    public void onStop() {
        this.f19002R.mo27213w();
        super.onStop();
    }

    /* renamed from: w */
    public void mo27178w() {
        this.f18998N.clear();
    }

    /* renamed from: x */
    public void mo27179x() {
        this.f18999O.clear();
    }

    /* renamed from: y */
    public void mo27180y() {
        this.f19013b.clear();
    }

    /* renamed from: z */
    public void mo27181z() {
        this.f19011a.clear();
    }

    /* renamed from: b */
    private static int m32614b(@C0193h0 Context context) {
        Resources resources = context.getResources();
        int dimensionPixelSize = (C6832k.f19033P * resources.getDimensionPixelSize(C5582R.dimen.mtrl_calendar_day_height)) + ((C6832k.f19033P - 1) * resources.getDimensionPixelOffset(C5582R.dimen.mtrl_calendar_month_vertical_padding));
        return resources.getDimensionPixelSize(C5582R.dimen.mtrl_calendar_navigation_height) + resources.getDimensionPixelOffset(C5582R.dimen.mtrl_calendar_navigation_top_padding) + resources.getDimensionPixelOffset(C5582R.dimen.mtrl_calendar_navigation_bottom_padding) + resources.getDimensionPixelSize(C5582R.dimen.mtrl_calendar_days_of_week_height) + dimensionPixelSize + resources.getDimensionPixelOffset(C5582R.dimen.mtrl_calendar_bottom_padding);
    }

    /* renamed from: c */
    private static int m32616c(@C0193h0 Context context) {
        Resources resources = context.getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(C5582R.dimen.mtrl_calendar_content_padding);
        int i = Month.m32507k().f18907P;
        return (dimensionPixelOffset * 2) + (resources.getDimensionPixelSize(C5582R.dimen.mtrl_calendar_day_width) * i) + ((i - 1) * resources.getDimensionPixelOffset(C5582R.dimen.mtrl_calendar_month_horizontal_padding));
    }

    /* renamed from: d */
    private int m32618d(Context context) {
        int i = this.f19000P;
        if (i != 0) {
            return i;
        }
        return this.f19001Q.mo27097b(context);
    }

    /* renamed from: e */
    private void m32621e(Context context) {
        this.f19009Y.setTag(f18997i0);
        this.f19009Y.setImageDrawable(m32609a(context));
        C0962e0.m5443a((View) this.f19009Y, (C0947a) null);
        m32613a(this.f19009Y);
        this.f19009Y.setOnClickListener(new C6826d());
    }

    /* renamed from: f */
    static boolean m32623f(@C0193h0 Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(C6951b.m33329b(context, C5582R.attr.materialCalendarStyle, C6809f.class.getCanonicalName()), new int[]{16843277});
        boolean z = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        return z;
    }

    @C0193h0
    /* renamed from: a */
    static <S> C6822g<S> m32610a(@C0193h0 C6827e<S> eVar) {
        C6822g<S> gVar = new C6822g<>();
        Bundle bundle = new Bundle();
        bundle.putInt(f18990b0, eVar.f19019b);
        bundle.putParcelable(f18991c0, eVar.f19018a);
        bundle.putParcelable(f18992d0, eVar.f19020c);
        bundle.putInt(f18993e0, eVar.f19021d);
        bundle.putCharSequence(f18994f0, eVar.f19022e);
        gVar.setArguments(bundle);
        return gVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m32613a(@C0193h0 CheckableImageButton checkableImageButton) {
        String str;
        if (this.f19009Y.isChecked()) {
            str = checkableImageButton.getContext().getString(C5582R.string.mtrl_picker_toggle_to_calendar_input_mode);
        } else {
            str = checkableImageButton.getContext().getString(C5582R.string.mtrl_picker_toggle_to_text_input_mode);
        }
        this.f19009Y.setContentDescription(str);
    }

    /* renamed from: b */
    public boolean mo27177b(C6828h<? super S> hVar) {
        return this.f19011a.remove(hVar);
    }

    /* renamed from: b */
    public boolean mo27176b(OnClickListener onClickListener) {
        return this.f19013b.remove(onClickListener);
    }

    /* renamed from: b */
    public boolean mo27174b(OnCancelListener onCancelListener) {
        return this.f18998N.remove(onCancelListener);
    }

    @C0193h0
    /* renamed from: a */
    private static Drawable m32609a(Context context) {
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{16842912}, C0242a.m1109c(context, C5582R.C5585drawable.ic_calendar_black_24dp));
        stateListDrawable.addState(new int[0], C0242a.m1109c(context, C5582R.C5585drawable.ic_edit_black_24dp));
        return stateListDrawable;
    }

    /* renamed from: b */
    public boolean mo27175b(OnDismissListener onDismissListener) {
        return this.f18999O.remove(onDismissListener);
    }

    /* renamed from: a */
    public boolean mo27173a(C6828h<? super S> hVar) {
        return this.f19011a.add(hVar);
    }

    /* renamed from: a */
    public boolean mo27172a(OnClickListener onClickListener) {
        return this.f19013b.add(onClickListener);
    }

    /* renamed from: a */
    public boolean mo27170a(OnCancelListener onCancelListener) {
        return this.f18998N.add(onCancelListener);
    }

    /* renamed from: a */
    public boolean mo27171a(OnDismissListener onDismissListener) {
        return this.f18999O.add(onDismissListener);
    }
}
