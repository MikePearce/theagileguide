package net.mikepearce.theagileguide.utils;

import android.content.Context;
import android.graphics.Typeface;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class AndroidUtils
{
    private static Typeface robotoTypeFace;

    public static void setRobotoFont (Context context, View view, String flavour)
    {
        robotoTypeFace = Typeface.createFromAsset(context.getAssets(), "fonts/Roboto-"+ flavour +".ttf");
        setFont(view, robotoTypeFace);
        robotoTypeFace = null;
    }

    private static void setFont (View view, Typeface robotoTypeFace)
    {
        if (view instanceof ViewGroup)
        {
            for (int i = 0; i < ((ViewGroup)view).getChildCount(); i++)
            {
                setFont(((ViewGroup)view).getChildAt(i), robotoTypeFace);
            }
        }
        else if (view instanceof TextView)
        {
            ((TextView) view).setTypeface(robotoTypeFace);
        }
    }
}