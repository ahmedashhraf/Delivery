package com.instabug.chat.p361ui.p363d;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.instabug.chat.C9371R;
import com.instabug.chat.model.Chat;
import com.instabug.library.internal.storage.cache.AssetsCacheManager.OnDownloadFinished;
import com.instabug.library.model.AssetEntity;
import com.instabug.library.p397ui.custom.CircularImageView;
import com.instabug.library.util.InstabugAppData;
import com.instabug.library.util.InstabugSDKLogger;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.List;
import p205i.p471b.p472a.p473a.p474c.C13938g;

/* renamed from: com.instabug.chat.ui.d.a */
/* compiled from: ChatsAdapter */
class C9486a extends BaseAdapter {

    /* renamed from: N */
    private static transient /* synthetic */ boolean[] f25125N;

    /* renamed from: a */
    private List<Chat> f25126a;

    /* renamed from: b */
    private InstabugAppData f25127b;

    /* renamed from: com.instabug.chat.ui.d.a$a */
    /* compiled from: ChatsAdapter */
    class C9487a implements OnDownloadFinished {

        /* renamed from: c */
        private static transient /* synthetic */ boolean[] f25128c;

        /* renamed from: a */
        final /* synthetic */ C9488b f25129a;

        /* renamed from: b */
        final /* synthetic */ C9486a f25130b;

        C9487a(C9486a aVar, C9488b bVar) {
            boolean[] a = m44451a();
            this.f25130b = aVar;
            this.f25129a = bVar;
            a[0] = true;
        }

        /* renamed from: a */
        private static /* synthetic */ boolean[] m44451a() {
            boolean[] zArr = f25128c;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(5369016478168918095L, "com/instabug/chat/ui/chats/ChatsAdapter$1", 12);
            f25128c = a;
            return a;
        }

        public void onFailed(Throwable th) {
            boolean[] a = m44451a();
            InstabugSDKLogger.m46624e(this, "Asset Entity downloading got error", th);
            a[11] = true;
        }

        public void onSuccess(AssetEntity assetEntity) {
            boolean[] a = m44451a();
            StringBuilder sb = new StringBuilder();
            sb.append("Asset Entity downloaded: ");
            File file = assetEntity.getFile();
            a[1] = true;
            sb.append(file.getPath());
            String sb2 = sb.toString();
            a[2] = true;
            InstabugSDKLogger.m46622d(this, sb2);
            try {
                a[3] = true;
                C9488b.m44458f(this.f25129a).setImageDrawable(null);
                a[4] = true;
                CircularImageView f = C9488b.m44458f(this.f25129a);
                a[5] = true;
                FileInputStream fileInputStream = new FileInputStream(assetEntity.getFile());
                a[6] = true;
                f.setImageBitmap(BitmapFactory.decodeStream(fileInputStream));
                a[7] = true;
            } catch (FileNotFoundException e) {
                a[8] = true;
                InstabugSDKLogger.m46624e(this, "Asset Entity downloading got FileNotFoundException error", e);
                a[9] = true;
            }
            a[10] = true;
        }
    }

    /* renamed from: com.instabug.chat.ui.d.a$b */
    /* compiled from: ChatsAdapter */
    private static class C9488b {

        /* renamed from: g */
        private static transient /* synthetic */ boolean[] f25131g;

        /* renamed from: a */
        private final TextView f25132a;

        /* renamed from: b */
        private final CircularImageView f25133b;

        /* renamed from: c */
        private final TextView f25134c;

        /* renamed from: d */
        private final TextView f25135d;

        /* renamed from: e */
        private final TextView f25136e;

        /* renamed from: f */
        private final LinearLayout f25137f;

        C9488b(View view) {
            boolean[] a = m44453a();
            a[0] = true;
            this.f25137f = (LinearLayout) view.findViewById(C9371R.C9375id.conversation_list_item_container);
            a[1] = true;
            this.f25132a = (TextView) view.findViewById(C9371R.C9375id.instabug_txt_message_sender);
            a[2] = true;
            this.f25133b = (CircularImageView) view.findViewById(C9371R.C9375id.instabug_message_sender_avatar);
            a[3] = true;
            this.f25134c = (TextView) view.findViewById(C9371R.C9375id.instabug_txt_message_time);
            a[4] = true;
            this.f25136e = (TextView) view.findViewById(C9371R.C9375id.instabug_unread_messages_count);
            a[5] = true;
            this.f25135d = (TextView) view.findViewById(C9371R.C9375id.instabug_txt_message_snippet);
            a[6] = true;
        }

        /* renamed from: a */
        static /* synthetic */ TextView m44452a(C9488b bVar) {
            boolean[] a = m44453a();
            TextView textView = bVar.f25135d;
            a[7] = true;
            return textView;
        }

        /* renamed from: a */
        private static /* synthetic */ boolean[] m44453a() {
            boolean[] zArr = f25131g;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(6105007556736739372L, "com/instabug/chat/ui/chats/ChatsAdapter$ViewHolder", 13);
            f25131g = a;
            return a;
        }

        /* renamed from: b */
        static /* synthetic */ TextView m44454b(C9488b bVar) {
            boolean[] a = m44453a();
            TextView textView = bVar.f25132a;
            a[8] = true;
            return textView;
        }

        /* renamed from: c */
        static /* synthetic */ TextView m44455c(C9488b bVar) {
            boolean[] a = m44453a();
            TextView textView = bVar.f25134c;
            a[9] = true;
            return textView;
        }

        /* renamed from: d */
        static /* synthetic */ LinearLayout m44456d(C9488b bVar) {
            boolean[] a = m44453a();
            LinearLayout linearLayout = bVar.f25137f;
            a[10] = true;
            return linearLayout;
        }

        /* renamed from: e */
        static /* synthetic */ TextView m44457e(C9488b bVar) {
            boolean[] a = m44453a();
            TextView textView = bVar.f25136e;
            a[11] = true;
            return textView;
        }

        /* renamed from: f */
        static /* synthetic */ CircularImageView m44458f(C9488b bVar) {
            boolean[] a = m44453a();
            CircularImageView circularImageView = bVar.f25133b;
            a[12] = true;
            return circularImageView;
        }
    }

    C9486a(Context context, List<Chat> list) {
        boolean[] a = m44448a();
        this.f25126a = list;
        a[0] = true;
        this.f25127b = new InstabugAppData(context);
        a[1] = true;
    }

    /* renamed from: a */
    private static /* synthetic */ boolean[] m44448a() {
        boolean[] zArr = f25125N;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(-2920340201198589106L, "com/instabug/chat/ui/chats/ChatsAdapter", 74);
        f25125N = a;
        return a;
    }

    /* renamed from: a */
    public Chat mo34141a(int i) {
        Chat chat = (Chat) this.f25126a.get(i);
        m44448a()[3] = true;
        return chat;
    }

    public int getCount() {
        boolean[] a = m44448a();
        int size = this.f25126a.size();
        a[2] = true;
        return size;
    }

    public /* synthetic */ Object getItem(int i) {
        boolean[] a = m44448a();
        Chat a2 = mo34141a(i);
        a[73] = true;
        return a2;
    }

    public long getItemId(int i) {
        long hashCode = (long) mo34141a(i).getId().hashCode();
        m44448a()[4] = true;
        return hashCode;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        C9488b bVar;
        boolean[] a = m44448a();
        if (view == null) {
            a[5] = true;
            LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
            int i2 = C9371R.layout.instabug_conversation_list_item;
            a[6] = true;
            view = from.inflate(i2, viewGroup, false);
            a[7] = true;
            bVar = new C9488b(view);
            a[8] = true;
            view.setTag(bVar);
            a[9] = true;
        } else {
            bVar = (C9488b) view.getTag();
            a[10] = true;
        }
        m44447a(view.getContext(), bVar, mo34141a(i));
        a[11] = true;
        return view;
    }

    /* JADX WARNING: Removed duplicated region for block: B:47:0x0157  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x015c  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x01f6  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0259  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0277  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x029a  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m44447a(android.content.Context r11, com.instabug.chat.p361ui.p363d.C9486a.C9488b r12, com.instabug.chat.model.Chat r13) {
        /*
            r10 = this;
            boolean[] r0 = m44448a()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Binding chat "
            r1.append(r2)
            r1.append(r13)
            java.lang.String r2 = " to view"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.instabug.library.util.InstabugSDKLogger.m46626v(r10, r1)
            r1 = 1
            r2 = 12
            r0[r2] = r1
            java.util.ArrayList r2 = r13.mo33883a()
            com.instabug.chat.model.Message$a r3 = new com.instabug.chat.model.Message$a
            r3.<init>()
            java.util.Collections.sort(r2, r3)
            r2 = 13
            r0[r2] = r1
            com.instabug.chat.model.Message r2 = r13.mo33894j()
            r3 = 14
            r0[r3] = r1
            java.lang.String r3 = "null"
            r4 = 0
            if (r2 != 0) goto L_0x0044
            r5 = 15
            r0[r5] = r1
            goto L_0x0078
        L_0x0044:
            java.lang.String r5 = r2.mo33916e()
            if (r5 != 0) goto L_0x004f
            r5 = 16
            r0[r5] = r1
            goto L_0x0078
        L_0x004f:
            r5 = 17
            r0[r5] = r1
            java.lang.String r5 = r2.mo33916e()
            java.lang.String r5 = r5.trim()
            boolean r5 = android.text.TextUtils.isEmpty(r5)
            if (r5 == 0) goto L_0x0066
            r5 = 18
            r0[r5] = r1
            goto L_0x0078
        L_0x0066:
            r5 = 19
            r0[r5] = r1
            java.lang.String r5 = r2.mo33916e()
            boolean r5 = r5.equals(r3)
            if (r5 == 0) goto L_0x013e
            r5 = 20
            r0[r5] = r1
        L_0x0078:
            if (r2 != 0) goto L_0x0080
            r5 = 21
            r0[r5] = r1
            goto L_0x014d
        L_0x0080:
            java.util.ArrayList r5 = r2.mo33926l()
            int r5 = r5.size()
            if (r5 > 0) goto L_0x0090
            r5 = 22
            r0[r5] = r1
            goto L_0x014d
        L_0x0090:
            r5 = 23
            r0[r5] = r1
            java.util.ArrayList r5 = r2.mo33926l()
            r6 = 24
            r0[r6] = r1
            java.util.ArrayList r6 = r2.mo33926l()
            int r6 = r6.size()
            int r6 = r6 - r1
            java.lang.Object r5 = r5.get(r6)
            com.instabug.chat.model.Attachment r5 = (com.instabug.chat.model.Attachment) r5
            java.lang.String r5 = r5.getType()
            r6 = 25
            r0[r6] = r1
            r6 = -1
            int r7 = r5.hashCode()
            r8 = 93166550(0x58d9bd6, float:1.3316821E-35)
            r9 = 2
            if (r7 == r8) goto L_0x00f3
            r8 = 100313435(0x5faa95b, float:2.3572098E-35)
            if (r7 == r8) goto L_0x00e0
            r8 = 112202875(0x6b0147b, float:6.6233935E-35)
            if (r7 == r8) goto L_0x00cd
            r5 = 26
            r0[r5] = r1
            goto L_0x0105
        L_0x00cd:
            java.lang.String r7 = "video"
            boolean r5 = r5.equals(r7)
            if (r5 != 0) goto L_0x00da
            r5 = 31
            r0[r5] = r1
            goto L_0x0105
        L_0x00da:
            r5 = 32
            r0[r5] = r1
            r6 = 2
            goto L_0x0105
        L_0x00e0:
            java.lang.String r7 = "image"
            boolean r5 = r5.equals(r7)
            if (r5 != 0) goto L_0x00ed
            r5 = 27
            r0[r5] = r1
            goto L_0x0105
        L_0x00ed:
            r5 = 28
            r0[r5] = r1
            r6 = 0
            goto L_0x0105
        L_0x00f3:
            java.lang.String r7 = "audio"
            boolean r5 = r5.equals(r7)
            if (r5 != 0) goto L_0x0100
            r5 = 29
            r0[r5] = r1
            goto L_0x0105
        L_0x0100:
            r5 = 30
            r0[r5] = r1
            r6 = 1
        L_0x0105:
            if (r6 == 0) goto L_0x012c
            if (r6 == r1) goto L_0x011e
            if (r6 == r9) goto L_0x0110
            r5 = 33
            r0[r5] = r1
            goto L_0x0139
        L_0x0110:
            android.widget.TextView r5 = com.instabug.chat.p361ui.p363d.C9486a.C9488b.m44452a(r12)
            int r6 = com.instabug.library.C9700R.string.instabug_str_video
            r5.setText(r6)
            r5 = 36
            r0[r5] = r1
            goto L_0x0139
        L_0x011e:
            android.widget.TextView r5 = com.instabug.chat.p361ui.p363d.C9486a.C9488b.m44452a(r12)
            int r6 = com.instabug.library.C9700R.string.instabug_str_audio
            r5.setText(r6)
            r5 = 35
            r0[r5] = r1
            goto L_0x0139
        L_0x012c:
            android.widget.TextView r5 = com.instabug.chat.p361ui.p363d.C9486a.C9488b.m44452a(r12)
            int r6 = com.instabug.library.C9700R.string.instabug_str_image
            r5.setText(r6)
            r5 = 34
            r0[r5] = r1
        L_0x0139:
            r5 = 37
            r0[r5] = r1
            goto L_0x014d
        L_0x013e:
            android.widget.TextView r5 = com.instabug.chat.p361ui.p363d.C9486a.C9488b.m44452a(r12)
            java.lang.String r6 = r2.mo33916e()
            r5.setText(r6)
            r5 = 38
            r0[r5] = r1
        L_0x014d:
            java.lang.String r5 = r13.mo33891h()
            r6 = 39
            r0[r6] = r1
            if (r5 != 0) goto L_0x015c
            r2 = 40
            r0[r2] = r1
            goto L_0x0182
        L_0x015c:
            java.lang.String r6 = ""
            boolean r6 = r5.equals(r6)
            if (r6 == 0) goto L_0x0169
            r2 = 41
            r0[r2] = r1
            goto L_0x0182
        L_0x0169:
            boolean r3 = r5.equals(r3)
            if (r3 == 0) goto L_0x0174
            r2 = 42
            r0[r2] = r1
            goto L_0x0182
        L_0x0174:
            r3 = 43
            r0[r3] = r1
            boolean r2 = r2.mo33929o()
            if (r2 == 0) goto L_0x01ae
            r2 = 44
            r0[r2] = r1
        L_0x0182:
            int r2 = com.instabug.library.C9700R.string.instabug_str_notification_title
            java.lang.String r2 = r11.getString(r2)
            java.lang.Object[] r3 = new java.lang.Object[r1]
            com.instabug.library.util.InstabugAppData r5 = r10.f25127b
            r6 = 48
            r0[r6] = r1
            java.lang.String r5 = r5.getAppName()
            r3[r4] = r5
            r5 = 49
            r0[r5] = r1
            java.lang.String r2 = java.lang.String.format(r2, r3)
            r3 = 50
            r0[r3] = r1
            android.widget.TextView r3 = com.instabug.chat.p361ui.p363d.C9486a.C9488b.m44454b(r12)
            r3.setText(r2)
            r2 = 51
            r0[r2] = r1
            goto L_0x01d5
        L_0x01ae:
            r2 = 45
            r0[r2] = r1
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "chat SenderName: "
            r2.append(r3)
            r2.append(r5)
            java.lang.String r2 = r2.toString()
            com.instabug.library.util.InstabugSDKLogger.m46626v(r10, r2)
            r2 = 46
            r0[r2] = r1
            android.widget.TextView r2 = com.instabug.chat.p361ui.p363d.C9486a.C9488b.m44454b(r12)
            r2.setText(r5)
            r2 = 47
            r0[r2] = r1
        L_0x01d5:
            android.widget.TextView r2 = com.instabug.chat.p361ui.p363d.C9486a.C9488b.m44455c(r12)
            r3 = 52
            r0[r3] = r1
            long r5 = r13.mo33893i()
            java.lang.String r3 = com.instabug.library.util.InstabugDateFormatter.formatConversationLastMessageDate(r5)
            r5 = 53
            r0[r5] = r1
            r2.setText(r3)
            r2 = 54
            r0[r2] = r1
            int r2 = r13.mo33886e()
            if (r2 == 0) goto L_0x0259
            r2 = 55
            r0[r2] = r1
            android.util.TypedValue r2 = new android.util.TypedValue
            r2.<init>()
            r3 = 56
            r0[r3] = r1
            android.content.res.Resources$Theme r3 = r11.getTheme()
            r5 = 57
            r0[r5] = r1
            int r5 = com.instabug.library.C9700R.attr.instabug_unread_message_background_color
            r3.resolveAttribute(r5, r2, r1)
            r3 = 58
            r0[r3] = r1
            android.widget.LinearLayout r3 = com.instabug.chat.p361ui.p363d.C9486a.C9488b.m44456d(r12)
            int r2 = r2.data
            r3.setBackgroundColor(r2)
            int r2 = com.instabug.library.C9700R.C9703drawable.instabug_bg_white_oval
            r3 = 59
            r0[r3] = r1
            android.graphics.drawable.Drawable r2 = androidx.core.content.C0841b.m4928c(r11, r2)
            android.graphics.drawable.Drawable r2 = com.instabug.library.util.Colorizer.getPrimaryColorTintedDrawable(r2)
            r3 = 60
            r0[r3] = r1
            android.widget.TextView r3 = com.instabug.chat.p361ui.p363d.C9486a.C9488b.m44457e(r12)
            r3.setBackgroundDrawable(r2)
            r2 = 61
            r0[r2] = r1
            android.widget.TextView r2 = com.instabug.chat.p361ui.p363d.C9486a.C9488b.m44457e(r12)
            int r3 = r13.mo33886e()
            java.lang.String r3 = java.lang.String.valueOf(r3)
            r2.setText(r3)
            r2 = 62
            r0[r2] = r1
            android.widget.TextView r2 = com.instabug.chat.p361ui.p363d.C9486a.C9488b.m44457e(r12)
            r2.setVisibility(r4)
            r2 = 63
            r0[r2] = r1
            goto L_0x0271
        L_0x0259:
            android.widget.LinearLayout r2 = com.instabug.chat.p361ui.p363d.C9486a.C9488b.m44456d(r12)
            r2.setBackgroundColor(r4)
            r2 = 64
            r0[r2] = r1
            android.widget.TextView r2 = com.instabug.chat.p361ui.p363d.C9486a.C9488b.m44457e(r12)
            r3 = 8
            r2.setVisibility(r3)
            r2 = 65
            r0[r2] = r1
        L_0x0271:
            java.lang.String r2 = r13.mo33889g()
            if (r2 == 0) goto L_0x029a
            r2 = 66
            r0[r2] = r1
            java.lang.String r13 = r13.mo33889g()
            com.instabug.library.model.AssetEntity$AssetType r2 = com.instabug.library.model.AssetEntity.AssetType.IMAGE
            r3 = 67
            r0[r3] = r1
            com.instabug.library.model.AssetEntity r13 = com.instabug.library.internal.storage.cache.AssetsCacheManager.createEmptyEntity(r11, r13, r2)
            r2 = 68
            r0[r2] = r1
            com.instabug.chat.ui.d.a$a r2 = new com.instabug.chat.ui.d.a$a
            r2.<init>(r10, r12)
            com.instabug.library.internal.storage.cache.AssetsCacheManager.getAssetEntity(r11, r13, r2)
            r11 = 69
            r0[r11] = r1
            goto L_0x02a7
        L_0x029a:
            com.instabug.library.ui.custom.CircularImageView r11 = com.instabug.chat.p361ui.p363d.C9486a.C9488b.m44458f(r12)
            int r12 = com.instabug.chat.C9371R.C9374drawable.instabug_ic_avatar
            r11.setImageResource(r12)
            r11 = 70
            r0[r11] = r1
        L_0x02a7:
            r11 = 71
            r0[r11] = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instabug.chat.p361ui.p363d.C9486a.m44447a(android.content.Context, com.instabug.chat.ui.d.a$b, com.instabug.chat.model.Chat):void");
    }

    /* renamed from: a */
    public void mo34142a(List<Chat> list) {
        boolean[] a = m44448a();
        this.f25126a = list;
        a[72] = true;
    }
}
