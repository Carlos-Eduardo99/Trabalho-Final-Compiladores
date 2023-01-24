grammar IsiLang;

@header{
	import java.util.Scanner;
	import datastructures.Symbol;
	import datastructures.Variable;
	import datastructures.SymbolTable;
	import exceptions.SemanticException;
	import java.util.ArrayList;
}

@members{
 	String contaSt = "";
	String  l;
	int 	igual;
	int n;	
	private int _tipo;
	private String _varName;
	private String _varValue;
	private String chave;
	private String chaveR;
	private SymbolTable symbolTable = new SymbolTable();
	private Symbol symbol;
	private Variable variable;
	
	public void verificaID(String id){
		if(!symbolTable.exists(id)){
			throw new SemanticException("Symbol " +id+ " not declared!!!");
		}
	}
	
	public void atribuirValor (String id, Variable newVariable){
		symbolTable.mudarValor(id,newVariable);
	}
}

prog  		 : 'programa' decl bloco 'fimprog'
	 		 ;
	
decl  		 :	 (declaravar)+
	    	 ;
	  
declaravar   : tipo ID {
							_varName = _input.LT(-1).getText();
							_varValue = null;
							variable = new Variable(_varName, _tipo, _varValue);
					
							if (!symbolTable.exists(_varName)){
								symbolTable.add(variable);
								System.out.println("Variavel declarada: "+variable);
							}
							else{
								throw new SemanticException("Symbol " + _varName + " already declared" );
							}
					   }
			  (VIR ID 
			 		   {
							_varName = _input.LT(-1).getText();
							_varValue = null;
							variable = new Variable(_varName, _tipo, _varValue);
					
							if (!symbolTable.exists(_varName)){
								symbolTable.add(variable);
								System.out.println("Variavel declarada: "+variable);
							}
							else{
								throw new SemanticException("Symbol " + _varName + " already declared" );
							}
					   }
			   )* SC 
			 ;
	  
tipo 		: 'numero'	{ _tipo = Variable.NUMBER;}
			| 'texto'	{ _tipo = Variable.TEXT ;}
			;
	  
bloco		: (cmd)+
			;
	
cmd			: cmdleitura 
			| cmdescrita
			| cmdattrib
			| cmdsesenao
			;
		
cmdleitura  : 'leia' AP 
			ID { 
						chave = _input.LT(-1).getText();
						verificaID(chave);
						
						Scanner ler = new Scanner(System.in);
						
						_tipo =symbolTable.getTipo(chave);
						
							if(_tipo == 0){
									n = ler.nextInt();
									l = Integer.toString(n);								//converte para String o valor de n 
									variable = new Variable(chave, _tipo, l);
									atribuirValor (chave, variable);
							}else{
									l = ler.nextLine();
									variable = new Variable(chave, _tipo, l);
									atribuirValor (chave, variable);
							}	
			   }
			FP SC 
			;
	
cmdescrita : 'escreva' AP texto FP SC
		   ;
	
texto		: (PALAVRAS 
			{		
					_varValue = _input.LT(-1).getText();
					_varValue = _varValue.replaceAll( "~", "");             //Retira todos os caracters "~" da String
					System.out.print(_varValue);
			}
			| ID{ 
						chave = _input.LT(-1).getText();
						verificaID(chave); 
						
						_varValue = symbolTable.getValue(chave);
						System.out.println(_varValue);
			  } 
			)*
			;		
			 
cmdattrib	: ID { 
						chaveR = _input.LT(-1).getText();
						verificaID(chaveR);       {/*verifica se for declarado */}
				 } 
			ATTR (expr  
				{
						if(symbolTable.getTipo(chaveR) == 0){
								//atribuição de valor do tipo numeral				
								_tipo = symbolTable.getTipo(chaveR);
								variable = new Variable(chaveR, _tipo, _varValue);
								atribuirValor (chaveR, variable);
								System.out.println("Variavel possui novo valor: "+variable);
						}else{
								throw new SemanticException("A atribuição não é permitida, tipo de variavel incompativel!!" );
						}		
				}
			| PALAVRAS
				{		
						_tipo = symbolTable.getTipo(chaveR);
						
						if(_tipo == 1){
								//atribuição de valor do tipo texto
								_varValue = _input.LT(-1).getText();
								_varValue = _varValue.replaceAll( "~", "");             //Retira todos os caracters "~" da String
						
								variable = new Variable(chaveR, _tipo, _varValue);
								atribuirValor (chaveR, variable);
								System.out.println("Variavel possui novo valor: "+variable);
						}else{
								throw new SemanticException("A atribuição não é permitida, tipo de variavel incompativel!!" );
							}
						
				}
			) SC
			;

cmdsesenao	: 'se' AP ID OPREL (ID | NUMBER) FP ACH (cmd)+ FCH
				('senao' ACH (cmd+) FCH )?
			;

expr 		:	termo ( op termo )*
				{
							//operações aritmeticas
							
							
	  						contaSt = contaSt.concat(_varValue);	
	  						System.out.println(contaSt);
	  						
	  						int metade;
	  						int total;
	  						int aux1;
	  						int aux2;
	  						
	  						//soma
	  						if(contaSt.contains("+")){ 
	  							metade = contaSt.indexOf("+");
	  							total  = contaSt.length();
	  							
	  							aux1 = Integer.parseInt(contaSt.substring(0, metade));
	  							aux2 = Integer.parseInt(contaSt.substring(metade+1, total));
	  							igual = aux1 + aux2;
	  							_varValue = Integer.toString(igual);
	  								
	  						}
	  						//subtração
	  						if(contaSt.contains("-")){ 
	  							metade = contaSt.indexOf("-");
	  							total  = contaSt.length();
	  							
	  							aux1 = Integer.parseInt(contaSt.substring(0, metade));
	  							aux2 = Integer.parseInt(contaSt.substring(metade+1, total));
	  							igual = aux1 - aux2;
	  							_varValue = Integer.toString(igual);
	  								
	  						}
	  						//multiplicação
	  						if(contaSt.contains("*")){ 
	  							metade = contaSt.indexOf("*");
	  							total  = contaSt.length();
	  							
	  							aux1 = Integer.parseInt(contaSt.substring(0, metade));
	  							aux2 = Integer.parseInt(contaSt.substring(metade+1, total));
	  							igual = aux1 * aux2;
	  							_varValue = Integer.toString(igual);
	  								
	  						}
	  						//divisão
	  						if(contaSt.contains("/")){ 
	  							metade = contaSt.indexOf("/");
	  							total  = contaSt.length();
	  							
	  							aux1 = Integer.parseInt(contaSt.substring(0, metade));
	  							aux2 = Integer.parseInt(contaSt.substring(metade+1, total));
	  							igual = aux1 / aux2;
	  							_varValue = Integer.toString(igual);
	  								
	  						}
	  						contaSt = "";	
	  						
				}
			;
	
termo		 :	ID { 
	  						chave = _input.LT(-1).getText();
	  						verificaID(chave);
							_varValue = symbolTable.getValue(chave);
	 			   }
			 | NUMBER
	 			   {
	  						_varValue = _input.LT(-1).getText();
	   			   }
			 ;
			 
 op : SOM
 				   {
 							contaSt = contaSt.concat(_varValue);
 							contaSt = contaSt.concat("+");
				   }
 	| SUB
 				   {
 				   			contaSt = contaSt.concat(_varValue);
 				   			contaSt = contaSt.concat("-");
 				   } 
 	| MUL 
 				   {
 				   			contaSt = contaSt.concat(_varValue);
 				   			contaSt = contaSt.concat("*");
 				   }
 	| DIV
 				   {
 				   			contaSt = contaSt.concat(_varValue);
 				   			contaSt = contaSt.concat("/");
 				   }
 	;

 SOM: '+'
 	;
 	
 SUB: '-'
 	;	
 	
 MUL: '*'
 	;
 
 DIV: '/'
 	;
	
 AP : '('
 	;
 	
 FP	: ')'
 	;
 	
 SC : ';'
 	;
 	
 OPREL	: '>' | '<' | '>=' | '<=' | '==' | '!='
		;
		 	
 ATTR : '='
 	;
 	
 VIR	: ','
	 	;
 	
 ACH	: '{'
 		;
 		
 FCH	: '}'
 		;

 ID : [a-z] ([a-z] | [A-Z] | [0-9])*
 	;
 	
PALAVRAS : '~' ([a-z] | [A-Z] | [0-9] | ' ' | ',' | ':' | '!' |'?')* '~'
 	  ;
 
 NUMBER : [0-9]+ ('.' [0-9]+)?
 	;
 
 WS	: (' '| '\t' | '\n' | '\r' | '$'([a-z] | [A-Z] | [0-9] | ';' | ' ' | '\t' | '\n' | '=' | '/' | '*' | '-'| '+' | '(' | ')' | '{' | '}' | '>' | '<' | ',')*'$' | '$$'([a-z] | [A-Z] | [0-9] | ';' | ' ' | '=' | '/'| '*' | '-'| '+' | '(' | ')' | '{' | '}' | '>' | '<' | '\t' | '\n' | ',')*'\r') -> skip;
 