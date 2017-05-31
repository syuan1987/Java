package cn.syuan.jnshu.dao;

import cn.syuan.jnshu.model.EntryForm;
import cn.syuan.jnshu.model.EntryFormWithBLOBs;

public interface EntryFormMapper {
    int deleteByPrimaryKey(Integer id);

    int insert();

    int insertSelective(EntryFormWithBLOBs record);

    EntryFormWithBLOBs selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(EntryFormWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(EntryFormWithBLOBs record);

    int updateByPrimaryKey(Integer id);

}