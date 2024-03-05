package com.store.payment.service.impl;

import org.springframework.stereotype.Service;

import com.store.payment.domain.Payment;
import com.store.payment.repository.PaymentRepository;
import com.store.payment.service.PaymentService;

@Service
public class PaymentServiceImpl extends GenericServiceImpl<Payment, Long, PaymentRepository> implements PaymentService {
	public PaymentServiceImpl(PaymentRepository repository) {
		super(repository);
	}
}
