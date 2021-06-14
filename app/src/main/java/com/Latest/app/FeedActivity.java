import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.firestore.FirebaseFirestore;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import uk.co.samuelwall.materialtaptargetprompt.MaterialTapTargetPrompt;

public class FeedActivity extends AppCompatActivity  {
    String TAG = "sttag";
                    .putInt(LAST_APP_VERSION, currentVersionCode).commit();
        } catch (PackageManager.NameNotFoundException e) {

        }
        return appStart;
    }
        }
    }


        switch (checkAppStart()) {
            case NORMAL:
                // We don't want to get on the user's nerves
                break;
            case FIRST_TIME_VERSION:
                // TODO show what's new
                break;
            case FIRST_TIME:
                // TODO show a tutorial
                            {
                                if (state == MaterialTapTargetPrompt.STATE_DISMISSED)
                                {
                                    MaterialTapTargetPrompt.Builder builder1 = new MaterialTapTargetPrompt.Builder(FeedActivity.this);
                                                                        {
                                                                            MaterialTapTargetPrompt.Builder builder1 = new MaterialTapTargetPrompt.Builder(FeedActivity.this);
                                                                                    .show();
                                                                        }
                                                                    }
                                                                })
                                                                //.setFocalRadius(10f)
                                                                .setBackgroundColour(R.color.colorPrimary)
                editor.commit();
                break;
            default:
                break;
        }


        tabLayout = findViewById(R.id.tabs);
        viewPager = findViewById(R.id.view_pager_main);
        group_icon = (ImageView) findViewById(R.id.group_icon);


        cng_icon = (ImageView) findViewById(R.id.cng_icon);
        tutorial_icon = (ImageView) findViewById(R.id.tutorial_icon);
     //   new MaterialTapTargetPrompt.Builder(this)









//        BackgroundColorSpan backgroundColour = BackgroundColorSpan(
//                ContextCompat.getColor(this, R.color.colorPrimaryDark));
//        primaryText.setSpan(backgroundColour, 0, 4, Spanned.SPAN_INCLUSIVE_INCLUSIVE);
        Button toCam = findViewById(R.id.ToCam);

        groupListArray = new ArrayList<String>();
        joinedGroupListArray = new ArrayList<String>();
        });


    public void SaveFeed(View v) {
        document = mainDocument.document(UserId);
        document.get().addOnSuccessListener(new OnSuccessListener<DocumentSnapshot>() {
                    startActivity(intent);
                    finish();
                } else {
                    Log.d("Logs", "No such document");
                }
            }

        }).addOnFailureListener(new OnFailureListener() {
            @Override
            public void onFailure(@NonNull Exception e) {

            }
        });
    }

    public class MyPagerAdapter extends FragmentPagerAdapter {
        @Override
        public Fragment getItem(int position) {

            return flist.get(position);
            this.flist.add(fragment);

        }
    }
}





