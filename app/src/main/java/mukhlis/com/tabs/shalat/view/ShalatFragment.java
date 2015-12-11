package mukhlis.com.tabs.shalat.view;

import android.content.Intent;
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
import mukhlis.com.tabs.shalatdetail.view.ShalatDetailActivity;

/**
 * Created by yahyamukhlis on 12/8/15.
 */
public class ShalatFragment extends Fragment implements ShalatView {

    private View mRootView;

    private RecyclerView mRecyclerView;

    private RecyclerView.Adapter mAdapter;

    private RecyclerView.LayoutManager mLayoutManager;

    private List<String> mDataset;

    public ShalatFragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        if (mRootView == null) {
            mRootView = inflater.inflate(R.layout.fragment_shalat, container, false);

            mRecyclerView = (RecyclerView) mRootView.findViewById(R.id.recycler_view);
            mRecyclerView.setHasFixedSize(true);

            mLayoutManager = new LinearLayoutManager(getActivity());
            mRecyclerView.setLayoutManager(mLayoutManager);

            populateData();
            mAdapter = new ShalatViewAdapter(this, mDataset.toArray(new String[mDataset.size()]));
            mRecyclerView.setAdapter(mAdapter);
        }
        return mRootView;
    }

    private void populateData() {
        mDataset = new ArrayList<>();
        mDataset.add("Niat");
        mDataset.add("Takbiratul Ihram");
        mDataset.add("Membaca Doa Iftitah");
        mDataset.add("Membaca Al-Fatihah");
        mDataset.add("Rukuk");
        mDataset.add("I'tidal");
        mDataset.add("Sujud");
        mDataset.add("Duduk diantara 2 sujud");
        mDataset.add("Tahiyat Awal dan Akhir");
        mDataset.add("Salam");
    }

    @Override
    public void showShalatDetail(String title) {
        Intent intent = new Intent(getActivity(), ShalatDetailActivity.class);
        intent.putExtra("title", title);
        startActivity(intent);
    }
}
