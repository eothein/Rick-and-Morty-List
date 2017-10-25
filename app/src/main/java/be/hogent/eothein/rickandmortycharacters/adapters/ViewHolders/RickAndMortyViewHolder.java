package be.hogent.eothein.rickandmortycharacters.adapters.ViewHolders;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import be.hogent.eothein.rickandmortycharacters.R;
import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by eothein on 25.10.17.
 */

public class RickAndMortyViewHolder extends RecyclerView.ViewHolder {

    @BindView(R.id.cardView)
    CardView cv;

    @BindView(R.id.name)
    TextView name;

    @BindView(R.id.description)
    TextView description;

    @BindView(R.id.characterImage)
    ImageView characterImage;



    public RickAndMortyViewHolder(View itemView) {
        super(itemView);
        ButterKnife.bind(this, itemView);
    }

    public CardView getCardViewv() {
        return cv;
    }

    public void setCardView(CardView cv) {
        this.cv = cv;
    }

    public TextView getName() {
        return name;
    }

    public void setName(TextView name) {
        this.name = name;
    }

    public TextView getDescription() {
        return description;
    }

    public void setDescription(TextView description) {
        this.description = description;
    }

    public ImageView getCharacterImage() {
        return characterImage;
    }

    public void setCharacterImage(ImageView characterImage) {
        this.characterImage = characterImage;
    }
}
