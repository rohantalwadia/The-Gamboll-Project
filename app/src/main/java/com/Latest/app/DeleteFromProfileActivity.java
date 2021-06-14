
import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.QuerySnapshot;

import java.io.Serializable;
import java.net.URI;
import java.util.List;
import java.util.Map;

public class DeleteFromProfileActivity extends AppCompatActivity {
    private VideoView videoView;
    private List<HashMap<String,String>> list;
    ImageView bin;



    @Override
    protected void onStart() {
        super.onStart();

        try {
            String[] datas = data.split("/");
            e.printStackTrace();
        }

    }

    @SuppressLint("ClickableViewAccessibility")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);





        bin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                                groupDetailsSendForNextActivity, false);
                    }
                });
                                    startActivity(intent);
                                    finish();
                                }
                            }

                        });


                return groupDetailsSendForNextActivity;
            }
        });


                }
            });
    private void loadComments() {
        final List<HashMap<String, String>> commentList = new ArrayList<>();
                .get().addOnCompleteListener(new OnCompleteListener<QuerySnapshot>() {
            @Override
    }


    public void showComment(){
        if (commentHidden){        }

    }

    @Override
    public void onBackPressed() {
        if (!commentHidden){
            showComment();
                            for (DocumentSnapshot ds : task.getResult().getDocuments()) {
                                HashMap<String, String> map = new HashMap<>();

                                list.add(map);
                            }


                            updateData(false);

                        } else {

                        }


                    }
                });
    }
}