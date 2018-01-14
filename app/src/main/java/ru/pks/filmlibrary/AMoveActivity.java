package ru.pks.filmlibrary;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

public class AMoveActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_amove);
    }
}

class AMoveViewHolder extends RecyclerView.ViewHolder {
    TextView nameView;
    TextView descView;

    public AMoveViewHolder(View itemView) {
        super(itemView);
        nameView = itemView.findViewById(R.id.amoveNameView);
        descView = itemView.findViewById(R.id.amoveDescView);
    }
}