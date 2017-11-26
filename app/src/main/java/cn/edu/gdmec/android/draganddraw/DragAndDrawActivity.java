package cn.edu.gdmec.android.draganddraw;

import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class DragAndDrawActivity extends SingleFragmentActivity {
    @Override
    public Fragment createFragment(){
        return DragAndDrawFragment.newInstance();
    }

   /* @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.fragment_drag_and_draw );
    }*/
}
