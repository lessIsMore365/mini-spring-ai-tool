package org.example.minispringaitool.definition;

public class MyToolDefinition {


    private final String name;


    private final String description;


    private final String inputSchema;



    public MyToolDefinition(
            String name,
            String description,
            String inputSchema) {

        this.name = name;
        this.description = description;
        this.inputSchema = inputSchema;
    }



    public String getName() {
        return name;
    }


    public String getDescription() {
        return description;
    }


    public String getInputSchema() {
        return inputSchema;
    }


    @Override
    public String toString() {

        return """
                {
                  "name":"%s",
                  "description":"%s",
                  "parameters":%s
                }
                """.formatted(
                name,
                description,
                inputSchema
        );
    }
}
