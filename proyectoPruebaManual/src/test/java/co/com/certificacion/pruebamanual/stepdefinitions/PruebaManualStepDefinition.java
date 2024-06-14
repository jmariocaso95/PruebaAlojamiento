package co.com.certificacion.pruebamanual.stepdefinitions;

import cucumber.api.Scenario;
import cucumber.api.java.Before;
import cucumber.api.java.gl.Dado;
import org.junit.Assert;

import javax.swing.*;

public class PruebaManualStepDefinition{
    private Scenario scenario;

    @Before
    public void getSvenario(Scenario scenario){this.scenario = scenario;}

    @Dado("^(.*)$")
    public void manualTestDefinitions(String step) { validate1(step, scenario.getName());}

    private void validate1(String step, String name) {
        int YES = 1;
        String reason = "";
        String[] options = new String[]{"No", "Yes"};
        int optionSelected = JOptionPane.showOptionDialog(new JFrame(),"The step \"" + step + "\" was executed correctly?",name,-1,1,(Icon)null, options, options[0] );
        if (optionSelected == 0) {
            reason = JOptionPane.showInputDialog("Enter the reason why the test did not run correctly");
        }

        Assert.assertEquals(reason, (long)YES, (long)optionSelected);
    }

}