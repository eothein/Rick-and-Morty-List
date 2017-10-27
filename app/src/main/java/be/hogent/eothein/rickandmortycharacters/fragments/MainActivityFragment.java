package be.hogent.eothein.rickandmortycharacters.fragments;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import be.hogent.eothein.rickandmortycharacters.R;
import be.hogent.eothein.rickandmortycharacters.adapters.RickAndMortyAdapter;
import be.hogent.eothein.rickandmortycharacters.interfaces.RecyclerViewItemClickListener;
import be.hogent.eothein.rickandmortycharacters.models.RickAndMortyCharacter;
import be.hogent.eothein.rickandmortycharacters.util.CustomRVItemTouchListener;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    private RecyclerView recyclerView;

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_main, container, false);
        recyclerView = (RecyclerView) v.findViewById(R.id.recyclerview);
        return v;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        final RickAndMortyAdapter adapter = new RickAndMortyAdapter(generateData(),getActivity().getApplicationContext());
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity().getApplicationContext()));
        RecyclerView.ItemAnimator itemAnimator = new DefaultItemAnimator();
        itemAnimator.setAddDuration(1000);
        itemAnimator.setRemoveDuration(1000);
        recyclerView.setItemAnimator(itemAnimator);

        recyclerView.addOnItemTouchListener(new CustomRVItemTouchListener(getContext(), recyclerView, new RecyclerViewItemClickListener() {
            @Override
            public void onClick(View view, int position) {
                adapter.remove(position);
            }

            @Override
            public void onLongClick(View view, int position) {

            }
        }));
    }


    private List<RickAndMortyCharacter> generateData() {
        List<RickAndMortyCharacter> data = new ArrayList<>();

        for (int i = 0; i < 10; i++){

            RickAndMortyCharacter evilMorty = new RickAndMortyCharacter(R.mipmap.evilmorty, getString(R.string.evilmorty), getString(R.string.evilmortydescription));

        RickAndMortyCharacter rick = new RickAndMortyCharacter(R.mipmap.ricksanchez, getString(R.string.ricksanchez),
                getString(R.string.rickdescription));

        RickAndMortyCharacter morty = new RickAndMortyCharacter(R.mipmap.morty, getString(R.string.morty),
                getString(R.string.mortydescription));

        RickAndMortyCharacter buthole = new RickAndMortyCharacter(R.mipmap.mrpoopybutthole, getString(R.string.poopy),
                getString(R.string.pooptydescription));

        RickAndMortyCharacter meeseeks = new RickAndMortyCharacter(R.mipmap.meeseeks, getString(R.string.meeseeks),
                getString(R.string.meeseeksdescription));


        data.add(morty);
        data.add(rick);
        data.add(buthole);
        data.add(meeseeks);
        data.add(evilMorty);
    }

        return data;
    }
}
