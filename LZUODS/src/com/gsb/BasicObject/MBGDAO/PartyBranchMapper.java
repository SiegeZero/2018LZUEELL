package com.gsb.BasicObject.MBGDAO;

import com.gsb.BasicObject.MBGPOJO.PartyBranch;
import com.gsb.BasicObject.MBGPOJO.PartyBranchExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PartyBranchMapper {
    long countByExample(PartyBranchExample example);

    int deleteByExample(PartyBranchExample example);

    int deleteByPrimaryKey(Integer partyBranchNo);

    int insert(PartyBranch record);

    int insertSelective(PartyBranch record);

    List<PartyBranch> selectByExampleWithBLOBs(PartyBranchExample example);

    List<PartyBranch> selectByExample(PartyBranchExample example);

    PartyBranch selectByPrimaryKey(Integer partyBranchNo);

    int updateByExampleSelective(@Param("record") PartyBranch record, @Param("example") PartyBranchExample example);

    int updateByExampleWithBLOBs(@Param("record") PartyBranch record, @Param("example") PartyBranchExample example);

    int updateByExample(@Param("record") PartyBranch record, @Param("example") PartyBranchExample example);

    int updateByPrimaryKeySelective(PartyBranch record);

    int updateByPrimaryKeyWithBLOBs(PartyBranch record);

    int updateByPrimaryKey(PartyBranch record);
}