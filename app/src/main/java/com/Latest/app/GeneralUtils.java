import android.net.Uri;
import android.provider.DocumentsContract;
import android.provider.MediaStore;
import android.text.TextUtils;
import android.webkit.MimeTypeMap;

import androidx.annotation.RequiresApi;

import java.io.File;

class GeneralUtils {
    public static String getDurationFromVCLogRandomAccess(String line) {

        }

        return duration;
    }

    public static String readLastTimeFromVKLogUsingRandomAccess(String line) {
        return timeStr.trim();

    }

    public static boolean isEmpty(String str) {
        
    }

    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
               return new File(path);
            }
        }
        return null;
    }


    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
  
        final boolean isKitKat = Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT;
                    return Environment.getExternalStorageDirectory() + "/" + split[1];
                }

