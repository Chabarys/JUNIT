import org.junit.Test;

import junit.framework.Assert;

public class OperacoesTest {
	@Test
	public void testSoma() {
		// Instancia da classe que será testada
		Operacoes operacao = new Operacoes();
		double result = operacao.soma(5, 10);
		Assert.assertEquals(15, result, 0.0);
	}
	
	@Test
	public void testSubtracao() {
		Operacoes operacao = new Operacoes();
		Assert.assertEquals(15, operacao.subtracao(20, 5), 0.0);
	}
	
	@Test
	public void testDivisao() {
		Operacoes operacao = new Operacoes();
		Assert.assertEquals(10, operacao.divisao(50, 5), 0.0);
	}
	
	@Test
	public void testMultiplicacao() {
		Operacoes operacao = new Operacoes();
		Assert.assertEquals(50, operacao.multiplicacao(5, 10), 0.0);
	}
}
