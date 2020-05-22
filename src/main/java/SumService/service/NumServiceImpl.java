package SumService.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import SumService.entity.Num;
import SumService.exception.BadRequestException;
import SumService.exception.NoSuchNumberException;
import SumService.repository.NumRepository;

@Service
public class NumServiceImpl implements NumService {

    @Autowired
    private NumRepository repo;

    @Override
    public void add(Num num) {
        for (Num object : repo.findAll()) {
            if (object.getName().contains(num.getName())) {
                throw new BadRequestException();
            }
        }
        if (num.getValue() == null)
            throw new BadRequestException();
        repo.save(num);
    }

    @Override
    public void deleteByName(String name) {
        Num number = null;
        for (Num object : repo.findAll()) {
            if (object.getName().contains(name)) {
                number = repo.findById(object.getId()).orElse(null);
            }
        }
        if (number == null) {
            throw new NoSuchNumberException();
        }
        else {
            repo.deleteById(number.getId());
        }
    }

    @Override
    public Integer sum(String first, String second) {
        Num num1 = null;
        Num num2 = null;
        for (Num num : repo.findAll()) {
            if (num.getName().equals(first)) {
                num1 = num;
            }
            if (num.getName().equals(second)) {
                num2 = num;
            }
        }
        if (num1 == null | num2 == null)
            throw new NoSuchNumberException();

        return num1.getValue() + num2.getValue();
    }
}