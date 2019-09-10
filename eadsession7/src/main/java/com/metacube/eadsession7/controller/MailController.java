package com.metacube.eadsession7.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.metacube.eadsession7.service.MailSender;

/**
 * This is mail controller
 *
 */
@RestController
public class MailController {

	// This is reference of MailSender Interface
	private MailSender mailSender;

	@Autowired
	public void setMailSender(@Qualifier("smtpMailSender") MailSender mailSender) {
		this.mailSender = mailSender;
	}

	/**
	 * This method send mail
	 * 
	 * @return success message or failed message
	 */
	@GetMapping("/sendMail")
	public String sendMail() {

		System.out.println("in controller");
		boolean result = mailSender.sendMail();
		if (result) {
			return "Send Successful";
		} else {
			return "Send Failed";
		}
	}
}
