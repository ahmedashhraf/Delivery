package com.instabug.featuresrequest.p373ui.p377c;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.content.C0841b;
import androidx.core.p018c.C0821b;
import com.fasterxml.jackson.core.p162w.C3868i;
import com.instabug.featuresrequest.C9525R;
import com.instabug.featuresrequest.models.C9570b;
import com.instabug.featuresrequest.models.C9572d;
import com.instabug.featuresrequest.models.C9573e;
import com.instabug.featuresrequest.p370c.C9538a;
import com.instabug.featuresrequest.p370c.C9539b;
import com.instabug.featuresrequest.p370c.C9544g;
import com.instabug.featuresrequest.p370c.C9548j;
import com.instabug.featuresrequest.p373ui.p377c.C9619b.C9621b;
import com.instabug.library.Instabug;
import com.instabug.library.InstabugColorTheme;
import com.instabug.library.internal.storage.cache.AssetsCacheManager;
import com.instabug.library.internal.storage.cache.AssetsCacheManager.OnDownloadFinished;
import com.instabug.library.model.AssetEntity;
import com.instabug.library.model.AssetEntity.AssetType;
import com.instabug.library.util.InstabugSDKLogger;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import p205i.p471b.p472a.p473a.p474c.C13938g;

/* renamed from: com.instabug.featuresrequest.ui.c.d */
/* compiled from: TimelineAdapter */
public class C9623d extends BaseAdapter {

    /* renamed from: N */
    private static transient /* synthetic */ boolean[] f25479N;

    /* renamed from: a */
    ArrayList<C9573e> f25480a;

    /* renamed from: b */
    C9621b f25481b;

    /* renamed from: com.instabug.featuresrequest.ui.c.d$a */
    /* compiled from: TimelineAdapter */
    class C9624a implements Runnable {

        /* renamed from: N */
        private static transient /* synthetic */ boolean[] f25482N;

        /* renamed from: a */
        final /* synthetic */ C9570b f25483a;

        /* renamed from: b */
        final /* synthetic */ C9623d f25484b;

        C9624a(C9623d dVar, C9570b bVar) {
            boolean[] a = m45036a();
            this.f25484b = dVar;
            this.f25483a = bVar;
            a[0] = true;
        }

        /* renamed from: a */
        private static /* synthetic */ boolean[] m45036a() {
            boolean[] zArr = f25482N;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(1731262109908606044L, "com/instabug/featuresrequest/ui/featuredetails/TimelineAdapter$1", 5);
            f25482N = a;
            return a;
        }

        public void run() {
            boolean z;
            boolean[] a = m45036a();
            C9570b bVar = this.f25483a;
            if (!bVar.mo34290f()) {
                a[1] = true;
                z = true;
            } else {
                z = false;
                a[2] = true;
            }
            bVar.mo34281a(z);
            a[3] = true;
            this.f25484b.f25481b.mo34441f();
            a[4] = true;
        }
    }

    /* renamed from: com.instabug.featuresrequest.ui.c.d$b */
    /* compiled from: TimelineAdapter */
    class C9625b implements OnDownloadFinished {

        /* renamed from: c */
        private static transient /* synthetic */ boolean[] f25485c;

        /* renamed from: a */
        final /* synthetic */ C9570b f25486a;

        /* renamed from: b */
        final /* synthetic */ C9623d f25487b;

        C9625b(C9623d dVar, C9570b bVar) {
            boolean[] a = m45037a();
            this.f25487b = dVar;
            this.f25486a = bVar;
            a[0] = true;
        }

        /* renamed from: a */
        private static /* synthetic */ boolean[] m45037a() {
            boolean[] zArr = f25485c;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(8167517675148420295L, "com/instabug/featuresrequest/ui/featuredetails/TimelineAdapter$2", 10);
            f25485c = a;
            return a;
        }

        public void onFailed(Throwable th) {
            boolean[] a = m45037a();
            InstabugSDKLogger.m46624e(this, "Asset Entity downloading got error", th);
            a[9] = true;
        }

        public void onSuccess(AssetEntity assetEntity) {
            boolean[] a = m45037a();
            StringBuilder sb = new StringBuilder();
            sb.append("Asset Entity downloaded: ");
            File file = assetEntity.getFile();
            a[1] = true;
            sb.append(file.getPath());
            String sb2 = sb.toString();
            a[2] = true;
            InstabugSDKLogger.m46622d(this, sb2);
            a[3] = true;
            this.f25486a.mo34283b(assetEntity.getFile().getAbsolutePath());
            a[4] = true;
            if (assetEntity.getFile().exists()) {
                a[5] = true;
            } else {
                a[6] = true;
                InstabugSDKLogger.m46623e(this, "Asset Entity downloading got FileNotFoundException error");
                a[7] = true;
            }
            this.f25487b.notifyDataSetChanged();
            a[8] = true;
        }
    }

    /* renamed from: com.instabug.featuresrequest.ui.c.d$c */
    /* compiled from: TimelineAdapter */
    public static class C9626c {

        /* renamed from: h */
        private static transient /* synthetic */ boolean[] f25488h;

        /* renamed from: a */
        public final RelativeLayout f25489a;

        /* renamed from: b */
        public final ImageView f25490b;

        /* renamed from: c */
        public final TextView f25491c;

        /* renamed from: d */
        public final TextView f25492d;

        /* renamed from: e */
        public final TextView f25493e;

        /* renamed from: f */
        public final TextView f25494f;

        /* renamed from: g */
        public final TextView f25495g;

        C9626c(View view) {
            boolean[] a = m45038a();
            a[0] = true;
            this.f25490b = (ImageView) view.findViewById(C9525R.C9529id.instabug_feature_requests_comment_avatar);
            a[1] = true;
            this.f25491c = (TextView) view.findViewById(C9525R.C9529id.instabug_feature_requests_comment_username);
            a[2] = true;
            this.f25492d = (TextView) view.findViewById(C9525R.C9529id.instabug_feature_requests_comment_date);
            a[3] = true;
            this.f25493e = (TextView) view.findViewById(C9525R.C9529id.instabug_feature_feature_details_comment);
            a[4] = true;
            this.f25489a = (RelativeLayout) view.findViewById(C9525R.C9529id.instabug_feature_request_admin_comment_layout);
            a[5] = true;
            this.f25494f = (TextView) view.findViewById(C9525R.C9529id.instabug_feature_request_new_status);
            a[6] = true;
            this.f25495g = (TextView) view.findViewById(C9525R.C9529id.instabug_feature_request_new_status_date);
            a[7] = true;
        }

        /* renamed from: a */
        private static /* synthetic */ boolean[] m45038a() {
            boolean[] zArr = f25488h;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(4800743389976371273L, "com/instabug/featuresrequest/ui/featuredetails/TimelineAdapter$TimelineViewHolder", 8);
            f25488h = a;
            return a;
        }
    }

    public C9623d(ArrayList<C9573e> arrayList, C9621b bVar) {
        boolean[] a = m45033a();
        this.f25480a = arrayList;
        this.f25481b = bVar;
        a[0] = true;
    }

    /* renamed from: a */
    private void m45032a(Context context, C9626c cVar, C9572d dVar) {
        boolean[] a = m45033a();
        if (cVar.f25494f == null) {
            a[21] = true;
        } else {
            TextView textView = cVar.f25495g;
            if (textView == null) {
                a[22] = true;
            } else {
                a[23] = true;
                textView.setText(C9538a.m44630a(context, dVar.mo34308a()));
                a[24] = true;
                C9544g.m44643a(dVar.mo34305f(), dVar.mo34307h(), cVar.f25494f, context);
                a[25] = true;
                cVar.f25494f.setTextColor(Color.parseColor(dVar.mo34307h()));
                a[26] = true;
                TextView textView2 = cVar.f25494f;
                StringBuilder sb = new StringBuilder();
                sb.append(C3868i.f12248b);
                sb.append(cVar.f25494f.getText());
                textView2.setText(sb.toString());
                a[27] = true;
            }
        }
        a[28] = true;
    }

    /* renamed from: a */
    private static /* synthetic */ boolean[] m45033a() {
        boolean[] zArr = f25479N;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(-6314932781225597123L, "com/instabug/featuresrequest/ui/featuredetails/TimelineAdapter", 77);
        f25479N = a;
        return a;
    }

    /* renamed from: b */
    private void m45034b(Context context, C9626c cVar, C9570b bVar) {
        boolean[] a = m45033a();
        mo34450a(context, cVar, bVar);
        TextView textView = cVar.f25491c;
        if (textView == null) {
            a[29] = true;
        } else {
            a[30] = true;
            textView.setTypeface(null, 1);
            a[31] = true;
        }
        RelativeLayout relativeLayout = cVar.f25489a;
        if (relativeLayout == null) {
            a[32] = true;
        } else {
            a[33] = true;
            relativeLayout.getBackground().setAlpha(13);
            a[34] = true;
            if (Instabug.getTheme() == InstabugColorTheme.InstabugColorThemeLight) {
                a[35] = true;
                C9539b.m44632a(cVar.f25489a, C0821b.m4811d(Instabug.getPrimaryColor(), 255));
                a[36] = true;
            } else {
                C9539b.m44632a(cVar.f25489a, C0841b.m4915a(context, 17170443));
                a[37] = true;
            }
        }
        a[38] = true;
    }

    public int getCount() {
        boolean[] a = m45033a();
        int size = this.f25480a.size();
        a[1] = true;
        return size;
    }

    public Object getItem(int i) {
        boolean[] a = m45033a();
        Object obj = this.f25480a.get(i);
        a[2] = true;
        return obj;
    }

    public long getItemId(int i) {
        long j = (long) i;
        m45033a()[3] = true;
        return j;
    }

    public int getItemViewType(int i) {
        boolean[] a = m45033a();
        if (this.f25480a.get(i) instanceof C9570b) {
            a[4] = true;
            if (((C9570b) this.f25480a.get(i)).mo34293i()) {
                a[5] = true;
                return 1;
            }
            a[6] = true;
            return 0;
        }
        a[7] = true;
        return 2;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        C9626c cVar;
        boolean[] a = m45033a();
        int itemViewType = getItemViewType(i);
        if (view == null) {
            if (itemViewType == 1) {
                LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
                int i2 = C9525R.layout.ib_fr_item_admin_comment;
                a[10] = true;
                view = from.inflate(i2, viewGroup, false);
                a[11] = true;
            } else if (itemViewType != 2) {
                LayoutInflater from2 = LayoutInflater.from(viewGroup.getContext());
                int i3 = C9525R.layout.ib_fr_item_comment;
                a[8] = true;
                view = from2.inflate(i3, viewGroup, false);
                a[9] = true;
            } else {
                LayoutInflater from3 = LayoutInflater.from(viewGroup.getContext());
                int i4 = C9525R.layout.ib_fr_item_status_change;
                a[12] = true;
                view = from3.inflate(i4, viewGroup, false);
                a[13] = true;
            }
            cVar = new C9626c(view);
            a[14] = true;
            view.setTag(cVar);
            a[15] = true;
        } else {
            cVar = (C9626c) view.getTag();
            a[16] = true;
        }
        if (itemViewType == 1) {
            m45034b(view.getContext(), cVar, (C9570b) getItem(i));
            a[18] = true;
        } else if (itemViewType != 2) {
            mo34450a(view.getContext(), cVar, (C9570b) getItem(i));
            a[17] = true;
        } else {
            m45032a(view.getContext(), cVar, (C9572d) getItem(i));
            a[19] = true;
        }
        a[20] = true;
        return view;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo34450a(Context context, C9626c cVar, C9570b bVar) {
        String str;
        boolean[] a = m45033a();
        TextView textView = cVar.f25491c;
        if (textView == null) {
            a[39] = true;
        } else {
            a[40] = true;
            textView.setTypeface(null, 0);
            a[41] = true;
            TextView textView2 = cVar.f25491c;
            if (bVar.mo34294j() == null) {
                a[42] = true;
            } else {
                a[43] = true;
                if (bVar.mo34294j().equalsIgnoreCase("null")) {
                    a[44] = true;
                } else {
                    a[45] = true;
                    if (TextUtils.isEmpty(bVar.mo34294j().trim())) {
                        a[46] = true;
                    } else {
                        a[47] = true;
                        str = bVar.mo34294j();
                        a[48] = true;
                        textView2.setText(str);
                        a[51] = true;
                    }
                }
            }
            int i = C9525R.string.feature_request_owner_anonymous_word;
            a[49] = true;
            str = context.getString(i);
            a[50] = true;
            textView2.setText(str);
            a[51] = true;
        }
        if (cVar.f25490b == null) {
            a[52] = true;
        } else {
            a[53] = true;
            if (bVar.mo34287e() != null) {
                a[54] = true;
                try {
                    ImageView imageView = cVar.f25490b;
                    a[58] = true;
                    FileInputStream fileInputStream = new FileInputStream(new File(bVar.mo34287e()));
                    a[59] = true;
                    imageView.setImageBitmap(BitmapFactory.decodeStream(fileInputStream));
                    a[60] = true;
                } catch (FileNotFoundException e) {
                    a[61] = true;
                    InstabugSDKLogger.m46624e(this, "Can't set avatar image in feature detail comments", e);
                    a[62] = true;
                }
            } else {
                a[55] = true;
                m45031a(context, bVar, cVar.f25490b);
                a[56] = true;
                cVar.f25490b.setImageResource(C9525R.C9528drawable.instabug_ic_avatar);
                a[57] = true;
            }
        }
        TextView textView3 = cVar.f25492d;
        if (textView3 == null) {
            a[63] = true;
        } else {
            a[64] = true;
            textView3.setText(C9538a.m44630a(context, bVar.mo34308a()));
            a[65] = true;
        }
        TextView textView4 = cVar.f25493e;
        if (textView4 == null) {
            a[66] = true;
        } else {
            a[67] = true;
            String h = bVar.mo34292h();
            int i2 = C9525R.string.feature_request_str_more;
            a[68] = true;
            String string = context.getString(i2);
            int i3 = C9525R.string.feature_request_str_less;
            a[69] = true;
            String string2 = context.getString(i3);
            a[70] = true;
            boolean f = bVar.mo34290f();
            C9624a aVar = new C9624a(this, bVar);
            a[71] = true;
            C9548j.m44652a(textView4, h, string, string2, f, aVar);
            a[72] = true;
        }
        a[73] = true;
    }

    /* renamed from: a */
    private void m45031a(Context context, C9570b bVar, ImageView imageView) {
        boolean[] a = m45033a();
        AssetEntity createEmptyEntity = AssetsCacheManager.createEmptyEntity(context, bVar.mo34295k(), AssetType.IMAGE);
        a[74] = true;
        AssetsCacheManager.getAssetEntity(context, createEmptyEntity, new C9625b(this, bVar));
        a[75] = true;
    }
}
