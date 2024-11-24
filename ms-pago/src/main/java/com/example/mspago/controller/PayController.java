package com.example.mspago.controller;

import com.example.mspago.entity.Pay;
import com.example.mspago.service.PayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pago")
public class PayController {
    @Autowired
    private PayService payService;
    @GetMapping
    public ResponseEntity<List<Pay>> getAll() {
        return ResponseEntity.ok(payService.list());
    }
    @GetMapping("/{id}")
    public ResponseEntity<Pay> getById(@PathVariable Integer id) {
        return ResponseEntity.ok(payService.findById(id).get());
    }
    @PostMapping
    public ResponseEntity<Pay> create(@RequestBody Pay pay) {
        return ResponseEntity.ok(payService.save(pay));
    }
    @PutMapping("/{id}")
    public ResponseEntity<Pay> update(@PathVariable Integer id,
                                       @RequestBody Pay pay) {
        pay.setId(id);
        return ResponseEntity.ok(payService.save(pay));
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<List<Pay>> delete(@PathVariable Integer id) {
        payService.delete(id);
        return ResponseEntity.ok(payService.list());
    }
}
