package ru.pks.filmlibrary;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.Arrays;
import java.util.List;

public class AMoveActivity extends AppCompatActivity {

    //Глупый вопрос! Почему AMoveActivity.java так странно отображается - как 3-и в одном?? а
    //MainActivity - стандартно??
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
    Context context;
    List<ActionMovie> amoveList;

    public AMoveAdapter(Context context, List<ActionMovie> amoveList) {
        this.context = context;
        this.amoveList = amoveList;
    }

    @Override
    public AMoveViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(context).inflate(R.layout.amove_item,
                parent, false);
        return new AMoveViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(final AMoveViewHolder holder, final int position) {
        holder.nameView.setText(amoveList.get(position).getName());
        holder.nameView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                amoveList.remove(holder.getAdapterPosition());
                //Удаление не сработало :-(
            }
        });
        holder.descView.setText(amoveList.get(position).getDescription());
        holder.nameView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                amoveList.remove(holder.getAdapterPosition());
            }
        });
    }

    @Override
    public int getItemCount() {
        if (amoveList != null) {
            return amoveList.size();
        }
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