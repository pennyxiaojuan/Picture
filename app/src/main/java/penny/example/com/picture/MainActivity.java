package penny.example.com.picture;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.PopupWindow;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    /**
     * 显示popup window
     * @param view popup window
     */
    private void popupShow(View view){
        int density =(int)ScreenUtil.getDeviceDensity(this);
        //显示popup window
        mPopupWindow = new PopupWindow(mPopupView,
        200*density,50*density);
        mPopuWindow.setFocusable(true);
        mPopupWindow.setFocusable(true);
        //透明背景
        Drawable transpent = new ColorDrawable(Color.TRANSPARENT);
        mPopupWindow.setBackgroundDrawable(transpent);
        //获取位置
        int[] location = new int[2];
        view.getLocationOnScreen(location);
        mPopupWindow.showAtLocation(
                view,
                Gravity.NO_GRAVITY,
                location[0]-40*density,
                location[1]+30*density);
    }
}
