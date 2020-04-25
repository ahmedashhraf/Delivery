package com.instabug.chat.p361ui.p362a;

import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import androidx.fragment.app.C1382h;
import androidx.fragment.app.Fragment;
import com.instabug.chat.C9371R;
import com.instabug.library.C9700R;
import com.instabug.library.annotation.AnnotationLayout;
import com.instabug.library.core.p382ui.ToolbarFragment;
import p205i.p471b.p472a.p473a.p474c.C13938g;

/* renamed from: com.instabug.chat.ui.a.b */
/* compiled from: AnnotationFragment */
public class C9453b extends ToolbarFragment<C9451a> implements C9452b {

    /* renamed from: Q */
    private static transient /* synthetic */ boolean[] f25036Q;

    /* renamed from: N */
    private Uri f25037N;

    /* renamed from: O */
    private AnnotationLayout f25038O;

    /* renamed from: P */
    private C9454a f25039P;

    /* renamed from: a */
    private String f25040a;

    /* renamed from: b */
    private String f25041b;

    /* renamed from: com.instabug.chat.ui.a.b$a */
    /* compiled from: AnnotationFragment */
    public interface C9454a {
        /* renamed from: a */
        void mo34069a(String str, Uri uri);

        /* renamed from: b */
        void mo34070b(String str, Uri uri);
    }

    public C9453b() {
        m44292d()[0] = true;
    }

    /* renamed from: a */
    public static C9453b m44291a(String str, String str2, Uri uri) {
        boolean[] d = m44292d();
        C9453b bVar = new C9453b();
        d[1] = true;
        Bundle bundle = new Bundle();
        d[2] = true;
        bundle.putString("title", str);
        d[3] = true;
        bundle.putString("chat_id", str2);
        d[4] = true;
        bundle.putParcelable("image_uri", uri);
        d[5] = true;
        bVar.setArguments(bundle);
        d[6] = true;
        return bVar;
    }

    /* renamed from: d */
    private static /* synthetic */ boolean[] m44292d() {
        boolean[] zArr = f25036Q;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(7516512205726683082L, "com/instabug/chat/ui/annotation/AnnotationFragment", 29);
        f25036Q = a;
        return a;
    }

    /* access modifiers changed from: protected */
    public int getContentLayout() {
        boolean[] d = m44292d();
        int i = C9371R.layout.instabug_fragment_annotation;
        d[14] = true;
        return i;
    }

    /* access modifiers changed from: protected */
    public String getTitle() {
        boolean[] d = m44292d();
        String str = this.f25040a;
        d[19] = true;
        return str;
    }

    /* access modifiers changed from: protected */
    public void initContentViews(View view, Bundle bundle) {
        boolean[] d = m44292d();
        ImageButton imageButton = (ImageButton) view.findViewById(C9700R.C9704id.instabug_btn_toolbar_right);
        d[15] = true;
        imageButton.setImageResource(C9700R.C9703drawable.instabug_ic_send);
        d[16] = true;
        this.f25038O = (AnnotationLayout) view.findViewById(C9700R.C9704id.annotationLayout);
        d[17] = true;
        this.f25038O.setBaseImage(this.f25037N, null);
        d[18] = true;
    }

    /* access modifiers changed from: protected */
    public void onCloseButtonClicked() {
        boolean[] d = m44292d();
        C9454a aVar = this.f25039P;
        if (aVar == null) {
            d[25] = true;
        } else {
            d[26] = true;
            aVar.mo34070b(this.f25041b, this.f25037N);
            d[27] = true;
        }
        d[28] = true;
    }

    public void onCreate(Bundle bundle) {
        boolean[] d = m44292d();
        super.onCreate(bundle);
        d[7] = true;
        C1382h supportFragmentManager = getActivity().getSupportFragmentManager();
        d[8] = true;
        this.f25039P = (C9454a) supportFragmentManager.mo6223a("chat_fragment");
        d[9] = true;
        this.f25040a = getArguments().getString("title");
        d[10] = true;
        this.f25041b = getArguments().getString("chat_id");
        d[11] = true;
        this.f25037N = (Uri) getArguments().getParcelable("image_uri");
        d[12] = true;
        this.presenter = new C9455c(this);
        d[13] = true;
    }

    /* access modifiers changed from: protected */
    public void onDoneButtonClicked() {
        boolean[] d = m44292d();
        ((C9451a) this.presenter).mo34063a(this.f25038O.getAnnotatedBitmap(), this.f25037N);
        C9454a aVar = this.f25039P;
        if (aVar == null) {
            d[20] = true;
        } else {
            d[21] = true;
            aVar.mo34069a(this.f25041b, this.f25037N);
            d[22] = true;
        }
        getActivity().getSupportFragmentManager().mo6224a().mo6094d((Fragment) this).mo6097e();
        d[23] = true;
        getActivity().getSupportFragmentManager().mo6231a("annotation_fragment_for_chat", 1);
        d[24] = true;
    }
}
