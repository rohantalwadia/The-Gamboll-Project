


import android.Manifest;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import java.net.URI;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import kotlin.jvm.internal.Ref;
import uk.co.samuelwall.materialtaptargetprompt.MaterialTapTargetPrompt;

public class CreateActivity extends AppCompatActivity implements PopupMenu.OnMenuItemClickListener {

    Button shoot;
    ImageButton imageButton4;
    ImageButton imageButton;
    Button saveQuote = null;
    int participantNumber = -1;
    URI deeplink = null;
    ImageView videoBtn1, videoBtn2, videoBtn3, videoBtn4, videoBtn5;
    private GroupDetails RefreshDetails = null;
    SharedPreferences sharedPreferences;

    boolean openMenu = true;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create);

        sharedPreferences = ApplicationController.getSharedPerfs();
                    .setPromptStateChangeListener(new MaterialTapTargetPrompt.PromptStateChangeListener()
                has pressed the prompt target
                            }
                        }
                    })
                    .show();

        }


        try {
            Intent Ii = getIntent();
            String data = String.valueOf(Ii.getData());
        lse if(!data.equalsIgnoreCase("null")){
                
                String[] datas = data.split("/");
                //   getPostData(datas[0], datas[1]);

        

                      

                        @Override
                        public void onCancelled(@NonNull DatabaseError databaseError) {

                        }
                    });

                }else
                {
                                                                        }
                                                                        System.out.println("Array: " + groupListArray);
                          
                                startActivity(new Intent(CreateActivity.this, HomeActivity.class));
                                finish();
                           }
                        });

            }
        }

    }

    private void updateJoinDetails(String GroupN, List<String> joinedGroupListArray, DocumentReference userDocument) {
                                  }
                                        }
                                    }
                                }
                            } else {
                        }
                        if (task.isComplete()) {

                            UpdateinGroup(participantIDArray, participantNameArray, participantURLArray, groupDocument);
                        }
                    }
                });

    }


    private void removeJoinDetails(String GroupN, List<String> joinedGroupListArray, DocumentReference userDocument) {
                                                       participantURLArray.add((((ArrayList) value).get(loopIndex)).toString());

                                                }
                                                System.out.println("Array: " + participantURLArray);

                                            }
                                        }
                                    }
                                }
                            } else {
                                Log.d("Logs", "No such document");
                            }
                        } else {
                            Log.d("logs", "get failed with ", task.getException());
                        }
                        if (task.isComplete()) {

                            removeFromGroup(participantIDArray, participantNameArray, participantURLArray, groupDocument);
                        }
                    }
                });

    }



                                if (((ArrayList) value).size() > 0) {
                                                for (int loopIndex = 0; loopIndex < ((ArrayList) value).size(); loopIndex++) {
                                              System.out.println("Array: " + participantURLArray);

                                            }
                                        }
                                    }
                                }
                            } else {
                                Log.d("Logs", "No such document");
                            }
                        } else {
                            Log.d("logs", "get failed with ", task.getException());
                        }
                        if (task.isComplete()) {

                            removeFromGroup(participantIDArray, participantNameArray, participantURLArray, groupDocument);
                        }
                    }
                });

    }


    private void removeFromGroup(List<String> participantIDArray, List<String> participantNameArray, List<String> participantURLArray, DocumentReference groupDocument) {
        groupDocument.update("participantId", participantIDArray);
       


        groupDocument.update("participantURL", participantURLArray);


    }

    private void setValueInRealTime(String GroupName) {
        deal = new Deal();
      ((FrameLayout)getWindow().getDecorView()).addView(this.mCustomView, new FrameLayout.LayoutParams(-1, -1));
            getWindow().getDecorView().setSystemUiVisibility(3846 | View.SYSTEM_UI_FLAG_LAYOUT_STABLE);
        }
    }
}


