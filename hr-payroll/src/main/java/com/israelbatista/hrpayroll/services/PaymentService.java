package com.israelbatista.hrpayroll.services;


import com.israelbatista.hrpayroll.entities.Payment;
import com.israelbatista.hrpayroll.entities.Worker;
import com.israelbatista.hrpayroll.feignclients.WorkerFeignClient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class PaymentService {

    @Autowired
    private WorkerFeignClient workerFeignClient;

    public Payment getPayment(Long workerId, int days) {
        Worker worker = workerFeignClient.getWorkerfindById(workerId).getBody();
        return new Payment(worker.getName(), worker.getDailyIncome(), days);
    }
}
