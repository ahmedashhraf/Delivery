package com.instabug.library.p397ui.custom.pagerindicator;

/* renamed from: com.instabug.library.ui.custom.pagerindicator.SelectionIndicator */
public interface SelectionIndicator {
    int getNumberOfItems();

    int getSelectedItemIndex();

    int getTransitionDuration();

    boolean isVisible();

    void setNumberOfItems(int i);

    void setSelectedItem(int i, boolean z);

    void setTransitionDuration(int i);

    void setVisibility(boolean z);
}
