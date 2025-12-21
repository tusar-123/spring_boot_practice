package com.zepto.invoice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zepto.invoice.entity.InvoiceEntity;
import com.zepto.invoice.repository.InvoiveRepository;
import com.zepto.invoice.request.InvoiceRequest;

@Service
public class InvoiceService {
	@Autowired
	InvoiveRepository invoiveRepository;

	public int createInvoice(InvoiceRequest invoiceRequest) {

		InvoiceEntity entity = new InvoiceEntity();
		entity.setNote(invoiceRequest.getNote());
		entity.setInvValue(invoiceRequest.getInvValue());
		entity.setDescription(invoiceRequest.getDescription());
		entity.setGstNo(invoiceRequest.getGstNo());
		entity.setStatus(invoiceRequest.getStatus());
		entity = invoiveRepository.save(entity);
		return entity.getInvId();
	}

	public List<InvoiceEntity> getAllInvoices() {
		return (List<InvoiceEntity>) invoiveRepository.findAll();
	}

	public InvoiceEntity getInvoice(int invId) {
		return invoiveRepository.findById(invId).orElse(null);
	}

	public InvoiceEntity updateInvoice(int invId, InvoiceRequest invoiceRequest) {
		InvoiceEntity existing = invoiveRepository.findById(invId).orElse(null);
		if (existing != null) {
			existing.setDescription(invoiceRequest.getDescription());
			existing.setGstNo(invoiceRequest.getGstNo());
			existing.setInvValue(invoiceRequest.getInvValue());
			existing.setNote(invoiceRequest.getNote());
			existing.setStatus(invoiceRequest.getStatus());
		}

		existing = invoiveRepository.save(existing);
		return existing;
	}

	public boolean deleteInvoice(int invId) {
		invoiveRepository.deleteById(invId);
		return true;
	}
}
