package service;

import dto.GroupStream;

import java.util.List;

public interface GroupStreamService<V extends GroupStream, I> {
    void streamSort(List<V> groupStream);

    V save(V entity);

    V findById(I id);
}
