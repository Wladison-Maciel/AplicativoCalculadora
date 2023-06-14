package br.edu.utilidades;


import javax.print.attribute.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

public class Validador extends PlainDocument{
	public enum TipoEntrada {
		NUMEROINTEIRO,SENHA,USUARIO,EMAIL,DATA,NUMERODOUBLE;
	}
	private int qtdCaracteres;
	private TipoEntrada tpEntrada;
	
	public Validador(int qtdCaracteres, TipoEntrada tpEntrada ) {
		this.qtdCaracteres = qtdCaracteres;
		this.tpEntrada = tpEntrada;
	}
	public void insertString(int i, String string, AttributeSet as) throws BadLocationException{
		if(string == null || getLength() == qtdCaracteres) {
			return;
		}
		int totalCarac = getLength() + string.length();
		
		String regex = "";
		switch(tpEntrada) {
		    case NUMERODOUBLE:  regex = "[^0-9][.]"; break;
		    case NUMEROINTEIRO: regex = "[^0-9]"; break;
		    case SENHA:         regex = "[^\\p{IsLatin}@.\\-_][^0-9]"; break;
		    case USUARIO:       regex = "[^\\p{IsLatin}@.\\-_][^0-9]"; break;
		    case EMAIL:         regex = "[^\\p{IsLatin}@.\\-_][^0-9]"; break;
		    case DATA:          regex = "[^0-9]"; break;
		}
		string = string.replaceAll(regex, "");
		
		if(totalCarac <= qtdCaracteres) {
			super.insertString(i, string, (javax.swing.text.AttributeSet) as);
		}
		else {
			String nova = string.substring(0, qtdCaracteres);
			super.insertString(i, nova, (javax.swing.text.AttributeSet) as);
		}
	}
}
