package pt.dbmg.mobiletaiga.network;

import android.content.Context;
import androidx.core.util.Pair;
import com.maddog05.maddogutilities.callback.Callback;
import pt.dbmg.mobiletaiga.core.entity.output.OutputGetQuota;
import pt.dbmg.mobiletaiga.repository.entity.output.SearchDetail;

public interface LogicNetwork {
    void searchWithPhoto(Context context,
            String encodedImage,
            String filter,
            Callback<Pair<String, SearchDetail>> callback);

    void getQuota(Context context,
            Callback<Pair<String, OutputGetQuota>> callback);
}
