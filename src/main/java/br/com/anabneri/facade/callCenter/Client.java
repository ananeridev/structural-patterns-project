package br.com.anabneri.facade.callCenter;

import java.util.List;

import br.com.anabneri.facade.callCenter.model.Card;
import br.com.anabneri.facade.callCenter.model.Register;
import br.com.anabneri.facade.callCenter.services.CardService;
import br.com.anabneri.facade.callCenter.services.PaymentService;
import br.com.anabneri.facade.callCenter.services.RegisterService;
import br.com.anabneri.facade.callCenter.services.ReportService;
import br.com.anabneri.facade.callCenter.services.SecurityService;

public class Client {

	public static void main(String[] args) {
		CardService cardService = new CardService();
		RegisterService registerService = new RegisterService();
		ReportService reportService = new ReportService(registerService);
		PaymentService paymentService = new PaymentService(registerService);
		SecurityService securityService = new SecurityService(cardService, registerService);
		
		Card card = cardService.getCardByUser(123456L);
		System.out.println(card);
		
		reportService.getSumary(card);
		
		paymentService.getPaymentInfoByCard(card);
		
		//Remove last register, block the card e order a new one
		List<Register> registers = registerService.getRegistersByCard(card);
		registerService.removeByIndex(card, registers.size() - 1);
		List<Register> pendingRegisters = securityService.blockCard(card);
		Card newCard = cardService.createNewCard(123456L, 33445566L);
		registerService.addCardRegisters(newCard, pendingRegisters);
		reportService.getSumary(newCard);
	}
}
