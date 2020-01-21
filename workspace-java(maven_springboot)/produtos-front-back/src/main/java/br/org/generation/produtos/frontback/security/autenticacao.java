package br.org.generation.produtos.frontback.security;

import javax.xml.bind.DatatypeConverter;

import br.org.generation.produtos.frontback.model.usuario;

public class autenticacao {
	private static final String PREFIXO="*GeNeRaTiOn|";
	
	public static String generateToken(usuario usuario) {
		String token = PREFIXO+usuario.toString();
		token = DatatypeConverter.printHexBinary(token.getBytes());
		return token;
	}
	public static boolean isValid(String token) {
		byte[] vetor = DatatypeConverter.parseHexBinary(token);
		String credencial = new String(vetor);
		if(credencial.startsWith(PREFIXO)) {
			return true;
		}
		return false;
	}
}
