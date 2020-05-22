package SumService.service;

import SumService.entity.Num;

public interface NumService {
    void add(Num num);

    void deleteByName(String name);

    Integer sum(String first, String second);
}