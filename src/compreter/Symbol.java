package compreter;

public class Symbol {
	String clas;
	String value;
	public static enum Id {COMMENT, FLOATINGPOINT_LITERAL, IDENTIFIER_NAME, NUMERIC_LITERAL, STRING_LITERAL, KEYWORD, PUNCTUATORS, BOOLEAN_LITERAL};
	Id code;
	public Symbol(Id code){
		this.code = code;	
		this.clas = code.name();
		this.value = "";
	}
	public Symbol(Id code, String value){
		this.code = code;
		this.clas = code.name();
		this.value = value;
	}
	
	public Symbol setValue(String value){
		this.value = value;
		return this;
	}
	public String getValue(){
		return this.value;
	}
	
	public String getClas(){
		return this.clas;
	}
	
	public Symbol.Id getCode(){
		return this.code;
	}
}
