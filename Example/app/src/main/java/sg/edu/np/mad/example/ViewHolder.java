package sg.edu.np.mad.example;

import android.view.View;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

public class ViewHolder extends RecyclerView.ViewHolder {
    TextView txt;
    public ViewHolder(View itemView){
        super(itemView);
        txt = itemView.findViewById(R.id.textView3);
    }
}
