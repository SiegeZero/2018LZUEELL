package com.gsb.BasicObject.MBGDAO;

import com.gsb.BasicObject.MBGPOJO.MeetingRoom;
import com.gsb.BasicObject.MBGPOJO.MeetingRoomExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MeetingRoomMapper {
    long countByExample(MeetingRoomExample example);

    int deleteByExample(MeetingRoomExample example);

    int insert(MeetingRoom record);

    int insertSelective(MeetingRoom record);

    List<MeetingRoom> selectByExampleWithBLOBs(MeetingRoomExample example);

    List<MeetingRoom> selectByExample(MeetingRoomExample example);

    int updateByExampleSelective(@Param("record") MeetingRoom record, @Param("example") MeetingRoomExample example);

    int updateByExampleWithBLOBs(@Param("record") MeetingRoom record, @Param("example") MeetingRoomExample example);

    int updateByExample(@Param("record") MeetingRoom record, @Param("example") MeetingRoomExample example);
}