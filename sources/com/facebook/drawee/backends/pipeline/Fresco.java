package com.facebook.drawee.backends.pipeline;

import android.content.Context;
import com.facebook.common.logging.FLog;
import com.facebook.drawee.view.SimpleDraweeView;
import com.facebook.imagepipeline.core.ImagePipeline;
import com.facebook.imagepipeline.core.ImagePipelineConfig;
import com.facebook.imagepipeline.core.ImagePipelineFactory;
import com.facebook.soloader.SoLoader;
import java.io.IOException;
import p201f.p202a.C5952h;

public class Fresco {
    private static final Class<?> TAG = Fresco.class;
    private static PipelineDraweeControllerBuilderSupplier sDraweeControllerBuilderSupplier = null;
    private static volatile boolean sIsInitialized = false;

    private Fresco() {
    }

    public static PipelineDraweeControllerBuilderSupplier getDraweeControllerBuilderSupplier() {
        return sDraweeControllerBuilderSupplier;
    }

    public static ImagePipeline getImagePipeline() {
        return getImagePipelineFactory().getImagePipeline();
    }

    public static ImagePipelineFactory getImagePipelineFactory() {
        return ImagePipelineFactory.getInstance();
    }

    public static boolean hasBeenInitialized() {
        return sIsInitialized;
    }

    public static void initialize(Context context) {
        initialize(context, null, null);
    }

    private static void initializeDrawee(Context context, @C5952h DraweeConfig draweeConfig) {
        sDraweeControllerBuilderSupplier = new PipelineDraweeControllerBuilderSupplier(context, draweeConfig);
        SimpleDraweeView.initialize(sDraweeControllerBuilderSupplier);
    }

    public static PipelineDraweeControllerBuilder newDraweeControllerBuilder() {
        return sDraweeControllerBuilderSupplier.get();
    }

    public static void shutDown() {
        sDraweeControllerBuilderSupplier = null;
        SimpleDraweeView.shutDown();
        ImagePipelineFactory.shutDown();
    }

    public static void initialize(Context context, @C5952h ImagePipelineConfig imagePipelineConfig) {
        initialize(context, imagePipelineConfig, null);
    }

    public static void initialize(Context context, @C5952h ImagePipelineConfig imagePipelineConfig, @C5952h DraweeConfig draweeConfig) {
        if (sIsInitialized) {
            FLog.m15789w(TAG, "Fresco has already been initialized! `Fresco.initialize(...)` should only be called 1 single time to avoid memory leaks!");
        } else {
            sIsInitialized = true;
        }
        try {
            SoLoader.init(context, 0);
            Context applicationContext = context.getApplicationContext();
            if (imagePipelineConfig == null) {
                ImagePipelineFactory.initialize(applicationContext);
            } else {
                ImagePipelineFactory.initialize(imagePipelineConfig);
            }
            initializeDrawee(applicationContext, draweeConfig);
        } catch (IOException e) {
            throw new RuntimeException("Could not initialize SoLoader", e);
        }
    }
}
