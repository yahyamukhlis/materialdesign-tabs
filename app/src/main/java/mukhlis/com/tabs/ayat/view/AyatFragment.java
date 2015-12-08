package mukhlis.com.tabs.ayat.view;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import mukhlis.com.tabs.R;

/**
 * Created by yahyamukhlis on 12/8/15.
 */
public class AyatFragment extends Fragment {

    public AyatFragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_shalat, container, false);
    }
}
