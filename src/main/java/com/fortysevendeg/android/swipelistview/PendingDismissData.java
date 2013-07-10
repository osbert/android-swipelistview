package com.fortysevendeg.android.swipelistview;

import android.view.View;

/**
 * Class that saves pending dismiss data
 */
public class PendingDismissData implements Comparable<PendingDismissData> {
    public int position;
    public View view;
    public boolean swapRight;

    public PendingDismissData(int position, View view, boolean swapRight) {
        this.position = position;
        this.view = view;
        this.swapRight = swapRight;
    }

    @Override
        public int compareTo(PendingDismissData other) {
        // Sort by descending position
        return other.position - position;
    }
}

