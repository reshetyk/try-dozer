import org.dozer.DozerBeanMapper;
import org.dozer.loader.api.BeanMappingBuilder;
import org.dozer.loader.api.FieldDefinition;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Reshetuyk on 04.02.2016.
 */
public class DozerMapper {
    public static void main(String[] args) {
        Model model = new Model(1, "field1");
        Map<String,String> map= new HashMap<String, String>();
        map.put("assetClass", "v1");
        map.put("normalizedProductName", "v222");
        map.put("status", "v333");



        BeanMappingBuilder builder = new BeanMappingBuilder() {
            protected void configure() {
                mapping(Map.class, MyProperties.class)
                        .fields(new FieldDefinition("this").mapKey("this"), "this");

                mapping(Model.class, MyProperties.class);

            }
        };

        DozerBeanMapper dozerBeanMapper = new DozerBeanMapper();
        dozerBeanMapper.addMapping(builder);
        MyProperties myProperties = dozerBeanMapper.map(map, MyProperties.class);
        dozerBeanMapper.map(model, myProperties);

        System.out.println(myProperties);
    }

    public static String toCamelCase(final String init) {
        if (init==null)
            return null;

        final StringBuilder ret = new StringBuilder(init.length());

        for (final String word : init.split(" ")) {
            if (!word.isEmpty()) {
                ret.append(word.substring(0, 1).toUpperCase());
                ret.append(word.substring(1).toLowerCase());
            }
            if (!(ret.length()==init.length()))
                ret.append(" ");
        }

        return ret.toString();
    }
}


