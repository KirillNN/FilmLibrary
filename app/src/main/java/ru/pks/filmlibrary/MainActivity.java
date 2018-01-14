package ru.pks.filmlibrary;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private List<Genre> genres;
    private GenreAdapter genreAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        genres = Arrays.asList(Genre.genres);

    }

    private class GenreAdapter extends RecyclerView.Adapter<GenreViewHolder> {
        Context context;

        public GenreAdapter(Context context) {
            this.context = context;
        }

        @Override
        public GenreViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            return null;
        }

        @Override
        public void onBindViewHolder(GenreViewHolder holder, int position) {

        }

        @Override
        public int getItemCount() {
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
