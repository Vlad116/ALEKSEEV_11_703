package ClassWork.Compiler;


import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;


public class CompilerTest {
    private Compiler compiler;

    @Before
    public void setUp() {
        compiler = new Compiler();
    }

    @Test
    public void testAnalyse() {
        String input = "X1:=11;X2:=8;X3:=X1+2;Y1:=X3;Z1:=Y1-X2";
        String input2 = "X7:=26;";
        compiler.analyse(input);
        compiler.analyse(input2);

    }

    @Test(expected = SyntaxException.class)
    public void testAnalyseOnBad() {
        String input = "X1=11;X2:=8;X3:=X1+X2;Y1:=X3;Z1:=Y1-X2";
        compiler.analyse(input);

    }

    @Test(expected = SyntaxException.class)
    public void secondTestAnalyseOnBad() {
        String input = "Y19:=19 ";
        compiler.analyse(input);
    }

    @Test
    public void testProcess() throws InitializeException {
        String input = "X1:=20;X2:=5;X3:=X1/X2;Y1:=X3*X1;Z1:=Y1-X2;Z2:=X2+Z1;";
        ArrayList<Variable> arrayList = (ArrayList<Variable>) compiler.process(input);
        String actual = " ";
        for (Variable v : arrayList) {
            actual = actual + v.toString();
        }
        String expected = " X1:=20 X2:=5 X3:=4 Y1:=80 Z1:=75 Z2:=80 ";
        assertEquals(expected, actual);

    }

    @Test
    public void testProcess2() throws InitializeException {
        String input = "X1:=20;X2:=5;X3:=X1/X2;Y1:=X3*X1;Z1:=Y1-X2;Z2:=X2+Z1;";
        List<Variable> expected = new ArrayList<>();
        expected.add(new Variable("X1", 20));
        expected.add(new Variable("X2", 5));
        expected.add(new Variable("X3", 4));
        expected.add(new Variable("Y1", 80));
        expected.add(new Variable("Z1", 75));
        expected.add(new Variable("Z2", 80));

        List<Variable> actual = compiler.process(input);
        assertEquals(expected, actual);
    }

    @Test(expected = InitializeException.class)
    public void testProcessOnBad() throws InitializeException {
        String input = "X1:=20;X2:=X3;";
        List<Variable> variableList = compiler.process(input);
    }

    @Test(expected = InitializeException.class)
    public void secondTestProcessOnBad() throws InitializeException {
        String input = "X1:=20;X2:=5;X3:=X1/X2;Y1:=X3*X1;Z1:=Y1-X2;Z2:=X4+Z1;";
        List<Variable> variableList = compiler.process(input);
    }
}

