package com.openclassrooms.entrevoisins.service;

import com.openclassrooms.entrevoisins.model.Neighbour;

import java.util.ArrayList;
import java.util.List;

/**
 * Dummy mock for the Api
 */
public class DummyNeighbourApiService implements NeighbourApiService {

    private List<Neighbour> neighbours = DummyNeighbourGenerator.generateNeighbours();


    /**
     * {@inheritDoc}
     */
    @Override
    public List<Neighbour> getNeighbours() {
        return neighbours;
    }

    @Override
    public List<Neighbour> getFav() {
        List<Neighbour> favList = new ArrayList<>();
        for (Neighbour neigh : neighbours) {
            if (neigh.getFavorite()) {
                favList.add(neigh);
            }
        }
        return favList;
    }


    @Override
    public void changeFavStatus(Neighbour neighbour) {
        int neighbourIndex = neighbours.indexOf(neighbour);
        neighbours.get(neighbourIndex).toggleFavoriteButton();
    }


    /**
     * {@inheritDoc}
     */
    @Override
    public void deleteNeighbour(Neighbour neighbour) {
        neighbours.remove(neighbour);
    }
}
