package c.ardv.museumapp;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by arov on 16.04.2018.
 */

public class Adapter extends RecyclerView.Adapter<ViewHolder> {

    Context context;

    public Adapter(Context context) {
        this.context = context;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.layout_item, parent, false);
        ViewHolder vH= new ViewHolder(view);
        return vH;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        final Museum museum;
        String title;
        holder.titleTextView.setText(title);
    }

    @Override
    public int getItemCount() {
        return 0;
    }


}
