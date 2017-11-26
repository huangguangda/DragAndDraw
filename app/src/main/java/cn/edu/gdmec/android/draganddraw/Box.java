package cn.edu.gdmec.android.draganddraw;

import android.graphics.PointF;

/**
 * Created by Jack on 2017/11/26.
 */

public class Box {
    private PointF mOrigin;
    private PointF mCurrent;
    public Box(PointF origin){
        mOrigin = origin;
        mCurrent = origin;
    }
    public PointF getCurrent(){
        return mCurrent;
    }
    public void setCurrent(PointF current){
        mCurrent = current;
    }
    public PointF getOrigin(){
        return mOrigin;
    }
}
