package data.comparator;

import data.GroupStream;

import java.util.Comparator;

public class GroupStreamComparator implements Comparator<GroupStream> {

    @Override
    public int compare(GroupStream groupStream1, GroupStream groupStream2) {
        int from_groupStream1 = groupStream1.getStudentGroupList().size();
        int from_groupStream2 = groupStream2.getStudentGroupList().size();
        return Integer.compare(from_groupStream1, from_groupStream2);
    }
}
