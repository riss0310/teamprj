package co.lemon.one.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.lemon.one.common.Command;

public class MainCommand implements Command {

	public String exec(HttpServletRequest request, HttpServletResponse response) {
		
		return "main/main";
	}

}
