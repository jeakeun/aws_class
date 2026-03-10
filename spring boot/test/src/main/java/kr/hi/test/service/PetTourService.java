package kr.hi.test.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import kr.hi.test.entity.PetTourEntity;
import kr.hi.test.repository.PetTourRepository;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;


@Service
public class PetTourService {

    private final PetTourRepository repository;
    private final RestTemplate restTemplate;

    @Value("${openapi.service-key}")
    private String serviceKey;

    public PetTourService(PetTourRepository repository,
                          RestTemplate restTemplate) {
        this.repository = repository;
        this.restTemplate = restTemplate;
    }

    public void savePetTourData() {

        String url =
        		 "http://apis.data.go.kr/B551011/KorPetTourService2//detailPetTour2"
        				  + "?serviceKey=" + serviceKey
        				  + "&MobileOS=ETC"
        				  + "&MobileApp=PetApp"
        				  + "&_type=json"
        				  + "&pageNo=3"
        				  + "&numOfRows=50";

        String json = restTemplate.getForObject(url, String.class);
        
        

        try {
            ObjectMapper mapper = new ObjectMapper();
            JsonNode items = mapper.readTree(json)
                    .path("response")
                    .path("body")
                    .path("items")
                    .path("item");

            for (JsonNode item : items) {
                PetTourEntity entity = new PetTourEntity();
                entity.setTitle(item.path("title").asText());
                entity.setAddr1(item.path("addr1").asText());
                entity.setTel(item.path("tel").asText());
                entity.setAreaCode(item.path("areacode").asText());
                entity.setContentType(item.path("contenttypeid").asText());

                repository.save(entity);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}

