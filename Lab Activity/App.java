package com.onetomanymumbaiuniver;

import com.onetomanymumbaiuniver.daoimpl.UniversityDaoimpl;

public class App {

	public static void main(String[] args) {
		UniversityDaoimpl dao = new UniversityDaoimpl();
		dao.adduniversity();
		dao.fetchuniversity();

	}

}
