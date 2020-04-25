package com.instabug.library.invocation.invocationdialog;

import android.content.Context;
import android.graphics.Color;
import android.graphics.PorterDuff.Mode;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.transition.TransitionInflater;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import androidx.core.p034l.C0962e0;
import com.instabug.library.C9700R;
import com.instabug.library.core.p382ui.C9792a;
import com.instabug.library.invocation.invocationdialog.C9919e.C9920a;
import com.instabug.library.util.AttrResolver;
import com.instabug.library.util.DrawableUtils;
import com.instabug.library.view.ViewUtils;
import java.util.ArrayList;
import p205i.p471b.p472a.p473a.p474c.C13938g;

/* renamed from: com.instabug.library.invocation.invocationdialog.d */
/* compiled from: InstabugDialogFragment */
public class C9917d extends C9792a<C9921f> implements OnItemClickListener, C9920a {

    /* renamed from: Q */
    private static transient /* synthetic */ boolean[] f26366Q;

    /* renamed from: N */
    private ArrayList<InstabugDialogItem> f26367N;

    /* renamed from: O */
    private C9918a f26368O;

    /* renamed from: P */
    private ListView f26369P;

    /* renamed from: a */
    private TextView f26370a;

    /* renamed from: b */
    private C9915c f26371b;

    /* renamed from: com.instabug.library.invocation.invocationdialog.d$a */
    /* compiled from: InstabugDialogFragment */
    interface C9918a {
        void onDialogItemClicked(int i, String str, View... viewArr);
    }

    public C9917d() {
        m46145h()[0] = true;
    }

    /* renamed from: a */
    public static C9917d m46143a(String str, ArrayList<InstabugDialogItem> arrayList) {
        boolean[] h = m46145h();
        C9917d dVar = new C9917d();
        h[1] = true;
        Bundle bundle = new Bundle();
        h[2] = true;
        bundle.putString(InstabugDialogActivity.KEY_DIALOG_TITLE, str);
        h[3] = true;
        bundle.putSerializable(InstabugDialogActivity.KEY_DIALOG_ITEMS, arrayList);
        h[4] = true;
        dVar.setArguments(bundle);
        h[5] = true;
        return dVar;
    }

    /* renamed from: h */
    private static /* synthetic */ boolean[] m46145h() {
        boolean[] zArr = f26366Q;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(-5797833202483770948L, "com/instabug/library/invocation/invocationdialog/InstabugDialogFragment", 66);
        f26366Q = a;
        return a;
    }

    /* renamed from: c */
    public void mo35243c() {
        boolean[] h = m46145h();
        findViewById(C9700R.C9704id.instabug_pbi_container).setVisibility(8);
        h[49] = true;
    }

    /* renamed from: d */
    public void mo35244d() {
        boolean[] h = m46145h();
        findViewById(C9700R.C9704id.instabug_pbi_container).setVisibility(0);
        h[45] = true;
        ImageView imageView = (ImageView) findViewById(C9700R.C9704id.image_instabug_logo);
        h[46] = true;
        imageView.setColorFilter(Color.parseColor("#FFFFFF"), Mode.SRC_ATOP);
        h[47] = true;
        imageView.setImageResource(C9700R.C9703drawable.ic_instabug_logo);
        h[48] = true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public C9921f mo35245e() {
        boolean[] h = m46145h();
        C9921f fVar = new C9921f(this);
        h[50] = true;
        return fVar;
    }

    /* renamed from: f */
    public void mo35246f() {
        boolean[] h = m46145h();
        this.f26370a.setText(getArguments().getString(InstabugDialogActivity.KEY_DIALOG_TITLE));
        h[51] = true;
    }

    /* renamed from: g */
    public void mo35247g() {
        boolean[] h = m46145h();
        ArrayList<InstabugDialogItem> arrayList = this.f26367N;
        if (arrayList == null) {
            h[52] = true;
        } else if (arrayList.size() <= 0) {
            h[53] = true;
        } else {
            h[54] = true;
            this.f26371b.mo35238a(this.f26367N);
            h[55] = true;
            this.f26371b.notifyDataSetChanged();
            h[56] = true;
        }
        h[57] = true;
    }

    /* access modifiers changed from: protected */
    public int getLayout() {
        boolean[] h = m46145h();
        int i = C9700R.layout.ib_core_lyt_dialog_fragment;
        h[17] = true;
        return i;
    }

    /* access modifiers changed from: protected */
    public void initViews(View view, Bundle bundle) {
        boolean[] h = m46145h();
        View findViewById = findViewById(C9700R.C9704id.instabug_main_prompt_container);
        h[18] = true;
        m46144a(findViewById);
        h[19] = true;
        int resolveAttributeColor = AttrResolver.resolveAttributeColor(getContext(), C9700R.attr.instabug_background_color);
        h[20] = true;
        DrawableUtils.setColor(findViewById, resolveAttributeColor);
        h[21] = true;
        this.f26370a = (TextView) findViewById(C9700R.C9704id.instabug_fragment_title);
        h[22] = true;
        C0962e0.m5453a((View) this.f26370a, "title");
        h[23] = true;
        this.f26369P = (ListView) findViewById(C9700R.C9704id.instabug_prompt_options_list_view);
        h[24] = true;
        this.f26369P.setOnItemClickListener(this);
        h[25] = true;
        this.f26371b = new C9915c();
        h[26] = true;
        this.f26369P.setAdapter(this.f26371b);
        h[27] = true;
        mo35247g();
        h[28] = true;
    }

    public void onAttach(Context context) {
        boolean[] h = m46145h();
        super.onAttach(context);
        if (context instanceof C9918a) {
            this.f26368O = (C9918a) context;
            h[15] = true;
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(context.toString());
        sb.append(" must implement OnHomeFragmentInteractionListener");
        RuntimeException runtimeException = new RuntimeException(sb.toString());
        h[14] = true;
        throw runtimeException;
    }

    public void onCreate(Bundle bundle) {
        boolean[] h = m46145h();
        setRetainInstance(true);
        h[6] = true;
        super.onCreate(bundle);
        if (VERSION.SDK_INT < 21) {
            h[7] = true;
        } else {
            h[8] = true;
            setSharedElementEnterTransition(TransitionInflater.from(getContext()).inflateTransition(17760257));
            h[9] = true;
        }
        if (this.presenter != null) {
            h[10] = true;
        } else {
            h[11] = true;
            this.presenter = mo35245e();
            h[12] = true;
        }
        this.f26367N = (ArrayList) getArguments().getSerializable(InstabugDialogActivity.KEY_DIALOG_ITEMS);
        h[13] = true;
    }

    public void onDetach() {
        boolean[] h = m46145h();
        super.onDetach();
        this.f26368O = null;
        h[16] = true;
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        boolean[] h = m46145h();
        this.f26369P.setOnItemClickListener(null);
        if (this.f26368O == null) {
            h[58] = true;
        } else {
            h[59] = true;
            View findViewById = view.findViewById(C9700R.C9704id.instabug_prompt_option_title);
            C9918a aVar = this.f26368O;
            TextView textView = (TextView) findViewById;
            h[60] = true;
            String charSequence = textView.getText().toString();
            int i2 = C9700R.C9704id.instabug_main_prompt_container;
            h[61] = true;
            int i3 = C9700R.C9704id.instabug_pbi_container;
            h[62] = true;
            View[] viewArr = {findViewById(i2), findViewById(i3)};
            h[63] = true;
            aVar.onDialogItemClicked(i, charSequence, viewArr);
            h[64] = true;
        }
        h[65] = true;
    }

    public void onStart() {
        boolean[] h = m46145h();
        super.onStart();
        h[41] = true;
        ((C9921f) this.presenter).mo35250d();
        h[42] = true;
    }

    public void onStop() {
        boolean[] h = m46145h();
        super.onStop();
        h[43] = true;
        ((C9921f) this.presenter).mo35251e();
        h[44] = true;
    }

    /* renamed from: a */
    private void m46144a(View view) {
        boolean[] h = m46145h();
        if (getActivity() == null) {
            h[29] = true;
        } else {
            h[30] = true;
            WindowManager windowManager = (WindowManager) getActivity().getSystemService("window");
            h[31] = true;
            DisplayMetrics displayMetrics = new DisplayMetrics();
            h[32] = true;
            windowManager.getDefaultDisplay().getMetrics(displayMetrics);
            h[33] = true;
            int convertDpToPx = ViewUtils.convertDpToPx(getActivity(), 56.0f) * this.f26367N.size();
            h[34] = true;
            int convertDpToPx2 = convertDpToPx + ViewUtils.convertDpToPx(getActivity(), 200.0f);
            int i = displayMetrics.heightPixels;
            if (convertDpToPx2 <= i) {
                h[35] = true;
            } else {
                h[36] = true;
                LayoutParams layoutParams = new LayoutParams(-2, i - ViewUtils.convertDpToPx(getActivity(), 110.0f));
                h[37] = true;
                layoutParams.addRule(13);
                h[38] = true;
                view.setLayoutParams(layoutParams);
                h[39] = true;
            }
        }
        h[40] = true;
    }
}
