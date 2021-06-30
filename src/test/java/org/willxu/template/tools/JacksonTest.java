package org.willxu.template.tools;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class JacksonTest {
    @Test
    public void testJackson() throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        String originJson = "{\"name\":\"value\"}";
        // JsonNode can only get the field
        JsonNode jsonNode = objectMapper.readTree(originJson);
        assertEquals("value", jsonNode.get("name").textValue());
        // ObjectNode can put new field
        ObjectNode objectNode = objectMapper.createObjectNode();
        String fieldName = "fieldName";
        String fieldValue = "fieldValue";
        objectNode.put(fieldName, fieldValue);
        assertEquals(fieldValue, objectNode.get(fieldName).textValue());
    }
}
