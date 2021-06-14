
import android.graphics.SurfaceTexture;

/**
 * Created by sudamasayuki on 2018/03/14.
 */

public class GlSurfaceTexture implements SurfaceTexture.OnFrameAvailableListener {

    private SurfaceTexture surfaceTexture;
    private SurfaceTexture.OnFrameAvailableListener onFrameAvailableListener;

    public GlSurfaceTexture(final int texName) {
        }
    }

    public void release() {
        surfaceTexture.release();
    }
}

