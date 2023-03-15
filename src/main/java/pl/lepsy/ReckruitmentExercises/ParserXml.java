package pl.lepsy.ReckruitmentExercises;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import lombok.extern.slf4j.Slf4j;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

@Slf4j
public class ParserXml {
    public static void main(String[] args) throws IOException {

        XmlMapper xmlMapper = new XmlMapper();

//        Artist[] artists = xmlMapper.readValue(new File("src/main/resources/artists.xml"), Artist[].class);
//        Arrays.stream(artists).forEach(a -> log.info("artist {}", a));

        List<Artist> artistList = xmlMapper.readValue(new File("src/main/resources/artists.xml"),
                new TypeReference<List<Artist>>() {});


        ObjectMapper jsonMapper = new ObjectMapper();
//        String json = jsonMapper.writeValueAsString(artists);
//        System.out.println(json);

        artistList.stream().forEach(a -> log.info("artist {}", a)); 

        File file = new File("src/main/resources/artists.json");
        jsonMapper.writeValue(file, artistList);


    }
}
