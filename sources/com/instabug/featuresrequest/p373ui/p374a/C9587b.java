package com.instabug.featuresrequest.p373ui.p374a;

import android.app.ProgressDialog;
import android.graphics.PorterDuff.Mode;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.util.Patterns;
import android.view.View;
import android.view.View.OnFocusChangeListener;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import androidx.annotation.C0193h0;
import androidx.core.content.C0841b;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.instabug.featuresrequest.C9525R;
import com.instabug.featuresrequest.models.C9571c;
import com.instabug.featuresrequest.p370c.C9547i;
import com.instabug.featuresrequest.p373ui.FeaturesRequestActivity;
import com.instabug.featuresrequest.p373ui.custom.C9659f;
import com.instabug.featuresrequest.p373ui.custom.C9659f.C9660a;
import com.instabug.featuresrequest.p373ui.custom.C9659f.C9661b;
import com.instabug.featuresrequest.p373ui.custom.DynamicToolbarFragment;
import com.instabug.featuresrequest.p373ui.p374a.C9585a.C9586a;
import com.instabug.library.Instabug;
import com.instabug.library.util.AttrResolver;
import com.instabug.library.util.KeyboardUtils;
import com.instabug.library.util.SimpleTextWatcher;
import com.instabug.library.view.ViewUtils;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p205i.p471b.p472a.p473a.p474c.C13938g;
import p205i.p489f.C14069f;

/* renamed from: com.instabug.featuresrequest.ui.a.b */
/* compiled from: AddCommentFragment */
public class C9587b extends DynamicToolbarFragment<C9595c> implements C9586a {

    /* renamed from: Z */
    private static transient /* synthetic */ boolean[] f25360Z;

    /* renamed from: N */
    private TextInputLayout f25361N;

    /* renamed from: O */
    private TextInputLayout f25362O;

    /* renamed from: P */
    private TextInputLayout f25363P;

    /* renamed from: Q */
    private TextInputEditText f25364Q;

    /* renamed from: R */
    private TextInputEditText f25365R;

    /* renamed from: S */
    private TextInputEditText f25366S;

    /* renamed from: T */
    private View f25367T;

    /* renamed from: U */
    private View f25368U;

    /* renamed from: V */
    private View f25369V;

    /* renamed from: W */
    private ProgressDialog f25370W;

    /* renamed from: X */
    private TextView f25371X;

    /* renamed from: Y */
    private TextView f25372Y;

    /* renamed from: a */
    private C9595c f25373a;

    /* renamed from: b */
    private long f25374b;

    /* renamed from: com.instabug.featuresrequest.ui.a.b$a */
    /* compiled from: AddCommentFragment */
    class C9588a implements C9660a {

        /* renamed from: b */
        private static transient /* synthetic */ boolean[] f25375b;

        /* renamed from: a */
        final /* synthetic */ C9587b f25376a;

        C9588a(C9587b bVar) {
            boolean[] a = m44854a();
            this.f25376a = bVar;
            a[0] = true;
        }

        /* renamed from: a */
        private static /* synthetic */ boolean[] m44854a() {
            boolean[] zArr = f25375b;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(7603105869805234422L, "com/instabug/featuresrequest/ui/addcomment/AddCommentFragment$1", 2);
            f25375b = a;
            return a;
        }

        /* renamed from: d */
        public void mo34351d() {
            boolean[] a = m44854a();
            C9587b.m44824a(this.f25376a).mo34358d();
            a[1] = true;
        }
    }

    /* renamed from: com.instabug.featuresrequest.ui.a.b$b */
    /* compiled from: AddCommentFragment */
    class C9589b implements C9660a {

        /* renamed from: b */
        private static transient /* synthetic */ boolean[] f25377b;

        /* renamed from: a */
        final /* synthetic */ C9587b f25378a;

        C9589b(C9587b bVar) {
            boolean[] a = m44856a();
            this.f25378a = bVar;
            a[0] = true;
        }

        /* renamed from: a */
        private static /* synthetic */ boolean[] m44856a() {
            boolean[] zArr = f25377b;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(-6802021561420835272L, "com/instabug/featuresrequest/ui/addcomment/AddCommentFragment$2", 2);
            f25377b = a;
            return a;
        }

        /* renamed from: d */
        public void mo34351d() {
            boolean[] a = m44856a();
            C9587b.m44824a(this.f25378a).mo34357c();
            a[1] = true;
        }
    }

    /* renamed from: com.instabug.featuresrequest.ui.a.b$c */
    /* compiled from: AddCommentFragment */
    class C9590c implements OnFocusChangeListener {

        /* renamed from: b */
        private static transient /* synthetic */ boolean[] f25379b;

        /* renamed from: a */
        final /* synthetic */ C9587b f25380a;

        C9590c(C9587b bVar) {
            boolean[] a = m44858a();
            this.f25380a = bVar;
            a[0] = true;
        }

        /* renamed from: a */
        private static /* synthetic */ boolean[] m44858a() {
            boolean[] zArr = f25379b;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(-5242526218402274822L, "com/instabug/featuresrequest/ui/addcomment/AddCommentFragment$3", 14);
            f25379b = a;
            return a;
        }

        public void onFocusChange(View view, boolean z) {
            boolean[] a = m44858a();
            if (z) {
                a[1] = true;
                C9587b.m44829b(this.f25380a).getLayoutParams().height = ViewUtils.convertDpToPx(this.f25380a.getContext(), 2.0f);
                a[2] = true;
                if (C9587b.m44830c(this.f25380a).mo28257g()) {
                    a[3] = true;
                    TextInputLayout c = C9587b.m44830c(this.f25380a);
                    C9587b bVar = this.f25380a;
                    a[4] = true;
                    int a2 = C0841b.m4915a(bVar.getContext(), C9525R.C9527color.ib_fr_add_comment_error);
                    a[5] = true;
                    C9547i.m44649a(c, a2);
                    a[6] = true;
                    C9587b.m44829b(this.f25380a).setBackgroundColor(C0841b.m4915a(this.f25380a.getContext(), C9525R.C9527color.ib_fr_add_comment_error));
                    a[7] = true;
                } else {
                    C9547i.m44649a(C9587b.m44830c(this.f25380a), Instabug.getPrimaryColor());
                    a[8] = true;
                    C9587b.m44829b(this.f25380a).setBackgroundColor(Instabug.getPrimaryColor());
                    a[9] = true;
                }
            } else {
                C9547i.m44649a(C9587b.m44830c(this.f25380a), Instabug.getPrimaryColor());
                a[10] = true;
                C9587b.m44829b(this.f25380a).setBackgroundColor(AttrResolver.getColor(this.f25380a.getContext(), C9525R.attr.ib_fr_add_comment_edit_text_underline_color));
                a[11] = true;
                C9587b.m44829b(this.f25380a).getLayoutParams().height = ViewUtils.convertDpToPx(this.f25380a.getContext(), 1.0f);
                a[12] = true;
            }
            C9587b.m44829b(this.f25380a).requestLayout();
            a[13] = true;
        }
    }

    /* renamed from: com.instabug.featuresrequest.ui.a.b$d */
    /* compiled from: AddCommentFragment */
    class C9591d implements OnFocusChangeListener {

        /* renamed from: b */
        private static transient /* synthetic */ boolean[] f25381b;

        /* renamed from: a */
        final /* synthetic */ C9587b f25382a;

        C9591d(C9587b bVar) {
            boolean[] a = m44859a();
            this.f25382a = bVar;
            a[0] = true;
        }

        /* renamed from: a */
        private static /* synthetic */ boolean[] m44859a() {
            boolean[] zArr = f25381b;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(5651225815988242818L, "com/instabug/featuresrequest/ui/addcomment/AddCommentFragment$4", 7);
            f25381b = a;
            return a;
        }

        public void onFocusChange(View view, boolean z) {
            boolean[] a = m44859a();
            if (z) {
                a[1] = true;
                C9587b.m44831d(this.f25382a).getLayoutParams().height = ViewUtils.convertDpToPx(this.f25382a.getContext(), 2.0f);
                a[2] = true;
                C9587b.m44831d(this.f25382a).setBackgroundColor(Instabug.getPrimaryColor());
                a[3] = true;
            } else {
                C9587b.m44831d(this.f25382a).setBackgroundColor(AttrResolver.getColor(this.f25382a.getContext(), C9525R.attr.ib_fr_add_comment_edit_text_underline_color));
                a[4] = true;
                C9587b.m44831d(this.f25382a).getLayoutParams().height = ViewUtils.convertDpToPx(this.f25382a.getContext(), 1.0f);
                a[5] = true;
            }
            C9587b.m44831d(this.f25382a).requestLayout();
            a[6] = true;
        }
    }

    /* renamed from: com.instabug.featuresrequest.ui.a.b$e */
    /* compiled from: AddCommentFragment */
    class C9592e implements OnFocusChangeListener {

        /* renamed from: b */
        private static transient /* synthetic */ boolean[] f25383b;

        /* renamed from: a */
        final /* synthetic */ C9587b f25384a;

        C9592e(C9587b bVar) {
            boolean[] a = m44860a();
            this.f25384a = bVar;
            a[0] = true;
        }

        /* renamed from: a */
        private static /* synthetic */ boolean[] m44860a() {
            boolean[] zArr = f25383b;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(-816929423135928144L, "com/instabug/featuresrequest/ui/addcomment/AddCommentFragment$5", 16);
            f25383b = a;
            return a;
        }

        public void onFocusChange(View view, boolean z) {
            boolean[] a = m44860a();
            if (z) {
                a[1] = true;
                C9587b.m44832e(this.f25384a).getLayoutParams().height = ViewUtils.convertDpToPx(this.f25384a.getContext(), 2.0f);
                a[2] = true;
                if (C9587b.m44833f(this.f25384a).mo28257g()) {
                    a[3] = true;
                    C9587b.m44834g(this.f25384a).setErrorEnabled(true);
                    a[4] = true;
                    TextInputLayout f = C9587b.m44833f(this.f25384a);
                    C9587b bVar = this.f25384a;
                    a[5] = true;
                    int a2 = C0841b.m4915a(bVar.getContext(), C9525R.C9527color.ib_fr_add_comment_error);
                    a[6] = true;
                    C9547i.m44649a(f, a2);
                    a[7] = true;
                    C9587b.m44832e(this.f25384a).setBackgroundColor(C0841b.m4915a(this.f25384a.getContext(), C9525R.C9527color.ib_fr_add_comment_error));
                    a[8] = true;
                } else {
                    C9587b.m44834g(this.f25384a).setErrorEnabled(false);
                    a[9] = true;
                    C9547i.m44649a(C9587b.m44833f(this.f25384a), Instabug.getPrimaryColor());
                    a[10] = true;
                    C9587b.m44832e(this.f25384a).setBackgroundColor(Instabug.getPrimaryColor());
                    a[11] = true;
                }
            } else {
                C9547i.m44649a(C9587b.m44833f(this.f25384a), Instabug.getPrimaryColor());
                a[12] = true;
                C9587b.m44832e(this.f25384a).setBackgroundColor(AttrResolver.getColor(this.f25384a.getContext(), C9525R.attr.ib_fr_add_comment_edit_text_underline_color));
                a[13] = true;
                C9587b.m44832e(this.f25384a).getLayoutParams().height = ViewUtils.convertDpToPx(this.f25384a.getContext(), 1.0f);
                a[14] = true;
            }
            C9587b.m44832e(this.f25384a).requestLayout();
            a[15] = true;
        }
    }

    /* renamed from: com.instabug.featuresrequest.ui.a.b$f */
    /* compiled from: AddCommentFragment */
    class C9593f extends SimpleTextWatcher {

        /* renamed from: b */
        private static transient /* synthetic */ boolean[] f25385b;

        /* renamed from: a */
        final /* synthetic */ C9587b f25386a;

        C9593f(C9587b bVar) {
            boolean[] a = m44861a();
            this.f25386a = bVar;
            a[0] = true;
        }

        /* renamed from: a */
        private static /* synthetic */ boolean[] m44861a() {
            boolean[] zArr = f25385b;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(-5220562304309942508L, "com/instabug/featuresrequest/ui/addcomment/AddCommentFragment$6", 14);
            f25385b = a;
            return a;
        }

        public void afterTextChanged(Editable editable) {
            boolean[] a = m44861a();
            if (!C9587b.m44824a(this.f25386a).mo34360f()) {
                a[1] = true;
            } else {
                a[2] = true;
                if (editable.toString().equals(C9587b.m44824a(this.f25386a).mo34361g())) {
                    a[3] = true;
                } else {
                    a[4] = true;
                    if (C9587b.m44835h(this.f25386a)) {
                        a[5] = true;
                        if (C9587b.m44836i(this.f25386a).getText().toString().trim().isEmpty()) {
                            a[6] = true;
                        } else {
                            a[7] = true;
                            C9587b.m44825a(this.f25386a, Boolean.valueOf(true));
                            a[8] = true;
                        }
                    } else {
                        C9587b.m44825a(this.f25386a, Boolean.valueOf(false));
                        a[9] = true;
                    }
                }
            }
            if (!TextUtils.isEmpty(editable.toString())) {
                a[10] = true;
                C9587b.m44837j(this.f25386a).setVisibility(8);
                a[11] = true;
            } else {
                C9587b.m44837j(this.f25386a).setVisibility(0);
                a[12] = true;
            }
            a[13] = true;
        }
    }

    /* renamed from: com.instabug.featuresrequest.ui.a.b$g */
    /* compiled from: AddCommentFragment */
    class C9594g extends SimpleTextWatcher {

        /* renamed from: b */
        private static transient /* synthetic */ boolean[] f25387b;

        /* renamed from: a */
        final /* synthetic */ C9587b f25388a;

        C9594g(C9587b bVar) {
            boolean[] a = m44862a();
            this.f25388a = bVar;
            a[0] = true;
        }

        /* renamed from: a */
        private static /* synthetic */ boolean[] m44862a() {
            boolean[] zArr = f25387b;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(-6395023729330701763L, "com/instabug/featuresrequest/ui/addcomment/AddCommentFragment$7", 20);
            f25387b = a;
            return a;
        }

        public void afterTextChanged(Editable editable) {
            boolean[] a = m44862a();
            super.afterTextChanged(editable);
            Boolean valueOf = Boolean.valueOf(true);
            a[1] = true;
            boolean isEmpty = C9587b.m44836i(this.f25388a).getText().toString().trim().isEmpty();
            Boolean valueOf2 = Boolean.valueOf(false);
            if (isEmpty) {
                a[2] = true;
                C9587b bVar = this.f25388a;
                C9587b.m44826a(bVar, true, C9587b.m44830c(bVar), C9587b.m44829b(this.f25388a), this.f25388a.getString(C9525R.string.feature_request_str_add_comment_comment_empty));
                a[3] = true;
                C9587b.m44825a(this.f25388a, valueOf2);
                a[4] = true;
            } else {
                C9587b bVar2 = this.f25388a;
                C9587b.m44826a(bVar2, false, C9587b.m44830c(bVar2), C9587b.m44829b(this.f25388a), this.f25388a.getString(C9525R.string.feature_request_str_add_comment_comment_empty));
                a[5] = true;
                if (C9587b.m44824a(this.f25388a).mo34360f()) {
                    a[6] = true;
                    if (C9587b.m44838k(this.f25388a).getText() == null) {
                        a[7] = true;
                    } else {
                        C9587b bVar3 = this.f25388a;
                        a[8] = true;
                        if (C9587b.m44838k(bVar3).getText().toString().trim().isEmpty()) {
                            a[9] = true;
                        } else {
                            Pattern pattern = Patterns.EMAIL_ADDRESS;
                            C9587b bVar4 = this.f25388a;
                            a[10] = true;
                            Editable text = C9587b.m44838k(bVar4).getText();
                            a[11] = true;
                            String obj = text.toString();
                            a[12] = true;
                            Matcher matcher = pattern.matcher(obj);
                            a[13] = true;
                            if (!matcher.matches()) {
                                a[14] = true;
                            } else {
                                a[15] = true;
                                C9587b.m44825a(this.f25388a, valueOf);
                                a[16] = true;
                            }
                        }
                    }
                    C9587b.m44825a(this.f25388a, valueOf2);
                    a[17] = true;
                } else {
                    C9587b.m44825a(this.f25388a, valueOf);
                    a[18] = true;
                }
            }
            a[19] = true;
        }
    }

    public C9587b() {
        m44842n()[0] = true;
    }

    /* renamed from: a */
    static /* synthetic */ C9595c m44824a(C9587b bVar) {
        boolean[] n = m44842n();
        C9595c cVar = bVar.f25373a;
        n[115] = true;
        return cVar;
    }

    /* renamed from: b */
    static /* synthetic */ View m44829b(C9587b bVar) {
        boolean[] n = m44842n();
        View view = bVar.f25367T;
        n[116] = true;
        return view;
    }

    /* renamed from: c */
    static /* synthetic */ TextInputLayout m44830c(C9587b bVar) {
        boolean[] n = m44842n();
        TextInputLayout textInputLayout = bVar.f25361N;
        n[117] = true;
        return textInputLayout;
    }

    /* renamed from: d */
    static /* synthetic */ View m44831d(C9587b bVar) {
        boolean[] n = m44842n();
        View view = bVar.f25368U;
        n[118] = true;
        return view;
    }

    /* renamed from: e */
    static /* synthetic */ View m44832e(C9587b bVar) {
        boolean[] n = m44842n();
        View view = bVar.f25369V;
        n[119] = true;
        return view;
    }

    /* renamed from: f */
    static /* synthetic */ TextInputLayout m44833f(C9587b bVar) {
        boolean[] n = m44842n();
        TextInputLayout textInputLayout = bVar.f25363P;
        n[120] = true;
        return textInputLayout;
    }

    /* renamed from: g */
    static /* synthetic */ TextInputLayout m44834g(C9587b bVar) {
        boolean[] n = m44842n();
        TextInputLayout textInputLayout = bVar.f25362O;
        n[121] = true;
        return textInputLayout;
    }

    /* renamed from: h */
    static /* synthetic */ boolean m44835h(C9587b bVar) {
        boolean[] n = m44842n();
        boolean k = bVar.m44839k();
        n[122] = true;
        return k;
    }

    /* renamed from: i */
    static /* synthetic */ TextInputEditText m44836i(C9587b bVar) {
        boolean[] n = m44842n();
        TextInputEditText textInputEditText = bVar.f25364Q;
        n[123] = true;
        return textInputEditText;
    }

    /* renamed from: j */
    static /* synthetic */ TextView m44837j(C9587b bVar) {
        boolean[] n = m44842n();
        TextView textView = bVar.f25371X;
        n[125] = true;
        return textView;
    }

    /* renamed from: k */
    static /* synthetic */ TextInputEditText m44838k(C9587b bVar) {
        boolean[] n = m44842n();
        TextInputEditText textInputEditText = bVar.f25366S;
        n[127] = true;
        return textInputEditText;
    }

    /* renamed from: l */
    private void m44840l() {
        boolean[] n = m44842n();
        this.f25364Q.setOnFocusChangeListener(new C9590c(this));
        n[29] = true;
        this.f25365R.setOnFocusChangeListener(new C9591d(this));
        n[30] = true;
        this.f25366S.setOnFocusChangeListener(new C9592e(this));
        n[31] = true;
        this.f25366S.addTextChangedListener(new C9593f(this));
        n[32] = true;
        this.f25364Q.addTextChangedListener(new C9594g(this));
        n[33] = true;
    }

    /* renamed from: m */
    private boolean m44841m() {
        boolean[] n = m44842n();
        if (TextUtils.isEmpty(this.f25364Q.getText().toString())) {
            TextInputLayout textInputLayout = this.f25361N;
            View view = this.f25367T;
            n[49] = true;
            String string = getResources().getString(C9525R.string.feature_request_str_add_comment_comment_empty);
            n[50] = true;
            m44828a(true, textInputLayout, view, string);
            n[51] = true;
            this.f25361N.requestFocus();
            n[52] = true;
            this.f25367T.setBackgroundColor(C0841b.m4915a(getContext(), C9525R.C9527color.ib_fr_add_comment_error));
            n[53] = true;
            return false;
        }
        m44828a(false, this.f25361N, this.f25367T, null);
        n[54] = true;
        return true;
    }

    /* renamed from: n */
    private static /* synthetic */ boolean[] m44842n() {
        boolean[] zArr = f25360Z;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(-6625875651096645448L, "com/instabug/featuresrequest/ui/addcomment/AddCommentFragment", 128);
        f25360Z = a;
        return a;
    }

    /* access modifiers changed from: protected */
    public void addToolbarActionButtons() {
        boolean[] n = m44842n();
        this.toolbarActionButtons.add(new C9659f(-1, C9525R.string.feature_request_str_post_comment, new C9589b(this), C9661b.TEXT));
        n[5] = true;
    }

    /* access modifiers changed from: protected */
    public int getContentLayout() {
        boolean[] n = m44842n();
        int i = C9525R.layout.ib_fr_add_comment_fragment;
        n[7] = true;
        return i;
    }

    /* access modifiers changed from: protected */
    public String getTitle() {
        boolean[] n = m44842n();
        String string = getString(C9525R.string.feature_request_comments);
        n[6] = true;
        return string;
    }

    /* access modifiers changed from: protected */
    public C9659f getToolbarCloseActionButton() {
        boolean[] n = m44842n();
        C9659f fVar = new C9659f(C9525R.C9528drawable.instabug_ic_close, C9525R.string.close, new C9588a(this), C9661b.ICON);
        n[4] = true;
        return fVar;
    }

    /* access modifiers changed from: protected */
    public void initContentViews(View view, Bundle bundle) {
        boolean[] n = m44842n();
        this.f25361N = (TextInputLayout) view.findViewById(C9525R.C9529id.feature_request_comment_text_input_layout);
        n[8] = true;
        this.f25362O = (TextInputLayout) view.findViewById(C9525R.C9529id.feature_request_name_text_input_layout);
        n[9] = true;
        this.f25363P = (TextInputLayout) view.findViewById(C9525R.C9529id.feature_request_email_text_input_layout);
        n[10] = true;
        this.f25364Q = (TextInputEditText) view.findViewById(C9525R.C9529id.feature_request_comment_edittext_layout);
        n[11] = true;
        TextInputLayout textInputLayout = this.f25361N;
        StringBuilder sb = new StringBuilder();
        sb.append(getString(C9525R.string.add_feature));
        sb.append(C14069f.f41343G);
        textInputLayout.setHint(sb.toString());
        n[12] = true;
        this.f25365R = (TextInputEditText) view.findViewById(C9525R.C9529id.feature_request_name_edittext_layout);
        n[13] = true;
        this.f25366S = (TextInputEditText) view.findViewById(C9525R.C9529id.feature_request_email_edittext_layout);
        n[14] = true;
        this.f25367T = view.findViewById(C9525R.C9529id.feature_requests_comment_text_underline);
        n[15] = true;
        this.f25368U = view.findViewById(C9525R.C9529id.feature_requests_name_text_underline);
        n[16] = true;
        this.f25369V = view.findViewById(C9525R.C9529id.feature_requests_email_text_underline);
        n[17] = true;
        this.f25371X = (TextView) view.findViewById(C9525R.C9529id.feature_request_email_disclaimer);
        n[18] = true;
        C9547i.m44649a(this.f25361N, Instabug.getPrimaryColor());
        n[19] = true;
        C9547i.m44649a(this.f25362O, Instabug.getPrimaryColor());
        n[20] = true;
        C9547i.m44649a(this.f25363P, Instabug.getPrimaryColor());
        n[21] = true;
        m44840l();
        n[22] = true;
        this.f25373a.mo34359e();
        n[23] = true;
        this.f25373a.mo34363i();
        n[24] = true;
        this.f25372Y = (TextView) findTextViewByTitle(C9525R.string.feature_request_str_post_comment);
        n[25] = true;
        m44827a(Boolean.valueOf(false));
        n[26] = true;
    }

    public void onClick(View view) {
        m44842n()[38] = true;
    }

    public void onCreate(Bundle bundle) {
        boolean[] n = m44842n();
        super.onCreate(bundle);
        n[1] = true;
        this.f25373a = new C9595c(this);
        n[2] = true;
        this.f25374b = getArguments().getLong("featureId");
        n[3] = true;
    }

    public void onStop() {
        boolean[] n = m44842n();
        super.onStop();
        n[27] = true;
        KeyboardUtils.hide(getActivity());
        n[28] = true;
    }

    /* renamed from: a */
    static /* synthetic */ void m44825a(C9587b bVar, Boolean bool) {
        boolean[] n = m44842n();
        bVar.m44827a(bool);
        n[124] = true;
    }

    /* renamed from: k */
    private boolean m44839k() {
        boolean[] n = m44842n();
        if (TextUtils.isEmpty(this.f25366S.getText().toString())) {
            n[55] = true;
        } else {
            Pattern pattern = Patterns.EMAIL_ADDRESS;
            TextInputEditText textInputEditText = this.f25366S;
            n[56] = true;
            if (!pattern.matcher(textInputEditText.getText().toString()).matches()) {
                n[57] = true;
            } else {
                m44828a(false, this.f25363P, this.f25369V, null);
                n[62] = true;
                return true;
            }
        }
        TextInputLayout textInputLayout = this.f25363P;
        View view = this.f25369V;
        n[58] = true;
        String string = getResources().getString(C9525R.string.feature_request_str_add_comment_valid_email);
        n[59] = true;
        m44828a(true, textInputLayout, view, string);
        n[60] = true;
        this.f25366S.requestFocus();
        n[61] = true;
        return false;
    }

    /* renamed from: b */
    public void mo34336b(String str) {
        boolean[] n = m44842n();
        this.f25366S.setText(str);
        n[63] = true;
    }

    /* renamed from: c */
    public void mo34337c() {
        boolean[] n = m44842n();
        if (!m44841m()) {
            n[40] = true;
            return;
        }
        if (!this.f25373a.mo34360f()) {
            n[41] = true;
        } else {
            n[42] = true;
            if (m44839k()) {
                n[43] = true;
            } else {
                n[44] = true;
                return;
            }
        }
        C9595c cVar = this.f25373a;
        long j = this.f25374b;
        String obj = this.f25364Q.getText().toString();
        TextInputEditText textInputEditText = this.f25365R;
        n[45] = true;
        String obj2 = textInputEditText.getText().toString();
        TextInputEditText textInputEditText2 = this.f25366S;
        n[46] = true;
        C9571c cVar2 = new C9571c(j, obj, obj2, textInputEditText2.getText().toString());
        n[47] = true;
        cVar.mo34355a(cVar2);
        n[48] = true;
    }

    /* renamed from: d */
    public void mo34338d() {
        boolean[] n = m44842n();
        getActivity().onBackPressed();
        n[39] = true;
    }

    /* renamed from: e */
    public void mo34339e() {
        boolean[] n = m44842n();
        ProgressDialog progressDialog = this.f25370W;
        if (progressDialog != null) {
            n[65] = true;
            if (progressDialog.isShowing()) {
                n[66] = true;
            } else {
                n[67] = true;
                this.f25370W.show();
                n[68] = true;
            }
        } else {
            this.f25370W = new ProgressDialog(getActivity());
            n[69] = true;
            this.f25370W.setCancelable(false);
            n[70] = true;
            this.f25370W.setMessage(getResources().getString(C9525R.string.feature_request_str_adding_your_comment));
            n[71] = true;
            ProgressBar progressBar = new ProgressBar(getActivity(), null, 16842871);
            n[72] = true;
            progressBar.getIndeterminateDrawable().setColorFilter(Instabug.getPrimaryColor(), Mode.MULTIPLY);
            n[73] = true;
            this.f25370W.setIndeterminateDrawable(progressBar.getIndeterminateDrawable());
            n[74] = true;
            this.f25370W.show();
            n[75] = true;
        }
        n[76] = true;
    }

    /* renamed from: f */
    public void mo34340f() {
        boolean[] n = m44842n();
        ProgressDialog progressDialog = this.f25370W;
        if (progressDialog == null) {
            n[77] = true;
        } else {
            n[78] = true;
            if (!progressDialog.isShowing()) {
                n[79] = true;
            } else {
                n[80] = true;
                this.f25370W.dismiss();
                n[81] = true;
            }
        }
        n[82] = true;
    }

    /* renamed from: g */
    public void mo34341g() {
        boolean[] n = m44842n();
        if (!(getActivity() instanceof FeaturesRequestActivity)) {
            n[90] = true;
        } else {
            n[91] = true;
            ((FeaturesRequestActivity) getActivity()).mo34332e();
            n[92] = true;
            getActivity().onBackPressed();
            n[93] = true;
        }
        n[94] = true;
    }

    /* renamed from: h */
    public void mo34342h() {
        boolean[] n = m44842n();
        Toast.makeText(getActivity(), C9525R.string.feature_request_str_add_comment_error, 1).show();
        n[83] = true;
    }

    /* renamed from: i */
    public String mo34343i() {
        boolean[] n = m44842n();
        String obj = this.f25365R.getText().toString();
        n[84] = true;
        return obj;
    }

    /* renamed from: j */
    public String mo34344j() {
        boolean[] n = m44842n();
        String obj = this.f25366S.getText().toString();
        n[85] = true;
        return obj;
    }

    /* renamed from: a */
    static /* synthetic */ void m44826a(C9587b bVar, boolean z, TextInputLayout textInputLayout, View view, String str) {
        boolean[] n = m44842n();
        bVar.m44828a(z, textInputLayout, view, str);
        n[126] = true;
    }

    /* renamed from: a */
    public static C9587b m44823a(@C0193h0 long j) {
        boolean[] n = m44842n();
        C9587b bVar = new C9587b();
        n[34] = true;
        Bundle bundle = new Bundle();
        n[35] = true;
        bundle.putLong("featureId", j);
        n[36] = true;
        bVar.setArguments(bundle);
        n[37] = true;
        return bVar;
    }

    /* renamed from: a */
    public void mo34334a(String str) {
        boolean[] n = m44842n();
        this.f25365R.setText(str);
        n[64] = true;
    }

    /* renamed from: a */
    public void mo34335a(boolean z) {
        boolean[] n = m44842n();
        if (z) {
            n[86] = true;
            TextInputLayout textInputLayout = this.f25363P;
            StringBuilder sb = new StringBuilder();
            sb.append(getString(C9525R.string.feature_requests_new_email));
            sb.append(C14069f.f41343G);
            textInputLayout.setHint(sb.toString());
            n[87] = true;
        } else {
            this.f25363P.setHint(getString(C9525R.string.feature_requests_new_email));
            n[88] = true;
        }
        n[89] = true;
    }

    /* renamed from: a */
    private void m44828a(boolean z, TextInputLayout textInputLayout, View view, String str) {
        boolean[] n = m44842n();
        if (z) {
            n[95] = true;
            textInputLayout.setErrorEnabled(true);
            n[96] = true;
            textInputLayout.setError(str);
            n[97] = true;
            C9547i.m44649a(textInputLayout, C0841b.m4915a(getContext(), C9525R.C9527color.ib_fr_add_comment_error));
            n[98] = true;
            view.setBackgroundColor(C0841b.m4915a(getContext(), C9525R.C9527color.ib_fr_add_comment_error));
            n[99] = true;
        } else {
            C9547i.m44649a(textInputLayout, Instabug.getPrimaryColor());
            n[100] = true;
            textInputLayout.setError(null);
            n[101] = true;
            if (textInputLayout.getEditText().isFocused()) {
                n[102] = true;
                view.setBackgroundColor(Instabug.getPrimaryColor());
                n[103] = true;
            } else {
                view.setBackgroundColor(AttrResolver.getColor(getContext(), C9525R.attr.ib_fr_add_comment_edit_text_underline_color));
                n[104] = true;
            }
            textInputLayout.setErrorEnabled(false);
            n[105] = true;
        }
        n[106] = true;
    }

    /* renamed from: a */
    private void m44827a(Boolean bool) {
        boolean[] n = m44842n();
        if (this.f25372Y == null) {
            n[107] = true;
        } else {
            n[108] = true;
            if (bool.booleanValue()) {
                n[109] = true;
                this.f25372Y.setEnabled(true);
                n[110] = true;
                this.f25372Y.setTextColor(getResources().getColor(17170443));
                n[111] = true;
            } else {
                this.f25372Y.setEnabled(false);
                n[112] = true;
                this.f25372Y.setTextColor(getResources().getColor(17170432));
                n[113] = true;
            }
        }
        n[114] = true;
    }
}
