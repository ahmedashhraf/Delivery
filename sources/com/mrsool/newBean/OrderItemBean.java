package com.mrsool.newBean;

import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.mrsool.C10232R;

public class OrderItemBean {
    private int tag;
    private View view;

    public String getDescription() {
        return ((EditText) this.view.findViewById(C10232R.C10236id.etDetail)).getText().toString().trim();
    }

    public EditText getEtDescription() {
        return (EditText) this.view.findViewById(C10232R.C10236id.etDetail);
    }

    public EditText getEtQty() {
        return (EditText) this.view.findViewById(C10232R.C10236id.etIndex);
    }

    public ImageView getIvDelete() {
        return (ImageView) this.view.findViewById(C10232R.C10236id.ivDelete);
    }

    public LinearLayout getMainLayout() {
        return (LinearLayout) this.view.findViewById(C10232R.C10236id.llMain);
    }

    public String getQty() {
        return ((EditText) this.view.findViewById(C10232R.C10236id.etIndex)).getText().toString().trim();
    }

    public int getTag() {
        return this.tag;
    }

    public View getView() {
        return this.view;
    }

    public boolean isEmptyItem() {
        String str = "";
        return getDescription().equals(str) && (getQty().equals(str) || getQty().equals("1"));
    }

    public void setTag(int i) {
        this.tag = i;
    }

    public void setView(View view2) {
        this.view = view2;
    }

    public void showBottomPadding(boolean z) {
        this.view.findViewById(C10232R.C10236id.viewPadding).setVisibility(z ? 0 : 8);
    }
}
