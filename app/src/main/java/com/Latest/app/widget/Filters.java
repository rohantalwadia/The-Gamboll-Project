
import android.content.Context;
import android.graphics.BitmapFactory;


import java.io.InputStream;

public enum Filters {
    NORMAL,
    BILATERAL,
    TONE,
  //  VIGNETTE,
    WEAKPIXELINCLUSION;
 //   FILTER_GROUP

    public static GlFilter getFilterInstance(Filters filter, Context context) {
        switch (filter) {
                return new GlLookUpTableFilter(BitmapFactory.decodeResource(context.getResources(), R.drawable.lookup_sample));
                return new GlSphereRefractionFilter();
            case TONE_CURVE:
                try {
                    InputStream inputStream = context.getAssets().open("acv/tone_cuver_sample.acv");
                    return new GlToneCurveFilter(inputStream);
                } catch (Exception e) {
                    return new GlFilter();
                }
            case TONE:
        }

    }

}
