package com.biz.mdthod;

public class ScoreEx_01 {

	public static void main(String[] args) {
		
		ScoreService sService = new ScoreService();
		int nTotal = sService.total();
		List<String> scList = sService.intput(3);
	}

}
