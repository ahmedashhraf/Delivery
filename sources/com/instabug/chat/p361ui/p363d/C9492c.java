package com.instabug.chat.p361ui.p363d;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ImageButton;
import android.widget.ListView;
import androidx.core.content.C0841b;
import com.instabug.chat.C9371R;
import com.instabug.chat.model.Chat;
import com.instabug.library.InstabugCustomTextPlaceHolder.Key;
import com.instabug.library.core.p382ui.ToolbarFragment;
import com.instabug.library.util.Colorizer;
import com.instabug.library.util.InstabugSDKLogger;
import com.instabug.library.util.PlaceHolderUtils;
import java.util.ArrayList;
import java.util.List;
import p205i.p471b.p472a.p473a.p474c.C13938g;

/* renamed from: com.instabug.chat.ui.d.c */
/* compiled from: ChatsFragment */
public class C9492c extends ToolbarFragment<C9490a> implements OnClickListener, OnItemClickListener, C9491b {

    /* renamed from: O */
    private static transient /* synthetic */ boolean[] f25138O;

    /* renamed from: N */
    private C9493a f25139N;

    /* renamed from: a */
    private C9486a f25140a;

    /* renamed from: b */
    private ArrayList<Chat> f25141b;

    /* renamed from: com.instabug.chat.ui.d.c$a */
    /* compiled from: ChatsFragment */
    public interface C9493a {
        /* renamed from: b */
        void mo34055b(String str);

        /* renamed from: f */
        void mo34059f();
    }

    public C9492c() {
        m44465f()[0] = true;
    }

    /* renamed from: e */
    public static C9492c m44464e() {
        boolean[] f = m44465f();
        C9492c cVar = new C9492c();
        f[1] = true;
        Bundle bundle = new Bundle();
        f[2] = true;
        cVar.setArguments(bundle);
        f[3] = true;
        return cVar;
    }

    /* renamed from: f */
    private static /* synthetic */ boolean[] m44465f() {
        boolean[] zArr = f25138O;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(-5233363383824089552L, "com/instabug/chat/ui/chats/ChatsFragment", 42);
        f25138O = a;
        return a;
    }

    /* renamed from: a */
    public void mo34149a(ArrayList<Chat> arrayList) {
        boolean[] f = m44465f();
        this.f25141b = arrayList;
        f[38] = true;
    }

    /* renamed from: c */
    public boolean mo34150c() {
        boolean z = getFragmentManager().mo6221a(C9371R.C9375id.instabug_fragment_container) instanceof C9492c;
        m44465f()[41] = true;
        return z;
    }

    /* renamed from: d */
    public void mo34151d() {
        boolean[] f = m44465f();
        this.f25140a.mo34142a((List<Chat>) this.f25141b);
        f[39] = true;
        this.f25140a.notifyDataSetChanged();
        f[40] = true;
    }

    /* access modifiers changed from: protected */
    public int getContentLayout() {
        boolean[] f = m44465f();
        int i = C9371R.layout.instabug_fragment_chats;
        f[9] = true;
        return i;
    }

    /* access modifiers changed from: protected */
    public String getTitle() {
        boolean[] f = m44465f();
        String placeHolder = PlaceHolderUtils.getPlaceHolder(Key.CONVERSATIONS_LIST_TITLE, getString(C9371R.string.instabug_str_conversations));
        f[20] = true;
        return placeHolder;
    }

    /* access modifiers changed from: protected */
    public void initContentViews(View view, Bundle bundle) {
        boolean[] f = m44465f();
        view.findViewById(C9371R.C9375id.instabug_btn_toolbar_right).setVisibility(8);
        f[10] = true;
        ListView listView = (ListView) view.findViewById(C9371R.C9375id.instabug_lst_chats);
        f[11] = true;
        listView.setOnItemClickListener(this);
        f[12] = true;
        this.f25140a = new C9486a(getActivity(), this.f25141b);
        f[13] = true;
        listView.setAdapter(this.f25140a);
        f[14] = true;
        ImageButton imageButton = (ImageButton) view.findViewById(C9371R.C9375id.instabug_btn_new_chat);
        f[15] = true;
        Drawable c = C0841b.m4928c(getContext(), C9371R.C9374drawable.instabug_bg_white_oval);
        f[16] = true;
        Drawable primaryColorTintedDrawable = Colorizer.getPrimaryColorTintedDrawable(c);
        f[17] = true;
        imageButton.setBackgroundDrawable(primaryColorTintedDrawable);
        f[18] = true;
        imageButton.setOnClickListener(this);
        f[19] = true;
    }

    public void onClick(View view) {
        boolean[] f = m44465f();
        if (view.getId() != C9371R.C9375id.instabug_btn_new_chat) {
            f[33] = true;
        } else {
            C9493a aVar = this.f25139N;
            if (aVar == null) {
                f[34] = true;
            } else {
                f[35] = true;
                aVar.mo34059f();
                f[36] = true;
            }
        }
        f[37] = true;
    }

    /* access modifiers changed from: protected */
    public void onCloseButtonClicked() {
        m44465f()[22] = true;
    }

    public void onCreate(Bundle bundle) {
        boolean[] f = m44465f();
        super.onCreate(bundle);
        f[4] = true;
        setRetainInstance(true);
        f[5] = true;
        this.f25139N = (C9493a) getActivity();
        f[6] = true;
        this.presenter = new C9494d(this);
        f[7] = true;
        this.f25141b = new ArrayList<>();
        f[8] = true;
    }

    /* access modifiers changed from: protected */
    public void onDoneButtonClicked() {
        m44465f()[21] = true;
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        boolean[] f = m44465f();
        StringBuilder sb = new StringBuilder();
        sb.append("Chat id: ");
        f[27] = true;
        sb.append(((Chat) adapterView.getItemAtPosition(i)).getId());
        String sb2 = sb.toString();
        f[28] = true;
        InstabugSDKLogger.m46626v(C9492c.class, sb2);
        C9493a aVar = this.f25139N;
        if (aVar == null) {
            f[29] = true;
        } else {
            f[30] = true;
            aVar.mo34055b(((Chat) adapterView.getItemAtPosition(i)).getId());
            f[31] = true;
        }
        f[32] = true;
    }

    public void onStart() {
        boolean[] f = m44465f();
        super.onStart();
        f[23] = true;
        ((C9490a) this.presenter).mo34148d();
        f[24] = true;
    }

    public void onStop() {
        boolean[] f = m44465f();
        super.onStop();
        f[25] = true;
        ((C9490a) this.presenter).mo34147c();
        f[26] = true;
    }
}
