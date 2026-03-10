package kr.hi.test.service;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import kr.hi.test.TourItemDto;

@Service
public class TourService {
    
    private final String API_KEY = "f3d5eb56d8fe039136c7caa310e84ffaf020daad11c832dc063b8f0956078494"; 

    public List<TourItemDto> getBigDataStats(String areaCode, String startYmd, String endYmd) {
        List<TourItemDto> resultList = new ArrayList<>();
        RestTemplate restTemplate = new RestTemplate();
        
        try {
            // ✅ 더 안정적인 '지역별 방문자 수' API 주소로 변경
            URI uri = UriComponentsBuilder
                    .fromUriString("http://apis.data.go.kr/B551011/DataLabService/getVisitAreaList")
                    .queryParam("serviceKey", API_KEY)
                    .queryParam("numOfRows", "10")
                    .queryParam("pageNo", "1")
                    .queryParam("MobileOS", "ETC")
                    .queryParam("MobileApp", "AppTest")
                    .queryParam("_type", "json")
                    .queryParam("startYmd", startYmd)
                    .queryParam("endYmd", endYmd)
                    .queryParam("areaCode", areaCode) // 지역 코드 추가
                    .build(true)
                    .toUri();

            System.out.println("🔗 호출 API: " + uri);

            String response = restTemplate.getForObject(uri, String.class);
            ObjectMapper mapper = new ObjectMapper();
            JsonNode root = mapper.readTree(response);
            JsonNode items = root.at("/response/body/items/item");

            if (items.isArray()) {
                for (JsonNode n : items) {
                    TourItemDto dto = new TourItemDto();
                    // ✅ API마다 필드명이 다를 수 있어 수동 매핑 (가장 안전)
                    dto.setAreaCode(n.path("areaCode").asText());
                    dto.setAreaNm(n.path("areaNm").asText());
                    // 이 API는 touDivNm 대신 '구군명' 등을 줄 수 있으므로 확인 필요
                    dto.setTouDivNm(n.path("signguNm").asText("전체")); 
                    dto.setTouNum(n.path("touNum").asText("0"));
                    dto.setBaseYmd(n.path("baseYmd").asText(startYmd));
                    resultList.add(dto);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return resultList;
    }
}