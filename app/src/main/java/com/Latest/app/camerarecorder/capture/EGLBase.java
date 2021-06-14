
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.os.Build;
import android.util.Log;

/**
 * Created by sudamasayuki on 2018/03/14.
 */

public class EGLBase {
    }

    public void release() {
    }

    private void init(EGLContext shared_context, final boolean with_depth_buffer, final boolean isRecordable) {
        if (DEBUG) Log.v(TAG, "init:");
        if (eglDisplay != EGL14.EGL_NO_DISPLAY) {
            return false;
        }
        return true;
    }

    void makeDefault() {
        if (DEBUG) Log.v(TAG, "makeDefault:");
        if (!EGL14.eglMakeCurrent(eglDisplay, EGL14.EGL_NO_SURFACE, EGL14.EGL_NO_SURFACE, EGL14.EGL_NO_CONTEXT)) {
    }

    EGLSurface createWindowSurface(final Object surface) {
        if (DEBUG) Log.v(TAG, "createWindowSurface:nativeWindow=" + surface);


    void destroyWindowSurface(EGLSurface surface) {
                    EGL14.EGL_NO_SURFACE, EGL14.EGL_NO_SURFACE, EGL14.EGL_NO_CONTEXT);
                EGL14.EGL_ALPHA_SIZE, 8,
                // with_depth_buffer ? 16 : 0,
                EGL14.EGL_NONE
        };
        int offset = 10;
        if (false) {
            attribList[offset++] = EGL14.EGL_STENCIL_SIZE;
            attribList[offset++] = 8;
        }
        return configs[0];
    }

}

