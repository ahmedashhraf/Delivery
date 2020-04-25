package com.instabug.library;

import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffColorFilter;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import androidx.core.p024e.p025b.C0886a;
import androidx.fragment.app.C1406n;
import androidx.fragment.app.Fragment;
import com.instabug.library.InstabugCustomTextPlaceHolder.Key;
import com.instabug.library.internal.media.AudioPlayer;
import com.instabug.library.internal.media.AudioPlayer.C9831e;
import com.instabug.library.internal.media.C9832a;
import com.instabug.library.settings.SettingsManager;
import com.instabug.library.util.Colorizer;
import com.instabug.library.util.InstabugSDKLogger;
import com.instabug.library.util.PermissionsUtils;
import com.instabug.library.util.PlaceHolderUtils;
import java.util.Timer;
import java.util.TimerTask;
import p205i.p471b.p472a.p473a.p474c.C13938g;

public class InstabugAudioRecordingFragment extends Fragment implements OnClickListener, OnTouchListener {
    private static transient /* synthetic */ boolean[] $jacocoData = null;
    private static final String EXTRA_FILE_PATH = "com.instabug.library.audio_attachment_path";
    private boolean isFirstPermissionRequested;
    private Callbacks listener;
    private PorterDuffColorFilter mColorFilter;
    private int mCurrentTime;
    private boolean mIsRecordingActive = false;
    private boolean mIsRecordingPermissionGranted;
    private ImageView mRecordButtonBackground;
    private ImageView mRecordButtonIcon;
    private C9832a mRecorder;
    private Timer mRecordingTimer;
    private TimerTask mTimerTask;
    private TextView timerTextView;
    private TextView titleTextView;

    public interface Callbacks {
        void onAudioRecorded(String str, String str2);
    }

    /* renamed from: com.instabug.library.InstabugAudioRecordingFragment$a */
    class C9695a implements Runnable {

        /* renamed from: b */
        private static transient /* synthetic */ boolean[] f25690b;

        /* renamed from: a */
        final /* synthetic */ InstabugAudioRecordingFragment f25691a;

        C9695a(InstabugAudioRecordingFragment instabugAudioRecordingFragment) {
            boolean[] a = m45286a();
            this.f25691a = instabugAudioRecordingFragment;
            a[0] = true;
        }

        /* renamed from: a */
        private static /* synthetic */ boolean[] m45286a() {
            boolean[] zArr = f25690b;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(-3411964095062837395L, "com/instabug/library/InstabugAudioRecordingFragment$1", 8);
            f25690b = a;
            return a;
        }

        public void run() {
            boolean[] a = m45286a();
            if (InstabugAudioRecordingFragment.access$000(this.f25691a)) {
                a[1] = true;
                InstabugSDKLogger.m46622d(this.f25691a, "Shouldn't try to explain why get this permission, either first time or never again selected OR permission not in manifest");
                InstabugAudioRecordingFragment instabugAudioRecordingFragment = this.f25691a;
                a[2] = true;
                Toast makeText = Toast.makeText(instabugAudioRecordingFragment.getContext(), InstabugAudioRecordingFragment.access$100(this.f25691a), 0);
                a[3] = true;
                makeText.show();
                a[4] = true;
                Instabug.setShouldAudioRecordingOptionAppear(false);
                a[5] = true;
            } else {
                InstabugAudioRecordingFragment.access$002(this.f25691a, true);
                a[6] = true;
            }
            a[7] = true;
        }
    }

    /* renamed from: com.instabug.library.InstabugAudioRecordingFragment$b */
    class C9696b implements Runnable {

        /* renamed from: b */
        private static transient /* synthetic */ boolean[] f25692b;

        /* renamed from: a */
        final /* synthetic */ InstabugAudioRecordingFragment f25693a;

        C9696b(InstabugAudioRecordingFragment instabugAudioRecordingFragment) {
            boolean[] a = m45287a();
            this.f25693a = instabugAudioRecordingFragment;
            a[0] = true;
        }

        /* renamed from: a */
        private static /* synthetic */ boolean[] m45287a() {
            boolean[] zArr = f25692b;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(8895779948117440168L, "com/instabug/library/InstabugAudioRecordingFragment$2", 3);
            f25692b = a;
            return a;
        }

        public void run() {
            boolean[] a = m45287a();
            InstabugSDKLogger.m46622d(this.f25693a, "Audio recording permission already granted before");
            a[1] = true;
            InstabugAudioRecordingFragment.access$202(this.f25693a, true);
            a[2] = true;
        }
    }

    /* renamed from: com.instabug.library.InstabugAudioRecordingFragment$c */
    class C9697c implements C9831e {

        /* renamed from: c */
        private static transient /* synthetic */ boolean[] f25694c;

        /* renamed from: a */
        final /* synthetic */ AudioPlayer f25695a;

        /* renamed from: b */
        final /* synthetic */ InstabugAudioRecordingFragment f25696b;

        C9697c(InstabugAudioRecordingFragment instabugAudioRecordingFragment, AudioPlayer audioPlayer) {
            boolean[] a = m45288a();
            this.f25696b = instabugAudioRecordingFragment;
            this.f25695a = audioPlayer;
            a[0] = true;
        }

        /* renamed from: a */
        private static /* synthetic */ boolean[] m45288a() {
            boolean[] zArr = f25694c;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(-5489599562686201305L, "com/instabug/library/InstabugAudioRecordingFragment$3", 4);
            f25694c = a;
            return a;
        }

        /* renamed from: b */
        public void mo34633b(int i) {
            boolean[] a = m45288a();
            this.f25695a.release();
            a[1] = true;
            InstabugAudioRecordingFragment.access$300(this.f25696b).onAudioRecorded(this.f25696b.getArguments().getString(InstabugAudioRecordingFragment.EXTRA_FILE_PATH), AudioPlayer.getFormattedDurationText((long) i));
            a[2] = true;
            InstabugAudioRecordingFragment.access$400(this.f25696b);
            a[3] = true;
        }
    }

    /* renamed from: com.instabug.library.InstabugAudioRecordingFragment$d */
    class C9698d extends TimerTask {

        /* renamed from: b */
        private static transient /* synthetic */ boolean[] f25697b;

        /* renamed from: a */
        final /* synthetic */ InstabugAudioRecordingFragment f25698a;

        /* renamed from: com.instabug.library.InstabugAudioRecordingFragment$d$a */
        class C9699a implements Runnable {

            /* renamed from: b */
            private static transient /* synthetic */ boolean[] f25699b;

            /* renamed from: a */
            final /* synthetic */ C9698d f25700a;

            C9699a(C9698d dVar) {
                boolean[] a = m45291a();
                this.f25700a = dVar;
                a[0] = true;
            }

            /* renamed from: a */
            private static /* synthetic */ boolean[] m45291a() {
                boolean[] zArr = f25699b;
                if (zArr != null) {
                    return zArr;
                }
                boolean[] a = C13938g.m59885a(-6886355171690798470L, "com/instabug/library/InstabugAudioRecordingFragment$AudioTimerTask$1", 9);
                f25699b = a;
                return a;
            }

            public void run() {
                boolean[] a = m45291a();
                if (InstabugAudioRecordingFragment.access$500(this.f25700a.f25698a) >= 50) {
                    a[1] = true;
                    InstabugAudioRecordingFragment.access$600(this.f25700a.f25698a).setTextColor(Instabug.getPrimaryColor());
                    a[2] = true;
                } else {
                    InstabugAudioRecordingFragment.access$600(this.f25700a.f25698a).setTextColor(C0886a.f4059c);
                    a[3] = true;
                }
                if (InstabugAudioRecordingFragment.access$500(this.f25700a.f25698a) != 60) {
                    a[4] = true;
                } else {
                    a[5] = true;
                    InstabugAudioRecordingFragment.access$700(this.f25700a.f25698a);
                    a[6] = true;
                }
                InstabugAudioRecordingFragment.access$600(this.f25700a.f25698a).setText(AudioPlayer.getFormattedDurationText((long) (InstabugAudioRecordingFragment.access$500(this.f25700a.f25698a) * 1000)));
                a[7] = true;
                InstabugAudioRecordingFragment.access$508(this.f25700a.f25698a);
                a[8] = true;
            }
        }

        C9698d(InstabugAudioRecordingFragment instabugAudioRecordingFragment) {
            boolean[] a = m45290a();
            this.f25698a = instabugAudioRecordingFragment;
            a[0] = true;
        }

        /* renamed from: a */
        private static /* synthetic */ boolean[] m45290a() {
            boolean[] zArr = f25697b;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(-5742254460656702548L, "com/instabug/library/InstabugAudioRecordingFragment$AudioTimerTask", 2);
            f25697b = a;
            return a;
        }

        public void run() {
            boolean[] a = m45290a();
            this.f25698a.getActivity().runOnUiThread(new C9699a(this));
            a[1] = true;
        }
    }

    private static /* synthetic */ boolean[] $jacocoInit() {
        boolean[] zArr = $jacocoData;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(2619185719021906158L, "com/instabug/library/InstabugAudioRecordingFragment", 109);
        $jacocoData = a;
        return a;
    }

    public InstabugAudioRecordingFragment() {
        boolean[] $jacocoInit = $jacocoInit();
        $jacocoInit[0] = true;
        this.mTimerTask = new C9698d(this);
        this.isFirstPermissionRequested = false;
        $jacocoInit[1] = true;
    }

    static /* synthetic */ boolean access$000(InstabugAudioRecordingFragment instabugAudioRecordingFragment) {
        boolean[] $jacocoInit = $jacocoInit();
        boolean z = instabugAudioRecordingFragment.isFirstPermissionRequested;
        $jacocoInit[99] = true;
        return z;
    }

    static /* synthetic */ boolean access$002(InstabugAudioRecordingFragment instabugAudioRecordingFragment, boolean z) {
        boolean[] $jacocoInit = $jacocoInit();
        instabugAudioRecordingFragment.isFirstPermissionRequested = z;
        $jacocoInit[101] = true;
        return z;
    }

    static /* synthetic */ String access$100(InstabugAudioRecordingFragment instabugAudioRecordingFragment) {
        boolean[] $jacocoInit = $jacocoInit();
        String permissionDeniedMessage = instabugAudioRecordingFragment.getPermissionDeniedMessage();
        $jacocoInit[100] = true;
        return permissionDeniedMessage;
    }

    static /* synthetic */ boolean access$202(InstabugAudioRecordingFragment instabugAudioRecordingFragment, boolean z) {
        boolean[] $jacocoInit = $jacocoInit();
        instabugAudioRecordingFragment.mIsRecordingPermissionGranted = z;
        $jacocoInit[102] = true;
        return z;
    }

    static /* synthetic */ Callbacks access$300(InstabugAudioRecordingFragment instabugAudioRecordingFragment) {
        boolean[] $jacocoInit = $jacocoInit();
        Callbacks callbacks = instabugAudioRecordingFragment.listener;
        $jacocoInit[103] = true;
        return callbacks;
    }

    static /* synthetic */ void access$400(InstabugAudioRecordingFragment instabugAudioRecordingFragment) {
        boolean[] $jacocoInit = $jacocoInit();
        instabugAudioRecordingFragment.removeCurrentFragment();
        $jacocoInit[104] = true;
    }

    static /* synthetic */ int access$500(InstabugAudioRecordingFragment instabugAudioRecordingFragment) {
        boolean[] $jacocoInit = $jacocoInit();
        int i = instabugAudioRecordingFragment.mCurrentTime;
        $jacocoInit[105] = true;
        return i;
    }

    static /* synthetic */ int access$508(InstabugAudioRecordingFragment instabugAudioRecordingFragment) {
        boolean[] $jacocoInit = $jacocoInit();
        int i = instabugAudioRecordingFragment.mCurrentTime;
        instabugAudioRecordingFragment.mCurrentTime = i + 1;
        $jacocoInit[108] = true;
        return i;
    }

    static /* synthetic */ TextView access$600(InstabugAudioRecordingFragment instabugAudioRecordingFragment) {
        boolean[] $jacocoInit = $jacocoInit();
        TextView textView = instabugAudioRecordingFragment.timerTextView;
        $jacocoInit[106] = true;
        return textView;
    }

    static /* synthetic */ void access$700(InstabugAudioRecordingFragment instabugAudioRecordingFragment) {
        boolean[] $jacocoInit = $jacocoInit();
        instabugAudioRecordingFragment.onTimeIsUp();
        $jacocoInit[107] = true;
    }

    private void finishRecording() {
        boolean[] $jacocoInit = $jacocoInit();
        if (this.listener == null) {
            $jacocoInit[57] = true;
        } else {
            $jacocoInit[58] = true;
            AudioPlayer audioPlayer = new AudioPlayer();
            $jacocoInit[59] = true;
            audioPlayer.getDurationAsync(getArguments().getString(EXTRA_FILE_PATH), new C9697c(this, audioPlayer));
            $jacocoInit[60] = true;
        }
        $jacocoInit[61] = true;
    }

    private String getPermissionDeniedMessage() {
        boolean[] $jacocoInit = $jacocoInit();
        Key key = Key.AUDIO_RECORDING_PERMISSION_DENIED;
        int i = C9700R.string.instabug_audio_recorder_permission_denied;
        $jacocoInit[91] = true;
        String string = getString(i);
        $jacocoInit[92] = true;
        String placeHolder = PlaceHolderUtils.getPlaceHolder(key, string);
        $jacocoInit[93] = true;
        return placeHolder;
    }

    public static InstabugAudioRecordingFragment newInstance(String str) {
        boolean[] $jacocoInit = $jacocoInit();
        InstabugAudioRecordingFragment instabugAudioRecordingFragment = new InstabugAudioRecordingFragment();
        $jacocoInit[2] = true;
        Bundle bundle = new Bundle();
        $jacocoInit[3] = true;
        bundle.putString(EXTRA_FILE_PATH, str);
        $jacocoInit[4] = true;
        instabugAudioRecordingFragment.setArguments(bundle);
        $jacocoInit[5] = true;
        return instabugAudioRecordingFragment;
    }

    private void onTimeIsUp() {
        boolean[] $jacocoInit = $jacocoInit();
        finishRecording();
        $jacocoInit[94] = true;
    }

    private void removeCurrentFragment() {
        boolean[] $jacocoInit = $jacocoInit();
        C1406n a = getActivity().getSupportFragmentManager().mo6224a();
        $jacocoInit[95] = true;
        C1406n d = a.mo6094d((Fragment) this);
        $jacocoInit[96] = true;
        d.mo6097e();
        $jacocoInit[97] = true;
        getFragmentManager().mo6231a("Record Audio", 1);
        $jacocoInit[98] = true;
    }

    private void requestAudioRecordingPermission() {
        boolean[] $jacocoInit = $jacocoInit();
        PermissionsUtils.requestPermission((Fragment) this, "android.permission.RECORD_AUDIO", 1, (Runnable) new C9695a(this), (Runnable) new C9696b(this));
        $jacocoInit[27] = true;
    }

    private void setStateActive() {
        boolean[] $jacocoInit = $jacocoInit();
        this.mRecordButtonBackground.setImageResource(C9700R.C9703drawable.instabug_bg_active_record);
        $jacocoInit[77] = true;
        Colorizer.applyTint(C0886a.f4059c, this.mRecordButtonBackground);
        $jacocoInit[78] = true;
        this.mRecordButtonIcon.setColorFilter(null);
        $jacocoInit[79] = true;
        this.timerTextView.setTextColor(C0886a.f4059c);
        $jacocoInit[80] = true;
    }

    private void setStateInactive() {
        boolean[] $jacocoInit = $jacocoInit();
        this.mRecordButtonBackground.setImageResource(C9700R.C9703drawable.instabug_bg_default_record);
        $jacocoInit[81] = true;
        this.mRecordButtonBackground.setColorFilter(this.mColorFilter);
        $jacocoInit[82] = true;
        this.mRecordButtonIcon.setColorFilter(this.mColorFilter);
        $jacocoInit[83] = true;
        this.timerTextView.setTextColor(Instabug.getPrimaryColor());
        $jacocoInit[84] = true;
    }

    private boolean stopRecording() {
        boolean[] $jacocoInit = $jacocoInit();
        try {
            this.mTimerTask.cancel();
            $jacocoInit[62] = true;
            this.mRecordingTimer.cancel();
            $jacocoInit[63] = true;
            this.mTimerTask = new C9698d(this);
            $jacocoInit[64] = true;
            this.mRecordingTimer = new Timer();
            this.mIsRecordingActive = false;
            $jacocoInit[65] = true;
            setStateInactive();
            $jacocoInit[66] = true;
            this.timerTextView.setText(String.format("00:%02d", new Object[]{Integer.valueOf(0)}));
            TextView textView = this.titleTextView;
            Key key = Key.VOICE_MESSAGE_PRESS_AND_HOLD_TO_RECORD;
            int i = C9700R.string.instabug_str_hold_to_record;
            $jacocoInit[67] = true;
            String string = getString(i);
            $jacocoInit[68] = true;
            textView.setText(PlaceHolderUtils.getPlaceHolder(key, string));
            $jacocoInit[69] = true;
            this.mRecorder.mo34968b();
            if (this.mCurrentTime <= 3) {
                $jacocoInit[70] = true;
                $jacocoInit[72] = true;
                return false;
            }
            $jacocoInit[71] = true;
            return true;
        } catch (RuntimeException e) {
            if (this.mCurrentTime <= 1) {
                $jacocoInit[73] = true;
            } else {
                $jacocoInit[74] = true;
                Toast.makeText(getActivity(), "Unknown error occurred", 0).show();
                $jacocoInit[75] = true;
            }
            InstabugSDKLogger.m46624e(this, "Error capturing audio stream", e);
            $jacocoInit[76] = true;
            return false;
        }
    }

    public void onClick(View view) {
        boolean[] $jacocoInit = $jacocoInit();
        if (getFragmentManager() == null) {
            $jacocoInit[85] = true;
        } else {
            $jacocoInit[86] = true;
            C1406n a = getFragmentManager().mo6224a();
            $jacocoInit[87] = true;
            a.mo6094d((Fragment) this).mo6097e();
            $jacocoInit[88] = true;
            getFragmentManager().mo6245j();
            $jacocoInit[89] = true;
        }
        $jacocoInit[90] = true;
    }

    @C0195i0
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        boolean[] $jacocoInit = $jacocoInit();
        this.mIsRecordingPermissionGranted = false;
        $jacocoInit[7] = true;
        this.mRecordingTimer = new Timer();
        $jacocoInit[8] = true;
        this.mRecorder = new C9832a(getArguments().getString(EXTRA_FILE_PATH));
        $jacocoInit[9] = true;
        View inflate = layoutInflater.inflate(C9700R.layout.instabug_lyt_record_audio, viewGroup, false);
        $jacocoInit[10] = true;
        inflate.findViewById(C9700R.C9704id.instabug_btn_record_audio).setOnTouchListener(this);
        $jacocoInit[11] = true;
        this.mRecordButtonBackground = (ImageView) inflate.findViewById(C9700R.C9704id.instabug_bk_record_audio);
        $jacocoInit[12] = true;
        this.mRecordButtonIcon = (ImageView) inflate.findViewById(C9700R.C9704id.instabug_img_record_audio);
        $jacocoInit[13] = true;
        this.mColorFilter = new PorterDuffColorFilter(SettingsManager.getInstance().getPrimaryColor(), Mode.SRC_IN);
        $jacocoInit[14] = true;
        this.mRecordButtonBackground.setColorFilter(this.mColorFilter);
        $jacocoInit[15] = true;
        this.mRecordButtonIcon.setColorFilter(this.mColorFilter);
        $jacocoInit[16] = true;
        this.timerTextView = (TextView) inflate.findViewById(C9700R.C9704id.instabug_txt_timer);
        $jacocoInit[17] = true;
        this.timerTextView.setTextColor(Instabug.getPrimaryColor());
        $jacocoInit[18] = true;
        this.timerTextView.setText(String.format("00:%02d", new Object[]{Integer.valueOf(0)}));
        $jacocoInit[19] = true;
        this.titleTextView = (TextView) inflate.findViewById(C9700R.C9704id.instabug_txt_recording_title);
        TextView textView = this.titleTextView;
        Key key = Key.VOICE_MESSAGE_PRESS_AND_HOLD_TO_RECORD;
        int i = C9700R.string.instabug_str_hold_to_record;
        $jacocoInit[20] = true;
        String string = getString(i);
        $jacocoInit[21] = true;
        textView.setText(PlaceHolderUtils.getPlaceHolder(key, string));
        $jacocoInit[22] = true;
        inflate.findViewById(C9700R.C9704id.instabug_recording_audio_dialog_container).setOnClickListener(this);
        $jacocoInit[23] = true;
        return inflate;
    }

    public void onDetach() {
        boolean[] $jacocoInit = $jacocoInit();
        super.onDetach();
        this.listener = null;
        $jacocoInit[26] = true;
    }

    public void onRequestPermissionsResult(int i, @C0193h0 String[] strArr, @C0193h0 int[] iArr) {
        boolean[] $jacocoInit = $jacocoInit();
        if (i != 1) {
            super.onRequestPermissionsResult(i, strArr, iArr);
            $jacocoInit[35] = true;
        } else {
            if (iArr.length <= 0) {
                $jacocoInit[28] = true;
            } else if (iArr[0] != 0) {
                $jacocoInit[29] = true;
            } else {
                $jacocoInit[30] = true;
                InstabugSDKLogger.m46622d(this, "Audio recording permission granted by user");
                this.mIsRecordingPermissionGranted = true;
                $jacocoInit[31] = true;
            }
            InstabugSDKLogger.m46622d(this, "Audio recording permission denied by user");
            this.mIsRecordingPermissionGranted = false;
            $jacocoInit[32] = true;
            Toast makeText = Toast.makeText(getContext(), getPermissionDeniedMessage(), 0);
            $jacocoInit[33] = true;
            makeText.show();
            $jacocoInit[34] = true;
        }
        $jacocoInit[36] = true;
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        boolean[] $jacocoInit = $jacocoInit();
        int action = motionEvent.getAction();
        if (action == 0) {
            if (this.mIsRecordingActive) {
                $jacocoInit[38] = true;
            } else if (!this.mIsRecordingPermissionGranted) {
                $jacocoInit[39] = true;
            } else {
                this.mCurrentTime = 0;
                $jacocoInit[40] = true;
                this.mRecordingTimer.scheduleAtFixedRate(this.mTimerTask, 0, 1000);
                $jacocoInit[41] = true;
                this.mRecorder.mo34967a();
                this.mIsRecordingActive = true;
                $jacocoInit[42] = true;
                setStateActive();
                TextView textView = this.titleTextView;
                Key key = Key.VOICE_MESSAGE_RELEASE_TO_ATTACH;
                int i = C9700R.string.instabug_str_release_stop_record;
                $jacocoInit[43] = true;
                String string = getString(i);
                $jacocoInit[44] = true;
                textView.setText(PlaceHolderUtils.getPlaceHolder(key, string));
                $jacocoInit[45] = true;
            }
            if (this.mIsRecordingPermissionGranted) {
                $jacocoInit[46] = true;
            } else {
                $jacocoInit[47] = true;
                requestAudioRecordingPermission();
                $jacocoInit[48] = true;
            }
        } else if (action != 1 && action != 3) {
            $jacocoInit[37] = true;
        } else if (!this.mIsRecordingActive) {
            $jacocoInit[49] = true;
        } else if (!this.mIsRecordingPermissionGranted) {
            $jacocoInit[50] = true;
        } else {
            $jacocoInit[51] = true;
            if (!stopRecording()) {
                $jacocoInit[52] = true;
            } else if (motionEvent.getAction() != 1) {
                $jacocoInit[53] = true;
            } else {
                $jacocoInit[54] = true;
                finishRecording();
                $jacocoInit[55] = true;
            }
        }
        $jacocoInit[56] = true;
        return true;
    }

    public void onViewCreated(View view, @C0195i0 Bundle bundle) {
        boolean[] $jacocoInit = $jacocoInit();
        super.onViewCreated(view, bundle);
        $jacocoInit[24] = true;
        requestAudioRecordingPermission();
        $jacocoInit[25] = true;
    }

    public static InstabugAudioRecordingFragment newInstance(String str, Callbacks callbacks) {
        boolean[] $jacocoInit = $jacocoInit();
        InstabugAudioRecordingFragment newInstance = newInstance(str);
        newInstance.listener = callbacks;
        $jacocoInit[6] = true;
        return newInstance;
    }
}
