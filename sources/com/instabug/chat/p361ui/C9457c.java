package com.instabug.chat.p361ui;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.webkit.URLUtil;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import androidx.appcompat.app.C0295d;
import androidx.core.content.C0841b;
import androidx.fragment.app.C1376c;
import androidx.fragment.app.C1382h;
import androidx.fragment.app.C1406n;
import androidx.fragment.app.Fragment;
import com.facebook.share.internal.MessengerShareContentUtility;
import com.instabug.chat.C9371R;
import com.instabug.chat.C9377a.C9397d;
import com.instabug.chat.ChatPlugin;
import com.instabug.chat.cache.ChatsCacheManager;
import com.instabug.chat.cache.ReadQueueCacheManager;
import com.instabug.chat.eventbus.C9414a;
import com.instabug.chat.eventbus.ChatTriggeringEventBus;
import com.instabug.chat.model.Attachment;
import com.instabug.chat.model.C9420a;
import com.instabug.chat.model.C9420a.C9421a;
import com.instabug.chat.model.C9420a.C9422b;
import com.instabug.chat.model.C9423b;
import com.instabug.chat.model.C9426d;
import com.instabug.chat.model.Chat;
import com.instabug.chat.model.Chat.ChatState;
import com.instabug.chat.model.Message;
import com.instabug.chat.model.Message.C9418a;
import com.instabug.chat.model.Message.C9419b;
import com.instabug.chat.model.Message.MessageState;
import com.instabug.chat.network.C9440b;
import com.instabug.chat.p359b.C9400a;
import com.instabug.chat.p360d.C9413a;
import com.instabug.chat.p361ui.p362a.C9453b;
import com.instabug.chat.p361ui.p362a.C9453b.C9454a;
import com.instabug.chat.settings.C9441a;
import com.instabug.chat.synchronization.C9448a;
import com.instabug.chat.synchronization.C9449b;
import com.instabug.library.C9700R;
import com.instabug.library.C9706a;
import com.instabug.library.Feature;
import com.instabug.library.Feature.State;
import com.instabug.library.FragmentVisibilityChangedListener;
import com.instabug.library.InstabugCustomTextPlaceHolder.Key;
import com.instabug.library.core.InstabugCore;
import com.instabug.library.core.p382ui.BaseContract.Presenter;
import com.instabug.library.core.p382ui.BaseContract.View;
import com.instabug.library.core.p382ui.BasePresenter;
import com.instabug.library.core.p382ui.ToolbarFragment;
import com.instabug.library.internal.media.AudioPlayer;
import com.instabug.library.internal.media.AudioPlayer.OnStopListener;
import com.instabug.library.internal.storage.AttachmentsUtility;
import com.instabug.library.internal.storage.cache.AssetsCacheManager;
import com.instabug.library.internal.storage.cache.AssetsCacheManager.OnDownloadFinished;
import com.instabug.library.internal.storage.cache.CacheChangedListener;
import com.instabug.library.internal.storage.cache.CacheManager;
import com.instabug.library.internal.storage.cache.InMemoryCache;
import com.instabug.library.internal.video.VideoPlayerFragment;
import com.instabug.library.model.AssetEntity;
import com.instabug.library.model.AssetEntity.AssetType;
import com.instabug.library.p397ui.custom.CircularImageView;
import com.instabug.library.util.BitmapUtils;
import com.instabug.library.util.Colorizer;
import com.instabug.library.util.InstabugDateFormatter;
import com.instabug.library.util.InstabugSDKLogger;
import com.instabug.library.util.PermissionsUtils;
import com.instabug.library.util.PlaceHolderUtils;
import com.instabug.library.util.SystemServiceUtils;
import com.instabug.library.util.VideoManipulationUtils;
import com.instabug.library.view.ScaleImageView;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.lang.ref.WeakReference;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p195e.p196a.C12280i0;
import p195e.p196a.C5923b0;
import p195e.p196a.p442e1.C12252e;
import p195e.p196a.p444s0.p446d.C12304a;
import p195e.p196a.p447u0.C12314c;
import p195e.p196a.p449w0.C12331g;
import p205i.p471b.p472a.p473a.p474c.C13938g;
import p205i.p471b.p472a.p473a.p474c.p475i.C13959t;

/* renamed from: com.instabug.chat.ui.c */
/* compiled from: ChatContract */
public class C9457c {

    /* renamed from: com.instabug.chat.ui.c$a */
    /* compiled from: ChatContract */
    interface C9458a extends Presenter {
        /* renamed from: a */
        void mo34071a(String str);

        /* renamed from: b */
        void mo34072b(int i);

        /* renamed from: c */
        void mo34073c();

        /* renamed from: d */
        void mo34074d();
    }

    /* renamed from: com.instabug.chat.ui.c$b */
    /* compiled from: ChatContract */
    interface C9459b extends View<C0295d> {
        /* renamed from: a */
        void mo34053a(String str);

        /* renamed from: a */
        void mo34054a(String str, Attachment attachment);

        @C0195i0
        /* renamed from: c */
        String mo34056c();

        /* renamed from: d */
        void mo34057d();

        @C0195i0
        /* renamed from: e */
        Attachment mo34058e();
    }

    /* renamed from: com.instabug.chat.ui.c$c */
    /* compiled from: AttachmentsBottomSheetFragment */
    public class C9460c extends C9706a implements OnClickListener, FragmentVisibilityChangedListener {

        /* renamed from: b */
        private static transient /* synthetic */ boolean[] f25044b;

        /* renamed from: a */
        C9462b f25045a;

        /* renamed from: com.instabug.chat.ui.c$c$a */
        /* compiled from: AttachmentsBottomSheetFragment */
        class C9461a implements Runnable {

            /* renamed from: N */
            private static transient /* synthetic */ boolean[] f25046N;

            /* renamed from: a */
            final /* synthetic */ android.view.View f25047a;

            /* renamed from: b */
            final /* synthetic */ C9460c f25048b;

            C9461a(C9460c cVar, android.view.View view) {
                boolean[] a = m44316a();
                this.f25048b = cVar;
                this.f25047a = view;
                a[0] = true;
            }

            /* renamed from: a */
            private static /* synthetic */ boolean[] m44316a() {
                boolean[] zArr = f25046N;
                if (zArr != null) {
                    return zArr;
                }
                boolean[] a = C13938g.m59885a(1243851563026703582L, "com/instabug/chat/ui/chat/AttachmentsBottomSheetFragment$1", 8);
                f25046N = a;
                return a;
            }

            public void run() {
                boolean[] a = m44316a();
                if (VERSION.SDK_INT < 12) {
                    a[1] = true;
                } else {
                    a[2] = true;
                    int height = this.f25047a.getHeight();
                    a[3] = true;
                    this.f25047a.setTranslationY((float) height);
                    a[4] = true;
                    this.f25047a.setAlpha(1.0f);
                    a[5] = true;
                    this.f25047a.animate().setDuration(100).translationYBy((float) (-height));
                    a[6] = true;
                }
                a[7] = true;
            }
        }

        /* renamed from: com.instabug.chat.ui.c$c$b */
        /* compiled from: AttachmentsBottomSheetFragment */
        public interface C9462b {
            /* renamed from: c */
            void mo34083c();

            /* renamed from: d */
            void mo34084d();

            /* renamed from: e */
            void mo34085e();
        }

        public C9460c() {
            m44314c()[0] = true;
        }

        /* renamed from: a */
        public static C9460c m44311a(C9462b bVar) {
            boolean[] c = m44314c();
            C9460c cVar = new C9460c();
            cVar.f25045a = bVar;
            c[1] = true;
            return cVar;
        }

        /* renamed from: b */
        private void m44313b(android.view.View view) {
            boolean[] c = m44314c();
            TextView textView = (TextView) view.findViewById(C9371R.C9375id.instabug_attach_gallery_image_text);
            Key key = Key.ADD_IMAGE_FROM_GALLERY;
            int i = C9700R.string.instabug_str_add_photo;
            c[50] = true;
            String string = getString(i);
            c[51] = true;
            textView.setText(PlaceHolderUtils.getPlaceHolder(key, string));
            c[52] = true;
            TextView textView2 = (TextView) view.findViewById(C9371R.C9375id.instabug_attach_screenshot_text);
            Key key2 = Key.ADD_EXTRA_SCREENSHOT;
            int i2 = C9700R.string.instabug_str_take_screenshot;
            c[53] = true;
            textView2.setText(PlaceHolderUtils.getPlaceHolder(key2, getString(i2)));
            c[54] = true;
            TextView textView3 = (TextView) view.findViewById(C9371R.C9375id.instabug_attach_video_text);
            Key key3 = Key.ADD_VIDEO;
            int i3 = C9700R.string.instabug_str_record_video;
            c[55] = true;
            textView3.setText(PlaceHolderUtils.getPlaceHolder(key3, getString(i3)));
            c[56] = true;
        }

        /* renamed from: c */
        private static /* synthetic */ boolean[] m44314c() {
            boolean[] zArr = f25044b;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(2109583570053964669L, "com/instabug/chat/ui/chat/AttachmentsBottomSheetFragment", 57);
            f25044b = a;
            return a;
        }

        /* renamed from: d */
        private void m44315d() {
            boolean[] c = m44314c();
            C1406n a = getActivity().getSupportFragmentManager().mo6224a();
            c[45] = true;
            C1406n d = a.mo6094d((Fragment) this);
            c[46] = true;
            d.mo6097e();
            c[47] = true;
            getActivity().getSupportFragmentManager().mo6231a("attachments_bottom_sheet_fragment", 1);
            c[48] = true;
        }

        /* access modifiers changed from: protected */
        public void consumeNewInstanceSavedArguments() {
            m44314c()[31] = true;
        }

        /* access modifiers changed from: protected */
        public int getLayout() {
            boolean[] c = m44314c();
            int i = C9371R.layout.instabug_fragment_attachments_bottom_sheet;
            c[29] = true;
            return i;
        }

        /* access modifiers changed from: protected */
        public String getTitle() {
            boolean[] c = m44314c();
            String string = getString(C9700R.string.instabug_str_empty);
            c[30] = true;
            return string;
        }

        public void onClick(android.view.View view) {
            boolean[] c = m44314c();
            int id = view.getId();
            if (id == C9371R.C9375id.instabug_attach_screenshot) {
                c[32] = true;
                m44315d();
                c[33] = true;
                this.f25045a.mo34084d();
                c[34] = true;
            } else if (id == C9371R.C9375id.instabug_attach_gallery_image) {
                c[35] = true;
                m44315d();
                c[36] = true;
                this.f25045a.mo34083c();
                c[37] = true;
            } else if (id == C9371R.C9375id.instabug_attach_video) {
                c[38] = true;
                m44315d();
                c[39] = true;
                this.f25045a.mo34085e();
                c[40] = true;
            } else if (id != C9371R.C9375id.instabug_attachments_bottom_sheet_dim_view) {
                c[41] = true;
            } else {
                c[42] = true;
                m44315d();
                c[43] = true;
            }
            c[44] = true;
        }

        public void onViewCreated(android.view.View view, @C0195i0 Bundle bundle) {
            boolean[] c = m44314c();
            super.onViewCreated(view, bundle);
            c[2] = true;
            if (C9441a.m44192b().isScreenshotEnabled()) {
                c[3] = true;
                android.view.View findViewById = view.findViewById(C9371R.C9375id.instabug_attach_screenshot);
                c[4] = true;
                findViewById.setOnClickListener(this);
                c[5] = true;
            } else {
                android.view.View findViewById2 = view.findViewById(C9371R.C9375id.instabug_attach_screenshot);
                c[6] = true;
                findViewById2.setVisibility(8);
                c[7] = true;
            }
            if (C9441a.m44192b().isImageFromGalleryEnabled()) {
                c[8] = true;
                android.view.View findViewById3 = view.findViewById(C9371R.C9375id.instabug_attach_gallery_image);
                c[9] = true;
                findViewById3.setOnClickListener(this);
                c[10] = true;
            } else {
                android.view.View findViewById4 = view.findViewById(C9371R.C9375id.instabug_attach_gallery_image);
                c[11] = true;
                findViewById4.setVisibility(8);
                c[12] = true;
            }
            if (C9441a.m44192b().isScreenRecordingEnabled()) {
                c[13] = true;
                android.view.View findViewById5 = view.findViewById(C9371R.C9375id.instabug_attach_video);
                c[14] = true;
                findViewById5.setOnClickListener(this);
                c[15] = true;
            } else {
                view.findViewById(C9371R.C9375id.instabug_attach_video).setVisibility(8);
                c[16] = true;
            }
            android.view.View findViewById6 = view.findViewById(C9371R.C9375id.instabug_attachments_bottom_sheet_dim_view);
            c[17] = true;
            findViewById6.setOnClickListener(this);
            c[18] = true;
            m44313b(view);
            c[19] = true;
            m44312a(view);
            c[20] = true;
        }

        public void onVisibilityChanged(boolean z) {
            boolean[] c = m44314c();
            StringBuilder sb = new StringBuilder();
            sb.append("Is visible ");
            sb.append(z);
            InstabugSDKLogger.m46622d(this, sb.toString());
            c[49] = true;
        }

        /* access modifiers changed from: protected */
        public void restoreState(Bundle bundle) {
            m44314c()[28] = true;
        }

        /* access modifiers changed from: protected */
        public void saveState(Bundle bundle) {
            m44314c()[27] = true;
        }

        /* renamed from: a */
        private void m44312a(android.view.View view) {
            boolean[] c = m44314c();
            if (VERSION.SDK_INT < 12) {
                c[21] = true;
            } else {
                c[22] = true;
                android.view.View findViewById = view.findViewById(C9371R.C9375id.instabug_attachments_actions_bottom_sheet);
                c[23] = true;
                findViewById.setAlpha(0.0f);
                c[24] = true;
                findViewById.post(new C9461a(this, findViewById));
                c[25] = true;
            }
            c[26] = true;
        }
    }

    /* renamed from: com.instabug.chat.ui.c$d */
    /* compiled from: ChatContract */
    public class C9463d {

        /* renamed from: com.instabug.chat.ui.c$d$a */
        /* compiled from: ChatContract */
        interface C9464a extends Presenter {
            /* renamed from: a */
            Attachment mo34086a(Uri uri);

            /* renamed from: a */
            Message mo34087a(String str, Attachment attachment);

            /* renamed from: a */
            Message mo34088a(String str, String str2);

            /* renamed from: a */
            List<C9420a> mo34089a(List<Message> list);

            /* renamed from: a */
            void mo34090a(Attachment attachment);

            /* renamed from: a */
            void mo34091a(Message message);

            /* renamed from: a */
            void mo34092a(String str);

            /* renamed from: c */
            void mo34093c();

            /* renamed from: d */
            void mo34094d();

            /* renamed from: e */
            Chat mo34095e();

            /* renamed from: f */
            void mo34096f();

            /* renamed from: g */
            void mo34097g();

            /* renamed from: h */
            void mo34098h();

            /* renamed from: i */
            void mo34099i();
        }

        /* renamed from: com.instabug.chat.ui.c$d$b */
        /* compiled from: ChatContract */
        interface C9465b extends View<Fragment> {
            /* renamed from: a */
            void mo34100a(Uri uri);

            /* renamed from: a */
            void mo34101a(List<Message> list);

            /* renamed from: f */
            void mo34102f();

            /* renamed from: g */
            void mo34103g();

            /* renamed from: h */
            void mo34104h();

            /* renamed from: i */
            void mo34105i();

            /* renamed from: j */
            void mo34106j();

            /* renamed from: l */
            void mo34107l();
        }
    }

    /* renamed from: com.instabug.chat.ui.c$e */
    /* compiled from: ChatFragment */
    public class C9466e extends ToolbarFragment<C9464a> implements OnClickListener, C9454a, C9462b, C9465b, C9484i {

        /* renamed from: O */
        private static transient /* synthetic */ boolean[] f25049O;

        /* renamed from: N */
        private EditText f25050N;

        /* renamed from: a */
        private String f25051a;

        /* renamed from: b */
        private C9474h f25052b;

        /* renamed from: com.instabug.chat.ui.c$e$a */
        /* compiled from: ChatFragment */
        class C9467a implements Runnable {

            /* renamed from: b */
            private static transient /* synthetic */ boolean[] f25053b;

            /* renamed from: a */
            final /* synthetic */ C9466e f25054a;

            C9467a(C9466e eVar) {
                boolean[] a = m44367a();
                this.f25054a = eVar;
                a[0] = true;
            }

            /* renamed from: a */
            private static /* synthetic */ boolean[] m44367a() {
                boolean[] zArr = f25053b;
                if (zArr != null) {
                    return zArr;
                }
                boolean[] a = C13938g.m59885a(-5324968036763417086L, "com/instabug/chat/ui/chat/ChatFragment$1", 2);
                f25053b = a;
                return a;
            }

            public void run() {
                m44367a()[1] = true;
            }
        }

        /* renamed from: com.instabug.chat.ui.c$e$b */
        /* compiled from: ChatFragment */
        class C9468b implements Runnable {

            /* renamed from: b */
            private static transient /* synthetic */ boolean[] f25055b;

            /* renamed from: a */
            final /* synthetic */ C9466e f25056a;

            C9468b(C9466e eVar) {
                boolean[] a = m44368a();
                this.f25056a = eVar;
                a[0] = true;
            }

            /* renamed from: a */
            private static /* synthetic */ boolean[] m44368a() {
                boolean[] zArr = f25055b;
                if (zArr != null) {
                    return zArr;
                }
                boolean[] a = C13938g.m59885a(-5932747412036663241L, "com/instabug/chat/ui/chat/ChatFragment$2", 2);
                f25055b = a;
                return a;
            }

            public void run() {
                boolean[] a = m44368a();
                ((C9464a) C9466e.m44344a(this.f25056a)).mo34098h();
                a[1] = true;
            }
        }

        public C9466e() {
            m44349r()[0] = true;
        }

        /* renamed from: a */
        static /* synthetic */ Presenter m44344a(C9466e eVar) {
            boolean[] r = m44349r();
            P p = eVar.presenter;
            r[167] = true;
            return p;
        }

        /* renamed from: k */
        private void m44345k() {
            boolean[] r = m44349r();
            C1382h supportFragmentManager = getActivity().getSupportFragmentManager();
            r[143] = true;
            C1406n a = supportFragmentManager.mo6224a();
            int i = C9371R.C9375id.instabug_fragment_container;
            r[144] = true;
            C9460c a2 = C9460c.m44311a((C9462b) this);
            r[145] = true;
            String str = "attachments_bottom_sheet_fragment";
            C1406n a3 = a.mo6395a(i, a2, str);
            r[146] = true;
            C1406n a4 = a3.mo6401a(str);
            r[147] = true;
            a4.mo6097e();
            r[148] = true;
        }

        /* renamed from: n */
        private void m44346n() {
            boolean[] r = m44349r();
            PermissionsUtils.requestPermission((Fragment) this, "android.permission.WRITE_EXTERNAL_STORAGE", (int) C13959t.f40977y2, (Runnable) new C9467a(this), (Runnable) new C9468b(this));
            r[149] = true;
            ChatPlugin chatPlugin = (ChatPlugin) InstabugCore.getXPlugin(ChatPlugin.class);
            if (chatPlugin == null) {
                r[150] = true;
            } else {
                r[151] = true;
                chatPlugin.setState(2);
                r[152] = true;
            }
            r[153] = true;
        }

        /* renamed from: o */
        private Intent m44347o() {
            boolean[] r = m44349r();
            Intent intent = new Intent("android.intent.action.PICK");
            if (VERSION.SDK_INT < 11) {
                r[154] = true;
            } else {
                r[155] = true;
                intent.putExtra("android.intent.extra.LOCAL_ONLY", true);
                r[156] = true;
            }
            intent.setType("image/*");
            r[157] = true;
            return intent;
        }

        /* renamed from: p */
        private void m44348p() {
            boolean[] r = m44349r();
            String str = "android.permission.RECORD_AUDIO";
            if (C0841b.m4916a((Context) getActivity(), str) != 0) {
                r[163] = true;
                requestPermissions(new String[]{str}, C13959t.f40981z2);
                r[164] = true;
            } else {
                ((C9464a) this.presenter).mo34097g();
                r[165] = true;
            }
            r[166] = true;
        }

        /* renamed from: r */
        private static /* synthetic */ boolean[] m44349r() {
            boolean[] zArr = f25049O;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(7237212590132219936L, "com/instabug/chat/ui/chat/ChatFragment", C13959t.f40784E2);
            f25049O = a;
            return a;
        }

        /* renamed from: b */
        public void mo34108b(String str) {
            boolean[] r = m44349r();
            SystemServiceUtils.hideInputMethod(getActivity());
            r[58] = true;
            C1382h supportFragmentManager = getActivity().getSupportFragmentManager();
            r[59] = true;
            C1406n a = supportFragmentManager.mo6224a();
            int i = C9371R.C9375id.instabug_fragment_container;
            r[60] = true;
            VideoPlayerFragment newInstance = VideoPlayerFragment.newInstance(str);
            r[61] = true;
            String str2 = VideoPlayerFragment.TAG;
            C1406n a2 = a.mo6395a(i, newInstance, str2);
            r[62] = true;
            C1406n a3 = a2.mo6401a(str2);
            r[63] = true;
            a3.mo6097e();
            r[64] = true;
        }

        /* renamed from: c */
        public void mo34109c(String str) {
            boolean[] r = m44349r();
            SystemServiceUtils.hideInputMethod(getActivity());
            r[65] = true;
            C1382h supportFragmentManager = getActivity().getSupportFragmentManager();
            r[66] = true;
            C1406n a = supportFragmentManager.mo6224a();
            int i = C9371R.C9375id.instabug_fragment_container;
            r[67] = true;
            C9472g a2 = C9472g.m44411a(str);
            r[68] = true;
            String str2 = "image_attachment_viewer_fragment";
            C1406n a3 = a.mo6395a(i, a2, str2);
            r[69] = true;
            C1406n a4 = a3.mo6401a(str2);
            r[70] = true;
            a4.mo6097e();
            r[71] = true;
        }

        /* renamed from: d */
        public void mo34110d(String str) {
            boolean[] r = m44349r();
            try {
                Intent intent = new Intent("android.intent.action.VIEW");
                r[72] = true;
                intent.setData(Uri.parse(str));
                r[73] = true;
                startActivity(intent);
                r[74] = true;
            } catch (Exception e) {
                r[75] = true;
                StringBuilder sb = new StringBuilder();
                sb.append("Unable to view this url ");
                sb.append(str);
                sb.append("\nError message: ");
                r[76] = true;
                sb.append(e.getMessage());
                String sb2 = sb.toString();
                r[77] = true;
                InstabugSDKLogger.m46623e(this, sb2);
                r[78] = true;
            }
            r[79] = true;
        }

        /* renamed from: e */
        public void mo34085e() {
            boolean[] r = m44349r();
            mo34111m();
            r[82] = true;
        }

        /* renamed from: f */
        public void mo34102f() {
            boolean[] r = m44349r();
            ((ImageButton) this.rootView.findViewById(C9371R.C9375id.instabug_btn_toolbar_left)).setImageResource(C9371R.C9374drawable.instabug_ic_close);
            r[121] = true;
        }

        /* renamed from: g */
        public void mo34103g() {
            boolean[] r = m44349r();
            ((ImageButton) this.rootView.findViewById(C9371R.C9375id.instabug_btn_toolbar_left)).setImageResource(C9371R.C9374drawable.instabug_ic_back);
            if (VERSION.SDK_INT < 11) {
                r[122] = true;
            } else {
                r[123] = true;
                android.view.View findViewById = this.rootView.findViewById(C9371R.C9375id.instabug_btn_toolbar_left);
                Resources resources = getResources();
                int i = C9371R.integer.instabug_icon_lang_rotation;
                r[124] = true;
                float integer = (float) resources.getInteger(i);
                r[125] = true;
                findViewById.setRotation(integer);
                r[126] = true;
            }
            r[127] = true;
        }

        /* access modifiers changed from: protected */
        public int getContentLayout() {
            boolean[] r = m44349r();
            int i = C9371R.layout.instabug_fragment_chat;
            r[14] = true;
            return i;
        }

        /* access modifiers changed from: protected */
        public String getTitle() {
            boolean[] r = m44349r();
            if (ChatsCacheManager.getChat(this.f25051a) != null) {
                r[27] = true;
                String a = ChatsCacheManager.getChat(this.f25051a).mo33882a(getContext());
                r[28] = true;
                return a;
            }
            String string = getString(C9371R.string.instabug_str_empty);
            r[29] = true;
            return string;
        }

        /* renamed from: h */
        public void mo34104h() {
            boolean[] r = m44349r();
            ImageView imageView = (ImageView) this.rootView.findViewById(C9371R.C9375id.instabug_btn_attach);
            r[128] = true;
            Colorizer.applyPrimaryColorTint(imageView);
            r[129] = true;
            imageView.setOnClickListener(this);
            r[130] = true;
        }

        /* renamed from: i */
        public void mo34105i() {
            boolean[] r = m44349r();
            this.rootView.findViewById(C9371R.C9375id.instabug_btn_attach).setVisibility(8);
            r[131] = true;
        }

        /* access modifiers changed from: protected */
        public void initContentViews(android.view.View view, Bundle bundle) {
            boolean[] r = m44349r();
            view.findViewById(C9371R.C9375id.instabug_btn_toolbar_right).setVisibility(8);
            r[15] = true;
            ListView listView = (ListView) view.findViewById(C9371R.C9375id.instabug_lst_messages);
            r[16] = true;
            this.f25050N = (EditText) view.findViewById(C9371R.C9375id.instabug_edit_text_new_message);
            EditText editText = this.f25050N;
            Key key = Key.CONVERSATION_TEXT_FIELD_HINT;
            int i = C9371R.string.instabug_str_sending_message_hint;
            r[17] = true;
            String string = getString(i);
            r[18] = true;
            editText.setHint(PlaceHolderUtils.getPlaceHolder(key, string));
            r[19] = true;
            ImageView imageView = (ImageView) view.findViewById(C9371R.C9375id.instabug_btn_send);
            r[20] = true;
            Drawable c = C0841b.m4928c(getContext(), C9371R.C9374drawable.instabug_ic_send);
            r[21] = true;
            Drawable primaryColorTintedDrawable = Colorizer.getPrimaryColorTintedDrawable(c);
            r[22] = true;
            imageView.setImageDrawable(primaryColorTintedDrawable);
            r[23] = true;
            imageView.setOnClickListener(this);
            r[24] = true;
            this.f25052b = new C9474h(new ArrayList(), getActivity(), listView, this);
            r[25] = true;
            listView.setAdapter(this.f25052b);
            r[26] = true;
        }

        /* renamed from: j */
        public void mo34106j() {
            boolean[] r = m44349r();
            this.f25052b.notifyDataSetChanged();
            r[133] = true;
        }

        /* renamed from: l */
        public void mo34107l() {
            boolean[] r = m44349r();
            startActivityForResult(m44347o(), C13959t.f40973x2);
            r[142] = true;
        }

        /* renamed from: m */
        public void mo34111m() {
            boolean[] r = m44349r();
            if (!C9400a.m43963b().mo33842a()) {
                r[158] = true;
                m44348p();
                r[159] = true;
            } else {
                Toast makeText = Toast.makeText(getContext(), C9371R.string.instabug_str_video_encoder_busy, 0);
                r[160] = true;
                makeText.show();
                r[161] = true;
            }
            r[162] = true;
        }

        public void onActivityResult(int i, int i2, Intent intent) {
            boolean[] r = m44349r();
            super.onActivityResult(i, i2, intent);
            if (i != 161) {
                r[100] = true;
            } else {
                if (i2 != -1) {
                    r[101] = true;
                } else if (intent == null) {
                    r[102] = true;
                } else {
                    r[103] = true;
                    Uri data = intent.getData();
                    r[104] = true;
                    String galleryImagePath = AttachmentsUtility.getGalleryImagePath(getActivity(), data);
                    if (galleryImagePath != null) {
                        r[105] = true;
                    } else {
                        r[106] = true;
                        galleryImagePath = intent.getData().getPath();
                        r[107] = true;
                    }
                    if (galleryImagePath == null) {
                        r[108] = true;
                    } else {
                        r[109] = true;
                        C1376c activity = getActivity();
                        File file = new File(galleryImagePath);
                        r[110] = true;
                        Uri fromFile = Uri.fromFile(file);
                        r[111] = true;
                        Uri newFileAttachmentUri = AttachmentsUtility.getNewFileAttachmentUri(activity, fromFile);
                        r[112] = true;
                        InstabugSDKLogger.m46622d(this, "onActivityResult");
                        r[113] = true;
                        ((C9464a) this.presenter).mo34094d();
                        P p = this.presenter;
                        C9464a aVar = (C9464a) p;
                        C9464a aVar2 = (C9464a) p;
                        r[114] = true;
                        Attachment a = aVar2.mo34086a(newFileAttachmentUri);
                        r[115] = true;
                        aVar.mo34090a(a);
                        r[116] = true;
                    }
                }
                ChatPlugin chatPlugin = (ChatPlugin) InstabugCore.getXPlugin(ChatPlugin.class);
                if (chatPlugin == null) {
                    r[117] = true;
                } else {
                    r[118] = true;
                    chatPlugin.setState(1);
                    r[119] = true;
                }
            }
            r[120] = true;
        }

        public void onClick(android.view.View view) {
            boolean[] r = m44349r();
            if (view.getId() == C9371R.C9375id.instabug_btn_send) {
                r[47] = true;
                String obj = this.f25050N.getText().toString();
                r[48] = true;
                if (TextUtils.isEmpty(obj.trim())) {
                    r[49] = true;
                    return;
                }
                P p = this.presenter;
                ((C9464a) p).mo34091a(((C9464a) p).mo34088a(((C9464a) p).mo34095e().getId(), obj));
                r[50] = true;
                this.f25050N.setText("");
                r[51] = true;
                r[52] = true;
            } else if (view.getId() != C9371R.C9375id.instabug_btn_attach) {
                r[53] = true;
            } else {
                r[54] = true;
                SystemServiceUtils.hideInputMethod(getActivity());
                r[55] = true;
                m44345k();
                r[56] = true;
            }
            r[57] = true;
        }

        /* access modifiers changed from: protected */
        public void onCloseButtonClicked() {
            boolean[] r = m44349r();
            SystemServiceUtils.hideInputMethod(getActivity());
            r[31] = true;
        }

        public void onCreate(Bundle bundle) {
            boolean[] r = m44349r();
            super.onCreate(bundle);
            r[10] = true;
            setRetainInstance(true);
            r[11] = true;
            this.f25051a = getArguments().getString("chat_number");
            r[12] = true;
            this.presenter = new C9469f(this);
            r[13] = true;
        }

        public void onDestroyView() {
            boolean[] r = m44349r();
            super.onDestroyView();
            r[45] = true;
            ((C9464a) this.presenter).mo34099i();
            r[46] = true;
        }

        /* access modifiers changed from: protected */
        public void onDoneButtonClicked() {
            m44349r()[30] = true;
        }

        public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
            boolean[] r = m44349r();
            if (iArr.length <= 0) {
                r[91] = true;
            } else if (iArr[0] != 0) {
                r[92] = true;
            } else {
                if (i == 162) {
                    ((C9464a) this.presenter).mo34098h();
                    r[93] = true;
                } else if (i != 163) {
                    super.onRequestPermissionsResult(i, strArr, iArr);
                    r[95] = true;
                } else {
                    ((C9464a) this.presenter).mo34097g();
                    r[94] = true;
                }
                r[99] = true;
            }
            if (i != 163) {
                r[96] = true;
            } else {
                r[97] = true;
                ((C9464a) this.presenter).mo34097g();
                r[98] = true;
            }
            r[99] = true;
        }

        public void onStart() {
            boolean[] r = m44349r();
            super.onStart();
            r[34] = true;
            ((C9464a) this.presenter).mo34094d();
            r[35] = true;
            Attachment attachment = (Attachment) getArguments().getSerializable(MessengerShareContentUtility.ATTACHMENT);
            if (attachment == null) {
                r[36] = true;
            } else {
                r[37] = true;
                ((C9464a) this.presenter).mo34090a(attachment);
                r[38] = true;
            }
            if (getArguments() == null) {
                r[39] = true;
            } else {
                r[40] = true;
                getArguments().clear();
                r[41] = true;
            }
            r[42] = true;
        }

        public void onStop() {
            boolean[] r = m44349r();
            super.onStop();
            r[43] = true;
            ((C9464a) this.presenter).mo34093c();
            r[44] = true;
        }

        public void onViewCreated(android.view.View view, @C0195i0 Bundle bundle) {
            boolean[] r = m44349r();
            super.onViewCreated(view, bundle);
            r[32] = true;
            ((C9464a) this.presenter).mo34092a(this.f25051a);
            r[33] = true;
        }

        /* renamed from: a */
        public static C9466e m44342a(String str) {
            boolean[] r = m44349r();
            C9466e eVar = new C9466e();
            r[1] = true;
            Bundle bundle = new Bundle();
            r[2] = true;
            bundle.putString("chat_number", str);
            r[3] = true;
            eVar.setArguments(bundle);
            r[4] = true;
            return eVar;
        }

        /* renamed from: a */
        public static C9466e m44343a(String str, Attachment attachment) {
            boolean[] r = m44349r();
            C9466e eVar = new C9466e();
            r[5] = true;
            Bundle bundle = new Bundle();
            r[6] = true;
            bundle.putString("chat_number", str);
            r[7] = true;
            bundle.putSerializable(MessengerShareContentUtility.ATTACHMENT, attachment);
            r[8] = true;
            eVar.setArguments(bundle);
            r[9] = true;
            return eVar;
        }

        /* renamed from: b */
        public void mo34070b(String str, Uri uri) {
            m44349r()[90] = true;
        }

        /* renamed from: c */
        public void mo34083c() {
            boolean[] r = m44349r();
            m44346n();
            r[81] = true;
        }

        /* renamed from: d */
        public void mo34084d() {
            boolean[] r = m44349r();
            ((C9464a) this.presenter).mo34096f();
            r[80] = true;
        }

        /* renamed from: a */
        public void mo34069a(String str, Uri uri) {
            boolean[] r = m44349r();
            if (str == null) {
                r[83] = true;
            } else if (!str.equals(((C9464a) this.presenter).mo34095e().getId())) {
                r[84] = true;
            } else {
                r[85] = true;
                P p = this.presenter;
                C9464a aVar = (C9464a) p;
                C9464a aVar2 = (C9464a) p;
                String id = ((C9464a) p).mo34095e().getId();
                C9464a aVar3 = (C9464a) this.presenter;
                r[86] = true;
                Attachment a = aVar3.mo34086a(uri);
                r[87] = true;
                aVar.mo34091a(aVar2.mo34087a(id, a));
                r[88] = true;
            }
            r[89] = true;
        }

        /* renamed from: a */
        public void mo34101a(List<Message> list) {
            boolean[] r = m44349r();
            this.f25052b.mo34128a(((C9464a) this.presenter).mo34089a(list));
            r[132] = true;
        }

        /* renamed from: a */
        public void mo34100a(Uri uri) {
            boolean[] r = m44349r();
            C1382h supportFragmentManager = getActivity().getSupportFragmentManager();
            r[134] = true;
            C1406n a = supportFragmentManager.mo6224a();
            int i = C9371R.C9375id.instabug_fragment_container;
            C9464a aVar = (C9464a) this.presenter;
            r[135] = true;
            String a2 = aVar.mo34095e().mo33882a((Context) getActivity());
            C9464a aVar2 = (C9464a) this.presenter;
            r[136] = true;
            String id = aVar2.mo34095e().getId();
            r[137] = true;
            C9453b a3 = C9453b.m44291a(a2, id, uri);
            r[138] = true;
            String str = "annotation_fragment_for_chat";
            C1406n a4 = a.mo6395a(i, a3, str);
            r[139] = true;
            C1406n a5 = a4.mo6401a(str);
            r[140] = true;
            a5.mo6097e();
            r[141] = true;
        }
    }

    /* renamed from: com.instabug.chat.ui.c$f */
    /* compiled from: ChatPresenter */
    class C9469f extends BasePresenter<C9465b> implements C9449b, C9464a, CacheChangedListener<Chat> {

        /* renamed from: e */
        private static transient /* synthetic */ boolean[] f25057e;

        /* renamed from: a */
        private C12252e<String> f25058a;

        /* renamed from: b */
        private C12280i0 f25059b;

        /* renamed from: c */
        private C12314c f25060c;

        /* renamed from: d */
        private Chat f25061d;

        /* renamed from: com.instabug.chat.ui.c$f$a */
        /* compiled from: ChatPresenter */
        class C9470a implements C12280i0<String> {

            /* renamed from: b */
            private static transient /* synthetic */ boolean[] f25062b;

            /* renamed from: a */
            final /* synthetic */ C9469f f25063a;

            C9470a(C9469f fVar) {
                boolean[] a = m44403a();
                this.f25063a = fVar;
                a[0] = true;
            }

            /* renamed from: a */
            private static /* synthetic */ boolean[] m44403a() {
                boolean[] zArr = f25062b;
                if (zArr != null) {
                    return zArr;
                }
                boolean[] a = C13938g.m59885a(-6918932598137510045L, "com/instabug/chat/ui/chat/ChatPresenter$1", 6);
                f25062b = a;
                return a;
            }

            /* renamed from: a */
            public /* synthetic */ void mo33453a(Object obj) {
                boolean[] a = m44403a();
                mo34124a((String) obj);
                a[5] = true;
            }

            public void onComplete() {
                m44403a()[4] = true;
            }

            public void onError(Throwable th) {
                m44403a()[3] = true;
            }

            /* renamed from: a */
            public void mo34123a(C12314c cVar) {
                m44403a()[1] = true;
            }

            /* renamed from: a */
            public void mo34124a(String str) {
                boolean[] a = m44403a();
                C9469f.m44371a(this.f25063a, str);
                a[2] = true;
            }
        }

        /* renamed from: com.instabug.chat.ui.c$f$b */
        /* compiled from: ChatPresenter */
        class C9471b implements C12331g<C9414a> {

            /* renamed from: b */
            private static transient /* synthetic */ boolean[] f25064b;

            /* renamed from: a */
            final /* synthetic */ C9469f f25065a;

            C9471b(C9469f fVar) {
                boolean[] a = m44407a();
                this.f25065a = fVar;
                a[0] = true;
            }

            /* renamed from: a */
            private static /* synthetic */ boolean[] m44407a() {
                boolean[] zArr = f25064b;
                if (zArr != null) {
                    return zArr;
                }
                boolean[] a = C13938g.m59885a(7734514033113624698L, "com/instabug/chat/ui/chat/ChatPresenter$2", 6);
                f25064b = a;
                return a;
            }

            /* renamed from: a */
            public void mo34125a(C9414a aVar) {
                boolean[] a = m44407a();
                if (!C9469f.m44369a(this.f25065a).getId().equals(aVar.mo33859a())) {
                    a[1] = true;
                } else {
                    a[2] = true;
                    C9469f.m44369a(this.f25065a).mo33884b(aVar.mo33860b());
                    a[3] = true;
                }
                a[4] = true;
            }

            /* renamed from: c */
            public /* synthetic */ void mo33410c(Object obj) throws Exception {
                boolean[] a = m44407a();
                mo34125a((C9414a) obj);
                a[5] = true;
            }
        }

        C9469f(C9465b bVar) {
            boolean[] o = m44384o();
            super(bVar);
            o[0] = true;
        }

        /* renamed from: a */
        static /* synthetic */ Chat m44369a(C9469f fVar) {
            boolean[] o = m44384o();
            Chat chat = fVar.f25061d;
            o[282] = true;
            return chat;
        }

        /* renamed from: j */
        private Attachment m44379j() {
            boolean[] o = m44384o();
            Attachment attachment = new Attachment();
            o[124] = true;
            attachment.setState("offline");
            o[125] = true;
            return attachment;
        }

        /* renamed from: k */
        private void m44380k() {
            boolean[] o = m44384o();
            this.f25058a = C12252e.m55181U();
            C12252e<String> eVar = this.f25058a;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            o[225] = true;
            C5923b0 b = eVar.mo23900b(300, timeUnit);
            o[226] = true;
            C5923b0 a = b.mo23825a(C12304a.m55390a());
            C9470a aVar = new C9470a(this);
            o[227] = true;
            this.f25059b = a.mo24007f(aVar);
            o[228] = true;
        }

        /* renamed from: l */
        private void m44381l() {
            boolean[] o = m44384o();
            if (m44372a(this.f25060c)) {
                o[229] = true;
            } else {
                o[230] = true;
                this.f25060c = ChatTriggeringEventBus.getInstance().subscribe(new C9471b(this));
                o[231] = true;
            }
            o[232] = true;
        }

        /* renamed from: m */
        private void m44382m() {
            boolean[] o = m44384o();
            if (!m44372a(this.f25060c)) {
                o[233] = true;
            } else {
                o[234] = true;
                this.f25060c.dispose();
                o[235] = true;
            }
            o[236] = true;
        }

        /* renamed from: n */
        private void m44383n() {
            boolean[] o = m44384o();
            if (this.f25061d.mo33885d() != ChatState.WAITING_ATTACHMENT_MESSAGE) {
                o[253] = true;
            } else {
                o[254] = true;
                this.f25061d.mo33879a(ChatState.READY_TO_BE_SENT);
                o[255] = true;
            }
            o[256] = true;
        }

        /* renamed from: o */
        private static /* synthetic */ boolean[] m44384o() {
            boolean[] zArr = f25057e;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(5185139688182152502L, "com/instabug/chat/ui/chat/ChatPresenter", 283);
            f25057e = a;
            return a;
        }

        /* renamed from: b */
        public void mo34117b(Chat chat) {
            boolean[] o = m44384o();
            m44374b(chat.getId());
            o[199] = true;
        }

        /* renamed from: c */
        public void mo34093c() {
            boolean[] o = m44384o();
            CacheManager.getInstance().unSubscribe(ChatsCacheManager.CHATS_MEMORY_CACHE_KEY, this);
            o[11] = true;
            C9448a.m44260a().mo34051b((C9449b) this);
            o[12] = true;
            m44382m();
            o[13] = true;
        }

        /* renamed from: d */
        public void mo34094d() {
            boolean[] o = m44384o();
            m44383n();
            o[6] = true;
            m44380k();
            o[7] = true;
            CacheManager.getInstance().subscribe(ChatsCacheManager.CHATS_MEMORY_CACHE_KEY, this);
            o[8] = true;
            C9448a.m44260a().mo34050a((C9449b) this);
            o[9] = true;
            m44381l();
            o[10] = true;
        }

        /* renamed from: e */
        public Chat mo34095e() {
            boolean[] o = m44384o();
            Chat chat = this.f25061d;
            o[123] = true;
            return chat;
        }

        /* renamed from: f */
        public void mo34096f() {
            boolean[] o = m44384o();
            ChatPlugin chatPlugin = (ChatPlugin) InstabugCore.getXPlugin(ChatPlugin.class);
            o[131] = true;
            if (chatPlugin == null) {
                o[132] = true;
            } else if (chatPlugin.getAppContext() == null) {
                o[133] = true;
            } else if (this.f25061d == null) {
                o[134] = true;
            } else {
                o[135] = true;
                InstabugSDKLogger.m46626v(C9466e.class, "take extra screenshot");
                o[136] = true;
                chatPlugin.setState(2);
                o[137] = true;
                this.f25061d.mo33879a(ChatState.WAITING_ATTACHMENT_MESSAGE);
                o[138] = true;
                C9413a a = C9413a.m44009a();
                Context appContext = chatPlugin.getAppContext();
                Chat chat = this.f25061d;
                o[139] = true;
                String id = chat.getId();
                o[140] = true;
                a.mo33858a(appContext, id);
                WeakReference<V> weakReference = this.view;
                if (weakReference == null) {
                    o[141] = true;
                } else {
                    o[142] = true;
                    C9465b bVar = (C9465b) weakReference.get();
                    if (bVar == null) {
                        o[143] = true;
                    } else {
                        o[144] = true;
                        bVar.finishActivity();
                        o[145] = true;
                    }
                }
            }
            o[146] = true;
        }

        /* renamed from: g */
        public void mo34097g() {
            boolean[] o = m44384o();
            ChatPlugin chatPlugin = (ChatPlugin) InstabugCore.getXPlugin(ChatPlugin.class);
            o[147] = true;
            if (chatPlugin == null) {
                o[148] = true;
            } else if (chatPlugin.getAppContext() == null) {
                o[149] = true;
            } else if (this.f25061d == null) {
                o[150] = true;
            } else {
                o[151] = true;
                InstabugSDKLogger.m46626v(C9466e.class, "start record screen");
                o[152] = true;
                chatPlugin.setState(2);
                o[153] = true;
                this.f25061d.mo33879a(ChatState.WAITING_ATTACHMENT_MESSAGE);
                o[154] = true;
                C9400a.m43963b().mo33841a(this.f25061d.getId());
                WeakReference<V> weakReference = this.view;
                if (weakReference == null) {
                    o[155] = true;
                } else {
                    o[156] = true;
                    C9465b bVar = (C9465b) weakReference.get();
                    if (bVar == null) {
                        o[157] = true;
                    } else {
                        o[158] = true;
                        bVar.finishActivity();
                        o[159] = true;
                    }
                }
            }
            o[160] = true;
        }

        /* renamed from: h */
        public void mo34098h() {
            boolean[] o = m44384o();
            ChatPlugin chatPlugin = (ChatPlugin) InstabugCore.getXPlugin(ChatPlugin.class);
            o[161] = true;
            if (chatPlugin == null) {
                o[162] = true;
            } else if (chatPlugin.getAppContext() == null) {
                o[163] = true;
            } else if (this.f25061d == null) {
                o[164] = true;
            } else {
                o[165] = true;
                InstabugSDKLogger.m46626v(C9466e.class, "pick image from gallery");
                o[166] = true;
                chatPlugin.setState(2);
                o[167] = true;
                this.f25061d.mo33879a(ChatState.WAITING_ATTACHMENT_MESSAGE);
                o[168] = true;
                C9465b bVar = (C9465b) this.view.get();
                if (bVar == null) {
                    o[169] = true;
                } else {
                    o[170] = true;
                    bVar.mo34107l();
                    o[171] = true;
                }
            }
            o[172] = true;
        }

        /* renamed from: i */
        public void mo34099i() {
            boolean[] o = m44384o();
            Chat chat = this.f25061d;
            if (chat == null) {
                o[173] = true;
            } else if (chat.mo33883a().size() != 0) {
                o[174] = true;
            } else if (this.f25061d.mo33885d() == ChatState.WAITING_ATTACHMENT_MESSAGE) {
                o[175] = true;
            } else {
                o[176] = true;
                InMemoryCache cache = ChatsCacheManager.getCache();
                if (cache == null) {
                    o[177] = true;
                } else {
                    o[178] = true;
                    cache.delete(this.f25061d.getId());
                    o[179] = true;
                }
            }
            o[180] = true;
        }

        public void onCacheInvalidated() {
            boolean[] o = m44384o();
            StringBuilder sb = new StringBuilder();
            sb.append("Chats cache was invalidated, Time: ");
            o[202] = true;
            sb.append(System.currentTimeMillis());
            String sb2 = sb.toString();
            o[203] = true;
            InstabugSDKLogger.m46622d(this, sb2);
            o[204] = true;
        }

        public /* synthetic */ void onCachedItemAdded(Object obj) {
            boolean[] o = m44384o();
            mo34118c((Chat) obj);
            o[279] = true;
        }

        public /* synthetic */ void onCachedItemRemoved(Object obj) {
            boolean[] o = m44384o();
            mo34117b((Chat) obj);
            o[280] = true;
        }

        public /* synthetic */ void onCachedItemUpdated(Object obj, Object obj2) {
            boolean[] o = m44384o();
            mo34116a((Chat) obj, (Chat) obj2);
            o[278] = true;
        }

        public List<Message> onNewMessagesReceived(@C0193h0 List<Message> list) {
            boolean[] o = m44384o();
            WeakReference<V> weakReference = this.view;
            if (weakReference == null) {
                o[181] = true;
            } else {
                o[182] = true;
                C9465b bVar = (C9465b) weakReference.get();
                if (bVar == null) {
                    o[183] = true;
                } else {
                    o[184] = true;
                    if (((Fragment) bVar.getViewContext()).getActivity() == null) {
                        o[185] = true;
                    } else {
                        o[186] = true;
                        o[187] = true;
                        for (Message message : list) {
                            o[188] = true;
                            if (!message.mo33914d().equals(this.f25061d.getId())) {
                                o[189] = true;
                            } else {
                                o[190] = true;
                                list.remove(message);
                                o[191] = true;
                                C9397d a = C9397d.m43935a();
                                o[192] = true;
                                C1376c activity = ((Fragment) bVar.getViewContext()).getActivity();
                                o[193] = true;
                                a.mo33834a((Context) activity);
                                o[194] = true;
                                mo34115a(this.f25061d);
                                o[195] = true;
                            }
                            o[196] = true;
                        }
                        o[197] = true;
                        return list;
                    }
                }
            }
            o[198] = true;
            return list;
        }

        /* renamed from: a */
        static /* synthetic */ void m44371a(C9469f fVar, String str) {
            boolean[] o = m44384o();
            fVar.m44376c(str);
            o[281] = true;
        }

        /* renamed from: b */
        private void m44373b() {
            boolean[] o = m44384o();
            WeakReference<V> weakReference = this.view;
            if (weakReference == null) {
                o[213] = true;
            } else {
                o[214] = true;
                C9465b bVar = (C9465b) weakReference.get();
                if (bVar == null) {
                    o[215] = true;
                } else {
                    o[216] = true;
                    if (C9441a.m44197c()) {
                        o[217] = true;
                        bVar.mo34104h();
                        o[218] = true;
                    } else {
                        bVar.mo34105i();
                        o[219] = true;
                    }
                }
            }
            o[220] = true;
        }

        /* renamed from: a */
        public void mo34092a(String str) {
            boolean[] o = m44384o();
            this.f25061d = m44377d(str);
            o[1] = true;
            m44370a();
            o[2] = true;
            m44373b();
            o[3] = true;
            m44378d(this.f25061d);
            o[4] = true;
            mo34115a(this.f25061d);
            o[5] = true;
        }

        /* renamed from: c */
        public void mo34118c(Chat chat) {
            boolean[] o = m44384o();
            m44374b(chat.getId());
            o[200] = true;
        }

        /* renamed from: c */
        private void m44376c(String str) {
            boolean[] o = m44384o();
            this.f25061d = m44377d(str);
            Chat chat = this.f25061d;
            if (chat == null) {
                o[242] = true;
            } else {
                o[243] = true;
                m44378d(chat);
                o[244] = true;
            }
            o[245] = true;
        }

        /* renamed from: d */
        private Chat m44377d(String str) {
            Chat chat;
            boolean[] o = m44384o();
            if (ChatsCacheManager.getCache() == null) {
                o[246] = true;
            } else {
                o[247] = true;
                if (ChatsCacheManager.getChat(str) == null) {
                    o[248] = true;
                } else {
                    o[249] = true;
                    chat = ChatsCacheManager.getChat(str);
                    o[250] = true;
                    o[252] = true;
                    return chat;
                }
            }
            chat = new Chat();
            o[251] = true;
            o[252] = true;
            return chat;
        }

        /* renamed from: a */
        public List<C9420a> mo34089a(List<Message> list) {
            boolean[] o = m44384o();
            ArrayList arrayList = new ArrayList();
            o[14] = true;
            o[15] = true;
            for (Message message : list) {
                o[16] = true;
                if (message.mo33926l() == null) {
                    o[17] = true;
                } else if (message.mo33926l().size() <= 0) {
                    o[18] = true;
                } else {
                    o[19] = true;
                    Iterator it = message.mo33926l().iterator();
                    o[20] = true;
                    while (it.hasNext()) {
                        Attachment attachment = (Attachment) it.next();
                        o[22] = true;
                        C9420a aVar = new C9420a();
                        o[23] = true;
                        C9420a a = aVar.mo33937a(message.mo33916e());
                        o[24] = true;
                        C9420a b = a.mo33941b(message.mo33924j());
                        o[25] = true;
                        C9420a a2 = b.mo33934a(message.mo33921h());
                        o[26] = true;
                        C9420a c = a2.mo33945c(attachment.getUrl());
                        o[27] = true;
                        C9420a d = c.mo33946d(attachment.getLocalPath());
                        o[28] = true;
                        C9420a a3 = d.mo33938a(message.mo33929o());
                        o[29] = true;
                        StringBuilder sb = new StringBuilder();
                        sb.append("type");
                        sb.append(attachment.getFileType());
                        InstabugSDKLogger.m46625i(this, sb.toString());
                        o[30] = true;
                        String type = attachment.getType();
                        char c2 = 65535;
                        int hashCode = type.hashCode();
                        if (hashCode != 93166550) {
                            if (hashCode != 100313435) {
                                if (hashCode != 112202875) {
                                    o[31] = true;
                                } else if (!type.equals("video")) {
                                    o[36] = true;
                                } else {
                                    o[37] = true;
                                    c2 = 2;
                                }
                            } else if (!type.equals("image")) {
                                o[32] = true;
                            } else {
                                o[33] = true;
                                c2 = 0;
                            }
                        } else if (!type.equals("audio")) {
                            o[34] = true;
                        } else {
                            o[35] = true;
                            c2 = 1;
                        }
                        if (c2 == 0) {
                            a3.mo33936a(C9422b.IMAGE);
                            o[39] = true;
                        } else if (c2 == 1) {
                            a3.mo33936a(C9422b.AUDIO);
                            o[40] = true;
                            a3.mo33935a(C9421a.NONE);
                            o[41] = true;
                        } else if (c2 != 2) {
                            o[38] = true;
                        } else {
                            a3.mo33936a(C9422b.VIDEO);
                            o[42] = true;
                            if (attachment.isVideoEncoded()) {
                                o[43] = true;
                                a3.mo33942b(true);
                                o[44] = true;
                            } else {
                                a3.mo33942b(false);
                                o[45] = true;
                            }
                        }
                        arrayList.add(a3);
                        o[46] = true;
                    }
                    o[21] = true;
                }
                if (!TextUtils.isEmpty(message.mo33916e())) {
                    o[47] = true;
                    C9420a aVar2 = new C9420a();
                    o[48] = true;
                    C9420a a4 = aVar2.mo33937a(message.mo33916e());
                    o[49] = true;
                    String j = message.mo33924j();
                    o[50] = true;
                    C9420a b2 = a4.mo33941b(j);
                    o[51] = true;
                    C9420a a5 = b2.mo33934a(message.mo33921h()).mo33938a(message.mo33929o());
                    C9422b bVar = C9422b.MESSAGE;
                    o[52] = true;
                    a5.mo33936a(bVar);
                    o[53] = true;
                    if (message.mo33927m() == null) {
                        o[54] = true;
                    } else if (message.mo33927m().size() <= 0) {
                        o[55] = true;
                    } else {
                        o[56] = true;
                        aVar2.mo33940a(message.mo33927m());
                        o[57] = true;
                    }
                    arrayList.add(aVar2);
                    o[58] = true;
                } else if (message.mo33929o()) {
                    o[59] = true;
                } else if (message.mo33927m() == null) {
                    o[60] = true;
                } else {
                    ArrayList m = message.mo33927m();
                    o[61] = true;
                    if (m.size() <= 0) {
                        o[62] = true;
                    } else {
                        o[63] = true;
                        C9420a aVar3 = new C9420a();
                        o[64] = true;
                        C9420a a6 = aVar3.mo33937a(message.mo33916e());
                        o[65] = true;
                        String j2 = message.mo33924j();
                        o[66] = true;
                        C9420a b3 = a6.mo33941b(j2);
                        o[67] = true;
                        C9420a a7 = b3.mo33934a(message.mo33921h());
                        o[68] = true;
                        boolean o2 = message.mo33929o();
                        o[69] = true;
                        C9420a a8 = a7.mo33938a(o2);
                        C9422b bVar2 = C9422b.MESSAGE;
                        o[70] = true;
                        a8.mo33936a(bVar2);
                        o[71] = true;
                        aVar3.mo33940a(message.mo33927m());
                        o[72] = true;
                        arrayList.add(aVar3);
                        o[73] = true;
                    }
                }
                o[74] = true;
            }
            o[75] = true;
            return arrayList;
        }

        /* renamed from: b */
        private void m44374b(String str) {
            boolean[] o = m44384o();
            if (!str.equals(this.f25061d.getId())) {
                o[221] = true;
            } else {
                o[222] = true;
                this.f25058a.mo33453a(str);
                o[223] = true;
            }
            o[224] = true;
        }

        /* renamed from: b */
        private void m44375b(List<Message> list) {
            boolean[] o = m44384o();
            int size = list.size() - 1;
            o[257] = true;
            while (true) {
                if (size < 0) {
                    o[258] = true;
                    break;
                }
                o[259] = true;
                if (!((Message) list.get(size)).mo33929o()) {
                    if (!((Message) list.get(size)).mo33919f()) {
                        o[262] = true;
                        C9426d dVar = new C9426d();
                        o[263] = true;
                        dVar.mo33974a(((Message) list.get(size)).mo33914d());
                        o[264] = true;
                        dVar.mo33976b(((Message) list.get(size)).mo33908a());
                        o[265] = true;
                        dVar.mo33973a(InstabugDateFormatter.getCurrentUTCTimeStampInSeconds());
                        o[266] = true;
                        ReadQueueCacheManager.getInstance().add(dVar);
                        o[267] = true;
                        break;
                    }
                    o[261] = true;
                } else {
                    o[260] = true;
                }
                size--;
                o[268] = true;
            }
            o[269] = true;
        }

        /* renamed from: d */
        private void m44378d(Chat chat) {
            boolean[] o = m44384o();
            m44375b((List<Message>) chat.mo33883a());
            o[270] = true;
            Collections.sort(chat.mo33883a(), new C9418a());
            WeakReference<V> weakReference = this.view;
            if (weakReference == null) {
                o[271] = true;
            } else {
                o[272] = true;
                C9465b bVar = (C9465b) weakReference.get();
                if (bVar == null) {
                    o[273] = true;
                } else {
                    o[274] = true;
                    bVar.mo34101a((List<Message>) chat.mo33883a());
                    o[275] = true;
                    bVar.mo34106j();
                    o[276] = true;
                }
            }
            o[277] = true;
        }

        /* renamed from: a */
        public void mo34091a(Message message) {
            boolean[] o = m44384o();
            StringBuilder sb = new StringBuilder();
            sb.append("chat id: ");
            sb.append(message.mo33914d());
            InstabugSDKLogger.m46626v(C9469f.class, sb.toString());
            o[76] = true;
            this.f25061d.mo33883a().add(message);
            o[77] = true;
            InMemoryCache cache = ChatsCacheManager.getCache();
            if (cache == null) {
                o[78] = true;
            } else {
                o[79] = true;
                cache.put(this.f25061d.getId(), this.f25061d);
                o[80] = true;
            }
            WeakReference<V> weakReference = this.view;
            if (weakReference == null) {
                o[81] = true;
            } else {
                o[82] = true;
                C9465b bVar = (C9465b) weakReference.get();
                if (bVar == null) {
                    o[83] = true;
                } else {
                    o[84] = true;
                    C9440b.m44179a(((Fragment) bVar.getViewContext()).getContext());
                    o[85] = true;
                }
            }
            o[86] = true;
        }

        /* JADX WARNING: Removed duplicated region for block: B:21:0x005c  */
        /* JADX WARNING: Removed duplicated region for block: B:22:0x006e  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo34090a(com.instabug.chat.model.Attachment r6) {
            /*
                r5 = this;
                boolean[] r0 = m44384o()
                java.lang.String r1 = r6.getType()
                int r2 = r1.hashCode()
                r3 = 93166550(0x58d9bd6, float:1.3316821E-35)
                r4 = 1
                if (r2 == r3) goto L_0x0047
                r3 = 100313435(0x5faa95b, float:2.3572098E-35)
                if (r2 == r3) goto L_0x0034
                r3 = 112202875(0x6b0147b, float:6.6233935E-35)
                if (r2 == r3) goto L_0x0021
                r1 = 87
                r0[r1] = r4
                goto L_0x0053
            L_0x0021:
                java.lang.String r2 = "video"
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L_0x002e
                r1 = 92
                r0[r1] = r4
                goto L_0x0053
            L_0x002e:
                r1 = 2
                r2 = 93
                r0[r2] = r4
                goto L_0x005a
            L_0x0034:
                java.lang.String r2 = "image"
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L_0x0041
                r1 = 88
                r0[r1] = r4
                goto L_0x0053
            L_0x0041:
                r1 = 0
                r2 = 89
                r0[r2] = r4
                goto L_0x005a
            L_0x0047:
                java.lang.String r2 = "audio"
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L_0x0055
                r1 = 90
                r0[r1] = r4
            L_0x0053:
                r1 = -1
                goto L_0x005a
            L_0x0055:
                r1 = 91
                r0[r1] = r4
                r1 = 1
            L_0x005a:
                if (r1 == 0) goto L_0x006e
                com.instabug.chat.model.Chat r1 = r5.f25061d
                java.lang.String r1 = r1.getId()
                com.instabug.chat.model.Message r6 = r5.mo34087a(r1, r6)
                r5.mo34091a(r6)
                r6 = 104(0x68, float:1.46E-43)
                r0[r6] = r4
                goto L_0x00c8
            L_0x006e:
                java.lang.ref.WeakReference<V> r1 = r5.view
                if (r1 != 0) goto L_0x0077
                r6 = 94
                r0[r6] = r4
                goto L_0x00c8
            L_0x0077:
                r2 = 95
                r0[r2] = r4
                java.lang.Object r1 = r1.get()
                com.instabug.chat.ui.c$d$b r1 = (com.instabug.chat.p361ui.C9457c.C9463d.C9465b) r1
                r2 = 96
                r0[r2] = r4
                boolean r2 = com.instabug.chat.settings.C9441a.m44207j()
                if (r2 == 0) goto L_0x00a1
                r1 = 97
                r0[r1] = r4
                com.instabug.chat.model.Chat r1 = r5.f25061d
                java.lang.String r1 = r1.getId()
                com.instabug.chat.model.Message r6 = r5.mo34087a(r1, r6)
                r5.mo34091a(r6)
                r6 = 98
                r0[r6] = r4
                goto L_0x00c4
            L_0x00a1:
                if (r1 != 0) goto L_0x00a8
                r6 = 99
                r0[r6] = r4
                goto L_0x00c4
            L_0x00a8:
                java.io.File r2 = new java.io.File
                r3 = 100
                r0[r3] = r4
                java.lang.String r6 = r6.getLocalPath()
                r2.<init>(r6)
                r6 = 101(0x65, float:1.42E-43)
                r0[r6] = r4
                android.net.Uri r6 = android.net.Uri.fromFile(r2)
                r1.mo34100a(r6)
                r6 = 102(0x66, float:1.43E-43)
                r0[r6] = r4
            L_0x00c4:
                r6 = 103(0x67, float:1.44E-43)
                r0[r6] = r4
            L_0x00c8:
                r6 = 105(0x69, float:1.47E-43)
                r0[r6] = r4
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.instabug.chat.p361ui.C9457c.C9469f.mo34090a(com.instabug.chat.model.Attachment):void");
        }

        /* renamed from: a */
        public Message mo34088a(String str, String str2) {
            boolean[] o = m44384o();
            Message message = new Message();
            o[106] = true;
            Message c = message.mo33912c(str);
            o[107] = true;
            Message d = c.mo33913d(str2);
            o[108] = true;
            Message b = d.mo33909b(InstabugDateFormatter.getCurrentUTCTimeStampInSeconds());
            o[109] = true;
            Message a = b.mo33901a(InstabugDateFormatter.getCurrentUTCTimeStampInSeconds());
            C9419b bVar = C9419b.INBOUND;
            o[110] = true;
            Message a2 = a.mo33904a(bVar);
            o[111] = true;
            Message e = a2.mo33915e(InstabugCore.getIdentifiedUsername());
            MessageState messageState = MessageState.READY_TO_BE_SENT;
            o[112] = true;
            e.mo33903a(messageState);
            o[113] = true;
            return message;
        }

        /* renamed from: a */
        public Message mo34087a(String str, Attachment attachment) {
            boolean[] o = m44384o();
            Message a = mo34088a(str, "");
            o[114] = true;
            a.mo33902a(attachment);
            o[115] = true;
            return a;
        }

        /* renamed from: a */
        public Attachment mo34086a(Uri uri) {
            boolean[] o = m44384o();
            Attachment j = m44379j();
            o[116] = true;
            Attachment type = j.setType("image");
            o[117] = true;
            Attachment localPath = type.setLocalPath(uri.getPath());
            o[118] = true;
            localPath.setName(uri.getLastPathSegment());
            o[119] = true;
            return j;
        }

        /* renamed from: a */
        public void mo34115a(Chat chat) {
            boolean[] o = m44384o();
            chat.mo33888f();
            o[126] = true;
            if (ChatsCacheManager.getCache() == null) {
                o[127] = true;
            } else {
                o[128] = true;
                ChatsCacheManager.getCache().put(chat.getId(), chat);
                o[129] = true;
            }
            o[130] = true;
        }

        /* renamed from: a */
        public void mo34116a(Chat chat, Chat chat2) {
            boolean[] o = m44384o();
            m44374b(chat2.getId());
            o[201] = true;
        }

        /* renamed from: a */
        private void m44370a() {
            boolean[] o = m44384o();
            WeakReference<V> weakReference = this.view;
            if (weakReference == null) {
                o[205] = true;
            } else {
                o[206] = true;
                C9465b bVar = (C9465b) weakReference.get();
                if (bVar == null) {
                    o[207] = true;
                } else {
                    o[208] = true;
                    if (ChatsCacheManager.getValidChats().size() > 0) {
                        o[209] = true;
                        bVar.mo34103g();
                        o[210] = true;
                    } else {
                        bVar.mo34102f();
                        o[211] = true;
                    }
                }
            }
            o[212] = true;
        }

        /* renamed from: a */
        private boolean m44372a(C12314c cVar) {
            boolean z;
            boolean[] o = m44384o();
            if (cVar == null) {
                o[237] = true;
            } else if (cVar.mo41878d()) {
                o[238] = true;
            } else {
                o[239] = true;
                z = true;
                o[241] = true;
                return z;
            }
            z = false;
            o[240] = true;
            o[241] = true;
            return z;
        }
    }

    /* renamed from: com.instabug.chat.ui.c$g */
    /* compiled from: ImageAttachmentViewerFragment */
    public class C9472g extends Fragment {

        /* renamed from: Q */
        private static transient /* synthetic */ boolean[] f25066Q;

        /* renamed from: N */
        private ScaleImageView f25067N;

        /* renamed from: O */
        private float f25068O;

        /* renamed from: P */
        private float f25069P;

        /* renamed from: a */
        private String f25070a;

        /* renamed from: b */
        private ProgressBar f25071b;

        /* renamed from: com.instabug.chat.ui.c$g$a */
        /* compiled from: ImageAttachmentViewerFragment */
        class C9473a implements OnDownloadFinished {

            /* renamed from: b */
            private static transient /* synthetic */ boolean[] f25072b;

            /* renamed from: a */
            final /* synthetic */ C9472g f25073a;

            C9473a(C9472g gVar) {
                boolean[] a = m44417a();
                this.f25073a = gVar;
                a[0] = true;
            }

            /* renamed from: a */
            private static /* synthetic */ boolean[] m44417a() {
                boolean[] zArr = f25072b;
                if (zArr != null) {
                    return zArr;
                }
                boolean[] a = C13938g.m59885a(-2070638983844511444L, "com/instabug/chat/ui/chat/ImageAttachmentViewerFragment$1", 20);
                f25072b = a;
                return a;
            }

            public void onFailed(Throwable th) {
                boolean[] a = m44417a();
                InstabugSDKLogger.m46624e(this, "Asset Entity downloading got error", th);
                a[19] = true;
            }

            public void onSuccess(AssetEntity assetEntity) {
                boolean[] a = m44417a();
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
                    a[4] = true;
                    FileInputStream fileInputStream = new FileInputStream(assetEntity.getFile());
                    a[5] = true;
                    Bitmap decodeStream = BitmapFactory.decodeStream(fileInputStream);
                    C9472g gVar = this.f25073a;
                    a[6] = true;
                    float a2 = C9472g.m44410a(gVar);
                    float b = C9472g.m44412b(this.f25073a);
                    a[7] = true;
                    Bitmap resizeBitmap = BitmapUtils.resizeBitmap(decodeStream, a2, b);
                    if (resizeBitmap != null) {
                        a[8] = true;
                        C9472g.m44413c(this.f25073a).setImageBitmap(resizeBitmap);
                        a[9] = true;
                    } else {
                        Toast makeText = Toast.makeText(this.f25073a.getActivity(), C9371R.string.instabug_str_image_loading_error, 0);
                        a[10] = true;
                        makeText.show();
                        a[11] = true;
                    }
                    if (C9472g.m44414d(this.f25073a).getVisibility() != 0) {
                        a[12] = true;
                    } else {
                        a[13] = true;
                        C9472g.m44414d(this.f25073a).setVisibility(8);
                        a[14] = true;
                    }
                    a[15] = true;
                } catch (FileNotFoundException e) {
                    a[16] = true;
                    InstabugSDKLogger.m46624e(this, "Asset Entity downloading got FileNotFoundException error", e);
                    a[17] = true;
                }
                a[18] = true;
            }
        }

        public C9472g() {
            m44415d()[0] = true;
        }

        /* renamed from: a */
        static /* synthetic */ float m44410a(C9472g gVar) {
            boolean[] d = m44415d();
            float f = gVar.f25068O;
            d[38] = true;
            return f;
        }

        /* renamed from: b */
        static /* synthetic */ float m44412b(C9472g gVar) {
            boolean[] d = m44415d();
            float f = gVar.f25069P;
            d[39] = true;
            return f;
        }

        /* renamed from: c */
        static /* synthetic */ ScaleImageView m44413c(C9472g gVar) {
            boolean[] d = m44415d();
            ScaleImageView scaleImageView = gVar.f25067N;
            d[40] = true;
            return scaleImageView;
        }

        /* renamed from: d */
        static /* synthetic */ ProgressBar m44414d(C9472g gVar) {
            boolean[] d = m44415d();
            ProgressBar progressBar = gVar.f25071b;
            d[41] = true;
            return progressBar;
        }

        /* renamed from: d */
        private static /* synthetic */ boolean[] m44415d() {
            boolean[] zArr = f25066Q;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(-6880081881820225128L, "com/instabug/chat/ui/chat/ImageAttachmentViewerFragment", 42);
            f25066Q = a;
            return a;
        }

        public void onCreate(Bundle bundle) {
            boolean[] d = m44415d();
            super.onCreate(bundle);
            d[5] = true;
            String str = "img_url";
            if (getArguments() != null) {
                d[6] = true;
                this.f25070a = getArguments().getString(str);
                d[7] = true;
                return;
            }
            if (bundle == null) {
                d[8] = true;
            } else {
                d[9] = true;
                this.f25070a = bundle.getString(str);
                d[10] = true;
            }
            d[11] = true;
        }

        @C0195i0
        public android.view.View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
            boolean[] d = m44415d();
            android.view.View inflate = layoutInflater.inflate(C9371R.layout.instabug_fragment_image_attachment_viewer, viewGroup, false);
            d[14] = true;
            this.f25071b = (ProgressBar) inflate.findViewById(C9371R.C9375id.instabug_attachment_progress_bar);
            d[15] = true;
            this.f25067N = (ScaleImageView) inflate.findViewById(C9371R.C9375id.instabug_img_attachment);
            d[16] = true;
            if (InstabugCore.getFeatureState(Feature.WHITE_LABELING) != State.DISABLED) {
                d[17] = true;
            } else {
                d[18] = true;
                getActivity().findViewById(C9371R.C9375id.instabug_pbi_footer).setVisibility(8);
                d[19] = true;
            }
            d[20] = true;
            return inflate;
        }

        public void onDestroyView() {
            boolean[] d = m44415d();
            super.onDestroyView();
            d[33] = true;
            if (InstabugCore.getFeatureState(Feature.WHITE_LABELING) != State.DISABLED) {
                d[34] = true;
            } else {
                d[35] = true;
                getActivity().findViewById(C9371R.C9375id.instabug_pbi_footer).setVisibility(0);
                d[36] = true;
            }
            d[37] = true;
        }

        public void onSaveInstanceState(Bundle bundle) {
            boolean[] d = m44415d();
            super.onSaveInstanceState(bundle);
            d[12] = true;
            bundle.putString("img_url", this.f25070a);
            d[13] = true;
        }

        public void onViewCreated(android.view.View view, @C0195i0 Bundle bundle) {
            boolean[] d = m44415d();
            super.onViewCreated(view, bundle);
            d[21] = true;
            DisplayMetrics displayMetrics = new DisplayMetrics();
            d[22] = true;
            getActivity().getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
            d[23] = true;
            this.f25068O = (float) (displayMetrics.widthPixels - ((int) mo34126a(24.0f, getActivity())));
            d[24] = true;
            this.f25069P = (float) (displayMetrics.heightPixels - ((int) mo34126a(24.0f, getActivity())));
            d[25] = true;
            if (URLUtil.isValidUrl(this.f25070a)) {
                d[26] = true;
                AssetEntity createEmptyEntity = AssetsCacheManager.createEmptyEntity(getActivity(), this.f25070a, AssetType.IMAGE);
                d[27] = true;
                AssetsCacheManager.getAssetEntity(getActivity(), createEmptyEntity, new C9473a(this));
                d[28] = true;
            } else {
                BitmapUtils.loadBitmap(this.f25070a, this.f25067N, this.f25068O, this.f25069P);
                d[29] = true;
            }
            d[30] = true;
        }

        /* renamed from: a */
        public static C9472g m44411a(String str) {
            boolean[] d = m44415d();
            C9472g gVar = new C9472g();
            d[1] = true;
            Bundle bundle = new Bundle();
            d[2] = true;
            bundle.putString("img_url", str);
            d[3] = true;
            gVar.setArguments(bundle);
            d[4] = true;
            return gVar;
        }

        /* renamed from: a */
        public float mo34126a(float f, Context context) {
            boolean[] d = m44415d();
            Resources resources = context.getResources();
            d[31] = true;
            float f2 = f * (((float) resources.getDisplayMetrics().densityDpi) / 160.0f);
            d[32] = true;
            return f2;
        }
    }

    /* renamed from: com.instabug.chat.ui.c$h */
    /* compiled from: MessagesListAdapter */
    public class C9474h extends BaseAdapter {

        /* renamed from: S */
        private static transient /* synthetic */ boolean[] f25074S;

        /* renamed from: N */
        private ColorFilter f25075N;

        /* renamed from: O */
        private Context f25076O;

        /* renamed from: P */
        private ListView f25077P;

        /* renamed from: Q */
        private C9484i f25078Q;

        /* renamed from: R */
        private boolean f25079R = true;

        /* renamed from: a */
        private final AudioPlayer f25080a;

        /* renamed from: b */
        private List<C9420a> f25081b;

        /* renamed from: com.instabug.chat.ui.c$h$a */
        /* compiled from: MessagesListAdapter */
        class C9475a implements OnClickListener {

            /* renamed from: N */
            private static transient /* synthetic */ boolean[] f25082N;

            /* renamed from: a */
            final /* synthetic */ C9423b f25083a;

            /* renamed from: b */
            final /* synthetic */ C9474h f25084b;

            C9475a(C9474h hVar, C9423b bVar) {
                boolean[] a = m44434a();
                this.f25084b = hVar;
                this.f25083a = bVar;
                a[0] = true;
            }

            /* renamed from: a */
            private static /* synthetic */ boolean[] m44434a() {
                boolean[] zArr = f25082N;
                if (zArr != null) {
                    return zArr;
                }
                boolean[] a = C13938g.m59885a(9055268970654115803L, "com/instabug/chat/ui/chat/MessagesListAdapter$1", 2);
                f25082N = a;
                return a;
            }

            public void onClick(android.view.View view) {
                boolean[] a = m44434a();
                C9474h.m44418a(this.f25084b).mo34110d(this.f25083a.mo33961c());
                a[1] = true;
            }
        }

        /* renamed from: com.instabug.chat.ui.c$h$b */
        /* compiled from: MessagesListAdapter */
        class C9476b implements OnClickListener {

            /* renamed from: N */
            private static transient /* synthetic */ boolean[] f25085N;

            /* renamed from: a */
            final /* synthetic */ C9420a f25086a;

            /* renamed from: b */
            final /* synthetic */ C9474h f25087b;

            C9476b(C9474h hVar, C9420a aVar) {
                boolean[] a = m44435a();
                this.f25087b = hVar;
                this.f25086a = aVar;
                a[0] = true;
            }

            /* renamed from: a */
            private static /* synthetic */ boolean[] m44435a() {
                boolean[] zArr = f25085N;
                if (zArr != null) {
                    return zArr;
                }
                boolean[] a = C13938g.m59885a(-6000192823397642312L, "com/instabug/chat/ui/chat/MessagesListAdapter$2", 7);
                f25085N = a;
                return a;
            }

            public void onClick(android.view.View view) {
                boolean[] a = m44435a();
                if (C9474h.m44418a(this.f25087b) == null) {
                    a[1] = true;
                } else {
                    a[2] = true;
                    if (this.f25086a.mo33951h() != null) {
                        a[3] = true;
                        C9474h.m44418a(this.f25087b).mo34109c(this.f25086a.mo33951h());
                        a[4] = true;
                    } else {
                        C9474h.m44418a(this.f25087b).mo34109c(this.f25086a.mo33947d());
                        a[5] = true;
                    }
                }
                a[6] = true;
            }
        }

        /* renamed from: com.instabug.chat.ui.c$h$c */
        /* compiled from: MessagesListAdapter */
        class C9477c implements OnClickListener {

            /* renamed from: P */
            private static transient /* synthetic */ boolean[] f25088P;

            /* renamed from: N */
            final /* synthetic */ C9485j f25089N;

            /* renamed from: O */
            final /* synthetic */ C9474h f25090O;

            /* renamed from: a */
            final /* synthetic */ C9420a f25091a;

            /* renamed from: b */
            final /* synthetic */ String f25092b;

            C9477c(C9474h hVar, C9420a aVar, String str, C9485j jVar) {
                boolean[] a = m44436a();
                this.f25090O = hVar;
                this.f25091a = aVar;
                this.f25092b = str;
                this.f25089N = jVar;
                a[0] = true;
            }

            /* renamed from: a */
            private static /* synthetic */ boolean[] m44436a() {
                boolean[] zArr = f25088P;
                if (zArr != null) {
                    return zArr;
                }
                boolean[] a = C13938g.m59885a(1281242796357273688L, "com/instabug/chat/ui/chat/MessagesListAdapter$3", 9);
                f25088P = a;
                return a;
            }

            public void onClick(android.view.View view) {
                boolean[] a = m44436a();
                if (this.f25091a.mo33949f() == C9421a.NONE) {
                    a[1] = true;
                    C9474h.m44424b(this.f25090O).start(this.f25092b);
                    a[2] = true;
                    this.f25091a.mo33935a(C9421a.PLAYING);
                    a[3] = true;
                    this.f25089N.f25118f.setImageResource(C9371R.C9374drawable.instabug_ic_pause);
                    a[4] = true;
                } else {
                    C9474h.m44424b(this.f25090O).pause();
                    a[5] = true;
                    this.f25091a.mo33935a(C9421a.NONE);
                    a[6] = true;
                    this.f25089N.f25118f.setImageResource(C9371R.C9374drawable.instabug_ic_play);
                    a[7] = true;
                }
                a[8] = true;
            }
        }

        /* renamed from: com.instabug.chat.ui.c$h$d */
        /* compiled from: MessagesListAdapter */
        class C9478d extends OnStopListener {

            /* renamed from: d */
            private static transient /* synthetic */ boolean[] f25093d;

            /* renamed from: a */
            final /* synthetic */ C9420a f25094a;

            /* renamed from: b */
            final /* synthetic */ C9485j f25095b;

            /* renamed from: c */
            final /* synthetic */ C9474h f25096c;

            C9478d(C9474h hVar, String str, C9420a aVar, C9485j jVar) {
                boolean[] a = m44437a();
                this.f25096c = hVar;
                this.f25094a = aVar;
                this.f25095b = jVar;
                super(str);
                a[0] = true;
            }

            /* renamed from: a */
            private static /* synthetic */ boolean[] m44437a() {
                boolean[] zArr = f25093d;
                if (zArr != null) {
                    return zArr;
                }
                boolean[] a = C13938g.m59885a(4716113758375096035L, "com/instabug/chat/ui/chat/MessagesListAdapter$4", 3);
                f25093d = a;
                return a;
            }

            public void onStop() {
                boolean[] a = m44437a();
                this.f25094a.mo33935a(C9421a.NONE);
                a[1] = true;
                this.f25095b.f25118f.setImageResource(C9371R.C9374drawable.instabug_ic_play);
                a[2] = true;
            }
        }

        /* renamed from: com.instabug.chat.ui.c$h$e */
        /* compiled from: MessagesListAdapter */
        class C9479e implements OnClickListener {

            /* renamed from: N */
            private static transient /* synthetic */ boolean[] f25097N;

            /* renamed from: a */
            final /* synthetic */ C9420a f25098a;

            /* renamed from: b */
            final /* synthetic */ C9474h f25099b;

            C9479e(C9474h hVar, C9420a aVar) {
                boolean[] a = m44438a();
                this.f25099b = hVar;
                this.f25098a = aVar;
                a[0] = true;
            }

            /* renamed from: a */
            private static /* synthetic */ boolean[] m44438a() {
                boolean[] zArr = f25097N;
                if (zArr != null) {
                    return zArr;
                }
                boolean[] a = C13938g.m59885a(1601098381277978388L, "com/instabug/chat/ui/chat/MessagesListAdapter$5", 5);
                f25097N = a;
                return a;
            }

            public void onClick(android.view.View view) {
                boolean[] a = m44438a();
                if (C9474h.m44418a(this.f25099b) == null) {
                    a[1] = true;
                } else {
                    a[2] = true;
                    C9474h.m44418a(this.f25099b).mo34108b(this.f25098a.mo33951h());
                    a[3] = true;
                }
                a[4] = true;
            }
        }

        /* renamed from: com.instabug.chat.ui.c$h$f */
        /* compiled from: MessagesListAdapter */
        class C9480f implements OnDownloadFinished {

            /* renamed from: c */
            private static transient /* synthetic */ boolean[] f25100c;

            /* renamed from: a */
            final /* synthetic */ C9485j f25101a;

            /* renamed from: b */
            final /* synthetic */ C9474h f25102b;

            /* renamed from: com.instabug.chat.ui.c$h$f$a */
            /* compiled from: MessagesListAdapter */
            class C9481a implements OnClickListener {

                /* renamed from: N */
                private static transient /* synthetic */ boolean[] f25103N;

                /* renamed from: a */
                final /* synthetic */ AssetEntity f25104a;

                /* renamed from: b */
                final /* synthetic */ C9480f f25105b;

                C9481a(C9480f fVar, AssetEntity assetEntity) {
                    boolean[] a = m44440a();
                    this.f25105b = fVar;
                    this.f25104a = assetEntity;
                    a[0] = true;
                }

                /* renamed from: a */
                private static /* synthetic */ boolean[] m44440a() {
                    boolean[] zArr = f25103N;
                    if (zArr != null) {
                        return zArr;
                    }
                    boolean[] a = C13938g.m59885a(5734786526728400489L, "com/instabug/chat/ui/chat/MessagesListAdapter$6$1", 2);
                    f25103N = a;
                    return a;
                }

                public void onClick(android.view.View view) {
                    boolean[] a = m44440a();
                    C9474h.m44418a(this.f25105b.f25102b).mo34108b(this.f25104a.getFile().getPath());
                    a[1] = true;
                }
            }

            C9480f(C9474h hVar, C9485j jVar) {
                boolean[] a = m44439a();
                this.f25102b = hVar;
                this.f25101a = jVar;
                a[0] = true;
            }

            /* renamed from: a */
            private static /* synthetic */ boolean[] m44439a() {
                boolean[] zArr = f25100c;
                if (zArr != null) {
                    return zArr;
                }
                boolean[] a = C13938g.m59885a(809095168231802358L, "com/instabug/chat/ui/chat/MessagesListAdapter$6", 10);
                f25100c = a;
                return a;
            }

            public void onFailed(Throwable th) {
                boolean[] a = m44439a();
                InstabugSDKLogger.m46624e(this, "Asset Entity downloading got error", th);
                a[9] = true;
            }

            public void onSuccess(AssetEntity assetEntity) {
                boolean[] a = m44439a();
                StringBuilder sb = new StringBuilder();
                sb.append("Asset Entity downloaded: ");
                File file = assetEntity.getFile();
                a[1] = true;
                sb.append(file.getPath());
                String sb2 = sb.toString();
                a[2] = true;
                InstabugSDKLogger.m46622d(this, sb2);
                a[3] = true;
                this.f25101a.f25123k.setVisibility(8);
                a[4] = true;
                this.f25101a.f25120h.setVisibility(0);
                a[5] = true;
                Bitmap extractFirstVideoFrame = VideoManipulationUtils.extractFirstVideoFrame(assetEntity.getFile().getPath());
                a[6] = true;
                this.f25101a.f25121i.setImageBitmap(extractFirstVideoFrame);
                a[7] = true;
                this.f25101a.f25122j.setOnClickListener(new C9481a(this, assetEntity));
                a[8] = true;
            }
        }

        /* renamed from: com.instabug.chat.ui.c$h$g */
        /* compiled from: MessagesListAdapter */
        class C9482g implements OnDownloadFinished {

            /* renamed from: d */
            private static transient /* synthetic */ boolean[] f25106d;

            /* renamed from: a */
            final /* synthetic */ ImageView f25107a;

            /* renamed from: b */
            final /* synthetic */ boolean f25108b;

            /* renamed from: c */
            final /* synthetic */ C9474h f25109c;

            C9482g(C9474h hVar, ImageView imageView, boolean z) {
                boolean[] a = m44441a();
                this.f25109c = hVar;
                this.f25107a = imageView;
                this.f25108b = z;
                a[0] = true;
            }

            /* renamed from: a */
            private static /* synthetic */ boolean[] m44441a() {
                boolean[] zArr = f25106d;
                if (zArr != null) {
                    return zArr;
                }
                boolean[] a = C13938g.m59885a(8162904356852382967L, "com/instabug/chat/ui/chat/MessagesListAdapter$7", 17);
                f25106d = a;
                return a;
            }

            public void onFailed(Throwable th) {
                boolean[] a = m44441a();
                InstabugSDKLogger.m46624e(this, "Asset Entity downloading got error", th);
                a[16] = true;
            }

            public void onSuccess(AssetEntity assetEntity) {
                boolean[] a = m44441a();
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
                    ImageView imageView = this.f25107a;
                    a[4] = true;
                    FileInputStream fileInputStream = new FileInputStream(assetEntity.getFile());
                    a[5] = true;
                    imageView.setImageBitmap(BitmapFactory.decodeStream(fileInputStream));
                    a[6] = true;
                    if (!this.f25108b) {
                        a[7] = true;
                    } else if (!C9474h.m44427c(this.f25109c)) {
                        a[8] = true;
                    } else {
                        a[9] = true;
                        C9474h.m44428d(this.f25109c).setSelection(this.f25109c.getCount() - 1);
                        a[10] = true;
                        C9474h.m44422a(this.f25109c, false);
                        a[11] = true;
                    }
                    a[12] = true;
                } catch (FileNotFoundException e) {
                    a[13] = true;
                    InstabugSDKLogger.m46624e(this, "Asset Entity downloading got FileNotFoundException error", e);
                    a[14] = true;
                }
                a[15] = true;
            }
        }

        /* renamed from: com.instabug.chat.ui.c$h$h */
        /* compiled from: MessagesListAdapter */
        static /* synthetic */ class C9483h {

            /* renamed from: a */
            static final /* synthetic */ int[] f25110a = new int[C9422b.values().length];

            /* renamed from: b */
            private static transient /* synthetic */ boolean[] f25111b;

            /* JADX WARNING: Can't wrap try/catch for region: R(2:4|5) */
            /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
                r0[6] = true;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:18:0x0051, code lost:
                r0[8] = true;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:5:?, code lost:
                r0[2] = true;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:9:?, code lost:
                r0[4] = true;
             */
            /* JADX WARNING: Failed to process nested try/catch */
            /* JADX WARNING: Missing exception handler attribute for start block: B:4:0x0021 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x0030 */
            static {
                /*
                    boolean[] r0 = m44442a()
                    com.instabug.chat.model.a$b[] r1 = com.instabug.chat.model.C9420a.C9422b.values()
                    int r1 = r1.length
                    int[] r1 = new int[r1]
                    f25110a = r1
                    r1 = 0
                    r2 = 3
                    r3 = 4
                    r4 = 2
                    r5 = 1
                    r0[r1] = r5     // Catch:{ NoSuchFieldError -> 0x0021 }
                    int[] r1 = f25110a     // Catch:{ NoSuchFieldError -> 0x0021 }
                    com.instabug.chat.model.a$b r6 = com.instabug.chat.model.C9420a.C9422b.MESSAGE     // Catch:{ NoSuchFieldError -> 0x0021 }
                    int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x0021 }
                    r1[r6] = r5     // Catch:{ NoSuchFieldError -> 0x0021 }
                    r0[r5] = r5
                    goto L_0x0023
                L_0x0021:
                    r0[r4] = r5     // Catch:{ NoSuchFieldError -> 0x0030 }
                L_0x0023:
                    int[] r1 = f25110a     // Catch:{ NoSuchFieldError -> 0x0030 }
                    com.instabug.chat.model.a$b r6 = com.instabug.chat.model.C9420a.C9422b.IMAGE     // Catch:{ NoSuchFieldError -> 0x0030 }
                    int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x0030 }
                    r1[r6] = r4     // Catch:{ NoSuchFieldError -> 0x0030 }
                    r0[r2] = r5
                    goto L_0x0032
                L_0x0030:
                    r0[r3] = r5     // Catch:{ NoSuchFieldError -> 0x0040 }
                L_0x0032:
                    int[] r1 = f25110a     // Catch:{ NoSuchFieldError -> 0x0040 }
                    com.instabug.chat.model.a$b r4 = com.instabug.chat.model.C9420a.C9422b.AUDIO     // Catch:{ NoSuchFieldError -> 0x0040 }
                    int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0040 }
                    r1[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0040 }
                    r1 = 5
                    r0[r1] = r5
                    goto L_0x0043
                L_0x0040:
                    r1 = 6
                    r0[r1] = r5     // Catch:{ NoSuchFieldError -> 0x0051 }
                L_0x0043:
                    int[] r1 = f25110a     // Catch:{ NoSuchFieldError -> 0x0051 }
                    com.instabug.chat.model.a$b r2 = com.instabug.chat.model.C9420a.C9422b.VIDEO     // Catch:{ NoSuchFieldError -> 0x0051 }
                    int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0051 }
                    r1[r2] = r3     // Catch:{ NoSuchFieldError -> 0x0051 }
                    r1 = 7
                    r0[r1] = r5
                    goto L_0x0055
                L_0x0051:
                    r1 = 8
                    r0[r1] = r5
                L_0x0055:
                    r1 = 9
                    r0[r1] = r5
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.instabug.chat.p361ui.C9457c.C9474h.C9483h.<clinit>():void");
            }

            /* renamed from: a */
            private static /* synthetic */ boolean[] m44442a() {
                boolean[] zArr = f25111b;
                if (zArr != null) {
                    return zArr;
                }
                boolean[] a = C13938g.m59885a(7452108794039825909L, "com/instabug/chat/ui/chat/MessagesListAdapter$8", 10);
                f25111b = a;
                return a;
            }
        }

        /* renamed from: com.instabug.chat.ui.c$h$i */
        /* compiled from: MessagesListAdapter */
        public interface C9484i {
            /* renamed from: b */
            void mo34108b(String str);

            /* renamed from: c */
            void mo34109c(String str);

            /* renamed from: d */
            void mo34110d(String str);
        }

        /* renamed from: com.instabug.chat.ui.c$h$j */
        /* compiled from: MessagesListAdapter */
        public static class C9485j {

            /* renamed from: m */
            private static transient /* synthetic */ boolean[] f25112m;

            /* renamed from: a */
            public CircularImageView f25113a;

            /* renamed from: b */
            public TextView f25114b;

            /* renamed from: c */
            public TextView f25115c;

            /* renamed from: d */
            public ImageView f25116d;

            /* renamed from: e */
            public FrameLayout f25117e;

            /* renamed from: f */
            public ImageView f25118f;

            /* renamed from: g */
            public ProgressBar f25119g;

            /* renamed from: h */
            public ImageView f25120h;

            /* renamed from: i */
            public ImageView f25121i;

            /* renamed from: j */
            public FrameLayout f25122j;

            /* renamed from: k */
            public ProgressBar f25123k;

            /* renamed from: l */
            public LinearLayout f25124l;

            public C9485j(android.view.View view) {
                boolean[] a = m44446a();
                a[0] = true;
                this.f25113a = (CircularImageView) view.findViewById(C9371R.C9375id.instabug_img_message_sender);
                a[1] = true;
                this.f25114b = (TextView) view.findViewById(C9371R.C9375id.instabug_txt_message_time);
                a[2] = true;
                this.f25115c = (TextView) view.findViewById(C9371R.C9375id.instabug_txt_message_body);
                a[3] = true;
                this.f25116d = (ImageView) view.findViewById(C9371R.C9375id.instabug_img_attachment);
                a[4] = true;
                this.f25118f = (ImageView) view.findViewById(C9371R.C9375id.instabug_btn_play_audio);
                a[5] = true;
                this.f25117e = (FrameLayout) view.findViewById(C9371R.C9375id.instabug_audio_attachment);
                a[6] = true;
                this.f25119g = (ProgressBar) view.findViewById(C9371R.C9375id.instabug_audio_attachment_progress_bar);
                a[7] = true;
                this.f25121i = (ImageView) view.findViewById(C9371R.C9375id.instabug_img_video_attachment);
                a[8] = true;
                this.f25120h = (ImageView) view.findViewById(C9371R.C9375id.instabug_btn_play_video);
                a[9] = true;
                this.f25122j = (FrameLayout) view.findViewById(C9371R.C9375id.instabug_video_attachment);
                a[10] = true;
                this.f25123k = (ProgressBar) view.findViewById(C9371R.C9375id.instabug_video_attachment_progress_bar);
                a[11] = true;
                this.f25124l = (LinearLayout) view.findViewById(C9371R.C9375id.instabug_message_actions_container);
                a[12] = true;
            }

            /* renamed from: a */
            private static /* synthetic */ boolean[] m44446a() {
                boolean[] zArr = f25112m;
                if (zArr != null) {
                    return zArr;
                }
                boolean[] a = C13938g.m59885a(9096591505589901658L, "com/instabug/chat/ui/chat/MessagesListAdapter$ViewHolder", 13);
                f25112m = a;
                return a;
            }
        }

        public C9474h(List<C9420a> list, Context context, ListView listView, C9484i iVar) {
            boolean[] a = m44423a();
            this.f25081b = list;
            this.f25077P = listView;
            this.f25076O = context;
            this.f25078Q = iVar;
            a[0] = true;
            this.f25080a = new AudioPlayer();
            a[1] = true;
            this.f25075N = new PorterDuffColorFilter(InstabugCore.getPrimaryColor(), Mode.SRC_IN);
            a[2] = true;
        }

        /* renamed from: a */
        static /* synthetic */ C9484i m44418a(C9474h hVar) {
            boolean[] a = m44423a();
            C9484i iVar = hVar.f25078Q;
            a[186] = true;
            return iVar;
        }

        /* renamed from: a */
        private static /* synthetic */ boolean[] m44423a() {
            boolean[] zArr = f25074S;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(2573478106471359574L, "com/instabug/chat/ui/chat/MessagesListAdapter", C13959t.f40878b3);
            f25074S = a;
            return a;
        }

        /* renamed from: b */
        static /* synthetic */ AudioPlayer m44424b(C9474h hVar) {
            boolean[] a = m44423a();
            AudioPlayer audioPlayer = hVar.f25080a;
            a[187] = true;
            return audioPlayer;
        }

        /* renamed from: c */
        static /* synthetic */ boolean m44427c(C9474h hVar) {
            boolean[] a = m44423a();
            boolean z = hVar.f25079R;
            a[188] = true;
            return z;
        }

        /* renamed from: d */
        static /* synthetic */ ListView m44428d(C9474h hVar) {
            boolean[] a = m44423a();
            ListView listView = hVar.f25077P;
            a[189] = true;
            return listView;
        }

        /* renamed from: e */
        private void m44430e(C9420a aVar, C9485j jVar) {
            boolean[] a = m44423a();
            InstabugSDKLogger.m46622d(this, "Video path not found but main screenshot found, using it");
            a[153] = true;
            StringBuilder sb = new StringBuilder();
            sb.append("Video Encoded: ");
            sb.append(aVar.mo33954k());
            InstabugSDKLogger.m46622d(this, sb.toString());
            a[154] = true;
            if (!aVar.mo33954k()) {
                a[155] = true;
            } else {
                a[156] = true;
                jVar.f25123k.setVisibility(8);
                a[157] = true;
                jVar.f25120h.setVisibility(0);
                a[158] = true;
                jVar.f25122j.setOnClickListener(new C9479e(this, aVar));
                try {
                    a[159] = true;
                } catch (RuntimeException e) {
                    a[166] = true;
                    InstabugSDKLogger.m46624e(this, e.getMessage(), e);
                    a[167] = true;
                }
            }
            a[160] = true;
            String h = aVar.mo33951h();
            a[161] = true;
            Bitmap extractFirstVideoFrame = VideoManipulationUtils.extractFirstVideoFrame(h);
            if (extractFirstVideoFrame == null) {
                a[162] = true;
            } else {
                a[163] = true;
                jVar.f25121i.setImageBitmap(extractFirstVideoFrame);
                a[164] = true;
            }
            a[165] = true;
            a[168] = true;
        }

        /* renamed from: f */
        private void m44431f(C9420a aVar, C9485j jVar) {
            boolean[] a = m44423a();
            Context context = this.f25076O;
            a[169] = true;
            String d = aVar.mo33947d();
            AssetType assetType = AssetType.VIDEO;
            a[170] = true;
            AssetEntity createEmptyEntity = AssetsCacheManager.createEmptyEntity(context, d, assetType);
            a[171] = true;
            AssetsCacheManager.getAssetEntity(this.f25076O, createEmptyEntity, new C9480f(this, jVar));
            a[172] = true;
        }

        public int getCount() {
            boolean[] a = m44423a();
            int size = this.f25081b.size();
            a[4] = true;
            return size;
        }

        public /* synthetic */ Object getItem(int i) {
            boolean[] a = m44423a();
            C9420a a2 = mo34127a(i);
            a[185] = true;
            return a2;
        }

        public long getItemId(int i) {
            long j = (long) i;
            m44423a()[20] = true;
            return j;
        }

        public int getItemViewType(int i) {
            int i2;
            boolean[] a = m44423a();
            C9420a a2 = mo34127a(i);
            int i3 = 5;
            a[5] = true;
            int i4 = C9483h.f25110a[a2.mo33948e().ordinal()];
            int i5 = 6;
            if (i4 != 1) {
                int i6 = 3;
                if (i4 == 2) {
                    if (a2.mo33950g()) {
                        a[9] = true;
                        i6 = 2;
                    } else {
                        a[10] = true;
                    }
                    a[11] = true;
                    return i6;
                } else if (i4 == 3) {
                    if (a2.mo33950g()) {
                        a[12] = true;
                        i3 = 4;
                    } else {
                        a[13] = true;
                    }
                    a[14] = true;
                    return i3;
                } else if (i4 != 4) {
                    a[18] = true;
                    return -1;
                } else {
                    if (a2.mo33950g()) {
                        a[15] = true;
                    } else {
                        a[16] = true;
                        i5 = 7;
                    }
                    a[17] = true;
                    return i5;
                }
            } else {
                if (a2.mo33950g()) {
                    i2 = 0;
                    a[6] = true;
                } else {
                    a[7] = true;
                    i2 = 1;
                }
                a[8] = true;
                return i2;
            }
        }

        public android.view.View getView(int i, android.view.View view, ViewGroup viewGroup) {
            C9485j jVar;
            boolean[] a = m44423a();
            int itemViewType = getItemViewType(i);
            if (view == null) {
                switch (itemViewType) {
                    case 0:
                        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
                        int i2 = C9371R.layout.instabug_message_list_item_me;
                        a[21] = true;
                        view = from.inflate(i2, viewGroup, false);
                        a[22] = true;
                        break;
                    case 1:
                        LayoutInflater from2 = LayoutInflater.from(viewGroup.getContext());
                        int i3 = C9371R.layout.instabug_message_list_item;
                        a[23] = true;
                        view = from2.inflate(i3, viewGroup, false);
                        a[24] = true;
                        break;
                    case 2:
                        LayoutInflater from3 = LayoutInflater.from(viewGroup.getContext());
                        int i4 = C9371R.layout.instabug_message_list_item_img_me;
                        a[25] = true;
                        view = from3.inflate(i4, viewGroup, false);
                        a[26] = true;
                        break;
                    case 3:
                        LayoutInflater from4 = LayoutInflater.from(viewGroup.getContext());
                        int i5 = C9371R.layout.instabug_message_list_item_img;
                        a[27] = true;
                        view = from4.inflate(i5, viewGroup, false);
                        a[28] = true;
                        break;
                    case 4:
                        LayoutInflater from5 = LayoutInflater.from(viewGroup.getContext());
                        int i6 = C9371R.layout.instabug_message_list_item_voice_me;
                        a[29] = true;
                        view = from5.inflate(i6, viewGroup, false);
                        a[30] = true;
                        break;
                    case 5:
                        LayoutInflater from6 = LayoutInflater.from(viewGroup.getContext());
                        int i7 = C9371R.layout.instabug_message_list_item_voice;
                        a[31] = true;
                        view = from6.inflate(i7, viewGroup, false);
                        a[32] = true;
                        break;
                    case 6:
                        LayoutInflater from7 = LayoutInflater.from(viewGroup.getContext());
                        int i8 = C9371R.layout.instabug_message_list_item_video_me;
                        a[33] = true;
                        view = from7.inflate(i8, viewGroup, false);
                        a[34] = true;
                        break;
                    case 7:
                        LayoutInflater from8 = LayoutInflater.from(viewGroup.getContext());
                        int i9 = C9371R.layout.instabug_message_list_item_video;
                        a[35] = true;
                        view = from8.inflate(i9, viewGroup, false);
                        a[36] = true;
                        break;
                    default:
                        LayoutInflater from9 = LayoutInflater.from(viewGroup.getContext());
                        int i10 = C9371R.layout.instabug_message_list_item_me;
                        a[37] = true;
                        view = from9.inflate(i10, viewGroup, false);
                        a[38] = true;
                        break;
                }
                jVar = new C9485j(view);
                a[39] = true;
                view.setTag(jVar);
                a[40] = true;
            } else {
                jVar = (C9485j) view.getTag();
                try {
                    a[41] = true;
                } catch (ParseException e) {
                    a[43] = true;
                    e.printStackTrace();
                    a[44] = true;
                }
            }
            m44420a(jVar, mo34127a(i));
            a[42] = true;
            a[45] = true;
            return view;
        }

        public int getViewTypeCount() {
            m44423a()[3] = true;
            return 8;
        }

        /* renamed from: a */
        static /* synthetic */ boolean m44422a(C9474h hVar, boolean z) {
            boolean[] a = m44423a();
            hVar.f25079R = z;
            a[190] = true;
            return z;
        }

        /* renamed from: b */
        private void m44425b(C9420a aVar, C9485j jVar) {
            boolean[] a = m44423a();
            if (aVar.mo33951h() != null) {
                a[132] = true;
                BitmapUtils.loadBitmap(aVar.mo33951h(), jVar.f25116d);
                a[133] = true;
            } else {
                m44421a(aVar.mo33947d(), jVar.f25116d, true);
                a[134] = true;
            }
            jVar.f25116d.setOnClickListener(new C9476b(this, aVar));
            a[135] = true;
        }

        /* renamed from: c */
        private void m44426c(C9420a aVar, C9485j jVar) {
            String str;
            boolean[] a = m44423a();
            if (aVar.mo33947d() != null) {
                a[136] = true;
                str = aVar.mo33947d();
                a[137] = true;
            } else {
                str = aVar.mo33951h();
                a[138] = true;
            }
            ProgressBar progressBar = jVar.f25119g;
            if (progressBar == null) {
                a[139] = true;
            } else {
                a[140] = true;
                if (progressBar.getVisibility() != 0) {
                    a[141] = true;
                } else {
                    a[142] = true;
                    jVar.f25119g.setVisibility(8);
                    a[143] = true;
                }
            }
            if (jVar.f25118f.getVisibility() != 8) {
                a[144] = true;
            } else {
                a[145] = true;
                jVar.f25118f.setVisibility(0);
                a[146] = true;
            }
            jVar.f25117e.setOnClickListener(new C9477c(this, aVar, str, jVar));
            a[147] = true;
            this.f25080a.addOnStopListener(new C9478d(this, str, aVar, jVar));
            a[148] = true;
        }

        /* renamed from: d */
        private void m44429d(C9420a aVar, C9485j jVar) {
            boolean[] a = m44423a();
            if (aVar.mo33951h() != null) {
                a[149] = true;
                m44430e(aVar, jVar);
                a[150] = true;
            } else {
                m44431f(aVar, jVar);
                a[151] = true;
            }
            a[152] = true;
        }

        /* renamed from: a */
        public C9420a mo34127a(int i) {
            C9420a aVar = (C9420a) this.f25081b.get(i);
            m44423a()[19] = true;
            return aVar;
        }

        /* renamed from: a */
        private void m44420a(C9485j jVar, C9420a aVar) throws ParseException {
            boolean z;
            boolean z2;
            boolean[] a = m44423a();
            if (jVar == null) {
                a[46] = true;
                return;
            }
            StringBuilder sb = new StringBuilder();
            String str = "viewholder: ";
            sb.append(str);
            if (jVar == null) {
                a[47] = true;
                z = true;
            } else {
                a[48] = true;
                z = false;
            }
            sb.append(z);
            String str2 = ", type:";
            sb.append(str2);
            a[49] = true;
            sb.append(aVar.mo33948e());
            String sb2 = sb.toString();
            a[50] = true;
            InstabugSDKLogger.m46626v(this, sb2);
            a[51] = true;
            int i = C9483h.f25110a[aVar.mo33948e().ordinal()];
            if (i == 1) {
                if (aVar.mo33950g()) {
                    TextView textView = jVar.f25115c;
                    a[53] = true;
                    Drawable primaryColorTintedDrawable = Colorizer.getPrimaryColorTintedDrawable(textView.getBackground());
                    TextView textView2 = jVar.f25115c;
                    a[54] = true;
                    textView2.setBackgroundDrawable(primaryColorTintedDrawable);
                    a[55] = true;
                } else {
                    jVar.f25124l.removeAllViews();
                    a[56] = true;
                    if (!aVar.mo33952i()) {
                        a[57] = true;
                    } else {
                        a[58] = true;
                        m44419a(aVar, jVar);
                        a[59] = true;
                    }
                }
                TextView textView3 = jVar.f25114b;
                a[60] = true;
                String formatMessageDate = InstabugDateFormatter.formatMessageDate(aVar.mo33944c());
                a[61] = true;
                textView3.setText(formatMessageDate);
                a[62] = true;
                jVar.f25115c.setText(aVar.mo33939a());
                if (jVar.f25113a == null) {
                    a[63] = true;
                } else {
                    a[64] = true;
                    m44421a(aVar.mo33943b(), jVar.f25113a, false);
                    a[65] = true;
                }
            } else if (i == 2) {
                if (!aVar.mo33950g()) {
                    a[66] = true;
                } else {
                    ImageView imageView = jVar.f25116d;
                    a[67] = true;
                    Drawable primaryColorTintedDrawable2 = Colorizer.getPrimaryColorTintedDrawable(imageView.getBackground());
                    a[68] = true;
                    jVar.f25116d.setBackgroundDrawable(primaryColorTintedDrawable2);
                    a[69] = true;
                }
                TextView textView4 = jVar.f25114b;
                a[70] = true;
                String formatMessageDate2 = InstabugDateFormatter.formatMessageDate(aVar.mo33944c());
                a[71] = true;
                textView4.setText(formatMessageDate2);
                a[72] = true;
                m44425b(aVar, jVar);
                a[73] = true;
                if (jVar.f25113a == null) {
                    a[74] = true;
                } else if (aVar.mo33943b() == null) {
                    a[75] = true;
                } else {
                    a[76] = true;
                    m44421a(aVar.mo33943b(), jVar.f25113a, false);
                    a[77] = true;
                }
            } else if (i == 3) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str);
                if (jVar == null) {
                    a[78] = true;
                    z2 = true;
                } else {
                    a[79] = true;
                    z2 = false;
                }
                sb3.append(z2);
                sb3.append(str2);
                a[80] = true;
                sb3.append(aVar.mo33948e());
                String sb4 = sb3.toString();
                a[81] = true;
                InstabugSDKLogger.m46623e(this, sb4);
                a[82] = true;
                if (!aVar.mo33950g()) {
                    a[83] = true;
                } else {
                    FrameLayout frameLayout = jVar.f25117e;
                    a[84] = true;
                    Drawable primaryColorTintedDrawable3 = Colorizer.getPrimaryColorTintedDrawable(frameLayout.getBackground());
                    FrameLayout frameLayout2 = jVar.f25117e;
                    a[85] = true;
                    frameLayout2.setBackgroundDrawable(primaryColorTintedDrawable3);
                    a[86] = true;
                    jVar.f25118f.setColorFilter(this.f25075N);
                    a[87] = true;
                }
                TextView textView5 = jVar.f25114b;
                a[88] = true;
                String formatMessageDate3 = InstabugDateFormatter.formatMessageDate(aVar.mo33944c());
                a[89] = true;
                textView5.setText(formatMessageDate3);
                a[90] = true;
                m44426c(aVar, jVar);
                a[91] = true;
                if (jVar.f25113a == null) {
                    a[92] = true;
                } else if (aVar.mo33943b() == null) {
                    a[93] = true;
                } else {
                    a[94] = true;
                    m44421a(aVar.mo33943b(), jVar.f25113a, false);
                    a[95] = true;
                }
            } else if (i != 4) {
                a[52] = true;
            } else {
                if (!aVar.mo33950g()) {
                    a[96] = true;
                } else {
                    ImageView imageView2 = jVar.f25121i;
                    a[97] = true;
                    Drawable primaryColorTintedDrawable4 = Colorizer.getPrimaryColorTintedDrawable(imageView2.getBackground());
                    ImageView imageView3 = jVar.f25121i;
                    a[98] = true;
                    imageView3.setBackgroundDrawable(primaryColorTintedDrawable4);
                    a[99] = true;
                    jVar.f25120h.setColorFilter(this.f25075N);
                    a[100] = true;
                }
                TextView textView6 = jVar.f25114b;
                a[101] = true;
                long c = aVar.mo33944c();
                a[102] = true;
                textView6.setText(InstabugDateFormatter.formatMessageDate(c));
                a[103] = true;
                m44429d(aVar, jVar);
                a[104] = true;
                if (jVar.f25113a == null) {
                    a[105] = true;
                } else if (aVar.mo33947d() == null) {
                    a[106] = true;
                } else {
                    a[107] = true;
                    m44421a(aVar.mo33947d(), jVar.f25113a, false);
                    a[108] = true;
                }
            }
            a[109] = true;
        }

        /* renamed from: a */
        private void m44419a(C9420a aVar, C9485j jVar) {
            boolean[] a = m44423a();
            StringBuilder sb = new StringBuilder();
            sb.append("Binding MessageActions view  FlatMessage = ");
            a[110] = true;
            sb.append(aVar.toString());
            String sb2 = sb.toString();
            a[111] = true;
            InstabugSDKLogger.m46622d(this, sb2);
            a[112] = true;
            ArrayList j = aVar.mo33953j();
            a[113] = true;
            if (j == null) {
                a[114] = true;
            } else if (j.size() <= 0) {
                a[115] = true;
            } else {
                a[116] = true;
                int i = 0;
                a[117] = true;
                while (i < j.size()) {
                    a[119] = true;
                    C9423b bVar = (C9423b) j.get(i);
                    a[120] = true;
                    Button button = new Button(this.f25076O);
                    a[121] = true;
                    button.setLayoutParams(new LayoutParams(-2, -2));
                    a[122] = true;
                    button.setText(bVar.mo33959b());
                    a[123] = true;
                    button.setTextColor(C0841b.m4915a(this.f25076O, 17170443));
                    a[124] = true;
                    button.setBackgroundColor(InstabugCore.getPrimaryColor());
                    a[125] = true;
                    button.setMaxEms(30);
                    a[126] = true;
                    button.setMaxLines(1);
                    a[127] = true;
                    button.setId(i);
                    a[128] = true;
                    button.setOnClickListener(new C9475a(this, bVar));
                    a[129] = true;
                    jVar.f25124l.addView(button);
                    i++;
                    a[130] = true;
                }
                a[118] = true;
            }
            a[131] = true;
        }

        /* renamed from: a */
        private void m44421a(String str, ImageView imageView, boolean z) {
            boolean[] a = m44423a();
            AssetEntity createEmptyEntity = AssetsCacheManager.createEmptyEntity(this.f25076O, str, AssetType.IMAGE);
            a[173] = true;
            AssetsCacheManager.getAssetEntity(this.f25076O, createEmptyEntity, new C9482g(this, imageView, z));
            a[174] = true;
        }

        /* renamed from: a */
        public void mo34128a(List<C9420a> list) {
            boolean[] a = m44423a();
            Iterator it = list.iterator();
            a[176] = true;
            while (it.hasNext()) {
                a[177] = true;
                C9420a aVar = (C9420a) it.next();
                a[178] = true;
                if (aVar.mo33948e() != null) {
                    a[179] = true;
                } else {
                    a[180] = true;
                    it.remove();
                    a[181] = true;
                }
                a[182] = true;
            }
            this.f25081b = list;
            a[183] = true;
        }
    }
}
