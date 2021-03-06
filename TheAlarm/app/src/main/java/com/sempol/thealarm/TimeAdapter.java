package com.sempol.thealarm;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.sempol.thealarm.model.TimeModel;

import java.util.List;

public class TimeAdapter extends RecyclerView.Adapter<TimeAdapter.ViewHolder> {
    Context context;
    List<TimeModel> times;

    public TimeAdapter(Context context, List<TimeModel> times) {
        this.context = context;
        this.times = times;
    }

    @Override
    public TimeAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.item_time,parent,false);
        ViewHolder viewHolder=new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(TimeAdapter.ViewHolder holder, int position) {
        holder.txtTime.setText(times.get(position).getTime());
        holder.getAdapterPosition();

//        times.remove(position);
//        notifyItemRemoved(position);
//        notifyItemRangeChanged(position,times.size());

    }

    @Override
    public int getItemCount() {
        return times.size();
    }



    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView txtTime;
        ImageView mDelete;
        public ViewHolder(View itemView) {
            super(itemView);
            txtTime=(TextView) itemView.findViewById(R.id.digital_clock);
            mDelete = (ImageView) itemView.findViewById(R.id.delete);
        }


    }

}
