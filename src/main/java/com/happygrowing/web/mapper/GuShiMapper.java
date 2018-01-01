package com.happygrowing.web.mapper;


import com.happygrowing.web.entity.GuShi;

import java.util.List;

public interface GuShiMapper {

    public List<GuShi> getGuShiList();
    public void addGuShi(GuShi guShi);
}
