package mukhlis.com.tabs.shalat.view;

import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import mukhlis.com.tabs.R;
import mukhlis.com.tabs.shalatdetail.view.ShalatDetailActivity;

/**
 * Created by yahyamukhlis on 12/10/15.
 */
public class ShalatViewAdapter extends RecyclerView.Adapter<ShalatViewAdapter.ViewHolder> {

    private String[] mDataset;

    private ShalatView mShalatView;

    public ShalatViewAdapter(ShalatView shalatView, String[] dataset) {
        this.mShalatView = shalatView;
        this.mDataset = dataset;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_shalat, parent,
                false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, final int position) {
        holder.mView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mShalatView.showShalatDetail(mDataset[position]);
            }
        });

        holder.mTextView.setText(position + 1 + ". " + mDataset[position]);
    }

    @Override
    public int getItemCount() {
        return mDataset.length;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        public View mView;

        public TextView mTextView;

        public ViewHolder(final View view) {
            super(view);
            mView = view;
            mTextView = (TextView) view.findViewById(R.id.title);
        }
    }

}
