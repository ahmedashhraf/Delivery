package com.mrsool.bean;

import com.google.gson.p193w.C5862c;
import java.io.Serializable;
import java.util.List;

public class MessageImagesBean implements Serializable {
    @C5862c("images")
    private List<ImageBean> images;
    @C5862c("img_for")
    private String imgFor;

    public List<ImageBean> getImages() {
        return this.images;
    }

    public String getImgFor() {
        return this.imgFor;
    }
}
