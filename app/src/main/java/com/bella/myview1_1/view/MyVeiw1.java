package com.bella.myview1_1.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

import com.bella.myview1_1.R;

public class MyVeiw1 extends View {
    public MyVeiw1(Context context) {
        super(context);
    }

    public MyVeiw1(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public MyVeiw1(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public MyVeiw1(Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    private Paint paint = new Paint();

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);//不能漏写

        paint.setAntiAlias(true);//开启抗锯齿
        paint.setColor(Color.RED);
        paint.setAlpha(100);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(50);
        //填充背景色
//        canvas.drawColor(Color.BLUE);
        //画圆
        canvas.drawCircle(200, 200, 100, paint);
        //画矩形
        canvas.drawRect(100, 400, 300, 600, paint);
        //画点
        paint.setStrokeWidth(20);
        paint.setStrokeCap(Paint.Cap.SQUARE);
        canvas.drawPoint(200, 640, paint);
        //画好多点
        paint.setStrokeWidth(5);
        paint.setStrokeCap(Paint.Cap.ROUND);
        float[] points = {0, 0, 100, 650, 200, 650, 100, 660, 200, 660, 300, 650};
        canvas.drawPoints(points, 2, 8, paint);
        //画椭圆
        paint.setStyle(Paint.Style.FILL);
        canvas.drawOval(100, 680, 500, 800, paint);
        //画直线  由于直线不是封闭图形，所以setStyle(style)对直线没有影响
        canvas.drawLine(100, 820, 300, 850, paint);
        //画很多线
        float[] lines = {100, 880, 300, 880, 100, 980, 300, 980, 200, 880, 200, 980};
        canvas.drawLines(lines, 0, 12, paint);
        //画圆角矩形
        canvas.drawRoundRect(100, 1000, 300, 1100, 60, 60, paint);
        //画扇形 弧形  为什么画出来的样子跟想象中的样子不一样呢？？？？？？
        canvas.drawArc(100, 1200, 300, 1800, 0, 360, true, paint);

        //用path画路径图形  这里也画了一个圆  add****
        Path path = new Path();
        path.addCircle(500, 100, 100, Path.Direction.CW);
        canvas.drawPath(path, paint);

        // ***to 画辅助线等
        canvas.drawLine(500,100, 600, 200, paint);
        paint.setStyle(Paint.Style.STROKE);  //画线要用STROKE
        path.lineTo(300, 400);
        canvas.drawPath(path, paint);

        //移动到目标位置 改变当前位置 moveto
        //很重要的方法！！！！！
        path.moveTo(100, 0);
        path.lineTo(100, 100);
        canvas.drawPath(path, paint);




    }
}
