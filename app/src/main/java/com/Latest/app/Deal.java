
import android.os.Parcel;
import android.os.Parcelable;

public class Deal implements Parcelable {
    private String group_name;

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
        dest.writeString(group_name);
    }
}
