package com.iu.main;

import com.iu.main.bankBook.BankBookDAO;
import com.iu.main.util.DBConnector;

public class StartMain {

	public static void main(String[] args) {
		try {
			BankBookDAO bankBookDAO = new BankBookDAO();
			bankBookDAO.bankBookAdd();
			DBConnector db = new DBConnector();
			db.getConnection();
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}

}
