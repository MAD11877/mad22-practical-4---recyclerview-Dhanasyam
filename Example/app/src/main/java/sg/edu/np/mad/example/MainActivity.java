package sg.edu.np.mad.example;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<String> movieList = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        movieList.add("Samsung");
        movieList.add("Apple");
        movieList.add("Huawei");
        movieList.add("Sony");
        movieList.add("Acer");
        movieList.add("Acer");
        movieList.add("Acer");
        movieList.add("Acer");
        movieList.add("Acer");
        movieList.add("Acer");
        movieList.add("Acer");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        RecyclerView recyclerView = findViewById(R.id.RView);
        adapter mAdapter = new adapter(movieList);

        LinearLayoutManager mLayoutManager = new LinearLayoutManager(this);

        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(mAdapter);
    }
}