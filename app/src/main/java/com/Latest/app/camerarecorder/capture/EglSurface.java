
import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLContext;
import android.opengl.EGLSurface;
import android.util.Log;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;

/**
 * Created by sudamasayuki on 2018/03/14.
 */

public class EglSurface {
    private static final boolean DEBUG = false;    // TODO set false on release
    private static final String TAG = "EGLBase";

    }

    public EGLContext getContext() {
        return egl.getContext();
    }

    public void release() {
        if (DEBUG) Log.v(TAG, "EglSurface:release:");
        return height;
    }

}
