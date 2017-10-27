package be.hogent.eothein.rickandmortycharacters.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

import java.util.Collections;
import java.util.List;

import be.hogent.eothein.rickandmortycharacters.R;
import be.hogent.eothein.rickandmortycharacters.adapters.ViewHolders.RickAndMortyViewHolder;
import be.hogent.eothein.rickandmortycharacters.models.RickAndMortyCharacter;

/**
 * Created by eothein on 25.10.17.
 */

public class RickAndMortyAdapter extends RecyclerView.Adapter<RickAndMortyViewHolder> {

    /**
     * Data class containing the characters which are shown in the list
     */
    List<RickAndMortyCharacter> list = Collections.emptyList();


    public RickAndMortyAdapter(List<RickAndMortyCharacter> list, Context context) {
        this.list = list;
        this.context = context;
    }


    /**
     * Reference to our activity
     */
    private Context context;

    @Override
    public RickAndMortyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        //Inflate the layout, initialize the View Holder
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_layout, parent, false);
        RickAndMortyViewHolder holder = new RickAndMortyViewHolder(v);
        Log.d(this.getClass().getSimpleName(), "Creating viewholder");
        return holder;

    }

    @Override
    public void onBindViewHolder(RickAndMortyViewHolder holder, int position) {
        Log.d(this.getClass().getSimpleName(), "Binding position " + position);
        holder.setData(list.get(position));
    }

    @Override
    public int getItemCount() {
        //returns the number of elements the RecyclerView will display
        return list.size();
    }

    /**
     *  Insert a new item to the RecyclerView on a predefined position
     * @param position The position to insert the new data
     * @param data The data to insert
     */
    public void insert(int position, RickAndMortyCharacter data) {
        list.add(position, data);
        notifyItemInserted(position);
    }

    /**
     *  Remove a RecyclerView item containing a specified Data object
     * @param position The pôstition of the data to remove
     */
    public void remove(int position) {
        list.remove(position);
        notifyItemRemoved(position);
    }
}
