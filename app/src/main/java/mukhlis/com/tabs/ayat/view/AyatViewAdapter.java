package mukhlis.com.tabs.ayat.view;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import mukhlis.com.tabs.R;
import mukhlis.com.tabs.model.Ayat;

/**
 * Created by yahyamukhlis on 12/10/15.
 */
public class AyatViewAdapter extends RecyclerView.Adapter<AyatViewAdapter.ViewHolder> {

    private Ayat[] mDataset;

    public AyatViewAdapter(Ayat[] dataset) {
        mDataset = dataset;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_ayat, parent,
                false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, final int position) {
        Ayat ayat = mDataset[position];
        holder.mTopic.setText(ayat.getTopik());
        holder.mSuratAyat.setText(ayat.getNamaSurat() + " ayat " + ayat.getAyat());
        holder.mTerjemahan.setText(ayat.getTerjemahan());
    }

    @Override
    public int getItemCount() {
        return mDataset.length;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        public View mItemView;

        public ImageView mImage;

        public TextView mTopic;

        public TextView mSuratAyat;

        public TextView mTerjemahan;

        public ViewHolder(final View view) {
            super(view);
            mItemView = view;
            mImage = (ImageView) view.findViewById(R.id.image);
            mTopic = (TextView) view.findViewById(R.id.topik);
            mSuratAyat = (TextView) view.findViewById(R.id.surat_ayat);
            mTerjemahan = (TextView) view.findViewById(R.id.terjemahan);
        }
    }

}
