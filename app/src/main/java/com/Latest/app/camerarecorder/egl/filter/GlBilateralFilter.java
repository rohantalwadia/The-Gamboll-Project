
import static android.opengl.GLES20.glUniform1f;

/**
 * Created by sudamasayuki on 2017/05/18.
 */

public class GlBilateralFilter extends GlFilter {

    private static final String VERTEX_SHADER =
            "attribute vec4 aPosition;" +
                    "attribute vec4 aTextureCoord;" +
        this.blurSize = blurSize;
    }

    @Override
    public void onDraw() {
        glUniform1f(getHandle("texelWidthOffset"), texelWidthOffset);
        glUniform1f(getHandle("texelHeightOffset"), texelHeightOffset);
        glUniform1f(getHandle("blurSize"), blurSize);
    }


}
