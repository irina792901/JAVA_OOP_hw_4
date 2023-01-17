package service;

import dto.GroupStream;
import dto.comparator.GroupStreamComparator;

import java.util.Collections;
import java.util.List;

public class GroupStreamServiceImpl<G, I extends Number> implements GroupStreamService<GroupStream, Integer>{
    @Override
    public void streamSort(List<GroupStream> groupStream) {
        Collections.sort(groupStream, new GroupStreamComparator());
    }

    @Override
    public GroupStream save(GroupStream entity) {
        return null;
    }

    @Override
    public GroupStream findById(Integer id) {
        return null;
    }


}
