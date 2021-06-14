
import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class ApplicationController extends Application implements Application.ActivityLifecycleCallbacks, ComponentCallbacks {
    public static Context context;

    public static SharedPreferences getSharedPerfs()
    {
        return context.getSharedPreferences("APP_PREF_MULTIPARTY", MODE_PRIVATE);
    }

    @Override
    public void onCreate() {

        super.onCreate();
        context=this;
    }

    @Override
    public void onActivityCreated(@NonNull Activity activity, @Nullable Bundle savedInstanceState) {

    }

