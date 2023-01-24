package main;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import exceptions.SemanticException;
import parser.IsiLangLexer;
import parser.IsiLangParser;

/* esta � a classe que � respons�vel por criar a intera��o com o usu�rio
 * instanciando nosso parser e apontando para o arquivo fonte
 * 
 * Arquivo fonte: extensao .isi
 * 
 */
public class MainClass {
	public static void main(String[] args) {
		try {
			IsiLangLexer lexer;
			IsiLangParser parser;
			
			// leio o arquivo "input.isi" e isso � entrada para o Analisador Lexico
			lexer = new IsiLangLexer(CharStreams.fromFileName("input.isi"));
			
			// crio um "fluxo de tokens" para passar para o PARSER
			CommonTokenStream tokenStream = new CommonTokenStream(lexer);
			
			// crio meu parser a partir desse tokenStream
			parser = new IsiLangParser(tokenStream);
			
			parser.prog();
			
			System.out.println("Compilation Successful");
			
			
		}
		
		catch(SemanticException ex){
			System.err.println("Semantic error - " + ex.getMessage());
		}
		
		catch(Exception ex) {
			System.err.println("ERROR "+ex.getMessage());
		}
		
	}
}
