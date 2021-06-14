import com.squareup.picasso.Picasso;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class EntertainmentFragment extends Fragment {


    }

           private List<HashMap<String, String>> newsData;

        public Adapter(List<HashMap<String, String>> newsData) {
            this.newsData = newsData;
        }

        @Override
                    e.printStackTrace();
                } catch (Throwable throwable) {
                    throwable.printStackTrace();
                }

            }
}

        @Override
        public int getItemCount() {
                if (swipe.isRefreshing()) swipe.setRefreshing(false);
            }
        });

    }

}