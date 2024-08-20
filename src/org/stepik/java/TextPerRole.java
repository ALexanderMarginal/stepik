package org.stepik.java;

import java.util.*;

public class TextPerRole {
	public TextPerRole() {
		String [] roles= {
				"Городничий",
				"Аммос Федорович",
				"Артемий Филиппович",
				"Лука Лукич"
		};
		String [] textLines={
				"Городничий: Я пригласил вас, господа, с тем, чтобы сообщить вам пренеприятное известие: к нам едет ревизор.",
				"Аммос Федорович: Как ревизор?",
				"Артемий Филиппович: Как ревизор?",
				"Городничий: Ревизор из Петербурга, инкогнито. И еще с секретным предписаньем.",
				"Аммос Федорович: Вот те на!",
				"Артемий Филиппович: Вот не было заботы, так подай!",
				"Лука Лукич: Господи боже! еще и с секретным предписаньем!"
		};

		System.out.println(printTextPerRole(roles, textLines));
	}

	private String printTextPerRole(String[] roles, String[] textLines) {
		Map<String, List<String>> rolesMap = new HashMap<>();

		for (String role : roles) {
			rolesMap.put(role, new ArrayList<>());
		}

		for (int i = 0; i < textLines.length; i++) {
			String[] textPair = textLines[i].split(": ", 2);
			rolesMap.get(textPair[0]).add((i + 1) + ") " + textPair[1]);
		}

		StringBuilder result = new StringBuilder();

		for (String role : roles) {
			result.append(role + ":\n");
			List<String> textList = rolesMap.get(role);
			textList.forEach(text -> result.append(text + '\n'));
			result.append("\n");
		}

		System.out.println(result.toString());

		return result.toString();
	}
}
