
import android.hardware.camera2.CameraCharacteristics;

/**
 * Created by sudamasayuki on 2018/03/16.
 */

public enum LensFacing {
    FRONT(CameraCharacteristics.LENS_FACING_FRONT),
    BACK(CameraCharacteristics.LENS_FACING_BACK);

        this.facing = facing;
    }

    public int getFacing() {
        return facing;
    }
}
