package com.instabug.featuresrequest.p373ui.p379e;

import android.content.Context;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.util.Patterns;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnFocusChangeListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.content.C0841b;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.instabug.featuresrequest.C9525R;
import com.instabug.featuresrequest.p369b.C9535a;
import com.instabug.featuresrequest.p370c.C9547i;
import com.instabug.featuresrequest.p373ui.FeaturesRequestActivity;
import com.instabug.featuresrequest.p373ui.custom.C9640c;
import com.instabug.featuresrequest.p373ui.custom.C9659f;
import com.instabug.featuresrequest.p373ui.custom.C9659f.C9660a;
import com.instabug.featuresrequest.p373ui.custom.C9659f.C9661b;
import com.instabug.featuresrequest.p373ui.custom.DynamicToolbarFragment;
import com.instabug.library.Instabug;
import com.instabug.library.InstabugCustomTextPlaceHolder.Key;
import com.instabug.library.core.p382ui.BaseContract.Presenter;
import com.instabug.library.util.AttrResolver;
import com.instabug.library.util.C10020a;
import com.instabug.library.util.KeyboardUtils;
import com.instabug.library.util.PlaceHolderUtils;
import com.instabug.library.util.SimpleTextWatcher;
import com.instabug.library.view.AlertDialog;
import com.instabug.library.view.AlertDialog.OnAlertViewsClickListener;
import com.instabug.library.view.ViewUtils;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p205i.p471b.p472a.p473a.p474c.C13938g;
import p205i.p471b.p472a.p473a.p474c.p475i.C13959t;
import p205i.p489f.C14069f;

/* renamed from: com.instabug.featuresrequest.ui.e.b */
/* compiled from: AddNewFeatureFragment */
public class C9681b extends DynamicToolbarFragment<C9691c> implements OnClickListener, C9680b, OnAlertViewsClickListener {

    /* renamed from: b0 */
    private static transient /* synthetic */ boolean[] f25640b0;

    /* renamed from: N */
    private TextInputLayout f25641N;

    /* renamed from: O */
    private TextInputLayout f25642O;

    /* renamed from: P */
    private TextInputEditText f25643P;

    /* renamed from: Q */
    private TextInputEditText f25644Q;

    /* renamed from: R */
    private TextInputEditText f25645R;

    /* renamed from: S */
    private TextInputEditText f25646S;

    /* renamed from: T */
    private View f25647T;

    /* renamed from: U */
    private View f25648U;

    /* renamed from: V */
    private View f25649V;

    /* renamed from: W */
    private View f25650W;

    /* renamed from: X */
    private RelativeLayout f25651X;

    /* renamed from: Y */
    private TextView f25652Y;

    /* renamed from: Z */
    private AlertDialog f25653Z;

    /* renamed from: a */
    private TextInputLayout f25654a;

    /* renamed from: a0 */
    private TextView f25655a0;

    /* renamed from: b */
    private TextInputLayout f25656b;

    /* renamed from: com.instabug.featuresrequest.ui.e.b$a */
    /* compiled from: AddNewFeatureFragment */
    class C9682a implements C9660a {

        /* renamed from: b */
        private static transient /* synthetic */ boolean[] f25657b;

        /* renamed from: a */
        final /* synthetic */ C9681b f25658a;

        C9682a(C9681b bVar) {
            boolean[] a = m45262a();
            this.f25658a = bVar;
            a[0] = true;
        }

        /* renamed from: a */
        private static /* synthetic */ boolean[] m45262a() {
            boolean[] zArr = f25657b;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(3476228994113612854L, "com/instabug/featuresrequest/ui/newfeature/AddNewFeatureFragment$1", 2);
            f25657b = a;
            return a;
        }

        /* renamed from: d */
        public void mo34351d() {
            boolean[] a = m45262a();
            this.f25658a.mo34571m();
            a[1] = true;
        }
    }

    /* renamed from: com.instabug.featuresrequest.ui.e.b$b */
    /* compiled from: AddNewFeatureFragment */
    class C9683b implements C9660a {

        /* renamed from: b */
        private static transient /* synthetic */ boolean[] f25659b;

        /* renamed from: a */
        final /* synthetic */ C9681b f25660a;

        C9683b(C9681b bVar) {
            boolean[] a = m45264a();
            this.f25660a = bVar;
            a[0] = true;
        }

        /* renamed from: a */
        private static /* synthetic */ boolean[] m45264a() {
            boolean[] zArr = f25659b;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(-9185925534503639337L, "com/instabug/featuresrequest/ui/newfeature/AddNewFeatureFragment$2", 2);
            f25659b = a;
            return a;
        }

        /* renamed from: d */
        public void mo34351d() {
            boolean[] a = m45264a();
            ((C9691c) C9681b.m45226a(this.f25660a)).mo34580d();
            a[1] = true;
        }
    }

    /* renamed from: com.instabug.featuresrequest.ui.e.b$c */
    /* compiled from: AddNewFeatureFragment */
    class C9684c implements OnFocusChangeListener {

        /* renamed from: b */
        private static transient /* synthetic */ boolean[] f25661b;

        /* renamed from: a */
        final /* synthetic */ C9681b f25662a;

        C9684c(C9681b bVar) {
            boolean[] a = m45266a();
            this.f25662a = bVar;
            a[0] = true;
        }

        /* renamed from: a */
        private static /* synthetic */ boolean[] m45266a() {
            boolean[] zArr = f25661b;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(-1073872216143769472L, "com/instabug/featuresrequest/ui/newfeature/AddNewFeatureFragment$3", 18);
            f25661b = a;
            return a;
        }

        public void onFocusChange(View view, boolean z) {
            boolean[] a = m45266a();
            if (z) {
                a[1] = true;
                C9681b.m45231b(this.f25662a).getLayoutParams().height = ViewUtils.convertDpToPx(this.f25662a.getContext(), 2.0f);
                a[2] = true;
                if (C9681b.m45232c(this.f25662a).mo28257g()) {
                    a[3] = true;
                    TextInputLayout c = C9681b.m45232c(this.f25662a);
                    C9681b bVar = this.f25662a;
                    a[4] = true;
                    int a2 = C0841b.m4915a(bVar.getContext(), C9525R.C9527color.ib_fr_add_comment_error);
                    a[5] = true;
                    C9547i.m44649a(c, a2);
                    a[6] = true;
                    C9681b.m45231b(this.f25662a).setBackgroundColor(C0841b.m4915a(this.f25662a.getContext(), C9525R.C9527color.ib_fr_add_comment_error));
                    a[7] = true;
                } else {
                    TextInputLayout c2 = C9681b.m45232c(this.f25662a);
                    a[8] = true;
                    int primaryColor = Instabug.getPrimaryColor();
                    a[9] = true;
                    C9547i.m44649a(c2, primaryColor);
                    a[10] = true;
                    C9681b.m45231b(this.f25662a).setBackgroundColor(Instabug.getPrimaryColor());
                    a[11] = true;
                }
            } else {
                TextInputLayout c3 = C9681b.m45232c(this.f25662a);
                a[12] = true;
                int primaryColor2 = Instabug.getPrimaryColor();
                a[13] = true;
                C9547i.m44649a(c3, primaryColor2);
                a[14] = true;
                C9681b.m45231b(this.f25662a).setBackgroundColor(AttrResolver.getColor(this.f25662a.getContext(), C9525R.attr.ib_fr_add_comment_edit_text_underline_color));
                a[15] = true;
                C9681b.m45231b(this.f25662a).getLayoutParams().height = ViewUtils.convertDpToPx(this.f25662a.getContext(), 1.0f);
                a[16] = true;
            }
            C9681b.m45231b(this.f25662a).requestLayout();
            a[17] = true;
        }
    }

    /* renamed from: com.instabug.featuresrequest.ui.e.b$d */
    /* compiled from: AddNewFeatureFragment */
    class C9685d implements OnFocusChangeListener {

        /* renamed from: b */
        private static transient /* synthetic */ boolean[] f25663b;

        /* renamed from: a */
        final /* synthetic */ C9681b f25664a;

        C9685d(C9681b bVar) {
            boolean[] a = m45267a();
            this.f25664a = bVar;
            a[0] = true;
        }

        /* renamed from: a */
        private static /* synthetic */ boolean[] m45267a() {
            boolean[] zArr = f25663b;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(-3999341452189737310L, "com/instabug/featuresrequest/ui/newfeature/AddNewFeatureFragment$4", 21);
            f25663b = a;
            return a;
        }

        public void onFocusChange(View view, boolean z) {
            boolean[] a = m45267a();
            if (z) {
                a[1] = true;
                LayoutParams layoutParams = C9681b.m45233d(this.f25664a).getLayoutParams();
                C9681b bVar = this.f25664a;
                a[2] = true;
                layoutParams.height = ViewUtils.convertDpToPx(bVar.getContext(), 2.0f);
                a[3] = true;
                if (C9681b.m45234e(this.f25664a).mo28257g()) {
                    C9681b bVar2 = this.f25664a;
                    a[4] = true;
                    TextInputLayout c = C9681b.m45232c(bVar2);
                    int a2 = C0841b.m4915a(this.f25664a.getContext(), C9525R.C9527color.ib_fr_add_comment_error);
                    a[5] = true;
                    C9547i.m44649a(c, a2);
                    a[6] = true;
                    View d = C9681b.m45233d(this.f25664a);
                    C9681b bVar3 = this.f25664a;
                    a[7] = true;
                    Context context = bVar3.getContext();
                    int i = C9525R.C9527color.ib_fr_add_comment_error;
                    a[8] = true;
                    d.setBackgroundColor(C0841b.m4915a(context, i));
                    a[9] = true;
                } else {
                    TextInputLayout c2 = C9681b.m45232c(this.f25664a);
                    a[10] = true;
                    int primaryColor = Instabug.getPrimaryColor();
                    a[11] = true;
                    C9547i.m44649a(c2, primaryColor);
                    a[12] = true;
                    C9681b.m45233d(this.f25664a).setBackgroundColor(Instabug.getPrimaryColor());
                    a[13] = true;
                }
            } else {
                TextInputLayout c3 = C9681b.m45232c(this.f25664a);
                a[14] = true;
                int primaryColor2 = Instabug.getPrimaryColor();
                a[15] = true;
                C9547i.m44649a(c3, primaryColor2);
                a[16] = true;
                C9681b.m45233d(this.f25664a).setBackgroundColor(AttrResolver.getColor(this.f25664a.getContext(), C9525R.attr.ib_fr_add_comment_edit_text_underline_color));
                a[17] = true;
                LayoutParams layoutParams2 = C9681b.m45233d(this.f25664a).getLayoutParams();
                C9681b bVar4 = this.f25664a;
                a[18] = true;
                layoutParams2.height = ViewUtils.convertDpToPx(bVar4.getContext(), 1.0f);
                a[19] = true;
            }
            C9681b.m45233d(this.f25664a).requestLayout();
            a[20] = true;
        }
    }

    /* renamed from: com.instabug.featuresrequest.ui.e.b$e */
    /* compiled from: AddNewFeatureFragment */
    class C9686e implements OnFocusChangeListener {

        /* renamed from: b */
        private static transient /* synthetic */ boolean[] f25665b;

        /* renamed from: a */
        final /* synthetic */ C9681b f25666a;

        C9686e(C9681b bVar) {
            boolean[] a = m45268a();
            this.f25666a = bVar;
            a[0] = true;
        }

        /* renamed from: a */
        private static /* synthetic */ boolean[] m45268a() {
            boolean[] zArr = f25665b;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(-2946813723994518624L, "com/instabug/featuresrequest/ui/newfeature/AddNewFeatureFragment$5", 7);
            f25665b = a;
            return a;
        }

        public void onFocusChange(View view, boolean z) {
            boolean[] a = m45268a();
            if (z) {
                a[1] = true;
                C9681b.m45235f(this.f25666a).getLayoutParams().height = ViewUtils.convertDpToPx(this.f25666a.getContext(), 2.0f);
                a[2] = true;
                C9681b.m45235f(this.f25666a).setBackgroundColor(Instabug.getPrimaryColor());
                a[3] = true;
            } else {
                C9681b.m45235f(this.f25666a).getLayoutParams().height = ViewUtils.convertDpToPx(this.f25666a.getContext(), 1.0f);
                a[4] = true;
                C9681b.m45235f(this.f25666a).setBackgroundColor(AttrResolver.getColor(this.f25666a.getContext(), C9525R.attr.ib_fr_add_comment_edit_text_underline_color));
                a[5] = true;
            }
            C9681b.m45235f(this.f25666a).requestLayout();
            a[6] = true;
        }
    }

    /* renamed from: com.instabug.featuresrequest.ui.e.b$f */
    /* compiled from: AddNewFeatureFragment */
    class C9687f implements OnFocusChangeListener {

        /* renamed from: b */
        private static transient /* synthetic */ boolean[] f25667b;

        /* renamed from: a */
        final /* synthetic */ C9681b f25668a;

        C9687f(C9681b bVar) {
            boolean[] a = m45269a();
            this.f25668a = bVar;
            a[0] = true;
        }

        /* renamed from: a */
        private static /* synthetic */ boolean[] m45269a() {
            boolean[] zArr = f25667b;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(-862233157529515270L, "com/instabug/featuresrequest/ui/newfeature/AddNewFeatureFragment$6", 23);
            f25667b = a;
            return a;
        }

        public void onFocusChange(View view, boolean z) {
            boolean[] a = m45269a();
            if (z) {
                a[1] = true;
                LayoutParams layoutParams = C9681b.m45236g(this.f25668a).getLayoutParams();
                C9681b bVar = this.f25668a;
                a[2] = true;
                layoutParams.height = ViewUtils.convertDpToPx(bVar.getContext(), 2.0f);
                a[3] = true;
                if (C9681b.m45237h(this.f25668a).mo28257g()) {
                    a[4] = true;
                    C9681b.m45238i(this.f25668a).setErrorEnabled(true);
                    a[5] = true;
                    TextInputLayout h = C9681b.m45237h(this.f25668a);
                    C9681b bVar2 = this.f25668a;
                    a[6] = true;
                    int a2 = C0841b.m4915a(bVar2.getContext(), C9525R.C9527color.ib_fr_add_comment_error);
                    a[7] = true;
                    C9547i.m44649a(h, a2);
                    a[8] = true;
                    C9681b.m45236g(this.f25668a).setBackgroundColor(C0841b.m4915a(this.f25668a.getContext(), C9525R.C9527color.ib_fr_add_comment_error));
                    a[9] = true;
                } else {
                    C9681b.m45238i(this.f25668a).setErrorEnabled(false);
                    a[10] = true;
                    TextInputLayout h2 = C9681b.m45237h(this.f25668a);
                    a[11] = true;
                    int primaryColor = Instabug.getPrimaryColor();
                    a[12] = true;
                    C9547i.m44649a(h2, primaryColor);
                    a[13] = true;
                    C9681b.m45236g(this.f25668a).setBackgroundColor(Instabug.getPrimaryColor());
                    a[14] = true;
                }
            } else {
                TextInputLayout h3 = C9681b.m45237h(this.f25668a);
                a[15] = true;
                int primaryColor2 = Instabug.getPrimaryColor();
                a[16] = true;
                C9547i.m44649a(h3, primaryColor2);
                a[17] = true;
                C9681b.m45236g(this.f25668a).setBackgroundColor(AttrResolver.getColor(this.f25668a.getContext(), C9525R.attr.ib_fr_add_comment_edit_text_underline_color));
                a[18] = true;
                LayoutParams layoutParams2 = C9681b.m45236g(this.f25668a).getLayoutParams();
                C9681b bVar3 = this.f25668a;
                a[19] = true;
                Context context = bVar3.getContext();
                a[20] = true;
                layoutParams2.height = ViewUtils.convertDpToPx(context, 1.0f);
                a[21] = true;
            }
            C9681b.m45236g(this.f25668a).requestLayout();
            a[22] = true;
        }
    }

    /* renamed from: com.instabug.featuresrequest.ui.e.b$g */
    /* compiled from: AddNewFeatureFragment */
    class C9688g extends SimpleTextWatcher {

        /* renamed from: b */
        private static transient /* synthetic */ boolean[] f25669b;

        /* renamed from: a */
        final /* synthetic */ C9681b f25670a;

        C9688g(C9681b bVar) {
            boolean[] a = m45270a();
            this.f25670a = bVar;
            a[0] = true;
        }

        /* renamed from: a */
        private static /* synthetic */ boolean[] m45270a() {
            boolean[] zArr = f25669b;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(-4445467975428026061L, "com/instabug/featuresrequest/ui/newfeature/AddNewFeatureFragment$7", 14);
            f25669b = a;
            return a;
        }

        public void afterTextChanged(Editable editable) {
            boolean[] a = m45270a();
            if (!C9535a.m44611c().mo34220a()) {
                a[1] = true;
            } else {
                a[2] = true;
                if (editable.toString().equals(((C9691c) C9681b.m45239j(this.f25670a)).mo34579c())) {
                    a[3] = true;
                } else {
                    a[4] = true;
                    if (this.f25670a.mo34569j() != null) {
                        a[5] = true;
                        if (C9681b.m45240k(this.f25670a).getText().toString().trim().isEmpty()) {
                            a[6] = true;
                        } else {
                            a[7] = true;
                            C9681b.m45227a(this.f25670a, Boolean.valueOf(true));
                            a[8] = true;
                        }
                    } else {
                        C9681b.m45227a(this.f25670a, Boolean.valueOf(false));
                        a[9] = true;
                    }
                }
            }
            if (!TextUtils.isEmpty(editable.toString())) {
                a[10] = true;
                C9681b.m45242l(this.f25670a).setVisibility(8);
                a[11] = true;
            } else {
                C9681b.m45242l(this.f25670a).setVisibility(0);
                a[12] = true;
            }
            a[13] = true;
        }
    }

    /* renamed from: com.instabug.featuresrequest.ui.e.b$h */
    /* compiled from: AddNewFeatureFragment */
    class C9689h extends SimpleTextWatcher {

        /* renamed from: b */
        private static transient /* synthetic */ boolean[] f25671b;

        /* renamed from: a */
        final /* synthetic */ C9681b f25672a;

        C9689h(C9681b bVar) {
            boolean[] a = m45271a();
            this.f25672a = bVar;
            a[0] = true;
        }

        /* renamed from: a */
        private static /* synthetic */ boolean[] m45271a() {
            boolean[] zArr = f25671b;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(-8852239427625839874L, "com/instabug/featuresrequest/ui/newfeature/AddNewFeatureFragment$8", 20);
            f25671b = a;
            return a;
        }

        public void afterTextChanged(Editable editable) {
            boolean[] a = m45271a();
            super.afterTextChanged(editable);
            Boolean valueOf = Boolean.valueOf(true);
            a[1] = true;
            boolean isEmpty = C9681b.m45240k(this.f25672a).getText().toString().trim().isEmpty();
            Boolean valueOf2 = Boolean.valueOf(false);
            if (isEmpty) {
                a[2] = true;
                C9681b bVar = this.f25672a;
                C9681b.m45228a(bVar, true, C9681b.m45232c(bVar), C9681b.m45231b(this.f25672a), this.f25672a.getString(C9525R.string.feature_requests_new_err_msg_required));
                a[3] = true;
                C9681b.m45227a(this.f25672a, valueOf2);
                a[4] = true;
            } else {
                C9681b bVar2 = this.f25672a;
                C9681b.m45228a(bVar2, false, C9681b.m45232c(bVar2), C9681b.m45231b(this.f25672a), this.f25672a.getString(C9525R.string.feature_requests_new_err_msg_required));
                a[5] = true;
                if (C9535a.m44611c().mo34220a()) {
                    a[6] = true;
                    if (C9681b.m45243m(this.f25672a).getText() == null) {
                        a[7] = true;
                    } else {
                        C9681b bVar3 = this.f25672a;
                        a[8] = true;
                        if (C9681b.m45243m(bVar3).getText().toString().trim().isEmpty()) {
                            a[9] = true;
                        } else {
                            Pattern pattern = Patterns.EMAIL_ADDRESS;
                            C9681b bVar4 = this.f25672a;
                            a[10] = true;
                            Editable text = C9681b.m45243m(bVar4).getText();
                            a[11] = true;
                            String obj = text.toString();
                            a[12] = true;
                            Matcher matcher = pattern.matcher(obj);
                            a[13] = true;
                            if (!matcher.matches()) {
                                a[14] = true;
                            } else {
                                a[15] = true;
                                C9681b.m45227a(this.f25672a, valueOf);
                                a[16] = true;
                            }
                        }
                    }
                    C9681b.m45227a(this.f25672a, valueOf2);
                    a[17] = true;
                } else {
                    C9681b.m45227a(this.f25672a, valueOf);
                    a[18] = true;
                }
            }
            a[19] = true;
        }
    }

    /* renamed from: com.instabug.featuresrequest.ui.e.b$i */
    /* compiled from: AddNewFeatureFragment */
    class C9690i implements Runnable {

        /* renamed from: b */
        private static transient /* synthetic */ boolean[] f25673b;

        /* renamed from: a */
        final /* synthetic */ C9681b f25674a;

        C9690i(C9681b bVar) {
            boolean[] a = m45272a();
            this.f25674a = bVar;
            a[0] = true;
        }

        /* renamed from: a */
        private static /* synthetic */ boolean[] m45272a() {
            boolean[] zArr = f25673b;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(5075099628108671831L, "com/instabug/featuresrequest/ui/newfeature/AddNewFeatureFragment$9", 15);
            f25673b = a;
            return a;
        }

        public void run() {
            boolean[] a = m45272a();
            RelativeLayout n = C9681b.m45244n(this.f25674a);
            Key key = Key.FEATURES_REQUEST_ADD_FEATURE_TOAST;
            C9681b bVar = this.f25674a;
            int i = C9525R.string.feature_requests_new_toast_message;
            a[1] = true;
            String string = bVar.getString(i);
            a[2] = true;
            String placeHolder = PlaceHolderUtils.getPlaceHolder(key, string);
            a[3] = true;
            C9640c a2 = C9640c.m45073a(n, placeHolder, 0);
            a[4] = true;
            a2.mo34514b(-1);
            a[5] = true;
            if (C10020a.m46628a(this.f25674a.getContext())) {
                a[6] = true;
                a2.mo34512a(C9525R.C9528drawable.instabug_ic_close, 24.0f);
                a[7] = true;
            } else {
                a2.mo34515b(C9525R.C9528drawable.instabug_ic_close, 24.0f);
                a[8] = true;
            }
            a2.mo34511a(3000);
            a[9] = true;
            View a3 = a2.mo34510a();
            a[10] = true;
            a3.setBackgroundColor(this.f25674a.getResources().getColor(C9525R.C9527color.ib_fr_new_feature_toast_bg));
            a[11] = true;
            TextView textView = (TextView) a3.findViewById(C9525R.C9529id.snackbar_text);
            a[12] = true;
            textView.setTextColor(-1);
            a[13] = true;
            a2.mo34516b();
            a[14] = true;
        }
    }

    public C9681b() {
        m45247p()[0] = true;
    }

    /* renamed from: a */
    static /* synthetic */ Presenter m45226a(C9681b bVar) {
        boolean[] p = m45247p();
        P p2 = bVar.presenter;
        p[137] = true;
        return p2;
    }

    /* renamed from: b */
    static /* synthetic */ View m45231b(C9681b bVar) {
        boolean[] p = m45247p();
        View view = bVar.f25647T;
        p[138] = true;
        return view;
    }

    /* renamed from: c */
    static /* synthetic */ TextInputLayout m45232c(C9681b bVar) {
        boolean[] p = m45247p();
        TextInputLayout textInputLayout = bVar.f25654a;
        p[139] = true;
        return textInputLayout;
    }

    /* renamed from: d */
    static /* synthetic */ View m45233d(C9681b bVar) {
        boolean[] p = m45247p();
        View view = bVar.f25648U;
        p[140] = true;
        return view;
    }

    /* renamed from: e */
    static /* synthetic */ TextInputLayout m45234e(C9681b bVar) {
        boolean[] p = m45247p();
        TextInputLayout textInputLayout = bVar.f25656b;
        p[141] = true;
        return textInputLayout;
    }

    /* renamed from: f */
    static /* synthetic */ View m45235f(C9681b bVar) {
        boolean[] p = m45247p();
        View view = bVar.f25649V;
        p[142] = true;
        return view;
    }

    /* renamed from: g */
    static /* synthetic */ View m45236g(C9681b bVar) {
        boolean[] p = m45247p();
        View view = bVar.f25650W;
        p[143] = true;
        return view;
    }

    /* renamed from: h */
    static /* synthetic */ TextInputLayout m45237h(C9681b bVar) {
        boolean[] p = m45247p();
        TextInputLayout textInputLayout = bVar.f25642O;
        p[144] = true;
        return textInputLayout;
    }

    /* renamed from: i */
    static /* synthetic */ TextInputLayout m45238i(C9681b bVar) {
        boolean[] p = m45247p();
        TextInputLayout textInputLayout = bVar.f25641N;
        p[145] = true;
        return textInputLayout;
    }

    /* renamed from: j */
    static /* synthetic */ Presenter m45239j(C9681b bVar) {
        boolean[] p = m45247p();
        P p2 = bVar.presenter;
        p[146] = true;
        return p2;
    }

    /* renamed from: k */
    static /* synthetic */ TextInputEditText m45240k(C9681b bVar) {
        boolean[] p = m45247p();
        TextInputEditText textInputEditText = bVar.f25643P;
        p[147] = true;
        return textInputEditText;
    }

    /* renamed from: l */
    static /* synthetic */ TextView m45242l(C9681b bVar) {
        boolean[] p = m45247p();
        TextView textView = bVar.f25652Y;
        p[149] = true;
        return textView;
    }

    /* renamed from: m */
    static /* synthetic */ TextInputEditText m45243m(C9681b bVar) {
        boolean[] p = m45247p();
        TextInputEditText textInputEditText = bVar.f25646S;
        p[151] = true;
        return textInputEditText;
    }

    /* renamed from: n */
    static /* synthetic */ RelativeLayout m45244n(C9681b bVar) {
        boolean[] p = m45247p();
        RelativeLayout relativeLayout = bVar.f25651X;
        p[152] = true;
        return relativeLayout;
    }

    /* renamed from: o */
    private boolean m45246o() {
        boolean z;
        boolean[] p = m45247p();
        if (!this.f25643P.getText().toString().isEmpty()) {
            p[127] = true;
        } else {
            TextInputEditText textInputEditText = this.f25644Q;
            p[128] = true;
            if (!textInputEditText.getText().toString().isEmpty()) {
                p[129] = true;
            } else {
                TextInputEditText textInputEditText2 = this.f25645R;
                p[130] = true;
                if (!textInputEditText2.getText().toString().isEmpty()) {
                    p[131] = true;
                } else {
                    TextInputEditText textInputEditText3 = this.f25646S;
                    p[132] = true;
                    if (!textInputEditText3.getText().toString().isEmpty()) {
                        p[133] = true;
                    } else {
                        z = false;
                        p[135] = true;
                        p[136] = true;
                        return z;
                    }
                }
            }
        }
        p[134] = true;
        z = true;
        p[136] = true;
        return z;
    }

    /* renamed from: p */
    private static /* synthetic */ boolean[] m45247p() {
        boolean[] zArr = f25640b0;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(-1833670094327574291L, "com/instabug/featuresrequest/ui/newfeature/AddNewFeatureFragment", C13959t.f40941p2);
        f25640b0 = a;
        return a;
    }

    /* access modifiers changed from: protected */
    public void addToolbarActionButtons() {
        boolean[] p = m45247p();
        this.toolbarActionButtons.add(new C9659f(C9525R.C9528drawable.ib_fr_shape_add_feat_button, C9525R.string.feature_requests_new_positive_button, new C9683b(this), C9661b.TEXT));
        p[60] = true;
    }

    /* access modifiers changed from: protected */
    public int getContentLayout() {
        boolean[] p = m45247p();
        int i = C9525R.layout.ib_fr_new_feature_fragment;
        p[62] = true;
        return i;
    }

    /* access modifiers changed from: protected */
    public String getTitle() {
        boolean[] p = m45247p();
        String string = getString(C9525R.string.feature_requests_new_appbar_title);
        p[61] = true;
        return string;
    }

    /* access modifiers changed from: protected */
    public C9659f getToolbarCloseActionButton() {
        boolean[] p = m45247p();
        C9659f fVar = new C9659f(C9525R.C9528drawable.instabug_ic_close, C9525R.string.close, new C9682a(this), C9661b.ICON);
        p[59] = true;
        return fVar;
    }

    /* access modifiers changed from: protected */
    public void initContentViews(View view, Bundle bundle) {
        boolean[] p = m45247p();
        if (this.f25653Z != null) {
            p[63] = true;
        } else {
            p[64] = true;
            this.f25653Z = new AlertDialog();
            p[65] = true;
            this.f25653Z.mo36018e(getString(C9525R.string.feature_request_close_dialog_message));
            p[66] = true;
            this.f25653Z.mo36016a(this);
            p[67] = true;
        }
        this.f25651X = (RelativeLayout) view.findViewById(C9525R.C9529id.relativeLayout_new_feature);
        p[68] = true;
        this.f25654a = (TextInputLayout) view.findViewById(C9525R.C9529id.input_layout_title);
        p[69] = true;
        TextInputLayout textInputLayout = this.f25654a;
        StringBuilder sb = new StringBuilder();
        sb.append(getString(C9525R.string.feature_requests_new_title));
        String str = C14069f.f41343G;
        sb.append(str);
        textInputLayout.setHint(sb.toString());
        p[70] = true;
        this.f25656b = (TextInputLayout) view.findViewById(C9525R.C9529id.input_layout_description);
        p[71] = true;
        this.f25641N = (TextInputLayout) view.findViewById(C9525R.C9529id.name_text_input_layout);
        p[72] = true;
        this.f25642O = (TextInputLayout) view.findViewById(C9525R.C9529id.email_text_input_layout);
        p[73] = true;
        TextInputLayout textInputLayout2 = this.f25642O;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(getString(C9525R.string.feature_requests_new_email));
        sb2.append(str);
        textInputLayout2.setHint(sb2.toString());
        p[74] = true;
        this.f25643P = (TextInputEditText) view.findViewById(C9525R.C9529id.input_title);
        p[75] = true;
        this.f25644Q = (TextInputEditText) view.findViewById(C9525R.C9529id.input_description);
        p[76] = true;
        this.f25645R = (TextInputEditText) view.findViewById(C9525R.C9529id.input_name);
        p[77] = true;
        this.f25646S = (TextInputEditText) view.findViewById(C9525R.C9529id.input_email);
        p[78] = true;
        this.f25647T = view.findViewById(C9525R.C9529id.title_underline);
        p[79] = true;
        this.f25648U = view.findViewById(C9525R.C9529id.description_underline);
        p[80] = true;
        this.f25649V = view.findViewById(C9525R.C9529id.name_underline);
        p[81] = true;
        this.f25650W = view.findViewById(C9525R.C9529id.email_underline);
        p[82] = true;
        this.f25652Y = (TextView) view.findViewById(C9525R.C9529id.txtBottomHint);
        p[83] = true;
        C9547i.m44649a(this.f25654a, Instabug.getPrimaryColor());
        p[84] = true;
        C9547i.m44649a(this.f25656b, Instabug.getPrimaryColor());
        p[85] = true;
        C9547i.m44649a(this.f25641N, Instabug.getPrimaryColor());
        p[86] = true;
        C9547i.m44649a(this.f25642O, Instabug.getPrimaryColor());
        p[87] = true;
        this.presenter = new C9691c(this);
        p[88] = true;
        m45241k();
        if (bundle != null) {
            p[89] = true;
        } else {
            p[90] = true;
            m45245n();
            p[91] = true;
        }
        this.f25655a0 = (TextView) findTextViewByTitle(C9525R.string.feature_requests_new_positive_button);
        p[92] = true;
        m45229a(Boolean.valueOf(false));
        p[93] = true;
        ((C9691c) this.presenter).mo34582f();
        p[94] = true;
    }

    public void onClick(View view) {
        m45247p()[1] = true;
    }

    public void onPositiveButtonClicked() {
        boolean[] p = m45247p();
        if (getActivity() == null) {
            p[122] = true;
        } else {
            p[123] = true;
            getActivity().onBackPressed();
            p[124] = true;
            this.f25653Z.dismiss();
            p[125] = true;
        }
        p[126] = true;
    }

    public void onStop() {
        boolean[] p = m45247p();
        super.onStop();
        p[112] = true;
        KeyboardUtils.hide(getActivity());
        p[113] = true;
    }

    /* renamed from: a */
    static /* synthetic */ void m45227a(C9681b bVar, Boolean bool) {
        boolean[] p = m45247p();
        bVar.m45229a(bool);
        p[148] = true;
    }

    /* renamed from: k */
    private void m45241k() {
        boolean[] p = m45247p();
        this.f25643P.setOnFocusChangeListener(new C9684c(this));
        p[95] = true;
        this.f25644Q.setOnFocusChangeListener(new C9685d(this));
        p[96] = true;
        this.f25645R.setOnFocusChangeListener(new C9686e(this));
        p[97] = true;
        this.f25646S.setOnFocusChangeListener(new C9687f(this));
        p[98] = true;
        this.f25646S.addTextChangedListener(new C9688g(this));
        p[99] = true;
        this.f25643P.addTextChangedListener(new C9689h(this));
        p[100] = true;
    }

    /* renamed from: n */
    private void m45245n() {
        boolean[] p = m45247p();
        this.toolbar.post(new C9690i(this));
        p[105] = true;
    }

    /* renamed from: b */
    public void mo34560b(String str) {
        boolean[] p = m45247p();
        this.f25645R.setText(str);
        p[20] = true;
    }

    /* renamed from: c */
    public void mo34561c() {
        boolean[] p = m45247p();
        if (getActivity() == null) {
            p[7] = true;
        } else {
            p[8] = true;
            ((FeaturesRequestActivity) getActivity()).mo34331d();
            p[9] = true;
        }
        p[10] = true;
    }

    /* renamed from: d */
    public void mo34563d() {
        boolean[] p = m45247p();
        if (getActivity() == null) {
            p[2] = true;
        } else {
            p[3] = true;
            ((FeaturesRequestActivity) getActivity()).mo34333f();
            p[4] = true;
        }
        p[5] = true;
    }

    /* renamed from: e */
    public void mo34564e() {
        boolean[] p = m45247p();
        if (getActivity() == null) {
            p[11] = true;
        } else {
            p[12] = true;
            ((FeaturesRequestActivity) getActivity()).mo34330c();
            p[13] = true;
        }
        p[14] = true;
    }

    /* renamed from: f */
    public String mo34565f() {
        boolean[] p = m45247p();
        if (this.f25643P.getText() == null) {
            p[34] = true;
        } else {
            TextInputEditText textInputEditText = this.f25643P;
            p[35] = true;
            if (textInputEditText.getText().toString().trim().isEmpty()) {
                p[36] = true;
            } else {
                p[37] = true;
                m45230a(false, this.f25654a, this.f25647T, null);
                p[38] = true;
                String obj = this.f25643P.getText().toString();
                p[39] = true;
                return obj;
            }
        }
        m45230a(true, this.f25654a, this.f25647T, getString(C9525R.string.feature_requests_new_err_msg_required));
        p[40] = true;
        this.f25643P.requestFocus();
        p[41] = true;
        return null;
    }

    /* renamed from: g */
    public String mo34566g() {
        boolean[] p = m45247p();
        if (this.f25644Q.getText() == null) {
            p[42] = true;
            return "";
        }
        String obj = this.f25644Q.getText().toString();
        p[43] = true;
        return obj;
    }

    /* renamed from: h */
    public String mo34567h() {
        boolean[] p = m45247p();
        String obj = this.f25646S.getText().toString();
        p[56] = true;
        return obj;
    }

    /* renamed from: i */
    public String mo34568i() {
        boolean[] p = m45247p();
        String obj = this.f25645R.getText().toString();
        p[57] = true;
        return obj;
    }

    /* renamed from: j */
    public String mo34569j() {
        boolean[] p = m45247p();
        if (this.f25646S.getText() == null) {
            p[44] = true;
        } else {
            TextInputEditText textInputEditText = this.f25646S;
            p[45] = true;
            if (textInputEditText.getText().toString().trim().isEmpty()) {
                p[46] = true;
            } else {
                Pattern pattern = Patterns.EMAIL_ADDRESS;
                TextInputEditText textInputEditText2 = this.f25646S;
                p[47] = true;
                Matcher matcher = pattern.matcher(textInputEditText2.getText().toString());
                p[48] = true;
                if (!matcher.matches()) {
                    p[49] = true;
                } else {
                    p[50] = true;
                    this.f25646S.setError(null);
                    p[51] = true;
                    m45230a(false, this.f25642O, this.f25650W, null);
                    p[52] = true;
                    String obj = this.f25646S.getText().toString();
                    p[53] = true;
                    return obj;
                }
            }
        }
        m45230a(true, this.f25642O, this.f25650W, getString(C9525R.string.feature_request_str_add_comment_valid_email));
        p[54] = true;
        this.f25646S.requestFocus();
        p[55] = true;
        return null;
    }

    /* renamed from: l */
    public void mo34570l() {
        boolean[] p = m45247p();
        if (getActivity() == null) {
            p[15] = true;
        } else if (getFragmentManager() == null) {
            p[16] = true;
        } else {
            p[17] = true;
            this.f25653Z.show(getActivity().getFragmentManager(), "alert");
            p[18] = true;
        }
        p[19] = true;
    }

    /* renamed from: m */
    public void mo34571m() {
        boolean[] p = m45247p();
        if (m45246o()) {
            p[106] = true;
            mo34570l();
            p[107] = true;
        } else if (getActivity() == null) {
            p[108] = true;
        } else {
            p[109] = true;
            getActivity().onBackPressed();
            p[110] = true;
        }
        p[111] = true;
    }

    /* renamed from: a */
    static /* synthetic */ void m45228a(C9681b bVar, boolean z, TextInputLayout textInputLayout, View view, String str) {
        boolean[] p = m45247p();
        bVar.m45230a(z, textInputLayout, view, str);
        p[150] = true;
    }

    /* renamed from: a */
    public void mo34558a(String str) {
        m45247p()[6] = true;
    }

    /* renamed from: a */
    private void m45230a(boolean z, TextInputLayout textInputLayout, View view, String str) {
        boolean[] p = m45247p();
        if (z) {
            p[21] = true;
            textInputLayout.setErrorEnabled(true);
            p[22] = true;
            textInputLayout.setError(str);
            p[23] = true;
            int a = C0841b.m4915a(getContext(), C9525R.C9527color.ib_fr_add_comment_error);
            p[24] = true;
            C9547i.m44649a(textInputLayout, a);
            p[25] = true;
            view.setBackgroundColor(C0841b.m4915a(getContext(), C9525R.C9527color.ib_fr_add_comment_error));
            p[26] = true;
        } else {
            C9547i.m44649a(textInputLayout, Instabug.getPrimaryColor());
            p[27] = true;
            textInputLayout.setError(null);
            p[28] = true;
            if (textInputLayout.getEditText().isFocused()) {
                p[29] = true;
                view.setBackgroundColor(Instabug.getPrimaryColor());
                p[30] = true;
            } else {
                view.setBackgroundColor(AttrResolver.getColor(getContext(), C9525R.attr.ib_fr_add_comment_edit_text_underline_color));
                p[31] = true;
            }
            textInputLayout.setErrorEnabled(false);
            p[32] = true;
        }
        p[33] = true;
    }

    /* renamed from: c */
    public void mo34562c(String str) {
        boolean[] p = m45247p();
        this.f25646S.setText(str);
        p[58] = true;
    }

    /* renamed from: a */
    public void mo34559a(boolean z) {
        boolean[] p = m45247p();
        if (z) {
            p[101] = true;
            TextInputLayout textInputLayout = this.f25642O;
            StringBuilder sb = new StringBuilder();
            sb.append(getString(C9525R.string.feature_requests_new_email));
            sb.append(C14069f.f41343G);
            textInputLayout.setHint(sb.toString());
            p[102] = true;
        } else {
            this.f25642O.setHint(getString(C9525R.string.feature_requests_new_email));
            p[103] = true;
        }
        p[104] = true;
    }

    /* renamed from: a */
    private void m45229a(Boolean bool) {
        boolean[] p = m45247p();
        if (this.f25655a0 == null) {
            p[114] = true;
        } else {
            p[115] = true;
            if (bool.booleanValue()) {
                p[116] = true;
                this.f25655a0.setEnabled(true);
                p[117] = true;
                this.f25655a0.setTextColor(getResources().getColor(17170443));
                p[118] = true;
            } else {
                this.f25655a0.setEnabled(false);
                p[119] = true;
                this.f25655a0.setTextColor(getResources().getColor(17170432));
                p[120] = true;
            }
        }
        p[121] = true;
    }
}
