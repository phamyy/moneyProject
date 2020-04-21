package moneyMaster;

import java.util.ArrayList;
import java.util.HashMap;

public class profiles extends Object {

	public profiles() {
		// TODO Auto-generated constructor stub'
		super();
	}

	public void canSpend(String name, Double income) {

		HashMap<String, Double> expense = new HashMap<String, Double>();

		if (name.equals("Saver")) {
			expense.put("mortage/rent", (income * .28));
			expense.put("phone", (income * .02));
			expense.put("gas", (income * .01));
			expense.put("credit card payment", (income * .02));
			expense.put("vacation", (income * .01));
			expense.put("food", (income * .04));
			expense.put("clothes", (income * .03));
			expense.put("car payment", (income * .05));
			expense.put("car insurance", (income * .02));
			expense.put("life insurance", (income * .02));
			expense.put("personal savings", (income * .25));
			expense.put("retirement", (income * .25));
		} else if (name.equals("Spender")) {
			expense.put("mortage/rent", (income * .28));
			expense.put("phone", (income * .02));
			expense.put("gas", (income * .01));
			expense.put("credit card payment", (income * .02));
			expense.put("vacation", (income * .01));
			expense.put("food", (income * .04));
			expense.put("clothes", (income * .03));
			expense.put("car payment", (income * .05));
			expense.put("car insurance", (income * .02));
			expense.put("life insurance", (income * .02));
			expense.put("personal savings", (income * .25));
			expense.put("retirement", (income * .25));
		} else {
			expense.put("mortage/rent", (income * .28));
			expense.put("phone", (income * .02));
			expense.put("gas", (income * .01));
			expense.put("credit card payment", (income * .02));
			expense.put("vacation", (income * .4));
			expense.put("food", (income * .03));
			expense.put("clothes", (income * .03));
			expense.put("car payment", (income * .05));
			expense.put("car insurance", (income * .02));
			expense.put("life insurance", (income * .02));
			expense.put("personal savings", (income * .15));
			expense.put("retirement", (income * .15));
		}

//		mortage/rent - 28 percent monthly income
//		phone - 2 percent monthly income
//		gas - 2.5 percent monthly income
//		credit cards - 1 percent monthly income
//		vacation - 5 percent monthly income
//		food - 7.5 percent monthly income
//		clothes - 7.5 percent monthly income 
//		car payment - 5 percent monthly income
//		car insurance - 2 percent monthly income
//		life insurance - .01 percent monthly income
//		personal savings - 20 percent monthly income
//		retirement - 20 percent monthly income

		for (String i : expense.keySet()) {
			System.out.println(i + ":" + expense.get(i));
		}

	}

}
