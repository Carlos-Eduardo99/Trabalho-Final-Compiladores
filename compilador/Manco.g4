grammar Manco;

@header{
	import java.util.Scanner;
	import datastructures.Symbol;
	import datastructures.Variable;
	import datastructures.SymbolTable;
	import exceptions.SemanticException;
	import java.util.ArrayList;
}

@members{
	Boolean sin;
	Boolean resp = true;
	String teste;
 	String contaSt = "";
 	String logicSt = "";
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

prog  		 : 'programa' bloco 'fimprog'
	 		 ;  
	  
bloco		: (cmd)+
			;
	
cmd			: cmddecl
			| cmdleitura 
			| cmdescrita
			| cmdattrib
			| cmdsesenao
			| cmdpara
			| cmdenquanto
			| cmdfacaenquanto
			;
			
cmddecl  	 :	 (declaravar)+
	    	 ;
	  
declaravar   : tipo ID {

if(resp){
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
					   }
			  (VIR ID 
			 		   {
if(resp){
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
					   }
			   )* SC 
			 ;
	  
tipo 		: 'numero'	{ 
if(resp){
						_tipo = Variable.NUMBER;
}
						}
			| 'texto'	{ 
if(resp){
						_tipo = Variable.TEXT ;
}
							}
			;	
				
cmdleitura  : 'leia' AP 
			ID { 
if(resp){
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
			   }
			FP SC 
			;
	
cmdescrita : 'escreva' AP texto FP SC
		   ;
	
texto		: (PALAVRAS 
			{		
if(resp){
					_varValue = _input.LT(-1).getText();
					_varValue = _varValue.replaceAll( "~", "");             //Retira todos os caracters "~" da String
					System.out.print(_varValue);							//printa o valor escrito no comando escreva() do meu compilador
}
			}
			| ID{ 
if(resp){
						chave = _input.LT(-1).getText();
						verificaID(chave); 
						
						_varValue = symbolTable.getValue(chave);
						System.out.println(_varValue);						//printa o valor escrito no comando escreva() do meu compilador
}
			  } 
			)*
			;		
			 
cmdattrib	: ID { 
if(resp){
						chaveR = _input.LT(-1).getText();
						verificaID(chaveR);       {/*verifica se for declarado */}
}
				 } 
			ATTR (expr  
				{
if(resp){
						if(symbolTable.getTipo(chaveR) == 0 && !_varValue.contains(".") && !_varValue.contains(",")){
								//atribuição de valor do tipo numeral				
								_tipo = symbolTable.getTipo(chaveR);
								variable = new Variable(chaveR, _tipo, _varValue);
								atribuirValor (chaveR, variable);
								System.out.println("Variavel possui novo valor: "+variable);
						}
						else if (symbolTable.getTipo(chaveR) == 0 && (_varValue.contains(".") ||_varValue.contains(","))){
								throw new SemanticException("A atribuição não é permitida, insira apenas números inteiros!!" );
						}
						else{
								throw new SemanticException("A atribuição não é permitida, tipo de variavel incompativel!!" );
						}
}		
				}
			| PALAVRAS
				{	
if(resp){	
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
				}
			) SC
			;

cmdpara	:	'para' AP (cmdattrib)? termo oprel termo (SC termo '++')? FP ACH (cmd+)? FCH
		;

cmdenquanto : 'enquanto' AP termo oprel termo FP ACH (cmd+)? FCH
			; 

cmdfacaenquanto	: 'faca' ACH (cmd+)? FCH 'enquanto' AP termo oprel termo FP SC
				;

cmdsesenao	: 'se' AP termo oprel termo FP 
				{
if(resp){
							//operações relacionais
				
							logicSt = logicSt.concat(_varValue);	 //concatena o ultimo termo da 'cmdsesenao'
	  						System.out.println(logicSt);			 //printa a expressão relacional
				
							int metad;
	  						int tot;
	  						int aux3;
	  						int aux4;
			
							//MAIOR
	  						if(logicSt.contains(">")){ 
	  							metad = logicSt.indexOf(">");
	  							tot  = logicSt.length();
	  							
	  							aux3 = Integer.parseInt(logicSt.substring(0, metad));
	  							aux4 = Integer.parseInt(logicSt.substring(metad+1, tot));
	  							
	  							if(aux3 > aux4){
	  								resp = true;
	  								sin = false;
	  							}
	  							else{
	  								resp = false;
	  								sin = true;
	  							}
	  						}
	  						//MENOR
	  						if(logicSt.contains("<")){ 
	  							metad = logicSt.indexOf("<");
	  							tot  = logicSt.length();
	  							
	  							aux3 = Integer.parseInt(logicSt.substring(0, metad));
	  							aux4 = Integer.parseInt(logicSt.substring(metad+1, tot));
	  							
	  							if(aux3 < aux4){
	  								resp = true;
	  								sin = false;
	  							}
	  							else{
	  								resp = false;
	  								sin = true;
	  							}
	  						}
	  						//MAIOR IGUAL
	  						if(logicSt.contains(">=")){ 
	  							metad = logicSt.indexOf(">=");
	  							tot  = logicSt.length();
	  							
	  							aux3 = Integer.parseInt(logicSt.substring(0, metad));
	  							aux4 = Integer.parseInt(logicSt.substring(metad+2, tot));
	  							
	  							if(aux3 >= aux4){
	  								resp = true;
	  								sin = false;
	  							}
	  							else{
	  								resp = false;
	  								sin = true;
	  							}
	  						}
	  						//MENOR IGUAL
	  						if(logicSt.contains("<=")){ 
	  							metad = logicSt.indexOf("<=");
	  							tot  = logicSt.length();
	  							
	  							aux3 = Integer.parseInt(logicSt.substring(0, metad));
	  							aux4 = Integer.parseInt(logicSt.substring(metad+2, tot));
	  							
	  							if(aux3 <= aux4){
	  								resp = true;
	  								sin = false;
	  							}
	  							else{
	  								resp = false;
	  								sin = true;
	  							}
	  						}
	  						//DIFERENTE
	  						if(logicSt.contains("!=")){ 
	  							metad = logicSt.indexOf("!=");
	  							tot  = logicSt.length();
	  							
	  							aux3 = Integer.parseInt(logicSt.substring(0, metad));
	  							aux4 = Integer.parseInt(logicSt.substring(metad+2, tot));
	  							
	  							if(aux3 != aux4){
	  								resp = true;
	  								sin = false;
	  								
	  							}
	  							else{
	  								resp = false;
	  								sin = true;
	  							}
	  						}
	  						//IGUAL
	  						if(logicSt.contains("==")){ 
	  							metad = logicSt.indexOf("==");
	  							tot  = logicSt.length();
	  							
	  							aux3 = Integer.parseInt(logicSt.substring(0, metad));
	  							aux4 = Integer.parseInt(logicSt.substring(metad+2, tot));
	  							
	  							if(aux3 == aux4){
	  								resp = true;
	  								sin = false;
	  							}
	  							else{
	  								resp = false;
	  								sin = true;

	  							}
	  						}
	  						
	  						
							logicSt = "";
}
				} 
				ACH (cmd+)? FCH
				('senao'
				{
					if(resp == true && sin == false){
						resp = false;
					}
					if(resp == false && sin == true){
						resp = true;
					}
				} 
				ACH (cmd+)? FCH )?
				{resp = true;}
				
			;

expr 		:	termo ( op termo )*
				{
if(resp){
							//operações aritmeticas
							
	  						contaSt = contaSt.concat(_varValue);	 //concatena o ultimo termo da 'expr'
	  						System.out.println(contaSt);			 //printa a expressão aritmetica e os valores atribuidos as variaveis 
	  						
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
				}
			;
	
termo		 :	ID { 

if(resp){
	  						chave = _input.LT(-1).getText();
	  						verificaID(chave);
							_varValue = symbolTable.getValue(chave);
}
	 			   }
			 | NUMBER
	 			   {
if(resp){
	  						_varValue = _input.LT(-1).getText();
}
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
 	
 oprel	: MAIOR 
 				   {
 							logicSt = logicSt.concat(_varValue);
 							logicSt = logicSt.concat(">");
				   }
 		| MENOR 
 				   {
 							logicSt = logicSt.concat(_varValue);
 							logicSt = logicSt.concat("<");
				   }
 		| IGUAL 
 				   {
 							logicSt = logicSt.concat(_varValue);
 							logicSt = logicSt.concat("==");
				   }
 		| DIF 
 				   {
 							logicSt = logicSt.concat(_varValue);
 							logicSt = logicSt.concat("!=");
				   }
 		| MAIORIGUAL 
 				   {
 							logicSt = logicSt.concat(_varValue);
 							logicSt = logicSt.concat(">=");
				   }
 		| MENORIGUAL
 				   {
 							logicSt = logicSt.concat(_varValue);
 							logicSt = logicSt.concat("<=");
				   }
		;

 MAIOR: '>'
 	  ;
 
 MENOR: '<'
 	  ;
 	  
 IGUAL: '=='
 	  ;
 
 DIF: '!='
 	;
 
 MAIORIGUAL: '>='
 		   ;	  

 MENORIGUAL: '<='
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

		 	
 ATTR : '='
 	;
 	
 VIR	: ','
	 	;
 	
 ACH	: '{'
 		;
 		
 FCH	: '}'
 		;

 ID : ([a-z]|[A-Z])+ ([a-z] | [A-Z] | [0-9])*
 	;
 	
PALAVRAS : '~' ([a-z] | [A-Z] | [0-9] | ' ' | ',' | ':' | '!' |'?'| 'é')* '~'
 	  ;
 
 NUMBER : [0-9]+ (('.'|',') [0-9]+)?
 	;
 
 WS	: (' '| '\t' | '\n' | '\r' | '$'([a-z] | [A-Z] | [0-9] | ';' | ' ' | '\t' | '\n' | '=' | '/' | '*' | '-'| '+' | '(' | ')' | '{' | '}' | '>' | '<' | ',' | '~' | '!' | ':' | '\r'| '.' )*'$' | '$$'([a-z] | [A-Z] | [0-9] | ';' | ' ' | '=' | '/'| '*' | '-'| '+' | '(' | ')' | '{' | '}' | '>' | '<' | '\t' | '\n' | ',' | '~' | '!' | ':'| '.')*'\r') -> skip;
 