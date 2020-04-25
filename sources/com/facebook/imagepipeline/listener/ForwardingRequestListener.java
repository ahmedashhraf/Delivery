package com.facebook.imagepipeline.listener;

import com.facebook.common.logging.FLog;
import com.facebook.imagepipeline.request.ImageRequest;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p201f.p202a.C5952h;

public class ForwardingRequestListener implements RequestListener {
    private static final String TAG = "ForwardingRequestListener";
    private final List<RequestListener> mRequestListeners;

    public ForwardingRequestListener(Set<RequestListener> set) {
        this.mRequestListeners = new ArrayList(set.size());
        for (RequestListener requestListener : set) {
            if (requestListener != null) {
                this.mRequestListeners.add(requestListener);
            }
        }
    }

    private void onException(String str, Throwable th) {
        FLog.m15754e(TAG, str, th);
    }

    public void addRequestListener(RequestListener requestListener) {
        this.mRequestListeners.add(requestListener);
    }

    public void onProducerEvent(String str, String str2, String str3) {
        int size = this.mRequestListeners.size();
        for (int i = 0; i < size; i++) {
            try {
                ((RequestListener) this.mRequestListeners.get(i)).onProducerEvent(str, str2, str3);
            } catch (Exception e) {
                onException("InternalListener exception in onIntermediateChunkStart", e);
            }
        }
    }

    public void onProducerFinishWithCancellation(String str, String str2, @C5952h Map<String, String> map) {
        int size = this.mRequestListeners.size();
        for (int i = 0; i < size; i++) {
            try {
                ((RequestListener) this.mRequestListeners.get(i)).onProducerFinishWithCancellation(str, str2, map);
            } catch (Exception e) {
                onException("InternalListener exception in onProducerFinishWithCancellation", e);
            }
        }
    }

    public void onProducerFinishWithFailure(String str, String str2, Throwable th, @C5952h Map<String, String> map) {
        int size = this.mRequestListeners.size();
        for (int i = 0; i < size; i++) {
            try {
                ((RequestListener) this.mRequestListeners.get(i)).onProducerFinishWithFailure(str, str2, th, map);
            } catch (Exception e) {
                onException("InternalListener exception in onProducerFinishWithFailure", e);
            }
        }
    }

    public void onProducerFinishWithSuccess(String str, String str2, @C5952h Map<String, String> map) {
        int size = this.mRequestListeners.size();
        for (int i = 0; i < size; i++) {
            try {
                ((RequestListener) this.mRequestListeners.get(i)).onProducerFinishWithSuccess(str, str2, map);
            } catch (Exception e) {
                onException("InternalListener exception in onProducerFinishWithSuccess", e);
            }
        }
    }

    public void onProducerStart(String str, String str2) {
        int size = this.mRequestListeners.size();
        for (int i = 0; i < size; i++) {
            try {
                ((RequestListener) this.mRequestListeners.get(i)).onProducerStart(str, str2);
            } catch (Exception e) {
                onException("InternalListener exception in onProducerStart", e);
            }
        }
    }

    public void onRequestCancellation(String str) {
        int size = this.mRequestListeners.size();
        for (int i = 0; i < size; i++) {
            try {
                ((RequestListener) this.mRequestListeners.get(i)).onRequestCancellation(str);
            } catch (Exception e) {
                onException("InternalListener exception in onRequestCancellation", e);
            }
        }
    }

    public void onRequestFailure(ImageRequest imageRequest, String str, Throwable th, boolean z) {
        int size = this.mRequestListeners.size();
        for (int i = 0; i < size; i++) {
            try {
                ((RequestListener) this.mRequestListeners.get(i)).onRequestFailure(imageRequest, str, th, z);
            } catch (Exception e) {
                onException("InternalListener exception in onRequestFailure", e);
            }
        }
    }

    public void onRequestStart(ImageRequest imageRequest, Object obj, String str, boolean z) {
        int size = this.mRequestListeners.size();
        for (int i = 0; i < size; i++) {
            try {
                ((RequestListener) this.mRequestListeners.get(i)).onRequestStart(imageRequest, obj, str, z);
            } catch (Exception e) {
                onException("InternalListener exception in onRequestStart", e);
            }
        }
    }

    public void onRequestSuccess(ImageRequest imageRequest, String str, boolean z) {
        int size = this.mRequestListeners.size();
        for (int i = 0; i < size; i++) {
            try {
                ((RequestListener) this.mRequestListeners.get(i)).onRequestSuccess(imageRequest, str, z);
            } catch (Exception e) {
                onException("InternalListener exception in onRequestSuccess", e);
            }
        }
    }

    public void onUltimateProducerReached(String str, String str2, boolean z) {
        int size = this.mRequestListeners.size();
        for (int i = 0; i < size; i++) {
            try {
                ((RequestListener) this.mRequestListeners.get(i)).onUltimateProducerReached(str, str2, z);
            } catch (Exception e) {
                onException("InternalListener exception in onProducerFinishWithSuccess", e);
            }
        }
    }

    public boolean requiresExtraMap(String str) {
        int size = this.mRequestListeners.size();
        for (int i = 0; i < size; i++) {
            if (((RequestListener) this.mRequestListeners.get(i)).requiresExtraMap(str)) {
                return true;
            }
        }
        return false;
    }

    public ForwardingRequestListener(RequestListener... requestListenerArr) {
        this.mRequestListeners = new ArrayList(requestListenerArr.length);
        for (RequestListener requestListener : requestListenerArr) {
            if (requestListener != null) {
                this.mRequestListeners.add(requestListener);
            }
        }
    }
}
