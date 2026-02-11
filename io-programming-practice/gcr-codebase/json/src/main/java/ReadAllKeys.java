
import java.io.File;
import java.util.*;
import com.fasterxml.jackson.databind.*;

public class ReadAllKeys {

    public static void main(String[] args) throws Exception {

        ObjectMapper mapper = new ObjectMapper();

        JsonNode rootNode = mapper.readTree(new File("D:\\BridgeLabz-Training\\io-programming-practice\\gcr-codebase\\json\\src\\main\\java\\data.json"));

        Iterator<Map.Entry<String, JsonNode>> fields = rootNode.fields();

        while (fields.hasNext()) {
            Map.Entry<String, JsonNode> entry = fields.next();
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
