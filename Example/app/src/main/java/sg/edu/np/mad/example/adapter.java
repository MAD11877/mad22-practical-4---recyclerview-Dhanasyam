package sg.edu.np.mad.example;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class adapter extends RecyclerView.Adapter<ViewHolder> {
    ArrayList<String> data;

    public adapter(ArrayList<String> input){
        data = input;
    }

    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View item = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler, parent, false);
        return new ViewHolder(item);
    }

    public void onBindViewHolder(ViewHolder holder, int position){
        String s = data.get(position);
        holder.txt.setText(s);
    }

    public int getItemCount(){
        return data.size();
    }
}
