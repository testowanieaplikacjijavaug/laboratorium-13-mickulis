package z1.testJBehave.steps;

import org.jbehave.core.annotations.*;
import org.jbehave.core.steps.Steps;
import z1.testJBehave.QuadraticFunction;

import static org.junit.jupiter.api.Assertions.*;

public class QuadraticFunctionStepsRunner extends Steps
{
	private QuadraticFunction function;

	@Given("Mam równanie kwadratowe")
	public void givenMamRównanie(){
		function = new QuadraticFunction();
	}
	@Then("otrzymam dwa miejsca zerowe: $x1 i $x2")
	@Aliases(values={
		"otrzymam dwa miejsca zerowe: $x1, $x2",
		"dostanę $x1 i $x2",
		"dostanę $x1, $x2"})
	public void thenOtrzymamDwaRozwiązania(@Named("x1") double x1, @Named("x2") double x2)
	{
		function.calculate();
		assertAll(
			() -> assertEquals(Math.min(x1, x2), Math.min(function.getX1(), function.getX2()), 0.01),
			() -> assertEquals(Math.max(x1, x2), Math.max(function.getX1(), function.getX2()), 0.01)
		);
	}

	@Then("otrzymam jedno miejsce zerowe: $x1")
	public void thenOtrzymamJednoRozwiązanie(@Named("x1") double x1)
	{
		function.calculate();
		assertAll(
			() -> assertEquals(x1, function.getX1(), 0.01),
			() -> assertEquals(x1, function.getX2(), 0.01)
			);
	}

	@Then("dostanę informację o błędzie")
	public void thenOtrzymamWyjątek()
	{
		assertThrows(Exception.class, () -> function.calculate());
	}

	@When("podam a = $a, b = $b, c = $c")
	public void whenPodamAbc(@Named("a") double a, @Named("b") double b, @Named("c") double c){
		function.setA(a);
		function.setB(b);
		function.setC(c);
	}
}
