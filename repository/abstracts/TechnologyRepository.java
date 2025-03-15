package Intro.odevhafta4.repository.abstracts;

import Intro.odevhafta4.entity.Technology;

import java.util.List;

public interface TechnologyRepository {

    void add(Technology technology);
    List<Technology> getAll();
    void delete(int technology);
    void update(int index , Technology technology);
    void getById(int id);
}
