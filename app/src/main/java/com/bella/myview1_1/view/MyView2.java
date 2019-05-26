package com.bella.myview1_1.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.View;

public class MyView2 extends View {
    public MyView2(Context context) {
        super(context);
    }

    public MyView2(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public MyView2(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public MyView2(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }


    Paint paint = new Paint(Paint.ANTI_ALIAS_FLAG);


    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        paint.setStyle(Paint.Style.STROKE);
        //两个比较特殊的方法 addArc()  arcTo()
        /**
         * 画线的 但并不使用当前位置作为弧线的起点
         * */
        Path path = new Path();
        path.lineTo(100, 100);
//        path.addArc(100, 100, 200, 200, -90, 90);
        paint.setColor(Color.parseColor("#ff3388"));
        paint.setStrokeWidth(20);
        path.arcTo(100, 100, 500, 500, -90, 90, true);
        canvas.drawPath(path, paint);

        //close() 封闭子图形
        path.moveTo(100, 400);
        path.lineTo(400, 400);
        path.lineTo(250, 550);
        path.close();  //封闭子图形
        canvas.drawPath(path, paint);

        // 辅助类
        path.setFillType(Path.FillType.EVEN_ODD);
//        path.setFillType(Path.FillType.INVERSE_WINDING);
        path.addCircle(400, 900, 300, Path.Direction.CW);
        path.addCircle(400, 900, 200, Path.Direction.CW);
        canvas.drawPath(path, paint);

        /**
         * 界面显示的所有内容 都是绘制出来的 包括文字
         * 也可以绘制bitmap
         * */
        paint.setStrokeWidth(2);
        paint.setTextSize(40);
//        canvas.drawBitmap();
        canvas.drawText("I'm studing view", 100, 1400, paint);


    }
}
