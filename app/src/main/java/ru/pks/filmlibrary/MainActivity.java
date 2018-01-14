package ru.pks.filmlibrary;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView list;
    private List<Genre> genres;
    private GenreAdapter genreAdapter;

    protected int genreNum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        genres = Arrays.asList(Genre.genres);
        genreAdapter = new GenreAdapter(this, genres);

        list = findViewById(R.id.genre_list_recycler_view);

        LinearLayoutManager linearLayoutManager =
                new LinearLayoutManager(this);
        list.setLayoutManager(linearLayoutManager);
        list.setAdapter(genreAdapter);

    }

    protected void startSelectActivity(int select) {
        if (select == 0) {
            String n = String.valueOf(select);
            Toast.makeText(MainActivity.this, n, Toast.LENGTH_SHORT).show();
        }
        if (select == 2) {

        }
        if (select == 3) {

        }
    }

    private class GenreAdapter extends RecyclerView.Adapter<GenreViewHolder> {
        Context context;
        List<Genre> genreList;

        public GenreAdapter(Context context, List<Genre> genreList) {
            this.context = context;
            this.genreList = genreList;
        }

        @Override
        public GenreViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View itemView = LayoutInflater.from(context).inflate(R.layout.genre_item,
                    parent, false);
            return new GenreViewHolder(itemView);
        }

        @Override
        public void onBindViewHolder(final GenreViewHolder holder, int position) {
            holder.nameView.setText(genreList.get(position).getName());
            holder.descView.setText(genreList.get(position).getDescription());
            holder.nameView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    genreNum = holder.getAdapterPosition();
                    startSelectActivity(genreNum);
                }
            });
        }

        @Override
        public int getItemCount() {
            if (genreList != null) {
                return genreList.size();
            }
            return 0;
        }
    }

    private class GenreViewHolder extends RecyclerView.ViewHolder {
        TextView nameView;
        TextView descView;

        public GenreViewHolder(View itemView) {
            super(itemView);
            nameView = itemView.findViewById(R.id.genreNameView);
            descView = itemView.findViewById(R.id.genreDescView);
        }
    }
}
