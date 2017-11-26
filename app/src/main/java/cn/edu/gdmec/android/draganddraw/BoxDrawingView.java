package cn.edu.gdmec.android.draganddraw;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.PointF;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Jack on 2017/11/26.
 */

public class BoxDrawingView extends View{
    private static final String TAG = "BoxDrawingView";

    private Box mCurrentBox;
    private List<Box> mButton=new ArrayList<> (  );
    private Paint mBoxPaint;
    private Paint mBackgroundPaint;

    public BoxDrawingView(Context context){
        this(context, null);
    }
    public BoxDrawingView(Context context, AttributeSet attrs){
        super(context, attrs);
        mBoxPaint = new Paint (  );
        mBoxPaint.setColor ( 0x22ff0000 );

        mBackgroundPaint = new Paint (  );
        mBackgroundPaint.setColor ( 0xfff8efe0 );
    }

    @Override
    public boolean onTouchEvent(MotionEvent event){
        PointF current = new PointF ( event.getX (), event.getY () );
        String action = "";
        switch (event.getAction ()){
            case MotionEvent.ACTION_DOWN:
                action = "ACTION_DOWN";
                mCurrentBox = new Box ( current );
                mButton.add ( mCurrentBox );
                break;
            case MotionEvent.ACTION_MOVE:
                action = "ACTION_MOVE";
                if (mCurrentBox != null){
                    mCurrentBox.setCurrent ( current );
                    invalidate ();
                }
                break;
            case MotionEvent.ACTION_UP:
                action = "ACTION_UP";
                mCurrentBox = null;
                break;
            case MotionEvent.ACTION_CANCEL:
                action = "ACTION_CANCEL";
                mCurrentBox = null;
                break;
        }
        Log.i ( TAG, action + " at x=" + current.x +
        ", y=" + current.y);
        return true;
    }
}
