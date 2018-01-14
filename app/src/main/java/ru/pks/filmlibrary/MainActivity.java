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

import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView list;
    private List<Genre> genres;
    private GenreAdapter genreAdapter;

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
        public void onBindViewHolder(GenreViewHolder holder, int position) {
            holder.nameView.setText(genreList.get(position).getName());
            holder.descView.setText(genreList.get(position).getDescription());
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
