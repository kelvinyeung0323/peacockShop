package com.peacock.shop.web.mapper;

import com.peacock.shop.web.domain.Topic;
import com.peacock.shop.web.domain.TopicExample;
import com.peacock.shop.web.domain.TopicWithBLOBs;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface TopicMapper {
    int countByExample(TopicExample example);

    int deleteByExample(TopicExample example);

    int insert(TopicWithBLOBs record);

    int insertSelective(TopicWithBLOBs record);

    List<TopicWithBLOBs> selectByExampleWithBLOBs(TopicExample example);

    List<Topic> selectByExample(TopicExample example);

    int updateByExampleSelective(@Param("record") TopicWithBLOBs record, @Param("example") TopicExample example);

    int updateByExampleWithBLOBs(@Param("record") TopicWithBLOBs record, @Param("example") TopicExample example);

    int updateByExample(@Param("record") Topic record, @Param("example") TopicExample example);
}