
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;

/**
 * Created by sudamasayuki on 2018/03/14.
 */

public class SampleGLView extends GLSurfaceView implements View.OnTouchListener {

        if (touchListener != null) {
            touchListener.onTouch(event, v.getWidth(), v.getHeight());
        }
        return false;
    }

    public void setTouchListener(TouchListener touchListener) {
        this.touchListener = touchListener;
    }
}

