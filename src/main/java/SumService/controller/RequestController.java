package SumService.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import SumService.entity.Num;
import SumService.entity.RequestSum;
import SumService.entity.StatusInfo;
import SumService.service.NumService;

@Controller
public class RequestController {

    @Autowired
    private NumService numService;

    @PostMapping("/add")
    public ResponseEntity<StatusInfo> add(@RequestBody final Num num) {
        numService.add(num);
        return new ResponseEntity<>(new StatusInfo(200, "OK"), HttpStatus.OK);
    }

    @PostMapping("/remove")
    public ResponseEntity<StatusInfo> remove(@RequestBody final Num num) {
        numService.deleteByName(num.getName());
        return new ResponseEntity<>(new StatusInfo(200, "OK"), HttpStatus.OK);
    }

    @PostMapping("/sum")
    public ResponseEntity<StatusInfo> sum(@RequestBody final RequestSum request) {
        Integer sum = numService.sum(request.getFirst(), request.getSecond());
        return new ResponseEntity<>(new StatusInfo(sum, 200, "OK"), HttpStatus.OK);
    }
}