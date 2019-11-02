package org.infy.ui;

import java.time.LocalDate;
import java.util.List;

import org.infy.configuration.SpringConfig;
import org.infy.model.Policy;
import org.infy.model.PolicyReport;
import org.infy.service.InsuranceServiceImpl;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class UserInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UserInterface ui = new UserInterface();
		ui.buyPolicy();
		ui.generateReport();
		
	}
	public void buyPolicy() {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
		InsuranceServiceImpl service = ctx.getBean(InsuranceServiceImpl.class);
		Policy policy = new Policy();
		policy.setPolicyNumber("WL-553912");
		policy.setPolicyHolderName("James");
		policy.setDateOfBirth(LocalDate.of(1992, 01, 10));
		policy.setPolicyName("Retirement");
		policy.setPolicyType("Whole Life Policy");
		policy.setPremium(3500.0);
		policy.setTenureInMonths(180);
		try {
		System.out.println("The policy successfully added with policy number: "+service.buyPolicy(policy));
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		}
		
	public void generateReport() {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
		InsuranceServiceImpl service = ctx.getBean(InsuranceServiceImpl.class);
		try {
			List<PolicyReport> policyReport = service.getReport("Term Life Insurance");
			System.out.println("Policy Holder Name\tPolicy Number\tAge\tTenure(In months)");
			System.out.println("********************************************************************");
			for(PolicyReport pr:policyReport) {
				System.out.println(pr.getPolicyHolderName()+"\t\t\t"+pr.getPolicyNumber()+"\t"+pr.getPolicyHolderAge()+"\t\t"
						+pr.getTenureInMonths());
			}
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
}
