package com.bella.myview1_1.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

import com.bella.myview1_1.R;

public class MyVeiw1 extends View {
    public MyVeiw1(Context context) {
        super(context);
    }

    public MyVeiw1(Context context,  @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public MyVeiw1(Context context,  @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public MyVeiw1(Context context,  @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    private Paint paint = new Paint();

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        paint.setColor(getResources().getColor(R.color.colorPrimary));
        paint.setAlpha(100);
        canvas.drawCircle(200, 200, 100, paint);
    }
}
