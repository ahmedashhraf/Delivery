package com.facebook.drawee.interfaces;

import android.net.Uri;
import p201f.p202a.C5952h;

public interface SimpleDraweeControllerBuilder {
    DraweeController build();

    SimpleDraweeControllerBuilder setCallerContext(Object obj);

    SimpleDraweeControllerBuilder setOldController(@C5952h DraweeController draweeController);

    SimpleDraweeControllerBuilder setUri(Uri uri);

    SimpleDraweeControllerBuilder setUri(@C5952h String str);
}
