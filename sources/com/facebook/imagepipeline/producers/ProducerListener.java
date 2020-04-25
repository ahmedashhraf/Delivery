package com.facebook.imagepipeline.producers;

import java.util.Map;
import p201f.p202a.C5952h;

public interface ProducerListener {
    void onProducerEvent(String str, String str2, String str3);

    void onProducerFinishWithCancellation(String str, String str2, @C5952h Map<String, String> map);

    void onProducerFinishWithFailure(String str, String str2, Throwable th, @C5952h Map<String, String> map);

    void onProducerFinishWithSuccess(String str, String str2, @C5952h Map<String, String> map);

    void onProducerStart(String str, String str2);

    void onUltimateProducerReached(String str, String str2, boolean z);

    boolean requiresExtraMap(String str);
}
