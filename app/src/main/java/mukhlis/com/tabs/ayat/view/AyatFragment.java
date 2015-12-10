package mukhlis.com.tabs.ayat.view;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import mukhlis.com.tabs.R;
import mukhlis.com.tabs.model.Ayat;
import mukhlis.com.tabs.shalat.view.ShalatViewAdapter;

/**
 * Created by yahyamukhlis on 12/8/15.
 */
public class AyatFragment extends Fragment {

    private View mRootView;

    private RecyclerView mRecyclerView;

    private RecyclerView.Adapter mAdapter;

    private RecyclerView.LayoutManager mLayoutManager;

    private List<Ayat> mDataset;

    public AyatFragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        if (mRootView == null) {
            mRootView = inflater.inflate(R.layout.fragment_ayat, container, false);

            mRecyclerView = (RecyclerView) mRootView.findViewById(R.id.recycler_view);
            mRecyclerView.setHasFixedSize(true);

            mLayoutManager = new LinearLayoutManager(getActivity());
            mRecyclerView.setLayoutManager(mLayoutManager);

            populateData();
            mAdapter = new AyatViewAdapter(mDataset.toArray(new Ayat[mDataset.size()]));
            mRecyclerView.setAdapter(mAdapter);
        }
        return mRootView;
    }

    private void populateData() {
        mDataset = new ArrayList<>();
        mDataset.add(new Ayat("The Book", "Al-Baqarah", 2, "This is the book about which there is no " +
                "doubt, a guidance for these conscious of Allah"));
        mDataset.add(new Ayat("Ant", "An-Naml", 18, "until, when they came upon the valley of the ants," +
                "an ant said, \"O ants, enter your dwellings that ou not be crushed by Solomon" +
                "and his soldiers while they perceive not"));
    }
}
