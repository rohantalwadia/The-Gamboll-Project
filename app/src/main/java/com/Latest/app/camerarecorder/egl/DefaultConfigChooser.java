
import android.opengl.GLSurfaceView;

import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLDisplay;

import static javax.microedition.khronos.egl.EGL10.EGL_RENDERABLE_TYPE;
import static javax.microedition.khronos.egl.EGL10.EGL_STENCIL_SIZE;

/**
 * Created by sudamasayuki on 2018/03/14.
 */

public class DefaultConfigChooser implements GLSurfaceView.EGLConfigChooser {

        }
        final int config_size = num_config[0];
        if (config_size <= 0) {
            throw new IllegalArgumentException("No configs match configSpec");
        }
        if (!egl.eglChooseConfig(display, configSpec, configs, config_size, num_config)) {
            throw new IllegalArgumentException("eglChooseConfig#2 failed");
        }
        final EGLConfig config = chooseConfig(egl, display, configs);
        if (config == null) {
        if (egl.eglGetConfigAttrib(display, config, attribute, value)) {
            return value[0];
        }
        return defaultValue;
    }
}


