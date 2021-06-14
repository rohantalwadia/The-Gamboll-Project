
import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class cam_activity extends BaseCameraActivity {

    public static void startActivity(AppCompatActivity activity) {
        activity.startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cam_activity);
        onCreateActivity();
        cameraHeight = 720;


    }
}