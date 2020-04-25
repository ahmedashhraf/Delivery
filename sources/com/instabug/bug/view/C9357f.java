package com.instabug.bug.view;

import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import androidx.fragment.app.Fragment;
import com.instabug.library.core.p382ui.BaseContract.Presenter;
import com.instabug.library.core.p382ui.BaseContract.View;
import com.instabug.library.model.Attachment;
import java.util.List;

/* renamed from: com.instabug.bug.view.f */
/* compiled from: BugReportingFragmentContract */
public interface C9357f {

    /* renamed from: com.instabug.bug.view.f$a */
    /* compiled from: BugReportingFragmentContract */
    public interface C9358a extends Presenter {
        @C0195i0
        /* renamed from: a */
        Attachment mo33783a(List<Attachment> list);

        /* renamed from: a */
        void mo33784a(int i, int i2, Intent intent);

        /* renamed from: a */
        void mo33785a(Bundle bundle);

        /* renamed from: a */
        void mo33786a(@C0193h0 Attachment attachment);

        /* renamed from: a */
        void mo33787a(String str);

        /* renamed from: a */
        void mo33788a(List<Attachment> list, String str);

        /* renamed from: b */
        void mo33789b(String str);

        /* renamed from: c */
        String mo33790c(String str);

        /* renamed from: c */
        void mo33791c();

        /* renamed from: d */
        void mo33792d();

        /* renamed from: e */
        void mo33793e();

        /* renamed from: f */
        void mo33794f();

        /* renamed from: g */
        void mo33795g();

        /* renamed from: h */
        void mo33796h();

        /* renamed from: i */
        void mo33797i();

        /* renamed from: j */
        void mo33798j();
    }

    /* renamed from: com.instabug.bug.view.f$b */
    /* compiled from: BugReportingFragmentContract */
    public interface C9359b extends View<Fragment> {
        /* renamed from: a */
        void mo33736a(Attachment attachment);

        /* renamed from: a */
        void mo33738a(List<Attachment> list);

        /* renamed from: b */
        void mo33740b(String str);

        /* renamed from: b */
        void mo33741b(boolean z);

        /* renamed from: c */
        void mo33743c(String str);

        /* renamed from: d */
        void mo33746d(String str);

        /* renamed from: h */
        void mo33750h();

        /* renamed from: i */
        void mo33751i();

        /* renamed from: j */
        void mo33752j();

        /* renamed from: k */
        String mo33753k();

        /* renamed from: l */
        void mo33754l();

        /* renamed from: m */
        void mo33755m();
    }
}
