

import android.content.Intent;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
/**
 * A simple {@link Fragment} subclass.
 */
public class FitnessFragment extends Fragment {




    public FitnessFragment() {
    }

                    public void onComplete(@NonNull Task<QuerySnapshot> task) {
                        if (swipe.isRefreshing()) swipe.setRefreshing(false);
                        if (task.isSuccessful()) {


                            for (DocumentSnapshot ds : task.getResult().getDocuments()) {
                                HashMap<String, String> map = new HashMap<>();

                    }
                }).addOnFailureListener(new OnFailureListener() {
            @Override
            public void onFailure(@NonNull Exception e) {
                if (swipe.isRefreshing()) swipe.setRefreshing(false);
            }
        });

    }


}