package com.instabug.chat.p361ui.p363d;

import androidx.fragment.app.Fragment;
import com.instabug.chat.model.Chat;
import com.instabug.library.core.p382ui.BaseContract.Presenter;
import com.instabug.library.core.p382ui.BaseContract.View;
import java.util.ArrayList;

/* renamed from: com.instabug.chat.ui.d.b */
/* compiled from: ChatsContract */
public class C9489b {

    /* renamed from: com.instabug.chat.ui.d.b$a */
    /* compiled from: ChatsContract */
    interface C9490a extends Presenter {
        /* renamed from: c */
        void mo34147c();

        /* renamed from: d */
        void mo34148d();
    }

    /* renamed from: com.instabug.chat.ui.d.b$b */
    /* compiled from: ChatsContract */
    interface C9491b extends View<Fragment> {
        /* renamed from: a */
        void mo34149a(ArrayList<Chat> arrayList);

        /* renamed from: c */
        boolean mo34150c();

        /* renamed from: d */
        void mo34151d();
    }
}
