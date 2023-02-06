package main;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import exceptions.SemanticException;
import parser.MancoLexer;
import parser.MancoParser;

/* esta é a classe que é responsável por criar a interação com o usuário
 * instanciando nosso parser e apontando para o arquivo fonte
 * 
 * Arquivo fonte: extensao .isi
 * 
 */
public class MainClass {
	public static void main(String[] args) {
		try {
			MancoLexer lexer;
			MancoParser parser;
			
			// leio o arquivo "input.isi" e isso é entrada para o Analisador Lexico
			lexer = new MancoLexer(CharStreams.fromFileName("input.mnc"));
			
			// crio um "fluxo de tokens" para passar para o PARSER
			CommonTokenStream tokenStream = new CommonTokenStream(lexer);
			
			// crio meu parser a partir desse tokenStream
			parser = new MancoParser(tokenStream);
			
			parser.prog();
			
			System.out.println("Compilation Successful");
			
			
		}
		
		catch(SemanticException ex){
			System.err.println("Semantic error - " + ex.getMessage());
		}
		
		catch(Exception ex) {
			System.err.println("ERROR SEMANTICO."+ex.getMessage());
		}
		
	}
}
