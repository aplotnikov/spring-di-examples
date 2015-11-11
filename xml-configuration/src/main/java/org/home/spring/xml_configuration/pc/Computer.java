package org.home.spring.xml_configuration.pc;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Computer {
    public static final String NAME = "Name";

    public String              name;
    public List<String>        names;
    public Map<String, String> mappedNames;
    public Set<String>         scopes;

    public void setName(String name) {
        this.name = name;
    }

    public void setNames(List<String> names) {
        this.names = names;
    }

    public void setMappedNames(Map<String, String> mappedNames) {
        this.mappedNames = mappedNames;
    }

    public void setScopes(Set<String> scopes) {
        this.scopes = scopes;
    }
}
