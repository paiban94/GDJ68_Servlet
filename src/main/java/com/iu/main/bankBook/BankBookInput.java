package com.iu.main.bankBook;

import java.util.Scanner;

public class BankBookInput {
	
	private Scanner sc;
	
	public BankBookInput() {
		this.sc = new Scanner(System.in);
	}
	
	public BankBookDTO bankBookAdd() {
		BankBookDTO bankBookDTO = new BankBookDTO();
		System.out.println("상품명을 입력하세요");
		bankBookDTO.setBookName(sc.next());
		
		System.out.println("이자율 입력하세요");
		double rate = sc.nextDouble();
		bankBookDTO.setBookRate(rate);
		
		System.out.println("판매여부 입력하세요");
		int sale= sc.nextInt();
		bankBookDTO.setBookSale(sale);
		
		return bankBookDTO;
	}
	
	

}
