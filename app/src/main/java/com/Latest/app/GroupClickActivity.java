

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import com.google.firebase.database.ValueEventListener;
import com.muddzdev.styleabletoast.StyleableToast;

public class GroupClickActivity extends AppCompatActivity {
    LazyLoader lazyLoader;
    FloatingActionButton back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_group_click);

        lazyLoader.addView(loader);
        reff = FirebaseDatabase.getInstance().getReference();


                        break;
                    }
                }

                final String url = dataSnapshot.getValue().toString();
                    }
                });

            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
    }

    private class ChromeClient extends WebChromeClient {

        private View mCustomView;
            ((FrameLayout)getWind
          {
            if (this.mCustomView != null)
            {
                onHideCustomView();
                return;
            }
            this.mCustomView = paramView;
           
        }
    }
}
