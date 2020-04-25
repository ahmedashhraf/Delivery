package com.instabug.library.internal.video;

import android.app.ProgressDialog;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnErrorListener;
import android.media.MediaPlayer.OnPreparedListener;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.MediaController;
import android.widget.VideoView;
import androidx.annotation.C0195i0;
import androidx.appcompat.app.C0295d;
import com.instabug.library.C9700R;
import com.instabug.library.C9706a;
import com.instabug.library.C9780c;
import com.instabug.library.Feature;
import com.instabug.library.Feature.State;
import com.instabug.library.InstabugCustomTextPlaceHolder.Key;
import com.instabug.library.util.InstabugSDKLogger;
import com.instabug.library.util.PlaceHolderUtils;
import p205i.p471b.p472a.p473a.p474c.C13938g;

public class VideoPlayerFragment extends C9706a {
    private static transient /* synthetic */ boolean[] $jacocoData = null;
    public static final String TAG = "video_player_fragment";
    public static final String VIDEO_PATH = "video.uri";
    private MediaController mediaControls;
    private int position = 0;
    private ProgressDialog progressDialog;
    private String videoUri;
    private VideoView videoView;

    /* renamed from: com.instabug.library.internal.video.VideoPlayerFragment$a */
    class C9856a implements OnPreparedListener {

        /* renamed from: b */
        private static transient /* synthetic */ boolean[] f26111b;

        /* renamed from: a */
        final /* synthetic */ VideoPlayerFragment f26112a;

        C9856a(VideoPlayerFragment videoPlayerFragment) {
            boolean[] a = m45894a();
            this.f26112a = videoPlayerFragment;
            a[0] = true;
        }

        /* renamed from: a */
        private static /* synthetic */ boolean[] m45894a() {
            boolean[] zArr = f26111b;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(-4438400695453547900L, "com/instabug/library/internal/video/VideoPlayerFragment$1", 7);
            f26111b = a;
            return a;
        }

        public void onPrepared(MediaPlayer mediaPlayer) {
            boolean[] a = m45894a();
            VideoPlayerFragment.access$000(this.f26112a).dismiss();
            a[1] = true;
            VideoPlayerFragment.access$200(this.f26112a).seekTo(VideoPlayerFragment.access$100(this.f26112a));
            a[2] = true;
            if (VideoPlayerFragment.access$100(this.f26112a) == 0) {
                a[3] = true;
                VideoPlayerFragment.access$200(this.f26112a).start();
                a[4] = true;
            } else {
                VideoPlayerFragment.access$200(this.f26112a).pause();
                a[5] = true;
            }
            a[6] = true;
        }
    }

    /* renamed from: com.instabug.library.internal.video.VideoPlayerFragment$b */
    class C9857b implements OnErrorListener {

        /* renamed from: b */
        private static transient /* synthetic */ boolean[] f26113b;

        /* renamed from: a */
        final /* synthetic */ VideoPlayerFragment f26114a;

        C9857b(VideoPlayerFragment videoPlayerFragment) {
            boolean[] a = m45895a();
            this.f26114a = videoPlayerFragment;
            a[0] = true;
        }

        /* renamed from: a */
        private static /* synthetic */ boolean[] m45895a() {
            boolean[] zArr = f26113b;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(5115839499207623925L, "com/instabug/library/internal/video/VideoPlayerFragment$2", 2);
            f26113b = a;
            return a;
        }

        public boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
            boolean[] a = m45895a();
            VideoPlayerFragment.access$000(this.f26114a).dismiss();
            a[1] = true;
            return false;
        }
    }

    private static /* synthetic */ boolean[] $jacocoInit() {
        boolean[] zArr = $jacocoData;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(-5551330732771490856L, "com/instabug/library/internal/video/VideoPlayerFragment", 52);
        $jacocoData = a;
        return a;
    }

    public VideoPlayerFragment() {
        boolean[] $jacocoInit = $jacocoInit();
        $jacocoInit[0] = true;
    }

    static /* synthetic */ ProgressDialog access$000(VideoPlayerFragment videoPlayerFragment) {
        boolean[] $jacocoInit = $jacocoInit();
        ProgressDialog progressDialog2 = videoPlayerFragment.progressDialog;
        $jacocoInit[49] = true;
        return progressDialog2;
    }

    static /* synthetic */ int access$100(VideoPlayerFragment videoPlayerFragment) {
        boolean[] $jacocoInit = $jacocoInit();
        int i = videoPlayerFragment.position;
        $jacocoInit[50] = true;
        return i;
    }

    static /* synthetic */ VideoView access$200(VideoPlayerFragment videoPlayerFragment) {
        boolean[] $jacocoInit = $jacocoInit();
        VideoView videoView2 = videoPlayerFragment.videoView;
        $jacocoInit[51] = true;
        return videoView2;
    }

    public static VideoPlayerFragment newInstance(String str) {
        boolean[] $jacocoInit = $jacocoInit();
        VideoPlayerFragment videoPlayerFragment = new VideoPlayerFragment();
        $jacocoInit[1] = true;
        Bundle bundle = new Bundle();
        $jacocoInit[2] = true;
        bundle.putString(VIDEO_PATH, str);
        $jacocoInit[3] = true;
        videoPlayerFragment.setArguments(bundle);
        $jacocoInit[4] = true;
        return videoPlayerFragment;
    }

    /* access modifiers changed from: protected */
    public void consumeNewInstanceSavedArguments() {
        boolean[] $jacocoInit = $jacocoInit();
        this.videoUri = getArguments().getString(VIDEO_PATH);
        $jacocoInit[33] = true;
    }

    /* access modifiers changed from: protected */
    public int getLayout() {
        boolean[] $jacocoInit = $jacocoInit();
        int i = C9700R.layout.instabug_lyt_video_view;
        $jacocoInit[5] = true;
        return i;
    }

    /* access modifiers changed from: protected */
    public String getTitle() {
        boolean[] $jacocoInit = $jacocoInit();
        Key key = Key.VIDEO_PLAYER_TITLE;
        int i = C9700R.string.instabug_str_video_player;
        $jacocoInit[28] = true;
        String string = getString(i);
        $jacocoInit[29] = true;
        String placeHolder = PlaceHolderUtils.getPlaceHolder(key, string);
        $jacocoInit[30] = true;
        return placeHolder;
    }

    public void onActivityCreated(@C0195i0 Bundle bundle) {
        boolean[] $jacocoInit = $jacocoInit();
        super.onActivityCreated(bundle);
        if (this.mediaControls != null) {
            $jacocoInit[14] = true;
        } else {
            $jacocoInit[15] = true;
            this.mediaControls = new MediaController(getActivity());
            $jacocoInit[16] = true;
        }
        this.progressDialog = new ProgressDialog(getActivity());
        $jacocoInit[17] = true;
        this.progressDialog.setMessage("Loading...");
        $jacocoInit[18] = true;
        this.progressDialog.setCancelable(false);
        $jacocoInit[19] = true;
        this.progressDialog.show();
        try {
            $jacocoInit[20] = true;
            this.videoView.setMediaController(this.mediaControls);
            $jacocoInit[21] = true;
            this.videoView.setVideoURI(Uri.parse(this.videoUri));
            $jacocoInit[22] = true;
        } catch (Exception e) {
            $jacocoInit[23] = true;
            InstabugSDKLogger.m46624e(this, e.getMessage(), e);
            $jacocoInit[24] = true;
        }
        this.videoView.requestFocus();
        $jacocoInit[25] = true;
        this.videoView.setOnPreparedListener(new C9856a(this));
        $jacocoInit[26] = true;
        this.videoView.setOnErrorListener(new C9857b(this));
        $jacocoInit[27] = true;
    }

    public void onDestroy() {
        boolean[] $jacocoInit = $jacocoInit();
        super.onDestroy();
        $jacocoInit[31] = true;
        showToolbar(true);
        $jacocoInit[32] = true;
    }

    public void onDestroyView() {
        boolean[] $jacocoInit = $jacocoInit();
        super.onDestroyView();
        $jacocoInit[38] = true;
        if (C9780c.m45631b().mo34869b(Feature.WHITE_LABELING) != State.DISABLED) {
            $jacocoInit[39] = true;
        } else {
            $jacocoInit[40] = true;
            getActivity().findViewById(C9700R.C9704id.instabug_pbi_footer).setVisibility(0);
            $jacocoInit[41] = true;
        }
        $jacocoInit[42] = true;
    }

    public void onResume() {
        boolean[] $jacocoInit = $jacocoInit();
        super.onResume();
        $jacocoInit[12] = true;
        showToolbar(false);
        $jacocoInit[13] = true;
    }

    public void onViewCreated(View view, Bundle bundle) {
        boolean[] $jacocoInit = $jacocoInit();
        super.onViewCreated(view, bundle);
        $jacocoInit[6] = true;
        this.videoView = (VideoView) view.findViewById(C9700R.C9704id.video_view);
        $jacocoInit[7] = true;
        if (C9780c.m45631b().mo34869b(Feature.WHITE_LABELING) != State.DISABLED) {
            $jacocoInit[8] = true;
        } else {
            $jacocoInit[9] = true;
            getActivity().findViewById(C9700R.C9704id.instabug_pbi_footer).setVisibility(8);
            $jacocoInit[10] = true;
        }
        $jacocoInit[11] = true;
    }

    /* access modifiers changed from: protected */
    public void restoreState(Bundle bundle) {
        boolean[] $jacocoInit = $jacocoInit();
        this.position = bundle.getInt("Position");
        $jacocoInit[34] = true;
        this.videoView.seekTo(this.position);
        $jacocoInit[35] = true;
    }

    /* access modifiers changed from: protected */
    public void saveState(Bundle bundle) {
        boolean[] $jacocoInit = $jacocoInit();
        bundle.putInt("Position", this.videoView.getCurrentPosition());
        $jacocoInit[36] = true;
        this.videoView.pause();
        $jacocoInit[37] = true;
    }

    public void showToolbar(boolean z) {
        boolean[] $jacocoInit = $jacocoInit();
        if (getActivity() == null) {
            $jacocoInit[43] = true;
        } else if (((C0295d) getActivity()).getSupportActionBar() == null) {
            $jacocoInit[44] = true;
        } else if (z) {
            $jacocoInit[45] = true;
            ((C0295d) getActivity()).getSupportActionBar().mo919D();
            $jacocoInit[46] = true;
        } else {
            ((C0295d) getActivity()).getSupportActionBar().mo985t();
            $jacocoInit[47] = true;
        }
        $jacocoInit[48] = true;
    }
}
