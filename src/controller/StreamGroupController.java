package controller;

import data.GroupStream;
import service.GroupStreamServiceImpl;

import java.util.List;

public class StreamGroupController implements ControllerInterface<GroupStream, Integer>{
    private final GroupStreamServiceImpl<GroupStream,Integer> streamService;

    public StreamGroupController(GroupStreamServiceImpl<GroupStream, Integer> streamService) {
        this.streamService = streamService;
    }

    public void streamListSort(List<GroupStream> groupStream) {
        streamService.streamSort(groupStream);
    }

    @Override
    public GroupStream save(GroupStream entity) {
        return streamService.save(entity);
    }

    @Override
    public GroupStream findById(Integer id) {
        return streamService.findById(id);
    }
}
