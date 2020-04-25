package com.mrsool.chat;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import com.mrsool.utils.C5880q;

/* renamed from: com.mrsool.chat.p */
/* compiled from: TouchableWrapper */
public class C10535p extends FrameLayout {

    /* renamed from: N */
    private static final long f28580N = 200;

    /* renamed from: a */
    private long f28581a = 0;

    /* renamed from: b */
    private C10536a f28582b;

    /* renamed from: com.mrsool.chat.p$a */
    /* compiled from: TouchableWrapper */
    public interface C10536a {
        /* renamed from: a */
        void mo37922a();
    }

    public C10535p(Context context) {
        super(context);
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            C5880q.m25751b("ACTION_DOWN");
        } else if (action == 1) {
            C5880q.m25751b("ACTION_UP");
        }
        return super.dispatchTouchEvent(motionEvent);
    }
}
