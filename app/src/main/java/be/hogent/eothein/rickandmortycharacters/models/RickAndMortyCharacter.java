package be.hogent.eothein.rickandmortycharacters.models;

/**
 * Created by eothein on 25.10.17.
 */

public class RickAndMortyCharacter {

    private int characterImage;

    private String name;

    private String description;

    public RickAndMortyCharacter(int characterImage, String name, String description) {
        this.characterImage = characterImage;
        this.name = name;
        this.description = description;
    }

    public int getCharacterImage() {
        return characterImage;
    }

    public void setCharacterImage(int characterImage) {
        this.characterImage = characterImage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
