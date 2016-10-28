package com.jasper.arcmenudemo.util;

import android.content.Context;
import android.util.DisplayMetrics;

/**
 * @author Jasper
 */
public class Util {

    /**
     * Convert dp to px value
     *
     * @param ctx
     * @param dpValue
     * @return
     */
    public static int dpToPx(Context ctx, int dpValue) {
        DisplayMetrics dm = ctx.getResources().getDisplayMetrics();
        return (int) ((dpValue * dm.density) + 0.5f);
    }
}
