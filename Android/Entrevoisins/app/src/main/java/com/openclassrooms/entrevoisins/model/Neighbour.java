package com.openclassrooms.entrevoisins.model;

import com.openclassrooms.entrevoisins.service.NeighbourApiService;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

/**
 * Model object representing a Neighbour
 */
public class Neighbour implements Serializable {

    /**
     * Identifier
     */
    private Integer id;

    /**
     * Full name
     */
    private String name;

    /**
     * Avatar
     */
    private String avatarUrl;

    /**
     * Favorite
     */

    private boolean favorite;


    private NeighbourApiService apiService; // TODO: A utiliser
    private Object Neighbour;

    public Neighbour(NeighbourApiService apiService) {
        this.apiService = apiService;
    }


    /**
     * Constructor
     *
     * @param id
     * @param name
     * @param avatarUrl
     * @param boolean   favorite
     */
    public Neighbour(Integer id, String name, String avatarUrl, boolean favorite
    ) {
        this.id = id;
        this.name = name;
        this.avatarUrl = avatarUrl;
        this.favorite = favorite;


    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAvatarUrl() {
        return avatarUrl;
    }


    public boolean getFavorite() {
        return favorite;
    }

    /**
     * test toggle_fav_btn  if B is different than b
     */
    public void toggleFavoriteButton() {
        favorite = !favorite;

    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Neighbour neighbour = (Neighbour) o;
        return Objects.equals(id, neighbour.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
