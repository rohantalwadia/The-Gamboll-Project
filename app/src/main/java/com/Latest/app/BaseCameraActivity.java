
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;


import javax.microedition.khronos.opengles.GL10;


public class BaseCameraActivity extends AppCompatActivity {
    MediaPlayer mediaPlayer;
    private SampleGLView sampleGLView;
vate boolean toggleClick = false;
    String groupName = null;
    List<String> songsList, urlList;
                lensFacing = LensFacing.FRONT;
            } else {
                lensFacing = LensFacing.BACK;
            }
            toggleClick = true;
        });

    public static void exportMp4ToGallery(Context context, String filePath) {
        final ContentValues values = new ContentValues(2);
        values.put(MediaStore.Video.Media.DATA, filePath);
        context.getContentResolver().insert(MediaStore.Video.Media.EXTERNAL_CONTENT_URI,
                values);
        context.sendBroadcast(new Intent(Intent.ACTION_MEDIA_SCANNER_SCAN_FILE,
                Uri.parse("file://" + filePath)));
    }


}
