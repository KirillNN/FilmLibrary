package ru.pks.filmlibrary;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.Arrays;
import java.util.List;

public class AMoveActivity extends AppCompatActivity {
    private RecyclerView amove;
    private List<ActionMovie> amoveList;
    private AMoveAdapter aMoveAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_amove);

        amoveList = Arrays.asList(ActionMovie.amove);
        aMoveAdapter = new AMoveAdapter(this, amoveList);
        amove = findViewById(R.id.amove_list_recycler_view);

        GridLayoutManager gridLayoutManager = new GridLayoutManager(this, 2);

        amove.setLayoutManager(gridLayoutManager);
        amove.setAdapter(aMoveAdapter);

    }
}
class AMoveAdapter extends RecyclerView.Adapter<AMoveViewHolder> {

    @Override
    public AMoveViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(AMoveViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
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