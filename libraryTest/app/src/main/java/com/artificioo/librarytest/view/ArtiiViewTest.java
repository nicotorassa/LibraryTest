package com.artificioo.librarytest.view;

import android.content.Context;
import android.util.AttributeSet;

import androidx.constraintlayout.widget.ConstraintLayout;

import com.artificioo.librarytest.R;

public class ArtiiViewTest extends ConstraintLayout {

    public ArtiiViewTest(Context context) {
        super(context);
        init(null, 0);
    }

    public ArtiiViewTest(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(attrs, 0);
    }

    public ArtiiViewTest(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(attrs, defStyleAttr);
    }

    private void init(AttributeSet attrs, int defStyle) {
        inflate(getContext(), R.layout.view_artii_viewtest, this);
    }
}
