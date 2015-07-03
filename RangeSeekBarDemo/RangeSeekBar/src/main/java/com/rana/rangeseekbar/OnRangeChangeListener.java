package com.rana.rangeseekbar;

import android.view.View;

/**
 * Interface to track the change in range of seekbar.
 */
public interface OnRangeChangeListener {
    public void setRangeChangeListener(View view,double minPosition, double maxPosition);
}
