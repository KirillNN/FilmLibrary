package ru.pks.filmlibrary;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private List<Genre> genres;
//    private GenreAdapter genreAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        genres = Arrays.asList(Genre.genres);

    }

    private class GenreViewHolder extends RecyclerView.ViewHolder {

        public GenreViewHolder(View itemView) {
            super(itemView);
        }
    }
}
