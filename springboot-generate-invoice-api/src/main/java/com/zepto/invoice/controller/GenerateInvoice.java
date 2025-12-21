package com.zepto.invoice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.zepto.invoice.entity.InvoiceEntity;
import com.zepto.invoice.request.InvoiceRequest;
import com.zepto.invoice.service.InvoiceService;

@RestController

public class GenerateInvoice {
	@Autowired
	InvoiceService invoiceService;

	@PostMapping("generateInvoice")
	public String generateInvoice(@RequestBody InvoiceRequest invoiceRequest) {
		int invId = invoiceService.createInvoice(invoiceRequest);
		return "Your invoice has been generated with ivoice id " + invId;
	}

	@PatchMapping("updateInvoice/{invId}")
	public String updateInovoices(@RequestBody InvoiceRequest invoiceRequest, @PathVariable int invId) {
		invoiceService.updateInvoice(invId, invoiceRequest);
		return "your invoices updated successfully";
	}

	@GetMapping("getOneInvoive/{invId}")
	public ResponseEntity getOneInvoice(@PathVariable int invId) {
		InvoiceEntity invoiceEntity = invoiceService.getInvoice(invId);
		return ResponseEntity.ok(invoiceEntity);
	}
	@GetMapping("getInvoices")
	public ResponseEntity getAllInvoice() {
		List<InvoiceEntity> invoices = invoiceService.getAllInvoices();
		return ResponseEntity.ok(invoices);
	}
	@DeleteMapping("deleteInvoices/{invId}")
	public ResponseEntity deleteInvoice(@PathVariable int invId) {
		invoiceService.deleteInvoice(invId);
		return ResponseEntity.ok("invoive deleted successfully");
	}
}
