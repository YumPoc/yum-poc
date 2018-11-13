package br.com.poc.yum.modelos;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonView;

import br.com.poc.yum.jsonview.Views;

public class AjaxResponseBody {

	@JsonView(Views.Public.class)
	private String msg;

	@JsonView(Views.Public.class)
	private String code;

	@JsonView(Views.Public.class)
	private List<Computador> result;

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public List<Computador> getResult() {
		return result;
	}

	public void setResult(List<Computador> result) {
		this.result = result;
	}
}
