package mukhlis.com.tabs.shalat.view;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import mukhlis.com.tabs.R;

/**
 * Created by yahyamukhlis on 12/10/15.
 */
public class ShalatViewAdapter extends RecyclerView.Adapter<ShalatViewAdapter.ViewHolder> {

    private String[] mDataset;

    public ShalatViewAdapter(String[] dataset) {
        mDataset = dataset;
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
                Toast.makeText(v.getContext(), mDataset[position], Toast.LENGTH_SHORT);
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
