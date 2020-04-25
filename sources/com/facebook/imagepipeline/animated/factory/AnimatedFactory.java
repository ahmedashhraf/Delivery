package com.facebook.imagepipeline.animated.factory;

import android.content.Context;
import android.graphics.Bitmap.Config;
import com.facebook.imagepipeline.decoder.ImageDecoder;
import com.facebook.imagepipeline.drawable.DrawableFactory;
import p201f.p202a.C5952h;
import p201f.p202a.p203u.C5968c;

@C5968c
public interface AnimatedFactory {
    @C5952h
    DrawableFactory getAnimatedDrawableFactory(Context context);

    @C5952h
    ImageDecoder getGifDecoder(Config config);

    @C5952h
    ImageDecoder getWebPDecoder(Config config);
}
