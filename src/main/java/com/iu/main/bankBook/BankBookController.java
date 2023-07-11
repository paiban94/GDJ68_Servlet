package com.iu.main.bankBook;

import java.util.Scanner;

public class BankBookController {

	private Scanner sc;
	private BankBookInput bankBookInput;
	private BankBookOutput bankBookOutput;
	private BankBookDAO bankBookDAO;
	
	
	public BankBookController() {
		sc = new Scanner(System.in);
		bankBookInput = new BankBookInput();
		bankBookOutput = new BankBookOutput();
		bankBookDAO = new BankBookDAO();
	}

	
	public void start() throws Exception {
		// 1. 제품 등록	
		// 2. 제품 삭제	
		// 3. 제품 조회		
		// 4. 프로그램 종료
	
		boolean flag = true;
		BankBookDTO bankBookDTO = null;
		while(flag) {
			System.out.println("1. 제품 등록");
			System.out.println("2. 제품 삭제");
			System.out.println("3. 제품 조회");
			System.out.println("4. 프로그램 종료");
		
			int select = this.sc.nextInt();
			
			switch(select) {
			case 1:
			    bankBookDTO = bankBookInput.bankBookAdd();
				select=bankBookDAO.bankBookAdd(bankBookDTO);
				if(select>0) {
					bankBookOutput.view("등록 성공");
				}else {
					bankBookOutput.view("등록 실패");
				}
				break;
			case 2:
				bankBookDTO = bankBookInput.bankBookDelete();
				select = bankBookDAO.bankBookDelete(bankBookDTO);
				String result="삭제 실패";
				if(select>0) {
					result="삭제 성공";
				}
				bankBookOutput.view(result);
				
				break;
			case 3:
				bankBookDTO = bankBookInput.bankBookDetail();
				bankBookDTO = bankBookDAO.bankBookDetail(bankBookDTO);
				if(bankBookDTO != null) {
					bankBookOutput.view(bankBookDTO);
				}else {
					bankBookOutput.view("해당 상품은 존재하지 않습니다");
				}
				break;
			default:
				flag=!flag;
			
			}
			
		}
		System.out.println("프로그램이 종료 됩니다");
		
	}
}
