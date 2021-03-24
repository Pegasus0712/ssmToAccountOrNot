package com.copasso.billbook.dao;

import com.copasso.billbook.bean.First;

import java.util.List;

public interface FirstMapper {
    First selectFirstByUserIdWithName(Long uid, String name);
    List<First> selectFirstByUserIdWithInOrOut(Long uid, String inorout);
}
