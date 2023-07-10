package com.iu.main;

import com.iu.main.bankBook.BankBookDAO;
import com.iu.main.bankBook.BankBookDTO;
import com.iu.main.bankBook.BankBookInput;
import com.iu.main.util.DBConnector;

public class StartMain {

	public static void main(String[] args) {
		try {
			BankBookDAO bankBookDAO = new BankBookDAO();
			BankBookInput bankBookInput = new BankBookInput();
			
			BankBookDTO bankBookDTO= bankBookInput.bankBookAdd();
			
			
			int result = bankBookDAO.bankBookAdd(bankBookDTO);
			
			
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}

}
