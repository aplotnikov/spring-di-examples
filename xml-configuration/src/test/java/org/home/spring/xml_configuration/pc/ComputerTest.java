package org.home.spring.xml_configuration.pc;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static java.util.Arrays.asList;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.data.MapEntry.entry;
import static org.home.spring.xml_configuration.pc.Computer.NAME;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/beans.xml")
public class ComputerTest {
    @Autowired
    private Computer computer;

    @Test
    public void shouldValueBeInjectedFromXMLConfiguration() throws Exception {
        assertThat(computer.name).isEqualTo(NAME);
    }

    @Test
    public void shouldListBeInjectedFromXMLConfiguration() throws Exception {
        assertThat(computer.names).hasSameElementsAs(asList("Name1", "Name2", "Name3"))
                                  .hasSize(3);
    }

    @Test
    public void shouldMapBeInjectedFromXMLConfiguration() throws Exception {
        assertThat(computer.mappedNames).containsExactly(entry("Name", "Value1"));
    }

    @Test
    public void shouldSetBeInjectedFromXMLConfiguration() throws Exception {
        assertThat(computer.scopes).containsExactly("Singleton", "Prototype");
    }

}